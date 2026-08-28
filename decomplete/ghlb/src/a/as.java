/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.al;
import java.io.InputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class as {
    private int a;
    private InputStream a;
    private int b;
    private int c;

    public as(String string) {
        this.a = al.a(string);
        this.a();
    }

    /*
     * Unable to fully structure code
     */
    private int a(byte var1_1) {
        block12: {
            block11: {
                block10: {
                    block9: {
                        block8: {
                            var2_2 = 0;
                            var3_3 = 0;
                            var4_4 = var1_1 & 192;
                            if ((var1_1 & 32) != 0) break block8;
                            var1_1 = (byte)(var1_1 & 63);
lbl6:
                            // 2 sources

                            while (var4_4 == 0) {
                                var1_1 = var1_1;
lbl8:
                                // 6 sources

                                while (true) {
                                    this.c -= this.a((int)var1_1);
                                    return var1_1;
                                }
                            }
                            break block9;
                        }
                        var1_1 = (byte)(var1_1 | 192);
                        ** GOTO lbl6
                    }
                    if (var4_4 != 64) break block10;
                    var2_2 = var1_1 << 8;
                    var1_1 = (byte)var2_2;
                    try {
                        var2_2 = (short)(var2_2 | (byte)this.a.read() & 255);
                    }
                    catch (Exception var5_5) {
                        ** continue;
                    }
                    var1_1 = (byte)var2_2;
                    ** GOTO lbl8
                }
                if (var4_4 != 128) break block11;
                var2_2 = var1_1;
                while (true) {
                    var1_1 = (byte)var2_2;
                    if (var3_3 >= 3) ** GOTO lbl8
                    var1_1 = (byte)(var2_2 <<= 8);
                    var2_2 |= (byte)this.a.read() & 255;
                    ++var3_3;
                    continue;
                    break;
                }
            }
            if (var4_4 != 192) break block12;
            var3_3 = var2_2;
            var2_2 = var1_1;
            while (true) {
                var1_1 = (byte)var2_2;
                if (var3_3 >= 4) ** GOTO lbl8
                var1_1 = (byte)(var2_2 <<= 8);
                var4_4 = this.a.read();
                var2_2 |= (byte)var4_4 & 255;
                ++var3_3;
            }
        }
        var1_1 = 0;
        ** GOTO lbl8
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a() {
        try {
            this.a = this.a((byte)this.a.read());
            this.c = 0;
            this.b = 0;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a() {
        if (this.c <= 0) {
            return -1;
        }
        int n2 = 0;
        try {
            return this.a((byte)this.a.read());
        }
        catch (Exception exception) {
            return n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(int n2) {
        if (n2 <= 31 && n2 >= -32) {
            return 1;
        }
        if (n2 <= 8191 && n2 >= -8192) {
            return 2;
        }
        if (n2 <= 0x1FFFFFFF && n2 >= -536870912) {
            return 4;
        }
        if (n2 > Integer.MAX_VALUE) return 0;
        if (n2 < Integer.MIN_VALUE) return 0;
        return 5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Object a() {
        byte by;
        block6: {
            Integer n2 = null;
            if (this.c <= 0) {
                return n2;
            }
            try {
                by = (byte)this.a.read();
                if ((by & 0xC0) != 192) break block6;
            }
            catch (Exception exception) {
                return n2;
            }
            short s2 = (short)(this.a.read() | (by & 0x3F) << 8);
            this.c -= s2 + 2;
            String string = al.a(this.a, (int)s2);
            return string;
        }
        Integer n3 = new Integer(this.a(by));
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        if (this.a != null) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b() {
        if (this.b >= this.a) {
            return false;
        }
        if (this.c > 0) return true;
        ++this.b;
        try {
            this.c = this.a((byte)this.a.read());
        }
        catch (Exception exception) {
            return true;
        }
        return true;
    }
}

