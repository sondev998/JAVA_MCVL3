/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Static;
import a.aa;
import a.ac;
import a.ad;
import a.af;
import a.al;
import a.an;
import a.ap;
import a.au;
import a.av;
import a.ax;
import a.bb;
import a.bc;
import a.bf;
import a.bg;
import a.bk;
import a.bl;
import a.d;
import a.e;
import a.f;
import a.j;
import a.k;
import a.m;
import a.s;
import a.t;
import a.w;
import a.z;
import java.util.Hashtable;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ay {
    public static int a;
    public static af a;
    public static bf a;
    public static bg a;
    public static bl a;
    public static e a;
    public static String a;
    public static Hashtable a;
    public static Vector a;
    public static af[] a;
    public static bf b;
    public static bg b;
    public static String b;
    public static Vector b;
    public static af[] b;
    public static bf c;
    public static bg c;
    public static String c;
    public static Vector c;
    public static bg d;
    public static String d;
    public static Vector d;
    public static bg e;
    public static Vector e;
    public static bg f;
    public static Vector f;
    public static Vector g;
    public static Vector h;
    public static Vector i;
    public static Vector j;
    public static Vector k;
    public static Vector l;
    public static Vector m;
    public static Vector n;
    public static Vector o;
    public static Vector p;
    public static Vector q;
    public static Vector r;
    public static Vector s;
    public static Vector t;
    public static Vector u;
    public static Vector v;
    public static Vector w;
    public static Vector x;

    static {
        Static.regClass(14);
        ay.cinitclone();
    }

    public static int a(int n2) {
        int n3 = 0;
        int n4 = a.size() - 1;
        while (true) {
            block4: {
                bc bc2;
                block5: {
                    int n5;
                    block3: {
                        n5 = n3;
                        if (n4 < 0) break block3;
                        bc2 = (bc)a.elementAt(n4);
                        if (bc2.b != n2) break block4;
                        if (bc2.a()) break block5;
                        n5 = 1;
                    }
                    return n5;
                }
                n3 = bc2.a + n3;
            }
            --n4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ax a(int n2) {
        if (n2 == 0) {
            return null;
        }
        if (a.a() != null && a.a().a() == n2) {
            return a.a();
        }
        ax ax2 = ay.b(n2);
        m m2 = ax2;
        if (ax2 != null) return m2;
        int n3 = m.size();
        int n4 = 0;
        while (n4 < n3) {
            m2 = (e)m.elementAt(n4);
            if (((e)m2).a() != null && ((e)m2).a().a() == n2) {
                return ((e)m2).a();
            }
            ++n4;
        }
        return null;
    }

    public static bc a(int n2, int n3, String object, Vector vector) {
        object = new bc(n2, n3, (String)object);
        vector.addElement(object);
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bc a(int n2, Vector object) {
        int n3 = ((Vector)object).size();
        int n4 = 0;
        while (n4 < n3) {
            bc bc2 = (bc)((Vector)object).elementAt(n4);
            if (bc2.a == n2) {
                return bc2;
            }
            ++n4;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public static bc a(int var0, Vector var1_1, boolean var2_2) {
        block9: {
            var4_3 = var1_1.size();
            var5_4 = null;
            block0: for (var3_5 = 0; var3_5 < var4_3; ++var3_5) {
                block11: {
                    block10: {
                        var7_7 = (bc)var1_1.elementAt(var3_5);
                        if (var7_7.b != var0) break block9;
                        var6_6 = var7_7;
                        if (!var7_7.a()) break block10;
                        if (var2_2) break block11;
                        var6_6 = var7_7;
                    }
lbl11:
                    // 2 sources

                    return var6_6;
                }
                var6_6 = var7_7;
                if (var5_4 != null) {
                    if (var5_4.a <= var7_7.a) break block9;
                    var6_6 = var7_7;
                }
lbl18:
                // 4 sources

                while (true) {
                    var5_4 = var6_6;
                    continue block0;
                    break;
                }
            }
            var6_6 = var5_4;
            ** while (true)
        }
        var6_6 = var5_4;
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bk a(int n2) {
        int n3 = k.size();
        int n4 = 0;
        while (n4 < n3) {
            bk bk2 = (bk)k.elementAt(n4);
            if (bk2.a() == n2) {
                return bk2;
            }
            ++n4;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bk a(int n2, int n3) {
        int n4 = k.size();
        int n5 = 0;
        while (n5 < n4) {
            bk bk2 = (bk)k.elementAt(n5);
            if (bk2.q == n2 && bk2.r == n3) {
                return bk2;
            }
            ++n5;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static e a(int n2) {
        void var3_2;
        if (a == null) {
            return var3_2;
        }
        if (n2 == a.a()) {
            bl bl2 = a;
            return var3_2;
        }
        int n3 = m.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            e e2;
            e e3 = e2 = (e)m.elementAt(i2);
            if (e2.a() != n2) continue;
            return var3_2;
        }
        return var3_2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static e a(int n2, String object, int n3, int n4, int n5, int n6, int n7, int n8) {
        e e2 = ay.a(n2);
        if (e2 == null) {
            object = new e(n4, n5, 0, n6, n7, n8, n2, (String)object);
            m.addElement(object);
            return object;
        }
        aa.a().a(e2, true);
        return e2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static m a(int var0, int var1_1) {
        var2_2 /* !! */  = null;
        switch (var1_1) lbl-1000:
        // 4 sources

        {
            default: lbl-1000:
            // 2 sources

            {
                return var2_2 /* !! */ ;
            }
            case 1: {
                if (var0 == 0) ** GOTO lbl-1000
            }
            case 64: {
                var2_2 /* !! */  = ay.a(var0);
                ** GOTO lbl-1000
            }
            case 4: 
            case 8: {
                var2_2 /* !! */  = ay.a(var0);
                ** GOTO lbl-1000
            }
            case 2: 
        }
        var2_2 /* !! */  = ay.a(var0);
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Vector a() {
        if ((bl.k & 8) == 0) return v;
        return w;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Vector a(int n2, int n3) {
        switch (n2) {
            default: {
                return null;
            }
            case 1: {
                return a;
            }
            case 2: 
            case 4: 
            case 8: 
            case 16: {
                Vector<bc> vector = new Vector<bc>();
                int n4 = a.size() - 1;
                while (n4 >= 0) {
                    bc bc2 = (bc)a.elementAt(n4);
                    if (bc.a(n2, bc2.b, n3)) {
                        vector.insertElementAt(bc2, 0);
                    }
                    --n4;
                }
                return vector;
            }
            case 256: {
                return m;
            }
            case 2048: {
                return c;
            }
            case 16384: {
                return d;
            }
            case 1024: {
                Vector<bc> vector;
                Vector vector2 = new Vector();
                for (n2 = d.size() - 1; n2 >= 0; --n2) {
                    vector2.insertElementAt(d.elementAt(n2), 0);
                }
                n2 = c.size() - 1;
                while (true) {
                    vector = vector2;
                    if (n2 < 0) return vector;
                    vector2.insertElementAt(c.elementAt(n2), 0);
                    --n2;
                }
            }
            case 65536: {
                return h;
            }
            case 262144: {
                Vector<bc> vector;
                if (au.e == null) {
                    return i;
                }
                Vector vector3 = new Vector();
                for (n2 = au.e.size() - 1; n2 >= 0; --n2) {
                    vector3.insertElementAt(au.e.elementAt(n2), 0);
                }
                n2 = i.size() - 1;
                while (true) {
                    vector = vector3;
                    if (n2 < 0) return vector;
                    vector3.insertElementAt(i.elementAt(n2), 0);
                    --n2;
                }
            }
            case 131072: {
                if (au.d == null) return new Vector<bc>();
                return au.d;
            }
            case 32: {
                return b;
            }
            case 524288: {
                if (r != null) return r;
                return new Vector();
            }
            case 0x100000: {
                if (s != null) return s;
                return new Vector();
            }
            case 0x200000: {
                if (t != null) return t;
                return new Vector();
            }
            case 0x400000: 
        }
        if (u != null) return u;
        return new Vector();
    }

    public static void a() {
        int n2;
        for (n2 = m.size() - 1; n2 >= 0; --n2) {
            ((e)m.elementAt(n2)).h();
        }
        for (n2 = k.size() - 1; n2 >= 0; --n2) {
            ((bk)k.elementAt(n2)).h();
        }
    }

    public static void a(int n2) {
        e e2 = ay.a(n2);
        if (e2 != null && e2.a() != null) {
            aa.a().a(e2.a(), true);
            e2.a((ax)null);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(int n2, byte by) {
        af[] afArray = ay.a(n2);
        if (afArray != null) {
            afArray.a = by;
            afArray.b();
        }
        if (n == null) return;
        int n3 = 1;
        while (n3 < n.size()) {
            afArray = (af[])n.elementAt(n3);
            if (afArray[0].b() == n2) {
                afArray[3] = new an(by);
                return;
            }
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(int n2, int n3, int n4) {
        if (a != null && a.a() == n2) {
            ay.a.a.a(n3, n4);
            av av2 = a.f.a(7);
            if (av2 == null) return;
            if (av2.b(0).b() != 0) return;
            av2.a(2, new j(""));
            ac.a(true, false);
            z.a().a(1006, new t(1));
            return;
        }
        e e2 = ay.a(n2);
        if (e2 == null) return;
        e2.a.a(n3, n4);
    }

    public static void a(int n2, bk bk2) {
        int n3 = k.size();
        int n4 = 0;
        while (true) {
            block4: {
                block3: {
                    if (n4 >= n3) break block3;
                    bk2 = (bk)k.elementAt(n4);
                    if (bk2.a() != n2) break block4;
                    k.removeElementAt(n4);
                    aa.a().a(bk2, true);
                    a.m.a.remove(new StringBuffer().append("").append(n2).toString());
                }
                return;
            }
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(int n2, e e2) {
        e e3 = e2;
        if (e2 == null) {
            int n3 = m.size();
            int n4 = 0;
            while (true) {
                e3 = e2;
                if (n4 >= n3 || (e3 = (e)m.elementAt(n4)).a() == n2) break;
                ++n4;
            }
        }
        if (e3 != null) {
            m.removeElement(e3);
            a.m.a.remove(new StringBuffer().append("").append(e3.a()).toString());
            aa.a().a(e3, true);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(e e2, ax ax2, boolean bl2) {
        if (e2.a() != null) {
            if (!bl2 && ax2 != null && e2.a().a() == ax2.a()) {
                return;
            }
            aa.a().a(e2.a(), true);
        }
        e2.a(ax2);
        if (ax2 == null) return;
        ax2.a(e2);
        ax2.f(e2.c());
        ax2.g(e2.h);
    }

    public static void a(boolean bl2) {
        if (a != null) {
            a.b(false);
        }
        if (bl2) {
            au.a().a = null;
            ad.a().a = 0;
            a = null;
            e = null;
            b = null;
            b = new Vector();
            e = new Vector(2);
            x.removeAllElements();
            a = null;
            a = new Vector(2);
            b = null;
            bl.d = false;
            bl.c = false;
            bl.b = 0;
            bl.a = null;
            bl.c = (short)-1;
            a.s.a = false;
            ad.a().c();
            h.removeAllElements();
            j.removeAllElements();
            c.removeAllElements();
            d.removeAllElements();
            f.removeAllElements();
            g.removeAllElements();
            a = null;
            a = null;
            i.removeAllElements();
            if (a != null) {
                ay.a.h = null;
            }
            bb.a().a(-1, true);
            v.removeAllElements();
            w.removeAllElements();
            au.a().a();
        }
        a.e.b = 0;
        a = null;
        k = null;
        k = new Vector(2);
        l = null;
        l = new Vector();
        m = null;
        m = new Vector(2);
        o = null;
        o = new Vector(2);
        bb.a().a(1, false);
        p = null;
        p = new Vector(2);
        q.removeAllElements();
        n = null;
        n = new Vector();
        aa.a().b = new Vector(5);
        bf.c();
        a.w.g.removeAllElements();
        a.k.a();
        bl.b.a();
        bl.c = null;
        ap.a(0L, false);
        ap.c = null;
        ap.c = (byte)-1;
        a.m.a = null;
        a.m.a.clear();
        if (r != null) {
            r.removeAllElements();
        }
        if (s != null) {
            s.removeAllElements();
        }
        if (t != null) {
            t.removeAllElements();
        }
        if (u != null) {
            u.removeAllElements();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(af[] afArray, Vector vector) {
        int n2 = vector.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((af[])vector.elementAt(i2))[1].b() != afArray[1].b()) continue;
            vector.setElementAt(afArray, i2);
            return;
        }
        vector.addElement(afArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean a(int n2, int n3, int n4) {
        boolean bl2 = false;
        if (n2 != a.a()) {
            return bl2;
        }
        if (n3 == 13) {
            ay.a.d = (short)(n4 * 100 + ay.a.d % 100);
        } else {
            if (n3 != 9) return bl2;
            ay.a.d = (short)(ay.a.d / 100 * 100 + n4);
        }
        ap.a().f();
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2, Vector vector) {
        int n3 = vector.size();
        int n4 = 0;
        while (n4 < n3) {
            bc bc2 = (bc)vector.elementAt(n4);
            if (bc2.a == n2) {
                vector.removeElementAt(n4);
                if (bc2.a == 0) {
                    ap.a().b(bc2.b, true);
                    return true;
                }
                ay.a(bc2.e, bc2.a, 0);
                return true;
            }
            ++n4;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static af[] a(int n2) {
        int n3 = l.size() - 1;
        while (n3 >= 0) {
            af[] afArray = (af[])l.elementAt(n3);
            if (afArray[0].b() == n2) {
                return afArray;
            }
            --n3;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static af[] a(int n2, Vector afArray) {
        int n3 = afArray.size() - 1;
        while (n3 >= 0) {
            af[] afArray2 = (af[])afArray.elementAt(n3);
            if (afArray2[1].b() == n2) {
                return afArray2;
            }
            --n3;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static af[] a(boolean bl2, int n2, z z2, Vector vector) {
        int n3 = ((af)z2.a.elementAt(n2)).b();
        af[] afArray = null;
        int n4 = 0;
        while (n4 < n3) {
            afArray = new af[23];
            for (int i2 = 0; i2 < 23; ++i2) {
                afArray[i2] = i2 < 22 ? (af)z2.a.elementAt(n4 * 22 + n2 + 1 + i2) : new d(0L);
            }
            if (bl2) {
                ay.a(afArray, vector);
            } else {
                vector.addElement(afArray);
            }
            a.k.b(afArray);
            ++n4;
        }
        return afArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static af[] a(boolean bl2, z z2, Vector vector) {
        int n2 = z2.a.size() / 7;
        af[] afArray = null;
        int n3 = 0;
        while (n3 < n2) {
            afArray = al.a(7, n3 * 7 + 1, z2.a);
            if (bl2) {
                ay.a(afArray, vector);
            } else {
                vector.addElement(afArray);
            }
            ++n3;
        }
        return afArray;
    }

    public static ax b(int n2) {
        ax ax2;
        ax ax3 = ax2 = ay.c(n2);
        if (ax2 == null) {
            ax3 = ay.d(n2);
        }
        return ax3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bk b(int n2, int n3) {
        bk bk2 = ay.a(n2);
        if (bk2 == null) {
            bk2 = new bk(n3);
            k.addElement(bk2);
            return bk2;
        }
        aa.a().a(bk2, true);
        return bk2;
    }

    public static void b() {
        int n2 = c.size();
        int n3 = 0;
        while (true) {
            block4: {
                block3: {
                    if (n3 >= n2) break block3;
                    ax ax2 = (ax)c.elementAt(n3);
                    if (ax2.a(5) != 1) break block4;
                    ax2.a(a);
                    a.a(ax2);
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
    public static af[] b(int n2, Vector afArray) {
        int n3 = afArray.size() - 1;
        while (n3 >= 0) {
            af[] afArray2 = (af[])afArray.elementAt(n3);
            if (afArray2[1].b() == n2) {
                return afArray2;
            }
            --n3;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ax c(int n2) {
        int n3 = 0;
        while (n3 < c.size()) {
            if (((ax)c.elementAt(n3)).a() == n2) {
                return (ax)c.elementAt(n3);
            }
            ++n3;
        }
        return null;
    }

    public static void c() {
        d = new Vector();
        e = new Vector(2);
        a = new Vector(2);
        b = new Vector();
        k = new Vector(2);
        l = new Vector();
        m = new Vector(2);
        h = new Vector(7);
        j = new Vector();
        x = new Vector();
        a = new Hashtable();
        n = new Vector();
        o = new Vector(2);
        c = new Vector();
        f = new Vector(2);
        g = new Vector(2);
        i = new Vector(2);
        p = new Vector(2);
        q = new Vector();
        e = bg.a(2020000, 0);
        ay.e.c = 999000;
        d = bg.a(6040000, 0);
        ay.d.c = 999000;
        f = bg.a(2070000, 0);
        a = new bf(4521916, 0);
        b = new bf(30014);
        c = bc.b(2911);
        v = new Vector();
        w = new Vector();
    }

    public static void cinitclone() {
        a = "";
        b = null;
        a = 0;
        c = null;
        d = null;
        a = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ax d(int n2) {
        int n3 = 0;
        while (n3 < d.size()) {
            if (((ax)d.elementAt(n3)).a() == n2) {
                return (ax)d.elementAt(n3);
            }
            ++n3;
        }
        return null;
    }
}

