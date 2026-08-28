/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Static;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aq {
    private static final int[] a;
    private static final int[] b;
    private static final int[] c;
    private static final int[] d;
    private static final int[] e;
    private int a;
    private byte[] a;
    private int b;
    private int c;

    static {
        Static.regClass(10);
        aq.cinitclone();
    }

    public aq(byte[] byArray) {
        this.a = byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final int a(byte[] byArray, int n2) {
        int n3;
        if (this.c == 0) {
            n3 = this.a;
            this.a = n3 + 1;
            this.b = n3 = byArray[n3] & 0xFF;
        } else {
            n3 = this.b >> this.c;
        }
        int n4 = 8 - this.c;
        while (true) {
            if (n4 >= n2) {
                this.c = this.c + n2 & 7;
                return (1 << n2) - 1 & n3;
            }
            int n5 = this.a;
            this.a = n5 + 1;
            this.b = byArray[n5] & 0xFF;
            n3 |= this.b << n4;
            n4 += 8;
        }
    }

    private static final int a(byte[] byArray, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        for (int i2 = n2; i2 < n2 + n3; ++i2) {
            n4 |= (byArray[i2] & 0xFF) << n5;
            n5 += 8;
        }
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final int a(byte[] byArray, int[] nArray) {
        int n2 = nArray[0];
        while (n2 >= 0) {
            if (this.c == 0) {
                int n3 = this.a;
                this.a = n3 + 1;
                this.b = byArray[n3] & 0xFF;
            }
            n2 = (this.b & 1 << this.c) == 0 ? nArray[n2 >> 16] : nArray[n2 & 0xFFFF];
            this.c = this.c + 1 & 7;
        }
        return n2 & 0xFFFF;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private final byte[] a(byte[] var1_1, int var2_2, int var3_3) {
        this.a = var2_2;
        var10_4 = new byte[var3_3];
        var2_2 = 0;
        this.c = 0;
        this.b = 0;
        block0: while (true) {
            block17: {
                var6_7 = this.a(var1_1, 1);
                var3_3 = this.a(var1_1, 2);
                if (var3_3 != 0) break block17;
                this.c = 0;
                var3_3 = this.a(var1_1, 16);
                this.a(var1_1, 16);
                System.arraycopy(var1_1, this.a, var10_4, var2_2, var3_3);
                this.a += var3_3;
                var2_2 += var3_3;
                ** GOTO lbl57
            }
            if (var3_3 == 2) {
                var7_8 = this.a(var1_1, 5) + 257;
                var5_6 = this.a(var1_1, 5) + 1;
                var4_5 = this.a(var1_1, 4);
                var8_9 /* !! */  = new byte[19];
                for (var3_3 = 0; var3_3 < var4_5 + 4; ++var3_3) {
                    var8_9 /* !! */ [aq.e[var3_3]] = (byte)this.a(var1_1, 3);
                }
                var9_10 /* !! */  = aq.a(var8_9 /* !! */ , 18);
                var8_9 /* !! */  = (byte[])aq.a(this.a(var1_1, var9_10 /* !! */ , var7_8), var7_8 - 1);
                var9_10 /* !! */  = aq.a(this.a(var1_1, var9_10 /* !! */ , var5_6), var5_6 - 1);
            } else {
                var8_9 /* !! */  = new byte[288];
                var3_3 = 144;
                while (--var3_3 >= 0) {
                    var8_9 /* !! */ [var3_3] = 8;
                }
                var3_3 = 256;
                while (--var3_3 >= 144) {
                    var8_9 /* !! */ [var3_3] = 9;
                }
                var3_3 = 280;
                while (--var3_3 >= 256) {
                    var8_9 /* !! */ [var3_3] = 7;
                }
                var3_3 = 288;
                while (--var3_3 >= 280) {
                    var8_9 /* !! */ [var3_3] = 8;
                }
                var8_9 /* !! */  = (byte[])aq.a(var8_9 /* !! */ , 287);
                var9_10 /* !! */  = new byte[32];
                var3_3 = var9_10 /* !! */ .length;
                while (--var3_3 >= 0) {
                    var9_10 /* !! */ [var3_3] = 5;
                }
                var9_10 /* !! */  = aq.a((byte[])var9_10 /* !! */ , 31);
            }
            while (true) {
                block18: {
                    if ((var3_3 = this.a(var1_1, var8_9 /* !! */ )) != 256) break block18;
lbl57:
                    // 2 sources

                    if (var6_7 == 0) continue block0;
                    return var10_4;
                }
                if (var3_3 > 256) {
                    var4_5 = var3_3 - 257;
                    var3_3 = aq.b[var4_5];
                    if ((var4_5 = aq.a[var4_5]) > 0) {
                        var3_3 += this.a(var1_1, var4_5);
                    }
                    var4_5 = this.a(var1_1, var9_10 /* !! */ );
                    var5_6 = aq.d[var4_5];
                    var7_8 = aq.c[var4_5];
                    var4_5 = var5_6;
                    if (var7_8 > 0) {
                        var4_5 = var5_6 + this.a(var1_1, var7_8);
                    }
                    var5_6 = var2_2 - var4_5;
                    while (var4_5 < var3_3) {
                        System.arraycopy(var10_4, var5_6, var10_4, var2_2, var4_5);
                        var2_2 += var4_5;
                        var3_3 -= var4_5;
                        var4_5 <<= 1;
                    }
                    System.arraycopy(var10_4, var5_6, var10_4, var2_2, var3_3);
                    var2_2 += var3_3;
                    continue;
                }
                var10_4[var2_2] = (byte)var3_3;
                ++var2_2;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final byte[] a(byte[] byArray, int[] nArray, int n2) {
        byte[] byArray2 = new byte[n2];
        int n3 = 0;
        int n4 = 0;
        block0: while (n4 < n2) {
            int n5 = this.a(byArray, nArray);
            if (n5 >= 16) {
                if (n5 == 16) {
                    n5 = this.a(byArray, 2) + 3;
                } else {
                    n5 = n5 == 17 ? this.a(byArray, 3) + 3 : this.a(byArray, 7) + 11;
                    n3 = 0;
                }
                while (true) {
                    if (n5 <= 0) continue block0;
                    byArray2[n4] = (byte)n3;
                    --n5;
                    ++n4;
                }
            }
            byArray2[n4] = (byte)n5;
            ++n4;
            n3 = n5;
        }
        return byArray2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int[] a() {
        if (aq.a(this.a, 0, 4) != 67324752) {
            return null;
        }
        int n2 = aq.a(this.a, 8, 2);
        int n3 = aq.a(this.a, 18, 4);
        int n4 = aq.a(this.a, 22, 4);
        int n5 = aq.a(this.a, 26, 2);
        int n6 = aq.a(this.a, 28, 2);
        new String(this.a, 30, n5);
        if (n4 == 0) {
            n4 = 10000;
        }
        int n7 = n3;
        if (n3 != 0) return new int[]{n5 + n6 + 30, n7, n4, n2};
        n7 = this.a.length;
        return new int[]{n5 + n6 + 30, n7, n4, n2};
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static final int[] a(byte[] byArray, int n2) {
        int n3;
        int[] nArray = new int[17];
        for (byte by : byArray) {
            nArray[by] = nArray[by] + 1;
        }
        nArray[0] = 0;
        int[] nArray2 = new int[17];
        int n4 = 0;
        for (n3 = 1; n3 <= 16; ++n3) {
            nArray2[n3] = n4 = n4 + nArray[n3 - 1] << 1;
        }
        nArray = new int[(n2 << 1) + 16];
        boolean bl2 = false;
        n3 = 1;
        void var4_7;
        while (var4_7 <= n2) {
            int n5 = byArray[var4_7];
            n4 = n3;
            if (n5 != 0) {
                int n6 = nArray2[n5];
                nArray2[n5] = n6 + 1;
                --n5;
                n4 = 0;
                while (n5 >= 0) {
                    int n7;
                    if ((1 << n5 & n6) == 0) {
                        n7 = nArray[n4] >> 16;
                        if (n7 == 0) {
                            nArray[n4] = nArray[n4] | n3 << 16;
                            n4 = n3 + 1;
                        } else {
                            n4 = n3;
                            n3 = n7;
                        }
                    } else {
                        n7 = 0xFFFF & nArray[n4];
                        if (n7 == 0) {
                            nArray[n4] = nArray[n4] | n3;
                            n4 = n3 + 1;
                        } else {
                            n4 = n3;
                            n3 = n7;
                        }
                    }
                    --n5;
                    n7 = n3;
                    n3 = n4;
                    n4 = n7;
                }
                nArray[n4] = Integer.MIN_VALUE | var4_7;
                n4 = n3;
            }
            ++var4_7;
            n3 = n4;
        }
        return nArray;
    }

    public static void cinitclone() {
        a = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 99, 99};
        b = new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0};
        c = new int[]{0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};
        d = new int[]{1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577};
        e = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final byte[] a() {
        byte[] byArray = null;
        int[] nArray = this.a();
        if (nArray == null) {
            return byArray;
        }
        if (nArray[1] == 0) {
            return new byte[0];
        }
        if (nArray[3] == 0) {
            byArray = new byte[nArray[2]];
            System.arraycopy(this.a, nArray[0], byArray, 0, nArray[2]);
            return byArray;
        }
        if (nArray[3] != 8) return byArray;
        return this.a(this.a, nArray[0], nArray[2]);
    }
}

