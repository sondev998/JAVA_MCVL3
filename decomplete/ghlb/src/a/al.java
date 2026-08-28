/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package a;

import a.Static;
import a.aa;
import a.ac;
import a.af;
import a.ag;
import a.an;
import a.ap;
import a.au;
import a.ay;
import a.b;
import a.bc;
import a.bf;
import a.bg;
import a.bl;
import a.j;
import a.m;
import a.s;
import a.x;
import a.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class al {
    public static byte a;
    public static int a;
    public static long a;
    public static bf a;
    public static x a;
    public static Random a;
    public static Image a;
    public static short a;
    public static boolean a;
    public static int[] a;
    public static bf[] a;
    public static int b;
    public static bf b;
    public static Image b;
    public static short b;
    public static int c;
    public static Image c;
    public static short c;
    public static final int d = 0;
    public static short d;
    public static final int e = 0;
    public static int f;
    public static int g;

    static {
        Static.regClass(8);
        al.cinitclone();
    }

    public static int a(int n2) {
        return (a.nextInt() << 1 >>> 1) % n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(int n2, int n3, int n4, int n5) {
        if (n4 >= n5) {
            return n3;
        }
        if (n4 <= 0) return n2;
        int n6 = n2 & 0xFF0000;
        int n7 = n2 & 0xFF00;
        return n6 + (((n3 & 0xFF0000) - n6) * n4 / n5 & 0xFF0000) | n7 + (((n3 & 0xFF00) - n7) * n4 / n5 & 0xFF00) | ((n3 & 0xFF) - (n2 &= 0xFF)) * n4 / n5 + n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(long l2, int n2) {
        if ((l2 = bc.a((int)l2) / 10000L % 10L) == 9L) {
            int n3 = s.a[5];
            if (n2 < 15) return n3;
            return s.a[6];
        }
        if (l2 == 8L) {
            return s.a[7];
        }
        if (l2 == 7L) {
            return s.a[4];
        }
        if (l2 == 6L) {
            return s.a[3];
        }
        if (l2 != 5L) return s.a[10];
        return s.a[0];
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(Font font, String object) {
        int n2 = 0;
        int n3 = font.stringWidth((String)object);
        int n4 = font.getHeight();
        font = Image.createImage((int)n3, (int)n4);
        Graphics graphics = font.getGraphics();
        graphics.setFont(s.a);
        al.c(graphics, 0, 0, n3, n4, 0xFFFFFF);
        graphics.setColor(0);
        graphics.drawString((String)object, 0, 0, 0);
        object = new int[n3 * n4];
        font.getRGB((int[])object, 0, n3, 0, 0, n3, n4);
        int n5 = ((Object)object).length;
        int n6 = n5 - 1;
        while (true) {
            n4 = n6;
            if (n2 >= n5) break;
            if (object[n2] != -1) {
                n4 = n6;
                break;
            }
            ++n2;
        }
        while (true) {
            if (n4 <= 0 || n4 >= n5 || object[n4] != -1) {
                System.gc();
                s.i = (n4 - n2) / n3;
                return (n5 - n4) / n3 - n2 / n3;
            }
            --n4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(Graphics graphics, int n2, int n3) {
        if (n3 == 0) return au.a().a(graphics, (int)ac.a, n3);
        au.a().a(graphics, ac.a - n2, 42);
        return -1;
    }

    private static int a(Graphics graphics, int n2, int n3, int n4) {
        al.b(graphics);
        int n5 = al.a(graphics, n2, n4);
        if (n5 != -1) {
            n4 = n5;
        }
        a.a(graphics, n3, n4, 0);
        al.a(graphics, new StringBuffer().append("").append(bl.m).toString(), n3 + 15, n4, s.a[2], 0);
        b.a(graphics, (n2 >> 1) + n3, n4, 0);
        al.a(graphics, new StringBuffer().append("").append(bl.n).toString(), (n2 >> 1) + 15 + n3, n4, s.a[8], 0);
        return n4 + 14;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static int a(Graphics graphics, Vector object) {
        void var2_3;
        block10: {
            void var2_6;
            void var2_5;
            block9: {
                if (a == 0 || object == null || ((Vector)object).size() == 0) {
                    int n2 = al.a(graphics, 57, ac.a - 57, 0);
                    return (int)var2_3;
                }
                graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
                graphics.translate(ac.a - 57, 0);
                int n3 = ((Vector)object).size();
                if (a == 3) break block9;
                if (a != 0) {
                    int n4;
                    int n5;
                    object = aa.a();
                    reference var2_7 = ((aa)object).h / aa.c * 2;
                    reference var5_20 = ((aa)object).i / aa.d * 2;
                    int n6 = a.getWidth() - 48;
                    int n7 = a.getHeight() - 39;
                    if (var2_7 > n6) {
                        n5 = n6;
                    }
                    reference var3_14 = var5_20;
                    if (var5_20 > n7) {
                        n4 = n7;
                    }
                    graphics.setClip(5, 14, 48, 39);
                    graphics.drawImage(a, 5 - n5, 14 - n4, 0);
                    Enumeration enumeration = m.a.elements();
                    while (enumeration.hasMoreElements()) {
                        object = (af[])enumeration.nextElement();
                        int n8 = ((af)object[1]).b() + 5 - n5;
                        n7 = ((af)object[2]).b() + 14 - n4;
                        if (n8 < 5 || n8 > 53 || n7 < 14 || n7 > 53) continue;
                        al.b(graphics, ((af)object[0]).b(), n8, n7);
                    }
                }
                break block10;
            }
            al.a(graphics, 5, 14, 48, 39, 48, 0);
            --var2_5;
            while (var2_6 >= 0) {
                af[] afArray = (af[])((Vector)object).elementAt((int)var2_6);
                int n9 = afArray[1].b() + 5 - 2;
                int n10 = afArray[2].b() + 14 - 2;
                if (n9 >= 5 && n9 <= 53 && n10 >= 14 && n10 <= 53) {
                    al.b(graphics, afArray[3].b(), n9, n10);
                }
                --var2_6;
            }
        }
        if (a != 0) {
            al.b(graphics);
            ap.a().b.a(graphics, 0, 0, 0);
        }
        object = aa.a().a;
        al.a(graphics, 5, 59, 48, 16, 48, 0);
        int n11 = s.a.stringWidth((String)object);
        if ((f -= 2) < 5 - n11) {
            f = 53;
        }
        graphics.setClip(5, 59, 48, 16);
        al.a(graphics, (String)object, f, 59, 0xFFFFFF, 0);
        ap.a.a(graphics);
        ap.b.a(graphics);
        graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
        int n12 = al.a(graphics, 57, ac.a - 57, 90);
        return (int)var2_3;
    }

    public static int a(byte[] byArray, int n2) {
        return (byArray[n2] & 0xFF) << 24 | (byArray[n2 + 1] & 0xFF) << 16 | (byArray[n2 + 2] & 0xFF) << 8 | byArray[n2 + 3] & 0xFF;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(byte[] byArray, int n2, int n3) {
        int n4;
        int n5;
        if (a == null) {
            a = new int[256];
            for (n5 = 0; n5 < 256; ++n5) {
                n4 = n5;
                for (int i2 = 0; i2 < 8; ++i2) {
                    if ((n4 & 1) == 1) {
                        n4 = n4 >>> 1 ^ 0xEDB88320;
                        continue;
                    }
                    n4 >>>= 1;
                }
                al.a[n5] = n4;
            }
        }
        n4 = -1;
        n5 = n2;
        while (n5 < n3 + n2) {
            n4 = n4 >>> 8 ^ a[(byArray[n5] ^ n4) & 0xFF];
            ++n5;
        }
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static InputStream a(String object) {
        try {
            Object object2 = new Object();
            return object2.getClass().getResourceAsStream((String)object);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static String a(int n2) {
        StringBuffer stringBuffer = new StringBuffer();
        int n3 = n2 / 3600;
        int n4 = n2 % 3600 / 60;
        n2 = n2 % 3600 % 60;
        if (n3 < 10) {
            stringBuffer.append(0);
        }
        stringBuffer.append(n3);
        stringBuffer.append(":");
        if (n4 < 10) {
            stringBuffer.append(0);
        }
        stringBuffer.append(n4);
        stringBuffer.append(":");
        if (n2 < 10) {
            stringBuffer.append(0);
        }
        stringBuffer.append(n2);
        return stringBuffer.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(long l2) {
        if (l2 <= 0L) {
            return "00:00:00";
        }
        CharSequence charSequence = al.a(null, "");
        int n2 = 3600;
        int n3 = 0;
        while (n3 < 3) {
            int n4 = (int)l2 / n2;
            l2 %= (long)n2;
            n2 /= 60;
            if (n4 < 10) {
                al.a((StringBuffer)charSequence, "0");
            }
            al.a((StringBuffer)charSequence, (long)n4);
            if (n3 != 2) {
                al.a((StringBuffer)charSequence, ":");
            }
            ++n3;
        }
        return ((StringBuffer)charSequence).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(long l2, int n2) {
        if ((l2 = bc.a((int)l2) / 10000L % 10L) == 9L) {
            String string = new StringBuffer().append("*").append("5").toString();
            if (n2 < 15) return string;
            return "*6";
        }
        if (l2 == 8L) {
            return new StringBuffer().append("*").append("7").toString();
        }
        if (l2 == 7L) {
            return new StringBuffer().append("*").append("4").toString();
        }
        if (l2 == 6L) {
            return new StringBuffer().append("*").append("3").toString();
        }
        if (l2 != 5L) return new StringBuffer().append("*").append("1").toString();
        return new StringBuffer().append("*").append("0").toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(InputStream object, int n2) {
        if (n2 <= 0) {
            return "";
        }
        try {
            byte[] byArray = new byte[n2];
            ((InputStream)object).read(byArray, 0, n2);
            return new String(byArray, "UTF-8");
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static String a(String string, String string2, String string3) {
        StringBuffer stringBuffer = al.a(null, "");
        while (true) {
            int n2;
            if ((n2 = string.indexOf(string2)) == -1) {
                if (string.length() > 0) {
                    al.a(stringBuffer, string);
                }
                return stringBuffer.toString();
            }
            al.a(stringBuffer, string.substring(0, n2));
            al.a(stringBuffer, string3);
            string = string.substring(n2 + string2.length(), string.length());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String a(String string, Vector vector) {
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = 0;
        int n3 = 0;
        while (true) {
            int n4;
            block13: {
                block14: {
                    block11: {
                        block12: {
                            if (n3 >= string.length()) {
                                return stringBuffer.toString();
                            }
                            if (string.charAt(n3) != '$') break block11;
                            stringBuffer.append(string.substring(n2, n3));
                            if (string.charAt(n3 + 1) != 'n') break block12;
                            stringBuffer.append(ay.a.a());
                            n4 = n3 + 2;
                            n2 = n3;
                            n3 = n4;
                            break block13;
                        }
                        if (string.charAt(n3 + 1) != 's' && string.charAt(n3 + 1) != 'm') break block14;
                        n2 = n3;
                        while (string.charAt(n2) != '>') {
                            ++n2;
                        }
                        String[] stringArray = al.a(string.substring(n3 + 3, n2), ",");
                        if (string.charAt(n3 + 1) == 's') {
                            if (m.b(ay.a.g(3)) == 1) {
                                stringBuffer.append(stringArray[0]);
                            } else {
                                stringBuffer.append(stringArray[1]);
                            }
                        } else if (vector != null) {
                            af[] afArray = new af[4];
                            for (n3 = 0; n3 < 3; ++n3) {
                                afArray[n3] = new an(Integer.parseInt(stringArray[n3]));
                            }
                            afArray[3] = stringArray.length < 4 ? new j("ABC") : new j(stringArray[3]);
                            vector.addElement(afArray);
                        }
                        n3 = n2 + 1;
                        break block13;
                    }
                    if (n3 == string.length() - 1) {
                        stringBuffer.append(string.substring(n2, string.length()));
                    }
                    n4 = n3;
                    n3 = n2;
                    n2 = n4;
                    break block13;
                }
                n2 = n3;
            }
            n4 = n2 + 1;
            n2 = n3;
            n3 = n4;
        }
    }

    public static StringBuffer a(StringBuffer stringBuffer, long l2) {
        StringBuffer stringBuffer2 = stringBuffer;
        if (stringBuffer == null) {
            stringBuffer2 = new StringBuffer();
        }
        stringBuffer2.append(l2);
        return stringBuffer2;
    }

    public static StringBuffer a(StringBuffer stringBuffer, String string) {
        StringBuffer stringBuffer2 = stringBuffer;
        if (stringBuffer == null) {
            stringBuffer2 = new StringBuffer();
        }
        stringBuffer2.append(string);
        return stringBuffer2;
    }

    public static Vector a(int n2, int n3, int n4, Vector vector, Vector vector2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            vector2.addElement(al.a(n3, i2 * n3 + n4, vector));
        }
        return vector2;
    }

    public static Vector a(int n2, int n3, Vector vector, Vector vector2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            vector2.addElement(vector.elementAt(i2 + n3));
        }
        return vector2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Image a(int n2, int n3, int n4) {
        void var8_5;
        int[] nArray = new int[n2 * n3];
        int n5 = (int)Math.sqrt(n2 * n2 + n3 * n3);
        for (int i2 = n3 - 1; i2 >= 0; --i2) {
            for (int i3 = n2 - 1; i3 >= 0; --i3) {
                int n6;
                int n7;
                block8: {
                    n6 = n7 = (int)Math.sqrt((i3 - n2) * (i3 - n2) + (i2 - n3) * (i2 - n3));
                    if (n7 <= n5) break block8;
                    n6 = n5;
                }
                n6 = n7 = n6 * 255 * 13 / (n5 * 10);
                if (n7 > 255) {
                    n6 = 255;
                }
                nArray[i2 * n2 + i3] = n6 << 24 | 0xFFFFFF & n4;
                continue;
            }
        }
        try {
            Image image = Image.createRGBImage((int[])nArray, (int)n2, (int)n3, (boolean)true);
            return var8_5;
        }
        catch (Exception exception) {
            return var8_5;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static final Image a(int n2, int n3, int n4, int n5) {
        int n6;
        int n7 = 0;
        if (n4 < 0) {
            n6 = 0;
        } else {
            n6 = n4;
            if (n4 > 10) {
                n6 = 10;
            }
        }
        int[] nArray = new int[n2 * n3];
        int n8 = n6 * 255 / 10 << 24 | 0xFFFFFF;
        n6 = n7;
        n4 = n8;
        if (n5 != -1) {
            n4 = n8 & (0xFF000000 | n5);
            n6 = n7;
        }
        while (n6 < nArray.length) {
            nArray[n6] = -1;
            nArray[n6] = nArray[n6] & n4;
            ++n6;
        }
        return Image.createRGBImage((int[])nArray, (int)n2, (int)n3, (boolean)true);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static Image a(Image object, int n2, int n3) {
        void var5_14;
        int n4;
        int n5;
        void var5_11;
        int n6;
        void var0_1;
        void var2_5;
        int n7;
        int n8 = object.getWidth();
        int n9 = object.getHeight();
        if (n8 == n7 && n9 == var2_5) {
            return var0_1;
        }
        int[] nArray = new int[n8 * n9];
        object.getRGB(nArray, 0, n8, 0, 0, n8, n9);
        int[] nArray2 = new int[var2_5];
        int[] nArray3 = new int[n7];
        if (n9 > var2_5) {
            int n10 = n9;
        } else {
            void var5_12 = var2_5;
        }
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        for (n6 = 0; n6 <= var5_11; ++n6) {
            nArray2[n12] = n13;
            int n15 = n14 + n9;
            n5 = n11 + var2_5;
            n4 = n13;
            n14 = n15;
            if (n15 > var5_11) {
                n14 = n15 - var5_11;
                n4 = n13 + 1;
            }
            n11 = n12;
            n13 = n5;
            if (n5 > var5_11) {
                n13 = n5 - var5_11;
                n11 = n12 + 1;
            }
            n12 = n11;
            n11 = n13;
            n13 = n4;
        }
        if (n8 > n7) {
            int n16 = n8;
        } else {
            void var5_15 = n7;
        }
        n11 = 0;
        n12 = 0;
        n13 = 0;
        n14 = 0;
        for (n6 = 0; n6 <= var5_14; ++n6) {
            nArray3[n12] = (short)n13;
            n5 = n14 + n8;
            n9 = n11 + n7;
            n4 = n13;
            n14 = n5;
            if (n5 > var5_14) {
                n14 = n5 - var5_14;
                n4 = n13 + 1;
            }
            n11 = n12;
            n13 = n9;
            if (n9 > var5_14) {
                n13 = n9 - var5_14;
                n11 = n12 + 1;
            }
            n12 = n11;
            n11 = n13;
            n13 = n4;
        }
        int[] nArray4 = new int[n7 * var2_5];
        n6 = 0;
        int n17 = -1;
        n13 = 0;
        n14 = 0;
        while (true) {
            int n18;
            if (n14 >= var2_5) {
                System.gc();
                Image image = Image.createRGBImage((int[])nArray4, (int)n7, (int)var2_5, (boolean)true);
                return var0_1;
            }
            if (n18 == nArray2[n14]) {
                System.arraycopy(nArray4, n13 - n7, nArray4, n13, n7);
            } else {
                for (n12 = 0; n12 < n7; ++n12) {
                    nArray4[n13 + n12] = nArray[nArray3[n12] + n6];
                }
                n6 += (nArray2[n14] - n18) * n8;
            }
            n18 = nArray2[n14];
            n13 += n7;
            ++n14;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final Image a(byte[] byArray, int n2, int n3, int n4) {
        if (n4 < 0 || n4 > 10) {
            // empty if block
        }
        int n5 = n2 * 2;
        int[] nArray = new int[n3 * 2 * n5];
        n4 = (byArray.length - 1) * 8;
        while (true) {
            if (n4 < 0) {
                a = Image.createRGBImage((int[])nArray, (int)(n2 * 2), (int)(n3 * 2), (boolean)true);
                return a;
            }
            int n6 = n4 / n2 * 2 * n5 + n4 % n2 * 2;
            int n7 = (byArray[n4 / 8] & ag.a[n4 % 8]) == 0 ? -5592406 : -16777216;
            nArray[n6] = n7;
            nArray[n6 + 1] = n7;
            nArray[n6 + n5] = n7;
            nArray[n6 + n5 + 1] = n7;
            --n4;
        }
    }

    public static short a(byte[] byArray, int n2) {
        return (short)((byArray[n2] & 0xFF) << 8 | byArray[n2 + 1] & 0xFF);
    }

    public static void a() {
        if (a == null) {
            a = new bf[15];
            a = new bf[17];
            al.a[1] = new bf(4610912, 0);
            al.a[2] = new bf(6300000);
            al.a[3] = new bf(4411910);
            al.a[4] = new bf(6120000);
            al.a[5] = new bf(6110000);
            al.a[10] = new bf(5058806);
            al.a[11] = new bf(5068806);
            al.a[12] = new bf(5048812);
            al.a[13] = new bf(5088806);
            al.a[14] = new bf(5078806);
            al.a[16] = new bf(40026);
        }
    }

    public static void a(int n2, int n3, int n4, Graphics graphics) {
        ay.e.c(n2);
        ay.e.a(n3, n4, graphics);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(int n2, String string, String string2, String string3, String string4) {
        block5: {
            if (string4 != null) {
                boolean bl2 = string4.equals("");
                if (!bl2) break block5;
            }
            string4 = "test";
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            string2 = stringBuffer.append(n2).append("|").append(string).append("|").append(string2).append("|").append(0).append("|").append(0).append("|").append(string3).append("|").append(string4).toString();
            a.b.a(s.b, 1, string2);
            a.b.a(s.c, string, string2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void a(bf bf2, int n2, int n3, int n4, Graphics graphics) {
        if (n2 != -1) {
            bf2.b(n2);
        }
        bf2.a(graphics, n3, n4, 0);
    }

    public static void a(bg bg2, int n2, int n3, int n4, Graphics graphics) {
        if (n2 != -1) {
            bg2.c(n2);
        }
        bg2.a(n3, n4, graphics);
        bg2.a(-1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(String string, String string2) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            string = stringBuffer.append(string).append("|").append(string2).toString();
            a.b.a(s.d, 1, string);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void a(Graphics graphics) {
        a = (short)graphics.getClipX();
        b = (short)graphics.getClipY();
        c = (short)graphics.getClipWidth();
        d = (short)graphics.getClipHeight();
    }

    public static void a(Graphics graphics, int n2, int n3) {
        a[1].b(12);
        a[1].a(graphics, n2 + 30, n3, 0);
        a[1].a(graphics, n2 - 39, n3, 3);
        a[1].b(10);
        a[1].a(graphics, n2 - 29, n3, 0);
        a[1].b(11);
        a[1].a(graphics, n2 + 20, n3, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(Graphics graphics, int n2, int n3, int n4) {
        if (n3 >= n4) {
            return;
        }
        n4 = n3 * n3 / n4;
        graphics.setColor(0xFFFFFF);
        if (n2 > 0) {
            a[3].a(graphics, (ac.a - 18) / 2, n3 + 27, 0);
        }
        if (n4 + n2 < n3) {
            a[3].a(graphics, (ac.a - 18) / 2, n3 + 39, 3);
        }
        graphics.setClip(0, 0, (int)ac.a, (int)ac.b);
    }

    public static void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        a.a(n4, 0);
        a.b(n2, n3 - 7);
        a.a(n5);
        a.a(graphics);
    }

    public static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        graphics.setColor(n6);
        graphics.drawRect(n2, n3, n4, n5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        Image image;
        block14: {
            Image image2;
            block13: {
                if (!a) {
                    al.c(graphics, n2, n3, n4, n5, 0);
                    return;
                }
                al.a(graphics);
                graphics.setClip(n2, n3, n4, n5);
                if (n7 == 3948871 || n7 == 0) {
                    n7 = 3948871;
                    image2 = b;
                } else {
                    if (n7 != 11318711) return;
                    image2 = c;
                }
                if (image2 == null) break block13;
                image = image2;
                if (image2.getWidth() >= n6) break block14;
            }
            image2 = al.a(n6, 5, 7, n7);
            if (n7 == 3948871) {
                b = image2;
                image = image2;
            } else {
                image = image2;
                if (n7 == 11318711) {
                    c = image2;
                    image = image2;
                }
            }
        }
        n6 = 0;
        while (true) {
            if (n6 >= n5) {
                al.c(graphics);
                return;
            }
            try {
                bg.a(graphics, image, 0, 0, n4, image.getHeight(), 0, n2, n3 + n6, 20);
            }
            catch (Exception exception) {}
            n6 += 5;
        }
    }

    public static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        al.c(graphics, n2 + 1, n3 + 1, n4 - 2, n5 - 2, n6);
        graphics.setColor(n7);
        graphics.drawLine(n2, n3, n2 + n4 - 2, n3);
        graphics.drawLine(n2, n3 + 1, n2, n3 + n5 - 2);
        graphics.setColor(n8);
        graphics.drawLine(n2 + n4 - 1, n3 + 1, n2 + n4 - 1, n3 + n5 - 1);
        graphics.drawLine(n2 + 1, n3 + n5 - 1, n2 + n4 - 1, n3 + n5 - 1);
    }

    public static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl2) {
        if (bl2) {
            al.c(graphics, n2 + 1, n3 + 1, n4, n5 - 1, n9);
        }
        if (n7 == 0) {
            n7 = 1;
        }
        n9 = n6;
        if (n6 >= n7) {
            n9 = n7;
        }
        al.c(graphics, n2 + 1, n3 + 1, n4 * n9 / n7, n5 - 1, n8);
        if (bl2) {
            graphics.setColor(0);
            graphics.drawRect(n2, n3, n4 + 1, n5);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(Graphics graphics, int n2, int n3, int n4, int n5, boolean bl2) {
        al.a(graphics, n2, n3, n4, n5, n4, 0);
        if (bl2) {
            return;
        }
        graphics.setColor(4865084);
        graphics.drawRect(n2, n3, n4, n5);
        graphics.setColor(2367511);
        graphics.drawRect(n2 + 1, n3 + 1, n4 - 2, n5 - 2);
        graphics.setColor(8215100);
        graphics.drawRect(n2 + 2, n3 + 2, n4 - 4, n5 - 4);
        graphics.setColor(0);
        graphics.drawRect(n2 + 3, n3 + 3, n4 - 6, n5 - 6);
    }

    public static void a(Graphics graphics, String string, int n2, int n3, int n4) {
        graphics.setColor(n4);
        graphics.drawString(string, n2, n3, 0);
    }

    public static void a(Graphics graphics, String string, int n2, int n3, int n4, int n5) {
        if (n5 != n4) {
            graphics.setColor(n5);
            graphics.drawString(string, n2 + 1, n3 + 1, 0);
        }
        graphics.setColor(n4);
        graphics.drawString(string, n2, n3, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(Graphics graphics, String string, int n2, int n3, int n4, int n5, int n6) {
        if (string == null || string.equals("")) {
            return;
        }
        al.a(graphics);
        graphics.setColor(6724497);
        graphics.fillRect(n2, n3, n4, 24);
        a[5].a(graphics, n2, n3, 0);
        a[5].a(graphics, n2 + n4 - 77, n3, 2);
        a[4].a(graphics, (n4 - 118 >> 1) + n2, n3, 0);
        al.a(graphics, string, n2 + (n4 - s.a.stringWidth(string)) / 2, n3 + (24 - s.h + a) / 2, 0xFFFFFF, 0);
        al.c(graphics);
    }

    public static void a(byte[] byArray, int n2, int n3) {
        byArray[n2] = (byte)((0xFF000000 & n3) >> 24);
        byArray[n2 + 1] = (byte)((0xFF0000 & n3) >> 16);
        byArray[n2 + 2] = (byte)((0xFF00 & n3) >> 8);
        byArray[n2 + 3] = (byte)(n3 & 0xFF);
    }

    public static void a(byte[] byArray, int n2, int n3, byte by) {
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = i2 + n2;
            byArray[n4] = (byte)(byArray[n4] ^ by);
        }
    }

    public static void a(byte[] byArray, int n2, short s2) {
        byArray[n2] = (byte)((0xFF00 & s2) >> 8);
        byArray[n2 + 1] = (byte)(s2 & 0xFF);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2) {
        if (n2 == s.a[2]) return true;
        if (n2 == s.a[3]) return true;
        if (n2 == s.a[4]) return true;
        if (n2 != s.a[5]) return false;
        return true;
    }

    public static boolean a(int n2, int n3) {
        int n4 = ac.a >> 1;
        return al.a(n2, n3, n4 - 40, n4 - 5, ac.b - 20, (int)ac.b);
    }

    public static boolean a(int n2, int n3, int n4, int n5) {
        return al.a(n2, n3, 0, n4, ac.b - n5, (int)ac.b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 <= n4) return false;
        if (n2 >= n5) return false;
        if (n3 <= n6) return false;
        if (n3 >= n7) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(String string) {
        int n2;
        int n3;
        boolean bl2 = false;
        try {
            n3 = string.length();
            n2 = 0;
        }
        catch (Exception exception) {
            return bl2;
        }
        while (n2 < n3) {
            block4: {
                char c2 = string.charAt(n2);
                if (c2 == ' ' || c2 >= '0' && c2 <= '9' || c2 >= 'A' && c2 <= 'Z') break block4;
                boolean bl3 = bl2;
                if (c2 < 'a') return bl3;
                if (c2 <= 'z') break block4;
                return bl2;
            }
            ++n2;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static byte[] a(InputStream object, int n2) {
        byte[] byArray;
        try {
            byArray = new byte[n2];
            ((InputStream)object).read(byArray, 0, n2);
        }
        catch (Exception exception) {
            return null;
        }
        return byArray;
    }

    /*
     * Unable to fully structure code
     */
    public static byte[] a(InputStream var0, boolean var1_2, int var2_3, byte[] var3_4) {
        var5_6 = 0;
        var4_7 = 0;
        var8_8 = null;
        if (var0 == null && var3_4 == null) {
            var0 = var8_8;
lbl6:
            // 5 sources

            return var0;
        }
        var7_9 = var3_4;
        if (var3_4 == null) {
            var7_9 = new byte[var2_3];
            var0.read(var7_9);
        }
lbl15:
        // 4 sources

        while (true) {
            block22: {
                block23: {
                    block24: {
                        block20: {
                            if (var1_2) {
                                var2_3 = 0;
                                while (true) {
                                    var6_10 = var7_9.length;
                                    if (var2_3 >= var6_10) break;
                                    var7_9[var2_3] = (byte)(var7_9[var2_3] ^ 15);
                                    ++var2_3;
                                }
                            }
                            if (var0 == null) break block23;
                            var2_3 = var7_9.length;
                            if (var2_3 != 1) break block20;
                            var2_3 = var7_9[0];
lbl30:
                            // 4 sources

                            while (true) {
                                var3_4 = new byte[var2_3];
                                while (var4_7 < var2_3) {
                                    block21: {
                                        var3_4[var4_7] = (byte)var0.read();
                                        if (!var1_2) break block21;
                                        var3_4[var4_7] = (byte)(var3_4[var4_7] ^ 15);
                                    }
                                    ++var4_7;
                                }
                                ** GOTO lbl51
                                break;
                            }
                        }
                        if (var7_9.length != 2) break block24;
                        var2_3 = al.a(var7_9, 0);
                        ** GOTO lbl30
                    }
                    if (var7_9.length != 4) break block22;
                    var2_3 = al.a(var7_9, 0);
                    ** GOTO lbl30
lbl51:
                    // 1 sources

                    var0.close();
                    var0 = var3_4;
                    ** GOTO lbl6
                }
                var0 = var8_8;
                if (var7_9 == null) ** GOTO lbl6
                var4_7 = var7_9.length;
                var3_4 = new byte[var4_7];
                var2_3 = var5_6;
                while (true) {
                    var0 = var3_4;
                    if (var2_3 >= var4_7) ** GOTO lbl6
                    var3_4[var2_3] = var7_9[var2_3];
                    if (var1_2) {
                        var3_4[var2_3] = (byte)(var3_4[var2_3] ^ 15);
                    }
                    ++var2_3;
                }
            }
            var2_3 = 0;
            ** continue;
            break;
        }
        {
            catch (IOException var3_5) {
                ** continue;
            }
        }
        catch (Exception var0_1) {
            var0 = var8_8;
            ** continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static byte[] a(String object, boolean bl2, int n2) {
        Object var3_4 = null;
        object = new StringBuffer().append(s.c[0]).append((String)object).toString();
        try {
            return al.a(al.a((String)object), bl2, n2, null);
        }
        catch (Exception exception) {
            return var3_4;
        }
    }

    public static af[] a(int n2, int n3, z z2) {
        af[] afArray = new af[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            afArray[i2] = (af)z2.a.elementAt(i2 + n3);
        }
        return afArray;
    }

    public static af[] a(int n2, int n3, Vector vector) {
        af[] afArray = new af[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            afArray[i2] = (af)vector.elementAt(i2 + n3);
        }
        return afArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String[] a(String stringArray, String stringArray2) {
        int n2;
        int n3 = 0;
        if (stringArray.equals("")) {
            stringArray2 = new String[]{stringArray};
            return stringArray2;
        }
        Vector<Object> vector = new Vector<Object>();
        int n4 = stringArray2.length();
        Object object = stringArray;
        if (stringArray.length() >= n4) {
            object = stringArray;
            if (stringArray.substring(0, n4).equals(stringArray2)) {
                object = stringArray.substring(n4, stringArray.length());
            }
        }
        while ((n2 = ((String)object).indexOf((String)stringArray2)) != -1) {
            vector.addElement(((String)object).substring(0, n2));
            object = ((String)object).substring(n2 + n4, ((String)object).length());
        }
        if (((String)object).length() != 0) {
            vector.addElement(object);
        }
        n2 = vector.size();
        stringArray = new String[n2];
        while (n3 < n2) {
            vector.elementAt(n3);
            stringArray[n3] = (String)vector.elementAt(n3);
            ++n3;
        }
        vector.removeAllElements();
        return stringArray;
    }

    public static int b(int n2) {
        int n3 = n2;
        if (n2 < 0) {
            n3 = n2 + 256;
        }
        return n3;
    }

    public static void b(Graphics graphics) {
        graphics.setClip(0, 0, (int)ac.a, (int)ac.b);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void b(Graphics graphics, int n2, int n3, int n4) {
        graphics.setClip(n3 - 3, n4 - 4, 8, 9);
        switch (n2) {
            default: {
                switch (n2) {
                    case 7: {
                        x.a[1].a(graphics, n3 - 112 - 3, n3 - 4, 0);
                        return;
                    }
                    case 2: {
                        x.a[1].a(graphics, n3 - 105 - 3, n4 - 4, 0);
                        return;
                    }
                    case 4: {
                        x.a[1].a(graphics, n3 - 98 - 3, n4 - 4, 0);
                        return;
                    }
                    case 3: {
                        x.a[1].a(graphics, n3 - 91 - 3, n4 - 4, 0);
                        return;
                    }
                }
                return;
            }
            case 0: {
                graphics.setColor(s.a[0]);
                break;
            }
            case -1: {
                graphics.setColor(s.a[6]);
                graphics.fillRect(n3, n4, 4, 4);
                return;
            }
            case -2: {
                g = n2 = g + 1;
                if (n2 > 999999) {
                    g = 0;
                }
                if (g % 4 == 0) return;
                graphics.setColor(s.a[3]);
                graphics.fillRect(n3, n4, 4, 4);
                return;
            }
            case -3: {
                graphics.setColor(s.a[3]);
                break;
            }
            case -4: {
                if (a == 1) return;
                graphics.setColor(s.a[4]);
                break;
            }
            case -5: {
                if (a == 1) return;
                graphics.setColor(s.a[7]);
                break;
            }
            case -6: {
                if (a == 1) return;
                graphics.setColor(s.a[2]);
            }
        }
        if (a == 3) {
            graphics.fillRect(n3, n4, 2, 2);
            return;
        }
        graphics.fillRect(n3, n4, 3, 3);
    }

    public static void b(Graphics graphics, int n2, int n3, int n4, int n5) {
        n5 = n3 + n5 - b;
        int n6 = n5 + (b - s.h + a) / 2;
        n3 = (c - s.a.stringWidth(s.a[1])) / 2;
        al.d(graphics, n2, n5, c, b, false);
        al.d(graphics, n2 + n4 - c, n5, n6, b, false);
        graphics.setColor(0xFFFFFF);
        graphics.drawString(s.a[6], n2 + n3, n5 + (b - s.h + a) / 2, 0);
        graphics.drawString(s.a[1], n2 + n4 - c + n3, n6, 0);
    }

    public static void b(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        graphics.setClip(n2 - 2, n3 - 2, n4 + 4, n5 + 4);
        graphics.setColor(7385022);
        graphics.drawRect(n2 - 2, n3 - 2, n4 + 3, n5 + 3);
        graphics.drawRect(n2, n3, n4 - 1, n5 - 1);
        graphics.setColor(11655903);
        graphics.drawRect(n2 - 1, n3 - 1, n4 + 1, n5 + 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(Graphics graphics, int n2, int n3, int n4, int n5, boolean bl2) {
        if (bl2) {
            a[n5].b(1);
        } else {
            a[n5].b(0);
        }
        al.d(graphics, n5, n2, n3, n4, 26);
    }

    public static boolean b(int n2, int n3) {
        int n4 = ac.a >> 1;
        return al.a(n2, n3, n4 + 5, n4 + 40, ac.b - 20, (int)ac.b);
    }

    public static boolean b(int n2, int n3, int n4, int n5) {
        return al.a(n2, n3, ac.a - n4, (int)ac.a, ac.b - n5, (int)ac.b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n4 >= n2) return false;
        if (n2 >= n4 + n6) return false;
        if (n5 >= n3) return false;
        if (n3 >= n5 + n7) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(String string) {
        boolean bl2 = false;
        try {
            int n2 = string.indexOf("@");
            boolean bl3 = bl2;
            if (n2 == -1) return bl3;
            if (!al.a(string.substring(0, n2))) {
                return bl2;
            }
            if (string.endsWith(".com")) {
                string = string.substring(n2 + 1, string.length() - 4);
            } else {
                bl3 = bl2;
                if (!string.endsWith(".cn")) return bl3;
                string = string.substring(n2 + 1, string.length() - 3);
            }
            bl3 = bl2;
            if (!al.a(string)) return bl3;
            return true;
        }
        catch (Exception exception) {
            return bl2;
        }
    }

    public static int c(int n2) {
        int n3 = n2;
        if (n2 < 0) {
            n3 = n2 + 65536;
        }
        return n3;
    }

    public static void c(Graphics graphics) {
        graphics.setClip((int)a, (int)b, (int)c, (int)d);
    }

    public static void c(Graphics graphics, int n2, int n3, int n4, int n5) {
        graphics.setColor(6005396);
        graphics.fillRect(n2, n3, n4, 2);
        graphics.setColor(5149571);
        graphics.fillRect(n2, n3 + 2, n4, (n5 >>= 1) - 2);
        graphics.setColor(4622201);
        graphics.drawLine(n2, n3 + n5, n2 + n4, n3 + n5);
        graphics.setColor(3502174);
        graphics.fillRect(n2, n3 + n5 + 1, n4, n5 - 1);
    }

    public static void c(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        graphics.setClip(n2, n3, n4 + 1, n5 + 1);
        graphics.setColor(n6);
        graphics.fillRect(n2, n3, n4, n5);
        graphics.setClip(0, 0, (int)ac.a, (int)ac.b);
    }

    public static void c(Graphics graphics, int n2, int n3, int n4, int n5, boolean bl2) {
        if (bl2) {
            graphics.setColor(3234384);
            graphics.fillRect(n2 + 1, n3 + 1, n4 - 1, n5 - 1);
            graphics.setColor(1913133);
            graphics.fillRect(n2 + 1, n3 + 1, 2, n5 - 1);
            graphics.fillRect(n2 + 1, n3 + 1, n4 - 1, 2);
            graphics.setColor(4356718);
            graphics.drawRect(n2, n3, n4, n5);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c(String string) {
        block7: {
            block6: {
                boolean bl2 = false;
                try {
                    if (string.length() != 0) break block6;
                }
                catch (Exception exception) {
                    return bl2;
                }
                return bl2;
            }
            if (string.length() <= 18) break block7;
            Long.parseLong(string.substring(0, 17));
            Long.parseLong(string.substring(18, string.length()));
            return true;
        }
        Long.parseLong(string);
        return true;
    }

    public static void cinitclone() {
        a = System.currentTimeMillis();
        a = s.h;
        b = 25;
        c = 50;
        b = null;
        c = null;
        a = true;
        a = null;
        a = null;
        a = new Random();
        a = new x(16, 7, 2, 8, 0);
        f = 5;
        a = (byte)2;
        a = new bf(6000);
        b = new bf(6001);
        g = 0;
        d = ac.a * 10000 / 176;
        e = ac.b * 10000 / 208;
    }

    public static int d(int n2) {
        return 1 << n2;
    }

    public static void d(Graphics graphics, int n2, int n3, int n4, int n5) {
        graphics.setClip(n2, n3, n4 + 1, n5 + 1);
        al.a(graphics, n2, n3, n4, n5, 0xFFFFFF);
        graphics.setClip(0, 0, (int)ac.a, (int)ac.b);
    }

    private static void d(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        int n7 = n5 / 2 + 1;
        al.a(graphics);
        graphics.setClip(n3, n4, n7, n6);
        a[n2].a(graphics, n3, n4, 0);
        graphics.setClip(n3 + n7, n4, n7, n6);
        a[n2].a(graphics, n7 + (n3 + n7) - a[n2].b(), n4, 2);
        n7 = a[n2].b();
        int n8 = n5 - n7 * 2;
        if (n8 > 0) {
            int n9 = a[n2].d();
            graphics.setClip(n3 + n7, n4, n8 + 5, n6);
            n6 = n7 - 11;
            for (n5 = 0; n5 < n8; n5 += n6) {
                a[n2].a(graphics, 11, 0, n6, n9, 0, n3 + n7 + n5, n4);
            }
        }
        al.b(graphics);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void d(Graphics graphics, int n2, int n3, int n4, int n5, boolean bl2) {
        if (bl2) {
            al.a(graphics, n2, n3, n4, n5, n4, 11318711);
        } else {
            al.a(graphics, n2, n3, n4, n5, n4, 3948871);
        }
        graphics.setColor(3101011);
        graphics.drawRect(n2, n3, n4, n5);
        graphics.setColor(9413278);
        graphics.drawRect(n2 + 1, n3 + 1, n4 - 2, n5 - 2);
        graphics.setColor(3623243);
        graphics.drawRect(n2 + 2, n3 + 2, n4 - 4, n5 - 4);
        graphics.setColor(0x8B8B8B);
        graphics.drawRect(n2 + 3, n3 + 3, n4 - 6, n5 - 6);
    }
}

