/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.aa;
import a.bf;
import a.y;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ag
extends y {
    public static byte a;
    public static int a;
    public static short a;
    public static short[] a;
    public static int b;
    public static short b;
    public static int c;
    public static short c;
    public static int d;
    public static short d;
    public static int e;
    public static short e;
    public static int f;
    public static short f;
    public static int g;
    public static short g;
    public static int h;
    public static short h;
    public short i;

    static {
        Static.regClass(5);
        ag.cinitclone();
    }

    public ag() {
        this.j = 32;
        this.o = 1;
        this.p = 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a() {
        if (a >= 126) {
            a = 0;
            return;
        }
        a = (byte)(a + 1);
    }

    public static void cinitclone() {
        a = 32768;
        b = 16384;
        c = 8192;
        d = 4096;
        e = 2048;
        f = 255;
        a = 1;
        b = (short)2;
        c = (short)4;
        d = (short)8;
        e = (short)16;
        f = (short)32;
        g = (short)64;
        h = (short)128;
        a = new short[]{a, b, c, d, e, f, g, h};
        g = 1;
        h = 32;
    }

    public void a(int n2, byte by, byte by2) {
        this.o = by;
        this.p = by2;
        this.i = (short)n2;
    }

    @Override
    public void a(Graphics graphics) {
        byte by = aa.c;
        byte by2 = this.q;
        byte[] byArray = aa.a().h;
        byte by3 = aa.c;
        byte by4 = aa.d;
        byte by5 = this.r;
        byte[] byArray2 = aa.a().i;
        byte by6 = aa.d;
        int n2 = 0;
        int n3 = this.q + aa.a().a * this.r;
        byte by7 = aa.a().d[n3 / 8];
        if ((a[n3 % 8] & by7) != 0) {
            n2 = 1;
        }
        this.a(graphics, by * by2 - byArray + (by3 >> 1), by4 * by5 - byArray2 + by6, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(Graphics graphics, int n2) {
        int n3;
        int n4;
        int n5 = aa.c * this.q - aa.a().h;
        int n6 = aa.d * this.r - aa.a().i;
        short s2 = bf.a(this.i);
        if ((c & s2) != 0) {
            n4 = n5;
            n3 = n6;
        } else {
            n3 = n6;
            n4 = n5;
            if ((c & s2) == 0) {
                n3 = n6;
                n4 = n5;
                if ((s2 & b) == 0) {
                    n4 = n5 + (aa.c >> 1);
                    n3 = n6 + aa.d;
                }
            }
        }
        this.a(graphics, n4, n3, n2);
    }

    public void a(Graphics graphics, int n2, int n3, int n4) {
        bf.a(graphics, (int)this.i, n2, n3, n4);
    }
}

