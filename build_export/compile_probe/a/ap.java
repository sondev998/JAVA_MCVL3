/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package a;

import a.Static;
import a.a;
import a.aa;
import a.ac;
import a.ad;
import a.af;
import a.al;
import a.an;
import a.ar;
import a.au;
import a.av;
import a.aw;
import a.ay;
import a.az;
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
import a.j;
import a.k;
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
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ap
extends av {
    public static long a;
    public static ap a;
    public static bg a;
    public static r a;
    public static x a;
    public static Image a;
    public static boolean a;
    public static af[] a;
    public static long b;
    public static x b;
    public static String b;
    public static boolean b;
    public static byte c;
    public static x c;
    public static String c;
    public static boolean c;
    public static byte d;
    public static long d;
    public static String d;
    public static boolean d;
    public static long e;
    public static boolean e;
    public static String f;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static int t;
    private au a;
    private bb a;
    public bf a;
    private w a;
    private Vector a;
    private String[] a;
    public bf b;
    private bg b = new bf(5520000);
    private long c;
    private bf c;
    private int[] c = new bf(5540000);
    private bf d;
    private x d;
    private int[] d = new bf(5550000);
    private bf e;
    private x e;
    private long f;
    private bf f;
    private x f;
    boolean f = true;
    private bf g;
    private String g = "";
    private int w = 0;

    static {
        Static.regClass(9);
        ap.cinitclone();
    }

    public ap() {
        super(0, 0, 0, -1);
        this.b = bg.b(5560000, 1);
        this.c = new int[]{0, 0, 22, 9, 31, 53, 75, 149, 171, 193, 215, 230, 17, 42};
        this.d = new x(5, 7, 2, 0, 0);
        this.e = new x(5, 7, 2, 0, 0);
        this.e = new bf(5570000);
        this.f = new bf(5580000);
        this.g = new bf(5530000);
        this.a = bb.a();
        this.a = a.w.a();
        this.a = au.a();
        this.c = System.currentTimeMillis();
        this.a = new Vector();
        this.d = new int[]{645, 633, 644, 634, 642, 635, 639, 641};
        this.f = new x(5, 7, 2, 0, 0);
    }

    private int a(byte by) {
        return (int)(this.a + by);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(int n2, int n3) {
        int n4 = this.c[4] - this.c[3];
        if (!al.b(n2, n3, this.c[0] + this.c[11], this.c[1] + this.c[2], n4, n4)) return -1;
        return 9;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(int n2, int n3, int n4) {
        if (n3 <= n2) {
            return n4;
        }
        if (n2 == 0) return 0;
        if (n3 / n2 > n4) {
            return 0;
        }
        int n5 = n2;
        int n6 = n3;
        if (n2 <= 999999) return n4 * n5 / n6;
        n5 = n2 / 1000;
        n6 = n3 / 1000;
        return n4 * n5 / n6;
    }

    public static ap a() {
        if (a == null) {
            a = new ap();
        }
        return a;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, int n3, bl bl2) {
        if (n3 == 2) {
            bl2.d(-1);
            return;
        }
        if (this.d == 3012) return;
        if (bl2.a(false)) return;
        a.k.b((m)bl2, n2);
        boolean bl3 = bl2.i != 6 && (bl2.b == null || ((Vector)((Object)bl2.b)).size() == 0) ? bl2.h(n2) : true;
        if (bl3 && bl2.c(false)) {
            this.f();
        }
        if (bl2.f != true) return;
        if (!bl3) {
            bl2.e();
        }
        aa.a().a((short)bl2.q, bl2.r);
    }

    private void a(int n2, bf bf2, int n3) {
        if (bf2.a() != n3) {
            bf2.a(n3);
        }
    }

    private static void a(long l2) {
        if (l2 / 1000L % 60L == 0L || f == null) {
            l2 = (25200000L + l2) / 1000L % 86400L;
            StringBuffer stringBuffer = al.a(null, l2 / 3600L);
            al.a(stringBuffer, ":");
            if (l2 % 3600L < 600L) {
                al.a(stringBuffer, 0L);
            }
            al.a(stringBuffer, l2 % 3600L / 60L);
            f = stringBuffer.toString();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(long l2, boolean bl2) {
        e = bl2 ? (e += l2) : l2;
        e = bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void a(ar ar2, boolean bl2) {
        void var3_5;
        Object object;
        Object var3_3 = null;
        if (ar2.d == 131072) {
            af[] afArray = ay.a(ar2.e, ay.h);
        } else {
            if (ar2.d != 32) return;
            object = ay.a(ar2.e, ay.a, false);
            if (object != null) {
                if (!bc.a(219, ((bc)object).b)) {
                    bf bf2 = ar2.a();
                    this.a(ar2.a(), bf2, bf2.a % 10000000);
                    return;
                }
                af[] afArray = ((bc)object).a;
            }
        }
        object = ar2.a();
        if (var3_5 != null && ay.a.b((af[])var3_5, bl2)) {
            this.a(ar2.a(), (bf)object, ((bf)object).a % 10000000);
            return;
        }
        this.a(ar2.a(), (bf)object, ((bf)object).a % 10000000 + 90000000);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(av av2, int n2) {
        String string;
        if (bl.l <= 0) {
            return;
        }
        av2.b(n2);
        r r2 = (r)av2.a(n2);
        r2.d();
        r2.a((int)this.g, 0);
        String string2 = string = new StringBuffer().append("*2").append(this.g).toString();
        if (bl.l < 30) {
            string2 = new StringBuffer().append(string).append("_C\u00f2n d\u01b0*2").append(bl.l).append("*0 l\u1ea7n").toString();
        }
        r2.b(new StringBuffer().append(string2).append("_\u1ea4n ph\u00edm /5 hu\u1ef7").toString());
        r2.a(r2.e(), r2.f());
        r2.b(av2.g - r2.e(), 0);
    }

    private void a(Vector vector) {
        for (int i2 = vector.size() - 1; i2 >= 0; --i2) {
            ((m)vector.elementAt(i2)).f();
        }
    }

    private void a(Graphics graphics, int n2, int n3, m m2) {
        int n4;
        int n5 = n4 = m2.e.size() - 1;
        if (n4 > 5) {
            n5 = 5;
        }
        while (n5 >= 0) {
            ((bf)((Object[])m2.e.elementAt(n5))[1]).a(graphics, n5 * 10 + n2, n3, 0);
            --n5;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(ar ar2, int n2, int n3) {
        ar2.a = (aw)((short)(ar2.a + ((n2 -= ar2.a) / 7 + n2 % 2)));
        ar2.b = (String)((short)(ar2.b + ((n3 -= ar2.b) / 7 + n3 % 2)));
        if (Math.abs(n2) >= 10) return false;
        if (Math.abs(n3) >= 10) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private boolean a(String object) {
        Object object2;
        boolean bl2;
        block14: {
            block21: {
                block20: {
                    block19: {
                        void var1_10;
                        block18: {
                            block17: {
                                block16: {
                                    block15: {
                                        bl2 = true;
                                        if (!((String)object).equals(a.s.a[106])) break block15;
                                        ad.a().a(null, 0, 0, 0);
                                        object2 = null;
                                        Object var1_2 = null;
                                        break block14;
                                    }
                                    if (!((String)object).equals(a.s.a[63])) break block16;
                                    object2 = new String[]{a.s.a[107], a.s.b[47], a.s.b[48], a.s.b[60], a.s.b[66], a.s.a[17], a.s.b[28], a.s.b[12]};
                                    Object var1_4 = null;
                                    break block14;
                                }
                                if (!((String)object).equals(a.s.b[52])) break block17;
                                a.a.a().a(null, 0, 0, 0);
                                object2 = null;
                                Object var1_5 = null;
                                break block14;
                            }
                            if (!((String)object).equals(a.s.b[73])) break block18;
                            if ((aa.a().b & 0x80000) != 0 || (aa.a().b & 0x200000) != 0) {
                                a.f.a(a.s.d[599]);
                                object2 = null;
                                Object var1_6 = null;
                                break block14;
                            } else if (a.w.b() > 0) {
                                this.a.b(null, -1, 0, 2);
                                object2 = null;
                                Object var1_7 = null;
                                break block14;
                            } else {
                                this.a.a((av)null);
                                object2 = null;
                                Object var1_8 = null;
                            }
                            break block14;
                        }
                        if (!((String)object).equals(a.s.b[92])) break block19;
                        byte by = ay.a.b();
                        if (by == 0) {
                            String[] stringArray = new String[]{a.s.a[78], a.s.a[68]};
                        } else if (by <= 4) {
                            String[] stringArray = new String[]{a.s.a[105], a.s.a[67], a.s.b[88], a.s.b[1], a.s.a[11], a.s.b[104], a.s.a[4], a.s.a[68], a.s.a[100]};
                        } else {
                            String[] stringArray = new String[]{a.s.a[105], a.s.a[67], a.s.b[88], a.s.a[11], a.s.b[104], a.s.a[4], a.s.a[68], a.s.a[100]};
                        }
                        object2 = var1_10;
                        Object var1_11 = null;
                        break block14;
                    }
                    if (!((String)object).equals(a.s.a[115])) break block20;
                    object2 = new String[]{a.s.b[79], a.s.b[53], a.s.b[86], "B\u1ea3ng x\u1ebfp h\u1ea1ng", a.s.b[159]};
                    if (ay.a.d() != 0 || ay.a.b() <= 59) break block21;
                    int[] nArray = new int[]{a.s.a[0], a.s.a[0], a.s.a[0], a.s.a[0], a.s.a[5]};
                    break block14;
                }
                if (((String)object).equals(a.s.a[31])) {
                    object2 = new String[]{a.s.b[103], a.s.b[69], a.s.b[67]};
                    Object var1_15 = null;
                    break block14;
                } else {
                    void var1_17;
                    if (!((String)object).equals(a.s.a[58])) {
                        return false;
                    }
                    object2 = ad.a();
                    if (ad.a().a() > 0) {
                        String string = a.s.a[12];
                    } else {
                        Object var1_19 = null;
                    }
                    ((ad)object2).a((String)var1_17);
                    object2 = null;
                    Object var1_18 = null;
                }
                break block14;
            }
            Object var1_20 = null;
        }
        if (object2 != null) {
            void var1_3;
            bb.a();
            bb.a(0, 0, 1, (int[])var1_3, (String[])object2, (av)this);
            return bl2;
        }
        bb.i();
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean a(boolean bl2) {
        boolean bl3 = false;
        Vector vector = new Vector();
        this.a.a(ay.k, vector, true);
        int n2 = 0;
        while (true) {
            if (n2 >= vector.size()) {
                if (!bl2) return bl3;
                return this.a(false);
            }
            bk bk2 = (bk)vector.elementAt(n2);
            if (bk2.r() == 200 && (this.g.equals(a.s.d[175]) || this.g.equals(bk2.a())) && this.w != bk2.a()) {
                this.w = bk2.a();
                aa.a((m)bk2, null);
                return true;
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(Graphics graphics) {
        int n2 = this.c[0];
        int n3 = this.c[1];
        this.a.a(graphics, n2, n3, 0);
        bl bl2 = ay.a;
        if (bl2 == null) {
            return;
        }
        this.a(graphics, n2, this.a((int)3028).b - 3 - 10, bl2);
        int n4 = bl2.b();
        int n5 = bl2.g(10);
        int n6 = bl2.g(11);
        int n7 = bl2.g(12);
        int n8 = bl2.g(13);
        int n9 = bl2.g(18);
        int n10 = bl2.g(19);
        short s2 = bl2.b();
        n3 = bl2.a(6) / 10;
        bg bg2 = this.b;
        n3 = n3 == 1 ? 0 : 8;
        bg2.c(n3 + s2);
        this.b.a(ac.a >> 1, ac.b, graphics);
        this.b.a(0);
        graphics.setColor(255, 255, 0);
        n3 = ac.a >> 1;
        graphics.setClip(n3 - 16, ac.b - 8 - n5 * 32 / n6, 19, 40);
        this.c.a(graphics, n3 - 16, ac.b - 40, 0);
        graphics.setClip(n3 - 3, ac.b - 8 - n7 * 32 / n8, 19, 40);
        this.d.a(graphics, n3 - 3, ac.b - 40, 0);
        graphics.setClip(n2 + 17, ac.b - 4, 206, 2);
        graphics.fillRect(n2 + 17, ac.b - 4, this.a(n9, n10, 206), 2);
        this.d.a(n4);
        this.d.a(graphics);
        if (bl2.a != null) {
            n3 = bl2.a.d();
            n8 = bl2.a.e();
            n2 = bl2.a.f();
            n6 = bl2.a.g();
            this.e.a(graphics, 0, 0, 0);
            al.a(graphics, 17, 8, 19, 3, n3, n8, a.s.a[3], 0x3E3E3E, false);
            al.a(graphics, 17, 14, 19, 3, n2, n6, a.s.a[8], 0x3E3E3E, false);
            this.e.a(bl2.a.b());
            this.e.a(graphics);
            new bf(6730000).a(graphics, 0, 2, 0);
        }
        al.b(graphics);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean b(String object) {
        boolean bl2 = true;
        if (((String)object).equals(a.s.a[107])) {
            this.a.a(null, 0, 0, new an(ay.a.a()));
            object = null;
        } else if (((String)object).equals(a.s.b[47])) {
            this.a.a(null, 0, 2, new an(ay.a.a()));
            object = null;
        } else if (((String)object).equals(a.s.b[48])) {
            ad.a().b(null, 1, 1);
            object = null;
        } else if (((String)object).equals(a.s.b[60])) {
            ad.a().e(null, 0);
            object = null;
        } else if (((String)object).equals(a.s.b[66])) {
            ad.a().f(null, 0);
            object = null;
        } else if (((String)object).equals(a.s.a[17])) {
            this.a.c(null, 1, 0);
            object = null;
        } else if (((String)object).equals(a.s.b[28])) {
            this.a.b(null, 3, 0);
            object = null;
        } else if (((String)object).equals(a.s.b[107])) {
            this.a.a(null, 0, 1, 0);
            object = null;
        } else if (((String)object).equals(a.s.b[12])) {
            object = this.a;
            int n2 = ay.a != null ? ay.a.a() : ay.a.a();
            ((au)object).a(null, 0, 0, n2);
            object = null;
        } else if (((String)object).equals(a.s.a[105])) {
            this.a.b(null, 0, 0);
            object = null;
        } else if (((String)object).equals(a.s.a[67])) {
            this.a.b(null, 0);
            object = null;
        } else if (((String)object).equals(a.s.b[88])) {
            object = new String[]{a.s.a[28], a.s.a[26], a.s.a[144]};
        } else if (((String)object).equals(a.s.b[1])) {
            ad.a().a(null, 5, 9, 0);
            object = null;
        } else if (((String)object).equals(a.s.a[11])) {
            this.a.b(null, 10, 0);
            object = null;
        } else if (((String)object).equals(a.s.b[104])) {
            this.a.b(null, 0, 0, 1);
            object = null;
        } else if (((String)object).equals(a.s.a[4]) || ((String)object).equals(a.s.a[78])) {
            this.a.a((av)null, 12);
            object = null;
        } else if (((String)object).equals(a.s.a[68])) {
            this.a.a((av)null, 2, 0);
            object = null;
        } else if (((String)object).equals(a.s.a[100])) {
            z.a().a(1107, new ba(3));
            object = null;
        } else if (((String)object).equals(a.s.b[79])) {
            this.a.a(null, 0);
            object = null;
        } else if (((String)object).equals(a.s.b[53])) {
            this.a.c(null, 0);
            object = null;
        } else if (((String)object).equals(a.s.b[86])) {
            ad.a(a.f.b(38), 0, 0, 0, 38002);
            z.a().a(1132, new ba(28));
            object = null;
        } else if (((String)object).equals("B\u1ea3ng x\u1ebfp h\u1ea1ng")) {
            ad.a().f(null, 1);
            object = null;
        } else if (((String)object).equals(a.s.b[159])) {
            object = a.f.b(38);
            z.a().a(1312, (af)new ba(11), new an(ay.a.a()));
            ((av)object).a(a.s.b[159]);
            ad.a((av)object, 0, 0, 0, 38002);
            object = null;
        } else if (((String)object).equals(a.s.b[103])) {
            this.a.c(null, 22, 0);
            object = null;
        } else if (((String)object).equals(a.s.b[69])) {
            this.a.b(null, 0, 0);
            object = null;
        } else {
            if (!((String)object).equals(a.s.b[67])) {
                return false;
            }
            this.a.b(null, 2, 0);
            object = null;
        }
        if (object != null) {
            bb.a();
            bb.a(0, 0, 1, null, (String[])object, (av)this);
            return bl2;
        }
        bb.i();
        return bl2;
    }

    public static void c(int n2, int n3) {
        c = new x(30, 24, 0, 0, 0);
        c.a(n2);
        ap.c.d = n3;
        c.b(ac.a - ap.c.g >> 1, ac.b - ap.c.h >> 1);
        a = System.currentTimeMillis();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(String string) {
        if (this.a(string)) {
            return;
        }
        if (this.b(string)) return;
        if (this.c(string)) return;
        if (this.d(string)) return;
        if (this.e(string)) return;
        if (!this.f(string)) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(Graphics graphics) {
        long l2 = System.currentTimeMillis();
        if (l2 - d > 400L) {
            short s2 = (short)(ac.b / 7 + 15);
            int n2 = ac.a / 24;
            int n3 = ac.a - a.stringWidth(a.s.a[62]) - n2;
            if (ad.a().a() > 0) {
                if (this.a(3003).a()) {
                    this.c(3003);
                } else {
                    this.b(3003);
                }
            } else {
                this.c(3003);
            }
            n2 = s2;
            if (!c.equals("")) {
                al.a(graphics, c, n3, (int)s2, a.s.a[3]);
                n2 = (short)(s2 + a.s.h);
            }
            if (!b.equals("")) {
                al.a(graphics, b, n3, n2, a.s.a[4]);
            }
            if (l2 - d > 800L) {
                d = l2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean c(String string) {
        boolean bl2 = false;
        if (string.equals(a.s.a[28])) {
            this.a.c(null, 31, 0, 0);
        } else if (string.equals(a.s.a[26])) {
            this.a.a(null, 2, 37);
        } else if (string.equals(a.s.a[144])) {
            this.a.c(null, 34, 0, 0);
        } else if (string.equals(a.s.b[87])) {
            a.u.a((short)228, 0, (short)0, (short)0, (short)0, ay.a.a());
        } else {
            if (!string.equals(a.s.b[40])) return bl2;
            this.a.a(null, 3);
        }
        bb.i();
        return true;
    }

    public static void cinitclone() {
        a = true;
        b = true;
        c = false;
        d = true;
        m = 6;
        n = -1;
        p = -1;
        q = 1;
        r = 1;
        a = new af[8];
        b = "";
        c = "";
        d = "";
        a = new x(5, 7, 2, 0, 0);
        b = new x(5, 7, 2, 0, 0);
        d = System.currentTimeMillis();
        c = (byte)-1;
        d = 0;
        s = 240;
        a = null;
        t = 0;
        a = null;
        b = 0L;
        a = null;
        f = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d(Graphics graphics) {
        try {
            if (a.k.b == -1) return;
            if (a == null) return;
            int n2 = a.getWidth();
            int n3 = a.getHeight();
            if (ay.a == null) {
                return;
            }
            bl bl2 = ay.a;
            int n4 = aa.a().a(bl2.d ? 1 : 0);
            int n5 = aa.a().b(bl2.e ? 1 : 0);
            int n6 = aa.a().a(bl2.q, (int)bl2.r);
            int n7 = n4 - n2;
            if (n7 < 0) {
                n4 = 0;
            } else {
                n4 = n7;
                if (n2 * 2 + n7 > ac.a) {
                    n4 = ac.a - n2 * 2;
                }
            }
            if ((n6 = n5 - n6 - n3 * 3 / 2) < 0) {
                n7 = 0;
            } else {
                n7 = n6;
                if (n3 * 2 + n6 > ac.b) {
                    n7 = ac.b;
                    n7 -= n3 * 2;
                }
            }
            graphics.setColor(0);
            graphics.fillRect(0, 0, (int)ac.a, n7);
            graphics.fillRect(0, n3 * 2 + n7, (int)ac.a, ac.b - (n3 * 2 + n7));
            graphics.fillRect(0, n7, n4, n3 * 2);
            graphics.fillRect(n2 * 2 + n4, n7, ac.a - (n2 * 2 + n4), n3 * 2);
            graphics.drawImage(a, n4, n7, 0);
            bg.a(graphics, a, 0, 0, n2, n3, 2, n4 + n2, n7, 0);
            bg.a(graphics, a, 0, 0, n2, n3, 1, n4, n7 + n3, 0);
            bg.a(graphics, a, 0, 0, n2, n3, 3, n4 + n2, n7 + n3, 0);
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
    private boolean d(int n2, int n3) {
        g g2 = this.a(3003);
        if (!g2.a()) return false;
        if (n2 <= g2.a) return false;
        if (n2 >= g2.a + 20) return false;
        if (n3 <= g2.b) return false;
        if (n3 >= g2.b + 16) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean d(String stringArray) {
        boolean bl2 = true;
        if (stringArray.equals(a.s.a[50])) {
            stringArray = new String[]{a.s.a[9], a.s.a[132]};
        } else if (a.s.b[17].equals(stringArray)) {
            this.a.d(0);
            stringArray = null;
        } else if (stringArray.equals(a.s.a[81])) {
            stringArray = new String[]{a.s.a[79], a.s.b[54], a.s.b[39]};
        } else if (stringArray.equals(a.s.a[119])) {
            z.a().a(1531, new t(7));
            stringArray = null;
        } else {
            if (!stringArray.endsWith(a.s.b[89])) {
                return false;
            }
            stringArray = ay.a.a(41) == 1 ? new String[]{a.s.a[133], a.s.a[82], a.s.d[443], a.s.b[198], a.s.a[147], a.s.b[170]} : new String[]{a.s.a[82], a.s.d[443], a.s.b[198], a.s.a[147], a.s.b[170]};
        }
        if (stringArray != null) {
            bb.a();
            bb.a(0, 0, 1, null, stringArray, (av)this);
            return bl2;
        }
        bb.i();
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e(Graphics graphics) {
        if (ay.a != null && a.w.b() > 0 && ay.x.size() > 1) {
            int n2 = ay.a.a();
            int n3 = ay.x.size();
            int n4 = 0;
            for (int i2 = 0; i2 < n3 && n4 < 4; ++i2) {
                af[] afArray = (af[])ay.x.elementAt(i2);
                if (afArray[0].b() == n2) continue;
                short s2 = ((ba)afArray[2]).a;
                int n5 = al.c(afArray[4].b());
                int n6 = al.c(afArray[3].b());
                int n7 = al.c(afArray[6].b());
                int n8 = al.c(afArray[7].b());
                int n9 = al.c(afArray[5].b());
                int n10 = n5;
                if (n5 > n6) {
                    n10 = n6;
                }
                if (n7 > n8) {
                    n7 = n8;
                }
                n5 = n4 * 33 + 30;
                int n11 = n4 * 0 + 0;
                this.f.a(graphics, n11 + 0, n5, 0);
                al.a(graphics, n11 + 22, n5 + 9, 26, 3, n10, n6, a.s.a[3], 0x3E3E3E, false);
                al.a(graphics, n11 + 22, n5 + 16, 26, 3, n7, n8, a.s.a[8], 0x3E3E3E, false);
                this.f.a(s2);
                this.f.b(n11 + 6, n5 + 25);
                this.f.a(graphics);
                new bf(this.d[(n9 - 1) % this.d.length] * 10000).a(graphics, n11 + 2, n5 + 5, 0);
                ++n4;
            }
        }
    }

    private boolean e() {
        boolean bl2 = false;
        String string = this.a.a(0);
        if (!string.equals("")) {
            this.c(string);
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean e(int n2) {
        byte by;
        if (n2 == 1789450000) {
            return this.e();
        }
        if (n2 / 1000 != 3) return false;
        switch (n2 % 1000) {
            case 21: {
                z.a().a(1132, (af)new ba(26), ay.a);
                break;
            }
            case 25: {
                z.a().a(1107, (af)new ba(30), (an)ay.a);
                break;
            }
            case 26: {
                z.a().a(1107, (af)new ba(25), (an)ay.a);
                break;
            }
            case 27: {
                z.a().a(1107, (af)new ba(40), (j)ay.a);
                break;
            }
            case 28: {
                z.a().a(1107, (af)new ba(41), (j)ay.a);
                break;
            }
            case 39: {
                ay.a.d(-1);
                return false;
            }
            case 40: {
                ay.a.b(true);
                return false;
            }
            case 46: {
                z.a().a(1403, new ba(18), new an(ad.a().a[1].b()), (an)ay.a, new an(0), new an(ad.a().a[4].b()), new t((byte)ad.a().a[5].b()), new an(ad.a().a[6].b()), new t((byte)ad.a().a[7].b()), new t((byte)ad.a().a[8].b()));
                ad.a().a = null;
                break;
            }
            case 6: {
                av av2 = a.f.a(1);
                af[] afArray = (af[])av2.a(2);
                afArray[2].a(0);
                if (av2.a(1003).a()) {
                    ((j)afArray[afArray.length - 1]).a(av2.a(1003).a());
                }
                z.a().a(afArray, 0);
                if (afArray[0].b() != 1023) return false;
                if (afArray[1].b() != 55) return false;
                ay.a.put(new Integer(afArray[3].b()), new Long(System.currentTimeMillis()));
                return false;
            }
            case 7: {
                z.a().a(1049, (af)new ba(1), (af)new t(0), new an(a.m.o()));
                ac.a(true, false);
                return false;
            }
            case 8: {
                z.a().a(1049, (af)new ba(1), (af)new t(1), new an(ay.a.a()));
                ac.a(true, false);
                return false;
            }
            case 10: {
                z.a().a(1023, new ba(9));
                z.a().a(1023, (af)new ba(11), new an(ay.a.a()));
                a.f.a(43);
                return false;
            }
            case 12: {
                this.a.f();
                return false;
            }
            case 14: {
                this.a.e(ay.a.a());
                return false;
            }
            case 9: {
                av av3 = a.f.a(1);
                if (av3 == null) return false;
                switch (((h)av3.a(1006)).f()) {
                    case 1: {
                        a.w.a().a("Chu\u1ea9n b\u1ecb \u0111\u1ed5i nh\u00e2n v\u1eadt.._*2", "", 125, 125, false, null, av3, null);
                        av3.a(1, new d(System.currentTimeMillis() + 10000L));
                        av3.a(9, new an(2));
                        av3.a(10, new j("Chu\u1ea9n b\u1ecb \u0111\u1ed5i nh\u00e2n v\u1eadt.._*2"));
                        av3.c(1004);
                        return false;
                    }
                    case 0: {
                        a.w.a().a("\u0110ang r\u1eddi kh\u1ecfi tr\u00f2 ch\u01a1i.._*2", "", 126, 126, false, null, av3, null);
                        av3.a(1, new d(System.currentTimeMillis() + 10000L));
                        av3.a(9, new an(1));
                        av3.a(10, new j("\u0110ang r\u1eddi kh\u1ecfi tr\u00f2 ch\u01a1i.._*2"));
                        av3.c(1004);
                        return false;
                    }
                    case 2: {
                        this.a.a(null, true, "M\u1edf th\u00eam kho\u00e1", "", new af[]{new an(1205), new ba(7)}).a("Thuy\u1ebft minh kho\u00e1 an to\u00e0n");
                        return false;
                    }
                }
                return false;
            }
            case 54: {
                av av4 = a.f.a(1);
                if (av4 == null) return false;
                by = ((h)av4.a(1006)).f() == 1 ? (byte)0 : 1;
            }
            case 29: {
                z.a().a(1157, (af)new ba(3), (af)new an(ay.a.a()), ay.a);
                break;
            }
            case 30: {
                a.w.c = true;
                return false;
            }
            case 31: {
                z.a().a(1158, (af)new t(6), (af)new an(ay.a.a()), ay.a);
                break;
            }
            case 41: {
                z.a().a(1518, new t(1));
                return false;
            }
            case 50: {
                this.a.b(1);
                return false;
            }
            case 52: 
            case 53: {
                z.a().a(1170, (af)new ba(0), ay.a, new t((byte)(n2 % 1000 - 52)));
                break;
            }
            case 55: {
                z.a().a(1176, (af)new t(4), ay.a);
            }
        }
        ay.a = null;
        return false;
        z.a().a(1175, (af)new t(1), new t(by));
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean e(String string) {
        if (string.equals(a.s.a[9])) {
            if (ay.a.b() >= 5) {
                this.a.a = new Vector[]{new Vector(), new Vector(), new Vector(), new Vector()};
                z.a().a(1508, new t(1));
                ac.a(true, false);
                ad.a().a(null, 2, 1, 0);
            } else {
                a.f.a("B\u1ea1n ph\u1ea3i l\u00ean \u0111\u01b0\u1ee3c lv 5 m\u1edbi v\u00e0o \u0111\u01b0\u1ee3c th\u01b0\u01a1ng th\u00e0nh\uff01");
            }
        } else if (string.equals(a.s.a[132])) {
            this.a.c();
        } else if (string.equals(a.s.a[79])) {
            this.a.d(1);
        } else if (string.equals(a.s.b[54])) {
            this.a.b(null, 0);
        } else if (string.equals(a.s.b[39])) {
            a.f.a(a.s.d[13]);
        } else if (string.equals(a.s.a[133])) {
            this.a.b(1);
        } else if (string.equals(a.s.a[82])) {
            ad.a().a((av)null);
        } else if (string.equals(a.s.d[443])) {
            bn.a(a.s.d[375], 100, 0, "", (bi)this);
        } else if (string.equals(a.s.b[198])) {
            this.a.b(null, 1, 0);
        } else if (string.equals(a.s.a[147])) {
            z.a().a(2032, new ba(0), new ba(0), new an(150000), new ba(0), new t(0), new t(102), new j(""));
        } else {
            if (!string.equals(a.s.b[170])) {
                return false;
            }
            a.f.a("", "", (int)(this.a + 9), -1, false, this, new String[]{"\u0110\u0103ng nh\u1eadp l\u1ea1i", "\u0110\u1ed5i nh\u00e2n v\u1eadt", "T\u00e0i kho\u1ea3n th\u00eam kho\u00e1"});
        }
        bb.i();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void f(Graphics graphics) {
        m m2 = a.m.a();
        if (m2 == null) {
            return;
        }
        int n2 = ac.a - 57;
        int n3 = m2.b();
        int n4 = m2.d();
        int n5 = m2.e();
        int n6 = m2.f();
        int n7 = m2.g();
        int n8 = m2.a() - 1;
        int n9 = n4;
        if (n4 > n5) {
            n9 = n5;
        }
        if (n6 > n7) {
            n6 = n7;
        }
        if ((n4 = m2.e.size() - 1) > 5) {
            n4 = 5;
        }
        while (true) {
            if (n4 < 0) {
                n4 = n2 - 80;
                this.g.a(graphics, n4, 0, 0);
                al.a(graphics, (n5 - n9) * 50 / n5 + (n4 + 6), 9, 50, 3, n9, n5, a.s.a[3], 0x3E3E3E, false);
                al.a(graphics, (n7 - n6) * 50 / n7 + (n4 + 6), 16, 50, 3, n6, n7, a.s.a[8], 0x3E3E3E, false);
                this.f.a(n3);
                this.f.b(n4 + 39, 22);
                this.f.a(graphics);
                if (n8 <= -1) return;
                new bf(this.d[n8 % this.d.length] * 10000).a(graphics, n4 + 59, 5, 0);
                return;
            }
            ((bf)((Object[])m2.e.elementAt(n4))[1]).a(graphics, n2 - n4 * 10 - 10, 32, 0);
            --n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean f(String string) {
        boolean bl2 = true;
        if (string.equals(a.s.a[2])) {
            this.a.a(null, 10, 0, new an(ay.a.a()));
        } else if (string.equals(a.s.a[23])) {
            this.a.a(ay.a.a(), ay.a.a());
        } else if (string.equals(a.s.a[12])) {
            ad.a().a(ay.a.a(), "");
        } else if (a.s.a[22].equals(string)) {
            if (ay.a != null) {
                this.a.a(new an(ay.a.a()));
            }
        } else if (string.equals(a.s.b[153])) {
            if (ay.a != null) {
                ad.a(ay.a.a(), 2);
            } else {
                ad.a().a(null, 5, 2, 0);
            }
        } else if (string.equals(a.s.a[20])) {
            if (ay.a != null) {
                z.a().a(1056, (af)new ba(1), new an(ay.a.a()));
            } else {
                ad.a().a(null, 5, 1, 0);
            }
        } else if (string.equals(a.s.a[72])) {
            if (ay.a != null) {
                this.a("", new StringBuffer().append(a.s.d[272]).append(ay.a.a()).toString(), (byte)21, (byte)22);
                ay.a = new an(ay.a.a());
            }
        } else if (string.equals(a.s.b[55])) {
            z.a().a(1132, (af)new ba(4), new an(ay.a.a()));
        } else {
            if (!string.equals(a.s.b[56])) {
                return false;
            }
            z.a().a(1132, (af)new ba(1), new an(ay.a.a()));
        }
        bb.i();
        return bl2;
    }

    private static void g(Graphics graphics) {
        if (c >= 0) {
            bf[] bfArray = new bf[]{new bf(6003), new bf(6004), new bf(6005)};
            int n2 = ac.a - 152 + 56 >> 1;
            bfArray[1].a(graphics, n2, 40, 0);
            al.a(graphics);
            int n3 = Math.abs(100 - c) * 56 / 100;
            graphics.setClip((n2 += 20) + n3, 40, 76 - n3, bfArray[0].d());
            bfArray[0].a(graphics, n2, 40, 0);
            al.c(graphics);
            bfArray[2].a(graphics, n2 + n3 - 2, (bfArray[0].d() - bfArray[2].d()) / 2 + 40, 0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void h(Graphics graphics) {
        if (c == null) return;
        int n2 = c.e();
        if (System.currentTimeMillis() - a > 1000L) {
            if (n2 > 0) {
                c.a(c.e() - 1);
                a += 1000L;
            } else if (ap.c.d == 9 || ap.c.d == 7 && bl.b.a() != 0) {
                c = null;
                return;
            }
        }
        c.a(graphics);
    }

    private void i(Graphics graphics) {
        if (a != null && a.e() > 0) {
            a.a(graphics);
        }
    }

    private void n() {
        for (int i2 = this.a.size() - 1; i2 >= 0; --i2) {
            ar ar2 = (ar)this.a.elementAt(i2);
            if (!this.a(ar2, ar2.d, (int)ar2.c)) continue;
            this.a.removeElement(ar2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void o() {
        long l2 = System.currentTimeMillis();
        if (e != 0L && l2 - e > 1000L) {
            ap.a(1000L, true);
        }
        if (ay.j.size() > 0) {
            ar ar2;
            int n2;
            Vector<ar> vector = new Vector<ar>();
            for (n2 = 3028; n2 <= 3035; ++n2) {
                ar2 = (ar)this.a(n2);
                if (ar2 == null || ar2.d != 131072 && ar2.d != 32) continue;
                vector.addElement(ar2);
            }
            for (n2 = ay.j.size() - 1; n2 >= 0; --n2) {
                af[] afArray = (af[])ay.j.elementAt(n2);
                long l3 = ((d)afArray[22]).a;
                if (l3 != 0L) {
                    int n3 = (int)(l2 - l3);
                    int n4 = afArray[13].b();
                    int n5 = Math.abs(n4) - n3;
                    if (afArray[1] != null) {
                        n3 = afArray[3] instanceof t ? 131072 : 32;
                        int n6 = afArray[3] instanceof t ? afArray[1].b() : afArray[3].b();
                        for (int i2 = vector.size() - 1; i2 >= 0; --i2) {
                            ar2 = (ar)vector.elementAt(i2);
                            if (ar2 == null || ar2.d != n3 || ar2.e != n6) continue;
                            if (n5 >= 0) {
                                ar2.b = n4 == -a.k.a ? (Object)ar2.h : (String)(ar2.h * n5 / n4);
                            } else {
                                ar2.b = (String)-1;
                                if (n4 != -a.k.a) {
                                    ar2.b(90000);
                                }
                            }
                            vector.removeElement(ar2);
                        }
                    }
                    if (n5 >= 0) continue;
                }
                afArray[13].a(0);
                afArray[22].a(0);
                ay.j.removeElement(afArray);
            }
        }
    }

    private void p() {
        this.b.c(0);
        this.b.a(1, true);
        this.a = new bf(4440000);
        this.c[0] = (ac.a - this.a.b()) / 2;
        this.c[1] = ac.b - this.a.d();
        for (int i2 = 0; i2 < 8; ++i2) {
            ar ar2 = (ar)this.a(i2 + 3028);
            ar2.b(this.c[0] + this.c[i2 + 3], this.c[1] + this.c[2]);
            ar2.a(ad.a(0, true));
        }
        ((x)this.a(3037)).b(this.c[0] + this.c[11], this.c[1] + this.c[2]);
        this.d.b(this.c[0] + this.c[12], this.c[1] + this.c[13]);
        this.e.b(4, 22);
        this.a(3008).b(ac.a - 5 - this.a((int)3008).g, ac.b - 32 - this.a((int)3008).h);
        this.a(3005).b(ac.a - 5 - this.a((int)3005).g, this.a((int)3008).b - this.a((int)3005).h - 6);
        this.a(3004).b(ac.a - 5 - this.a((int)3004).g, this.a((int)3005).b - this.a((int)3004).h - 6);
        this.a(3007).b(ac.a - 5 - this.a((int)3007).g, this.a((int)3004).b - this.a((int)3007).h - 6);
        this.a(3036).b(5, this.a((int)3008).b);
        this.a(3006).b(5, this.a((int)3005).b);
        this.a(3009).b(5, this.a((int)3004).b);
        a.b(16, 81);
        b.b(38, 81);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2) {
        if (n2 == 1) {
            int[] nArray;
            String string = a.s.a[106];
            String string2 = a.s.a[63];
            String string3 = a.s.b[52];
            String string4 = a.s.b[73];
            String string5 = a.s.b[92];
            String string6 = a.s.a[115];
            String string7 = a.s.a[31];
            String string8 = a.s.a[58];
            int[] nArray2 = nArray = null;
            if (ay.a.d() == 0) {
                nArray2 = nArray;
                if (ay.a.b() > 59) {
                    nArray2 = new int[]{a.s.a[0], a.s.a[0], a.s.a[0], a.s.a[0], a.s.a[0], a.s.a[5], a.s.a[0], a.s.a[0]};
                }
            }
            bb.a(-2, -2, 1, 0, nArray2, new String[]{string, string2, string3, string4, string5, string6, string7, string8}, this);
            return;
        }
        if (n2 == 2) {
            bb.a(-2, -2, 1, 0, new String[]{a.s.a[50], a.s.b[17], a.s.a[81], a.s.a[119], a.s.b[89]}, (av)this);
            return;
        }
        if (n2 == 3) {
            String[] stringArray = new String[]{a.s.a[2], a.s.a[23], a.s.a[12], a.s.a[22], a.s.b[153], a.s.a[20], a.s.a[72], a.s.b[12], ""};
            if (ay.a.b() >= bl.b % 10000) {
                stringArray[8] = a.s.b[56];
            } else if (bl.b / 10000 % 10 == 0) {
                stringArray[8] = a.s.b[55];
            }
            bb.a(-2, -2, 2, 0, stringArray, (av)this);
            return;
        }
        if (n2 == 4) {
            bb.a(-2, -2, 2, 0, new String[]{a.s.a[2], a.s.a[12], a.s.a[20]}, (av)this);
            return;
        }
        if (n2 != 5) return;
        bb.a(-2, -2, 2, 0, new String[]{a.s.a[2], a.s.a[12], a.s.b[153], a.s.a[20]}, (av)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(int n2, int n3, int n4, int n5) {
        Object object;
        boolean bl2;
        boolean bl3;
        Object object2;
        block49: {
            block50: {
                block48: {
                    object2 = null;
                    bl3 = false;
                    bl2 = false;
                    if (this.d != -1 && this.d != 3012 && n3 == a.s.a[6]) {
                        if (this.d == 3004) {
                            ad.d();
                            return;
                        }
                        if (this.d == 3005) {
                            this.a.a(0);
                            return;
                        }
                        if (this.d == 3009) {
                            this.a(1);
                            return;
                        }
                        if (this.d == 3006) {
                            this.a(2);
                            return;
                        }
                        if (this.d == 3007) {
                            ad ad2 = ad.a();
                            object2 = ad.a().a() > 0 ? a.s.a[12] : null;
                            ad2.a((String)object2);
                            return;
                        }
                        if (this.d == 3008) {
                            this.i();
                            return;
                        }
                        if (this.d == 3013) {
                            ay.a.b(true);
                            return;
                        }
                        if (this.d < 3028) return;
                        ad.a().a(this.d % 1000);
                        return;
                    }
                    try {
                        int n6;
                        if (ac.e / 10 == 64 || ac.e % 10 == 4) {
                            n4 = n2;
                            n5 = n3;
                            if (n3 != 0) {
                                n4 = n2;
                                n5 = n3;
                                if (n3 != a.s.a[2]) {
                                    n4 = n2;
                                    n5 = n3;
                                    if (n3 != a.s.a[3]) {
                                        n4 = n2;
                                        n5 = n3;
                                        if (n3 != a.s.a[4]) {
                                            if (n3 == a.s.a[5]) {
                                                n5 = n3;
                                                n4 = n2;
                                            } else {
                                                n5 = 0;
                                                n4 = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            int n7 = -1;
                            n6 = -1;
                            n3 = n5;
                            n2 = n4;
                            n5 = n7;
                            n4 = n6;
                        }
                        if (bl.l > 0) {
                            if (ac.e == a.s.a[14]) {
                                this.d(false);
                            } else if (System.currentTimeMillis() - this.f > 3000L && a.f.a(103) == null) {
                                this.f = System.currentTimeMillis();
                                this.a(true);
                            }
                        }
                        this.a.b();
                        this.n();
                        this.o();
                        object = ay.a;
                        if (object == null) return;
                        n6 = a.w.b();
                        this.a(ay.k);
                        this.a(ay.m);
                        ((e)object).f();
                        this.a(n2, n6, (bl)object);
                        if (bl.d && n6 == 0) {
                            this.a.g();
                        }
                        if (n6 == 1 && a.s.a && ay.x.size() < 9) {
                            this.a.h();
                        }
                        if (n3 != a.s.a[1]) break block48;
                        if (bl.l <= 0) {
                            ay.a = null;
                        }
                        this.a(1);
                        break block49;
                    }
                    catch (Exception exception) {
                        return;
                    }
                }
                if (n3 == a.s.a[6] && ac.e != a.s.a[14]) {
                    if (!ay.a.a(false)) {
                        this.i();
                        return;
                    }
                    if (this.d != 3012) return;
                    n2 = ((h)this.a(3012)).f();
                    if (n2 == 1) {
                        object2 = new StringBuffer();
                        a.f.a(((StringBuffer)object2).append("X\u00e1c nh\u1eadn ch\u1ecdn").append(((h)this.a(3012)).a()).toString(), "", this.a((byte)8), -1, false, this, null);
                        return;
                    }
                    z z2 = z.a();
                    ba ba2 = new ba(1);
                    object = new t((byte)n2);
                    object2 = new an(ay.a.a());
                    z2.a(1049, (af)ba2, (af)object, (af)object2);
                    ac.a(true, false);
                    return;
                }
                if (n3 != a.s.a[0]) break block50;
                if (bl.l <= 0 && ay.a.b != null) {
                    ay.a.b(true);
                    break block49;
                } else if ((bl.k & 0x10) != 0 && a.m.o() != -1 && a.m.o() != ay.a.a()) {
                    a.m.a(null);
                    break block49;
                } else {
                    if (bl.l <= 0) {
                        ay.a = null;
                    }
                    this.a(2);
                }
                break block49;
            }
            if (this.d == 3012) {
                this.a.a(n2, n3, n4, n5);
            }
        }
        if (n2 == 0 && n3 == 0 && ac.a(n4, n5)) {
            n2 = this.a(n4, n5);
            if (n2 != -1) {
                if (n2 == 9) {
                    if ((bl.k & 8) == 0) {
                        bl2 = true;
                    }
                    bl.b(8, bl2);
                } else {
                    bl2 = bl3;
                    if (n2 == 1) {
                        bl2 = true;
                    }
                    bl.b(8, bl2);
                }
                this.j();
            } else if (this.d(n4, n5)) {
                object = ad.a();
                if (ad.a().a() > 0) {
                    object2 = a.s.a[12];
                }
                ((ad)object).a((String)object2);
            } else if (al.a(n4, n5, 1, 20, 1, 20)) {
                object2 = this.a;
                object = new an(ay.a.a());
                ((w)object2).a(null, 0, 0, (af)object);
            } else if (a.m.a() != null && al.a(n4, n5, ac.a - this.b.b - 80, ac.a - this.b.b, 1, 30)) {
                ad.d();
            } else if (!(((bl)object).a(false) || this.d() || aa.a().a((int)(aa.a().h + n4), (int)(aa.a().i + n5)) || al.a(n4, n5, 0, (int)ac.a, (int)this.a((int)3028).b, (int)ac.b) || !((bl)object).d(false) || bl.c)) {
                a.k.b((m)object, (int)a.s.a[2]);
                bl.g = true;
                object2 = aa.a().c(n4, n5);
                ay.a.a(((az)object2).d, ((az)object2).e, false);
                aa.a().b(((az)object2).d, ((az)object2).e);
            }
        }
        this.e(false);
        if (System.currentTimeMillis() - this.c <= 30000L) return;
        this.c = System.currentTimeMillis();
        System.gc();
        this.a("", true);
    }

    /*
     * Unable to fully structure code
     */
    public void a(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        block8: {
            var9_7 = new ar("", 0, 0);
            if (this.a.size() > 0) {
                var7_8 = ((ar)this.a.lastElement()).a();
                var9_7.a = (aw)var7_8;
                if (var7_8 < 3999) {
                    ++var9_7.a;
lbl7:
                    // 2 sources

                    while (true) {
                        var9_7.e = var1_1;
                        var9_7.b = (String)(var2_2 * 10000);
                        var9_7.d = var5_5;
                        var9_7.c = (byte)var6_6;
                        var8_9 = this.a.size();
                        var7_8 = 0;
lbl14:
                        // 2 sources

                        while (true) {
                            var6_6 = var3_3;
                            var5_5 = var4_4;
                            if (var7_8 <= var8_9 - 1) {
                                var10_10 = (ar)this.a.elementAt(var7_8);
                                if (var10_10.a != var3_3 || var10_10.b != var4_4) break block8;
                                var5_5 = var3_3 + (var8_9 - var7_8) * 10;
                                var4_4 -= (var8_9 - var7_8) * 10;
                                var3_3 = var5_5;
                                if (var5_5 > ac.a) {
                                    var3_3 = ac.a;
                                }
                                var6_6 = var3_3;
                                var5_5 = var4_4;
                                if (var4_4 < 0) {
                                    var5_5 = 0;
                                    var6_6 = var3_3;
                                }
                            }
                            var9_7.a = (aw)((short)var6_6);
                            var9_7.b = (String)((short)var5_5);
                            var9_7.a(true);
                            var9_7.a(bc.b(var1_1));
                            var9_7.b(var2_2);
                            this.a.addElement(var9_7);
                            return;
                        }
                        break;
                    }
                }
            }
            var9_7.a = (aw)3100;
            ** while (true)
        }
        ++var7_8;
        ** while (true)
    }

    @Override
    public void a(int n2, bi bi2) {
        if (27 < n2 && n2 < 36) {
            this.d(n2 - 27 + 3028 - 1);
        }
        ad.a().a(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(int n2, g g2) {
        int n3 = g2.a();
        if (this.e(n2)) {
            return;
        }
        if (n3 == 3001) {
            this.d(false);
            return;
        }
        if (ay.a.b == null) return;
        ay.a.b(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(g afArray) {
        if (afArray.a() >= 3028 && (afArray = ay.b(afArray.a() % 1000, ay.a())) != null) {
            switch (afArray[0].b()) {
                default: {
                    break;
                }
                case 14: 
                case 15: 
                case 16: 
                case 17: {
                    short s2;
                    ac.d = s2 = (short)a.s.a[afArray[0].b() - 14 + 2];
                    ac.c = s2;
                }
            }
        }
        this.f(a.s.a[6], a.s.a[6]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(z object) {
        if (a.f.a(6) == null) {
            this.f = true;
        }
        if (!this.f) {
            return;
        }
        byte by = ((z)object).a(4);
        short s2 = ((z)object).a(5);
        String string = ((z)object).a(6);
        av av2 = a.f.a(6, (byte)1, new av(0, 0, 0, -1));
        switch (s2) {
            default: {
                return;
            }
            case 1: {
                this.a.a(0, (int)by, string, av2);
                return;
            }
            case 2: {
                this.a.a(3, (int)by, string, av2);
                return;
            }
            case 3: {
                this.a.a(2, (int)by, string, av2);
                s2 = ((z)object).a(3);
                if (s2 <= 0) return;
                ((n)av2.a(6005)).b(s2);
                return;
            }
            case 100: 
        }
        ac.a(false, false);
        this.f = false;
        this.a.a(1, (int)by, "", av2);
        a.f.a(50);
        if (av2.a()) return;
        object = a.f.b(6);
        this.a.i((av)object);
        ((av)object).a(d);
    }

    public void a(String charSequence, String string, byte by, byte by2) {
        charSequence = al.a(null, (String)charSequence);
        al.a((StringBuffer)charSequence, string);
        a.f.a(((StringBuffer)charSequence).toString(), "", (int)(this.a + by), (int)(this.a + by2), false, this, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(String string, boolean bl2) {
        if (a == null) {
            a = new r(ac.a - 1, 50, 1000, 128, -1);
        }
        int n2 = q;
        if (a.g() != n2) {
            a.a(n2);
        }
        if (!bl2) {
            a.a(string);
            a.c(n2);
        } else {
            a.b(0);
        }
        n2 = a.f();
        a.a(0, n2);
        a.b(0, ac.b - n2 - 50);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(String object, String[] object2) {
        r r2 = (r)this.a(3011);
        if (r2 == null) {
            if (object2 == null) return;
            this.a = new String[((Object)object2).length + 1];
            this.a[0] = object;
            System.arraycopy(object2, 0, this.a, 1, ((Object)object2).length);
            return;
        }
        if (ay.a.a(false) && (r2.f() > 0 || object2 != null)) {
            this.c(3010, false);
            this.c(3011, false);
            this.c(3012, true);
        }
        if (object == null) return;
        r2.d();
        r2.b((String)object);
        r2.a(0, r2.f());
        object = (h)this.a(3012);
        ((h)object).a(0);
        ((g)object).a(0, ((h)object).o * ((Object)object2).length);
        ((h)object).a((String[])object2);
        object2 = this.a(3010);
        ((g)object2).h = r2.h + ((h)object).h + 15;
        ((g)object2).b(0, ac.b - ((g)object2).h >> 1);
        r2.b(0, ((g)object2).b + 5);
        short s2 = r2.b;
        ((g)object).b(0, r2.h + s2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(Graphics graphics) {
        int n2;
        try {
            aa.a().a(graphics);
            if (aa.a) {
                return;
            }
            this.d(graphics);
            this.e(graphics);
            this.f(graphics);
            ap.g(graphics);
            n2 = al.a(graphics, ay.n);
            ap.a(System.currentTimeMillis());
            al.a(graphics, f, ac.a - a.s.a.stringWidth(f), n2, 65280, 0);
            this.c(graphics);
            this.b(graphics);
            super.a(graphics);
            for (n2 = 0; n2 < this.a.size(); ++n2) {
                ((ar)this.a.elementAt(n2)).a(graphics);
            }
        }
        catch (Exception exception) {
            return;
        }
        {
            this.i(graphics);
            g g2 = this.a(3003);
            if (g2 != null && g2.a()) {
                al.a(ay.a, 0, (int)g2.a, g2.b + 15, graphics);
            }
            a.k.a(graphics);
            this.h(graphics);
            if (this.d == -1) return;
            if (this.d == 3012) return;
            graphics.setColor(0xFF0000);
            g2 = this.a((int)this.d);
            al.b(graphics);
            graphics.drawRect((int)g2.a, (int)g2.b, g2.g, g2.h);
            graphics.drawRect(g2.a + 1, g2.b + 1, g2.g - 2, g2.h - 2);
            n2 = this.a(3012).a() ? 3012 : -1;
            this.d(n2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(int n2, boolean bl2) {
        int n3;
        int n4 = n3 = ay.a(n2);
        if (n3 > 99) {
            n4 = 99;
        }
        n3 = 7;
        while (n3 >= 0) {
            Object object = (ar)this.a(n3 + 3028);
            if (object != null && ((ar)object).d == 32 && ((ar)object).e == n2) {
                ((ar)object).n = n4;
                if (n4 == 0) {
                    object = ((ar)object).a();
                    this.a(n3 + 3028, (bf)object, ((bf)object).a % 10000000 + 90000000);
                } else if (!bl2) {
                    this.a((ar)object, false);
                }
            }
            --n3;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(int n2, int n3) {
        if (!this.c(n2, n3)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(boolean bl2) {
        if (bl2 && ay.a.b != null && ((Vector)((Object)ay.a.b)).size() > 0) {
            int n2;
            q q2 = (q)this.a(3013);
            int n3 = ((Vector)((Object)ay.a.b)).size();
            if (n3 - (n2 = ay.a.p) < 0) return;
            this.b(3013);
            q2.a(new ar("\u0110ang d\u1eabn \u0111\u01b0\u1eddng", a.s.a[6], 0), 0);
            ar ar2 = new ar("", q2.d(0), 12, 0, 0);
            ar2.m = (n2 - n3) * 100 / n2 * 10;
            q2.a(ar2, 1);
            q2.a(new ar("\u1ea4n hu\u1ef7", a.s.a[6], 0), 2);
            return;
        }
        this.c(3013);
    }

    @Override
    public boolean c() {
        this.a.b(0, true);
        ad.a().j = null;
        String[] stringArray = new x(11, 16, 3, 8, "0");
        stringArray.a = (bf[])3037;
        stringArray.a(9);
        this.c((g)stringArray);
        this.b(3037);
        super.c();
        this.e();
        this.p();
        this.j();
        this.e(true);
        if (a == null) {
            a = al.a(40, 40, 0);
        }
        if (this.a != null) {
            stringArray = new String[this.a.length - 1];
            System.arraycopy(this.a, 1, stringArray, 0, this.a.length - 1);
            this.a(this.a[0], stringArray);
            this.a = null;
        }
        return true;
    }

    public void d() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public void d(boolean bl2) {
        int n2 = 1;
        if (!bl2) {
            a.m.b = false;
            ay.a.b(true);
            this.c(3001);
            if (bl.l <= 0) {
                return;
            }
            bl.l = 0;
        } else {
            this.a((av)this, 3001);
            if (bl.l > 0) return;
            bl.l = 30;
        }
        z z2 = z.a();
        t t2 = new t(16);
        if (!bl2) {
            n2 = 0;
        }
        z2.a(1040, (af)t2, new an(n2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean d() {
        g g2 = this.a(3013);
        if (g2 == null) return false;
        if (!g2.a()) return false;
        return true;
    }

    public void e() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public void e(boolean bl2) {
        if (ay.a == null) {
            return;
        }
        if (!ay.a.c(false)) {
            if (!bl2) return;
        }
        a.a(ay.a.q);
        b.a((int)ay.a.r);
        af[] afArray = ay.n;
        if (afArray == null) return;
        if (afArray.size() <= 0) return;
        afArray = (af[])afArray.elementAt(0);
        az az2 = aa.a().a(ay.a.q, (int)ay.a.r);
        az2 = this.a.a(az2);
        afArray[1] = new an(az2.d);
        afArray[2] = new an(az2.e);
    }

    public void f() {
        for (int i2 = 3028; i2 <= 3035; ++i2) {
            ar ar2 = (ar)this.a(i2);
            if (ar2 == null || ar2.d != 131072 && ar2.d != 32) continue;
            this.a(ar2, false);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void g() {
        Object object = (ar)this.a(3008);
        if (object == null) {
            return;
        }
        bf bf2 = ((ar)object).a();
        if (bf2 == null) {
            bf2 = new bf(40006);
            ((ar)object).a(bf2);
        }
        object = a.m.a();
        if (object != null && ((m)object).j != 1) {
            if (((m)object).c() > 0) {
                bf2.a(40005);
                return;
            }
            bf2.a(40002);
            return;
        }
        bf2.a(40006);
    }

    public void h() {
        a.e.b = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void i() {
        block6: {
            m m2;
            block7: {
                m2 = a.m.a();
                if (m2 == null || m2.j == 1) break block6;
                switch (m2.j) {
                    case 64: {
                        if (m2.a(false)) {
                            if (m2.c() > 0) {
                                a.f.a(new StringBuffer().append("B\u1ea1n c\u00f3 mu\u1ed1n gi\u00fap \u0111\u1ee1 [*6").append(m2.a()).append("]*0 kh\u00f4ng?").toString(), "", this.a((byte)7), -1, false, this, null);
                                break;
                            }
                            a.k.a(a.s.d[11]);
                            break;
                        }
                        break block7;
                    }
                    case 2: 
                    case 8: {
                        if (m2.c() != 0 || !m2.a(false)) break block7;
                        a.k.a(a.s.d[11]);
                    }
                }
                return;
            }
            aa.a(m2, null);
            return;
        }
        this.a.e = 0;
        this.a.a(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void j() {
        Vector vector = ay.a();
        int n2 = 0;
        while (true) {
            block8: {
                g g2;
                af[] afArray;
                block10: {
                    int n3;
                    block9: {
                        int n4;
                        if (n2 >= vector.size()) {
                            return;
                        }
                        afArray = (af[])vector.elementAt(n2);
                        if (afArray[1].b() < 28 || afArray[1].b() > 35 || (g2 = this.a(afArray[1].b() + 3000)) == null || g2.b != 2) break block8;
                        g2 = (ar)g2;
                        ((ar)g2).d = -1;
                        ((ar)g2).e = -1;
                        ((ar)g2).b = (String)-1;
                        ((ar)g2).n = 0;
                        g2.a(128, true);
                        ((ar)g2).a(ad.a(afArray[0].b(), true));
                        n3 = afArray[0].b() / 1000000;
                        if (n3 != 8) break block9;
                        ((ar)g2).d = 32;
                        n3 = n4 = ay.a(afArray[3].b());
                        if (n4 > 99) {
                            n3 = 99;
                        }
                        if (n3 > 1) {
                            ((ar)g2).n = n3;
                        }
                        break block10;
                    }
                    if (n3 != 9 || ay.a(afArray[3].b(), ay.h) == null) break block8;
                    ((ar)g2).d = 131072;
                }
                ((ar)g2).e = afArray[3].b();
                this.a((ar)g2, false);
            }
            ++n2;
        }
    }

    public void k() {
        r r2 = (r)this.a(3011);
        if (r2 != null) {
            this.c(3010);
            this.c(3011);
            r2.d();
            this.c(3012);
        }
    }
}

