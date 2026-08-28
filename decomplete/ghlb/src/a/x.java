/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.al;
import a.aw;
import a.bf;
import a.g;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class x
extends g {
    public static bf[] a;
    private String b;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    static {
        Static.regClass(36);
        x.cinitclone();
    }

    public x(int n2, int n3, int n4, int n5, int n6) {
        super(n2, n3, n5, n6);
        this.r = n4;
        x.d();
        this.a(0);
        this.e();
    }

    public x(int n2, int n3, int n4, int n5, String string) {
        super(n2, n3, n5, 0);
        this.r = n4;
        x.d();
        this.a(string);
        this.e();
    }

    private static int a(byte by) {
        return a[by].c();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int a(String string) {
        int n2 = string.length();
        int n3 = 0;
        int n4 = 0;
        while (n3 < n2) {
            n4 = string.charAt(n3) == ',' ? (n4 += 3) : this.f() + n4;
            ++n3;
        }
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(Graphics graphics, char c2, int n2, int n3) {
        if (c2 == '+') {
            return this.a(graphics, n2, n3, 10);
        }
        if (c2 == '-') {
            return this.a(graphics, n2, n3, 11);
        }
        if (c2 == '/') {
            return this.a(graphics, n2, n3, 12);
        }
        if (c2 == '%') {
            return this.a(graphics, n2, n3, 13);
        }
        if (c2 == ',') {
            al.b(graphics);
            graphics.setColor(this.i);
            graphics.drawString(",", n2, n3 - 3, 0);
            return n2 + 3;
        }
        int n4 = n2;
        if (c2 < '0') return n4;
        n4 = n2;
        if (c2 > '9') return n4;
        return this.a(graphics, n2, n3, c2 - 48);
    }

    private int a(Graphics graphics, int n2, int n3, int n4) {
        if (this.h < this.q) {
            this.h = this.q;
        }
        graphics.setClip(n2, n3, this.p, this.h);
        a[this.r].a(graphics, n2 - this.p * n4, n3, 0);
        return this.p + n2;
    }

    private static int b(byte by) {
        return a[by].d();
    }

    public static void cinitclone() {
        a = null;
    }

    private static void d() {
        if (a == null) {
            a = new bf[4];
            x.a[0] = new bf(4601824);
            x.a[1] = new bf(4630708);
            x.a[2] = new bf(4620507);
            x.a[3] = new bf(6091116);
        }
    }

    private void e() {
        this.o = a[this.r].d();
        this.p = x.a((byte)this.r);
        this.q = x.b((byte)this.r);
    }

    private int f() {
        return x.a((byte)this.r);
    }

    @Override
    public String a() {
        return this.b;
    }

    public void a(int n2) {
        if (n2 == 0 || this.m != n2) {
            this.m = n2;
            this.b = Integer.toString(n2);
            this.n = this.a(this.b);
            if (this.g < this.n) {
                this.g = this.n;
            }
        }
    }

    @Override
    public void a(int n2, boolean bl2) {
        super.a(n2, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(String string) {
        if (string != null) {
            this.m = aw.b(string) ? Integer.parseInt(string) : 0;
            this.b = string;
            this.n = this.a(string);
            if (this.g < this.n) {
                this.g = this.n;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void a(Graphics graphics) {
        void var2_4;
        int n2 = 0;
        super.a(graphics);
        if ((this.f & 0x10) == 0) {
            int n3 = x.b((int)this.a);
        } else {
            boolean bl2 = false;
        }
        if (a.g.a((int)(this.b - var2_4), this.h)) {
            return;
        }
        bf[] bfArray = this.a;
        String string = this.b;
        int n4 = this.h;
        int n5 = this.o;
        if ((this.f & 8) != 0) {
            reference var2_6 = this.a + this.g - this.n;
        } else if ((this.f & 4) != 0) {
            reference var2_9 = this.a + (this.g - this.n >> 1);
        }
        if (this.b != null) {
            int n6 = this.b.length();
            while (n2 < n6) {
                int n7;
                n7 = this.a(graphics, this.b.charAt(n2), n7, (n4 - n5 >> 1) + string);
                ++n2;
            }
        }
        al.b(graphics);
    }

    public int e() {
        return this.m;
    }
}

