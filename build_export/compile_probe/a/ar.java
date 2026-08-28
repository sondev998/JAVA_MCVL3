/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.ac;
import a.al;
import a.aw;
import a.ay;
import a.bb;
import a.bc;
import a.bf;
import a.bg;
import a.g;
import a.m;
import a.s;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ar
extends g {
    private aw a;
    private bf a;
    private bg a;
    private boolean a;
    public String b = "";
    private byte c;
    private String c = 0;
    public int m = -1;
    public int n = 0;
    private int o = 0;
    private int p;

    public ar(String string, int n2, int n3) {
        super(0, 0, n3, -1);
        this.a();
        this.c = string;
        this.i = n2;
        if (a.stringWidth(this.c) <= this.g && (this.f & 1) != 0) {
            this.f |= 4;
        }
        this.b = (String)2;
    }

    public ar(String string, int n2, int n3, int n4, int n5) {
        super(n2, n3, n4, n5);
        this.a();
        this.f |= n4;
        this.c = string;
        if (a.stringWidth(this.c) <= this.g && (this.f & 1) != 0) {
            this.f |= 4;
        }
        this.b = (String)2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static g a(int n2, byte by, DataInputStream dataInputStream) {
        int n3 = 0;
        ar ar2 = new ar("", 0, 0, 0, -1);
        a.g.a(ar2, n2, by, dataInputStream);
        ar2.a(dataInputStream.readUTF());
        n2 = dataInputStream.readInt();
        byte by2 = dataInputStream.readByte();
        dataInputStream.readByte();
        if (n2 > 0) {
            ar2.a(new bf(n2, by2));
        }
        if (((by2 = dataInputStream.readByte()) & 1) != 0) {
            n2 = 1;
        } else {
            n2 = n3;
            if ((by2 & 2) != 0) {
                n2 = 2;
            }
        }
        ar2.a(ar.c(n2));
        ar2.a();
        return ar2;
    }

    public bf a() {
        return this.a;
    }

    public bg a() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public bg a(int n2, int n3, int n4, int n5) {
        n3 = n2 / 100000;
        this.a = null;
        if (n3 == 1 || n3 == 2) {
            n2 /= 10000;
            if (n4 == 1) {
                if (ay.a == null) return this.a;
                this.a = ay.a.a;
                return this.a;
            }
            this.a = bg.b(a.m.d(n2), 1);
            bg.b(this.a, n3, n2 % 10);
        } else {
            if (n3 == 4 || n3 == 3) {
                n4 = n2 % 100000 / 100 * 10000;
                this.a = n3 == 3 ? bg.b(n4, 1) : bg.b(n4, 0);
                if (this.a == null) return this.a;
                if (n3 == 3) {
                    this.a.a(bb.a(1, 0, this.a), 0);
                    return this.a;
                } else {
                    if (n3 != 4) return this.a;
                    if (this.a == null) return this.a;
                    String string = this.a.a(n2 * 1000 + 11);
                    if (string == null) return this.a;
                    this.a.a(Integer.parseInt(string), 0);
                }
                return this.a;
            }
            if (n3 == 8) {
                this.a = bb.a(n2, true, null);
            }
        }
        if (this.a == null) return this.a;
        this.a.a(bb.a(0, 0, this.a), 0);
        return this.a;
    }

    @Override
    public String a() {
        return this.c;
    }

    public void a(int n2) {
        this.c = (byte)n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(int n2, int n3, int n4, int n5) {
        if (this.b(n4, n5)) {
            if (this.a == null) return;
            this.a.a(0, this);
            return;
        }
        if (n3 != s.a[6]) {
            if (n3 != s.a[1]) return;
        }
        if (this.a == null) return;
        this.a.a(4, this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(bc bc2) {
        if (bc2 == null) {
            return;
        }
        this.a(bc2.a());
        this.b(bc2.a());
    }

    public void a(bf bf2) {
        this.a = bf2;
        if (bf2 != null) {
            this.g = bf2.c();
            this.h = bf2.d();
        }
        if (bf2 == null || bf2.a() == 5610000) {
            this.a = null;
        }
    }

    public void a(bf bf2, int n2) {
        bf2.b(n2);
        this.a(bf2);
    }

    public void a(bg bg2) {
        if (bg2 != null) {
            this.a = bg2;
        }
    }

    public void a(String string) {
        this.c = string;
        if (a.stringWidth(this.c) <= this.g && (this.f & 1) != 0) {
            this.f |= 4;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public void a(Graphics graphics) {
        reference var2_3;
        reference var8_5;
        int n2;
        block31: {
            void var3_11;
            void var5_26;
            int n3;
            block35: {
                block34: {
                    block32: {
                        block33: {
                            void var3_7;
                            int n4 = this.d();
                            if ((this.f & 0x10) != 0 && this.a == null && this.a == null) {
                                al.c(graphics, (int)this.a, (int)this.b, this.g, this.h, s.a);
                                n2 = 0;
                            } else {
                                n2 = ar.b((int)this.a);
                            }
                            var8_5 = this.b - n2;
                            var2_3 = this.a - n4;
                            if (this.h == 0) {
                                int n5 = s.h;
                            } else {
                                int n6 = this.h;
                            }
                            if (a.g.a((int)var8_5, (int)var3_7)) {
                                return;
                            }
                            if (this.m > -1) {
                                if (this.h > 10) {
                                    reference var3_9 = var8_5 + (this.h - 10) / 2;
                                    if (this.d == -1) {
                                        this.d = 13;
                                    }
                                    al.b(graphics, (int)(var2_3 + 4), (int)var3_9, this.m / 10 * (this.g - 8) / 100, this.d, this.b());
                                    al.b(graphics, (int)var2_3, (int)(var3_9 - 3), this.g, 12, this.b());
                                } else {
                                    ac.a(graphics, (int)var2_3, (int)this.b, this.g, this.h, this.m / 10, 100, s.a[this.m % 10], s.a[1]);
                                }
                            } else if ((this.f & 0x200) != 0) {
                                al.c(graphics, (int)var2_3, (int)var8_5, this.g, this.h, this.i);
                            }
                            if ((this.f & 0x40) != 0) {
                                al.a(graphics, (int)var2_3, (int)var8_5, this.g, this.h, true);
                            } else if ((this.f & 0x20) != 0) {
                                graphics.setColor(594215);
                                graphics.fillRect((int)var2_3, (int)var8_5, this.g, this.h);
                            } else if ((this.f & 0x400) == 0 && (this.f & 1) != 0 && this.a == null && this.a == null) {
                                al.d(graphics, (int)var2_3, (int)var8_5, this.g, this.h, this.b());
                            }
                            n3 = this.a != null ? this.a.b() : 0;
                            if ((this.c == null || this.c.equals("")) && this.a == null) break block32;
                            if (this.a != null) {
                                int n7 = this.a.a();
                            } else {
                                int n8 = a.stringWidth(this.c);
                            }
                            if ((this.f & 8) == 0) break block33;
                            if (var5_26 >= this.g) break block34;
                            int n9 = this.g - var5_26;
                            break block35;
                        }
                        if ((this.f & 4) == 0) break block34;
                        int n10 = this.g - var5_26 >> 1;
                        break block35;
                    }
                    if (this.a != null) {
                        if (this.o != 0) {
                            int n11 = (this.g - this.a.c()) / 2 + var2_3;
                        } else {
                            reference var3_20 = var2_3;
                        }
                        this.o = (this.h - this.a.d()) / 2;
                        break block31;
                    } else {
                        reference var3_21 = var2_3;
                    }
                    break block31;
                }
                boolean bl2 = false;
            }
            void var7_29 = var3_11 + var2_3 + n3;
            if ((this.f & 0x100) != 0) {
                reference var3_13;
                int n12 = n3 = var7_29 - n3 * 3 / 2;
                if (n3 < var2_3) {
                    var3_13 = var2_3;
                }
                n3 = var3_13;
                reference var3_14 = var3_13 + var5_26 + 2;
            } else {
                reference var3_22 = var2_3;
                n3 = var7_29;
            }
            if (this.a != null) {
                reference var5_27 = var8_5 + (this.h - s.h + al.a >> 1);
                this.a.a(graphics, n3, (int)var5_27, this.g, 0, false, 2, (int)var5_27);
            } else {
                if (var5_26 > this.g) {
                    --this.p;
                    if (this.p + var5_26 + n3 <= n3) {
                        this.p = this.g;
                    }
                }
                graphics.setClip(n3, (this.h - s.h + al.a >> 1) + var8_5, this.g, this.h);
                al.a(graphics, this.c, n3 + this.p, (int)(var8_5 + (this.h - s.h + al.a >> 1)), this.i, 0);
                al.b(graphics);
            }
        }
        if (this.a != null) {
            void var3_16;
            this.a.a(graphics, (int)var3_16, this.o + var8_5, this.c);
        }
        this.a(graphics, n2);
        if (this.n <= 0) return;
        al.a(graphics, (int)var2_3, this.h + var8_5, this.g, this.n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(Graphics graphics, int n2) {
        reference var3_6;
        if (this.a(graphics, n2)) {
            return;
        }
        if (this.a == null) return;
        aw aw2 = this.a;
        int n3 = this.g / 2;
        reference var3_5 = this.b + this.h - 10;
        if (this.a) {
            var3_6 = this.b + (this.h - this.a.g()) / 2 + this.a.g();
        }
        this.a.a((int)(aw2 + n3), (int)(var3_6 - n2), graphics);
        if (this.a) {
            if (!this.a) return;
            if (this.a.b < 2) return;
        }
        this.a.a(100);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2, boolean bl2) {
        bl2 = true;
        int n3 = this.m % 10;
        this.m += n2 * 10;
        if (this.m / 10 >= 100) {
            this.m = n3 + 1000;
            return bl2;
        }
        if (this.m >= 10) return false;
        this.m = n3;
        return bl2;
    }

    public boolean a(Graphics graphics, int n2) {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if ((this.f & 0x80) != 0) {
            if (this.b != -1) {
                al.a(graphics, (int)this.a, (int)(this.b + this.h - this.b), this.g, (int)this.b, this.g, 0);
            }
            bl3 = bl2;
            if (this.a != null) {
                bl3 = bl2;
                if (!this.a.a()) {
                    this.a = null;
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    public byte b() {
        return this.c;
    }

    public void b(int n2) {
        int n3 = 5;
        if ((n2 = (int)(bc.a(n2) % 100000L / 10000L)) < 5) {
            n2 = n3;
        }
        this.a = bg.b(2030000, 0);
        this.a.a(n2 - 5, 0);
        this.a.a(1, true);
        this.a = true;
    }

    public void b(bf bf2, int n2) {
        this.o = (short)n2;
        this.a(bf2);
    }

    public void b(String string) {
        this.a = aw.a(string, s.a.stringWidth(string), false, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(int n2, int n3) {
        if (!ac.a(n2, n3)) return false;
        if ((this.f & 1) == 0) return false;
        return true;
    }
}

