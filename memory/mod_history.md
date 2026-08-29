# Lịch Sử Cập Nhật & Kiến Trúc Bản Mod (`mod_history.md`)

Tài liệu ghi nhận toàn bộ các thay đổi, tính năng mới, cấu trúc gói tin (packet) và cải tiến mã nguồn trong các phiên bản mod của dự án `JAVA_MCVL3` (Target: `tele_leader.jar`).

---

## [2026-08-29] Phiên Bản Cập Nhật Hệ Thống Auto & Popup Tool Toàn Diện

---

### 1. Nâng Cấp Hệ Thống Build & Tự Động Hóa (`build-patch.ps1`)
- **Quản lý file đầu ra:** Chuyển đích xuất file JAR thành phẩm trực tiếp vào thư mục `jars_output/`.
- **Cơ chế Timestamp chống ghi đè:** File JAR được đặt tên theo định dạng `tele_leader-patched-<yyyyMMdd_HHmmss>.jar`, bảo toàn toàn bộ lịch sử các bản build.
- **Tự động tiêm Bytecode Hooks (ASM Injection):**
  - Tích hợp `build_tools/PatchAutoPopup.java` vào pipeline của `build-patch.ps1`.
  - Tự động tiêm hook vào `a.ad` để nhận diện lệnh chat `.auto`.
  - Tự động tiêm hook vào `a.ac` để vẽ nút **`Auto`** cố định trên Canvas màn hình, vẽ popup overlay (`paint`), nhận diện chạm màn hình cảm ứng (`pointerPressed`, `pointerReleased`) và phím bấm (`keyPressed`).
  - Tự động tiêm hook bọc `Thread.sleep(J)V` trong vòng lặp game chính `a.ac` qua `AutoMenu.getModifiedSleep(long)` để tăng tốc độ game (Speed Hack 1x, 2x, 5x, 10x).
  - Tự động tiêm hook vào `a.z` (`public String a(int)`) để bắt toàn bộ thông báo / gói tin text server gửi về client (`AutoMenu.onServerMessage`).
  - Tự động biên dịch và sinh bytecode class `a.MCT` cho:
    - `MCT.moveTo(x, y)`: Điều khiển pathfinding nhân vật đến tọa độ mục tiêu (`ay.a.a(x, y, true)`).
    - `MCT.setAutoFight(enable)`: Bật/tắt chế độ tự động đánh mục tiêu (`ap.a().c(enable)`).
    - `MCT.getEntityList()`: Truy xuất danh sách thực thể `ay.k` trên bản đồ hiện tại (viewport entities).
    - `MCT.getNpcTable()`: Truy xuất danh sách bảng NPC `ay.h` của toàn bộ bản đồ.
    - `MCT.getEntityName(obj)` / `MCT.getEntityX(obj)` / `MCT.getEntityId(obj)`: Đọc thông tin tên, tọa độ và ID của quái/NPC trong `ay.k`.
    - `MCT.getMyX()` / `MCT.getMyY()`: Đọc tọa độ thực tế hiện tại của nhân vật người chơi (`ay.a.q`, `ay.a.r`).
    - `MCT.getAfString(obj)`: Đọc chuỗi text từ các đối tượng `a.j`.
    - `MCT.getBagVector()`: Truy xuất danh sách hành trang `ay.a.a`.
    - `MCT.dropItem(id, count)`: Gửi gói tin vứt vật phẩm `1033`.
    - `MCT.sendBytes(byte[] data)`: Gửi mảng byte packet tùy ý lên server (`u.a.b(data)`).

---

### 2. Chuẩn Hóa Logic Auto Phụ Bản Theo `ghlb.jar` (`MoveAuto6`)
- **Loại bỏ hoàn toàn retry và spam packet:**
  - Khi bấm **START**: Nhân vật chỉ gọi hàm di chuyển đến tọa độ cổng `(62, 8)` chuẩn theo `MoveAuto6()` của `ghlb.jar`.
  - Không gửi packet tùy tiện, không chạy loop retry gây nghẽn kết nối.
  - **Tự động giải Captcha:** Bắt các chuỗi câu hỏi phép tính / chuỗi số từ server để tự giải mã và gửi đáp án.
  - **Nhận diện Boss & Lệnh Bài:** Lắng nghe gói tin server khi nhận được *"Giang hồ lệnh bài"* để xác định đã diệt xong Boss và chuyển sang Boss tiếp theo (`Boss 1 (11, 16) -> Boss 2 (30, 50) -> Boss 3 (30, 25) -> Rời ải -> Vào lại lượt mới`).

---

### 3. Nút Bật / Tắt Auto Đánh Độc Lập & Cài Đặt Chiêu Combo
- **Điều khiển độc lập với Auto Phụ Bản:**
  - Bổ sung nút **`Auto Đánh: [BẬT]` / `[TẮT]`** trực tiếp trên cả Menu Chính và Menu Cụ Thể Phụ Bản.
  - **Trạng thái mặc định: [TẮT]** khi mở popup. Người chơi chủ động bấm để BẬT khi cần.
  - Người chơi có thể tự do tắt riêng tính năng tự đánh/tung chiêu bất kỳ lúc nào mà không làm gián đoạn luồng di chuyển hoặc tìm Boss.
- **Hỗ trợ định dạng phím combo linh hoạt:**
  - Hỗ trợ nhập chuỗi: `-5:0,49:0,50:0,51:0,52:0,53:0,54:0,55:0,56:0` (Chuẩn Kalvaz AutoClick) hoặc `1,2,3,4,5,6,7,8`.

---

### 4. Cơ Chế Tuần Tra Tìm Boss Khắp Map (Map Roaming & Distance Arrival)
- **Nguyên tắc di chuyển tuần tra tìm kiếm:**
  - Khi chưa phát hiện thấy Boss trong tầm nhìn: Nhân vật tự động di chuyển qua các điểm tuần tra trọng yếu trên bản đồ Tuyệt Tình Cốc để mở rộng viewport.
  - **Tuyệt đối TẮT Auto Đánh** trong suốt quá trình tuần tra tìm kiếm nhằm tránh đánh nhầm quái thường.
  - Khi Boss xuất hiện trong danh sách thực thể `ay.k`: Nhân vật lập tức khóa mục tiêu và di chuyển thẳng đến tọa độ của Boss.
  - **CHỈ BẬT Auto Đánh** khi nhân vật đã tiếp cận sát Boss (khoảng cách $\le 2$ ô).
  - Khi Boss chết (nhận Lệnh bài): Lập tức **TẮT Auto Đánh**, tiếp tục tuần tra tìm Boss tiếp theo.

---

### 5. Khắc Phục Lỗi Khung Chat & Trích Xuất Từ `game_goc.jar`
- **Khôi phục 100% nguyên bản từ `game_goc.jar`:**
  - Trích xuất class xử lý chat `a/ad.class` từ file `jar_file/game_goc.jar` (bản gốc chưa mod).
  - Gỡ bỏ hoàn toàn lệnh gọi `MCT.tele()` ẩn từng bị modder trước gán vào dòng `2095` trong hàm gửi chat `ad.a()V`.
  - Biến hàm bytecode `MCT.tele()` thành **No-op (hàm rỗng)** để đảm bảo an toàn tuyệt đối.
  - Chỉ tiêm duy nhất lệnh bắt chuỗi `.auto` để mở Popup Tool, còn lại toàn bộ logic chat hoạt động nguyên bản.

---

### 6. Nút "Tele Đến Vị Trí Đội Trưởng" Trên Popup
- **Nút bấm kích hoạt trên UI Popup (`SCREEN_MAIN`):**
  - Thêm nút **`Tele đến vị trí đội trưởng`** trực tiếp trên Menu chính của Popup Auto.
  - Khi click: Gửi gói tin `[4, -110, 3, 0, 6, 2, 1]` lập tức đưa nhân vật đến vị trí của đội trưởng trong tổ đội.

---

### 7. Menu & Chức Năng "Vứt Đồ Rác" (`SCREEN_TRASH`)
- **Menu chuyên dụng (`SCREEN_TRASH`):**
  - Thêm nút **`Vứt đồ rác`** trên Menu chính để mở giao diện quản lý vứt đồ.
  - Hỗ trợ 7 tùy chọn vứt nhanh theo loại:
    1. `1. Vứt đồ chưa giám định`
    2. `2. Vứt đay`
    3. `3. Vứt tơ`
    4. `4. Vứt da sống`
    5. `5. Vứt da nhẹ`
    6. `6. Vứt khoáng thạch`
    7. `7. Vứt bạch dược`
- **Cơ chế gửi packet ngầm:**
  - Tự động duyệt danh sách hành trang `MCT.getBagVector()` (`ay.a`), nhận diện tên và thuộc tính vật phẩm, sau đó gửi gói tin vứt đồ `1033` (`u.a((byte)1, ap.o, itemId, count, 0)`) với khoảng nghỉ 120ms đảm bảo an toàn và mượt mà.

---

### 8. Hệ Thống Ghi Log Server Message Ra `debug.txt`
- **Ghi nhận toàn bộ thông điệp máy chủ:**
  - Toàn bộ chuỗi thông báo, cảnh báo và message dạng chữ từ server (được giải mã UTF-8 qua hàm `a.z.a(int)`) tự động được ghi nối tiếp vào file **`debug.txt`** nằm cùng thư mục chạy game.
  - Định dạng từng dòng log:
    ```text
    [HH:mm:ss] <Nội dung tin nhắn / thông báo đã giải mã từ server>
    ```

---

### 9. Tối Ưu Hóa Giao Diện Auto Phụ Bản
- **Xóa nút "Đến" & Xóa logic tự chạy:**
  - Đã xóa hoàn toàn nút `[Đến]` trên popup Auto Phụ Bản theo yêu cầu để người chơi chủ động di chuyển nhân vật đến map phụ bản.
  - Nút **`[START / STOP]`** được căn đều toàn bộ chiều rộng hàng hành động, rõ ràng và dễ thao tác.

---

### 10. Menu & Chức Năng "Auto Train" Toàn Diện (`SCREEN_TRAIN`)
- **Nút "Auto Train" trên Menu chính (`SCREEN_MAIN`):**
  - Thêm nút thứ 3 trong menu chính mở màn hình cài đặt `SCREEN_TRAIN`.
  - Hiển thị trạng thái động: `Auto Train [BẬT]` khi đang chạy hoặc `Auto Train` khi tắt.
- **Giao diện Cài đặt Auto Train (`SCREEN_TRAIN`):**
  - **7 Tùy chọn Toggle BẬT / TẮT (mặc định toàn bộ là TẮT, lưu trong 7 biến riêng biệt):**
    1. `1. Tự động nhặt đá: [TẮT / BẬT]` (`trainAutoPickStone`)
    2. `2. Vứt đay: [TẮT / BẬT]` (`trainDropDay`)
    3. `3. Vứt tơ: [TẮT / BẬT]` (`trainDropTo`)
    4. `4. Vứt da sống: [TẮT / BẬT]` (`trainDropDaSong`)
    5. `5. Vứt da nhẹ: [TẮT / BẬT]` (`trainDropDaNhe`)
    6. `6. Vứt răng rơi: [TẮT / BẬT]` (`trainDropRangRoi`)
    7. `7. Vứt độc nhện: [TẮT / BẬT]` (`trainDropDocNhen`)
  - **Cài đặt Chiêu đánh riêng cho Train:**
    - Nút `Chiêu Train: [trainSkillString]` với hộp thoại TextBox nhập và lưu combo riêng (`trainSkillString`, `trainParsedSkills`).
  - **Nút `[START TRAIN / STOP TRAIN]`:**
    - Quản lý bởi biến trạng thái `isAutoTrain` (hoàn toàn tách biệt với `isAutoPhuBan`).
    - Khi START: Đồng thời kích hoạt luồng xuất chiêu đánh train (`startAutoTrainSkillLoop`) và luồng lọc rác/nhặt đá ngầm (`startAutoTrainLoop`).
  - **Nút chuyển đổi:** `[Quay lại]` và `[Đóng]`.
- **Luồng xử lý ngầm (Auto Train Background Loop):**
  - Định kỳ mỗi 1.5s quét hành trang và tự động vứt các loại vật phẩm rác được kích hoạt nhằm tránh đầy túi đồ.
  - Tự động quét và tương tác nhặt các loại đá / khoáng thạch xung quanh khi bật `Tự động nhặt đá`.

---

## Bảng Tổng Hợp Mã Màn Hình & Trạng Thái Biến

| Tên Màn Hình | Hằng Số ID | Mô Tả |
| :--- | :---: | :--- |
| `SCREEN_MAIN` | `0` | Menu chính của Tool Auto (Nông trường, Phụ bản, Train, Tele, Vứt rác, Đánh, Chiêu, Tốc độ) |
| `SCREEN_FARM` | `1` | Menu Auto Nông Trường (Trồng cây, Thu hoạch) |
| `SCREEN_DUNGEON` | `2` | Menu Auto Phụ Bản Tuyệt Tình Cốc (4 cấp độ, START/STOP, Chiêu đánh) |
| `SCREEN_TRASH` | `3` | Menu Vứt Đồ Rác (7 danh mục vứt nhanh 1-Click) |
| `SCREEN_TRAIN` | `4` | Menu Auto Train Quái (7 toggle lọc rác/nhặt đá, Chiêu train riêng, START/STOP) |

| Biến Trạng Thái | Kiểu Dữ Liệu | Giá Trị Mặc Định | Chức Năng |
| :--- | :---: | :---: | :--- |
| `isAutoPhuBan` | `boolean` | `false` | Bật/tắt chế độ Auto Phụ Bản Tuyệt Tình Cốc |
| `isAutoTrain` | `boolean` | `false` | Bật/tắt chế độ Auto Train Quái |
| `autoFightEnabled`| `boolean` | `false` | Bật/tắt chế độ Auto Đánh chung |
| `trainAutoPickStone` | `boolean` | `false` | Bật/tắt tự động nhặt đá / quặng khi train |
| `trainDropDay` | `boolean` | `false` | Bật/tắt tự động vứt đay khi train |
| `trainDropTo` | `boolean` | `false` | Bật/tắt tự động vứt tơ khi train |
| `trainDropDaSong` | `boolean` | `false` | Bật/tắt tự động vứt da sống khi train |
| `trainDropDaNhe` | `boolean` | `false` | Bật/tắt tự động vứt da nhẹ khi train |
| `trainDropRangRoi` | `boolean` | `false` | Bật/tắt tự động vứt răng rơi / răng dơi khi train |
| `trainDropDocNhen` | `boolean` | `false` | Bật/tắt tự động vứt độc nhện khi train |
| `speedMultiplier` | `int` | `1` | Hệ số tốc độ game (1x, 2x, 5x, 10x) |




