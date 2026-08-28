/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.aa;
import a.ab;
import a.ac;
import a.af;
import a.al;
import a.an;
import a.ap;
import a.ay;
import a.az;
import a.ba;
import a.bb;
import a.bf;
import a.bg;
import a.bk;
import a.bl;
import a.c;
import a.e;
import a.f;
import a.j;
import a.k;
import a.p;
import a.s;
import a.t;
import a.y;
import a.z;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class m
extends y {
    public static bf a;
    public static m a;
    public static Hashtable a;
    public static bg b;
    public static boolean b;
    public static byte g;
    public static int g;
    public static byte n;
    private byte a;
    public bg a;
    public c a;
    public p a;
    public String a;
    public Vector a;
    public short a;
    public af[] a = null;
    public m b;
    public Vector b;
    private short b = null;
    public int c;
    public Vector c;
    public byte d;
    public int d;
    public Vector d;
    public byte e;
    public int e;
    public Vector e;
    public byte f;
    public int f;
    private Vector f = -1;
    private Vector g;
    public byte h;
    public int h;
    private Vector h;
    public byte i;
    public int i = 0;
    public byte j = 0;
    public byte k = 0;
    public byte l = 0;
    public byte m = 0;

    static {
        Static.regClass(29);
        a.m.cinitclone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public m(int n2, int n3, byte by, int n4, int n5, int n6) {
        this.a = new Vector();
        this.h = s.a[0];
        this.f = new Vector();
        this.g = new Vector();
        this.c = new Vector();
        this.a = new p();
        this.d = new Vector();
        this.h = new Vector();
        this.e = new Vector();
        this.a = (short)6;
        this.a = new c();
        this.o = 1;
        this.p = 1;
        this.q = (byte)n2;
        this.r = (byte)n3;
        this.e = by;
        n2 = n4 / 100000;
        if (n2 == 1 || n2 == 2) {
            n3 = n4 / 10000;
            this.a = bg.b(a.m.d(n3), 1);
            bg.b(this.a, n2, n3 % 10);
            this.e();
            return;
        }
        if (n2 == 4 || n2 == 3) {
            n3 = n4 % 100000 / 100 * 10000;
            this.a = n2 == 3 ? bg.b(n3, 1) : bg.b(n3, 0);
            if (this.a == null) return;
            if (n2 != 3) return;
            this.a(1, 0);
            return;
        }
        if (n2 == 7) {
            this.a = bg.a(n4, "", 2);
            return;
        }
        if (n2 == 8) {
            this.a = bb.a(n4, true, null);
            return;
        }
        if (n4 != 2010000 && n4 != 1110000) {
            if (n2 != 9) return;
            this.a = bb.a(n4, null);
            return;
        }
        this.a = bg.b(n4, 0);
        this.a.a(0, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(m m2, m m3) {
        int n2 = -1;
        if (m2 == null) {
            if (m3 == null) return n2;
            return m3.e;
        }
        if (m3 == null) return m2.e;
        if (m2.a() == m3.a()) return n2;
        int n3 = Math.abs(m2.d - m3.d);
        n2 = Math.abs(m2.e - m3.e);
        if (n3 == 0 && n2 == 0) {
            return 0;
        }
        if (n2 <= n3) {
            if (m2.d >= m3.d) return 3;
            return 1;
        }
        if (m2.e >= m3.e) return 2;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static bg a(int n2, m object, m m2) {
        int n3;
        if (n2 < 10000) {
            return null;
        }
        bg bg2 = bg.b(n2 / 10000 * 10000, 0);
        if (bg2 == null) return bg2;
        int n4 = n3 = n2 % 10000 / 10;
        if (n2 % 10 == 1) {
            n4 = n3;
            switch (a.m.a((m)object, m2)) {
                default: {
                    n4 = n3;
                    break;
                }
                case 2: {
                    n4 = n3 + 2;
                    break;
                }
                case 3: {
                    n4 = n3 + 1;
                }
                case 0: {
                    break;
                }
                case 1: {
                    n4 = n3 + 1;
                    bg2.a(2, true);
                }
            }
        }
        bg2.a(n4, 0);
        return bg2;
    }

    public static m a() {
        return a;
    }

    private void a() {
        if (this.l <= 0) {
            int n2 = this.m();
            this.h(n2 | 0x20);
            this.c(n2, n2 | 0x20);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(int n2, int n3, int n4, int n5) {
        af[] afArray = (af[])a.get(new StringBuffer().append("").append(n2).toString());
        if (afArray == null) {
            an an2 = new an(n3);
            an an3 = new an(n4 * 2);
            an an4 = new an(n5 * 2);
            a.put(new StringBuffer().append("").append(n2).toString(), new af[]{an2, an3, an4});
            return;
        }
        afArray[0].a(n3);
        afArray[1].a(n4 * 2);
        afArray[2].a(n5 * 2);
    }

    public static void a(bg bg2, int n2, int n3) {
        bg.a(bg2, n2, n3);
    }

    public static void a(m m2) {
        a = m2;
        ap.a().f();
        ap.a().g();
        if (a != null) {
            bk.b = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Vector vector) {
        int n2 = 0;
        while (n2 < vector.size()) {
            Object object;
            int n3;
            if (vector.elementAt(n2) instanceof an) {
                an an2 = (an)vector.elementAt(n2);
                if (an2.a <= 0) {
                    vector.removeElement(an2);
                    n3 = n2;
                } else {
                    --an2.a;
                    n3 = n2 + 1;
                }
            } else if (vector.elementAt(n2) instanceof bg) {
                object = (bg)vector.elementAt(n2);
                ((bg)object).a(100);
                n3 = n2;
                if (!((bg)object).a()) {
                    int[] nArray = (int[])this.a.a(((bg)object).d);
                    if (nArray != null) {
                        if (nArray[4] == 0) {
                            ((bg)object).a(1, true);
                            continue;
                        }
                        this.a.a(((bg)object).d);
                        vector.removeElement(object);
                        continue;
                    }
                    vector.removeElement(object);
                    continue;
                }
            } else {
                af[] afArray = (af[])vector.elementAt(n2);
                object = (an)afArray[1];
                int n4 = ((an)object).a;
                ((an)object).a = n4 + 1;
                n3 = n2;
                if (n4 >= 20) {
                    vector.removeElement(afArray);
                    continue;
                }
            }
            n2 = n3 + 1;
        }
        return;
    }

    /*
     * Unable to fully structure code
     */
    private void a(Graphics var1_1, int var2_2, int var3_3, Vector var4_4, boolean var5_5) {
        var9_7 = var2_2;
        var6_8 = 0;
        var10_9 = 0;
        var2_2 = -1;
        var8_10 = var3_3;
        var3_3 = var10_9;
        block0: for (var7_6 = 0; var7_6 < var4_4.size(); ++var7_6) {
            block8: {
                block9: {
                    block11: {
                        block10: {
                            if (var4_4.elementAt(var7_6) instanceof an) {
                                var10_9 = var7_6 + 1;
                                if (((an)var4_4.elementAt(var7_6)).b() > 0) {
                                    var7_6 = var10_9;
                                    var10_9 = var2_2;
                                    var11_11 = var3_3;
                                    var2_2 = var6_8;
                                    var3_3 = var10_9;
                                    var6_8 = var11_11;
lbl17:
                                    // 3 sources

                                    while (true) {
                                        var10_9 = var2_2;
                                        var2_2 = var6_8;
                                        var11_11 = var3_3;
                                        var6_8 = var10_9;
                                        var3_3 = var2_2;
                                        var2_2 = var11_11;
                                        continue block0;
                                        break;
                                    }
                                }
                                var7_6 = var10_9;
                            }
                            if (!(var4_4.elementAt(var7_6) instanceof bg)) break block8;
                            var12_12 = (af[])var4_4.elementAt(var7_6);
                            var13_13 = (int[])this.a.a(var12_12.d);
                            var11_11 = var9_7;
                            var10_9 = var8_10;
                            if (var13_13 != null) {
                                this.a(var13_13, var9_7, var8_10);
                                var11_11 = var13_13[0];
                                var10_9 = var13_13[1];
                            }
                            if (var5_5) break block9;
                            if (var2_2 != var12_12.f()) break block10;
                            ++var3_3;
lbl39:
                            // 2 sources

                            while (var3_3 == 0) {
                                var12_12.a(var11_11, var10_9, var1_1);
lbl41:
                                // 3 sources

                                while (true) {
                                    var8_10 = var2_2;
                                    var2_2 = var6_8;
                                    var9_7 = var11_11;
                                    var6_8 = var3_3;
                                    var3_3 = var8_10;
                                    var8_10 = var10_9;
                                    ** GOTO lbl17
                                    break;
                                }
                            }
                            break block11;
                        }
                        var2_2 = var12_12.f();
                        var3_3 = 0;
                        ** GOTO lbl39
                    }
                    var8_10 = 1;
                    if (var3_3 % 2 == 0) {
                        var8_10 = -1;
                    }
                    var12_12.a(var8_10 * (var3_3 + 1 >> 1) * 10 + var11_11, var3_3 * 5 + var10_9, var1_1);
                    ** GOTO lbl41
                }
                var12_12.a(var11_11, var10_9, var1_1);
                ** continue;
            }
            var12_12 = (af[])var4_4.elementAt(var7_6);
            al.a(var1_1, var12_12[0].toString(), var9_7, var8_10 - ((an)var12_12[1]).a * 2 - s.h - var6_8 * 20, s.a[0], s.a[1]);
            var10_9 = var2_2;
            var2_2 = var6_8 + 1;
            var6_8 = var3_3;
            var3_3 = var10_9;
            ** continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(byte by, boolean bl2) {
        boolean bl3 = false;
        int n2 = this.d / aa.c;
        int n3 = this.e / aa.d;
        if (aa.a().a((int)this.d, n2, n3)) {
            return bl3;
        }
        boolean bl4 = bl3;
        if (n2 < 1) return bl4;
        bl4 = bl3;
        if (n3 < 1) return bl4;
        this.q = (byte)n2;
        this.r = (byte)n3;
        this.a(1, -1);
        if (!bl2) return true;
        if (this.e == by) return true;
        this.e = by;
        this.c();
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(byte by, boolean bl2, boolean bl3, int n2, int n3) {
        this.d += n2;
        this.e += n3;
        if (!(bl3 = this.a(by, bl3))) {
            this.d -= n2;
            this.e -= n3;
            return bl3;
        }
        aa.a().a(this.d, this.e, bl2);
        this.b();
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean a(int n2, boolean bl2, int n3, int n4) {
        boolean bl3;
        int n5 = n2 == 2 || n2 == 3 ? 1 : -1;
        int n6 = n2 == 4 || n2 == 5 ? 1 : -1;
        int n7 = n2 == 2 ? -1 : (n2 == 3 ? 1 : -1);
        int n8 = n2 == 4 ? -1 : (n2 == 5 ? 1 : -1);
        boolean bl4 = false;
        if (!aa.a().a((int)this.d, this.q + n7, this.r + n8)) {
            byte[] byArray = s.a;
            n7 = n2 > 3 ? 0 : 2;
            bl3 = bl4;
            if (!this.b(byArray[n7 + 2], bl2, false, n3, n4)) return bl3;
            this.b(s.a[n2], bl2, false, n3, n4);
            return true;
        }
        bl3 = bl4;
        if (aa.a().a((int)this.d, n7 * n5 + this.q, n8 * n6 + this.r)) return bl3;
        byte[] byArray = s.a;
        n7 = n2 > 3 ? 0 : 2;
        bl3 = bl4;
        if (!this.b(byArray[n7 + 3], bl2, false, n3, n4)) return bl3;
        bl3 = true;
        this.b(s.a[n2], bl2, false, n3, n4);
        return bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(m m2, m m3, boolean bl2) {
        boolean bl3 = true;
        if (m3 == null) return false;
        if (!m3.d()) return false;
        if (m2.j == 1) {
            if (!m3.i()) return false;
        }
        boolean bl4 = bl3;
        if (!bl2) return bl4;
        if (m3.b(4)) return false;
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int[] a(int[] nArray, int n2, int n3) {
        if (nArray[0] > n2) {
            nArray[0] = nArray[0] - nArray[3];
            if (nArray[0] <= n2) {
                nArray[0] = n2;
            }
        } else {
            nArray[0] = nArray[0] + nArray[3];
            if (nArray[0] >= n2) {
                nArray[0] = n2;
            }
        }
        if (nArray[1] > n3) {
            nArray[1] = nArray[1] - nArray[3];
            if (nArray[1] <= n3) {
                nArray[1] = n3;
            }
        } else {
            nArray[1] = nArray[1] + nArray[3];
            if (nArray[1] >= n3) {
                nArray[1] = n3;
            }
        }
        if (nArray[0] == n2 && nArray[1] == n3) {
            nArray[4] = 1;
            return nArray;
        }
        nArray[4] = 0;
        return nArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static byte b(int n2) {
        if (n2 < 0) {
            return -1;
        }
        if (n2 / 100000 % 10 != 2) return 1;
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int c(int n2) {
        if ((n2 %= 1000) < 21) return 20;
        if (n2 > 61) return 20;
        --n2;
        return n2;
    }

    private void c() {
        if (this.a != null) {
            this.m(this.e(this.f));
        }
    }

    public static void cinitclone() {
        g = 0;
        g = 1;
        a = null;
        b = bg.a(0x222E00, 0);
        a = new bf(11001000);
        b = false;
        a = new Hashtable();
        n = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int d(int n2) {
        switch (n2) {
            default: {
                return 100000;
            }
            case 13: 
            case 14: 
            case 24: {
                return 200000;
            }
            case 22: 
            case 26: 
        }
        return 300000;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void d() {
        if (this.l > 0) {
            this.l = (byte)(this.l - 1);
            this.a();
            return;
        }
        if (this.j == 8) return;
        if (!ap.e) return;
        if (!this.a(false)) {
            int n2;
            int n3 = this.h();
            if (n3 > 0 && (n2 = this.d()) < this.e()) {
                this.a(0, n3 + n2, 0);
            }
            if ((n2 = this.i()) > 0 && (n3 = this.f()) < this.g()) {
                this.b(0, n2 + n3);
            }
        }
        if (this.j != 1) return;
        ap.e = false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e(Graphics graphics, int n2, int n3) {
        if (this.a.equals("")) {
            this.a = this.a();
        }
        String string = this.a;
        if (this.a.length() < 1) {
            return;
        }
        try {
            String string2;
            int n4 = Integer.parseInt(this.a.substring(0, 1));
            this.h = s.a[n4];
            string = string2 = this.a.substring(1, this.a.length());
        }
        catch (Exception exception) {}
        this.d(graphics, n2 -= s.a.stringWidth(string) / 2, n3);
        if (g == 0) {
            al.a(graphics, string, n2, n3, this.h);
            return;
        }
        al.a(graphics, string, n2, n3, this.h, s.b[(g - 1) % s.b.length]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean e(int n2) {
        if (n2 < 20) return false;
        if (n2 > 60) return false;
        if (n2 % 2 != 0) return false;
        return true;
    }

    public static int f(int n2) {
        int n3;
        n2 = n3 = n2 % 1000;
        if (n3 == 11) {
            n2 = 1;
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void f(Graphics graphics, int n2, int n3) {
        int n4 = 0;
        while (n4 < this.h.size()) {
            if (!(this.h.elementAt(n4) instanceof af[]) || !(((af[])this.h.elementAt(n4))[0] instanceof t)) {
                ((bg)this.h.elementAt(n4 + 1)).a(n2, n3 - n4 / 2 * 30, graphics);
            }
            n4 += 2;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void g() {
        int n2 = 0;
        while (true) {
            block12: {
                af[] afArray;
                block13: {
                    if (n2 >= this.h.size()) {
                        return;
                    }
                    if (!(this.h.elementAt(n2) instanceof af[])) break block13;
                    af[] afArray2 = (af[])this.h.elementAt(n2);
                    if (afArray2[0].b() <= 0) {
                        afArray = (an)afArray2[afArray2.length - 1];
                        afArray.a += afArray2[afArray2.length - 2].b();
                        bg bg2 = (bg)this.h.elementAt(n2 + 1);
                        String string = String.valueOf(afArray2[afArray2.length - 1].b());
                        afArray = string;
                        if (string.length() >= 7) {
                            afArray = "999999";
                        }
                        int n3 = 6;
                        for (int i2 = 0; i2 < afArray.length(); ++i2, --n3) {
                            bg.a(bg2, n3, Integer.parseInt(new StringBuffer().append(afArray.charAt(i2)).append("").toString()) + 1000);
                        }
                        if (afArray2.length <= 3) {
                            this.h.setElementAt(new an(9), n2);
                            break block12;
                        } else {
                            afArray = new af[afArray2.length - 1];
                            System.arraycopy(afArray2, 1, afArray, 0, afArray.length);
                            this.h.setElementAt(afArray, n2);
                        }
                        break block12;
                    } else {
                        afArray2[0].a(afArray2[0].b() - 1);
                    }
                    break block12;
                }
                if (this.h.elementAt(n2) instanceof an) {
                    afArray = (an)this.h.elementAt(n2);
                    if (afArray.a <= 0) {
                        this.h.removeElementAt(n2);
                        this.h.removeElementAt(n2);
                        continue;
                    }
                    --afArray.a;
                } else if (this.h.elementAt(n2) instanceof bg) {
                    ++n2;
                    continue;
                }
            }
            n2 += 2;
        }
    }

    private void g(Graphics graphics, int n2, int n3) {
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            Object[] objectArray = (Object[])this.e.elementAt(i2);
            if (objectArray[7] == null) continue;
            ((bg)objectArray[7]).a(n2, n3, graphics);
            ((bg)objectArray[7]).a(100);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int o() {
        if (a == null) return -1;
        return a.a();
    }

    public byte a() {
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte a(int n2) {
        if (n2 >= this.a.size()) return 0;
        return ((t)this.a.elementAt((int)n2)).a;
    }

    public int a() {
        return this.c;
    }

    /*
     * Unable to fully structure code
     */
    public int a(byte var1_1, byte var2_2, byte var3_3) {
        block9: {
            block7: {
                block13: {
                    block11: {
                        block12: {
                            block10: {
                                block6: {
                                    block8: {
                                        if (this.q == var1_1 && this.r == var2_2) break block7;
                                        if (aa.a().b.contains(this)) break block8;
                                        if (!(aa.a().a((int)var1_1, (int)var2_2, 0, 0) && this.i() && this.b())) {
                                            var3_3 = 1;
lbl5:
                                            // 3 sources

                                            while (true) {
                                                if (var3_3 != 0) {
                                                    this.d(var1_1, var2_2);
                                                    this.l();
                                                    if (!(this.j != 64 || (var5_4 = ((e)this).a) == null || aa.a().b.contains(var5_4) && var5_4.b() || var5_4.i != 0 || var5_4.f(2))) {
                                                        var5_4.a((e)this);
                                                    }
                                                    var3_3 = 0;
lbl12:
                                                    // 6 sources

                                                    return var3_3;
                                                }
                                                break block6;
                                                break;
                                            }
                                        }
                                        break block9;
                                    }
                                    if (this.b()) break block9;
                                    var3_3 = 1;
                                    ** GOTO lbl5
                                }
                                if (this.b == null || this.b.size() <= 1) break block10;
                                var5_5 = (az)this.b.lastElement();
                                if (var1_1 != var5_5.d || var2_2 != var5_5.e) break block10;
                                var3_3 = (byte)this.b.size();
                                ** GOTO lbl12
                            }
                            this.h = var1_1;
                            this.i = var2_2;
                            var5_5 = new az(this.q, this.r);
                            var6_6 = new az(this.h, this.i);
                            this.b = ab.a().a(this.d, var5_5, var6_6, 4096);
                            if (this.b == null || this.b.size() <= 1) break block11;
                            var4_7 = this.n();
                            if (var4_7 <= 0) break block12;
                            for (var3_3 = (byte)(this.b.size() - 1); var3_3 >= 0; var3_3 = (byte)(var3_3 - 1)) {
                                var5_5 = (az)this.b.elementAt(var3_3);
                                if (Math.abs(var5_5.d - var1_1) >= var4_7 || Math.abs(var5_5.e - var2_2) >= var4_7) break;
                                this.b.removeElementAt(var3_3);
                            }
                            if (this.j != 1 || this.b.size() > 1) break block12;
                            bb.a().a(this.b);
                            this.b = null;
                            var3_3 = 0;
                            ** GOTO lbl12
                        }
                        if (this.b.size() <= 1) break block13;
                        this.b.removeElementAt(0);
                        var3_3 = (byte)this.b.size();
                        ** GOTO lbl12
                    }
                    this.k();
                }
                var3_3 = 0;
                ** GOTO lbl12
            }
            var3_3 = 0;
            ** while (true)
        }
        var3_3 = 0;
        ** while (true)
    }

    public int a(int n2) {
        return 3;
    }

    public int a(Graphics graphics, int n2, int n3, int n4) {
        if (this.a.equals("")) {
            this.a = this.a();
        }
        n2 -= s.a.stringWidth(this.a) / 2;
        if (a.m.o() == this.a()) {
            this.d(graphics, n2, n3);
        }
        this.a(graphics, this.a, n2, n3);
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public bg a() {
        if (this.f.size() <= 0) return null;
        return (bg)this.f.elementAt(3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public bg a(int n2) {
        int n3 = n2 / 1000;
        int n4 = 0;
        while (n4 < this.a.a()) {
            bg bg2 = (bg)this.a.a.elementAt(n4);
            if (bg2.a == n3 * 10000 && bg2.b == n2 % 1000) {
                return bg2;
            }
            ++n4;
        }
        return null;
    }

    public String a() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String a(int n2) {
        if (n2 >= this.a.size()) return null;
        return ((j)this.a.elementAt(n2)).a();
    }

    public short a() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public short a(int n2) {
        if (n2 >= this.a.size()) return 0;
        return ((ba)this.a.elementAt((int)n2)).a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, int n3, int n4) {
        int n5 = n2 + this.e();
        if (n3 < 0) {
            n3 = this.d();
        } else if (n3 == 0 && !this.a(false) && this.l <= 0) {
            this.l = (byte)n4;
            this.a();
        }
        n2 = n5;
        if (n5 <= 0) {
            n2 = 1;
        }
        n4 = n3;
        if (n3 > n2) {
            n4 = n2;
        }
        this.b(n4);
        this.c(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, int n3, int n4, boolean bl2) {
        int n5;
        Object object;
        block15: {
            block16: {
                block14: {
                    if (!bl2) {
                        return;
                    }
                    object = this.g;
                    if (n4 <= 0) {
                        n4 = 0;
                    }
                    ((Vector)object).addElement(new an(n4 + 1));
                    object = bg.b(10000, 0);
                    if (n3 != 1 && n3 != 6) break block14;
                    if (a.k.a(n2)) {
                        n5 = 999999;
                        n4 = n3;
                        break block15;
                    } else {
                        n5 = n2;
                        n4 = n3;
                        if (n2 >= 0) {
                            n4 = n3 / 5 * 5 + 3;
                            bg.a((bg)object, 0, 4000);
                            n5 = n2;
                        }
                    }
                    break block15;
                }
                if (n3 == 2) break block16;
                n5 = n2;
                n4 = n3;
                if (n3 != 7) break block15;
            }
            if (a.k.a(n2)) {
                bg.a((bg)object, 0, 4003);
                n5 = 999999;
                n4 = n3;
            } else {
                n4 = n2 >= 0 ? 4001 : 4003;
                bg.a((bg)object, 0, n4);
                n5 = n2;
                n4 = n3;
            }
        }
        n3 = Math.abs(n5);
        n2 = n4 < 12 ? n4 / 5 * 6 + (String.valueOf(n3).length() - 1) : n4;
        ((bg)object).a(n2, 0);
        ((bg)object).a(1, true);
        if (n2 < 12) {
            String string = String.valueOf(n3);
            n2 = 1;
            for (n3 = string.length() - 1; n3 >= 0; --n3, ++n2) {
                bg.a((bg)object, n2, Integer.parseInt(new StringBuffer().append(string.charAt(n3)).append("").toString()) + n4 % 5 * 1000);
            }
        }
        this.g.addElement(object);
    }

    public void a(int n2, int n3, m m2, m object, int n4) {
        bg bg2 = a.m.a(n2, m2, (m)object);
        if (bg2 != null) {
            if ((object = a.m.a(n3 / 100, m2, (m)object)) != null) {
                n2 = aa.a().a(m2.d);
                int n5 = aa.a().b(m2.e);
                int n6 = aa.a().a((int)m2.q, (int)m2.r);
                int n7 = ((bg)object).d = this.a.a() + 10;
                this.a.a(((bg)object).d, new int[]{n2, n5 - n6, n7, n3 % 100, 0});
            }
            this.c.addElement(new an(n4 + 1));
            bg2.a(1, true);
            this.c.addElement(bg2);
            if (object != null) {
                ((bg)object).a(1, true);
                this.c.addElement(object);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, int n3, boolean bl2, int n4) {
        short s2 = this.a();
        if (n4 != -1) {
            s2 = (short)n4;
        }
        this.k = (byte)-1;
        if (this.q < n2 && this.r < n3) {
            this.k = (byte)3;
            n4 = 10003;
        } else if (this.q > n2 && this.r > n3) {
            this.k = (byte)2;
            n4 = 10000;
        } else if (this.q > n2 && this.r < n3) {
            this.k = (byte)2;
            n4 = 10001;
        } else if (this.q < n2 && this.r > n3) {
            this.k = (byte)3;
            n4 = 10002;
        } else if (this.q == n2 && this.r < n3) {
            this.k = (byte)5;
            n4 = s.a[this.k];
        } else if (this.q > n2 && this.r == n3) {
            this.k = (byte)2;
            n4 = s.a[this.k];
        } else if (this.q == n2 && this.r > n3) {
            this.k = (byte)4;
            n4 = s.a[this.k];
        } else {
            if (this.q >= n2) return;
            if (this.r != n3) return;
            this.k = (byte)3;
            n4 = s.a[this.k];
        }
        if (this.k <= 0) return;
        if (this.a(n4, bl2, true, (int)s2, (int)s2)) return;
        if (!bl2) {
            this.d(n2, n3);
            return;
        }
        if (this.j == 1 && bl.c) {
            this.d(n2, n3);
            return;
        }
        aa.a().a(this);
    }

    public void a(int n2, m m2, af[] afArray) {
        this.j(-1);
        this.i = n2;
        this.b = m2;
        this.a = afArray;
        if (this.i == 6) {
            this.d = (byte)(this.d % 100 + 100);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int n2, boolean bl2) {
        if (bl2) {
            this.b = (short)(this.b | n2);
            return;
        }
        this.b = (short)(this.b & ~n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(String string, int n2, boolean bl2) {
        if (!bl2 && this.j != 1) {
            return;
        }
        Vector vector = this.g;
        if (n2 <= 0) {
            n2 = 0;
        }
        vector.addElement(new an(n2 + 1));
        this.g.addElement(new af[]{new j(string), new an(0)});
    }

    @Override
    public void a(Graphics graphics) {
        int n2 = aa.a().a(this.d);
        int n3 = aa.a().b(this.e) - aa.a().a((int)this.q, (int)this.r);
        this.a(graphics, n2, n3);
        this.b(graphics, n2, n3);
        if (this.j == 1024) {
            this.h = s.a[6];
            this.e(graphics, n2, n3 - 60 - s.h);
        }
    }

    protected void a(Graphics graphics, int n2, int n3) {
        this.c(graphics, n2, n3);
        if (this.a != null) {
            this.a.a(n2, n3, graphics);
        }
    }

    public void a(Graphics graphics, int n2, int n3, int n4) {
        n3 = this.b(n3);
        this.g(graphics, n2, n3);
        this.a(graphics, n2, n3, this.c, true);
        bg bg2 = this.a();
        if (bg2 != null) {
            bg2.a(n2, n3, graphics);
            bg2.a(100);
        }
        this.a(graphics, n2 + 5, n3 - 25, this.g, false);
        this.f(graphics, n2, n3 - 30);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void a(Graphics graphics, String string, int n2, int n3) {
        if (g == 0) {
            al.a(graphics, string, n2, n3, this.h);
            return;
        }
        al.a(graphics, string, n2, n3, this.h, s.b[(g - 1) % s.b.length]);
    }

    public void a(boolean bl2) {
        this.d.removeAllElements();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(af[] afArray) {
        if (afArray != null) {
            bg bg2 = bg.b(10000, 0);
            bg2.a(17, 0);
            String string = String.valueOf(afArray[afArray.length - 2].b());
            int n2 = 0;
            for (int i2 = 6; i2 > 0; ++n2, --i2) {
                int n3 = n2 < string.length() ? Integer.parseInt(new StringBuffer().append(string.charAt(n2)).append("").toString()) + 1000 : 0;
                bg.a(bg2, i2, n3);
            }
            this.h.addElement(afArray);
            this.h.addElement(bg2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(int n2, int n3) {
        boolean bl2;
        int n4;
        boolean bl3;
        block13: {
            block14: {
                block12: {
                    bl3 = false;
                    if (!this.a(false)) break block12;
                    n4 = n2;
                    if (n2 != 3) {
                        n4 = n2;
                        if (n2 != 4) {
                            return bl3;
                        }
                    }
                    break block13;
                }
                if (!this.f(4)) break block14;
                n4 = n2;
                if (n2 == 3) break block13;
                n4 = n2;
                if (n2 != 2) {
                    n4 = n2;
                    if (n2 != 9) {
                        bl2 = bl3;
                        if (this.f == 3) return bl2;
                        bl2 = bl3;
                        if (this.f == 2) return bl2;
                        bl2 = bl3;
                        if (this.f == 9) return bl2;
                        n4 = 2;
                    }
                }
                break block13;
            }
            n4 = n2;
            if (this.f()) {
                n4 = n2;
                if (n2 == 1) {
                    return bl3;
                }
            }
        }
        if (n4 == 0 && this.f != -1) {
            this.e = this.f;
            this.f = (byte)-1;
            if (this.e < 0) {
                this.e = 0;
            }
        }
        if (this.f == n4) {
            bl2 = bl3;
            if (n3 == -1) return bl2;
            bl2 = bl3;
            if (this.e == n3) return bl2;
        }
        if (n3 != -1) {
            this.e = (byte)n3;
        }
        n2 = this.f;
        this.f = n4;
        bl2 = bl3;
        if (this.a == null) return bl2;
        if (n2 == this.f) {
            this.a.c(this.e(n4));
            return true;
        } else {
            this.m(this.e(n4));
            this.a.a(1, true);
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2, int n3, int n4) {
        if (aa.a(this.q, this.r, n2, n3, n4)) return true;
        if (this.b != null && this.b.size() > 0) {
            az az2 = (az)this.b.lastElement();
            if (!aa.a(az2.d, az2.e, n2, n3, n4)) {
                this.b.removeAllElements();
                this.b = null;
            }
        }
        if (this.b == null) {
            this.a((byte)n2, (byte)n3, this.e);
        }
        if (this.d(-1)) return false;
        return true;
    }

    public boolean a(int n2, boolean bl2, boolean bl3, int n3, int n4) {
        aa aa2 = aa.a();
        if (n3 > aa.c) {
            n3 = aa.c;
        }
        if (n4 > aa.d) {
            n4 = aa.d;
        }
        if (bl2 = this.b(n2, bl2, bl3, n3, n4)) {
            aa2.a(this, false);
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(m m2) {
        if (m2 == null) return true;
        return this.a((int)m2.q, (int)m2.r, this.n());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(m m2, int n2, int n3, int n4, af[] afArray) {
        if (this.f.size() > 0) {
            if (((an)this.f.elementAt(0)).b() == n2) {
                return false;
            }
            if (a.m.e(this.f) && this.f == ((an)this.f.elementAt(1)).b() && (this.j != 1 || this.i != 5)) {
                this.a(0, -1);
                if (this.j == 1) {
                    a.k.b(null);
                }
            }
            this.f.removeAllElements();
        }
        if (m2 != null && m2.a(false)) {
            return false;
        }
        this.f.addElement(new an(n2));
        this.f.addElement(new an(n3));
        this.f.addElement(m2);
        this.f.addElement(a.m.a(n4, this, m2));
        this.f.addElement(afArray);
        if (this.i != 5) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(y y2) {
        if (!(y2 instanceof m)) return super.a(y2);
        if (((m)y2).e < this.e) return true;
        if (((m)y2).e != this.e) return false;
        if (((m)y2).d >= this.d) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(Graphics graphics, int n2, int n3, int n4, int n5) {
        boolean bl2 = true;
        int n6 = this.e();
        if (n6 <= 0) return false;
        if (!ap.c) return false;
        al.a(graphics, n2, n3, n4, n5, this.d(), n6, s.a[2], 0x3E3E3E, true);
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(boolean bl2) {
        if ((this.m() & 0x20) == 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public af[] a() {
        if (this.f.size() <= 0) return null;
        return (af[])this.f.elementAt(4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public af[] a(int n2) {
        if (this.i != n2) return null;
        return this.a;
    }

    public int b() {
        return 0;
    }

    protected int b(int n2) {
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected m b() {
        if (this.f.size() > 0) {
            n = (byte)2;
            return (m)this.f.elementAt(2);
        }
        n = (byte)3;
        return null;
    }

    public short b() {
        return 0;
    }

    public void b() {
        a.m.a(this.a(), -1, this.q, this.r);
    }

    public void b(int n2) {
    }

    public void b(int n2, int n3) {
        int n4 = n2 + this.g();
        if (n3 < 0) {
            n3 = this.d();
        }
        n2 = n4;
        if (n4 <= 0) {
            n2 = 1;
        }
        n4 = n3;
        if (n3 > n2) {
            n4 = n2;
        }
        this.d(n4);
        this.e(n2);
    }

    public void b(Graphics graphics, int n2, int n3) {
        this.a.a(graphics, n2, n3, true);
    }

    public void b(boolean bl2) {
    }

    protected boolean b() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2) {
        if (this.f != n2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2, boolean bl2, boolean bl3, int n3, int n4) {
        if (this.a(false)) return true;
        if (this.f(4)) {
            return true;
        }
        if (n2 == s.a[5]) {
            if (this.a((byte)0, bl2, bl3, 0, n4)) {
                return true;
            }
            if (!bl3) return false;
            return this.a(5, bl2, n3, n4);
        }
        if (n2 == s.a[4]) {
            if (this.a((byte)2, bl2, bl3, 0, -n4)) {
                return true;
            }
            if (!bl3) return false;
            return this.a(4, bl2, n3, n4);
        }
        if (n2 == s.a[2]) {
            if (this.a((byte)3, bl2, bl3, -n3, 0)) {
                return true;
            }
            if (!bl3) return false;
            return this.a(2, bl2, n3, n4);
        }
        if (n2 == s.a[3]) {
            if (this.a((byte)1, bl2, bl3, n3, 0)) {
                return true;
            }
            if (!bl3) return false;
            return this.a(3, bl2, n3, n4);
        }
        if (n2 == 10000) {
            if (!this.a((byte)3, bl2, bl3, -n3, 0)) return this.b(s.a[4], bl2, false, 0, n4);
            this.b(s.a[4], bl2, false, 0, n4);
            return true;
        }
        if (n2 == 10001) {
            if (!this.a((byte)3, bl2, true, -n3, 0)) return this.b(s.a[5], bl2, false, 0, n4);
            this.b(s.a[5], bl2, false, 0, n4);
            return true;
        }
        if (n2 == 10002) {
            if (!this.a((byte)1, bl2, true, n3, 0)) return this.b(s.a[4], bl2, false, 0, n4);
            this.b(s.a[4], bl2, false, 0, n4);
            return true;
        }
        if (n2 != 10003) return false;
        if (!this.a((byte)1, bl2, true, n3, 0)) return this.b(s.a[5], bl2, false, 0, n4);
        this.b(s.a[5], bl2, false, 0, n4);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(boolean bl2) {
        boolean bl3 = true;
        if (this.b == null) return false;
        this.b.removeAllElements();
        this.b = null;
        bl2 = bl3;
        if (this.f != 1) return bl2;
        this.e();
        return bl3;
    }

    public byte c() {
        return this.a;
    }

    public int c() {
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public m c() {
        if (this.f.size() <= 0) return null;
        return (m)this.f.elementAt(2);
    }

    public void c(int n2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(int n2, int n3) {
        block6: {
            block5: {
                block4: {
                    if (((n2 & 0x20) != 0 || (n3 & 0x20) == 0) && (this.f == 3 || this.f == 4 || (n3 & 0x20) == 0)) break block4;
                    this.j(-1);
                    this.b(true);
                    this.a(true);
                    this.a(4, false);
                    this.i();
                    this.a(3, -1);
                    break block5;
                }
                if ((n2 & 0x20) == 0 || (n3 & 0x20) != 0) break block6;
                this.a(0, -1);
                if (this.j == 1) {
                    ap.a().k();
                    ap.a().f();
                    a.f.a(1);
                }
                this.b(false);
            }
            this.l = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void c(Graphics graphics, int n2, int n3) {
        if (a.m.o() == this.a()) {
            bg bg2 = b;
            int n4 = this.c() == 0 ? 0 : 1;
            bg2.c(n4);
            b.a(n2, n3, graphics);
            b.a(100);
        }
    }

    public boolean c(int n2) {
        return this.a.a.removeElement(this.a(n2));
    }

    public int d() {
        return 0;
    }

    public void d(int n2) {
    }

    public void d(int n2, int n3) {
        this.q = (byte)n2;
        this.r = (byte)n3;
        this.j();
    }

    public void d(Graphics graphics, int n2, int n3) {
        al.a(graphics, n2, n3, s.a.stringWidth(this.a), s.h, (int)ac.a, 0);
    }

    public boolean d() {
        return aa.a().b.contains(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean d(int n2) {
        az az2;
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (this.b == null) return bl3;
        if (this.b.size() <= 0) {
            this.l();
            return bl2;
        }
        az az3 = az2 = (az)this.b.elementAt(0);
        if (this.q == az2.d) {
            az3 = az2;
            if (this.r == az2.e) {
                this.b.removeElementAt(0);
                az3 = az2;
                if (this.b.size() > 0) {
                    az3 = (az)this.b.elementAt(0);
                }
            }
        }
        int n3 = az3.d;
        int n4 = az3.e;
        bl3 = this.j == 1;
        this.a(n3, n4, bl3, n2);
        return true;
    }

    public int e() {
        return 0;
    }

    public int e(int n2) {
        return bb.a(a.m.f(n2), this.e, this.a);
    }

    public void e() {
    }

    public void e(int n2) {
    }

    public void e(int n2, int n3) {
    }

    public boolean e() {
        return this.a(0, -1);
    }

    public int f() {
        return 0;
    }

    public void f() {
        this.d();
        this.p();
        this.o();
    }

    public void f(int n2) {
        this.a = (byte)n2;
    }

    public void f(int n2, int n3) {
        if (this.a != null) {
            a.m.a(this.a, n2, n3);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean f() {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (this.f / 1000 == 1) return bl3;
        if (this.f < 21) return false;
        if (this.f > 61) return false;
        if (this.f % 2 != 1) return false;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean f(int n2) {
        if ((this.b & n2) == 0) return false;
        return true;
    }

    public int g() {
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int g(int n2) {
        if (n2 >= this.a.size()) return 0;
        return ((an)this.a.elementAt((int)n2)).a;
    }

    public void g(int n2) {
        this.h = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean g() {
        boolean bl2 = false;
        if (this.d.size() > 0) {
            an an2 = (an)this.d.elementAt(0);
            this.d.removeElement(an2);
            if (this.f == an2.a % 10000) {
                this.a.a(1, true);
            }
            this.a(an2.a % 10000, -1);
            this.a.d(an2.a / 10000);
            return true;
        }
        if (!this.j()) return bl2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean g(int n2) {
        if (this.f.size() <= 0) return false;
        if (n2 != 0) {
            if (n2 != ((an)this.f.elementAt(0)).b()) return false;
        }
        if (a.m.e(this.f) && this.f == ((an)this.f.elementAt(1)).b() && (this.j != 1 || this.i != 5)) {
            this.a(0, -1);
            if (this.j == 1 && this.i != 5) {
                a.k.b(null);
            }
        }
        this.f.removeAllElements();
        return true;
    }

    public int h() {
        return 0;
    }

    public int h(int n2) {
        return -1;
    }

    /*
     * Unable to fully structure code
     */
    public void h() {
        block8: {
            block7: {
                var1_1 = 1;
                var2_2 = this.k();
                if (bl.a == null || bl.a.length == 0 || var2_2 == 0) lbl-1000:
                // 2 sources

                {
                    return;
                }
                this.f(1);
                if (this.m == 0 || ay.a.m == 0) break block7;
                if (this.m == ay.a.m) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        this.f(var1_1);
lbl11:
                        // 3 sources

                        while (true) {
                            this.e();
                            ** continue;
                            break;
                        }
                        break;
                    }
                }
                break block8;
            }
            var1_1 = 0;
            while (true) {
                if (var1_1 >= bl.a.length) ** GOTO lbl11
                if (bl.a[var1_1] == var2_2) {
                    this.f(0);
                    ** continue;
                }
                ++var1_1;
            }
        }
        var1_1 = 0;
        ** while (true)
    }

    protected void h(int n2) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean h() {
        if (this.a == null) return false;
        return this.a.a();
    }

    public int i() {
        return 0;
    }

    protected void i() {
        a.k.a((m)ay.a, this.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean i() {
        if (!this.f(128)) return true;
        if (this.c() != 0) return true;
        return false;
    }

    public int j() {
        return 5;
    }

    public void j() {
        az az2 = aa.a().a((int)this.q, (int)this.r);
        this.d = (short)az2.d;
        this.e = (short)az2.e;
        aa.a().a(this, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void j(int n2) {
        if (n2 != -1 && n2 != this.i) {
            return;
        }
        switch (this.i) {
            case 1: 
            case 3: 
            case 4: 
            case 7: {
                this.b(false);
                break;
            }
            case 5: {
                if (this.j != 1 || !a.m.e(this.f) || this.f != this.a[15].b()) break;
                this.a(0, -1);
                break;
            }
            case 6: {
                this.d = (byte)(this.d % 100);
                break;
            }
        }
        this.i = 0;
        this.b = null;
        this.a = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean j() {
        if (this.f.size() <= 0) return false;
        m m2 = (m)this.f.elementAt(2);
        if (m2 != null && m2.a(false)) {
            this.f.removeAllElements();
            return false;
        }
        this.a(((an)this.f.elementAt(1)).b(), a.m.a(this, m2));
        return true;
    }

    public int k() {
        return 0;
    }

    protected void k() {
        this.b = null;
    }

    public void k(int n2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean k() {
        boolean bl2 = false;
        m m2 = this.b();
        if (m2 != null && (!m2.d() || m2.a(false))) {
            if (n == 1 || n == 2) {
                if (this.j == 1) {
                    a.k.b(null);
                }
                if (n == 1) {
                    this.j(5);
                } else {
                    this.f.removeAllElements();
                }
            }
            this.a(0, -1);
            return bl2;
        }
        this.a(this.f, a.m.a(this, m2));
        return true;
    }

    public int l() {
        return -1;
    }

    public void l() {
        this.e();
        this.b = null;
    }

    public void l(int n2) {
        if (this.a != null) {
            this.a.a(n2, 0);
        }
    }

    public int m() {
        return 0;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void m() {
        cfr_temp_0 = 0;
        block10: do {
            switch (cfr_temp_0 == 0 ? this.i : cfr_temp_0) {
                case 1: 
                case 3: {
                    if (!a.m.a(this, this.b, false)) ** GOTO lbl28
                    if (this.a(this.b) == false) return;
                    switch (this.i) {
                        default: {
                            ** break;
                        }
                        case 1: {
                            if (bb.a().a(this.b) && this.i != 1) {
                                break;
                            }
                            ** GOTO lbl28
                        }
                        case 3: {
                            if (this.f != 0) {
                                if (this.f != 1) return;
                            }
                            this.a(0, a.m.a(this, this.b));
                            break;
                        }
                    }
                    cfr_temp_0 = 5;
                    continue block10;
                }
                case 4: 
                case 7: {
                    if (this.a(this.a[0].b(), this.a[1].b(), 0) == false) return;
                    if (this.i == 4) {
                        z.a().a(2032, new ba(0), new ba(0), new an(this.a[2].b()), new ba(0), new t(0), new t(102), new j(""));
                    }
                    this.a = (short)2;
                }
lbl28:
                // 5 sources

                default: {
                    ** GOTO lbl49
                }
                case 6: {
                    if (this.a != null) {
                        if (this.a[0].b() > 0) {
                            this.a[0].a(this.a[0].b() - 1);
                            var1_1 = this.a[1].b();
                            var2_2 = this.j == 1;
                            this.b(var1_1, var2_2, true, this.a[2].b(), this.a[3].b());
                            aa.a().a(this, false);
                            if (this.j == 1) {
                                ((bl)this).c(true);
                            }
                            if (this.a[5].b() == -1) return;
                            this.a(0, this.a[5].b());
                            return;
                        }
                        if (!this.g() && this.a[5].b() == -1) {
                            this.a(this.a[4].b(), a.m.a(this, this.b));
                        }
                    }
lbl49:
                    // 6 sources

                    this.j(-1);
                }
                case 5: 
            }
            return;
        } while (true);
    }

    public void m(int n2) {
        if (this.a != null) {
            this.a.a(n2, 0);
        }
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public int n() {
        int n2;
        int n3 = n2 = 0;
        int n4 = 0;
        block5: do {
            switch (n4 == 0 ? this.i : n4) {
                default: {
                    n3 = n2;
                    n4 = 2;
                    continue block5;
                }
                case 1: {
                    n3 = this.a != null ? a.k.a(this.a) : 2;
                }
                case 2: {
                    return n3;
                }
                case 3: 
            }
            break;
        } while (true);
        if (this.a == null) return 1;
        return this.a[0].b();
    }

    public void n() {
        this.g.removeAllElements();
        this.c.removeAllElements();
        this.a.a();
        this.d.removeAllElements();
        this.h.removeAllElements();
        if (this.f() && !this.j()) {
            this.a(0, -1);
        }
    }

    @Override
    public void n(int n2) {
        if (this.a != null) {
            this.a.a(n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void o() {
        int n2 = 2;
        if (!aa.a().b.contains(this)) {
            this.n(100);
        }
        if (this.f()) {
            if (this.h()) return;
            if (this.g()) {
                return;
            }
            if ((this.m() & 0x20000) == 0) {
                this.a(0, -1);
                return;
            }
            this.a(a.m.c(this.f), a.m.a(this, this.b()));
            return;
        }
        if (a.m.e(this.f)) {
            this.k();
            return;
        }
        switch (this.f) {
            default: {
                return;
            }
            case 3: {
                if (this.h()) return;
                if (this.a(false)) {
                    n2 = 4;
                }
                this.a(n2, -1);
                return;
            }
            case 9: 
        }
        if (this.h()) return;
        this.a(2, -1);
    }

    public void o(int n2) {
        this.a = (short)n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int p() {
        if (this.a == null) return 0;
        return this.a.e();
    }

    public void p() {
        this.a(this.c);
        this.a(this.g);
        this.g();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int q() {
        if (this.f.size() <= 0) return -1;
        return ((an)this.f.elementAt(0)).b();
    }
}

