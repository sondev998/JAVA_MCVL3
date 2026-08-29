package a;

import a.work.main.MyMidlet;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.TextBox;

/** In-game Canvas popup menu triggered by floating Auto button or .auto chat command. */
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
    public static boolean autoFightEnabled = true; // Bật/tắt Auto Đánh độc lập
    public static int bossNum = 0; // 0: Boss 1, 1: Boss 2, 2: Boss 3, 3: Completed / Exit
    public static int dungeonRunCount = 0; // Đếm số lượt đã đi

    // Exit NPC hook (Lục Thừa Phong / Dương Quá) từ ghlb.jar bk.java
    public static int savedExitNpcId = 8;
    public static byte exitNpcB1 = 8;
    public static byte exitNpcB2 = 0;
    public static byte exitNpcB3 = 0;

    public static void setExitNpcId(int id) {
        savedExitNpcId = id;
        exitNpcB1 = (byte)(id & 0xFF);
        exitNpcB2 = (byte)((id >> 8) & 0xFF);
        exitNpcB3 = (byte)((id >> 16) & 0xFF);
        System.out.println("[AutoPB-Hook] Captured Exit NPC ID: " + id + " (bytes=" + exitNpcB3 + "," + exitNpcB2 + "," + exitNpcB1 + ")");
    }

    // Tốc độ game (Speed hack từ ghlb.jar): 1x (mặc định), 2x, 5x, 10x
    public static int speedMultiplier = 1;
    public static final int[] SPEED_LEVELS = {1, 2, 5, 10};
    public static int speedIndex = 0;

    // Cài đặt combo chiêu đánh (Skill combo từ ghlb.jar)
    public static String skillString = "1,2,3,4,5,6,7,8";
    public static int[] parsedSkills = {49, 50, 51, 52, 53, 54, 55, 56};
    public static int skillDelay = 200; // ms giữa các chiêu
    private static Thread autoSkillThread;

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
     * Parse chuỗi cài đặt chiêu đánh thành mảng keycodes.
     */
    public static void parseSkills(String input) {
        if (input == null || input.trim().length() == 0) {
            parsedSkills = new int[]{49, 50, 51, 52, 53, 54, 55, 56};
            return;
        }
        try {
            Vector list = new Vector();
            int start = 0;
            for (int i = 0; i <= input.length(); i++) {
                if (i == input.length() || input.charAt(i) == ',' || input.charAt(i) == ' ' || input.charAt(i) == ';') {
                    if (i > start) {
                        String token = input.substring(start, i).trim();
                        if (token.length() > 0) {
                            int colonIdx = token.indexOf(':');
                            if (colonIdx != -1) {
                                token = token.substring(0, colonIdx).trim();
                            }
                            try {
                                int val = Integer.parseInt(token);
                                if (val >= 1 && val <= 9) {
                                    val = 48 + val; // '1' -> 49, '2' -> 50...
                                } else if (val == 0) {
                                    val = 48; // '0' -> 48
                                }
                                list.addElement(new Integer(val));
                            } catch (Throwable t) {}
                        }
                    }
                    start = i + 1;
                }
            }
            if (list.size() > 0) {
                parsedSkills = new int[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    parsedSkills[i] = ((Integer) list.elementAt(i)).intValue();
                }
            }
        } catch (Throwable t) {
            System.out.println("[AutoSkill] parseSkills error: " + t);
        }
    }

    /**
     * Thực thi bấm phím chiêu đánh trên game canvas.
     */
    public static void castSkill(int keyCode) {
        try {
            ac canvas = ac.a();
            if (canvas != null) {
                canvas.leyPressed(keyCode);
                canvas.leyReleased(keyCode);
            }
        } catch (Throwable t) {}
    }

    /**
     * Khởi động vòng lặp tự động xuất chiêu theo danh sách combo đã cài đặt.
     */
    public static void startAutoSkillLoop() {
        if (!autoFightEnabled) return;
        if (autoSkillThread != null && autoSkillThread.isAlive()) return;
        autoSkillThread = new Thread(new Runnable() {
            public void run() {
                int idx = 0;
                while (isAutoPhuBan && autoFightEnabled) {
                    try {
                        if (parsedSkills != null && parsedSkills.length > 0) {
                            int key = parsedSkills[idx % parsedSkills.length];
                            castSkill(key);
                            idx++;
                        }
                        long d = (long) skillDelay;
                        if (speedMultiplier > 1) {
                            d = d / speedMultiplier;
                            if (d < 50L) d = 50L;
                        }
                        Thread.sleep(d);
                    } catch (Throwable t) {}
                }
            }
        });
        autoSkillThread.start();
    }

    /**
     * Mở hộp thoại TextBox nhập/chỉnh sửa chuỗi chiêu đánh.
     */
    public static void openSkillInput() {
        try {
            final TextBox tb = new TextBox("Chi\u00eau \u0111\u00e1nh (1-8):", skillString, 500, 0);
            final Command cmdSave = new Command("L\u01b0u", Command.OK, 1);
            final Command cmdCancel = new Command("H\u1ee7y", Command.CANCEL, 2);
            tb.addCommand(cmdSave);
            tb.addCommand(cmdCancel);
            tb.setCommandListener(new CommandListener() {
                public void commandAction(Command c, Displayable d) {
                    if (c == cmdSave) {
                        skillString = tb.getString();
                        parseSkills(skillString);
                        System.out.println("[AutoSkill] Saved skill sequence: " + skillString);
                    }
                    try {
                        MyMidlet.setDisplayable(ac.a());
                    } catch (Throwable t) {}
                }
            });
            MyMidlet.setDisplayable(tb);
        } catch (Throwable t) {
            System.out.println("[AutoSkill] openSkillInput error: " + t);
        }
    }

    /**
     * Hàm điều chỉnh thời gian Thread.sleep() trong vòng lặp game chính (ac.java).
     */
    public static long getModifiedSleep(long originalSleep) {
        if (originalSleep <= 0L) return 0L;
        if (speedMultiplier <= 1) return originalSleep;
        long mod = originalSleep / speedMultiplier;
        return mod > 0L ? mod : 1L;
    }

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
     * Tìm kiếm thực thể (Boss hoặc NPC) trên map hiện tại theo tên (chỉ quét ay.k các thực thể thực tế trên viewport).
     * Trả về mảng {x, y, id} nếu tìm thấy, ngược lại trả về null.
     */
    public static int[] findEntityByName(String keyword) {
        String target = normalize(keyword);
        try {
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
                            if (name != null && name.length() > 0 && normName.indexOf(target) != -1) {
                                System.out.println("[AutoPB-Scan] Found active entity in viewport: '" + name + "' at (" + x + "," + y + "), id=" + id);
                                if (normName.indexOf("duong qua") != -1 || normName.indexOf("luc thua phong") != -1 || normName.indexOf("thua phong") != -1) {
                                    setExitNpcId(id);
                                }
                                return new int[]{x, y, id};
                            }
                        } catch (Throwable t) {}
                    }
                }
            }
        } catch (Throwable t) {
            System.out.println("[AutoPB-Scan] Exception in findEntityByName: " + t);
        }
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
        pos = findEntityByName("luc thua phong");
        if (pos != null) return pos;
        pos = findEntityByName("thua phong");
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
     * Khởi động Auto vào phụ bản theo chuẩn 100% của ghlb.jar (MoveAuto6):
     * Chỉ di chuyển tới tọa độ cổng (62, 8). Không gửi spam packet, không retry.
     */
    public static void enterDungeonByLevel(final int level) {
        System.out.println("[AutoPB] >>> Entering TTC dungeon level " + level + " (ghlb logic)...");
        try {
            // TẮT hoàn toàn auto đánh
            MCT.setAutoFight(false);

            // Di chuyển tới đúng vị trí cổng phụ bản (62, 8) như MoveAuto6 trong ghlb.jar
            MCT.moveTo(62, 8);

            bossNum = 0;
            dungeonRunCount++;
            System.out.println("[AutoPB] >>> Run count: " + dungeonRunCount + ". Moving to (62, 8)...");

            // Lắng nghe khi vào trong map phụ bản -> Bắt đầu đi tìm Boss 1
            new Thread(new Runnable() {
                public void run() {
                    try {
                        long startWait = System.currentTimeMillis();
                        while (isAutoPhuBan && (System.currentTimeMillis() - startWait < 45000)) {
                            Thread.sleep(500);
                            int myX = MCT.getMyX();
                            int myY = MCT.getMyY();

                            // Nhận diện đã vào map phụ bản (tọa độ khác cổng ngoài 62, 8) hoặc thấy Boss 1
                            boolean isInside = (myX > 0 && myY > 0 && (Math.abs(myX - 62) > 6 || Math.abs(myY - 8) > 6)) || findBoss1() != null;
                            if (isInside) {
                                System.out.println("[AutoPB] Confirmed inside dungeon! Pos=(" + myX + "," + myY + "). Moving to search Boss 1...");
                                moveToTarget(0);
                                return;
                            }
                        }
                    } catch (Throwable t) {}
                }
            }).start();
        } catch (Throwable t) {
            System.out.println("[AutoPB] enterDungeonByLevel error: " + t);
        }
    }

    /**
     * Gửi packet rời phụ bản lập tức sau khi đánh xong Boss 3 (từ ghlb.jar).
     */
    public static void exitDungeon() {
        System.out.println("[AutoPB] >>> Exiting dungeon using packets (ghlb logic)...");
        try {
            MCT.setAutoFight(false);
            byte b1 = exitNpcB1;
            byte b2 = exitNpcB2;
            byte b3 = exitNpcB3;

            int[] npcPos = findNpcDuongQua();
            if (npcPos != null && npcPos[2] > 0) {
                int duongQuaId = npcPos[2];
                b1 = (byte)(duongQuaId & 0xFF);
                b2 = (byte)((duongQuaId >> 8) & 0xFF);
                b3 = (byte)((duongQuaId >> 16) & 0xFF);
            }

            byte[] packet1 = new byte[]{7, (byte)239, 4, 0, b3, b2, b1, 4, 0, 0, 0, 0, 3, 0, 51, 3, 0, 8, 3, 0, 0, 3, 0, 0};
            byte[] packet2 = new byte[]{7, (byte)-16, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 3, 0, 0, 2, 1, 2, 101, 6, 0, 0};

            MCT.sendBytes(packet1);
            MCT.sendBytes(packet2);
            bossNum = 3;
        } catch (Throwable t) {
            System.out.println("[AutoPB] exitDungeon error: " + t);
        }
    }

    /**
     * Tự động giải Captcha toán chống bot từ server (Logic chuẩn từ ghlb.jar z.java).
     */
    public static void solveCaptcha(String msg) {
        try {
            System.out.println("[AutoCaptcha] Processing server captcha: " + msg);
            int idx = msg.indexOf("Chu\u1ed1i s\u1ed1\uff1a");
            if (idx == -1) idx = msg.indexOf("Chuoi so:");
            if (idx == -1) idx = msg.indexOf("Chu\u1ed1i s\u1ed1:");

            if (msg.length() > 50 && (msg.indexOf("ph\u00e9p nh\u00e2n") != -1 || msg.indexOf("ph\u00e9p c\u1ed9ng") != -1 || msg.indexOf("nhan") != -1 || msg.indexOf("cong") != -1)) {
                String digits = "";
                for (int i = 0; i <= msg.length() - 8; i++) {
                    boolean allDigits = true;
                    for (int j = 0; j < 8; j++) {
                        char c = msg.charAt(i + j);
                        if (c < '0' || c > '9') { allDigits = false; break; }
                    }
                    if (allDigits) {
                        digits = msg.substring(i, i + 8);
                        break;
                    }
                }

                if (digits.length() == 8) {
                    int num1 = -1;
                    int num2 = -1;
                    for (int i = 0; i < msg.length(); i++) {
                        char c = msg.charAt(i);
                        if (c >= '1' && c <= '8') {
                            int val = c - '0';
                            if (num1 == -1) {
                                num1 = val;
                            } else if (num2 == -1 && i > 30) {
                                num2 = val;
                                break;
                            }
                        }
                    }

                    if (num1 >= 1 && num1 <= 8 && num2 >= 1 && num2 <= 8) {
                        int v1 = digits.charAt(num1 - 1) - '0';
                        int v2 = digits.charAt(num2 - 1) - '0';
                        int result;
                        if (msg.indexOf("nh\u00e2n") != -1 || msg.indexOf("nhan") != -1) {
                            result = v1 * v2;
                        } else {
                            result = v1 + v2;
                        }
                        System.out.println("[AutoCaptcha] Digits: " + digits + ", Pos1: " + num1 + " (" + v1 + "), Pos2: " + num2 + " (" + v2 + ") => Result = " + result);

                        String sRes = Integer.toString(result);
                        if (sRes.length() == 1) {
                            int r1 = sRes.charAt(0) - '0';
                            byte[] packetCap = new byte[]{7, (byte)240, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 3, 0, 0, 2, 1, 2, 101, 6, 0, 1, (byte)(r1 | 0x30)};
                            MCT.sendBytes(packetCap);
                            System.out.println("[AutoCaptcha] Sent single-digit answer packet!");
                        } else if (sRes.length() == 2) {
                            int r1 = sRes.charAt(0) - '0';
                            int r2 = sRes.charAt(1) - '0';
                            byte[] packetCap = new byte[]{7, (byte)240, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 3, 0, 0, 2, 1, 2, 101, 6, 0, 2, (byte)(r1 | 0x30), (byte)(r2 | 0x30)};
                            MCT.sendBytes(packetCap);
                            System.out.println("[AutoCaptcha] Sent two-digit answer packet!");
                        }
                    }
                }
            }
        } catch (Throwable t) {
            System.out.println("[AutoCaptcha] Exception: " + t);
        }
    }

    /**
     * Tự động di chuyển tuần tra khắp map để tìm Boss.
     * TUYỆT ĐỐI CHỈ BẬT AUTO ĐÁNH KHI ĐÃ TÌM THẤY BOSS VÀ ĐÃ DI CHUYỂN TỚI VỊ TRÍ BOSS.
     * Target 0: Boss 1 ("Phàn nhất ông" - MoveAuto1: 11, 16)
     * Target 1: Boss 2 ("Cầu/Cừu thiên xích" - MoveAuto2: 30, 50 -> MoveAuto3: 50, 40)
     * Target 2: Boss 3 ("Công tôn chỉ" - MoveAuto4: 30, 25 -> MoveAuto5: 53, 5)
     * Target 3: Rời phụ bản (exitDungeon)
     */
    public static void moveToTarget(final int targetIndex) {
        System.out.println("[AutoPB-Move] moveToTarget: index=" + targetIndex + " (0=Phàn nhất ông, 1=Cầu/Cừu thiên xích, 2=Công tôn chỉ, 3=Rời phụ bản)");
        try {
            // TẮT Auto đánh trong suốt quá trình đi tìm đường
            MCT.setAutoFight(false);

            if (targetIndex == 3) {
                exitDungeon();
                return;
            }

            // Tuyến đường tuần tra tìm Boss tương ứng trên bản đồ Tuyệt Tình Cốc theo ghlb.jar
            final int[][] route;
            if (targetIndex == 0) {
                route = new int[][]{{11, 16}, {20, 20}, {15, 30}, {11, 16}};
            } else if (targetIndex == 1) {
                route = new int[][]{{30, 50}, {50, 40}, {45, 45}, {30, 50}};
            } else {
                route = new int[][]{{30, 25}, {53, 5}, {25, 15}, {30, 25}};
            }

            // Chạy luồng tuần tra tìm Boss
            new Thread(new Runnable() {
                public void run() {
                    try {
                        int routeIdx = 0;
                        long waypointStartTime = System.currentTimeMillis();
                        int lastDestX = -1;
                        int lastDestY = -1;

                        while (isAutoPhuBan) {
                            // 1. Quét tìm Boss trong viewport thực tế (ay.k)
                            int[] bossPos = null;
                            if (targetIndex == 0) bossPos = findBoss1();
                            else if (targetIndex == 1) bossPos = findBoss2();
                            else if (targetIndex == 2) bossPos = findBoss3();

                            if (bossPos != null) {
                                // >>> ĐÃ TÌM THẤY BOSS TRÊN MÀN HÌNH <<<
                                int bX = bossPos[0];
                                int bY = bossPos[1];
                                int myX = MCT.getMyX();
                                int myY = MCT.getMyY();
                                int dist = (myX >= 0 && myY >= 0) ? Math.max(Math.abs(myX - bX), Math.abs(myY - bY)) : 999;
                                System.out.println("[AutoPB-Move] FOUND Boss " + (targetIndex + 1) + " at (" + bX + "," + bY + "), myPos=(" + myX + "," + myY + "), dist=" + dist);

                                // Di chuyển trực tiếp tới vị trí Boss
                                if (lastDestX != bX || lastDestY != bY) {
                                    MCT.moveTo(bX, bY);
                                    lastDestX = bX;
                                    lastDestY = bY;
                                }

                                // CHỈ BẬT AUTO ĐÁNH KHI ĐÃ ĐẾN SÁT VỊ TRÍ BOSS (dist <= 2)
                                if (dist <= 2) {
                                    if (autoFightEnabled) {
                                        System.out.println("[AutoPB-Move] >>> REACHED Boss " + (targetIndex + 1) + "! Turning ON Auto Fight...");
                                        MCT.setAutoFight(true);
                                        startAutoSkillLoop();
                                    } else {
                                        System.out.println("[AutoPB-Move] >>> REACHED Boss " + (targetIndex + 1) + ", but autoFightEnabled is OFF.");
                                    }
                                    return; // Đã đến nơi Boss và vào trận, kết thúc luồng tìm kiếm
                                }
                            } else {
                                // >>> CHƯA TÌM THẤY BOSS: TUYỆT ĐỐI KHÔNG BẬT AUTO ĐÁNH <<<
                                MCT.setAutoFight(false);

                                // Di chuyển tuần tra qua các điểm waypoint trên map để mở rộng tầm nhìn
                                int[] wp = route[routeIdx % route.length];
                                if (lastDestX != wp[0] || lastDestY != wp[1]) {
                                    System.out.println("[AutoPB-Move] Boss " + (targetIndex + 1) + " not in sight. Roaming to waypoint (" + wp[0] + "," + wp[1] + ") to search...");
                                    MCT.moveTo(wp[0], wp[1]);
                                    lastDestX = wp[0];
                                    lastDestY = wp[1];
                                    waypointStartTime = System.currentTimeMillis();
                                }

                                int myX = MCT.getMyX();
                                int myY = MCT.getMyY();
                                int wpDist = (myX >= 0 && myY >= 0) ? Math.max(Math.abs(myX - wp[0]), Math.abs(myY - wp[1])) : 999;
                                // Nếu đã đến waypoint hiện tại hoặc đã đi quá 4 giây -> chuyển sang waypoint tiếp theo
                                if (wpDist <= 2 || (System.currentTimeMillis() - waypointStartTime > 4000)) {
                                    routeIdx++;
                                    lastDestX = -1;
                                    lastDestY = -1;
                                }
                            }

                            Thread.sleep(300);
                        }
                    } catch (Throwable t) {
                        System.out.println("[AutoPB-Move] Exception in travel thread: " + t);
                    }
                }
            }).start();
        } catch (Throwable t) {
            System.out.println("[AutoPB-Move] Exception in moveToTarget: " + t);
        }
    }

    /**
     * Nhận event chuỗi text từ server (được tiêm tự động vào a.z method a(I)Ljava/lang/String;).
     * Phát hiện khi nhận "Giang hồ lệnh bài", giải Captcha, thoát map, vào lại map, và dừng khi hết lượt.
     */
    public static void onServerMessage(String msg) {
        if (msg == null) return;
        String norm = normalize(msg);
        System.out.println("[AutoPB-Msg] raw: '" + msg + "' | norm: '" + norm + "' | isAutoPhuBan=" + isAutoPhuBan + " | bossNum=" + bossNum);

        // 1. Tự động giải Captcha chống bot nếu xuất hiện (ghlb.jar z.java)
        if (msg.indexOf("Chu\u1ed1i s\u1ed1") != -1 || msg.indexOf("Chuoi so") != -1 || msg.indexOf("ph\u00e9p nh\u00e2n") != -1 || msg.indexOf("ph\u00e9p c\u1ed9ng") != -1) {
            solveCaptcha(msg);
        }

        if (!isAutoPhuBan) return;

        // 2. Tự động chọn xác nhận vào phụ bản khi đứng ở cổng (62, 8) theo cấp độ đã chọn trên UI (ghlb.jar z.java)
        for (int i = 0; i < DUNGEON_LIST.length; i++) {
            if (i == selectedDungeon && (msg.indexOf(DUNGEON_LIST[i]) != -1 || norm.indexOf(normalize(DUNGEON_SHORT_LIST[i])) != -1)) {
                System.out.println("[AutoPB-Msg] >>> Found matching entrance dialog for " + DUNGEON_LIST[i] + "! Sending enter option packet...");
                byte[] selectOptionPacket = new byte[]{7, (byte)-16, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 3, 0, 0, 2, 1, 2, 101, 6, 0, 0};
                MCT.sendBytes(selectOptionPacket);
                break;
            }
        }

        // 3. Kiểm tra nhận được Giang Hồ Lệnh Bài -> Đã diệt xong 1 Boss (ghlb.jar z.java)
        boolean hasNhanDuoc = norm.indexOf("nhan duoc") != -1 || norm.startsWith("ban nhan");
        boolean hasLenhBai = norm.indexOf("giang ho lenh bai") != -1 || (norm.indexOf("giang ho") != -1 && norm.indexOf("lenh bai") != -1);

        if (hasNhanDuoc && hasLenhBai) {
            System.out.println("[AutoPB-Msg] >>> DETECTED Giang Ho Lenh Bai! Current bossNum=" + bossNum);
            // TẠM DỪNG AUTO ĐÁNH NGAY LẬP TỨC
            MCT.setAutoFight(false);

            if (bossNum == 0) {
                bossNum = 1;
                System.out.println("[AutoPB-Msg] >>> Boss 1 Killed! Moving to Boss 2 (Cầu/Cừu thiên xích)...");
                moveToTarget(1);
            } else if (bossNum == 1) {
                bossNum = 2;
                System.out.println("[AutoPB-Msg] >>> Boss 2 Killed! Moving to Boss 3 (Công tôn chỉ)...");
                moveToTarget(2);
            } else if (bossNum >= 2) {
                bossNum = 3;
                System.out.println("[AutoPB-Msg] >>> Killed 3 Bosses! Auto exiting dungeon using ghlb packet...");
                exitDungeon();
            }
        }

        // 4. Xử lý khi nhận phần thưởng / thông báo kết thúc ải / quay lại
        if (norm.indexOf("noi nay khong nen o lai lau") != -1 || norm.indexOf("phan thuong qua ai") != -1 || norm.indexOf("quay lai") != -1 || norm.indexOf("roi khoi") != -1) {
            System.out.println("[AutoPB-Msg] >>> Dungeon clear notification! Dismissing dialog and preparing to re-enter...");
            byte[] dismissPacket = new byte[]{7, (byte)-16, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 3, 0, 0, 2, 1, 2, 101, 6, 0, 0};
            MCT.sendBytes(dismissPacket);
            MCT.setAutoFight(false);
            bossNum = 0;
            // Nếu vẫn đang bật Auto Phụ Bản, tự động vào lại phụ bản theo độ khó đã chọn sau 1.5 giây
            if (isAutoPhuBan) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(1500);
                            if (isAutoPhuBan) {
                                enterDungeonByLevel(selectedDungeon);
                            }
                        } catch (Throwable t) {}
                    }
                }).start();
            }
        }

        // 5. Kiểm tra khi HẾT LƯỢT / GIỚI HẠN SỐ LẦN VÀO PHỤ BẢN -> DỪNG AUTO
        if (norm.indexOf("so lan vao phu ban") != -1 || norm.indexOf("khong du so lan") != -1 ||
            norm.indexOf("da het luot") != -1 || norm.indexOf("vuot qua gioi han") != -1 ||
            (norm.indexOf("so lan") != -1 && norm.indexOf("da het") != -1)) {
            System.out.println("[AutoPB-Msg] >>> Out of dungeon turns! Stopping auto.");
            isAutoPhuBan = false;
            bossNum = 0;
            try {
                MCT.setAutoFight(false);
            } catch (Throwable t) {}
        }
    }

    /**
     * Checks chat commands. Only explicit .auto command opens menu if typed.
     */
    public static boolean checkCommand(String input) {
        if (input != null && ".auto".equalsIgnoreCase(input.trim())) {
            show = true;
            currentScreen = SCREEN_MAIN;
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
        int h = (screenH * 82) / 100;
        if (h < 220) h = Math.min(220, screenH);
        if (h > 280) h = 280;
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
        if (g == null) return;

        int screenW = getScreenWidth();
        int screenH = getScreenHeight();

        // 1. Khi Popup ĐANG TẮT: Vẽ nút [Auto] cố định ở góc trái giữa màn hình
        if (!show) {
            int fBtnW = 38;
            int fBtnH = 20;
            int fBtnX = 2;
            int fBtnY = (screenH - fBtnH) / 2;

            Font oldFont = g.getFont();
            Font font = oldFont != null ? oldFont : Font.getDefaultFont();
            g.setFont(font);

            int fBtnBg = isAutoPhuBan ? 0x1E4A28 : 0x2D2214;
            int fBtnBorder = isAutoPhuBan ? 0x4E9F3D : 0xE5A93C;
            int fBtnText = isAutoPhuBan ? 0xD8E9A8 : 0xFFF799;
            String label = isAutoPhuBan ? "Auto*" : "Auto";

            drawButton(g, font, label, fBtnX, fBtnY, fBtnW, fBtnH, fBtnBg, fBtnBorder, fBtnText);
            g.setFont(oldFont);
            return;
        }

        // 2. Khi Popup ĐANG BẬT: Vẽ giao diện Popup Tool
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

        int contentTop = y + headerH + 5;
        int btnW = w - 18;
        int btnH = 19;
        int btnX = x + 9;

        if (currentScreen == SCREEN_MAIN) {
            // Button 1: Auto Nông Trường
            int btnFarmY = contentTop + 2;
            drawButton(g, font, "Auto N\u00f4ng Tr\u01b0\u1eddng", btnX, btnFarmY, btnW, btnH, 0x3B2D1D, 0xE5A93C, 0xFFF799);

            // Button 2: Auto Phụ Bản
            int btnDungeonY = btnFarmY + btnH + 4;
            String dBtnText = isAutoPhuBan ? "Auto Ph\u1ee5 B\u1ea3n [B\u1eacT]" : "Auto Ph\u1ee5 B\u1ea3n";
            int dBtnBg = isAutoPhuBan ? 0x1E4A28 : 0x3B2D1D;
            int dBtnBorder = isAutoPhuBan ? 0x4E9F3D : 0xE5A93C;
            int dBtnTextColor = isAutoPhuBan ? 0xD8E9A8 : 0xFFF799;
            drawButton(g, font, dBtnText, btnX, btnDungeonY, btnW, btnH, dBtnBg, dBtnBorder, dBtnTextColor);

            // Button 3: Auto Đánh [BẬT / TẮT]
            int btnFightY = btnDungeonY + btnH + 4;
            String fightText = "Auto \u0110\u00e1nh: [" + (autoFightEnabled ? "B\u1eacT" : "T\u1eaeT") + "]";
            int fightBg = autoFightEnabled ? 0x1E4A28 : 0x4A2828;
            int fightBorder = autoFightEnabled ? 0x4E9F3D : 0x9E2A2B;
            int fightTextColor = autoFightEnabled ? 0xD8E9A8 : 0xFFD0D0;
            drawButton(g, font, fightText, btnX, btnFightY, btnW, btnH, fightBg, fightBorder, fightTextColor);

            // Button 4: Cài đặt Chiêu đánh (Skill Combo)
            int btnSkillY = btnFightY + btnH + 4;
            String skillLabel = "Chi\u00eau: [" + skillString + "]";
            if (font.stringWidth(skillLabel) > btnW - 6) {
                skillLabel = "Chi\u00eau \u0111\u00e1nh: [S\u1eeda]";
            }
            drawButton(g, font, skillLabel, btnX, btnSkillY, btnW, btnH, 0x2A2016, 0xE5A93C, 0xFFF799);

            // Button 5: Tốc độ Game (Speed Hack)
            int btnSpeedY = btnSkillY + btnH + 4;
            String speedText = "T\u1ed1c \u0111\u1ed9 Game: " + speedMultiplier + "x";
            int speedBg = speedMultiplier > 1 ? 0x1C3144 : 0x3B2D1D;
            int speedBorder = speedMultiplier > 1 ? 0x3F88C5 : 0xE5A93C;
            int speedTextColor = speedMultiplier > 1 ? 0xE0F0FF : 0xFFF799;
            drawButton(g, font, speedText, btnX, btnSpeedY, btnW, btnH, speedBg, speedBorder, speedTextColor);

            // Bottom [Dong] button
            int closeBtnW = Math.min(70, w - 30);
            int closeBtnH = 19;
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
            int backBtnH = 19;
            int backBtnX = x + 9;
            int backBtnY = y + h - backBtnH - 6;
            drawButton(g, font, "Quay l\u1ea1i", backBtnX, backBtnY, backBtnW, backBtnH, 0x3B2D1D, 0xE5A93C, 0xFFF799);

            // Bottom [Dong] button
            int closeBtnW = Math.min(70, (w - 30) / 2);
            int closeBtnH = 19;
            int closeBtnX = x + w - closeBtnW - 9;
            int closeBtnY = y + h - closeBtnH - 6;
            drawButton(g, font, "\u0110\u00f3ng", closeBtnX, closeBtnY, closeBtnW, closeBtnH, 0x4A3728, 0xE5A93C, 0xFFF799);

        } else if (currentScreen == SCREEN_DUNGEON) {
            // Render 4 Dungeons of Cấm địa Tuyệt tình cốc
            int itemH = 17;
            int itemGap = 2;
            int listStartY = contentTop + 1;

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

            // Button: Auto Đánh [BẬT / TẮT]
            int fightBtnY = listStartY + 4 * (itemH + itemGap);
            String fightText = "Auto \u0110\u00e1nh: [" + (autoFightEnabled ? "B\u1eacT" : "T\u1eaeT") + "]";
            int fightBg = autoFightEnabled ? 0x1E4A28 : 0x4A2828;
            int fightBorder = autoFightEnabled ? 0x4E9F3D : 0x9E2A2B;
            int fightTextColor = autoFightEnabled ? 0xD8E9A8 : 0xFFD0D0;
            drawButton(g, font, fightText, btnX, fightBtnY, btnW, itemH, fightBg, fightBorder, fightTextColor);

            // Skill combo button
            int skillBtnY = fightBtnY + itemH + 2;
            String skillLabel = "Chi\u00eau: [" + skillString + "]";
            if (font.stringWidth(skillLabel) > btnW - 6) {
                skillLabel = "Chi\u00eau \u0111\u00e1nh: [S\u1eeda]";
            }
            drawButton(g, font, skillLabel, btnX, skillBtnY, btnW, itemH, 0x2A2016, 0xE5A93C, 0xFFF799);

            // Row 1: [START / STOP] and [Đến]
            int actBtnH = 19;
            int actBtnY = y + h - 44;
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
        int screenH = getScreenHeight();
        int fBtnW = 38;
        int fBtnH = 20;
        int fBtnX = 2;
        int fBtnY = (screenH - fBtnH) / 2;

        if (!show) {
            if (px >= fBtnX - 2 && px <= fBtnX + fBtnW + 4 && py >= fBtnY - 4 && py <= fBtnY + fBtnH + 4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean pointerReleased(int px, int py) {
        int screenH = getScreenHeight();
        int fBtnW = 38;
        int fBtnH = 20;
        int fBtnX = 2;
        int fBtnY = (screenH - fBtnH) / 2;

        // 1. Khi Popup ĐANG TẮT: Check click vào nút [Auto] góc trái giữa
        if (!show) {
            if (px >= fBtnX - 2 && px <= fBtnX + fBtnW + 4 && py >= fBtnY - 4 && py <= fBtnY + fBtnH + 4) {
                show = true;
                currentScreen = SCREEN_MAIN;
                System.out.println("[AutoMenu] Clicked Floating Auto button -> Opening Menu!");
                return true;
            }
            return false;
        }

        // 2. Khi Popup ĐANG BẬT: TUYỆT ĐỐI KHÔNG TỰ ĐÓNG KHI CLICK RA NGOÀI
        int w = getWidth();
        int h = getHeight();
        int x = getX();
        int y = getY();
        int headerH = 22;

        // [X] Close button
        int closeW = 16;
        int closeH = headerH - 4;
        if (closeH < 12) closeH = 12;
        int closeX = x + w - closeW - 3;
        int closeY = y + 2;
        if (px >= closeX - 4 && px <= closeX + closeW + 4 && py >= closeY - 4 && py <= closeY + closeH + 4) {
            show = false;
            return true;
        }

        int contentTop = y + headerH + 5;
        int btnW = w - 18;
        int btnH = 19;
        int btnX = x + 9;

        if (currentScreen == SCREEN_MAIN) {
            // Click "Auto Nông Trường" button
            int btnFarmY = contentTop + 2;
            if (px >= btnX && px <= btnX + btnW && py >= btnFarmY && py <= btnFarmY + btnH) {
                currentScreen = SCREEN_FARM;
                return true;
            }

            // Click "Auto Phụ Bản" button
            int btnDungeonY = btnFarmY + btnH + 4;
            if (px >= btnX && px <= btnX + btnW && py >= btnDungeonY && py <= btnDungeonY + btnH) {
                currentScreen = SCREEN_DUNGEON;
                return true;
            }

            // Click "Auto Đánh [BẬT / TẮT]" button (Dừng auto đánh độc lập)
            int btnFightY = btnDungeonY + btnH + 4;
            if (px >= btnX && px <= btnX + btnW && py >= btnFightY && py <= btnFightY + btnH) {
                autoFightEnabled = !autoFightEnabled;
                System.out.println("[AutoMenu] Toggle autoFightEnabled: " + autoFightEnabled);
                if (!autoFightEnabled) {
                    try { MCT.setAutoFight(false); } catch (Throwable t) {}
                }
                return true;
            }

            // Click "Cài đặt Chiêu đánh" button
            int btnSkillY = btnFightY + btnH + 4;
            if (px >= btnX && px <= btnX + btnW && py >= btnSkillY && py <= btnSkillY + btnH) {
                openSkillInput();
                return true;
            }

            // Click "Tốc độ Game" button
            int btnSpeedY = btnSkillY + btnH + 4;
            if (px >= btnX && px <= btnX + btnW && py >= btnSpeedY && py <= btnSpeedY + btnH) {
                speedIndex = (speedIndex + 1) % SPEED_LEVELS.length;
                speedMultiplier = SPEED_LEVELS[speedIndex];
                System.out.println("[AutoMenu] Speed set to: " + speedMultiplier + "x");
                return true;
            }

            // Click [Dong] button -> CHỈ ĐÓNG KHI CLICK VÀO ĐÂY
            int closeBtnW = Math.min(70, w - 30);
            int closeBtnH = 19;
            int closeBtnX = x + (w - closeBtnW) / 2;
            int closeBtnY = y + h - closeBtnH - 6;
            if (px >= closeBtnX - 4 && px <= closeBtnX + closeBtnW + 4 && py >= closeBtnY - 4 && py <= closeBtnY + closeBtnH + 4) {
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
            int backBtnH = 19;
            int backBtnX = x + 9;
            int backBtnY = y + h - backBtnH - 6;
            if (px >= backBtnX - 4 && px <= backBtnX + backBtnW + 4 && py >= backBtnY - 4 && py <= backBtnY + backBtnH + 4) {
                currentScreen = SCREEN_MAIN;
                return true;
            }

            // Click [Dong] button -> CHỈ ĐÓNG KHI CLICK VÀO ĐÂY
            int closeBtnW = Math.min(70, (w - 30) / 2);
            int closeBtnH = 19;
            int closeBtnX = x + w - closeBtnW - 9;
            int closeBtnY = y + h - closeBtnH - 6;
            if (px >= closeBtnX - 4 && px <= closeBtnX + closeBtnW + 4 && py >= closeBtnY - 4 && py <= closeBtnY + closeBtnH + 4) {
                show = false;
                return true;
            }

        } else if (currentScreen == SCREEN_DUNGEON) {
            int itemH = 17;
            int itemGap = 2;
            int listStartY = contentTop + 1;

            // Click on Dungeon Items
            for (int i = 0; i < DUNGEON_LIST.length; i++) {
                int itemY = listStartY + i * (itemH + itemGap);
                if (px >= btnX && px <= btnX + btnW && py >= itemY && py <= itemY + itemH) {
                    selectedDungeon = i;
                    System.out.println("[AutoMenu] Selected dungeon index: " + i);
                    return true;
                }
            }

            // Click "Auto Đánh [BẬT / TẮT]" button trong menu phụ bản
            int fightBtnY = listStartY + 4 * (itemH + itemGap);
            if (px >= btnX && px <= btnX + btnW && py >= fightBtnY && py <= fightBtnY + itemH) {
                autoFightEnabled = !autoFightEnabled;
                System.out.println("[AutoMenu] Toggle autoFightEnabled: " + autoFightEnabled);
                if (!autoFightEnabled) {
                    try { MCT.setAutoFight(false); } catch (Throwable t) {}
                }
                return true;
            }

            // Click "Cài đặt Chiêu đánh" button trong menu phụ bản
            int skillBtnY = fightBtnY + itemH + 2;
            if (px >= btnX && px <= btnX + btnW && py >= skillBtnY && py <= skillBtnY + itemH) {
                openSkillInput();
                return true;
            }

            // Row 1: [START] & [Đến]
            int actBtnH = 19;
            int actBtnY = y + h - 44;
            int actBtnW = (w - 26) / 2;

            int startBtnX = x + 9;
            // Click [START / STOP] -> START BẮT ĐẦU TỪ CỔNG PHỤ BẢN VÀ VÀO ẢI THEO CẤP ĐỘ ĐÃ CHỌN
            if (px >= startBtnX - 4 && px <= startBtnX + actBtnW + 4 && py >= actBtnY - 4 && py <= actBtnY + actBtnH + 4) {
                if (!isAutoPhuBan) {
                    isAutoPhuBan = true;
                    bossNum = 0;
                    dungeonRunCount = 0;
                    System.out.println("[AutoMenu] START clicked! Setting isAutoPhuBan=true, selectedDungeon=" + selectedDungeon);
                    enterDungeonByLevel(selectedDungeon);
                    show = false;
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
            if (px >= teleBtnX - 4 && px <= teleBtnX + actBtnW + 4 && py >= actBtnY - 4 && py <= actBtnY + actBtnH + 4) {
                System.out.println("[AutoMenu] 'Đến' clicked! Teleporting to TTC...");
                teleToTTC();
                return true;
            }

            // Row 2: [Quay lại] & [Đóng]
            int navBtnH = 18;
            int navBtnY = y + h - 22;
            int navBtnW = (w - 26) / 2;

            int backBtnX = x + 9;
            // Click [Quay lại]
            if (px >= backBtnX - 4 && px <= backBtnX + navBtnW + 4 && py >= navBtnY - 4 && py <= navBtnY + navBtnH + 4) {
                currentScreen = SCREEN_MAIN;
                return true;
            }

            int closeBtnX = backBtnX + navBtnW + 8;
            // Click [Đóng] -> CHỈ ĐÓNG KHI CLICK VÀO ĐÂY
            if (px >= closeBtnX - 4 && px <= closeBtnX + navBtnW + 4 && py >= navBtnY - 4 && py <= navBtnY + navBtnH + 4) {
                show = false;
                return true;
            }
        }

        // Chặn hoàn toàn click ra ngoài để popup không bị tắt
        return true;
    }

    public static boolean keyPressed(int keyCode) {
        if (!show) return false;
        return true;
    }
}
