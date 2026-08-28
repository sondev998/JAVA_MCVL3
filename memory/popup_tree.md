# Sơ Đồ Cấu Trúc Popup Menu Auto (`popup_tree.md`)

Tài liệu thể hiện cây phân cấp giao diện các màn hình popup và các nút chức năng trong `AutoMenu.java`.

---

```
[Khung Chat In-Game: Gửi lệnh ".auto"]
  │
  ▼
[SCREEN_MAIN: Menu Auto]
  │
  ├── Button "Auto Nông Trường" ──────────────────────────┐
  │                                                        │
  ├── Button "Auto Phụ Bản" ────────────────┐              │
  │                                         │              │
  ├── Button "Đóng" (Tắt popup)             │              │
  └── Button "[X]" (Góc phải header - Tắt)  │              │
                                            │              │
                                            ▼              ▼
                   [SCREEN_DUNGEON: Cụ thể phụ bản]   [SCREEN_FARM: Auto Nông Trường]
                     │                                  │
                     ├── Danh sách Phụ Bản:             ├── Button "Tự động trồng cây [BẬT/TẮT]"
                     │   ├── 1. Cấm địa Tuyệt tình cốc  ├── Button "Tự động thu hoạch [BẬT/TẮT]"
                     │   │      [Đơn giản][Cấp 15]      ├── Button "Quay lại" (Về Menu Auto)
                     │   ├── 2. Cấm địa Tuyệt tình cốc  └── Button "Đóng" (Tắt popup)
                     │   │      [Phổ thông][Cấp 20]
                     │   ├── 3. Cấm địa Tuyệt tình cốc
                     │   │      [Ác mộng][Cấp 30]
                     │   └── 4. Cấm địa Tuyệt tình cốc
                     │          [Tinh anh][Cấp 90]
                     │
                     ├── Button "START" / "STOP" (Bật/tắt chạy phụ bản đã chọn)
                     ├── Button "Đến" (Gửi packet tele thẳng tới cổng Tuyệt tình cốc)
                     ├── Button "Quay lại" (Về Menu Auto)
                     └── Button "Đóng" (Tắt popup)
```
