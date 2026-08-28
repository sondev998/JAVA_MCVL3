/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.ac;
import a.bi;
import a.s;
import java.io.DataInputStream;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class g {
    public static String a;
    public static Font a;
    public static int[] a;
    public static int k;
    public static int l;
    public byte a;
    public int a;
    public bi a;
    public short a;
    public byte b;
    public int b;
    public short b = -1;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        Static.regClass(26);
        a.g.cinitclone();
    }

    public g(int n2, int n3, int n4, int n5) {
        this.g = (short)n2;
        this.h = (short)n3;
        this.f = n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(g g2, int n2, byte by, DataInputStream dataInputStream) {
        int n3 = n2 / 100000000;
        switch (n3) {
            case 0: {
                g2.a(0x2000000, true);
                break;
            }
            case 2: {
                g2.a(0x8000000, true);
                break;
            }
            case 4: {
                g2.a(0x200000, true);
                break;
            }
            case 7: {
                g2.a(6144, true);
                break;
            }
        }
        int n4 = (n2 %= 100000000) / 1000 * 1000;
        short s2 = dataInputStream.readByte();
        if (s2 != -1) {
            g2.b = s2 + n4;
        }
        if ((s2 = dataInputStream.readByte()) != -1) {
            g2.c = s2 + n4;
        }
        if ((s2 = dataInputStream.readByte()) != -1) {
            g2.d = s2 + n4;
        }
        if ((s2 = dataInputStream.readByte()) != -1) {
            g2.e = n4 + s2;
        }
        short s3 = dataInputStream.readShort();
        short s4 = dataInputStream.readShort();
        s2 = dataInputStream.readShort();
        n4 = dataInputStream.readShort();
        int n5 = dataInputStream.readInt();
        g2.j = dataInputStream.readInt();
        short s5 = dataInputStream.readShort();
        if (s5 > 0) {
            g2.a((int)s5, true);
        }
        s5 = dataInputStream.readByte();
        g2.a = n2;
        g2.a(by);
        g2.a(s3, s4, n5);
        g2.d();
        g2.a((int)s2, n4);
        if ((s5 & 8) != 0) {
            g2.a(true);
        }
        if ((s5 & 4) != 0) {
            g2.a(1, true);
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2, int n3) {
        boolean bl2 = true;
        if (n2 > ac.b) {
            return bl2;
        }
        if (n2 + n3 < 0) return bl2;
        return false;
    }

    public static int b(int n2) {
        return a[n2 /= 1000] % 10000;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int c(int n2) {
        int n3 = 2;
        if (n2 == 1) {
            return n3;
        }
        if (n2 != 2) return 0;
        return 3;
    }

    public static void cinitclone() {
        a = s.a;
        a = new int[150];
        k = 0;
        a = "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void d() {
        if (this.b == -1 && this.c == -1 && this.d == -1 && this.e == -1 && l != this.a) {
            this.i = 0xFFFFFF;
            return;
        }
        this.i = 16774091;
        this.a(1, true);
    }

    public byte a() {
        return this.b;
    }

    public int a() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(int n2) {
        int n3 = -1;
        if (n2 == s.a[2]) {
            return this.b;
        }
        if (n2 == s.a[3]) {
            return this.c;
        }
        if (n2 == s.a[4]) {
            return this.d;
        }
        if (n2 != s.a[5]) return n3;
        return this.e;
    }

    public String a() {
        return "";
    }

    public void a() {
    }

    public void a(byte by) {
        this.b = by;
    }

    public void a(int n2, int n3) {
        if (n2 != 0) {
            this.g = (short)n2;
        }
        if (n3 != 0) {
            this.h = (short)n3;
        }
    }

    public void a(int n2, int n3, int n4) {
        this.a = (short)n2;
        this.b = (short)n3;
        this.i = n4;
    }

    public void a(int n2, int n3, int n4, int n5) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int n2, boolean bl2) {
        if (bl2) {
            this.f |= n2;
            return;
        }
        this.f &= ~n2;
    }

    public void a(bi bi2) {
        this.a = bi2;
    }

    public void a(Graphics graphics) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(boolean bl2) {
        if (bl2) {
            this.a = (byte)(this.a | 1);
            return;
        }
        this.a = (byte)(this.a & 0xFFFFFFFE);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        if ((this.a & 1) == 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2) {
        if ((this.f & n2) == 0) return false;
        return true;
    }

    public int b() {
        return this.a + (this.g >> 1);
    }

    public void b() {
    }

    public void b(int n2, int n3) {
        if (n2 != 0) {
            this.a = (short)n2;
        }
        if (n3 != 0) {
            this.b = (short)n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(boolean bl2) {
        if (bl2) {
            this.a = (byte)(this.a | 2);
            this.f |= 1;
            return;
        }
        this.a = (byte)(this.a & 0xFFFFFFFD);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        if ((this.a & 2) == 0) return false;
        return true;
    }

    public int c() {
        return this.b + (this.h >> 1);
    }

    public void c() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int d() {
        int n2 = this.a / 1000;
        if ((this.f & 0x10) != 0) return 0;
        if (n2 == 32) return k;
        return 0;
    }
}

