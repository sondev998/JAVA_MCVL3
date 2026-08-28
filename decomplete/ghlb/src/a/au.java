/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.aa;
import a.ac;
import a.ad;
import a.af;
import a.al;
import a.am;
import a.an;
import a.ap;
import a.ar;
import a.av;
import a.aw;
import a.ax;
import a.ay;
import a.b;
import a.ba;
import a.bb;
import a.bc;
import a.bf;
import a.bg;
import a.bi;
import a.bn;
import a.d;
import a.f;
import a.g;
import a.h;
import a.j;
import a.m;
import a.n;
import a.q;
import a.r;
import a.s;
import a.t;
import a.u;
import a.w;
import a.x;
import a.z;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class au {
    public static au a;
    public static Vector a;
    public static af[] a;
    public static af[] b;
    public static boolean c;
    public static long d;
    public static Vector d;
    public static Vector e;
    public int a;
    public long a;
    public ad a;
    public bb a;
    public r a;
    public w a;
    public String a;
    public boolean a = -1;
    public int b;
    public long b;
    public r b;
    public String b;
    public Vector b;
    public boolean b = "";
    public int c;
    public long c;
    public r c;
    public Vector c = new r(100, 0, 1000, 0, 0);

    static {
        Static.regClass(11);
        au.cinitclone();
    }

    private void N(av av2) {
        av2.c(33006, false);
        av2.c(33004);
    }

    private void O(av av2) {
        bn.a("H\u00e3y nh\u1eadp v\u1eadt ph\u1ea9m b\u1ea1n mu\u1ed1n t\u00ecm:", 10, 0, "", (bi)av2);
    }

    public static au a() {
        if (a == null) {
            a = new au();
        }
        return a;
    }

    private void a(av av2, int n2, int n3, int n4) {
        q q2 = (q)av2.a(n2);
        av2.a(0, n3, n4, av2.b(1).b(), null);
        av2.b(0);
        q2.d();
        av2.c(33006);
        av2.c(33004);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void a(av av2, int object, int n2, int n3, int n4) {
        void var2_4;
        int n5;
        block4: {
            if (n5 == 32) {
                q q2 = (q)av2.a(70028);
                int n6 = q2.h();
                for (int i2 = q2.f() - 1; i2 >= 0; --i2) {
                    void var5_8;
                    void var4_7;
                    ar ar2 = (ar)q2.a(i2 * n6);
                    if (ar2 == null || ar2.e != var4_7 || !ar2.b.equals(Integer.toString(n5))) continue;
                    if (var5_8 > 0) {
                        reference var2_3 = ar2.b * var5_8 / ar2.n;
                        n5 = ar2.c * var5_8 / ar2.n;
                        break block4;
                    } else {
                        String string = ar2.b;
                        n5 = ar2.c;
                    }
                    break block4;
                }
            }
            n5 = object * 2;
        }
        av2.b(70021, new StringBuffer().append((int)var2_4).append("").toString());
        av2.b(70023, new StringBuffer().append(n5).append("").toString());
    }

    private void a(av av2, String string) {
        q q2 = (q)av2.a;
        if (!string.equals(s.d[325])) {
            int n2 = q2.f();
            int n3 = q2.h();
            for (int i2 = 0; i2 < n2; ++i2) {
                ((ar)q2.a(i2 * n3 + (n3 - 1))).a(s.d[325]);
            }
        }
        ((ar)av.a(av2, av2.f(), 1003)).a(string);
    }

    private void a(av av2, short s2) {
        if (ay.a.b() <= 4) {
            av2.c(33005, false);
            av2.c(33003, false);
            av2.f(33006);
        }
        z.a().a(1107, (af)new ba(s2), av2.b(2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(q q2, Object object, Object object2) {
        int n2 = q2.h();
        int n3 = q2.e() / n2 * n2;
        if (object == null) {
            object = new ar("", 0, 0);
            ((ar)object).a(new bf(5610000));
            q2.a((g)object, n3);
            q2.a(new ar("Tr\u1ed1ng", s.a[0], 0), n3 + 1);
            return;
        }
        if (object instanceof bc) {
            n2 = q2.a((int)n3).c;
            if (n2 <= 0) {
                n2 = 1;
            }
            object2 = new ar("", 0, 0);
            ((ar)object2).a((bc)object);
            ((ar)object2).d = 32;
            ((ar)object2).e = ((bc)object).a();
            ((ar)object2).b = (String)((bc)object).a;
            ((ar)object2).c = (byte)n2;
            q2.a((g)object2, n3);
            if (((bc)object).a > 1 && (((bc)object).e & 0x80) != 0) {
                ((ar)object2).n = n2;
            }
            q2.a(new ar(((bc)object).a, al.a(bc.a(((bc)object).a()), ((bc)object).f), 0), n3 + 1);
            return;
        }
        if (object instanceof ax) {
            object2 = new ar("", 0, 0);
            ((ar)object2).a(ax.a((ax)object, 0));
            ((ar)object2).d = 2;
            ((ar)object2).e = ((ax)object).g(1);
            ((ar)object2).b = (String)((ax)object).a();
            q2.a((g)object2, n3);
            q2.a(new ar(((ax)object).a(), s.a[0], 0), n3 + 1);
            return;
        }
        if (!(object instanceof bf)) return;
        ar ar2 = new ar("", 0, 0);
        ar2.a((bf)object);
        ar2.d = 128;
        q2.a(ar2, n3);
        ar2.b = (String)((af)object2).b();
        q2.a(new ar(object2.toString(), s.a[0], 0), n3 + 1);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void a(String[] stringArray, int object) {
        void var2_6;
        void var2_4;
        this.c.d();
        this.c.a((int)object, 1);
        if (stringArray == null) {
            return;
        }
        int n2 = stringArray.length;
        boolean bl2 = false;
        while (var2_4 < n2) {
            this.c.a(stringArray[var2_4]);
            ++var2_4;
        }
        this.c.a(0, this.c.f());
        if (this.c.a + this.c.g > ac.a) {
            if (this.c.g > this.c.a) {
                int n3 = (ac.a - this.c.g) / 2;
            } else {
                reference var2_7 = this.c.a - this.c.g;
            }
        } else {
            aw aw2 = this.c.a;
        }
        n2 = this.c.b + this.c.h > ac.b + 36 && this.c.h > this.c.b - 18 ? ac.b - this.c.h - 18 : (this.c.b + this.c.h > ac.b - 36 ? this.c.b - this.c.h : (int)this.c.b);
        this.c.b((int)var2_6, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(av av2, int n2) {
        boolean bl2 = false;
        String string = av2.a(n2).a();
        if (string.length() < 6) {
            f.a("M\u1eadt kh\u1ea9u ho\u1eb7c \u0111\u1ed9 d\u00e0i m\u1eadt kh\u1ea9u s\u1eeda kh\u00f4ng th\u1ec3 nh\u1ecf h\u01a1n 6");
            av2.d(n2);
            return bl2;
        }
        if (ad.c == null) return true;
        if (!string.equals(ad.c)) return true;
        f.a("M\u1eadt kh\u1ea9u ho\u1eb7c m\u1eadt kh\u1ea9u s\u1eeda kh\u00f4ng th\u1ec3 gi\u1ed1ng v\u1edbi m\u1eadt kh\u1ea9u t\u00e0i kho\u1ea3n");
        av2.d(n2);
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(av av2, int n2, int n3, String string) {
        if (av2.a(n2).a().equals(av2.a(n3).a())) return true;
        f.a(string);
        av2.d(n3);
        return false;
    }

    public static void cinitclone() {
        c = false;
    }

    public void A(av av2) {
        ax ax2 = this.a.a(true);
        q q2 = (q)av2.a(70020);
        ar ar2 = (ar)q2.a(0);
        ar2.d = ax2.a();
        ar2.b = Integer.toString(2);
        ar2.e = ax2.c();
        ar2.c = 0;
        ar2.b = (String)2;
        ar2.a(ax.a(ax2, 0));
        ar2 = (ar)q2.a(1);
        ar2.a(ax2.a());
        ar2.i = s.a[0];
        this.a(av2, 500, 2, ax2.c(), 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void B(av av2) {
        if (av2.f() != 72008) return;
        String[] stringArray = av.a(av2, 72008, 1000);
        if (stringArray == null) {
            return;
        }
        stringArray = av2.b(0).b() == 2833 ? (stringArray.b == 0 ? new String[]{s.a[2], s.a[42], s.a[57]} : new String[]{s.a[2], s.a[42], s.b[101], s.a[57]}) : (av2.a(3).b() == 31 ? (((ar)stringArray).b.equals(ay.a.a()) ? new String[]{s.a[2], s.a[66]} : (stringArray.b == 0 ? new String[]{s.a[2], s.a[42], s.a[57]} : new String[]{s.a[2], s.a[42], s.b[101], s.a[57]})) : (stringArray.b == 0 ? new String[]{s.a[2], s.a[42], s.a[57], s.d[174], s.a[84]} : new String[]{s.a[2], s.a[42], s.b[101], s.a[57], s.d[174], s.a[84]}));
        bb bb2 = this.a;
        bb.a(stringArray, av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void C(av bi2) {
        String string = this.a.a(0);
        g g2 = av.a((av)bi2, ((av)bi2).f(), 1000);
        int n2 = ((av)bi2).b(0).b();
        if (string.equals(s.a[2])) {
            if (n2 == 2833) {
                z.a().a(1127, (af)new t(29), new an(g2.d));
            } else {
                z.a().a(1032, (af)new t(15), new an(g2.d));
            }
        } else if (string.equals(s.a[66])) {
            z.a().a(1138, (af)new ba(2), (af)new an(g2.d), new an(this.a(2808)));
            ((av)bi2).b(0);
        } else if (string.equals(s.a[57])) {
            this.a.a(((ar)g2).b, "");
        } else if (string.equals(s.b[101])) {
            z.a().a(1138, (af)new ba(27), (af)new an(g2.d), new an(this.a(n2)));
        } else {
            if (string.equals(s.d[174])) {
                bb.a(0, 0, 1, null, new String[]{s.d[175], s.d[181], s.d[180], s.d[179], s.d[178]}, (av)bi2);
                return;
            }
            if (string.equals(s.a[84])) {
                this.O((av)bi2);
            } else if (string.equals(s.a[42])) {
                z.a().a(1138, (af)new ba(4), (af)new an(g2.d), new an(this.a(n2)));
            } else {
                this.a((av)bi2, ((av)bi2).a(5).b() / 100 * 100 + this.a.a(1), null);
            }
        }
        bi2 = this.a;
        bb.i();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void D(av av2) {
        int n2 = av2.f();
        if (n2 == 73014) {
            q q2 = (q)av2.a;
            n2 = q2.i();
            n2 = q2.h() * n2;
            StringBuffer stringBuffer = al.a(null, "B\u1ea1n x\u00e1c nh\u1eadn d\u00f9ng");
            al.a(stringBuffer, (long)((x)q2.a(n2 + 4)).e());
            al.a(stringBuffer, "ng\u00e2n l\u01b0\u1ee3ng mua do");
            al.a(stringBuffer, q2.a(n2 + 1).a());
            al.a(stringBuffer, "b\u00e1n 100 xu kh\u00f4ng?");
            f.a(stringBuffer.toString(), "", (int)(av2.a + true), -1, false, av2, null);
            return;
        }
        if (n2 == 73021) {
            bn.a(s.d[418], 8, 2, 73021, (bi)av2);
            return;
        }
        if (n2 != 73023) {
            if (n2 != 73024) return;
            ac.a(true, false);
            z.a().a(1519, (af)new ba(3), (af)new t(1), new an(av.a((av)av2, (int)n2, (int)1000).d));
            return;
        }
        n2 = ((n)av2.a(73021)).f();
        if (n2 <= 0) {
            f.a(s.d[192]);
            return;
        }
        if (ay.a.g(17) < 100) {
            f.a("Xu kh\u00f4ng \u0111\u1ee7!");
            return;
        }
        StringBuffer stringBuffer = al.a(null, " B\u1ea1n x\u00e1c nh\u1eadn d\u00f9ng");
        al.a(stringBuffer, (long)n2);
        al.a(stringBuffer, "gi\u00e1 ng\u00e2n l\u01b0\u1ee3ng b\u00e1n 100 xu kh\u00f4ng?");
        f.a(stringBuffer.toString(), "", (int)(av2.a + 2), -1, false, av2, null);
    }

    public void E(av av2) {
        int n2 = ((h)av2.a(66021)).f();
        int n3 = 22;
        if (n2 == 1) {
            n3 = 21;
        }
        for (n2 = av2.j / 100; n2 >= 66004; --n2) {
            q q2 = (q)av2.a(n2);
            av2.c(n2);
            q2.d();
        }
        av2.f(66021);
        av2.a(0, 1403, n3, (av2.j / 100 - 66004 + 1) / 2, null);
        av2.b(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void F(av av2) {
        int n2 = av2.f();
        if (n2 == -1) {
            return;
        }
        int n3 = av2.b(0).b();
        int n4 = ((h)av2.a(66021)).f();
        int n5 = av2.b(1).b();
        g g2 = av.a(av2, n2, 1000);
        if (g2 == null) return;
        if (n2 % 2 == 0) {
            if (n3 == 21 || n3 == 22 || n3 == 1) {
                Object object;
                boolean bl2 = !av2.a(n2 + 1).a();
                q q2 = (q)av2.a(n2 + 1);
                for (n3 = 66004; n3 <= av2.j / 100; n3 += 2) {
                    object = (ar)av.a(av2, n3, 0);
                    if (object != null && bl2) {
                        ((ar)object).a("+");
                    }
                    av2.c(n3 + 1);
                }
                this.a.a(av2, n2, bl2);
                object = this.a;
                ad.a(av2, true);
                av2.f(66004);
                if (q2.a(0) != null) return;
                if (n4 == 1) {
                    z.a().a(1403, (af)new ba(2), (af)new an(g2.d), new an(n2 + 1));
                    return;
                }
                if (n4 != 0) return;
                z.a().a(1403, (af)new ba(6), (af)new an(g2.d), new an(n2 + 1));
                return;
            }
            if (n3 != 10) {
                if (n2 != 66018) return;
            }
            z.a().a(1403, (af)new ba(11), (af)new an(av.a((av)av2, (int)66004, (int)1000).d), new an(ap.o));
            ac.a(true, false);
            return;
        }
        if (n2 == 66021) {
            this.E(av2);
            return;
        }
        if (n2 == 66019) {
            f.a(66);
            return;
        }
        if (n3 == 1) {
            z.a().a(1032, (af)new t(20), new an(g2.d));
            return;
        }
        if (n4 == 1) {
            f.a(new StringBuffer().append("C\u00f3 \u0111\u1ebfn [").append(((ar)g2).b).append("] kh\u00f4ng?").toString(), "", (int)(av2.a + 2), -1, false, av2, null);
            return;
        }
        if (n4 != 0) return;
        if (n5 == 0) {
            this.d(null, 15, g2.d);
            return;
        }
        bb.a();
        bb.a(new String[]{s.b[9], s.a[2]}, av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void G(av g2) {
        int n2 = ((av)g2).b(0).b();
        int n3 = ((av)g2).b(1).b();
        if (n2 != 22) return;
        if (n3 != 1) {
            return;
        }
        Object object = bb.a().a(10);
        if ((g2 = (ar)av.a((av)g2, ((av)g2).f(), 1000)) == null) return;
        if (((String)object).equals(s.b[9])) {
            object = f.a(21);
            if (object == null) return;
            object = (n)((av)object).a(21006);
            StringBuffer stringBuffer = al.a(null, ((n)object).a());
            this.a.a(stringBuffer, ((ar)g2).a(), ((ar)g2).e);
            ((n)object).a(stringBuffer.toString());
            f.a(66);
            return;
        }
        if (!((String)object).equals(s.a[2])) return;
        this.d(null, 15, ((ar)g2).d);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void H(av object) {
        int n2 = ((av)object).f();
        if (n2 == -1) {
            return;
        }
        g g2 = av.a((av)object, n2, 1000);
        if (g2 == null) return;
        int n3 = ((av)object).b(0).b();
        int n4 = ((av)object).b(5).b();
        if (n2 == 67006) {
            void var5_7;
            String string = g2.a();
            if (string.equals("")) return;
            if (string.startsWith("Bo\u0309 nhi\u00ea\u0323m vu\u0323") || n3 == 15) {
                f.a("", s.d[283], (int)(((av)object).a + 2), -1, false, (bi)object, null);
                return;
            }
            if (string.startsWith("Nh\u1eadn") || n3 == 12) {
                af[] afArray = av.a(66, 66006, 0);
                n2 = n4;
                if (n4 == 0) {
                    n2 = ap.o;
                }
                z.a().a(1403, new ba(8), new an(n2), ((av)object).b(1), afArray[0], afArray[1]);
                f.a(67);
                ac.a(true, false);
                return;
            }
            if (((av)object).a(67013).a() && ((av)object).b(2).b() == 0) {
                f.a(s.d[284]);
                return;
            }
            if (n3 != 19) {
                af[] afArray = av.a(66, 66006, -1);
            } else {
                Object var5_10 = null;
            }
            af[] afArray = var5_7;
            if (var5_7 == null) {
                afArray = new af[]{new ba(0), new ba(0)};
            }
            n2 = n4;
            if (n4 == 0) {
                n2 = ap.o;
            }
            z z2 = z.a();
            ba ba2 = new ba(16);
            af af2 = ((av)object).b(1);
            object = ((av)object).b(2);
            if (n3 == 19) {
                n2 = 0;
            }
            z2.a(1403, ba2, af2, (af)object, new an(n2), afArray[0], afArray[1]);
            f.a(67);
            ac.a(true, false);
            return;
        }
        if (n2 == 67007) {
            ay.a.a(g2.d, g2.e, g2.b, 0);
            f.a(0);
            if (g2.c <= 0) return;
            if (!ap.a().d()) return;
            object = ay.a(g2.c);
            if (object == null) return;
            if (((m)object).c() > 0) {
                ay.a.a(1, (m)object, null);
                return;
            }
            aa.a((m)object, null);
            return;
        }
        if (n2 == 67011) {
            z.a().a(1032, (af)new t(10), (af)new an(g2.d), ((av)object).b(1));
            return;
        }
        if (n2 != 67013) return;
        bb bb2 = this.a;
        bb.a(new String[]{s.b[9], s.a[2]}, (av)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void I(av av2) {
        String string = this.a.a(10);
        if (!string.equals(s.b[9])) {
            if (!string.equals(s.a[2])) return;
            z.a().a(1032, (af)new t(16), new an(av.a((av)av2, (int)67013, (int)1000).d));
            return;
        } else {
            q q2 = (q)av2.a(67013);
            int n2 = q2.i();
            int n3 = q2.h();
            for (int i2 = q2.g() - 1; i2 >= 0; i2 -= n3) {
                ar ar2 = (ar)q2.a(i2);
                if (i2 / n3 == n2) {
                    ar2.a(string);
                    av2.b(2).a(ar2.d);
                    continue;
                }
                ar2.a("Ch\u01b0a ch\u1ecdn");
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void J(av av2) {
        String string = av2.a(59006).a();
        if (string.equals(s.a[73])) {
            av2.l();
            av2.c(59020, false);
            av2.c(59007);
            av2.v = av2.a((int)59020).b + av2.a((int)59020).h - 10;
            return;
        }
        if (string.equals("X\u00e2y d\u1ef1ng")) {
            if (av2.a(3) == null) {
                av2.c(59020);
                av2.c(59007);
                av2.v = 10;
                av2.a(0, 1604, 43, av2.b(0).b(), new af[]{av2.b(1)});
            }
            av2.b(0);
            return;
        }
        int n2 = ((h)av2.a(59006)).f();
        n2 = av2.a(3).b() < 34 ? (n2 += 31) : (n2 += 34);
        if (av2.a(3).b() != n2) {
            av2.a(0, n2, 0, 1, 0);
        }
        av2.b(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void K(av av2) {
        int n2 = av2.f();
        if (n2 != 59007) return;
        g g2 = av.a(av2, n2, 1000);
        if (g2 == null) {
            return;
        }
        af af2 = av2.a(3);
        if (af2 == null) return;
        int n3 = af2.b() == 42 ? 40 : (af2.b() == 43 ? 46 : (af2.b() == 33 ? 44 : (av2.a(3).b() == 36 ? 45 : (af2.b() == 31 || av2.a(3).b() == 32 ? 38 : 39))));
        z.a().a(1604, new ba((short)n3), new an(g2.d), av2.a(1002), av2.a(1001));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void L(av av2) {
        int n2 = 4;
        int n3 = av2.f();
        switch (av2.f()) {
            case 46007: 
            case 46009: 
            case 46011: 
            case 46013: {
                bn.a("", 11, 4, n3, (bi)av2);
                return;
            }
            case 46014: {
                n2 = 46007;
                while (true) {
                    if (n2 >= 46014) {
                        if (!this.a(av2, 46007, 46009, s.d[640])) return;
                        if (!this.a(av2, 46011, 46013, al.a(s.d[640], "M\u1eadt kh\u1ea9u", "S\u1eeda m\u1eadt kh\u1ea9u"))) return;
                        z.a().a(1205, (af)new ba(1), (af)new j(((n)av2.a(46007)).a()), new j(((n)av2.a(46011)).a()));
                        return;
                    }
                    if (!this.a(av2, n2)) return;
                    n2 += 2;
                }
            }
            case 46021: {
                q q2 = (q)av2.a;
                switch (q2.i()) {
                    default: {
                        return;
                    }
                    case 0: {
                        z.a().a(1205, new ba(3));
                        ac.a(true, false);
                        return;
                    }
                    case 1: 
                    case 2: {
                        if (av.a(av2, n3, 1000) == null) return;
                        if (q2.i() != 1) {
                            n2 = 5;
                        }
                        this.a(null, n2, q2.a());
                        return;
                    }
                    case 3: {
                        f.a(av2.a(46031).a(), "", (int)(av2.a + 2), -1, false, av2, null);
                        return;
                    }
                    case 4: 
                }
                f.a(0);
                z.a().a(1081, (af)new an(ay.a.a()), (af)new t(2), new an(s.g));
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void M(av av2) {
        int n2 = av2.f();
        if (n2 == 47011 || n2 == 47013 || n2 == 47015) {
            bn.a("", 11, 4, n2, (bi)av2);
            return;
        }
        if (n2 != 47016) return;
        n2 = 47011;
        while (true) {
            if (n2 >= 47016) {
                if (!this.a(av2, 47013, 47015, s.d[640])) return;
                z.a().a(1205, av2.b(0), (af)new j(((n)av2.a(47011)).a()), new j(((n)av2.a(47013)).a()));
                ac.a(true, false);
                return;
            }
            if (!this.a(av2, n2)) return;
            n2 += 2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(int n2) {
        if (n2 == 2808) {
            return 10901;
        }
        if (n2 != 2833) return 10904;
        return 10902;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(String string) {
        if (string.equals("Viettel")) {
            return 1;
        }
        if (string.equals("Vinaphone")) {
            return 2;
        }
        if (string.equals("MobiFone")) {
            return 3;
        }
        if (string.equals("VTC")) {
            return 4;
        }
        if (!string.equals("GATE")) return 0;
        return 5;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(Graphics graphics, int n2, int n3) {
        int n4;
        int n5 = n4 = -1;
        if (this.a < 0) return n5;
        if (System.currentTimeMillis() - this.c >= 1000L) {
            this.c = System.currentTimeMillis();
            switch (this.a) {
                case 0: {
                    this.a((long)this.b + (this.c - d) / 1000L);
                    break;
                }
                case 1: {
                    long l2 = (long)this.b - (this.c - d) / 1000L;
                    if (l2 < 0L) break;
                    this.a(l2);
                }
            }
        }
        if (this.b == null) {
            return n4;
        }
        this.b.b(n2 - this.b.g, n3);
        this.b.a(graphics);
        return this.b.b + this.b.h;
    }

    public av a(av av2) {
        av av3 = av2;
        if (av2 == null) {
            av3 = f.b(73);
        }
        this.a.a(av3, 73013, false);
        this.b(av3, true);
        return av3;
    }

    public av a(av av2, int n2) {
        if (av2 == null) {
            av2 = f.b(34);
        }
        int n3 = 1;
        if (n2 == 14) {
            n3 = 7;
        }
        av2.a(0, 1136, n3, ((q)av2.a(34005)).f(), null);
        av2.b(0);
        av2.a(0, new an(n2));
        return av2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public av a(av av2, int n2, int n3) {
        if (av2 == null) {
            av2 = f.b(105);
        }
        av2.a(0, new an(n2));
        if (n2 == 0) {
            av2.a(105006, 1500, 4, ((q)av2.a(105006)).f(), null);
        } else if (n2 == 1) {
            av2.a(105006, 1403, 20, ((q)av2.a(105006)).f(), new af[]{new an(n3)});
        } else if (n2 == 2) {
            av2.a(105006, 1177, 1, ((q)av2.a(105006)).f(), null);
        } else if (n2 == 3) {
            av2.a(1, new an(n3));
            av2.a(105006, 1606, 4, ((q)av2.a(105006)).f(), null);
        } else if (n2 == 4) {
            av2.a(105006, 2402, 5, ((q)av2.a(105006)).f(), new af[]{new an(n3)});
        }
        av2.b(0);
        return av2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public av a(av av2, int n2, int n3, int n4) {
        af[] afArray = null;
        af[] afArray2 = null;
        if (av2 == null) {
            av2 = f.b(42);
        }
        av2.a(0, new an(n3));
        h h2 = (h)av2.a(42011);
        h2.a(n2);
        if (n3 == 0) {
            int n5 = ((q)av2.a(42013)).f();
            afArray = n3 == 1 ? afArray2 : new af[]{new an(n4)};
            av2.a(42013, 1314, n2 + 1, n5, afArray);
            av2.b(0);
            return av2;
        }
        if (n3 == 1) {
            h2.a(new String[]{"N\u1ed9i dung", s.b[12], s.a[40]});
            int n6 = ((q)av2.a(42013)).f();
            if (n3 != 1) {
                afArray = new af[]{new an(n4)};
            }
            av2.a(42013, 1131, n2 + 1, n6, afArray);
            av2.b(0);
            return av2;
        }
        if (n3 != 2) return av2;
        n2 = 42010;
        while (true) {
            if (n2 > 42013) {
                av2.f(42011);
                z.a().a(1532, new ba(3));
                return av2;
            }
            av2.c(n2);
            ++n2;
        }
    }

    public av a(av av2, int n2, String string) {
        av av3 = av2;
        if (av2 == null) {
            av3 = f.b(47);
        }
        av3.a(0, new ba((short)n2));
        av3.a(string);
        if (n2 == 5) {
            ((ar)av3.a(47010)).a(av3.a(47021).a());
        }
        av3.f(47010);
        return av3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public av a(String object) {
        av av2 = f.a(61);
        if (av2 == null) return null;
        if (av2.a(61001) == null) {
            return null;
        }
        r r2 = (r)av2.a(61001);
        r2.d();
        r2.a((String)object);
        return av2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String a(int n2) {
        if (n2 == 1) {
            return "Viettel";
        }
        if (n2 == 2) {
            return "Vinaphone";
        }
        if (n2 == 3) {
            return "MobiFone";
        }
        if (n2 == 4) {
            return "VTC";
        }
        if (n2 != 5) return "";
        return "GATE";
    }

    public void a() {
        this.a = -1;
        this.b = null;
        this.b = "";
        this.b = 0;
    }

    public void a(int n2) {
        this.c = n2;
        if (n2 < 1) {
            this.c.d();
            this.c.a(1, 1);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int n2, int n3, int n4, String[] stringArray) {
        this.b = 0L;
        if (stringArray == null) {
            this.c.d();
            this.c.a(0, 1);
            return;
        }
        this.c.b(n3, n4);
        this.a(stringArray, 100);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, av av2) {
        switch (n2) {
            case 66: {
                av2.a(0, new an(0));
                av2.a(1, new an(0));
                return;
            }
            case 67: {
                av2.a(0, new an(0));
                av2.a(1, new an(0));
                av2.a(2, new an(0));
                av2.a(3, new d(System.currentTimeMillis()));
                av2.a(4, new an(0));
                av2.a(5, new an(0));
                return;
            }
            case 70: {
                av2.a(0, new ba(2808));
                av2.a(1, new j(""));
                av2.a(2, new j(""));
                return;
            }
            case 72: {
                av2.a(0, new ba(2808));
                return;
            }
            case 73: {
                av2.a(0, new an(((q)av2.a(73014)).f()));
                av2.a(1, new j(""));
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(long l2) {
        if (this.b == null) {
            this.b = new r(200, 100, 1000, 128, 0);
        } else {
            this.b.d();
            this.b.a(200, 100);
        }
        StringBuffer stringBuffer = al.a(null, "");
        al.a(stringBuffer, this.b);
        if (this.a != 2) {
            int n2 = (int)l2 / 3600;
            l2 %= 3600L;
            if (n2 < 10) {
                al.a(stringBuffer, "0");
            }
            al.a(stringBuffer, (long)n2);
            al.a(stringBuffer, ":");
            n2 = (int)l2 / 60;
            l2 %= 60L;
            if (n2 < 10) {
                al.a(stringBuffer, "0");
            }
            al.a(stringBuffer, (long)n2);
            al.a(stringBuffer, ":");
            if (l2 < 10L) {
                al.a(stringBuffer, "0");
            }
            al.a(stringBuffer, l2);
        } else if (stringBuffer.length() == 0) {
            this.b = null;
            return;
        }
        this.b.b(stringBuffer.toString());
        this.b.a(this.b.e(), this.b.f());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(av object) {
        if (object == null) {
            return;
        }
        try {
            if (ac.f < 100) return;
            m.b = false;
            ac.a().a(100);
            ac.f = 0;
            f.a(0);
            ac.a().a();
            bf.d(1600000);
            bf.d(1610000);
            bg.b(1600000, 0);
            bg.b(1610000, 0);
            new bf(2080000);
            new bf(2200000);
            new bf(2210000);
            new bf(2220000);
            new bf(2230000);
            f.a(3, (byte)3, ap.a());
            ap.a().h();
            if (!c) {
                c = true;
                object = new am();
                ((am)object).a(1529);
                u.a.b(((am)object).a());
            }
            z z2 = z.a();
            object = new t(7);
            z2.a(1303, (af)object);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av object, int n2) {
        if (((av)object).a == null) {
            return;
        }
        int n3 = ((av)object).f();
        String[] stringArray = null;
        if (n2 == 1789450000) {
            String string = this.a.a(10);
            if (((av)object).a.a() == 12) {
                stringArray = (ar)av.a((av)object, ((av)object).a.a(), 1001);
            }
            if (stringArray == null) return;
            if (s.b[129].equals(string)) {
                z.a().a(1107, (af)new ba(27), new an(stringArray.d));
                return;
            }
            if (s.a[2].equals(string)) {
                this.b(null, 1, stringArray.d);
                return;
            }
            if (s.a[12].equals(string)) {
                this.a.a(stringArray.b, "");
                return;
            }
            if (s.a[23].equals(string)) {
                this.a.a(stringArray.e, stringArray.b);
                return;
            }
            if (!s.b[68].equals(string)) return;
            z.a().a(1177, (af)new ba(11), (af)new an(stringArray.d), ((av)object).b(1));
            f.a(34);
            return;
        }
        if (n3 == 34005) {
            if (((av)object).b(0).b() == 13) {
                stringArray = (String[])av.a((av)object, ((av)object).a.a(), 1001);
                object = f.a(33);
                short s2 = (short)((q)((av)object).a).i() > 5 ? (short)8 : 39;
                z.a().a(1107, (af)new ba(s2), new j(stringArray.a()));
                f.a(34);
                ((av)object).b(0);
                return;
            }
            stringArray = ((av)object).b(0).b() == 14 ? new String[]{s.b[68], s.a[2]} : (ay.a.b() == 0 ? new String[]{s.b[129], s.a[2], s.a[12], s.a[23]} : new String[]{s.a[2], s.a[12], s.a[23]});
            bb bb2 = this.a;
            bb.a(stringArray, (av)object);
            return;
        }
        if (n3 == 34002) {
            bn.a(s.d[375], 10, 2, 34002, (bi)object);
            return;
        }
        if (n3 != 34003) return;
        if (((String)(object = ((av)object).a(34002).a())).equals("")) return;
        z.a().a(1107, (af)new ba(5), new an(Integer.parseInt((String)object)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2, int n2, int n3, String string) {
        int n4;
        if (av2 == null) {
            av2 = f.b(72);
        }
        if (n2 == 0) {
            n2 = 2808;
            n4 = 31;
        } else {
            n4 = 3;
        }
        av2.b(0).a(n2);
        av2.a(72008, 1138, n4, ((q)av2.a(72008)).f(), new af[]{new an(this.a(n2)), new an(n3), new j(string)});
        av2.b(0);
    }

    public void a(av av2, int n2, String string) {
        av2.a(1).a(1);
        av2.a(5).a(n2);
        if (string != null) {
            ((j)av2.a(6)).a(string);
        }
        av2.a(7).a(0);
        ((q)av2.a(72008)).d();
        av2.c(72008);
        av2.b(0);
    }

    public void a(av g2, z object) {
        Object object2;
        av av2 = g2;
        if (g2 == null) {
            av2 = f.b(32);
        }
        g2 = (q)av2.a(32001);
        int[] nArray = new int[]{0, 26, 12, 38, 64, 90, 52, 78, 15, 67, 23, 75, 43, 47, 45};
        int n2 = ((q)g2).d(nArray[0]);
        int n3 = ((q)g2).e(nArray[0]);
        for (object2 = 0; object2 < 8; ++object2) {
            ar ar2 = new ar("Kh\u00f4ng", s.a[0], 1);
            ar2.a(n2, n3);
            ar2.a = (aw)(object2 * 2 + 32009);
            ((q)g2).a(ar2, nArray[object2 * 2]);
            if (object2 >= nArray.length / 2) continue;
            ar2 = new ar("Kh\u00f4ng", s.a[0], 1);
            ar2.a(n2, n3);
            ar2.a = (aw)(object2 * 2 + 32009 + 1);
            ((q)g2).a(ar2, nArray[object2 * 2 + 1]);
        }
        n2 = ((z)object).a(1);
        for (object2 = 0; object2 < n2; ++object2) {
            n3 = ((z)object).a(object2 * 3 + 2);
            ((ar)((q)g2).a(nArray[n3 * 2 - 2])).a(((z)object).a(object2 * 3 + 2 + 1));
            if (n3 == 8) continue;
            ((ar)((q)g2).a(nArray[n3 * 2 - 1])).a(((z)object).a(object2 * 3 + 2 + 2));
        }
        object = (ar)av2.a(1);
        ((g)object).b((ac.a - ((ar)object).g) / 2, ac.b - ((ar)object).h);
        object2 = ((q)g2).a;
        av2.u = ((q)g2).g + object2 + 10;
    }

    public void a(av av2, String string, int n2) {
        av2 = f.a(new StringBuffer().append("Mua*2").append(string).toString(), s.d[368], n2, -1, true, av2, null);
        ((n)av2.a(1003)).b(2);
        av2.b(1003, "1");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2, boolean bl2) {
        int n2;
        if (av.a(av2, 70003).equals(s.a[9])) {
            if (bl2) {
                av2.a((int)70003).e = 70005;
                av2.a(70020, false, 0);
                av2.a(70005, true, 0);
                av2.d(70005);
            }
            n2 = 70007;
        } else {
            if (bl2) {
                av2.a((int)70003).e = 70020;
                av2.a(70005, false, 0);
                av2.a(70020, true, 0);
                av2.d(70020);
            }
            n2 = 70028;
        }
        if (av.a(av2, n2, 0) != null) {
            av2.c(n2, false);
        } else {
            av2.c(n2);
        }
        short s2 = av2.a((int)n2).b;
        av2.v = av2.a((int)n2).h + s2 - 10;
    }

    public void a(z z2) {
        ay.a = (an)z2.a.elementAt(1);
        StringBuffer stringBuffer = al.a(null, s.d[302]);
        al.a(stringBuffer, z2.a(3));
        al.a(stringBuffer, "  *0Bang\uff0c");
        al.a(stringBuffer, s.d[303]);
        ap.a().a(z2.a(2), stringBuffer.toString(), (byte)25, (byte)26);
    }

    public void a(String string) {
        if (this.a == null) {
            int n2;
            this.a = new r(ac.a - 10, 80, 1000, 128, 0);
            this.a.a(string);
            int n3 = n2 = this.a.e();
            if (this.a.g < n2) {
                n3 = this.a.g;
            }
            this.a.b(this.a.g - n3 >> 1, ac.b - this.a.h >> 1);
            this.a.b(false);
        }
    }

    public void a(String string, av g2) {
        av av2 = g2;
        if (g2 == null) {
            av2 = f.b(103);
        }
        g2 = (r)av2.a(103004);
        if (string != null) {
            ((r)g2).d();
            ((r)g2).a(string);
        }
        this.w(av2);
    }

    public void a(Graphics graphics) {
        if (this.a != null) {
            this.a.a(graphics);
        }
    }

    public void a(Graphics graphics, av av2) {
        if (f.a() == av2.a / 1000 && this.c == av2.f() && this.c.h > 1) {
            if (this.b == 0L) {
                this.b = System.currentTimeMillis();
            }
            if (System.currentTimeMillis() - this.b > 1500L) {
                al.a(graphics, (int)(this.c.a - true), (int)this.c.b, this.c.g + 2, this.c.h + 1, this.c.g + 2, 0);
                graphics.setColor(s.d);
                graphics.drawRect((int)(this.c.a - true), (int)this.c.b, this.c.g + 2, this.c.h + 2);
                this.c.a(graphics);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(af[] afArray, int n2) {
        boolean bl2 = false;
        if (afArray == null) {
            return bl2;
        }
        int n3 = afArray.length - 1;
        while (true) {
            boolean bl3 = bl2;
            if (n3 < 0) return bl3;
            if (n2 == afArray[n3].b()) {
                return true;
            }
            --n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public av b(av av2, int n2) {
        if (av2 == null) {
            av2 = f.b(40);
        }
        av2.a(0, new an(n2));
        if (n2 == 2884 || n2 == 2885) {
            h h2 = (h)av2.a(40011);
            String string = n2 == 2884 ? s.a[9] : s.a[10];
            h2.a(new String[]{string});
            h2.a(0);
            this.c(av2, 0);
            n2 = n2 == 2884 ? 12 : 15;
            av2.a(40014, 1033, n2, ((q)av2.a(40014)).f(), new af[]{new an(ap.o)});
        } else {
            av2.a(40014, 1033, 8, ((q)av2.a(40014)).f(), new af[]{new t((byte)((h)av2.a(40011)).f())});
        }
        av2.b(0);
        return av2;
    }

    public av b(av object, int n2, int n3) {
        av av2 = object;
        if (object == null) {
            av2 = f.b(33);
        }
        av2.a(0, new an(n2));
        av2.a(1, new an(((q)av2.a(33004)).f()));
        av2.a(2, new an(n3));
        object = this.a;
        ad.a(av2, n2, 0, 0, 33002);
        if (n2 / 10 == 1) {
            av2.a((int)33002).e = 33005;
        }
        if (n2 % 10 == 1) {
            av2.c(33001);
            av2.c(33002);
            av2.a(33006).b(0, 30);
        }
        this.h(av2);
        return av2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public av b(av av2, int n2, int n3, int n4) {
        if (av2 == null) {
            av2 = f.b(43);
        }
        av2.a(0, new an(n4));
        if (n4 == 0) {
            av2.a(43015, 1314, 3, ((q)av2.a(43015)).f(), new af[]{new an(n2), new an(n3)});
            av2.b(0);
            return av2;
        }
        if (n4 == 1) {
            ((ar)av2.a(43012)).a(s.b[107]);
            ((ar)av2.a(43013)).a(s.b[108]);
            ((ar)av2.a(43014)).a(s.b[106]);
            av2.a(43015, 1606, 1, ((q)av2.a(43015)).f(), null);
            av2.b(0);
            return av2;
        }
        if (n4 != 2) {
            if (n4 != 3) return av2;
            ((ar)av2.a(43013)).a(s.b[191]);
            ((ar)av2.a(43014)).a(s.b[192]);
            av2.a(0, 1177, 14, ((q)av2.a(43015)).f(), new af[]{new an(n2)});
            av2.b(0);
            return av2;
        }
        av2.a("Th\u00f4ng tin \u0111\u1ed9i");
        ((ar)av2.a(43012)).a(s.b[41]);
        ((ar)av2.a(43013)).a(s.d[119]);
        ((ar)av2.a(43014)).a(s.d[118]);
        if (n3 == 0) {
            z.a().a(1023, (af)new ba(58), new an(ay.a.a()));
            return av2;
        }
        z.a().a(1023, (af)new ba(63), new an(n2));
        return av2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b() {
        if (!this.a) {
            if (f.a(50) != null) return;
            this.a = true;
            return;
        }
        if (this.b == null) return;
        if (this.b.size() <= 0) return;
        if (this.a == null) {
            this.a((String)this.b.elementAt(0));
            return;
        }
        if (this.a == 0L) {
            this.a = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() - this.a <= 2000L) return;
        this.b.removeElementAt(0);
        if (this.b.size() == 0) {
            this.b = null;
        }
        this.a = null;
        this.a = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(av object) {
        if (((av)object).f() == 110001) {
            f.a(s.d[400], "", (int)(((av)object).a + 2), -1, false, (bi)object, null);
            return;
        }
        if (((av)object).f() != 110003) return;
        String string = a.b.a(s.i, 1);
        if (string != null) {
            String[] stringArray = al.a(string, "|");
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                a.b.a(stringArray[i2]);
            }
        }
        f.a("S\u1eeda ho\u00e0n th\u00e0nh");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(av object, int n2) {
        Object object2;
        Object object3 = null;
        int n3 = ((av)object).f();
        if (n3 == -1) {
            return;
        }
        String string = av.a((av)object, 33002);
        if (((av)object).a.a() == 12) {
            if (string.equals(s.b[76])) return;
            object2 = (String[])av.a((av)object, n3, 1001);
        } else {
            object2 = null;
        }
        if (n2 == ((av)object).a + true) {
            object3 = f.a(1).a(1003).a();
            if (!al.c((String)object3)) {
                f.a(s.d[200]);
                return;
            }
            z.a().a(1107, (af)new ba(52), (af)new an(((ar)object2).e), new an(Integer.parseInt((String)object3)));
            ((av)object).b(0);
            return;
        }
        if (n2 == ((av)object).a + 3) {
            z.a().a(1107, (af)new ba(16), new j(((ar)object2).b));
            f.a(33);
            return;
        }
        if (n2 == ((av)object).a + 4) {
            object2 = (ar)av.a((av)object, n3, 1000);
            object3 = z.a();
            short s2 = ((q)((av)object).a).i() > 5 ? (short)9 : 7;
            ((z)object3).a(1107, (af)new ba(s2), new j(((ar)object2).a()));
            ((av)object).b(0);
            return;
        }
        if (n2 == 1789450000) {
            object3 = this.a.a(10);
            if (object2 == null) return;
            if (string.equals(s.a[122])) {
                if (((ar)object2).d == ay.a.a()) return;
            }
            if (((String)object3).equals(s.a[64])) {
                object3 = al.a(null, s.d[282]);
                al.a((StringBuffer)object3, ((ar)object2).b);
                al.a((StringBuffer)object3, s.d[216]);
                f.a(((StringBuffer)object3).toString(), "", (int)(((av)object).a + 3), 0, false, (bi)object, null);
                return;
            }
            if (((String)object3).equals(s.a[2])) {
                n2 = ((ar)object2).d;
                if (string.equals(s.b[75])) {
                    z.a().a(1107, (af)new ba(55), new an(((ar)object2).d));
                    return;
                }
                z.a().a(1303, (af)new t(1), new an(n2));
                return;
            }
            if (((String)object3).equals("Th\u0103ng c\u1ea5p")) {
                z.a().a(1107, (af)new ba(50), (af)new an(((ar)object2).d), new j(((ar)object2).b));
                ((av)object).b(0);
                return;
            }
            if (((String)object3).equals("Gi\u00e1ng c\u1ea5p")) {
                z.a().a(1107, (af)new ba(51), (af)new an(((ar)object2).d), new j(((ar)object2).b));
                ((av)object).b(0);
                return;
            }
            if (((String)object3).equals(s.a[53])) {
                z.a().a(1107, (af)new ba(4), new j(((ar)object2).b));
                ((av)object).b(0);
                return;
            }
            if (((String)object3).equals(s.a[23])) {
                this.a.a(((ar)object2).d, ((ar)object2).b);
                return;
            }
            if (((String)object3).equals(s.a[12])) {
                object3 = this.a;
                object = string.equals(s.b[75]) ? ((ar)object2).a() : ((ar)object2).b;
                ((ad)object3).a((String)object, "");
                return;
            }
            if (((String)object3).equals("Th\u00f4ng qua")) {
                z.a().a(1107, (af)new ba(28), new an(((ar)object2).d));
                ((av)object).b(0);
                return;
            }
            if (((String)object3).equals("C\u1ef1 tuy\u1ec7t")) {
                z.a().a(1107, (af)new ba(26), new an(((ar)object2).d));
                ((av)object).b(0);
                return;
            }
            if (((String)object3).equals("Xo\u00e1")) {
                z.a().a(1107, (af)new ba(49), new an(0));
                ((av)object).b(0);
                return;
            }
            if (((String)object3).equals("Ch\u1ec9nh l\u01b0\u01a1ng")) {
                if (((ar)object2).e == 9) {
                    f.a("Ti\u1ec3u l\u00e2u l\u00e2u th\u1ef1c t\u1eadp kh\u00f4ng th\u1ec3 l\u1ea5y l\u01b0\u01a1ng");
                    return;
                }
                f.a(new StringBuffer().append("\u0110i\u1ec1u ch\u1ec9nh l\u01b0\u01a1ng ch\u1ee9c v\u1ee5:*2").append(((ar)object2).a()).toString(), "", (int)(((av)object).a + true), 0, true, (bi)object, null);
                return;
            }
            if (((String)object3).equals(s.a[25])) {
                object2 = (ar)av.a((av)object, n3, 1000);
                f.a(al.a(((av)object).a(33020).a(), "%", ((ar)object2).a()), "", (int)(((av)object).a + 4), 0, false, (bi)object, null);
                return;
            }
            if (!((String)object3).equals(s.a[45])) return;
            this.a((av)null, 13);
            return;
        }
        if (n3 == 33004) {
            if (object2 == null) return;
            if (string.equals(s.a[122])) {
                n2 = ay.a.b();
                if (((ar)object2).d == ay.a.a()) return;
                object2 = n2 == 1 ? new String[]{s.a[2], "Th\u0103ng c\u1ea5p", "Gi\u00e1ng c\u1ea5p", s.a[53], s.a[23], s.a[12], s.a[64]} : (n2 < 4 ? new String[]{s.a[2], "Th\u0103ng c\u1ea5p", "Gi\u00e1ng c\u1ea5p", s.a[53], s.a[23], s.a[12]} : new String[]{s.a[2], s.a[23], s.a[12]});
            } else if (string.equals(s.b[75])) {
                if (((ar)object2).d != 0) {
                    object2 = new String[]{s.a[2], s.a[25], s.a[12]};
                } else {
                    if (ay.a.b() != 1) return;
                    object2 = new String[]{s.a[45]};
                }
            } else if (string.equals(s.b[77])) {
                object2 = ay.a.b() < 7 ? new String[]{s.a[2], "Th\u00f4ng qua", "C\u1ef1 tuy\u1ec7t", "Xo\u00e1"} : new String[]{s.a[2]};
            } else {
                object2 = object3;
                if (string.equals(s.a[16])) {
                    object2 = ay.a.b() == 1 ? new String[]{s.a[2], "\u0110i\u1ec1u t\u00e2n"} : new String[]{s.a[2]};
                }
            }
            if (object2 == null) return;
            object3 = this.a;
            bb.a((String[])object2, (av)object);
            return;
        }
        if (n3 == 33005) {
            bn.a(s.d[375], 150, 0, 33005, (bi)object);
            return;
        }
        if (n3 != 33003) return;
        short s3 = 20;
        short s4 = 19;
        if (string.equals(s.a[15])) {
            s3 = 36;
            s4 = 35;
        }
        z.a().a(1107, (af)new ba(s3), new j(((av)object).a(33005).a()));
        z.a().a(1107, (af)new ba(s4), new an(0));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(av av2, boolean bl2) {
        if (((h)av2.a(73012)).f() == 0) {
            if (!bl2) return;
            av2.a(73014, 1519, 4, av2.b(0).b(), new af[]{new an(this.a(2843)), new t(2)});
            av2.b(0);
            av2.a(73020, false, 73014);
            av2.d(73012);
            return;
        }
        if (bl2) {
            av2.l();
            av2.c(73014);
            av2.a(73020, true, 73024);
        }
        if (av.a(av2, 73024, 0) != null) {
            av2.c(73024, false);
        } else {
            av2.c(73024);
        }
        av2.v = av2.a((int)73024).b + av2.a((int)73024).h - 10;
    }

    public av c(av av2, int n2) {
        if (av2 == null) {
            av2 = f.b(41);
        }
        ((h)av2.a(41011)).a(n2);
        av2.a(41017, 1132, 9, ((q)av2.a(41017)).f(), new af[]{new an(n2 + 1)});
        av2.b(0);
        return av2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public av c(av av2, int n2, int n3) {
        af[] afArray;
        if (av2 == null) {
            av2 = f.b(66);
        }
        for (int i2 = av2.j / 100; i2 >= 66004; --i2) {
            afArray = (af[])av2.a(i2);
            short[] sArray = q.a;
            int n4 = i2 % 2 == 1 ? 0 : 1;
            afArray.c((int)sArray[n4], true);
        }
        afArray = null;
        av2.b(0).a(n2);
        av2.b(1).a(n3);
        if (n2 == 10) {
            afArray = new af[]{new an(ap.o)};
            av2.e(66003);
            av2.b(66018);
            av2.b(66019);
            av2.f(66003);
            av2.c(66020);
            av2.c(66021);
            av2.f(66003);
            n3 = 1403;
        } else if (n2 == 1) {
            av2.c(66020);
            av2.c(66021);
            h h2 = (h)av2.a(66021);
            ((q)av2.a((int)66004)).b = (int[])h2.b;
            av2.f(66004);
            n3 = 1206;
        } else {
            if (n2 == 21) {
                ((h)av2.a(66021)).a(1);
            }
            n3 = 1403;
        }
        av2.a(0, n3, n2, (av2.j / 100 - 66004 + 1) / 2, afArray);
        av2.b(0);
        return av2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public av c(av av2, int n2, int n3, int n4) {
        if (av2 == null) {
            av2 = f.a(59, (byte)3, new av(0, 0, 0, -1));
        }
        if (n2 == 42) {
            av2.c(59005);
            av2.c(59006);
        } else if (n2 == 43) {
            av2.a(0, new an(((q)av2.a(59007)).f()));
            av2.a(1, new an(n3));
            ((h)av2.a(59006)).a(new String[]{s.a[73], "X\u00e2y d\u1ef1ng"});
            z.a().a(1177, (af)new ba(2), new an(n3));
            ac.a(true, false);
            return av2;
        }
        int n5 = ((q)av2.a(59007)).f();
        af[] afArray = n2 == 42 ? new af[]{new an(n3), new ba((short)n4)} : null;
        av2.a(59007, 1604, n2, n5, afArray);
        av2.b(0);
        return av2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void c() {
        av av2 = f.b(77);
        if (av2 == null) {
            return;
        }
        q q2 = (q)av2.a(77013);
        for (int i2 = 0; i2 < 8; ++i2) {
            q2.a(new ar(new StringBuffer().append((new int[]{10000, 20000, 50000, 100000, 200000, 300000, 500000, 1000000})[i2]).append("").toString(), s.a[0], 0), i2 * 3);
            q2.a(new ar(new StringBuffer().append((new short[]{69, 139, 348, 696, 1393, 2090, 3484, 6969})[i2]).append("").toString(), s.a[0], 0), i2 * 3 + 1);
            q2.a(new ar(new StringBuffer().append((new short[]{81, 163, 409, 818, 1636, 2454, 4090, 8181})[i2]).append("").toString(), s.a[0], 0), i2 * 3 + 2);
        }
        av2.f(77013);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(av av2) {
        int n2 = av2.f();
        if (av.a(av2, n2, 1000) == null) {
            return;
        }
        if (n2 == 104007) {
            bb bb2 = this.a;
            bb.a(new String[]{s.d[120], s.d[121]}, av2);
            return;
        }
        if (n2 == 104009) {
            bb bb3 = this.a;
            bb.a(new String[]{s.a[121], s.a[69], s.a[134]}, av2);
            return;
        }
        if (n2 == 104010) {
            g g2 = av.a(av2, 104007, 1000);
            if (g2.d == 0) {
                av2.d(104007);
                f.a(g2.a());
                return;
            }
            g g3 = av.a(av2, 104009, 1000);
            if (g3.d == 0) {
                av2.d(104009);
                f.a(av.a(av2, 104009, 1001).a());
                return;
            }
            ac.a(true, false);
            g2 = (q)av2.a(104012);
            z.a().a(1500, new ba(14), new an(av.a((av)av2, (int)104007, (int)1000).d), new an(g3.d), new an(g3.b), new ba((short)g3.c), new an(ap.o), new an(Integer.parseInt(((q)g2).a(1).a())), new an(Integer.parseInt(((q)g2).a(4).a())));
            return;
        }
        if (n2 != 104012) return;
        StringBuffer stringBuffer = new StringBuffer().append(s.d[375]);
        String string = ((q)av2.a).i() == 0 ? s.a[134] : s.d[613];
        f.a("", stringBuffer.append(string).toString(), (int)(av2.a + 3), -1, true, av2, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(av g2, int n2) {
        g g3;
        if (g2 == null) return;
        if (((av)g2).b(0).b() == 0) {
            return;
        }
        q q2 = (q)((av)g2).a(40013);
        int n3 = ac.a < 240 ? 2 : 1;
        if ((ar)q2.a(0) == null) {
            g3 = new ar("", 0, 0);
            ((ar)g3).a(bc.a(3200));
            q2.a(g3, 0);
        }
        if (n2 >= 0) {
            g3 = new x(30, 8, n3, 0, 0);
            ((x)g3).a(n2);
            q2.a(g3, 1);
        }
        if (av.a((av)g2, 40011).equals(s.a[10])) {
            g2 = new ar("", 0, 0);
            ((ar)g2).a(bc.a(4200));
            q2.a(g2, 2);
            g2 = new x(30, 8, n3, 0, 0);
            ((x)g2).a(new StringBuffer().append(ay.a.size()).append("/").append(ay.a.a(9)).toString());
            q2.a(g2, 3);
            return;
        }
        q2.a(new ar("D\u1ef1 tr\u1eef", s.a[6], 0), 2);
        q2.a(new ar("Gi\u00e1", s.a[6], 0), 3);
    }

    public av d(av av2, int n2) {
        av av3 = av2;
        if (av2 == null) {
            av3 = f.b(70);
        }
        av3.b(0).a(n2);
        this.a(av3, true);
        return av3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public av d(av av2, int n2, int n3) {
        av av3 = av2;
        if (av2 == null) {
            av3 = f.b(67);
            ((q)av3.a(67007)).b(2);
        }
        av3.b(0).a(n2);
        av3.b(1).a(n3);
        av3.f(67006);
        if (n2 == 15) {
            z.a().a(1403, (af)new ba(15), new an(n3));
            return av3;
        }
        if (n2 == 23) {
            z.a().a(1403, (af)new ba(23), new an(n3));
            return av3;
        }
        if (n2 == 12) return av3;
        if (n2 == 19) return av3;
        z.a().a(1403, (af)new ba(11), (af)new an(n3), new an(ap.o));
        return av3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void d(av av2) {
        String string = this.a.a(10);
        if (string.equals(s.a[121])) {
            this.a.a(11, av2, 0, new String[]{s.b[9], s.a[2]}, -1);
            return;
        }
        if (string.equals(s.a[69])) {
            this.a.a(2048, av2, 0, new String[]{s.b[9], s.a[2]}, -1);
            return;
        }
        if (string.equals(s.a[134])) {
            if (ay.a.g(15) <= 10000) {
                f.a(new StringBuffer().append(s.d[485].substring(0, s.d[485].length() - 1)).append(10000).toString());
                return;
            }
            f.a("", s.d[122], (int)(av2.a + true), -1, true, av2, null);
            return;
        }
        if (string.equals(s.d[120])) {
            this.a.a(null, 1);
            return;
        }
        if (!string.equals(s.d[121])) return;
        f.a("", s.d[123], (int)(av2.a + 2), -1, true, av2, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public av e(av g2, int n2) {
        short s2;
        g g3 = g2;
        if (g2 == null) {
            g3 = f.b(46);
        }
        if (s2 == 0) {
            g g4 = ((av)g3).a(46015);
            s2 = g4.b;
            ((av)g3).v = g4.h + s2 - 10;
            return g3;
        }
        ad.a((av)g3, true);
        ((av)g3).a(46006, false, 0);
        ((av)g3).a(46020, true, 1);
        ((av)g3).d(46021);
        return g3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void e(av g2) {
        short s2;
        short s3;
        void var7_5;
        int n2;
        block20: {
            String[] stringArray;
            block19: {
                boolean bl2;
                block21: {
                    n2 = ((av)g2).b(0).b();
                    if (((av)g2).f() != 105006) return;
                    if (n2 != 1) {
                        g g3 = av.a((av)g2, 105006, 1000);
                        if (g3 == null) {
                            return;
                        }
                    } else {
                        Object var7_4 = null;
                    }
                    if (n2 != 0) break block20;
                    stringArray = s.a[5];
                    n2 = av.a((av)g2, (int)105006, (int)1001).d == 1 ? 1 : 0;
                    if (n2 != 0) {
                        stringArray = s.a[55];
                    }
                    bl2 = var7_5.e == 0;
                    if (var7_5.d != 128 && var7_5.d != 256) break block21;
                    if (n2 != 0) {
                        if (!bl2) {
                            String[] stringArray2 = new String[]{s.a[8], s.a[57], stringArray};
                            stringArray = stringArray2;
                            break block19;
                        } else {
                            String[] stringArray3 = new String[]{s.a[8], "", stringArray};
                            stringArray = stringArray3;
                        }
                        break block19;
                    } else {
                        stringArray = !bl2 ? new String[]{s.a[8], s.a[57]} : new String[]{s.a[8]};
                    }
                    break block19;
                }
                if (var7_5.d == 2 || var7_5.d == 32) {
                    if (!bl2) {
                        String[] stringArray4 = new String[]{s.a[8], s.a[2], stringArray, s.a[57]};
                        stringArray = stringArray4;
                    } else {
                        String[] stringArray5 = new String[]{s.a[8], s.a[2], stringArray};
                        stringArray = stringArray5;
                    }
                } else if (!bl2) {
                    String[] stringArray6 = new String[]{s.a[8], s.a[57], stringArray};
                    stringArray = stringArray6;
                } else {
                    String[] stringArray7 = new String[]{s.a[8], "", stringArray};
                    stringArray = stringArray7;
                }
            }
            bb bb2 = this.a;
            bb.a(stringArray, (av)g2);
            return;
        }
        if (n2 == 1) {
            if ((g2 = av.a((av)g2, 105006, 1)) == null) return;
            ay.a.a(g2.d, g2.e, g2.b, 0);
            return;
        }
        if (n2 == 2) {
            this.c(null, 43, var7_5.d, 0);
            return;
        }
        if (n2 != 3) {
            if (n2 != 4) return;
            z.a().a(2402, (af)new ba(1), new an(var7_5.d));
            return;
        }
        av av2 = f.a(43);
        if (av2 != null) {
            s3 = (short)av2.a(1002).b();
            s2 = (short)av2.a(1001).b();
        } else {
            s2 = 0;
            s3 = 0;
        }
        z.a().a(1606, new ba(2), ((av)g2).b(1), new an(var7_5.d), new ba(s3), new ba(s2));
        ac.a(true, false);
        f.a(105);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(av av2) {
        String string = this.a.a(10);
        Object object = av.a(av2, av2.f(), 1000);
        if (string.equals(s.a[8])) {
            ac.a(true, false);
            z.a().a(1500, (af)new ba(3), new an(((g)object).b));
            return;
        }
        if (string.equals(s.a[2])) {
            this.a.a(((g)object).d, ((g)object).c);
            return;
        }
        if (string.equals(s.a[5])) {
            object = al.a(null, "B\u1ea1n");
            al.a((StringBuffer)object, s.a[6]);
            al.a((StringBuffer)object, s.a[5]);
            al.a((StringBuffer)object, av.a(av2, av2.f(), 1001).a());
            al.a((StringBuffer)object, s.d[216]);
            f.a(((StringBuffer)object).toString(), "", (int)(av2.a + 2), -1, false, av2, null);
            return;
        }
        if (string.equals(s.a[55])) {
            ac.a(true, false);
            z.a().a(1500, (af)new ba(2), new an(((g)object).b));
            return;
        }
        if (!string.equals(s.a[57])) return;
        this.a.a(av.a(av2, av2.f(), 1003).a(), "");
    }

    public void g(av av2) {
        if (av2 == null) {
            av2 = f.b(31);
        }
        q q2 = (q)av2.a(31004);
        av2.a(0, 1176, 5, q2.f(), null);
        av2.b(0);
        q2.d();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void h(av av2) {
        String string = av.a(av2, 33002);
        ((r)av2.a(33006)).d();
        av2.l();
        if (string.equals(s.a[103])) {
            this.N(av2);
            z.a().a(1107, (af)new ba(11), av2.b(2));
            return;
        }
        if (string.equals(s.a[122])) {
            this.a(av2, 33004, 1137, 1);
            return;
        }
        if (string.equals(s.b[75])) {
            av2.a(s.b[75]);
            this.a(av2, 33004, 1136, 6);
            return;
        }
        if (string.equals(s.b[76])) {
            av2.c(33006);
            av2.c(33004);
            z.a().a(1604, (af)new ba(29), av2.b(2));
            return;
        }
        if (string.equals(s.b[77])) {
            this.a(av2, 33004, 1140, 0);
            return;
        }
        if (string.equals(s.b[198].substring(2, 4))) {
            this.a(av2, (short)19);
            return;
        }
        if (string.equals(s.a[15])) {
            this.a(av2, (short)35);
            return;
        }
        if (string.equals(s.a[16])) {
            this.a(av2, 33004, 1137, 3);
            return;
        }
        if (!string.equals(s.b[78])) return;
        av2.c(33005);
        av2.c(33003);
        z.a().a(1107, (af)new ba(37), av2.b(2));
    }

    public void i(av av2) {
        if (av2.f() == 5005) {
            bb bb2 = this.a;
            bb.a(new String[]{s.a[2], s.a[0]}, av2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void j(av av2) {
        String string = this.a.a(10);
        g g2 = av.a(av2, 5005, 1000);
        if (string.equals(s.a[2])) {
            z.a().a(1537, (af)new ba(3), new an(g2.d));
            return;
        }
        if (!string.equals(s.a[0])) return;
        f.a("", s.d[17], (int)(av2.a + 14), -1, true, av2, null);
    }

    public void k(av av2) {
        if (av2.f() == 26002 && av.a((av)av2, (int)26002, (int)1000).e > 0) {
            bb bb2 = this.a;
            bb.a(new String[]{s.a[2], s.a[146]}, av2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void l(av g2) {
        String string = this.a.a(10);
        g g3 = av.a(g2, 26002, 1000);
        if (string.equals(s.a[2])) {
            z.a().a(1032, (af)new t(8), (af)new an(g3.e), new t(0));
            return;
        }
        if (!string.equals(s.a[146])) return;
        z.a().a(1130, (af)new t(65), (af)new an(g3.d), new an(g3.e));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void m(av av2) {
        block4: {
            block3: {
                if (av2.f() != 40014) break block3;
                if (!av.a(av2, 40011).equals(s.a[10])) break block4;
                bb bb2 = this.a;
                bb.a(new String[]{s.a[10], s.a[2], s.a[5]}, av2);
            }
            return;
        }
        bb bb3 = this.a;
        bb.a(new String[]{s.a[9], s.a[2]}, av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void n(av av2) {
        String string = this.a.a(10);
        if (string.equals(s.a[2])) {
            if (av.a(av2, 40011).equals(s.a[10])) {
                z.a().a(1032, (af)new t(1), (af)new an(av.a((av)av2, (int)40014, (int)1000).d), new an(0));
                return;
            }
            z.a().a(1032, (af)new t(16), new an(av.a((av)av2, (int)40014, (int)1000).d));
            return;
        }
        if (!string.equals(s.a[9])) {
            if (!string.equals(s.a[10])) return;
            u.a((byte)14, ap.o, av.a((av)av2, (int)40014, (int)1000).d, (short)1, (byte)0);
            av.d(40, 40014);
            return;
        }
        if (av.a(av2, 40014, 1003).a().equals("0")) {
            f.a(av2.a(40020).a());
            return;
        }
        this.a(av2, av.a(av2, 40014, 1001).a(), (int)(av2.a + true));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void o(av av2) {
        int n2;
        int n3 = (n2 = av2.f()) == 41012 ? 1002 : 1000;
        Object object = av.a(av2, n2, n3);
        if (object == null) {
            return;
        }
        if (n2 == 41012) {
            if (((g)object).d == 0) return;
            object = this.a;
            bb.a(new String[]{s.a[12], s.a[2], s.b[50]}, av2);
            return;
        }
        if (n2 != 41017) return;
        if (((h)av2.a(41011)).f() == 0) {
            object = this.a;
            bb.a(new String[]{s.a[12], s.a[2], s.b[64], s.b[65], s.a[53]}, av2);
            return;
        }
        object = this.a;
        bb.a(new String[]{s.a[12], s.b[64]}, av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void p(av av2) {
        String string = this.a.a(10);
        int n2 = av2.f();
        int n3 = av2.f();
        g g2 = av.a(av2, n3, n2 = n2 == 41012 ? 1002 : 1000);
        if (g2 == null) {
            return;
        }
        if (this.a.a(av2, g2.d, g2.a(), string)) return;
        if (string.equals(s.b[50])) {
            z.a().a(1132, (af)new ba(7), new an(g2.d));
            return;
        }
        if (string.equals(s.b[64])) {
            z.a().a(1032, (af)new t(17), new an(g2.d));
            return;
        }
        if (string.equals(s.b[65])) {
            z.a().a(1132, (af)new ba(16), new an(g2.d));
            return;
        }
        if (!string.equals(s.a[53])) return;
        z.a().a(1132, (af)new ba(8), new an(g2.d));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void q(av av2) {
        if (av2.f() != 42013) return;
        Object object = av.a(av2, av2.f(), 1000);
        if (object == null) {
            return;
        }
        switch (av2.b(0).b()) {
            default: {
                return;
            }
            case 0: {
                if (((g)object).e != 1) return;
                this.b(null, ((g)object).d, av2.a(1003).b(), 0);
                return;
            }
            case 1: {
                bb.a();
                object = av.a(av2, av2.f(), 1003).a().equals(s.d[483]) ? s.d[325] : s.d[483];
                bb.a(new String[]{object, s.a[2], "Thuy\u1ebft minh"}, av2);
                return;
            }
            case 2: 
        }
        z.a().a(1032, (af)new t(1), (af)new an(av.a((av)av2, (int)av2.f(), (int)1001).d), new an(0));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void r(av av2) {
        g g2 = av.a(av2, av2.f(), 1000);
        if (g2 == null) {
            return;
        }
        String string = bb.a().a(10);
        if (string.equals(s.d[483])) {
            z.a().a(1131, (af)new ba(4), new an(g2.d));
            this.a(av2, string);
            return;
        }
        if (string.equals(s.d[325])) {
            z.a().a(1131, (af)new ba(5), new an(g2.d));
            this.a(av2, string);
            return;
        }
        if (string.equals(s.a[2])) {
            z.a().a(1032, (af)new t(8), (af)new an(g2.d), new t(0));
            return;
        }
        if (!string.equals("Thuy\u1ebft minh")) return;
        f.a(av2.a(42020).a());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void s(av av2) {
        block20: {
            void var4_6;
            bb bb2;
            block19: {
                int n2;
                int n3;
                block21: {
                    block24: {
                        block23: {
                            g g2;
                            block22: {
                                n3 = av2.f();
                                n2 = av2.b(0).b();
                                if (n3 != 43015) break block20;
                                g2 = av.a(av2, n3, 1000);
                                bb2 = null;
                                if (g2 == null) break block21;
                                if (n2 != 0) break block22;
                                if (g2.e == 0) {
                                    bb.a();
                                    bb.a(new String[]{s.b[65].substring(0, 2), s.a[2]}, av2);
                                    bb bb3 = bb2;
                                    break block19;
                                } else {
                                    z.a().a(1032, (af)new t(19), new an(g2.d));
                                    bb bb4 = bb2;
                                }
                                break block19;
                            }
                            if (n2 != 1) break block23;
                            if (ay.a.b() == 1) {
                                if (g2.e == 0) {
                                    bb.a();
                                    bb.a(new String[]{s.b[108], s.a[2]}, av2);
                                    bb bb5 = bb2;
                                    break block19;
                                } else {
                                    bb.a();
                                    bb.a(new String[]{s.b[109], s.a[2]}, av2);
                                    bb bb6 = bb2;
                                }
                                break block19;
                            } else {
                                z.a().a(1032, (af)new t(21), new an(g2.d));
                                bb bb7 = bb2;
                            }
                            break block19;
                        }
                        bb bb8 = bb2;
                        if (n2 != 2) break block19;
                        g g3 = av.a(av2, n3, 1001);
                        n2 = w.b();
                        if (g3.d == ay.a.a()) break block24;
                        if (n2 == 1) {
                            String[] stringArray = new String[]{s.b[62], s.b[61], s.a[2], s.a[12], s.a[95], s.b[63]};
                            break block19;
                        } else if (n2 > 1) {
                            String[] stringArray = new String[]{s.a[2], s.a[12], s.b[63]};
                            break block19;
                        } else {
                            String[] stringArray = new String[]{s.a[2]};
                        }
                        break block19;
                    }
                    if (n2 == 1) {
                        String[] stringArray = new String[]{s.d[213], s.b[63]};
                        break block19;
                    } else {
                        String[] stringArray = new String[]{s.b[63]};
                    }
                    break block19;
                }
                bb bb9 = bb2;
                if (n2 == 2) {
                    g g4 = av.a(av2, n3, 1002);
                    bb bb10 = bb2;
                    if (g4 != null) {
                        bb bb11 = bb2;
                        if (w.a()) {
                            if (g4.d == 0) {
                                String[] stringArray = new String[]{s.b[91], s.a[85], s.b[68], s.d[20]};
                            } else {
                                bb bb12 = bb2;
                                if (g4.d == 1) {
                                    String[] stringArray = new String[]{"M\u1edf"};
                                }
                            }
                        }
                    }
                }
            }
            if (var4_6 != null) {
                bb2 = this.a;
                bb.a((String[])var4_6, av2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void t(av object) {
        CharSequence charSequence = bb.a().a(10);
        g g2 = av.a((av)object, ((av)object).f(), 1000);
        g g3 = av.a((av)object, ((av)object).f(), 1001);
        if (g2 == null) {
            if (g3 == null) return;
        }
        if (((String)charSequence).equals(s.a[2])) {
            int n2 = ((av)object).b(0).b();
            if (n2 == 0) {
                z.a().a(1032, (af)new t(19), new an(g2.d));
                return;
            }
            if (n2 == 2) {
                z.a().a(1303, (af)new t(1), new an(g3.d));
                return;
            }
            z.a().a(1032, (af)new t(21), new an(g2.d));
            return;
        }
        if (((String)charSequence).equals(s.b[65].substring(0, 2))) {
            z.a().a(1314, new ba(6), new an(g2.d), ((av)object).a(1004), ((av)object).a(1002), ((av)object).a(1001));
            return;
        }
        if (((String)charSequence).equals(s.b[109])) {
            z.a().a(1606, new ba(3), new an(g2.d), new an(g2.e), ((av)object).a(1002), ((av)object).a(1001));
            ac.a(true, false);
            return;
        }
        if (((String)charSequence).equals(s.b[108])) {
            this.a((av)null, 3, g2.d);
            return;
        }
        if (this.a.a((av)object, g3.d, ((ar)g3).b, (String)charSequence)) return;
        if (((String)charSequence).equals(s.b[62])) {
            charSequence = al.a(null, s.d[158]);
            al.a((StringBuffer)charSequence, av.a((av)object, 43015, 1001).a());
            al.a((StringBuffer)charSequence, s.d[285]);
            f.a(((StringBuffer)charSequence).toString(), "", (int)(((av)object).a + 5), -1, false, (bi)object, null);
            return;
        }
        if (((String)charSequence).equals(s.b[61])) {
            charSequence = al.a(null, s.d[157]);
            al.a((StringBuffer)charSequence, av.a((av)object, 43015, 1001).a());
            al.a((StringBuffer)charSequence, s.d[286]);
            f.a(((StringBuffer)charSequence).toString(), "", (int)(((av)object).a + 6), -1, false, (bi)object, null);
            return;
        }
        if (((String)charSequence).equals(s.a[95])) {
            this.a.a(null, 1);
            return;
        }
        if (((String)charSequence).equals(s.d[20]) || ((String)charSequence).equals("M\u1edf")) {
            z.a().a(1023, (af)new ba(62), (af)new an(ay.a.a()), new an(av.a((av)object, (int)((av)object).f(), (int)1002).d));
            return;
        }
        if (((String)charSequence).equals(s.b[91])) {
            ad.a().a(null, 5, 15, 0);
            return;
        }
        if (((String)charSequence).equals(s.a[85])) {
            this.a.a(null, 6);
            return;
        }
        if (((String)charSequence).equals(s.d[213])) {
            object = this.a;
            if (!w.a()) return;
            ap.a().a("", s.d[155], (byte)10, (byte)11);
            return;
        }
        if (!((String)charSequence).equals(s.b[63])) return;
        if (!w.a()) {
            ap.a().a("", s.d[156], (byte)14, (byte)15);
            return;
        }
        if (w.d()) {
            ap.a().a("", s.d[156], (byte)12, (byte)13);
            return;
        }
        this.a.f();
    }

    public void u(av av2) {
        if (av2.f() == 77001 && (av2 = f.b(78)) != null) {
            av2.f(78013);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void v(av av2) {
        int n2 = av2.f();
        if (n2 == 78005) {
            if (((String)av2.a(0)).equals("")) {
                return;
            }
            String[] stringArray = new String[((String)av2.a(0)).length()];
            n2 = 0;
            while (true) {
                if (n2 >= ((String)av2.a(0)).length()) {
                    f.a("Xin h\u00e3y ch\u1ecdn lo\u1ea1i th\u1ebb n\u1ea1p:", "", (int)(av2.a + 3), -1, false, av2, stringArray);
                    return;
                }
                stringArray[n2] = this.a(Integer.parseInt(((String)av2.a(0)).substring(n2, n2 + 1)));
                ++n2;
            }
        }
        if (n2 == 78009) {
            bn.a(s.d[375], -1, 4, n2, (bi)av2);
            return;
        }
        if (n2 == 78011) {
            bn.a(s.d[375], -1, 2, n2, (bi)av2);
            return;
        }
        if (n2 != 78012) return;
        if (!av2.a(78009).a().equals("") && !av2.a(78011).a().equals("")) {
            byte by = (byte)this.a(((ar)av2.a((int)78005)).b);
            z.a().a(1511, new t(by), new an(0), new j(av2.a(78011).a()), new j(av2.a(78009).a()));
            ac.a(true, false);
            return;
        }
        f.a("Nh\u1eadp m\u00e3 th\u1ebb v\u00e0 m\u1eadt kh\u1ea9u!");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void w(av av2) {
        int n2;
        g g2;
        if (av2.a(103003).a().equals("")) {
            av2.c(103003);
        } else {
            av2.b(103003);
        }
        if ((g2 = av2.a(103007)).a().equals("")) {
            av2.c(103007);
        } else {
            av2.b(103007);
        }
        if (((q)av2.a(103008)).a(0) == null) {
            av2.c(103008);
        } else {
            av2.b(103008);
        }
        av2.f(103007);
        int n3 = n2 = av2.a((int)103004).b + av2.a((int)103004).h + 10 - g2.b;
        if (n2 > ac.b) {
            n3 = ac.b;
        }
        av2.h = n3;
        av2.b = (Vector)((short)(ac.b - av2.h >> 1));
        g2.b(0, (int)(av2.b + 5));
        av2.f(103007);
        if (av2.h < ac.b) {
            av2.v = 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void x(av av2) {
        int n2 = av2.f();
        Object object = av.a(av2, n2, 1000);
        if (object == null) {
            return;
        }
        int n3 = av2.b(0).b();
        if (n2 == 70005) {
            n2 = ((q)av2.a).i();
            switch (n2) {
                default: {
                    return;
                }
                case 0: {
                    this.O(av2);
                    return;
                }
                case 1: 
                case 2: 
                case 3: 
                case 4: {
                    if (a == null) return;
                    if (n2 == 6) {
                        --n2;
                    }
                    bb.a(av2.a.b(), av2.a.c(), 2, 0, al.a(a[n2 - 1].toString(), "_"), av2);
                    return;
                }
                case 5: {
                    this.a(null, n3, ((g)object).d, "");
                    return;
                }
                case 6: 
            }
            bb.a(new String[]{new StringBuffer().append(s.a[148]).append(s.b[102]).toString(), new StringBuffer().append(s.a[148]).append(s.b[154].substring(0, 1)).toString()}, av2);
            return;
        }
        if (n2 == 70007) {
            object = this.a;
            bb.a(new String[]{s.a[2], s.a[57], s.b[101], s.a[42]}, av2);
            return;
        }
        if (n2 == 70020) {
            this.a.a(18443, av2, 0, new String[]{s.b[9], s.a[2]}, -1);
            return;
        }
        if (n2 == 70021 || n2 == 70023) {
            bn.a(s.d[17], 8, 2, n2, (bi)av2);
            return;
        }
        if (n2 != 70026) {
            if (n2 != 70028) return;
            object = this.a;
            bb.a(new String[]{s.a[2], s.a[66]}, av2);
            return;
        }
        object = av.a(av2, 70020, 0);
        if (object != null && ((g)object).d != 0) {
            int n4 = ((n)av2.a(70021)).f();
            n2 = n3 = ((n)av2.a(70023)).f();
            if (n3 < 0) {
                av2.b(70023, new StringBuffer().append(0).append("").toString());
                n2 = 0;
            }
            if (n4 > 0 && (n2 == 0 || n4 <= n2)) {
                StringBuffer stringBuffer = new StringBuffer(s.d[190]);
                al.a(stringBuffer, (long)n4);
                if (n2 > 0) {
                    al.a(stringBuffer, "_");
                    al.a(stringBuffer, s.b[101]);
                    al.a(stringBuffer, "\uff1a");
                    al.a(stringBuffer, (long)n2);
                }
                al.a(stringBuffer, "_");
                al.a(stringBuffer, s.a[10]);
                if (((g)object).c > 0) {
                    al.a(stringBuffer, (long)((g)object).c);
                    al.a(stringBuffer, "m\u00f3n");
                }
                if (((g)object).b == 32) {
                    al.a(stringBuffer, al.a((long)((g)object).e, 0));
                }
                al.a(stringBuffer, av.a(av2, 70020, 1).a());
                f.a(stringBuffer.toString(), "", (int)(av2.a + 2), -1, false, av2, null);
                return;
            }
            f.a(s.d[192]);
            return;
        }
        f.a(s.d[513]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void y(av object) {
        ba ba2;
        Object object2;
        int n2;
        block14: {
            block13: {
                g g2;
                block12: {
                    n2 = 2808;
                    int n3 = this.a.a(0);
                    object2 = this.a.a(10);
                    int n4 = ((av)object).f();
                    g2 = av.a((av)object, n4, 1000);
                    if (n4 == 70005) {
                        switch (((q)((av)object).a).i()) {
                            default: {
                                this.a(null, 2808, g2.d + n3 * 100, "");
                                return;
                            }
                            case 4: {
                                if (n3 > 0) {
                                    g2.c = g2.d + n3 * 10;
                                    bn.a(new StringBuffer().append("B\u1ea1n c\u1ea7n t\u00ecm").append((String)object2).append("th\u1ecb v\u1ec7 t\u01b0 ch\u1ea5t cao h\u01a1n bao nhi\u00eau?").toString(), 3, 2, "", (bi)object);
                                    return;
                                }
                                this.a(null, 2833, g2.d, "0");
                                return;
                            }
                            case 6: 
                        }
                        if (n3 == 0) {
                            bn.a(new StringBuffer().append(s.d[375]).append(s.a[148]).append(s.b[102]).toString(), 8, 2, "", (bi)object);
                            return;
                        }
                        bn.a(new StringBuffer().append(s.d[375]).append(s.a[148]).append(s.b[154].substring(0, 1)).toString(), 8, 0, "", (bi)object);
                        return;
                    }
                    if (((String)object2).equals(s.a[2])) {
                        if (n4 == 70007 ? g2.e == 32 : ((ar)g2).b.equals(Integer.toString(32))) {
                            z.a().a(1032, (af)new t(15), new an(g2.d));
                            return;
                        }
                        z.a().a(1127, (af)new t(29), new an(g2.d));
                        return;
                    }
                    if (((String)object2).equals(s.a[57])) {
                        this.a.a(((ar)g2).b, "");
                        return;
                    }
                    if (((String)object2).equals(s.a[66])) {
                        object = z.a();
                        object2 = new ba(2);
                        an an2 = new an(g2.d);
                        n2 = ((ar)g2).b.equals(Integer.toString(32)) ? 2808 : 2833;
                        ((z)object).a(1138, (af)object2, (af)an2, new an(this.a(n2)));
                        return;
                    }
                    if (!((String)object2).equals(s.b[101])) break block12;
                    object = z.a();
                    ba2 = new ba(27);
                    object2 = new an(g2.d);
                    if (g2.e != 32) break block13;
                    break block14;
                }
                if (!((String)object2).equals(s.a[42])) return;
                z z2 = z.a();
                object = new ba(4);
                object2 = new an(g2.d);
                if (g2.e != 32) {
                    n2 = 2833;
                }
                z2.a(1138, (af)object, (af)object2, new an(this.a(n2)));
                return;
            }
            n2 = 2833;
        }
        ((z)object).a(1138, (af)ba2, (af)object2, new an(this.a(n2)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void z(av av2) {
        int n2;
        bc bc2 = this.a.a(true);
        q q2 = (q)av2.a(70020);
        ar ar2 = (ar)q2.a(0);
        ar2.d = bc2.a;
        ar2.b = (String)32;
        ar2.e = bc2.a();
        if ((bc2.e & 0x80) == 0) {
            ar2.c = 0;
        }
        byte by = ar2.c;
        ar2.a(bc2);
        ar2.n = by;
        ar2 = (ar)q2.a(1);
        ar2.a(bc2.a);
        ar2.i = al.a((long)bc2.a(), bc2.f);
        if (bc2.c > 0) {
            int n3 = bc2.c;
            n2 = by < 1 ? 1 : (int)by;
            n2 = n3 * n2;
        } else {
            n2 = 500;
        }
        this.a(av2, n2, 32, bc2.a(), by);
    }
}

