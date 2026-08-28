/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package a;

import a.Static;
import a.aa;
import a.al;
import a.aq;
import a.b;
import a.bf;
import a.i;
import a.p;
import a.s;
import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bg {
    public static Hashtable a;
    public static byte[] a;
    public static Hashtable b;
    public static byte[] b;
    public static Hashtable c;
    public static byte[] c;
    public static Hashtable d;
    public byte a;
    public int a;
    private long a;
    public p a;
    private short a;
    public int[] a = 0L;
    public int b;
    private int[] b = -1;
    public int c = 0;
    public int d;
    private byte[] d = -1;
    private int e;

    static {
        Static.regClass(19);
        bg.cinitclone();
    }

    private bg(int n2) {
        this.a = n2;
    }

    public static bg a(int n2, int n3) {
        bg bg2 = bg.b(n2, 0);
        bg2.a(n3, 0);
        return bg2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static bg a(int var0, String var1_1, int var2_4) {
        block20: {
            var10_5 = new StringBuffer().append("").append(var0).toString();
            try {
                block22: {
                    block25: {
                        block23: {
                            block21: {
                                var6_6 = new bg(var0);
                                if (bg.c == null) {
                                    var1_1 = new Hashtable(2);
                                    bg.c = var1_1;
                                    var1_1 = new Hashtable(2);
                                    bg.d = var1_1;
                                    var1_1 = new Hashtable(2);
                                    bg.b = var1_1;
                                }
                                if (!bg.c.containsKey(var10_5)) break block21;
                                var6_6.d = (byte[])bg.c.get(var10_5);
                                var6_6.a = (p)bg.d.get(var10_5);
                                var6_6.b = (int[])bg.b.get(var10_5);
                                var3_7 = var6_6.a();
                                var6_6.a = new int[var3_7];
                                break block22;
                            }
                            if (var2_4 == 2) {
                                var5_10 = bg.a;
                                var1_1 = new StringBuffer();
                                bg.a = (byte[])var5_10.get(var1_1.append("png").append(var10_5).toString());
                                var1_1 = bg.a;
                                var5_10 = new StringBuffer();
                                bg.b = (byte[])var1_1.get(var5_10.append("dat").append(var10_5).toString());
                                var1_1 = bg.a;
                                var5_10 = new StringBuffer();
                                bg.c = (byte[])var1_1.get(var5_10.append("img").append(var10_5).toString());
                                var5_10 = new aq(bg.b);
                                var1_1 = new byte[var5_10.a().length - 2];
                                System.arraycopy(var5_10.a(), 2, var1_1, 0, var5_10.a().length - 2);
                            } else {
                                var1_1 = null;
                            }
                            if (var2_4 == 2 && bg.b != null) break block23;
                            var5_10 = new Object();
                            var7_12 = var5_10.getClass();
                            var5_10 = new StringBuffer();
                            var9_13 = var7_12.getResourceAsStream(var5_10.append("/d").append(var10_5).append(".dat").toString());
                            if (var9_13 != null) ** GOTO lbl77
                            var5_10 = new StringBuffer();
                            var7_12 = a.b.a(var5_10.append(var10_5).append(".zip").toString(), 1);
                            var5_10 = var1_1;
                            var8_14 = var7_12;
                            if (var7_12 == null) ** GOTO lbl67
                            var5_10 = var1_1;
                            try {
                                var5_10 = var1_1;
                                var8_14 = new aq((byte[])var7_12);
                                var5_10 = var1_1;
                                var5_10 = var1_1 = (Object)new byte[var8_14.a().length];
                                System.arraycopy(var8_14.a(), 0, var1_1, 0, var8_14.a().length);
                                var8_14 = var7_12;
                                var5_10 = var1_1;
                            }
                            catch (Exception var1_3) {
                                var8_14 = var7_12;
                            }
                        }
                        var7_12 = null;
                        var5_10 = var1_1;
                        var1_1 = var7_12;
                        ** GOTO lbl82
                        catch (Exception var5_11) {
                            var8_14 = null;
                            var5_10 = var1_1;
                        }
                        if (var8_14 != null) ** GOTO lbl75
                        if (var9_13 != null) ** GOTO lbl77
                        var1_1 = new Object();
                        var1_1 = var1_1.getClass().getResourceAsStream("/d1000000.dat");
                        break block25;
lbl75:
                        // 2 sources

                        var1_1 = i.a((byte[])var5_10);
lbl77:
                        // 2 sources

                        var1_1 = var9_13;
                    }
                    var5_10 = new byte[var1_1.read() | var1_1.read() << 8];
                    var1_1.read((byte[])var5_10);
lbl82:
                    // 2 sources

                    var6_6.d = (byte[])var5_10;
                    bg.c.put(var10_5, var5_10);
                    var4_15 = var6_6.a();
                    var6_6.a = new int[var4_15];
                    break block20;
                }
                for (var0 = 0; var0 < var3_7; ++var0) {
                    if (var2_4 == 2) {
                        var1_1 = bg.a;
                        var5_9 = new StringBuffer();
                        bg.a = (byte[])var1_1.get(var5_9.append("png").append(var10_5).toString());
                        var1_1 = bg.a;
                        var5_9 = new StringBuffer();
                        bg.c = (byte[])var1_1.get(var5_9.append("img").append(var10_5).toString());
                        var1_1 = bf.a(al.a(var6_6.d, var0 * 4 + 8), true, false, 0, 0, 0);
                        if (var1_1 == null) continue;
                        var6_6.a[var0] = al.a(var6_6.d, var0 * 4 + 8);
                        bf.a.a(var6_6.a[var0], var1_1);
                        continue;
                    }
                    var6_6.a[var0] = al.a(var6_6.d, var0 * 4 + 8);
                }
                if (var2_4 != 2) return var6_6;
                bg.a();
                return var6_6;
            }
            catch (Exception var1_2) {
                bg.a();
                return null;
            }
        }
        for (var3_8 = 0; var3_8 < var4_15; ++var3_8) {
            if (var2_4 == 2) {
                var5_10 = bf.a(al.a(var6_6.d, var3_8 * 4 + 8), true, false, 0, 0, 0);
                if (var5_10 == null) continue;
                var6_6.a[var3_8] = al.a(var6_6.d, var3_8 * 4 + 8);
                bf.a.a(var6_6.a[var3_8], var5_10);
                continue;
            }
            var6_6.a[var3_8] = al.a(var6_6.d, var3_8 * 4 + 8);
        }
        if (var0 / 10000 < 200 || var0 / 1000000 == 9 || var0 / 1000000 == 8 || var0 / 100000 == 7) {
            var6_6.a = var5_10 = var6_6.a();
            bg.d.put(var10_5, var5_10);
        }
        var6_6.b = var6_6.a();
        bg.b.put(var10_5, var6_6.b);
        if (var2_4 != 2) {
            var1_1.close();
            return var6_6;
        } else {
            bg.a();
        }
        return var6_6;
    }

    private p a() {
        p p2 = new p();
        int n2 = this.d();
        for (int i2 = 0; i2 < n2; ++i2) {
            p2.a(al.a(this.d, this.c(i2) + 1), Integer.toString(i2));
        }
        return p2;
    }

    public static void a() {
        aa.c = 0;
        a = null;
        b = null;
        c = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(bg bg2, int n2) {
        if (n2 <= 0) return;
        if (n2 >= 9) {
            return;
        }
        int[] nArray = new int[]{10004, 10005, 30001, 20007, 10006, 40001, 50007, 60007};
        switch (n2) {
            default: {
                break;
            }
            case 2: 
            case 6: {
                bg.a(bg2, 13, nArray[5] + 19900000);
                bg.a(bg2, 17, n2 % 7 + 40000000);
                return;
            }
            case 4: 
            case 8: {
                bg.a(bg2, 13, nArray[n2 - 1] + 19900000);
                bg.a(bg2, 17, n2 % 7 + 40000000);
                bg.a(bg2, 14, nArray[n2 - 1] + 19900000);
                bg.a(bg2, 18, n2 % 7 + 40000000);
                return;
            }
            case 7: {
                bg.a(bg2, 12, nArray[n2 - 1] + 19900000);
                bg.a(bg2, 16, n2 % 7 + 40000000);
            }
        }
        bg.a(bg2, 11, nArray[n2 - 1] + 19900000);
        bg.a(bg2, 15, n2 % 7 + 40000000);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(bg bg2, int n2, int n3) {
        try {
            if (bg2.a == null) return;
            if (bg2.a.length <= n2) return;
            if (n2 < 0) return;
            bg2.a[n2] = n3;
            if (n3 != 0) return;
            if (n2 < 11) return;
            if (n2 > 14) return;
            if (n2 + 4 >= bg2.a.length) return;
            bg2.a[n2 + 4] = n3;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void a(bg bg2, int n2, boolean bl2) {
        int n3 = bg2.a();
        if (bl2) {
            for (int i2 = 0; i2 < n3; ++i2) {
                bg2.a[i2] = 0;
            }
        }
        bg2.a[n3 - 1] = n2;
    }

    public static void a(bg bg2, bg bg3, int n2) {
        if (bg2 != null && bg3 != null) {
            System.arraycopy(bg2.a, 0, bg3.a, 0, n2);
        }
    }

    public static void a(Graphics graphics, Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        graphics.drawRegion(image, n2, n3, n4, n5, n6, n7, n8, n9);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n7 + n9 < n3) return false;
        if (n7 > n3 + n5) return false;
        if (n6 + n8 < n2) return false;
        if (n6 <= n2 + n4) return true;
        return false;
    }

    private int[] a() {
        int n2 = this.d();
        int[] nArray = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            nArray[i2] = this.c(i2);
        }
        return nArray;
    }

    public static bg b(int n2, int n3) {
        return bg.a(n2, s.c[3], n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(bg bg2, int n2, int n3) {
        if (bg2.a != null) {
            for (int i2 = bg2.a.length - 2; i2 >= 0; --i2) {
                int n4;
                if (i2 == 9 || i2 == 10) continue;
                if (i2 == 1 || i2 == 8 || i2 >= 11 || i2 == 20) {
                    bg2.a[i2] = 0;
                    continue;
                }
                int n5 = n4 = bg2.a[i2] / 10000000;
                if (n4 < 2) {
                    n5 = n4 * n2;
                }
                bg2.a[i2] = n5 * 10000000 + bg2.a[i2] / 100000 % 100 * 100000 + n3 * 1000;
            }
        }
    }

    public static void cinitclone() {
        a = new Hashtable(5);
    }

    private int f(int n2) {
        int n3 = n2;
        if (n2 >= this.c()) {
            n3 = this.c() - 1;
        }
        n2 = this.a() * 4 + 8 + this.b() * 5;
        while (n3 > 0) {
            n2 += al.b(this.d[n2]) * 4 + 1;
            --n3;
        }
        return n2;
    }

    public int a() {
        return this.a(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(int n2) {
        if (this.d[n2] >= 0) return this.d[n2];
        return this.d[n2] + 256;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(int n2, int n3, int n4, int n5) {
        if (n5 == 5) return -n2 - n4;
        if (n5 == 6) return -n2 - n4;
        if (n5 == 7) return -n2 - n4;
        if (n5 != 4) return -n2 - n3;
        return -n2 - n4;
    }

    public String a(int n2) {
        return (String)this.a.a(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2) {
        if (!this.b()) {
            return;
        }
        if (System.currentTimeMillis() - this.a < 50L) return;
        this.a = System.currentTimeMillis();
        n2 = al.b(this.d[this.e]);
        this.a = (short)(this.a + 1);
        if (this.a < n2) return;
        this.a = 0;
        ++this.c;
        if (this.c / 1000 == 999) return;
        if (this.c % 1000 < this.c / 1000) return;
        this.a = (byte)(this.a & 0xFFFFFFFE);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, int n3) {
        int n4;
        block5: {
            block4: {
                if (this.b == null) {
                    return;
                }
                if (n2 < 0) break block4;
                n4 = n2;
                if (n2 < this.b.length) break block5;
            }
            if (this.b != -1) return;
            n4 = 0;
        }
        this.b = n4;
        this.e = this.b[n4];
        this.d(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(int n2, int n3, Graphics graphics) {
        int n4 = graphics.getClipX();
        int n5 = graphics.getClipY();
        int n6 = graphics.getClipWidth();
        int n7 = graphics.getClipHeight();
        int n8 = this.f(al.a(this.d, this.e + this.a * 3 + 1 + 4));
        int n9 = n8 + 1;
        n8 = this.d[n8];
        while (n8 > 0) {
            Image image;
            byte[] byArray = this.d;
            int n10 = n9 + 1;
            n9 = al.b(byArray[n9]);
            byte[] byArray2 = this.d;
            int n11 = n10 + 1;
            int n12 = n9 | al.b(byArray2[n10]) << 8;
            n9 = n12 >> 12;
            byte[] byArray3 = this.d;
            n10 = n11 + 1;
            n11 = byArray3[n11];
            int n13 = this.d[n10];
            n12 = this.b(n12 & 0xFFF);
            byte[] byArray4 = this.d;
            int n14 = n12 + 1;
            if (this.a[n12 = al.b(byArray4[n12])] != 0 && (image = bf.b(this.a[n12])) != null) {
                byte[] byArray5 = this.d;
                int n15 = n14 + 1;
                n14 = al.b(byArray5[n14]);
                byArray5 = this.d;
                int n16 = n15 + 1;
                int n17 = al.b(byArray5[n15]);
                n15 = al.b(this.d[n16]);
                n16 = al.b(this.d[n16 + 1]);
                n13 += n3;
                if ((this.a & 2) != 0) {
                    n11 = this.a(n11, n15, n16, n9) + n2;
                    n9 = this.e(n9);
                } else {
                    n11 += n2;
                }
                if (bg.a(n11, n13, n15, n16, n4, n5, n6, n7)) {
                    try {
                        bg.a(graphics, image, n14, n17, n15, n16, n9, n11, n13, 20);
                    }
                    catch (Exception exception) {
                        this.a[n12] = 0;
                    }
                }
            }
            n9 = n10 + 1;
            --n8;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int n2, boolean bl2) {
        if (bl2) {
            this.a = (byte)(this.a | n2);
            return;
        }
        this.a = (byte)(this.a & ~n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        if ((this.a & 1) == 0) return false;
        return true;
    }

    public int b() {
        return this.a(1) | this.a(2) << 8;
    }

    public int b(int n2) {
        return this.a() * 4 + 8 + n2 * 5;
    }

    public void b(int n2) {
        this.c = n2;
        this.a = 0;
        this.a = (byte)(this.a | 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        if ((this.a & 8) != 0) return false;
        return true;
    }

    public int c() {
        return this.a(3) | this.a(4) << 8;
    }

    public int c(int n2) {
        int n3 = n2;
        if (n2 >= this.d()) {
            n3 = this.d() - 1;
        }
        n2 = this.a() * 4 + 8 + this.b() * 5 + (this.a(6) | this.a(7) << 8);
        while (n3 > 0) {
            n2 += al.b(this.d[n2]) * 3 + 1 + 4;
            --n3;
        }
        return n2;
    }

    public void c(int n2) {
        this.a(n2, this.a);
    }

    public int d() {
        return this.a(5);
    }

    public int d(int n2) {
        return al.b(this.d[this.b[n2]]);
    }

    public void d(int n2) {
        this.a = (byte)n2;
        if (this.a >= al.b(this.d[this.e])) {
            this.a = 0;
        }
    }

    public int e() {
        return this.d[this.e];
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public int e(int n2) {
        int n3;
        int n4 = n3 = 0;
        int n5 = Integer.MIN_VALUE;
        block10: do {
            switch (n5 == Integer.MIN_VALUE ? n2 : n5) {
                default: {
                    n4 = n3;
                    n5 = 2;
                    continue block10;
                }
                case 0: {
                    n4 = 2;
                    n5 = 2;
                    continue block10;
                }
                case 5: {
                    n4 = 4;
                    n5 = 2;
                    continue block10;
                }
                case 4: {
                    n4 = 5;
                    n5 = 2;
                    continue block10;
                }
                case 3: {
                    n4 = 1;
                    n5 = 2;
                    continue block10;
                }
                case 1: {
                    n4 = 3;
                    n5 = 2;
                    continue block10;
                }
                case 6: {
                    n4 = 7;
                }
                case 2: {
                    return n4;
                }
                case 7: 
            }
            return 6;
        } while (true);
        return 6;
    }

    public int f() {
        return this.a;
    }

    public int g() {
        byte by = 0;
        int n2 = this.f(al.a(this.d, this.b[0] + 0 + 1 + 4));
        int n3 = n2 + 1;
        for (n2 = this.d[n2]; n2 > 0; --n2) {
            byte by2 = by;
            if (by < -this.d[n3 + 3]) {
                by2 = -this.d[n3 + 3];
            }
            n3 += 4;
            by = by2;
        }
        return by;
    }
}

