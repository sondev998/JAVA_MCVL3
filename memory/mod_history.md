# Lịch Sử Cập Nhật Bản Mod (`mod_history.md`)

Tài liệu ghi nhận toàn bộ các thay đổi, tính năng mới và cải tiến trong các phiên bản mod của dự án `JAVA_MCVL3` (Target: `tele_leader.jar`).

---

## [2026-08-29] Phiên Bản Cập Nhật Hệ Thống Auto & Popup Tool

### 1. Nâng Cấp Hệ Thống Build & Tự Động Hóa (`build-patch.ps1`)
- **Quản lý file đầu ra:** Chuyển đích xuất file JAR thành phẩm trực tiếp vào thư mục `jars_output/`.
- **Cơ chế Timestamp chống ghi đè:** File JAR được đặt tên theo định dạng `tele_leader-patched-<yyyyMMdd_HHmmss>.jar`, bảo toàn toàn bộ lịch sử các bản build trước đó.
- **Tự động tiêm Bytecode Hooks (ASM Injection):**
  - Tích hợp `build_tools/PatchAutoPopup.java` vào pipeline của `build-patch.ps1`.
  - Tự động tiêm hook vào `a.ad` để nhận diện lệnh chat `.auto`.
  - Tự động tiêm hook vào `a.ac` để vẽ overlay (`paint`), nhận diện chạm màn hình cảm ứng (`pointerPressed`, `pointerReleased`) và phím bấm (`keyPressed`).
  - Tự động biên dịch và đóng gói bytecode cho `a.MCT` (hỗ trợ gửi packet chuyển map).

---

### 2. Tính Năng Giao Diện Popup Tool (`a.AutoMenu`)

#### A. Menu Chính (`SCREEN_MAIN` - "Menu Auto")
- Kích hoạt bằng cách nhập lệnh `.auto` trong khung chat của game.
- Nút bấm **Auto Nông Trường** -> Chuyển sang giao diện quản lý nông trang.
- Nút bấm **Auto Phụ Bản** -> Chuyển sang giao diện chọn và chạy phụ bản.
- Nút **Đóng** và biểu tượng **[X]** đóng popup nhanh.

#### B. Popup Auto Nông Trường (`SCREEN_FARM` - "Auto Nông Trường")
- **Tự động trồng cây:** Nút bật/tắt chức năng tự động trồng trọt kèm trạng thái `[BẬT]` / `[TẮT]`.
- **Tự động thu hoạch:** Nút bật/tắt chức năng tự động thu hoạch nông sản kèm trạng thái `[BẬT]` / `[TẮT]`.
- Điều hướng: Nút **Quay lại** (về Menu chính) và nút **Đóng**.

#### C. Popup Cụ Thể Phụ Bản (`SCREEN_DUNGEON` - "Cụ thể phụ bản")
- **Dữ liệu 4 phụ bản thực tế chuẩn theo game (Cấm địa Tuyệt tình cốc):**
  1. `Cấm địa Tuyệt tình cốc [Đơn giản ][2 Người][Cấp 15]`
  2. `Cấm địa Tuyệt tình cốc [Phổ thông ][5Người][Cấp 20]`
  3. `Cấm địa Tuyệt tình cốc [Ác mộng ][9Người][Cấp 30]`
  4. `Cấm địa Tuyệt tình cốc [Tinh anh ][2 Người][Cấp 90]`
- **Tương tác chọn phụ bản:** Cho phép chạm/chọn từng phụ bản (đổi viền vàng & nền highlight).
- **Nút START / STOP:**
  - Trạng thái chưa chạy: Hiển thị `START` (nền xanh lá / viền xanh sáng).
  - Trạng thái đang chạy: Hiển thị `STOP` (nền đỏ / viền đỏ sáng).
- **Nút "Đến" (Dịch chuyển tức thời):**
  - Nằm cạnh nút START.
  - Gửi packet mạng `new byte[]{4, (byte)146, 3, 0, 6, 2, 1}` trực tiếp qua `u.a:La/bb;.b(...)` đưa người chơi lập tức chuyển map đến cổng phụ bản Tuyệt tình cốc.
  - Tự động đóng popup để người chơi vào ngay giao diện game.
- **Hàng nút điều hướng:** Nút **Quay lại** và nút **Đóng**.
