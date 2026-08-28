/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.a;
import a.aa;
import a.ab;
import a.ac;
import a.af;
import a.al;
import a.an;
import a.ap;
import a.ay;
import a.bf;
import a.bl;
import a.k;
import a.m;
import a.r;
import a.s;
import a.t;
import a.w;
import a.z;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bk
extends m {
    public static int a;
    public static r b;
    public static long c;
    public byte a;
    public long a;
    public r a;
    int b;
    public long b;
    public String b;
    public af[] b = 0L;
    private String c;

    static {
        Static.regClass(20);
        bk.cinitclone();
    }

    /*
     * Enabled aggressive block sorting
     */
    public bk(int n2) {
        super(0, 0, (byte)0, n2, 0, 0);
        this.j = 8;
        int n3 = n2 / 100000;
        if (n3 == 5) {
            this.j = 16;
            this.o = bf.a(n2 % 100000 / 10);
            this.p = bf.b(n2 % 100000 / 10);
        } else if (n3 == 9) {
            // empty if block
        }
        this.a = 2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a() {
        boolean bl2 = true;
        if (this.f != 4) return false;
        if (this.h()) return false;
        if (this.b != null) {
            a.k.c(this.b);
            this.b = null;
        }
        if (!this.f(1)) return false;
        ay.a(this.a(), this);
        aa.a().a(this, true);
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2) {
        if (n2 == 300) return false;
        if (n2 == 0) return false;
        if (n2 != 203) return true;
        return false;
    }

    public static void cinitclone() {
        a = -1;
        c = 0L;
        b = null;
    }

    @Override
    public int a() {
        return this.g(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String a() {
        String string = this.a(11);
        String.valueOf(string);
        if (string.equals("Lu\u0323c Th\u01b0\u0300a Phong")) {
            a.a.Null = 1;
            int n2 = Integer.parseInt(String.valueOf(Integer.toHexString(this.g(0))), 16);
            ab.bytes1 = (byte)(n2 & 0xFF);
            ab.bytes2 = (byte)(n2 >> 8 & 0xFF);
            ab.bytes3 = (byte)(n2 >> 16 & 0xFF);
            return string;
        }
        if (!string.equals("D\u01b0\u01a1ng qua\u0301")) return string;
        int n3 = Integer.parseInt(String.valueOf(Integer.toHexString(this.g(0))), 16);
        ab.bytes1 = (byte)(n3 & 0xFF);
        ab.bytes2 = (byte)(n3 >> 8 & 0xFF);
        ab.bytes3 = (byte)(n3 >> 16 & 0xFF);
        return string;
    }

    public void a() {
        String string;
        int n2 = this.g(9);
        if (this.a != null && (string = this.a.a(n2 * 1000 + 11)) != null) {
            this.m(Integer.parseInt(string));
        }
    }

    public void a(String string) {
        this.c = string;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void a(Graphics var1_1) {
        block8: {
            var4_2 = aa.a().a(this.d);
            var5_3 = aa.a().b(this.e) - aa.a().a((int)this.q, (int)this.r);
            if (this.a == null) break block8;
            var2_4 = this.a.g();
            if (var2_4 < 45) {
                var2_4 = 45;
            }
lbl7:
            // 4 sources

            while (true) {
                block9: {
                    block7: {
                        block6: {
                            block10: {
                                if (this.j == 16) {
                                    var2_4 = this.c();
                                    bf.a(var1_1, var2_4 % 100000 / 10, var4_2, var5_3, var2_4 % 10);
lbl11:
                                    // 4 sources

                                    return;
                                }
                                this.a(var1_1, var4_2, var5_3);
                                this.a(var1_1, var4_2 - 11, var5_3 - var2_4, 20, 4);
                                if (!aa.a && bk.o() != this.a() && (!this.f(8) || !ap.d)) break block9;
                                if (this.g(9) / 100000 != 9 || this.b == null) break block10;
                                this.d();
                                if (bk.b == null) break block9;
                                bk.b.b(var4_2 - (bk.b.g >> 1), var5_3 - bk.b.f() - 45);
                                bk.b.a(var1_1);
                                var3_5 = 0;
lbl23:
                                // 3 sources

                                while (true) {
                                    if (this.b <= 0) break block6;
                                    this.b = 0;
lbl26:
                                    // 2 sources

                                    while (true) {
                                        this.b(var1_1, var4_2, var5_3);
                                        this.a(var1_1, var4_2, var5_3, var2_4);
                                        var3_5 = var5_3 - var3_5;
                                        this.f(var1_1, var4_2, var3_5 - var2_4);
                                        if ((this.g(13) & 131072) == 0) break block7;
                                        var2_4 = var3_5 - var2_4 - 10;
                                        al.a(6, var4_2, var2_4, var1_1);
                                        this.e(var1_1, var4_2 - 12, var2_4);
                                        ** GOTO lbl11
                                        break;
                                    }
                                    break;
                                }
                            }
                            if (super.a(var1_1, var4_2, var5_3 - var2_4 - s.h, var5_3) == var4_2) break block9;
                            var3_5 = s.h;
                            ** GOTO lbl23
                        }
                        this.b = 1;
                        ** continue;
                    }
                    if (this.a == null) ** GOTO lbl11
                    this.e(var1_1, var4_2, var3_5 - var2_4 - 10);
                    ** continue;
                }
                var3_5 = 0;
                ** continue;
                break;
            }
        }
        var2_4 = 45;
        ** while (true)
    }

    @Override
    public int b() {
        return this.a(14);
    }

    public String b() {
        if (this.c == null) {
            z.a().a(1147, (af)new t(1), new an(this.a()));
            ac.a(true, false);
        }
        return this.c;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void b() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void b(int n2) {
        ((af)this.a.elementAt(5)).a(n2);
    }

    @Override
    public void b(Graphics graphics, int n2, int n3) {
        super.b(graphics, n2, n3);
        if (this.r() == 0 && this.a.a.size() == 0) {
            ay.a(this.a(), null);
        }
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

    @Override
    public int c() {
        return this.g(9);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c() {
        int n2;
        int n3;
        block7: {
            short s2;
            short s3;
            int n4;
            int n5;
            block6: {
                n5 = 75;
                n4 = 40;
                this.g(9);
                s3 = this.a(1);
                s2 = this.a(2);
                if (s3 != 75) break block6;
                n3 = n4;
                n2 = n5;
                if (s2 == 55) break block7;
            }
            if (s3 != 70) {
                n3 = s2;
                n2 = s3;
            } else {
                n3 = n4;
                n2 = n5;
                if (s2 != 48) {
                    n3 = s2;
                    n2 = s3;
                }
            }
        }
        this.d(n2, n3);
        this.a(0, -1);
    }

    @Override
    public void c(int n2) {
        ((af)this.a.elementAt(6)).a(n2);
    }

    @Override
    public int d() {
        return this.g(5);
    }

    public void d() {
        long l2 = System.currentTimeMillis();
        if (b == null || l2 - c > 60000L) {
            c = l2;
            String string = this.b;
            if (this.b != 0L) {
                int n2 = this.b.indexOf(":", this.b.indexOf(":") + 1);
                string = new StringBuffer().append(this.b.substring(0, n2 + 1)).append(al.a((this.b - l2) / 1000L).substring(0, 5)).append(this.b.substring(n2 + 1, this.b.length())).toString();
            }
            b = new r(150, 80, 1000, 128, 0);
            b.d();
            b.b(string);
            b.a(0, b.f() + 4);
        }
    }

    @Override
    public void d(int n2) {
        ((af)this.a.elementAt(7)).a(n2);
    }

    @Override
    public boolean d() {
        return ay.k.contains(this);
    }

    @Override
    public int e() {
        return this.g(6);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void e() {
        if (bl.b.a(this.a()) != null) {
            this.g(s.a[2]);
            return;
        }
        switch (this.c()) {
            default: {
                return;
            }
            case 0: {
                this.g(s.a[2]);
                return;
            }
            case 1: 
        }
        this.g(s.a[0]);
    }

    @Override
    public void e(int n2) {
        ((af)this.a.elementAt(8)).a(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void e(Graphics graphics, int n2, int n3) {
        int n4;
        switch (this.a) {
            default: {
                return;
            }
            case 8: {
                n4 = 5;
                break;
            }
            case 7: {
                n4 = 2;
                break;
            }
            case 4: 
            case 6: {
                n4 = 0;
                break;
            }
            case 3: 
            case 5: {
                n4 = 1;
                break;
            }
            case 2: {
                n4 = 3;
                break;
            }
            case 1: {
                n4 = 4;
            }
        }
        if (n4 == -1) return;
        al.a(n4, n2, n3, graphics);
    }

    @Override
    public int f() {
        return this.g(7);
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
        if (aa.a().a((int)this.d, (int)this.q, (int)this.r)) return;
        if (this.i != 0) {
            this.m();
            return;
        }
        if (this.f(2)) return;
        if ((this.b == null || ((Vector)((Object)this.b)).size() == 0) && al.a(30) == 0) {
            int n2;
            int n3;
            block6: {
                int n4;
                if (this.r() != 200) {
                    if (this.r() != 201) return;
                }
                if ((n4 = this.g(3)) == 0) return;
                byte by = (byte)this.a(1);
                byte by2 = (byte)this.a(2);
                int n5 = this.q + al.a(n4 * 2) - n4;
                int n6 = this.r + al.a(n4 * 2) - n4;
                int n7 = 0;
                do {
                    if (Math.abs(by2 - n6) <= n4 && Math.abs(by - n5) <= n4) {
                        n2 = n5;
                        n3 = n6;
                        if (!aa.a().a((int)this.d, n5, n6)) break block6;
                    }
                    n5 = this.q + al.a(n4 * 2) - n4;
                    n6 = this.r + al.a(n4 * 2) - n4;
                    n7 = n3 = n7 + 1;
                } while (n3 < 10);
                n3 = by2;
                n2 = by;
            }
            this.a((byte)n2, (byte)n3, (byte)-1);
            return;
        }
        this.d(-1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void f(Graphics graphics, int n2, int n3) {
        if (this.a == null) return;
        if (System.currentTimeMillis() - this.a >= (long)this.a.e) {
            this.a = null;
            return;
        }
        int n4 = n2 - (this.a.g >> 1);
        if (n4 <= 0) {
            n2 = 1;
        } else {
            n2 = n4;
            if (this.a.g + n4 > ac.a) {
                n2 = ac.a - this.a.g;
            }
        }
        this.a.b(n2, n3 - this.a.h);
        al.a(graphics, n2, (int)this.a.b, this.a.g, this.a.h, (int)ac.a, 0);
        this.a.a(graphics);
    }

    @Override
    public int g() {
        return this.g(8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void h() {
        if (this.k() != bl.c) {
            super.h();
            return;
        }
        this.f(1);
        this.e();
    }

    @Override
    protected void h(int n2) {
        ((af)this.a.elementAt(13)).a(n2);
    }

    @Override
    protected void i() {
        super.i();
        if (a != null && a.a() == this.a() && this.c() == 0) {
            w.a().a(3);
        }
    }

    @Override
    public int k() {
        return this.g(15);
    }

    @Override
    public int m() {
        return this.g(13);
    }

    public int r() {
        return this.a(10);
    }
}

