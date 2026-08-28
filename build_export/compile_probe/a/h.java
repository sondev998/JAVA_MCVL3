/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.ac;
import a.al;
import a.bf;
import a.g;
import a.s;
import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class h
extends g {
    private int A;
    private bf a;
    public Vector a;
    private boolean a;
    private bf[] a = null;
    private Vector b;
    private int[] b = null;
    public int m;
    public int n;
    public int o = 20;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t = 1;
    private int u = 1;
    private int v;
    private int w = 0;
    private int x;
    private int y;
    private int z;

    public h(int n2, int n3, int n4, int n5, int n6, int n7) {
        super(n4, n5, n6, n7);
        this.g = n4;
        this.h = n5;
        this.n = n2;
        this.o = n3;
        this.a();
    }

    public static int a(String[] stringArray) {
        int n2 = 0;
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (stringArray[i2].equals("")) continue;
            ++n2;
        }
        return n2;
    }

    public static g a(int n2, byte by, DataInputStream dataInputStream) {
        h h2 = new h(20, 20, 10, 10, 0, -1);
        a.g.a(h2, n2, by, dataInputStream);
        dataInputStream.readByte();
        String string = dataInputStream.readUTF();
        int n3 = dataInputStream.readByte();
        int[] nArray = new int[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            nArray[n2] = al.b(dataInputStream.readByte());
        }
        dataInputStream.readInt();
        h2.a();
        h2.c(nArray[0], nArray[1]);
        if (string.length() > 0) {
            h2.a(al.a(string, "_"));
        }
        return h2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(int n2) {
        if (n2 == 37) {
            return new StringBuffer().append("*").append(a.s.a[61]).toString();
        }
        if (n2 != 38) return new StringBuffer().append(n2 - 27).append(a.s.a[61]).toString();
        return new StringBuffer().append("#").append(a.s.a[61]).toString();
    }

    public static void a(h h2) {
        int n2 = h2.m;
        int n3 = h2.g();
        bf[] bfArray = new bf[n2];
        int n4 = 0;
        int n5 = 0;
        while (true) {
            block4: {
                block3: {
                    if (n4 >= n3) break block3;
                    if (((String)h2.a.elementAt(n4)).equals("")) break block4;
                    bfArray[n5] = new bf(4610912, a.h.f(n4) - 27);
                    int n6 = n5 + 1;
                    if (n6 == n2) break block3;
                    n5 = n6;
                    if (n6 != 7) break block4;
                }
                h2.a(bfArray);
                return;
            }
            ++n4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b(int n2) {
        this.t = this.g / this.n;
        if (this.t == 0) {
            this.t = 1;
        }
        if (n2 == 3 || n2 == 1) {
            this.m = this.b.size();
            if (this.t > 1 && this.t < this.m) {
                --this.t;
            }
            if (n2 == 1) {
                this.u = 1;
                this.s = 1;
            }
            return;
        }
        this.u = this.h / this.o;
        if (this.u == 0) {
            this.u = 1;
        }
        this.d(this.b.size());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(Graphics graphics) {
        if (this.u >= this.s) {
            return;
        }
        if (this.q != 0) {
            if (this.a == null) {
                this.a = new bf(5710509);
            } else {
                this.a.a(graphics, (int)(this.a + (this.g >> 1)), (int)this.b, 5);
            }
        }
        if (this.q == this.s - 1) return;
        if (this.a == null) {
            this.a = new bf(5710509);
            return;
        }
        this.a.a(graphics, (int)(this.a + (this.g >> 1)), (int)(this.b + this.h - 6), 6);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(int n2) {
        if (n2 == a.s.a[5]) {
            this.i();
            return;
        }
        if (n2 == a.s.a[4]) {
            this.j();
            return;
        }
        if (n2 == a.s.a[2]) {
            this.g();
            return;
        }
        if (n2 != a.s.a[3]) return;
        this.h();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(int n2) {
        boolean bl2;
        boolean bl3 = true;
        if ((this.f & 0x10) == 0) return false;
        if (n2 == 0) {
            if (this.p < 0) {
                this.a(this.m - 1);
                return bl3;
            }
            if (this.p == 0) {
                this.x = 0;
                return bl3;
            }
            bl2 = bl3;
            if (this.p >= this.x) return bl2;
            this.x = this.p;
            return bl3;
        }
        bl2 = bl3;
        if (n2 != 1) return bl2;
        if (this.p >= this.m) {
            this.a(0);
            return bl3;
        }
        if (this.p >= this.m - 1) {
            this.p = this.m - 1;
            this.x = this.m - this.t;
            if (this.x < 0) {
                this.x = 0;
            }
            this.a.a(2, this);
            return bl3;
        }
        bl2 = bl3;
        if (this.p < this.x + this.t) return bl2;
        this.x = this.p - this.t + 1;
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void d(int n2) {
        this.m = n2;
        if (this.t == 0) {
            return;
        }
        this.s = this.m / this.t;
        if (this.m % this.t == 0) return;
        ++this.s;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int f(int n2) {
        switch (n2) {
            default: {
                return -1;
            }
            case 28: {
                return 0;
            }
            case 30: {
                return 1;
            }
            case 34: {
                return 2;
            }
            case 36: {
                return 3;
            }
            case 27: {
                return 4;
            }
            case 37: {
                return 5;
            }
            case 38: {
                return 6;
            }
            case 0: {
                return 28;
            }
            case 1: {
                return 30;
            }
            case 2: {
                return 34;
            }
            case 3: {
                return 36;
            }
            case 4: {
                return 27;
            }
            case 5: {
                return 37;
            }
            case 6: 
        }
        return 38;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void f() {
        if (this.b != null && (this.f & 4) != 0) {
            this.w = 0;
            int n2 = this.b.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = a.s.a.stringWidth((String)this.b.elementAt(i2));
                if (n3 <= this.w) continue;
                this.w = n3;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int g(int n2) {
        int n3 = 27;
        if (n2 >= 28 && n2 <= 36) {
            return n2 - 28;
        }
        if (n2 == 27) return 9;
        if (n2 == 37) return n2 - 27;
        if (n2 == 38) {
            return n2 - 27;
        }
        if (n2 >= 0 && n2 <= 8) {
            return n2 + 28;
        }
        if (n2 == 9) return n3;
        if (n2 == 10) return n2 + 27;
        if (n2 != 11) return -1;
        return n2 + 27;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void g() {
        --this.p;
        if (this.c(0)) {
            return;
        }
        if (this.p < 0) {
            this.p = this.m - 1;
        }
        this.a(this.p);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int h(int n2) {
        if (n2 == 29) {
            return 4;
        }
        if (n2 == 31) {
            return 2;
        }
        if (n2 == 33) {
            return 3;
        }
        if (n2 != 35) return -1;
        return 5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void h() {
        ++this.p;
        if (this.c(1)) {
            return;
        }
        if (this.p >= this.m) {
            this.p = 0;
        }
        this.a(this.p);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void i() {
        ++this.q;
        if (this.q >= this.s) {
            this.e();
            return;
        }
        if (this.p < this.m - 1) {
            this.p += this.t;
            if (this.p >= this.m) {
                this.p = this.p - this.t + 1;
            }
        }
        if (this.r + this.u >= this.s) return;
        if (this.q < this.u) return;
        ++this.r;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void j() {
        --this.q;
        if (this.q < 0) {
            this.a(this.m - 1);
            return;
        }
        this.p -= this.t;
        if (this.p < 0) {
            this.p = 0;
        }
        if (this.r == this.q + 1) {
            --this.r;
        }
        if (this.r >= 0) return;
        this.r = this.m - 1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public int a(int n2) {
        void var2_5;
        int n3 = -1;
        int n4 = this.p % this.t;
        if (n2 == a.s.a[2] && this.b != -1 && n4 <= 0) {
            Vector vector = this.b;
            return (int)var2_5;
        }
        if (n2 == a.s.a[3] && this.c != -1 && n4 >= this.t - 1) {
            int n5 = this.c;
            return (int)var2_5;
        }
        if (n2 == a.s.a[4] && this.d != -1 && this.q <= 0) {
            int n6 = this.d;
            return (int)var2_5;
        }
        int n7 = n3;
        if (n2 != a.s.a[5]) return (int)var2_5;
        int n8 = n3;
        if (this.e == -1) return (int)var2_5;
        if (this.q + 1 < this.s) {
            int n9 = n3;
            if (this.p + this.t < this.m) return (int)var2_5;
        }
        int n10 = this.e;
        return (int)var2_5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String a() {
        if (this.p >= this.b.size()) return "";
        return (String)this.b.elementAt(this.p);
    }

    @Override
    public void a() {
        super.a();
        if (this.b == null) {
            this.b = new Vector();
        }
        if (this.a == null) {
            this.a = new Vector();
        }
        if (this.a != null && this.a[0] != null) {
            this.v = this.a[0].b();
        }
        this.f();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2) {
        if (n2 < 0) return;
        if (n2 >= this.m) {
            return;
        }
        this.p = n2;
        this.a.a(2, this);
        if ((this.f & 0x10) != 0) {
            if (n2 == this.m - 1) {
                this.x = this.m - this.t;
                if (this.x >= 0) return;
                this.x = 0;
                return;
            }
            if (n2 < this.t) {
                this.x = 0;
                return;
            }
            if (this.x <= n2) {
                if (n2 - this.x < this.t) return;
            }
            this.x = this.p;
            return;
        }
        this.q = this.p / this.t;
        if (this.q < this.r) {
            this.r = this.q;
        } else if (this.q - this.r >= this.u) {
            this.r = this.q - this.u + 1;
        }
        if (this.s < this.u) {
            this.r = 0;
            return;
        }
        if (this.r <= this.s - this.u) return;
        this.r = this.s - this.u;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(int n2, int n3, int n4, int n5) {
        block12: {
            block14: {
                block13: {
                    if (this.b(n4, n5) && this.a != null) {
                        this.a.a(19876543, this);
                    }
                    if (n2 == 0 || this.p == -1) break block12;
                    if ((this.f & 0x10) != 0) {
                        n2 = n3;
                    }
                    if (n2 != a.s.a[5]) break block13;
                    if ((this.f & 0x10) == 0) {
                        this.c(n2);
                        if (this.a != null) {
                            this.a.a(2, this);
                        }
                    }
                    break block12;
                }
                if (n2 != a.s.a[4]) break block14;
                if ((this.f & 0x10) == 0) {
                    this.c(n2);
                    if (this.a != null) {
                        this.a.a(2, this);
                    }
                }
                break block12;
            }
            if (n2 == a.s.a[2]) {
                this.c(n2);
                if (this.a != null) {
                    this.a.a(2, this);
                }
            } else if (n2 == a.s.a[3]) {
                this.c(n2);
                if (this.a != null) {
                    this.a.a(2, this);
                }
            }
        }
        if ((n3 == a.s.a[6] || n3 == a.s.a[1]) && this.a != null) {
            this.a.a(3, this);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(int n2, boolean bl2) {
        super.a(n2, bl2);
        if ((n2 & 0x10) != 0) {
            n2 = bl2 ? 1 : 0;
            this.b(n2);
            this.e();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(Graphics graphics) {
        Object object;
        super.a(graphics);
        graphics.setColor(98, 0, 0);
        Object object2 = 0;
        if ((this.f & 0x10) == 0) {
            object2 = a.h.b((int)this.a);
        }
        if (a.g.a(object2 = (Object)(this.b - object2), this.h)) {
            return;
        }
        bf bf2 = this.a;
        int n2 = object2 + 1;
        if ((this.f & 0x80) != 0) {
            al.d(graphics, (int)(this.a - true), object2 - 1, this.g + 3, this.h + 2);
        }
        if (this.b.size() <= 0) return;
        int n3 = this.r * this.t + this.x;
        int n4 = (this.r + this.u) * this.t + this.x;
        if (n4 > this.m) {
            n4 = this.m;
        }
        if ((this.f & 0x10) != 0) {
            al.c(graphics, (int)this.a, n2, this.g, this.o);
            if (this.x > 0) {
                al.a(graphics, "...", (int)(bf2 + 6), n2 + 4, this.i, 0);
                object2 = this.n / 2 + bf2;
            } else {
                object2 = bf2;
            }
            object = object2;
            if (this.x + this.t < this.m) {
                al.a(graphics, "...", this.t * this.n + object2 + 6, n2 + 4, this.i, 0);
                object = object2;
            }
        } else {
            object = bf2;
        }
        Object object3 = 0;
        Object object4 = object;
        while (n3 < n4) {
            block37: {
                String string;
                int n5;
                block34: {
                    block36: {
                        n5 = this.a != null && this.a[n3] != null ? 2 : 0;
                        if (object3 >= this.t) break block36;
                        string = (String)this.b.elementAt(n3);
                        if ((this.f & 4) != 0) {
                            if ((this.f & 0x40) != 0) {
                                object = (this.n - this.w - this.v - n5) / 2;
                                object2 = object;
                                if (object < 0) {
                                    object2 = 0;
                                }
                                object = object2;
                                break block34;
                            } else {
                                object = (this.n - a.s.a.stringWidth(string) - this.v - n5) / 2;
                            }
                            break block34;
                        } else {
                            object = (this.f & 0x40) != 0 ? (Object)6 : (Object)false;
                        }
                    }
                    object = false;
                    --n3;
                    if ((n2 += this.o) > ac.b) break;
                    object2 = n2 < -20 ? (Object)bf2 : (Object)bf2;
                    break block37;
                }
                if (string != null) {
                    Object object52;
                    object2 = object52 = this.i;
                    if (this.b != null) {
                        if ((this.f & 0x100) != 0 && this.y < 20) {
                            object2 = this.i;
                        } else {
                            if (this.y > 40) {
                                this.y = 0;
                            }
                            object2 = object52;
                            if (this.b != null) {
                                object2 = this.b[n3];
                            }
                        }
                        ++this.y;
                    }
                    if ((this.f & 0x200) != 0) {
                        if (n3 == this.p && this.b()) {
                            if ((this.f & 0x20) == 0) {
                                al.c(graphics, (int)(this.a + 4), n2, this.g - 8, this.o, a.s.c);
                            } else {
                                al.c(graphics, (int)(this.a - 2), n2, this.g + 2, this.o, a.s.c);
                            }
                        }
                    } else {
                        boolean bl2;
                        int n6;
                        Object object52;
                        if (this.b() && n3 == this.p) {
                            object2 = 0xFF0000;
                        }
                        if ((this.f & 0x10) != 0) {
                            object52 = this.n;
                            n6 = this.o;
                            bl2 = n3 == this.p;
                            al.c(graphics, (int)object4, n2 + 3, object52 - 1, n6 - 6, bl2);
                        } else {
                            object52 = this.n;
                            n6 = this.o;
                            bl2 = n3 == this.p;
                            al.d(graphics, (int)object4, n2, object52, n6 - 2, bl2);
                        }
                    }
                    if (this.A > this.n && this.a) {
                        --this.z;
                        if (this.A + this.z < 0) {
                            this.z = this.A;
                        }
                    }
                    this.a = !this.a;
                    if (n3 == this.p) {
                        al.a(graphics, string, (int)(object4 + object + this.v + n5), n2 + (this.o - a.s.h + al.a >> 1), object2, 0);
                    } else {
                        graphics.setClip((int)(object4 + object + this.v + n5), (this.o - a.s.h + al.a >> 1) + n2, this.n, this.o);
                        al.a(graphics, string, (int)(object4 + object + this.v + n5 + this.z), n2 + (this.o - a.s.h + al.a >> 1), object2, 0);
                    }
                    al.b(graphics);
                }
                if (n5 == 2) {
                    this.a[n3].a(graphics, (int)(object4 + object), (this.o - this.a[n3].d() >> 1) + n2, 0);
                }
                object2 = object4 + this.n;
                object = object3 + 1;
            }
            ++n3;
            object4 = object2;
            object3 = object;
        }
        this.b(graphics);
    }

    public void a(int[] nArray) {
        this.b = nArray;
    }

    public void a(bf[] bfArray) {
        this.a = bfArray;
        this.v = 0;
        if (this.a != null) {
            int n2 = this.a.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (this.a[i2] == null || this.v >= this.a[i2].b()) continue;
                this.v = this.a[i2].b();
            }
        }
        this.f();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(String[] stringArray) {
        int n2;
        if (stringArray == null) {
            return;
        }
        this.b.removeAllElements();
        this.a.removeAllElements();
        for (n2 = 0; n2 < stringArray.length; ++n2) {
            if (this.A < a.s.a.stringWidth(stringArray[n2])) {
                this.A = a.s.a.stringWidth(stringArray[n2]);
            }
            this.a.addElement(stringArray[n2]);
            if (stringArray[n2].equals("")) continue;
            this.b.addElement(stringArray[n2]);
        }
        this.f();
        n2 = (this.f & 0x10) != 0 ? 3 : 2;
        this.b(n2);
    }

    @Override
    public int b() {
        return this.d(-1);
    }

    @Override
    public void b(boolean bl2) {
        super.b(bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2) {
        String string = (String)this.a.elementAt(n2);
        if (string.equals("")) {
            return false;
        }
        this.a(this.b.indexOf(string));
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean b(int n2, int n3) {
        void var4_6;
        int n4;
        int n5;
        Object object;
        if (!ac.a(n2, n3)) return false;
        if ((this.f & 0x10) != 0) {
            object = this.x;
            int n6 = this.x + this.t;
            if (n6 > this.m) {
                int n7 = this.m;
                n5 = 0;
            } else {
                n5 = 0;
            }
        } else {
            n5 = a.h.b((int)this.a);
            n4 = this.r;
            object = this.t;
            int n8 = (this.r + this.u) * this.t;
            object = n4 * object;
        }
        while (object < var4_6) {
            int n9;
            n4 = this.d((int)object);
            if (al.a(n2, n3, n4, n4 + this.n, n9 = this.e((int)object) - n5, n9 + this.o)) {
                this.p = object;
                this.a.a(2, this);
                return true;
            }
            ++object;
        }
        if ((this.f & 0x10) == 0) return false;
        bf bf2 = this.a;
        object = bf2;
        if (this.x > 0) {
            reference var4_9 = bf2 + this.n / 2;
            object = var4_9;
            if (al.a(n2, n3, (int)this.a, (int)var4_9, (int)this.b, (int)(this.b + this.o))) {
                this.g();
                return true;
            }
        }
        if (this.x + this.t >= this.m) return false;
        if (!al.a(n2, n3, object += this.t * this.n, object + this.n / 2, (int)this.b, (int)(this.b + this.o))) return false;
        this.h();
        return true;
    }

    @Override
    public int c() {
        return this.e(-1);
    }

    @Override
    public void c() {
    }

    public void c(int n2, int n3) {
        this.n = n2;
        this.o = n3;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int d(int object) {
        void var1_3;
        Object object2 = object;
        if (object == -1) {
            object2 = this.p;
        }
        if ((this.f & 0x10) != 0) {
            if (this.x == 0) {
                reference var1_2 = this.a + this.n * object2;
                return (int)var1_3;
            }
            reference var1_4 = this.a + (object2 - this.x) * this.n + this.n / 2;
            return (int)var1_3;
        }
        reference var1_5 = this.a + object2 % this.t * this.n;
        return (int)var1_3;
    }

    public void d() {
        if (this.b != null) {
            this.b.removeAllElements();
        }
        if (this.a != null) {
            this.a.removeAllElements();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int e() {
        if (this.b.size() % this.t != 0) return (this.b.size() / this.t + 1) * this.o;
        return this.b.size() / this.t * this.o;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int e(int object) {
        void var1_3;
        if ((this.f & 0x10) != 0) {
            Vector vector = this.b;
            return (int)var1_3;
        }
        Object object2 = object;
        if (object == -1) {
            object2 = this.p;
        }
        reference var1_4 = this.b + (object2 / this.t - this.r) * this.o;
        return (int)var1_3;
    }

    public void e() {
        this.q = 0;
        this.r = 0;
        this.p = 0;
        this.x = 0;
    }

    public int f() {
        return this.p;
    }

    public int g() {
        return this.a.size();
    }
}

