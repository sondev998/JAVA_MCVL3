package a;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/** In-game Canvas popup menu triggered by .auto chat command. */
public final class AutoMenu {
    public static boolean show = false;

    /**
     * Checks if the message sent in-game matches the .auto command.
     * Called when the user clicks the "Gửi" button inside the game.
     */
    public static boolean checkCommand(String input) {
        if (input != null && ".auto".equalsIgnoreCase(input.trim())) {
            show = true;
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
        return (getScreenWidth() * 80) / 100;
    }

    public static int getHeight() {
        return (getScreenHeight() * 40) / 100;
    }

    public static int getX() {
        return (getScreenWidth() - getWidth()) / 2;
    }

    public static int getY() {
        return (getScreenHeight() - getHeight()) / 2;
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
        int headerH = 20;
        if (headerH > h / 3) headerH = h / 3;
        g.setColor(0x2D2214);
        g.fillRect(x, y, w, headerH);
        g.setColor(0xE5A93C);
        g.drawLine(x, y + headerH, x + w - 1, y + headerH);

        // Title text
        String title = "Menu Auto";
        g.setColor(0xFFF799);
        int titleW = font.stringWidth(title);
        int titleY = y + (headerH - font.getHeight()) / 2;
        if (titleY < y + 1) titleY = y + 1;
        g.drawString(title, x + (w - titleW) / 2, titleY, Graphics.TOP | Graphics.LEFT);

        // [X] Close button
        int closeW = 16;
        int closeH = headerH - 4;
        if (closeH < 10) closeH = 10;
        int closeX = x + w - closeW - 2;
        int closeY = y + 2;
        g.setColor(0x9E2A2B);
        g.fillRect(closeX, closeY, closeW, closeH);
        g.setColor(0xFFD700);
        g.drawRect(closeX, closeY, closeW - 1, closeH - 1);
        g.setColor(0xFFFFFF);
        int xCharW = font.stringWidth("X");
        g.drawString("X", closeX + (closeW - xCharW) / 2, closeY + (closeH - font.getHeight()) / 2, Graphics.TOP | Graphics.LEFT);

        // Content message
        String msg = "Ch\u1ee9c n\u0103ng Auto s\u1ebd \u0111\u01b0\u1ee3c th\u00eam t\u1ea1i \u0111\u00e2y.";
        g.setColor(0xFFFFFF);

        int fH = font.getHeight();
        int textY = y + headerH + (h - headerH - 24 - fH) / 2;
        if (textY < y + headerH + 2) textY = y + headerH + 2;
        int msgW = font.stringWidth(msg);
        if (msgW <= w - 8) {
            g.drawString(msg, x + (w - msgW) / 2, textY, Graphics.TOP | Graphics.LEFT);
        } else {
            String line1 = "Ch\u1ee9c n\u0103ng Auto";
            String line2 = "s\u1ebd \u0111\u01b0\u1ee3c th\u00eam t\u1ea1i \u0111\u00e2y.";
            int l1W = font.stringWidth(line1);
            int l2W = font.stringWidth(line2);
            int startY = y + headerH + (h - headerH - 24 - fH * 2) / 2;
            if (startY < y + headerH + 2) startY = y + headerH + 2;
            g.drawString(line1, x + (w - l1W) / 2, startY, Graphics.TOP | Graphics.LEFT);
            g.drawString(line2, x + (w - l2W) / 2, startY + fH + 1, Graphics.TOP | Graphics.LEFT);
        }

        // Bottom [Dong] button
        int btnW = Math.min(60, w - 20);
        int btnH = 18;
        int btnX = x + (w - btnW) / 2;
        int btnY = y + h - btnH - 4;
        g.setColor(0x4A3728);
        g.fillRect(btnX, btnY, btnW, btnH);
        g.setColor(0xE5A93C);
        g.drawRect(btnX, btnY, btnW - 1, btnH - 1);
        g.setColor(0xFFF799);
        String btnText = "\u0110\u00f3ng";
        int btnTextW = font.stringWidth(btnText);
        g.drawString(btnText, btnX + (btnW - btnTextW) / 2, btnY + (btnH - fH) / 2, Graphics.TOP | Graphics.LEFT);

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

        int headerH = 20;
        if (headerH > h / 3) headerH = h / 3;

        // [X] button
        int closeW = 16;
        int closeH = headerH - 4;
        if (closeH < 10) closeH = 10;
        int closeX = x + w - closeW - 2;
        int closeY = y + 2;
        if (px >= closeX - 4 && px <= closeX + closeW + 4 && py >= closeY - 4 && py <= closeY + closeH + 4) {
            show = false;
            return true;
        }

        // [Dong] button
        int btnW = Math.min(60, w - 20);
        int btnH = 18;
        int btnX = x + (w - btnW) / 2;
        int btnY = y + h - btnH - 4;
        if (px >= btnX - 4 && px <= btnX + btnW + 4 && py >= btnY - 4 && py <= btnY + btnH + 4) {
            show = false;
            return true;
        }

        // Click outside popup
        if (px < x || px > x + w || py < y || py > y + h) {
            show = false;
            return true;
        }

        return true;
    }

    public static boolean keyPressed(int keyCode) {
        if (!show) return false;
        show = false;
        return true;
    }
}
