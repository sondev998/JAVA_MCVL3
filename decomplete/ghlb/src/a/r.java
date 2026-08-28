/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.ac;
import a.al;
import a.av;
import a.aw;
import a.g;
import a.s;
import java.io.DataInputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class r
extends g {
    private aw a;
    private Vector a;
    public byte c = (byte)2;
    public int m = 0;
    public int n = 0;
    private int o;
    private int p;
    private int q;
    private int r = 0;

    public r(int n2, int n3, int n4, int n5, int n6) {
        super(n2, n3, n5, n6);
        this.a = new Vector();
        this.q = n4;
        this.a();
        this.b = (byte)11;
    }

    public static g a(int n2, byte by, DataInputStream dataInputStream) {
        r r2 = new r(0, 0, 1000, 64, -1);
        a.g.a(r2, n2, by, dataInputStream);
        r2.b(dataInputStream.readUTF());
        r2.a();
        return r2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, aw aw2) {
        block8: {
            block6: {
                block7: {
                    if (aw2 != null && this.a != null) {
                        if (!aw2.equals(this.a)) return;
                    }
                    if (this.a != null) break block7;
                    if (n2 == 1) {
                        this.a = (aw)this.a.firstElement();
                        break block6;
                    } else {
                        if (n2 != -1) return;
                        this.a = (aw)this.a.lastElement();
                    }
                    break block6;
                }
                n2 = this.a.indexOf(this.a) + n2;
                if (n2 < 0 || n2 >= this.a.size()) break block8;
                this.a = (aw)this.a.elementAt(n2);
            }
            this.r = 0;
            this.o = this.a.a(1, 0);
            aw.a(this.o);
            this.b(-1, -1);
            return;
        }
        this.o = n2 < 0 ? aw.c : aw.a(999);
        if (aw2 == null) return;
        if (!aw2.equals(this.a)) return;
        this.r = 0;
        this.a = null;
    }

    private void a(aw aw2) {
        this.a.addElement(aw2);
        this.h();
    }

    private void f() {
        this.p = 0;
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            aw aw2 = (aw)this.a.elementAt(i2);
            int n2 = this.p;
            this.p = aw2.f() + n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void g() {
        if (this.a == null) {
            return;
        }
        aw aw2 = this.a;
        int n2 = this.r;
        this.r = n2 + 1;
        if ((n2 = aw2.a(-1, n2)) == -999) return;
        if (n2 == -888) {
            this.r = 0;
            aw2 = this.a;
            n2 = this.r;
            this.r = n2 + 1;
            this.o = aw2.a(-1, n2);
        } else {
            this.o = n2;
        }
        aw.a(this.o);
        this.b(-1, -1);
    }

    private void h() {
        if (this.a.size() > this.q) {
            while (this.a.size() - this.q > 0) {
                if (this.a != null && this.a.equals((aw)this.a.elementAt(0))) {
                    this.a(1, this.a);
                }
                this.a.removeElementAt(0);
            }
        }
        this.f();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int a(int n2) {
        int n3 = -1;
        if (n2 == s.a[2] && this.b != -1) {
            return this.b;
        }
        if (n2 == s.a[3] && this.c != -1) {
            return this.c;
        }
        if (n2 == s.a[4] && this.d != -1 && this.o <= aw.c) {
            return this.d;
        }
        int n4 = n3;
        if (n2 != s.a[5]) return n4;
        n4 = n3;
        if (this.e == -1) return n4;
        n4 = n3;
        if (aw.a(this.o) - 1 <= this.o) return n4;
        return this.e;
    }

    public aw a(String string) {
        return this.a(string, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public aw a(String object, boolean bl2) {
        int n2;
        int n3 = n2 = this.g;
        if ((this.f & 0x20) != 0) {
            n3 = n2 - 8;
        }
        if (n3 <= 0) return null;
        object = aw.a((String)object, n3, bl2, false);
        this.a((aw)object);
        return object;
    }

    @Override
    public void a() {
        super.a();
        this.o = 0;
    }

    public void a(int n2) {
        this.q = n2;
        this.h();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(int n2, int n3, int n4, int n5) {
        int n6 = n2;
        if (n2 == 0) {
            n6 = n3;
        }
        if (ac.a(n4, n5)) {
            this.b(n4, n5);
            return;
        }
        if (n6 == s.a[4]) {
            this.a(-1, null);
            return;
        }
        if (n6 == s.a[5]) {
            this.a(1, null);
            return;
        }
        if (n6 == s.a[3]) {
            this.g();
            return;
        }
        if (n3 != s.a[6]) return;
        if (this.a == null) return;
        this.a.a(7, this);
    }

    public void a(String string) {
        this.b(string);
        this.h = this.f();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void a(Graphics graphics) {
        void var4_4;
        int n2;
        super.a(graphics);
        if (this.c < 2) {
            this.c = (byte)(this.c + 1);
        }
        int n3 = a.r.b((int)this.a);
        aw aw2 = this.a;
        if (a.g.a(n3 = this.b - n3, this.h)) {
            return;
        }
        int n4 = this.h;
        boolean bl2 = this.b();
        if ((this.f & 0x20) != 0) {
            al.c(graphics, (int)this.a, n3, this.g, n4, s.b);
            n2 = n3 += 3;
            var4_4 += 8;
            n4 -= 6;
        } else {
            if ((this.f & 0x80) != 0) {
                al.a(graphics, (int)this.a, n3 - 1, this.g, n4 + 1, true);
                graphics.setColor(65280);
                graphics.drawRect((int)this.a, n3 - 1, this.g, n4 + 1);
            }
            n2 = n3;
        }
        graphics.setClip((int)var4_4, n3, this.g, n4);
        int n5 = al.a;
        int n6 = this.m;
        if (this.a(256)) {
            --this.n;
        }
        n6 = n2 + n5 + n6 + this.n;
        n2 = 0;
        while (true) {
            if (n2 >= this.a.size() || (n6 = ((aw)this.a.elementAt(n2)).a(graphics, (int)(var4_4 + 2), n6, this.g, 0, bl2, (int)this.c, n3)) - n3 > n4 || n6 > ac.b) {
                al.b(graphics);
                return;
            }
            if (n2 == this.a.size() - 1 && n6 < this.b && this.a(256)) {
                this.n = this.h;
            }
            ++n2;
        }
    }

    @Override
    public int b() {
        return (int)(this.a + (this.g >> 1) - 45);
    }

    /*
     * Enabled aggressive block sorting
     */
    public aw b(String object, boolean bl2) {
        int n2;
        int n3 = n2 = this.g;
        if ((this.f & 0x20) != 0) {
            n3 = n2 - 8;
        }
        if (n3 <= 0) {
            return null;
        }
        n2 = aw.c;
        object = aw.a((String)object, n3, bl2, true);
        this.a.insertElementAt(object, 0);
        if (!this.b()) {
            n3 = n2 - aw.c;
            aw.b -= n3;
            this.o -= n3;
        } else {
            this.b(-1, -1);
        }
        this.h();
        return object;
    }

    @Override
    public void b() {
        if (this.a == null) {
            this.a(1, null);
        }
    }

    public void b(int n2) {
        if (n2 < this.a.size()) {
            if (this.a != null && this.a.equals((aw)this.a.elementAt(n2))) {
                this.a(1, this.a);
            }
            this.a.removeElementAt(n2);
            this.f();
        }
    }

    public void b(String stringArray) {
        if (stringArray != null && stringArray.length() > 0) {
            stringArray = al.a((String)stringArray, "_");
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                this.a(stringArray[i2]);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean b(int n2, int n3) {
        boolean bl2 = false;
        boolean bl3 = (this.f & 0x10) == 0;
        int n4 = bl3 ? a.r.b((int)this.a) : 0;
        short s2 = this.b;
        int n5 = al.a;
        int n6 = n3;
        if (n3 != ac.g) {
            n6 = n3 - this.m;
        }
        int n7 = aw.c();
        n4 = s2 - n4 + n5;
        n3 = 0;
        while (true) {
            boolean bl4 = bl2;
            if (n3 >= this.a.size()) return bl4;
            n4 = ((aw)this.a.elementAt(n3)).a((int)(this.a + true), n4, n2, n6);
            if (n4 == -999 || n4 == -888) {
                this.o = aw.b();
                if (n2 != ac.f || n6 != ac.g) {
                    if (this.a == null) return true;
                    this.a.a(6, this);
                    return true;
                }
                n2 = aw.c();
                if (bl3) {
                    ((av)((Object)this.a)).c(n2 - n7);
                } else {
                    n2 = this.b - n2;
                    if (n4 == -888 || n2 > this.m) {
                        this.m = n2;
                    }
                }
                if (this.a == null) return true;
                this.a.a(6, this);
                return true;
            }
            ++n3;
        }
    }

    @Override
    public int c() {
        return this.m + this.b;
    }

    public void c(int n2) {
        int n3;
        aw aw2 = null;
        while ((n3 = this.h()) > n2) {
            aw2 = (aw)this.a.elementAt(0);
            if (this.a != null && this.a.equals(aw2)) {
                this.a(1, this.a);
            }
            this.a.removeElementAt(0);
        }
        if (n2 > n3 && aw2 != null) {
            aw2.a(n2 - n3);
            this.a.insertElementAt(aw2, 0);
        }
        this.f();
    }

    public void d() {
        this.a = null;
        this.r = 0;
        this.a.removeAllElements();
        this.o = 0;
        this.p = 0;
        this.m = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int e() {
        int n2 = 0;
        if (this.a.size() > 0) {
            n2 = ((aw)this.a.elementAt(0)).g();
            for (int i2 = 1; i2 < this.a.size(); ++i2) {
                int n3 = ((aw)this.a.elementAt(i2)).g();
                int n4 = n2;
                if (n2 < n3) {
                    n4 = n3;
                }
                n2 = n4;
            }
        }
        return n2;
    }

    public void e() {
        this.a = null;
        this.a(1, null);
    }

    public int f() {
        return this.p;
    }

    public int g() {
        return this.q;
    }

    public int h() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            n2 += ((aw)this.a.elementAt(i2)).h();
        }
        return n2;
    }
}

