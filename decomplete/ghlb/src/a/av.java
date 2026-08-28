/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package a;

import a.a;
import a.aa;
import a.ac;
import a.ad;
import a.af;
import a.ag;
import a.al;
import a.am;
import a.an;
import a.ap;
import a.ar;
import a.au;
import a.aw;
import a.ay;
import a.b;
import a.ba;
import a.bb;
import a.bc;
import a.bf;
import a.bg;
import a.bi;
import a.bl;
import a.bn;
import a.d;
import a.f;
import a.g;
import a.h;
import a.j;
import a.n;
import a.p;
import a.q;
import a.r;
import a.s;
import a.t;
import a.u;
import a.v;
import a.w;
import a.work.main.MyMidlet;
import a.x;
import a.y;
import a.z;
import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class av
extends g
implements bi {
    private long a;
    private ad a;
    private au a;
    private bb a;
    public g a;
    private p a;
    private w a;
    private Vector a = new Vector();
    private Vector b;
    public int[] b;
    public af[] b = new Vector(1);
    public short c;
    public short d;
    public String e;
    public short e = 0;
    public short f = 0;
    private int m = 18;
    public int u;
    public int v;

    public av(int n2, int n3, int n4, int n5) {
        super(n2, n3, n4, n5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(int n2, int n3, int n4, int n5) {
        byte by;
        int n6;
        int n7;
        block12: {
            block11: {
                g g2;
                n6 = n7 = -1;
                if (this.a == null) break block11;
                n6 = n7;
                if (!this.a.a()) break block11;
                n6 = this.a.a;
                by = this.a.b;
                n7 = this.a.a(n2);
                while (n7 != -1 && (g2 = this.a(n7)) != null && !g2.a()) {
                    n7 = g2.a(n2);
                }
                if (n7 != -1) break block12;
                this.a.a(n2, n3, n4, n5);
            }
            return n6;
        }
        if (by == 7) {
            if (ac.e == s.a[11] || ac.e == s.a[13] || ac.e == s.a[15] || ac.e == s.a[17]) {
                this.a.a(n2, n3, n4, n5);
                return n6;
            }
        } else if (by == 12 && ((q)this.a).b(n2)) {
            this.a.a(n2, n3, n4, n5);
            return n6;
        }
        this.d(n7);
        return n6;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static g a(av g2, int n2, int n3) {
        void var2_9;
        void var0_5;
        int n4;
        g g3;
        g g4 = g3 = ((av)g2).a(n4);
        if (g3 == null) return var0_5;
        g g5 = g3;
        if (g3.b != 12) return var0_5;
        if (var2_9 >= 1000) {
            q q2 = (q)g3;
            n4 = ((q)g3).i();
            g g6 = q2.a(((q)g3).h() * n4 + var2_9 % 1000);
            return var0_5;
        }
        g g7 = g3;
        if (var2_9 < 0) return var0_5;
        g g8 = ((q)g3).a((int)var2_9);
        return var0_5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(av object, int n2) {
        if ((object = (h)((av)object).a(n2)) == null) return "";
        return ((h)object).a();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2) {
        if (n2 == 0) {
            return;
        }
        if (n2 != s.a[4] && this.a != null && this.a.e != -1 && this.a(this.a.e).a()) {
            if ((this.a.f & 0x10) != 0) return;
        }
        if (n2 == s.a[4]) {
            this.c(-this.m);
            return;
        }
        if (n2 == s.a[5]) {
            this.c(this.m);
            return;
        }
        if (n2 == s.a[2]) {
            this.d(-this.m);
            return;
        }
        if (n2 != s.a[3]) return;
        this.d(this.m);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Graphics graphics, int n2, int n3, int n4, int n5, boolean bl2) {
        int n6 = 0;
        int n7 = bl2 ? n4 : 0;
        graphics.drawLine(n7 + n2, n3, n4 / 2 + n2, n3);
        int n8 = n4 / 2;
        int n9 = n5 / 2;
        n7 = bl2 ? n4 : 0;
        graphics.drawLine(n8 + n2, n9 + n3, n4 + n2 - n7, n5 / 2 + n3);
        if (n5 > 0) {
            n7 = n6;
            if (bl2) {
                n7 = n4;
            }
            graphics.drawLine(n2 + n7, n3 + n5, n4 / 2 + n2, n3 + n5);
            graphics.drawLine(n4 / 2 + n2, n3, n4 / 2 + n2, n3 + n5);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(av g2, int n2, int n3) {
        boolean bl2;
        int n4 = 0;
        boolean bl3 = false;
        if (n2 == s.a[6] && ((av)g2).f() == n3) {
            ad.a((av)g2, false);
            return true;
        }
        if (n2 != s.a[2]) {
            bl2 = bl3;
            if (n2 != s.a[3]) return bl2;
        }
        bl2 = bl3;
        if (!((av)g2).a(n3).a()) return bl2;
        ad.a((av)g2, false);
        if (((av)g2).f() == n3) {
            return true;
        }
        g2 = (h)((av)g2).a(n3);
        n3 = ((h)g2).f();
        if (n2 == s.a[2]) {
            n2 = --n3;
            if (n3 < 0) {
                n2 = ((h)g2).m - 1;
            }
        } else {
            n2 = n4;
            if (++n3 < ((h)g2).m) {
                n2 = n3;
            }
        }
        ((h)g2).a(n2);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(av av2, int n2, int n3, boolean bl2) {
        if (bl2) {
            av2.c(n2, false);
        } else {
            av2.c(n2);
            if (n2 == n3) {
                return bl2;
            }
        }
        if (n3 == 0) return bl2;
        av2.d(n3);
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(String string, int n2) {
        boolean bl2 = false;
        switch (n2) {
            default: {
                return true;
            }
            case 2: {
                if (al.c(string)) return true;
                return bl2;
            }
            case 1: {
                if (al.b(string)) return true;
                return bl2;
            }
            case 4: 
            case 65536: 
        }
        if (al.a(string.trim())) return true;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static af[] a(int n2, int n3, int n4) {
        Object object = a.f.a(n2);
        if (object == null) {
            if (n2 != 66) return null;
            object = new af[]{new ba(0), new ba(0)};
            return object;
        }
        af[] afArray = ((av)object).b;
        af af2 = afArray[afArray.length - 2];
        if (n4 == -1 && af2.b() > 0 && ((g)(object = (q)((av)object).a(n3))).a() && ((q)object).f() == 1) {
            af2.a(af2.b() - 1);
        }
        object = new af[]{af2, afArray[afArray.length - 1]};
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(Graphics graphics) {
        int[] nArray = new int[]{43, 45, 0, 52, 15, 12, 64, 23};
        graphics.setClip((int)this.a, (int)this.a, this.g, this.h);
        q q2 = (q)this.a(32001);
        int n2 = q2.d(1);
        int n3 = 0;
        while (n3 < nArray.length) {
            ar ar2 = (ar)q2.a(nArray[n3]);
            if (ar2 != null) {
                aw aw2 = ar2.a;
                int n4 = ar2.g;
                int n5 = this.d();
                String string = ar2.b;
                int n6 = ar2.h / 2;
                int n7 = n3 < 2 ? 0 : (n3 == 4 || n3 == 7 ? ar2.h * 4 : ar2.h * 2);
                int n8 = n3 > 4 ? ar2.g + n2 : 0;
                boolean bl2 = n3 > 4;
                this.a(graphics, (int)(aw2 + n4 - n5 - n8), n6 + string, n2, n7, bl2);
            }
            ++n3;
        }
        return;
    }

    private static void c(int n2, int n3) {
        if (a.f.a() == n2) {
            av.a[n2] = n2 * 10000 + n3;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void c(Graphics graphics) {
        void var5_6;
        int n2;
        int n3 = ac.a;
        int n4 = ac.b;
        if ((this.f & 0x1000) != 0) {
            n3 = this.g;
            n4 = this.h;
            n2 = this.a;
            Vector vector = this.b;
        } else {
            boolean bl2 = false;
            n2 = 0;
        }
        al.c(graphics, n2, (int)var5_6, n3, n4, s.a);
        this.e(graphics);
        al.a(graphics, this.e, n2, (int)var5_6, n3, n4, 0);
        al.b(graphics, n2, (int)var5_6, n3, n4);
        al.a(graphics, (int)this.d, n4 - 50, this.v);
        al.d(graphics, n2, (int)var5_6, n3, n4);
        this.a.a(graphics, this);
        this.d(graphics);
    }

    private void d() {
        g g2;
        if (this.d != -1 && this.a == null && (g2 = this.a(this.d % 100000000)) != null && g2.a()) {
            this.a = g2;
            this.a.b(true);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void d(int n2, int n3) {
        av av2;
        block4: {
            block3: {
                av2 = a.f.a(n2);
                if (av2 == null) break block3;
                if (((q)av2.a(n3)).f() >= 2 || av2.b == null || av2.a(1002).b() <= 0) break block4;
                av2.b(-1);
            }
            return;
        }
        av2.b(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void d(g g2) {
        block9: {
            g g3;
            if (g2 == null || this.a.contains(g2)) {
                return;
            }
            int n2 = this.a.size();
            if (n2 <= 0 || (g2.f & 0x8010) != 0) {
                this.a.addElement(g2);
                return;
            }
            int n3 = this.b.length;
            int n4 = 0;
            block1: while (true) {
                int n5;
                if (n4 >= n3 || (n5 = this.b[n4] % 1000000) == 0) {
                    for (n4 = n2 - 1; n4 >= 0; --n4) {
                        g3 = (g)this.a.elementAt(n4);
                        if ((g3.f & 0x8010) == 0) break block1;
                    }
                    break block9;
                }
                int n6 = n4;
                if (n5 == g2.a) {
                    while (n4 < n3) {
                        if (n4 + 1 < n3 && (n6 = this.b[n4 + 1] % 1000000) != 0 && (g3 = (g)this.a.a(n6)) != null && (n6 = this.a.indexOf(g3)) != -1) {
                            this.a.insertElementAt(g2, n6);
                            return;
                        }
                        ++n4;
                    }
                    n6 = n4;
                }
                n4 = n6 + 1;
            }
            this.a.insertElementAt(g2, this.a.indexOf(g3) + 1);
            return;
        }
        this.a.insertElementAt(g2, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void d(Graphics graphics) {
        int n2 = 0;
        if (this.b == null) return;
        if (this.b[2].b() != 3) {
            if (this.b[2].b() != 2) {
                StringBuffer stringBuffer = al.a(null, (long)(this.b[this.b.length - 2].b() + 1));
                al.a(stringBuffer, "/");
                al.a(stringBuffer, (long)this.b[1].b());
                graphics.setColor(16580532);
                graphics.drawString(stringBuffer.toString(), (ac.a >> 1) - (graphics.getFont().stringWidth(stringBuffer.toString()) >> 1), ac.b - 20, 0);
            } else {
                q q2 = (q)this.a(this.b[0].b());
                if (q2 != null) {
                    if (q2.c[0] + q2.i() == q2.c[2] - 1) {
                        n2 = 20;
                    } else if (q2.c[0] > 0 || q2.i() > 0) {
                        n2 = 10;
                    }
                    int n3 = ac.b - 50;
                    int n4 = q2.c[2] > q2.c[1] ? n3 + 20 : n3;
                    al.a(graphics, n2, n3, n4);
                }
            }
            al.a(graphics, ac.a >> 1, ac.b - 18);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean d() {
        boolean bl2;
        block8: {
            int n2;
            block5: {
                block7: {
                    block6: {
                        block4: {
                            bl2 = false;
                            if (this.a.size() == 0) {
                                return bl2;
                            }
                            boolean bl3 = bl2;
                            if (!this.a.contains(this.a)) return bl3;
                            if (this.a.b == -1 || !this.a(this.a.b).a()) break block4;
                            n2 = this.a.b;
                            break block5;
                        }
                        if (this.a.c == -1 || !this.a(this.a.c).a()) break block6;
                        n2 = this.a.c;
                        break block5;
                    }
                    if (this.a.d == -1 || !this.a(this.a.d).a()) break block7;
                    n2 = this.a.d;
                    break block5;
                }
                if (this.a.e == -1 || !this.a(this.a.e).a()) break block8;
                n2 = this.a.e;
            }
            this.d(n2);
            return true;
        }
        this.d(-1);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e(Graphics graphics) {
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.size(); ++i2) {
                g g2 = (g)this.a.elementAt(i2);
                if (!g2.a()) continue;
                g2.a(graphics);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean e(int n2) {
        if (n2 == s.a[7]) {
            return this.b(-1);
        }
        if (n2 != s.a[8]) return false;
        return this.b(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean f(int n2) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (n2 == s.a[6]) return bl3;
        if (n2 != s.a[1]) return false;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void g(int n2) {
        if (n2 != 0) {
            this.a.b = 0L;
        }
        if (n2 == s.a[1]) {
            g g2 = this.a((int)this.b);
            if (g2 == null) return;
            if (!g2.a()) return;
            if (this.a != null) {
                if (this.c == this.a.a) return;
            }
            g2.a(0, s.a[6], -1, -1);
            return;
        }
        if (n2 != s.a[0]) return;
        g g3 = this.a(this.c);
        if (g3 == null) return;
        if (!g3.a()) return;
        if (this.a != null) {
            if (this.c == this.a.a) return;
        }
        g3.a(0, s.a[6], -1, -1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public af a(int n2) {
        if (this.b == null) return null;
        if (this.b.length > n2) {
            return this.b[n2];
        }
        if (n2 <= 1000) return null;
        return this.b[this.b.length - n2 % 1000];
    }

    public g a(int n2) {
        return (g)this.a.a(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public g a(int n2, boolean bl2, int n3) {
        g g2 = (g)this.a.a(n2);
        g g3 = null;
        int n4 = this.a.a();
        int n5 = 0;
        while (true) {
            if (n5 > n4 || g2 == null) {
                if (bl2) {
                    this.f(n2);
                }
                if (n3 != 1 || g3 == null) break;
                this.v = g3.b + g3.h - 10 - this.b;
                return g3;
            }
            if (bl2) {
                this.c(g2.a, false);
            } else {
                this.c(g2.a);
            }
            g g4 = (g)this.a.a(g2.j / 100);
            ++n5;
            g3 = g2;
            g2 = g4;
        }
        if (n3 != 2) {
            if (n3 <= 1000) return g3;
        }
        n2 = n3;
        if (n3 == 2) {
            n2 = this.j / 100;
        }
        if ((g2 = (g)this.a.a(n2)) == null) return g3;
        n2 = g2.b;
        this.v = g2.h + n2 - 10 - this.b;
        return g3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public g a(av av2, DataInputStream dataInputStream) {
        int n2;
        int n3 = 0;
        if (av2 == null) {
            return null;
        }
        av2.a(this);
        int n4 = dataInputStream.readInt();
        av.a(av2, n4, dataInputStream.readByte(), dataInputStream);
        av2.e = (short)av2.a;
        av2.f = (short)av2.b;
        if ((av2.f & 0x2000000) != 0) {
            av2.a(0x200000, true);
        }
        if ((av2.f & 0x200000) != 0 || (av2.f & 0x1000) != 0) {
            n2 = av2.g > ac.a ? 0 : ac.a - av2.g >> 1;
            av2.a = (short)n2;
        }
        if ((av2.f & 0x800) != 0) {
            n2 = av2.g > ac.a ? 0 : ac.a - av2.g >> 1;
            if (av2.h <= ac.b) {
                n3 = ac.b - av2.h >> 1;
            }
            av2.b(n2, n3);
        }
        n3 = dataInputStream.readByte();
        n2 = n3;
        if (n3 > 0) {
            n2 = n3 + n4 % 100000000;
            av2.d = (short)n2;
        }
        a.g.l = n2;
        av2.e(dataInputStream.readByte() + n4, dataInputStream.readByte() + n4);
        av2.a();
        return av2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Object a(int n2) {
        if (this.b == null) return null;
        if (n2 >= this.b.size()) return null;
        return this.b.elementAt(n2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void a(int var1_1, int var2_2, int var3_3, int var4_4) {
        block120: {
            block119: {
                block118: {
                    block117: {
                        block112: {
                            block111: {
                                block114: {
                                    block115: {
                                        block113: {
                                            var5_5 = var1_1;
                                            var6_6 = var2_2;
                                            if (var1_1 == 0) break block113;
                                            var5_5 = var1_1;
                                            var6_6 = var2_2;
                                            if (Math.abs(ac.c) >= 18) break block113;
                                            if (var2_2 != 0) break block114;
                                            if (System.currentTimeMillis() - this.a <= (long)s.k) break block115;
                                            this.a = System.currentTimeMillis();
                                            var6_6 = var2_2;
                                            var5_5 = var1_1;
                                        }
lbl13:
                                        // 3 sources

                                        while (true) {
                                            block116: {
                                                if (ac.e / 10 == 64) break block116;
                                                var2_2 = var5_5;
                                                var1_1 = var6_6;
                                                if (ac.e % 10 != 4) ** GOTO lbl28
                                            }
                                            var2_2 = var5_5;
                                            var1_1 = var6_6;
                                            if (var6_6 != 0) {
                                                if (!al.a(var6_6)) break block111;
                                                var1_1 = var6_6;
                                                var2_2 = var5_5;
                                            }
lbl25:
                                            // 4 sources

                                            while (true) {
                                                var4_4 = -1;
                                                var3_3 = -1;
lbl28:
                                                // 2 sources

                                                var5_5 = (int)(this.a / 1000);
                                                this.a(var2_2);
                                                var6_6 = this.a(var2_2, var1_1, var3_3, var4_4);
                                                this.g(var1_1);
                                                if (ac.e == s.a[14] && this.a != null && this.a.a() == 7) lbl-1000:
                                                // 213 sources

                                                {
                                                    return;
                                                }
                                                break block112;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var6_6 = 0;
                                    var5_5 = 0;
                                    ** GOTO lbl13
                                }
                                this.a = System.currentTimeMillis();
                                var5_5 = var1_1;
                                var6_6 = var2_2;
                                ** while (true)
                            }
                            var1_1 = 0;
                            var2_2 = 0;
                            ** while (true)
                        }
                        if (var1_1 != s.a[0] || this.e != -1) break block117;
                        a.f.a(var5_5);
                        ** GOTO lbl-1000
                    }
                    switch (var5_5) {
                        default: {
                            ** GOTO lbl-1000
                        }
                        case 1: {
                            if (var1_1 != s.a[0] && this.f() != 1005) {
                                this.a.J(this);
                            }
                            if (var1_1 != s.a[6] || this.d != 1003) break;
                            bn.a(s.d[375], -1, n.d(((n)this.a).e()), this.a.a(), (bi)this);
                            ** GOTO lbl-1000
                        }
                        case 26: {
                            if (!av.f(var1_1)) ** GOTO lbl-1000
                            this.a.k(this);
                            ** GOTO lbl-1000
                        }
                        case 5: {
                            if (!av.f(var1_1)) ** GOTO lbl72
                            this.a.i(this);
                            ** GOTO lbl-1000
lbl72:
                            // 1 sources

                            if (!this.e(var1_1)) ** GOTO lbl-1000
                            ** GOTO lbl-1000
                        }
                        case 90: {
                            if (this.b(1) == null) ** GOTO lbl-1000
                            if (System.currentTimeMillis() - ((d)this.b((int)1)).a <= 1000L) ** GOTO lbl84
                            var10_7 = (d)this.b(1);
                            var10_7.a += 1000L;
                            var11_27 = new int[]{90007, 90017, 90027};
                            for (var2_2 = 0; var2_2 < var11_27.length; ++var2_2) {
                                var10_7 = (ar)this.a(var11_27[var2_2]);
                                if (var10_7.a() && var10_7.a(-1, false) && this.a.a(this, var11_27[var2_2] - 1)) ** GOTO lbl-1000
                            }
lbl84:
                            // 2 sources

                            if (!av.f(var1_1) || !this.a.a(this, this.f())) ** GOTO lbl-1000
                            ** GOTO lbl-1000
                        }
                        case 84: {
                            a.v.a().a(var2_2);
                            ** GOTO lbl-1000
                        }
                        case 145: {
                            if (this.b(0) != null && this.b(0).b() == 0 && System.currentTimeMillis() - ((d)this.b((int)4)).a > 30000L) {
                                for (var3_3 = ay.b.size() - 1; var3_3 >= 0; --var3_3) {
                                    var10_8 = (bc)ay.b.elementAt(var3_3);
                                    var10_8.c = (short)(var10_8.c - 30);
                                }
                                var10_8 = (d)this.b(4);
                                var10_8.a += 30000L;
                                if (av.a(this, 145003).equals(s.a[120])) {
                                    this.a.a(this, var5_5 * 1000 + 5, 145003, 0, -1, -1);
                                }
                            }
                        }
                        case 146: {
                            if (var5_5 != 145) ** GOTO lbl113
                            var3_3 = 145003;
lbl102:
                            // 2 sources

                            while (av.a(this, var1_1, var3_3)) {
                                var10_8 = this.a;
                                if (var5_5 != 145) ** GOTO lbl115
                                var1_1 = 145003;
lbl106:
                                // 2 sources

                                while (true) {
                                    var10_8.a(this, var5_5 * 1000 + 5, var1_1, 0, -1, -1);
lbl108:
                                    // 7 sources

                                    while (true) {
                                        if (var2_2 == 0 || var5_5 != 145) ** GOTO lbl-1000
                                        this.a.r(this);
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                    break;
                                }
                            }
                            ** GOTO lbl117
lbl113:
                            // 1 sources

                            var3_3 = 146004;
                            ** GOTO lbl102
lbl115:
                            // 1 sources

                            var1_1 = 146004;
                            ** continue;
lbl117:
                            // 1 sources

                            if (var1_1 != s.a[7] && var1_1 != s.a[8]) ** GOTO lbl130
                            if (var5_5 != 145 || !av.a(this, 145003).equals(s.a[120])) ** GOTO lbl122
                            this.e(var1_1);
                            ** GOTO lbl108
lbl122:
                            // 1 sources

                            var10_8 = (q)this.a(var5_5 * 1000 + 5);
                            if (this.f() != var5_5 * 1000 + 5) ** GOTO lbl128
                            var7_31 = true;
lbl125:
                            // 2 sources

                            while (true) {
                                q.a((q)var10_8, var7_31, var1_1);
                                ** GOTO lbl108
                                break;
                            }
lbl128:
                            // 1 sources

                            var7_31 = false;
                            ** continue;
lbl130:
                            // 1 sources

                            if (!av.f(var1_1)) ** GOTO lbl108
                            if (var5_5 != 145) ** GOTO lbl134
                            this.a.p(this);
                            ** GOTO lbl108
lbl134:
                            // 1 sources

                            var10_8 = new String[]{s.a[2], s.d[141]};
                            if (var10_8 == null) ** GOTO lbl108
                            bb.a();
                            bb.a(var10_8, this);
                            ** continue;
                        }
                        case 28: 
                        case 29: 
                        case 30: {
                            if (!av.f(var1_1)) ** GOTO lbl144
                            this.a.a(this);
                            ** GOTO lbl-1000
lbl144:
                            // 1 sources

                            if (var1_1 != s.a[0] && var3_3 <= 0) ** GOTO lbl-1000
                            if (this.a / 1000 > 28 && (var10_9 = a.f.a((int)(this.a / 1000 - true))) != null) {
                                var10_9.a(true);
                            }
                            a.f.a((int)(this.a / 1000));
                            ** GOTO lbl-1000
                        }
                        case 122: {
                            if (!av.a(this, var1_1, 122004)) ** GOTO lbl154
                            this.a.G(this);
                            ** GOTO lbl-1000
lbl154:
                            // 1 sources

                            if (!av.f(var1_1)) ** GOTO lbl-1000
                            this.a.H(this);
                            ** GOTO lbl-1000
                        }
                        case 25: {
                            if (!av.a(this, var1_1, 25012)) ** GOTO lbl161
                            this.a.b(this, true);
                            ** GOTO lbl-1000
lbl161:
                            // 1 sources

                            if (var1_1 != s.a[7] && var1_1 != s.a[8]) ** GOTO lbl170
                            var10_10 = (q)this.a(25015);
                            if (this.f() != 25015) ** GOTO lbl168
                            var7_32 = true;
lbl165:
                            // 2 sources

                            while (true) {
                                q.a(var10_10, var7_32, var1_1);
                                ** GOTO lbl-1000
                                break;
                            }
lbl168:
                            // 1 sources

                            var7_32 = false;
                            ** continue;
lbl170:
                            // 1 sources

                            if (!av.f(var1_1)) ** GOTO lbl-1000
                            this.a.n(this);
                            ** GOTO lbl-1000
                        }
                        case 23: {
                            if (var1_1 != s.a[0]) ** GOTO lbl184
                            if (this.d != 23005) ** GOTO lbl179
                            this.c(23005);
                            this.d(23003);
                            ** GOTO lbl-1000
lbl179:
                            // 1 sources

                            a.f.a(23);
                            bb.j();
                            ac.b = true;
                            ** GOTO lbl-1000
lbl184:
                            // 1 sources

                            if (!av.a(this, var1_1, 23008)) ** GOTO lbl191
                            if (this.a(23005).a()) {
                                this.c(23005);
                                this.d(23003);
                            }
                            this.a.a(this);
                            ** GOTO lbl-1000
lbl191:
                            // 1 sources

                            if (!av.f(var1_1)) ** GOTO lbl-1000
                            this.a.f(this);
                            ** GOTO lbl-1000
                        }
                        case 22: {
                            if (var1_1 == 0 && var2_2 == 0) ** GOTO lbl-1000
                            if (!av.f(var1_1)) ** GOTO lbl199
                            this.a.d(this);
                            ** GOTO lbl-1000
lbl199:
                            // 1 sources

                            if (var1_1 != s.a[0]) ** GOTO lbl202
                            this.a.e(this);
                            ** GOTO lbl-1000
lbl202:
                            // 1 sources

                            if (var1_1 != s.a[8]) ** GOTO lbl206
                            this.a.a = 1;
                            this.a.a();
                            ** GOTO lbl-1000
lbl206:
                            // 1 sources

                            if (var1_1 != s.a[4] || this.f() != 22001 || var6_6 != 22001) ** GOTO lbl-1000
                            this.b(22001, this.a.b);
                            ** GOTO lbl-1000
                        }
                        case 21: {
                            if (var1_1 == 0 && var2_2 == 0) ** GOTO lbl-1000
                            if (var1_1 != s.a[4] || this.f() != 21006 || var6_6 != 21006) ** GOTO lbl219
                            var10_11 = this.a(21006).a();
                            if (!var10_11.equals(this.a.b)) ** GOTO lbl216
                            this.b(21006, "");
                            ** GOTO lbl-1000
lbl216:
                            // 1 sources

                            if (!var10_11.equals("")) ** GOTO lbl-1000
                            this.b(21006, this.a.b);
                            ** GOTO lbl-1000
lbl219:
                            // 1 sources

                            if (var1_1 != s.a[2] && var1_1 != s.a[3]) ** GOTO lbl222
                            this.a.a(this, var1_1);
                            ** GOTO lbl-1000
lbl222:
                            // 1 sources

                            if (!av.f(var1_1)) ** GOTO lbl225
                            this.a.a(this);
                            ** GOTO lbl-1000
lbl225:
                            // 1 sources

                            if (var1_1 != s.a[0]) ** GOTO lbl228
                            this.a.c(this);
                            ** GOTO lbl-1000
lbl228:
                            // 1 sources

                            if (var1_1 != s.a[7]) ** GOTO lbl232
                            this.d(21008);
                            this.a.a(this);
                            ** GOTO lbl-1000
lbl232:
                            // 1 sources

                            if (var1_1 != s.a[8]) ** GOTO lbl-1000
                            this.d(21005);
                            this.a.a();
                            ** GOTO lbl-1000
                        }
                        case 20: {
                            if (!av.f(var1_1)) ** GOTO lbl240
                            this.a.a(this);
                            ** GOTO lbl-1000
lbl240:
                            // 1 sources

                            if (var1_1 != s.a[8]) ** GOTO lbl243
                            this.a.a();
                            ** GOTO lbl-1000
lbl243:
                            // 1 sources

                            if (var1_1 != s.a[0]) ** GOTO lbl-1000
                            this.a.b(this);
                            ** GOTO lbl-1000
                        }
                    }
                    if (var1_1 != s.a[6] && var1_1 != s.a[1]) break block118;
                    this.a.L(this);
                    ** GOTO lbl-1000
                }
                if (var1_1 != s.a[7] || this.f() == 1003) ** GOTO lbl-1000
                var11_28 = ad.a();
                if (ad.a().a() <= 0) break block119;
                var10_12 = s.a[12];
lbl254:
                // 2 sources

                while (true) {
                    var11_28.a(var10_12);
                    ** GOTO lbl-1000
                    break;
                }
            }
            var10_12 = null;
            ** while (true)
            {
                case 12: {
                    if (this.e(var1_1)) ** GOTO lbl-1000
                    if (!av.a(this, var1_1, 12003)) ** GOTO lbl282
                    var2_2 = ((h)this.a(12003)).f();
                    var10_13 = (q)this.a(12004);
                    if (var2_2 != 0) ** GOTO lbl273
                    var1_1 = 15;
                    var10_13.a(new ar(s.b[93], s.a[3], 0), 1);
                    var10_13.a(new ar(s.b[94], s.a[3], 0), 2);
lbl270:
                    // 4 sources

                    while (true) {
                        z.a().a(this.a(0, var1_1, 0, 1, 0), 2);
                        ** GOTO lbl-1000
                        break;
                    }
lbl273:
                    // 1 sources

                    if (var2_2 != 1) ** GOTO lbl278
                    var1_1 = 28;
                    var10_13.a(new ar(s.b[95], s.a[3], 0), 1);
                    var10_13.a(new ar(s.b[96], s.a[3], 0), 2);
                    ** GOTO lbl270
lbl278:
                    // 1 sources

                    var1_1 = var2_2;
                    if (var2_2 != 2) ** GOTO lbl270
                    var1_1 = 32;
                    ** continue;
lbl282:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.h(this);
                    ** GOTO lbl-1000
                }
                case 15: {
                    if (this.e(var1_1) || !av.f(var1_1)) ** GOTO lbl-1000
                    this.a.e(this);
                    ** GOTO lbl-1000
                }
                case 17: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.E(this);
                    ** GOTO lbl-1000
                }
                case 16: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.f(this);
                    ** GOTO lbl-1000
                }
                case 7: {
                    if (var2_2 != 0) {
                        this.a.Q(this);
                    }
                }
                case 8: {
                    if (var1_1 != s.a[2] && var1_1 != s.a[3]) ** GOTO lbl304
                    this.a.b(this, var1_1);
                    ** GOTO lbl-1000
lbl304:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.N(this);
                    ** GOTO lbl-1000
                }
                case 9: {
                    if (!av.f(var1_1) || this.f() != 9009) ** GOTO lbl-1000
                    if (!((ar)this.a).a().equals(s.b[193])) ** GOTO lbl312
                    this.a.y(this);
                    ** GOTO lbl-1000
lbl312:
                    // 1 sources

                    if (!((ar)this.a).b.equals("")) ** GOTO lbl315
                    this.a.x(this);
                    ** GOTO lbl-1000
lbl315:
                    // 1 sources

                    a.f.a(((ar)this.a).b, "", (int)(this.a + true), -1, false, this, null);
                    ** GOTO lbl-1000
                }
                case 118: {
                    if (!av.f(var1_1)) ** GOTO lbl341
                    if (this.f() != 118002) ** GOTO lbl336
                    var1_1 = ((q)this.a(118002)).e();
                    if (((q)this.a(118002)).a(var1_1) == null) ** GOTO lbl-1000
                    var10_14 = (Vector)this.a(0);
                    if (!this.a(118001).a()) ** GOTO lbl333
                    z.a().a(1531, (af)new t(2), new an(((an)var10_14.elementAt((int)var1_1)).a));
lbl326:
                    // 3 sources

                    while (true) {
                        this.a(1, new an(this.c));
                        var10_14 = this.a;
                        ad.a(this, true);
lbl330:
                        // 3 sources

                        while (true) {
                            ac.a(true, false);
                            ** GOTO lbl-1000
                            break;
                        }
                        break;
                    }
lbl333:
                    // 1 sources

                    if (((an)var10_14.elementAt((int)var1_1)).a == 0) ** GOTO lbl326
                    z.a().a(1531, (af)new t(4), new an(((an)var10_14.elementAt((int)var1_1)).a));
                    ** continue;
lbl336:
                    // 1 sources

                    if (this.f() != 118003 || this.a.c.size() <= 0) ** GOTO lbl330
                    var10_15 = (af[])this.a.c.elementAt(0);
                    ay.a.a(var10_15[0].b(), var10_15[1].b(), var10_15[2].b(), 0);
                    ** continue;
lbl341:
                    // 1 sources

                    if (var1_1 != s.a[0]) ** GOTO lbl-1000
                    if (!this.a(118001).a() || !this.a(118002).a()) ** GOTO lbl346
                    a.f.a(118);
                    ** GOTO lbl-1000
lbl346:
                    // 1 sources

                    if (!this.a(118001).a() || this.a(118002).a()) ** GOTO lbl354
                    this.c(118001);
                    this.c(118002, true);
                    this.c(118003);
                    this.c = (short)((an)this.b((int)1)).a;
                    av.c((int)(this.a / 1000), this.c);
                    ((q)this.a(118002)).b(0, 35);
                    ** GOTO lbl-1000
lbl354:
                    // 1 sources

                    if ((this.a(118001).a() || !this.a(118002).a()) && (this.a(118001).a() || this.a(118002).a())) ** GOTO lbl-1000
                    this.c(118004);
                    z.a().a(1531, new t(0));
                    ac.a(true, false);
                    var10_16 = this.a;
                    ad.a(this, true);
                    ** GOTO lbl-1000
                }
                case 114: {
                    if (var1_1 != s.a[6]) ** GOTO lbl365
                    bn.a(s.d[375], 13, 4, this.f(), (bi)this.a);
                    ** GOTO lbl-1000
lbl365:
                    // 1 sources

                    if (var1_1 != s.a[1]) ** GOTO lbl-1000
                    for (var1_1 = 0; var1_1 < 3; ++var1_1) {
                        if (this.a(114007 + var1_1).a().length() >= 6) continue;
                        a.f.a(s.d[583]);
                        ** GOTO lbl-1000
                    }
                    w.a = new String[]{this.a(114007).a(), this.a(114008).a(), this.a(114009).a()};
                    if (this.b(0).b() != 0) ** GOTO lbl382
                    this.a.a(false, null);
                    var10_17 = this.a.a(1055);
                    this.a.a(var10_17.a());
                    this.a.a.a();
                    var10_17 = this.a;
                    w.a = false;
lbl379:
                    // 2 sources

                    while (true) {
                        ac.b();
                        ** GOTO lbl-1000
                        break;
                    }
lbl382:
                    // 1 sources

                    var10_18 = this.a.a(1097);
                    a.u.a.b(var10_18.a());
                    ** continue;
                }
                case 115: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    if (this.f() != 115002 && this.f() != 115004 && this.f() != 115005 && this.f() != 115011 && this.f() != 115013 && this.f() != 115008) ** GOTO lbl390
                    bn.a(s.d[375], 13, 0, this.f(), (bi)this);
                    ** GOTO lbl-1000
lbl390:
                    // 1 sources

                    if (this.f() != 115015) ** GOTO lbl394
                    a.f.b(119);
                    ** GOTO lbl-1000
lbl394:
                    // 1 sources

                    if (this.f() != 115009) ** GOTO lbl-1000
                    var11_29 = ((n)this.a(115002)).a();
                    var14_35 = ((n)this.a(115004)).a();
                    var13_37 = ((n)this.a(115005)).a();
                    var10_19 = ((n)this.a(115011)).a();
                    var12_39 = ((n)this.a(115008)).a();
                    var15_41 = ((n)this.a(115013)).a();
                    if (!var11_29.equals("") && !var14_35.equals("") && !var13_37.equals("") && !var10_19.equals("") && !var12_39.equals("") && !var15_41.equals("")) ** GOTO lbl405
                    a.f.a("Xin h\u00e3y \u0111i\u1ec1n \u0111\u1ea7y \u0111\u1ee7 th\u00f4ng tin\uff01");
                    ** GOTO lbl-1000
lbl405:
                    // 1 sources

                    if (var12_39.equals(var15_41)) ** GOTO lbl409
                    a.f.a("M\u1eadt kh\u1ea9u kh\u00f4ng kh\u1edbp\uff0cxin h\u00e3y \u0111i\u1ec1n l\u1ea1i\uff01");
                    ** GOTO lbl-1000
lbl409:
                    // 1 sources

                    System.out.println(new StringBuffer().append("szAccount = ").append(var11_29).append(" szNewPassword = ").append(var12_39).append(" szNewPassword_1 = ").append((String)var15_41).append(" szSuper_1 = ").append(var14_35).append(" szSuper_2 = ").append(var13_37).append(" szSuper_3 = ").append(var10_19).toString());
                    this.a.a(false, null);
                    var15_41 = new am();
                    var15_41.a(1064);
                    var15_41.b(4);
                    var15_41.a(var11_29);
                    var15_41.a(var14_35);
                    var15_41.a(var13_37);
                    var15_41.a(var10_19);
                    var15_41.a(var12_39);
                    var15_41.d(0);
                    this.a.a(var15_41.a());
                    this.a.a.a();
                    ** GOTO lbl-1000
                }
                case 119: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    if (this.f() != 119002 && this.f() != 119004 && this.f() != 119005 && this.f() != 119008 && this.f() != 119011) ** GOTO lbl428
                    bn.a(s.d[375], 13, 0, this.f(), (bi)this);
                    ** GOTO lbl-1000
lbl428:
                    // 1 sources

                    if (this.f() != 119009) ** GOTO lbl-1000
                    var12_40 = ((n)this.a(119002)).a();
                    var10_20 = ((n)this.a(119008)).a();
                    var11_30 = ((n)this.a(119004)).a();
                    var15_42 = ((n)this.a(119005)).a();
                    var14_36 = ((n)this.a(119011)).a();
                    if (!var12_40.equals("") && !var11_30.equals("") && !var15_42.equals("") && !var14_36.equals("") && !var10_20.equals("")) ** GOTO lbl438
                    a.f.a("Xin h\u00e3y \u0111i\u1ec1n \u0111\u1ea7y \u0111\u1ee7 th\u00f4ng tin\uff01");
                    ** GOTO lbl-1000
lbl438:
                    // 1 sources

                    System.out.println(new StringBuffer().append("szAccount = ").append(var12_40).append(" szPassword = ").append(var10_20).append(" szSuper_1 = ").append(var11_30).append(" szSuper_2 = ").append(var15_42).append(" szSuper_3 = ").append(var14_36).toString());
                    this.a.a(false, null);
                    var13_38 = new am();
                    var13_38.a(1064);
                    var13_38.b(3);
                    var13_38.a(var12_40);
                    var13_38.a(var10_20);
                    var13_38.a(var11_30);
                    var13_38.a(var15_42);
                    var13_38.a(var14_36);
                    var13_38.d(0);
                    this.a.a(var13_38.a());
                    this.a.a.a();
                    ** GOTO lbl-1000
                }
                case 110: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.b(this);
                    ** GOTO lbl-1000
                }
                case 104: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.c(this);
                    ** GOTO lbl-1000
                }
                case 105: {
                    if (this.e(var1_1) || !av.f(var1_1)) ** GOTO lbl-1000
                    this.a.e(this);
                    ** GOTO lbl-1000
                }
                case 103: {
                    var8_43 = ((d)this.b((int)0)).a;
                    if (var2_2 == 0 && ac.e == 0 && !ac.a(var3_3, var4_4) && (bl.l <= 0 || System.currentTimeMillis() - var8_43 <= 2000L)) ** GOTO lbl-1000
                    a.f.a(var5_5);
                    ** GOTO lbl-1000
                }
                case 4: {
                    if (!av.f(var1_1)) ** GOTO lbl474
                    this.a.n(this);
                    ** GOTO lbl-1000
lbl474:
                    // 1 sources

                    if (var1_1 != s.a[0]) ** GOTO lbl-1000
                    var10_21 = this.a;
                    bb.a("", false);
                    a.f.a(50);
                    ** GOTO lbl-1000
                }
                case 11: {
                    if (!av.f(var1_1)) ** GOTO lbl484
                    this.a.p(this);
                    ** GOTO lbl-1000
lbl484:
                    // 1 sources

                    if (var1_1 != s.a[0]) ** GOTO lbl-1000
                    var10_22 = this.a;
                    bb.a("", false);
                    ** GOTO lbl-1000
                }
                case 13: {
                    if (av.f(var1_1) || !this.e(var1_1)) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                case 10: {
                    if (!av.f(var1_1)) ** GOTO lbl495
                    this.a.r(this);
                    ** GOTO lbl-1000
lbl495:
                    // 1 sources

                    if (var1_1 != s.a[0]) ** GOTO lbl-1000
                    this.a.s(this);
                    ** GOTO lbl-1000
                }
                case 2: {
                    if (bb.d) ** GOTO lbl-1000
                    if (((d)this.b((int)2)).a != 0L) ** GOTO lbl508
                    if (ac.a(var3_3, var4_4) || var2_2 != 0 || ac.e != 0) {
                        if (this.a.a() != -1) {
                            w.m(this);
                        }
                        this.a(2, new d(-1L));
                        this.d(2007);
                        this.a.j(this);
                    }
                    ** GOTO lbl-1000
lbl508:
                    // 1 sources

                    if (var1_1 == 0) ** GOTO lbl513
                    if (this.f() != 2021) break block120;
                    var2_2 = 1;
lbl511:
                    // 2 sources

                    while (true) {
                        ((ar)this.a(2021)).a(new bf(4552828, 0), var2_2);
lbl513:
                        // 2 sources

                        if (!av.f(var1_1)) ** GOTO lbl516
                        this.a.k(this);
                        ** GOTO lbl-1000
lbl516:
                        // 1 sources

                        if (var1_1 != s.a[0]) ** GOTO lbl-1000
                        MyMidlet.m_Midlet.exit(false);
                        ** GOTO lbl-1000
                        break;
                    }
                }
                case 50: {
                    if (ac.a(var3_3, var4_4)) {
                        var1_1 = 999;
                    }
                    this.a.b(var1_1, this);
                    ** GOTO lbl-1000
                }
                case 45: {
                    if (!av.a(this, var1_1, 45004)) ** GOTO lbl528
                    this.a.v(this);
                    ** GOTO lbl-1000
lbl528:
                    // 1 sources

                    if (var1_1 != s.a[7] && var1_1 != s.a[8]) ** GOTO lbl537
                    var10_23 = (q)this.a(45003);
                    if (this.f() != 45003) ** GOTO lbl535
                    var7_33 = true;
lbl532:
                    // 2 sources

                    while (true) {
                        q.a(var10_23, var7_33, var1_1);
                        ** GOTO lbl-1000
                        break;
                    }
lbl535:
                    // 1 sources

                    var7_33 = false;
                    ** continue;
lbl537:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.w(this);
                    ** GOTO lbl-1000
                }
                case 46: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.L(this);
                    ** GOTO lbl-1000
                }
                case 47: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.M(this);
                    ** GOTO lbl-1000
                }
                case 48: {
                    this.a = 0L;
                    if (this.d != -1) {
                        this.d(-1);
                    }
                    if (var2_2 == 0 && var1_1 != s.a[1]) ** GOTO lbl-1000
                    this.a.a(this, (short)var1_1, (short)var2_2);
                    ** GOTO lbl-1000
                }
                case 31: {
                    if (!this.e(var1_1)) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                case 33: {
                    if (this.e(var1_1)) ** GOTO lbl-1000
                    if (!av.a(this, var1_1, 33002)) ** GOTO lbl564
                    this.a.h(this);
                    ** GOTO lbl-1000
lbl564:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.b(this, 0);
                    ** GOTO lbl-1000
                }
                case 34: {
                    if (this.e(var1_1) || !av.f(var1_1)) ** GOTO lbl-1000
                    this.a.a(this, 0);
                    ** GOTO lbl-1000
                }
                case 35: {
                    if (this.e(var1_1) || !av.f(var1_1)) ** GOTO lbl-1000
                    this.a.s(this);
                    ** GOTO lbl-1000
                }
                case 36: {
                    if (this.b(0).b() == 1 && this.e(var1_1)) ** GOTO lbl-1000
                    if (!av.a(this, var1_1, 36002)) ** GOTO lbl580
                    this.a.u(this);
                    ** GOTO lbl-1000
lbl580:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.b(this, 0, var1_1);
                    ** GOTO lbl-1000
                }
                case 51: {
                    if (this.e(var1_1)) ** GOTO lbl-1000
                    if (!av.a(this, var1_1, 51004)) ** GOTO lbl588
                    this.a.w(this);
                    ** GOTO lbl-1000
lbl588:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.z(this);
                    ** GOTO lbl-1000
                }
                case 38: {
                    if (!av.a(this, var1_1, 38002)) ** GOTO lbl618
                    if (((h)this.a(38002)).f() != 1) ** GOTO lbl610
                    if (!((h)this.a(38002)).a().equals("Th\u0103m b\u1ea1n")) ** GOTO lbl608
                    this.c(38005);
                    this.c(38004);
                    this.b(38006);
                    this.b(38003);
                    this.d(38003);
                    this.a(38003, 1312, 14, ((q)this.a(38003)).f(), null);
                    this.b(0);
lbl604:
                    // 6 sources

                    while (true) {
                        if (this.e(var1_1)) {
                            // empty if block
                        }
                        ** GOTO lbl-1000
                        break;
                    }
lbl608:
                    // 1 sources

                    z.a().a(1132, new ba(27));
                    ** GOTO lbl604
lbl610:
                    // 1 sources

                    if (!((h)this.a(38002)).a().equals("Trang vi\u00ean")) ** GOTO lbl616
                    this.c(38003);
                    this.c(38006);
                    this.b(38005);
                    this.c(38004, true);
                    ** GOTO lbl604
lbl616:
                    // 1 sources

                    z.a().a(1132, new ba(28));
                    ** GOTO lbl604
lbl618:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl604
                    this.a.C(this);
                    ** continue;
                }
                case 39: {
                    if (this.e(var1_1)) ** GOTO lbl-1000
                    if (!av.a(this, var1_1, 39002)) ** GOTO lbl626
                    this.a.c(this, true);
                    ** GOTO lbl-1000
lbl626:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.c(this, false);
                    ** GOTO lbl-1000
                }
                case 40: {
                    if (this.e(var1_1)) ** GOTO lbl-1000
                    if (!av.a(this, var1_1, 40011)) ** GOTO lbl639
                    if (this.b(0).b() == 0) {
                        this.a(0, -1, 0, 1, 0);
                        this.a(1003).a(((h)this.a(40011)).f());
                        this.b(0);
                    }
                    ** GOTO lbl-1000
lbl639:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.m(this);
                    ** GOTO lbl-1000
                }
                case 41: {
                    if (this.e(var1_1)) ** GOTO lbl-1000
                    if (!av.a(this, var1_1, 41011)) ** GOTO lbl651
                    this.a(0, -1, 0, 1, 0);
                    this.a(1003).a(((h)this.a(41011)).f() + 1);
                    this.b(0);
                    ** GOTO lbl-1000
lbl651:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.o(this);
                    ** GOTO lbl-1000
                }
                case 42: {
                    if (this.e(var1_1)) ** GOTO lbl-1000
                    if (!av.a(this, var1_1, 42011)) ** GOTO lbl664
                    if (this.b(0).b() == 1) {
                        // empty if block
                    }
                    this.a(0, ((h)this.a(42011)).f() + 1, 0, 1, 0);
                    this.b(0);
                    ** GOTO lbl-1000
lbl664:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.q(this);
                    ** GOTO lbl-1000
                }
                case 43: {
                    if (var2_2 != 0) {
                        this.a.g(this);
                    }
                    if (this.e(var1_1) || !av.f(var1_1)) ** GOTO lbl-1000
                    this.a.s(this);
                    ** GOTO lbl-1000
                }
                case 56: {
                    if (this.e(var1_1) || !av.f(var1_1)) ** GOTO lbl-1000
                    this.a.B(this);
                    ** GOTO lbl-1000
                }
                case 57: {
                    if (var2_2 == 0 && var1_1 == 0 || this.b(1) == null) ** GOTO lbl-1000
                    if (this.b(1).b() != 1) ** GOTO lbl684
                    a.f.a(s.d[73]);
                    this.d(57020);
                    ** GOTO lbl-1000
lbl684:
                    // 1 sources

                    var2_2 = this.b(2).b();
                    if (var2_2 != 3 && var2_2 != 1 && var2_2 != 4 || this.f() == 57004 || av.a(this, 57004, 1000) != null && av.a((av)this, (int)57004, (int)1000).d != -1) ** GOTO lbl688
                    this.d(57004);
                    ** GOTO lbl-1000
lbl688:
                    // 1 sources

                    if (!this.a(57040).a() || !av.a(this, var1_1, 57040)) ** GOTO lbl692
                    if (var2_2 == 0) {
                        z.a().a(1521, (af)new ba(16), (af)new an(av.a((av)this, (int)57005, (int)0).d), new t((byte)(((h)this.a(57040)).f() + 5)));
                    }
                    ** GOTO lbl-1000
lbl692:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.C(this);
                    ** GOTO lbl-1000
                }
                case 59: {
                    if (this.e(var1_1)) ** GOTO lbl-1000
                    if (!this.a(59006).a() || !av.a(this, var1_1, 59006)) ** GOTO lbl700
                    this.a.J(this);
                    ** GOTO lbl-1000
lbl700:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.K(this);
                    ** GOTO lbl-1000
                }
                case 61: {
                    this.a.a(this);
                    ** GOTO lbl-1000
                }
                case 66: {
                    if (!this.e(var1_1)) ** GOTO lbl717
                    for (var1_1 = 66004; var1_1 <= this.j / 100; ++var1_1) {
                        var10_24 = (q)this.a(var1_1);
                        if (var10_24.a(0) != null) {
                            var10_24.d();
                        }
                        this.c(var1_1);
                    }
                    var10_24 = this.a;
                    ad.a(this, true);
                    ** GOTO lbl-1000
lbl717:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl720
                    this.a.F(this);
                    ** GOTO lbl-1000
lbl720:
                    // 1 sources

                    if (!av.a(this, var1_1, 66021)) ** GOTO lbl-1000
                    this.a.E(this);
                    ** GOTO lbl-1000
                }
                case 67: {
                    if (this.a(67007) == null) ** GOTO lbl-1000
                    var10_25 = this.b(4);
                    if (var10_25.b() > 0 && System.currentTimeMillis() - ((d)this.b((int)3)).a > 1000L) {
                        var10_25.a(var10_25.b() - 1);
                        ((d)this.b((int)3)).a = System.currentTimeMillis();
                        this.a(67009, al.a(var10_25.b()));
                    }
                    if ((var2_2 != 0 || var1_1 != 0) && this.d == 67007 && ((q)this.a(67007)).e() < 2) {
                        if (var2_2 == s.a[4]) {
                            this.d(67006);
                        }
                        ((q)this.a(67007)).b(2);
                    }
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.H(this);
                    ** GOTO lbl-1000
                }
                case 93: {
                    if (var1_1 != s.a[0]) ** GOTO lbl742
                    a.f.a(93);
                    ** GOTO lbl-1000
lbl742:
                    // 1 sources

                    if (var1_1 != s.a[7] && var1_1 != s.a[8]) ** GOTO lbl751
                    var10_26 = (q)this.a(93005);
                    if (this.f() != 93005) ** GOTO lbl749
                    var7_34 = true;
lbl746:
                    // 2 sources

                    while (true) {
                        q.a(var10_26, var7_34, var1_1);
                        ** GOTO lbl-1000
                        break;
                    }
lbl749:
                    // 1 sources

                    var7_34 = false;
                    ** continue;
lbl751:
                    // 1 sources

                    if (!av.a(this, var1_1, 93006)) ** GOTO lbl754
                    this.a.a(this, 93005, 93006, 0, -1, -1);
                    ** GOTO lbl-1000
lbl754:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.h(this);
                    ** GOTO lbl-1000
                }
                case 94: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    a.f.a(94);
                    ** GOTO lbl-1000
                }
                case 88: {
                    if (!av.a(this, var1_1, 88011)) ** GOTO lbl766
                    this.a.F(this);
                    ** GOTO lbl-1000
lbl766:
                    // 1 sources

                    if (this.e(var1_1) || !av.f(var1_1)) ** GOTO lbl-1000
                    this.a.G(this);
                    ** GOTO lbl-1000
                }
                case 89: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.I(this);
                    ** GOTO lbl-1000
                }
                case 70: {
                    if (!av.a(this, var1_1, 70003)) ** GOTO lbl777
                    this.a.a(this, true);
                    ** GOTO lbl-1000
lbl777:
                    // 1 sources

                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.x(this);
                    ** GOTO lbl-1000
                }
                case 72: {
                    if (!av.f(var1_1)) ** GOTO lbl784
                    this.a.B(this);
                    ** GOTO lbl-1000
lbl784:
                    // 1 sources

                    if (!this.e(var1_1)) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                case 73: {
                    if (!av.a(this, var1_1, 73012)) ** GOTO lbl790
                    this.a.b(this, true);
                    ** GOTO lbl-1000
lbl790:
                    // 1 sources

                    if (this.e(var1_1) || !av.f(var1_1)) ** GOTO lbl-1000
                    this.a.D(this);
                    ** GOTO lbl-1000
                }
                case 77: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.u(this);
                    ** GOTO lbl-1000
                }
                case 78: {
                    if (!av.f(var1_1)) ** GOTO lbl-1000
                    this.a.v(this);
                    ** GOTO lbl-1000
                }
                ** case 6:
            }
lbl802:
            // 1 sources

            if (!av.f(var1_1) && var1_1 != s.a[0]) ** GOTO lbl-1000
            this.a.b(this, var1_1);
            ** while (true)
        }
        var2_2 = 0;
        ** while (true)
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public void a(int n2, bi bi2) {
        short s2;
        int n3;
        int n4;
        block17: {
            block16: {
                n3 = n4 = 3;
                int n5 = 0;
                block8: do {
                    switch (n5 == 0 ? this.a / 1000 : n5) {
                        default: {
                            if (this.a != null && this.a.b != 7) {
                                if (this.a.b != 4) break;
                                n3 = n4;
                                n5 = 28;
                                continue block8;
                            }
                            break block16;
                        }
                        case 1: {
                            if (this.b(5).b() != 10015) return;
                            bn.a(s.d[375], -1, n.d(((n)this.a).e()), this.a.a(), (bi)this);
                            return;
                        }
                        case 48: {
                            n3 = 2;
                            n5 = 28;
                            continue block8;
                        }
                        case 50: {
                            if ((this.f & 0x20) != 0) {
                                this.f = (short)(this.f | 0x10);
                                this.a.a[0] = 1L;
                                n3 = 0;
                                n5 = 28;
                                continue block8;
                            }
                            break block16;
                        }
                        case 2: {
                            if (this.d == 2003 || this.d == 2004) {
                                bn.a(s.d[370], 13, 4, 2003, 2004, bi2);
                                n3 = 0;
                            } else {
                                if (this.d == -1) break block16;
                                n3 = 2;
                            }
                        }
                        case 28: 
                        case 29: 
                        case 30: {
                            break block17;
                        }
                        case 21: 
                        case 22: {
                            if (n2 != 27) return;
                            if (this.a / 1000 == 21) {
                                ((r)this.a(21001)).a(s.a[3], 0, -1, -1);
                                return;
                            }
                            ((r)this.a(22003)).a(s.a[3], 0, -1, -1);
                            return;
                        }
                    }
                    break;
                } while (true);
                n3 = 2;
                break block17;
            }
            n3 = 0;
        }
        if ((n3 & 1) != 0 && (n4 = a.h.f(n2)) != -1 && n4 < ((h)this.a).g()) {
            if (!((h)this.a).b(n4)) {
                return;
            }
            this.a(s.a[6], s.a[6], -1, -1);
            return;
        }
        if ((n3 & 2) == 0) return;
        if ((n2 = a.h.h(n2)) == -1) return;
        ac.d = s2 = (short)s.a[n2];
        ac.c = s2;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(int var1_1, g var2_2) {
        block145: {
            var6_3 = 0;
            var7_4 = 0;
            var5_5 = 1;
            var8_6 = 1;
            var9_7 = var2_2.a;
            block0 : switch (this.a / 1000) {
                case 26: {
                    if (var1_1 != 1789450000) return;
                    this.a.l(this);
                    break;
                }
                case 66: {
                    if (var1_1 == 1789450000) {
                        this.a.G(this);
                        break;
                    }
                    if (var1_1 != this.a + 2) return;
                    var2_2 = av.a(this, this.f(), 1000);
                    ay.a.a(var2_2.e, var2_2.b, var2_2.c, 66);
                    break;
                }
                case 5: {
                    if (var1_1 == 1789450000) {
                        this.a.j(this);
                        break;
                    }
                    if (var1_1 != this.a + 14 || (var2_2 = a.f.a(1)) == null) return;
                    z.a().a(1537, (af)new ba(2), (af)new an(av.a((av)this, (int)5005, (int)1000).d), new an(Integer.parseInt(var2_2.a(1003).a())));
                    break;
                }
                case 145: {
                    if (var1_1 == this.a + 4) {
                        var2_2 = (h)this.a(145003);
                        var10_8 = a.f.a(1).a(1003).a();
                        if (var10_8.equals("") || Integer.parseInt(var10_8) <= 0) {
                            a.f.a(s.d[17]);
                            break;
                        }
                        if (var2_2.a().equals(s.a[76])) {
                            a.u.a((short)11, ap.o, Integer.parseInt(var10_8), (byte)0, (short)0, (short)0, 0);
lbl37:
                            // 2 sources

                            while (true) {
                                ac.a(true, false);
                                break block0;
                                break;
                            }
                        }
                        a.u.a((short)10, ap.o, Integer.parseInt(var10_8), (byte)0, (short)0, (short)0, 0);
                        ** continue;
                    }
                    if (var1_1 != this.a + 3) ** GOTO lbl59
                    var2_2 = ay.a(av.a((av)this, (int)145005, (int)1000).d, ay.a);
                    var1_1 = var2_2.b;
                    if ((var2_2.e & 128) != 0) {
                        var4_13 = var2_2.a;
                        var1_1 = 1;
lbl48:
                        // 2 sources

                        while (true) {
                            var1_1 = var2_2.c * var2_2.a / 2 / var1_1;
                            if (((t)ay.a.a.elementAt((int)21)).a == 1) {
                                var1_1 = var1_1 * 13 / 10;
                            }
                            if (var1_1 <= 0) {
                                // empty if block
                            }
                            ac.a(true, false);
                            a.u.a((byte)2, ap.o, var2_2.a, var4_13, (byte)0);
                            this.a.a(var2_2.a);
                            break block0;
                            break;
                        }
                    }
                    break block145;
lbl59:
                    // 1 sources

                    if (var1_1 == this.a + true) {
                        var1_1 = av.a((av)this, (int)145005, (int)1000).e;
                        var5_5 = ((n)a.f.a(1).a(1003)).f();
                        if (var5_5 <= 0 || var5_5 > 99) {
                            a.f.a(s.d[189]);
                            break;
                        }
                        var6_3 = this.b(1).b();
                        if (var6_3 == 1) {
                            z.a().a(1508, new t(3), new t(1), new an(var1_1), new an(var5_5));
                            break;
                        }
                        if (var6_3 == 2) {
                            z.a().a(1601, new t(3), new t((byte)ap.o), new an(var1_1), new ba((short)var5_5));
                            break;
                        }
                        a.u.a((byte)1, ap.o, var1_1, (short)var5_5, (byte)0);
                        break;
                    }
                    if (var1_1 == this.a + 2) {
                        var2_2 = ay.a(av.a((av)this, (int)145005, (int)1000).d, ay.a);
                        this.a.a((bc)var2_2, var2_2.a);
                        this.a.a(var2_2.a);
                        break;
                    }
                    if (var1_1 != 1789450000) return;
                    this.a.q(this);
                    break;
                }
                case 146: {
                    if (var1_1 == this.a + 2) {
                        var2_2 = a.f.a(1).a(1003).a();
                        if (var2_2.equals("")) {
                            a.f.a(s.d[152]);
                            break;
                        }
                        z.a().a(1130, (af)new t(15), (af)new an(av.a((av)this, (int)146005, (int)1000).d), new j((String)var2_2));
                        break;
                    }
                    if (var1_1 != 1789450000) return;
                    a.a.a().b(this);
                    break;
                }
                case 122: {
                    if (var1_1 == this.a + 2) {
                        var2_2 = z.a();
                        if (((h)this.a(122004)).f() == 0) {
                            var3_15 = 4;
lbl100:
                            // 2 sources

                            while (true) {
                                var2_2.a(1523, new t(var3_15));
                                break block0;
                                break;
                            }
                        }
                        var3_15 = 9;
                        ** continue;
                    }
                    if (var1_1 != 1970000000 && var1_1 != 1930000000) return;
                    this.a.a(this, this.a.a(true));
                    break;
                }
                case 110: {
                    if (var1_1 != this.a + 2) return;
                    MyMidlet.m_Midlet.exit(true);
                    break;
                }
                case 104: {
                    if (var1_1 == 1930000000 || var1_1 == 1940000000) {
                        au.a((q)this.a(104009), this.a.a(true), null);
                        break;
                    }
                    if (var1_1 == 1789450000) {
                        this.a.d(this);
                        break;
                    }
                    if (var1_1 == this.a + true) {
                        var1_1 = ((n)a.f.a(1).a(1003)).f();
                        if (var1_1 <= 0) return;
                        var5_5 = ay.a.g(15);
                        if (var1_1 > var5_5 - 10000) {
                            var1_1 = var5_5 - 10000;
                        }
                        au.a((q)this.a(104009), bc.a(3200), new an(var1_1));
                        break;
                    }
                    if (var1_1 == this.a + 2) {
                        var1_1 = ((n)a.f.a(1).a(1003)).f();
                        if (var1_1 <= 0) return;
                        z.a().a(1500, (af)new ba(10), new an(var1_1));
                        ac.a(true, false);
                        break;
                    }
                    if (var1_1 != this.a + 3) return;
                    var1_1 = ((n)a.f.a(1).a(1003)).f();
                    if (var1_1 < 0) {
                        var1_1 = var7_4;
                    }
                    ((ar)av.a(this, 104012, 1001)).a(Integer.toString(var1_1));
                    break;
                }
                case 105: {
                    if (var1_1 == 1789450000) {
                        this.a.f(this);
                        break;
                    }
                    if (var1_1 != this.a + 2) return;
                    ac.a(true, false);
                    z.a().a(1500, (af)new ba(2), new an(av.a((av)this, (int)105006, (int)1000).b));
                    break;
                }
                case 23: {
                    if (var1_1 != 1789450000) return;
                    this.a.g(this);
                    break;
                }
                case 22: {
                    if (1789450000 != var1_1 && 1930000000 != var1_1 && 1940000000 != var1_1) return;
                    this.a.a(this, var1_1, 22001);
                    break;
                }
                case 21: {
                    if (1789450000 == var1_1 || 1930000000 == var1_1 || 1940000000 == var1_1) {
                        this.a.a(this, var1_1, 21006);
                        break;
                    }
                    if (var1_1 != this.a + 2 || (var1_1 = ((n)a.f.a(1).a(1003)).f()) <= 0) return;
                    z.a().a(1303, (af)new t(11), new an(var1_1));
                    ac.a(true, false);
                    break;
                }
                case 20: {
                    if (var1_1 == this.a + true) {
                        var2_2 = a.f.a(1).a(1003).a();
                        if (var2_2.equals("") || Integer.parseInt((String)var2_2) < 0) {
                            var2_2 = "0";
                        }
                        if ((var1_1 = Integer.parseInt((String)var2_2)) > ay.a.g(15)) {
                            a.f.a(s.d[485]);
                            break;
                        }
                        if (var1_1 > 90000000) {
                            a.f.a("S\u1ed1 l\u01b0\u1ee3ng giao d\u1ecbch qu\u00e1 l\u1edbn, m\u1ed9t l\u1ea7n giao d\u1ecbch kh\u00f4ng qu\u00e1 9 ngh\u00ecn v\u1ea1n");
                            break;
                        }
                        ((ar)av.a(this, 20004, 1)).a((String)var2_2);
                        break;
                    }
                    if (1789450000 == var1_1) {
                        this.a.c(this);
                        break;
                    }
                    if (var1_1 != 1930000000 && var1_1 != 1940000000) return;
                    var5_5 = this.f();
                    if (var5_5 == 20004) {
                        var2_2 = (q)this.a(20004);
                        au.a((q)var2_2, this.a.a(true), null);
                        var5_5 = var2_2.h();
                        var1_1 = var2_2.f() - 1;
                        while (true) {
                            if (var1_1 <= 0 || var2_2.a((int)(var1_1 * var5_5)).d == -1) return;
                            if (var1_1 == 1) {
                                a.f.a("B\u1ea3ng giao d\u1ecbch \u0111\u00e3 \u0111\u1ea7y!");
                            }
                            --var1_1;
                        }
                    }
                    if (var5_5 != 20022) return;
                    this.a.a(this, var1_1, 20023);
                    break;
                }
                case 12: {
                    var5_5 = this.a;
                    if (this.a + true != var1_1 && this.a + 2 != var1_1 && this.a + 3 != var1_1 && 1789450000 != var1_1) return;
                    this.a.a(var1_1, this);
                    break;
                }
                case 2: {
                    if (var1_1 == this.a + 2) {
                        this.a.d();
                        break;
                    }
                    if (this.a + 4 != var1_1 && this.a + 3 != var1_1) ** GOTO lbl217
                    var1_1 = ((h)a.f.a(1).a(1006)).f();
                    if (var1_1 == 0) {
                        var1_1 = var8_6;
lbl211:
                        // 3 sources

                        while (true) {
                            w.c(var1_1);
                            break block0;
                            break;
                        }
                    }
                    if (var1_1 != 1) ** GOTO lbl211
                    var1_1 = 0;
                    ** continue;
lbl217:
                    // 1 sources

                    if (var1_1 == this.a + 5) {
                        MyMidlet.m_Midlet.ConnectAddr = "http://wap.ul3g.com/user/user_login.php";
                        MyMidlet.m_Midlet.exit(false);
                        break;
                    }
                    if (var1_1 != 1789450000) return;
                    this.a.l(this);
                    break;
                }
                case 4: {
                    if (var1_1 == 1789450000) {
                        this.a.o(this);
                        break;
                    }
                    if (var1_1 == this.a + 2) {
                        this.a.d();
                        break;
                    }
                    if (var1_1 != this.a + 103) return;
                    MyMidlet.m_Midlet.exit(true);
                    break;
                }
                case 11: {
                    if (var1_1 == 1789450000) {
                        this.a.q(this);
                        break;
                    }
                    if (var1_1 == this.a + 4) {
                        this.a.a((byte)1);
                        break;
                    }
                    if (var1_1 != this.a + 13) return;
                    MyMidlet.m_Midlet.ConnectAddr = MyMidlet.m_Midlet.BindAddr;
                    MyMidlet.m_Midlet.exit(true);
                    break;
                }
                case 10: {
                    if (var1_1 != this.a + 15) return;
                    this.a.t(this);
                    break;
                }
                case 7: {
                    if (var1_1 == this.a + 2) {
                        z.a().a(1129, new ba(3));
                        break;
                    }
                    if (var1_1 == this.a + 3) {
                        z.a().a(1510, (af)new t(4), new an(av.a((av)this, (int)7012, (int)1000).d));
                        break;
                    }
                    if (var1_1 == this.a + 4) {
                        this.c(7045);
                        this.b(4).a(7046);
                        this.c(7046, true);
                        z.a().a(1006, (af)new t(15), new t(0));
                        ac.a(true, false);
                        break;
                    }
                    if (var1_1 == this.a + 5) {
                        this.c(7046);
                        this.b(4).a(7045);
                        this.c(7045, true);
                        z.a().a(1006, (af)new t(15), new t(1));
                        ac.a(true, false);
                        break;
                    }
                }
                case 8: {
                    if (var1_1 == this.a + true) {
                        var2_2 = a.f.a(1).a(1003).a();
                        if (var2_2.equals("") || (var5_5 = Integer.parseInt((String)var2_2)) < 1) {
                            a.f.a("H\u00e3y nh\u1eadp tr\u1ecb s\u1ed1 ch\u00ednh x\u00e1c");
                            break;
                        }
                        var7_4 = this.a;
                        var1_1 = var6_3;
                        if (this.a / 1000 == 7) {
                            var1_1 = 6;
                        }
                        if (var5_5 > av.a((av)this, (int)(var7_4 + 8), (int)var1_1).d) {
                            a.f.a("Xin l\u1ed7i, \u0111i\u1ec3m s\u1ed1 thu\u1ed9c t\u00ednh c\u00f2n l\u1ea1i kh\u00f4ng \u0111\u1ee7");
                            break;
                        }
                        var1_1 = ((q)this.a((int)(this.a + 8))).i();
                        if (this.a / 1000 == 8) {
                            var4_14 = 2;
lbl288:
                            // 2 sources

                            while (true) {
                                z.a().a(1128, this.b(1), new ba(var4_14), new t((byte)var1_1), new ba((short)var5_5));
                                break block0;
                                break;
                            }
                        }
                        var4_14 = 1;
                        var1_1 -= 2;
                        ** continue;
                    }
                    if (var1_1 == 1930000000) {
                        this.a.P(this);
                        break;
                    }
                    if (var1_1 != 1789450000) return;
                    this.a.O(this);
                    break;
                }
                case 9: {
                    if (var1_1 != this.a + true) return;
                    this.a.x(this);
                    break;
                }
                case 1: {
                    if (var9_7 != 1005) return;
                    this.a.M(this);
                    break;
                }
                case 15: {
                    if (var1_1 != 1789450000) return;
                    this.a.d(this);
                    break;
                }
                case 17: {
                    if (var1_1 == 1789450000) {
                        this.a.F(this);
                        break;
                    }
                    if (var1_1 != 1930000000) return;
                    this.a.g(this, this.f());
                    break;
                }
                case 45: {
                    if (var1_1 != 1789450000) return;
                    this.a.x(this);
                    break;
                }
                case 46: {
                    if (var1_1 != this.a + 2) return;
                    z.a().a(1205, new ba(6));
                    ac.a(true, false);
                    break;
                }
                case 48: {
                    if (var1_1 == 1789450000) {
                        this.a.y(this);
                        break;
                    }
                    if (var1_1 != 1970000000) return;
                    this.a.z(this);
                    break;
                }
                case 33: {
                    if (var1_1 != 1789450000 && var1_1 != this.a + true && var1_1 != this.a + 3 && var1_1 != this.a + 4) return;
                    this.a.b(this, var1_1);
                    break;
                }
                case 34: {
                    if (var1_1 != 1789450000) return;
                    this.a.a(this, var1_1);
                    break;
                }
                case 35: {
                    if (var1_1 != 1789450000) return;
                    this.a.t(this);
                    break;
                }
                case 36: {
                    if (var1_1 == 1789450000) {
                        this.a.d(this, var1_1);
                        break;
                    }
                    if (var1_1 != this.a + 2) return;
                    var10_9 = (ar)av.a(this, this.f(), 1001);
                    var2_2 = av.a(this, this.f(), 1000);
                    if (this.f() % 2 != 0) ** GOTO lbl362
                    if (var2_2.d == 0) {
                        var1_1 = var10_9.d * 1000 + var2_2.d + 1;
lbl357:
                        // 3 sources

                        while (true) {
                            z.a().a(1103, new ba(62), new an(av.a((av)this, (int)(this.f() - 1), (int)1001).e), new an(var1_1), new an(this.f()));
                            break block0;
                            break;
                        }
                    }
                    var1_1 = var10_9.d * 1000 + var2_2.d;
                    ** GOTO lbl357
lbl362:
                    // 1 sources

                    var1_1 = var10_9.d;
                    ** continue;
                }
                case 51: {
                    if (var1_1 != 1789450000) return;
                    this.a.A(this);
                    break;
                }
                case 38: {
                    if (var1_1 != 1789450000) return;
                    this.a.C(this);
                    break;
                }
                case 40: {
                    if (var1_1 == this.a + true) {
                        var1_1 = ((n)a.f.a(1).a(1003)).f();
                        if (var1_1 <= 0 || var1_1 > 99) {
                            a.f.a(s.d[189]);
                            break;
                        }
                        var2_2 = av.a(this, 40014, 1003).a();
                        if (aw.b((String)var2_2) && Integer.parseInt((String)var2_2) < var1_1) {
                            a.f.a(this.a(40020).a());
                            break;
                        }
                        if (this.b(0).b() == 2884) {
                            a.u.a((byte)13, ap.o, av.a((av)this, (int)40014, (int)1000).d, (short)var1_1, (byte)0);
lbl386:
                            // 2 sources

                            while (true) {
                                this.b(0);
                                break block0;
                                break;
                            }
                        }
                        a.u.a((byte)11, 0, av.a((av)this, (int)40014, (int)1000).d, (short)var1_1, (byte)0);
                        ** continue;
                    }
                    if (var1_1 != 1789450000) return;
                    this.a.n(this);
                    break;
                }
                case 41: {
                    if (var1_1 != 1789450000) return;
                    this.a.p(this);
                    break;
                }
                case 42: {
                    if (var1_1 != 1789450000) return;
                    this.a.r(this);
                    break;
                }
                case 43: {
                    if (var1_1 == this.a + 6) {
                        var1_1 = av.a((av)this, (int)43015, (int)1001).d;
                        if (var1_1 == this.a.b()) return;
                        z.a().a(1023, (af)new ba(12), new an(var1_1));
                        break;
                    }
                    if (var1_1 == this.a + 5) {
                        var1_1 = av.a((av)this, (int)43015, (int)1001).d;
                        if (var1_1 == this.a.b()) return;
                        z.a().a(1023, new ba(9));
                        z.a().a(1023, (af)new ba(34), new an(var1_1));
                        break;
                    }
                    if (var1_1 != 1789450000) return;
                    this.a.t(this);
                    break;
                }
                case 56: {
                    if (var1_1 == 1789450000) {
                        this.a.A(this);
                        break;
                    }
                    if (var9_7 != 56002) return;
                    a.f.a(56);
                    break;
                }
                case 57: {
                    if (var1_1 == 1789450000) {
                        this.a.D(this);
                        break;
                    }
                    if (var1_1 == 1930000000 || var1_1 == 1940000000) {
                        this.a.E(this);
                        break;
                    }
                    if (var1_1 != this.a + true) return;
                    var2_2 = (q)this.a(57004);
                    var5_5 = var2_2.h();
                    var11_16 = new af[var2_2.f()];
                    block58: for (var1_1 = 0; var1_1 < var11_16.length; ++var1_1) {
                        var10_10 = var2_2.a(var1_1 * var5_5);
                        if (var10_10.d == -1) {
                            var11_16[var1_1] = new an(Integer.parseInt(var2_2.a(var1_1 * var5_5 + 2).a()));
lbl441:
                            // 2 sources

                            continue block58;
                        }
                        var11_16[var1_1] = new t((byte)var10_10.d);
                        ** continue;
                    }
                    z.a().a(1107, (af)new ba(44), (af)new t((byte)av.a((av)this, (int)57003, (int)0).d), var11_16);
                    ac.a(true, false);
                    break;
                }
                case 67: {
                    if (var1_1 == 1789450000) {
                        this.a.I(this);
                        break;
                    }
                    if (var1_1 != this.a + 2) return;
                    var10_11 = a.f.a(66);
                    if (var10_11 == null || var10_11.b(0).b() != 22) ** GOTO lbl482
                    var1_1 = var10_11.f();
                    if (var1_1 % 2 == 0) {
                        ++var1_1;
                    }
                    if (((q)var10_11.a(var1_1)).f() > 1) {
                        var11_17 = new ba(0);
                        var12_20 = new ba(0);
                        ((q)var10_11.a(var1_1)).d();
                        var2_2 = new af[]{var11_17, var12_20};
lbl463:
                        // 3 sources

                        while (true) {
                            z.a().a(1403, new ba(7), this.b(1), (af)var2_2[0], (af)var2_2[1]);
                            if (var1_1 > 0) {
                                z.a().a(1403, (af)new ba(6), (af)new an(av.a((av)var10_11, (int)(var1_1 - 1), (int)1000).d), new an(var1_1));
                            }
                            a.f.a(67);
                            ac.a(true, false);
                            break block0;
                            break;
                        }
                    }
                    var12_21 = var10_11.a(1002);
                    if (var12_21.b() > 0 && !var10_11.a(66006).a()) {
                        var12_21.a(var12_21.b() - 1);
                    }
                    var11_18 = var10_11.a(1001);
                    for (var1_1 = var10_11.j / 100; var1_1 >= 66004; --var1_1) {
                        var10_11.c(var1_1);
                        ((q)var10_11.a(var1_1)).d();
                    }
                    var2_2 = new af[]{var12_21, var11_18};
                    var1_1 = 0;
                    ** GOTO lbl463
lbl482:
                    // 1 sources

                    var2_2 = av.a(66, 66006, -1);
                    var1_1 = 0;
                    ** continue;
                }
                case 93: {
                    if (var1_1 == 1789450000) {
                        this.a.i(this);
                        break;
                    }
                    if (var1_1 == this.a + true) {
                        this.a.l(this);
                        break;
                    }
                    if (var1_1 == this.a + 2) {
                        this.a.j(this);
                        break;
                    }
                    if (var1_1 != this.a + 3) return;
                    this.a.k(this);
                    break;
                }
                case 88: {
                    if (1789450000 != var1_1) return;
                    this.a.H(this);
                    break;
                }
                case 70: {
                    if (1930000000 == var1_1) {
                        this.a.z(this);
                        break;
                    }
                    if (1940000000 == var1_1) {
                        this.a.A(this);
                        break;
                    }
                    if (1789450000 == var1_1) {
                        this.a.y(this);
                        break;
                    }
                    if (var1_1 != this.a + 2) return;
                    var11_19 = av.a(this, 70020, 0);
                    ac.a(true, false);
                    var13_23 = z.a();
                    var10_12 = new ba(1);
                    var12_22 = new an(var11_19.d);
                    var2_2 = new an(var11_19.e);
                    var14_24 = this.a;
                    if (var11_19.b == 32) {
                        var1_1 = 2808;
lbl522:
                        // 2 sources

                        while (true) {
                            var14_24 = new an(var14_24.a(var1_1));
                            var1_1 = var5_5;
                            if (var11_19.c > 0) {
                                var1_1 = var11_19.c;
                            }
                            var13_23.a(1138, var10_12, var12_22, (af)var2_2, (af)var14_24, new t((byte)var1_1), new an(((n)this.a(70021)).f()), new an(((n)this.a(70023)).f()));
                            break block0;
                            break;
                        }
                    }
                    var1_1 = 2833;
                    ** continue;
                }
                case 72: {
                    if (var1_1 != 1789450000) return;
                    this.a.C(this);
                    break;
                }
                case 73: {
                    if (var1_1 == this.a + true) {
                        var2_2 = av.a(this, 73014, 1000);
                        if (var2_2 == null) return;
                        ac.a(true, false);
                        z.a().a(1519, (af)new ba(1), (af)new t(2), new an(var2_2.d));
                        break;
                    }
                    if (var1_1 != this.a + 2) return;
                    ac.a(true, false);
                    z.a().a(1519, (af)new ba(2), (af)new t(1), new an(((n)this.a(73021)).f()));
                    break;
                }
                case 78: {
                    if (var1_1 != this.a + 3) return;
                    var2_2 = ((h)a.f.a(1).a(1006)).a();
                    ((ar)this.a(78005)).a((String)var2_2);
                    ((ar)this.a((int)78005)).b = var2_2;
                    break;
                }
            }
            return;
        }
        var4_13 = 1;
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int n2, Object object) {
        if (this.b == null) {
            return;
        }
        if (n2 < this.b.size()) {
            this.b.setElementAt(object, n2);
            return;
        }
        this.b.addElement(object);
    }

    public void a(int n2, String string) {
        ((ar)this.a(n2)).a(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(g g2) {
        if (g2.a() >= 48007 && g2.a() <= 48010) {
            this.a(s.a[g2.a() - 48007 + 2], 0, -1, -1);
            return;
        }
        this.f(s.a[6], s.a[6]);
    }

    public void a(g g2, boolean bl2) {
        if (!g2.a() && this.a.a(g2.a()) != null) {
            this.d(g2);
            g2.a(true);
            if (bl2) {
                this.d(g2.a());
            }
        }
    }

    @Override
    public void a(DataInputStream dataInputStream) {
    }

    public void a(String string) {
        this.e = new StringBuffer().append("\u203b").append(string).append("\u203b").toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(String charSequence, String string, int n2) {
        if (!av.a((String)charSequence, n2)) {
            a.f.a(s.d[562]);
            return;
        }
        if (this.a / 1000 == 2) {
            if (!av.a(string, n2)) {
                a.f.a(s.d[562]);
                return;
            }
            this.b(2004, string);
            this.b(2003, (String)charSequence);
            return;
        }
        if (this.a(this.f()) != null && this.a(this.f()).a() == 7) {
            this.b(this.f(), (String)charSequence);
        }
        switch (this.a / 1000) {
            default: {
                return;
            }
            case 3: 
            case 12: {
                if (((String)charSequence).equals("")) return;
                if (((String)charSequence).substring(0, 1).equals("/")) return;
                StringBuffer stringBuffer = al.a(null, "*1");
                string = stringBuffer.toString();
                charSequence = al.a(stringBuffer, (String)charSequence);
                a.u.a(2026, this.a.b(string, this.a.a(((StringBuffer)charSequence).toString())), "", ay.a.a());
                return;
            }
            case 70: {
                if (this.f() != 70005) return;
                switch (((q)this.a).i()) {
                    default: {
                        this.a.a(null, 2833, av.a((av)this, (int)70005, (int)1000).c, (String)charSequence);
                        return;
                    }
                    case 0: {
                        this.a.a(null, 2808, 0, (String)charSequence);
                        return;
                    }
                    case 6: 
                }
                if (n2 == 2) {
                    this.a.a(null, 0, Integer.parseInt((String)charSequence), "");
                    return;
                }
                this.a.a(null, 0, 0, (String)charSequence);
                return;
            }
            case 72: {
                this.a.a(this, 0, (String)charSequence);
                return;
            }
            case 57: 
        }
        if (this.b(0).b() == 100) {
            ((ar)av.a(this, 57004, 1002)).a((String)charSequence);
            return;
        }
        if (((String)charSequence).equals("")) return;
        if (this.b(0).b() != 2877) return;
        this.a.a(this, (short)2, null, Integer.parseInt((String)charSequence));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(Graphics graphics) {
        switch (this.a / 1000) {
            case 11: {
                new bf(5010000).a(graphics, 0, 0, 0);
            }
            default: {
                this.e(graphics);
                return;
            }
            case 2: {
                if (bb.d) {
                    graphics.setColor(0);
                    graphics.fillRect(0, 0, (int)ac.a, (int)ac.b);
                    if (ay.a.a()) {
                        ay.a.a(ac.a >> 1, ac.b >> 1, graphics);
                        ay.a.a(-1);
                        if (ay.a.a()) return;
                        this.a(2, new d(System.currentTimeMillis()));
                        return;
                    }
                    if (this.a(1) != null && System.currentTimeMillis() - ((d)this.b((int)2)).a < 3000L) {
                        Image image = (Image)this.a(1);
                        graphics.drawImage(image, ac.a - image.getWidth() >> 1, ac.b - image.getHeight() >> 1, 0);
                        return;
                    }
                    this.a(2, new d(0L));
                    bb.d = false;
                }
                graphics.setColor(s.a);
                graphics.fillRect(0, 0, (int)ac.a, (int)ac.b);
                ((bf)this.a(5)).a(graphics, 0, 0, 0);
                if (((d)this.b((int)2)).a == -1L) {
                    this.e(graphics);
                } else if (System.currentTimeMillis() / 100L / 3L % 2L != 0L) {
                    al.a(graphics, "OB:1.07", 5, 1, 0xFFFFFF, 0);
                    al.a(graphics, "\u1ea4n ph\u00edm b\u1ea5t k\u1ef3 \u0111\u1ec3 v\u00e0o", ac.a - s.a.stringWidth("\u1ea4n ph\u00edm b\u1ea5t k\u1ef3 \u0111\u1ec3 v\u00e0o") >> 1, ac.b - 40, 0xFF0000, 0);
                }
                ay.c.a(ac.a >> 1, ac.b - 110, graphics);
                ay.c.a(-1);
                ay.b.a(ac.a - 30, 40, graphics);
                ay.b.a(-1);
                return;
            }
            case 21: 
            case 22: {
                this.c(graphics);
                int n2 = ac.a - s.a.stringWidth("Ph\u00edm 0 ki\u1ec3m tra v\u1eadt ph\u1ea9m") >> 1;
                int n3 = ac.b - s.h;
                graphics.setColor(0xFFFFFF);
                graphics.fillRect(n2 - 10, n3 - 5, s.a.stringWidth("Ph\u00edm 0 ki\u1ec3m tra v\u1eadt ph\u1ea9m") + 20, s.h + 10);
                al.a(graphics, "Ph\u00edm 0 ki\u1ec3m tra v\u1eadt ph\u1ea9m", n2, n3, 65280, 0);
                return;
            }
            case 4: 
            case 5: 
            case 7: 
            case 8: 
            case 9: 
            case 12: 
            case 13: 
            case 15: 
            case 17: 
            case 18: 
            case 20: 
            case 23: 
            case 25: 
            case 26: 
            case 31: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 38: 
            case 39: 
            case 40: 
            case 41: 
            case 42: 
            case 43: 
            case 45: 
            case 46: 
            case 47: 
            case 51: 
            case 56: 
            case 57: 
            case 59: 
            case 67: 
            case 70: 
            case 72: 
            case 73: 
            case 77: 
            case 78: 
            case 88: 
            case 89: 
            case 94: 
            case 104: 
            case 105: 
            case 110: 
            case 114: 
            case 115: 
            case 118: 
            case 119: 
            case 122: 
            case 145: 
            case 146: {
                this.c(graphics);
                return;
            }
            case 32: {
                this.c(graphics);
                this.b(graphics);
                return;
            }
            case 48: {
                aa.a().a(graphics);
                this.a.a(graphics, this);
                y y2 = (y)this.a(2);
                if (y2 != null) {
                    al.b(graphics);
                    if (y2.j == 32) {
                        ((ag)y2).a(graphics, this.b(4).b());
                    } else {
                        y2.a(graphics);
                    }
                    y2.n(0);
                }
                if (this.a(3) != null) {
                    aa aa2 = aa.a();
                    y2 = (y)this.a(0);
                    al.b(graphics);
                    byte by = y2.q;
                    byte by2 = aa.c;
                    byte by3 = y2.r;
                    byte by4 = aa.d;
                    graphics.drawRect(by * by2 - aa2.h, by3 * by4 - aa2.i, 16, 16);
                }
                al.b(graphics, 0, 0, (int)aa.f, aa.g);
                this.e(graphics);
                return;
            }
            case 10: {
                new bf(5010000).a(graphics, 0, 0, 0);
            }
            case 28: 
            case 29: 
            case 30: 
            case 61: 
            case 90: {
                this.e(graphics);
                return;
            }
            case 66: {
                if (this.b(0).b() != 10) {
                    this.c(graphics);
                    return;
                }
            }
            case 1: 
            case 6: 
            case 16: 
            case 93: 
            case 103: {
                al.c(graphics, (int)this.a, (int)this.b, this.g, this.h, s.a);
                this.e(graphics);
                if (this.a / 1000 == 93 || this.a / 1000 == 16) {
                    al.a(graphics, this.e, (int)this.a, (int)this.b, this.g, this.h, 0);
                    if (this.a / 1000 == 93) {
                        al.c(graphics, 0, ac.b - 21, (int)ac.a, 21, s.b);
                        al.b(graphics, 0, 0, ac.a, ac.b);
                    }
                    this.d(graphics);
                }
                al.d(graphics, (int)this.a, (int)this.b, this.g, this.h);
                return;
            }
            case 50: {
                if ((this.f & 0x200) != 0) {
                    Image image = bf.c(6002);
                    if (image != null) {
                        graphics.drawImage(image, (int)(this.a + (this.g - image.getWidth()) / 2), (int)(this.b - 9), 0);
                    }
                } else if ((this.f & 0x40) != 0 || (this.f & 0x80) != 0) {
                    al.c(graphics, (int)(this.a + true), (int)this.b, this.g - 3, this.h, s.a);
                    al.a(graphics, (int)(this.a + true), (int)this.b, this.g - 3, this.h, 0xFFFFFF);
                }
                this.e(graphics);
                return;
            }
            case 84: 
        }
        a.v.a().a(graphics);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(g g2, int n2, int n3) {
        int n4 = g2.a;
        if (this.f() != n4) {
            this.d(n4);
            this.a = g2;
            this.d = (short)n4;
        }
        switch (g2.a()) {
            default: {
                return false;
            }
            case 2: {
                return ((ar)g2).b(n2, n3);
            }
            case 4: {
                if (Math.abs(ac.c) <= ((h)g2).o) return ((h)g2).b(n2, n3);
                return false;
            }
            case 7: {
                return true;
            }
            case 12: {
                if (Math.abs(ac.c) <= ((q)g2).e(0)) return ((q)g2).b(n2, n3);
                return false;
            }
            case 11: 
        }
        if (Math.abs(ac.c) <= s.h) return ((r)g2).b(n2, n3);
        return false;
    }

    public af[] a(int n2, int n3, int n4, int n5, int n6) {
        if (n5 != 0) {
            this.b[1].a(n5);
        }
        if (n2 != 0) {
            this.b[2].a(n2);
        }
        if (n3 != -1) {
            this.b[3].a(n3);
        }
        if (n4 != -1) {
            this.b[this.b.length - 2].a(n4);
        }
        if (n6 != 0) {
            this.b[this.b.length - 1].a(n6);
        }
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public af[] a(int n2, int n3, int n4, int n5, af[] afArray) {
        int n6 = afArray == null ? 0 : afArray.length;
        int n7 = n6 + 6;
        if (this.b == null || this.b.length != n7) {
            this.b = new af[n7];
            for (n6 = 1; n6 < 4; ++n6) {
                this.b[n6] = new ba(1);
            }
            this.b[n7 - 2] = new ba(0);
            this.b[n7 - 1] = new ba(1);
        }
        this.b[0] = new an(n2);
        this.a(n3, n4, 0, 1, n5);
        if (afArray != null) {
            System.arraycopy(afArray, 0, this.b, 4, afArray.length);
        }
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public af b(int n2) {
        if (this.b == null) return null;
        if (n2 >= this.b.size()) return null;
        return (af)this.b.elementAt(n2);
    }

    public void b(int n2) {
        g g2 = this.a(n2);
        if (g2 != null) {
            this.a(g2, false);
        }
    }

    public void b(int n2, String string) {
        ((n)this.a(n2)).a(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(g g2) {
        int n2 = g2.a;
        switch (this.a / 1000) {
            case 2: {
                this.a.j(this);
                return;
            }
            case 10: {
                if (n2 < 10001) return;
                if (n2 > 10016) return;
                this.a.a(this, n2, null);
                return;
            }
            case 11: {
                this.a.a(this, 0, true);
                return;
            }
            case 36: {
                if (n2 < 36021) return;
                if (n2 > 36028) return;
                int n3 = this.b(1).b();
                if (n2 != n3) {
                    if (n3 >= 36021 && n3 <= 36028) {
                        ((ar)this.a(n3)).a().a(40025);
                    }
                    this.b(1).a(n2);
                }
                ((ar)g2).a().a(40026);
                if (this.a.c(n2 - 36021)) return;
                this.d(n2 - 1);
                return;
            }
        }
    }

    @Override
    public void b(String string) {
    }

    /*
     * Unable to fully structure code
     */
    public boolean b(int var1_1) {
        block6: {
            block4: {
                block5: {
                    if (this.b == null || var1_1 != 0 && this.b[0].b() > 0 && this.f() != this.b[0].b()) break block4;
                    var2_2 = this.b[this.b.length - 2].b();
                    if (var1_1 == 0) {
                        var3_3 = true;
lbl5:
                        // 4 sources

                        while (true) {
                            var4_4 = var3_3;
                            if (var3_3) {
                                this.b[this.b.length - 2].a(var2_2 + var1_1);
                                z.a().a(this.b, 2);
                                ac.a(true, false);
                                var4_4 = var3_3;
                            }
lbl12:
                            // 4 sources

                            return var4_4;
                        }
                    }
                    if (var1_1 != -1) break block5;
                    if (var2_2 <= 0) break block6;
                    var3_3 = true;
                    ** GOTO lbl5
                }
                if (var1_1 != 1 || var2_2 >= this.b[1].b() - 1) break block6;
                var3_3 = true;
                ** GOTO lbl5
            }
            var4_4 = false;
            ** while (true)
        }
        var3_3 = false;
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2, int n3) {
        boolean bl2 = true;
        if (this.a != 48 && this.a != true) {
            if (al.b(n2, n3, al.c, al.b)) {
                this.f(0, s.a[0]);
                return bl2;
            }
            if (al.a(n2, n3, al.c, al.b)) {
                this.f(0, s.a[1]);
                return bl2;
            }
            if (this.a(0) != null && al.a(n2, n3)) {
                this.f(0, s.a[7]);
                return bl2;
            }
            if (this.a(0) != null && al.b(n2, n3)) {
                this.f(0, s.a[8]);
                return bl2;
            }
        }
        if (this.c(n2, n3)) return bl2;
        return false;
    }

    @Override
    public void c() {
        this.a.g((int)(this.a / 1000));
        super.c();
        int n2 = this.a.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            ((g)this.a.a()).c();
        }
        this.a.a();
        this.a.removeAllElements();
        this.d = (short)-1;
        this.b = null;
    }

    public void c(int n2) {
        g g2 = this.a(n2);
        if (g2 != null) {
            if (g2.a()) {
                g2.a(false);
                if (this.a != null && g2.a == this.a.a) {
                    this.d();
                }
                g2.c();
            }
            this.a.removeElement(g2);
        }
    }

    public void c(int n2, boolean bl2) {
        g g2 = this.a(n2);
        if (g2 != null) {
            this.a(g2, bl2);
        }
    }

    public void c(g g2) {
        if (this.a.a(g2.a()) == null) {
            this.a.a(g2.a(), g2);
            g2.a(this);
        }
        if (g2.a()) {
            this.d(g2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean c() {
        this.a = null;
        this.d();
        var1_1 = this.a / 1000;
        var4_2 = this.a;
        ad.a(this, true);
        this.a.d((int)var1_1, this);
        switch (var1_1) lbl-1000:
        // 23 sources

        {
            default: lbl-1000:
            // 2 sources

            {
                while (true) {
                    this.m();
                    return true;
                }
            }
            case 5: {
                this.a(5005, 1537, 1, ((q)this.a(5005)).f(), null);
                this.b(0);
                ** GOTO lbl-1000
            }
            case 78: {
                this.a(0, (Object)"123");
                if (this.a(0) != null) {
                    var4_2 = this.a.a(Integer.parseInt(((String)this.a(0)).substring(0, 1)));
                    ((ar)this.a(78005)).a((String)var4_2);
                    ((ar)this.a((int)78005)).b = var4_2;
                }
            }
            case 77: {
                this.a("N\u1ea1p th\u1ebb t\u00e0i kho\u1ea3n");
                ** GOTO lbl-1000
            }
            case 84: {
                a.v.a().a();
                ** GOTO lbl-1000
            }
            case 145: {
                ((q)this.a(145004)).c(q.a[1] | q.a[3], true);
                ((q)this.a(145005)).c(q.a[1] | q.a[2], true);
                ** GOTO lbl-1000
            }
            case 146: {
                ((q)this.a(146005)).c((int)q.a[1], true);
                ** GOTO lbl-1000
            }
            case 118: {
                this.a(s.a[119]);
                this.d(118002);
                this.a(118002).b(0, this.a((int)118001).b + this.a((int)118001).h + 10);
                ((q)this.a(118002)).a(32, true);
                ((q)this.a(118002)).c((int)q.a[0], true);
                ** GOTO lbl-1000
            }
            case 114: {
                this.a(s.d[588]);
                ** GOTO lbl-1000
            }
            case 115: {
                this.a(s.d[589]);
                this.v = this.a((int)115010).b + this.a((int)115010).h;
                ** GOTO lbl-1000
            }
            case 119: {
                this.a("Thi\u1ebft l\u1eadp b\u1ea3o m\u1eadt");
                this.v = this.a((int)119010).b + this.a((int)119010).h;
                ** GOTO lbl-1000
            }
            case 110: {
                this.a(s.d[442]);
                var4_2 = (r)this.a(110002);
                var4_2.a(0, var4_2.f());
                var1_1 = var4_2.b;
                this.v = var4_2.h + var1_1 - 10;
                ** GOTO lbl-1000
            }
            case 103: {
                this.a(0, new d(System.currentTimeMillis()));
                ((q)this.a(103008)).c(q.a[1] | q.a[3], true);
                ** GOTO lbl-1000
            }
            case 23: {
                this.a(s.a[82]);
                ** GOTO lbl-1000
            }
            case 22: {
                this.a(0, new t(0));
                this.a(22011).a(512, true);
                ** GOTO lbl-1000
            }
            case 20: {
                this.a.a = 1;
                ap.a().d(false);
                ((q)this.a(20004)).c((int)q.a[1], true);
                ((q)this.a(20005)).c((int)q.a[1], true);
                this.f(20040);
                ** GOTO lbl-1000
            }
            case 11: {
                this.a(s.b[5]);
                ((ar)this.a(11004)).b(new bf(6070000), 35);
                var4_2 = this.a(11013);
                var5_4 = new x(30, 16, 3, 8, "0");
                var5_4.a = (bf[])11099;
                var5_4.b(var4_2.a, var4_2.b);
                this.c(var5_4);
                this.b(11099);
                ** GOTO lbl-1000
            }
            case 10: {
                this.a("T\u1ea1o nh\u00e2n v\u1eadt");
                ((ar)this.a(10017)).b(new bf(6070000), 35);
                var5_5 = (ar)this.a(10018);
                var4_2 = (ar)this.a(10019);
                var5_5.b = "10001";
                var4_2.b = "10015";
                this.a.a(this, 10001, null);
                ** GOTO lbl-1000
            }
            case 8: {
                ((q)this.a(8008)).c((int)q.a[0], true);
                ((q)this.a(8007)).c((int)q.a[0], true);
                ((q)this.a(8014)).c(q.a[0] | q.a[1], true);
                ** GOTO lbl-1000
            }
            case 2: {
                this.a(s.b[3]);
                var4_2 = a.b.a(s.b, 1);
                if (var4_2 == null) ** GOTO lbl147
                var5_6 = al.a((String)var4_2, "|");
                try {
                    if (!var5_6[0].equals("2")) ** GOTO lbl115
                    if (this.a.a != null) {
                        this.b(2003, this.a.a);
                    }
                    ** GOTO lbl142
                }
                catch (Exception var4_3) {
                }
lbl115:
                // 4 sources

                while (true) {
                    this.a(0, new j(this.a(2005).a()));
                    this.a(1, bf.c(5999));
                    var2_7 = bb.d != false ? System.currentTimeMillis() : 0L;
                    this.a(2, new d(var2_7));
                    this.a(3, (Object)null);
                    ay.a = bg.a(310000, 0);
                    ay.a.b(1000);
                    ay.b = bg.a(5020000, 0);
                    ay.b.b(2000);
                    ay.c = bg.a(30016, 0);
                    ay.c.b(2000);
                    this.a(4, a.b.a(s.c));
                    this.a(5, new bf(5010000));
                    this.a.j(this);
                    ** GOTO lbl-1000
                    break;
                }
lbl133:
                // 2 sources

                while (this.a.b != null) {
                    this.b(2004, this.a.b);
                    ad.c = this.a.b;
lbl136:
                    // 2 sources

                    while (true) {
                        this.a.c = var5_6[5];
                        var4_2 = new StringBuffer();
                        this.a(2006, var4_2.append("\u0110\u0103ng nh\u1eadp l\u1ea7n tr\u01b0\u1edbc:").append(var5_6[5]).toString());
                        ** GOTO lbl115
                        break;
                    }
                }
                ** GOTO lbl144
lbl142:
                // 1 sources

                this.b(2003, var5_6[1]);
                ** GOTO lbl133
lbl144:
                // 1 sources

                this.b(2004, var5_6[2]);
                ad.c = var5_6[2];
                ** continue;
lbl147:
                // 1 sources

                this.d(2003);
                ** continue;
            }
            case 6: {
                this.a.b = new Vector<E>(5);
                this.a.c = new Vector<E>();
                ** GOTO lbl-1000
            }
            case 56: {
                this.a("Ph\u1ed1i ph\u01b0\u01a1ng");
                this.a(56003).a(32, true);
                this.a(56004).a(32, true);
                ((q)this.a(56003)).c((int)q.a[1], true);
                ** GOTO lbl-1000
            }
            case 57: {
                var1_1 = 57003;
                while (true) {
                    if (var1_1 > 57010) ** GOTO lbl-1000
                    this.a((int)var1_1).a(32, true);
                    ((q)this.a((int)var1_1)).c((int)q.a[1], true);
                    ++var1_1;
                }
            }
            case 89: {
                this.a(s.b[74]);
                this.a(89005).a(544, true);
                ** GOTO lbl-1000
            }
            case 36: 
        }
        this.a.v(this);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean c(int n2) {
        boolean bl2 = false;
        if (n2 == 0) {
            return bl2;
        }
        int n3 = ac.b - 40 - 16;
        int n4 = n3 * n3 / this.v;
        if (this.v < n3) return bl2;
        if (n2 > 0) {
            this.c = this.c + n2 + n3 > this.v ? (short)(this.v - n3) : (short)(this.c + n2);
        } else if (n2 < 0) {
            this.c = this.c + n2 < 0 ? (short)0 : (short)(this.c + n2);
        }
        this.d = this.v == n3 ? (short)0 : (short)((n3 - n4) * this.c / (this.v - n3));
        av.c((int)(this.a / 1000), this.c);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean c(int n2, int n3) {
        boolean bl2 = false;
        int n4 = this.a.size() - 1;
        while (true) {
            int n5;
            short s2;
            short s3;
            boolean bl3 = bl2;
            if (n4 < 0) return bl3;
            g g2 = (g)this.a.elementAt(n4);
            if ((g2.f & 1) != 0 && al.a(n2, n3, (int)(s3 = g2.a), g2.g + (s2 = g2.a), g2.b - (n5 = (g2.f & 0x10) == 0 ? a.g.b(g2.a) : 0), g2.b - n5 + g2.h)) {
                if (!this.a(g2, n2, n3)) return true;
                this.a(g2);
                return true;
            }
            --n4;
        }
    }

    public void d(int n2) {
        g g2 = null;
        if (n2 == -1 || (g2 = this.a(n2)) != null && g2.a()) {
            if (this.a != null) {
                this.a.b(false);
            }
            this.d = (short)n2;
            this.a = g2;
            if (this.a != null) {
                this.a.b(true);
                g2.b();
                this.b(g2);
            }
            this.m();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean d(int n2) {
        boolean bl2 = false;
        if (n2 == 0) {
            return bl2;
        }
        short s2 = ac.a;
        if (this.u < s2) return bl2;
        if (n2 > 0) {
            this.c = this.c + n2 + s2 > this.u ? (short)(this.u - s2) : (short)(this.c + n2);
        } else if (n2 < 0) {
            this.c = this.c + n2 < 0 ? (short)0 : (short)(this.c + n2);
        }
        k = this.c;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int e() {
        int n2 = 18;
        int n3 = ac.c >> 1 << 1;
        int n4 = ac.d >> 1 << 1;
        if (n4 != 0) {
            n2 = n4 / 4 + n4 % 3;
            if (this.d(-n2)) {
                ac.a += n2;
                ac.d -= n2;
                return 0;
            }
            if (Math.abs(n4) <= 9) {
                ac.d = 0;
                return 0;
            } else {
                if (n4 > 0) {
                    ac.a += 18;
                    ac.d -= 18;
                    return s.a[2];
                }
                if (n4 >= 0) return 0;
                ac.a += -18;
                ac.d -= -18;
                return s.a[3];
            }
        }
        if (n3 == 0) return 0;
        n4 = n3 / 4 + n3 % 3;
        if (this.c(-n4)) {
            ac.b += n4;
            ac.c -= n4;
            return 0;
        } else {
            n4 = n2;
            if (this.a != null) {
                n4 = n2;
                switch (this.a.a()) {
                    default: {
                        n4 = n2;
                        break;
                    }
                    case 12: {
                        n4 = ((q)this.a).e(0);
                        break;
                    }
                    case 4: {
                        n4 = ((h)this.a).o;
                        break;
                    }
                    case 2: 
                    case 7: {
                        n4 = this.a.h;
                        break;
                    }
                    case 11: {
                        n4 = s.h;
                    }
                    case 3: 
                    case 5: 
                    case 6: 
                    case 8: 
                    case 9: 
                    case 10: 
                }
            }
            if (Math.abs(n3) <= n4 >> 1) {
                ac.c = 0;
                return 0;
            } else {
                if (n3 > 0) {
                    ac.b += n4;
                    ac.c -= n4;
                    return s.a[4];
                }
                if (n3 >= 0) return 0;
                ac.b += -n4;
                ac.c -= -n4;
                return s.a[5];
            }
        }
    }

    public void e(int n2) {
        g g2 = this.a(n2);
        this.f(n2);
        this.h = this.v + 24;
        this.b = (Vector)((short)(ac.b - 25 - this.h >> 1));
        g2.b = (short)(this.b + 8);
        this.f(n2);
        this.v = 1;
    }

    public void e(int n2, int n3) {
        this.b = (Vector)n2;
        this.c = (short)n3;
    }

    public int f() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(int n2) {
        g g2 = (g)this.a.a(n2);
        int n3 = this.a.a();
        n2 = 0;
        while (true) {
            int n4;
            g g3;
            if (n2 > n3 || (g3 = (g)this.a.a((n4 = g2.j) / 100)) == null) {
                g2 = (g)this.a.a(this.j / 100);
                if (g2 != null) break;
                return;
            }
            if (!g2.a() || n4 % 100 == 0) {
                g3.b(0, g2.b);
            } else {
                int n5;
                n4 = n5 = n4 % 100;
                if (n5 > 50) {
                    n4 = -(n5 - 50);
                }
                n5 = g2.b;
                g3.b(0, n4 + (g2.h + n5));
            }
            g2 = g3;
            ++n2;
        }
        n2 = g2.b;
        this.v = g2.h + n2 - 10 - this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void f(int n2, int n3) {
        if (ac.e / 10 == 32) {
            this.a(n2, n3, -1, -1);
            return;
        }
        this.a(0, 0, -1, -1);
    }

    public void l() {
        this.b = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void m() {
        if (this.a == null) {
            this.m = 18;
            return;
        }
        if (this.a.b == 12) {
            this.m = ((q)this.a).e(0);
            return;
        }
        if (this.a.b == 4) {
            this.m = ((h)this.a).o;
            return;
        }
        if (this.a.b == 11) {
            this.m = 18;
            return;
        }
        this.m = this.a.h;
    }
}

