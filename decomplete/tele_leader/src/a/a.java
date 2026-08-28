/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Static;
import a.ac;
import a.ad;
import a.af;
import a.an;
import a.ar;
import a.av;
import a.ay;
import a.bb;
import a.bc;
import a.f;
import a.g;
import a.n;
import a.q;
import a.s;
import a.t;
import a.w;
import a.x;
import a.z;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a {
    public static a a;
    private ad a;
    private w a = ad.a();

    static {
        Static.regClass(0);
        a.a.cinitclone();
    }

    private a() {
    }

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    private void a(byte by, int n2, byte by2) {
        z.a().a(1130, (af)new t(by), (af)new an(n2), new t(by2));
    }

    public static void cinitclone() {
    }

    public av a(av av2, int n2, int n3, int n4) {
        if (av2 == null) {
            av2 = f.b(146);
        }
        av2.a(146005, 2, 0, ((q)av2.a(146005)).f(), null);
        av2.b(0).a(n2);
        av2.b(1).a(n3);
        this.a(av2);
        ad ad2 = this.a;
        ad.a(av2, n2, n3, n4, 146004);
        this.a.a(av2, 146005, 146004, 0, -1, -1);
        return av2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av g2) {
        int n2 = ((av)g2).a / 1000 == 146 ? 146006 : 145004;
        g2 = (q)((av)g2).a(n2);
        ar ar2 = new ar("", 0, 0);
        ar2.a(bc.a(4200));
        ((q)g2).a(ar2, 0);
        n2 = ac.a < 240 ? 2 : 1;
        ((q)g2).a(new x(30, 8, n2, 0, new StringBuffer().append(ay.c.size() + ay.d.size()).append("/").append(s.a).toString()), 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(av av2) {
        String string = bb.a().a(10);
        g g2 = av.a(av2, 146005, 1000);
        if (string.equals(s.a[2])) {
            this.a.a(null, 0, 0, g2.d);
            return;
        }
        if (string.equals(s.d[140])) {
            this.a((byte)10, g2.d, (byte)0);
            return;
        }
        if (string.equals("C\u01b0\u1ee1i th\u00fa") || string.equals(s.d[141])) {
            this.a((byte)11, g2.d, (byte)1);
            return;
        }
        if (string.equals(s.a[109])) {
            z.a().a(1130, (af)new t(1), new an(g2.d));
            return;
        }
        if (!s.a[108].equals(string)) return;
        ((n)f.a(s.d[151], "", (int)(av2.a + 2), -1, true, av2, null).a(1003)).a(2);
    }
}

