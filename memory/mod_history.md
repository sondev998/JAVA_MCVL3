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
  - Tự động tiêm hook vào `a.ac` để vẽ nút **`Auto`** cố định trên Canvas màn hình, vẽ popup overlay (`paint`), nhận diện chạm màn hình cảm ứng (`pointerPressed`, `pointerReleased`) và phím bấm (`keyPressed`).
  - Tự động tiêm hook bọc `Thread.sleep(J)V` trong vòng lặp game chính `a.ac` qua `AutoMenu.getModifiedSleep(long)` để tăng tốc độ game (Speed Hack 1x, 2x, 5x, 10x).
  - Tự động tiêm hook vào `a.z` (`public String a(int)`) để bắt toàn bộ thông báo / gói tin text server gửi về client (`AutoMenu.onServerMessage`).
  - Tự động biên dịch và sinh bytecode class `a.MCT` cho:
    - `MCT.tele()`: Gửi packet dịch chuyển tức thời đến cổng Tuyệt tình cốc (`u.a.b(...)`).
    - `MCT.moveTo(x, y)`: Điều khiển pathfinding nhân vật đến tọa độ mục tiêu (`ay.a.a(x, y, true)`).
    - `MCT.setAutoFight(enable)`: Bật/tắt chế độ tự động đánh mục tiêu (`ap.a().c(enable)`).
    - `MCT.getEntityList()`: Truy xuất danh sách thực thể `ay.k` trên bản đồ hiện tại (viewport entities).
    - `MCT.getNpcTable()`: Truy xuất danh sách bảng NPC `ay.h` của toàn bộ bản đồ (whole-map NPC/Monster table).
    - `MCT.getEntityName(obj)` / `MCT.getEntityX(obj)` / `MCT.getEntityId(obj)`: Đọc thông tin tên, tọa độ và ID của quái/NPC trong `ay.k`.
    - `MCT.getMyX()` / `MCT.getMyY()`: Đọc tọa độ thực tế hiện tại của nhân vật người chơi (`ay.a.q`, `ay.a.r`).
    - `MCT.getAfString(obj)`: Đọc chuỗi text từ các đối tượng `a.j` trong bảng `ay.h`.
    - `MCT.talkNpc(npcId)`: Tương tác mở menu thoại với NPC qua packet `1032`.
    - `MCT.sendBytes(byte[] data)`: Gửi mảng byte packet tùy ý lên server (`u.a.b(data)`).

---

### 2. Chuẩn Hóa 100% Theo `ghlb.jar` (`MoveAuto6` Đến Cổng Phụ Bản)

- **Loại bỏ hoàn toàn retry và spam packet:**
  - Khi bấm START: Nhân vật chỉ gọi hàm di chuyển đến tọa độ cổng `(62, 8)` chuẩn theo `MoveAuto6()` của `ghlb.jar`.
  - Không gửi packet tùy tiện, không chạy loop retry.
  - Lắng nghe trạng thái game: Khi nhân vật bước vào phụ bản, bot sẽ tiếp tục luồng săn Boss 1 `(11, 16)` $\rightarrow$ Boss 2 `(30, 50)` $\rightarrow$ Boss 3 `(30, 25)` $\rightarrow$ Rời ải $\rightarrow$ Vào lại lượt mới.

---

### 3. Nút Bật / Tắt Auto Đánh Độc Lập (`Auto Đánh: [BẬT / TẮT]`)

- **Điều khiển độc lập với Auto Phụ Bản:**
  - Bổ sung nút **`Auto Đánh: [BẬT]` / `[TẮT]`** trực tiếp trên cả Menu Chính và Menu Cụ Thể Phụ Bản.
  - Người chơi có thể tự do tắt riêng tính năng tự đánh/tung chiêu bất kỳ lúc nào mà không làm gián đoạn luồng chạy, tìm đường hoặc logic phụ bản của bot.

---

### 4. Cơ Chế Tuần Tra Tìm Boss Khắp Map (Map Roaming & Distance Arrival)

- **Nguyên tắc di chuyển tuần tra tìm kiếm:**
  - Khi chưa phát hiện thấy Boss trong tầm nhìn: Nhân vật tự động di chuyển qua các điểm tuần tra trọng yếu trên bản đồ Tuyệt Tình Cốc để mở rộng viewport.
  - **Tuyệt đối TẮT Auto Đánh** trong suốt quá trình tuần tra tìm kiếm.
  - Khi Boss xuất hiện trong danh sách thực thể `ay.k`: Nhân vật lập tức khóa mục tiêu và di chuyển thẳng đến tọa độ của Boss.
  - **CHỈ BẬT Auto Đánh** khi nhân vật đã tiếp cận sát Boss (khoảng cách $\le 2$ ô).
  - Khi Boss chết (nhận Lệnh bài): Lập tức **TẮT Auto Đánh**, tiếp tục tuần tra tìm Boss tiếp theo.
