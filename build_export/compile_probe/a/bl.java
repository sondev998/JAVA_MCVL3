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
import a.ar;
import a.ay;
import a.az;
import a.bb;
import a.bf;
import a.bg;
import a.bk;
import a.e;
import a.f;
import a.k;
import a.m;
import a.p;
import a.q;
import a.s;
import a.t;
import a.z;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bl
extends e {
    public static int[] a;
    public static p b;
    public static short b;
    public static af[] b;
    public static m c;
    public static short c;
    public static volatile boolean c;
    public static volatile boolean d;
    public static boolean e;
    public static Vector f;
    public static boolean f;
    public static Vector g;
    public static volatile boolean g;
    public static boolean h;
    public static int k;
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public short d = 0;
    public Vector h;
    public int p = 0;
    public int q = 0;

    static {
        Static.regClass(21);
        bl.cinitclone();
    }

    public bl(int n2, int n3, byte by, int n4, int n5, int n6, int n7, String string) {
        super(n2, n3, by, n4, n5, n6, n7, string);
        bf.b();
        this.j = 1;
        this.h = s.a[3];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(int n2, e e2) {
        block4: {
            block3: {
                if (n2 == 0 || b.a(n2) != null) break block3;
                if (e2 == null) break block4;
                b.a(n2, e2);
            }
            return;
        }
        b.a(n2, ay.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(String string, boolean bl2) {
        if (!bl2) {
            for (int i2 = 0; i2 < f.size(); ++i2) {
                if (!((String)f.elementAt(i2)).equals(string)) continue;
                return;
            }
        }
        f.addElement(string);
        g.addElement(new an(0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void b(int n2, boolean bl2) {
        if (bl2) {
            k |= n2;
            return;
        }
        k &= ~n2;
    }

    public static void cinitclone() {
        k = 0;
        b = 0;
        c = false;
        d = false;
        e = false;
        f = true;
        g = false;
        h = false;
        l = 0;
        c = (short)-1;
        b = new p();
        c = null;
        m = 0;
        n = 0;
        o = 0;
        f = new Vector();
        g = new Vector();
        b = null;
    }

    @Override
    public byte a() {
        return (byte)(this.a(6) / 10);
    }

    @Override
    public int a() {
        return this.g(2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public bg a() {
        if (this.i != 5) return super.a();
        return a.k.a;
    }

    @Override
    public String a() {
        return this.a(4);
    }

    @Override
    protected String a(e object, Graphics graphics, int n2, int n3) {
        object = al.a(null, (long)ay.x.size());
        al.a((StringBuffer)object, "/");
        al.a((StringBuffer)object, 9L);
        al.a(graphics, ((StringBuffer)object).toString(), n2 - s.a.stringWidth(((StringBuffer)object).toString()), n3, this.h ? 1 : 0);
        return ((StringBuffer)object).toString();
    }

    @Override
    public void a(int n2, int n3) {
        super.a(n2, n3);
        ap.a().d();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, int n3, boolean bl2) {
        Object object;
        int n4 = this.d;
        az az2 = new az(n2, n3);
        if (aa.a().a(n4, n2, n3) && (object = ab.a().a((byte)2, new az(this.q, this.r), az2, 4096)) != null) {
            while (((Vector)object).size() > 0 && aa.a().a(n4, az2.d, az2.e)) {
                az2 = (az)((Vector)object).lastElement();
                ((Vector)object).removeElement(az2);
            }
        }
        if (bl2 && ay.o != null && ay.o.size() > 0) {
            n3 = ay.o.size();
            for (n2 = 0; n2 < n3; ++n2) {
                af[] afArray = (af[])ay.o.elementAt(n2);
                if (afArray[7].b() != 0) continue;
                object = (t)afArray[3];
                t t2 = (t)afArray[4];
                if (Math.abs(((t)object).a - az2.d) >= 3 || Math.abs(t2.a - az2.e) >= 3) continue;
                az2.d = ((t)object).a;
                az2.e = t2.a;
                if (afArray[5].b() != 0 || (object = ay.a(afArray[0].b())) == null) break;
                this.a(1, (m)object, null);
                break;
            }
        }
        this.b(aa.a().a, az2.d, az2.e);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(Graphics graphics) {
        int n2 = f.size();
        if (n2 > 0) {
            int n3 = aa.a().a(this.d ? 1 : 0);
            int n4 = aa.a().b(this.e ? 1 : 0);
            al.a(graphics);
            graphics.setClip(n3 - 100, n4 - 20 - 80, 200, 80);
            int n5 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                int n6;
                String string = (String)f.elementAt(i2);
                an an2 = (an)g.elementAt(i2);
                int n7 = 3;
                try {
                    n7 = n6 = Integer.parseInt(string.substring(0, 1));
                }
                catch (Exception exception) {}
                int n8 = an2.b();
                n6 = s.h * 2 + 80 - n8;
                if (n5 == 0 || n5 > s.h * 2) {
                    n5 = n2 > 14 ? 14 : n2;
                    n5 = n5 > 5 ? (n5 -= 4) : 0;
                    n8 = an2.a;
                    an2.a = n6 / (11 - n5) + n6 % 2 + n8;
                } else if (n8 == 0) break;
                n5 = an2.b();
                al.a(graphics, string, n3 - (s.a.stringWidth(string) >> 1), n4 - n5 - 20, s.a[n7], 0);
                if (n5 <= s.h + 80) continue;
                f.removeElement(string);
                g.removeElement(an2);
                --n2;
                --i2;
            }
            al.c(graphics);
        }
        super.a(graphics);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected void a(Graphics graphics, String string, int n2, int n3) {
        if (g == false) {
            al.a(graphics, string, n2, n3, this.h ? 1 : 0, 0);
            return;
        }
        al.a(graphics, string, n2, n3, this.h ? 1 : 0, s.b[(g - true) % s.b.length]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(boolean bl2) {
        super.a(bl2);
        if (!bl2) {
            return;
        }
        this.g(0);
        a.k.b(this);
    }

    @Override
    protected boolean a() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(int n2, int n3, int n4, int n5) {
        boolean bl2;
        if (this.a(true)) {
            return true;
        }
        if (n2 / 100 != aa.a().a / 100) {
            ac.a(true, false);
            z.a().a(1145, new t(0), new an(n2), new t((byte)n3), new t((byte)n4));
            bl2 = true;
        } else {
            if (this.b(n2, n3, n4)) {
                ap.a().c(true);
            }
            bl2 = false;
        }
        if (n5 == 0) {
            a.f.a(0);
            return bl2;
        }
        boolean bl3 = bl2;
        if (n5 <= 0) return bl3;
        a.f.a(n5);
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(m m2, int n2, int n3, int n4, af[] afArray) {
        if (afArray != null) return super.a(m2, n2, n3, n4, afArray);
        af[] afArray2 = ay.a(n2, ay.h);
        afArray = afArray2;
        if (afArray2 != null) return super.a(m2, n2, n3, n4, afArray);
        return false;
    }

    @Override
    public boolean a(Graphics graphics, int n2, int n3, int n4, int n5) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(boolean bl2) {
        if (!super.a(bl2)) {
            return false;
        }
        if (!bl2) return true;
        a.f.a(s.d[12]);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(af[] afArray, boolean bl2) {
        boolean bl3;
        boolean bl4 = false;
        if (this.a(bl2)) {
            return bl4;
        }
        if (this.f(4)) {
            bl3 = bl4;
            if (!bl2) return bl3;
            a.k.a(s.d[71]);
            return bl4;
        }
        bl3 = bl4;
        if (!a.k.b(afArray, bl2)) return bl3;
        bl3 = bl4;
        if (!a.k.a((m)this, afArray, bl2)) return bl3;
        bl3 = bl4;
        if (!a.k.a((int)this.d, afArray, bl2)) return bl3;
        return true;
    }

    @Override
    public byte b() {
        return this.a(22);
    }

    @Override
    public int b() {
        return this.a(5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected m b() {
        if (this.i == 5) {
            n = 1;
            return this.b;
        }
        m m2 = super.b();
        if (n == 2) return m2;
        return (m)a;
    }

    @Override
    public String b() {
        return this.a(38);
    }

    @Override
    public short b() {
        return this.a(14);
    }

    @Override
    public void b() {
        bl.a(this.a(), -2, this.q, this.r);
    }

    @Override
    public void b(int n2) {
        ((af)this.a.elementAt(10)).a(n2);
        ap.a().f();
    }

    @Override
    protected boolean b() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2, int n3, int n4) {
        boolean bl2 = true;
        int n5 = aa.a().a;
        if (this.a(true)) {
            return false;
        }
        if (c) {
            a.f.a(s.d[594]);
            return false;
        }
        if (n5 / 100 == n2 / 100) {
            this.p = super.a((byte)n3, (byte)n4, (byte)-1);
            if (this.p > 0) return bl2;
            a.f.a(s.d[76]);
            return false;
        }
        a.f.a(s.d[369]);
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(boolean bl2) {
        boolean bl3 = false;
        if (!super.b(bl2)) {
            return bl3;
        }
        this.p = 0;
        this.i = 0;
        b = null;
        if (bl2) {
            if (ap.a().d()) {
                a.f.a(s.d[77]);
            }
            this.h = null;
        }
        ap.a().c(false);
        g = false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(af[] afArray, boolean bl2) {
        boolean bl3 = false;
        if (!this.a(afArray, bl2)) {
            return bl3;
        }
        if (a.k.b(afArray) == 5) return true;
        if (a == null) return true;
        boolean bl4 = bl3;
        if (!a.k.a(afArray, (m)a, bl2)) return bl4;
        if (aa.a((m)a, ay.a, a.k.a(afArray))) return true;
        bl4 = bl3;
        if (!bl2) return bl4;
        a.k.a(s.d[15]);
        return bl3;
    }

    @Override
    public byte c() {
        return 1;
    }

    @Override
    public int c() {
        return this.g(3);
    }

    @Override
    public String c() {
        return this.a(42);
    }

    @Override
    public void c(int n2) {
        ((af)this.a.elementAt(11)).a(n2);
        ap.a().f();
    }

    @Override
    protected boolean c() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(boolean bl2) {
        if (this.h == this.q) {
            if (this.i == this.r) return false;
        }
        if (!bl2) return true;
        this.h = this.q;
        this.i = this.r;
        return true;
    }

    public byte d() {
        return this.a(48);
    }

    @Override
    public int d() {
        return this.g(10);
    }

    @Override
    public void d(int n2) {
        ((af)this.a.elementAt(12)).a(n2);
        ap.a().f();
    }

    @Override
    public void d(int n2, int n3) {
        super.d(n2, n3);
        aa.a().a(this);
    }

    @Override
    public boolean d() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean d(int n2) {
        boolean bl2 = false;
        if (this.a(false)) {
            this.b(false);
            this.h = null;
            return bl2;
        }
        if (!super.d(n2)) return bl2;
        this.r();
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean d(boolean bl2) {
        boolean bl3 = false;
        if (this.i == 6) {
            return bl3;
        }
        if (bl2 && ap.a().d()) {
            return true;
        }
        if (this.b == null) return true;
        bl2 = bl3;
        if (!g) return bl2;
        return true;
    }

    @Override
    public int e() {
        return this.g(11);
    }

    @Override
    public void e() {
        this.g(s.a[3]);
    }

    @Override
    public void e(int n2) {
        ((af)this.a.elementAt(13)).a(n2);
        ap.a().f();
    }

    @Override
    public void e(int n2, int n3) {
        if (n2 < 0) {
            this.a(n3, true);
        }
    }

    @Override
    public int f() {
        return this.g(12);
    }

    @Override
    public int g() {
        return this.g(13);
    }

    @Override
    protected void g() {
        this.d(-1);
    }

    @Override
    public int h() {
        return this.a(45);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int h(int n2) {
        if (!this.f()) return -1;
        int n3 = this.p();
        int n4 = this.a.f();
        n4 = n3 - n4 - 1;
        for (int i2 = this.d.size() - 1; i2 >= 0; --i2) {
            int n5 = ((an)this.d.elementAt((int)i2)).a;
            n3 = this.a.d(this.e(n5 % 10000));
            n4 = n3 - (n5 /= 10000) + n4;
        }
        if (n4 >= this.a.d(this.e(n2))) return this.a(n2);
        if (this.a(false)) return this.a(n2);
        this.d.addElement(new an(n4 * 10000 + n2));
        return this.a(n2);
    }

    @Override
    public void h() {
    }

    @Override
    protected void h(int n2) {
        ((af)this.a.elementAt(33)).a(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean h(int n2) {
        boolean bl2 = false;
        if (n2 == 0) {
            return bl2;
        }
        if (al.a(n2)) {
            boolean bl3 = bl2;
            if (this.a(true)) return bl3;
            bl3 = bl2;
            if (this.f(4)) return bl3;
        }
        short s2 = this.a();
        return this.a(n2, true, true, (int)s2, (int)s2);
    }

    @Override
    public int i() {
        return this.a(46);
    }

    @Override
    protected void i() {
        a.f.a(20);
        ap.a().f();
        ap.a().a((String)null, (String[])null);
        if (this.a != false) {
            this.a = (int[])false;
            bb.a(0, false, this);
        }
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public int k() {
        return this.g(44);
    }

    @Override
    protected void k() {
        super.k();
        if (!c) {
            a.f.a(s.d[117]);
        }
    }

    @Override
    public void k(int n2) {
        ((af)this.a.elementAt(14)).a(n2);
        ap.a().f();
    }

    @Override
    public int l() {
        return this.a(39);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void l() {
        super.l();
        this.p = 0;
        int n2 = this.h != null ? this.h.size() : 0;
        if (!c && n2 == 0) {
            if (l <= 0 && ap.a().d()) {
                a.f.a(s.d[76]);
            }
            ap.a().c(false);
        }
        g = false;
        if (n2 > 0) {
            if (b != null && aa.a().a / 100 == b[0].b() / 100 && this.q == b[1].b() && this.r == b[2].b()) {
                if (b[3].b() != 1) return;
                af[] afArray = (af[])this.h.elementAt(0);
                z.a().a(1145, (af)new t(3), (an)afArray[0]);
                ac.a(true, false);
                return;
            }
            b = null;
            this.h = null;
            return;
        }
        if (this.h == null) return;
        if (this.q == 0) return;
        bk bk2 = ay.a(this.q);
        if (bk2 == null) return;
        if (bk2.c() > 0) {
            ay.a.a(1, bk2, null);
        } else {
            aa.a((m)bk2, null);
        }
        this.q = 0;
        this.h = null;
    }

    @Override
    public int m() {
        return this.g(33);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void q() {
        if (this.h == null) {
            return;
        }
        if (this.h.size() == 0) {
            this.h = null;
            return;
        }
        af[] afArray = (af[])this.h.elementAt(0);
        this.b(afArray[0].b(), afArray[1].b(), afArray[2].b());
        if (this.b == null) {
            a.f.a(s.d[77]);
            this.h = null;
            return;
        }
        b = afArray;
        this.h.removeElementAt(0);
        ap.a().c(true);
    }

    public void r() {
        q q2 = (q)ap.a().a(3013);
        if (q2 != null && q2.a()) {
            ((ar)q2.a((int)1)).m = (this.p - ((Vector)((Object)this.b)).size()) * 100 / this.p * 10;
        }
    }
}

