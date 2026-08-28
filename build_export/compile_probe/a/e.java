/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.aa;
import a.af;
import a.al;
import a.ap;
import a.ax;
import a.ay;
import a.bf;
import a.bg;
import a.bl;
import a.m;
import a.s;
import a.w;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e
extends m {
    public static int a;
    public static byte[] a;
    public static byte b;
    public static int b;
    public static bg b;
    public static byte[] b;
    public static byte c;
    public static bg c;
    public static bg d;
    public byte a;
    public ax a;
    public boolean a;
    private int[][] a = false;
    private bg e;

    static {
        Static.regClass(24);
        a.e.cinitclone();
    }

    public e(int n2, int n3, byte by, int n4, int n5, int n6, int n7, String string) {
        super(n2, n3, by, n4, n5, n6);
        this.c = (byte)n7;
        this.a = (int)string;
        this.a(n5, n4);
        this.h = s.a[4];
        this.j = 64;
        this.e();
    }

    public static bf a(int n2) {
        return new bf(4961616, n2);
    }

    public static void a() {
        b = bg.a(4961616, 0);
    }

    public static void a(e e2, int n2, int n3, byte by) {
        e2.d(n2, n3);
        e2.f = by;
        e2.e();
        if (e2.j == 1) {
            ((bl)e2).c(true);
            aa.a().a(e2);
        }
    }

    private void a(Graphics graphics, e object, int n2, int n3) {
        n2 = s.a.stringWidth((String)this.a) / 3 + n2;
        object = this.a((e)object, graphics, n2 + 4, n3);
        al.a(ay.b, 2, n2 - s.a.stringWidth((String)object) - 15, n3 + 3, graphics);
    }

    private void a(int[] nArray, int n2, int n3, int n4, int n5, int n6) {
        nArray[0] = n2;
        nArray[1] = n3;
        nArray[2] = n4;
        nArray[3] = n5;
        nArray[4] = n6;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean a(byte by, int n2, int n3, int n4, int n5) {
        switch (n4) {
            case 3: {
                n2 -= n5;
                n3 += n5;
                break;
            }
            case 1: {
                n2 += n5;
                n3 -= n5;
                break;
            }
            case 0: {
                n3 += n5;
                n2 += n5;
                break;
            }
            case 2: {
                n3 -= n5;
                n2 -= n5;
            }
        }
        if (aa.a().a((int)by, n2, n3)) return false;
        a = n2;
        b = n3;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(byte by, int n2, int n3, int n4, int n5, int n6) {
        boolean bl2 = true;
        switch (n4) {
            case 3: {
                a.e.b[0] = 1;
                a.e.b[1] = 0;
                a.e.b[2] = 2;
                a.e.b[3] = 3;
                break;
            }
            case 1: {
                a.e.b[0] = 3;
                a.e.b[1] = 0;
                a.e.b[2] = 2;
                a.e.b[3] = 1;
                break;
            }
            case 2: {
                a.e.b[0] = 0;
                a.e.b[1] = 3;
                a.e.b[2] = 1;
                a.e.b[3] = 2;
                break;
            }
            case 0: {
                a.e.b[0] = 2;
                a.e.b[1] = 3;
                a.e.b[2] = 1;
                a.e.b[3] = 0;
            }
        }
        if (b == null) return false;
        n4 = 0;
        while (n4 < 4) {
            if (a.e.a(by, n2, n3, b[n4], n6)) {
                return bl2;
            }
            ++n4;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean a(Graphics graphics, int n2, int n3) {
        boolean bl2 = true;
        int n4 = this.b();
        if (n4 == 0) return false;
        if (this.j != 1 && (bl.k & 2) != 0) {
            return false;
        }
        String string = n4 == 1 ? s.d[429] : "";
        string = new StringBuffer().append(this.b()).append(string).toString();
        n4 = s.a.stringWidth(string) / 2;
        int n5 = s.h;
        int n6 = graphics.getColor();
        al.a(graphics, string, n2 - n4, n3 - n5, this.h);
        graphics.setColor(n6);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(int n2, int n3, int n4) {
        block10: {
            block9: {
                if (n2 != this.a[0][0] || n3 != this.a[0][1]) break block9;
                if (this.a.b == this.a[0][2] && n4 == this.a[0][4]) break block10;
                this.a[0][0] = this.a[1][0];
                this.a[0][1] = this.a[1][1];
                this.a[1][0] = this.a[2][0];
                this.a[1][1] = this.a[2][1];
            }
            n4 = this.a.length - 2;
            while (true) {
                if (n4 < 0) {
                    this.a(this.a[0], n2, n3, this.a.b, this.a.f(), (int)this.e);
                    return;
                }
                System.arraycopy(this.a[n4], 0, this.a[n4 + 1], 0, this.a[n4].length);
                --n4;
            }
        }
        for (n2 = this.a.length - 1; n2 > 2; --n2) {
            if (this.a[n2][0] == 0) continue;
            n3 = this.a[n2].length - 1;
            while (n3 >= 0) {
                this.a[n2][n3] = 0;
                --n3;
            }
            return;
        }
        if (this.a[1][2] != this.a[0][2] || this.a[1][4] != this.a[0][4]) {
            this.p(1);
            this.p(0);
            return;
        }
        if (this.a[1][2] == this.a[2][2]) {
            if (this.a[1][4] == this.a[2][4]) return;
        }
        this.p(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(Graphics graphics, int n2, int n3) {
        String string = this.c();
        if (string == null) return false;
        if (string.equals("")) {
            return false;
        }
        al.a(graphics, string, n2 - s.a.stringWidth(string) / 2, n3 - s.h, this.h);
        return true;
    }

    public static void cinitclone() {
        c = bg.a(2090000, 0);
        d = bg.a(2120000, 0);
        b = 0;
        c = (byte)21;
        a = null;
        a = 0;
        b = 0;
        b = new byte[4];
    }

    private void p(int n2) {
        for (int i2 = 2; i2 < 5; ++i2) {
            this.a[n2 + 1][i2] = this.a[n2][i2];
        }
    }

    @Override
    public byte a() {
        return this.a(19);
    }

    @Override
    public int a() {
        return this.g(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int a(int n2) {
        int n3 = n2 % 1000;
        if (a == null) return 3;
        switch (this.c() / 10000) {
            default: {
                n2 = 0;
                break;
            }
            case 13: 
            case 14: 
            case 24: {
                n2 = 1;
                break;
            }
            case 22: 
            case 26: {
                n2 = 2;
            }
        }
        if (n3 < 21) return 3;
        if (n3 > 61) return 3;
        if (n3 - 21 >> 1 >= a.length / 3) return 3;
        return a[n2 * (a.length / 3) + (n3 - 21 >> 1)];
    }

    @Override
    public ax a() {
        return this.a;
    }

    @Override
    public String a() {
        return this.a(17);
    }

    protected String a(e e2, Graphics graphics, int n2, int n3) {
        if (s.b) {
            al.a(null, (long)e2.a(12));
            al.a(null, "/");
            al.a(null, 9L);
            throw new NullPointerException();
        }
        return "";
    }

    @Override
    public short a() {
        if (this.a != null) {
            this.a.a = (e)this.a;
            this.a.d = (byte)(this.a.d / 100 * 100 + this.d);
        }
        return (short)this.a;
    }

    public void a(int n2) {
    }

    public void a(int n2, int n3) {
        if (this.a != null) {
            int n4 = (n3 /= 10000) / 10;
            bg.a((bg)this.a, 0, n3 % 10 * 1000 + n4 * 10000000 + n2);
        }
    }

    public void a(ax ax2) {
        if (this.a != null) {
            this.a.a = null;
        }
        this.a = ax2;
        if (ax2 != null) {
            ax2.a = this;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void a(Graphics var1_1) {
        block13: {
            block14: {
                block16: {
                    block15: {
                        var3_2 = aa.a().a((int)this.d);
                        var6_3 = aa.a().b((int)this.e) - aa.a().a((int)this.q, (int)this.r);
                        var5_4 = this.a.g();
                        var7_5 = s.h;
                        var4_6 = this.m();
                        if (this.a) {
                            var2_7 = 10;
lbl8:
                            // 2 sources

                            while (true) {
                                var7_5 = var6_3 - var5_4 - var7_5 - var2_7;
                                if ((0x800000 & var4_6) != 0) {
                                    al.a(a.e.d, 0, var3_2, this.c(s.h + var7_5) + 60, var1_1);
                                }
                                this.a(var1_1, var3_2, var6_3);
                                if ((0x1000000 & var4_6) == 0) break block13;
                                al.a(ay.a, 1, var3_2 + 15, var2_7 + (var7_5 + 20), var1_1);
                                var2_7 = 15;
lbl16:
                                // 2 sources

                                while (true) {
                                    this.a(var1_1, var3_2 - 11, var6_3 - var5_4, 20, 4);
                                    if (!this.a()) break block14;
                                    this.a(var1_1, var3_2, var7_5, var6_3);
                                    if (this.c()) {
                                        if ((this.a & 1) == 0) break block15;
                                        al.a(var1_1, "Minh", var3_2 + var2_7 + 8, s.h + var7_5 - 4, this.h);
                                    }
lbl25:
                                    // 5 sources

                                    while (true) {
                                        var8_8 = s.a.stringWidth((String)this.a) / 2;
                                        var2_7 = this.l();
                                        if (var2_7 > 1 && a.e.b != null) {
                                            a.e.b.c(var2_7);
                                            a.e.b.a(var8_8 + var3_2 + 2 + 8, var7_5, var1_1);
                                            a.e.b.a(0);
                                        }
                                        if ((a.e.b != 0 || !this.b(var1_1, var3_2, var7_5)) && !this.a(var1_1, var3_2, var7_5)) break block14;
                                        var2_7 = s.h;
lbl34:
                                        // 2 sources

                                        while (true) {
                                            if ((131072 & var4_6) != 0) {
                                                al.a(6, var3_2, var7_5 - var2_7, var1_1);
lbl37:
                                                // 3 sources

                                                while (true) {
                                                    if ((0x2000000 & var4_6) != 0) {
                                                        al.a(a.e.c, 0, var3_2, var7_5 - var2_7, var1_1);
                                                    }
                                                    if (this.a(var4_6)) {
                                                        this.a(var1_1, this, var3_2 - s.a.stringWidth((String)this.a), var7_5);
                                                    }
                                                    if ((262144 & var4_6) != 0) {
                                                        ay.c.a(var1_1, var3_2 + 12, var6_3 - var5_4 - 2, 0);
                                                    }
                                                    this.b(var1_1, var3_2, var6_3);
                                                    this.a(var1_1, var3_2, var6_3, var5_4);
                                                    return;
                                                }
                                            }
                                            break block16;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        var2_7 = 0;
                        ** while (true)
                    }
                    if ((this.a & 2) == 0) ** GOTO lbl25
                    al.a(var1_1, "\u0110\u1ecbch", var3_2 + var2_7 + 8, s.h + var7_5 - 4, s.a[2]);
                    ** while (true)
                }
                if ((var4_6 & 128) == 0 || (aa.a().b & 0x8000800) != 0) ** GOTO lbl37
                al.a(ay.f, 0, var3_2, var7_5 - var2_7, var1_1);
                this.a(5, -1);
                ** while (true)
            }
            var2_7 = 0;
            ** while (true)
        }
        var2_7 = 0;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void a(Graphics var1_1, int var2_2, int var3_3) {
        block13: {
            block7: {
                block9: {
                    block12: {
                        if (!this.b()) break block12;
                        if (!this.f(64) || this.a == null) ** GOTO lbl37
                        this.b((int)this.d, (int)this.e, (int)this.e);
                        for (var4_4 = this.a.length - 1; var4_4 > 0; --var4_4) {
                            block8: {
                                block11: {
                                    block10: {
                                        if (this.a[var4_4][0] == 0) continue;
lbl6:
                                        // 2 sources

                                        block1: while (true) {
                                            if (!this.a(false)) break block7;
                                            var5_5 = 0;
lbl9:
                                            // 2 sources

                                            while (true) {
                                                if (var5_5 <= 0) break block8;
                                                if (this.a[var5_5][4] != 3) break block1;
                                                if ((this.e.a & 2) == 0) break block9;
                                                this.e.a(2, false);
                                                var4_4 = 0;
lbl15:
                                                // 3 sources

                                                while (true) {
                                                    if (this.e.b == this.a[var5_5][2] && var4_4 != 0) break block10;
                                                    this.e.a(this.a[var5_5][2], this.a[var5_5][3]);
                                                    this.e.a(1, true);
lbl19:
                                                    // 2 sources

                                                    while (true) {
                                                        var4_4 = aa.a().a(this.a[var5_5][0]);
                                                        var5_5 = aa.a().b(this.a[var5_5][1]) - aa.a().a((int)this.q, (int)this.r);
                                                        if (var5_5 > var3_3) {
                                                            super.a(var1_1, var2_2, var3_3);
                                                            this.e.a(var4_4, var5_5, var1_1);
lbl25:
                                                            // 3 sources

                                                            return;
                                                        }
                                                        break block11;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        if (this.a[var5_5][4] != 1 || (this.e.a & 2) != 0) break block9;
                                        this.e.a(2, true);
                                        var4_4 = 0;
                                        ** GOTO lbl15
                                    }
                                    this.e.a(100);
                                    ** continue;
                                }
                                this.e.a(var4_4, var5_5, var1_1);
                            }
                            super.a(var1_1, var2_2, var3_3);
                            ** GOTO lbl25
                        }
                        break block13;
                    }
                    this.c(var1_1, var2_2, var3_3);
                    a.e.a.a(var1_1, var2_2 - 18, var3_3 - 8, 0);
                    ** while (true)
                }
                var4_4 = 1;
                ** while (true)
            }
            var5_5 = var4_4;
            ** while (true)
        }
        var4_4 = 0;
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a() {
        if ((ap.r & 1) == 0) return true;
        if (a.e.o() != this.c) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(int n2) {
        if ((n2 & 0x40) == 0) return false;
        return true;
    }

    public byte b() {
        return this.a(21);
    }

    @Override
    public int b() {
        return this.a(5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected int b(int n2) {
        if (!this.a) {
            return n2;
        }
        n2 -= 17;
        return n2;
    }

    public String b() {
        return this.a(23);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void b() {
        if (!this.i()) {
            return;
        }
        w.a();
        int n2 = w.b(this.a()) ? -3 : (this.c() > 0 ? -4 : -5);
        a.e.a(this.a(), n2, this.q, this.r);
    }

    @Override
    public void b(int n2) {
        ((af)this.a.elementAt(29)).a(n2);
        if (this.f(256)) {
            w.a(this.a(), 4, n2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean b() {
        if (ap.r >= 2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public byte c() {
        int n2 = this.a();
        if (bl.b.a(n2) == null) return super.c();
        return 0;
    }

    @Override
    public int c() {
        return this.g(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected int c(int n2) {
        if (!this.a) {
            return n2;
        }
        n2 += 20;
        return n2;
    }

    public String c() {
        return this.a(27);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void c() {
        int[] nArray;
        if (this.a == null) {
            return;
        }
        this.a = new int[4][5];
        this.a(this.a[0], (int)this.d, (int)this.e, this.a.b, this.a.f(), (int)this.e);
        for (int i2 = 1; i2 < 3; ++i2) {
            System.arraycopy(this.a[i2 - 1], 0, this.a[i2], 0, this.a[i2].length);
            if (this.a[i2][3] <= 0) continue;
            nArray = this.a[i2];
            nArray[3] = nArray[3] - 1;
        }
        this.e = bg.b(this.a.a, 1);
        this.e.a = this.a.a;
        this.e.a(this.a[2][2], this.a[2][3]);
        this.e.a(1, true);
        switch (this.e) {
            default: {
                return;
            }
            case 0: {
                nArray = this.a[1];
                nArray[1] = nArray[1] - 8;
                nArray = this.a[2];
                nArray[1] = nArray[1] - 16;
                return;
            }
            case 2: {
                nArray = this.a[1];
                nArray[1] = nArray[1] + 8;
                nArray = this.a[2];
                nArray[1] = nArray[1] + 16;
                return;
            }
            case 1: {
                nArray = this.a[1];
                nArray[0] = nArray[0] - 8;
                nArray = this.a[2];
                nArray[0] = nArray[0] - 16;
                this.e.a(2, true);
                return;
            }
            case 3: 
        }
        nArray = this.a[1];
        nArray[0] = nArray[0] + 8;
        nArray = this.a[2];
        nArray[0] = nArray[0] + 16;
        this.e.a(2, false);
    }

    @Override
    public void c(int n2) {
        ((af)this.a.elementAt(30)).a(n2);
        if (this.f(256)) {
            w.a(this.a(), 3, n2);
        }
    }

    protected boolean c() {
        return true;
    }

    @Override
    public int d() {
        return this.g(29);
    }

    public void d() {
        this.a = null;
        this.e = null;
    }

    @Override
    public void d(int n2) {
        ((af)this.a.elementAt(31)).a(n2);
        if (this.f(256)) {
            w.a(this.a(), 6, n2);
        }
    }

    @Override
    public boolean d() {
        return ay.m.contains(this);
    }

    @Override
    public int e() {
        return this.g(30);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void e() {
        if (bl.b.a(this.a()) != null) {
            this.g(s.a[2]);
            this.a(256, w.b(this.a()));
            return;
        }
        switch (this.c()) {
            default: {
                return;
            }
            case 0: {
                int n2 = (aa.a().b & 1) == 0 ? 1 : 0;
                n2 = n2 != 0 ? s.a[7] : s.a[6];
                this.g(n2);
                return;
            }
            case 1: 
        }
        boolean bl2 = w.b(this.a());
        int n3 = bl2 ? s.a[3] : s.a[4];
        this.g(n3);
        this.a(256, bl2);
    }

    @Override
    public void e(int n2) {
        ((af)this.a.elementAt(32)).a(n2);
        if (this.f(256)) {
            w.a(this.a(), 7, n2);
        }
    }

    @Override
    public int f() {
        return this.g(31);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f() {
        super.f();
        if (this.i != 0) {
            this.m();
        } else {
            this.g();
        }
        if (this.a != null) {
            this.a.f();
            this.a.b(this);
        }
    }

    @Override
    public void f(int n2) {
        super.f(n2);
        if (this.a != null) {
            ax ax2 = this.a;
            if (bl.b.a(this.a()) != null) {
                n2 = 0;
            }
            ax2.f(n2);
        }
    }

    @Override
    public int g() {
        return this.g(32);
    }

    protected void g() {
        if (!aa.a().a((int)this.d, (int)this.q, (int)this.r)) {
            this.d(-1);
        }
    }

    @Override
    public void g(int n2) {
        super.g(n2);
        if (this.a != null) {
            this.a.g(n2);
        }
    }

    @Override
    public int h() {
        return this.a(33);
    }

    @Override
    protected void h(int n2) {
        ((af)this.a.elementAt(2)).a(n2);
    }

    @Override
    public int i() {
        return this.a(34);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void i(int n2) {
        byte by = (byte)(this.d / 100 * 100);
        this.d = (n2 & 0x2000) != 0 ? (Object)true : (bg)false;
        if (this.a != null) {
            this.a.d = (byte)(this.a.d / 100 * 100 + this.d);
        }
        this.d = (bg)((byte)(by + this.d));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int j() {
        if (this.c() / 100000 % 10 != 1) return 5;
        return 7;
    }

    @Override
    public int k() {
        return this.g(28);
    }

    @Override
    public int l() {
        return this.a(25);
    }

    @Override
    public int m() {
        return this.g(2);
    }
}

