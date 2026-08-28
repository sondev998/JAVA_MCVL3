# Hướng Dẫn Build JAR File (Java ME Patch Build)

Tài liệu này hướng dẫn chi tiết quy trình biên dịch và đóng gói (build/patch) file JAR cho dự án Java ME (`JAVA_MCVL3`).

> [!IMPORTANT]
> **Dự án đang phát triển / chỉnh sửa hiện tại là `tele_leader` (`tele_leader.jar`).**
> - Luôn sử dụng `-Project tele_leader`.
> - Mã nguồn chỉnh sửa đặt trong `decomplete/tele_leader/src/`.
> - File JAR gốc đối chiếu: `jar_file/tele_leader.jar`.
> - File JAR patched đầu ra: Lưu trực tiếp vào thư mục `jars_output/` với tên `tele_leader-patched-<timestamp>.jar`.

---

## 1. Tổng Quan Cơ Chế Patch Build

Mã nguồn của dự án được dịch ngược (decompile) từ 2 file JAR gốc và đặt tại `decomplete/<project>/src` (bao gồm `ghlb` và `tele_leader`, hiện tại tập trung phát triển **`tele_leader`**).

> [!WARNING]
> Do mã nguồn gốc bị obfuscate có chủ đích nên nhiều method/class sau khi dịch ngược không phải là cú pháp Java hợp lệ. **Tuyệt đối không compile toàn bộ các file nguồn cùng một lúc.**

**Cơ chế hoạt động:**
- Để sửa đổi hoặc thêm tính năng, chỉ cần chỉnh sửa các class cụ thể có cú pháp Java hợp lệ.
- Script build sẽ chỉ biên dịch (compile) những file `.java` được chỉ định đối chiếu với JAR gốc và thư viện J2ME (`.tools/j2me/`).
- Sau đó, script giải nén JAR gốc, loại bỏ chữ ký cũ (`META-INF/*.SF`, `*.RSA`, `*.DSA`), ghi đè class mới và tài nguyên (`resources`) vào, rồi đóng gói thành file JAR patched mới.
- **File JAR gốc trong `jar_file/` không bao giờ bị thay đổi.**
- **File JAR hoàn chỉnh sau khi đóng gói sẽ được xuất ra thư mục `jars_output/`.**

---

## 2. Yêu Cầu Môi Trường (Prerequisites)

- **Hệ điều hành:** Windows (sử dụng PowerShell).
- **JDK:** JDK 8 (khuyến nghị [Eclipse Temurin JDK 8](https://adoptium.net/temurin/releases/?version=8)). Script tự động nhận diện `javac.exe` / `jar.exe` từ PATH hoặc tại `C:\Program Files\Eclipse Adoptium`.
- **Target Java Version:** Java 7 (`-source 7 -target 7`).
- **Thư viện J2ME API:** Đã có sẵn trong thư mục `.tools/j2me/`:
  - `microemu-cldc-2.0.4.jar`
  - `microemu-midp-2.0.4.jar`
- **JAR gốc:** Đặt trong thư mục `jar_file/`:
  - `jar_file/ghlb.jar`
  - `jar_file/tele_leader.jar`

---

## 3. Cấu Trúc Thư Mục Liên Quan

| Thư mục / File | Mô tả |
| :--- | :--- |
| `build-patch.ps1` | Script PowerShell thực hiện quá trình compile và tạo file JAR patched |
| `jar_file/` | Chứa các file JAR gốc chưa qua chỉnh sửa (`ghlb.jar`, `tele_leader.jar`) |
| `jars_output/` | **Thư mục lưu toàn bộ các file JAR thành phẩm sau khi build** (kèm timestamp) |
| `decomplete/<project>/src/` | Chứa mã nguồn Java đã giải mã/chỉnh sửa của từng project |
| `decomplete/<project>/resources/` | Chứa tài nguyên (hình ảnh, data,...) ghi đè vào JAR kết quả |
| `build_support/` | Chứa các compatibility shim (ví dụ: Nokia `DeviceControl` no-op) giúp build và chạy trên emulator ngoài thiết bị Nokia thực tế |
| `build_tools/` | Chứa các công cụ patch bytecode ASM (`PatchAutoPopup`), tự động tiêm hook lệnh chat `.auto` vào `a.ad` và hook hiển thị/touch vào `a.ac` |
| `.tools/` | Chứa công cụ hỗ trợ như `cfr` (decompiler) và các JAR J2ME API |
| `build_export/<OutputName>/` | Thư mục trung gian trong quá trình build (chứa staging, classes) |

---

## 4. Hướng Dẫn Sử Dụng Script `build-patch.ps1`

### 4.1. Cú pháp lệnh

```powershell
.\build-patch.ps1 -Project <ghlb|tele_leader> -SourceFiles <Danh sách file .java> [-OutputName <Tên đầu ra>]
```

### 4.2. Các tham số (Parameters)

- `-Project` *(Bắt buộc)*: Tên project mục tiêu. Chỉ nhận một trong hai giá trị: `ghlb` hoặc `tele_leader`.
- `-SourceFiles` *(Bắt buộc)*: Danh sách một hoặc nhiều đường dẫn tới file `.java` cần biên dịch. Tất cả file phải nằm bên trong thư mục `decomplete/<project>/src`.
- `-OutputName` *(Tùy chọn)*: Tên prefix cho file JAR kết quả (mặc định lấy theo `-Project`).

---

## 5. Định Dạng File Xuất (Output Naming & Timestamp)

File JAR sau khi build thành công sẽ được lưu tại:
```
jars_output/<OutputName>-patched-<timestamp>.jar
```
*Trong đó:* `<timestamp>` có định dạng `yyyyMMdd_HHmmss` (ví dụ: `20260829_014059`).

> [!TIP]
> Toàn bộ các file JAR mới build đều nằm trong thư mục `jars_output/`. Nhờ có timestamp, các bản build mới sẽ **không bị ghi đè lên các bản build cũ**, giúp bạn dễ dàng đối chiếu, phân phối hoặc cài đặt thử nghiệm trên máy ảo/điện thoại.

---

## 6. Ví Dụ Cụ Thể (Dành Cho `tele_leader`)

### Ví dụ 1: Build 1 file nguồn đơn lẻ

```powershell
.\build-patch.ps1 -Project tele_leader -SourceFiles .\decomplete\tele_leader\src\a\b.java
```
*Kết quả xuất ra:* `jars_output/tele_leader-patched-<timestamp>.jar`

### Ví dụ 2: Build nhiều file nguồn cùng lúc

```powershell
.\build-patch.ps1 -Project tele_leader -SourceFiles @(
    ".\decomplete\tele_leader\src\a\b.java",
    ".\decomplete\tele_leader\src\a\AutoMenu.java"
)
```

### Ví dụ 3: Đổi tên output xuất ra

```powershell
.\build-patch.ps1 -Project tele_leader -SourceFiles .\decomplete\tele_leader\src\a\b.java -OutputName tele_leader_mod1
```

*Kết quả xuất ra:* `jars_output/tele_leader_mod1-patched-<timestamp>.jar`

---

## 7. Quy Trình Hoạt Động Chi Tiết (Build Workflow)

1. **Validation:**
   - Kiểm tra sự tồn tại của file JAR gốc (`jar_file/<project>.jar`).
   - Kiểm tra JDK (`javac` và `jar`).
   - Kiểm tra các đường dẫn trong `-SourceFiles` phải nằm trong `decomplete/<project>/src`.
2. **Khởi tạo thư mục build:**
   - Dọn dẹp thư mục tạm `classes` và `staging` bên trong `build_export/<OutputName>/`.
   - Tạo mới `classes` và `staging`.
   - Đảm bảo thư mục `jars_output/` đã tồn tại.
3. **Compile Compatibility Shims:**
   - Biên dịch các class hỗ trợ trong `build_support/` (nếu có) bằng `javac` với classpath bao gồm JAR gốc và các JAR API trong `.tools/j2me/`.
4. **Compile Source Files:**
   - Biên dịch các file `.java` đã truyền qua `-SourceFiles`.
5. **Staging & Packaging:**
   - Lấy timestamp hiện tại (`Get-Date -Format 'yyyyMMdd_HHmmss'`).
   - Giải nén JAR gốc vào `staging`.
   - Xóa các file chữ ký cũ trong `META-INF` (`.SF`, `.RSA`, `.DSA`).
   - Copy toàn bộ class đã biên dịch từ `classes` vào `staging`.
   - Copy các tài nguyên từ `decomplete/<project>/resources` (nếu có) vào `staging`.
   - Đóng gói file JAR hoàn chỉnh vào `jars_output/`:
     `jar cfm jars_output/<OutputName-patched-timestamp.jar> META-INF\MANIFEST.MF .`
6. **Hoàn tất:**
   - File JAR hoàn chỉnh sẵn sàng tại `jars_output/<OutputName>-patched-<timestamp>.jar`.
