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
    public static final int SCREEN_TRASH = 3;
    public static final int SCREEN_TRAIN = 4;
    public static int currentScreen = SCREEN_MAIN;
    public static int selectedTrashOption = -1;

    public static final String[] TRASH_OPTIONS = {
        "1. V\u1ee9t \u0111\u1ed3 ch\u01b0a gi\u00e1m \u0111\u1ecbnh",
        "2. V\u1ee9t \u0111ay",
        "3. V\u1ee9t t\u01a1",
        "4. V\u1ee9t da s\u1ed1ng",
        "5. V\u1ee9t da nh\u1eb9",
        "6. V\u1ee9t kho\u00e1ng th\u1ea1ch",
        "7. V\u1ee9t b\u1ea1ch d\u01b0\u1ee3c"
    };

    // Auto Train settings (mặc định TẤT CẢ là TẮT)
    public static boolean trainAutoPickStone = false; // 1. Tự động nhặt đá
    public static boolean trainDropDay = false;        // 2. Vứt đay
    public static boolean trainDropTo = false;         // 3. Vứt tơ
    public static boolean trainDropDaSong = false;     // 4. Vứt da sống
    public static boolean trainDropDaNhe = false;      // 5. Vứt da nhẹ
    public static boolean trainDropRangRoi = false;    // 6. Vứt răng rơi
    public static boolean trainDropDocNhen = false;    // 7. Vứt độc nhện

    public static final String[] TRAIN_SETTINGS = {
        "1. T\u1ef1 \u0111\u1ed9ng nh\u1eb7t \u0111\u00e1",
        "2. V\u1ee9t \u0111ay",
        "3. V\u1ee9t t\u01a1",
        "4. V\u1ee9t da s\u1ed1ng",
        "5. V\u1ee9t da nh\u1eb9",
        "6. V\u1ee9t r\u0103ng r\u01a1i",
        "7. V\u1ee9t \u0111\u1ed9c nh\u1ec7n"
    };

    // Auto Train states & skill configuration
    public static boolean isAutoTrain = false;
    public static String trainSkillString = "-5:0,49:0,50:0,51:0,52:0,53:0,54:0,55:0,56:0";
    public static int[] trainParsedSkills = {-5, 49, 50, 51, 52, 53, 54, 55, 56};
    public static int trainSkillDelay = 200;
    private static Thread autoTrainSkillThread;

    // Feature toggle states
    public static boolean isAutoFarm = false;
    public static boolean autoPlantEnabled = false;
    public static boolean autoHarvestEnabled = false;
    public static boolean isAutoPhuBan = false;
    public static boolean autoFightEnabled = false; // Mặc định TẮT Auto Đánh khi mở popup
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
    public static String skillString = "-5:0,49:0,50:0,51:0,52:0,53:0,54:0,55:0,56:0";
    public static int[] parsedSkills = {-5, 49, 50, 51, 52, 53, 54, 55, 56};
    public static int skillDelay = 200; // ms giữa các chiêu
    private static Thread autoSkillThread;
    public static boolean isFightingBoss = false;

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
     * Hỗ trợ mọi định dạng:
     * - "1,2,3,4,5,6,7,8"
     * - "49,50,51,52,53,54,55,56"
     * - "-5:0,49:0,50:0,51:0,52:0,53:0,54:0,55:0,56:0" (Chuẩn Kalvaz AutoClick)
     * - "-5:1,49:1,50:1,..."
     */
    public static void parseSkills(String input) {
        if (input == null || input.trim().length() == 0) {
            input = "-5:0,49:0,50:0,51:0,52:0,53:0,54:0,55:0,56:0";
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
                System.out.println("[AutoSkill] Parsed " + parsedSkills.length + " skills successfully.");
            }
        } catch (Throwable t) {
            System.out.println("[AutoSkill] parseSkills error: " + t);
        }
    }

    /**
     * Thực thi bấm phím chiêu đánh trên game canvas với delay giữ phím 25ms.
     */
    public static void castSkill(int keyCode) {
        try {
            ac canvas = ac.a();
            if (canvas != null) {
                canvas.leyPressed(keyCode);
                try {
                    Thread.sleep(25);
                } catch (Throwable t) {}
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
                while (autoFightEnabled) {
                    try {
                        // Nếu đang trong phụ bản và chưa tiếp cận Boss (đang tuần tra tìm đường) -> tạm nghỉ
                        if (isAutoPhuBan && !isFightingBoss) {
                            Thread.sleep(150);
                            continue;
                        }

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
            final TextBox tb = new TextBox("Chi\u00eau (1-8 ho\u1eb7c -5:0,49:0..):", skillString, 500, 0);
            final Command cmdSave = new Command("L\u01b0u", Command.OK, 1);
            final Command cmdCancel = new Command("H\u1ee7y", Command.CANCEL, 2);
            tb.addCommand(cmdSave);
            tb.addCommand(cmdCancel);
            tb.setCommandListener(new CommandListener() {
                public void commandAction(Command c, Displayable d) {
                    if (c == cmdSave) {
                        skillString = tb.getString();
                        parseSkills(skillString);
                        if (autoFightEnabled) {
                            startAutoSkillLoop();
                        }
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
     * Parse chuỗi cài đặt chiêu đánh riêng cho Auto Train.
     */
    public static void parseTrainSkills(String input) {
        if (input == null || input.trim().length() == 0) {
            input = "-5:0,49:0,50:0,51:0,52:0,53:0,54:0,55:0,56:0";
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
                                    val = 48 + val;
                                } else if (val == 0) {
                                    val = 48;
                                }
                                list.addElement(new Integer(val));
                            } catch (Throwable t) {}
                        }
                    }
                    start = i + 1;
                }
            }
            if (list.size() > 0) {
                trainParsedSkills = new int[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    trainParsedSkills[i] = ((Integer) list.elementAt(i)).intValue();
                }
                System.out.println("[AutoTrain] Parsed " + trainParsedSkills.length + " train skills successfully.");
            }
        } catch (Throwable t) {
            System.out.println("[AutoTrain] parseTrainSkills error: " + t);
        }
    }

    /**
     * Khởi động vòng lặp tự động xuất chiêu riêng cho Auto Train.
     */
    public static void startAutoTrainSkillLoop() {
        if (!isAutoTrain) return;
        if (autoTrainSkillThread != null && autoTrainSkillThread.isAlive()) return;
        autoTrainSkillThread = new Thread(new Runnable() {
            public void run() {
                int idx = 0;
                while (isAutoTrain) {
                    try {
                        if (trainParsedSkills != null && trainParsedSkills.length > 0) {
                            int key = trainParsedSkills[idx % trainParsedSkills.length];
                            castSkill(key);
                            idx++;
                        }
                        long d = (long) trainSkillDelay;
                        if (speedMultiplier > 1) {
                            d = d / speedMultiplier;
                            if (d < 50L) d = 50L;
                        }
                        Thread.sleep(d);
                    } catch (Throwable t) {}
                }
            }
        });
        autoTrainSkillThread.start();
    }

    /**
     * Mở hộp thoại TextBox nhập/chỉnh sửa chuỗi chiêu đánh riêng cho Auto Train.
     */
    public static void openTrainSkillInput() {
        try {
            final TextBox tb = new TextBox("Chi\u00eau Train (1-8 ho\u1eb7c -5:0..):", trainSkillString, 500, 0);
            final Command cmdSave = new Command("L\u01b0u", Command.OK, 1);
            final Command cmdCancel = new Command("H\u1ee7y", Command.CANCEL, 2);
            tb.addCommand(cmdSave);
            tb.addCommand(cmdCancel);
            tb.setCommandListener(new CommandListener() {
                public void commandAction(Command c, Displayable d) {
                    if (c == cmdSave) {
                        trainSkillString = tb.getString();
                        parseTrainSkills(trainSkillString);
                        if (isAutoTrain) {
                            startAutoTrainSkillLoop();
                        }
                        System.out.println("[AutoTrain] Saved train skill sequence: " + trainSkillString);
                    }
                    try {
                        MyMidlet.setDisplayable(ac.a());
                    } catch (Throwable t) {}
                }
            });
            MyMidlet.setDisplayable(tb);
        } catch (Throwable t) {
            System.out.println("[AutoTrain] openTrainSkillInput error: " + t);
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
     * Kiểm tra xem chuỗi text có phải là tin nhắn chat, rao bán hoặc rác không.
     */
    public static boolean isChatOrTrashMessage(String msg) {
        if (msg == null) return true;
        String trimmed = msg.trim();
        if (trimmed.length() <= 2) return true;

        // Mã màu chat / item link của MCVL (ví dụ *0#(804,37195152a)*6+15...)
        if (trimmed.indexOf("*0#") != -1 || trimmed.indexOf("*1#") != -1 || trimmed.indexOf("*2#") != -1 ||
            trimmed.indexOf("*3#") != -1 || trimmed.indexOf("*4#") != -1 || trimmed.indexOf("*5#") != -1 ||
            trimmed.indexOf("*6#") != -1 || trimmed.indexOf("*7#") != -1 || trimmed.indexOf("*8#") != -1 ||
            trimmed.indexOf("*9#") != -1 || trimmed.indexOf("#(") != -1 || trimmed.indexOf("a)*") != -1 ||
            trimmed.indexOf(")*") != -1) {
            return true;
        }

        String norm = normalize(trimmed);

        // Kênh chat và từ khóa rao bán, buôn bán
        if (norm.indexOf("zl") != -1 || norm.indexOf("zalo") != -1 || norm.indexOf("atm") != -1 ||
            norm.indexOf("b ac") != -1 || norm.indexOf("sex") != -1 || norm.indexOf("the gioi") != -1 ||
            norm.indexOf("bang hoi") != -1 || norm.indexOf("kenh") != -1 || norm.indexOf("rao ban") != -1 ||
            norm.indexOf("mua ban") != -1 || norm.indexOf("gia re") != -1 || norm.indexOf("038") != -1 ||
            norm.indexOf("093") != -1 || norm.indexOf("098") != -1 || norm.indexOf("090") != -1) {
            return true;
        }

        // Bỏ qua Sôi nổi / Nhiệm vụ hàng ngày (CMD 2500 text)
        if (trimmed.indexOf("@900") != -1 || trimmed.indexOf("@&_@") != -1 || norm.indexOf("soi noi") != -1 ||
            norm.indexOf("dang nhap tro choi") != -1 || norm.indexOf("hoan thanh") != -1) {
            return true;
        }

        // Bỏ qua tên trang bị / chỉ số / trạng thái / vật phẩm rác load thụ động khi vào game
        if (trimmed.startsWith("+") || norm.equals("tu thai") || norm.equals("trang thai bao ho") ||
            norm.equals("bach chien") || norm.equals("tai sinh") || norm.equals("phan toai") ||
            norm.indexOf("(chua giam dinh)") != -1 || norm.equals("bach duoc") || norm.equals("giang ho lenh bai") ||
            norm.equals("khinh sa lap") || norm.indexOf("khoang thach") != -1 || norm.equals("da song") || norm.equals("da nhe")) {
            return true;
        }

        // Tên người gửi chat riêng lẻ (1 từ không có dấu cách và ngắn)
        if (norm.indexOf(" ") == -1 && norm.length() < 20) {
            return true;
        }

        return false;
    }

    /**
     * Kiểm tra xem mã Command ID có thuộc danh sách các chức năng quan trọng dùng để mod không.
     */
    public static boolean isImportantCmd(int cmd) {
        switch (cmd) {
            case 1009: // Túi đồ / Vứt đồ / Dùng đồ / Tách ô
            case 1005: // Đối thoại NPC / Chuyển map / Chọn menu
            case 1074: // Lựa chọn option đối thoại NPC
            case 1004: // Thông báo hệ thống / Popup / Cảnh báo server
            case 1312: // Trang viên / Nông trường / Trồng cây / Thu hoạch
            case 1146: // Cập nhật thực thể nông trường
            case 1170: // Teleport đội trưởng / Đội ngũ
            case 1157: // Tấn công mục tiêu / Cast skill
            case 1033: // Lệnh vứt đồ thay thế
                return true;
            default:
                return false;
        }
    }

    /**
     * Kiểm tra xem chuỗi có liên quan đến các chức năng quan trọng dùng để mod không.
     */
    public static boolean isImportantServerMessage(String msg) {
        if (msg == null) return false;
        if (isChatOrTrashMessage(msg)) return false;

        String norm = normalize(msg);

        // Chức năng Phụ bản / Cấm địa / Boss
        if (norm.indexOf("phu ban") != -1 || norm.indexOf("cam dia") != -1 ||
            norm.indexOf("pho ban") != -1 || norm.indexOf("boss") != -1 ||
            norm.indexOf("roi khoi") != -1 || norm.indexOf("qua ai") != -1 ||
            norm.indexOf("noi nay khong") != -1 || norm.indexOf("so lan vao") != -1 || norm.indexOf("het luot") != -1 ||
            norm.indexOf("gioi han") != -1) {
            return true;
        }

        // Thông báo nhận được Lệnh Bài / phần thưởng thực sự
        if ((norm.indexOf("nhan duoc") != -1 || norm.startsWith("ban nhan")) &&
            (norm.indexOf("lenh bai") != -1 || norm.indexOf("kinh nghiem") != -1 || norm.indexOf("bac") != -1)) {
            return true;
        }

        // Nhiệm vụ, Lời thoại NPC, Tùy chọn Menu
        if (norm.indexOf("nhiem vu") != -1 || norm.indexOf("doi thoai") != -1 ||
            norm.indexOf("lua chon") != -1 || norm.indexOf("xac nhan") != -1 ||
            norm.indexOf("chap nhan") != -1 || norm.indexOf("tu choi") != -1) {
            return true;
        }

        // Captcha chống bot
        if (norm.indexOf("chuoi so") != -1 || norm.indexOf("phep") != -1 || norm.indexOf("nhap ma") != -1 ||
            norm.indexOf("ma xac nhan") != -1) {
            return true;
        }

        // Trạng thái hệ thống quan trọng
        if (norm.indexOf("khong ton tai") != -1 || norm.indexOf("that bai") != -1 || norm.indexOf("khong the") != -1 ||
            norm.indexOf("mat ket noi") != -1 || norm.indexOf("da chet") != -1 || norm.indexOf("hoi sinh") != -1 ||
            norm.startsWith("[action]") || norm.startsWith("[autopb]") || norm.startsWith("[droptrash]")) {
            return true;
        }

        return false;
    }

    /**
     * Ghi log chuỗi text (message) đã được giải mã từ server ra file debug.txt (chỉ ghi các thông điệp quan trọng để mod)
     */
    public static synchronized void logDebug(String text) {
        if (text == null || text.trim().length() == 0) return;
        if (isChatOrTrashMessage(text) && !text.startsWith("[")) return;

        long now = System.currentTimeMillis();
        long sec = (now / 1000) % 60;
        long min = (now / (1000 * 60)) % 60;
        long hour = (now / (1000 * 60 * 60) + 7) % 24; // GMT+7
        String timeStr = (hour < 10 ? "0" : "") + hour + ":" + (min < 10 ? "0" : "") + min + ":" + (sec < 10 ? "0" : "") + sec;
        String line = "[" + timeStr + "] " + text + "\r\n";

        // 1. Ghi vào thư mục chạy của giả lập (CWD)
        try {
            java.io.File file = new java.io.File("debug.txt");
            java.io.FileOutputStream fos = new java.io.FileOutputStream(file, true);
            java.io.OutputStreamWriter osw = new java.io.OutputStreamWriter(fos, "UTF-8");
            osw.write(line);
            osw.flush();
            osw.close();
            fos.close();
        } catch (Throwable t) {}

        // 2. Đồng thời ghi vào thư mục dự án logs/debug.txt
        try {
            java.io.File file2 = new java.io.File("E:/MCVL_3_DEV/Mod_Auto_1/logs/debug.txt");
            if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            java.io.FileOutputStream fos2 = new java.io.FileOutputStream(file2, true);
            java.io.OutputStreamWriter osw2 = new java.io.OutputStreamWriter(fos2, "UTF-8");
            osw2.write(line);
            osw2.flush();
            osw2.close();
            fos2.close();
        } catch (Throwable t2) {}
    }

    /**
     * Ghi nhận và phân tích chi tiết gói tin gửi lên máy chủ [SEND] (Command ID, Parameters, Raw Bytes)
     */
    public static void logSendPacket(byte[] data) {
        if (data == null || data.length < 2) return;

        try {
            java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(data);
            java.io.DataInputStream dis = new java.io.DataInputStream(bais);

            int cmd = dis.readShort(); // Command ID (2 bytes đầu)

            // CHỈ ghi log các command quan trọng dùng để mod
            if (!isImportantCmd(cmd)) {
                return;
            }

            // Bỏ qua spam chiêu đánh thường khi đang auto đánh (CMD 1004)
            if ((autoFightEnabled || isAutoTrain) && cmd == 1004) {
                return;
            }

            StringBuffer sb = new StringBuffer();
            sb.append("[SEND] CMD=").append(cmd).append(": ");

            int paramIndex = 0;
            boolean containsChat = false;

            while (dis.available() > 0) {
                int type = dis.read();
                if (type == -1) break;

                if (paramIndex > 0) sb.append(", ");
                sb.append("p").append(paramIndex).append("=");

                switch (type) {
                    case 1:
                    case 3: {
                        short sVal = dis.readShort();
                        sb.append("short(").append(sVal).append(")");
                        break;
                    }
                    case 2: {
                        byte bVal = dis.readByte();
                        sb.append("byte(").append(bVal).append(")");
                        break;
                    }
                    case 4:
                    case 5: {
                        int iVal = dis.readInt();
                        sb.append("int(").append(iVal).append(")");
                        break;
                    }
                    case 6: {
                        int len = dis.readShort();
                        if (len >= 0 && len <= dis.available()) {
                            byte[] strBytes = new byte[len];
                            dis.readFully(strBytes);
                            String sVal = new String(strBytes, "UTF-8");
                            if (isChatOrTrashMessage(sVal)) {
                                containsChat = true;
                            }
                            sb.append("str(\"").append(sVal).append("\")");
                        } else {
                            sb.append("str(invalid_len=").append(len).append(")");
                        }
                        break;
                    }
                    case 7: {
                        int len = dis.readShort();
                        if (len >= 0 && len <= dis.available()) {
                            byte[] bArr = new byte[len];
                            dis.readFully(bArr);
                            sb.append("bytes(len=").append(len).append(")");
                        } else {
                            sb.append("bytes(invalid_len=").append(len).append(")");
                        }
                        break;
                    }
                    default: {
                        sb.append("unknown_type(").append(type).append(")");
                        break;
                    }
                }
                paramIndex++;
            }

            if (containsChat) {
                return;
            }

            // Thêm raw bytes dạng mảng để người dùng / AI dễ dàng copy tạo packet mod
            sb.append(" | raw=[");
            for (int i = 0; i < data.length; i++) {
                if (i > 0) sb.append(", ");
                sb.append(data[i]);
            }
            sb.append("]");

            String fullLog = sb.toString();
            System.out.println(fullLog);
            logDebug(fullLog);

        } catch (Throwable t) {
            StringBuffer rawSb = new StringBuffer("[SEND] rawBytes=[");
            for (int i = 0; i < data.length; i++) {
                if (i > 0) rawSb.append(", ");
                rawSb.append(data[i]);
            }
            rawSb.append("]");
            logDebug(rawSb.toString());
        }
    }

    /**
     * Ghi nhận và phân tích chi tiết gói tin nhận từ máy chủ [RECV] (Command ID, Parameters)
     */
    public static void logRecvPacket(int cmd, Vector params) {
        if (params == null) return;

        // CHỈ ghi log các command quan trọng dùng để mod
        if (!isImportantCmd(cmd)) {
            return;
        }

        StringBuffer sb = new StringBuffer();
        sb.append("[RECV] CMD=").append(cmd).append(" (pCount=").append(params.size()).append("): ");

        boolean containsChat = false;
        for (int i = 0; i < params.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append("p").append(i).append("=");
            Object obj = params.elementAt(i);
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof an) {
                sb.append("int(").append(((an)obj).a).append(")");
            } else if (obj instanceof ba) {
                sb.append("short(").append(((ba)obj).a).append(")");
            } else if (obj instanceof t) {
                sb.append("byte(").append(((t)obj).a).append(")");
            } else if (obj instanceof j) {
                String strVal = obj.toString();
                if (isChatOrTrashMessage(strVal)) {
                    containsChat = true;
                }
                sb.append("str(\"").append(strVal).append("\")");
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[])obj;
                sb.append("bytes(len=").append(bArr.length).append(")");
            } else {
                sb.append(obj.getClass().getName()).append("(").append(obj.toString()).append(")");
            }
        }

        if (containsChat) {
            return;
        }

        String fullLog = sb.toString();
        System.out.println(fullLog);
        logDebug(fullLog);
    }

    /**
     * Teleport tức thì đến vị trí của Đội trưởng (Packet 4, -110, 3, 0, 6, 2, 1).
     */
    public static void teleToLeader() {
        System.out.println("[AutoMenu] >>> Teleporting to team leader position...");
        logDebug("[Action] Clicked Tele To Leader button");
        try {
            MCT.sendBytes(new byte[]{4, (byte)-110, 3, 0, 6, 2, 1});
        } catch (Throwable t) {
            System.out.println("[AutoMenu] teleToLeader error: " + t);
        }
        try { f.a(21); } catch (Throwable t) {}
        try { f.a(22); } catch (Throwable t) {}
        try { f.a(20); } catch (Throwable t) {}
    }

    /**
     * Kiểm tra một vật phẩm trang bị xem có phải loại Chưa giám định không.
     */
    public static boolean isUnidentified(Object item) {
        if (item == null) return false;
        String name = MCT.getItemName(item);
        if (name != null) {
            String norm = normalize(name);
            if (norm.indexOf("chua giam dinh") != -1 || norm.indexOf("chua xac dinh") != -1 || norm.indexOf("giam dinh") != -1) {
                return true;
            }
        }
        String str = MCT.getAfString(item);
        if (str != null) {
            String normStr = normalize(str);
            if (normStr.indexOf("chua giam dinh") != -1 || normStr.indexOf("chua xac dinh") != -1 || normStr.indexOf("giam dinh") != -1) {
                return true;
            }
        }
        return false;
    }

    /**
     * Vứt các loại vật phẩm rác khỏi hành trang (MCT.getBagVector()) bằng packet 1033.
     */
    public static void dropTrash(final int type) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    Vector bag = MCT.getBagVector();
                    String optName = (type >= 0 && type < TRASH_OPTIONS.length) ? TRASH_OPTIONS[type] : ("Type " + type);
                    int bagSize = (bag != null) ? bag.size() : 0;
                    logDebug("[DropTrash] Starting " + optName + " (Bag size=" + bagSize + ")");
                    System.out.println("[DropTrash] Starting " + optName + " (Bag size=" + bagSize + ")");

                    if (bag == null || bagSize == 0) {
                        logDebug("[DropTrash] Hanh trang trong hoac chua dong bo!");
                        return;
                    }

                    int droppedCount = 0;
                    for (int i = bag.size() - 1; i >= 0; i--) {
                        Object item = bag.elementAt(i);
                        if (item != null) {
                            String name = MCT.getItemName(item);
                            if (name == null) name = "";
                            String norm = normalize(name);
                            int itemId = MCT.getItemId(item);
                            int count = MCT.getItemCount(item);
                            if (count <= 0) count = 1;

                            boolean match = false;

                            if (type == 0) {
                                // 1. Vứt đồ chưa giám định
                                match = isUnidentified(item);
                            } else if (type == 1) {
                                // 2. Vứt đay
                                match = (norm.indexOf("day") != -1 || norm.indexOf("vai day") != -1 || norm.indexOf("co day") != -1 || norm.indexOf("gai") != -1);
                            } else if (type == 2) {
                                // 3. Vứt tơ
                                match = (norm.indexOf("to") != -1 || norm.indexOf("to tam") != -1 || norm.indexOf("soi to") != -1);
                            } else if (type == 3) {
                                // 4. Vứt da sống
                                match = (norm.indexOf("da song") != -1 || (norm.indexOf("da") != -1 && norm.indexOf("song") != -1) || norm.indexOf("da tho") != -1 || norm.indexOf("da thu") != -1);
                            } else if (type == 4) {
                                // 5. Vứt da nhẹ
                                match = (norm.indexOf("da nhe") != -1 || (norm.indexOf("da") != -1 && norm.indexOf("nhe") != -1));
                            } else if (type == 5) {
                                // 6. Vứt khoáng thạch
                                match = (norm.indexOf("khoang thach") != -1 || norm.indexOf("khoang") != -1 || norm.indexOf("quang") != -1 || norm.indexOf("thach") != -1);
                            } else if (type == 6) {
                                // 7. Vứt bạch dược
                                match = (norm.indexOf("bach duoc") != -1 || norm.indexOf("duoc") != -1 || norm.indexOf("thuoc") != -1);
                            }

                            if (match) {
                                logDebug("[DropTrash] -> Phat hien '" + name + "' (id=" + itemId + ", count=" + count + ") -> Gui CMD 1009");
                                System.out.println("[DropTrash] Dropping '" + name + "' (id=" + itemId + ", count=" + count + ")");
                                try {
                                    MCT.dropItem(itemId, count);
                                    droppedCount++;
                                    Thread.sleep(120);
                                } catch (Throwable t) {
                                    logDebug("[DropTrash] Drop packet error: " + t);
                                }
                            }
                        }
                    }
                    logDebug("[DropTrash] Hoan tat: Da gui lenh vut " + droppedCount + " o vat pham.");
                    System.out.println("[DropTrash] Completed dropping " + droppedCount + " items for option " + type);
                } catch (Throwable t) {
                    logDebug("[DropTrash] Exception: " + t);
                    System.out.println("[DropTrash] Exception: " + t);
                }
            }
        }).start();
    }

    /**
     * Vòng lặp chạy ngầm cho Auto Nông Trường (Trang viên).
     */
    private static Thread autoFarmThread;
    public static void startAutoFarmLoop() {
        if (!isAutoFarm) return;
        if (autoFarmThread != null && autoFarmThread.isAlive()) return;

        autoFarmThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("[AutoFarm] Loop started. isAutoFarm=" + isAutoFarm + ", plant=" + autoPlantEnabled + ", harvest=" + autoHarvestEnabled);
                // Tự động gửi gói tin vào trang viên (CMD 1312, Sub=13, PlayerID)
                try {
                    int myId = MCT.getPlayerId();
                    if (myId > 0) {
                        MCT.enterManor(myId);
                    }
                    Thread.sleep(1500);
                } catch (Throwable t) {}

                while (isAutoFarm) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ie) {
                        break;
                    } catch (Throwable t) {
                        try { Thread.sleep(2000); } catch (Throwable t2) {}
                    }
                }
                System.out.println("[AutoFarm] Loop stopped.");
            }
        });
        autoFarmThread.start();
    }

    /**
     * Vòng lặp chạy ngầm cho Auto Train:
     * Định kỳ quét hành trang để vứt các loại rác đã chọn và tự động nhặt đá.
     */
    private static Thread autoTrainThread;
    public static void startAutoTrainLoop() {
        if (!trainAutoPickStone && !trainDropDay && !trainDropTo && !trainDropDaSong && !trainDropDaNhe && !trainDropRangRoi && !trainDropDocNhen) {
            return;
        }
        if (autoTrainThread != null && autoTrainThread.isAlive()) {
            return;
        }
        autoTrainThread = new Thread(new Runnable() {
            public void run() {
                System.out.println("[AutoTrain] Background loop started.");
                while (trainAutoPickStone || trainDropDay || trainDropTo || trainDropDaSong || trainDropDaNhe || trainDropRangRoi || trainDropDocNhen) {
                    try {
                        // 1. Quét hành trang và tự động vứt các loại rác đã bật
                        cleanTrainTrash();

                        // 2. Tự động nhặt đá nếu bật
                        if (trainAutoPickStone) {
                            pickNearbyStones();
                        }

                        Thread.sleep(1500);
                    } catch (InterruptedException ie) {
                        break;
                    } catch (Throwable t) {
                        try { Thread.sleep(2000); } catch (Throwable t2) {}
                    }
                }
                System.out.println("[AutoTrain] Background loop stopped.");
            }
        });
        autoTrainThread.start();
    }

    public static void cleanTrainTrash() {
        if (!trainDropDay && !trainDropTo && !trainDropDaSong && !trainDropDaNhe && !trainDropRangRoi && !trainDropDocNhen) {
            return;
        }
        try {
            Vector bag = MCT.getBagVector();
            if (bag == null || bag.size() == 0) return;

            for (int i = bag.size() - 1; i >= 0; i--) {
                Object item = bag.elementAt(i);
                if (item == null) continue;

                String name = MCT.getItemName(item);
                if (name == null) name = "";
                String norm = normalize(name);
                boolean shouldDrop = false;

                if (trainDropDay && (norm.indexOf("day") != -1 || norm.indexOf("vai day") != -1 || norm.indexOf("co day") != -1)) {
                    shouldDrop = true;
                } else if (trainDropTo && (norm.indexOf("to") != -1 || norm.indexOf("to tam") != -1 || norm.indexOf("soi to") != -1)) {
                    shouldDrop = true;
                } else if (trainDropDaSong && norm.indexOf("da song") != -1) {
                    shouldDrop = true;
                } else if (trainDropDaNhe && norm.indexOf("da nhe") != -1) {
                    shouldDrop = true;
                } else if (trainDropRangRoi && (norm.indexOf("rang roi") != -1 || norm.indexOf("rang doi") != -1 || norm.indexOf("rang") != -1)) {
                    shouldDrop = true;
                } else if (trainDropDocNhen && (norm.indexOf("doc nhen") != -1 || norm.indexOf("tinh doc") != -1 || norm.indexOf("doc") != -1)) {
                    shouldDrop = true;
                }

                if (shouldDrop) {
                    int itemId = MCT.getItemId(item);
                    int count = MCT.getItemCount(item);
                    if (count <= 0) count = 1;
                    System.out.println("[AutoTrain] Discarding trash: '" + name + "' (id=" + itemId + ", count=" + count + ")");
                    MCT.dropItem(itemId, count);
                    Thread.sleep(120);
                }
            }
        } catch (Throwable t) {}
    }

    public static void pickNearbyStones() {
        try {
            Vector list = MCT.getEntityList();
            if (list != null) {
                for (int i = list.size() - 1; i >= 0; i--) {
                    Object obj = list.elementAt(i);
                    if (obj == null) continue;
                    String name = MCT.getEntityName(obj);
                    if (name == null) continue;
                    String norm = normalize(name);
                    if (norm.indexOf("da") != -1 || norm.indexOf("khoang") != -1 || norm.indexOf("quang") != -1 || norm.indexOf("thach") != -1) {
                        int x = MCT.getEntityX(obj);
                        int y = MCT.getEntityY(obj);
                        int id = MCT.getEntityId(obj);
                        MCT.moveTo(x, y);
                        u.a(0, id, (short)x, (short)y, (short)0);
                        break;
                    }
                }
            }
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
                                    isFightingBoss = true;
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
                                isFightingBoss = false;
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

        // Bỏ qua hoàn toàn tin nhắn chat và tin nhắn rác (KHÔNG in console, KHÔNG lưu file)
        if (isChatOrTrashMessage(msg)) {
            return;
        }

        // CHỈ in console log và lưu log debug.txt đối với các command/thông điệp quan trọng dùng để mod
        if (isImportantServerMessage(msg)) {
            System.out.println("[ServerMsg-Mod] " + msg);
            logDebug(msg);
        }

        String norm = normalize(msg);

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
        } else if (currentScreen == SCREEN_TRASH) {
            title = "V\u1ee9t \u0111\u1ed3 r\u00e1c";
        } else if (currentScreen == SCREEN_TRAIN) {
            title = "Auto Train";
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
            int gap = 2;
            int mBtnH = (h - headerH - 35) / 8;
            if (mBtnH < 15) mBtnH = 15;
            if (mBtnH > 18) mBtnH = 18;

            // 1. Auto Nông Trường
            int btnFarmY = contentTop;
            String farmBtnText = isAutoFarm ? "Auto N\u00f4ng Tr\u01b0\u1eddng [B\u1eacT]" : "Auto N\u00f4ng Tr\u01b0\u1eddng";
            int farmBtnBg = isAutoFarm ? 0x1E4A28 : 0x3B2D1D;
            int farmBtnBorder = isAutoFarm ? 0x4E9F3D : 0xE5A93C;
            int farmBtnTextColor = isAutoFarm ? 0xD8E9A8 : 0xFFF799;
            drawButton(g, font, farmBtnText, btnX, btnFarmY, btnW, mBtnH, farmBtnBg, farmBtnBorder, farmBtnTextColor);

            // 2. Auto Phụ Bản
            int btnDungeonY = btnFarmY + mBtnH + gap;
            String dBtnText = isAutoPhuBan ? "Auto Ph\u1ee5 B\u1ea3n [B\u1eacT]" : "Auto Ph\u1ee5 B\u1ea3n";
            int dBtnBg = isAutoPhuBan ? 0x1E4A28 : 0x3B2D1D;
            int dBtnBorder = isAutoPhuBan ? 0x4E9F3D : 0xE5A93C;
            int dBtnTextColor = isAutoPhuBan ? 0xD8E9A8 : 0xFFF799;
            drawButton(g, font, dBtnText, btnX, btnDungeonY, btnW, mBtnH, dBtnBg, dBtnBorder, dBtnTextColor);

            // 3. Auto Train
            int btnTrainY = btnDungeonY + mBtnH + gap;
            boolean trainRunning = (trainAutoPickStone || trainDropDay || trainDropTo || trainDropDaSong || trainDropDaNhe || trainDropRangRoi || trainDropDocNhen);
            String trainBtnText = trainRunning ? "Auto Train [B\u1eacT]" : "Auto Train";
            int trainBtnBg = trainRunning ? 0x1E4A28 : 0x3B2D1D;
            int trainBtnBorder = trainRunning ? 0x4E9F3D : 0xE5A93C;
            int trainBtnTextColor = trainRunning ? 0xD8E9A8 : 0xFFF799;
            drawButton(g, font, trainBtnText, btnX, btnTrainY, btnW, mBtnH, trainBtnBg, trainBtnBorder, trainBtnTextColor);

            // 4. Tele đến vị trí đội trưởng
            int btnTeleY = btnTrainY + mBtnH + gap;
            drawButton(g, font, "Tele \u0111\u1ebfn \u0111\u1ed9i tr\u01b0\u1edfng", btnX, btnTeleY, btnW, mBtnH, 0x1C3144, 0x3F88C5, 0xE0F0FF);

            // 5. Vứt đồ rác
            int btnTrashY = btnTeleY + mBtnH + gap;
            drawButton(g, font, "V\u1ee9t \u0111\u1ed3 r\u00e1c", btnX, btnTrashY, btnW, mBtnH, 0x4A2828, 0xE5A93C, 0xFFF799);

            // 6. Auto Đánh [BẬT / TẮT]
            int btnFightY = btnTrashY + mBtnH + gap;
            String fightText = "Auto \u0110\u00e1nh: [" + (autoFightEnabled ? "B\u1eacT" : "T\u1eaeT") + "]";
            int fightBg = autoFightEnabled ? 0x1E4A28 : 0x4A2828;
            int fightBorder = autoFightEnabled ? 0x4E9F3D : 0x9E2A2B;
            int fightTextColor = autoFightEnabled ? 0xD8E9A8 : 0xFFD0D0;
            drawButton(g, font, fightText, btnX, btnFightY, btnW, mBtnH, fightBg, fightBorder, fightTextColor);

            // 7. Cài đặt Chiêu đánh (Skill Combo)
            int btnSkillY = btnFightY + mBtnH + gap;
            String skillLabel = "Chi\u00eau: [" + skillString + "]";
            if (font.stringWidth(skillLabel) > btnW - 6) {
                skillLabel = "Chi\u00eau \u0111\u00e1nh: [S\u1eeda]";
            }
            drawButton(g, font, skillLabel, btnX, btnSkillY, btnW, mBtnH, 0x2A2016, 0xE5A93C, 0xFFF799);

            // 8. Tốc độ Game (Speed Hack)
            int btnSpeedY = btnSkillY + mBtnH + gap;
            String speedText = "T\u1ed1c \u0111\u1ed9 Game: " + speedMultiplier + "x";
            int speedBg = speedMultiplier > 1 ? 0x1C3144 : 0x3B2D1D;
            int speedBorder = speedMultiplier > 1 ? 0x3F88C5 : 0xE5A93C;
            int speedTextColor = speedMultiplier > 1 ? 0xE0F0FF : 0xFFF799;
            drawButton(g, font, speedText, btnX, btnSpeedY, btnW, mBtnH, speedBg, speedBorder, speedTextColor);

            // Bottom [Dong] button
            int closeBtnW = Math.min(70, w - 30);
            int closeBtnH = 19;
            int closeBtnX = x + (w - closeBtnW) / 2;
            int closeBtnY = y + h - closeBtnH - 6;
            drawButton(g, font, "\u0110\u00f3ng", closeBtnX, closeBtnY, closeBtnW, closeBtnH, 0x4A3728, 0xE5A93C, 0xFFF799);

        } else if (currentScreen == SCREEN_FARM) {
            int itemH = 17;
            int itemGap = 4;
            int listStartY = contentTop + 6;

            // 1. Tùy chọn Tự động trồng cây
            int btnPlantY = listStartY;
            String plantText = "1. T\u1ef1 \u0111\u1ed9ng tr\u1ed3ng c\u00e2y: [" + (autoPlantEnabled ? "B\u1eacT" : "T\u1eaeT") + "]";
            int plantBg = autoPlantEnabled ? 0x1E4A28 : 0x2A2016;
            int plantBorder = autoPlantEnabled ? 0x4E9F3D : 0x5C462C;
            int plantTextColor = autoPlantEnabled ? 0xD8E9A8 : 0xFFF799;
            drawButton(g, font, plantText, btnX, btnPlantY, btnW, itemH, plantBg, plantBorder, plantTextColor);

            // 2. Tùy chọn Tự động thu hoạch
            int btnHarvestY = btnPlantY + itemH + itemGap;
            String harvestText = "2. T\u1ef1 \u0111\u1ed9ng thu ho\u1ea1ch: [" + (autoHarvestEnabled ? "B\u1eacT" : "T\u1eaeT") + "]";
            int harvestBg = autoHarvestEnabled ? 0x1E4A28 : 0x2A2016;
            int harvestBorder = autoHarvestEnabled ? 0x4E9F3D : 0x5C462C;
            int harvestTextColor = autoHarvestEnabled ? 0xD8E9A8 : 0xFFF799;
            drawButton(g, font, harvestText, btnX, btnHarvestY, btnW, itemH, harvestBg, harvestBorder, harvestTextColor);

            // Row 1: [START FARM / STOP FARM] button
            int actBtnH = 21;
            int actBtnY = y + h - 48;
            String startText = isAutoFarm ? "STOP FARM" : "START FARM";
            int startBg = isAutoFarm ? 0x8B0000 : 0x1E4A28;
            int startBorder = isAutoFarm ? 0xFF4D4D : 0x4E9F3D;
            int startTextColor = isAutoFarm ? 0xFFFFFF : 0xD8E9A8;
            drawButton(g, font, startText, btnX, actBtnY, btnW, actBtnH, startBg, startBorder, startTextColor);

            // Row 2: [Quay lại] and [Đóng]
            int navBtnH = 18;
            int navBtnY = y + h - 22;
            int navBtnW = (w - 26) / 2;

            int backBtnX = x + 9;
            drawButton(g, font, "Quay l\u1ea1i", backBtnX, navBtnY, navBtnW, navBtnH, 0x3B2D1D, 0xE5A93C, 0xFFF799);

            int closeBtnX = backBtnX + navBtnW + 8;
            drawButton(g, font, "\u0110\u00f3ng", closeBtnX, navBtnY, navBtnW, navBtnH, 0x4A3728, 0xE5A93C, 0xFFF799);

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

            // Row 1: [START / STOP]
            int actBtnH = 19;
            int actBtnY = y + h - 44;
            String startText = isAutoPhuBan ? "STOP" : "START";
            int startBg = isAutoPhuBan ? 0x8B0000 : 0x1E4A28;
            int startBorder = isAutoPhuBan ? 0xFF4D4D : 0x4E9F3D;
            int startTextColor = isAutoPhuBan ? 0xFFFFFF : 0xD8E9A8;
            drawButton(g, font, startText, btnX, actBtnY, btnW, actBtnH, startBg, startBorder, startTextColor);

            // Row 2: [Quay lại] and [Đóng]
            int navBtnH = 18;
            int navBtnY = y + h - 22;
            int navBtnW = (w - 26) / 2;

            int backBtnX = x + 9;
            drawButton(g, font, "Quay l\u1ea1i", backBtnX, navBtnY, navBtnW, navBtnH, 0x3B2D1D, 0xE5A93C, 0xFFF799);

            int closeBtnX = backBtnX + navBtnW + 8;
            drawButton(g, font, "\u0110\u00f3ng", closeBtnX, navBtnY, navBtnW, navBtnH, 0x4A3728, 0xE5A93C, 0xFFF799);

        } else if (currentScreen == SCREEN_TRASH) {
            int itemH = 15;
            int itemGap = 2;
            int listStartY = contentTop + 1;

            for (int i = 0; i < TRASH_OPTIONS.length; i++) {
                int itemY = listStartY + i * (itemH + itemGap);
                boolean isSelected = (i == selectedTrashOption);
                int itemBg = isSelected ? 0x1E4A28 : 0x2A2016;
                int itemBorder = isSelected ? 0x4E9F3D : 0x5C462C;
                int itemTextColor = isSelected ? 0xD8E9A8 : 0xFFF799;
                String label = (isSelected ? "> " : "") + TRASH_OPTIONS[i] + (isSelected ? " [CH\u1eccN]" : "");
                drawButton(g, font, label, btnX, itemY, btnW, itemH, itemBg, itemBorder, itemTextColor);
            }

            // Row 1: [XÁC NHẬN VỨT] button
            int actBtnH = 21;
            int actBtnY = y + h - 48;
            String confirmText = "X\u00c1C NH\u1eacN V\u1ee8T";
            if (selectedTrashOption >= 0 && selectedTrashOption < TRASH_OPTIONS.length) {
                confirmText = "X\u00c1C NH\u1eacN: " + TRASH_OPTIONS[selectedTrashOption];
                if (font.stringWidth(confirmText) > btnW - 6) {
                    confirmText = "X\u00c1C NH\u1eacN V\u1ee8T [" + (selectedTrashOption + 1) + "]";
                }
            }
            int confirmBg = 0x8B0000;
            int confirmBorder = 0xFF4D4D;
            int confirmTextColor = 0xFFFFFF;
            drawButton(g, font, confirmText, btnX, actBtnY, btnW, actBtnH, confirmBg, confirmBorder, confirmTextColor);

            // Row 2: [Quay lại] and [Đóng]
            int navBtnH = 18;
            int navBtnY = y + h - 22;
            int navBtnW = (w - 26) / 2;

            int backBtnX = x + 9;
            drawButton(g, font, "Quay l\u1ea1i", backBtnX, navBtnY, navBtnW, navBtnH, 0x3B2D1D, 0xE5A93C, 0xFFF799);

            int closeBtnX = backBtnX + navBtnW + 8;
            drawButton(g, font, "\u0110\u00f3ng", closeBtnX, navBtnY, navBtnW, navBtnH, 0x4A3728, 0xE5A93C, 0xFFF799);

        } else if (currentScreen == SCREEN_TRAIN) {
            int itemH = 15;
            int itemGap = 2;
            int listStartY = contentTop + 1;

            // 7 Tùy chọn Nhặt đá & Vứt rác
            for (int i = 0; i < TRAIN_SETTINGS.length; i++) {
                int itemY = listStartY + i * (itemH + itemGap);
                boolean isVal = false;
                String label = "";
                if (i == 0) {
                    isVal = trainAutoPickStone;
                    label = "1. T\u1ef1 \u0111\u1ed9ng nh\u1eb7t \u0111\u00e1: [" + (isVal ? "B\u1eacT" : "T\u1eaeT") + "]";
                } else if (i == 1) {
                    isVal = trainDropDay;
                    label = "2. V\u1ee9t \u0111ay: [" + (isVal ? "B\u1eacT" : "T\u1eaeT") + "]";
                } else if (i == 2) {
                    isVal = trainDropTo;
                    label = "3. V\u1ee9t t\u01a1: [" + (isVal ? "B\u1eacT" : "T\u1eaeT") + "]";
                } else if (i == 3) {
                    isVal = trainDropDaSong;
                    label = "4. V\u1ee9t da s\u1ed1ng: [" + (isVal ? "B\u1eacT" : "T\u1eaeT") + "]";
                } else if (i == 4) {
                    isVal = trainDropDaNhe;
                    label = "5. V\u1ee9t da nh\u1eb9: [" + (isVal ? "B\u1eacT" : "T\u1eaeT") + "]";
                } else if (i == 5) {
                    isVal = trainDropRangRoi;
                    label = "6. V\u1ee9t r\u0103ng r\u01a1i: [" + (isVal ? "B\u1eacT" : "T\u1eaeT") + "]";
                } else if (i == 6) {
                    isVal = trainDropDocNhen;
                    label = "7. V\u1ee9t \u0111\u1ed9c nh\u1ec7n: [" + (isVal ? "B\u1eacT" : "T\u1eaeT") + "]";
                }
                int itemBg = isVal ? 0x1E4A28 : 0x2A2016;
                int itemBorder = isVal ? 0x4E9F3D : 0x5C462C;
                int itemTextColor = isVal ? 0xD8E9A8 : 0xFFF799;
                drawButton(g, font, label, btnX, itemY, btnW, itemH, itemBg, itemBorder, itemTextColor);
            }

            // Button: Cài đặt Chiêu đánh riêng cho Auto Train
            int trainSkillY = listStartY + 7 * (itemH + itemGap);
            String tSkillLabel = "Chi\u00eau Train: [" + trainSkillString + "]";
            if (font.stringWidth(tSkillLabel) > btnW - 6) {
                tSkillLabel = "Chi\u00eau Train: [S\u1eeda]";
            }
            drawButton(g, font, tSkillLabel, btnX, trainSkillY, btnW, itemH, 0x2A2016, 0xE5A93C, 0xFFF799);

            // Row 1: [START TRAIN / STOP TRAIN]
            int actBtnH = 19;
            int actBtnY = y + h - 44;
            String startText = isAutoTrain ? "STOP TRAIN" : "START TRAIN";
            int startBg = isAutoTrain ? 0x8B0000 : 0x1E4A28;
            int startBorder = isAutoTrain ? 0xFF4D4D : 0x4E9F3D;
            int startTextColor = isAutoTrain ? 0xFFFFFF : 0xD8E9A8;
            drawButton(g, font, startText, btnX, actBtnY, btnW, actBtnH, startBg, startBorder, startTextColor);

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
            int gap = 2;
            int mBtnH = (h - headerH - 35) / 8;
            if (mBtnH < 15) mBtnH = 15;
            if (mBtnH > 18) mBtnH = 18;

            // 1. Click "Auto Nông Trường"
            int btnFarmY = contentTop;
            if (px >= btnX && px <= btnX + btnW && py >= btnFarmY && py <= btnFarmY + mBtnH) {
                currentScreen = SCREEN_FARM;
                return true;
            }

            // 2. Click "Auto Phụ Bản"
            int btnDungeonY = btnFarmY + mBtnH + gap;
            if (px >= btnX && px <= btnX + btnW && py >= btnDungeonY && py <= btnDungeonY + mBtnH) {
                currentScreen = SCREEN_DUNGEON;
                return true;
            }

            // 3. Click "Auto Train"
            int btnTrainY = btnDungeonY + mBtnH + gap;
            if (px >= btnX && px <= btnX + btnW && py >= btnTrainY && py <= btnTrainY + mBtnH) {
                currentScreen = SCREEN_TRAIN;
                return true;
            }

            // 4. Click "Tele đến vị trí đội trưởng"
            int btnTeleY = btnTrainY + mBtnH + gap;
            if (px >= btnX && px <= btnX + btnW && py >= btnTeleY && py <= btnTeleY + mBtnH) {
                System.out.println("[AutoMenu] 'Tele đến đội trưởng' clicked!");
                teleToLeader();
                show = false;
                return true;
            }

            // 5. Click "Vứt đồ rác"
            int btnTrashY = btnTeleY + mBtnH + gap;
            if (px >= btnX && px <= btnX + btnW && py >= btnTrashY && py <= btnTrashY + mBtnH) {
                currentScreen = SCREEN_TRASH;
                if (selectedTrashOption < 0) {
                    selectedTrashOption = 1; // Mặc định chọn 2. Vứt đay
                }
                return true;
            }

            // 6. Click "Auto Đánh [BẬT / TẮT]"
            int btnFightY = btnTrashY + mBtnH + gap;
            if (px >= btnX && px <= btnX + btnW && py >= btnFightY && py <= btnFightY + mBtnH) {
                autoFightEnabled = !autoFightEnabled;
                System.out.println("[AutoMenu] Toggle autoFightEnabled: " + autoFightEnabled);
                if (!autoFightEnabled) {
                    try { MCT.setAutoFight(false); } catch (Throwable t) {}
                } else {
                    startAutoSkillLoop();
                }
                return true;
            }

            // 7. Click "Cài đặt Chiêu đánh"
            int btnSkillY = btnFightY + mBtnH + gap;
            if (px >= btnX && px <= btnX + btnW && py >= btnSkillY && py <= btnSkillY + mBtnH) {
                openSkillInput();
                return true;
            }

            // 8. Click "Tốc độ Game"
            int btnSpeedY = btnSkillY + mBtnH + gap;
            if (px >= btnX && px <= btnX + btnW && py >= btnSpeedY && py <= btnSpeedY + mBtnH) {
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
            int itemH = 17;
            int itemGap = 4;
            int listStartY = contentTop + 6;

            // 1. Click "Tự động trồng cây" toggle
            int btnPlantY = listStartY;
            if (px >= btnX - 4 && px <= btnX + btnW + 4 && py >= btnPlantY - 2 && py <= btnPlantY + itemH + 2) {
                autoPlantEnabled = !autoPlantEnabled;
                System.out.println("[AutoMenu] Toggle autoPlantEnabled: " + autoPlantEnabled);
                return true;
            }

            // 2. Click "Tự động thu hoạch" toggle
            int btnHarvestY = btnPlantY + itemH + itemGap;
            if (px >= btnX - 4 && px <= btnX + btnW + 4 && py >= btnHarvestY - 2 && py <= btnHarvestY + itemH + 2) {
                autoHarvestEnabled = !autoHarvestEnabled;
                System.out.println("[AutoMenu] Toggle autoHarvestEnabled: " + autoHarvestEnabled);
                return true;
            }

            // Row 1: Click [START FARM / STOP FARM]
            int actBtnH = 21;
            int actBtnY = y + h - 48;
            if (px >= btnX - 6 && px <= btnX + btnW + 6 && py >= actBtnY - 6 && py <= actBtnY + actBtnH + 6) {
                isAutoFarm = !isAutoFarm;
                System.out.println("[AutoMenu] Toggle isAutoFarm: " + isAutoFarm);
                logDebug("[Action] Clicked " + (isAutoFarm ? "START FARM" : "STOP FARM"));
                if (isAutoFarm) {
                    startAutoFarmLoop();
                    show = false;
                }
                return true;
            }

            // Row 2: [Quay lại] and [Đóng]
            int navBtnH = 18;
            int navBtnY = y + h - 22;
            int navBtnW = (w - 26) / 2;

            int backBtnX = x + 9;
            // Click [Quay lại]
            if (px >= backBtnX - 6 && px <= backBtnX + navBtnW + 6 && py >= navBtnY - 6 && py <= navBtnY + navBtnH + 6) {
                currentScreen = SCREEN_MAIN;
                return true;
            }

            int closeBtnX = backBtnX + navBtnW + 8;
            // Click [Đóng]
            if (px >= closeBtnX - 6 && px <= closeBtnX + navBtnW + 6 && py >= navBtnY - 6 && py <= navBtnY + navBtnH + 6) {
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
                } else {
                    startAutoSkillLoop();
                }
                return true;
            }

            // Click "Cài đặt Chiêu đánh" button trong menu phụ bản
            int skillBtnY = fightBtnY + itemH + 2;
            if (px >= btnX && px <= btnX + btnW && py >= skillBtnY && py <= skillBtnY + itemH) {
                openSkillInput();
                return true;
            }

            // Row 1: Click [START / STOP] -> START BẮT ĐẦU TỪ CỔNG PHỤ BẢN VÀ VÀO ẢI THEO CẤP ĐỘ ĐÃ CHỌN
            int actBtnH = 19;
            int actBtnY = y + h - 44;
            if (px >= btnX - 4 && px <= btnX + btnW + 4 && py >= actBtnY - 4 && py <= actBtnY + actBtnH + 4) {
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

        } else if (currentScreen == SCREEN_TRASH) {
            int itemH = 15;
            int itemGap = 2;
            int listStartY = contentTop + 1;

            // Click 7 trash drop options
            for (int i = 0; i < TRASH_OPTIONS.length; i++) {
                int itemY = listStartY + i * (itemH + itemGap);
                if (px >= btnX - 4 && px <= btnX + btnW + 4 && py >= itemY - 2 && py <= itemY + itemH + 2) {
                    selectedTrashOption = i;
                    System.out.println("[AutoMenu] Selected Trash Option " + i + ": " + TRASH_OPTIONS[i]);
                    return true;
                }
            }

            // Click [XÁC NHẬN VỨT] button
            int actBtnH = 21;
            int actBtnY = y + h - 48;
            if (px >= btnX - 6 && px <= btnX + btnW + 6 && py >= actBtnY - 6 && py <= actBtnY + actBtnH + 6) {
                if (selectedTrashOption < 0 || selectedTrashOption >= TRASH_OPTIONS.length) {
                    selectedTrashOption = 1; // Mặc định vứt đay
                }
                System.out.println("[AutoMenu] >>> Clicked 'Xác Nhận Vứt' for option " + selectedTrashOption + ": " + TRASH_OPTIONS[selectedTrashOption]);
                logDebug("[Action] Clicked Confirm Drop Trash: " + TRASH_OPTIONS[selectedTrashOption]);
                dropTrash(selectedTrashOption);
                return true;
            }

            int navBtnH = 18;
            int navBtnY = y + h - 22;
            int navBtnW = (w - 26) / 2;

            int backBtnX = x + 9;
            // Click [Quay lại]
            if (px >= backBtnX - 6 && px <= backBtnX + navBtnW + 6 && py >= navBtnY - 6 && py <= navBtnY + navBtnH + 6) {
                currentScreen = SCREEN_MAIN;
                return true;
            }

            int closeBtnX = backBtnX + navBtnW + 8;
            // Click [Đóng]
            if (px >= closeBtnX - 6 && px <= closeBtnX + navBtnW + 6 && py >= navBtnY - 6 && py <= navBtnY + navBtnH + 6) {
                show = false;
                return true;
            }

        } else if (currentScreen == SCREEN_TRAIN) {
            int itemH = 15;
            int itemGap = 2;
            int listStartY = contentTop + 1;

            // Click 7 train options
            for (int i = 0; i < TRAIN_SETTINGS.length; i++) {
                int itemY = listStartY + i * (itemH + itemGap);
                if (px >= btnX && px <= btnX + btnW && py >= itemY && py <= itemY + itemH) {
                    if (i == 0) {
                        trainAutoPickStone = !trainAutoPickStone;
                        System.out.println("[AutoMenu] trainAutoPickStone: " + trainAutoPickStone);
                    } else if (i == 1) {
                        trainDropDay = !trainDropDay;
                        System.out.println("[AutoMenu] trainDropDay: " + trainDropDay);
                    } else if (i == 2) {
                        trainDropTo = !trainDropTo;
                        System.out.println("[AutoMenu] trainDropTo: " + trainDropTo);
                    } else if (i == 3) {
                        trainDropDaSong = !trainDropDaSong;
                        System.out.println("[AutoMenu] trainDropDaSong: " + trainDropDaSong);
                    } else if (i == 4) {
                        trainDropDaNhe = !trainDropDaNhe;
                        System.out.println("[AutoMenu] trainDropDaNhe: " + trainDropDaNhe);
                    } else if (i == 5) {
                        trainDropRangRoi = !trainDropRangRoi;
                        System.out.println("[AutoMenu] trainDropRangRoi: " + trainDropRangRoi);
                    } else if (i == 6) {
                        trainDropDocNhen = !trainDropDocNhen;
                        System.out.println("[AutoMenu] trainDropDocNhen: " + trainDropDocNhen);
                    }
                    if (isAutoTrain) {
                        startAutoTrainLoop();
                    }
                    return true;
                }
            }

            // Click ô cài đặt Chiêu đánh riêng cho Auto Train
            int trainSkillY = listStartY + 7 * (itemH + itemGap);
            if (px >= btnX && px <= btnX + btnW && py >= trainSkillY && py <= trainSkillY + itemH) {
                openTrainSkillInput();
                return true;
            }

            // Row 1: Click [START TRAIN / STOP TRAIN]
            int actBtnH = 19;
            int actBtnY = y + h - 44;
            if (px >= btnX - 4 && px <= btnX + btnW + 4 && py >= actBtnY - 4 && py <= actBtnY + actBtnH + 4) {
                if (!isAutoTrain) {
                    isAutoTrain = true;
                    System.out.println("[AutoMenu] START TRAIN clicked! isAutoTrain=true");
                    startAutoTrainLoop();
                    startAutoTrainSkillLoop();
                    show = false;
                } else {
                    isAutoTrain = false;
                    System.out.println("[AutoMenu] STOP TRAIN clicked! isAutoTrain=false");
                }
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
            // Click [Đóng]
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
