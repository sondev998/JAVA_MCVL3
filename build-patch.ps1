param(
    [Parameter(Mandatory = $true, Position = 0)]
    [ValidateSet('ghlb', 'tele_leader')]
    [string]$Project,

    [Parameter(Mandatory = $true, Position = 1, ValueFromRemainingArguments = $true)]
    [string[]]$SourceFiles,

    [Parameter(Mandatory = $false)]
    [string]$OutputName
)

$ErrorActionPreference = 'Stop'
if ([string]::IsNullOrWhiteSpace($OutputName)) {
    $OutputName = $Project
}
$root = $PSScriptRoot
$sourceRoot = Join-Path $root "decomplete\\$Project\\src"
$resourcesRoot = Join-Path $root "decomplete\\$Project\\resources"
$originalJar = Join-Path $root "jar_file\\$Project.jar"
$outputRoot = Join-Path $root "build_export\\$OutputName"
$classesRoot = Join-Path $outputRoot 'classes'
$stagingRoot = Join-Path $outputRoot 'staging'
$jarsOutputDir = Join-Path $root 'jars_output'
if (!(Test-Path -LiteralPath $jarsOutputDir)) { New-Item -ItemType Directory -Force -Path $jarsOutputDir | Out-Null }
$timestamp = Get-Date -Format 'yyyyMMdd_HHmmss'
$outputJar = Join-Path $jarsOutputDir "$OutputName-patched-$timestamp.jar"
$supportRoot = Join-Path $root 'build_support'

if (!(Test-Path -LiteralPath $originalJar)) { throw "Missing original JAR: $originalJar" }

$javac = Get-Command javac.exe -ErrorAction SilentlyContinue | Select-Object -ExpandProperty Source -First 1
$jar = Get-Command jar.exe -ErrorAction SilentlyContinue | Select-Object -ExpandProperty Source -First 1
if (!$javac -or !$jar) {
    $jdk = Get-ChildItem 'C:\Program Files\Eclipse Adoptium' -Recurse -Filter javac.exe -ErrorAction SilentlyContinue | Select-Object -First 1
    if (!$jdk) { throw 'JDK 8 was not found. Install Eclipse Temurin JDK 8 first.' }
    $javac = $jdk.FullName
    $jar = Join-Path $jdk.Directory.FullName 'jar.exe'
}

$resolvedSources = foreach ($file in $SourceFiles) {
    $resolved = (Resolve-Path -LiteralPath $file).Path
    if (!$resolved.StartsWith((Resolve-Path -LiteralPath $sourceRoot).Path, [StringComparison]::OrdinalIgnoreCase)) {
        throw "Source must be inside $sourceRoot : $file"
    }
    $resolved
}

$autoMenuSource = Join-Path $sourceRoot 'a\AutoMenu.java'
if ((Test-Path -LiteralPath $autoMenuSource) -and ($resolvedSources -notcontains (Resolve-Path -LiteralPath $autoMenuSource).Path)) {
    $resolvedSources = @($resolvedSources) + (Resolve-Path -LiteralPath $autoMenuSource).Path
}

$mctSource = Join-Path $sourceRoot 'a\MCT.java'
if ((Test-Path -LiteralPath $mctSource) -and ($resolvedSources -notcontains (Resolve-Path -LiteralPath $mctSource).Path)) {
    $resolvedSources = @($resolvedSources) + (Resolve-Path -LiteralPath $mctSource).Path
}

if (Test-Path -LiteralPath $classesRoot) { Remove-Item -LiteralPath $classesRoot -Recurse -Force }
if (Test-Path -LiteralPath $stagingRoot) { Remove-Item -LiteralPath $stagingRoot -Recurse -Force }
New-Item -ItemType Directory -Force -Path $classesRoot, $stagingRoot | Out-Null

$apiJars = Get-ChildItem (Join-Path $root '.tools\j2me') -Filter '*.jar' | ForEach-Object { $_.FullName }
$classpath = @($originalJar) + $apiJars

# Compile local compatibility shims first. They are only used when the original
# device API is absent from the target emulator.
$supportSources = Get-ChildItem $supportRoot -Recurse -Filter '*.java' | ForEach-Object { $_.FullName }
if ($supportSources) {
    Write-Host "Compiling support source(s): $supportSources"
    & $javac -encoding UTF-8 -source 7 -target 7 -Xlint:-options -cp ($classpath -join ';') -d $classesRoot -sourcepath $classesRoot $supportSources
    if ($LASTEXITCODE -ne 0) { throw 'Could not compile Java ME compatibility shims.' }
}

& $javac -encoding UTF-8 -source 7 -target 7 -Xlint:-options -cp (($classpath + $classesRoot) -join ';') -d $classesRoot -sourcepath $classesRoot $resolvedSources
if ($LASTEXITCODE -ne 0) { throw 'Compilation failed. Fix the selected source file(s), then rerun this command.' }

$tempJar = Join-Path $outputRoot 'unhooked.jar'
Push-Location $stagingRoot
try {
    & $jar xf $originalJar
    Get-ChildItem 'META-INF' -File -ErrorAction SilentlyContinue | Where-Object { $_.Name -match '\.(SF|RSA|DSA)$' } | Remove-Item -Force
    Copy-Item (Join-Path $classesRoot '*') $stagingRoot -Recurse -Force
    if (Test-Path -LiteralPath $resourcesRoot) { Copy-Item (Join-Path $resourcesRoot '*') $stagingRoot -Recurse -Force }
    & $jar cfm $tempJar 'META-INF\MANIFEST.MF' .
    if ($LASTEXITCODE -ne 0) { throw 'Could not package the staging JAR.' }
}
finally { Pop-Location }

# Inject bytecode hooks for AutoMenu popup (.auto chat & canvas) if AutoMenu is present
$autoMenuClass = Join-Path $classesRoot 'a\AutoMenu.class'
$patchAutoPopupClass = Join-Path $root 'build_tools\PatchAutoPopup.class'
$java = Join-Path (Split-Path $javac) 'java.exe'
if (!(Test-Path -LiteralPath $java)) {
    $java = Get-Command java.exe -ErrorAction SilentlyContinue | Select-Object -ExpandProperty Source -First 1
}

if ((Test-Path -LiteralPath $autoMenuClass) -and (Test-Path -LiteralPath $patchAutoPopupClass)) {
    Write-Host "Injecting AutoMenu bytecode hooks (.auto chat command & canvas overlay)..."
    & $java -cp (Join-Path $root 'build_tools') PatchAutoPopup $tempJar $outputJar $autoMenuClass
    if ($LASTEXITCODE -ne 0) { throw 'Could not inject AutoMenu bytecode hooks.' }
    Remove-Item -LiteralPath $tempJar -Force -ErrorAction SilentlyContinue
} else {
    Move-Item -LiteralPath $tempJar -Destination $outputJar -Force
}

Write-Host "Built: $outputJar"
