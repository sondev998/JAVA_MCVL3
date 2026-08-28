/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package a;

import a.Static;
import a.aa;
import a.bg;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class bd {
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    private int a;
    protected Graphics a;
    public Image a;
    private int b;
    public int h;
    public int i;
    protected int j;
    protected int k;
    protected int l;
    protected int m;

    static {
        Static.regClass(16);
        bd.cinitclone();
    }

    public bd(int n2, int n3, int n4, int n5) {
        f = n2;
        g = n3;
        this.a = Image.createImage((int)(n4 * 2 + n2), (int)(n5 * 2 + n3));
        this.a = this.a.getGraphics();
        this.l = this.a.getWidth();
        this.m = this.a.getHeight();
        this.a.setColor(5858931);
        this.a.fillRect(0, 0, n4 * 2 + n2, n5 * 2 + n3);
    }

    private void a(int n2, int n3, int n4, int n5, int n6, boolean bl2, int n7, int n8, int n9, int n10) {
        this.a(this.a, 1, n2, n3, this.l - n2, this.m - n3, n4, n5, n6, bl2, n7, n8, n9, n10);
        if (n2 > 0) {
            this.a(this.a, 2, 0, n3, n2, this.m - n3, n4 - this.l, n5, n6, bl2, n7, n8, n9, n10);
        }
        if (n3 > 0) {
            this.a(this.a, 4, n2, 0, this.l - n2, n3, n4, n5 - this.m, n6, bl2, n7, n8, n9, n10);
        }
        if (n2 > 0 && n3 > 0) {
            this.a(this.a, 8, 0, 0, n2, n3, n4 - this.l, n5 - this.m, n6, bl2, n7, n8, n9, n10);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(Graphics graphics, Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n4 <= 0 || n5 <= 0) {
            return;
        }
        if (n4 > f) {
            n4 = f;
        }
        if (n5 > g) {
            n5 = g;
        }
        try {
            bg.a(graphics, image, n2, n3, n4, n5, n6, n7, n8, n9);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void cinitclone() {
    }

    public final void a(Graphics graphics, int n2, int n3) {
        int n4 = this.h % this.l;
        int n5 = this.i % this.m;
        int n6 = this.l - n4;
        int n7 = this.m - n5;
        int n8 = f - n6;
        int n9 = g - n7;
        this.a(graphics, this.a, n4, n5, n6, n7, 0, n2, n3, 0);
        this.a(graphics, this.a, 0, n5, n8, n7, 0, n6 + n2, n3, 0);
        this.a(graphics, this.a, n4, 0, n6, n9, 0, n2, n7 + n3, 0);
        this.a(graphics, this.a, 0, 0, n8, n9, 0, n6 + n2, n7 + n3, 0);
    }

    protected abstract void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14);

    /*
     * Enabled aggressive block sorting
     */
    protected void a(boolean bl2, int n2) {
        if (!bl2 && this.a == this.j && this.b == this.k) {
            return;
        }
        aa.a().a(bl2, aa.a().a);
        int n3 = this.j % this.l;
        int n4 = this.k % this.m;
        int n5 = this.a % this.l;
        int n6 = this.b % this.m;
        int n7 = this.j - this.a;
        int n8 = this.k - this.b;
        int n9 = n5 + n7 % this.l;
        int n10 = n6 + n8 % this.m;
        if (n9 < this.l && n9 >= 0 && n10 < this.m && n10 >= 0 || bl2) {
            this.a(n3, n4, 0, 0, n2, bl2, n7, n8, n5, n6);
        } else if (n9 >= this.l) {
            this.a(this.l, n4, this.l, 0, n2, bl2, this.l - n5, n8, n5, n6);
            this.a(n3, n4, 0, 0, n2, bl2, n9 - this.l, n8, 0, n6);
        } else if (n9 < 0) {
            this.a(0, n4, -this.l, 0, n2, bl2, -n5, n8, n5, n6);
            this.a(n3, n4, 0, 0, n2, bl2, n9, n8, this.l, n6);
        } else if (n10 >= this.m) {
            this.a(n3, this.m, 0, this.m, n2, bl2, n7, this.m - n6, n5, n6);
            this.a(n3, n4, 0, 0, n2, bl2, n7, n10 - this.m, n5, 0);
        } else if (n10 < 0) {
            this.a(n3, 0, 0, -this.m, n2, bl2, n7, -n6, n5, n6);
            this.a(n3, n4, 0, 0, n2, bl2, n7, n10, n5, this.m);
        }
        this.a = this.j;
        this.b = this.k;
    }

    public void b(int n2, int n3, boolean bl2) {
        this.c(n2 - this.j, n3 - this.k, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(int n2, int n3, boolean bl2) {
        int n4;
        int n5;
        block18: {
            block19: {
                block17: {
                    block15: {
                        block16: {
                            block14: {
                                n5 = 0;
                                if (bl2 || f < Math.abs(n2) || g < Math.abs(n3)) {
                                    this.j += n2;
                                    this.k += n3;
                                    this.a(true, 0);
                                    return;
                                }
                                if (n2 >= 0) break block14;
                                if (this.j - 16 < 0) {
                                    n4 = -this.j;
                                    break block15;
                                } else {
                                    n4 = n2;
                                    if (16 > -n2) {
                                        n4 = -16;
                                    }
                                }
                                break block15;
                            }
                            if (n2 <= 32) break block16;
                            if (this.j + 16 > d - this.l) {
                                n4 = d - this.l - this.j;
                                break block15;
                            } else {
                                n4 = n2;
                                if (n2 - 32 < 16) {
                                    n4 = 16;
                                }
                            }
                            break block15;
                        }
                        n4 = 0;
                    }
                    if (n3 >= 0) break block17;
                    if (this.k - 16 < 0) {
                        n2 = -this.k;
                        break block18;
                    } else {
                        n2 = n3;
                        if (16 > -n3) {
                            n2 = -16;
                        }
                    }
                    break block18;
                }
                if (n3 <= 32) break block19;
                if (this.k + 16 > e - this.m) {
                    n2 = e - this.m - this.k;
                    break block18;
                } else {
                    n2 = n3;
                    if (n3 - 32 < 16) {
                        n2 = 16;
                    }
                }
                break block18;
            }
            n2 = 0;
        }
        this.j += n4;
        this.k += n2;
        if (n4 != 0) {
            n3 = n4 > 0 ? 1 : 3;
            this.a(bl2, n3);
        }
        if (n2 == 0) return;
        n2 = n2 > 0 ? n5 : 2;
        this.a(bl2, n2);
    }
}

