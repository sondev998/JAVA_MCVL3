/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.ac;
import a.al;
import a.ar;
import a.av;
import a.g;
import a.s;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class q
extends g {
    public static final short[] a;
    private long a;
    private g[] a;
    private boolean[] a;
    public int[] b;
    private g[] b;
    public int[] c;
    private int[] d;
    private int[] e = new int[3];
    private int m = 0;

    static {
        Static.regClass(30);
        q.cinitclone();
    }

    public q(int n2, int n3, int n4, int n5) {
        super(n2, n3, n4, n5);
        this.e[0] = 0;
        this.e[2] = 0;
        this.g = n2;
        this.h = n3;
        this.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static g a(int n2, byte by, DataInputStream dataInputStream) {
        int n3;
        q q2 = new q(10, 10, 0, -1);
        a.g.a(q2, n2, by, dataInputStream);
        int n4 = dataInputStream.readByte();
        int[] nArray = new int[n4];
        int n5 = 0;
        for (n2 = 0; n2 < n4; ++n2) {
            nArray[n2] = al.b(dataInputStream.readByte());
            n3 = nArray[n2];
            n5 = n3 + n5;
        }
        n3 = dataInputStream.readByte();
        int[] nArray2 = new int[n3];
        n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            nArray2[n2] = al.b(dataInputStream.readByte());
            int n6 = nArray2[n2];
            n4 = n6 + n4;
        }
        n3 = dataInputStream.readByte();
        int[] nArray3 = null;
        if (n3 > 0) {
            nArray3 = new int[n3];
            n2 = 0;
        } else {
            n2 = 0;
        }
        while (true) {
            if (n2 >= n3) {
                q2.a(nArray, nArray2, new int[]{n5, n4});
                q2.a();
                return q2;
            }
            nArray3[n2] = dataInputStream.readByte();
            ++n2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static String a(av object, int n2, int n3, String object2) {
        Object object3;
        void var0_2;
        int n4;
        int n5;
        q q2 = (q)((av)object).a(n5);
        int n6 = n4;
        if (n4 < 0) {
            n6 = q2.e();
        }
        int n7 = q2.h();
        int n8 = n6 / n7;
        int n9 = q2.g();
        int n10 = n9 - n7;
        if (n10 <= 0) {
            q2.d();
            ((av)object).c(n5);
            return var0_2;
        }
        if (object3 != null && !((String)object3).equals("")) {
            String[] stringArray = al.a((String)object3, "_@");
        } else {
            Object var0_7 = null;
        }
        object3 = new g[n10];
        StringBuffer stringBuffer = al.a(null, "");
        n4 = 0;
        for (n5 = 0; n5 < n9; ++n5) {
            n6 = n4;
            if (n5 / n7 != n8) {
                void var0_4;
                object3[n4] = q2.a(n5);
                if (var0_4 != null) {
                    al.a(stringBuffer, (String)var0_4[n5]);
                    al.a(stringBuffer, "_@");
                }
                n6 = n4 + 1;
            }
            n4 = n6;
        }
        q2.a(n10);
        if (q2.e() >= n10) {
            q2.b(n10 - n7 + q2.e() % n7);
        }
        q2.a = object3;
        Object object4 = object3 = stringBuffer.toString();
        if (!((String)object3).endsWith("_@")) return var0_2;
        String string = ((String)object3).substring(0, ((String)object3).length() - 2);
        return var0_2;
    }

    private static void a(q q2) {
        int n2 = q2.h();
        int n3 = q2.c[0];
        int n4 = q2.f();
        System.arraycopy(q2.b, n3 * n2, q2.a, 0, n2 * n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(q q2, boolean bl2) {
        if ((q2.f & 0x2000) == 0) return;
        q2.b = q2.a;
        q2.c[2] = q2.f();
        if (q2.c[2] <= q2.c[1]) {
            q2.c[0] = 0;
            return;
        }
        q2.b(q2.c[1] * q2.h(), false);
        if (!bl2) {
            int n2 = q2.c[2] - q2.c[1];
            if (n2 < q2.c[0]) {
                q2.c[0] = n2;
            }
        } else {
            q2.c[0] = 0;
        }
        q.a(q2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(q q2, boolean bl2, int n2) {
        if (!bl2) return;
        if ((q2.f & 0x2000) == 0) return;
        if (n2 == s.a[8]) {
            n2 = q2.f();
            if (q2.c[0] + n2 >= q2.c[2]) return;
            int[] nArray = q2.c;
            nArray[0] = nArray[0] + n2;
            if ((n2 = q2.c[2] - n2) < q2.c[0]) {
                q2.c[0] = n2;
            }
            q.a(q2);
            return;
        }
        if (q2.c[0] <= 0) return;
        int[] nArray = q2.c;
        nArray[0] = nArray[0] - q2.f();
        if (q2.c[0] < 0) {
            q2.c[0] = 0;
        }
        q.a(q2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Graphics graphics, boolean bl2, boolean bl3, boolean bl4) {
        if (this.a != null) {
            int n2 = this.a.length;
            int n3 = this.b.length;
            int n4 = n2;
            if (n2 > this.e[1]) {
                n4 = this.e[1];
            }
            for (n2 = 0; n2 < n4; ++n2) {
                int n5;
                int n6 = n2 % n3;
                int n7 = n2 / n3;
                g g2 = this.a[n2];
                int n8 = this.a(n2, false);
                int n9 = this.b(n2, false);
                if (bl3 && !bl4 && n9 == this.a) {
                    graphics.setClip((int)this.a, n8, this.g, this.d[n7] - 1);
                    n5 = n7 % 2 == 0 ? 1722956 : 1922654;
                    graphics.setColor(n5);
                    graphics.fillRect((int)this.a, n8, this.g, this.d[n7] - 1);
                    graphics.setColor(2118475);
                    graphics.drawLine((int)this.a, n8, (int)(this.a + this.g), n8);
                    n5 = n7 % 2 == 0 ? 1922654 : 1854541;
                    graphics.setColor(n5);
                    graphics.drawLine((int)this.a, this.d[n7] + n8 - 2, (int)(this.a + this.g), this.d[n7] + n8 - 2);
                }
                if (g2 == null) continue;
                n5 = (n6 > a.length || (this.m & a[n6]) == 0) && g2.g < this.b[n6] ? (this.b[n6] - g2.g >> 1) + n9 : n9;
                if (g2.h < this.d[n7]) {
                    n8 = (this.d[n7] - g2.h >> 1) + n8;
                }
                g2.a = (short)n5;
                g2.b = (short)n8;
                if (n8 > ac.b) break;
                if (g2.h + n8 < 0) continue;
                if (bl2 && (g2.f & 1) != 0) {
                    n5 = this.e[0] == n2 || bl3 && this.e[0] / n3 == n2 / n3 ? 1 : 0;
                    g2.a = n5 != 0 ? (byte)(g2.a | 2) : (byte)(g2.a & 0xFFFFFFFD);
                }
                g2.a(graphics);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(Graphics graphics) {
        if (this.e[0] < 0) return;
        if (!this.b()) {
            return;
        }
        int n2 = this.e[0] % this.b.length;
        int n3 = this.e[0] / this.b.length;
        int n4 = this.a(this.e[0], false);
        int n5 = this.b(this.e[0], false);
        if (System.currentTimeMillis() - this.a < 250L) {
            graphics.setColor(255, 0, 0);
        } else if (System.currentTimeMillis() - this.a > 500L) {
            this.a = System.currentTimeMillis();
        } else if (System.currentTimeMillis() - this.a < 500L && System.currentTimeMillis() - this.a > 250L) {
            graphics.setColor(255, 255, 255);
        }
        if ((this.f & 0x800) != 0) {
            int n6 = this.a[this.e[0]].g + 2;
            int n7 = this.a[this.e[0]].h + 2;
            graphics.drawRect((this.b[n2] - n6 >> 1) + n5 - 1, (this.d[n3] - n7 >> 1) + n4 - 1, n6 + 2, n7 + 2);
            return;
        }
        graphics.drawRect(n5, n4, this.b[n2], this.d[n3]);
    }

    private void c(int n2) {
        this.a = null;
        this.a = new g[n2];
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void c(Graphics graphics) {
        void var2_3;
        reference var2_4;
        if (this.b == null) return;
        if (this.d == null) return;
        if ((this.f & 0x10) == 0) {
            int n2 = q.b((int)this.a);
        } else {
            boolean bl2 = false;
        }
        if (a.g.a((int)(var2_4 = this.b - var2_3), this.h)) {
            return;
        }
        boolean bl3 = (this.f & 0x4000) != 0;
        if ((this.f & 0x200) != 0) {
            al.c(graphics, (int)(this.a - 3), (int)(var2_4 - this.e[2] - 3), this.g + 6, this.h + this.e[2] + 6, s.a);
            al.d(graphics, (int)(this.a - 3), (int)(var2_4 - this.e[2] - 3), this.g + 6, this.h + this.e[2] + 6);
        } else if (bl3) {
            al.a(graphics, (int)this.a, (int)var2_4, this.g, this.h, false);
        }
        boolean bl4 = this.b();
        boolean bl5 = this.a(32);
        if (bl4 && this.a(64)) {
            al.a(graphics, this.b(this.e[0], false), this.a(this.e[0], false), this.b[this.e[0] % this.b.length], this.d[this.e[0] / this.b.length], s.d, 0xFFFFFF, 0xFFFFFF);
        }
        this.a(graphics, bl4, bl5, bl3);
        if (bl4 && bl5 && !bl3) {
            al.b(graphics, (int)this.a, this.a(this.e[0], false), this.g, this.d[this.e[0] / this.b.length % this.d.length] - 2, s.c);
        }
        graphics.setClip(0, 0, (int)ac.a, (int)ac.b);
        if (bl5) return;
        if (!this.a(64)) return;
        if (this.a(4096)) return;
        this.b(graphics);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(int n2) {
        boolean bl2;
        boolean bl3 = true;
        if (n2 == s.a[2] && (this.f & 0x20) == 0) {
            this.e();
            return bl3;
        }
        if (n2 == s.a[3] && (this.f & 0x20) == 0) {
            this.f();
            return bl3;
        }
        if (n2 == s.a[4]) {
            if (this.e[0] - this.b.length >= 0) {
                int[] nArray = this.e;
                nArray[0] = nArray[0] - this.b.length;
                return bl3;
            }
            bl2 = bl3;
            if ((this.f & 0x2000) == 0) return bl2;
            bl2 = bl3;
            if (this.c[0] <= 0) return bl2;
            int[] nArray = this.c;
            nArray[0] = nArray[0] - 1;
            q.a(this);
            return bl3;
        }
        if (n2 != s.a[5]) return false;
        if (this.e[0] + this.b.length < this.e[1]) {
            int[] nArray = this.e;
            nArray[0] = nArray[0] + this.b.length;
            return bl3;
        }
        bl2 = bl3;
        if ((this.f & 0x2000) == 0) return bl2;
        bl2 = bl3;
        if (this.c[0] + this.d.length >= this.c[2]) return bl2;
        int[] nArray = this.c;
        nArray[0] = nArray[0] + 1;
        q.a(this);
        return bl3;
    }

    public static void cinitclone() {
        a = new short[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e() {
        if (this.a == null) {
            if (this.e[0] > 0) {
                int[] nArray = this.e;
                nArray[0] = nArray[0] - 1;
                return;
            }
            this.e[0] = this.e[1] - 1;
            return;
        }
        int n2 = 1;
        while (true) {
            int n3 = this.e[0] - n2;
            boolean bl2 = this.a[n3 % this.b.length];
            if (n3 > 0 && !bl2) {
                ++n2;
                continue;
            }
            if (n3 >= 0 && bl2) {
                int[] nArray = this.e;
                nArray[0] = nArray[0] - n2;
                return;
            }
            this.e[0] = this.e[1];
            n2 = 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void f() {
        if (this.a == null) {
            if (this.e[0] < this.e[1] - 1) {
                int[] nArray = this.e;
                nArray[0] = nArray[0] + 1;
                return;
            }
            this.e[0] = 0;
            return;
        }
        int n2 = 1;
        while (true) {
            int n3;
            boolean bl2;
            if (!(bl2 = this.a[(n3 = this.e[0] + n2) % this.b.length]) && n3 < this.e[1]) {
                ++n2;
                continue;
            }
            if (bl2 && n3 == this.e[1] - 1) {
                this.e[0] = this.e[1] - 1;
                return;
            }
            if (bl2 && n3 < this.e[1] - 1) {
                int[] nArray = this.e;
                nArray[0] = n2 + nArray[0];
                return;
            }
            this.e[0] = 0;
            n2 = 0;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public int a(int object, boolean bl2) {
        void var3_5;
        int n2 = 0;
        if ((this.f & 0x10) != 0) {
            boolean bl3 = false;
        } else {
            int n3 = q.b((int)this.a);
        }
        reference var3_6 = this.b - var3_5;
        int n4 = object / this.b.length;
        object = var3_6;
        if (n4 < this.b.length * this.d.length) {
            while (true) {
                void var3_7;
                object = var3_7;
                if (n2 >= n4) break;
                var3_7 += this.d[n2];
                ++n2;
            }
        }
        Object object2 = object;
        if (!bl2) int n5;
        return n5;
        return object + this.d[n4] / 2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public g a(int n2) {
        if (this.a == null) return null;
        if (n2 < this.a.length) return this.a[n2];
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String a() {
        int n2 = this.a(32) ? this.i() * this.h() : this.e[0];
        g g2 = this.a(n2);
        if (g2 != null) return g2.a();
        return "";
    }

    @Override
    public void a() {
        super.a();
        if ((this.f & 0x2000) != 0) {
            this.b = this.a;
            this.c = new int[]{0, this.f(), this.f()};
        }
    }

    public void a(int n2) {
        int n3 = 0;
        int n4 = this.d.length;
        int n5 = this.b.length;
        int n6 = this.d[0];
        n4 = n2;
        if (n2 % n5 > 0) {
            n4 = n2 + n5;
        }
        int[] nArray = new int[n4 / n5];
        n4 = nArray.length;
        this.h = n4 * n6;
        for (n2 = n3; n2 < n4; ++n2) {
            nArray[n2] = n6;
        }
        this.d = nArray;
        this.e[1] = n5 * n4;
        this.c(this.e[1]);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(int n2, int n3, int n4, int n5) {
        if (this.c(n2)) {
            if (this.a == null) return;
            this.a.a(5, this);
            return;
        }
        if (n3 != s.a[6]) return;
        if (this.a == null) return;
        this.a.a(4, this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(int n2, boolean bl2) {
        super.a(n2, bl2);
        if ((n2 & 0x2000) == 0 || bl2) {
            return;
        }
        this.b = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(g g2, int n2) {
        if (n2 < 0) return;
        if (n2 >= this.a.length) {
            return;
        }
        this.a[n2] = g2;
        if (g2 == null) return;
        g2.g = this.b[n2 % this.b.length];
        g2.h = this.d[n2 % this.d.length];
    }

    public void a(String string, int n2, int n3) {
        this.a(new ar(string, n2, 0), n3);
    }

    @Override
    public void a(Graphics graphics) {
        this.c(graphics);
    }

    public void a(int[] nArray, int[] nArray2, int[] nArray3) {
        int n2 = 0;
        if (nArray != null) {
            this.b = nArray;
        }
        if (nArray2 != null) {
            this.d = nArray2;
        }
        if (nArray3 == null) {
            int n3;
            this.g = 0;
            for (n3 = 0; n3 < this.b.length; ++n3) {
                this.g += this.b[n3];
            }
            this.h = 0;
            for (n3 = n2; n3 < this.d.length; ++n3) {
                this.h += this.d[n3];
            }
        } else {
            this.g = nArray3[0];
            this.h = nArray3[1];
        }
        this.e[1] = this.b.length * this.d.length;
        this.c(this.e[1]);
    }

    public int b(int object, boolean bl2) {
        Object object2 = this.a;
        int n2 = object % this.b.length;
        object = object2;
        if (n2 < this.b.length * this.d.length) {
            int n3 = 0;
            while (true) {
                object = object2;
                if (n3 >= n2) break;
                object2 = object2 + this.b[n3];
                ++n3;
            }
        }
        object2 = object;
        if (bl2) {
            object2 = object + this.b[n2] / 2;
        }
        return (int)object2;
    }

    public void b(int n2) {
        this.e[0] = n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(int n2, boolean bl2) {
        if (!bl2) {
            int n3 = this.b.length;
            if (this.e[0] >= n2) {
                this.b(this.e[0] % n3 + n2 - n3);
            }
        } else {
            this.e[0] = 0;
        }
        this.a(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2) {
        int n3;
        boolean bl2;
        boolean bl3 = false;
        if ((this.f & 0x20) != 0) {
            bl2 = bl3;
            if (n2 == s.a[3]) return bl2;
            if (n2 == s.a[2]) {
                return bl3;
            }
        }
        if ((n3 = this.e[0] / this.b.length) >= this.d.length - 1 && n2 == s.a[5]) {
            bl2 = bl3;
            if ((this.f & 0x2000) == 0) return bl2;
            bl2 = bl3;
            if (this.c[0] + this.d.length >= this.c[2]) return bl2;
            return true;
        }
        if (n3 <= 0 && n2 == s.a[4]) {
            bl2 = bl3;
            if ((this.f & 0x2000) == 0) return bl2;
            bl2 = bl3;
            if (this.c[0] <= 0) return bl2;
            return true;
        }
        if (this.e[0] % this.b.length <= 0) {
            bl2 = bl3;
            if (n2 == s.a[2]) return bl2;
        }
        if (this.e[0] % this.b.length < this.b.length - 1) return true;
        bl2 = bl3;
        if (n2 == s.a[3]) return bl2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2, int n3) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (!ac.a(n2, n3)) return bl3;
        int n4 = 0;
        while (true) {
            bl3 = bl2;
            if (n4 >= this.e[1]) return bl3;
            int n5 = this.b.length;
            int n6 = n4 / this.b.length;
            int n7 = this.a(n4, false);
            int n8 = this.b(n4, false);
            if (al.a(n2, n3, n8, n8 + this.b[n4 % n5], n7, n7 + this.d[n6])) {
                this.e[0] = n4;
                this.a.a(5, this);
                return true;
            }
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int c() {
        int n2 = (this.f & 0x10) == 0 ? q.b((int)this.a) : 0;
        int[] nArray = this.b;
        int n3 = this.i();
        return this.e(0) * n3 + nArray - n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(int n2, int n3) {
        int n4 = 1;
        n2 = n2 / this.d[0] < 1 ? n4 : (n2 /= this.d[0]);
        if (n2 > n3) {
            n2 = n3;
        }
        this.a(this.h() * n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void c(int n2, boolean bl2) {
        if (bl2) {
            this.m |= n2;
            return;
        }
        this.m &= ~n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int d(int n2) {
        if (n2 < 0) return 0;
        if (n2 >= this.b.length) return 0;
        return this.b[n2];
    }

    public void d() {
        int n2 = this.a.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a[i2] = null;
        }
    }

    public int e() {
        return this.e[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int e(int n2) {
        if (n2 < 0) return 0;
        if (n2 >= this.d.length) return 0;
        return this.d[n2];
    }

    public int f() {
        return this.d.length;
    }

    public int g() {
        return this.e[1];
    }

    public int h() {
        return this.b.length;
    }

    public int i() {
        return this.e[0] / this.b.length;
    }
}

