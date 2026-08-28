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
import a.ae;
import a.af;
import a.ag;
import a.aj;
import a.ak;
import a.al;
import a.am;
import a.an;
import a.ap;
import a.ar;
import a.as;
import a.au;
import a.av;
import a.aw;
import a.ax;
import a.ay;
import a.az;
import a.b;
import a.ba;
import a.bb;
import a.bc;
import a.bf;
import a.bg;
import a.bi;
import a.bk;
import a.bl;
import a.bn;
import a.d;
import a.e;
import a.f;
import a.g;
import a.h;
import a.i;
import a.j;
import a.m;
import a.n;
import a.q;
import a.r;
import a.s;
import a.t;
import a.u;
import a.v;
import a.work.main.MyMidlet;
import a.x;
import a.y;
import a.z;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class w {
    public static int a;
    public static w a;
    public static Vector a;
    public static boolean a;
    public static String[] a;
    public static boolean b;
    public static boolean c;
    public static int d;
    public static Vector g;
    public long a;
    public ad a;
    public au a;
    public bb a;
    public String a;
    private final int[] a;
    public long[] a;
    public Vector[] a;
    private final int[][] a = new int[]{6520000, 6530000};
    public int b;
    public long b;
    public String b;
    public Vector b;
    private int[] b;
    private final int[][] b = 1;
    public int c;
    public String c;
    public Vector c = 1;
    public String d;
    public Vector d = null;
    int e;
    public Vector e = 0;
    int f;
    public Vector f = 0;
    int g;

    static {
        Static.regClass(34);
        w.cinitclone();
    }

    public w() {
        int[] nArray = new int[]{6450000, 6320000};
        int[] nArray2 = new int[]{0x609690, 6380000};
        int[] nArray3 = new int[]{6440000, 6370000};
        int[] nArray4 = new int[]{6340000, 6310000};
        int[] nArray5 = new int[]{6420000, 6460000};
        int[] nArray6 = new int[]{6390000, 6360000};
        int[] nArray7 = new int[]{6410000, 6430000};
        this.a = new int[][]{nArray, nArray2, nArray3, nArray4, nArray5, {6350000, 6400000}, nArray6, nArray7};
        nArray = new int[]{110000, 210000};
        nArray7 = new int[]{0, 0};
        this.b = new int[][]{nArray, {0, 220000}, {130000, 0}, {140000, 240000}, {150000, 0}, {0, 260000}, {170000, 270000}, {180000, 280000}, {0, 0}, nArray7};
        this.b = new int[]{17, 17, 17, 18, 17, 18, 18, 18};
    }

    private void R(av av2) {
        if (av2.a(88032).a()) {
            av2.c(88031);
            av2.c(88032);
            av2.c(88033);
            av2.a((int)88011).e = 88013;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a() {
        int n2 = 0;
        int n3 = ay.x.size();
        if (n3 == 0) {
            return n2;
        }
        n2 = 0;
        int n4 = 0;
        while (n2 < n3) {
            n4 += ((af[])ay.x.elementAt(n2))[2].b();
            ++n2;
        }
        return n4 / n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(int n2) {
        int n3;
        as as2;
        Object object;
        int n4;
        block15: {
            n4 = 0;
            try {
                object = new StringBuffer();
                as2 = new as(((StringBuffer)object).append(s.c[0]).append("PackageID.o").toString());
                boolean bl2 = as2.a();
                if (!bl2) break block15;
                return n4;
            }
            catch (Exception exception) {
                return n4;
            }
        }
        int n5 = 0;
        int n6 = 0;
        while (as2 != null) {
            int n7;
            block16: {
                n3 = n6;
                try {
                    if (!as2.b()) break;
                    n7 = n5 + 1;
                    n3 = n6;
                    if (n7 != 1) break block16;
                    n3 = n6;
                }
                catch (Exception exception) {
                    return n3;
                }
                n3 = n6 = as2.a();
            }
            int n8 = n3;
            if (n7 == 2) {
                n8 = n3;
                if (n2 == 2) {
                    n8 = as2.a();
                }
            }
            n6 = n8;
            n5 = n7;
            if (n7 != 3) continue;
            n6 = n8;
            n5 = n7;
            n3 = n8;
            if (!MyMidlet.m_Midlet.ConnectAddr.equals("")) continue;
            n3 = n8;
            object = MyMidlet.m_Midlet;
            n3 = n8;
            n3 = n8;
            StringBuffer stringBuffer = new StringBuffer();
            n3 = n8;
            ((MyMidlet)object).ConnectAddr = stringBuffer.append("").append(as2.a()).toString();
            n6 = n8;
            n5 = n7;
        }
        if (n5 != true) return n6;
        n3 = n4;
        if (n2 == 2) return n3;
        return n6;
    }

    private int a(int n2, int n3) {
        return n2 * n2 + n3 * n3;
    }

    public static w a() {
        if (a == null) {
            a = new w();
        }
        return a;
    }

    public static void a(int n2, int n3, int n4) {
        for (int i2 = ay.x.size() - 1; i2 >= 0; --i2) {
            af[] afArray = (af[])ay.x.elementAt(i2);
            if (afArray[0].b() != n2) continue;
            afArray[n3].a(n4);
        }
    }

    private void a(ar ar2, ar ar3) {
        ar3.b((int)ar2.a, (int)ar2.b);
        ar3.a((int)ar2.b());
        ar3.b = new StringBuffer().append("").append((int)ar2.a).toString();
    }

    private void a(av av2, m m2) {
        StringBuffer stringBuffer = al.a(null, "(");
        al.a(stringBuffer, (long)m2.q);
        al.a(stringBuffer, ",");
        al.a(stringBuffer, (long)m2.r);
        al.a(stringBuffer, ")");
        ((ar)av2.a(48014)).a(stringBuffer.toString());
    }

    private void a(av g2, String string) {
        g2 = (r)((av)g2).a(10042);
        ((r)g2).n = ((r)g2).h;
        ((r)g2).d();
        ((r)g2).b(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(av av2, int[] nArray) {
        int n2 = 28;
        if (av2.a / 1000 == 8) {
            n2 = 39;
        }
        int n3 = n2;
        if (av2.a / 1000 == 7) {
            n3 = 46;
        }
        int n4 = 5;
        n2 = 0;
        while (true) {
            int n5;
            block6: {
                if (n4 > n3) {
                    return;
                }
                for (n5 = n2; n5 < nArray.length; ++n5) {
                    if (n4 != nArray[n5]) continue;
                    av2.c((int)(av2.a + n4), false);
                    n5 = 1;
                    ++n2;
                    break block6;
                }
                n5 = 0;
            }
            if (n5 == 0) {
                av2.c((int)(av2.a + n4));
            }
            ++n4;
        }
    }

    public static void a(m m2) {
        g.removeElement(m2);
        if (d >= g.size()) {
            d = 0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(m m2, Vector vector) {
        if (!aa.a().b.contains(m2)) {
            return;
        }
        if (vector.size() > 0) {
            byte by = aa.a().e;
            byte by2 = aa.a().f;
            int n2 = this.a(m2.q - by, m2.r - by2);
            for (int i2 = vector.size() - 1; i2 >= 0; --i2) {
                m m3 = (m)vector.elementAt(i2);
                if (n2 < this.a(m3.q - by, m3.r - by2)) continue;
                vector.insertElementAt(m2, i2 + 1);
                return;
            }
        }
        vector.insertElementAt(m2, 0);
    }

    private void a(af[] afArray) {
        Vector vector = ay.x;
        vector.removeElement(afArray);
        vector.insertElementAt(afArray, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a() {
        if (ay.b == null) return false;
        if (w.a().b() != ay.a.a()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean a(av object) {
        long l2 = ((d)((av)object).b((int)1)).a;
        if (l2 == 0L) return false;
        long l3 = System.currentTimeMillis();
        if (l3 >= l2) {
            switch (((av)object).b(9).b()) {
                case 1: {
                    z.a().a(1081, (af)new an(ay.a.a()), (af)new t(2), new an(s.g));
                }
                default: {
                    break;
                }
                case 2: {
                    z z2 = z.a();
                    an an2 = new an(ay.a.a());
                    t t2 = new t(3);
                    an an3 = new an(s.g);
                    object = this.a == null ? "" : this.a;
                    j j2 = new j((String)object);
                    object = this.b == null ? "" : this.b;
                    z2.a(1081, an2, t2, an3, j2, new j((String)object));
                }
            }
            a.f.a(1);
            return true;
        }
        if (l3 - ((d)((av)object).b((int)8)).a <= 1000L) return false;
        ((av)object).a(8, new d(l3));
        l2 = (l2 - l3) / 1000L;
        r r2 = (r)((av)object).a(1001);
        r2.d();
        object = ((j)((av)object).b(10)).a();
        r2.b(new StringBuffer().append((String)object).append(l2).append("s").toString());
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(e e2) {
        boolean bl2 = false;
        if (e2.j == 1) {
            if (w.b() <= 0) return bl2;
            return true;
        }
        if ((e2.m() & 0x200000) != 0) return true;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static af[] a(int n2) {
        int n3 = ay.x.size() - 1;
        while (n3 >= 0) {
            af[] afArray = (af[])ay.x.elementAt(n3);
            if (afArray[0].b() == n2) {
                return afArray;
            }
            --n3;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static byte b() {
        if (w.a()) {
            return (byte)1;
        }
        int n2 = ay.a.a();
        int n3 = ay.x.size() - 1;
        while (n3 >= 0) {
            if (((af[])ay.x.elementAt(n3))[0].b() == n2) {
                if (!bl.c) return (byte)3;
                return (byte)2;
            }
            --n3;
        }
        return (byte)0;
    }

    private void b(an an2) {
        z.a().a(1023, (af)new ba(6), an2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(av object, int n2, int n3) {
        if (n2 != 0) {
            ((av)object).d(n2);
        }
        StringBuffer stringBuffer = new StringBuffer().append("H\u00e3y ch\u1ecdn");
        object = n3 == 2878 || n3 == 2846 ? s.a[69] : s.d[169];
        a.f.a(stringBuffer.append((String)object).toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b() {
        if (ay.x.size() >= 9) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(int n2) {
        int n3 = ay.x.size() - 1;
        while (n3 >= 0) {
            if (((af[])ay.x.elementAt(n3))[0].b() == n2) {
                return true;
            }
            --n3;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int c() {
        long l2;
        String string = a.b.a(s.g, 1);
        int n2 = 0;
        if (string != null) return Integer.parseInt(string);
        try {
            l2 = System.currentTimeMillis() % 10000000L * 10L + (long)al.a(10);
            string = s.g;
            StringBuffer stringBuffer = new StringBuffer();
            a.b.a(string, 1, stringBuffer.append("").append(l2).toString());
        }
        catch (Exception exception) {
            return n2;
        }
        return (int)l2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void c(int n2) {
        try {
            a.b.a(s.f, 1, Integer.toString(n2));
            if (n2 != bb.a) {
                bb.a = (byte)n2;
                w.m(a.f.a(2));
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c() {
        boolean bl2 = true;
        if (ay.x.size() <= 1) return false;
        return bl2;
    }

    public static void cinitclone() {
        a = false;
        b = false;
        c = true;
        g = new Vector();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean d() {
        if (!w.a()) return true;
        if (!w.c()) return true;
        return false;
    }

    private void k() {
        a.f.a("Sau khi kho\u00e1 kh\u00f4ng th\u1ec3 s\u1eeda \u0111\u1ed5i!");
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l() {
        Object object = ay.m;
        int n2 = 7 - ay.x.size();
        int n3 = ((Vector)object).size();
        if (n3 > 0) {
            int n4;
            Vector vector = new Vector(n3);
            for (n4 = 0; n4 < ((Vector)object).size(); ++n4) {
                vector.addElement(((Vector)object).elementAt(n4));
            }
            if (n3 <= n2) {
                n2 = n3;
            }
            int n5 = 0;
            n4 = 0;
            while (n4 < n2 && n5 < n3) {
                int n6 = al.a(n3);
                object = (e)vector.elementAt(n6);
                int n7 = ((e)object).a();
                if (object != null && w.a(n7) == null && !w.a((e)object)) {
                    if (((m)object).a(26) == 1 && Math.abs(((e)object).b() - w.a()) <= 5) {
                        z.a().a(1023, (af)new ba(41), new an(n7));
                    } else {
                        this.a(new an(n7));
                    }
                    ++n4;
                } else {
                    ++n5;
                }
                vector.removeElementAt(n6);
                --n3;
            }
        }
    }

    private void m() {
        if (bl.c) {
            bl.c = false;
            ay.a.f = (Vector)-1;
        }
        this.n();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void m(av av2) {
        if (av2 != null) {
            String string = bb.a == 1 ? s.d[352] : (bb.a == 2 ? s.d[351] : s.c[4]);
            av2.a(2005, new StringBuffer().append(av2.b(0).toString()).append(string).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void n() {
        ay.b = null;
        int n2 = ay.x.size() - 1;
        while (true) {
            if (n2 < 0) {
                s.a = false;
                return;
            }
            Object object = (af[])ay.x.elementAt(n2);
            ay.x.removeElementAt(n2);
            if (object[0].b() != ay.a.a() && (object = ay.a(object[0].b())) != null) {
                ((m)object).h();
            }
            --n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void A(av av2) {
        switch (this.a.a(10)) {
            case 0: {
                z.a().a(1521, (af)new ba(1), new an(av.a((av)av2, (int)56003, (int)1000).d));
                ac.a(true, false);
            }
            default: {
                return;
            }
            case 1: 
        }
        this.a(null, av2.b(0).b(), new an(av.a((av)av2, (int)56003, (int)1000).d), av2.a(1003), null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void B(av av2) {
        int n2;
        block4: {
            block3: {
                if (av2.f() != 56003) break block3;
                n2 = av2.b(0).b();
                if (n2 != 2803 && n2 != 2815) break block4;
                bb bb2 = this.a;
                bb.a(new String[]{"H\u1ecdc", s.a[2]}, av2);
            }
            return;
        }
        this.a(null, n2, new an(av.a((av)av2, (int)56003, (int)1000).d), av2.a(1003), null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void C(av g2) {
        int n2 = -1;
        int n3 = ((av)g2).f();
        Object object = av.a((av)g2, n3, 1000);
        if (object == null) {
            return;
        }
        int n4 = ((av)g2).b(0).b();
        int n5 = ((av)g2).b(2).b();
        if (n3 == 57040) {
            if (n5 != 0) return;
            z.a().a(1521, (af)new ba(16), (af)new an(av.a((av)g2, (int)57005, (int)0).d), new t((byte)(((h)object).f() + 5)));
            return;
        }
        if (n3 == 57004) {
            if (n4 == 100) {
                if (((g)object).d == -1) {
                    bn.a("H\u00e3y nh\u1eadp gi\u1edbi h\u1ea1n v\u1eadt ph\u1ea9m c\u00f3 th\u1ec3 l\u1ea5y 1 ng\u00e0y:", 4, 2, av.a((av)g2, n3, 1002).a(), (bi)((Object)g2));
                    return;
                }
                object = this.a;
                bb.a(new String[]{"Cho ph\u00e9p", "Kh\u00f4ng cho ph\u00e9p"}, (av)g2);
                return;
            }
            if (n4 == 101) return;
            if (n4 != 2846 && n5 != 3 && n5 != 1) {
                z.a().a(1032, (af)new t(16), new an(((g)object).d));
                return;
            }
            if (n4 == 2871) {
                a.f.a("V\u1ecb tr\u00ed n\u00e0y ch\u1ec9 \u0111\u1ec3 \u0111\u01b0\u1ee3c th\u00fa b\u1ea3o v\u1ec7 bang!");
                return;
            }
            if (((g)object).d != -1) {
                object = this.a;
                bb.a(new String[]{s.a[2], s.a[141]}, (av)g2);
                return;
            }
            n3 = n4 == 2846 ? 2048 : (n4 == 2878 ? 2048 : 2);
            if (n4 == 2883) {
                n2 = 1;
            }
            this.a.a(n3, (av)g2, 0, new String[]{s.b[9], s.a[2]}, n2);
            return;
        }
        if (n3 == 57006) {
            if (n5 == 3) {
                if (av.a((av)g2, (int)57004, (int)1000).d == -1) {
                    this.b((av)g2, 57004, 2878);
                    return;
                }
                if (((g)object).d == -1) {
                    this.a.a(8192, (av)g2, 0, new String[]{s.b[9], s.a[2]}, -1);
                    return;
                }
                object = this.a;
                bb.a(new String[]{s.a[2], s.a[141]}, (av)g2);
                return;
            }
            if (n5 == 1) {
                if (((g)object).d == -1) {
                    this.b((av)g2, 57004, n4);
                    return;
                }
                if (n4 == 2877) {
                    bn.a("Cho th\u00eam nguy\u00ean li\u1ec7u c\u00f3 th\u1ec3 t\u0103ng hi\u1ec7u qu\u1ea3 c\u1ea3i t\u1ea1o, h\u00e3y nh\u1eadp s\u1ed1 l\u01b0\u1ee3ng nguy\u00ean li\u1ec7u:", 8, 2, new StringBuffer().append(((g)object).b).append("").toString(), (bi)((Object)g2));
                    return;
                }
            }
            z.a().a(1032, (af)new t(16), new an(((g)object).d));
            return;
        }
        if (n3 == 57008) {
            if (av.a((av)g2, (int)57004, (int)1000).d == -1) {
                this.b((av)g2, 57004, n4);
                return;
            }
            if (n4 == 2846) {
                z.a().a(1032, (af)new t(8), (af)new an(((g)object).e), new t(0));
                return;
            }
            if (n4 == 2847) {
                if (av.a((av)g2, (int)57010, (int)1000).d == -1) {
                    this.b((av)g2, 57010, n4);
                    return;
                }
                z.a().a(1032, (af)new t(14), (af)new an(av.a((av)g2, (int)57004, (int)1000).e), new an(av.a((av)g2, (int)57010, (int)1000).e));
                return;
            }
            if (n4 != 2825 && n4 != 2826 && n4 != 2852 && n4 != 2870 && n4 != 2872) {
                z.a().a(1032, (af)new t(16), new an(((g)object).d));
                return;
            }
            z.a().a(1032, (af)new t(11), (af)new an(av.a((av)g2, (int)57004, (int)1000).e), new an(((g)object).d));
            return;
        }
        if (n3 == 57010) {
            if (n4 != 2847) {
                if (n4 != 2883) return;
            }
            if (av.a((av)g2, (int)57004, (int)1000).d == -1) {
                this.b((av)g2, 57004, n4);
                return;
            }
            if (((g)object).d != -1) {
                object = this.a;
                bb.a(new String[]{s.a[2], s.a[141]}, (av)g2);
                return;
            }
            if (n4 == 2883) {
                n2 = 1;
            }
            this.a.a(2, (av)g2, 0, new String[]{s.b[9], s.a[2]}, n2);
            return;
        }
        if (n3 == 57021 || n3 == 57022) {
            if (n4 != 2827 && n4 != 2877 && n4 != 2846) {
                if (n4 != 2881) return;
            }
            g g3 = av.a((av)g2, 57004, 1000);
            if (g3.d == -1) {
                this.b((av)g2, 57004, n4);
                return;
            }
            object = n4 == 2846 ? new an(0) : new t(0);
            this.b((av)g2, n4, new an(g3.e), (af)object, new ba(0));
            return;
        }
        if (n3 == 57020) {
            if (n4 == 100) {
                a.f.a(new StringBuffer().append("X\u00e1c nh\u1eadn \u0111\u1ed5i*3").append(av.a((av)g2, 57003, 0).a()).append("*0quy\u1ec1n h\u1ea1n kh\u00f4ng?").toString(), "", (int)(((av)g2).a + true), -1, false, (bi)((Object)g2), null);
                return;
            }
            if (n5 == 3 || n5 == 1 || n4 == 2846) {
                if (av.a((av)g2, (int)57004, (int)1000).d == -1) {
                    this.b((av)g2, 57004, n4);
                    return;
                }
                if (n5 == 3 && av.a((av)g2, (int)57006, (int)1000).d == -1) {
                    this.b((av)g2, 57006, 2878);
                    return;
                }
                if (n4 == 2847 && av.a((av)g2, (int)57010, (int)1000).d == -1) {
                    this.b((av)g2, 57010, n4);
                    return;
                }
                object = ((av)g2).a(57001).a();
                if (!((String)object).equals("")) {
                    a.f.a((String)object);
                    return;
                }
                if (n4 == 2846) {
                    z.a().a(1506, (af)new ba(10), (af)new an(av.a((av)g2, (int)57004, (int)1000).e), new an(av.a((av)g2, (int)57005, (int)0).d));
                    return;
                }
                if (n5 == 3) {
                    z.a().a(1506, new ba(4), new t(0), new an(av.a((av)g2, (int)57004, (int)1000).e), new an(av.a((av)g2, (int)57006, (int)1000).e));
                    return;
                }
                if (n4 == 2847) {
                    z.a().a(1009, (af)new ba(116), (af)new an(av.a((av)g2, (int)57004, (int)1000).e), new an(av.a((av)g2, (int)57010, (int)1000).e));
                    return;
                }
                if (n4 == 2827) {
                    object = av.a((av)g2, 57006, 1000);
                    z.a().a(1009, new ba(76), new an(av.a((av)g2, (int)57004, (int)1000).e), new an(((g)object).d), new t((byte)((g)object).e), new an(((g)object).b));
                    return;
                }
                if (n4 == 2877) {
                    this.a((av)g2, (short)4, null, 0);
                    return;
                }
                if (n4 == 2883) {
                    z.a().a(1534, (af)new ba(15), (af)new an(av.a((av)g2, (int)57004, (int)1000).e), new an(av.a((av)g2, (int)57010, (int)1000).e));
                    return;
                }
                if (n4 == 2881) {
                    z.a().a(1534, (af)new ba(22), (af)new an(av.a((av)g2, (int)57004, (int)1000).e), new an(av.a((av)g2, (int)57005, (int)1000).d));
                    return;
                }
                int n6 = n4 == 2852 ? 118 : (n4 == 2870 ? 125 : (n4 == 2872 ? 127 : (n4 == 2826 ? 9 : (n4 == 2882 ? 12 : (n4 == 2883 ? 15 : (n4 == 2823 ? 75 : (n4 == 2824 ? 77 : 7)))))));
                z.a().a(1534, (af)new ba((short)n6), new an(av.a((av)g2, (int)57004, (int)1000).e));
                return;
            }
            String string = ((av)g2).a(57001).a();
            object = string;
            if (string.equals("")) {
                object = s.d[73];
                ((av)g2).b(1).a(1);
                if (n4 == 2812) {
                    z.a().a(1521, (af)new ba(17), new an(av.a((av)g2, (int)57003, (int)0).d));
                } else {
                    g2 = av.a((av)g2, 57005, 0);
                    z.a().a(1521, (af)new ba(3), (af)new an(g2.d), new t((byte)g2.e));
                }
            }
            a.f.a((String)object);
            return;
        }
        if (n3 != 57024) return;
        if (n4 != 2804) return;
        object = ((av)g2).a(57001).a();
        if (((String)object).equals("")) {
            g2 = av.a((av)g2, 57005, 0);
            z.a().a(1521, (af)new ba(22), (af)new an(g2.d), new t((byte)g2.e));
            ac.a(true, false);
            return;
        }
        a.f.a((String)object);
    }

    /*
     * Unable to fully structure code
     */
    public void D(av var1_1) {
        block16: {
            block7: {
                block15: {
                    block13: {
                        block14: {
                            block11: {
                                block12: {
                                    block10: {
                                        block9: {
                                            block8: {
                                                var3_2 = var1_1.b(0).b();
                                                var4_3 = var1_1.f();
                                                if (var4_3 == 57021 && var3_2 == 2827) {
                                                    var5_4 = (af[])au.a.elementAt(this.a.a(10));
                                                    this.b(var1_1, var3_2, new an(av.a((av)var1_1, (int)57004, (int)1000).e), var5_4[1], var5_4[2]);
                                                    au.a = null;
lbl7:
                                                    // 9 sources

                                                    return;
                                                }
                                                if (var4_3 != 57022 || var3_2 != 2877) break block8;
                                                this.a(var1_1, (short)2, ((af[])au.a.elementAt(this.a.a(10)))[0], 0);
                                                au.a = null;
                                                ** GOTO lbl7
                                            }
                                            if (var4_3 != 57022 || var3_2 != 2846) break block9;
                                            var5_5 = (af[])au.a.elementAt(this.a.a(10));
                                            this.b(var1_1, var3_2, new an(av.a((av)var1_1, (int)57004, (int)1000).e), var5_5[0], null);
                                            au.a = null;
                                            ** GOTO lbl7
                                        }
                                        if (var4_3 != 57022 || var3_2 != 2881) break block10;
                                        var5_6 = (af[])au.a.elementAt(this.a.a(10));
                                        this.b(var1_1, var3_2, new an(av.a((av)var1_1, (int)57004, (int)1000).e), var5_6[0], null);
                                        au.a = null;
                                        ** GOTO lbl7
                                    }
                                    var5_7 = this.a.a(10);
                                    if (!var5_7.equals("Cho ph\u00e9p") && !var5_7.equals("Kh\u00f4ng cho ph\u00e9p")) break block11;
                                    if (!var5_7.equals("Cho ph\u00e9p")) break block12;
                                    var2_8 = 1;
lbl30:
                                    // 2 sources

                                    while (true) {
                                        av.a((av)var1_1, (int)var4_3, (int)1000).d = var2_8;
                                        ((ar)av.a(var1_1, var4_3, 1002)).a(var5_7);
                                        ** GOTO lbl7
                                        break;
                                    }
                                }
                                var2_8 = 0;
                                ** while (true)
                            }
                            if (!var5_7.equals(s.a[2])) break block13;
                            if (var3_2 != 2878 && var3_2 != 2846) break block14;
                            this.a(null, 0, 0, av.a((av)var1_1, (int)var4_3, (int)1000).e);
                            ** GOTO lbl7
                        }
                        z.a().a(1032, (af)new t(1), (af)new an(av.a((av)var1_1, (int)var4_3, (int)1000).e), new an(0));
                        ** GOTO lbl7
                    }
                    if (!var5_7.equals(s.a[141])) ** GOTO lbl7
                    if (var3_2 != 2878) break block15;
                    if (var4_3 == 57006) {
                        var2_9 = 2048;
lbl51:
                        // 3 sources

                        while (true) {
                            if (var3_2 == 2883) {
                                var3_2 = 1;
lbl54:
                                // 2 sources

                                while (true) {
                                    this.a.a(var2_9, var1_1, 0, new String[]{s.b[9], s.a[2]}, var3_2);
                                    ** continue;
                                    break;
                                }
                            }
                            break block7;
                            break;
                        }
                    }
                    break block16;
                }
                if (var3_2 != 2846) break block16;
                var2_9 = 2048;
                ** GOTO lbl51
            }
            var3_2 = -1;
            ** while (true)
        }
        var2_9 = 2;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void E(av av2) {
        Object object = this.a.a(true);
        int n2 = av2.b(0).b();
        if (n2 == 2846) {
            this.b(av2, n2, new an(((ax)object).a()), new an(0), null);
            return;
        }
        if (n2 == 2878) {
            an an2 = new an(0);
            an an3 = new an(0);
            if (av2.f() == 57004) {
                an2.a = ((ax)object).a();
            } else {
                an2.a = av.a((av)av2, (int)57004, (int)1000).e;
                an3.a = ((ax)object).a();
            }
            this.b(av2, n2, an2, an3, null);
            return;
        }
        if (n2 == 2883) {
            an an4 = new an(0);
            an an5 = new an(0);
            if (av2.f() == 57004) {
                an4.a = ((bc)object).a;
            } else {
                an4.a = av.a((av)av2, (int)57004, (int)1000).e;
                an5.a = ((bc)object).a;
            }
            this.b(av2, n2, an4, an5, null);
            return;
        }
        if (n2 == 2847 && av2.f() == 57010) {
            ac.a(true, false);
            z.a().a(1009, (af)new ba(114), (af)new an(av.a((av)av2, (int)57004, (int)1000).e), new an(((bc)object).a));
            return;
        }
        this.b(av2, n2, new an(((bc)object).a), new t(0), new ba(0));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void F(av av2) {
        if (av2.b(0).b() == 1) {
            switch (((h)av2.a(88011)).f()) {
                case 0: {
                    this.R(av2);
                    av2.a(new StringBuffer().append("Tr\u00f2 ch\u01a1i").append(s.b[198]).toString());
                    av2.l();
                    av2.c(88012);
                    av2.c(88021, false);
                    av2.c(88022, false);
                    av2.v = av2.a((int)88022).b + av2.a((int)88022).h - 10;
                    break;
                }
                case 1: {
                    av2.a(s.b[28]);
                    av2.c(88012);
                    av2.c(88021);
                    av2.c(88022);
                    av2.c(88031, false);
                    av2.c(88032, true);
                    av2.c(88033, false);
                    av2.a((int)88011).e = 88032;
                    av2.f(88031);
                    av2.v = av2.a((int)88033).b + av2.a((int)88033).h - 10;
                    break;
                }
                case 2: {
                    this.R(av2);
                    av2.c(88021);
                    av2.c(88022);
                    av2.a(88013, 2402, 3, av2.b(1).b(), null);
                    av2.f(88012);
                    av2.b(0);
                    av2.v = av2.a((int)88013).b + av2.a((int)88013).h - 10;
                    break;
                }
            }
        }
        av2.c(88013);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void G(av av2) {
        g g2 = av.a(av2, av2.f(), 1000);
        if (g2 == null) {
            return;
        }
        if (av2.f() == 88013) {
            if (av2.b(0).b() == 4) {
                bb.a(new String[]{s.a[12], s.a[22]}, av2);
                return;
            }
            if (g2.e != -1) {
                this.a.a((av)null, 4, g2.d);
                return;
            }
            z.a().a(1170, (af)new ba(3), new an(g2.d));
            return;
        }
        if (av2.f() == 88032) {
            z.a().a(1314, new ba(5));
            ac.a(true, false);
            return;
        }
        if (av2.f() != 88033) return;
        ac.a(true, false);
        z.a().a(1032, (af)new t(19), new an(g2.d));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void H(av g2) {
        String string = this.a.a(10);
        ar ar2 = (ar)av.a((av)g2, ((av)g2).f(), 1000);
        if (ar2 == null) {
            return;
        }
        if (string.equals(s.a[12])) {
            this.a.a(ar2.b, "");
            return;
        }
        if (!string.equals(s.a[22])) return;
        this.a(new an(ar2.d));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void I(av afArray) {
        if (afArray == null) return;
        if (afArray.a(89005) == null) {
            return;
        }
        if (afArray.f() != 89005) return;
        int n2 = ((h)afArray.a(89005)).f();
        if (n2 >= this.e.size()) return;
        afArray = (af[])this.e.elementAt(n2);
        ay.a.a(afArray[0].b(), afArray[1].b(), afArray[2].b(), 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void J(av object) {
        if (((av)object).b(0) == null) {
            return;
        }
        this.K((av)object);
        if (this.a((av)object)) return;
        int n2 = ((av)object).b(6).b();
        if (((av)object).b(5).b() > 127) {
            if (n2 > 127) return;
        }
        if (n2 != 127) return;
        long l2 = System.currentTimeMillis() - ((d)((av)object).b((int)4)).a;
        if (l2 <= (long)(n2 = ((av)object).b(3).b())) return;
        ((ar)((av)object).a(1002)).a((int)(l2 /= (long)n2), false);
        object = (d)((av)object).b(4);
        long l3 = ((d)object).a;
        ((d)object).a = (long)n2 * l2 + l3;
    }

    public void K(av g2) {
        String[] stringArray = (String[])((av)g2).a(7);
        if (stringArray != null && stringArray.length > 1) {
            g2 = (r)((av)g2).a(1001);
            ((r)g2).d();
            ((r)g2).b(stringArray[al.a(stringArray.length)]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void L(av object) {
        if (((av)object).b(0) == null) {
            return;
        }
        Object object2 = (af[])((av)object).a(1003);
        if (((av)object).b(0).b() != 0) {
            if (((g)object2).a()) {
                if (((n)object2).a().equals("")) return;
                z.a().a(1303, (af)new t(4), new an(((n)object2).f()));
            } else {
                z.a().a(1303, new t(6));
            }
        } else if (((av)object).a(2) != null) {
            object2 = (af[])((av)object).a(2);
            if (((av)object).a(1003).a()) {
                ((j)object2[((af[])object2).length - 1]).a(((av)object).a(1003).a());
            }
            z.a().a((af[])object2, 0);
            if (((af)object2[0]).b() == 1056 && ((af)object2[1]).b() == 32) {
                ay.a.b(true);
            }
        } else if (((av)object).a != null) {
            object2 = a.f.a(((av)object).b(5).b() / 1000);
            if (object2 == null) return;
            ((av)object).a.a(((av)object).b(5).b(), (g)object2);
        }
        switch (((av)object).b(5).b()) {
            case 125: 
            case 126: {
                return;
            }
            default: {
                a.f.a(1);
                return;
            }
            case 127: 
        }
        if (((av)object).f() != 1004) return;
        object2 = ad.a();
        object = ad.a().a() > 0 ? s.a[12] : null;
        ((ad)object2).a((String)object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void M(av av2) {
        av av3;
        int n2 = av2.b(6).b();
        if (av2.b(5).b() <= 127 || n2 <= 127) {
            switch (n2) {
                case 127: {
                    if (!av2.a(1005).a()) return;
                    if (ay.a != null) {
                        n2 = ay.a.m();
                        ay.a.a.setElementAt(new an(n2 & 0xFFFFFF7F), 33);
                        ay.a.e();
                    }
                    z.a().a(1009, new ba(130));
                }
            }
        }
        if (av2.b(0).b() != 0) {
            return;
        }
        if (av2.a != null && (av3 = a.f.a(av2.b(5).b() / 1000)) != null) {
            av2.a.a(av2.b(6).b(), av3);
        }
        a.f.a(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void N(av av2) {
        int n2 = av2.f();
        Object object = av.a(av2, n2, 1000);
        Object object2 = av.a(av2, n2, 1001);
        if (object == null) {
            return;
        }
        int n3 = av2.b(0).b();
        if (n2 % 1000 == 7 || n2 % 1000 == 8) {
            if (n3 / 10 == 1) return;
            object2 = (q)av2.a(n2);
            if (((q)object2).i() == 1 && n3 == 0 && n2 == 7008) {
                a.f.a("X\u00e1c nh\u1eadn mu\u1ed1n th\u0103ng c\u1ea5p kh\u00f4ng?", "", (int)(av2.a + 2), -1, false, av2, null);
                return;
            }
            if (((q)object2).i() == 2 && n2 == 7008) {
                this.a.f(null, 0);
                return;
            }
            z.a().a(1006, (af)new t(11), new an(((g)object).d));
            return;
        }
        if (n2 % 1000 == 9) {
            if (n3 / 10 == 1) return;
            z.a().a(1006, (af)new t(11), new an(((g)object).d));
            return;
        }
        if (n2 % 1000 == 10) {
            if (n3 / 10 == 1) {
                if (((g)object).d == 0) return;
                z.a().a(1032, (af)new t(1), (af)new an(((g)object).d), new an(0));
                return;
            }
            if (((g)object).d == 0) {
                this.a.a(2, av2, 0, new String[]{s.a[2], s.d[169]}, -1);
                return;
            }
            object = this.a;
            bb.a(new String[]{s.a[2], s.d[169], s.a[19]}, av2);
            return;
        }
        if (n2 % 1000 == 11) {
            if (n3 / 10 == 1) return;
            if (((q)av2.a(7011)).i() == 1 && n3 == 0) {
                this.a.a(null, 0, 1, 0);
                return;
            }
            z.a().a(1006, (af)new t(11), new an(((g)object).d));
            return;
        }
        if (n2 == 8034 || n2 == 8036 || n2 == 8038) {
            if (!av2.a(n2 + 1).a() && n2 % 2 == 0) {
                boolean bl2 = !av2.a(n2 + 1).a();
                n3 = 8034;
                while (true) {
                    if (n3 > 8038) {
                        this.a.a(av2, n2, bl2);
                        object = this.a;
                        ad.a(av2, true);
                        av2.f(8034);
                        return;
                    }
                    object = (ar)av.a(av2, n3, 0);
                    if (object != null && bl2) {
                        ((ar)object).a("+");
                    }
                    av2.c(n3 + 1);
                    n3 += 2;
                }
            }
            if (n3 != 0) {
                z.a().a(1032, (af)new t(8), (af)new an(((g)object).d), new t(0));
                return;
            }
            if (((g)object2).d != 0) {
                object = this.a;
                bb.a(new String[]{s.a[26]}, av2);
                return;
            }
            object = this.a;
            bb.a(new String[]{s.a[27], s.a[2]}, av2);
            return;
        }
        if (n2 == 8035 || n2 == 8037 || n2 == 8039) {
            if (n3 != 0) {
                z.a().a(1032, (af)new t(8), (af)new an(((g)object).d), new t(0));
                return;
            }
            if (((g)object).d == 0) {
                object = this.a;
                bb.a(new String[]{s.a[26]}, av2);
                return;
            }
            object = this.a;
            bb.a(new String[]{s.a[27], s.a[2]}, av2);
            return;
        }
        if (n2 == 7040) {
            byte by = ((ar)av2.a(7046)).a() ? (byte)0 : 1;
            z.a().a(1006, (af)new t(16), new t(by));
            ac.a(true, false);
            return;
        }
        if (n2 == 7041) {
            object2 = new int[5];
            object2[0] = false;
            object2[1] = false;
            object2[2] = false;
            object2[3] = false;
            object2[4] = false;
        } else {
            if (n2 == 7045) {
                a.f.a("Ph\u01b0\u01a1ng th\u1ee9c ti\u00eau hao \u0111\u1ec3 tu luy\u1ec7n s\u1ebd chuy\u1ec3n \u201cBi\u1ebfn h\u00f3a thu\u1ed9c t\u00ednh\u201d \u0111\u00e3 s\u1ea3n sinh v\u1ec1 kh\u00f4ng. X\u00e1c nh\u1eadn\uff1f", "", (int)(av2.a + 4), -1, false, av2, null);
                return;
            }
            if (n2 == 7046) {
                a.f.a("Ph\u01b0\u01a1ng th\u1ee9c ti\u00eau hao \u0111\u1ec3 tu luy\u1ec7n s\u1ebd chuy\u1ec3n \u201cBi\u1ebfn h\u00f3a thu\u1ed9c t\u00ednh\u201d \u0111\u00e3 s\u1ea3n sinh v\u1ec1 kh\u00f4ng. X\u00e1c nh\u1eadn\uff1f", "", (int)(av2.a + 5), -1, false, av2, null);
                return;
            }
            if (n2 != 7003) {
                if (n2 != 8003) return;
            }
            this.a.b(av2, 0);
            return;
        }
        for (n3 = 0; n3 < 5; ++n3) {
            String[] stringArray = al.a(((ar)av.a(av2, 7029, n3 * 4 + 3)).a(), "@");
            object = stringArray[0].length() > 0 ? stringArray[0].substring(0, 1) : stringArray[0];
            if (((String)object).equals("+")) {
                object2[n3] = Integer.parseInt(stringArray[0].substring(1, stringArray[0].length()));
                continue;
            }
            if (!((String)object).equals("-")) continue;
            object2[n3] = -Integer.parseInt(stringArray[0].substring(1, stringArray[0].length()));
        }
        byte by = ((ar)av2.a(7046)).a() ? (byte)0 : 1;
        if (object2[0] == false && object2[1] == false && object2[2] == false && object2[3] == false) {
            if (object2[4] == false) return;
        }
        z.a().a(1006, new t(17), new t(by), new an((int)object2[0]), new an((int)object2[1]), new an((int)object2[2]), new an((int)object2[3]), new an((int)object2[4]));
        ac.a(true, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void O(av av2) {
        String string = this.a.a(10);
        g g2 = av.a(av2, av2.f(), 1000);
        g g3 = av.a(av2, av2.f(), 1001);
        if (string.equals(s.a[2])) {
            if (av2.f() % 1000 == 10) {
                z.a().a(1032, (af)new t(1), (af)new an(g2.d), new an(0));
            } else {
                z.a().a(1032, (af)new t(8), (af)new an(g2.d), new t(0));
            }
            ac.a(true, false);
            return;
        }
        if (string.equals(s.a[19])) {
            if (av2.a / 1000 == 7) {
                z.a().a(1009, new ba(6), new an(g2.d), new t((byte)g2.b), new ba(0), new an(1));
                return;
            }
            z.a().a(1009, new ba(98), new an(g2.d), av2.b(1), new t((byte)g2.b), new ba(0), new an(1));
            return;
        }
        if (string.equals(s.d[169])) {
            this.a.a(2, av2, 0, new String[]{s.a[2], s.d[169]}, -1);
            return;
        }
        if (!string.equals(s.a[26]) && !string.equals(s.a[27])) {
            if (!string.equals(s.a[95])) return;
            this.a.h(null, 1);
            return;
        }
        if (av2.f() % 2 == 0) {
            z.a().a(1032, new t(9), new an(0), new an(g3.d), new an(0), new an(0), av2.b(1));
            return;
        }
        z.a().a(1032, new t(9), new an(av.a((av)av2, (int)(av2.f() - 1), (int)1001).d), new an(g3.d), new an(0), new an(0), av2.b(1));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void P(av av2) {
        bc bc2 = this.a.a(true);
        if (av2.a / 1000 == 8) {
            z.a().a(1009, new ba(97), new an(bc2.a), av2.b(1), new t((byte)av.a((av)av2, (int)8010, (int)1000).b), new ba(0), new an(1));
            return;
        }
        z.a().a(1009, new ba(5), new an(bc2.a), new t((byte)av.a((av)av2, (int)7010, (int)1000).b), new ba(0), new an(1));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void Q(av g2) {
        Object object;
        if (((av)g2).f() == 7012 && (object = (ar)av.a((av)g2, 7012, 1001)) != null) {
            String string = new StringBuffer().append(s.d[6]).append(((ar)object).a()).toString();
            object = new StringBuffer().append(s.d[467]).append(((ar)object).b).toString();
            g2 = (q)((av)g2).a(7012);
            this.a.a(7012, ((q)g2).b(((q)g2).e(), true), ((q)g2).a(((q)g2).e(), true), new String[]{string, object});
            this.a.a(7012);
            return;
        }
        this.a.a(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte a() {
        String string = a.b.a(s.f, 1);
        if (string == null) {
            a.f.a("", "L\u1ea7n \u0111\u1ea7u v\u00e0o tr\u00f2 ch\u01a1i h\u1ec7 th\u1ed1ng t\u1ef1 \u0111\u1ed9ng thi\u1ebft l\u1eadp m\u1ea1ng, xin \u0111\u1ee3i!", 96, 5000L);
            new ae().a(true);
            i.a = false;
            ac.a(false, true);
            return (byte)-1;
        }
        bb.a = (byte)Integer.parseInt(string);
        return (byte)bb.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(String object, String stringArray, int n2, long l2, av av2) {
        av2.f = (short)n2;
        r r2 = null;
        if ((av2.f & 0x40) != 0) {
            object = (r)av2.a(50001);
            ((r)object).d();
            ((r)object).b((String)stringArray);
            n2 = ((r)object).f() + 10;
            ((g)object).a(0, n2);
            ((r)object).a();
        } else if ((av2.f & 0x80) != 0) {
            r2 = (r)av2.a(50002);
            r2.d();
            r2.a((String)object);
            n2 = r2.f() + 10;
            r2.a(0, n2);
            object = (r)av2.a(50003);
            ((r)object).d();
            ((r)object).b((String)stringArray);
            n2 += ((r)object).f() + 10;
            ((g)object).a(0, ((r)object).f() + 10);
        } else if ((av2.f & 0x100) != 0) {
            object = (q)av2.a(50004);
            stringArray = al.a((String)stringArray, "_@");
            ((q)object).b(stringArray.length, false);
            for (n2 = stringArray.length - 1; n2 >= 0; --n2) {
                ((q)object).a(stringArray[n2].substring(1, stringArray[n2].length()), s.a[Integer.parseInt(stringArray[0].substring(0, 1))], n2);
            }
            n2 = ((q)object).h + 10 + 0;
            object = r2;
        } else {
            n2 = 0;
            object = r2;
        }
        if (object != null) {
            ((r)object).c = (byte)-1;
        }
        if ((av2.f & 0x10) != 0) {
            this.a[0] = System.currentTimeMillis();
            this.a[1] = l2;
        }
        this.u(av2);
        av2.h = n2;
        return n2;
    }

    public int a(af[] afArray) {
        return afArray[0].b();
    }

    public am a(int n2) {
        am am2 = new am();
        am2.a(n2);
        am2.b(0);
        am2.a(a[0]);
        am2.a(a[1]);
        am2.a(a[2]);
        am2.a("");
        am2.d(w.a(0));
        am2.d(this.c());
        am2.d(9);
        return am2;
    }

    public av a(av av2) {
        if (av2 == null) {
            av2 = a.f.b(15);
        }
        av2.a(15008, 1023, 50, ((q)av2.a(15008)).f(), new af[]{new an(1), new an(120)});
        av2.b(0);
        q q2 = (q)av2.a(15007);
        av2.b(15002, "1");
        av2.b(15004, "120");
        if (q2.a(0) == null) {
            q2.a(new ar(new StringBuffer().append(s.b[59]).append(s.b[154]).toString(), s.a[6], 0), 0);
            q2.a(new ar(s.d[118], s.a[6], 0), 1);
            q2.a(new ar(s.a[122], s.a[6], 0), 2);
        }
        return av2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public av a(av av2, int n2) {
        int n3;
        if (av2 == null) {
            av2 = a.f.b(12);
        }
        av2.a(0, new an(n2));
        Object object = this.a;
        ad.a(av2, n2, 0, 0, 12003);
        if (n2 == 3 || n2 == 4) {
            av2.c(12002);
            av2.c(12003);
            av2.f(12003);
        } else if (n2 == 0 || n2 == 6) {
            object = (q)av2.a(12004);
            ((q)object).a(new ar("T\u00ean", s.a[3], 0), 0);
            ((q)object).a(new ar(s.b[93], s.a[3], 0), 1);
            ((q)object).a(new ar(s.b[94], s.a[3], 0), 2);
        }
        int n4 = 1019;
        int n5 = 15;
        if (n2 == 4) {
            n3 = 1525;
            n5 = 0;
        } else {
            n3 = n4;
            if (n2 == 3) {
                n5 = 39;
                n3 = n4;
            }
        }
        av2.a(12001, n3, n5, ((q)av2.a(12001)).f(), null);
        av2.b(0);
        return av2;
    }

    public av a(av av2, int n2, int n3) {
        if (av2 == null) {
            av2 = a.f.b(56);
        }
        av2.b(0).a(n2);
        av2.a(56003, 1521, this.b(n2), av2.b(1).b(), new af[]{new an(n3)});
        av2.b(0);
        return av2;
    }

    public av a(av av2, int n2, int n3, int n4) {
        av av3 = av2;
        if (av2 == null) {
            av3 = a.f.b(8);
        }
        ac.a(true, false);
        z.a().a(1127, (af)new t(29), new an(n4));
        av3.b(0).a(n2);
        av3.b(1).a(n4);
        ((h)av3.a(8003)).a(n3);
        this.a(av3, true);
        return av3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public av a(av g2, int n2, int n3, af af2) {
        g g3 = g2;
        if (g2 == null) {
            g3 = a.f.b(7);
            ac.a(true, false);
            if (n2 == 0) {
                z.a().a(1006, new t(6));
            } else if (af2.a() == 6) {
                z.a().a(1303, (af)new t(1), (af)new an(0), af2);
            } else {
                z.a().a(1303, (af)new t(1), af2);
            }
        }
        if (n2 == 0) {
            ((ar)((av)g3).a(7028)).a(ay.a.c(), 0, 1, 0);
        }
        ((av)g3).b(0).a(n2);
        if (af2.a() == 6) {
            ((av)g3).b(1).a(0);
        } else {
            ((av)g3).a(1, af2);
        }
        g2 = (h)((av)g3).a(7003);
        if (n2 != 0) {
            ((h)g2).a(new String[]{"C\u01a1 b\u1ea3n", "Cao c\u1ea5p", "Trang b\u1ecb", "X\u00e3 h\u1ed9i", "Tr\u1ea1ng th\u00e1i"});
        }
        ((h)g2).a(n3);
        this.a((av)g3, true);
        return g3;
    }

    public av a(av g2, boolean bl2, String string, String string2, af[] afArray) {
        av av2 = g2;
        if (g2 == null) {
            av2 = a.f.b(9);
        }
        if (!string.equals("")) {
            av2.c(9009, true);
        }
        ((ar)av2.a((int)9009)).b = string2;
        av2.a(9009, string);
        av2.a(0, afArray);
        if (bl2) {
            g2 = (r)av2.a(9003);
            g2.a(0, ((r)g2).f());
            av2.f(9006);
        }
        ac.a(false, false);
        return av2;
    }

    public az a(az az2) {
        az2.d /= this.b;
        az2.e /= this.c;
        return az2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public q a(av g2) {
        int n2;
        Object object;
        void var1_3;
        int n3 = ((h)((av)g2).a(45004)).f();
        if (n3 == 0) {
            return var1_3;
        }
        q q2 = (q)((av)g2).a(45003);
        q2.d();
        if (ay.o.size() == 0) {
            ((av)g2).c(45003);
            return var1_3;
        }
        int n4 = ay.o.size();
        if (this.d == null) {
            this.d = new Vector();
        }
        this.d.removeAllElements();
        int n5 = 0;
        while (true) {
            block18: {
                block19: {
                    block17: {
                        if (n5 >= n4) break block17;
                        object = (af[])ay.o.elementAt(n5);
                        if (n3 != 0 && object[2].b() != n3) break block18;
                        break block19;
                    }
                    boolean bl2 = this.d.size() > 0;
                    if (!av.a((av)g2, 45003, 45003, bl2)) {
                        return var1_3;
                    }
                    break;
                }
                for (n2 = 0; n2 < 5; ++n2) {
                    if (n2 == 3 && object[5].b() != 0) {
                        this.d.addElement(new an(0));
                        continue;
                    }
                    this.d.addElement(object[(new byte[]{1, 3, 4, 0, 7})[n2]]);
                }
                if ((object = ay.a(object[0].b())) != null) {
                    this.d.addElement(new t(((bk)object).a));
                } else {
                    this.d.addElement(new t(0));
                }
            }
            ++n5;
        }
        int n6 = q2.h();
        n3 = this.d.size() / 6;
        q2.a(n3 * n6);
        int n7 = q2.d(0);
        n4 = q2.d(1);
        n2 = 0;
        while (true) {
            if (n2 >= n3) {
                q2.b(0);
                ((av)g2).v = (int)(q2.b + q2.h);
                q q3 = q2;
                return var1_3;
            }
            int n8 = n2 * 6;
            n5 = 0;
            switch (((t)this.d.elementAt(n8 + 5)).b()) {
                default: {
                    object = "";
                    break;
                }
                case 4: {
                    n5 = s.a[6];
                    object = "\uff1f";
                    break;
                }
                case 3: {
                    n5 = s.a[6];
                    object = "\uff01";
                    break;
                }
                case 2: {
                    n5 = s.a[4];
                    object = "\uff01";
                    break;
                }
                case 1: {
                    n5 = s.a[0];
                    object = "\uff1f";
                }
            }
            object = new ar((String)object, n5, 0);
            ((g)object).a(n7, 0);
            q2.a((g)object, n2 * n6);
            object = new ar(((j)this.d.elementAt(n8 + 0)).a(), s.a[4], 0);
            ((g)object).a(4, false);
            ((g)object).a(n4, 0);
            q2.a((g)object, n2 * n6 + 1);
            object = al.a(null, (long)((t)this.d.elementAt((int)(n8 + 1))).a);
            al.a((StringBuffer)object, ",");
            al.a((StringBuffer)object, (long)((t)this.d.elementAt((int)(n8 + 2))).a);
            q2.a(new ar(((StringBuffer)object).toString(), s.a[4], 0), n2 * n6 + 2);
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public Vector a() {
        Vector vector = ay.o;
        Vector<af[]> vector2 = new Vector<af[]>();
        af[] afArray = ay.a;
        az az2 = this.a(aa.a().a(afArray.q, (int)afArray.r));
        vector2.addElement(new af[]{new an(afArray.a()), new an(az2.d), new an(az2.e), new an(-2)});
        int n2 = 0;
        int n3 = 0;
        while (n2 < vector.size()) {
            afArray = (af[])vector.elementAt(n2);
            if (afArray[7].b() == 0) {
                az2 = this.a(aa.a().a(afArray[3].b(), afArray[4].b()));
                af[] afArray2 = new af[4];
                afArray2[0] = new an(afArray[0].b());
                afArray2[1] = new an(az2.d);
                afArray2[2] = new an(az2.e);
                if (afArray[0].b() == 0) {
                    afArray2[3] = new an(-1);
                    m.a(++n3, -1, afArray[3].b(), afArray[4].b());
                } else {
                    afArray2[3] = new an(afArray[6].b());
                }
                vector2.addElement(afArray2);
            }
            ++n2;
        }
        return vector2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Vector a(Vector vector, Vector vector2, boolean bl2) {
        aa aa2 = aa.a();
        int n2 = vector.size() - 1;
        while (n2 >= 0) {
            m m2 = (m)vector.elementAt(n2);
            if (!(bl2 && !bk.a(((bk)m2).r()) || this.g == 1 && !w.b(m2.c) || this.g >= 2 && this.g <= 4 && (m2.c() > 0 || bl2 && m2.a(false)))) {
                if (aa2.a(m2, 0, 0)) {
                    this.a(m2, vector2);
                }
                if (this.g != 1 && !bl2 && ((e)m2).a() != null && aa2.a(((e)m2).a(), 0, 0)) {
                    this.a(((e)m2).a(), vector2);
                }
            }
            --n2;
        }
        return vector2;
    }

    public void a() {
        am am2 = new am();
        am2.a(1077);
        am2.d(s.g);
        am2.a(this.a.a());
        am2.b(0);
        am2.a("");
        this.a.a(am2.a());
    }

    public void a(int n2) {
        av av2;
        if (ay.a(n2, ay.a) && (av2 = a.f.a(145)) != null) {
            this.a.o(av2);
            this.a.a(av2, 145005, 145003, 2, -1, -1);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, int n3) {
        block4: {
            block3: {
                block2: {
                    if (n2 != 2) break block2;
                    z.a().a(1127, (af)new t(29), new an(n3));
                    break block3;
                }
                if (n2 != 32) break block4;
                z.a().a(1032, (af)new t(1), (af)new an(n3), new an(0));
            }
            ac.a(true, false);
        }
    }

    public final void a(int n2, int n3, String string, av av2) {
        this.b.addElement(Integer.toString(n2));
        this.b.addElement(Integer.toString(n3));
        this.b.addElement(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, int n3, String[] stringArray, int n4, av av2) {
        int n5 = 1;
        bf bf2 = bc.b(n2);
        g g2 = (q)av2.a(9006);
        ar ar2 = new ar("", 0, 0);
        if (bf2 != null) {
            ar2.a(bf2);
            ar2.b(n3);
        }
        ((q)g2).a(ar2, 0);
        ar2 = new ar(stringArray[0], 0, 0);
        ar2.i = n3 >= 0 && n3 < 10 ? s.a[n3] : al.a(bc.a(n3), n4);
        ((q)g2).a(ar2, 1);
        g2 = (r)av2.a(9003);
        ((r)g2).d();
        n2 = n5;
        while (true) {
            if (n2 >= stringArray.length) {
                g2.a(0, ((r)g2).f());
                n2 = ((r)g2).b;
                av2.v = ((r)g2).h + n2;
                av2.f(9006);
                return;
            }
            ((r)g2).a(stringArray[n2]);
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, av av2) {
        int n3;
        int n4 = av2.b(0).b();
        g g2 = av.a(av2, 12001, 1000);
        int n5 = g2.d;
        String string = g2.a();
        String string2 = this.a.a(10);
        int n6 = ((h)av2.a(12003)).f();
        if (n6 == 0) {
            n3 = 15;
        } else if (n6 == 1) {
            n3 = 28;
        } else {
            n3 = n6;
            if (n6 == 2) {
                n3 = 32;
            }
        }
        if (av2.a + true == n2) {
            z.a().a(1019, (af)new ba(29), new an(n5));
            z.a().a(av2.a(0, n3, -1, 0, 0), 2);
        } else if (av2.a + 2 == n2) {
            z.a().a(1019, (af)new ba(14), new an(n5));
            z.a().a(av2.a(0, n3, -1, 0, 0), 2);
        } else if (string2.equals(s.b[68])) {
            this.a(new an(n5));
        } else if (string2.equals(s.a[2])) {
            if (n4 == 4) {
                this.a(null, 2892, new an(0), new t(0), new ba(0));
                z.a().a(1525, (af)new ba(1), new an(g2.d));
            } else {
                z.a().a(1303, (af)new t(1), new an(n5));
            }
        } else if (string2.equals(s.a[12])) {
            this.a.a(string, "");
        } else if (string2.equals(s.a[13])) {
            a.f.a(new StringBuffer().append(s.d[162]).append(string).append(s.d[163]).toString(), "", (int)(av2.a + 2), (int)(av2.a + 102), false, av2, null);
        } else if (string2.equals(s.a[41])) {
            if (n3 == 28) {
                z.a().a(1019, (af)new ba(18), new an(n5));
            } else {
                z.a().a(1019, (af)new ba(30), new an(n5));
            }
            z.a().a(av2.a(0, n3, -1, 0, 0), 2);
        } else if (string2.equals(s.a[71])) {
            z.a().a(1019, (af)new ba(25), new an(n5));
        } else if (string2.equals(s.a[22])) {
            this.a(new an(n5));
        } else if (string2.equals(s.b[19]) || string2.equals(s.b[100])) {
            z.a().a(1312, (af)new ba(13), new an(n5));
        } else if (string2.equals(s.a[114])) {
            z.a().a(1525, (af)new ba(2), (af)new an(g2.d), new an(0));
            av2.b(0);
        }
        av2.d(12001);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, String object) {
        n2 = this.c(n2) ? 0 : 1;
        object = a.f.a(43);
        if (object != null) {
            this.a.b((av)object, n2);
            object = this.a;
            bb.i();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(an an2) {
        if (w.b() == 0) {
            this.b(an2);
            return;
        }
        if (w.b()) {
            z.a().a(1023, (af)new ba(2), an2);
            return;
        }
        a.f.a(s.d[419]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av g2) {
        if (av.a((av)g2, 20004, 1000) == null) {
            return;
        }
        int n2 = ((av)g2).f();
        int n3 = ((av)g2).b(0).b();
        if (n2 == 20004) {
            Object object = av.a((av)g2, n2, 1000);
            if (((q)((av)g2).a(n2)).e() < 2) {
                if (n3 > 0) {
                    this.k();
                    return;
                }
                a.f.a(new StringBuffer().append("H\u00e0nh trang ng\u00e2n l\u01b0\u1ee3ng:").append(ay.a.g(15)).toString(), "H\u00e3y nh\u1eadp s\u1ed1 ti\u1ec1n giao d\u1ecbch", (int)(((av)g2).a + true), -1, true, (bi)((Object)g2), null);
                return;
            }
            if (((g)object).d == 2 || ((g)object).d == 32) {
                object = this.a;
                bb.a(new String[]{s.a[2], s.a[19]}, (av)g2);
                return;
            }
            if (n3 > 0) {
                this.k();
                return;
            }
            this.a.a(2058, (av)g2, 0, new String[]{s.b[9], s.a[2]}, -1);
            return;
        }
        if (n2 == 20005) {
            g2 = av.a((av)g2, n2, 1000);
            this.a(g2.d, g2.b);
            return;
        }
        if (n2 != 20017) {
            if (n2 == 20018) {
                if (n3 > 0) {
                    z.a().a(1056, (af)new ba(10), ((av)g2).b(1));
                    return;
                }
                a.f.a(s.d[47]);
                return;
            }
            if (n2 == 20019) {
                z.a().a(1056, (af)new ba(4), ((av)g2).b(1));
                a.f.a(20);
                return;
            }
            if (n2 == 20023) {
                bn.a(s.d[375], 80, 0, 20023, (bi)((Object)g2));
                return;
            }
            if (n2 == 20021) {
                this.a.a = 1;
                this.a.a();
                return;
            }
            if (n2 == 20022) {
                this.a.b((av)g2);
                return;
            }
            if (n2 == 20025) {
                this.a.a(20025, 20023, 20024, null, (av)g2);
                return;
            }
            if (n2 != 20024) return;
            if (((r)((av)g2).a(20024)).f() < 5) {
                ((av)g2).d(20023);
                return;
            }
            if (aw.e() == 0) {
                bb bb2 = this.a;
                bb.a(new String[]{s.a[21], s.a[2], s.a[22], s.a[23]}, (av)g2);
                return;
            }
            if (!this.a.a(aw.e())) return;
            return;
        }
        if (n3 != 0) return;
        q q2 = (q)((av)g2).a(20004);
        int n4 = q2.f() - 1;
        af[] afArray = new af[n4 * 3];
        n3 = 0;
        while (true) {
            if (n3 >= n4) {
                z.a().a(1056, (af)new ba(9), (af)new an(Integer.parseInt(q2.a(1).a())), afArray);
                ac.a(true, false);
                ((av)g2).b(0).a(1);
                return;
            }
            g g3 = q2.a((n3 + 1) * 2);
            n2 = g3.b == -1 ? 0 : g3.b;
            afArray[n3] = new an(n2);
            afArray[n3 + n4] = new t((byte)g3.d);
            afArray[n4 * 2 + n3] = new t((byte)g3.c);
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2, int n2) {
        av av3 = av2;
        if (av2 == null) {
            av3 = a.f.b(16);
        }
        if (n2 == 0) {
            av3.a("Th\u00e0nh l\u1eadp \u0111\u1ed9i ng\u0169");
        } else {
            av3.a("Thi\u1ebft l\u1eadp \u0111\u1ed9i ng\u0169");
        }
        av3.b(16004, new StringBuffer().append(ay.a.a()).append("\u0111\u1ed9i ng\u0169").toString());
        av3.b(16005, "1");
        av3.b(16007, "120");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2, int n2, int n3) {
        int n4 = 1103;
        if (av2 == null) {
            av2 = a.f.b(35);
        }
        av2.a(0, new an(n2));
        if (n2 == 0) {
            z.a().a(1103, (af)new ba(67), (af)new an(n3), new an(35002));
            return;
        }
        if (n2 != 1) {
            n4 = 1604;
        }
        int n5 = ((q)av2.a(35001)).f();
        af[] afArray = n2 == 2 ? null : new af[]{new an(ap.o)};
        av2.a(35001, n4, n3, n5, afArray);
        av2.b(0);
    }

    /*
     * Unable to fully structure code
     */
    public void a(av var1_1, int var2_2, af var3_3, af var4_4, af var5_5) {
        block17: {
            var6_6 = 0;
            if (var1_1 != null) break block17;
            var7_7 = a.f.b(57);
lbl4:
            // 2 sources

            while (true) {
                var7_7.b(0).a(var2_2);
                switch (var2_2) lbl-1000:
                // 3 sources

                {
                    default: {
                        var1_1 = var4_4;
lbl9:
                        // 11 sources

                        while (true) {
                            var7_7.b(2).a(var6_6);
                            var7_7.f(57040);
                            this.b(var7_7, var2_2, var3_3, (af)var1_1, var5_5);
                            return;
                        }
                    }
                    case 2846: {
                        var7_7.c(57022, false);
                        var1_1 = new an(0);
                        var6_6 = 4;
                        ** GOTO lbl9
                    }
                    case 2871: 
                    case 2878: {
                        var7_7.c(57005);
                        var7_7.c(57006);
                        var7_7.c(57007);
                        var7_7.c(57008);
                        var7_7.c(57031, false);
                        var1_1 = new an(0);
                        var6_6 = 3;
                        ** GOTO lbl9
                    }
                    case 100: 
                    case 101: {
                        var7_7.c(57005);
                        var7_7.c(57006);
                        var7_7.c(57007);
                        var7_7.c(57008);
                        if (var2_2 == 101) {
                            var7_7.c(57003);
                            var7_7.c(57020);
                        }
                        var6_6 = 2;
                        var1_1 = var4_4;
                        ** GOTO lbl9
                    }
                    case 2803: 
                    case 2815: 
                    case 2905: {
                        var7_7.c(57007);
                        var7_7.c(57008);
                        var7_7.c(57020);
                        if (var3_3.b() / 1000 >= 320001 && var3_3.b() / 1000 <= 329999) ** GOTO lbl-1000
                        var7_7.c(57041, false);
                        var7_7.c(57040, false);
                        var1_1 = var4_4;
                        ** GOTO lbl9
                    }
                    case 2804: {
                        var7_7.c(57024, false);
                    }
                    case 2805: 
                    case 2806: 
                    case 2812: 
                    case 2856: 
                    case 2857: 
                    case 2906: {
                        var7_7.c(57007);
                        var7_7.c(57008);
                        if (var3_3.b() / 1000 >= 320001 && var3_3.b() / 1000 <= 339999) ** GOTO lbl-1000
                        var7_7.c(57041, false);
                        var7_7.c(57040, false);
                        var1_1 = var4_4;
                        ** GOTO lbl9
                    }
                    case 2823: 
                    case 2824: 
                    case 2825: 
                    case 2826: 
                    case 2852: 
                    case 2870: 
                    case 2872: 
                    case 2881: 
                    case 2882: {
                        var6_6 = 1;
                        var1_1 = var4_4;
                        ** GOTO lbl9
                    }
                    case 2883: {
                        var7_7.c(57005);
                        var7_7.c(57006);
                        var7_7.c(57007);
                        var7_7.c(57008);
                        var7_7.c(57020);
                        var6_6 = 1;
                        var1_1 = var4_4;
                        ** GOTO lbl9
                    }
                    case 2827: {
                        var7_7.c(57008);
                        var7_7.c(57021, false);
                        var6_6 = 1;
                        var1_1 = var4_4;
                        ** GOTO lbl9
                    }
                    case 2847: {
                        var7_7.c(57009, false);
                        var7_7.c(57010, false);
                        var6_6 = 1;
                        var1_1 = var4_4;
                        ** GOTO lbl9
                    }
                    case 2877: 
                }
                var7_7.c(57007);
                var7_7.c(57008);
                var7_7.c(57022, false);
                var6_6 = 1;
                var1_1 = var4_4;
                ** continue;
                break;
            }
        }
        var7_7 = var1_1;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av g2, int n2, String object) {
        ar ar2 = (ar)((av)g2).a(n2);
        ar ar3 = (ar)((av)g2).a(10018);
        ar ar4 = (ar)((av)g2).a(10019);
        if (object != null) {
            if (n2 != Integer.parseInt(ar3.b) % 1000) return;
            this.a((av)g2, (String)object);
            return;
        }
        if (n2 >= 10001 && n2 <= 10010) {
            object = (j)((av)g2).b(n2 - 10001);
            if (((j)object).a().equals("")) {
                z.a().a(1602, (af)new t(1), new an(n2 - 10001 + 1));
            } else {
                this.a((av)g2, ((j)object).toString());
            }
            this.a(ar2, ar3);
            ar4.a(false);
        } else {
            this.a(ar2, ar4);
            ar4.a(true);
        }
        if (this.b[Integer.parseInt(ar3.b) % 1000 - 1][0] == 0) {
            ((av)g2).c(10040);
            this.a((ar)((av)g2).a(10016), ar4);
        } else {
            ((av)g2).b(10040);
        }
        if (this.b[Integer.parseInt(ar3.b) % 1000 - 1][1] == 0) {
            ((av)g2).c(10041);
            this.a((ar)((av)g2).a(10015), ar4);
        } else {
            ((av)g2).b(10041);
        }
        g2 = (ar)((av)g2).a(10017);
        n2 = Integer.parseInt(ar3.b) % 1000 - 1;
        int n3 = Integer.parseInt(ar4.b);
        if ((n3 = this.b[n2][n3 % 1000 - 15]) == 0) {
            object = bg.b(6080000, 1);
            ((ar)g2).a((bg)object);
            ((bg)object).a(8, true);
            return;
        }
        ((ar)g2).a(n3, 0, 2, 0);
        object = ((ar)g2).a();
        bg.a((bg)object, n2 + 1);
        ((ar)g2).a().a(this.b[0], 0);
        ((bg)object).a(Integer.parseInt(((bg)object).a(this.b[n2 % this.b.length] * 100)), 0);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(av var1_1, int var2_2, boolean var3_3) {
        if (!var3_3 && var2_2 != s.a[2] && var2_2 != s.a[3] || this.a.j == null) ** GOTO lbl26
        var5_4 = var1_1.f();
        var2_2 = 0;
        block7: while (true) {
            if (var2_2 >= 3) ** GOTO lbl26
            try {
                block17: {
                    block16: {
                        var13_14 = (af[])this.a.j.elementAt(var2_2);
                        var8_8 = var13_14[1].b();
                        var9_9 = var13_14[2].b();
                        var13_14[3].b();
                        var7_7 = var13_14[4].b();
                        var6_6 = (var7_7 - 10) / 10;
                        var14_15 = ((j)var13_14[5]).a();
                        var13_14[6].b();
                        var15_16 = (ar)var1_1.a(var2_2 + 11001);
                        if (var9_9 == 0) ** GOTO lbl53
                        if (var15_16.a() != null) break block16;
                        var4_5 = var13_14[29].b();
                        if (var4_5 == 0) break block17;
                        var11_11 = bb.a(var4_5, false, null);
                        bg.b((bg)var11_11, var9_9 / 100000, var7_7 / 10);
                        var15_16.a((bg)var11_11);
                        break block16;
lbl26:
                        // 2 sources

                        return;
                    }
lbl28:
                    // 2 sources

                    while ((var16_17 = var15_16.a()) != null) {
                        if (var5_4 % 1000 != var2_2 + 1) break block7;
                        var16_17.a(Integer.parseInt(var16_17.a(0)), 0);
lbl31:
                        // 3 sources

                        while (true) {
                            for (var4_5 = 0; var4_5 < 20; ++var4_5) {
                                var10_10 = var13_14[var4_5 + 8].b();
                                if (var10_10 == 0) continue;
                                m.a(var16_17, var4_5, var10_10);
                            }
                            ** GOTO lbl54
                            break;
                        }
                    }
                    ** GOTO lbl54
                }
                var15_16.a(var9_9, 0, 2, 0);
                ** GOTO lbl28
            }
            catch (Exception var11_12) lbl-1000:
            // 4 sources

            {
                while (true) {
                    ++var2_2;
                    continue block7;
                    break;
                }
            }
            break;
        }
        {
            var11_11 = var12_13 = var16_17.a(600);
            if (var12_13 == null) {
                var11_11 = var16_17.a(0);
            }
            if (var11_11 == null) ** GOTO lbl31
            var15_16.a().a(Integer.parseInt((String)var11_11), 0);
            ** continue;
lbl53:
            // 1 sources

            var15_16.a(bg.b(6080000, 1));
lbl54:
            // 3 sources

            var12_13 = (ar)var1_1.a(var2_2 + 11031);
            var11_11 = (ar)var1_1.a(var2_2 + 11041);
            var12_13.a((String)var14_15);
            if (var5_4 % 1000 != var2_2 + 1) ** GOTO lbl90
        }
        {
            block18: {
                var12_13.i = s.a[3];
                var12_13 = new bf(0x5F0FF0);
                var11_11.a((bf)var12_13);
                var12_13 = (ar)var1_1.a(11010);
                var11_11 = var7_7 < 10 ? null : new bf(this.a[var6_6 / 4]);
                var12_13.a((bf)var11_11);
                var14_15 = (ar)var1_1.a(11011);
                var12_13 = (ar)var1_1.a(11012);
                var11_11 = var7_7 < 10 ? null : new bf(this.a[var6_6][0]);
                var14_15.a((bf)var11_11);
                var11_11 = var7_7 < 10 ? null : new bf(this.a[var6_6][1]);
                var12_13.a((bf)var11_11);
                if (var8_8 == 0) {
                    var1_1.c(11099);
                } else {
                    var1_1.b(11099);
                    ((x)var1_1.a(11099)).a(var8_8);
                }
                var11_11 = (ar)var1_1.a(11004);
                if (var9_9 != 0) break block18;
                var11_11.a(bg.b(6080000, 1));
                ** GOTO lbl-1000
            }
            var11_11.a();
            var11_11 = var11_11.a(var9_9, 0, 2, 0);
            for (var4_5 = 0; var4_5 < 20; ++var4_5) {
                var7_7 = var13_14[var4_5 + 8].b();
                if (var7_7 == 0) continue;
                m.a((bg)var11_11, var4_5, var7_7);
            }
        }
        {
            var11_11.a(Integer.parseInt(var11_11.a(this.b[var6_6 % this.b.length] * 100)), 0);
            ** GOTO lbl-1000
lbl90:
            // 1 sources

            var12_13.i = s.a[0];
            var12_13 = new bf(6220000);
            var11_11.a((bf)var12_13);
            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2, short s2, af af2, int n2) {
        q q2 = (q)av2.a(57006);
        int n3 = af2 == null ? q2.f() + 3 : 3;
        af[] afArray = new af[n3];
        afArray[0] = new an(av.a((av)av2, (int)57004, (int)0).e);
        afArray[1] = af2 == null ? new an(av.a((av)av2, (int)57005, (int)0).d) : af2;
        afArray[2] = new t((byte)(n3 - 3));
        int n4 = q2.h();
        int n5 = q2.e() / n4;
        int n6 = 3;
        while (true) {
            if (n6 >= n3) {
                z.a().a(1534, (af)new ba(s2), afArray);
                ac.a(true, false);
                return;
            }
            if (s2 == 2 && n6 - 3 == n5) {
                int n7 = n2 < 0 ? 0 : n2;
                afArray[n6] = new ba((short)n7);
            } else {
                afArray[n6] = new ba((short)q2.a((int)((n6 - 3) * n4)).b);
            }
            ++n6;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2, boolean bl2) {
        Object object = av.a(av2, (int)(av2.a + 3));
        if (((String)object).equals("C\u01a1 b\u1ea3n")) {
            if (bl2) {
                ((q)av2.a((int)(av2.a + 7))).b(0);
                ((q)av2.a((int)(av2.a + 8))).b(0);
                av2.a((int)(av2.a + 3)).e = (int)(av2.a + 7);
                this.a(av2, new int[]{5, 6, 7, 8, 24, 28});
            }
            object = av2.a((int)(av2.a + 5));
            ((g)object).b = (short)(av2.a((int)(av2.a + 7)).b + av2.a((int)(av2.a + 7)).h - ((g)object).h);
            av2.f((int)(av2.a + 7));
        } else if (((String)object).equals("Cao c\u1ea5p")) {
            object = (q)av2.a((int)(av2.a + 9));
            ((q)object).b(0);
            if (((q)object).a(0) == null) {
                if (av2.a / 1000 == 7) {
                    z.a().a(1006, (af)new t(12), av2.b(1));
                    ac.a(true, false);
                } else if (av2.a / 1000 == 8) {
                    z.a().a(1127, (af)new t(33), av2.b(1));
                    ac.a(true, false);
                }
            }
            if (bl2) {
                av2.a((int)(av2.a + 3)).e = (int)(av2.a + 9);
                this.a(av2, new int[]{9});
            }
            av2.v = av2.a((int)(av2.a + 9)).b + av2.a((int)(av2.a + 9)).h + 20;
        } else if (((String)object).equals(s.d[169])) {
            if (bl2) {
                object = (q)av2.a((int)(av2.a + 10));
                ((q)object).b(0);
                ad.a(av2, false);
                if (((q)object).a(0) == null) {
                    if (av2.a / 1000 == 7) {
                        z.a().a(1006, (af)new t(7), av2.b(1), new an(1));
                    } else if (av2.a / 1000 == 8) {
                        z.a().a(1127, (af)new t(30), av2.b(1), new an(1));
                    }
                    ac.a(true, false);
                }
                av2.a((int)(av2.a + 3)).e = (int)(av2.a + 10);
                this.a(av2, new int[]{10});
            }
            av2.v = av2.a((int)(av2.a + 10)).b + av2.a((int)(av2.a + 10)).h + 20;
        } else if (((String)object).equals("X\u00e3 h\u1ed9i")) {
            object = (q)av2.a(7011);
            if (bl2) {
                if (((q)object).a(0) == null) {
                    z.a().a(1006, (af)new t(8), av2.b(1));
                    ac.a(true, false);
                }
                av2.a((int)(av2.a + 3)).e = (int)(av2.a + 11);
                this.a(av2, new int[]{11});
            }
            av2.v = av2.a((int)7011).b + av2.a((int)7011).h;
        } else if (((String)object).equals(s.d[100])) {
            if (!bl2) {
                object = (ar)av2.a(7045);
                ar ar2 = (ar)av2.a(7046);
                if (!((g)object).a() && !ar2.a()) {
                    this.a(av2, new int[]{29, 40, 41, 42, 43});
                    av2.c(av2.b(4).b(), false);
                    av2.a((int)(av2.a + 3)).e = (int)(av2.a + 40);
                }
                av2.v = av2.a((int)7043).b + av2.a((int)7043).h;
            } else {
                this.a(av2, new int[]{29});
            }
            if (bl2) {
                av2.b(4).a(7046);
                z.a().a(1006, (af)new t(15), new t(0));
                ac.a(true, false);
            }
        } else if (((String)object).equals(s.a[94])) {
            object = (q)av2.a(8034);
            if (bl2) {
                av2.a((int)8003).e = 8034;
                this.a(av2, new int[]{34, 36, 38});
            }
            if (((q)object).a(0) == null) {
                z.a().a(1127, (af)new t(31), av2.b(1));
            }
            av2.f(8034);
        } else if (((String)object).equals(s.b[38])) {
            if (av2.a / 1000 == 7) {
                if (bl2) {
                    av2.a((int)(av2.a + 3)).e = (int)(av2.a + 12);
                    this.a(av2, new int[]{12});
                }
                if (((q)(object = (q)av2.a((int)(av2.a + 12)))).a(0) == null) {
                    z.a().a(1006, (af)new t(9), av2.b(1));
                    ac.a(true, false);
                    av2.c((int)(av2.a + 12));
                    av2.v = 100;
                } else {
                    av2.c((int)(av2.a + 12), false);
                    int[] nArray = ((q)object).b;
                    av2.v = ((q)object).h + nArray;
                }
            } else if (av2.a / 1000 == 8) {
                if (bl2) {
                    av2.a((int)(av2.a + 3)).e = (int)(av2.a + 14);
                    this.a(av2, new int[]{14});
                }
                if (((q)(object = (q)av2.a((int)(av2.a + 14)))).a(0) == null) {
                    z.a().a(1127, (af)new t(32), av2.b(1));
                    ac.a(true, false);
                    av2.c((int)(av2.a + 14));
                    av2.v = 100;
                } else {
                    av2.c((int)(av2.a + 14), false);
                    int[] nArray = ((q)object).b;
                    av2.v = ((q)object).h + nArray;
                }
            }
        }
        if (bl2) {
            av2.d((int)(av2.a + 3));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(z afArray) {
        if (w.b() == 0) {
            return;
        }
        int n2 = afArray.a(1);
        afArray = w.a(n2);
        int n3 = this.b();
        ay.b = afArray;
        ap.a().d(false);
        this.a.b(a.f.a(43), 0);
        if (n2 != ay.a.a()) {
            if (n3 == ay.a.a()) {
                z.a().a(1023, (af)new ba(17), new an(this.b()));
            }
        } else {
            bl.c = false;
            ay.a.f = (Vector)-1;
        }
        this.a(afArray);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(z object, av av2, int object2) {
        if (object2 != 0) return;
        q q2 = (q)av2.a(4001);
        byte by = ((z)object).a(2);
        av2.a(s.d[401]);
        String[] stringArray = new String[]{"( B\u1ea3o tr\u00ec )", "( L\u01b0u lo\u00e1t )", "( \u0110\u00f4ng )", "( Ch\u1eadt )"};
        av2.d(4001);
        q2.a(by * 2);
        av2.a(0, new Vector());
        al.a((int)by, 4, 3, ((z)object).a, (Vector)av2.a(0));
        av2.v = (int)(q2.b + q2.h + 20);
        Vector vector = (Vector)av2.a(0);
        String string = a.b.a(s.b, 1);
        object = string != null ? al.a(string, "|") : null;
        boolean bl2 = false;
        while (true) {
            ar ar2;
            af[] afArray;
            void var3_5;
            block4: {
                block5: {
                    if (var3_5 >= by) break block5;
                    afArray = (af[])vector.elementAt((int)var3_5);
                    ar2 = new ar(afArray[0].toString(), s.a[6], 0);
                    ar2.b = afArray[0].toString();
                    q2.a(ar2, (int)(var3_5 * 2));
                    if (string == null) break block4;
                    try {
                        if (((String)object[0]).equals("2") && ((String)object[5]).equals(ar2.b)) {
                            q2.b((int)(var3_5 * 2));
                        }
                        break block4;
                    }
                    catch (Exception exception) {}
                }
                int[] nArray = q2.b;
                av2.v = q2.h + nArray - 25;
                return;
            }
            int n2 = afArray[2].b() < stringArray.length ? afArray[2].b() : stringArray.length - 1;
            ar2 = new ar(stringArray[n2], s.a[(new byte[]{10, 3, 6, 2})[n2]], 0);
            ar2.b = afArray[0].toString();
            q2.a(ar2, (int)(var3_5 * 2 + true));
            ++var3_5;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String object, av av2) {
        r r2;
        block5: {
            block4: {
                int n2;
                if (av2 == null) break block4;
                r2 = (r)av2.a(89003);
                r2.d();
                r2.a((String)object);
                int n3 = this.e.size();
                if (n3 <= 0) break block5;
                av2.c(89004, false);
                av2.c(89005, true);
                object = (h)av2.a(89005);
                ((h)object).i = s.a[4];
                Object object2 = new String[n3];
                for (n2 = 0; n2 < n3; ++n2) {
                    object2[n2] = ((af[])this.e.elementAt(n2))[3].toString();
                }
                ((h)object).h = ((h)object).o * n3;
                ((h)object).a((String[])object2);
                object2 = av2.a(89004);
                n2 = r2.b;
                ((g)object2).b(0, r2.h + n2);
                ((g)object).b(0, av2.a((int)89004).b + av2.a((int)89004).h);
                av2.v = (int)(((h)object).b + ((h)object).h - 20);
            }
            return;
        }
        av2.d(-1);
        short s2 = r2.b;
        av2.v = r2.h + s2 - 20;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(String string, String string2, int n2, int n3, boolean bl2, bi bi2, av av2, String[] stringArray) {
        r r2 = (r)av2.a(1001);
        r2.d();
        r2.a(string);
        if (string2.equals("")) {
            av2.c(1002);
        } else {
            av2.a(1002, string2);
        }
        this.a(bl2, stringArray, av2);
        av2.b(5).a(n2);
        av2.b(6).a(n3);
        av2.a = (long)bi2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(String object, String[] stringArray, boolean bl2, av av2) {
        int n2 = 4;
        if (bl2) {
            av2.c(6005, true);
        }
        r r2 = (r)av2.a(6004);
        r2.d();
        if (!((String)object).equals("")) {
            r2.a((String)object);
            r2.a();
        }
        r2.a(0, r2.f());
        object = (h)av2.a(6006);
        if (stringArray.length <= 4) {
            n2 = stringArray.length;
        }
        ((g)object).a(0, n2 * ((h)object).o);
        ((h)object).a(stringArray);
        h.a((h)object);
        av2.e(6004);
    }

    public void a(Graphics graphics, av g2) {
        bf bf2 = new bf(4411910);
        ar ar2 = (ar)((av)g2).a(48009);
        int n2 = bf2.d();
        reference var4_6 = ar2.a + (ar2.g - bf2.b >> 1);
        bf2.a(graphics, (int)var4_6, (int)ar2.b, 0);
        bf2.a(graphics, (int)var4_6, ((av)g2).a((int)48010).b + (((av)g2).a((int)48010).h - n2), 1);
        g2 = (ar)((av)g2).a(48007);
        reference var4_7 = ((ar)g2).b + (((ar)g2).h - bf2.b >> 1);
        bf2.a(graphics, (int)((ar)g2).a, (int)var4_7, 6);
        bf2.a(graphics, (int)(aa.f - ((ar)g2).a - n2), (int)var4_7, 5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(boolean bl2, String object) {
        bb.a = true;
        bb.b = false;
        if (this.a.a == null) {
            this.a.a();
        }
        this.a.a.f();
        this.a.a.e();
        if (object == null) {
            object = bb.a == 1 ? this.a.a("http://", true) : s.d[5];
        }
        this.a.a.b = object;
        object = this.a.a;
        aj.a = 0;
        object = this.a.a;
        aj.b = 0;
        if (bl2) {
            this.a();
            this.a.a.a();
        }
        ac.b();
        ac.a(false, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(boolean bl2, String[] stringArray, av av2) {
        if (stringArray != null) {
            h h2 = (h)av2.a(1006);
            h2.a(0, h2.o * stringArray.length);
            h2.a(stringArray);
            av2.d(1006);
        } else {
            av2.c(1006);
        }
        if (!bl2) {
            av2.c(1003);
        } else {
            av2.d(1003);
        }
        av2.e(1001);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(int n2) {
        boolean bl2;
        m m2;
        if (aa.a().e != this.e || aa.a().f != this.f || n2 != this.g) {
            g.removeAllElements();
            d = 0;
            this.g = n2;
            if (n2 == 0) {
                this.a(ay.k, g, true);
                this.a(ay.m, g, false);
                if (ay.a.a() != null && aa.a().a(ay.a.a(), 0, 0)) {
                    this.a(ay.a.a(), g);
                }
                g.addElement(ay.a);
            } else if (n2 == 1 || n2 == 4) {
                this.a(ay.m, g, false);
            } else if (n2 == 2) {
                this.a(ay.m, g, false);
                this.a(ay.k, g, true);
            } else {
                this.a(ay.k, g, true);
            }
        }
        if (g.size() == 0) {
            return false;
        }
        m m3 = (m)g.elementAt(d);
        if (m3 != null && ay.a.a != null && m3.a() == ay.a.a.a()) {
            if (++d >= g.size()) {
                d = 0;
            }
            m2 = m3;
            if (g.size() != 1) {
                m2 = (m)g.elementAt(d);
            }
        } else {
            m2 = m3;
            if (++d >= g.size()) {
                d = 0;
                m2 = m3;
            }
        }
        if (m2 != null && m2.d() && aa.a().b.contains(m2)) {
            m.a(m2);
            bl2 = true;
        } else {
            bl2 = false;
        }
        this.e = aa.a().e;
        this.f = aa.a().f;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(av object, short s2, short s3) {
        boolean bl2 = true;
        boolean bl3 = true;
        Object object2 = (m)((av)object).a(0);
        int n2 = ((av)object).b(1).b();
        Object object3 = (y)((av)object).a(2);
        int n3 = n2 == 0 ? aa.c * 2 : aa.c;
        ((m)object2).b(s3, true, true, n3, n3);
        if (((m)object2).h != ((m)object2).q || ((m)object2).i != ((m)object2).r) {
            ((m)object2).h = ((m)object2).q;
            ((m)object2).i = ((m)object2).r;
            if (object3 != null) {
                ((y)object3).q = ((m)object2).q;
                ((y)object3).r = ((m)object2).r;
                if (((y)object3).j != 32) {
                    ((bk)object3).d = ((m)object2).q * aa.c;
                    ((bk)object3).e = ((m)object2).r * aa.d;
                }
            }
            this.a((av)object, (m)object2);
        }
        if (n2 == 0) {
            if (s2 == s.a[1] || s2 == s.a[6]) {
                ay.a.a((int)((m)object2).q, (int)((m)object2).r, true);
                bl2 = bl3;
                if (ay.a.b == null) return bl2;
                a.f.a(48);
                ap.a().c(true);
                return bl3;
            }
            if (s2 != s.a[0]) return false;
            a.f.a(48);
            return false;
        }
        if (n2 != 1) return false;
        af[] afArray = (af[])((av)object).a(3);
        if (s2 == s.a[1] || afArray == null && s2 == s.a[6]) {
            if (object3 == null) {
                if (afArray == null) {
                    object2 = this.a;
                    bb.a(new String[]{"Th\u00eam", "B\u1edbt"}, (av)object);
                    return false;
                } else {
                    s2 = ay.a((int)((m)object2).q, (int)((m)object2).r) != null ? (short)1 : 0;
                    z z2 = z.a();
                    ba ba2 = new ba(5);
                    object = new t(1);
                    s2 = s2 != 0 ? (short)0 : (short)6;
                    object3 = new an(s2);
                    s2 = ((m)object2).q;
                    z2.a(1312, ba2, (af)object, (af)object3, new an(((m)object2).r + s2 * 1000));
                }
                return false;
            }
            z z3 = z.a();
            ba ba3 = new ba(4);
            object3 = new t(1);
            af af2 = afArray[3];
            s2 = ((m)object2).q;
            z3.a(1312, ba3, (af)object3, af2, new an(((m)object2).r + s2 * 1000), ((av)object).b(4), new an(ay.a.q * 1000 + ay.a.r));
            return false;
        }
        if (s2 == s.a[6]) {
            if (object3 == null) return false;
            s2 = (short)(1 - ((av)object).b(4).b());
            ((av)object).b(4).a(s2);
            if (((y)object3).j != 64) return false;
            object = ((bk)object3).a;
            if (s2 != 1) {
                bl2 = false;
            }
            ((bg)object).a(2, bl2);
            return false;
        } else {
            if (s2 != s.a[0]) return false;
            if (afArray == null) {
                a.f.a(48);
                return false;
            } else {
                ((av)object).a(2, (Object)null);
                ((av)object).a(3, (Object)null);
                ((av)object).c(48006);
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String[] a(av stringArray, int n2) {
        Vector vector = (Vector)stringArray.a(4);
        if (vector.size() == 0) {
            return null;
        }
        stringArray = new String[vector.size()];
        int n3 = 0;
        while (n3 < stringArray.length) {
            stringArray[n3] = ((String[])vector.elementAt(n3))[n2];
            ++n3;
        }
        return stringArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int b() {
        if (ay.b != null) return ay.b[0].b();
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int b(int n2) {
        switch (n2) {
            default: {
                return 5;
            }
            case 2803: 
            case 2815: {
                return 4;
            }
            case 2856: {
                return 20;
            }
            case 2905: 
        }
        return 21;
    }

    public av b(av object, int n2) {
        av av2 = object;
        if (object == null) {
            av2 = a.f.b(48);
        }
        if (n2 == 0) {
            aa.a = true;
        }
        object = new m(0, 0, (byte)(ay.a.e ? 1 : 0), 0, 0, 0);
        ((m)object).d = (byte)2;
        ((m)object).d(ay.a.q, ay.a.r);
        av2.a(0, object);
        av2.a(1, new an(n2));
        this.a(av2, (m)object);
        av2.c(48006);
        return av2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public av b(av av2, int n2, int n3) {
        if (av2 == null) {
            av av3;
            av2 = av3 = a.f.b(88);
            if (n2 == 1) {
                z.a().a(1527, new ba(1));
                ac.a(true, false);
                av2 = av3;
            }
        }
        av2.b(0).a(n2);
        if (n2 == 1 || n2 == 3) {
            z.a().a(1314, new ba(4));
            ac.a(true, false);
        }
        if (n2 == 0) {
            av2.c(88010);
            av2.c(88011);
            av2.f(88011);
            av2.a(88013, 2402, 3, av2.b(1).b(), null);
            av2.b(0);
        } else if (n2 == 2 || n2 == 4) {
            av2.c(88010);
            av2.c(88011);
            h h2 = (h)av2.a(88011);
            ((q)av2.a((int)88012)).b = (int[])h2.b;
            av2.f(88012);
            if (n2 == 2) {
                av2.a(88013, 1170, 5, av2.b(1).b(), null);
            } else {
                av2.a(88013, 1170, 7, av2.b(1).b(), new af[]{new an(n3)});
            }
            av2.b(0);
        } else if (n2 == 3) {
            av2.a(s.b[28]);
            av2.c(88010);
            av2.c(88011);
            av2.c(88012);
            av2.c(88031, false);
            av2.c(88032, true);
            av2.c(88033, false);
            g g2 = av2.a(88031);
            g2.b = (short)(g2.b - 25);
            av2.f(88031);
        }
        this.F(av2);
        return av2;
    }

    public void b() {
        am am2 = new am();
        am2.a(1065);
        am2.d(s.g);
        am2.a(this.a.a());
        am2.b(bb.a);
        am2.d(w.a(0));
        am2.d(this.c());
        am2.d(9);
        this.a.a(am2.a());
        this.a.a.a();
    }

    public void b(int n2) {
        a.f.b(114).b(0).a(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(int n2, av av2) {
        if ((av2.f & 0x10) != 0 && this.a[0] != 0L && System.currentTimeMillis() - this.a[0] >= this.a[1]) {
            r r2 = null;
            for (int i2 = 0; i2 < 3; ++i2) {
                r r3 = (r)av2.a(50001 + i2);
                if (r3 == null || !r3.a()) continue;
                r3.c = (byte)(r3.c - 2);
                r2 = r3;
            }
            if (r2 != null && r2.c >= 0) {
                return;
            }
            a.f.a(50);
            this.a[0] = 0L;
        }
        if ((av2.f & 0x20) == 0) return;
        if (n2 == 0) return;
        av2.f = (short)(av2.f | 0x10);
        this.a[0] = 1L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(av av2) {
        if (av2.a(20025).a()) {
            av2.c(20025);
            av2.d(20022);
            av2.f(20024);
            return;
        }
        a.f.a(20);
    }

    /*
     * Unable to fully structure code
     */
    public void b(av var1_1, int var2_2) {
        block10: {
            block7: {
                block11: {
                    block9: {
                        block8: {
                            block6: {
                                var4_3 = var1_1.f();
                                var6_4 = var1_1.a(6005).a();
                                var5_5 = (h)var1_1.a(6006);
                                var3_6 = var5_5.f();
                                if (var2_2 != s.a[0] && var4_3 != 6008) break block6;
                                if (this.c.size() > 0) {
                                    var2_2 = Integer.parseInt((String)this.c.elementAt(w.a().c.size() - 1));
lbl8:
                                    // 4 sources

                                    while (true) {
                                        if (var2_2 > 0) {
                                            z.a().a(2032, new ba(0), new ba(0), new an(0), new ba(0), new t((byte)var2_2), new t(101), new j(var6_4));
                                        }
                                        a.f.a(6);
lbl13:
                                        // 4 sources

                                        return;
                                    }
                                }
                                break block7;
                            }
                            if (var4_3 != 6005) break block8;
                            bn.a(s.d[375], -1, 0, 6005, (bi)var1_1);
                            ** GOTO lbl13
                        }
                        if (var4_3 != 6006 && var4_3 != 6007) break block9;
                        if (this.c.size() <= var3_6) break block10;
                        var2_2 = Integer.parseInt((String)this.c.elementAt(var3_6));
lbl24:
                        // 2 sources

                        while (true) {
                            if (var2_2 <= 0) ** GOTO lbl8
                            ac.a(true, false);
                            ** GOTO lbl8
                            break;
                        }
                    }
                    if (var4_3 != 6009) break block11;
                    var1_1.d(6006);
                    var5_5.a(s.a[4], s.a[4], -1, -1);
                    ** GOTO lbl13
                }
                if (var4_3 == 6010) {
                    var1_1.d(6006);
                    var5_5.a(s.a[5], s.a[5], -1, -1);
                    ** continue;
                }
            }
            var2_2 = 0;
            ** while (true)
        }
        var2_2 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(av av2, int n2, af af2, af af3, af af4) {
        int n3 = 1009;
        int n4 = 14;
        switch (n2) {
            default: {
                n3 = 0;
                n2 = 0;
                break;
            }
            case 2846: {
                z.a().a(1506, (af)new ba(12), af2, af3);
                n3 = 0;
                n2 = 0;
                break;
            }
            case 2871: 
            case 2878: {
                z.a().a(1506, (af)new ba(3), af2, af3);
                n3 = 0;
                n2 = 0;
                break;
            }
            case 100: {
                n3 = 1107;
                n2 = 43;
                break;
            }
            case 101: {
                z.a().a(1107, new ba(47));
                n3 = 0;
                n2 = 0;
                break;
            }
            case 2803: 
            case 2804: 
            case 2805: 
            case 2806: 
            case 2812: 
            case 2815: 
            case 2856: 
            case 2857: 
            case 2905: 
            case 2906: {
                n3 = 1521;
                n2 = n4;
                break;
            }
            case 2823: {
                n2 = 104;
                break;
            }
            case 2824: {
                n2 = 105;
                break;
            }
            case 2825: {
                n2 = 6;
                n3 = 1534;
                break;
            }
            case 2826: {
                n2 = 8;
                n3 = 1534;
                break;
            }
            case 2882: {
                n2 = 11;
                n3 = 1534;
                break;
            }
            case 2881: {
                z.a().a(1534, (af)new ba(21), af2, new an(af3.b()));
                n3 = 0;
                n2 = 0;
                break;
            }
            case 2883: {
                z.a().a(1534, (af)new ba(14), af2, new an(af3.b()));
                n3 = 0;
                n2 = 0;
                break;
            }
            case 2852: {
                n2 = 119;
                break;
            }
            case 2870: {
                n2 = 124;
                break;
            }
            case 2872: {
                n2 = 126;
                break;
            }
            case 2827: {
                z.a().a(1009, new ba(107), af2, af3, af4);
                n3 = 0;
                n2 = 0;
                break;
            }
            case 2847: {
                n2 = 113;
                break;
            }
            case 2877: {
                n3 = 1534;
                n2 = 1;
            }
        }
        if (n3 > 0) {
            z.a().a(n3, (af)new ba((short)n2), af2);
        }
        ac.a(true, false);
    }

    public void c() {
        am am2 = new am();
        am2.a(1504);
        am2.b(0);
        am2.a(this.a.a());
        am2.d(s.g);
        this.a.a(am2.a());
        this.a.a.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(int n2, av av2) {
        av2.b = (Vector)((short)n2);
        if ((av2.f & 0x40) != 0) {
            r r2 = (r)av2.a(50001);
            r2.b((av2.g - r2.e() >> 1) + av2.a, n2 + 5);
            return;
        }
        if ((av2.f & 0x80) != 0) {
            r r3 = (r)av2.a(50002);
            r3.b((av2.g - r3.e() >> 1) + av2.a, n2 + 5);
            r r4 = (r)av2.a(50003);
            int n3 = av2.g;
            int n4 = r4.e();
            long l2 = av2.a;
            n2 = r3.b;
            r4.b((n3 - n4 >> 1) + l2, r3.h + n2);
            return;
        }
        if ((av2.f & 0x100) == 0) return;
        av2.a(50004).b(0, n2 + 5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void c(av av2) {
        String string = this.a.a(10);
        g g2 = av.a(av2, av2.f(), 1000);
        if (string.equals(s.a[2])) {
            if (av2.f() == 20024) {
                this.a.a(av2, string, 20023);
                return;
            }
            this.a(g2.d, g2.b);
            return;
        }
        if (string.equals(s.a[19])) {
            if (av2.b(0).b() == 0) {
                au.a((q)av2.a(20004), null, null);
                return;
            }
            this.k();
            return;
        }
        this.a.a(av2, string, 20023);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(av object, int n2) {
        String string;
        a = n2;
        if (n2 >= 0) {
            n2 = ((q)((av)object).a(4001)).e() / 2;
            if (this.a == null) return;
            if (((q)((av)object).a(4001)).a(n2) == null) {
                return;
            }
            string = ((ar)((q)((av)object).a((int)4001)).a((int)(n2 * 2))).b;
            object = ((af[])((Vector)((av)object).a(0)).elementAt(n2))[1].toString();
            n2 = 0;
        } else {
            a = 0;
            string = this.c;
            object = a.b.a(s.b, 1);
            if (object != null) {
                object = al.a((String)object, "|")[6];
                n2 = 1;
            } else {
                n2 = 1;
                object = "";
            }
        }
        am am2 = new am();
        am2.a(1051);
        am2.a(this.a);
        am2.a(this.b);
        am2.a((String)object);
        am2.d(0);
        am2.b(Integer.parseInt(a.b.a(s.f, 1)));
        am2.b(0);
        am2.a(this.a.a());
        al.a(2, this.a, this.b, string, (String)object);
        am2.d(s.g);
        am2.b(n2);
        this.a.a(am2.a());
        ac.a(false, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(int n2) {
        block3: {
            int n3 = ay.x.size();
            int n4 = 0;
            while (n4 < n3) {
                if (this.a((af[])ay.x.elementAt(n4)) == n2) {
                    if (n4 == -1) return false;
                    ay.x.removeElementAt(n4);
                    if (n2 == ay.a.a()) {
                        this.m();
                        return true;
                    }
                    break block3;
                }
                ++n4;
            }
            return false;
        }
        e e2 = ay.a(n2);
        if (e2 == null) return false;
        e2.h();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        av av2 = a.f.a(1);
        if (av2 == null) return;
        switch (((h)av2.a(1006)).f()) {
            case 0: {
                MyMidlet.m_Midlet.ConnectAddr = MyMidlet.m_Midlet.UpdateAddr;
                MyMidlet.m_Midlet.exit(false);
            }
            default: {
                return;
            }
            case 1: 
        }
        try {
            MyMidlet.m_Midlet.ConnectAddr = s.d[0];
            MyMidlet.m_Midlet.exit(false);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void d(int n2) {
        av av2 = a.f.b(45);
        if (av2 == null) {
            return;
        }
        av2.a(s.b[18]);
        ((h)av2.a(45004)).a(n2);
        av2.a(45003, 2, 0, ((q)av2.a(45003)).f(), null);
        this.v(av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void d(int n2, av av2) {
        switch (n2) {
            case 10: {
                for (int i2 = 0; i2 < 10; ++i2) {
                    av2.a(i2, new j(""));
                }
                break;
            }
            case 20: {
                av2.a(0, new t(0));
                av2.a(1, new an(0));
                break;
            }
            case 51: {
                av2.a(0, new t((byte)((q)av2.a(51006)).f()));
                break;
            }
            case 48: {
                av2.a(0, (Object)null);
                av2.a(1, new an(0));
                av2.a(2, (Object)null);
                av2.a(3, (Object)null);
                av2.a(4, new t(0));
                break;
            }
            case 56: {
                av2.a(0, new ba(2803));
                av2.a(1, new t((byte)((q)av2.a(56003)).f()));
                av2.a(2, new t(1));
                break;
            }
            case 57: {
                av2.a(0, new ba(2803));
                av2.a(1, new t(0));
                av2.a(2, new t(0));
                break;
            }
            case 7: 
            case 8: {
                av2.a(0, new an(0));
                av2.a(1, new an(0));
                av2.a(2, new j(""));
                av2.a(3, bg.a(2100001, 0));
                av2.a(4, new an(0));
                break;
            }
            case 88: {
                av2.a(0, new an(0));
                av2.a(1, new an(((q)av2.a(88013)).f()));
                av2.a(2, new j(""));
                break;
            }
            case 89: {
                this.e = new Vector();
                break;
            }
            case 114: {
                av2.a(0, new t(0));
                break;
            }
            case 6: {
                this.b = new Vector(5);
                this.c = new Vector();
                break;
            }
            case 1: {
                av2.a(0, new ak(false));
                av2.a(1, new d(0L));
                av2.a(2, (Object)null);
                av2.a(3, new an(0));
                av2.a(4, new d(0L));
                av2.a(5, new an(0));
                av2.a(6, new an(0));
                av2.a(7, (Object)null);
                av2.a(8, new d(0L));
                av2.a(9, new an(0));
                av2.a(10, new j(""));
                break;
            }
        }
        this.a.d(n2, av2);
        this.a.a(n2, av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void d(av g2) {
        String string = this.a.a(10);
        g g3 = av.a(g2, 15008, 1001);
        if (string.equals(s.a[12])) {
            this.a.a(((ar)g3).b, "");
            return;
        }
        if (string.equals(s.a[2])) {
            this.a.b(null, g3.d, 1, 2);
            return;
        }
        if (!string.equals(s.b[11])) return;
        z.a().a(1023, (af)new ba(6), new an(g3.d));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void d(av object, int n2) {
        if (n2 == 1) {
            if (this.a() == -1) return;
            this.a(false, null);
            this.b();
            ac.a(false, true);
            return;
        }
        if (n2 != 3) {
            if (n2 != 2) return;
        }
        String string = ((av)object).a(2003).a();
        String string2 = ((av)object).a(2004).a();
        if (string.trim().equals("")) {
            a.f.a(s.d[376]);
            ((av)object).d(2003);
            return;
        }
        if (!al.a(string.trim())) {
            a.f.a(s.d[377]);
            ((av)object).d(2003);
            return;
        }
        if (string2.trim().equals("")) {
            a.f.a(s.d[378]);
            ((av)object).d(2004);
            return;
        }
        if (!al.a(string2.trim())) {
            a.f.a(s.d[379]);
            ((av)object).d(2004);
            return;
        }
        if (this.a() == -1) return;
        this.a = string;
        this.b = string2;
        if (n2 == 2) {
            this.a(false, null);
            this.o(null);
        } else {
            this.a(true, null);
        }
        object = this.a;
        ad.c = string2;
    }

    public void e() {
        this.b = aa.c * aa.a().a / 48;
        this.c = aa.d * aa.a().b / 39;
    }

    public void e(int n2) {
        z.a().a(1023, new ba(9));
        z.a().a(1023, (af)new ba(1), new an(n2));
        this.a.b(a.f.a(43), 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void e(av av2) {
        int n2 = av2.f();
        if (n2 == 15002 || n2 == 15004) {
            bn.a(s.d[375], 3, 2, n2, (bi)av2);
            return;
        }
        if (n2 == 15005) {
            int n3;
            n2 = ((n)av2.a(15002)).f();
            if (n2 > (n3 = ((n)av2.a(15004)).f()) || n2 <= 0 || n2 >= 121 || n3 <= 0 || n3 >= 121) {
                a.f.a(s.d[374]);
                return;
            } else {
                z.a().a(1023, (af)new ba(50), (af)new an(n2), new an(n3));
            }
            return;
        }
        if (n2 == 15006) {
            this.a(null, 0);
            return;
        }
        if (n2 != 15008) return;
        String[] stringArray = new String[]{s.b[11], s.a[2], s.a[12]};
        if (stringArray == null) return;
        bb bb2 = this.a;
        bb.a(stringArray, av2);
    }

    public void f() {
        this.e(this.b());
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(int n2) {
        av av2;
        int n3 = 0;
        if (n2 == ay.a.a()) {
            if (bl.c) {
                z.a().a(1023, (af)new ba(18), new an(this.b()));
                bl.c = false;
                ay.a.f = (Vector)-1;
            }
            this.n();
            n2 = n3;
        } else {
            this.c(n2);
            n2 = 1;
        }
        if ((av2 = a.f.a(15)) != null) {
            this.a.b(av2, n2);
            bb bb2 = this.a;
            bb.i();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(av av2) {
        int n2;
        int n3 = av2.f();
        if (n3 == 16004) {
            bn.a(s.d[375], 8, 0, n3, (bi)av2);
            return;
        }
        if (n3 == 16005 || n3 == 16007) {
            bn.a(s.d[375], 3, 2, n3, (bi)av2);
            return;
        }
        if (n3 == 16008) {
            bn.a(s.d[372], 4, 2, n3, (bi)av2);
            return;
        }
        if (n3 != 16009) {
            if (n3 != 16010) return;
            a.f.a(16);
            return;
        }
        String string = av2.a(16008).a();
        n3 = string.equals("") ? -1 : Integer.parseInt(string);
        int n4 = Integer.parseInt(av2.a(16005).a());
        if (n4 > (n2 = Integer.parseInt(av2.a(16007).a())) || n2 >= 121 || n2 < 0 || n4 >= 121 || n4 < 0) {
            a.f.a(s.d[374]);
            return;
        }
        if (n4 == 0) {
            n4 = 1;
        }
        if (n2 == 0) {
            n2 = 1;
        }
        z.a().a(1023, new ba(0), new an(ay.a.a()), new j(av2.a(16004).a()), new an(n3), new an(n4), new an(n2));
        a.f.a(16);
        a.f.a(15);
    }

    public void g() {
        if (System.currentTimeMillis() - this.a >= 30000L) {
            this.a = System.currentTimeMillis();
            z.a().a(1023, (af)new ba(52), new an(ay.a.a()));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(int var1_1) {
        block13: {
            switch (var1_1) {
                case 2: {
                    try {
                        bf.c(5999);
                        ay.a = null;
                        ay.b = null;
                        ay.c = null;
                    }
                    catch (Exception var2_2) {}
                    ** GOTO lbl36
                }
                case 57: {
                    au.a = null;
                    au.a = null;
                    au.b = null;
                    ** break;
                }
                case 6: {
                    this.b = null;
                    this.c = null;
                    ** break;
                }
                case 45: {
                    this.d = null;
                    ** break;
                }
                case 48: {
                    aa.a = false;
                    aa.a().a(ay.a);
                    ** break;
                }
                case 89: {
                    this.e = null;
                    ** break;
                }
                case 20: {
                    var2_3 = a.f.a(20).b(1);
                    if (var2_3.b() != 0) {
                        var3_4 = z.a();
                        var4_5 = new ba(4);
                        var3_4.a(1056, (af)var4_5, var2_3);
                    }
                }
lbl36:
                // 11 sources

                default: {
                    break block13;
                }
                case 84: 
            }
            v.a().b();
        }
        this.a.b(var1_1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void g(av object) {
        block4: {
            block3: {
                Object object2;
                if (((av)object).b(0).b() != 2) break block3;
                if (((av)object).f() != 43015 || (object2 = av.a((av)object, ((av)object).f(), 1000)) == null || ((g)object2).d == -1) break block4;
                q q2 = (q)((av)object).a;
                String string = new StringBuffer().append("Th\u1ec3 l\u1ef1c:").append(((g)object2).d).toString();
                object = new StringBuffer().append("Th\u1ef1c l\u1ef1c:").append(((g)object2).e).toString();
                object2 = new StringBuffer().append("M\u1ea1ng:").append(((g)object2).b).toString();
                this.a.a(43015, q2.b(q2.e(), true), q2.a(q2.e(), true), new String[]{string, object, object2});
                this.a.a(43015);
            }
            return;
        }
        this.a.a(0);
    }

    public void h() {
        if (System.currentTimeMillis() - this.b >= 70000L) {
            this.b = System.currentTimeMillis();
            this.l();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void h(av g2) {
        void var4_7;
        Object object;
        block12: {
            int n2;
            block13: {
                int n3;
                block16: {
                    block15: {
                        block14: {
                            object = av.a((av)g2, 12001, 1000);
                            if (object == null) {
                                return;
                            }
                            n3 = ((av)g2).b(0).b();
                            n2 = ((h)((av)g2).a(12003)).f();
                            if (((av)g2).f() != 12001) return;
                            Object var4_6 = null;
                            if (n2 != 0) break block13;
                            if (((g)object).d != 1) break block14;
                            bn.a(s.d[375], 100, 0, "", (bi)((Object)g2));
                            break block12;
                        }
                        if (n3 == 1) {
                            av av2 = a.f.a(104);
                            if (av2 != null) {
                                ar ar2 = new ar(((g)object).a(), s.a[0], 0);
                                ar2.d = ((g)object).d;
                                ((q)av2.a(104007)).a(ar2, 0);
                            }
                            a.f.a(12);
                            return;
                        }
                        if (n3 != 3) break block15;
                        String[] stringArray = new String[]{s.a[12], s.b[100]};
                        break block12;
                    }
                    if (n3 != 4) break block16;
                    if (((g)object).e == 2) {
                        String[] stringArray = new String[]{s.a[2], s.a[104]};
                        break block12;
                    } else {
                        String[] stringArray = new String[]{s.a[2]};
                    }
                    break block12;
                }
                if (w.a()) {
                    if (n3 == 6) {
                        this.a(new an(((g)object).d));
                        break block12;
                    } else {
                        String[] stringArray = new String[]{s.a[2], s.a[12], s.a[13], s.b[68], s.b[19], s.a[71]};
                    }
                    break block12;
                } else {
                    String[] stringArray = new String[]{s.a[2], s.a[12], s.a[13], s.a[22], s.b[19], s.a[71]};
                }
                break block12;
            }
            if (n2 == 2) {
                String[] stringArray = new String[]{s.a[2], s.a[41], s.a[71]};
            } else if (n2 == 1) {
                String[] stringArray = new String[]{s.a[2], s.a[12], s.a[41], s.a[71]};
            }
        }
        if (var4_7 == null) return;
        object = this.a;
        bb.a((String[])var4_7, (av)g2);
    }

    public void i() {
        this.m();
        this.a.b(a.f.a(43), 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void i(av av2) {
        String string;
        int n2;
        int n3;
        ((h)av2.a(6006)).d();
        int n4 = this.b.size() / 3;
        int n5 = 0;
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = Integer.parseInt((String)this.b.elementAt(n3 * 3));
            if (n2 != 3 && n2 != 1) continue;
            ++n5;
        }
        String[] stringArray = new String[n5 - 1];
        String string2 = "";
        boolean bl2 = false;
        n2 = 0;
        n3 = -1;
        for (n5 = 0; n5 < n4; ++n5) {
            int n6 = Integer.parseInt((String)this.b.elementAt(n5 * 3));
            int n7 = Integer.parseInt((String)this.b.elementAt(n5 * 3 + 1));
            string = (String)this.b.elementAt(n5 * 3 + 2);
            if (n6 == 0) {
                string2 = string;
                continue;
            }
            if (n6 == 1) {
                if (n3 != -1) continue;
                n3 = n5;
                continue;
            }
            if (n6 == 2) {
                bl2 = true;
                continue;
            }
            if (n6 != 3) continue;
            stringArray[n2] = string;
            this.c.addElement(Integer.toString(n7));
            ++n2;
        }
        if (n3 != -1) {
            string = (String)this.b.elementAt(n3 * 3 + 1);
            this.c.addElement(string);
        }
        ap.a();
        av2.a(ap.d);
        this.a(string2, stringArray, bl2, av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void j() {
        Vector vector = ay.m;
        int n2 = this.b();
        if (n2 == ay.a.a()) {
            return;
        }
        e e2 = ay.a(n2);
        if (e2 == null) return;
        vector.removeElement(e2);
        vector.addElement(e2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void j(av av2) {
        int n2 = av2.f();
        String string = a.b.a(s.b, 1);
        int n3 = 0;
        int n4 = 0;
        while (n3 < 8) {
            ar ar2 = (ar)av2.a(n3 + 2007);
            if (n3 == 1 && string != null) {
                ++n4;
            } else if (n3 == 2) {
                n4 = 3;
            }
            if (n2 == n3 + 2007) {
                ar2.a(new bf(6640000 + n4 * 10000));
            } else {
                ar2.a(new bf(6550000 + n4 * 10000));
            }
            ++n4;
            ++n3;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void k(av av2) {
        int n2 = 1;
        int n3 = av2.f();
        if (n3 == 2021) {
            if (((Vector)av2.a(4)).size() <= 0) return;
            g g2 = av2.a(2003);
            n3 = g2.a;
            n2 = g2.b;
            bb.a(n3 + 3, g2.h + n2 + 2, 1, 0, this.a(av2, 1), av2);
            return;
        }
        if (n3 == 2003 || n3 == 2004) {
            bn.a(s.d[370], 13, 4, 2003, 2004, (bi)av2.a);
            return;
        }
        if (n3 == 2007) {
            if (this.a() == -1) return;
            this.d(av2, 2);
            return;
        }
        if (n3 == 2011) {
            String string = s.d[352];
            String string2 = s.c[4];
            a.f.a("cmwap: ph\u00f9 h\u1ee3p m\u1ea1ng di d\u1ed9ng cmwap s\u1eed d\u1ee5ng. cmnet: ph\u00f9 h\u1ee3p m\u1ea1ng di \u0111\u1ed9ng cmnet, liantong, dianxin, wifi s\u1eed d\u1ee5ng", "", (int)(av2.a + 3), -1, false, av2, new String[]{string, string2});
            return;
        }
        if (n3 == 2009) {
            this.b(0);
            return;
        }
        if (n3 == 2012) {
            a.f.b(115);
            return;
        }
        if (n3 == 2008) {
            if (a.b.a(s.b, 1) != null) {
                n2 = 3;
            }
            this.d(av2, n2);
            return;
        }
        if (n3 == 2013) {
            a.f.b(110);
            return;
        }
        if (n3 == 2014) {
            MyMidlet.m_Midlet.exit(true);
            return;
        }
        if (n3 != 2010) return;
        if (this.a() == -1) return;
        this.a(false, null);
        this.c();
    }

    public void l(av av2) {
        String string = this.a.a(0);
        int n2 = this.a.a(10);
        String[] stringArray = this.a(av2, 2);
        av2.b(2003, string);
        av2.b(2004, stringArray[n2]);
    }

    public void n(av av2) {
        if (av2.f() == 4001) {
            String[] stringArray = (String[])av2.a(4001);
            Object object = (af[])((Vector)av2.a(0)).elementAt(stringArray.i());
            stringArray = new String[object[3].b()];
            for (int i2 = 0; i2 < object[3].b(); ++i2) {
                stringArray[i2] = new StringBuffer().append((new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"})[i2]).append(" tuy\u1ebfn").toString();
            }
            object = this.a;
            bb.a(stringArray, av2);
        }
    }

    public void o(av av2) {
        this.c(av2, this.a.a(10));
        this.a.a.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void p(av av2) {
        if (((af[])this.a.j.elementAt(av2.f() - 11001))[2].b() == 0) {
            z.a().a(1602, (af)new t(1), new an(1));
            return;
        }
        String string = s.b[3];
        String string2 = s.a[41];
        bb bb2 = this.a;
        bb.a(new String[]{string, string2}, av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void q(av av2) {
        String string = this.a.a(10);
        if (string.equals(s.a[41])) {
            av2 = a.f.a(s.d[428], s.d[372], (int)(av2.a + 4), -1, true, av2, null);
            ((n)av2.a(1003)).a(4);
            ((n)av2.a(1003)).b(13);
            return;
        }
        if (!string.equals(s.b[3])) return;
        au.c = false;
        int n2 = av2.f();
        z.a().a(1081, new an(((af[])this.a.j.elementAt(n2 - 11001))[0].b()), new t(0), new an(s.g), new j(bb.a().a()));
        ac.a(true, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void r(av av2) {
        int n2 = Integer.parseInt(((ar)av2.a((int)10018)).b);
        if (n2 == 10009) return;
        if (n2 == 10010) {
            return;
        }
        n2 = av2.f();
        if (n2 >= 10001 && n2 <= 10008) {
            ar ar2 = (ar)av2.a(10019);
            ar2.a(true);
            av2.d(Integer.parseInt(ar2.b));
            return;
        }
        if (n2 != 10015) {
            if (n2 != 10016) return;
        }
        if (this.d != null) {
            this.t(av2);
            this.d = null;
            return;
        }
        av2 = a.f.a("", "", (int)(av2.a + 15), -1, true, av2, null);
        ((n)av2.a(1003)).a(2);
        ((n)av2.a(1003)).b(10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void s(av av2) {
        int n2 = av2.f();
        if (n2 >= 10001 && n2 <= 10010) {
            a.f.a(10);
            return;
        }
        ((ar)av2.a(10019)).a(false);
        av2.d(Integer.parseInt(((ar)av2.a((int)10018)).b));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void t(av g2) {
        Object object = a.f.a(1);
        if (object != null) {
            object = ((av)object).a(1003).a();
        } else {
            if (this.d == null) return;
            object = this.d;
        }
        Object object2 = (ar)((av)g2).a(10018);
        g2 = (ar)((av)g2).a(10019);
        int n2 = Integer.parseInt(((ar)object2).b) % 1000;
        int n3 = Integer.parseInt(((ar)g2).b);
        g2 = a.f.a(11);
        if (object == null || ((String)object).trim().equals("")) {
            a.f.a("H\u00e3y nh\u1eadp t\u00ean");
            return;
        }
        object2 = new am();
        ((am)object2).a(1001);
        ((am)object2).a((String)object);
        ((am)object2).d(n3 % 1000 - 15);
        ((am)object2).b(n2 * 10 + 1);
        ((am)object2).b(0);
        ((am)object2).d(i.a);
        ((am)object2).d(0);
        ((am)object2).a("");
        n3 = ((av)g2).a != null ? ((av)g2).f() - 11001 : 0;
        ((am)object2).b(n3);
        ((am)object2).d(0);
        ((am)object2).b((byte)a);
        ((am)object2).b(ap.d);
        ((am)object2).b(u.a);
        this.a.b(((am)object2).a());
        if (n2 == 1) {
            ap.m = 3;
            ap.a().e();
        }
        ac.a(true, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void u(av av2) {
        if ((av2.f & 0x40) != 0) {
            av2.c(50001, false);
            av2.c(50002);
            av2.c(50003);
            av2.c(50004);
            return;
        }
        if ((av2.f & 0x80) != 0) {
            av2.c(50001);
            av2.c(50002, false);
            av2.c(50003, false);
            av2.c(50004);
            return;
        }
        if ((av2.f & 0x100) == 0) return;
        av2.c(50001);
        av2.c(50002);
        av2.c(50003);
        av2.c(50004, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void v(av av2) {
        if (((h)av2.a(45004)).f() == 0) {
            av2.c(45008);
            av2.c(45009);
        } else {
            av2.c(45008, false);
            av2.c(45009, false);
        }
        this.a.a(av2, 45003, 45004, 0, -1, -1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void w(av object) {
        Object object2 = av.a((av)object, 45003, 1000);
        if (((av)object).f() != 45003) return;
        if (((h)((av)object).a(45004)).f() == 0) {
            object2 = ay.a(((g)object2).d);
            if (object2 != null) {
                if (((e)object2).c() > 0) {
                    object2 = this.a;
                    bb.a(new String[]{s.a[2], s.a[12], s.a[23], s.b[153], s.a[20], s.b[68]}, (av)object);
                    return;
                }
                if ((aa.a().b & 1) == 0) {
                    object2 = this.a;
                    bb.a(new String[]{s.a[2], s.a[12], s.a[20]}, (av)object);
                    return;
                }
            }
            object2 = this.a;
            bb.a(new String[]{s.a[2], s.a[12], s.b[153], s.a[20]}, (av)object);
            return;
        }
        object = (q)((av)object).a(45003);
        int n2 = ((q)object).i();
        if ((((q)object).f & 0x2000) != 0) {
            n2 = ((q)object).c[0] + n2;
        }
        if (this.d == null) return;
        if (this.d.size() == 0) return;
        object2 = (t)this.d.elementAt(n2 * 6 + 1);
        object = (t)this.d.elementAt(n2 * 6 + 2);
        int n3 = ((af)this.d.elementAt(n2 * 6 + 3)).b();
        int n4 = ((af)this.d.elementAt(n2 * 6 + 4)).b();
        bl bl2 = ay.a;
        n2 = n4;
        if (n4 == 0) {
            n2 = aa.a().a;
        }
        bl2.a(n2, ((t)object2).b(), ((t)object).b(), 45);
        if (n3 == 0) return;
        if (!ap.a().d()) return;
        object = ay.a(n3);
        if (object == null) return;
        ay.a.a(1, (m)object, null);
    }

    public void x(av av2) {
        String string = this.a.a(10);
        this.a.a(av2, av.a((av)av2, (int)45003, (int)1000).d, av.a(av2, 45003, 1001).a(), string);
        if (!string.equals(s.a[2])) {
            a.f.a(45);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void y(av av2) {
        String string = this.a.a(10);
        if (string.equals("Th\u00eam")) {
            this.a.a(0x780000, av2, 0, null, -1);
            return;
        }
        if (!string.equals("B\u1edbt")) return;
        av2.a(3, new af[0]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void z(av av2) {
        Object object = av.a(a.f.a(93), 93006);
        af[] afArray = (af[])this.a.a(true);
        int n2 = afArray[1].b();
        m m2 = (m)av2.a(0);
        if (((String)object).equals("X\u00e2y d\u1ef1ng")) {
            object = new bk(n2);
            ((bk)object).q = m2.q;
            ((bk)object).r = m2.r;
            ((bk)object).d = ((bk)object).q * aa.c;
            ((bk)object).e = ((bk)object).r * aa.d;
            ((m)object).l(n2 % 100);
            av2.a(2, object);
        } else {
            object = new ag();
            ((ag)object).a(n2 % 1000, (byte)1, (byte)1);
            ((ag)object).q = m2.q;
            ((ag)object).r = m2.r;
            av2.a(2, object);
        }
        av2.a(3, afArray);
        av2.b(4).a(0);
        av2.b(48006);
    }
}

