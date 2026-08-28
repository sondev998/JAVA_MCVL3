/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import javax.microedition.lcdui.Graphics;

public abstract class y {
    public int j;
    public byte o;
    public byte p;
    public byte q;
    public byte r;

    public void a(Graphics graphics) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(y y2) {
        if (y2.r < this.r) return true;
        if (y2.r != this.r) return false;
        if (y2.q >= this.q) return false;
        return true;
    }

    public void n(int n2) {
    }
}

