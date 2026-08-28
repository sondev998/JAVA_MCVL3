package a;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/** In-game Canvas popup menu triggered by .auto chat command. */
public final class AutoMenu {
    public static boolean show = false;

    public static final int SCREEN_MAIN = 0;
    public static final int SCREEN_FARM = 1;
    public static int currentScreen = SCREEN_MAIN;

    // Feature toggle states
    public static boolean autoPlantEnabled = false;
    public static boolean autoHarvestEnabled = false;

    /**
     * Checks if the message sent in-game matches the .auto command.
     * Called when the user clicks the "Gửi" button inside the game.
     */
    public static boolean checkCommand(String input) {
        if (input != null && ".auto".equalsIgnoreCase(input.trim())) {
            show = true;
            currentScreen = SCREEN_MAIN;
            // Close in-game chat dialogs so the game interface is clearly visible underneath
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
        int w = (screenW * 85) / 100;
        if (w < 180) w = Math.min(180, screenW);
        if (w > 260) w = 260;
        return w;
    }

    public static int getHeight() {
        int screenH = getScreenHeight();
        int h = (screenH * 60) / 100;
        if (h < 150) h = Math.min(150, screenH);
        if (h > 220) h = 220;
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
        String title = currentScreen == SCREEN_FARM ? "Auto N\u00f4ng Tr\u01b0\u1eddng" : "Menu Auto";
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

        int contentTop = y + headerH + 8;
        int btnW = w - 24;
        int btnH = 22;
        int btnX = x + 12;

        if (currentScreen == SCREEN_MAIN) {
            // Button: Auto Nông Trường
            int btnFarmY = contentTop + 10;
            drawButton(g, font, "Auto N\u00f4ng Tr\u01b0\u1eddng", btnX, btnFarmY, btnW, btnH, 0x3B2D1D, 0xE5A93C, 0xFFF799);

            // Bottom [Dong] button
            int closeBtnW = Math.min(70, w - 30);
            int closeBtnH = 20;
            int closeBtnX = x + (w - closeBtnW) / 2;
            int closeBtnY = y + h - closeBtnH - 6;
            drawButton(g, font, "\u0110\u00f3ng", closeBtnX, closeBtnY, closeBtnW, closeBtnH, 0x4A3728, 0xE5A93C, 0xFFF799);

        } else if (currentScreen == SCREEN_FARM) {
            // Button: Tự động trồng cây
            int btnPlantY = contentTop + 4;
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
            int backBtnX = x + 12;
            int backBtnY = y + h - backBtnH - 6;
            drawButton(g, font, "Quay l\u1ea1i", backBtnX, backBtnY, backBtnW, backBtnH, 0x3B2D1D, 0xE5A93C, 0xFFF799);

            // Bottom [Dong] button
            int closeBtnW = Math.min(70, (w - 30) / 2);
            int closeBtnH = 20;
            int closeBtnX = x + w - closeBtnW - 12;
            int closeBtnY = y + h - closeBtnH - 6;
            drawButton(g, font, "\u0110\u00f3ng", closeBtnX, closeBtnY, closeBtnW, closeBtnH, 0x4A3728, 0xE5A93C, 0xFFF799);
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

        int contentTop = y + headerH + 8;
        int btnW = w - 24;
        int btnH = 22;
        int btnX = x + 12;

        if (currentScreen == SCREEN_MAIN) {
            // Click "Auto Nông Trường" button
            int btnFarmY = contentTop + 10;
            if (px >= btnX && px <= btnX + btnW && py >= btnFarmY && py <= btnFarmY + btnH) {
                currentScreen = SCREEN_FARM;
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
            int btnPlantY = contentTop + 4;
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
            int backBtnX = x + 12;
            int backBtnY = y + h - backBtnH - 6;
            if (px >= backBtnX - 2 && px <= backBtnX + backBtnW + 2 && py >= backBtnY - 2 && py <= backBtnY + backBtnH + 2) {
                currentScreen = SCREEN_MAIN;
                return true;
            }

            // Click [Dong] button
            int closeBtnW = Math.min(70, (w - 30) / 2);
            int closeBtnH = 20;
            int closeBtnX = x + w - closeBtnW - 12;
            int closeBtnY = y + h - closeBtnH - 6;
            if (px >= closeBtnX - 2 && px <= closeBtnX + closeBtnW + 2 && py >= closeBtnY - 2 && py <= closeBtnY + closeBtnH + 2) {
                show = false;
                return true;
            }
        }

        return true;
    }

    public static boolean keyPressed(int keyCode) {
        if (!show) return false;
        if (currentScreen == SCREEN_FARM) {
            currentScreen = SCREEN_MAIN;
        } else {
            show = false;
        }
        return true;
    }
}
