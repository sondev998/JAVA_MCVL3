/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Static;
import a.aa;
import a.ac;
import a.af;
import a.ah;
import a.ai;
import a.aj;
import a.al;
import a.am;
import a.an;
import a.ap;
import a.as;
import a.av;
import a.ax;
import a.ay;
import a.b;
import a.ba;
import a.bc;
import a.bf;
import a.bg;
import a.bi;
import a.bk;
import a.bl;
import a.e;
import a.f;
import a.g;
import a.h;
import a.i;
import a.j;
import a.k;
import a.m;
import a.s;
import a.t;
import a.u;
import a.w;
import a.z;
import java.io.DataInputStream;
import java.util.Vector;
import lib.Class;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bb
implements bi {
    public static byte a;
    public static long a;
    public static bb a;
    public static boolean a;
    public static byte[] a;
    public static byte b;
    public static long b;
    public static boolean b;
    public static byte c;
    public static boolean c;
    public static byte d;
    public static boolean d;
    public static boolean f;
    public int a;
    public aj a;
    public Vector a = 0;
    public int b;
    public aj b = 20;
    private int c = 0;
    public boolean e;

    static {
        Static.regClass(15);
        bb.cinitclone();
    }

    public bb() {
        this.a();
        this.a = new Vector();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int a() {
        Object object;
        int n2 = 0;
        try {
            object = new String(new byte[]{106, 97, 118, 97, 46, 97, 112, 112, 108, 101, 116, 46, 65, 112, 112, 108, 101, 116});
            object = Class.aorName((String)object);
            if (object != null) {
                n2 = 1;
            }
        }
        catch (Exception exception) {}
        int n3 = n2;
        if (n2 == 0) {
            try {
                object = new String(new byte[]{101, 109, 117, 108, 97, 116, 111, 114, 46, 69, 109, 117, 108, 97, 116, 111, 114});
                object = Class.aorName((String)object);
                n3 = n2;
                if (object != null) {
                    n3 = n2 | 2;
                }
            }
            catch (Exception exception) {
                n3 = n2;
            }
        }
        n2 = n3;
        if (n3 == 0) {
            n2 = n3;
            if (Runtime.getRuntime().totalMemory() == 8888888L) {
                n2 = n3 | 4;
            }
        }
        if (n2 != 0) {
            object = new am();
            ((am)object).a(1311);
            ((am)object).b(8);
            ((am)object).d(n2);
            bb.a().b(((am)object).a());
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(int n2, int n3, bg object) {
        String string;
        int n4;
        if (object == null) {
            return 0;
        }
        if (3 == n3) {
            ((bg)object).a(2, false);
            n4 = 1;
        } else {
            n4 = n3;
            if (1 == n3) {
                ((bg)object).a(2, true);
                n4 = n3;
            }
        }
        if ((string = ((bg)object).a(n2 * 100 + n4)) != null) {
            return Integer.parseInt(string);
        }
        if (n2 >= 20 && n2 <= 61 && (string = ((bg)object).a((n2 % 2 + 20) * 100 + n4)) != null) {
            return Integer.parseInt(string);
        }
        if ((object = ((bg)object).a(n4)) == null) return 0;
        return Integer.parseInt((String)object);
    }

    public static bb a() {
        if (a == null) {
            a = new bb();
        }
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bg a(int n2, m m2) {
        int n3 = n2 / 1000;
        if (n2 == 0 && m2 == null) {
            return null;
        }
        bg bg2 = bg.b(n3 * 10000, 0);
        bg.a(bg2, 0, n2 % 1000 * 10000);
        bg.a(bg2, 1, 0);
        bg.a(bg2, 2, 0);
        bg.a(bg2, 3, 0);
        bg.a(bg2, 4, 0);
        bg bg3 = bg2;
        if (m2 == null) return bg3;
        m2.a = bg2;
        return bg2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static bg a(int n2, boolean bl2, m m2) {
        bg bg2;
        block7: {
            bg bg3;
            int n3;
            int n4;
            block6: {
                block8: {
                    n4 = n2 / 1000;
                    n3 = n2 % 1000 * 10000;
                    bg3 = null;
                    if (n2 != 0) break block6;
                    bg2 = bg3;
                    n2 = n3;
                    if (m2 == null) break block7;
                    n4 = m2.c();
                    if (n4 / 100000 == 1) break block8;
                    bg2 = bg3;
                    n2 = n3;
                    if (n4 / 100000 != 2) break block7;
                }
                bg2 = bg.b(m.d(n4 / 10000), 1);
                n2 = n3;
                break block7;
            }
            bg2 = bg3 = bg.b(n4 * 10000, 0);
            n2 = n3;
            if (bg3 == null) {
                bg2 = bg.b(8000000, 0);
                n2 = 8000000;
            }
        }
        if (bg2 != null) {
            bg.a(bg2, n2, bl2);
            if (m2 != null) {
                bg.a(m2.a, bg2, (int)a.e.c);
                m2.a = bg2;
                bg2.a(m2.e(m2.f), 0);
                bg2.a(1, true);
                if (m2 instanceof e && m2.f(64)) {
                    ((e)m2).c();
                }
            }
        }
        return bg2;
    }

    private static void a(int n2, int n3) {
        int n4 = 0;
        while (n4 < ay.m.size()) {
            e e2 = (e)ay.m.elementAt(n4);
            if (Math.abs(n2 - e2.q) > 18 || Math.abs(n3 - e2.r) > 18) {
                ay.a(e2.a(), e2);
                continue;
            }
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(int n2, int n3, int n4, int n5, int[] object, String[] stringArray, av av2) {
        int n6;
        int n7;
        int n8 = 45;
        for (n7 = 0; n7 < stringArray.length; ++n7) {
            n6 = n8;
            if (n8 - 30 < av.a.stringWidth(stringArray[n7])) {
                n6 = av.a.stringWidth(stringArray[n7]) + 30;
            }
            n8 = n6;
        }
        s.e = av2.a() / 1000;
        av2 = a.f.b(n5 + 28);
        av2.a += n5 * 1000;
        h h2 = (h)av2.a(28001);
        h2.a(68, true);
        int n9 = h.a(stringArray);
        n6 = n7 = n9 / n4;
        if (n9 % n4 > 0) {
            n6 = n7 + 1;
        }
        h2.c(n8, 25);
        h2.g = n8 * n4;
        h2.h = n6 * 25;
        h2.a(stringArray);
        if (object != null) {
            h2.a(256, true);
            h2.a((int[])object);
        }
        n4 = n2;
        n8 = n3;
        if (n5 > 0) {
            object = (h)a.f.a((int)(n5 + 28 - 1)).a;
            if (n2 == -1) {
                n4 = ((h)object).d(0);
                n8 = ((h)object).e(0);
            } else {
                n4 = n2;
                n8 = n3;
                if (n2 != -2) {
                    n4 = ((h)object).d(-1) + (((h)object).n >> 1) + 10;
                    n8 = ((h)object).e(-1);
                }
            }
        }
        h.a(h2);
        if (n4 == -2 || n8 == -2) {
            n5 = (ac.a - h2.g) / 2;
            n2 = (ac.b - h2.h) / 2;
        } else {
            n5 = n4;
            n2 = n8;
            if (n8 < 5) {
                n2 = ac.b - h2.h;
                n5 = n4;
            }
        }
        n3 = n5;
        if (h2.g + n5 > ac.a) {
            n3 = n4 = n5 - h2.g;
            if (n4 < 0) {
                n3 = (ac.a >> 1) - (h2.g >> 1);
            }
        }
        n4 = n2;
        if (h2.h + n2 > ac.b - 20) {
            n4 = n2 = ac.b - 20 - h2.h;
            if (n2 < 0) {
                n4 = (ac.b >> 1) - (h2.h >> 1);
            }
        }
        h2.e();
        h2.a = (bf)((short)n3);
        h2.b = (Vector)((short)n4);
        av2.d(28001);
    }

    public static void a(int n2, int n3, int n4, int n5, String[] stringArray, av av2) {
        bb.a(n2, n3, n4, n5, null, stringArray, av2);
    }

    public static void a(int n2, int n3, int n4, int[] nArray, String[] stringArray, av av2) {
        if (stringArray != null) {
            av av3 = a.f.a(28);
            av av4 = a.f.a(29);
            if (av4 != null) {
                av3 = av4;
            }
            if (av3 != null) {
                bb.a(n2, n3, n4, (int)(av3.a / 1000 - 27), nArray, stringArray, av2);
                if (n2 == -1 || n2 == -2) {
                    av3.a(false);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(String string, boolean bl2) {
        ac.a(false, false);
        if (bb.a().b != null) {
            bb.a().b.e();
            bb.a().b.d();
            bb.a().b.b = 0;
        }
        a.f.a(0);
        av av2 = a.f.a(2, (byte)2, new av(0, 0, 0, -1));
        String string2 = s.d[351];
        String string3 = s.d[352];
        String string4 = s.c[4];
        if (bl2) {
            a.f.a(string, "", (int)(av2.a + 4), -1, false, av2, new String[]{string2, string3, string4});
        } else if (!string.equals("")) {
            a.f.a(string);
        }
        ay.a(true);
        bb.a().a(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(String[] stringArray, av av2) {
        int n2;
        int n3;
        int n4 = 1;
        g g2 = av2.a(av2.f());
        if (g2 != null) {
            n3 = g2.b();
            n2 = g2.c();
        } else {
            n2 = 1;
            n3 = 1;
        }
        if (stringArray.length >= 6) {
            n4 = 2;
        }
        bb.a(n3, n2, n4, 0, stringArray, av2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(bk bk2) {
        int n2 = bk2.r();
        ac.a(true, false);
        switch (n2) {
            default: {
                return true;
            }
            case 1: 
            case 2: 
            case 3: 
            case 9: 
            case 10: 
            case 38: 
            case 200: 
            case 201: 
            case 204: 
        }
        u.a(0, bk2.a(), bk2.q, (short)bk2.r, (short)0);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(bl bl2) {
        boolean bl3 = true;
        if (!bl2.c(true)) return false;
        z.a().a(1005, (af)new an(bl2.a()), (af)new an(bl2.e * 1000000 + 0 + bl2.q * 1000 + bl2.r), new an(aa.a().a));
        bb.a(bl2.q, bl2.r);
        boolean bl4 = bl3;
        if (b) return bl4;
        b = true;
        bb.g();
        return bl3;
    }

    public static void cinitclone() {
        a = 0;
        a = true;
        b = 0;
        b = false;
        c = false;
        d = true;
        c = 0;
        b = System.currentTimeMillis();
        a = new byte[]{115, 111, 99, 107, 101, 116, 58, 47, 47, 49, 50, 55, 46, 48, 46, 48, 46, 49, 58, 49, 51, 53};
        f = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void g() {
        block5: {
            am am2;
            block4: {
                if (i.a == 2) break block4;
                if (f) break block5;
                f = true;
                am2 = aj.a(new String(a));
                if (am2 != null) {
                    i.a = (byte)2;
                }
                aj.a(am2);
            }
            am2 = new am();
            am2.a(1074);
            am2.b(i.a);
            bb.a().b(am2.a());
        }
    }

    public static void i() {
        for (int i2 = 0; i2 < 3; ++i2) {
            a.f.a(i2 + 28);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void j() {
        long l2 = 1L;
        try {
            StringBuffer stringBuffer = al.a(null, (long)ap.q);
            al.a(stringBuffer, "|");
            long l3 = w.c ? 1L : 0L;
            al.a(stringBuffer, l3);
            al.a(stringBuffer, "|");
            l3 = ap.c ? 1L : 0L;
            al.a(stringBuffer, l3);
            al.a(stringBuffer, "|");
            l3 = ap.a ? 1L : 0L;
            al.a(stringBuffer, l3);
            al.a(stringBuffer, "|");
            al.a(stringBuffer, (long)ap.r);
            al.a(stringBuffer, "|");
            al.a(stringBuffer, (long)bl.k);
            al.a(stringBuffer, "|");
            l3 = ap.b ? 1L : 0L;
            al.a(stringBuffer, l3);
            al.a(stringBuffer, "|");
            al.a(stringBuffer, (long)ap.m);
            al.a(stringBuffer, "|");
            al.a(stringBuffer, (long)ap.n);
            al.a(stringBuffer, "|");
            al.a(stringBuffer, (long)m.g);
            al.a(stringBuffer, "|");
            al.a(stringBuffer, (long)m.g);
            al.a(stringBuffer, "|");
            l3 = ap.d ? 1L : 0L;
            al.a(stringBuffer, l3);
            al.a(stringBuffer, "|");
            al.a(stringBuffer, (long)al.a);
            al.a(stringBuffer, "|");
            l3 = bl.e ? l2 : 0L;
            al.a(stringBuffer, l3);
            a.b.a(s.e, 1, stringBuffer.toString());
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void k() {
        try {
            String[] stringArray = a.b.a(s.e, 1);
            if (stringArray != null) {
                stringArray = al.a((String)stringArray, "|");
                ap.q = Integer.parseInt(stringArray[0]);
                w.c = stringArray[1].equals("1");
                ap.c = stringArray[2].equals("1");
                ap.a = stringArray[3].equals("1");
                ap.r = Integer.parseInt(stringArray[4]);
                bl.k = Integer.parseInt(stringArray[5]);
                ap.b = stringArray[6].equals("1");
                ap.m = Integer.parseInt(stringArray[7]);
                ap.n = Integer.parseInt(stringArray[8]);
                m.g = Integer.parseInt(stringArray[10]);
                ap.d = stringArray[11].equals("1");
                m.g = (byte)Integer.parseInt(stringArray[9]);
                al.a = (byte)Integer.parseInt(stringArray[12]);
                bl.e = stringArray[13].equals("1");
            }
        }
        catch (Exception exception) {
            bb.j();
        }
        if (ap.n != -1) {
            ap.m = ap.n;
        }
        ap.a().e();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void l() {
        StringBuffer stringBuffer;
        try {
            stringBuffer = al.a(null, (long)ap.a[0].b());
            for (int i2 = 1; i2 < ap.a.length; ++i2) {
                al.a(stringBuffer, "|");
                al.a(stringBuffer, ap.a[i2].toString());
            }
        }
        catch (Exception exception) {
            return;
        }
        a.b.a(s.h, 1, stringBuffer.toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void m() {
        int n2;
        String[] stringArray = a.b.a(s.h, 1);
        if (stringArray != null) {
            stringArray = al.a((String)stringArray, "|");
            for (n2 = 0; n2 < stringArray.length; ++n2) {
                ap.a[n2] = n2 == 1 || n2 == 5 ? new j(stringArray[n2]) : new an(Integer.parseInt(stringArray[n2]));
            }
            return;
        }
        for (n2 = 0; n2 < ap.a.length; ++n2) {
            ap.a[n2] = n2 == 1 || n2 == 5 ? new j("Kh\u00f4ng") : new an(0);
        }
    }

    public int a(int n2) {
        av av2 = a.f.a(n2 % 10 + 28);
        int n3 = -1;
        if (av2 != null) {
            n3 = ((h)av2.a(28001)).f();
        }
        if (n2 >= 10) {
            bb.i();
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String a() {
        int n2;
        void var4_20;
        as as2;
        CharSequence charSequence;
        int n3;
        block13: {
            n3 = 0;
            charSequence = "";
            String string3 = charSequence;
            string3 = charSequence;
            string3 = charSequence;
            StringBuffer stringBuffer = new StringBuffer();
            String string4 = charSequence;
            as2 = new as(stringBuffer.append(s.c[0]).append("start.o").toString());
            String string5 = charSequence;
            String string6 = charSequence;
            if (!as2.a()) break block13;
            String string7 = charSequence;
            try {
                c = true;
                return "";
            }
            catch (Exception exception) {
                void var3_16;
                return var3_16;
            }
        }
        while (true) {
            charSequence = var4_20;
            if (as2 == null) return charSequence;
            charSequence = var4_20;
            void var3_10 = var4_20;
            if (!as2.b()) return charSequence;
            n2 = n3 + 1;
            charSequence = var4_20;
            if (n2 != 1) break block14;
            void var3_12 = var4_20;
            var3_12 = var4_20;
            break;
        }
        {
            block14: {
                charSequence = new StringBuffer();
                void var3_13 = var4_20;
                charSequence = ((StringBuffer)charSequence).append((String)var4_20).append(as2.a()).toString();
            }
            String string = charSequence;
            n3 = n2;
            if (n2 != 2) continue;
            CharSequence charSequence2 = charSequence;
            s.k = as2.a();
            CharSequence charSequence3 = charSequence;
            n3 = n2;
            continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public String a(int n2) {
        Object object = null;
        int n3 = 2;
        while (true) {
            if (n3 <= -1 || (object = a.f.a(n3 + 28)) != null) {
                object = object != null ? ((av)object).a(28001).a() : "";
                if (n2 >= 10) {
                    bb.i();
                }
                return object;
            }
            --n3;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String a(String var1_1, boolean var2_2) {
        block21: {
            block20: {
                var3_3 = 0;
                var5_4 = "";
                var4_6 /* !! */  = var5_4;
                var4_6 /* !! */  = var5_4;
                var4_6 /* !! */  = var5_4;
                var6_8 = new StringBuffer();
                var4_6 /* !! */  = var5_4;
                var7_7 = new as(var6_8.append(s.c[0]).append("connect_b.o").toString());
                block15: while (true) {
                    var6_8 = var5_4;
                    if (var7_7 == null) break block20;
                    var4_6 /* !! */  = var5_4;
                    var6_8 = var5_4;
                    if (!var7_7.b()) break block20;
                    var4_6 /* !! */  = var5_4;
                    var4_6 /* !! */  = var5_4;
                    var6_8 = new StringBuffer();
                    var4_6 /* !! */  = var5_4;
                    var6_8 = var6_8.append((String)var5_4).append(Integer.toString(var7_7.a())).toString();
                    if (var3_3 != 3) break;
                    var4_6 /* !! */  = var6_8;
                    var4_6 /* !! */  = var6_8;
                    var5_4 = new StringBuffer();
                    var4_6 /* !! */  = var6_8;
                    var5_4 = var5_4.append((String)var6_8).append(":").toString();
lbl33:
                    // 3 sources

                    while (true) {
                        ++var3_3;
                        continue block15;
                        break;
                    }
                    break;
                }
                var5_4 = var6_8;
                if (var3_3 >= 3) ** GOTO lbl33
                var4_6 /* !! */  = var6_8;
                var4_6 /* !! */  = var6_8;
                var5_4 = new StringBuffer();
                var4_6 /* !! */  = var6_8;
                try {
                    var5_4 = var5_4.append((String)var6_8).append(".").toString();
                    ** continue;
                }
                catch (Exception var5_5) {
                    var6_8 = var4_6 /* !! */ ;
                }
            }
            if (!var6_8.equals("")) {
                var4_6 /* !! */  = var6_8;
                if (var2_2) {
                    var4_6 /* !! */  = new StringBuffer().append(var1_1).append((String)var6_8).toString();
                }
lbl53:
                // 5 sources

                return var4_6 /* !! */ ;
            }
            if (!var2_2) break block21;
            var4_6 /* !! */  = "http://180.169.17.16:13012";
            ** GOTO lbl53
        }
        var4_6 /* !! */  = "180.169.17.16:13012";
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a() {
        if (this.b != null) {
            this.b.d();
            this.b = null;
        }
        if (a == 0) {
            this.b = new i("");
            this.b.a(this);
            return;
        }
        this.b = new ai("");
        this.b.a(this);
    }

    @Override
    public void a(int n2, g g2) {
    }

    public void a(int n2, String string) {
        ac.a(true, false);
        z.a().a(1019, (af)new ba(10), (af)new an(n2), new j(string));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int n2, boolean bl2) {
        if (bl2) {
            this.c &= ~n2;
            return;
        }
        this.c |= n2;
    }

    public void a(long l2) {
        am am2 = new am();
        am2.a(1311);
        am2.b(10);
        am2.d((int)l2);
        am2.a(bb.a().a());
        bb.a().b(am2.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(av av2) {
        av av3 = a.f.a(s.e);
        if (av3 == null || av2.a == null) {
            a.f.a((int)(av2.a / 1000));
            return;
        }
        if (s.e == 3) {
            ((av)((ap)av3)).a(1789450000, av2);
            return;
        }
        av3.a(1789450000, av2);
    }

    public void a(bc bc2, int n2) {
        ac.a(true, false);
        u.a((short)3, bc2.a, n2, (byte)-2, (short)0, (short)0, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(DataInputStream dataInputStream) {
        if (a || a == 0) {
            int n2 = dataInputStream.read();
            for (int i2 = 0; i2 < n2; ++i2) {
                byte[] byArray = new byte[(dataInputStream.read() << 8 | dataInputStream.read()) - 2];
                i.a(dataInputStream, byArray);
                this.a.addElement(new ah(i.a(byArray)));
            }
            ac.a = 0;
            return;
        }
        this.a.addElement(new ah(dataInputStream));
    }

    @Override
    public void a(String string, String string2, int n2) {
    }

    public void a(boolean bl2) {
        this.e = false;
        aa.e();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(byte[] byArray) {
        if (this.a == null) {
            return;
        }
        try {
            this.a.a(byArray);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public boolean a() {
        this.a = new i("");
        this.a.a(this);
        this.b = new ai("");
        this.b.a(this);
        new u(this);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2) {
        if ((this.c & n2) == 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(m object) {
        boolean bl2;
        block10: {
            block12: {
                boolean bl3;
                block11: {
                    bl2 = false;
                    bl3 = false;
                    if (object == null) return bl2;
                    af[] afArray = ay.a.a(1);
                    if (afArray == null) break block11;
                    if (!k.a(afArray, (m)object, true)) {
                        bl2 = bl3;
                        break block10;
                    } else {
                        k.a((m)ay.a, (m)object, afArray);
                        int n2 = afArray[3] instanceof t ? 1 : 2;
                        k.a(n2, (m)ay.a, (m)object, afArray[1].b(), afArray[2].b(), 0, 0);
                        bl2 = true;
                    }
                    break block10;
                }
                switch (((m)object).j) {
                    default: {
                        bl2 = bl3;
                        break block10;
                    }
                    case 2: {
                        if (((ax)object).s() != ay.a.a()) break;
                        w.a().a(null, 0, 0, ((m)object).a());
                        break block12;
                    }
                    case 8: {
                        ap.a();
                        ap.d = ((m)object).a();
                        ap.o = ((m)object).a();
                        bl2 = this.a((bk)object);
                        break block10;
                    }
                    case 64: {
                        bl2 = bl3;
                        if (a.f.a() == 3) {
                            ay.a = (e)object;
                            if (((m)object).c() == 0) {
                                object = ap.a();
                                int n3 = (aa.a().b & 1) == 0 ? 4 : 5;
                                ((ap)object).a(n3);
                            } else {
                                ap.a().a(3);
                            }
                            bl2 = true;
                        }
                        break block10;
                    }
                }
                z.a().a(1127, (af)new t(29), new an(((m)object).a()));
            }
            bl2 = true;
        }
        ay.a.j(1);
        return bl2;
    }

    public void b() {
        if (this.b != null) {
            this.b.a();
            this.b.a = al.a;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void b(int var1_1, boolean var2_2) {
        block5: {
            if (var2_2) ** GOTO lbl8
            var3_3 = s.k;
            var4_6 = new StringBuffer();
            a.b.a(var3_3, 1, var4_6.append("").append(var1_1).toString());
lbl6:
            // 2 sources

            return;
lbl8:
            // 1 sources

            var4_7 = a.b.a(s.k, 1);
            if (var4_7 != null) {
                var3_4 = var4_7;
                if (var4_7 != "") break block5;
            }
            var3_4 = "0";
        }
        try {
            var6_8 = z.a();
            var4_7 = new t(9);
            var5_9 = new an(Integer.parseInt((String)var3_4));
            var3_4 = new j(this.a());
            var6_8.a(1311, (af)var4_7, (af)var5_9, (af)var3_4);
        }
        catch (Exception var3_5) {
        }
        ** while (true)
    }

    @Override
    public void b(String string) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(byte[] byArray) {
        if (this.b == null) {
            return;
        }
        try {
            this.b.a(byArray);
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
    public boolean b() {
        block4: {
            if (this.a.size() > 0) break block4;
            return false;
        }
        try {
            while (this.a.size() != 0) {
                if (this.a.elementAt(0) == null) continue;
                ah ah2 = (ah)this.a.elementAt(0);
                this.a.removeElementAt(0);
                u.a(ah2);
            }
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public void c() {
        if (this.a != null) {
            this.a.d();
            this.a = null;
        }
        if (this.b != null) {
            this.b.d();
            this.b = null;
        }
    }

    public void d() {
        if (this.a != null) {
            this.a.d();
            this.a.e();
        }
        if (this.b != null) {
            this.b.d();
            this.b.e();
            aj aj2 = this.b;
            aj2.b = (byte)(aj2.b | 4);
            this.e = true;
        }
    }

    public void e() {
        ++this.a;
        if (this.a > 350) {
            this.a = 0;
            z.a().a(1311, new t(7));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f() {
        try {
            al.a = System.currentTimeMillis();
            if (this.b == null) return;
            if (this.e) return;
            if ((this.b.b & 1) == 0) return;
            if (a == 0 && aj.b != 0 && al.a - this.b.a >= 50000L) {
                if (d > 2) {
                    this.d();
                } else {
                    this.b();
                    d = (byte)(d + 1);
                }
            }
            if (al.a - b <= 30000L) return;
            b = al.a;
            z z2 = z.a();
            t t2 = new t(0);
            an an2 = new an((int)(b % 1000000000L));
            z2.a(1311, (af)t2, an2);
            bb.g();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void h() {
        bl bl2 = ay.a;
        if (bl2 != null && !bl.c) {
            bb.a(bl2);
        }
    }
}

