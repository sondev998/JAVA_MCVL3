/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.aa;
import a.af;
import a.ap;
import a.ay;
import a.bc;
import a.bf;
import a.bg;
import a.e;
import a.m;
import a.s;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ax
extends m {
    public static short b;
    public e a = null;

    static {
        Static.regClass(13);
        ax.cinitclone();
    }

    public ax(int n2, int n3, int n4, int n5) {
        super(0, 0, (byte)0, n4, 0, n3);
        this.c = n2;
        this.j = 2;
        this.h = s.a[0];
    }

    public static bf a(ax ax2, int n2) {
        if (ax2 != null) {
            n2 = ax2.g(9);
        }
        return bc.b(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a() {
        boolean bl2 = true;
        if (this.f != 4) return false;
        if (this.h()) return false;
        if (!this.f(1)) return false;
        aa.a().a(this, true);
        return bl2;
    }

    public static String b(int n2) {
        return (new String[]{"\u7075\u957f\u7c7b", "\u56db\u8db3\u517d", "\u7cbe\u602a\u7c7b", "\u8089\u98df\u517d", "\u98de\u866b\u7c7b", "\u8d70\u79bd\u7c7b", "\u4eba\u578b\u7c7b", "\u56db\u8e44\u7c7b", "\u6f02\u6d6e\u5e7d\u7075"})[(n2 /= 10) - 1];
    }

    public static void cinitclone() {
        b = (short)10000;
    }

    @Override
    public int a() {
        return this.g(0);
    }

    @Override
    public String a() {
        return this.a(3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(e e2) {
        byte by = this.d;
        byte by2 = e2.q;
        byte by3 = e2.r;
        bg bg2 = e2.e;
        int n2 = e2.a ? 3 : 2;
        if (a.e.a(by, by2, by3, (int)bg2, 0, n2)) {
            this.d(a.e.a, a.e.b);
            return;
        }
        this.d(e2.q, e2.r);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(Graphics graphics) {
        int n2 = aa.a().a(this.d);
        int n3 = aa.a().b(this.e) - aa.a().a((int)this.q, (int)this.r);
        int n4 = ((bg)((Object)this.a)).g();
        int n5 = s.h;
        if (this.b()) {
            this.a(graphics, n2, n3);
        } else {
            this.c(graphics, n2, n3);
            ((bf)((Object)a)).a(graphics, n2 - 18, n3 - 8, 0);
        }
        this.a(graphics, n2 - 11, n3 - n4, 20, 4);
        if ((ap.r & 1) == 0 || this.s() == ay.a.a()) {
            super.a(graphics, n2, n3 - n4 - n5, n3);
        }
        this.a(graphics, n2, n3, n4);
    }

    public byte b() {
        return this.a(5);
    }

    @Override
    public int b() {
        return this.a(4);
    }

    public String b() {
        return this.a(10);
    }

    @Override
    public void b() {
    }

    @Override
    public void b(int n2) {
        ((af)((Vector)((Object)this.a)).elementAt(14)).a(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(e e2) {
        int n2 = 2;
        if (this.i != 0) return;
        if (this.f(2)) {
            return;
        }
        int n3 = e2.q;
        int n4 = e2.r;
        byte by = this.d;
        bg bg2 = e2.e;
        if (e2.a) {
            n2 = 3;
        }
        int n5 = n3;
        int n6 = n4;
        if (a.e.a(by, n3, n4, (int)bg2, 0, n2)) {
            n5 = a.e.a;
            n6 = a.e.b;
        }
        if (n5 == this.q && n6 == this.r) {
            if (this.f != 1) return;
            this.e();
            return;
        }
        if (!aa.a().b.contains(this)) {
            if (!(aa.a().a(n5, n6, 0, 0) && this.i() && this.b())) {
                this.d(n5, n6);
                return;
            }
        } else if (!this.b()) {
            this.d(n5, n6);
            return;
        }
        this.a(n5, n6, false, -1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void b(boolean bl2) {
        if (bl2 && this.l == 0 && !this.a(false)) {
            return;
        }
        this.a(1, bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean b() {
        boolean bl2 = true;
        if (this.s() == ay.a.a()) {
            return bl2;
        }
        if (ap.r < 2) return bl2;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public byte c() {
        if (this.a == null) return super.c();
        return this.a.c();
    }

    @Override
    public int c() {
        return this.g(1);
    }

    public short c() {
        return this.a(8);
    }

    @Override
    public void c(int n2) {
        ((af)((Vector)((Object)this.a)).elementAt(15)).a(n2);
    }

    @Override
    public int d() {
        return this.g(14);
    }

    @Override
    public void d(int n2) {
        ((af)((Vector)((Object)this.a)).elementAt(16)).a(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean d() {
        if (ay.a(this.s()) != null) return super.d();
        return false;
    }

    @Override
    public int e() {
        return this.g(15);
    }

    @Override
    public void e(int n2) {
        ((af)((Vector)((Object)this.a)).elementAt(17)).a(n2);
    }

    @Override
    public int f() {
        return this.g(16);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void f() {
        super.f();
        if (this.a()) {
            return;
        }
        if (this.i == 0) return;
        this.m();
    }

    @Override
    public int g() {
        return this.g(17);
    }

    @Override
    public int h() {
        return this.a(11);
    }

    @Override
    public int i() {
        return this.a(12);
    }

    public int r() {
        return this.a(18);
    }

    public int s() {
        return this.g(2);
    }
}

