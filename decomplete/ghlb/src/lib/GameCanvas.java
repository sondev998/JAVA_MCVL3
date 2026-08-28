/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package lib;

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import lib.Canvas;

public abstract class GameCanvas
extends Canvas {
    private static Image a;

    protected GameCanvas(boolean bl2) {
        if (a == null) {
            super.setFullScreenMode(true);
            a = Image.createImage((int)super.getWidth(), (int)super.getHeight());
            super.setFullScreenMode(false);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void PAINT(Graphics graphics) {
        try {
            graphics.drawImage(a, 0, 0, 20);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public void flushGraphics() {
        this.repaint();
    }

    public void flushGraphics(int n2, int n3, int n4, int n5) {
        this.repaint(n2, n3, n4, n5);
    }

    protected Graphics getGraphics() {
        return a.getGraphics();
    }

    public int getKeyStates() {
        return 0;
    }
}

