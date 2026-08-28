# Lịch Sử Cập Nhật Bản Mod (`mod_history.md`)

Tài liệu ghi nhận toàn bộ các thay đổi, tính năng mới và cải tiến trong các phiên bản mod của dự án `JAVA_MCVL3` (Target: `tele_leader.jar`).

---

## [2026-08-29] Phiên Bản Cập Nhật Hệ Thống Auto & Popup Tool

### 1. Nâng Cấp Hệ Thống Build & Tự Động Hóa (`build-patch.ps1`)
- **Quản lý file đầu ra:** Chuyển đích xuất file JAR thành phẩm trực tiếp vào thư mục `jars_output/`.
- **Cơ chế Timestamp chống ghi đè:** File JAR được đặt tên theo định dạng `tele_leader-patched-<yyyyMMdd_HHmmss>.jar`, bảo toàn toàn bộ lịch sử các bản build trước đó.
- **Tự động tiêm Bytecode Hooks (ASM Injection):**
  - Tích hợp `build_tools/PatchAutoPopup.java` vào pipeline của `build-patch.ps1`.
  - Tự động tiêm hook vào `a.ad` để nhận diện sự kiện click **Gửi** khi khung chat rỗng (hoặc nhập lệnh `.auto`).
  - Tự động tiêm hook vào `a.ac` để vẽ overlay (`paint`), nhận diện chạm màn hình cảm ứng (`pointerPressed`, `pointerReleased`) và phím bấm (`keyPressed`).
  - Tự động tiêm hook vào `a.z` (`public String a(int)`) để bắt toàn bộ thông báo / gói tin text server gửi về client (`AutoMenu.onServerMessage`).
  - Tự động biên dịch và sinh bytecode class `a.MCT` cho:
    - `MCT.tele()`: Gửi packet dịch chuyển tức thời đến cổng Tuyệt tình cốc (`u.a.b(...)`).
    - `MCT.moveTo(x, y)`: Điều khiển pathfinding nhân vật đến tọa độ mục tiêu (`ay.a.a(x, y, true)`).
    - `MCT.setAutoFight(enable)`: Bật/tắt chế độ tự động đánh mục tiêu (`ap.a().c(enable)`).
    - `MCT.getEntityList()`: Truy xuất danh sách thực thể `ay.k` trên bản đồ hiện tại (viewport entities).
    - `MCT.getNpcTable()`: Truy xuất danh sách bảng NPC `ay.h` của toàn bộ bản đồ (whole-map NPC/Monster table).
    - `MCT.getEntityName(obj)` / `MCT.getEntityX(obj)` / `MCT.getEntityY(obj)` / `MCT.getEntityId(obj)`: Đọc thông tin tên, tọa độ và ID của quái/NPC trong `ay.k`.
    - `MCT.getAfString(obj)`: Đọc chuỗi text từ các đối tượng `a.j` trong bảng `ay.h`.
    - `MCT.talkNpc(npcId)`: Tương tác mở menu thoại với NPC qua packet `1032`.

---

### 2. Tính Năng Giao Diện Popup Tool (`a.AutoMenu`) & Console Logging

#### A. Menu Chính (`SCREEN_MAIN` - "Menu Auto")
- **Kích hoạt nhanh:** Bấm nút **Gửi** trong khung chat khi không nhập gì (tin nhắn trống) hoặc nhập `.auto`.
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
    - `bossNum = 0;`
    - Quét tìm động Boss 1 (`Phàn nhất ông`) trên cả `ay.k` (quanh viewport) và `ay.h` (toàn map) -> Di chuyển đến tọa độ thực tế của Boss và bật auto đánh.
    - Nút chuyển sang **`STOP`** (nền đỏ nổi bật).
  - Khi bấm `STOP`:
    - `isAutoPhuBan = false;`
    - `bossNum = 0;`
    - Hủy trạng thái auto đánh (`MCT.setAutoFight(false)`).
    - Nút quay lại trạng thái **`START`** (xanh lá).
- **Cơ chế Tìm Boss & NPC Động Theo Tên (Quét Cả Toàn Map `ay.h` và `ay.k` với Multi-Keyword Search):**
  - Sử dụng hàm chuẩn hóa tiếng Việt `normalize(str)` để so sánh tên không phân biệt hoa thường và không dấu.
  - **Boss 1 (`bossNum == 0`):** Tìm thực thể tên `"phan nhat ong"`, `"phan nhat"`, `"nhat ong"` -> Di chuyển đến tọa độ `(x, y)` thực tế của Boss 1.
  - **Boss 2 (`bossNum == 1`):** Khi nhận Giang Hồ Lệnh Bài lần 1 -> Tăng `bossNum = 1`, tìm thực thể tên `"thien xich"`, `"cau thien"`, `"cuu thien"`, `"thien chi"` -> Di chuyển đến `(x, y)` thực tế của Boss 2.
  - **Boss 3 (`bossNum == 2`):** Khi nhận Giang Hồ Lệnh Bài lần 2 -> Tăng `bossNum = 2`, tìm thực thể tên `"cong ton chi"`, `"cong ton"` -> Di chuyển đến `(x, y)` thực tế của Boss 3.
  - **NPC Dương Quá (`bossNum == 3`):** Khi nhận Giang Hồ Lệnh Bài lần 3 -> Tăng `bossNum = 3`, tắt auto đánh, tìm NPC `"duong qua"` -> Di chuyển đến sát NPC và tự động gửi packet tương tác thoại (`MCT.talkNpc(id)`).
  - **Rời khỏi phụ bản:** Khi bắt được thông báo / tùy chọn `"Đưa ta rời khỏi nơi này"` / `"roi khoi"` hoặc thông báo kết thúc ải -> Hoàn tất phụ bản và reset `isAutoPhuBan = false`, `bossNum = 0`.
- **Hệ Thống Console Log Debug (`System.out.println`):**
  - In chi tiết từng phần tử của `ay.k` và toàn bộ 14 đối tượng của bảng map `ay.h` (`name`, `norm`, `x`, `y`, `id`, `content`).
  - In mọi gói tin / thông báo text từ server nhận được qua `onServerMessage` kèm chuỗi thô (`raw`) và chuỗi chuẩn hóa (`norm`).
  - In log chi tiết khi phát hiện sự kiện nhận Giang Hồ Lệnh Bài và quá trình chuyển đổi trạng thái `bossNum`.
- **Nút "Đến" (Dịch chuyển tức thời):**
  - Gửi packet mạng dịch chuyển đến cổng Tuyệt tình cốc (`MCT.tele()`).
- **Hàng nút điều hướng:** Nút **Quay lại** và nút **Đóng**.
