/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Static;
import a.a;
import a.aa;
import a.ac;
import a.ad;
import a.af;
import a.ag;
import a.ah;
import a.aj;
import a.ak;
import a.al;
import a.am;
import a.an;
import a.ap;
import a.ar;
import a.au;
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
import a.bk;
import a.bl;
import a.d;
import a.e;
import a.f;
import a.g;
import a.h;
import a.j;
import a.k;
import a.m;
import a.n;
import a.o;
import a.q;
import a.r;
import a.s;
import a.t;
import a.w;
import a.work.main.MyMidlet;
import a.x;
import a.z;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class u {
    public static byte a;
    public static ad a;
    public static ap a;
    public static au a;
    public static bb a;
    public static w a;
    public static Vector a;
    public static Vector b;

    static {
        Static.regClass(32);
        u.cinitclone();
    }

    public u(bb bb2) {
        a = bb2;
    }

    /*
     * Unable to fully structure code
     */
    private static void A(z var0) {
        block21: {
            block18: {
                block19: {
                    block20: {
                        switch (var0.a(0)) lbl-1000:
                        // 2 sources

                        {
                            default: lbl-1000:
                            // 3 sources

                            {
                                return;
                            }
                            case 1: {
                                var14_1 = new String[var0.a.size() - 2];
                                for (var1_2 = 0; var1_2 < var14_1.length; ++var1_2) {
                                    var14_1[var1_2] = var0.a(var1_2 + 2);
                                }
                                ap.a().a(var0.a(1), var14_1);
                                ** GOTO lbl-1000
                            }
                            case 9: 
                        }
                        var13_4 = var0.a(1);
                        var8_5 = var0.a(2);
                        var7_6 = var0.a(3);
                        var11_7 = var0.a(4);
                        var10_8 = var0.a(5);
                        var9_9 = var0.a(6);
                        var5_10 = 5;
                        var6_11 = 5;
                        if (ay.a.a() != var13_4) break block20;
                        var1_3 = ac.a >> 1;
                        var2_12 = u.a.h - 20;
lbl24:
                        // 2 sources

                        while (true) {
                            var0 = aa.a().a((int)var11_7, (int)var10_8);
                            var4_14 = aa.a().a(var0.d);
                            var3_13 = aa.a().b(var0.e) - aa.a().a((int)var11_7, (int)var10_8);
                            if (var9_9 == 1) {
                                var4_14 = ac.a / 2;
                                var3_13 = ac.b / 2;
                            }
                            if (var4_14 >= 0 && var4_14 <= ac.a && var3_13 <= ac.b && var3_13 >= 0) {
                                ap.a().a(var8_5, var7_6, var4_14, var3_13, var1_3, var2_12);
                            }
                            ** GOTO lbl-1000
                            break;
                        }
                    }
                    var12_15 = ay.x.size();
                    var1_3 = 0;
                    block8: for (var3_13 = 0; var3_13 < var12_15 && var1_3 < 5; ++var3_13) {
                        var4_14 = 1;
lbl39:
                        // 2 sources

                        while (true) {
                            var2_12 = var6_11;
                            if (var4_14 == 0) break block18;
                            var0 = (af[])ay.x.elementAt(var3_13);
                            if (var0[0].b() == ay.a.a()) lbl-1000:
                            // 2 sources

                            {
                                continue block8;
                            }
                            break block19;
                            break;
                        }
                    }
                    var4_14 = 0;
                    ** while (true)
                }
                if (var0[0].b() != var13_4) break block21;
                var2_12 = var1_3 * 33 + 5;
            }
            var1_3 = var5_10;
            ** while (var4_14 != 0)
lbl55:
            // 1 sources

            ** while (true)
        }
        ++var1_3;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void B(z object) {
        short s2 = ((z)object).a(0);
        switch (s2) {
            case 3: {
                av av2 = f.a(3);
                if (av2 == null) return;
                ay.a = (af)((z)object).a.elementAt(2);
                f.a(s.d[563], "", (int)(av2.a + 29), -1, false, av2, null);
                return;
            }
            case 7: 
            case 9: {
                ap.c(((z)object).a(1), s2);
                return;
            }
            case 10: {
                ap.c = null;
                return;
            }
            case 8: 
            case 13: {
                int n2 = ((z)object).a(1);
                e e2 = ay.a(n2);
                bl.a(n2, e2);
                if (e2 != null) {
                    e2.e();
                    bb.i();
                    m.a(e2);
                }
                if (s2 != 8) return;
                bl.c = new m(0, 0, 0, 1110000, 0, 0);
                bl.c.d(((z)object).a(2), ((z)object).a(3));
                return;
            }
            case 12: 
            case 14: {
                int n3 = ((z)object).a(1);
                object = (e)bl.b.a(n3);
                bl.b.a(n3);
                if (object != null) {
                    ((e)object).e();
                    k.a((m)ay.a, ((e)object).a());
                    if (((m)object).f(128)) {
                        ((m)object).j();
                    }
                }
                if (s2 != 12) return;
                ap.c = null;
                if (bl.c == null) return;
                aa.a().a(bl.c, true);
                bl.c = null;
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void C(z z2) {
        av av2 = f.a(122);
        byte by = z2.a(0);
        switch (by) {
            case 6: {
                ay.w.removeAllElements();
                al.a((int)z2.a(1), 4, 2, z2.a, ay.w);
                break;
            }
            case 0: 
            case 8: {
                ac.a(false, false);
                byte by2 = z2.a(2);
                Object object = by == 8 ? ay.w : ay.v;
                if ((object = ay.b((int)by2, (Vector)object)) != null) {
                    for (int i2 = 0; i2 < ((af[])object).length; ++i2) {
                        object[i2] = (af)z2.a.elementAt(i2 + 1);
                    }
                    break;
                } else {
                    object = by == 8 ? ay.w : ay.v;
                    ((Vector)object).addElement(al.a(4, 1, z2.a));
                    break;
                }
            }
            case 1: {
                ay.v.removeAllElements();
                al.a((int)z2.a(1), 4, 2, z2.a, ay.v);
                break;
            }
            case 2: {
                ac.a(false, false);
                if (av2 == null) break;
                u.a.f.removeAllElements();
                al.a((int)z2.a(1), 4, 2, z2.a, u.a.f);
                break;
            }
        }
        if (av2 != null) {
            a.G(av2);
        }
        if (f.a(3) != null) {
            a.j();
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void D(z var0) {
        var1_1 = 3;
        ac.a(false, false);
        block0 : switch (var0.a(6)) lbl-1000:
        // 56 sources

        {
            default: {
                return;
            }
            case 148: {
                if (ay.a == null) ** GOTO lbl-1000
                u.a((short)148, ay.a.a(), (short)0, (short)0, (short)0, 1);
                ** GOTO lbl-1000
            }
            case 149: {
                bb.a("R\u1eddi kh\u1ecfi tr\u00f2 ch\u01a1i!!", false);
                ** GOTO lbl-1000
            }
            case 106: {
                u.a.a(16384, true);
                ** GOTO lbl-1000
            }
            case 230: {
                if (!f.a(var0.a(5))) ** GOTO lbl-1000
                var0 = u.a;
                bb.i();
                ** GOTO lbl-1000
            }
            case 186: {
                var3_2 = var0.a(5);
                var4_4 = f.b(var3_2);
                var2_7 = var0.a(3);
                switch (var3_2) {
                    default: {
                        ** GOTO lbl-1000
                    }
                    case 7: {
                        var5_9 = u.a;
                        if (var2_7 != 0) break;
                        var1_1 = 0;
lbl32:
                        // 2 sources

                        while (var2_7 == 0) {
                            var2_7 = ay.a.a();
lbl34:
                            // 2 sources

                            while (true) {
                                var5_9.a(var4_4, var1_1, 0, new an(var2_7));
                                ** GOTO lbl-1000
                                break;
                            }
                        }
                        ** GOTO lbl116
                    }
                    case 31: {
                        u.a.g(null);
                        ** GOTO lbl-1000
                    }
                    case 32: {
                        z.a().a(1176, new ba(6));
                        ** GOTO lbl-1000
                    }
                    case 39: {
                        if (var2_7 != 91) ** GOTO lbl-1000
                        u.a.f(var4_4, 2);
                        ** GOTO lbl-1000
                    }
                    case 18: {
                        u.a.B(var4_4);
                        ** GOTO lbl-1000
                    }
                    case 46: {
                        u.a.e(var4_4, var2_7);
                        ** GOTO lbl-1000
                    }
                    case 9: {
                        u.a.a(var4_4, true, "", "", null);
                        ** GOTO lbl-1000
                    }
                    case 48: {
                        if (var2_7 != 2896) ** GOTO lbl-1000
                        u.a.b(var4_4, 1);
                        ** GOTO lbl-1000
                    }
                    case 43: {
                        if (var2_7 != 3000) ** GOTO lbl70
                        u.a.b(var4_4, -1, 0, 2);
                        ** GOTO lbl-1000
lbl70:
                        // 1 sources

                        if (var2_7 != 11) ** GOTO lbl-1000
                        u.a.b(var4_4, var0.a(1), 0, 3);
                        ** GOTO lbl-1000
                    }
                    case 40: {
                        u.a.b(var4_4, var2_7);
                        ** GOTO lbl-1000
                    }
                    case 114: {
                        var4_4.b(0).a(1);
                        ** GOTO lbl-1000
                    }
                    case 73: {
                        u.a.a(var4_4);
                        ** GOTO lbl-1000
                    }
                    case 12: {
                        if (var2_7 != 2895) ** GOTO lbl90
                        u.a.a(var4_4, 4);
                        ** GOTO lbl-1000
lbl90:
                        // 1 sources

                        u.a.a(var4_4, 0);
                        ** GOTO lbl-1000
                    }
                    case 88: {
                        if (var2_7 != 2888) ** GOTO lbl98
                        u.a.b(var4_4, 4, var0.a(1));
                        ** GOTO lbl-1000
lbl98:
                        // 1 sources

                        u.a.b(var4_4, 1, 0);
                        ** GOTO lbl-1000
                    }
                    case 34: {
                        if (var2_7 != 11) ** GOTO lbl107
                        u.a.a(var4_4, 14);
                        var4_4.a(1, new an(var0.a(1)));
                        ** GOTO lbl-1000
lbl107:
                        // 1 sources

                        u.a.a(var4_4, 12);
                        ** GOTO lbl-1000
                    }
                    case 25: {
                        u.a.b(var4_4);
                        ** GOTO lbl-1000
                    }
                }
                var1_1 = 10;
                ** GOTO lbl32
lbl116:
                // 1 sources

                var2_7 = var0.a(1);
                ** continue;
                {
                    case 8: {
                        if (var4_4.b(1).b() == 0) {
                            var4_4.b(0).a(10);
                            var4_4.b(1).a(var0.a(1));
                        }
                        u.a.a(var4_4, true);
                        ** GOTO lbl-1000
                    }
                    case 67: {
                        var4_4.b(0).a(var2_7);
                        ** GOTO lbl-1000
                    }
                    case 105: {
                        u.a.a(var4_4, 0, 0);
                        ** GOTO lbl-1000
                    }
                    case 145: {
                        if (var2_7 != 2880) ** GOTO lbl138
                        var2_7 = 2;
                        var1_1 = 0;
lbl135:
                        // 7 sources

                        while (true) {
                            u.a.a(null, var2_7, var1_1, 0);
                            ** GOTO lbl-1000
                            break;
                        }
lbl138:
                        // 1 sources

                        if (var2_7 != 2999) ** GOTO lbl143
                        u.a.a = new Vector[]{new Vector<E>(), new Vector<E>(), new Vector<E>(), new Vector<E>()};
                        var2_7 = 2;
                        var1_1 = 1;
                        ** GOTO lbl135
lbl143:
                        // 1 sources

                        if (var2_7 != 2879) ** GOTO lbl147
                        var2_7 = 1;
                        var1_1 = 0;
                        ** GOTO lbl135
lbl147:
                        // 1 sources

                        if (var2_7 != 2811) ** GOTO lbl152
                        var3_2 = 0;
                        var2_7 = var1_1;
                        var1_1 = var3_2;
                        ** GOTO lbl135
lbl152:
                        // 1 sources

                        if (var2_7 != 2810) ** GOTO lbl157
                        var3_2 = 1;
                        var2_7 = var1_1;
                        var1_1 = var3_2;
                        ** GOTO lbl135
lbl157:
                        // 1 sources

                        if (var2_7 != 2890) break block0;
                        var2_7 = 6;
                        var1_1 = 2;
                        ** GOTO lbl135
                    }
                    case 70: {
                        u.a.d(var4_4, var2_7);
                        ** GOTO lbl-1000
                    }
                    case 66: {
                        if (var2_7 != 2816) ** GOTO lbl-1000
                        u.a.c(var4_4, 10, 0);
                        ** GOTO lbl-1000
                    }
                    case 35: {
                        u.a.a(var4_4, 1, var2_7);
                        ** GOTO lbl-1000
                    }
                    ** case 57:
                }
lbl174:
                // 1 sources

                u.a.a(var4_4, var2_7, new an(0), new t(0), new ba(0));
                ** GOTO lbl-1000
            }
            case 250: {
                var3_3 = var0.a(5);
                var4_5 = f.b(var3_3);
                var1_1 = var0.a(3);
                var2_8 = var0.a(2);
                switch (var3_3) {
                    default: {
                        ** GOTO lbl-1000
                    }
                    case 56: {
                        u.a.a(var4_5, var1_1, var2_8);
                        ** GOTO lbl-1000
                    }
                    case 59: 
                }
                u.a.c(var4_5, 42, var1_1, var2_8);
                ** GOTO lbl-1000
            }
            case 131: {
                if (ay.a == null) ** GOTO lbl-1000
                if (var0.a(1) != ay.a.a()) ** GOTO lbl198
                ay.a.h = (byte)var0.a(2);
                ay.a.i = (byte)var0.a(3);
                ** GOTO lbl-1000
lbl198:
                // 1 sources

                var4_6 = ay.a(var0.a(1));
                if (var4_6 == null) ** GOTO lbl-1000
                var4_6.a.setElementAt(new ba(var0.a(2)), 1);
                var4_6.a.setElementAt(new ba(var0.a(3)), 2);
                var4_6.c();
                ** GOTO lbl-1000
            }
            case 105: 
            case 130: {
                if (ay.a == null) ** GOTO lbl-1000
                aa.a().c();
                ** GOTO lbl-1000
            }
            case 137: {
                if (ay.a == null) ** GOTO lbl-1000
                u.a.d(false);
                ap.a(System.currentTimeMillis(), false);
                ay.a.d(var0.a(2), var0.a(3));
                u.a.e(true);
                aa.a().a(ay.a);
                aa.a().d();
                ay.a.c(true);
                ay.b();
                u.a.a(1, false);
                u.a.a(16384, true);
                u.a((short)105, ay.a.a(), (short)0, (short)0, (short)0, 0);
                ay.a.q();
                ** GOTO lbl-1000
            }
            case 141: {
                var1_1 = var0.a(1);
                if (var1_1 < 1 || var1_1 > 299999) ** GOTO lbl229
                ay.a(var1_1, null);
                ** GOTO lbl-1000
lbl229:
                // 1 sources

                if (var1_1 < 1000000 || var1_1 > 999999999) ** GOTO lbl232
                ay.a(var1_1, null);
                ** GOTO lbl-1000
lbl232:
                // 1 sources

                if (m.o() != var1_1) ** GOTO lbl-1000
                aa.a().a(m.a(), true);
                ** GOTO lbl-1000
            }
            case 102: {
                ay.a(var0.a(1));
                ** GOTO lbl-1000
            }
        }
        var1_1 = 0;
        ** while (true)
    }

    private static void E(z object) {
        int n2 = ((z)object).a(0);
        int n3 = ((z)object).a(1);
        int n4 = ((z)object).a(2);
        object = ((z)object).a(3);
        aa.a().a(n4, n2, n3, (String)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void F(z object) {
        int n2 = 0;
        switch (((z)object).a(0)) {
            default: {
                return;
            }
            case 0: {
                ay.q.removeAllElements();
                ay.p.removeAllElements();
                byte by = ((z)object).a(1);
                n2 = 0;
                while (n2 < by) {
                    af[] afArray = new af[]{(af)((z)object).a.elementAt(n2 * 4 + 2), (af)((z)object).a.elementAt(n2 * 4 + 3), (af)((z)object).a.elementAt(n2 * 4 + 4), (af)((z)object).a.elementAt(n2 * 4 + 5)};
                    ay.q.addElement(afArray);
                    m m2 = new m(0, 0, 0, 2010000, 0, 0);
                    m2.a = afArray[3].toString();
                    m2.j = (byte)1024;
                    m2.d(afArray[1].b(), afArray[2].b());
                    ay.p.addElement(m2);
                    ++n2;
                }
                return;
            }
            case 2: {
                int n3 = ((z)object).a(1);
                aa aa2 = aa.a();
                if (aa2 == null) return;
                while (n2 < n3) {
                    int n4;
                    byte[] byArray;
                    int n5 = ((z)object).a(n2 * 3 + 2) + aa2.a * ((z)object).a(n2 * 3 + 3);
                    int n6 = ((z)object).a(n2 * 3 + 4);
                    if (aa2.b != null) {
                        if (n6 % 10 == 0) {
                            byArray = aa2.b;
                            n4 = n5 / 8;
                            byArray[n4] = (byte)(byArray[n4] & ~ag.a[n5 % 8]);
                        } else {
                            byArray = aa2.b;
                            n4 = n5 / 8;
                            byArray[n4] = (byte)(byArray[n4] | ag.a[n5 % 8]);
                        }
                    }
                    if (aa2.c != null) {
                        if (n6 / 10 == 0) {
                            byArray = aa2.c;
                            n6 = n5 / 8;
                            n4 = byArray[n6];
                            byArray[n6] = (byte)(~ag.a[n5 % 8] & n4);
                        } else {
                            byArray = aa2.c;
                            n6 = n5 / 8;
                            n4 = byArray[n6];
                            byArray[n6] = (byte)(ag.a[n5 % 8] | n4);
                        }
                    }
                    ++n2;
                }
                return;
            }
            case 3: 
        }
        aa aa3 = aa.a();
        if (aa3 == null) return;
        n2 = ((z)object).a(1) + aa3.a * ((z)object).a(2);
        byte by = ((z)object).a(3);
        int n7 = ((z)object).a(4);
        if (aa3.b != null) {
            aa.a[n2] = by;
        }
        if (aa3.d != null) {
            if (n7 == 0) {
                object = aa3.d;
                n7 = n2 >> 3;
                Object object2 = object[n7];
                object[n7] = (byte)(~ag.a[n2 % 8] & object2);
            } else if (n7 == 1) {
                object = aa3.d;
                n7 = n2 >> 3;
                Object object3 = object[n7];
                object[n7] = (byte)(ag.a[n2 % 8] | object3);
            }
        }
        aa.a().c(0, 0, true);
    }

    private static void G(z z2) {
        ay.a(z2.a(1), z2.a(2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void H(z z2) {
        int n2 = ((af)z2.a.elementAt(0)).b();
        if (n2 == 0) {
            return;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            af[] afArray = al.a(8, i2 * 8 + 1, z2);
            ay.o.addElement(afArray);
        }
        ay.n = a.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void I(z z2) {
        if (ay.a == null) {
            return;
        }
        if (z2.a(0) == ay.a.a()) return;
        if (ap.d == 1) {
            ((an)z2.a.elementAt((int)1)).a = z2.a(24);
        }
        e e2 = ay.a(z2.a(0), z2.a(17), 0, z2.a(6), z2.a(7), z2.a(1), z2.a(20), z2.a(3));
        e2.a.removeAllElements();
        al.a(z2.a.size(), 0, z2.a, (Vector)e2.a);
        e2.d(z2.a(6), z2.a(7));
        e2.h();
        e2.i(e2.m());
        e2.o(e2.a(35));
        e2.a(e2.g(36));
        if ((e2.m() & 0x20) != 0) {
            e2.a(4, -1);
        }
        u.a.e = 0;
        e2.b();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void J(z z2) {
        m m2 = ay.a(z2.a(0), al.d(z2.a(1)));
        int n2 = z2.a(2);
        k.c = false;
        int n3 = 3;
        int n4 = 0;
        while (true) {
            m m3;
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            block7: {
                block8: {
                    if (n4 >= n2) {
                        k.a(ay.a);
                        return;
                    }
                    n9 = n3 + 1;
                    n8 = z2.a(n3);
                    n3 = n9 + 1;
                    n7 = z2.a(n9);
                    int n10 = n7 / 1000000 % 10;
                    if (n10 <= 0) break block8;
                    n9 = n3 + 1;
                    n6 = z2.a(n3);
                    if (n10 > 1) {
                        n3 = n9 + 1;
                        n5 = z2.a(n9);
                        if (n10 > 2) {
                            n9 = z2.a(n3);
                            ++n3;
                            break block7;
                        } else {
                            n9 = 0;
                        }
                        break block7;
                    } else {
                        n5 = 0;
                        n10 = 0;
                        n3 = n9;
                        n9 = n10;
                    }
                    break block7;
                }
                n6 = 0;
                n5 = 0;
                n9 = 0;
            }
            if ((m3 = ay.a(n8, al.d(n7 / 10000 % 100))) != null) {
                k.a(m2, m3, 0, n7 / 10 % 1000, n6, n5, n9);
            }
            ++n4;
        }
    }

    private static void K(z z2) {
        k.a(al.a(z2.a.size(), 0, z2));
    }

    private static void L(z z2) {
        av av2 = f.a(3);
        if (av2 != null && f.a(s.d[569], "", (int)(av2.a + 31), -1, false, av2, null) != null) {
            ay.a = (af)z2.a.elementAt(2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void M(z object) {
        byte by = ((z)object).a(0);
        if (by == 14 || by == 15) {
            ac.a(false, false);
            object = f.a(23);
            if (object != null && ((h)((av)object).a(23008)).f() == 0) {
                ar ar2 = (ar)((q)((av)object).a(23003)).a(14);
                object = by == 14 ? s.d[74] : s.d[75];
                ar2.a((String)object);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void N(z z2) {
        int n2 = z2.a(0);
        bk bk2 = ay.a(z2.a(1));
        if (bk2 == null) {
            return;
        }
        if (n2 == 1) {
            bk2.b = z2.a(2);
            bk2.b = 0L;
            return;
        }
        if (n2 == 2) {
            n2 = z2.a(2);
            long l2 = System.currentTimeMillis();
            bk2.b = (long)(n2 * 1000) + l2;
            return;
        }
        if (n2 == 3) {
            n2 = z2.a(2);
            if ((n2 & 1) != 0) {
                bg.a((bg)bk2.a, 1, 9960000);
            } else {
                bg.a((bg)bk2.a, 1, 0);
            }
            if ((n2 & 2) != 0) {
                bg.a((bg)bk2.a, 2, 9970000);
            } else {
                bg.a((bg)bk2.a, 2, 0);
            }
            if ((n2 & 4) != 0) {
                bg.a((bg)bk2.a, 3, 9980000);
            } else {
                bg.a((bg)bk2.a, 3, 0);
            }
            if ((n2 & 8) != 0) {
                bg.a((bg)bk2.a, 4, 9950000);
                return;
            }
            bg.a((bg)bk2.a, 4, 0);
            return;
        }
        int n3 = z2.a(2);
        n2 = 0;
        while (n2 < n3) {
            int n4;
            int n5 = z2.a(n2 * 2 + 3);
            int n6 = z2.a(n2 * 2 + 4);
            if (bk2.a != null && n5 < bk2.a.size()) {
                n4 = ((af)bk2.a.elementAt(n5)).b();
                ((af)bk2.a.elementAt(n5)).a(n6);
            } else {
                n4 = 0;
            }
            if (n5 == 13) {
                bk2.c(n4, n6);
            } else if (n5 == 61) {
                bk2.m = (byte)n6;
                bk2.h();
            } else if (n5 == 15) {
                bk2.h();
            } else if (n5 == 60) {
                if (n6 > 10) {
                    bk2.h();
                } else {
                    bk2.h = s.a[n6];
                }
            }
            ++n2;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void O(z var0) {
        block28: {
            block26: {
                block27: {
                    switch (var0.a(0)) lbl-1000:
                    // 3 sources

                    {
                        default: lbl-1000:
                        // 2 sources

                        {
                            return;
                        }
                        case 1: {
                            var7_1 = al.a(var0.a.size() - 1, 1, (z)var0);
                            var0 = ay.a(var7_1[0].b());
                            if (var0 != null) {
                                ay.l.removeElement(var0);
                            }
                            ay.l.addElement(var7_1);
                            ** GOTO lbl-1000
                        }
                        case 2: {
                            var7_2 = ay.a(var0.a(1));
                            if (var7_2 != null) ** GOTO lbl18
                            z.a().a(2030, (af)new t(0), (an)var0.a.elementAt(2));
                            ** GOTO lbl-1000
lbl18:
                            // 1 sources

                            var0.a.removeElementAt(1);
                            block7: for (var1_3 = 1; var1_3 < ((af[])var7_2).length; ++var1_3) {
                                if (var1_3 == 5 || var1_3 == 7) {
                                    var0.a.addElement(new an(var7_2[var1_3].b()));
lbl22:
                                    // 2 sources

                                    continue block7;
                                }
                                var0.a.addElement(var7_2[var1_3]);
                                ** continue;
                            }
                            break;
                        }
                        case 0: 
                    }
                    if (ap.d == 1) {
                        ((an)var0.a.elementAt((int)10)).a = var0.a(13);
                    }
                    var2_4 = var0.a(1);
                    var7_2 = var8_5 = ay.a(var2_4);
                    if (var8_5 == null) break block26;
                    if (var8_5.r() == 200) break block27;
                    var7_2 = var8_5;
                    if (var8_5.r() != 201) break block26;
                }
                var7_2 = var8_5;
                if (var8_5.f(1)) {
                    var1_3 = var8_5.a() * -1;
                    var8_5.c = var1_3;
                    ((an)var8_5.a.elementAt(0)).a(var1_3);
                    var7_2 = null;
                }
            }
            var8_5 = var7_2;
            if (var7_2 == null) {
                var8_5 = ay.b(var2_4, var0.a(10));
            }
            var8_5.a.removeAllElements();
            al.a(16, 1, var0.a, (Vector)var8_5.a);
            var3_6 = var0.a(17);
            var4_7 = var0.a(18);
            if (var4_7 <= 0 || var8_5.a == null) break block28;
            block9: for (var1_3 = 0; var1_3 < var4_7; ++var1_3) {
                var6_9 = var0.a(var1_3 * 2 + 19);
                var5_8 = var0.a(var1_3 * 2 + 20);
                if (var6_9 == e.c) {
                    var8_5.a = (int)bb.a(var5_8, false, (m)var8_5);
lbl58:
                    // 3 sources

                    continue block9;
                }
                if (var0.a(var1_3 * 2 + 20) <= 0) ** GOTO lbl58
                bg.a((bg)var8_5.a, (int)var6_9, var5_8);
                ** continue;
            }
        }
        if (var0.a.size() > var1_3) {
            for (var1_3 = var4_7 * 2 + 19; var1_3 < var0.a.size(); ++var1_3) {
                var8_5.a.addElement(var0.a.elementAt(var1_3));
            }
        }
        if (var8_5.r() == 9) {
            var8_5.c();
            var8_5.m(0);
            var8_5.a.a(8, true);
lbl72:
            // 2 sources

            while (true) {
                var8_5.a = (int)var8_5.a();
                ay.a(var2_4, var8_5.a(4));
                if (var3_6 > 0) {
                    var8_5.a(var3_6 / 10, var3_6 % 10);
                }
                var8_5.h();
                if ((var8_5.m() & 32) != 0) {
                    var8_5.a(4, -1);
                }
                u.a.e = 0;
                var8_5.b();
                u.a((m)var8_5);
                ** continue;
                break;
            }
        }
        var8_5.c();
        var8_5.a();
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void P(z object) {
        if (ay.a == null) {
            return;
        }
        int n2 = ((z)object).a(1);
        byte by = (byte)(n2 / 10000000);
        if (by != 0) {
            if (by != 3) return;
        }
        int n3 = ((z)object).a(0);
        int n4 = n2 / 1000 % 1000;
        int n5 = n2 % 1000;
        object = ay.a;
        if (((bl)object).a() == n3) {
            if (by != 3) return;
            ((bl)object).d(n4, n5);
            a.e(true);
            return;
        }
        e e2 = ay.a(n3);
        if (e2 == null) {
            if (Math.abs(((bl)object).q - n4) > 18) return;
            if (Math.abs(((bl)object).r - n5) > 18) return;
            z.a().a(1014, new an(n3));
            return;
        }
        if (Math.abs(((bl)object).q - n4) > 18 || Math.abs(((bl)object).r - n5) > 18) {
            ay.a(n3, e2);
            return;
        }
        if (by == 0) {
            e2.a((byte)n4, (byte)n5, (byte)(n2 / 1000000 % 10));
            return;
        }
        e2.d(n4, n5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void Q(z object) {
        switch (((z)object).a(0)) {
            default: {
                return;
            }
            case 4: 
        }
        av av2 = f.a(7);
        if (av2 == null) return;
        if (av2.b(0).b() != 0) return;
        int n2 = ((z)object).a(1);
        object = (q)av2.a(7012);
        int n3 = ((q)object).h();
        int n4 = ((q)object).f() - 1;
        while (n4 >= 0) {
            ar ar2 = (ar)((q)object).a(n4 * n3);
            if (ar2 != null && ar2.d == n2) {
                ((j)av2.b(2)).a(q.a(av2, 7012, n4 * n3, av2.b(2).toString()));
                return;
            }
            --n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void R(z object) {
        byte by = ((z)object).a(0);
        object = ((z)object).a(1);
        if (by == 1) {
            return;
        }
        if (by == 2) return;
        if (by != 3) return;
        u.a.a = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void S(z z2) {
        switch (z2.a(0)) {
            case 0: {
                ay.a.a.setElementAt(new t(1), 21);
            }
            default: {
                return;
            }
            case 1: 
        }
        ay.a.a.setElementAt(new t(0), 21);
    }

    /*
     * Unable to fully structure code
     */
    private static void T(z var0) {
        block15: {
            block13: {
                block12: {
                    block14: {
                        var6_1 = null;
                        var7_2 = null;
                        ac.a(false, false);
                        var2_3 = var0.a(1);
                        var3_4 = var0.a(2);
                        var4_5 = var0.a(10);
                        var8_6 = f.a(145);
                        block0 : switch (var0.a(0)) {
                            default: {
                                var5_7 = var7_2;
lbl11:
                                // 7 sources

                                while (true) {
                                    var1_8 = 0;
lbl13:
                                    // 6 sources

                                    while (true) {
                                        if (var5_7 == null) break block12;
                                        var6_1 = ay.a(var2_3, var5_7);
                                        if (var6_1 != null) break block13;
                                        var5_7 = ay.a(var2_3, var0.a(10), var0.a(11), (Vector)var5_7);
lbl18:
                                        // 2 sources

                                        while (true) {
                                            var5_7.b = var0.a(4);
                                            var5_7.a = var0.a(3);
                                            var5_7.a = var0.a(5);
                                            var5_7.c = var0.a(6);
                                            var5_7.f = var0.a(7);
                                            var5_7.d = var0.a(8);
                                            var5_7.c = var0.a(9);
                                            var5_7.b = var4_5;
                                            var5_7.a = var0.a(11);
                                            var5_7.e = var0.a(12);
                                            var5_7.d = var0.a(13);
                                            var5_7.b = var0.a(14);
                                            var5_7.e = var3_4;
                                            var5_7.g = var0.a(15);
                                            if (bc.a(219, var5_7.b) && var5_7.a == null) {
                                                var5_7.a = new af[23];
                                                var5_7.a[0] = new j(var5_7.a);
                                                var5_7.a[1] = new an(var5_7.a);
                                                var5_7.a[2] = new t(var5_7.b);
                                                var5_7.a[3] = new an(var5_7.b);
                                                var5_7.a[4] = new an(var5_7.g);
                                                var5_7.a[22] = new d(0L);
                                                for (var2_3 = 5; var2_3 < 22; ++var2_3) {
                                                    var5_7.a[var2_3] = (af)var0.a.elementAt(var2_3 + 11);
                                                }
                                                break block0;
                                            }
                                            break block14;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            case 1: 
                            case 3: {
                                var5_7 = var7_2;
                                if (ay.a == null) ** GOTO lbl11
                                var5_7 = var7_2;
                                if (var3_4 != ay.a.a()) ** GOTO lbl11
                                var1_8 = var0.a(5);
                                if (var1_8 < 1 || var1_8 > 15) ** GOTO lbl58
                                ay.a(var2_3, ay.a);
                                var5_7 = ay.e;
                                var1_8 = 0;
                                ** GOTO lbl13
lbl58:
                                // 1 sources

                                if (var1_8 != -55 && var1_8 != -51 && var1_8 != -50 && var1_8 != -49) ** GOTO lbl63
                                if (var8_6 == null || var8_6.b(0).b() != 1) break block15;
                                var5_7 = w.a;
                                var1_8 = 0;
                                ** GOTO lbl13
lbl63:
                                // 1 sources

                                if (var1_8 != 0) ** GOTO lbl71
                                if (!ay.a(var2_3, ay.e)) ** GOTO lbl69
lbl65:
                                // 3 sources

                                while (true) {
                                    var5_7 = ay.a;
                                    var1_8 = 1;
                                    ** GOTO lbl13
                                    break;
                                }
lbl69:
                                // 1 sources

                                if (ay.a(var2_3, ay.f) || ay.a(var2_3, ay.g) || !ay.a(var2_3, ay.b)) ** GOTO lbl65
                                ** continue;
lbl71:
                                // 1 sources

                                if (var1_8 != -47) break block15;
                                var5_7 = ay.b;
                                var1_8 = 0;
                                ** GOTO lbl13
                            }
                            case 12: 
                            case 13: {
                                var5_7 = var7_2;
                                if (ay.a.a() == null) ** GOTO lbl11
                                var5_7 = var7_2;
                                if (var3_4 != ay.a.a().a()) ** GOTO lbl11
                                ay.a(var2_3, ay.a);
                                var5_7 = ay.f;
                                if (var5_7.size() <= 0 || ((bc)var5_7.elementAt((int)0)).e == var3_4) ** GOTO lbl11
                                var5_7.removeAllElements();
                                ** continue;
                            }
                        }
                        k.b(var5_7.a);
                    }
                    var5_7.f = var0.a(var0.a.size() - 1);
                    if (var1_8 != 0 && var5_7.d % 10 == 1) {
                        ap.a().b(var5_7.b, false);
                    }
                    ay.a(var5_7.e, var5_7.a, var5_7.b / 10000000 % 100);
                }
                if (var8_6 != null) {
                    u.a.o(var8_6);
                    u.a.a(var8_6, 145005, 145003, 2, -1, -1);
                }
                u.a.a(f.a(73), 73013, false);
                return;
            }
            var5_7 = var6_1;
            ** while (true)
        }
        var1_8 = 0;
        var5_7 = var6_1;
        ** while (true)
    }

    private static void U(z z2) {
        a.a(z2);
        ac.a(false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void V(z object) {
        short s2;
        ac.a(false, false);
        int n2 = ((z)object).a(0);
        Object object2 = null;
        block0 : switch (n2) {
            case 1: {
                int n3;
                if (((z)object).a.size() <= 1) return;
                if (((z)object).a(3) != ay.a.a()) return;
                s2 = ((z)object).a(9);
                Vector vector = s2 % 10 > 0 ? ay.d : ay.c;
                object2 = new ax(((z)object).a(1), ((z)object).a(3), ((z)object).a(2), ((z)object).a(8));
                al.a(((z)object).a.size() - 1, 1, ((z)object).a, (Vector)((Object)((ax)object2).a));
                if (vector.size() == 0) {
                    vector.addElement(object2);
                    break;
                }
                n2 = vector.size();
                for (n3 = 0; n3 < n2; ++n3) {
                    int n4 = ((ax)object2).a();
                    if (n4 == ((ax)(object = (ax)vector.elementAt(n3))).a()) {
                        if (((ax)object2).b() != ((ax)object).b()) {
                            object = s.a[69];
                            if (s2 == 1) {
                                object = s.a[111];
                            }
                            f.a(new StringBuffer().append(s.d[570]).append((String)object).append(((ax)object2).a()).append(s.d[571]).append(((ax)object2).b()).append("c\u1ea5p").toString());
                        }
                        vector.setElementAt(object2, n3);
                        break block0;
                    }
                    if (n3 != n2 - 1) continue;
                    vector.addElement(object2);
                }
                break;
            }
            case 13: {
                e e2 = null;
                if (((z)object).a(3) == ay.a.a()) {
                    ax ax2 = ay.c(((z)object).a(1));
                    object2 = ax2;
                    if (ax2 != null) {
                        e2 = ay.a;
                        object2 = ax2;
                    }
                } else {
                    e e3;
                    e2 = e3 = ay.a(((z)object).a(3));
                    if (e3 != null) {
                        object2 = new ax(((z)object).a(1), ((z)object).a(3), ((z)object).a(2), ((z)object).a(8));
                        e2 = e3;
                    }
                }
                if (e2 == null) return;
                if (object2 == null) return;
                al.a(((z)object).a.size() - 1, 1, ((z)object).a, (Vector)((Object)((ax)object2).a));
                ay.a(e2, (ax)object2, true);
                return;
            }
            case 14: 
            case 19: {
                Vector vector;
                if (n2 == 19) {
                    object2 = ay.d(((z)object).a(1));
                    vector = ay.g;
                } else {
                    object2 = ay.c(((z)object).a(1));
                    vector = ay.f;
                }
                if (object2 == null) return;
                if (n2 == 14) {
                    ay.a(ay.a, (ax)object2, false);
                }
                n2 = ((z)object).a(6);
                if (vector == null) {
                    vector = new Vector();
                } else {
                    vector.removeAllElements();
                }
                int n3 = 0;
                while (n3 < n2) {
                    af[] afArray = al.a(11, n3 * 11 + 7, (z)object);
                    object2 = ay.a(afArray[0].b(), afArray[1].b(), afArray[10].toString(), vector);
                    ((bc)object2).e = afArray[2].b();
                    ((bc)object2).a = ((ba)afArray[3]).a;
                    ((bc)object2).b = ((ba)afArray[4]).a;
                    ((bc)object2).a = ((t)afArray[5]).a;
                    ((bc)object2).c = ((ba)afArray[6]).a;
                    ((bc)object2).e = ((ba)afArray[7]).a;
                    ((bc)object2).d = ((ba)afArray[8]).a;
                    ((bc)object2).b = ((t)afArray[9]).a;
                    ((bc)object2).a = ((j)afArray[10]).a();
                    ++n3;
                }
                return;
            }
            default: {
                return;
            }
        }
        if (s2 % 10 != 1 && ((ax)object2).b() == 1) {
            ay.a(ay.a, (ax)object2, true);
        }
        if ((object = f.a(146)) == null) return;
        a.a((av)object, 146005, 146004, 2, -1, -1);
        a.a.a().a((av)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void W(z z2) {
        ax ax2 = ay.a(z2.a(0));
        if (ax2 != null) {
            int n2 = z2.a(1);
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = z2.a(i2 * 2 + 2);
                int n4 = z2.a(i2 * 2 + 3);
                if (n3 < ((Vector)((Object)ax2.a)).size()) {
                    ((af)((Vector)((Object)ax2.a)).elementAt(n3)).a(n4);
                }
                if (n3 == 5 || n3 == 18) {
                    av av2;
                    if (ax2.c() % 10 == 0) {
                        if (ax2.b() == 1) {
                            ay.a(ay.a, ax2, false);
                        } else if (ay.a.a() != null && ay.a.a().a() == ax2.a()) {
                            ay.a(ay.a, null, false);
                            ay.i.removeAllElements();
                            ay.f.removeAllElements();
                        }
                    }
                    if ((av2 = f.a(146)) == null) continue;
                    a.a(av2, 146005, 146004, 2, -1, -1);
                    continue;
                }
                if (n3 != 13) continue;
                ax2.o(n4);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void X(z var0) {
        ac.a(false, false);
        var1_1 = var0.a(0);
        switch (var1_1) lbl-1000:
        // 19 sources

        {
            default: lbl-1000:
            // 3 sources

            {
                return;
            }
            case 61: {
                ax.b = var0.a(1);
                ** GOTO lbl-1000
            }
            case 1: 
            case 15: {
                var2_2 = var0.a(1);
                var4_4 = ay.b(var2_2);
                if (var4_4 == null) ** GOTO lbl-1000
                if (var4_4.c() % 10 != 0) ** GOTO lbl29
                var3_6 = ay.c;
lbl16:
                // 2 sources

                while (var1_1 == 1) {
                    var1_1 = var3_6.size() - 1;
lbl18:
                    // 2 sources

                    while (true) {
                        if (var1_1 < 0) ** GOTO lbl22
                        if (((ax)var3_6.elementAt(var1_1)).a() != var2_2) ** GOTO lbl31
                        var3_6.removeElementAt(var1_1);
lbl22:
                        // 4 sources

                        while (true) {
                            var0 = f.a(146);
                            if (var0 == null) ** GOTO lbl-1000
                            a.a.a().a((av)var0);
                            u.a.a((av)var0, 146005, 146004, 2, -1, -1);
                            ** GOTO lbl-1000
                            break;
                        }
                        break;
                    }
                }
                ** GOTO lbl33
lbl29:
                // 1 sources

                var3_6 = ay.d;
                ** GOTO lbl16
lbl31:
                // 1 sources

                --var1_1;
                ** continue;
lbl33:
                // 1 sources

                if (var1_1 != 15) ** GOTO lbl22
                var4_4.a.setElementAt(var0.a.elementAt(2), 3);
                var4_4.a = "";
                ** continue;
            }
            case 2: 
            case 63: {
                var3_7 = f.a(145);
                if (var3_7 == null || var3_7.b(0).b() != 3) ** GOTO lbl-1000
                u.a.k.removeAllElements();
                al.a((int)var0.a(2), 4, 3, var0.a, u.a.k);
                u.a.a(var3_7, 145005, 145003, 2, -1, -1);
                ** GOTO lbl-1000
            }
            case 3: {
                var2_3 = var0.a(1);
                if ((var0 = ay.b(var2_3)) == null) ** GOTO lbl-1000
                if (var0.c() % 10 != 0) ** GOTO lbl60
                var0 = ay.c;
lbl50:
                // 2 sources

                while (true) {
                    var1_1 = var0.size() - 1;
lbl52:
                    // 2 sources

                    while (true) {
                        if (var1_1 < 0) ** GOTO lbl-1000
                        if (((ax)var0.elementAt(var1_1)).a() != var2_3) ** GOTO lbl62
                        var0.removeElementAt(var1_1);
                        var0 = f.a(145);
                        if (var0 == null || var0.b(0).b() != 3) ** GOTO lbl-1000
                        u.a.a((av)var0, 145005, 145003, 2, -1, -1);
                        ** GOTO lbl-1000
                        break;
                    }
                    break;
                }
lbl60:
                // 1 sources

                var0 = ay.d;
                ** continue;
lbl62:
                // 1 sources

                --var1_1;
                ** continue;
            }
            case 4: {
                var3_8 = f.a(145);
                if (var3_8 == null || var3_8.b(0).b() != 3) ** GOTO lbl-1000
                var1_1 = u.a.k.size() - 1;
                while (true) {
                    if (var1_1 < 0) ** GOTO lbl-1000
                    if (((af[])u.a.k.elementAt(var1_1))[0].b() != var0.a(1)) ** GOTO lbl74
                    u.a.k.removeElementAt(var1_1);
                    u.a.a(var3_8, 145005, 145003, 2, -1, -1);
                    ** GOTO lbl-1000
lbl74:
                    // 1 sources

                    --var1_1;
                }
            }
            case 68: {
                var4_5 = ay.a(var0.a(1));
                if (var4_5 == null) ** GOTO lbl-1000
                var3_9 = ay.a(var0.a(2), var0.a(3));
                if (var3_9 == null) ** GOTO lbl84
                var4_5.o(var0.a(4));
                var4_5.a(3, var3_9, null);
                ** GOTO lbl-1000
lbl84:
                // 1 sources

                var4_5.d(var0.a(5), var0.a(6));
                ** GOTO lbl-1000
            }
            case 69: {
                if ((var0 = ay.a(var0.a(1))) == null) ** GOTO lbl-1000
                var0.a(2, true);
                ** GOTO lbl-1000
            }
            case 70: 
        }
        if ((var0 = ay.a(var0.a(1))) == null) ** GOTO lbl-1000
        var0.g(0);
        var0.a(2, false);
        var0.j(3);
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void Y(z z2) {
        av av2;
        ac.a(false, false);
        av av3 = av2 = f.a(9);
        if (av2 == null) {
            av3 = f.b(9);
        }
        switch (z2.a(0)) {
            default: {
                int n2;
                int n3 = n2 = z2.a.size();
                if (n2 > 4) {
                    n3 = z2.a(4);
                }
                av3.a(s.a[2]);
                a.a(z2.a(1), z2.a(2), al.a(z2.a(3), "_"), n3, av3);
                return;
            }
            case 99: 
        }
        a.a(av3, true, z2.a(2), z2.a(1), al.a(z2.a.size() - 3, 3, z2.a));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void Z(z object) {
        int n2 = ((z)object).a(0);
        int n3 = ((z)object).a(1);
        int n4 = ((z)object).a(2);
        int n5 = ((z)object).a(3);
        int n6 = ((z)object).a(4);
        int n7 = ((z)object).a(5);
        byte by = ((z)object).a(6);
        switch (n2) {
            case 14: {
                if (by == 2) {
                    object = ay.a(n7);
                    if (object == null) return;
                    if (((m)object).a(n3) != null) return;
                } else {
                    if (n7 >= 200001 && n7 <= 239999) {
                        n2 = n7;
                    } else {
                        n2 = bk.a - 1;
                        if ((bk.a = n2) < -799) {
                            bk.a = -1;
                        }
                    }
                    bk bk2 = ay.b(n2, 0);
                    int n8 = bk2.a;
                    n8.removeAllElements();
                    n8.addElement(new an(n2));
                    if (by == 1) {
                        object = n7 == ay.a.a() ? ay.a : ay.a(n7);
                        if (object == null) {
                            ay.a(n2, null);
                            return;
                        }
                        n8.addElement(new ba(((m)object).q));
                        n8.addElement(new ba(((m)object).r));
                    } else {
                        n8.addElement(new ba((short)n4));
                        n8.addElement(new ba((short)n5));
                    }
                    n8.addElement(new an(0));
                    n8.addElement(new t(0));
                    n8.addElement(new an(0));
                    n8.addElement(new an(0));
                    n8.addElement(new an(0));
                    n8.addElement(new an(0));
                    n8.addElement(new an(0));
                    n8.addElement(new ba(0));
                    n8.addElement(new j(""));
                    n8.addElement(new an(0));
                    n8.addElement(new an(0));
                    n8.addElement(new ba(0));
                    n8.addElement(new an(0));
                    bk2.c();
                    object = bk2;
                }
                if ((object = ((bk)object).a.a(n3 / 1000 * 10000, n3 % 1000)) == null) return;
                ((bg)object).c = n6 * 1000;
                return;
            }
            case 15: {
                object = ay.a(n7);
                if (object == null) return;
                if (n3 == 0) {
                    ((bk)object).a.a.removeAllElements();
                    return;
                }
                ((m)object).c(n3);
                return;
            }
        }
    }

    private static Vector a(Vector vector, z z2) {
        int n2 = z2.a(1);
        Vector<af[]> vector2 = vector;
        if (vector == null) {
            vector2 = new Vector<af[]>();
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            vector2.addElement(al.a(4, i2 * 4 + 2, z2));
        }
        return vector2;
    }

    public static void a(byte by, int n2, int n3, short s2, byte by2) {
        am am2 = new am();
        am2.a(1033);
        am2.c(by);
        am2.d(n2);
        am2.b(by2);
        am2.d(0);
        am2.c(1);
        am2.d(n3);
        am2.d(s2);
        am2.a("");
        a.b(am2.a());
    }

    public static void a(int n2, int n3, short s2, short s3, short s4) {
        am am2 = new am();
        am2.a(2031);
        am2.d(n3);
        am2.d(0);
        am2.c(s2);
        am2.c(s3);
        am2.c(n2);
        am2.c(s4);
        a.b(am2.a());
    }

    public static void a(int n2, String string, String string2, String string3) {
        am am2 = new am();
        am2.a(1004);
        am2.c(n2);
        am2.a(string);
        am2.a(string3);
        am2.a(string2);
        a.b(am2.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(ah object) {
        short s2 = ((ah)object).a;
        z.a = ((ah)object).a;
        object = z.a();
        switch (s2) {
            default: {
                if (ay.a != null) break;
                return;
            }
            case 1004: 
            case 1006: 
            case 1010: 
            case 1012: 
            case 1051: 
            case 1052: 
            case 1055: 
            case 1065: 
            case 1066: 
            case 1077: 
            case 1080: 
            case 1081: 
            case 1082: 
            case 1504: 
            case 1527: 
            case 1602: 
            case 1605: 
            case 2500: 
        }
        switch (s2) {
            default: {
                return;
            }
            case 1004: {
                u.s((z)object);
                return;
            }
            case 1313: {
                u.aA((z)object);
                return;
            }
            case 2500: {
                u.a((z)object);
                return;
            }
            case 1535: {
                u.b((z)object);
                return;
            }
            case 1605: {
                u.c((z)object);
                return;
            }
            case 1312: {
                u.e((z)object);
                return;
            }
            case 1171: {
                u.f((z)object);
                return;
            }
            case 1170: {
                u.g((z)object);
                return;
            }
            case 1055: {
                u.h((z)object);
                return;
            }
            case 1602: {
                u.i((z)object);
                return;
            }
            case 1081: {
                u.j((z)object);
                return;
            }
            case 1080: {
                u.k((z)object);
                return;
            }
            case 1531: {
                u.l((z)object);
                return;
            }
            case 1527: {
                u.m((z)object);
                return;
            }
            case 2031: {
                u.n((z)object);
                return;
            }
            case 1157: {
                u.B((z)object);
                return;
            }
            case 1508: {
                u.w((z)object);
                return;
            }
            case 1506: {
                u.y((z)object);
                return;
            }
            case 1523: {
                u.C((z)object);
                return;
            }
            case 1052: {
                u.p((z)object);
                return;
            }
            case 1065: {
                u.o((z)object);
                return;
            }
            case 1082: {
                u.r((z)object);
                return;
            }
            case 1010: {
                u.D((z)object);
                return;
            }
            case 1006: {
                u.u((z)object);
                return;
            }
            case 1017: {
                u.v((z)object);
                return;
            }
            case 1110: {
                u.E((z)object);
                return;
            }
            case 1126: {
                u.F((z)object);
                return;
            }
            case 1014: {
                u.I((z)object);
                return;
            }
            case 1005: {
                u.P((z)object);
                return;
            }
            case 1146: {
                u.N((z)object);
                return;
            }
            case 2030: {
                u.O((z)object);
                return;
            }
            case 1008: {
                u.T((z)object);
                return;
            }
            case 1032: {
                u.Y((z)object);
                return;
            }
            case 2032: {
                u.U((z)object);
                return;
            }
            case 1009: {
                u.ac((z)object);
                return;
            }
            case 1056: {
                u.ah((z)object);
                return;
            }
            case 1101: {
                u.Z((z)object);
                return;
            }
            case 1107: {
                u.af((z)object);
                return;
            }
            case 1059: {
                u.z((z)object);
                return;
            }
            case 1049: {
                u.A((z)object);
                return;
            }
            case 1040: {
                u.M((z)object);
                return;
            }
            case 1158: {
                u.L((z)object);
                return;
            }
            case 1042: {
                u.K((z)object);
                return;
            }
            case 1060: {
                u.J((z)object);
                return;
            }
            case 1038: {
                u.aj((z)object);
                return;
            }
            case 1023: {
                u.ai((z)object);
                return;
            }
            case 1026: {
                u.ak((z)object);
                return;
            }
            case 1015: {
                u.an((z)object);
                return;
            }
            case 1138: {
                u.am((z)object);
                return;
            }
            case 1103: {
                u.ap((z)object);
                return;
            }
            case 1031: {
                u.ao((z)object);
                return;
            }
            case 1127: {
                u.V((z)object);
                return;
            }
            case 1134: {
                u.W((z)object);
                return;
            }
            case 1130: {
                u.X((z)object);
                return;
            }
            case 1129: {
                u.as((z)object);
                return;
            }
            case 1403: {
                u.ag((z)object);
                return;
            }
            case 1303: {
                u.ae((z)object);
                return;
            }
            case 1504: {
                u.aq((z)object);
                return;
            }
            case 1061: {
                u.S((z)object);
                return;
            }
            case 1037: {
                u.R((z)object);
                return;
            }
            case 1510: {
                u.Q((z)object);
                return;
            }
            case 1141: {
                u.H((z)object);
                return;
            }
            case 1142: {
                u.G((z)object);
                return;
            }
            case 1077: {
                ac.a(false, false);
                f.a(2);
                av av2 = f.b(4);
                a.a((z)object, av2, 0);
                return;
            }
            case 1012: {
                u.at((z)object);
                return;
            }
            case 1033: {
                u.q((z)object);
                return;
            }
            case 1407: {
                u.t((z)object);
                return;
            }
            case 1521: {
                u.aa((z)object);
                return;
            }
            case 1500: {
                u.av((z)object);
                return;
            }
            case 1518: {
                u.au((z)object);
                return;
            }
            case 2402: {
                u.al((z)object);
                return;
            }
            case 1132: {
                u.ar((z)object);
                return;
            }
            case 1145: {
                u.aw((z)object);
                return;
            }
            case 1519: {
                u.ax((z)object);
                return;
            }
            case 1603: {
                u.x((z)object);
                return;
            }
            case 1066: {
                u.d((z)object);
                return;
            }
            case 1176: {
                u.ay((z)object);
                return;
            }
            case 1534: {
                u.ab((z)object);
                return;
            }
            case 1311: {
                u.az((z)object);
                return;
            }
            case 1207: {
                u.aB((z)object);
                return;
            }
            case 1415: {
                u.aC((z)object);
                return;
            }
            case 1416: {
                u.aD((z)object);
                return;
            }
            case 1147: {
                u.aE((z)object);
                return;
            }
            case 1315: {
                u.aF((z)object);
                return;
            }
            case 1314: {
                u.aG((z)object);
                return;
            }
            case 1177: 
        }
        if (((z)object).a(0) != 15) return;
        ap.c = ((z)object).a(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(av g2, int n2, z z2) {
        q q2 = (q)((av)g2).a(n2);
        int n3 = q2.h();
        int n4 = z2.a(1);
        short s2 = z2.a(2);
        int n5 = q2.f() - 1;
        while (true) {
            block8: {
                block9: {
                    block7: {
                        if (n5 < 0) break block7;
                        g g3 = q2.a(n5 * n3);
                        if (g3 == null || g3.d != n4 || n2 == 70007 && g3.e != s2) break block8;
                        if (z2.a(0) != 28) break block9;
                        g2 = q2.a(n5 * n3 + n3 - 1);
                        g2.i = s.a[z2.a(3)];
                        ((x)g2).a(z2.a(4));
                    }
                    return;
                }
                if (n2 == 72008) {
                    q.a((av)g2, n2, n5 * n3, "");
                    if (!q2.a()) {
                        ((av)g2).b(-1);
                        return;
                    }
                    ((av)g2).b(0);
                    return;
                }
                ((j)((av)g2).b(2)).a(q.a((av)g2, n2, n5 * n3, ((av)g2).b(2).toString()));
                return;
            }
            --n5;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void a(av var0, g var1_1) {
        switch (var0.a / 1000) lbl-1000:
        // 3 sources

        {
            default: lbl-1000:
            // 3 sources

            {
                while (true) {
                    var0.v = var1_1.h + var1_1.b - 20;
                    var0.f(var1_1.a);
                    if ((var1_1.f & 128) != 0) {
                        var0.v = var1_1.h + var1_1.b - 20;
                    }
lbl8:
                    // 15 sources

                    return;
                }
            }
            case 5: {
                if (var1_1.a != 5005) ** GOTO lbl8
                var0.f(5003);
                ** GOTO lbl8
            }
            case 66: {
                if (var0.b(0).b() != 10) ** GOTO lbl-1000
                var0.e(66003);
                ** GOTO lbl8
            }
            case 93: {
                if (var1_1.a != 93005) ** GOTO lbl8
                q.a((q)var1_1, false);
                ** GOTO lbl8
            }
            case 1: {
                var0.e(1001);
                ** GOTO lbl8
            }
            case 103: {
                u.a.a((String)null, var0);
                ** GOTO lbl8
            }
            case 70: {
                if (var1_1.a == 70005) {
                    var0.f(var1_1.a);
                }
                u.a.a(var0, false);
                ** GOTO lbl8
            }
            case 7: {
                if (var1_1.a == 7005) {
                    var1_1 = (ar)((q)var0.a(7005)).a(0);
                    var1_1.a(bg.a(4961616, var1_1.d));
                }
            }
            case 8: {
                u.a.a(var0, false);
                ** GOTO lbl8
            }
            case 118: {
                if (!((r)var0.a(118001)).a()) ** GOTO lbl8
                var1_1 = (q)var0.a(118002);
                var2_2 = ((r)var0.a((int)118001)).h;
                var1_1.b(0, ((r)var0.a((int)118001)).b + var2_2);
                ** GOTO lbl8
            }
            case 73: {
                if (var1_1.a == 73014) ** GOTO lbl-1000
                u.a.b(var0, false);
                ** continue;
            }
            case 39: 
        }
        if (var1_1.a != 39007) ** GOTO lbl-1000
        var3_3 = (ar)var1_1;
        var3_3.a(bg.a(4961616, Integer.parseInt(var3_3.b)));
        ** while (true)
    }

    private static void a(m m2) {
        int n2 = ay.o.size() - 1;
        while (true) {
            block4: {
                block3: {
                    if (n2 < 0) break block3;
                    if (((af[])ay.o.elementAt(n2))[0].b() != m2.a()) break block4;
                    m2.a(8, true);
                }
                return;
            }
            --n2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static void a(z var0) {
        block88: {
            block87: {
                var7_1 = var0.a.size();
                var1_2 = 1;
                ac.a(false, false);
                block7: while (var1_2 < var7_1) {
                    var4_5 = var0.a(var1_2);
                    var12_12 = f.a(var4_5 / 1000);
                    if (var12_12 == null) {
                        return;
                    }
                    var2_3 = var0.a(var1_2 + 1);
                    var6_7 = var2_3 / 1000;
                    var5_6 = var2_3 % 1000;
                    var3_4 = (var1_2 += 2) + var5_6;
                    if (var4_5 % 1000 == 0) {
                        var10_10 = al.a(var0.a(var1_2), "@");
                        var12_12.a(var10_10[0]);
                        if (((String[])var10_10).length > 1 && var12_12.b != null) {
                            var12_12.a(1).a(Integer.parseInt(var10_10[1]));
                        }
                        ++var1_2;
                        continue;
                    }
                    var13_13 = var12_12.a(var4_5);
                    if (1 <= var6_7 && var6_7 <= 3 && !av.a(var12_12, var4_5, var2_3 = var6_7 > 2 ? var4_5 : var6_7 - 2, var9_9 = var5_6 > 0)) {
                        ++var1_2;
                        continue;
                    }
                    if (var13_13.b == 2) {
                        var11_11 = (ar)var13_13;
                        var14_14 = al.a(var0.a(var1_2), "@");
                        var10_10 = var14_14[0].length() > 0 ? var14_14[0].substring(0, 1) : var14_14[0];
                        if (var14_14.length > 1) {
                            var11_11.b = var14_14[1].substring(1, var14_14[1].length());
                        }
                        if (var10_10.equals("")) {
                            var11_11.a("");
                        } else if (var10_10.equals("#")) {
                            var2_3 = (int)Long.parseLong(var14_14[0].substring(1, var14_14[0].length()));
                            var11_11.a(bc.b(var2_3));
                            var11_11.b(var2_3);
                        } else if (var10_10.equals("*")) {
                            var11_11.a(o.a(Integer.parseInt(var14_14[0].substring(1, var14_14[0].length()))));
                        } else if (var10_10.equals("$")) {
                            var11_11.a(new bf(Integer.parseInt(var14_14[0].substring(1, var14_14[0].length()))));
                        } else if (var10_10.equals("%")) {
                            var11_11.a(new bf(Integer.parseInt(var14_14[0].substring(1, var14_14[0].length())), Integer.parseInt(var14_14[1])));
                        } else if (var10_10.equals("!")) {
                            var11_11.a(Integer.parseInt(var14_14[0].substring(1, var14_14[0].length())), 0, 0, 0);
                            if (var14_14.length > 1) {
                                for (var2_3 = 0; var2_3 < 4; ++var2_3) {
                                    if (var14_14.length <= var2_3 || (var3_4 = Integer.parseInt(var14_14[var2_3 + 1])) == 0) continue;
                                    bg.a(var11_11.a(), var2_3, var3_4);
                                }
                            }
                        } else {
                            var11_11.i = var10_10.equals("a") != false ? s.a[10] : s.a[Integer.parseInt((String)var10_10)];
                            var11_11.a(var14_14[0].substring(1, var14_14[0].length()));
                        }
                        ++var1_2;
                    } else if (var13_13.b == 7) {
                        ((n)var13_13).a(var0.a(var1_2));
                        ++var1_2;
                    } else if (var13_13.b == 11) {
                        if (var4_5 == 118001 || var4_5 == 118004) {
                            var12_12.a(var13_13, false);
                            ((r)var13_13).d();
                            u.a.c = new Vector<E>();
                            while (var1_2 < var3_4) {
                                ((r)var13_13).a(al.a(u.a.b("", var0.a(var1_2)), u.a.c));
                                ++var1_2;
                            }
                            if (u.a.c.size() > 0) {
                                var12_12.c(118003, true);
                            }
                            var10_10 = (ar)var12_12.a(118003);
                            var2_3 = ((r)var12_12.a((int)118001)).b;
                            var10_10.b(0, ((r)var12_12.a((int)118001)).h + var2_3 + 5);
                        } else {
                            ((r)var13_13).d();
                            for (var2_3 = var1_2; var2_3 < var3_4; ++var2_3) {
                                ((r)var13_13).a(var0.a(var2_3));
                            }
                            var1_2 = var2_3;
                            if (var5_6 == 0) {
                                ((r)var13_13).a("");
                                var1_2 = var2_3 + 1;
                            }
                        }
                        ((r)var13_13).a(0, ((r)var13_13).f());
                    } else {
                        if (var13_13.b == 4) {
                            var14_14 = al.a(var0.a(var1_2), "_@");
                            var10_10 = new bf[var14_14.length];
                            var11_11 = (String[])new int[var14_14.length];
                            ((h)var13_13).d();
                            ((h)var13_13).e();
                            break block87;
                        }
                        if (var13_13.b == 12) {
                            switch (var4_5 / 1000) {
                                case 1: {
                                    if (var12_12.b(0).b() == 0) break;
                                    return;
                                }
                                case 145: {
                                    if (var12_12.b(0).b() != 0) break;
                                    return;
                                }
                            }
                            var3_4 = var1_2 + 1;
                            var10_10 = var0.a(var1_2);
                            if (var6_7 <= 0) {
                                switch (var4_5 / 1000) {
                                    case 145: 
                                    case 146: {
                                        var9_9 = var5_6 > 0;
                                        if (!av.a(var12_12, var4_5, 0, var9_9)) {
                                            var1_2 = var3_4;
                                            continue block7;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                            if ((var1_2 = var4_5 == 93005 ? 2 : (var4_5 == 70007 ? 2 : (var4_5 == 70028 ? 1 : (var4_5 == 7012 ? 2 : (var4_5 == 73024 ? 1 : (var4_5 == 88033 ? 2 : -1)))))) > -1) {
                                if (!var12_12.b(var1_2).toString().equals("")) {
                                    var10_10 = new StringBuffer().append(var12_12.b(var1_2).toString()).append("_@").append((String)var10_10).toString();
                                }
                                ((j)var12_12.b(var1_2)).a((String)var10_10);
                            }
                            var14_14 = al.a((String)var10_10, "_@");
                            ((q)var13_13).b(var14_14.length, false);
                            break block88;
                        }
                    }
lbl120:
                    // 7 sources

                    while (true) {
                        u.a(var12_12, var13_13);
                        continue block7;
                        break;
                    }
                }
                return;
            }
            for (var2_3 = 0; var2_3 < var14_14.length; ++var2_3) {
                if (var14_14[var2_3].substring(0, 1).equals("#")) {
                    var10_10[var2_3] = bc.b(Integer.parseInt(var14_14[var2_3].substring(1, var14_14[var2_3].length())));
                    continue;
                }
                if (var14_14[var2_3].substring(0, 1).equals("*")) {
                    var10_10[var2_3] = o.a(Integer.parseInt(var14_14[var2_3].substring(1, var14_14[var2_3].length())));
                    continue;
                }
                var11_11[var2_3] = s.a[Integer.parseInt(var14_14[var2_3].substring(0, 1))];
                var14_14[var2_3] = var14_14[var2_3].substring(1, var14_14[var2_3].length());
                var10_10[var2_3] = null;
            }
            ((h)var13_13).a((bf[])var10_10);
            ((h)var13_13).a(var14_14);
            ((h)var13_13).a((int[])var11_11);
            var13_13.a(0, ((h)var13_13).e() + 12);
            ++var1_2;
            ** GOTO lbl120
        }
        block13: for (var4_5 = 0; var4_5 < var14_14.length; ++var4_5) {
            var15_15 = al.a(var14_14[var4_5], "@");
            var11_11 = new ar("", 0, 0);
            ((q)var13_13).a((g)var11_11, var4_5);
            var1_2 = 0;
            if (var15_15[0].length() > 0) {
                var1_2 = var15_15[0].charAt(0);
            }
            if (var1_2 == 32) {
                var1_2 = 1;
                var10_10 = var11_11;
            } else {
                if (var1_2 == 0 || var1_2 == 38) {
                    ((q)var13_13).a(null, var4_5);
                    continue;
                }
                if (var1_2 == 35) {
                    var2_3 = 3;
                    ((ar)var11_11).a(bc.b(Integer.parseInt(var15_15[0].substring(1, var15_15[0].length()))));
                    ((ar)var11_11).b((int)Long.parseLong(var15_15[1]));
                    var10_10 = var11_11;
                    var1_2 = var2_3;
                    if (Integer.parseInt(var15_15[2]) != 0) {
                        ((ar)var11_11).n = Integer.parseInt(var15_15[2]);
                        var10_10 = var11_11;
                        var1_2 = var2_3;
                    }
                } else if (var1_2 == 42) {
                    ((ar)var11_11).a(o.a(Integer.parseInt(var15_15[0].substring(1, var15_15[0].length()))));
                    var1_2 = 1;
                    var10_10 = var11_11;
                } else if (var1_2 == 36) {
                    ((ar)var11_11).a(new bf(Integer.parseInt(var15_15[0].substring(1, var15_15[0].length()))));
                    var1_2 = 1;
                    var10_10 = var11_11;
                } else if (var1_2 == 37) {
                    var1_2 = 2;
                    ((ar)var11_11).a(new bf(Integer.parseInt(var15_15[0].substring(1, var15_15[0].length())), Integer.parseInt(var15_15[1])));
                    var10_10 = var11_11;
                } else if (var1_2 == 122) {
                    var1_2 = ac.a < 240 ? 2 : 1;
                    var10_10 = new x(10, 8, var1_2, 4, var15_15[0].substring(1, var15_15[0].length()));
                    ((q)var13_13).a((g)var10_10, var4_5);
                    var1_2 = 1;
                } else if (var1_2 == 100) {
                    var10_10 = new x(18, 24, 3, 4, var15_15[0].substring(1, var15_15[0].length()));
                    ((q)var13_13).a((g)var10_10, var4_5);
                    var1_2 = 1;
                } else if (var1_2 == 116) {
                    ((ar)var11_11).b(var15_15[0].substring(1, var15_15[0].length()));
                    var1_2 = 1;
                    var10_10 = var11_11;
                } else {
                    var11_11.i = var1_2 == 97 ? s.a[10] : s.a[Integer.parseInt(var15_15[0].substring(0, 1))];
                    ((ar)var11_11).a(var15_15[0].substring(1, var15_15[0].length()));
                    var1_2 = 1;
                    var10_10 = var11_11;
                }
            }
            var6_7 = 0;
            var5_6 = var1_2;
            var2_3 = var1_2;
            var1_2 = var6_7;
            while (true) {
                if (var2_3 >= var15_15.length) continue block13;
                var6_7 = var15_15[var5_6].charAt(0);
                if (var6_7 == 101 || var6_7 == 102) {
                    var8_8 = ((q)var13_13).h();
                    var10_10.a(((q)var13_13).d(var4_5 % var8_8), ((q)var13_13).e(var4_5 / var8_8));
                    var11_11 = al.a(var15_15[var5_6].substring(2, var15_15[var5_6].length()), "/");
                    var8_8 = Integer.parseInt(var11_11[1]);
                    if (var6_7 == 102) {
                        var10_10.g = var10_10.g * var8_8 / 100;
                    }
                    ((ar)var10_10).m = Integer.parseInt(var11_11[0]) * 100 / var8_8 * 10 + Integer.parseInt(var15_15[var5_6].substring(1, 2));
                    if (((ar)var10_10).m == 0 && Integer.parseInt(var11_11[0]) != 0) {
                        ((ar)var10_10).m = 10;
                    }
                } else if (var6_7 == 115) {
                    ((ar)var10_10).b = var15_15[var5_6].substring(1, var15_15[var5_6].length());
                } else if (var6_7 == 109) {
                    var11_11 = var15_15[var5_6];
                    var6_7 = Integer.parseInt(var11_11.substring(1, var11_11.length()));
                    var10_10.a(var6_7, var15_15[++var2_3].equals("1"));
                } else if (var6_7 == 119) {
                    var10_10.g = ap.s * (int)Long.parseLong(var15_15[var5_6].substring(1, var15_15[var5_6].length())) / 176;
                } else {
                    if (var1_2 == 0) {
                        var10_10.d = (int)Long.parseLong(var15_15[var5_6]);
                    } else if (var1_2 == 1) {
                        var10_10.e = (int)Long.parseLong(var15_15[var5_6]);
                    } else if (var1_2 == 2) {
                        var10_10.b = (int)Long.parseLong(var15_15[var5_6]);
                    } else if (var1_2 == 3) {
                        var10_10.c = (int)Long.parseLong(var15_15[var5_6]);
                    }
                    ++var1_2;
                }
                ++var2_3;
                ++var5_6;
            }
        }
        var1_2 = var3_4;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(String object, String string, int n2, int n3) {
        String[] stringArray = al.a((String)object, "_@");
        if (stringArray != null && stringArray.length > 1) {
            object = stringArray[0];
        }
        if ((object = f.a((String)object, "", 127, 127, false, null, null)) != null) {
            if (string.equals("") || n3 == 0) {
                ((av)object).c(1005);
            } else {
                ((av)object).a(1005, string);
            }
            ((av)object).a(1004, s.b[30]);
            ((av)object).b(1002);
            ((av)object).e(1001);
            ((ar)((av)object).a((int)1002)).m = 6;
            ((av)object).b(3).a(n2 * 10);
            ((av)object).a(4, new d(System.currentTimeMillis()));
            if (stringArray.length > 1) {
                ((av)object).a(7, stringArray);
            }
            ay.a.a(5, 1);
            f.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(short s2, int n2, int n3, byte by, short s3, short s4, int n4) {
        am am2 = new am();
        am2.a(1009);
        am2.c(s2);
        if (s2 == 85 || s2 == 92) {
            am2.d(n2);
        } else if (s2 == 29 || s2 == 30) {
            am2.d(n2);
            am2.d(n3);
            if (ap.p != -1) {
                am2.b(1);
            } else {
                am2.b(0);
            }
        } else if (s2 == 10 || s2 == 11 || s2 == 40 || s2 == 9 || s2 == 93 || s2 == 29 || s2 == 30) {
            am2.d(n2);
            am2.d(n3);
        } else if (s2 == 5 || s2 == 6) {
            am2.d(n2);
            am2.b(by);
            am2.c(s3);
        } else if (s2 == 3) {
            am2.d(n2);
        } else if (s2 == 28) {
            am2.d(n2);
            am2.d(n3);
            am2.b(by);
            am2.c(s4);
            am2.c(s3);
        } else if (s2 != 56) {
            am2.d(n2);
            am2.d(n3);
            am2.b(by);
            am2.c(s4);
            am2.c(s3);
            am2.d(n4);
        }
        a.b(am2.a());
    }

    public static void a(short s2, int n2, short s3, short s4, short s5, int n3) {
        am am2 = new am();
        am2.a(1010);
        am2.d(0);
        am2.d(n2);
        am2.c(s3);
        am2.c(s4);
        am2.c(s5);
        am2.d(n3);
        am2.c(s2);
        a.b(am2.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean a(int n2, int n3, int n4, String object, byte by, byte by2, byte by3, int n5, String string, int n6, byte by4, boolean bl2) {
        am am2 = new am();
        if (n4 == 0) {
            if (n2 != 1 || ((String)object).compareTo("IDOK") == 0 || ((String)object).compareTo("IDFAIL") == 0) {
                // empty if block
            }
            u.a.a.d();
            u.a.a.e();
            u.a.b.d();
            u.a.b.e();
            return false;
        }
        u.a.a.d();
        u.a.a.e();
        bb.a = false;
        aj aj2 = u.a.b;
        aj.a = n2;
        aj2 = u.a.b;
        aj.c = n3;
        u.a.b.e();
        u.a.b.f();
        a.a();
        if (bb.a == 0) {
            u.a.b.b = s.d[5];
            u.a.b.a = new StringBuffer().append((String)object).append(":").append(n4).toString();
        } else {
            u.a.b.b = bl2 ? new StringBuffer().append("socket://").append((String)object).append(":").append(n4).toString() : (bb.a == 2 ? new StringBuffer().append("socket://").append(string).append(":").append(n5).toString() : (n6 == 0 ? new StringBuffer().append("socket://").append((String)object).append(":").append(n5).toString() : new StringBuffer().append("socket://").append((String)object).append(":").append(n6).toString()));
        }
        u.a.b.b[0] = by;
        u.a.b.b[1] = by2;
        u.a.b.c = by3;
        am2.a(1052);
        object = u.a.b;
        am2.d(aj.a);
        am2.d(n3);
        object = a;
        am2.b(w.a);
        am2.b(ap.d);
        am2.b(by4);
        am2.a(u.a.a);
        am2.a(u.a.b);
        a.b(am2.a());
        object = u.a.b;
        ((aj)object).b = (byte)(((aj)object).b | 1);
        u.a.b.a();
        return true;
    }

    private static af[] a(int n2, z afArray) {
        afArray = al.a(8, n2, (z)afArray);
        ay.x.addElement(afArray);
        return afArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void aA(z z2) {
        int n2 = z2.a(0);
        av av2 = f.a(25);
        switch (n2) {
            default: {
                return;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
        }
        Vector vector = a.a(n2);
        int n3 = z2.a.size();
        n2 = 2;
        while (true) {
            if (n2 >= n3) {
                if (av2 == null) return;
                a.b(av2, false);
                return;
            }
            int n4 = n2 + 1;
            bc bc2 = ay.a(z2.a(n2), vector);
            if (bc2 != null) {
                n2 = n4 + 1;
                bc2.a = (short)z2.a(n4);
                continue;
            }
            n2 = n4 + 1;
        }
    }

    private static void aB(z z2) {
        e.a = new byte[z2.a.size() - 1];
        for (int i2 = e.a.length; i2 > 0; --i2) {
            e.a[i2 - 1] = z2.a(i2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void aC(z afArray) {
        switch (afArray.a(0)) {
            default: {
                return;
            }
            case 1: 
            case 2: 
        }
        m m2 = ay.a(afArray.a(1), al.d(afArray.a(2)));
        if (m2 == null) return;
        int n2 = afArray.a(3);
        short s2 = afArray.a(4);
        if (m2.j == 1 && (afArray = m2.a(5)) != null && n2 == afArray[1].b() && (s2 == 0 || s2 == afArray[2].b())) {
            k.a(m2);
            return;
        }
        if (n2 != m2.q()) return;
        if (m2.j == 1) {
            k.a(m2);
            return;
        }
        m2.g(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void aD(z z2) {
        if (z2.a(1) != ay.a.a()) return;
        switch (z2.a(0)) {
            case 1: {
                int n2;
                af[] afArray = ay.a(z2.a(2), ay.h);
                if (afArray == null) break;
                for (n2 = z2.a(3) - 1; n2 >= 0; --n2) {
                    byte by = z2.a(n2 * 2 + 4);
                    int n3 = z2.a(n2 * 2 + 5);
                    if (by >= afArray.length - 1) continue;
                    afArray[by].a(n3);
                }
                break;
            }
            case 2: {
                int n2;
                for (n2 = z2.a(2) - 1; n2 >= 0; --n2) {
                    af[] afArray = ay.a(z2.a(n2 * 3 + 3), ay.h);
                    if (afArray == null) continue;
                    byte by = z2.a(n2 * 3 + 4);
                    int n4 = z2.a(n2 * 3 + 5);
                    if (by >= afArray.length - 1) continue;
                    afArray[by].a(n4);
                }
                break;
            }
            case 3: {
                int n2;
                byte by = z2.a(2);
                for (n2 = 0; n2 < 4; ++n2) {
                    k.a[by][n2] = z2.a(n2 + 3);
                }
                break;
            }
        }
        ap.a().f();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void aE(z z2) {
        bk bk2 = ay.a(z2.a(1));
        switch (z2.a(0)) {
            case 0: {
                if (bk2 == null) return;
                String string = z2.a(4);
                int n2 = s.a.stringWidth(string);
                int n3 = ac.a * 2 / 3;
                int n4 = n2;
                if (n3 < n2) {
                    n4 = n3;
                }
                bk2.a = new r(n4, 50, 1000, 0, 0);
                bk2.a.b(new StringBuffer().append("*0").append(string).toString());
                bk2.a.a(0, bk2.a.f());
                bk2.a.e = z2.a(3) * 1000;
                bk2.a = System.currentTimeMillis();
                ad.a().a(bk2.a(), 0, string, 2000, "");
            }
            default: {
                return;
            }
            case 1: 
        }
        ac.a(false, false);
        if (bk2 != null) {
            bk2.a(z2.a(2));
        }
        a.a(z2.a(2), null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void aF(z afArray) {
        byte by = afArray.a(1);
        m m2 = ay.a(afArray.a(0), al.d(by));
        afArray = al.a(afArray.a.size() - 3, 3, (z)afArray);
        if (m2 == null || m2.j != 8 || m2.a(false)) {
            k.c(afArray);
            return;
        }
        if (((bk)m2).b == null) {
            ((bk)m2).b = afArray;
            return;
        }
        af[] afArray2 = new af[((bk)m2).b.length + afArray.length];
        System.arraycopy(((bk)m2).b, 0, afArray2, 0, ((bk)m2).b.length);
        System.arraycopy(afArray, 0, afArray2, ((bk)m2).b.length, afArray.length);
        ((bk)m2).b = afArray2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void aG(z object) {
        switch (((z)object).a(0)) {
            default: {
                return;
            }
            case 4: 
        }
        object = f.a(88);
        if (object == null) return;
        if (((av)object).b(0).b() != 1) return;
        if (((h)((av)object).a(88011)).f() == 1) return;
        ((h)((av)object).a(88011)).a(1);
        a.F((av)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void aa(z object) {
        ac.a(false, false);
        short s2 = ((z)object).a(0);
        f.a(56);
        switch (s2) {
            case 11: {
                a.a(((z)object).a(1), null);
                return;
            }
            case 2: {
                av.d(56, 56003);
                return;
            }
            case 6: {
                object = f.a(57);
                if (object != null) {
                    ((av)object).b(1).a(0);
                    z.a().a(1521, (af)new ba(14), new an(av.a((av)object, (int)57005, (int)0).d));
                }
                if ((object = f.a(56)) != null) {
                    ((av)object).b(0);
                }
                if ((object = f.a(51)) == null) return;
                a.w((av)object);
                return;
            }
            case 15: {
                object = f.a(57);
                if (object == null) return;
                ((av)object).b(1).a(0);
                return;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void ab(z z2) {
        switch (z2.a(0)) {
            default: {
                return;
            }
            case 1: 
        }
        u.ad(z2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ac(z object) {
        ac.a(false, false);
        short s2 = ((z)object).a(0);
        av av2 = f.a(145);
        switch (s2) {
            case 131: {
                u.a("\u0110ang ti\u1ebfn h\u00e0nh..", s.a[142], 10, 1);
                return;
            }
            case 133: {
                u.a("\u0110ang ti\u1ebfn h\u00e0nh..", s.a[142], ((af)((z)object).a.elementAt(1)).b(), ((af)((z)object).a.elementAt(2)).b());
                return;
            }
            case 135: {
                u.a(((z)object).a(3), ((z)object).a(4), ((z)object).a(2), 1);
                return;
            }
            case 130: {
                f.a(1);
                ay.a.e();
                return;
            }
            case 120: 
            case 123: {
                if (((z)object).a(1) == 1) {
                    int n2 = ((z)object).a(2) * 100 / ((z)object).a(3);
                    if (s2 == 120) {
                        ap.c = new StringBuffer().append(Integer.toString(n2)).append("%").toString();
                        return;
                    }
                    ap.b = new StringBuffer().append(Integer.toString(n2)).append("%").toString();
                    return;
                }
                if (s2 == 120) {
                    ap.c = "";
                    return;
                }
                ap.b = "";
                return;
            }
            case 112: 
            case 113: {
                if (f.a(57) == null) return;
                if (s2 == 112) {
                    au.a = al.a((int)((z)object).a(1), 2, ((z)object).a);
                    return;
                }
                au.b = al.a((int)((z)object).a(1), 2, ((z)object).a);
                return;
            }
            case 56: {
                int n3 = ((z)object).a(1);
                short s3 = ((z)object).a(2);
                object = ay.a(n3, ay.a);
                if (object != null) {
                    ((bc)object).c = s3;
                }
                if (av2 == null) return;
                a.a(av2, 145005, 145003, 0, -1, -1);
                return;
            }
            case 4: {
                ay.a(((z)object).a(1), ay.a);
                if (av2 == null) return;
                a.a(av2, 145005, 145003, 2, -1, -1);
                return;
            }
            case 3: {
                a.a(((z)object).a(1));
                return;
            }
            case 6: {
                ay.a(((z)object).a(1), ay.e);
                return;
            }
            case 98: {
                ay.a(((z)object).a(1), ay.f);
                return;
            }
            case 107: {
                u.ad((z)object);
                return;
            }
            case 63: {
                ay.a(((z)object).a(1), ay.b);
                if (av2 == null) return;
                a.a(av2, 145005, 145003, 2, -1, -1);
                return;
            }
            case 78: {
                short s4 = ((z)object).a(2);
                object = ay.a(((z)object).a(1), ay.b);
                if (object != null) {
                    ((bc)object).c = s4;
                }
                if (av2 == null) return;
                a.a(av2, 145005, 145003, 0, -1, -1);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ad(z z2) {
        block3: {
            int n2;
            int n3;
            av av2;
            block5: {
                block4: {
                    av2 = f.a(57);
                    if (av2 == null) break block3;
                    n3 = av2.b(0).b();
                    if (n3 != 2827) break block4;
                    n3 = 3;
                    n2 = 57021;
                    break block5;
                }
                if (n3 != 2877 && n3 != 2846 && n3 != 2881) break block3;
                n2 = 57022;
                n3 = 2;
            }
            au.a = new Vector();
            int n4 = ((af)z2.a.elementAt(1)).b();
            al.a(n4, n3, 2, z2.a, au.a);
            av2.c(n2, false);
            av2.d(n2);
            String[] stringArray = new String[n4];
            for (n2 = 0; n2 < n4; ++n2) {
                stringArray[n2] = z2.a(n3 * n2 + 3);
            }
            bb.a(stringArray, av2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ae(z object) {
        ac.a(false, false);
        byte by = ((z)object).a(0);
        switch (by) {
            case 5: {
                f.a(1);
            }
            case 4: {
                int n2 = f.a();
                av av2 = f.a(n2);
                m.b = false;
                object = ((z)object).a(1);
                boolean bl2 = by == 4;
                if ((object = f.a((String)object, "", n2 * 1000 + 9, n2 * 1000 + 101, bl2, av2, null)) == null) return;
                ((av)object).a(0, new ak(true));
                ((av)object).c(1005);
            }
            default: {
                return;
            }
            case 11: 
        }
        a.a(((z)object).a(1), "");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void af(z z2) {
        switch (z2.a(0)) {
            default: {
                return;
            }
            case 29: 
        }
        a.a(z2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ag(z z2) {
        ac.a(false, false);
        short s2 = z2.a(0);
        switch (s2) {
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                av av2 = f.a(67);
                if (av2 == null) return;
                ((q)av2.a(67007)).b(2);
                av2.b(1).a(z2.a(1));
                av2.b(4).a(z2.a(2));
                av2.b(5).a(z2.a(3));
                ((d)av2.b((int)3)).a = System.currentTimeMillis();
                av2.f(67009);
                return;
            }
            case 17: 
            case 18: {
                u.a.a = new af[z2.a.size()];
                int n2 = 0;
                while (true) {
                    if (n2 >= z2.a.size()) {
                        if (s2 == 18) return;
                        ay.a = (an)z2.a.elementAt(2);
                        a.a("", s.d[4], (byte)46, (byte)47);
                        return;
                    }
                    u.a.a[n2] = (af)z2.a.elementAt(n2);
                    ++n2;
                }
            }
            case 19: {
                a.d(null, 19, z2.a(1));
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ah(z object) {
        short s2 = ((z)object).a(0);
        g g2 = f.a(20);
        switch (s2) {
            case 5: {
                if (ay.a == null) {
                    z.a().a(1056, (af)new ba(4), (af)((z)object).a.elementAt(1));
                    return;
                }
                f.a(0);
                g2 = f.b(20);
                aw.a();
                ((av)g2).b(1).a(((z)object).a(1));
                u.a.a = ((z)object).a(3);
                if (u.a.a != null) return;
                u.a.a = "";
                return;
            }
            case 33: 
            case 34: {
                ac.a(false, false);
                object = f.a(23);
                if (object == null) return;
                if (((h)((av)object).a(23008)).f() != 0) return;
                g2 = (ar)((q)((av)object).a(23003)).a(2);
                object = s2 == 33 ? s.d[74] : s.d[75];
                ((ar)g2).a((String)object);
                return;
            }
            case 11: {
                if (g2 == null) return;
                ((av)g2).b(1).a(0);
                f.a(20);
                return;
            }
            case 12: {
                object = a;
                bb.i();
                f.a(93);
                f.a(20);
                object = f.a(1);
                if (object == null) return;
                if (((av)object).b(5).b() != ((av)object).a + true) return;
                f.a(1);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ai(z object) {
        switch (((z)object).a(0)) {
            case 11: {
                a.i();
                return;
            }
            case 34: 
            case 35: {
                a.a((z)object);
                return;
            }
            case 1: {
                a.a(((z)object).a(1), ((z)object).a(2));
                return;
            }
            case 12: {
                a.f(((z)object).a(1));
                return;
            }
            case 17: {
                if (w.b() > 1) {
                    ay.a.b(false);
                    bl.c = true;
                }
                if ((object = f.a(15)) == null) return;
                a.b((av)object, 0);
                object = a;
                bb.i();
                return;
            }
            case 18: {
                if (w.a()) return;
                bl.c = false;
                ay.a.f = (Vector)-1;
                return;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static void aj(z z2) {
        int n2;
        int n3 = z2.a(5);
        an[] anArray = new an[9];
        for (n2 = 0; n2 < n3; ++n2) {
            anArray[n2] = (an)z2.a.elementAt(n2 + 5 + 1);
        }
        switch (z2.a(2)) {
            case 3: {
                for (n2 = -1; n2 < n3; ++n2) {
                    void var4_5;
                    int n4 = n2 == -1 ? z2.a(0) : anArray[n2].b();
                    if (n4 == ay.a.c) {
                        bl bl2 = ay.a;
                    } else {
                        e e2 = ay.a(n4);
                    }
                    if (var4_5 == null) continue;
                    e.a((e)var4_5, (int)z2.a(3), (int)z2.a(4), z2.a(1));
                }
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ak(z object) {
        av av2 = f.a(43);
        byte by = ((z)object).a(0);
        byte by2 = ((z)object).a(1);
        w w2 = a;
        switch (by) {
            case 2: {
                for (by = 0; by < by2; by = (byte)(by + 1)) {
                    Object object2 = u.a(by * 8 + 2, (z)object);
                    if (by == 0) {
                        ay.b = object2;
                    }
                    if (object2[0].b() == ay.a.a() || (object2 = ay.a(object2[0].b())) == null) continue;
                    ((m)object2).h();
                }
                w2.j();
                if (!a.b(av2, 0)) {
                    a.b(av2, 1);
                }
                z.a().a(1023, (af)new ba(17), new an(a.b()));
            }
            default: {
                return;
            }
            case 0: 
        }
        object = u.a(2, (z)object);
        if (((af)object[0]).b() == ay.a.a()) {
            ay.b = object;
        } else if ((object = ay.a(((af)object[0]).b())) != null) {
            ((m)object).h();
        }
        w2.j();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void al(z object) {
        ac.a(false, false);
        switch (((z)object).a(0)) {
            default: {
                return;
            }
            case 1: 
        }
        String string = ((z)object).a(1);
        av av2 = f.a(89);
        object = av2;
        if (av2 == null) {
            object = f.b(89);
        }
        a.a(al.a(string, u.a.e), (av)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void am(z object) {
        ac.a(false, false);
        switch (((z)object).a(0)) {
            case 6: {
                if (f.a(70) == null) return;
                au au2 = a;
                au.a = al.a(((z)object).a.size() - 1, 1, ((z)object).a);
                return;
            }
            case 12: 
            case 28: {
                av av2 = f.a(72);
                if (av2 != null) {
                    u.a(av2, 72008, (z)object);
                }
                if ((av2 = f.a(70)) == null) return;
                u.a(av2, 70007, (z)object);
                return;
            }
            case 14: {
                av av3 = f.a(70);
                if (av3 == null) return;
                int n2 = ((z)object).a(1);
                int n3 = ((z)object).a(2) == ay.a.a() ? 70028 : 70007;
                short s2 = ((z)object).a(3);
                q q2 = (q)av3.a(n3);
                int n4 = q2.h();
                int n5 = q2.f() - 1;
                while (n5 >= 0) {
                    object = (ar)q2.a(n5 * n4);
                    if (object != null && ((ar)object).d == n2 && (n3 == 70007 ? ((ar)object).e == s2 : ((ar)object).b.equals(Integer.toString(s2)))) {
                        n2 = 70028 == n3 ? 1 : 2;
                        ((j)av3.b(n2)).a(q.a(av3, n3, n5 * n4, av3.b(n2).toString()));
                        return;
                    }
                    --n5;
                }
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void an(z object) {
        ax ax2;
        block6: {
            int n2;
            int n3;
            block7: {
                block5: {
                    n3 = ((z)object).a(0);
                    if (n3 == 1) {
                        object = ((z)object).a(1);
                        ((j)ay.a.a.elementAt(20)).a((String)object);
                        return;
                    }
                    if (n3 == 3) {
                        object = ((z)object).a(1);
                        ay.a.a.setElementAt(new j((String)object), 38);
                        return;
                    }
                    if (n3 == 28) {
                        object = ((z)object).a(1);
                        ((j)ay.a.a.elementAt(42)).a((String)object);
                        return;
                    }
                    if (n3 != 27) break block5;
                    n2 = ((z)object).a(1);
                    ax2 = ay.b(n2);
                    if (ax2 != null) break block6;
                    break block7;
                }
                if (n3 == 30) {
                    f.a("", ((z)object).a(1), 592, 3000L);
                    return;
                }
                if (n3 != 31) return;
                e e2 = ay.a(((z)object).a(1));
                if (e2 == null) return;
                ((j)e2.a.elementAt(27)).a(((z)object).a(2));
                return;
            }
            for (n3 = ay.m.size() - 1; n3 >= 0; --n3) {
                e e3 = (e)ay.m.elementAt(n3);
                if (e3.a() == null || e3.a().a() != n2) continue;
                ax2 = e3.a();
                break;
            }
        }
        if (ax2 == null) return;
        ((Vector)((Object)ax2.a)).setElementAt(((z)object).a.elementAt(2), 3);
        ax2.a = "";
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ao(z afArray) {
        switch (afArray.a(0)) {
            default: {
                return;
            }
            case 4: 
        }
        int n2 = afArray.a(1);
        int n3 = 0;
        while (n3 < ay.h.size()) {
            afArray = (af[])ay.h.elementAt(n3);
            int n4 = afArray[1].b();
            if (afArray[2].b() + n4 * 1000 == n2) {
                ay.h.removeElementAt(n3);
                return;
            }
            ++n3;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void ap(z var0) {
        var1_1 = 2;
        var2_2 = 0;
        ac.a(false, false);
        var3_3 = var0.a(0);
        switch (var3_3) lbl-1000:
        // 13 sources

        {
            default: {
                return;
            }
            case 16: {
                var5_4 = u.a;
                au.d = new Vector<E>();
                ay.a(false, 1, var0, au.d);
                ** GOTO lbl-1000
            }
            case 50: {
                au.e = new Vector<E>();
                ay.a(false, 1, var0, au.e);
                ** GOTO lbl-1000
            }
            case 0: {
                ay.a(true, 1, var0, ay.h);
                ** GOTO lbl-1000
            }
            case 14: {
                ay.i.removeAllElements();
                ay.a(false, 1, var0, ay.i);
                ** GOTO lbl-1000
            }
            case 38: {
                if (ay.a != null) {
                    ay.h.removeElement(ay.a);
                }
                ay.a = ay.a(true, 1, var0, ay.h);
                ** GOTO lbl-1000
            }
            case 55: 
            case 56: 
            case 57: 
            case 66: {
                var5_5 = f.a(36);
                if (var5_5 == null) ** GOTO lbl-1000
                if (var3_3 != 55) ** GOTO lbl47
                var1_1 = 0;
lbl39:
                // 4 sources

                while (true) {
                    var6_7 = u.a;
                    ay.a(true, var0, ad.b[var1_1]);
                    if (var1_1 != ((h)var5_5.a(36002)).f()) {
                        ((h)var5_5.a(36002)).a(var1_1);
                    }
                    u.a.b(var5_5, var1_1, false);
                    ** GOTO lbl-1000
                    break;
                }
lbl47:
                // 1 sources

                if (var3_3 != 56) ** GOTO lbl50
                var1_1 = 1;
                ** GOTO lbl39
lbl50:
                // 1 sources

                if (var3_3 == 57) ** GOTO lbl39
                if (var3_3 != 66) break;
                var6_8 = u.a;
                ay.a(true, var0, ad.b[3]);
                u.a.a(var5_5, true, 20, u.a.b() + 21, 36000);
                var5_5.d(36021);
                ** GOTO lbl-1000
            }
            case 59: {
                var3_3 = var0.a(1);
                var1_1 = ay.h.size() - 1;
                while (true) {
                    if (var1_1 < 0) ** GOTO lbl-1000
                    var5_6 = (af[])ay.h.elementAt(var1_1);
                    if (var3_3 != var5_6[1].b()) ** GOTO lbl77
                    var4_10 = var0.a(2);
                    var3_3 = 3;
                    var1_1 = var2_2;
                    var2_2 = var3_3;
                    while (true) {
                        if (var1_1 >= var4_10) ** GOTO lbl-1000
                        var3_3 = var2_2 + 1;
                        var6_9 = var5_6[var0.a(var2_2)];
                        var2_2 = var3_3 + 1;
                        var6_9.a(var0.a(var3_3));
                        ++var1_1;
                    }
lbl77:
                    // 1 sources

                    --var1_1;
                }
            }
            case 68: {
                if (f.a(9) != null) {
                    f.a(9);
                }
                if (f.a(35) == null) ** GOTO lbl-1000
                f.a(35);
                ** GOTO lbl-1000
            }
        }
        var1_1 = -1;
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void aq(z z2) {
        av av2;
        av av3 = av2 = f.a(2);
        if (av2 == null) {
            av3 = f.a(4);
        }
        if (av3 == null) {
            MyMidlet.m_Midlet.exit(true);
            return;
        }
        MyMidlet.m_Midlet.UpdateAddr = z2.a(1);
        f.a(s.d[363], "", (int)(av3.a + 2), (int)(av3.a + 103), false, av3, new String[]{"C\u1eadp nh\u1eadt", "Trang ch\u1ee7"});
        ac.a(false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ar(z object) {
        int n2 = ((z)object).a(0);
        switch (n2) {
            case 34: {
                int n3 = ((z)object).a(1);
                n2 = ((z)object).a(2);
                ay.a(n3, n2 / 1000 * 10000, n2 % 1000);
                return;
            }
            case 29: {
                ay.a(((z)object).a(1), 2080000, 2);
                return;
            }
            case 33: {
                n2 = ((af)((z)object).a.elementAt(1)).b();
                bl.b = (short)(((af)((z)object).a.elementAt(2)).b() + n2 * 10000);
                return;
            }
            case 16: 
            case 31: {
                av av2 = f.a(41);
                if (av2 == null) return;
                if (((h)av2.a(41011)).f() != 0) return;
                q q2 = (q)av2.a(41017);
                if (!q2.a()) return;
                if (n2 == 31) {
                    if (q2.f() < 2 && av2.b != null && av2.a(1002).b() > 0) {
                        av2.b(-1);
                        return;
                    }
                    av2.b(0);
                    return;
                }
                int n4 = ((z)object).a(1);
                int n5 = q2.h();
                n2 = q2.f() - 1;
                while (n2 >= 0) {
                    object = q2.a(n2 * n5);
                    if (object != null && ((g)object).d == n4) {
                        ((ar)q2.a(n2 * n5 + 3)).a(s.b[110]);
                        return;
                    }
                    --n2;
                }
                return;
            }
        }
    }

    private static void as(z z2) {
        ay.a(z2.a(0), 2080000, 0);
    }

    private static void at(z z2) {
        int n2 = (int)System.currentTimeMillis();
        int n3 = z2.a(0);
        am am2 = new am();
        am2.a(1012);
        am2.d(z2.a(0));
        am2.d(n2 ^ n3);
        am2.d(z2.a(6));
        a.b(am2.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void au(z z2) {
        switch (z2.a(0)) {
            case 4: {
                u.a.b = z2.a(1);
                return;
            }
            case 5: {
                u.a.a = z2.a(1);
                u.a.b = z2.a(2);
                au.d = System.currentTimeMillis();
                a.a((long)u.a.b);
                return;
            }
            case 6: {
                a.a();
                return;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void av(z z2) {
        ac.a(false, false);
        switch (z2.a(0)) {
            default: {
                return;
            }
            case 2: 
            case 3: 
        }
        av.d(105, 105006);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void aw(z z2) {
        switch (z2.a(0)) {
            default: {
                return;
            }
            case 2: 
        }
        ac.a(false, false);
        ay.a.h = new Vector(5);
        int n2 = z2.a(1);
        for (int i2 = 0; i2 < n2; ++i2) {
            af[] afArray = al.a(4, i2 * 4 + 2, z2);
            ay.a.h.addElement(afArray);
        }
        ay.a.q = ((af)z2.a.elementAt(z2.a.size() - 1)).b();
        f.a(0);
        ay.a.q();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ax(z object) {
        ac.a(false, false);
        av av2 = f.a(73);
        if (av2 == null) {
            return;
        }
        switch (((z)object).a(0)) {
            default: {
                return;
            }
            case 1: {
                av.d(73, 73014);
                return;
            }
            case 3: 
        }
        int n2 = ((z)object).a(1);
        object = (q)av2.a(73024);
        int n3 = ((q)object).h();
        int n4 = ((q)object).f() - 1;
        while (n4 >= 0) {
            ar ar2 = (ar)((q)object).a(n4 * n3);
            if (ar2 != null && ar2.d == n2) {
                ((j)av2.b(1)).a(q.a(av2, 73024, n4 * n3, av2.b(1).toString()));
                return;
            }
            --n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ay(z z2) {
        switch (z2.a(0)) {
            case 4: {
                ay.a = (af)z2.a.elementAt(1);
                a.a("", z2.a(2), (byte)55, (byte)56);
            }
            default: {
                return;
            }
            case 6: 
        }
        a.a(null, z2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void az(z z2) {
        switch (z2.a(0)) {
            case 3: {
                z.a().a(1311, new t(3));
            }
            default: {
                return;
            }
            case 9: 
        }
        bb.a().b(z2.a(1), false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void b(z z2) {
        ac.a(false, false);
        int n2 = ((af)z2.a.elementAt(0)).b();
        switch (n2) {
            case 0: 
            case 3: {
                int n3 = z2.a(1);
                Object object = a;
                int n4 = n3 == 0 ? 1 : 0;
                object = ((ad)object).a(n3, null, n4, new String[]{s.b[9], s.a[2]}, -1);
                ((av)object).a(3, z2.a.elementAt(2));
                ((av)object).a(1, al.a(z2.a.size() - 3, 3, z2.a));
                ((av)object).b(4).a(n2);
                if (n3 == 0) return;
                ((av)object).a(2, new Vector());
                return;
            }
            case 1: {
                av av2 = f.a(93);
                if (av2 == null) return;
                al.a((int)z2.a(1), 2, 2, z2.a, (Vector)av2.a(2));
                a.a(av2, 93005, 93006, 2, -1, -1);
                return;
            }
            case 4: {
                if (z2.a(1) != 1) return;
                f.a(93);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void c(z z2) {
        Object object;
        ac.a(false, false);
        byte by = z2.a(3);
        int n2 = z2.a(4);
        boolean bl2 = z2.a.size() > n2 + 5 && z2.a(n2 + 5) == 1;
        int n3 = bl2 ? 1 : 0;
        af[] afArray = new af[n3 + (n2 + 3)];
        if (bl2) {
            afArray[afArray.length - 1] = new j("");
        }
        for (n3 = 0; n3 < 3; ++n3) {
            afArray[n3] = (af)z2.a.elementAt(n3 + 1);
        }
        afArray[2].a(1);
        for (n3 = 0; n3 < n2; ++n3) {
            afArray[n3 + 3] = (af)z2.a.elementAt(n3 + 5);
        }
        if (afArray[0].b() == 1157 && afArray[1].b() == 6) {
            object = a;
            if (!w.c) {
                afArray[1].a(11);
                afArray[2].a(0);
                z.a().a(afArray, 0);
                return;
            }
        }
        if (afArray[0].b() == 1023) {
            if (afArray[1].b() == 55) {
                if (bl.e) {
                    z.a().a(1023, (af)new ba(5), afArray[3]);
                    return;
                }
                object = new Integer(afArray[3].b());
                if (ay.a.containsKey(object) && System.currentTimeMillis() - (Long)ay.a.get(object) <= 60000L) {
                    z.a().a(1023, (af)new ba(38), afArray[3]);
                    return;
                }
            } else if (afArray[1].b() == 56 && !bl.f) {
                z.a().a(1023, (af)new ba(57), afArray[3]);
                return;
            }
        }
        if (((String)(object = z2.a(0))).equals("")) {
            if ((object = f.a((String)object, "", 3005, 3006, bl2, a, null)) == null) return;
            ((av)object).c(1007, false);
            ((av)object).c(1008, false);
        } else {
            object = by == 2 ? f.a((String)object, "", 3005, 3006, bl2, a, null) : f.a((String)object, "", 0, 0, bl2, null, null);
            if (object == null) return;
        }
        ((av)object).a(2, afArray);
        if (!bl2) return;
        ((n)((av)object).a(1003)).a((int)z2.a(n2 + 6));
        ((n)((av)object).a(1003)).b(z2.a(n2 + 7));
    }

    public static void cinitclone() {
        a = w.a();
        a = ad.a();
        a = au.a();
        a = ap.a();
        a = 0;
        a = new Vector();
        b = new Vector();
    }

    private static void d(z object) {
        object = new StringBuffer().append("http://").append(((z)object).a(0)).toString();
        u.a.b.e();
        u.a.b.f();
        u.a.b.b = 0;
        a.a(true, (String)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void e(z z2) {
        switch (z2.a(0)) {
            case 6: {
                ay.r = u.a(ay.r, z2);
                return;
            }
            case 7: {
                ay.s = u.a(ay.s, z2);
                return;
            }
            case 8: {
                ay.t = u.a(ay.t, z2);
                return;
            }
            case 9: {
                ay.u = u.a(ay.u, z2);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void f(z z2) {
        short s2 = z2.a(0);
        switch (s2) {
            default: {
                return;
            }
            case 0: 
            case 1: 
        }
        av av2 = f.a(90);
        Vector vector = av2 == null ? new Vector() : (Vector)av2.a(0);
        int n2 = z2.a(1);
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                a.a(av2, vector, s2);
                return;
            }
            af[] afArray = al.a(4, n3 * 4 + 2, z2.a);
            af[] afArray2 = new af[5];
            System.arraycopy(afArray, 0, afArray2, 0, 4);
            afArray2[4] = new d(System.currentTimeMillis());
            vector.addElement(afArray2);
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void g(z object) {
        ac.a(false, false);
        switch (((z)object).a(0)) {
            case 0: {
                ay.a = (af)((z)object).a.elementAt(1);
                f.a(((z)object).a(2), "", 3053, 3052, false, f.a(3), null);
            }
            default: {
                return;
            }
            case 3: 
        }
        String string = ((z)object).a(2);
        av av2 = f.a(89);
        object = av2;
        if (av2 == null) {
            object = f.b(89);
        }
        a.a(al.a(string, u.a.e), (av)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void h(z object) {
        ac.a(false, false);
        switch (((z)object).a(0)) {
            case 0: {
                av av2 = f.b(2);
                if (!al.a(3, 1, (z)object)[0].equals("")) {
                    f.a("\u0110\u0103ng k\u00fd t\u00e0i kho\u1ea3n th\u00e0nh c\u00f4ng!");
                }
                if (av2 != null && w.a != null) {
                    av2.b(2003, w.a[0]);
                    av2.b(2004, w.a[1]);
                }
                if (w.a) {
                    w.a = false;
                    al.a(w.a[0], w.a[1]);
                }
                w.a = null;
            }
            default: {
                return;
            }
            case 2: 
        }
        av av3 = f.a(2);
        String string = ((z)object).a(1);
        object = ((z)object).a(2);
        if (av3 != null) {
            av3.d(2014);
            av3.b(2003, string);
            av3.b(2004, (String)object);
        }
        f.a("Du kh\u00e1ch \u0111\u0103ng k\u00fd th\u00e0nh c\u00f4ng!", new StringBuffer().append("T\u00e0i kho\u1ea3n du kh\u00e1ch:").append(string).append("_M\u1eadt kh\u1ea9u:").append((String)object).toString(), 160, 0L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void i(z z2) {
        int n2 = 0;
        ac.a(false, false);
        int n3 = z2.a(0);
        av av2 = f.a(11) != null ? f.b(10) : null;
        while (n2 < n3) {
            int n4 = ((af)z2.a.elementAt(n2 * 3 + 1)).b();
            String string = ((af)z2.a.elementAt(n2 * 3 + 2)).toString();
            if (n4 < 9 && av2 != null) {
                av2.a(n4 - 1, new j(string));
                a.a(av2, n4, string);
            }
            ++n2;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void j(z object) {
        int n2 = ((z)object).a(1);
        if (n2 == 2) {
            bb.a("R\u1eddi kh\u1ecfi tr\u00f2 ch\u01a1i!", false);
            return;
        }
        if (n2 == 3) {
            f.a(11, (byte)2, new av(0, 0, 0, -1));
            ay.a(true);
            return;
        }
        if (n2 != 1) return;
        int n3 = ((z)object).a(0);
        n2 = 0;
        while (n2 < u.a.j.size()) {
            af[] afArray = (af[])u.a.j.elementAt(n2);
            if (n3 == afArray[0].b()) {
                an an2 = new an(0);
                an an3 = new an(0);
                an an4 = new an(0);
                object = new t(0);
                ba ba2 = new ba(0);
                j j2 = new j("");
                t t2 = new t((byte)afArray[6].b());
                u.a.j.setElementAt(new af[]{an2, an3, an4, object, ba2, j2, t2}, n2);
                object = f.a(11);
                a.a((av)object, 0, true);
                f.a("Xo\u00e1 th\u00e0nh c\u00f4ng");
                return;
            }
            ++n2;
        }
    }

    private static void k(z z2) {
        ac.a(false, false);
        f.a(4);
        af[] afArray = f.a(11);
        Object object = afArray;
        if (afArray == null) {
            afArray = f.b(11);
            object = afArray;
            if (f.a(10) != null) {
                f.b(10);
                object = afArray;
            }
        }
        afArray = a;
        bb.i();
        if (ad.c != null && (ad.c.length() < 6 || ad.c.length() == 6 && aw.a(ad.c))) {
            if (u.a.b == null) {
                u.a.b = new Vector();
            }
            u.a.b.addElement("\u0110\u1ed9 d\u00e0i m\u1eadt kh\u1ea9u c\u1ee7a b\u1ea1n qu\u00e1 ng\u1eafn, \u0111\u1ec3 ngh\u1ecb s\u1eeda_*2wap.UL3G.com");
        }
        afArray = a;
        ad.a((av)object, false);
        ((av)object).m();
        int n2 = z2.a(0);
        u.a.j = new Vector();
        while (u.a.j.size() < 3) {
            afArray = new af[30];
            afArray[0] = new an(0);
            afArray[1] = new an(0);
            afArray[2] = new an(0);
            afArray[3] = new t(0);
            afArray[4] = new ba(0);
            afArray[5] = new j("");
            afArray[6] = new t(0);
            u.a.j.addElement(afArray);
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            afArray = al.a(30, i2 * 30 + 1, z2);
            u.a.j.setElementAt(afArray, afArray[6].b());
        }
        a.a((av)object, 0, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void l(z z2) {
        byte by = z2.a(0);
        av av2 = f.b(118);
        if (by != 4 && by != 5 && by != 6) {
            if (z2.a(1) == 0) {
                return;
            }
            av2.a(0, new Vector());
            Vector vector = (Vector)av2.a(0);
            for (int i2 = 2; i2 < z2.a.size(); ++i2) {
                vector.addElement(z2.a.elementAt(i2));
            }
        }
        if (by == 1) {
            av2.c(118003);
            return;
        }
        if (by == 3) {
            av2.c(118001);
            ((q)av2.a(118002)).b(0, 35);
            return;
        }
        if (by == 5) {
            a.c(null, 21, 0);
            return;
        }
        if (by == 4) {
            av2.c(118002);
            return;
        }
        if (by != 6) return;
        av2.c(118002);
        av2.c(118001);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void m(z z2) {
        switch (z2.a(0)) {
            default: {
                return;
            }
            case 4: {
                int n2 = z2.a(1);
                k.a = new String[n2];
                for (int i2 = 0; i2 < n2; ++i2) {
                    k.a[i2] = z2.a(i2 + 2);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void n(z z2) {
        int n2 = 4;
        ac.a(false, false);
        short s2 = z2.a(0);
        bk bk2 = ay.a(z2.a(1));
        if (bk2 == null) {
            return;
        }
        switch (s2) {
            default: {
                return;
            }
            case 2: {
                ay.a(z2.a(1), null);
                return;
            }
            case 4: 
            case 7: {
                int n3 = s2 == 4 ? 4 : (int)z2.a(2);
                bk2.a = (short)n3;
                n3 = s2 == 4 ? n2 : 7;
                bk2.a(n3, null, al.a(z2.a.size() - 3, 3, z2));
                return;
            }
            case 8: {
                bk2.o(z2.a(4));
                if (z2.a(2) == 0) {
                    bk2.j(3);
                    return;
                }
                m m2 = ay.a(z2.a(2), z2.a(3));
                if (m2 == null) return;
                bk2.a(3, m2, new af[]{(t)z2.a.elementAt(5)});
                return;
            }
            case 9: {
                bk2.a(2, true);
                return;
            }
            case 10: 
        }
        bk2.g(0);
        bk2.a(2, false);
        bk2.j(3);
        bk2.j(7);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void o(z z2) {
        String string = z2.a(0);
        String string2 = z2.a(1);
        String string3 = z2.a(2);
        String string4 = z2.a(3);
        int n2 = z2.a(4);
        int n3 = z2.a(5);
        int n4 = z2.a(6);
        String string5 = z2.a(7);
        byte by = z2.a(8);
        byte by2 = z2.a(9);
        byte by3 = z2.a(10);
        a = z2.a(11);
        u.a.a = string;
        u.a.b = string2;
        al.a(2, string, string2, string3, string4);
        if (n4 == 0) {
            if (ay.a != null) {
                ((af)ay.a.a.elementAt(41)).a(0);
            }
            f.a(114);
            return;
        }
        u.a(n2, n3, n4, string5, by, by2, by3, 0, "", 0, a, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void p(z object) {
        int n2 = ((z)object).a(0);
        int n3 = ((z)object).a(1);
        int n4 = ((z)object).a(2);
        String string = ((z)object).a(3);
        byte by = ((z)object).a(4);
        byte by2 = ((z)object).a(5);
        byte by3 = ((z)object).a(6);
        int n5 = ((z)object).a(7);
        String string2 = ((z)object).a(8);
        int n6 = ((z)object).a(9);
        String string3 = ((z)object).a(10);
        a = ((z)object).a(11);
        if (a == 0) {
            u.a.d = null;
        }
        if (!u.a(n2, n3, n4, string, by, by2, by3, n5, string2, n6, a, false)) {
            return;
        }
        if (string3 == null) return;
        if (string3.equals("")) return;
        object = f.a(11);
        if (object == null) return;
        MyMidlet.m_Midlet.BindAddr = string3;
        f.a("T\u00e0i kho\u1ea3n c\u1ee7a b\u1ea1n ch\u01b0a kho\u00e1, c\u00f3 kho\u00e1 kh\u00f4ng?", "", (int)(((av)object).a + 13), -1, false, (bi)object, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void q(z z2) {
        int n2;
        ac.a(false, false);
        if (z2.a(0) == 16) {
            a.c(f.a(40), z2.a(1));
            return;
        }
        av av2 = f.a(145);
        if (av2 == null) return;
        ap.o = z2.a(1);
        short s2 = z2.a(4);
        Object object = a;
        if (w.a != null) {
            object = a;
            n2 = w.a.size();
        } else {
            n2 = 0;
        }
        int n3 = n2;
        int n4 = 0;
        while (true) {
            if (n3 >= s2 + n2) {
                a.a(av2, 145005, 145003, 2, -1, -1);
                return;
            }
            int n5 = z2.a(n4 * 6 + 5);
            int n6 = z2.a(n4 * 6 + 6);
            object = z2.a(n4 * 6 + 7);
            short s3 = z2.a(n4 * 6 + 8);
            short s4 = z2.a(n4 * 6 + 9);
            short s5 = z2.a(n4 * 6 + 10);
            ++n4;
            object = new bc(n3, n5, (String)object);
            ((bc)object).c = (short)n3;
            ((bc)object).c = n6;
            ((bc)object).a = s4;
            ((bc)object).b = s4;
            ((bc)object).b = (byte)s3;
            ((bc)object).g = s5;
            w w2 = a;
            w.a.addElement(object);
            ++n3;
        }
    }

    private static void r(z z2) {
        u.a.d = z2.a(0);
        if (z2.a(1) == 0) {
            f.b(10);
            z.a().a(1602, (af)new t(1), new an(1));
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void s(z var0) {
        block22: {
            block21: {
                block20: {
                    block19: {
                        var1_1 = var0.a(0);
                        var2_2 = var0.a(1);
                        ac.a(false, false);
                        switch (var1_1) lbl-1000:
                        // 10 sources

                        {
                            default: lbl-1000:
                            // 6 sources

                            {
                                return;
                            }
                            case 2016: {
                                bl.a(var2_2, true);
                                ** GOTO lbl-1000
                            }
                            case 2025: {
                                ay.c = var2_2;
                                ** GOTO lbl-1000
                            }
                            case 2024: {
                                ay.d = var2_2;
                                ** GOTO lbl-1000
                            }
                            case 2023: {
                                switch (var0.a(2)) {
                                    default: {
                                        au.a().a = false;
                                        f.a(var2_2);
                                        ** GOTO lbl-1000
                                    }
                                    case 22: {
                                        if (au.a().b == null) {
                                            au.a().b = new Vector<E>();
                                        }
                                        au.a().b.addElement(var2_2);
                                        ** GOTO lbl-1000
                                    }
                                    case 50: 
                                }
                                f.a(var2_2);
                                ** GOTO lbl-1000
                            }
                            case 2018: 
                            case 2100: 
                            case 2104: {
                                f.a(var2_2);
                                ** GOTO lbl-1000
                            }
                            case 2011: {
                                var1_1 = var0.a(2);
                                var0 = var2_2;
                                if (var2_2.substring(0, 1).equals("*")) {
                                    var1_1 = s.a[Integer.parseInt(var2_2.substring(1, 2))];
                                    var0 = var2_2.substring(2, var2_2.length());
                                }
                                ay.b = new StringBuffer().append("[GM]\uff1a").append((String)var0).toString();
                                ay.a = var1_1;
                                ad.a().a("GM", 0, (String)var0, 2021, "");
                                ** GOTO lbl-1000
                            }
                            case 2005: {
                                f.a(var2_2);
                            }
                            case 1010: 
                            case 2000: 
                            case 2001: 
                            case 2003: 
                            case 2004: 
                            case 2009: 
                            case 2017: 
                            case 2021: 
                            case 2022: 
                            case 2026: 
                            case 2110: {
                                ad.a().a(var0.a(2), 0, var2_2, var1_1, var0.a(3));
                                ** GOTO lbl-1000
                            }
                            case 2101: 
                        }
                        if (var0.a(2).compareTo(s.b[169]) != 0 || var2_2.compareTo("NEW_ROLE") != 0) break block19;
                        f.a(61);
                        var0 = f.b(10);
                        ad.a();
                        ad.a((av)var0, true);
                        ** GOTO lbl-1000
                    }
                    if (var2_2.compareTo("ACCOK") != 0) break block20;
                    bb.a("\u0110\u0103ng k\u00fd th\u00e0nh c\u00f4ng!!", false);
                    ** GOTO lbl-1000
                }
                if (var2_2.compareTo("PASSWDOK") != 0) break block21;
                bb.a("S\u1eeda m\u1eadt kh\u1ea9u th\u00e0nh c\u00f4ng!!", false);
                ** GOTO lbl-1000
            }
            if (var2_2.compareTo("NEW_ROLE") == 0) break block22;
            bb.a(var2_2, false);
            w.a = null;
            ** GOTO lbl-1000
        }
        bb.a("Li\u00ean k\u1ebft th\u1ea5t b\u1ea1i!!", false);
        ** while (true)
    }

    /*
     * Exception decompiling
     */
    private static void t(z var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 299->367)] java.lang.Exception
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void u(z object) {
        int n2 = 0;
        int n3 = ((z)object).a(0);
        if (2 == n3) {
            bb.a();
            z z2 = z.a();
            Object object2 = new t(18);
            n2 = ap.r < 2 ? 0 : 1;
            z2.a(1040, (af)object2, new an(n2));
            n2 = ((z)object).a(3);
            object2 = new bl(((z)object).a(35), ((z)object).a(36), 0, n2, ((z)object).a(1), ((z)object).a(34), ((z)object).a(2), ((z)object).a(4));
            al.a(((z)object).a.size(), 0, ((z)object).a, (Vector)((bl)object2).a);
            ay.a = null;
            ay.a = object2;
            u.a((short)137, ay.a.a(), (short)0, (short)0, (short)0, 0);
            ac.a(true, true);
            object = a;
            ad.a(6, ap.a);
            z.a().a(1602, (af)new t(1), new an(13));
            a.b();
            ((bl)object2).b();
            ((m)object2).o(((m)object2).a(47));
            if (k.a) return;
            k.a(true, a.b.a(s.j, 1));
            return;
        }
        if (5 == n3) {
            ap.n = ((z)object).a(1) - 1;
            bb.j();
            if (ap.n == -1) return;
            ap.m = ap.n;
            a.e();
            return;
        }
        if (n3 == 10) {
            n3 = ((z)object).a(1);
            bl.a = new int[n3];
            while (n2 < n3) {
                bl.a[n2] = ((z)object).a(n2 + 2);
                ++n2;
            }
            return;
        }
        if (n3 != 14) return;
        bl.c = ((z)object).a(1);
        n2 = ay.k.size() - 1;
        while (n2 >= 0) {
            ((bk)ay.k.elementAt(n2)).h();
            --n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void v(z z2) {
        int n2;
        block103: {
            af[] afArray;
            ac.a(false, false);
            Object object = f.a(145);
            n2 = z2.a(1);
            int n3 = z2.a(2);
            int n4 = 0;
            if (ay.a == null || n2 != ay.a.a()) {
                object = ay.a(n2);
                if (object == null) {
                    return;
                }
                afArray = a;
                afArray = w.a(n2);
                n4 = 0;
            } else {
                bl bl2 = ay.a;
                Object object2 = a;
                af[] afArray2 = w.a(n2);
                int n5 = 0;
                int n6 = 0;
                while (true) {
                    n2 = n4;
                    if (n6 >= n3) break block103;
                    int n7 = z2.a(n6 * 2 + 3);
                    int n8 = z2.a(n6 * 2 + 4);
                    n2 = n5;
                    if (((e)bl2).a != null) {
                        n2 = n5;
                        if (n7 < ((e)bl2).a.size()) {
                            n2 = ((af)((e)bl2).a.elementAt(n7)).b();
                            ((af)((e)bl2).a.elementAt(n7)).a(n8);
                        }
                    }
                    if (n7 >= 10 && n7 <= 14) {
                        ap.a().f();
                    }
                    if (n7 != 8) {
                        if (n7 == 144) {
                            ((e)bl2).m = (byte)n8;
                            ay.a();
                        } else if (n7 == 44) {
                            ay.a();
                        } else if (n7 == 146) {
                            ((af)((e)bl2).a.elementAt(48)).a(n8);
                        } else if (n7 == 139) {
                            if (n8 > 10) {
                                e.b = 0;
                                bl.b(4, false);
                                ((e)bl2).e();
                                ay.a();
                            } else {
                                bl.b(4, true);
                                ((e)bl2).h = s.a[n8];
                                e.b = 1;
                            }
                        } else if (n7 == 1) {
                            ((e)bl2).a(n8, ((e)bl2).c());
                        } else if (n7 == 5 && afArray2 != null) {
                            afArray2[2].a(n8);
                            n4 = 1;
                        } else if (n7 == 10 && afArray2 != null) {
                            afArray2[4].a(n8);
                            n4 = 1;
                        } else if (n7 == 11 && afArray2 != null) {
                            afArray2[3].a(n8);
                            n4 = 1;
                        } else if (n7 == 12 && afArray2 != null) {
                            afArray2[6].a(n8);
                            n4 = 1;
                        } else if (n7 == 13 && afArray2 != null) {
                            afArray2[7].a(n8);
                            n4 = 1;
                        } else if (n7 == 33) {
                            object2 = f.a(23);
                            if (object2 != null && ((h)((av)object2).a(23008)).f() == 0) {
                                ar ar2 = (ar)((q)((av)object2).a(23003)).a(8);
                                object = (0x1000000 & n8) != 0 ? s.d[74] : s.d[75];
                                ar2.a((String)object);
                            }
                            if ((n8 & 0x80) == 0 && bl2.b(5)) {
                                bl2.e();
                            }
                            bl.h = (0x400000 & n8) != 0;
                            if ((n2 & 0x800) != 0 && (n8 & 0x800) == 0) {
                                a.d(false);
                            }
                            bl2.c(n2, n8);
                            bl2.i(n8);
                            object = object2;
                        } else if (n7 == 47) {
                            bl2.o(n8);
                        } else if (n7 == 9) {
                            if (object != null) {
                                a.o((av)object);
                            }
                        } else if (n7 == 74) {
                            if (object != null && ((av)object).b(0).b() == 1) {
                                ((av)object).b(2).a(n8 % 100);
                                a.o((av)object);
                            }
                        } else if (n7 == 129) {
                            s.a = (short)n8;
                        } else if (n7 == 15 || n7 == 16 || n7 == 17) {
                            if (object != null) {
                                a.o((av)object);
                            }
                            if (n7 == 15) {
                                a.m(f.a(25));
                            }
                            a.a(f.a(73), 73013, false);
                        } else if (n7 == 141) {
                            bl.n = n8;
                        } else if (n7 == 142) {
                            bl.m = n8;
                        } else if (n7 == 143) {
                            bl.o = n8;
                        } else if (n7 == 147) {
                            bl2.a(n8);
                        }
                    }
                    ++n6;
                    n5 = n2;
                }
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                int n9 = z2.a(i2 * 2 + 3);
                n2 = z2.a(i2 * 2 + 4);
                if (n9 == 139) {
                    if (n2 <= 10) {
                        ((e)object).h = s.a[n2];
                        n2 = n4;
                    } else {
                        n2 = n4;
                    }
                } else {
                    if (n9 == 144) {
                        ((e)object).m = (byte)n2;
                        ((m)object).h();
                    } else if (n9 == 44) {
                        ((af)((e)object).a.elementAt(28)).a(n2);
                        ((m)object).h();
                    } else if (n9 == 1) {
                        ((e)object).a(n2, ((e)object).c());
                    } else if (n9 == 5) {
                        ((af)((e)object).a.elementAt(5)).a(n2);
                        if (afArray != null) {
                            afArray[2].a(n2);
                            n4 = 1;
                        }
                    } else if (n9 == 10) {
                        ((af)((e)object).a.elementAt(29)).a(n2);
                        if (afArray != null) {
                            afArray[4].a(n2);
                            n4 = 1;
                        }
                    } else if (n9 == 11) {
                        ((af)((e)object).a.elementAt(30)).a(n2);
                        if (afArray != null) {
                            afArray[3].a(n2);
                            n4 = 1;
                        }
                    } else if (n9 == 12) {
                        ((af)((e)object).a.elementAt(31)).a(n2);
                        if (afArray != null) {
                            afArray[6].a(n2);
                            n4 = 1;
                        }
                    } else if (n9 == 13) {
                        ((af)((e)object).a.elementAt(32)).a(n2);
                        if (afArray != null) {
                            afArray[7].a(n2);
                            n4 = 1;
                        }
                    } else if (n9 == 8) {
                        ((af)((e)object).a.elementAt(16)).a(n2);
                    } else if (n9 == 39) {
                        ((af)((e)object).a.elementAt(25)).a(n2);
                    } else if (n9 == 33) {
                        int n10 = ((e)object).m();
                        ((af)((e)object).a.elementAt(2)).a(n2);
                        if ((n2 & 0x80) == 0 && ((m)object).b(5)) {
                            ((m)object).e();
                        }
                        ((m)object).c(n10, n2);
                        ((e)object).i(n2);
                    } else if (n9 == 47) {
                        ((af)((e)object).a.elementAt(35)).a(n2);
                        ((m)object).o(n2);
                    } else if (n9 == 41) {
                        ((af)((e)object).a.elementAt(26)).a(n2);
                    } else if (n9 == 34) {
                        ((af)((e)object).a.elementAt(3)).a(n2);
                    } else if (n9 == 45 || n9 == 46) {
                        ((af)((e)object).a.elementAt(n9 + 33 - 45)).a(n2);
                    } else if (n9 < ((e)object).a.size()) {
                        ((af)((e)object).a.elementAt(n9)).a(n2);
                    } else if (n9 == 147) {
                        ((e)object).a(n2);
                    }
                    if (n9 == 21 || n9 == 22) {
                        ((m)object).h();
                        n2 = n4;
                    } else {
                        n2 = n4;
                        if (n9 == 8) {
                            n2 = n4;
                        }
                    }
                }
                n4 = n2;
            }
            n2 = n4;
        }
        if (n2 == 0) return;
        a.b(f.a(43), 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void w(z z2) {
        short s2 = z2.a(0);
        ac.a(false, false);
        av av2 = f.a(145);
        if (av2 == null) return;
        switch (s2) {
            case 1: {
                if (u.a.a == null) return;
                s2 = z2.a(1);
                for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
                    bc bc2 = new bc(s3, z2.a(s3 * 6 + 2), z2.a(s3 * 6 + 5));
                    bc2.c = z2.a(s3 * 6 + 4);
                    bc2.b = z2.a(s3 * 6 + 6);
                    bc2.g = z2.a(s3 * 6 + 7);
                    u.a.a[z2.a(s3 * 6 + 3) - 1].addElement(bc2);
                }
                a.a(av2, 145005, 145003, 2, -1, -1);
                a.r(av2);
            }
            default: {
                return;
            }
            case 5: 
        }
        ap.o = ap.p = z2.a(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void x(z z2) {
        e e2;
        int n2;
        int n3 = z2.a(0);
        int n4 = z2.a(1);
        if (n3 != 3) {
            if (n3 == 5) {
                ax ax2 = ay.a(n4);
                for (n2 = 3; n2 < z2.a.size(); ++n2) {
                    long l2 = bc.a(z2.a(n2));
                    n4 = (int)(l2 / 100000000L);
                    n3 = (int)(l2 % 100000000L);
                    if (ax2 == null) continue;
                    bg.a(((m)ax2).a, n4, n3);
                }
                return;
            }
            e2 = n4 == ay.a.a() ? ay.a : ay.a(n4);
        } else {
            g g2 = f.a(7);
            if (g2 == null) return;
            g2 = (ar)((av)g2).a(7028);
            while (n2 < z2.a.size()) {
                long l3 = bc.a(z2.a(n2));
                n3 = (int)(l3 / 100000000L);
                n4 = (int)(l3 % 100000000L);
                if (n3 == e.c) {
                    ((ar)g2).a(bb.a(n4, false, null));
                } else {
                    m.a(((ar)g2).a(), n3, n4);
                }
                ++n2;
            }
            return;
        }
        while (n2 < z2.a.size()) {
            long l4 = bc.a(z2.a(n2));
            n3 = (int)(l4 / 100000000L);
            int n5 = (int)(l4 % 100000000L);
            if (e2 != null) {
                if (n3 == e.c) {
                    boolean bl2 = n5 != 0;
                    e2.a = bl2;
                    bb.a(n5, false, e2);
                } else {
                    e2.f(n3, n5);
                }
            }
            ++n2;
        }
        if (n4 != ay.a.a()) return;
        a.d();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void y(z object) {
        ac.a(false, false);
        switch (((z)object).a(0)) {
            case 5: {
                object = f.a(57);
                if (object == null) return;
                ((av)object).d(57004);
                ad.a((av)object, false);
                return;
            }
            case 12: {
                ac.a(false, false);
                u.ad((z)object);
                return;
            }
            case 13: {
                a.a(((z)object).a(1), null);
                return;
            }
            case 10: 
            case 14: {
                ac.a(false, false);
                object = a;
                ad.a(f.a(57), false);
                f.b(94);
                return;
            }
        }
    }

    private static void z(z z2) {
        int n2 = z2.a(1);
        Vector<af[]> vector = new Vector<af[]>();
        int n3 = 2;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n4 = z2.a(n3 + 1) / 1000000 % 10 + 2;
            vector.addElement(al.a(n4, n3, z2.a));
            n3 += n4;
        }
        k.a((int)z2.a(0), vector);
    }
}

