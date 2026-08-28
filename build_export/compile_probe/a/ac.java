/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.aa;
import a.ad;
import a.al;
import a.as;
import a.at;
import a.au;
import a.av;
import a.ay;
import a.bb;
import a.be;
import a.bf;
import a.f;
import a.s;
import a.w;
import javax.microedition.lcdui.Graphics;
import lib.GameCanvas;
import lib.Thread;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ac
extends GameCanvas
implements Runnable {
    public static byte a;
    public static int a;
    public static ac a;
    public static short a;
    public static boolean a;
    public static int b;
    public static short b;
    public static boolean b;
    public static int c;
    public static short c;
    public static boolean c;
    public static int d;
    public static short d;
    public static boolean d;
    public static int e;
    public static short e;
    public static int f;
    public static long f;
    public static short f;
    public static int g;
    public static short g;
    public static int h;
    public static int i;
    long a;
    private bf a;
    public Graphics a;
    private Thread a;
    private short[] a = 0L;
    long b;
    private bf b;
    private Thread b = null;
    long c;
    private bf c = 0L;
    private long d;
    private bf d = 0L;
    private long e;
    private boolean e = false;
    private int j = 0;
    private int k = 0;
    private int l = 0;

    static {
        Static.regClass(3);
        ac.cinitclone();
    }

    public ac() {
        super(false);
        this.setFullScreenMode(true);
        a = (short)this.getWidth();
        b = (short)this.getHeight();
        this.a = this.getGraphics();
        this.a.setFont(s.a);
        this.j = a;
    }

    public static ac a() {
        if (a == null) {
            a = new ac();
            a.c();
            a.f.b(2);
            ay.c();
            bb.k();
            bb.m();
            al.a = al.a(s.a, "N");
            bb.a().a();
            a.e();
        }
        return a;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String a(Graphics graphics, String string, int n2, int n3) {
        int n4;
        String string2 = string;
        if (string == null) return string2;
        int n5 = s.a[2];
        if (ay.a != 0) {
            n5 = ay.a;
        }
        if (a + n2 + (n4 = s.a.stringWidth(string)) <= 0) {
            ay.a = 0;
            return null;
        }
        int n6 = a + n2 < 0 ? 0 : a + n2;
        n4 = -n2 > n4 ? a - (-n2 - n4) : (int)a;
        al.a(graphics, n6, n3, n4 -= n6, s.h, (int)a, 0);
        al.a(graphics);
        graphics.setClip(n6, n3, n4, s.h);
        al.a(graphics, string, n2 + a, n3, n5, n5);
        al.c(graphics);
        return string;
    }

    static Thread a(ac ac2, Thread thread) {
        ac2.b = thread;
        return thread;
    }

    /*
     * Enabled aggressive block sorting
     */
    private short a(int n2, boolean bl2) {
        short s2;
        int n3;
        int n4;
        short s3;
        block6: {
            s3 = -8;
            n4 = 0;
            for (n3 = 9; n3 <= 18; ++n3) {
                if (n2 != this.a[n3]) continue;
                s2 = s.a[n3];
                break block6;
            }
            s2 = 0;
        }
        if (bl2) {
            e = s2;
        }
        if (n2 != -8) {
            s3 = 0;
        }
        if (s2 == s.a[14]) {
            return s.a[6];
        }
        short s4 = s3;
        if (s2 != 0) return s4;
        n3 = n4;
        while (true) {
            s4 = s3;
            if (n3 > 8) return s4;
            if (n2 == this.a[n3]) {
                return s.a[n3];
            }
            ++n3;
        }
    }

    static void a(ac ac2, Graphics graphics) {
        ac2.c(graphics);
    }

    public static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        graphics.setColor(n9);
        graphics.fillRect(n2, n3, n4, n5);
        graphics.fillRect(n2 + 1, n3 - 1, n4 - 2, n5 + 2);
        graphics.setColor(n8);
        n4 = n4 * n6 / n7;
        graphics.fillRect(n2 + 1, n3 + 1, n4 - 2, n5 - 2);
        graphics.fillRect(n2 + 2, n3, n4 - 4, n5);
    }

    public static void a(boolean bl2, boolean bl3) {
        f = System.currentTimeMillis();
        d = bl2;
        c = bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2, int n3) {
        if (n2 < 0) return false;
        if (n3 < 0) return false;
        if (n2 > a) return false;
        if (n3 <= b) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static short[] a() {
        int n2;
        int n3;
        short[] sArray;
        block7: {
            as as2;
            int n4 = 0;
            sArray = new short[45];
            try {
                StringBuffer stringBuffer = new StringBuffer();
                as2 = new as(stringBuffer.append(s.c[0]).append("keys.o").toString());
                n3 = 0;
            }
            catch (Exception exception) {
                n2 = 0;
                break block7;
            }
            while (true) {
                n2 = ++n3;
                try {
                    if (!as2.b()) break;
                    sArray[n3] = (byte)as2.a();
                }
                catch (Exception exception) {
                    n2 = n3;
                    break;
                }
            }
        }
        if (n2 == 0) {
            for (n3 = n4; n3 < 19; ++n3) {
                sArray[n3] = s.a[n3];
            }
        }
        return sArray;
    }

    public static void b() {
        h = f;
        i = g;
        e %= 10;
        ac.f();
    }

    private void b(Graphics graphics) {
        if (c || d) {
            if (System.currentTimeMillis() - this.e > 100L) {
                this.e = System.currentTimeMillis();
            }
            al.a(ay.d, -1, a / 2, b / 2, graphics);
            if (System.currentTimeMillis() - f >= 4000L) {
                d = false;
            }
            if (c && System.currentTimeMillis() - f >= 60000L) {
                bb.a("Li\u00ean k\u1ebft qu\u00e1 th\u1eddi gian!!", true);
                c = false;
            }
        }
    }

    private void c() {
        a.f.a();
        be.a(true);
        w.a().a = bb.a();
        w.a().a = ad.a();
        w.a().a = au.a();
        ad.a().a = w.a();
        ad.a().a = au.a();
        au.a().a = w.a();
        au.a().a = ad.a();
        au.a().a = bb.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c(Graphics graphics) {
        try {
            int n2;
            int n3;
            Object object;
            if (this.d == null) {
                this.e = false;
                object = new bf(5001);
                this.a = object;
                this.b = object = new bf(5002);
                this.c = object = new bf(5003);
                this.d = object = new bf(5010003);
            }
            if (this.d != null) {
                if (this.e) {
                    graphics.setClip(0, b - 20, (int)a, 20);
                } else {
                    graphics.setClip(0, 0, (int)a, (int)b);
                }
                graphics.setColor(0);
                graphics.fillRect(0, 0, (int)a, (int)b);
                this.d.a(graphics, (a - 96) / 2, 10, 0);
                if (au.a().a != null && (object = au.a().a(ad.a().b("", au.a().a))) != null) {
                    au.a().a = null;
                    this.e = true;
                    ((av)object).a(graphics);
                }
            }
            if (this.a != null) {
                int n4 = b - this.a.d();
                n3 = (a - 240) / 2;
                n2 = f * 240 / 100;
                this.b.a(graphics, n3, n4, 0);
                graphics.setClip(n3, n4, n2, 100);
                this.a.a(graphics, n3, n4, 0);
                if (n2 > 13 && n2 < 220) {
                    graphics.setClip(n3 + n2 - 13, n4, 26, 100);
                    this.c.a(graphics, n3 + n2 - 13, n4, 0);
                }
            }
            graphics.setClip(0, 0, (int)a, (int)b);
            object = new StringBuffer();
            object = ((StringBuffer)object).append("\u0110ang t\u1ea3i ").append(f).append("%").toString();
            n3 = s.a.stringWidth((String)object);
            n2 = a;
            graphics.setColor(0xFFFFFF);
            graphics.drawString((String)object, n2 - n3 >> 1, b - 20, 0);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void cinitclone() {
        a = (short)176;
        b = (short)208;
        g = 0;
        a = -1;
        b = -1;
        c = 0;
        d = 0;
        e = 0;
        f = (short)-1;
        g = (short)-1;
        c = false;
        d = false;
        f = 0L;
        a = false;
        b = false;
        f = 0;
    }

    private void d() {
        this.b = new at(this);
        this.b.start();
    }

    private void e() {
        if (this.a == null) {
            this.a = new Thread(this);
            this.a.start();
        }
    }

    private static void f() {
        e = e / 10 * 10;
        e = 0;
        d = 0;
        c = 0;
        g = 0;
    }

    public void a() {
        this.a.a();
        this.b.a();
        this.c.a();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d.a();
        this.d = null;
        this.e = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2) {
        int n3 = 100;
        if (n2 == 0) {
            return;
        }
        if (this.b == null && f < 50) {
            f = 1;
            this.d();
        }
        n2 = (f = n2) > 100 ? n3 : f;
        f = n2;
    }

    public void a(Graphics graphics) {
        int n2;
        graphics.setClip(0, 0, (int)a, (int)b);
        graphics.setColor(s.a);
        graphics.fillRect(0, 0, (int)a, (int)b);
        a.f.a(graphics);
        this.b(graphics);
        String string = ay.b;
        this.j = n2 = this.j - 3;
        if (this.a(graphics, string, n2, s.h * 3) == null) {
            ay.b = null;
            this.j = 0;
        }
        string = ay.c;
        this.k = n2 = this.k - 3;
        if (this.a(graphics, string, n2, 0) == null) {
            ay.c = null;
            this.k = 0;
        }
        string = ay.d;
        this.l = n2 = this.l - 3;
        if (this.a(graphics, string, n2, b / 2 - 30) == null) {
            ay.d = null;
            this.l = 0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void leyPressed(int n2) {
        short s2;
        if (c || d) {
            return;
        }
        g = n2;
        d = s2 = this.a(n2, true);
        c = s2;
        e = e / 10 * 10 + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void leyReleased(int n2) {
        if (c || d) {
            ac.f();
            return;
        }
        if (g != n2) return;
        g = 0;
        switch (e % 10) {
            default: {
                return;
            }
            case 1: {
                e = e / 10 * 10 + 2;
                return;
            }
            case 4: 
        }
        ac.f();
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void pointerDragged(int n2, int n3) {
        if (c) return;
        if (d) {
            return;
        }
        if (System.currentTimeMillis() - this.d < 500L || e / 10 == 128 || e / 10 == 352) {
            if (Math.abs(b - n3) > 10) {
                e = e % 10 + 1280;
            } else if (Math.abs(a - n2) > 10) {
                e = e % 10 + 3520;
            }
            if (e / 10 == 128) {
                h = -1;
                i = -1;
                c = n3 - b;
                return;
            }
            if (e / 10 != 352) return;
            h = -1;
            i = -1;
            d = n2 - a;
            return;
        }
        if (Math.abs(a - n2) <= 15) {
            if (Math.abs(b - n3) <= 15) return;
        }
        e = e % 10 + 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void pointerPressed(int n2, int n3) {
        if (c || d) {
            return;
        }
        a = n2;
        b = n3;
        c = 0;
        this.d = System.currentTimeMillis();
        h = n2;
        i = n3;
        e = e % 10 + 160;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void pointerReleased(int n2, int n3) {
        if (c || d) {
            ac.b();
            return;
        }
        this.d -= 500L;
        switch (e / 10) {
            default: {
                return;
            }
            case 0: 
            case 128: {
                ac.b();
                return;
            }
            case 16: 
            case 64: 
        }
        e = e % 10 + 320;
        h = n2;
        i = n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        ac.c = 0;
        ac.d = 0;
        ac.h = ac.f;
        ac.i = ac.g;
        this.a = ac.a();
        var5_1 = 0L;
        var12_2 = bb.a();
        while (true) {
            if (this.a == null) {
                return;
            }
            if (var5_1 <= 0L) ** GOTO lbl36
            var7_7 = var5_1;
            try {
                block33: {
                    block32: {
                        block31: {
                            block30: {
                                block29: {
                                    block28: {
                                        ++this.a;
                                        var7_7 = var5_1;
                                        this.c = System.currentTimeMillis() - var5_1 + this.c;
                                        var7_7 = var5_1;
                                        if (this.a > (long)1000) {
                                            var7_7 = var5_1;
                                            this.c -= this.c / this.a;
                                            var7_7 = var5_1;
                                            --this.a;
                                        }
                                        var7_7 = var5_1;
                                        var9_8 = this.c / this.a;
                                        var7_7 = var5_1;
                                        if (this.b <= (long)1000) break block28;
                                        var7_7 = var5_1;
                                        this.b = 0L;
                                        var7_7 = var5_1;
                                        var12_2.a(var9_8);
                                        ** GOTO lbl36
                                    }
                                    var7_7 = var5_1;
                                    ++this.b;
lbl36:
                                    // 3 sources

                                    var7_7 = var5_1;
                                    var7_7 = var5_1 = System.currentTimeMillis();
                                    var4_6 = ac.d;
                                    var7_7 = var5_1;
                                    var3_5 = ac.e;
                                    var1_3 = -1;
                                    var2_4 = -1;
                                    var7_7 = var5_1;
                                    if (var5_1 - this.d > 200L) {
                                        var7_7 = var5_1;
                                        var1_3 = ac.h;
                                        var7_7 = var5_1;
                                        var2_4 = ac.i;
                                    }
                                    var7_7 = var5_1;
                                    a.f.a(ac.c, ac.d, var1_3, var2_4);
                                    var7_7 = var5_1;
                                    if (ac.d == 0) break block29;
                                    var7_7 = var5_1;
                                    if (var4_6 == ac.d) break block30;
                                }
                                var7_7 = var5_1;
                                if (ac.e == 0) break block31;
                                var7_7 = var5_1;
                                if (var3_5 != ac.e) break block31;
                            }
                            var7_7 = var5_1;
                            switch (ac.e % 10) {
                                case 1: {
                                    var7_7 = var5_1;
                                    ac.e = ac.e / 10 * 10 + 4;
                                    var7_7 = var5_1;
                                    ac.e = 0;
                                    var7_7 = var5_1;
                                    ac.d = 0;
                                    break;
                                }
                                case 2: {
                                    var7_7 = var5_1;
                                    ac.f();
                                    break;
                                }
                            }
                        }
                        var7_7 = var5_1;
                        if (ac.h != -1) {
                            var7_7 = var5_1;
                            if (var1_3 == ac.h) {
                                var7_7 = var5_1;
                                if (ac.i != -1) {
                                    var7_7 = var5_1;
                                    if (var2_4 == ac.i) {
                                        var7_7 = var5_1;
                                        switch (ac.e / 10) {
                                            case 16: {
                                                var7_7 = var5_1;
                                                if (var5_1 - this.d <= 200L) break;
                                                var7_7 = var5_1;
                                                ac.e = ac.e % 10 + 640;
                                                break;
                                            }
                                            case 32: {
                                                var7_7 = var5_1;
                                                ac.b();
                                                break;
                                            }
                                            case 128: {
                                                var7_7 = var5_1;
                                                ac.h = ac.f;
                                                var7_7 = var5_1;
                                                ac.i = ac.g;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        var7_7 = var5_1;
                        if (ac.a) break block32;
                        var7_7 = var5_1;
                        if (!ac.b) break block33;
                    }
                    var7_7 = var5_1;
                    aa.a().d();
                    var7_7 = var5_1;
                    ac.a = false;
                }
                var7_7 = var5_1;
                this.a(this.a);
                var7_7 = var5_1;
            }
            catch (Exception var11_9) {
                ac.a = false;
                var5_1 = var7_7;
                continue;
            }
            {
                this.flushGraphics();
                var7_7 = var5_1;
                var12_2.b();
                var7_7 = var5_1;
                if (System.currentTimeMillis() - bb.a > 1000L) {
                    var7_7 = var5_1;
                    var12_2.h();
                    var7_7 = var5_1;
                    bb.a = System.currentTimeMillis();
                }
                var7_7 = var5_1;
                var12_2.f();
                var7_7 = var5_1;
                var9_8 = (long)s.j - (System.currentTimeMillis() - var5_1);
                if (var9_8 > 0L) {
                    var7_7 = var5_1;
                    Thread.CurrentThread();
                    var7_7 = var5_1;
                    Thread.sleep(var9_8);
                }
                var7_7 = var5_1;
                var12_2.e();
                continue;
            }
            break;
        }
    }

    public void sizeChanged(int n2, int n3) {
        a = (short)n2;
        b = (short)n3;
    }
}

