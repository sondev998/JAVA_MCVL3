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
    - `MCT.getBagVector()`: Truy xuất danh sách hành trang người chơi qua `a.ay.a(1, -1)`.
    - `MCT.dropItem(id, count)`: Gửi gói tin vứt vật phẩm `CMD 1009` (`u.a((short)3, itemId, 0, (byte)-2, 0, 0, 0)`).
    - `MCT.enterManor(playerId)`: Gửi gói tin vào trang viên `CMD 1312` (`z.a().a(1312, new ba(13), new an(playerId))`).
    - `MCT.getPlayerId()`: Đọc Player Instance ID của nhân vật chính (`ay.a.a.a`).
    - `MCT.sendBytes(byte[] data)`: Gửi mảng byte packet tùy ý lên server (`u.a.b(data)`).
  - **Tự động tính toán StackMapTable (`ClassWriter.COMPUTE_FRAMES`):**
    - Toàn bộ class `a/MCT` và các class được patch đều được sinh đầy đủ StackMapTable frames chuẩn cho Java 6/7/8 JVM, triệt tiêu hoàn toàn lỗi `VerifyError: Expecting a stackmap frame at branch target`.

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

### 7. Menu & Chức Năng "Vứt Đồ Rác" (`SCREEN_TRASH`) & Tự Động Vứt Khi Auto Train
- **Giao diện Menu chuyên dụng (`SCREEN_TRASH`):**
  - Thêm nút **`Vứt đồ rác`** trên Menu chính để mở giao diện quản lý vứt đồ.
  - Hỗ trợ 7 tùy chọn loại rác:
    1. `1. Vứt đồ chưa giám định`
    2. `2. Vứt đay`
    3. `3. Vứt tơ`
    4. `4. Vứt da sống`
    5. `5. Vứt da nhẹ`
    6. `6. Vứt khoáng thạch`
    7. `7. Vứt bạch dược`
  - **Cơ chế Chọn Mục & Xác Nhận Vứt An Toàn:**
    - Khi click vào 1 trong 7 mục: Mục đó sẽ được highlight sáng (màu xanh lá `[CHỌN]`) và lưu vào biến `selectedTrashOption`.
    - Xuất hiện nút **`[XÁC NHẬN VỨT]`** màu đỏ nổi bật ở hàng hành động.
    - Khi click **`[XÁC NHẬN VỨT]`**: Hệ thống mới bắt đầu quét và gửi gói tin vứt toàn bộ vật phẩm loại đó trong hành trang, tránh tình trạng click nhầm tự vứt đồ.
- **Cơ chế gửi packet ngầm chuẩn xác (`CMD 1009`):**
  - **Phân tích từ log thực tế:** Gói tin vứt bỏ vật phẩm chuẩn xác của game là `CMD 1009` với `p0 = short(3)` (Hành động Vứt Bỏ) và `p1 = int(itemId)` (ID thực thể duy nhất của vật phẩm trong túi).
  - **Thực thi:** Tự động duyệt danh sách hành trang `MCT.getBagVector()` (`ay.a`), nhận diện vật phẩm qua `MCT.getItemName(item)` và gửi lệnh `u.a((short)3, itemId, 0, (byte)-2, (short)0, (short)0, 0)` với khoảng nghỉ 120ms/lần vứt để vứt sạch toàn bộ vật phẩm mục tiêu mà không bị ngắt kết nối.

---

### 8. Hệ Thống Ghi Log & Phân Tích Gói Tin Chuẩn (`debug.txt` Packet Inspector)
- **Kiến trúc Packet Inspector toàn diện (SEND & RECV):**
  - **Hook Gói Tin Gửi Đi (`[SEND]` - `a.bb.b([B)V`):**
    - Bắt và bóc tách toàn bộ gói tin client gửi lên server.
    - Giải mã Command ID (`short`) và các tham số payload theo thẻ kiểu (`int`, `short`, `byte`, `string`, `byte[]`).
    - Trích xuất mảng `raw=[b0, b1, ...]` trực tiếp để người dùng/AI có thể copy ngay vào code mod mà không cần tự tính byte.
  - **Hook Gói Tin Nhận Về (`[RECV]` - `a.ah.<init>(DataInputStream)`):**
    - Bắt và giải mã toàn bộ gói tin server gửi về client trước khi phân phối tới các hàm xử lý trong game.
    - Trích xuất Command ID (`short`) và danh sách tham số `Vector` (`an`, `ba`, `t`, `j`, `byte[]`).
- **Bộ lọc thông minh chống rác & chống spam:**
  - **Loại bỏ chat & rao bán:** Tự động phát hiện và bỏ qua mã màu format chat (`*0#`, `*1#`..), item tag (`#(..)`), tên người chơi đơn lẻ, kênh chat thế giới/bang hội, rao bán ac/vật phẩm (`zl`, `zalo`, `atm`, `sex`...).
  - **Loại bỏ spam auto đánh & heartbeat ngầm (`CMD 1000`, `CMD 1311`):** Tự động bỏ qua packet ping mạng định kỳ (`CMD 1000`), spam chiêu đánh thường (`CMD 1004`), và gói tin telemetry/heartbeat ngầm của game engine (`CMD 1311`) để giữ log hoàn toàn sạch sẽ, chỉ ghi nhận tương tác thực tế của người chơi.
- **Định dạng ghi log chuẩn phục vụ Mod:**
  ```text
  [HH:mm:ss] [SEND] CMD=1033: p0=byte(1), p1=int(0), p2=int(45291818), p3=short(1), p4=byte(0) | raw=[4, 9, 2, 1, 4, 0, 0, 0, 0, 4, 2, -80, -90, -86, 3, 0, 1, 2, 0]
  [HH:mm:ss] [RECV] CMD=1032 (pCount=4): p0=int(101), p1=str("Nhận nhiệm vụ"), p2=int(1004), p3=int(1)
  ```
- **Vị trí lưu trữ file:** Ghi đồng thời vào cả thư mục giả lập (`D:\VL3_Tool\Java Emu Tool\AngelChipEmulatorEXE\debug.txt`) và thư mục dự án ([`E:\MCVL_3_DEV\Mod_Auto_1\logs\debug.txt`](file:///E:/MCVL_3_DEV/Mod_Auto_1/logs/debug.txt)).

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
| `SCREEN_FARM` | `1` | Menu Auto Nông Trường (Trồng cây, Thu hoạch, START/STOP) |
| `SCREEN_DUNGEON` | `2` | Menu Auto Phụ Bản Tuyệt Tình Cốc (4 cấp độ, START/STOP, Chiêu đánh) |
| `SCREEN_TRASH` | `3` | Menu Vứt Đồ Rác (7 danh mục vứt nhanh 1-Click kèm Xác Nhận) |
| `SCREEN_TRAIN` | `4` | Menu Auto Train Quái (7 toggle lọc rác/nhặt đá, Chiêu train riêng, START/STOP) |

| Biến Trạng Thái | Kiểu Dữ Liệu | Giá Trị Mặc Định | Chức Năng |
| :--- | :---: | :---: | :--- |
| `isAutoFarm` | `boolean` | `false` | Bật/tắt chế độ Auto Nông Trường (Trang viên) |
| `autoPlantEnabled` | `boolean` | `false` | Tùy chọn Tự động trồng cây khi Auto Nông Trường |
| `autoHarvestEnabled` | `boolean` | `false` | Tùy chọn Tự động thu hoạch khi Auto Nông Trường |
| `isAutoPhuBan` | `boolean` | `false` | Bật/tắt chế độ Auto Phụ Bản Tuyệt Tình Cốc |
| `autoPbDropTrash` | `boolean` | `false` | Tự động vứt 7 loại đồ rác sau mỗi lượt phụ bản trước khi vào lượt mới |
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




