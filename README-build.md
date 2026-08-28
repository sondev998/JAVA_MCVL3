# Java ME patch build

The source recovered from the two JARs is in `decomplete/<project>/src`.
Some methods were deliberately obfuscated and are not valid Java after
decompilation; do not attempt to compile all 152 source files at once.

To rebuild a specific edited, compilable class, pass only that source file to
the patch builder. It compiles the selected class against the original JAR and
then replaces that class in a new JAR. The original JAR is never changed.

```powershell
.\build-patch.ps1 -Project ghlb -SourceFiles .\decomplete\ghlb\src\javak\microedition\lcdui\Formk.java
```

The result is written to `build_export/<project>/<project>-patched.jar`.
Place edited image/data files under `decomplete/<project>/resources`; they are
overlaid into the output JAR too.

`build_support` contains a no-op Nokia `DeviceControl` shim. It permits builds
outside Nokia phones; real backlight control remains unavailable in a generic
emulator.
