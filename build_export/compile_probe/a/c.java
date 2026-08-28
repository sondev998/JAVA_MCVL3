/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.bg;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

public class c {
    public Vector a = new Vector();

    public int a() {
        return this.a.size();
    }

    public bg a(int n2, int n3) {
        bg bg2 = bg.b(n2, 0);
        if (this.a != null && bg2 != null) {
            bg2.a(n3, 0);
            bg2.a(1, true);
            this.a.addElement(bg2);
        }
        return bg2;
    }

    public void a(Graphics graphics, int n2, int n3, boolean bl2) {
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                bg bg2 = (bg)this.a.elementAt(i2);
                bg2.a(n2, n3, graphics);
                if (!bg2.a()) {
                    this.a.removeElement(bg2);
                }
                bg2.a(100);
            }
        }
    }
}

