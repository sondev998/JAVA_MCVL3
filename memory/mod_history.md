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
  - Tự động tiêm hook vào `a.z` (`public String a(int)`) để bắt toàn bộ thông báo / gói tin text server gửi về client (`AutoMenu.onServerMessage`).
  - Tự động biên dịch và sinh bytecode class `a.MCT` cho:
    - `MCT.tele()`: Gửi packet dịch chuyển tức thời đến cổng Tuyệt tình cốc (`u.a.b(...)`).
    - `MCT.moveTo(x, y)`: Điều khiển pathfinding nhân vật đến tọa độ mục tiêu (`ay.a.a(x, y, true)`).
    - `MCT.setAutoFight(enable)`: Bật/tắt chế độ tự động đánh mục tiêu (`ap.a().c(enable)`).

---

### 2. Tính Năng Giao Diện Popup Tool (`a.AutoMenu`)

#### A. Menu Chính (`SCREEN_MAIN` - "Menu Auto")
- Kích hoạt bằng cách nhập lệnh `.auto` trong khung chat của game.
- Nút bấm **Auto Nông Trường** -> Chuyển sang giao diện quản lý nông trang.
- Nút bấm **Auto Phụ Bản** -> Chuyển sang giao diện chọn và chạy phụ bản (hiển thị tag `[BẬT]` nếu `isAutoPhuBan` đang chạy).
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
- **Trạng thái `isAutoPhuBan` & Nút START / STOP:**
  - Khi chưa chạy (`isAutoPhuBan == false`): Nút hiển thị **`START`** (nền xanh lá).
  - Khi bấm `START`:
    - `isAutoPhuBan = true;`
    - `bossNum = 0;` (Khởi tạo đánh Boss 1)
    - Tự động di chuyển đến Boss 1 tại tọa độ `(11, 16)` và kích hoạt auto đánh.
    - Nút chuyển sang **`STOP`** (nền đỏ nổi bật).
  - Khi bấm `STOP`:
    - `isAutoPhuBan = false;`
    - `bossNum = 0;`
    - Hủy trạng thái auto đánh (`MCT.setAutoFight(false)`).
    - Nút quay lại trạng thái **`START`** (xanh lá).
- **Cơ chế Event Loop Nhận Giang Hồ Lệnh Bài:**
  - Nhận event qua hook `a.z.a(int)` -> `AutoMenu.onServerMessage(msg)`:
  - Khi khớp chuỗi thông báo *"Bạn nhận được... Giang hồ lệnh bài"*:
    - Nếu `bossNum == 0` (vừa xong Boss 1) -> Tăng `bossNum = 1`, tự động chạy sang Boss 2 tại tọa độ `(30, 50)`.
    - Nếu `bossNum == 1` (vừa xong Boss 2) -> Tăng `bossNum = 2`, tự động chạy sang Boss 3 tại tọa độ `(30, 25)`.
    - Nếu `bossNum >= 2` (đã xong toàn bộ Boss) -> Reset `bossNum = 0`.
  - Nếu nhận chuỗi thông báo kết thúc / rời map (*"Nơi này không nên ở lại lâu"*, *"Phần thưởng qua ải"*): Reset `bossNum = 0`.
- **Nút "Đến" (Dịch chuyển tức thời):**
  - Nằm cạnh nút START.
  - Gửi packet mạng dịch chuyển đến cổng Tuyệt tình cốc (`MCT.tele()`).
- **Hàng nút điều hướng:** Nút **Quay lại** và nút **Đóng**.
