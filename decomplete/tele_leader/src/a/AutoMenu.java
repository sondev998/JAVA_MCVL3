package a;

import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/** In-game Canvas popup menu triggered by .auto chat command. */
public final class AutoMenu {
    public static boolean show = false;

    public static final int SCREEN_MAIN = 0;
    public static final int SCREEN_FARM = 1;
    public static final int SCREEN_DUNGEON = 2;
    public static int currentScreen = SCREEN_MAIN;

    // Feature toggle states
    public static boolean autoPlantEnabled = false;
    public static boolean autoHarvestEnabled = false;
    public static boolean isAutoPhuBan = false;
    public static int bossNum = 0; // 0: Boss 1, 1: Boss 2, 2: Boss 3, 3: NPC Dương Quá

    // 4 Phụ bản thực tế trong mã nguồn game (Cấm địa Tuyệt tình cốc)
    public static final String[] DUNGEON_LIST = {
        "C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [\u0110\u01a1n gi\u1ea3n ][2 Ng\u01b0\u1eddi][C\u1ea5p 15]",
        "C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [Ph\u1ed5 th\u00f4ng ][5Ng\u01b0\u1eddi][C\u1ea5p 20]",
        "C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [\u00c1c m\u1ed9ng ][9Ng\u01b0\u1eddi][C\u1ea5p 30]",
        "C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [Tinh anh ][2 Ng\u01b0\u1eddi][C\u1ea5p 90]"
    };

    public static final String[] DUNGEON_SHORT_LIST = {
        "1. Tuy\u1ec7t t\u00ecnh c\u1ed1c [\u0110\u01a1n gi\u1ea3n][C\u1ea5p 15]",
        "2. Tuy\u1ec7t t\u00ecnh c\u1ed1c [Ph\u1ed5 th\u00f4ng][C\u1ea5p 20]",
        "3. Tuy\u1ec7t t\u00ecnh c\u1ed1c [\u00c1c m\u1ed9ng][C\u1ea5p 30]",
        "4. Tuy\u1ec7t t\u00ecnh c\u1ed1c [Tinh anh][C\u1ea5p 90]"
    };

    public static int selectedDungeon = 0;

    /**
     * Chuẩn hóa chuỗi tiếng Việt (chuyển chữ thường, bỏ dấu) để so sánh tên quái/NPC chính xác.
     */
    public static String normalize(String s) {
        if (s == null) return "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            if (c == '\u00e0' || c == '\u00e1' || c == '\u1ea3' || c == '\u00e3' || c == '\u1ea1' ||
                c == '\u0103' || c == '\u1eb1' || c == '\u1eaf' || c == '\u1eb3' || c == '\u1eb5' || c == '\u1eb7' ||
                c == '\u00e2' || c == '\u1ea7' || c == '\u1ea5' || c == '\u1ea9' || c == '\u1eab' || c == '\u1ead') {
                c = 'a';
            } else if (c == '\u0111' || c == '\u0110') {
                c = 'd';
            } else if (c == '\u00e8' || c == '\u00e9' || c == '\u1ebb' || c == '\u1ebd' || c == '\u1eb9' ||
                       c == '\u00ea' || c == '\u1ec1' || c == '\u1ebf' || c == '\u1ec3' || c == '\u1ec5' || c == '\u1ec7') {
                c = 'e';
            } else if (c == '\u00ec' || c == '\u00ed' || c == '\u1ec9' || c == '\u0129' || c == '\u1ecb') {
                c = 'i';
            } else if (c == '\u00f2' || c == '\u00f3' || c == '\u1ecf' || c == '\u00f5' || c == '\u1ecd' ||
                       c == '\u00f4' || c == '\u1ed3' || c == '\u1ed1' || c == '\u1ed5' || c == '\u1ed7' || c == '\u1ed9' ||
                       c == '\u01a1' || c == '\u1edd' || c == '\u1edb' || c == '\u1edf' || c == '\u1ee1' || c == '\u1ee3') {
                c = 'o';
            } else if (c == '\u00f9' || c == '\u00fa' || c == '\u1ee7' || c == '\u0169' || c == '\u1ee5' ||
                       c == '\u01b0' || c == '\u1eeb' || c == '\u1ee9' || c == '\u1eed' || c == '\u1eef' || c == '\u1ef1') {
                c = 'u';
            } else if (c == '\u1ef3' || c == '\u00fd' || c == '\u1ef7' || c == '\u1ef9' || c == '\u1ef5') {
                c = 'y';
            }
            if (c >= '\u0300' && c <= '\u032f') {
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * Tìm kiếm thực thể (Boss hoặc NPC) trên map theo tên.
     * Quét cả 2 nguồn dữ liệu:
     * 1. ay.k: Các thực thể đang active xung quanh viewport
     * 2. ay.h: Bảng định nghĩa toàn bộ NPC / quái của toàn map
     * Trả về mảng {x, y, id} nếu tìm thấy, ngược lại trả về null.
     */
    public static int[] findEntityByName(String keyword) {
        String target = normalize(keyword);
        System.out.println("[AutoPB-Scan] >>> Searching keyword: '" + keyword + "' (norm: '" + target + "')");
        try {
            // 1. Quét ay.k (các thực thể xung quanh viewport)
            Vector list = MCT.getEntityList();
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    Object obj = list.elementAt(i);
                    if (obj != null) {
                        try {
                            String name = MCT.getEntityName(obj);
                            int x = MCT.getEntityX(obj);
                            int y = MCT.getEntityY(obj);
                            int id = MCT.getEntityId(obj);
                            String normName = normalize(name);
                            if (normName.indexOf(target) != -1) {
                                System.out.println("[AutoPB-Scan]   ===> MATCHED IN ay.k! Found: '" + name + "' at (" + x + "," + y + "), id=" + id);
                                return new int[]{x, y, id};
                            }
                        } catch (Throwable t) {}
                    }
                }
            }

            // 2. Quét ay.h (bảng định nghĩa toàn bộ NPC/quái của cả map)
            Vector npcs = MCT.getNpcTable();
            if (npcs != null) {
                for (int i = 0; i < npcs.size(); i++) {
                    Object item = npcs.elementAt(i);
                    if (item instanceof af[]) {
                        af[] arr = (af[]) item;
                        int id = arr.length > 0 && arr[0] != null ? arr[0].b() : -1;
                        int x = arr.length > 1 && arr[1] != null ? arr[1].b() : -1;
                        int y = arr.length > 2 && arr[2] != null ? arr[2].b() : -1;
                        String name = "";
                        StringBuffer arrContent = new StringBuffer();
                        for (int k = 0; k < arr.length; k++) {
                            if (arr[k] != null) {
                                String sVal = MCT.getAfString(arr[k]);
                                int iVal = arr[k].b();
                                arrContent.append("[").append(k).append(": '").append(sVal).append("'|").append(iVal).append("] ");
                                if (arr[k] instanceof j && (name == null || name.trim().length() == 0)) {
                                    name = sVal;
                                }
                            }
                        }
                        String normName = normalize(name);
                        System.out.println("[AutoPB-Scan]   ay.h[" + i + "]: name='" + name + "' (norm='" + normName + "') at (" + x + "," + y + "), id=" + id + " | content: " + arrContent.toString());
                        if (name.length() > 0 && normName.indexOf(target) != -1) {
                            System.out.println("[AutoPB-Scan]   ===> MATCHED IN ay.h! Found: '" + name + "' at (" + x + "," + y + "), id=" + id);
                            return new int[]{x, y, id};
                        }
                    }
                }
            }
        } catch (Throwable t) {
            System.out.println("[AutoPB-Scan] Exception in findEntityByName: " + t);
        }
        System.out.println("[AutoPB-Scan] ===> NOT FOUND: '" + keyword + "'");
        return null;
    }

    public static int[] findBoss1() {
        int[] pos = findEntityByName("phan nhat ong");
        if (pos != null) return pos;
        pos = findEntityByName("phan nhat");
        if (pos != null) return pos;
        pos = findEntityByName("nhat ong");
        if (pos != null) return pos;
        return null;
    }

    public static int[] findBoss2() {
        int[] pos = findEntityByName("thien xich");
        if (pos != null) return pos;
        pos = findEntityByName("cau thien");
        if (pos != null) return pos;
        pos = findEntityByName("cuu thien");
        if (pos != null) return pos;
        pos = findEntityByName("thien chi");
        if (pos != null) return pos;
        return null;
    }

    public static int[] findBoss3() {
        int[] pos = findEntityByName("cong ton chi");
        if (pos != null) return pos;
        pos = findEntityByName("cong ton");
        if (pos != null) return pos;
        return null;
    }

    public static int[] findNpcDuongQua() {
        int[] pos = findEntityByName("duong qua");
        if (pos != null) return pos;
        return null;
    }

    /**
     * Chuyển nhân vật đến ngay map cổng phụ bản Tuyệt tình cốc.
     */
    public static void teleToTTC() {
        System.out.println("[AutoPB] teleToTTC called!");
        try {
            MCT.tele();
        } catch (Throwable t) {
            System.out.println("[AutoPB] teleToTTC error: " + t);
        }
        try {
            f.a(21);
        } catch (Throwable t) {}
        try {
            f.a(22);
        } catch (Throwable t) {}
        try {
            f.a(20);
        } catch (Throwable t) {}
    }

    /**
     * Tự động tìm kiếm Boss hoặc NPC tương ứng theo tên trên map để di chuyển tới.
     * Target 0: Boss 1 ("Phàn nhất ông")
     * Target 1: Boss 2 ("Cầu thiên xích / chỉ")
     * Target 2: Boss 3 ("Công tôn chỉ")
     * Target 3: NPC "Dương Quá" -> Tiếp cận và kích hoạt hội thoại
     */
    public static void moveToTarget(int targetIndex) {
        System.out.println("[AutoPB-Move] moveToTarget: index=" + targetIndex + " (0=Phàn nhất ông, 1=Cầu/Cừu thiên xích/chỉ, 2=Công tôn chỉ, 3=Dương Quá)");
        try {
            if (targetIndex == 0) {
                // Boss 1: Phàn nhất ông
                int[] pos = findBoss1();
                if (pos != null) {
                    System.out.println("[AutoPB-Move] Moving to Boss 1 (dynamic): (" + pos[0] + ", " + pos[1] + "), id=" + pos[2]);
                    MCT.moveTo(pos[0], pos[1]);
                } else {
                    System.out.println("[AutoPB-Move] Boss 1 not found in scan! Moving to fallback (11, 16)");
                    MCT.moveTo(11, 16);
                }
                MCT.setAutoFight(true);
            } else if (targetIndex == 1) {
                // Boss 2: Cầu/Cừu thiên xích / Cầu thiên chỉ
                int[] pos = findBoss2();
                if (pos != null) {
                    System.out.println("[AutoPB-Move] Moving to Boss 2 (dynamic): (" + pos[0] + ", " + pos[1] + "), id=" + pos[2]);
                    MCT.moveTo(pos[0], pos[1]);
                } else {
                    System.out.println("[AutoPB-Move] Boss 2 not found in scan!");
                }
                MCT.setAutoFight(true);
            } else if (targetIndex == 2) {
                // Boss 3: Công tôn chỉ
                int[] pos = findBoss3();
                if (pos != null) {
                    System.out.println("[AutoPB-Move] Moving to Boss 3 (dynamic): (" + pos[0] + ", " + pos[1] + "), id=" + pos[2]);
                    MCT.moveTo(pos[0], pos[1]);
                } else {
                    System.out.println("[AutoPB-Move] Boss 3 not found in scan!");
                }
                MCT.setAutoFight(true);
            } else if (targetIndex == 3) {
                // NPC: Dương Quá
                MCT.setAutoFight(false);
                int[] pos = findNpcDuongQua();
                if (pos != null) {
                    System.out.println("[AutoPB-Move] Moving to NPC Dương Quá: (" + pos[0] + ", " + pos[1] + "), id=" + pos[2]);
                    MCT.moveTo(pos[0], pos[1]);
                    System.out.println("[AutoPB-Move] Sending talk packet to Dương Quá id=" + pos[2]);
                    MCT.talkNpc(pos[2]);
                } else {
                    System.out.println("[AutoPB-Move] NPC Dương Quá not found in scan!");
                }
            }
        } catch (Throwable t) {
            System.out.println("[AutoPB-Move] Exception in moveToTarget: " + t);
        }
    }

    /**
     * Nhận event chuỗi text từ server (được tiêm tự động vào a.z method a(I)Ljava/lang/String;).
     * Phát hiện khi nhận "Giang hồ lệnh bài" để tìm và chuyển sang Boss/NPC tiếp theo.
     */
    public static void onServerMessage(String msg) {
        if (msg == null) return;
        String norm = normalize(msg);
        System.out.println("[AutoPB-Msg] raw: '" + msg + "' | norm: '" + norm + "' | isAutoPhuBan=" + isAutoPhuBan + " | bossNum=" + bossNum);

        if (!isAutoPhuBan) return;

        // Kiểm tra nhận được Giang Hồ Lệnh Bài
        boolean hasNhanDuoc = norm.indexOf("nhan duoc") != -1 || norm.startsWith("ban nhan");
        boolean hasLenhBai = norm.indexOf("giang ho lenh bai") != -1 || (norm.indexOf("giang ho") != -1 && norm.indexOf("lenh bai") != -1);

        if (hasNhanDuoc && hasLenhBai) {
            System.out.println("[AutoPB-Msg] >>> DETECTED Giang Ho Lenh Bai! Current bossNum=" + bossNum);
            if (bossNum == 0) {
                bossNum = 1;
                System.out.println("[AutoPB-Msg] >>> Advancing to Boss 2 (Cầu/Cừu thiên xích)...");
                moveToTarget(1);
            } else if (bossNum == 1) {
                bossNum = 2;
                System.out.println("[AutoPB-Msg] >>> Advancing to Boss 3 (Công tôn chỉ)...");
                moveToTarget(2);
            } else if (bossNum == 2) {
                bossNum = 3;
                System.out.println("[AutoPB-Msg] >>> Killed 3 Bosses! Advancing to NPC Dương Quá...");
                moveToTarget(3);
            }
        } else if (bossNum == 3) {
            // Khi đang ở trạng thái tương tác với Dương Quá, nếu có tùy chọn rời khỏi
            if (norm.indexOf("roi khoi") != -1 || norm.indexOf("dua ta roi khoi noi nay") != -1) {
                System.out.println("[AutoPB-Msg] >>> Detected Exit Dungeon option! Resetting auto state.");
                isAutoPhuBan = false;
                bossNum = 0;
            }
        } else if (norm.indexOf("noi nay khong nen o lai lau") != -1 || norm.indexOf("phan thuong qua ai") != -1) {
            System.out.println("[AutoPB-Msg] >>> Dungeon complete notification received. Resetting auto state.");
            isAutoPhuBan = false;
            bossNum = 0;
        }
    }

    /**
     * Kích hoạt mở Popup Auto khi bấm "Gửi" tin nhắn trống (hoặc nhập lệnh .auto).
     */
    public static boolean checkCommand(String input) {
        System.out.println("[AutoMenu] checkCommand input: '" + input + "'");
        // Mở popup khi tin nhắn trống hoặc gõ .auto
        if (input == null || input.trim().length() == 0 || ".auto".equalsIgnoreCase(input.trim())) {
            show = true;
            currentScreen = SCREEN_MAIN;
            System.out.println("[AutoMenu] Open popup by empty chat send or .auto command!");
            // Đóng các hộp thoại chat trong game
            try {
                f.a(21);
            } catch (Throwable t) {}
            try {
                f.a(22);
            } catch (Throwable t) {}
            try {
                f.a(20);
            } catch (Throwable t) {}
            return true;
        }
        return false;
    }

    public static void setVisible(boolean visible) {
        show = visible;
        if (visible) {
            currentScreen = SCREEN_MAIN;
        }
    }

    public static int getScreenWidth() {
        try {
            ac canvas = ac.a();
            if (canvas != null) {
                int w = canvas.getWidth();
                if (w > 0) return w;
            }
        } catch (Throwable t) {}
        return 240;
    }

    public static int getScreenHeight() {
        try {
            ac canvas = ac.a();
            if (canvas != null) {
                int h = canvas.getHeight();
                if (h > 0) return h;
            }
        } catch (Throwable t) {}
        return 320;
    }

    public static int getWidth() {
        int screenW = getScreenWidth();
        int w = (screenW * 90) / 100;
        if (w < 200) w = Math.min(200, screenW);
        if (w > 270) w = 270;
        return w;
    }

    public static int getHeight() {
        int screenH = getScreenHeight();
        int h = (screenH * 72) / 100;
        if (h < 190) h = Math.min(190, screenH);
        if (h > 250) h = 250;
        return h;
    }

    public static int getX() {
        return (getScreenWidth() - getWidth()) / 2;
    }

    public static int getY() {
        return (getScreenHeight() - getHeight()) / 2;
    }

    private static void drawButton(Graphics g, Font font, String text, int bx, int by, int bw, int bh, int bgColor, int borderColor, int textColor) {
        g.setColor(bgColor);
        g.fillRect(bx, by, bw, bh);
        g.setColor(borderColor);
        g.drawRect(bx, by, bw - 1, bh - 1);
        g.setColor(textColor);
        int textW = font.stringWidth(text);
        int textY = by + (bh - font.getHeight()) / 2;
        g.drawString(text, bx + (bw - textW) / 2, textY, Graphics.TOP | Graphics.LEFT);
    }

    public static void paint(Graphics g) {
        if (!show || g == null) return;

        int screenW = getScreenWidth();
        int screenH = getScreenHeight();
        int w = getWidth();
        int h = getHeight();
        int x = getX();
        int y = getY();

        int clipX = g.getClipX();
        int clipY = g.getClipY();
        int clipW = g.getClipWidth();
        int clipH = g.getClipHeight();
        g.setClip(0, 0, screenW, screenH);

        Font oldFont = g.getFont();
        Font font = oldFont != null ? oldFont : Font.getDefaultFont();
        g.setFont(font);

        // Outer border (Golden border)
        g.setColor(0xE5A93C);
        g.fillRect(x - 2, y - 2, w + 4, h + 4);

        // Inner dark border
        g.setColor(0x3B2D1D);
        g.fillRect(x - 1, y - 1, w + 2, h + 2);

        // Background panel (Dark theme)
        g.setColor(0x1B1B22);
        g.fillRect(x, y, w, h);

        // Header bar
        int headerH = 22;
        g.setColor(0x2D2214);
        g.fillRect(x, y, w, headerH);
        g.setColor(0xE5A93C);
        g.drawLine(x, y + headerH, x + w - 1, y + headerH);

        // Title text
        String title;
        if (currentScreen == SCREEN_FARM) {
            title = "Auto N\u00f4ng Tr\u01b0\u1eddng";
        } else if (currentScreen == SCREEN_DUNGEON) {
            title = "C\u1ee5 th\u1ec3 ph\u1ee5 b\u1ea3n";
        } else {
            title = "Menu Auto";
        }
        g.setColor(0xFFF799);
        int titleW = font.stringWidth(title);
        int titleY = y + (headerH - font.getHeight()) / 2;
        if (titleY < y + 1) titleY = y + 1;
        g.drawString(title, x + (w - titleW) / 2, titleY, Graphics.TOP | Graphics.LEFT);

        // [X] Close button
        int closeW = 16;
        int closeH = headerH - 4;
        if (closeH < 12) closeH = 12;
        int closeX = x + w - closeW - 3;
        int closeY = y + 2;
        g.setColor(0x9E2A2B);
        g.fillRect(closeX, closeY, closeW, closeH);
        g.setColor(0xFFD700);
        g.drawRect(closeX, closeY, closeW - 1, closeH - 1);
        g.setColor(0xFFFFFF);
        int xCharW = font.stringWidth("X");
        g.drawString("X", closeX + (closeW - xCharW) / 2, closeY + (closeH - font.getHeight()) / 2, Graphics.TOP | Graphics.LEFT);

        int contentTop = y + headerH + 6;
        int btnW = w - 18;
        int btnH = 22;
        int btnX = x + 9;

        if (currentScreen == SCREEN_MAIN) {
            // Button 1: Auto Nông Trường
            int btnFarmY = contentTop + 8;
            drawButton(g, font, "Auto N\u00f4ng Tr\u01b0\u1eddng", btnX, btnFarmY, btnW, btnH, 0x3B2D1D, 0xE5A93C, 0xFFF799);

            // Button 2: Auto Phụ Bản
            int btnDungeonY = btnFarmY + btnH + 8;
            String dBtnText = isAutoPhuBan ? "Auto Ph\u1ee5 B\u1ea3n [B\u1eacT]" : "Auto Ph\u1ee5 B\u1ea3n";
            int dBtnBg = isAutoPhuBan ? 0x1E4A28 : 0x3B2D1D;
            int dBtnBorder = isAutoPhuBan ? 0x4E9F3D : 0xE5A93C;
            int dBtnTextColor = isAutoPhuBan ? 0xD8E9A8 : 0xFFF799;
            drawButton(g, font, dBtnText, btnX, btnDungeonY, btnW, btnH, dBtnBg, dBtnBorder, dBtnTextColor);

            // Bottom [Dong] button
            int closeBtnW = Math.min(70, w - 30);
            int closeBtnH = 20;
            int closeBtnX = x + (w - closeBtnW) / 2;
            int closeBtnY = y + h - closeBtnH - 6;
            drawButton(g, font, "\u0110\u00f3ng", closeBtnX, closeBtnY, closeBtnW, closeBtnH, 0x4A3728, 0xE5A93C, 0xFFF799);

        } else if (currentScreen == SCREEN_FARM) {
            // Button: Tự động trồng cây
            int btnPlantY = contentTop + 6;
            String plantText = "T\u1ef1 \u0111\u1ed9ng tr\u1ed3ng c\u00e2y" + (autoPlantEnabled ? " [B\u1eacT]" : " [T\u1eaeT]");
            int plantBg = autoPlantEnabled ? 0x1E4A28 : 0x3B2D1D;
            int plantBorder = autoPlantEnabled ? 0x4E9F3D : 0xE5A93C;
            int plantTextColor = autoPlantEnabled ? 0xD8E9A8 : 0xFFF799;
            drawButton(g, font, plantText, btnX, btnPlantY, btnW, btnH, plantBg, plantBorder, plantTextColor);

            // Button: Tự động thu hoạch
            int btnHarvestY = btnPlantY + btnH + 8;
            String harvestText = "T\u1ef1 \u0111\u1ed9ng thu ho\u1ea1ch" + (autoHarvestEnabled ? " [B\u1eacT]" : " [T\u1eaeT]");
            int harvestBg = autoHarvestEnabled ? 0x1E4A28 : 0x3B2D1D;
            int harvestBorder = autoHarvestEnabled ? 0x4E9F3D : 0xE5A93C;
            int harvestTextColor = autoHarvestEnabled ? 0xD8E9A8 : 0xFFF799;
            drawButton(g, font, harvestText, btnX, btnHarvestY, btnW, btnH, harvestBg, harvestBorder, harvestTextColor);

            // Bottom [Quay lai] button
            int backBtnW = Math.min(70, (w - 30) / 2);
            int backBtnH = 20;
            int backBtnX = x + 9;
            int backBtnY = y + h - backBtnH - 6;
            drawButton(g, font, "Quay l\u1ea1i", backBtnX, backBtnY, backBtnW, backBtnH, 0x3B2D1D, 0xE5A93C, 0xFFF799);

            // Bottom [Dong] button
            int closeBtnW = Math.min(70, (w - 30) / 2);
            int closeBtnH = 20;
            int closeBtnX = x + w - closeBtnW - 9;
            int closeBtnY = y + h - closeBtnH - 6;
            drawButton(g, font, "\u0110\u00f3ng", closeBtnX, closeBtnY, closeBtnW, closeBtnH, 0x4A3728, 0xE5A93C, 0xFFF799);

        } else if (currentScreen == SCREEN_DUNGEON) {
            // Render 4 Dungeons of Cấm địa Tuyệt tình cốc
            int itemH = 20;
            int itemGap = 3;
            int listStartY = contentTop + 2;

            for (int i = 0; i < DUNGEON_LIST.length; i++) {
                int itemY = listStartY + i * (itemH + itemGap);
                boolean isSelected = (i == selectedDungeon);

                int itemBg = isSelected ? 0x24422B : 0x2A2016;
                int itemBorder = isSelected ? 0xFFD700 : 0x5C462C;
                int itemTextColor = isSelected ? 0xFFF799 : 0xDDD0B8;

                String dName;
                if (font.stringWidth(DUNGEON_LIST[i]) <= btnW - 6) {
                    dName = DUNGEON_LIST[i];
                } else {
                    dName = DUNGEON_SHORT_LIST[i];
                }

                if (isSelected && isAutoPhuBan) {
                    dName = dName + " *";
                }

                drawButton(g, font, dName, btnX, itemY, btnW, itemH, itemBg, itemBorder, itemTextColor);
            }

            // Row 1: [START / STOP] and [Đến]
            int actBtnH = 19;
            int actBtnY = y + h - 45;
            int actBtnW = (w - 26) / 2;

            int startBtnX = x + 9;
            String startText = isAutoPhuBan ? "STOP" : "START";
            int startBg = isAutoPhuBan ? 0x8B0000 : 0x1E4A28;
            int startBorder = isAutoPhuBan ? 0xFF4D4D : 0x4E9F3D;
            int startTextColor = isAutoPhuBan ? 0xFFFFFF : 0xD8E9A8;
            drawButton(g, font, startText, startBtnX, actBtnY, actBtnW, actBtnH, startBg, startBorder, startTextColor);

            int teleBtnX = startBtnX + actBtnW + 8;
            String teleText = "\u0110\u1ebfn";
            int teleBg = 0x1C3144;
            int teleBorder = 0x3F88C5;
            int teleTextColor = 0xE0F0FF;
            drawButton(g, font, teleText, teleBtnX, actBtnY, actBtnW, actBtnH, teleBg, teleBorder, teleTextColor);

            // Row 2: [Quay lại] and [Đóng]
            int navBtnH = 18;
            int navBtnY = y + h - 22;
            int navBtnW = (w - 26) / 2;

            int backBtnX = x + 9;
            drawButton(g, font, "Quay l\u1ea1i", backBtnX, navBtnY, navBtnW, navBtnH, 0x3B2D1D, 0xE5A93C, 0xFFF799);

            int closeBtnX = backBtnX + navBtnW + 8;
            drawButton(g, font, "\u0110\u00f3ng", closeBtnX, navBtnY, navBtnW, navBtnH, 0x4A3728, 0xE5A93C, 0xFFF799);
        }

        g.setFont(oldFont);
        g.setClip(clipX, clipY, clipW, clipH);
    }

    public static boolean pointerPressed(int px, int py) {
        if (!show) return false;
        return true;
    }

    public static boolean pointerReleased(int px, int py) {
        if (!show) return false;

        int w = getWidth();
        int h = getHeight();
        int x = getX();
        int y = getY();

        int headerH = 22;

        // [X] button
        int closeW = 16;
        int closeH = headerH - 4;
        if (closeH < 12) closeH = 12;
        int closeX = x + w - closeW - 3;
        int closeY = y + 2;
        if (px >= closeX - 4 && px <= closeX + closeW + 4 && py >= closeY - 4 && py <= closeY + closeH + 4) {
            show = false;
            return true;
        }

        // Click outside popup
        if (px < x || px > x + w || py < y || py > y + h) {
            show = false;
            return true;
        }

        int contentTop = y + headerH + 6;
        int btnW = w - 18;
        int btnH = 22;
        int btnX = x + 9;

        if (currentScreen == SCREEN_MAIN) {
            // Click "Auto Nông Trường" button
            int btnFarmY = contentTop + 8;
            if (px >= btnX && px <= btnX + btnW && py >= btnFarmY && py <= btnFarmY + btnH) {
                currentScreen = SCREEN_FARM;
                return true;
            }

            // Click "Auto Phụ Bản" button
            int btnDungeonY = btnFarmY + btnH + 8;
            if (px >= btnX && px <= btnX + btnW && py >= btnDungeonY && py <= btnDungeonY + btnH) {
                currentScreen = SCREEN_DUNGEON;
                return true;
            }

            // Click [Dong] button
            int closeBtnW = Math.min(70, w - 30);
            int closeBtnH = 20;
            int closeBtnX = x + (w - closeBtnW) / 2;
            int closeBtnY = y + h - closeBtnH - 6;
            if (px >= closeBtnX - 2 && px <= closeBtnX + closeBtnW + 2 && py >= closeBtnY - 2 && py <= closeBtnY + closeBtnH + 2) {
                show = false;
                return true;
            }

        } else if (currentScreen == SCREEN_FARM) {
            // Click "Tự động trồng cây" button
            int btnPlantY = contentTop + 6;
            if (px >= btnX && px <= btnX + btnW && py >= btnPlantY && py <= btnPlantY + btnH) {
                autoPlantEnabled = !autoPlantEnabled;
                return true;
            }

            // Click "Tự động thu hoạch" button
            int btnHarvestY = btnPlantY + btnH + 8;
            if (px >= btnX && px <= btnX + btnW && py >= btnHarvestY && py <= btnHarvestY + btnH) {
                autoHarvestEnabled = !autoHarvestEnabled;
                return true;
            }

            // Click [Quay lai] button
            int backBtnW = Math.min(70, (w - 30) / 2);
            int backBtnH = 20;
            int backBtnX = x + 9;
            int backBtnY = y + h - backBtnH - 6;
            if (px >= backBtnX - 2 && px <= backBtnX + backBtnW + 2 && py >= backBtnY - 2 && py <= backBtnY + backBtnH + 2) {
                currentScreen = SCREEN_MAIN;
                return true;
            }

            // Click [Dong] button
            int closeBtnW = Math.min(70, (w - 30) / 2);
            int closeBtnH = 20;
            int closeBtnX = x + w - closeBtnW - 9;
            int closeBtnY = y + h - closeBtnH - 6;
            if (px >= closeBtnX - 2 && px <= closeBtnX + closeBtnW + 2 && py >= closeBtnY - 2 && py <= closeBtnY + closeBtnH + 2) {
                show = false;
                return true;
            }

        } else if (currentScreen == SCREEN_DUNGEON) {
            int itemH = 20;
            int itemGap = 3;
            int listStartY = contentTop + 2;

            // Click on Dungeon Items
            for (int i = 0; i < DUNGEON_LIST.length; i++) {
                int itemY = listStartY + i * (itemH + itemGap);
                if (px >= btnX && px <= btnX + btnW && py >= itemY && py <= itemY + itemH) {
                    selectedDungeon = i;
                    System.out.println("[AutoMenu] Selected dungeon index: " + i);
                    return true;
                }
            }

            // Row 1: [START] & [Đến]
            int actBtnH = 19;
            int actBtnY = y + h - 45;
            int actBtnW = (w - 26) / 2;

            int startBtnX = x + 9;
            // Click [START / STOP]
            if (px >= startBtnX - 2 && px <= startBtnX + actBtnW + 2 && py >= actBtnY - 2 && py <= actBtnY + actBtnH + 2) {
                if (!isAutoPhuBan) {
                    isAutoPhuBan = true;
                    bossNum = 0;
                    System.out.println("[AutoMenu] START clicked! Setting isAutoPhuBan=true, bossNum=0");
                    moveToTarget(0); // Bắt đầu tìm và đánh Boss 1: Phàn nhất ông
                } else {
                    isAutoPhuBan = false;
                    bossNum = 0;
                    System.out.println("[AutoMenu] STOP clicked! Setting isAutoPhuBan=false, bossNum=0");
                    try {
                        MCT.setAutoFight(false);
                    } catch (Throwable t) {}
                }
                return true;
            }

            int teleBtnX = startBtnX + actBtnW + 8;
            // Click [Đến]
            if (px >= teleBtnX - 2 && px <= teleBtnX + actBtnW + 2 && py >= actBtnY - 2 && py <= actBtnY + actBtnH + 2) {
                System.out.println("[AutoMenu] 'Đến' clicked! Teleporting to TTC...");
                teleToTTC();
                show = false;
                return true;
            }

            // Row 2: [Quay lại] & [Đóng]
            int navBtnH = 18;
            int navBtnY = y + h - 22;
            int navBtnW = (w - 26) / 2;

            int backBtnX = x + 9;
            // Click [Quay lại]
            if (px >= backBtnX - 2 && px <= backBtnX + navBtnW + 2 && py >= navBtnY - 2 && py <= navBtnY + navBtnH + 2) {
                currentScreen = SCREEN_MAIN;
                return true;
            }

            int closeBtnX = backBtnX + navBtnW + 8;
            // Click [Đóng]
            if (px >= closeBtnX - 2 && px <= closeBtnX + navBtnW + 2 && py >= navBtnY - 2 && py <= navBtnY + navBtnH + 2) {
                show = false;
                return true;
            }
        }

        return true;
    }

    public static boolean keyPressed(int keyCode) {
        if (!show) return false;
        if (currentScreen != SCREEN_MAIN) {
            currentScreen = SCREEN_MAIN;
        } else {
            show = false;
        }
        return true;
    }
}
