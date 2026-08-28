/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package lib;

import chen.chen;
import javak.microedition.lcdui.Kalvaz;
import javax.microedition.lcdui.Graphics;
import lib.a;

public abstract class Canvas
extends Kalvaz {
    public static int menukey;
    public static long waittime;
    private Thread a;

    static {
        waittime = 500L;
        menukey = 42;
    }

    static Thread a(Canvas canvas, Thread thread) {
        canvas.a = null;
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void KeyPressed(int n2) {
        if (n2 == menukey) {
            a a2 = new a(this, n2);
            this.a = a2;
            a2.start();
            return;
        }
        try {
            this.leyPressed(n2);
            return;
        }
        catch (Throwable throwable) {
            chen.showError(throwable);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void KeyReleased(int n2) {
        if (n2 == menukey) {
            if (this.a != null) {
                this.a.interrupt();
            }
            return;
        }
        try {
            this.leyReleased(n2);
            return;
        }
        catch (Throwable throwable) {
            chen.showError(throwable);
            return;
        }
    }

    protected void PAINT(Graphics graphics) {
    }

    protected void leyPressed(int n2) {
    }

    protected void leyReleased(int n2) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void paint(Graphics graphics) {
        try {
            this.PAINT(graphics);
            return;
        }
        catch (Throwable throwable) {
            chen.showError(throwable);
            return;
        }
    }
}

