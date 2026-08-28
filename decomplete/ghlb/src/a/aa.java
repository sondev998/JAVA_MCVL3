/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.ac;
import a.af;
import a.ag;
import a.al;
import a.ap;
import a.aq;
import a.ax;
import a.ay;
import a.az;
import a.bb;
import a.bd;
import a.bf;
import a.bg;
import a.bk;
import a.bl;
import a.bm;
import a.bn;
import a.e;
import a.f;
import a.k;
import a.m;
import a.s;
import a.t;
import a.u;
import a.w;
import a.y;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aa
extends bd {
    public static aa a;
    public static bm a;
    public static boolean a;
    public static byte[] a;
    public static byte c;
    public static int c;
    public static byte d;
    public static byte[] e;
    public static byte[] f;
    public static byte g;
    public static byte[] g;
    public static byte[] h;
    public static byte[] i;
    public byte a;
    public int a;
    public String a;
    public Vector a;
    private int[][] a = "";
    public byte b;
    public int b;
    public Vector b;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte e;
    public byte f;
    private int n;

    static {
        Static.regClass(1);
        aa.cinitclone();
    }

    public aa() {
        super(ac.a, ac.b, 16, 16);
        int[] nArray = new int[]{-2, -2};
        int[] nArray2 = new int[]{1, 1};
        int[] nArray3 = new int[]{-1, -1};
        int[] nArray4 = new int[]{0, 0};
        int[] nArray5 = new int[]{0, 0};
        int[] nArray6 = new int[]{0, 0};
        int[] nArray7 = new int[]{0, 0};
        int[] nArray8 = new int[]{0, 0};
        int[] nArray9 = new int[]{0, 0};
        this.a = new int[][]{nArray, nArray2, nArray3, {0, 0}, {0, 0}, {0, 0}, nArray4, nArray5, {0, 0}, {0, 0}, {0, 0}, nArray6, nArray7, nArray8, nArray9, {0, 0}};
        this.n = 0;
        this.b = new Vector(5);
        this.a = new Vector(5);
        a.e.a();
        a = new bm();
    }

    public static aa a() {
        if (a == null) {
            a = new aa();
        }
        return a;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, int n3, int n4, int n5, int n6, Vector vector, boolean bl2) {
        ag ag2;
        int n7;
        for (n7 = vector.size() - 1; n7 >= 0; --n7) {
            ag2 = (ag)vector.elementAt(n7);
            if (ag2.q != n3 || ag2.r != n2) continue;
            return;
        }
        n7 = 1;
        if (n7 == 0) return;
        ag2 = new ag();
        ag2.a(n4, (byte)n5, (byte)n6);
        ag2.q = (byte)n3;
        ag2.r = (byte)n2;
        this.a(vector, ag2);
        if (!bl2) return;
        this.a(ag2, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(ag ag2, boolean bl2) {
        this.b.removeElement(ag2);
        if (bl2) {
            return;
        }
        this.a(this.b, ag2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(m m2, af[] afArray) {
        int n2;
        Object object;
        bl bl2 = ay.a;
        if (bl2.a(true)) return;
        if (bl2.i == 6 && !a.k.b) {
            return;
        }
        if (bl2.f(4)) {
            a.f.a(s.d[71]);
            return;
        }
        if (afArray != null && a.k.b(afArray) == 1 && (m2 == null || m2.a() == bl2.a())) {
            if (!w.a().a(3)) {
                w.a().a(4);
            }
            if ((object = a.m.a()) != null && ((m)object).c() == 0) {
                aa.a((m)object, afArray);
                return;
            }
        }
        object = afArray;
        if (m2 != null) {
            object = afArray;
            if (m2.c() == 0) {
                object = afArray;
                if (afArray == null) {
                    object = ay.a;
                }
            }
        }
        if (object != null) {
            if (bl2.i == 5 && object[1].b() == bl2.a[1].b()) {
                if (aa.a((m)((Object)bl2.b), m2)) return;
            }
            if (bl2.a() != null && ((af)object[1]).b() == bl2.a()[1].b()) {
                if (aa.a(bl2.c(), m2)) return;
            }
            if (!a.k.a((af[])object, true)) return;
            if (!a.k.b((af[])object, true)) return;
            if (!a.k.a((m)bl2, (af[])object, true)) return;
            if (!a.k.a((int)bl2.d, (af[])object, true)) return;
            if (!a.k.a((af[])object, m2, true)) return;
            if (!a.k.a((m)bl2, m2, (af[])object, true)) return;
            if (a.k.a((m)bl2, m2, (af[])object)) return;
        }
        if (m2 == null) return;
        int n3 = n2 = 0;
        if (m2.c() > 0) {
            n3 = n2;
            if (object == null) {
                switch (m2.j) {
                    default: {
                        return;
                    }
                    case 2: 
                    case 64: {
                        bb.a().a(m2);
                        return;
                    }
                    case 8: 
                }
                n3 = n2 = 2;
                if (bl2.i == 5) {
                    a.k.b(bl2);
                    n3 = n2;
                }
            }
        }
        n2 = n3;
        if (n3 == 0) {
            n2 = a.k.a((af[])object);
        }
        bl2.a(1, m2, (af[])object);
        if (!aa.a(m2, bl2, n2)) return;
        bb.a().a(m2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Vector vector) {
        int n2 = vector.size() - 1;
        while (n2 >= 0) {
            m m2 = (m)vector.elementAt(n2);
            if (!this.a(m2, 0, 0) || m2.j != 1024 && !m2.i()) {
                this.a(m2, true);
            } else if (!this.b.contains(m2)) {
                this.a(m2, false);
            } else if (m2 instanceof e && ((e)m2).a != null) {
                this.a(((e)m2).a, false);
            } else {
                this.a(m2, true);
            }
            --n2;
        }
        return;
    }

    private void a(Vector vector, y y2) {
        int n2 = vector.size();
        int n3 = 0;
        while (true) {
            block6: {
                block5: {
                    if (n3 >= n2) break block5;
                    if (!((y)vector.elementAt(n3)).a(y2)) break block6;
                    vector.insertElementAt(y2, n3);
                }
                if (n3 >= n2) {
                    vector.addElement(y2);
                }
                return;
            }
            ++n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2, int n3, int n4, int n5, int n6) {
        if (Math.max(Math.abs(n2 - n4), Math.abs(n3 - n5)) <= n6) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 <= -n6) return false;
        if (n3 >= ac.a + n6) return false;
        if (n4 <= -n7) return false;
        if (n5 >= ac.b + n7) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int n2, int n3, m m2) {
        if (m2.j == 8 && !bk.a(((bk)m2).r())) {
            return false;
        }
        if (!this.b.contains(m2)) {
            return false;
        }
        int n4 = aa.a().a((int)m2.q, (int)m2.r);
        if (!al.a(n2, n3, m2.d - 16, m2.d + 16, m2.e - 55 - n4, m2.e + 15 - n4)) return false;
        if (a.m.o() != m2.a()) {
            a.m.a(m2);
            return true;
        }
        ap.a().i();
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(m m2) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (!this.a(m2, 0, 0)) return bl3;
        if (m2.i()) return true;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(m m2, m m3) {
        if (m2 == null) return true;
        if (m3 == null) return false;
        if (m2.a() != m3.a()) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(m m2, m m3, int n2) {
        if (Math.max(Math.abs(m2.q - m3.q), Math.abs(m2.r - m3.r)) <= n2) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private boolean a(m var1_1, boolean var2_2) {
        block9: {
            var4_3 = false;
            if (!var1_1.i()) {
                var3_4 = var4_3;
lbl4:
                // 9 sources

                return var3_4;
            }
            switch (var1_1.j) {
                default: {
                    var3_4 = true;
                    ** GOTO lbl4
                }
                case 64: {
                    var3_4 = var4_3;
                    if (aa.a) ** GOTO lbl4
                    if (var2_2) ** GOTO lbl16
                    var3_4 = var4_3;
                    if (ap.r == 3) ** GOTO lbl4
lbl16:
                    // 3 sources

                    while (true) {
                        if ((bl.k & 16) == 0 && a.m.a == null && ay.a.d(true) && aa.a(var1_1, ay.a, 2)) {
                            a.m.a(var1_1);
                        }
                        var3_4 = true;
                        ** GOTO lbl4
                        break;
                    }
                }
                case 8: {
                    if (bk.a(var1_1.a(10))) ** continue;
                    var3_4 = true;
                    ** GOTO lbl4
                }
                case 2: 
            }
            var3_4 = var4_3;
            if (aa.a) ** GOTO lbl4
            if (var2_2) break block9;
            var3_4 = var4_3;
            if (ap.r == 3) ** GOTO lbl4
        }
        var3_4 = true;
        ** while (true)
    }

    private void b(m m2) {
        m m3 = a.m.a();
        if (m3 != null && m2 != null && m3.a() == m2.a()) {
            a.k.a((m)ay.a, m3.a());
            a.m.a(null);
        }
    }

    private static boolean b(m m2, m m3, int n2) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (m2.j != 1) {
            bl3 = bl2;
            if (m2.c() > 0) {
                bl3 = bl2;
                if (!aa.a(m2, m3, n2)) {
                    bl3 = false;
                }
            }
        }
        return bl3;
    }

    private void c(int n2, int n3) {
        g = 0;
        int n4 = ay.q.size() - 1;
        while (true) {
            block4: {
                block3: {
                    if (n4 < 0) break block3;
                    af[] afArray = (af[])ay.q.elementAt(n4);
                    if (afArray == null || n2 + 1 < afArray[1].b() || n2 - 1 > afArray[1].b() || n3 + 1 < afArray[2].b() || n3 - 1 > afArray[2].b()) break block4;
                    g = ((t)afArray[0]).a;
                }
                return;
            }
            --n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(m m2) {
        w.a(m2);
        switch (m2.j) {
            default: {
                return;
            }
            case 1: 
            case 64: 
        }
        ax ax2 = ((e)m2).a();
        if (ax2 == null) return;
        boolean bl2 = !m2.d();
        this.a(ax2, bl2);
    }

    public static void cinitclone() {
        a = false;
        c = (byte)16;
        d = (byte)16;
    }

    public static void e() {
        a = null;
    }

    private void f() {
        this.b.removeAllElements();
        int n2 = this.a.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.b.addElement(this.a.elementAt(i2));
        }
    }

    public int a(int n2) {
        return n2 - this.h;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int a(int n2, int n3) {
        try {
            n2 = this.a * n3 + n2;
            if (n2 >= a.length) return 0;
            if (a[n2] == -1) return 0;
            n2 = bf.a(al.b(a[n2]));
            n3 = ag.f;
            n2 &= n3;
            return n2;
        }
        catch (Exception exception) {
            // empty catch block
            return 0;
        }
    }

    public az a(int n2, int n3) {
        return new az(c * n2, d * n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a() {
        int n2;
        byte[] byArray = i;
        Object object = new aq(byArray);
        object = ((aq)object).a();
        byArray = new byte[5];
        int n3 = 0;
        int n4 = 0;
        while (true) {
            n2 = byArray.length;
            if (n3 >= n2) break;
            byArray[n3] = (byte)object[n4];
            ++n4;
            ++n3;
        }
        this.a(byArray[1], byArray[2], byArray[3], byArray[4]);
        int n5 = byArray[1];
        int n6 = byArray[2];
        bf.a = null;
        bf.d();
        a = new byte[n5 * n6];
        n2 = 0;
        for (n3 = 0; n3 < n5; ++n3) {
            int n7 = 0;
            while (n7 < n6) {
                aa.a[n2] = (byte)object[n4];
                ++n4;
                ++n7;
                ++n2;
            }
        }
        this.b = new byte[(n5 * n6 + 7) / 8];
        n3 = 0;
        while (true) {
            if (n3 >= this.b.length) break;
            this.b[n3] = (byte)object[n4];
            ++n4;
            ++n3;
            continue;
            break;
        }
        this.d = new byte[(n5 * n6 + 7) / 8];
        n3 = 0;
        while (true) {
            if (n3 >= this.d.length) break;
            this.d[n3] = (byte)object[n4];
            ++n4;
            ++n3;
            continue;
            break;
        }
        this.c = new byte[(n5 * n6 + 7) / 8];
        n3 = 0;
        while (true) {
            if (n3 >= this.c.length) break;
            this.c[n3] = (byte)object[n4];
            ++n4;
            ++n3;
            continue;
            break;
        }
        try {
            i = null;
            al.a(this.b, (int)byArray[1], (int)byArray[2], 5);
            return;
        }
        catch (Exception exception) {
            bb.a("T\u1ea3i b\u1ea3n \u0111\u1ed3 l\u1ed7i!", false);
            return;
        }
    }

    public void a(byte by, byte by2, byte by3, byte by4) {
        this.b();
        this.a = by;
        this.b = by2;
        c = by3;
        d = by4;
        d = (byte)(this.a * c);
        e = (byte[])(this.b * d);
        w.a().e();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void a(int n2, int n3) {
        byte[] byArray;
        void var3_13;
        void var3_11;
        void var3_9;
        void var3_7;
        void var3_5;
        boolean bl2 = false;
        if (n2 > ac.a >> 1) {
            int n4 = n2 - (ac.a >> 1);
        } else {
            boolean bl3 = false;
        }
        this.h = var3_5;
        if (this.h < d - ac.a) {
            byte[] byArray2 = this.h;
        } else {
            int n5 = d - ac.a;
        }
        this.h = var3_7;
        if (this.h > 0) {
            byte[] byArray3 = this.h;
        } else {
            boolean bl4 = false;
        }
        this.h = var3_9;
        short s2 = ac.b;
        if (n3 > s2 >> 1) {
            int n6 = n3 - (s2 >> 1);
        } else {
            boolean bl5 = false;
        }
        this.i = var3_11;
        if (this.i < e - s2) {
            byte[] byArray4 = this.i;
        } else {
            reference var3_20 = e - s2;
        }
        this.i = var3_13;
        boolean bl6 = bl2;
        if (this.i > 0) {
            byArray = this.i;
        }
        this.i = byArray;
        this.e = (byte)(n2 / c);
        this.f = (byte)(n3 / d);
    }

    public void a(int n2, int n3, int n4, String string) {
        this.b = n2;
        this.a = n3;
        this.a = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int n2, int n3, boolean bl2) {
        if (!bl2) {
            return;
        }
        this.a(n2, n3);
        this.b((int)this.h, (int)this.i, false);
        ac.a = true;
        a.m.b = true;
    }

    public void a(m m2) {
        this.a(c * m2.q, d * m2.r);
        super.b((int)this.h, (int)this.i, true);
        ac.a = true;
    }

    /*
     * Unable to fully structure code
     */
    public void a(m var1_1, boolean var2_2) {
        block14: {
            var4_3 = true;
            if (var2_2) {
                this.b(var1_1);
            }
            var5_4 = this.b.removeElement(var1_1);
            if (var2_2) {
                this.c(var1_1);
lbl7:
                // 5 sources

                return;
            }
            block0 : switch (var1_1.j) lbl-1000:
            // 3 sources

            {
                default: {
                    this.a(this.b, var1_1);
                    ** GOTO lbl7
                }
                case 64: {
                    if (var1_1.d() && this.a(var1_1)) break block14;
                    var3_5 = true;
lbl16:
                    // 2 sources

                    while (true) {
                        if (var5_4) break block0;
                        if (this.a(var1_1, false)) {
                            var4_3 = var3_5;
                        }
lbl20:
                        // 5 sources

                        while (true) {
                            var6_6 = ((e)var1_1).a();
                            if (var6_6 != null) {
                                this.a(var6_6, false);
                            }
                            if (!var4_3) ** GOTO lbl-1000
                            ** GOTO lbl7
                            break;
                        }
                        break;
                    }
                }
                case 8: {
                    if (!var1_1.d() || !this.a(var1_1)) ** GOTO lbl7
                }
                case 2: {
                    if (this.a(var1_1) && this.a(var1_1, false)) ** GOTO lbl-1000
                    ** continue;
                }
            }
            var4_3 = var3_5;
            ** GOTO lbl20
        }
        var3_5 = false;
        ** while (true)
        {
            ** case 1:
        }
lbl37:
        // 1 sources

        var4_3 = false;
        ** while (true)
    }

    public void a(Graphics graphics) {
        int n2 = 45;
        ag.a();
        ay.e.a(-1);
        super.a(graphics, 0, 0);
        al.b(graphics);
        this.a(graphics, this.b);
        if (a.m.a != null && a.m.a.j == 8) {
            bk bk2 = (bk)a.m.a;
            int n3 = aa.a().a(bk2.d);
            int n4 = aa.a().b(bk2.e) - aa.a().a((int)bk2.q, (int)bk2.r);
            int n5 = n2;
            if (bk2.a != null && (n5 = bk2.a.g()) < 45) {
                n5 = n2;
            }
            bk2.a(graphics, n3, n4 - n5 - s.h, n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Graphics graphics, int object, int object2, int n2, int n3, int n4, int n5) {
        graphics.setClip(n2, n3, n4, n5);
        graphics.fillRect(n2, n3, n4, n5);
        Vector vector = new Vector(5);
        Object object3 = d;
        int n6 = n3 + n5 + d * 4;
        Object object4 = c;
        int n7 = n2 + n4 + c * 4;
        int n8 = this.j / this.l * this.l;
        int n9 = this.k / this.m * this.m;
        az az2 = this.b(n2 - object4 * 4 - object + n8, n3 - object3 * 4 - object2 + n9);
        az az3 = this.b(n7 - object + n8, n6 - object2 + n9);
        object3 = Math.max(az2.d, 0);
        int n10 = Math.min(az3.d, this.a);
        object4 = Math.max(az2.e, 0);
        int n11 = Math.min(az3.e, this.b);
        n8 = -n8 + object;
        int n12 = -n9 + object2;
        object = object4;
        while (true) {
            if (object >= n11) {
                object2 = aa.a().h;
                object = aa.a().i;
                aa.a().h = (byte[])(-n8);
                aa.a().i = (byte[])(-n12);
                graphics.setClip(n2, n3, n4, n5);
                this.a(graphics, vector);
                aa.a().h = (byte[])object2;
                aa.a().i = (byte[])object;
                return;
            }
            for (object2 = object3; object2 < n10; ++object2) {
                byte by;
                int n13 = this.a * object + object2;
                object4 = -1;
                if (a[n13] != -1) {
                    object4 = al.b(a[n13]);
                }
                if (object4 <= -1) continue;
                int n14 = c * object2 + n8;
                int n15 = d * object + n12;
                if (n15 - 64 >= n6) continue;
                try {
                    int n16 = bf.a(object4);
                    by = bf.a(object4);
                    n9 = bf.b(object4);
                    if ((ag.b & n16) != 0 && (ag.c & n16) == 0) {
                        byte by2 = c;
                        byte by3 = d;
                        if (by * by2 + n14 < n2 || n14 > n2 + n4 || n15 + (n16 &= ag.f) + n9 * by3 < n3 || n16 + n15 > n3 + n5) continue;
                        n9 = 0;
                        if ((this.d[n13 >> 3] & ag.a[n13 % 8]) != 0) {
                            n9 = 1;
                        }
                        bf.a(graphics, object4, n14, n15, n9);
                        continue;
                    }
                    if ((n16 & ag.e) != 0) {
                        this.a((int)object, (int)object2, (int)object4, (int)by, n9, vector, false);
                    }
                }
                catch (Exception exception) {}
                continue;
                if (n14 >= n7 - c * 3 || n15 >= n6 - d * 3) continue;
                this.a((int)object, (int)object2, (int)object4, (int)by, n9, this.a, true);
            }
            ++object;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl2, int n10, int n11, int n12, int n13) {
        if (bl2) {
            this.a(graphics, n7, n8, n3, n4, n5, n6);
            return;
        }
        if (n9 == 1) {
            if (n2 == 2) {
                this.a(graphics, n7, n8, n12, n13, n10, n6);
                return;
            }
            if (n2 != 8) return;
            this.a(graphics, n7, n8, n12, 0, n10, n6);
            return;
        }
        if (n9 == 3) {
            if (n2 == 1) {
                this.a(graphics, n7, n8, n12 + n10, n13, -n10, n6);
                return;
            }
            if (n2 != 4) return;
            this.a(graphics, n7, n8, n12 + n10, 0, -n10, n6);
            return;
        }
        if (n9 == 0) {
            if (n2 == 4) {
                this.a(graphics, n7, n8, n12, n13, n5, n11);
                return;
            }
            if (n2 != 8) return;
            this.a(graphics, n7, n8, 0, n13, n5, n11);
            return;
        }
        if (n9 != 2) return;
        if (n2 == 1) {
            this.a(graphics, n7, n8, n12, n13 + n11, n5, -n11);
            return;
        }
        if (n2 != 2) return;
        this.a(graphics, n7, n8, 0, n13 + n11, n5, -n11);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Graphics graphics, Vector vector) {
        int n2 = 0;
        while (n2 < vector.size()) {
            y y2 = (y)vector.elementAt(n2);
            try {
                y2.a(graphics);
                y2.n(100);
            }
            catch (Exception exception) {}
            ++n2;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(short s2, short s3) {
        if (bl.l > 0) {
            return;
        }
        if (bb.a().a(16384)) return;
        this.c(s2, s3);
        if (g <= 0) return;
        ay.a.e();
        ay.a.c(true);
        ay.a.b(false);
        f = null;
        e = null;
        g = null;
        u.a((short)130, this.a, s2, s3, (short)0, g);
        bb.a().a(16384, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(boolean bl2, Vector vector) {
        if (bl2) {
            ac.b = true;
            this.b.removeAllElements();
            this.a.removeAllElements();
            return;
        } else {
            for (int i2 = vector.size() - 1; i2 >= 0; --i2) {
                ag ag2 = (ag)vector.elementAt(i2);
                if (this.a(ag2, 32, 32)) continue;
                vector.removeElementAt(i2);
                this.a(ag2, true);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(byte[] byArray, int n2) {
        Object object = n2 == 0 ? e : (n2 == 1 ? bg.b : (n2 == 2 ? bg.a : (n2 == 3 ? f : (n2 == 4 ? i : (Object)(n2 == 5 ? h : null)))));
        if (object != null) {
            byte[] byArray2 = new byte[((byte[])object).length + byArray.length];
            if (c >= byArray2.length) {
                bg.a();
                return;
            }
            System.arraycopy(object, 0, byArray2, 0, ((byte[])object).length);
            System.arraycopy(byArray, 0, byArray2, c, byArray.length);
            object = byArray2;
        } else {
            c = 0;
            object = byArray;
        }
        c += byArray.length;
        if (n2 == 0) {
            e = object;
            return;
        }
        if (n2 == 1) {
            bg.b = object;
            return;
        }
        if (n2 == 2) {
            bg.a = object;
            return;
        }
        if (n2 == 3) {
            f = object;
            return;
        }
        if (n2 == 4) {
            i = object;
            return;
        }
        if (n2 != 5) return;
        h = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(byte[] byArray, byte[] byArray2, int n2) {
        byArray2 = new aq(byArray).a();
        byArray = new byte[byArray2.length - 2];
        System.arraycopy(byArray2, 2, byArray, 0, byArray2.length - 2);
        if (n2 == 1) {
            g = al.a(null, false, 0, byArray);
            return;
        }
        bg.c = al.a(null, false, 0, byArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2, int n3) {
        e e2;
        int n4;
        for (n4 = ay.k.size() - 1; n4 >= 0; --n4) {
            if (!this.a(n2, n3, (m)ay.k.elementAt(n4))) continue;
            return true;
        }
        for (n4 = ay.m.size() - 1; n4 >= 0; --n4) {
            e2 = (e)ay.m.elementAt(n4);
            if (this.a(n2, n3, e2)) {
                return true;
            }
            if (e2.a() == null || !this.a(n2, n3, e2.a())) continue;
            return true;
        }
        e2 = ay.a;
        if (this.a(n2, n3, e2)) {
            return true;
        }
        if (e2.a() != null && this.a(n2, n3, e2.a())) {
            return true;
        }
        ay.a.j(1);
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2, int n3, int n4) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (n4 >= this.b) return bl3;
        bl3 = bl2;
        if (n3 >= this.a) return bl3;
        bl3 = bl2;
        if (n3 < 1) return bl3;
        if (n4 < 1) {
            return bl2;
        }
        bl3 = bl2;
        if (this.b == null) return bl3;
        n3 = this.a * n4 + n3;
        if (n2 >= 2) {
            return false;
        }
        if ((this.b[n3 / 8] & ag.a[n3 % 8]) == 0) {
            return false;
        }
        bl3 = bl2;
        if (n2 != 1) return bl3;
        n2 = this.c[n3 / 8];
        bl3 = bl2;
        if ((ag.a[n3 % 8] & n2) != 0) return bl3;
        return false;
    }

    public boolean a(int n2, int n3, int n4, int n5) {
        n2 = c * n2 - this.h;
        n3 = d * n3 - this.i;
        return aa.a(c + n2, n2, d + n3, n3, n4, n5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(y y2, int n2, int n3) {
        if (!this.b(y2, n2, n3)) return false;
        if (!(y2 instanceof m)) return true;
        if (a.m.g >= 3) return true;
        switch (((m)y2).j) {
            default: {
                return true;
            }
            case 2: 
            case 8: 
            case 64: 
        }
        if (aa.a((m)y2, ay.a, a.m.g * 5)) return true;
        return false;
    }

    public int b(int n2) {
        return n2 - this.i;
    }

    public az b(int n2, int n3) {
        return new az(n2 / c, n3 / d);
    }

    public void b() {
        a = null;
        this.b = null;
        this.d = null;
        this.a.removeAllElements();
        this.b.removeAllElements();
    }

    public void b(int n2, int n3) {
        aa.a.q = (byte)n2;
        aa.a.r = (byte)n3;
        bm.a.b(2000);
        this.a(a, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(y y2, int n2, int n3) {
        if (y2 != null) return this.a((int)y2.q, (int)y2.r, n2, n3);
        return false;
    }

    public az c(int n2, int n3) {
        return this.b((int)(this.h + n2), (int)(this.i + n3));
    }

    public void c() {
        if (bn.a != null) {
            bn.a.a(false);
        }
        a.f.a(0);
        ay.a.e();
        a.f.b(61);
        ay.a(false);
        g = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void d() {
        bl bl2;
        if (ac.b) {
            ac.b = false;
            this.f();
        }
        if ((bl2 = ay.a) == null) {
            return;
        }
        m m2 = a.m.a();
        if (m2 != null) {
            if (!this.a(m2, 0, 0)) {
                this.b(m2);
            } else if ((bl.k & 0x10) == 0) {
                if (m2.a() == bl2.a() || bl2.d(true) && !aa.a(m2, bl2, 2)) {
                    this.b(m2);
                }
            } else if (!aa.b(m2, bl2, 6)) {
                this.b(m2);
            }
        }
        if (!this.b.contains(bl2)) {
            this.a(bl2, false);
        }
        this.a(ay.k);
        this.a(ay.m);
        this.a(ay.p);
        if (bl.c == null) return;
        this.a(bl.c, false);
    }
}

