/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
package chen;

import chen.chen;
import javax.microedition.lcdui.Image;
import lib.MIDlet;
import lib.Stack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class a {
    private static int a = chen.d.getBestImageWidth(1);
    private static int b = chen.d.getBestImageHeight(1);
    private static Image b;
    public String a;
    public Image a;
    private String b;
    private String c;
    private String d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (a <= 5) {
            a = 15;
        }
        if (b <= 5) {
            b = 15;
        }
        try {
            b = Image.createImage((String)"/chen/mid.png");
            return;
        }
        catch (Throwable throwable) {
            b = Image.createImage((int)a, (int)b);
            return;
        }
    }

    a() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a(String string) {
        void var11_6;
        a a2 = new a();
        int n2 = string.indexOf(44);
        int n3 = n2 + 1;
        a2.a = string.substring(0, n2).trim();
        n2 = string.indexOf(44, n3);
        int n4 = n2 + 1;
        try {
            Image image = Image.createImage((String)string.substring(n3, n2).trim());
        }
        catch (Exception exception) {
            Image image = b;
        }
        int n5 = var11_6.getWidth();
        int n6 = var11_6.getHeight();
        n3 = a;
        int n7 = b;
        int[] nArray = new int[n5 * n6];
        var11_6.getRGB(nArray, 0, n5, 0, 0, n5, n6);
        float f2 = (float)n6 / (float)n7;
        float f3 = n3 == 0 ? f2 : (float)n5 / (float)n3;
        float f4 = n3 == 0 ? (float)n5 / f3 : (float)n3;
        int n8 = (int)f4;
        int[] nArray2 = new int[n6 * n8];
        for (n3 = 0; n3 < n6; ++n3) {
            for (n2 = 0; n2 < n8; ++n2) {
                nArray2[n3 * n8 + n2] = nArray[n5 * n3 + (int)((float)n2 * f3)];
            }
        }
        nArray = new int[n8 * n7];
        n3 = 0;
        while (true) {
            if (n3 >= n8) {
                a2.a = Image.createRGBImage((int[])nArray, (int)n8, (int)n7, (boolean)true);
                n3 = string.indexOf(44, n4);
                a2.b = string.substring(n4, n3).trim();
                a2.d = new StringBuffer().append(a2.b.charAt(0)).append(".Static").toString();
                a2.c = string.substring(n3 + 1).trim();
                return a2;
            }
            for (n2 = 0; n2 < n7; ++n2) {
                nArray[n8 * n2 + n3] = nArray2[(int)((float)n2 * f2) * n8 + n3];
            }
            ++n3;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static Image a(Image var0) {
        block5: {
            var6_1 = var0.getWidth();
            var4_2 = var0.getHeight();
            var8_3 = new int[var6_1 * var4_2];
            var0.getRGB(var8_3, 0, var6_1, 0, 0, var6_1, var4_2);
            var5_4 = var6_1 / 3;
            var7_5 = var4_2 / 3;
            var2_6 = var4_2 - var7_5;
            var1_7 = 1;
            while (var1_7 < var7_5 - 2) {
                for (var3_8 = var6_1 - var5_4; var3_8 < var1_7 + var6_1 - var5_4; ++var3_8) {
                    var8_3[var6_1 * var2_6 + var3_8] = -16711936;
                }
                var1_7 += 2;
                ++var2_6;
            }
            break block5;
            while (true) {
                var1_7 -= 2;
                ++var2_6;
                break;
            }
        }
        if (var1_7 > 0) {
            var3_8 = var6_1 - var5_4;
            while (true) {
                if (var3_8 >= var1_7 + var6_1 - var5_4) ** continue;
                var8_3[var6_1 * var2_6 + var3_8] = -16711936;
                ++var3_8;
            }
        }
        return Image.createRGBImage((int[])var8_3, (int)var6_1, (int)var4_2, (boolean)true);
    }

    public static void a(MIDlet mIDlet) {
        if (mIDlet.stack != null) {
            mIDlet.stack.clear();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final MIDlet a() {
        Object object;
        chen.nowmf = this.c;
        try {
            object = (Stack)Class.forName(this.d).newInstance();
            ((Stack)object).clear();
            ((Stack)object).cinitclone();
        }
        catch (Throwable throwable) {
            object = null;
        }
        try {
            MIDlet mIDlet = (MIDlet)Class.forName(this.b).newInstance();
            mIDlet.stack = object;
            return mIDlet;
        }
        catch (Throwable throwable) {
            chen.showError(throwable);
            return null;
        }
    }
}

