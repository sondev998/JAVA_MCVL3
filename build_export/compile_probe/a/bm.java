/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.aa;
import a.ag;
import a.az;
import a.bg;
import javax.microedition.lcdui.Graphics;

public class bm
extends ag {
    public static bg a;

    static {
        Static.regClass(22);
        bm.cinitclone();
    }

    public bm() {
        a = bg.a(2020000, 6);
    }

    public static void cinitclone() {
    }

    @Override
    public void a(Graphics graphics) {
        if (a.a()) {
            az az2 = aa.a().a((int)this.q, (int)this.r);
            int n2 = aa.a().a(az2.d);
            int n3 = aa.a().b(az2.e);
            int n4 = aa.a().a((int)this.q, (int)this.r);
            a.a(n2, n3 - n4, graphics);
            a.a(-1);
        }
    }
}

