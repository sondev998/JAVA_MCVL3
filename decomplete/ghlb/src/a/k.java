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
import a.af;
import a.al;
import a.an;
import a.ap;
import a.ax;
import a.ay;
import a.az;
import a.ba;
import a.bb;
import a.bc;
import a.bf;
import a.bg;
import a.bl;
import a.d;
import a.e;
import a.f;
import a.j;
import a.m;
import a.p;
import a.s;
import a.t;
import a.z;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class k {
    public static int a;
    public static long a;
    public static bg a;
    public static p a;
    public static short a;
    public static boolean a;
    public static int[] a;
    public static String[] a;
    public static short[][] a;
    public static int b;
    public static p b;
    public static boolean b;
    public static int c;
    public static boolean c;
    public static boolean d;

    static {
        Static.regClass(28);
        k.cinitclone();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(int n2) {
        switch (n2) {
            default: {
                return 100;
            }
            case 1: {
                return 75;
            }
            case 2: {
                return 50;
            }
            case 3: 
        }
        return 25;
    }

    private static int a(int n2, int n3) {
        return k.b(k.b(n2, 0), n3);
    }

    private static int a(int n2, m m2, m object, int n3, int n4) {
        int n5 = n2;
        if (k.a(n3, n4)) {
            m2.a(false);
            if (m2.f()) {
                m2.a(0, m.a(m2, (m)object));
            }
            n3 = n2;
            if (n2 / 10 == 0) {
                n3 = n2 % 10 + 210;
            }
            n4 = n3 / 10;
            int n6 = 0;
            for (n2 = 0; n2 < 3; ++n2) {
                n5 = n6;
                if (n4 % 100 != 0) {
                    n5 = n6 + 1;
                }
                n4 /= 100;
                n6 = n5;
            }
            a = new int[n6 * 2];
            n4 = n3 / 10;
            n6 = 0;
            for (n2 = 0; n2 < 3; ++n2) {
                n5 = n6;
                if (n4 % 100 != 0) {
                    object = a;
                    int n7 = n6 + 1;
                    object[n6] = n4 % 100 + 1000;
                    object = a;
                    n5 = n7 + 1;
                    object[n7] = m2.a.d(m2.e(n4 % 100));
                }
                n4 /= 100;
                n6 = n5;
            }
            n5 = n3 % 1000;
        }
        return n5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(af[] afArray) {
        int n2;
        if (afArray == null) return b;
        int n3 = n2 = Math.abs(afArray[12].b());
        if (b == -1) return n3;
        n3 = n2;
        if (b >= n2) return n3;
        return b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(int n2) {
        n2 = al.b(n2);
        if (a == null) return "";
        if (n2 >= a.length) return "";
        return a[n2];
    }

    public static void a() {
        a.a();
        k.b(null);
        b = -1;
        a = new short[4][4];
    }

    private static void a(int n2, int n3) {
        int n4;
        Vector vector = ay.h;
        for (n4 = vector.size() - 1; n4 >= 0; --n4) {
            k.a((af[])vector.elementAt(n4), n2, n3);
        }
        vector = ay.a;
        for (n4 = vector.size() - 1; n4 >= 0; --n4) {
            k.a(((bc)vector.elementAt((int)n4)).a, n2, n3);
        }
        ap.a().f();
    }

    /*
     * Unable to fully structure code
     */
    public static void a(int var0, m var1_1, m var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        block8: {
            var9_7 = 0;
            var8_8 = 0;
            if (var1_1 == null) break block8;
            var11_9 = var1_1.a();
            var12_10 = var1_1.j;
lbl6:
            // 2 sources

            while (true) {
                var7_11 = var5_5;
                var10_12 = var6_6;
                if (var2_2 == null) ** GOTO lbl35
                var5_5 = var2_2.a();
                var6_6 = var2_2.j;
                var14_13 = var2_2.q;
                var13_14 = var2_2.r;
                var8_8 = var6_6;
                var9_7 = var5_5;
                var7_11 = var14_13;
                var10_12 = var13_14;
                if (var1_1 == null) ** GOTO lbl35
                var8_8 = var6_6;
                var9_7 = var5_5;
                var7_11 = var14_13;
                var10_12 = var13_14;
                if (var1_1.q != var14_13) ** GOTO lbl35
                var8_8 = var6_6;
                var9_7 = var5_5;
                var7_11 = var14_13;
                var10_12 = var13_14;
                if (var1_1.r != var13_14) ** GOTO lbl35
                switch (var1_1.e) {
                    default: {
                        var10_12 = var13_14;
                        var7_11 = var14_13;
                        var9_7 = var5_5;
                        var8_8 = var6_6;
lbl35:
                        // 5 sources

                        var6_6 = var8_8;
                        var5_5 = var9_7;
                        var8_8 = var10_12;
lbl38:
                        // 5 sources

                        while (true) {
                            bb.a(ay.a);
                            z.a().a(1041, new an(var0), new an(var11_9), new an(var12_10), new an(var5_5), new an(var6_6), new an(var3_3), new an(var4_4), new ba((short)var7_11), new ba((short)var8_8));
                            return;
                        }
                    }
                    case 2: {
                        var8_8 = var13_14 - 1;
                        var7_11 = var14_13;
                        ** GOTO lbl38
                    }
                    case 0: {
                        var8_8 = var13_14 + 1;
                        var7_11 = var14_13;
                        ** GOTO lbl38
                    }
                    case 3: {
                        var7_11 = var14_13 - 1;
                        var8_8 = var13_14;
                        ** GOTO lbl38
                    }
                    case 1: 
                }
                var7_11 = var14_13 + 1;
                var8_8 = var13_14;
                ** continue;
                break;
            }
        }
        var11_9 = 0;
        var12_10 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(int n2, Vector vector) {
        int n3;
        af[] afArray = (af[])a.a(n2);
        if (afArray == null) {
            n3 = vector.size() - 1;
        } else {
            for (n2 = vector.size() - 1; n2 >= 0; --n2) {
                af[] afArray2 = (af[])vector.elementAt(n2);
                if (afArray2[1].b() / 10 % 1000 == 39) {
                    afArray.insertElementAt(afArray2, 0);
                    continue;
                }
                afArray.addElement(afArray2);
            }
            return;
        }
        while (true) {
            block8: {
                block7: {
                    if (n3 < 0) break block7;
                    afArray = (af[])vector.elementAt(n3);
                    if (afArray[1].b() / 10 % 1000 != 39) break block8;
                    vector.removeElement(afArray);
                    vector.insertElementAt(afArray, 0);
                }
                a.a(n2, vector);
                return;
            }
            --n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(bl bl2) {
        boolean bl3;
        bc bc2;
        block6: {
            block4: {
                block5: {
                    if (!bl2.f(48)) {
                        return;
                    }
                    b = false;
                    if (!bl2.f(16) || ap.a[2].b() == 0 || ap.a[3].b() == 4 || bl2.d() * 100 / bl2.e() >= k.a(ap.a[3].b())) break block4;
                    bc2 = ay.a(ap.a[2].b(), ay.a, true);
                    if (bc2 == null) break block5;
                    if (bc2.a == null || !k.a(bc2.a, false)) break block4;
                    b = true;
                    aa.a((m)bl2, bc2.a);
                    b = false;
                    bl3 = true;
                    break block6;
                }
                bl.a(new StringBuffer().append(s.b[140]).append(s.b[141]).append("\uff0c").append(ap.a[1].toString()).append(s.b[142]).toString(), false);
            }
            bl3 = false;
        }
        if (!bl3 && bl2.f(32) && ap.a[6].b() != 0 && ap.a[7].b() != 4 && bl2.f() * 100 / bl2.g() < k.a(ap.a[7].b())) {
            bc2 = ay.a(ap.a[6].b(), ay.a, true);
            if (bc2 != null && bc2.a != null) {
                b = true;
                aa.a((m)bl2, bc2.a);
                b = false;
            } else {
                bl.a(new StringBuffer().append(s.b[140]).append(s.b[141]).append("\uff0c").append(ap.a[5].toString()).append(s.b[142]).toString(), false);
            }
        }
        bl2.a(48, false);
    }

    public static void a(m m2) {
        if (m2 != null) {
            m2.g(0);
        }
        k.b(m2);
    }

    public static void a(m m2, int n2) {
        if (m2.i == 5 && m2.b != null && m2.b.a() == n2 || m2.c() != null && m2.c().a() == n2) {
            k.a(m2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(m object, int n2, int n3) {
        int n4;
        if (n2 == 0) {
            return;
        }
        if (((m)object).a() != ay.a.a()) return;
        object = ay.h;
        int n5 = 0;
        for (n4 = ((Vector)object).size() - 1; n4 >= 0; --n4) {
            if (!k.a((af[])((Vector)object).elementAt(n4), n2, n3) || n5 != 0) continue;
            n5 = 1;
        }
        object = ay.a;
        for (n4 = ((Vector)object).size() - 1; n4 >= 0; --n4) {
            if (!k.a(((bc)((Vector)object).elementAt((int)n4)).a, n2, n3) || n5 != 0) continue;
            n5 = 1;
        }
        if (n5 != 0) return;
        n5 = ay.j.size() - 1;
        while (true) {
            if (n5 < 0) {
                if (n3 == 0) return;
                object = new af[23];
                object[18] = new an(n2);
                object[13] = new an(n3);
                object[22] = new d(System.currentTimeMillis());
                ay.j.addElement(object);
                return;
            }
            object = (af[])ay.j.elementAt(n5);
            if (object[1] == null) {
                if (k.a((af[])object, n2, n3)) return;
            }
            --n5;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(m m2, int n2, int n3, int n4) {
        m2.a(0, n3 % 100000000, n4);
        if (n3 % 100000000 > 0) {
            m2.e(n2, 16);
            return;
        }
        if (n3 / 100000000 != 10) return;
        m2.b(true);
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static void a(m afArray, m m2, int n2, int n3, int n4, int n5, int n6) {
        block30: {
            block29: {
                boolean bl2 = k.a((m)afArray) || k.a(m2);
                if (k.a((m)afArray, m2, n2, bl2, n3, n4, n5, n6)) break block29;
                if (n3 >= 70 && n3 <= 75 && m2.j == 1) break block30;
                int n7 = 0;
                do {
                    switch (n7 == 0 ? n3 : n7) {
                        default: {
                            break block29;
                        }
                        case 22: 
                        case 38: {
                            n3 = n3 == 38 ? 6 : 1;
                        }
                        case 37: {
                            k.a(m2, n4, n5);
                            break block29;
                        }
                        case 33: 
                        case 62: {
                            m2.k(n5);
                            break block29;
                        }
                        n7 = 60;
                        m2.a(n4, n3, n2, bl2);
                        case 60: {
                            k.a(m2, n4, n5, 0);
                            break block29;
                        }
                        case 41: 
                        case 42: {
                            int n8 = Math.abs(n4) / 100000000;
                            int n9 = n4 % 100000000;
                            afArray = null;
                            if (bl2) {
                                afArray = new af[n8 + 2];
                                n4 = k.a(n9) ? 0 : n9;
                                afArray[n8] = new an(Math.abs(n4));
                                afArray[n8 + 1] = new an(0);
                            }
                            int n10 = 0;
                            int n11 = 1;
                            n4 = 5;
                            int n12 = n2;
                            n2 = n11;
                            for (n6 = 0; n6 < n8; ++n6, n2 += 2) {
                                if (afArray != null) {
                                    afArray[n6] = n6 == 0 ? new t((byte)(n12 + 1)) : new an(n4);
                                }
                                if (a != null) {
                                    n4 = n2;
                                    if (n2 >= a.length) {
                                        n4 = 1;
                                    }
                                    n11 = a[n4];
                                    n2 = n4;
                                    n4 = n11;
                                }
                                n11 = n3 == 41 ? 6 : 1;
                                m2.a(n9, n11, n12, bl2);
                                n11 = n12 + n4;
                                n12 = n10;
                                if (n6 < n8 - 1) {
                                    n12 = n10 + n4;
                                }
                                n10 = n12;
                                n12 = n11;
                            }
                            m2.a(afArray);
                            k.a(m2, n9, n5, n10);
                            break block29;
                        }
                        case 43: {
                            k.b(m2, n4 / 100000, n4 / 100 % 1000, 39);
                            break block29;
                        }
                        case 23: {
                            m2.a(n4, -1, 0);
                            break block29;
                        }
                        case 31: {
                            m2.a(n4, 2, n2, bl2);
                        }
                        case 61: {
                            m2.e(n4, 32);
                            m2.b(0, n5);
                            break block29;
                        }
                        case 32: {
                            m2.b(n4, -1);
                            break block29;
                        }
                        case 40: {
                            k.b(m2, n4 / 1000, n4 % 1000, 40);
                            break block29;
                        }
                        case 52: 
                        case 53: {
                            if (afArray != null && !afArray.a(false) && afArray.a(m2, n4, n5, n6, null) && !afArray.f()) {
                                afArray.j();
                            }
                            break block29;
                        }
                        case 71: {
                            k.c(m2, n4);
                            break block29;
                        }
                        case 72: {
                            m2.b(0, n4);
                            break block29;
                        }
                        case 73: {
                            k.d(m2, n4);
                            break block29;
                        }
                        case 75: {
                            k.d(m2, n6);
                            break;
                        }
                        case 74: 
                    }
                    break;
                } while (true);
                k.c(m2, n5);
                m2.b(0, n4 % 100000000);
            }
            if (!aa.a().b.contains(m2)) {
                m2.n();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(m m2, m m3, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = n5 / 10 % 1000;
        if (n5 % 10 == 1) {
            if (!k.a(n9, n6)) {
                m3.a(n3, n4, m2, m3, 0);
            } else {
                int n10 = Math.abs(n6) / 100000000;
                int n11 = 0;
                n5 = 1;
                int n12 = 5;
                for (int i2 = 0; i2 < n10; n11 += n5, ++i2) {
                    int n13;
                    if (a != null) {
                        n12 = n5;
                        if (n5 >= a.length) {
                            n12 = 1;
                        }
                        n5 = a[n12];
                    } else {
                        n13 = n5;
                        n5 = n12;
                        n12 = n13;
                    }
                    m3.a(n3, n4, m2, m3, n11);
                    n13 = n12 + 2;
                    n12 = n5;
                    n5 = n13;
                }
            }
        }
        k.a(m2, m3, n2, n9, n6, n7, n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(m m2, m m3, af[] afArray) {
        k.b(m2);
        int[] nArray = ((bl)m2).a;
        if (nArray != false) {
            if (afArray[7].b() == 10) return;
        }
        if (afArray[7].b() == 2 && afArray[10].b() == 1) {
            return;
        }
        if (afArray[16].b() > 0) {
            if (afArray[15].b() > 0) {
                if (m2.b != null) {
                    m2.b(true);
                }
                if (nArray != false) {
                    ((bl)m2).a = (int[])false;
                    bb.a(0, false, m2);
                }
                m2.a(afArray[15].b(), m.a(m2, m3));
                a = m.a(afArray[17].b(), m2, m3);
            }
            m2.a(5, m3, afArray);
            if (afArray[1].b() != ay.a[1].b()) {
                a = System.currentTimeMillis();
                a = afArray[16].b();
            }
        } else {
            ay.j.removeElement(afArray);
            ay.j.addElement(afArray);
            ((d)afArray[22]).a = System.currentTimeMillis();
            afArray[13].a(-a);
            if (m2.a() != null && m2.a()[1].b() == ay.a[1].b()) {
                return;
            }
        }
        switch (afArray[7].b()) {
            default: {
                break;
            }
            case 1: 
            case 3: 
            case 4: 
            case 5: {
                if (afArray[14].b() != 0 && m3 != null && m3.c() == 0) {
                    afArray = ay.a;
                }
                if (afArray[14].b() != 0) break;
                m2.a(m3, afArray[1].b(), afArray[15].b(), afArray[17].b(), afArray);
                return;
            }
        }
        m2.g(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(m m2, Vector vector) {
        if (!m2.f(4)) return;
        int n2 = vector.size() - 1;
        while (true) {
            if (n2 < 0) {
                m2.a(4, false);
                m2.a(0, -1);
                ap.a().f();
                return;
            }
            if (((af)((Object[])vector.elementAt(n2))[3]).b() == 7) {
                return;
            }
            --n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(String string) {
        if (f.a() == 3) {
            bl.a(string, false);
            return;
        }
        f.a(string);
    }

    private static void a(Vector vector) {
        b = -1;
        for (int i2 = vector.size() - 1; i2 >= 0; --i2) {
            Object[] objectArray = (Object[])vector.elementAt(i2);
            if (((an)objectArray[3]).b() != 10) continue;
            k.b(((af)objectArray[8]).b());
        }
        if (b == -1) {
            ap.t = 0;
        }
        ap.a().f();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(Vector vector, int n2) {
        for (int i2 = vector.size() - 1; i2 >= 0; --i2) {
            Object[] objectArray = (Object[])vector.elementAt(i2);
            if (((an)objectArray[3]).b() != 8 || ((af)objectArray[8]).b() != n2) continue;
            return;
        }
        k.a(n2, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(Graphics graphics) {
        if (a == 0L) {
            return;
        }
        byte[] byArray = aa.f;
        byte by = aa.g;
        long l2 = System.currentTimeMillis() - a;
        if (l2 > (long)a) {
            l2 = a;
        }
        ac.a(graphics, (int)(byArray - 80 >> 1), by - 80, 80, 10, (int)l2, a, s.a[3], 0);
    }

    public static void a(short s2, m m2, af[] afArray) {
        z.a().a(1415, new ba(s2), new an(m2.a()), new t(0), new an(afArray[1].b()), new ba((short)afArray[2].b()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(boolean bl2, byte[] object) {
        DataInputStream dataInputStream;
        ByteArrayInputStream byteArrayInputStream;
        int n2 = 0;
        if (object == null) {
            if (!bl2) return;
            a = true;
            z.a().a(1311, (af)new t(6), new ba(0));
            return;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream((byte[])object);
            dataInputStream = new DataInputStream(byteArrayInputStream);
            if (bl2) {
                a = true;
                z z2 = z.a();
                object = new t;
                object(6);
                ba ba2 = new ba(dataInputStream.readShort());
                z2.a(1311, (af)object, ba2);
            } else {
                dataInputStream.readShort();
            }
            b.a();
            int n3 = dataInputStream.readShort();
            while (n2 < n3) {
                b.a(dataInputStream.readInt(), new int[]{dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readInt()});
                ++n2;
            }
        }
        catch (Exception exception) {
            return;
        }
        dataInputStream.close();
        byteArrayInputStream.close();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static void a(af[] afArray) {
        int n2;
        int n3;
        Object object;
        int n4 = afArray[3].b();
        int n5 = n4 % 10;
        int n6 = afArray[0].b();
        boolean bl2 = false;
        Object object2 = b;
        int n7 = n5 == 2 ? afArray[4].b() / 1000 : n6 / 1000;
        if ((object2 = (Object)((int[])((p)object2).a(n7))) != null) {
            object = object2[0];
            Object object3 = object2[1];
            Object object4 = object2[2];
        } else {
            boolean bl3 = false;
            boolean bl4 = false;
        }
        int n8 = afArray[1].b();
        int n9 = afArray[2].b();
        n7 = (short)(n4 / 100000);
        object2 = ay.a(n8, al.d(n4 / 10 % 100));
        ay.a(n9, al.d(n4 / 1000 % 100));
        Vector vector = (Vector)a.a(n7);
        a.a(n7);
        n4 = vector != null ? (int)((short)vector.size()) : 0;
        n7 = 0;
        if (n5 == 3 || n8 != ay.a.a()) {
            n7 = 0;
        } else {
            afArray = ((m)object2).a(5);
            for (n8 = 0; n8 < 2; ++n8) {
                n3 = n7;
                if (afArray != null) {
                    n2 = n5 == 2 ? afArray[1].b() : afArray[1].b() * 1000 + afArray[2].b();
                    n3 = n7;
                    if (n6 == n2) {
                        if (n8 == 0) {
                            k.b((m)object2);
                            n3 = n7;
                        } else {
                            n3 = n7 = (int)((byte)(n7 | 1));
                            if (afArray[16].b() > 0) {
                                n3 = n7;
                                if (afArray[1].b() != ay.a[1].b()) {
                                    a = System.currentTimeMillis();
                                    a = afArray[16].b();
                                    n3 = n7;
                                }
                            }
                        }
                    }
                }
                if (n8 == 0) {
                    afArray = ((m)object2).a();
                }
                n7 = n3;
            }
        }
        if (n4 > 0) {
            void var5_7;
            void var3_14;
            m m2;
            c = 0;
            a = null;
            d = false;
            if (object2 != null) {
                for (n8 = 0; n8 < n4; ++n8) {
                    afArray = (af[])vector.elementAt(n8);
                    n3 = afArray[0].b();
                    n6 = afArray[1].b();
                    n2 = n6 / 10 % 1000;
                    m2 = ay.a(n3, al.d(n6 / 10000 % 100));
                    if (m2 == null && n2 != 39) continue;
                    n3 = 0;
                    if (afArray.length > 2) {
                        n3 = afArray[2].b();
                    }
                    if (n5 != 3 && n5 != 1 && n5 != 2 && n2 != 39 || !k.a(n6 % 10, (int)object, n3, (m)object2, m2, n9, n2)) continue;
                    if (d) break;
                    d = true;
                    if (k.a(n2, n3)) break;
                    ((m)object2).a((int)(bc.a((int)object) / 1000L), (int)var3_14, (m)object2, null, 0);
                    break;
                }
                if (!d && a == null) {
                    d = true;
                    ((m)object2).a((int)(bc.a((int)object) / 1000L), (int)var3_14, (m)object2, null, 0);
                }
            }
            c = false;
            boolean bl5 = false;
            while (var5_7 < n4) {
                int n10;
                afArray = (af[])vector.elementAt((int)var5_7);
                n8 = afArray[0].b();
                m2 = ay.a(n8, al.d((n10 = afArray[1].b()) / 10000 % 100));
                if (m2 != null) {
                    void var2_11;
                    n8 = 0;
                    n6 = 0;
                    n5 = 0;
                    n2 = n6;
                    n3 = n5;
                    if (afArray.length > 2) {
                        n8 = n9 = afArray[2].b();
                        n2 = n6;
                        n3 = n5;
                        if (afArray.length > 3) {
                            n6 = afArray[3].b();
                            n8 = n9;
                            n2 = n6;
                            n3 = n5;
                            if (afArray.length > 4) {
                                n3 = afArray[4].b();
                                n2 = n6;
                                n8 = n9;
                            }
                        }
                    }
                    k.a((m)object2, m2, c, (int)var2_11, (int)var3_14, n10, n8, n2, n3);
                }
                ++var5_7;
            }
        }
        if ((n7 & 1) != 0 && ((m)object2).a() != null && !((bl)object2).a(((m)object2).a(), false)) {
            k.a((short)2, (m)object2, ((m)object2).a());
            k.a((m)object2);
        }
        k.a(ay.a);
    }

    private static void a(af[] afArray, int n2, int n3) {
        if (afArray != null && afArray[21].b() % 10 == n2) {
            afArray[21].a(afArray[21].b() % 10 + n3 * 10);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2) {
        if (n2 > 999999) return true;
        if (n2 >= -999999) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static boolean a(int var0, int var1_1) {
        var2_3 = var3_2 = true;
        switch (var0) {
            default: {
                ** GOTO lbl8
            }
            case 74: 
            case 75: {
                if (var1_1 / 100000000 > 0) {
                    return var3_2;
                }
lbl8:
                // 3 sources

                var2_3 = false;
            }
            case 41: 
            case 42: 
        }
        return var2_3;
    }

    /*
     * Unable to fully structure code
     */
    private static boolean a(int var0, int var1_1, int var2_2, m var3_3, m var4_4, int var5_5, int var6_6) {
        block13: {
            block14: {
                var7_7 = var1_1;
                if (!k.a(var6_6, var2_2)) {
                    var7_7 = (int)(bc.a(var1_1) % 1000L);
                }
                var10_8 = null;
                var8_9 = false;
                if (var6_6 != 39) break block13;
                var3_3.j(-1);
                var3_3.a(false);
                var3_3.b(true);
                var3_3.a(0, m.a(var3_3, var4_4));
                var0 = var2_2 / 1000;
                var1_1 = var2_2 % 1000;
                if (var3_3.q == var0 && var3_3.r == var1_1) break block14;
                var10_8 = var11_10 = k.a(var3_3, var0, var1_1, 20, 5, 39);
                if (var11_10 == null) break block14;
                var0 = var11_10[0].b();
                var10_8 = var11_10;
lbl20:
                // 2 sources

                while (true) {
                    var8_9 = true;
lbl22:
                    // 2 sources

                    while (true) {
                        block16: {
                            block15: {
                                if (!var8_9 && (var4_4 == null || var5_5 != var4_4.a())) ** GOTO lbl37
                                var5_5 = k.a(var7_7, var3_3, var4_4, var6_6, var2_2);
                                if (var5_5 / 10 == 0 && var6_6 != 39) {
                                    var9_11 = true;
lbl27:
                                    // 3 sources

                                    return var9_11;
                                }
                                var1_1 = var5_5 / 10 + 1000;
                                if (var3_3.e(var5_5 / 10) == 0) {
                                    var1_1 = 21;
                                }
                                if (var5_5 % 10 != 1) break block15;
                                var5_5 = var1_1;
lbl34:
                                // 2 sources

                                while ((var1_1 = var3_3.h(var5_5)) != -1) {
                                    var8_9 = true;
                                    var0 = var1_1;
lbl37:
                                    // 3 sources

                                    while (true) {
                                        var9_11 = var8_9;
                                        if (var0 <= 0) ** GOTO lbl27
                                        k.c = var0;
                                        var9_11 = var8_9;
                                        ** continue;
                                        break;
                                    }
lbl43:
                                    // 1 sources

                                    ** GOTO lbl27
                                }
                                break block16;
                            }
                            var5_5 = 21;
                            ** GOTO lbl34
                        }
                        if (var0 == 0) {
                            var3_3.a(var5_5, m.a(var3_3, var4_4));
                            if (k.a(var6_6, var2_2)) {
                                var7_7 = Math.abs(var2_2) / 100000000;
                                var1_1 = 2;
                                for (var2_2 = 1; var2_2 < var7_7; ++var2_2) {
                                    var6_6 = var1_1;
                                    if (var1_1 >= k.a.length) {
                                        var6_6 = 0;
                                    }
                                    var3_3.d.addElement(new an(k.a[var6_6]));
                                    var1_1 = var6_6 + 2;
                                }
                            }
                        } else {
                            var10_8[4].a(var5_5);
                            var3_3.a(6, var4_4, var10_8);
                        }
                        var0 += var3_3.a(var5_5);
                        var8_9 = true;
                        ** continue;
                        break;
                    }
                    break;
                }
            }
            var0 = 0;
            ** while (true)
        }
        var0 = 0;
        var10_8 = null;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(int n2, af[] afArray, boolean bl2) {
        int n3;
        int n4;
        boolean bl3;
        boolean bl4;
        block8: {
            block11: {
                int n5;
                block10: {
                    block9: {
                        bl4 = true;
                        bl3 = true;
                        n5 = afArray[19].b();
                        n4 = afArray[20].b();
                        if (n5 == 0 && n4 == 0) {
                            return bl3;
                        }
                        n3 = n2;
                        if (n2 == 0) {
                            n3 = 7474;
                        }
                        n2 = n3 / 1000;
                        bl3 = bl4;
                        if (n5 == 0) break block8;
                        if ((n5 & 1) == 0 || n2 != 7) break block9;
                        bl3 = bl4;
                        break block8;
                    }
                    if ((n5 & 2) == 0) break block10;
                    bl3 = bl4;
                    if (n2 == 6) break block8;
                }
                if ((n5 & 4) == 0 || n2 != 7) break block11;
                bl3 = bl4;
                if (n3 % 100 / 10 == 7) break block8;
            }
            bl3 = false;
        }
        bl4 = bl3;
        if (bl3) {
            bl4 = bl3;
            if (n4 != 0) {
                bl4 = bl3;
                if ((al.d(n3 / 100 % 10) & n4) == 0) {
                    bl4 = false;
                }
            }
        }
        bl3 = bl4;
        if (bl4) return bl3;
        bl3 = bl4;
        if (!bl2) return bl3;
        k.a(s.d[70]);
        return bl4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(m m2) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (m2 == null) return bl3;
        switch (m2.j) {
            default: {
                return bl2;
            }
            case 2: {
                bl3 = bl2;
                if (((ax)m2).s() != ay.a.a()) return bl3;
            }
            case 1: 
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static boolean a(m var0, m var1_1, int var2_2, boolean var3_3, int var4_4, int var5_5, int var6_6, int var7_7) {
        block19: {
            block18: {
                block36: {
                    block24: {
                        block21: {
                            block22: {
                                block35: {
                                    block34: {
                                        block33: {
                                            block23: {
                                                block32: {
                                                    block31: {
                                                        block30: {
                                                            block20: {
                                                                block17: {
                                                                    block29: {
                                                                        block28: {
                                                                            block27: {
                                                                                block26: {
                                                                                    block25: {
                                                                                        switch (var4_4) {
                                                                                            default: {
                                                                                                var3_3 = false;
lbl4:
                                                                                                // 6 sources

                                                                                                return var3_3;
                                                                                            }
                                                                                            case 36: {
                                                                                                var9_8 = var5_5;
lbl8:
                                                                                                // 3 sources

                                                                                                while ((var15_9 = k.a(var9_8)).equals("")) {
                                                                                                    if (var4_4 == 50) break block17;
                                                                                                    var3_3 = false;
                                                                                                    ** GOTO lbl4
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            case 43: {
                                                                                                var9_8 = var5_5 % 100;
                                                                                                ** GOTO lbl8
                                                                                            }
                                                                                            case 50: {
                                                                                                var9_8 = var7_7 % 100;
                                                                                                ** GOTO lbl8
                                                                                            }
                                                                                        }
                                                                                        if (!var15_9.equals("N\u00e9 tr\u00e1nh")) break block25;
                                                                                        var9_8 = 12;
lbl21:
                                                                                        // 6 sources

                                                                                        while (true) {
                                                                                            if (var9_8 != -1) {
                                                                                                var1_1.a(0, var9_8, var2_2, var3_3);
                                                                                            }
                                                                                            if (var4_4 != 50) break block18;
                                                                                            var14_10 = var1_1.e;
                                                                                            var4_4 = var6_6 % 10;
                                                                                            var2_2 = var6_6 / 100000;
                                                                                            var9_8 = var6_6 / 10 % 100;
                                                                                            if (var2_2 <= 0) break block19;
                                                                                            var11_11 = bc.a(var7_7);
                                                                                            var10_12 = (int)(var11_11 / 10000000L);
                                                                                            var7_7 = (int)(var11_11 % 10000000L);
                                                                                            var13_13 /* !! */  = null;
                                                                                            if (var10_12 > 0) {
                                                                                                var13_13 /* !! */  = bg.a(var10_12 * 10000, var7_7 / 10000 % 1000);
                                                                                            }
                                                                                            var8_14 = (byte)(var6_6 / 1000 % 100);
                                                                                            var0 = new Object[]{new an(var5_5), new bf(5931010, var7_7 / 100 % 100 % 8), new an(var4_4), new an(var9_8), new an(1), new an(var2_2), new j(var15_9), var13_13 /* !! */ , new t(var8_14)};
                                                                                            if (var9_8 != 7) break block20;
                                                                                            if (!var1_1.f(4)) {
                                                                                                var1_1.b(true);
                                                                                                var1_1.a(true);
                                                                                                var1_1.a(4, true);
                                                                                                if ((var1_1.j == 64 || var1_1.j == 1) && ((e)var1_1).a) {
                                                                                                    ((e)var1_1).a = false;
                                                                                                    bb.a(0, false, var1_1);
                                                                                                }
                                                                                                var1_1.a((int)var8_14, -1);
                                                                                                ap.a().f();
                                                                                            }
lbl51:
                                                                                            // 10 sources

                                                                                            while (true) {
                                                                                                var2_2 = var14_10.size() - 1;
lbl53:
                                                                                                // 2 sources

                                                                                                while (var2_2 >= 0) {
                                                                                                    var13_13 /* !! */  = (Object[])var14_10.elementAt(var2_2);
                                                                                                    if (((an)var13_13 /* !! */ [0]).b() != var5_5) break block21;
                                                                                                    if (var0 != null) break block22;
                                                                                                    var14_10.removeElement(var13_13 /* !! */ );
                                                                                                    if (var9_8 != 7) break block23;
                                                                                                    k.a(var1_1, var14_10);
lbl61:
                                                                                                    // 8 sources

                                                                                                    while (true) {
                                                                                                        var3_3 = true;
                                                                                                        ** GOTO lbl4
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                break block24;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (!var15_9.equals("\u0110\u1ee1 chi\u00eau")) break block26;
                                                                                    var9_8 = 13;
                                                                                    ** GOTO lbl21
                                                                                }
                                                                                if (!var15_9.equals("H\u1ee5t")) break block27;
                                                                                if (k.c || !var3_3 || var0 == null) break block17;
                                                                                var0.a(0, 14, var2_2, true);
                                                                                k.c = true;
                                                                                var9_8 = -1;
                                                                                ** GOTO lbl21
                                                                            }
                                                                            if (!var15_9.equals("\u0110\u1ec1 kh\u00e1ng")) break block28;
                                                                            var9_8 = 15;
                                                                            ** GOTO lbl21
                                                                        }
                                                                        if (!var15_9.equals("Mi\u1ec5n d\u1ecbch")) break block29;
                                                                        var9_8 = 16;
                                                                        ** GOTO lbl21
                                                                    }
                                                                    if (ap.b) {
                                                                        var1_1.a(var15_9, var2_2, var3_3);
                                                                    }
                                                                }
                                                                var9_8 = -1;
                                                                ** while (true)
                                                            }
                                                            if (var9_8 != 11) break block30;
                                                            k.d(var1_1);
                                                            ** GOTO lbl51
                                                        }
                                                        if (var9_8 != 14) break block31;
                                                        k.c(var1_1);
                                                        ** GOTO lbl51
                                                    }
                                                    if (var1_1.a() != ay.a.a()) ** GOTO lbl51
                                                    if (var9_8 != 8) break block32;
                                                    k.a((int)var8_14, 1);
                                                    ** GOTO lbl51
                                                }
                                                if (var9_8 != 10) ** GOTO lbl51
                                                k.e(var1_1, var8_14);
                                                ** GOTO lbl51
                                            }
                                            if (var9_8 != 11) break block33;
                                            k.c(var1_1, var14_10);
                                            ** GOTO lbl61
                                        }
                                        if (var9_8 != 14) break block34;
                                        k.b(var1_1, var14_10);
                                        ** GOTO lbl61
                                    }
                                    if (var1_1.a() != ay.a.a()) ** GOTO lbl61
                                    if (var9_8 != 8) break block35;
                                    k.a(var14_10, ((af)var13_13 /* !! */ [8]).b());
                                    ** GOTO lbl61
                                }
                                if (var9_8 != 10) ** GOTO lbl61
                                k.a(var14_10);
                                ** GOTO lbl61
                            }
                            var14_10.setElementAt(var0, var2_2);
                            ** while (true)
                        }
                        --var2_2;
                        ** GOTO lbl53
                    }
                    if (var0 == null) break block36;
                    for (var2_2 = var14_10.size() - 1; var2_2 >= 0; --var2_2) {
                        if (((an)((Object[])var14_10.elementAt(var2_2))[4]).b() > var4_4) continue;
                        var14_10.insertElementAt(var0, var2_2 + 1);
                        var3_3 = true;
                        ** GOTO lbl4
                    }
                    var14_10.addElement(var0);
                }
                var3_3 = true;
                ** GOTO lbl4
            }
            var3_3 = false;
            ** while (true)
        }
        var0 = null;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    public static boolean a(m var0, m var1_1, af[] var2_2) {
        block23: {
            var11_3 = true;
            if (var2_2 == null || k.b(var2_2) != 5) break block23;
            var10_4 = k.a(var2_2);
            var3_5 = var0.q;
            var8_7 = var4_6 = (short)var0.r;
            var7_8 = var3_5;
            if (var10_4 <= 0) ** GOTO lbl12
            block0 : switch (var2_2[8].b() % 10) {
                default: {
                    var7_8 = var3_5;
                    var8_7 = var4_6;
lbl12:
                    // 3 sources

                    while (true) {
                        var4_6 = var8_7;
                        var3_5 = var7_8;
lbl15:
                        // 7 sources

                        while (true) {
                            k.a(var0, null, var2_2);
                            if (!(var2_2[3] instanceof t)) break block0;
                            var5_9 = 1;
lbl19:
                            // 2 sources

                            while (true) {
                                k.a(var5_9, var0, null, var2_2[1].b(), var2_2[2].b(), (int)var3_5, (int)var4_6);
lbl21:
                                // 3 sources

                                return var11_3;
                            }
                            break;
                        }
                        break;
                    }
                }
                case 3: 
                case 4: {
                    switch (var0.e) {
                        default: {
                            ** GOTO lbl15
                        }
                        case 2: {
                            var4_6 = (short)(var4_6 - var10_4);
                            ** GOTO lbl15
                        }
                        case 0: {
                            var4_6 = (short)(var4_6 + var10_4);
                            ** GOTO lbl15
                        }
                        case 3: {
                            var3_5 = (short)(var3_5 - var10_4);
                            ** GOTO lbl15
                        }
                        case 1: 
                    }
                    var3_5 = (short)(var3_5 + var10_4);
                    ** GOTO lbl15
                }
                case 5: {
                    block10 : switch (var0.e) {
                        default: {
                            var5_9 = 0;
                            var6_10 = 0;
lbl44:
                            // 5 sources

                            while (true) {
                                var9_11 = 1;
lbl46:
                                // 2 sources

                                while (true) {
                                    var8_7 = var4_6;
                                    var7_8 = var3_5;
                                    if (var9_11 > var10_4) ** continue;
                                    if (!aa.a().a((int)var0.d, var9_11 * var6_10 + var3_5, var9_11 * var5_9 + var4_6)) ** GOTO lbl73
                                    if (var9_11 != 1) break block10;
                                    k.a(s.d[80]);
                                    ** GOTO lbl21
                                    break;
                                }
                                break;
                            }
                        }
                        case 2: {
                            var5_9 = -1;
                            var6_10 = 0;
                            ** GOTO lbl44
                        }
                        case 0: {
                            var5_9 = 1;
                            var6_10 = 0;
                            ** GOTO lbl44
                        }
                        case 3: {
                            var5_9 = 0;
                            var6_10 = -1;
                            ** GOTO lbl44
                        }
                        case 1: {
                            var5_9 = 0;
                            var6_10 = 1;
                            ** continue;
                        }
                    }
                    var3_5 = (short)(var3_5 + (var9_11 - 1) * var6_10);
                    var4_6 = (short)(var4_6 + var5_9 * (var9_11 - 1));
                    ** continue;
lbl73:
                    // 1 sources

                    var8_7 = var4_6;
                    var7_8 = var3_5;
                    if (var9_11 == var10_4) {
                        var7_8 = (short)(var3_5 + var9_11 * var6_10);
                        var8_7 = (short)(var4_6 + var9_11 * var5_9);
                    }
                    ++var9_11;
                    var4_6 = var8_7;
                    var3_5 = var7_8;
                    ** continue;
                }
            }
            var5_9 = 2;
            ** while (true)
        }
        var11_3 = false;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(m object, m object2, af[] afArray, boolean bl2) {
        switch (afArray[11].b() % 10) {
            default: {
                return true;
            }
            case 1: {
                object = ((m)object).e;
                break;
            }
            case 2: {
                if (object2 == null) {
                    return false;
                }
                object = ((m)object2).e;
            }
        }
        int n2 = afArray[11].b() / 100;
        for (int i2 = ((Vector)object).size() - 1; i2 >= 0; --i2) {
            object2 = (Object[])((Vector)object).elementAt(i2);
            if (!(n2 >= 10000 ? ((an)object2[0]).b() / 1000 == n2 : ((an)object2[3]).b() == n2)) continue;
            return true;
        }
        if (!bl2) return false;
        object2 = new StringBuffer();
        object = afArray[11].b() % 10 == 1 ? s.d[40] : s.d[41];
        k.a(((StringBuffer)object2).append((String)object).append(s.d[42]).toString());
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(m object, af[] object2, boolean bl2) {
        boolean bl3;
        int n2 = object2[5].b();
        if (n2 < 1) return true;
        if (n2 > 3) {
            return true;
        }
        int[] nArray = new int[]{((m)object).d(), ((m)object).e(), ((m)object).f(), ((m)object).g(), ((m)object).b(), ((m)object).j()};
        int n3 = object2[6].b();
        int n4 = n3 / 10;
        if (n3 % 10 != 2) {
            n4 = n4 * nArray[(n2 - 1) * 2 + 1] / 1000;
        }
        if ((n4 = k.a(n4, n2)) <= nArray[--n2 * 2]) {
            if (n2 != 0) return true;
            if (n4 != nArray[n2 * 2]) return true;
        }
        if (!bl3) return false;
        String string = s.b[71];
        object = s.b[70];
        String string2 = s.b[72];
        k.a(new StringBuffer().append((new String[]{string, object, string2})[n2]).append(s.d[72]).toString());
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(af[] object, int n2, int n3) {
        boolean bl2 = true;
        if (object == null) return false;
        if (((af)object[18]).b() != n2) return false;
        if (!ay.j.contains(object)) {
            if (n3 == 0) {
                return bl2;
            }
            ay.j.addElement(object);
        }
        ((d)object[22]).a = System.currentTimeMillis();
        object = object[13];
        n2 = n3;
        if (n3 == 0) {
            n2 = 1;
        }
        ((af)object).a(n2);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(af[] afArray, m m2, boolean bl2) {
        boolean bl3;
        boolean bl4 = false;
        int n2 = k.b(afArray);
        if (n2 != 5 && m2 != null && m2.a(false)) {
            bl3 = bl4;
            if (!bl2) return bl3;
            k.a(s.d[11]);
            return bl4;
        }
        switch (n2) {
            default: {
                return true;
            }
            case 2: {
                if (m2 != null && m2.j == 1) break;
            }
            case 3: {
                if (m2 == null || m2.c() <= 0) break;
                return true;
            }
            case 1: {
                if (m2 == null || m2.c() != 0) break;
                if (m2.j == 8) return true;
                if ((aa.a().b & 1) == 0) return true;
                switch (m2.j) {
                    case 64: {
                        if (bl.b.a(m2.a()) != null) {
                            return true;
                        }
                    }
                    default: {
                        break;
                    }
                    case 2: {
                        if (bl.b.a(((ax)m2).s()) == null) break;
                        return true;
                    }
                }
                bl3 = bl4;
                if (!bl2) return bl3;
                k.a(s.d[16]);
                return bl4;
            }
            case 4: {
                if (m2 != null) return true;
            }
        }
        bl3 = bl4;
        if (!bl2) return bl3;
        k.a(s.d[18]);
        return bl4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(af[] afArray, boolean bl2) {
        if (afArray[13].b() == 0) {
            return true;
        }
        if (!bl2) return false;
        if (afArray[13].b() == -a) {
            return false;
        }
        long l2 = ((long)afArray[13].b() - (System.currentTimeMillis() - ((d)afArray[22]).a)) / 1000L;
        if (l2 < 3L) {
            return false;
        }
        long l3 = l2;
        if (l2 <= 0L) {
            l3 = 1L;
        }
        k.a(new StringBuffer().append("C\u1ea7n h\u1ed3i ph\u1ee5c").append(l3).append("s").toString());
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static af[] a(m afArray, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        af[] afArray2;
        block23: {
            int n8;
            block21: {
                int n9;
                block22: {
                    int n10;
                    block19: {
                        block20: {
                            if (n2 == afArray.q && n3 == afArray.r) {
                                return null;
                            }
                            afArray2 = new af[6];
                            afArray2[0] = new an(0);
                            afArray2[1] = new an(0);
                            afArray2[2] = new an(0);
                            afArray2[3] = new an(0);
                            afArray2[4] = new an(0);
                            n6 = n6 == 39 ? -1 : (int)afArray.e;
                            afArray2[5] = new an(n6);
                            if (afArray.r >= n3) break block20;
                            if (afArray.q < n2) {
                                afArray2[1].a(10003);
                                break block19;
                            } else if (afArray.q == n2) {
                                afArray2[1].a(s.a[5]);
                                break block19;
                            } else {
                                afArray2[1].a(10001);
                            }
                            break block19;
                        }
                        if (afArray.r == n3) {
                            if (afArray.q < n2) {
                                afArray2[1].a(s.a[3]);
                            } else {
                                afArray2[1].a(s.a[2]);
                            }
                        } else if (afArray.q < n2) {
                            afArray2[1].a(10002);
                        } else if (afArray.q == n2) {
                            afArray2[1].a(s.a[4]);
                        } else {
                            afArray2[1].a(10000);
                        }
                    }
                    aa.a();
                    az az2 = aa.a().a(n2, n3);
                    az2.d += aa.c >> 1;
                    az2.e += aa.d >> 1;
                    n2 = Math.abs(az2.d - afArray.d);
                    n3 = Math.abs(az2.e - afArray.e);
                    if (n2 > n3) {
                        n7 = aa.c;
                        n8 = n2;
                        n6 = n3;
                    } else {
                        n7 = aa.d;
                        n8 = n3;
                        n6 = n2;
                    }
                    if (n4 * n5 <= n8 + (n10 = n7 >> 1)) break block21;
                    n9 = n8 / n4;
                    if (n9 == 0) break block22;
                    n7 = n4;
                    n5 = n9;
                    if (n8 % n4 <= n10) break block23;
                }
                n5 = n9 + 1;
                n7 = n4;
                break block23;
            }
            n7 = (n8 + n5) / n5;
        }
        n4 = (n6 + n5) / n5;
        afArray2[0].a(n5);
        if (n2 > n3) {
            afArray2[2].a(n7);
            afArray2[3].a(n4);
            return afArray2;
        } else {
            afArray2[2].a(n4);
            afArray2[3].a(n7);
        }
        return afArray2;
    }

    private static int b(int n2, int n3) {
        return (a[n3][0] + n2 - a[n3][1]) * (a[n3][2] + 1000) / 1000 * (1000 - a[n3][3]) / 1000;
    }

    public static int b(af[] afArray) {
        return afArray[8].b() / 10;
    }

    public static void b(m m2) {
        a = 0L;
        a = 0;
        a = null;
        if (m2 != null) {
            m2.j(5);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(m m2, int n2) {
        if (al.a(n2) && (m2.i == 5 || m2.a() != null && m2.a()[16].b() > 0)) {
            af[] afArray = m2.i == 5 ? m2.a : m2.a();
            k.a(m2);
            k.a((short)1, m2, afArray);
        }
    }

    private static void b(m m2, int n2, int n3, int n4) {
        af[] afArray;
        m2.j(-1);
        m2.a(false);
        m2.b(true);
        if ((m2.q != n2 || m2.r != n3) && (afArray = k.a(m2, n2, n3, 20, 5, n4)) != null) {
            afArray[4].a(0);
            m2.a(6, null, afArray);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void b(m m2, Vector vector) {
        if (m2.j != 1) {
            if (m2.j != 64) return;
        }
        if (!m2.f(64)) return;
        int n2 = vector.size() - 1;
        while (true) {
            if (n2 < 0) {
                m2.a(64, false);
                ((e)m2).d();
                return;
            }
            if (((af)((Object[])vector.elementAt(n2))[3]).b() == 14) {
                return;
            }
            --n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void b(af[] afArray) {
        if (afArray[13].b() != 0 || ay.j.size() <= 0) return;
        int n2 = ay.j.size() - 1;
        while (n2 >= 0) {
            af[] afArray2 = (af[])ay.j.elementAt(n2);
            if (afArray2[18].b() == afArray[18].b()) {
                ay.j.addElement(afArray);
                ((d)afArray[22]).a = System.currentTimeMillis();
                n2 = (int)(((d)afArray[22]).a - ((d)afArray2[22]).a);
                afArray[13].a(afArray2[13].b() - n2);
                if (afArray2[1] != null) return;
                ay.j.removeElement(afArray2);
                return;
            }
            --n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean b(int n2) {
        if (b != -1) {
            if (n2 >= b) return false;
        }
        b = n2;
        return true;
    }

    public static boolean b(af[] afArray, boolean bl2) {
        boolean bl3 = true;
        if (afArray[21].b() / 10 == 1) {
            if (bl2) {
                k.a(s.d[71]);
            }
            bl3 = false;
        }
        return bl3;
    }

    private static void c(m m2) {
        if (!(m2.j != 1 && m2.j != 64 || m2.f(64))) {
            m2.a(64, true);
            ((e)m2).c();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void c(m m2, int n2) {
        m2.a(0, n2 % 100000000, 0);
        if (n2 % 100000000 > 0) {
            return;
        }
        if (n2 / 100000000 != 10) return;
        m2.b(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void c(m m2, Vector vector) {
        if (!m2.f(128)) return;
        int n2 = vector.size() - 1;
        while (true) {
            if (n2 < 0) {
                m2.a(128, false);
                if (!aa.a().a(m2, 0, 0)) return;
                if (aa.a().b.contains(m2)) return;
                aa.a().a(m2, false);
                return;
            }
            if (((af)((Object[])vector.elementAt(n2))[3]).b() == 11) {
                return;
            }
            --n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void c(af[] afArray) {
        int n2 = 0;
        block10: while (n2 < afArray.length - 1) {
            CharSequence charSequence;
            int n3 = n2 + 1;
            switch (afArray[n2].b()) {
                default: {
                    n2 = n3 + 1;
                    continue block10;
                }
                case 1: {
                    charSequence = new StringBuffer().append(s.a[134]).append(" +").toString();
                    break;
                }
                case 2: {
                    charSequence = new StringBuffer().append(s.a[134]).append("-").toString();
                    break;
                }
                case 3: {
                    charSequence = new StringBuffer().append(s.d[24]).append("+").toString();
                    break;
                }
                case 4: {
                    charSequence = new StringBuffer().append(s.d[24]).append("-").toString();
                    break;
                }
                case 5: {
                    charSequence = new StringBuffer().append(s.d[25]).append("+").toString();
                    break;
                }
                case 6: {
                    charSequence = new StringBuffer().append(s.d[25]).append("-").toString();
                    break;
                }
                case 7: {
                    charSequence = new StringBuffer().append(s.d[26]).append("+").toString();
                    break;
                }
                case 8: {
                    charSequence = new StringBuffer().append(s.d[26]).append("-").toString();
                }
            }
            charSequence = new StringBuffer().append((String)charSequence);
            n2 = n3 + 1;
            bl.a(((StringBuffer)charSequence).append(afArray[n3].b()).toString(), true);
        }
        return;
    }

    public static void cinitclone() {
        a = new short[4][4];
        a = (short)1500;
        a = new p();
        a = false;
        b = new p();
        a = 0L;
        a = 0;
        a = null;
        b = -1;
        c = 0;
        d = false;
        b = false;
        c = false;
    }

    private static void d(m m2) {
        if (!m2.f(128)) {
            m2.a(128, true);
            m2.g(0);
            if (aa.a().b.contains(m2) && !m2.i()) {
                aa.a().a(m2, true);
                m.a.remove(new StringBuffer().append("").append(m2.a()).toString());
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void d(m m2, int n2) {
        int n3 = n2 / 100000;
        int n4 = n2 % 100000 / 10;
        switch (n2 % 10) {
            case 1: {
                m2.a((byte)n3, (byte)n4, (byte)-1);
                return;
            }
            case 2: {
                k.b(m2, n3, n4, 40);
                return;
            }
            case 3: {
                k.b(m2, n3, n4, 39);
                return;
            }
        }
    }

    private static void e(m m2, int n2) {
        if (k.b(n2)) {
            if (m2.i == 5 && m2.b != null && !aa.a(m2.b, m2, k.a(m2.a))) {
                k.a((short)1, m2, m2.a);
                k.b(m2);
            }
            if (m2.c() != null && !aa.a(m2.c(), m2, k.a(m2.a()))) {
                m2.g(0);
            }
            ap.a().f();
        }
    }
}

