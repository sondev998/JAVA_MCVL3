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
import a.ac;
import a.ag;
import a.al;
import a.ap;
import a.aq;
import a.b;
import a.be;
import a.bg;
import a.f;
import a.p;
import a.s;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bf {
    public static p a;
    public static Vector a;
    public static byte[] a;
    public static Image[] a;
    public static byte[] b;
    public static int c;
    public static byte[] c;
    public static int d;
    private byte a;
    public int a;
    private Image a;
    private short a = null;
    public int b;

    static {
        Static.regClass(18);
        bf.cinitclone();
    }

    public bf(int n2) {
        this.a = (byte)32;
        this.a = n2;
        this.a = (short)-1;
        this.b = this.c();
    }

    public bf(int n2, int n3) {
        this.a = (byte)64;
        this.a = n2;
        this.a = (short)n3;
        this.b = this.c();
    }

    public static byte a(int n2) {
        n2 = bf.b(n2);
        return a[n2 + (c + d) + 2];
    }

    private static int a(int n2) {
        return n2 % 10000 / 100;
    }

    private static int a(int n2, int n3, int n4) {
        int n5;
        int n6 = n5 = bf.a().length + 25 + (n2 / 2 * 3 + 8 + 4);
        if (n3 != -1) {
            n6 = n5 + (n2 / 2 + 8 + 4);
        }
        return n6 + (n4 + 8 + 4) + bf.b().length;
    }

    private static int a(int n2, int n3, int n4, int n5, byte[] byArray, int n6) {
        al.a(byArray, n6, 13);
        al.a(byArray, n6 += 4, 1229472850);
        al.a(byArray, n6 += 4, n2);
        n2 = n6 + 4;
        al.a(byArray, n2, n3);
        byArray[n2 += 4] = (byte)n4;
        byArray[++n2] = 3;
        byArray[++n2] = 0;
        byArray[++n2] = 0;
        byArray[++n2] = 0;
        al.a(byArray, ++n2, n5);
        return n2 + 4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int a(int n2, int n3, int n4, byte[] byArray, int n5) {
        int n6 = 0;
        if (n2 == -1) {
            return n6;
        }
        al.a(byArray, n5, n3);
        al.a(byArray, n5 += 4, 1951551059);
        n6 = n5 + 4;
        n5 = 0;
        while (true) {
            if (n5 >= n3) {
                al.a(byArray, n6, n4);
                return n6 + 4;
            }
            byArray[n6] = n5 == n2 ? 0 : -1;
            ++n6;
            ++n5;
        }
    }

    private static int a(byte[] byArray, int n2, int n3, byte[] byArray2, int n4, int n5, int n6, int n7) {
        al.a(byArray2, n4, n2 / 2 * 3);
        al.a(byArray2, n4 += 4, 1347179589);
        n4 += 4;
        int n8 = n2 / 2;
        for (n2 = 0; n2 < n8; ++n2) {
            short s2 = al.a(byArray, n2 * 2);
            byArray2[n4] = (byte)((s2 >> 11) * 255 / 31 | n5);
            byArray2[n4 + 1] = (byte)((s2 >> 5 & 0x3F) * 255 / 63 | n6);
            byArray2[n4 + 2] = (byte)((s2 & 0x1F) * 255 / 31 | n7);
            n4 += 3;
        }
        al.a(byArray2, n4, n3);
        return n4 + 4;
    }

    private static int a(byte[] byArray, int n2, byte[] byArray2, int n3) {
        al.a(byArray2, n3, n2 - 4);
        al.a(byArray2, n3 += 4, 1229209940);
        System.arraycopy(byArray, byArray.length - n2, byArray2, n3 += 4, n2);
        return n3 + n2;
    }

    public static Image a(int n2) {
        Image image = (Image)a.a(n2);
        if (image == null && be.a((boolean)true).a.a(n2) == null) {
            be.a((boolean)true).a.a(n2, new Integer(n2));
        }
        return image;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Image a(int n2, Image image) {
        if (n2 == -2) {
            return image;
        }
        if (n2 == 0) {
            return null;
        }
        Image image2 = image;
        if (image != null) return image2;
        return bf.c(n2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Image a(int n2, boolean bl2, boolean bl3, int n3, int n4, int n5) {
        byte[] byArray;
        Object object;
        Object object2;
        Object object3;
        block20: {
            int n6;
            block19: {
                int n7;
                object3 = (Image)a.a(n2);
                if (object3 != null) {
                    return object3;
                }
                if (n2 == 5010000) {
                    try {
                        object2 = a.b.a(s.l, 1);
                        object = object3;
                        if (object2 != null) {
                            object = Image.createImage((byte[])object2, (int)0, (int)((byte[])object2).length);
                        }
                    }
                    catch (Exception exception) {
                        object = object3;
                    }
                    object3 = object;
                    if (object != null) return object3;
                }
                if (b == null) {
                    b = al.a("rimg.o", false, 2);
                    c = al.a("mimg.o", false, 2);
                }
                object3 = n2 < 1000 ? (Object)c : (Object)b;
                n6 = n7 = 0;
                if (bl2) {
                    object = aa.g;
                    object3 = object;
                    n6 = n7;
                    if (object == null) {
                        object3 = bg.c;
                        n6 = n7;
                    }
                }
                while (true) {
                    if (n6 >= ((Image)object3).length || al.a((byte[])object3, n6) == n2) {
                        if (n6 < ((Image)object3).length) break;
                        object3 = null;
                        object = new StringBuffer();
                        object2 = ((StringBuffer)object).append(s.c[0]).append("p").toString();
                        object = new StringBuffer();
                        object2 = al.a(((StringBuffer)object).append((String)object2).append(n2).append(s.d[9]).toString());
                        object = object3;
                        if (object2 != null) {
                            object = Image.createImage((InputStream)object2);
                        }
                    }
                    n6 += 7;
                }
                try {
                    byArray = new byte[22];
                    if (bl2) break block19;
                    object = "rp";
                    if (n2 < 1000) {
                        object = "mp";
                    }
                    object2 = new StringBuffer;
                    object2();
                    object = al.a(object2.append(s.c[2]).append((String)object).append(al.b((int)object3[n6 + 4])).append(".p").toString());
                    ((InputStream)object).skip(al.a((byte[])object3, n6 + 5));
                    ((InputStream)object).read(byArray);
                    object3 = al.a((InputStream)object, bf.b(al.a(byArray, 20)));
                    break block20;
                }
                catch (Exception exception) {
                    return null;
                }
            }
            object2 = aa.e;
            object = object2;
            if (object2 == null) {
                object = bg.a;
            }
            n2 = al.a((byte[])object3, n6 + 5);
            System.arraycopy(object, n2, byArray, 0, byArray.length);
            object3 = new byte[bf.b(al.a(byArray, 20))];
            System.arraycopy(object, n2 + byArray.length, object3, 0, ((Image)object3).length);
            object = null;
        }
        n2 = bf.a(bf.b(al.a(byArray, 18)), byArray[5], bf.b(al.a(byArray, 20)) - bf.b(al.a(byArray, 18)) - 4);
        object2 = new byte[n2];
        bf.a(bf.b(al.a(byArray, 0)), bf.b(al.a(byArray, 2)), byArray[4], byArray[5], (byte[])object3, bf.b(al.a(byArray, 18)), bf.b(al.a(byArray, 20)) - bf.b(al.a(byArray, 18)), al.a(byArray, 6), al.a(byArray, 10), al.a(byArray, 14), object2, n3, n4, n5);
        object2 = Image.createImage((byte[])object2, (int)0, (int)n2);
        object3 = object2;
        if (bl2) return object3;
        ((InputStream)object).close();
        return object2;
        catch (Exception exception) {
            object = object3;
        }
        object3 = object;
        if (object != null) return object3;
        try {
            object3 = new StringBuffer();
            object2 = a.b.a(((StringBuffer)object3).append(n2).append(".png").toString(), 1);
            object3 = object;
            if (object2 == null) return object3;
            return Image.createImage((byte[])object2, (int)0, (int)((byte[])object2).length);
        }
        catch (Exception exception) {
            return object;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Image a(Image image) {
        int n2 = 0;
        if (image == null) return null;
        int n3 = image.getWidth();
        int n4 = image.getHeight();
        int[] nArray = new int[n3 * n4];
        image.getRGB(nArray, 0, n3, 0, 0, n3, n4);
        while (n2 < nArray.length) {
            int n5 = (((nArray[n2] & 0xFF0000) >> 16) + ((nArray[n2] & 0xFF00) >> 8) + (nArray[n2] & 0xFF)) / 3;
            nArray[n2] = n5 | (n5 << 16 | nArray[n2] & 0xFF000000 | n5 << 8);
            ++n2;
        }
        return Image.createRGBImage((int[])nArray, (int)n3, (int)n4, (boolean)true);
    }

    public static short a(int n2) {
        n2 = bf.b(n2);
        return al.a(a, n2 + (c + d));
    }

    private static void a(int n2, int n3, int n4, int n5, byte[] byArray, int n6, int n7, int n8, int n9, int n10, byte[] byArray2, int n11, int n12, int n13) {
        byte[] byArray3 = bf.a();
        System.arraycopy(byArray3, 0, byArray2, 0, byArray3.length);
        n2 = n3 = bf.a(byArray, n6, n8, byArray2, bf.a(n2, n3, n4, n10, byArray2, byArray3.length + 0), n11, n12, n13);
        if (n5 != -1) {
            n2 = bf.a(n5, n6 / 2, n9, byArray2, n3);
        }
        n2 = bf.a(byArray, n7, byArray2, n2);
        byArray = bf.b();
        System.arraycopy(byArray, 0, byArray2, n2, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Graphics graphics, int n2, int n3, int n4, int n5) {
        try {
            short s2;
            short s3 = bf.b(n2);
            if ((bf.a(n2) & ag.c) == 0) {
                bf.a(graphics, n2, n3, n4, 0, n5);
                return;
            }
            s3 = s2 = a[s3 + c + d + 4];
            if (s2 == 0) {
                s3 = 1;
            }
            bf.a(graphics, n2, n3, n4, ag.a % s3, n5);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8;
        int n9;
        block9: {
            block10: {
                block8: {
                    n9 = bf.b(n2);
                    n8 = bf.a(n2);
                    n7 = a[c + n9 + d + 4];
                    n2 = n9 + c + d + 5;
                    if ((ag.c & n8) != 0) break block8;
                    if ((ag.b & n8) == 0) break block9;
                    break block10;
                }
                if (n5 >= n7) return;
                bf.a(graphics, (int)al.a(a, (n5 << 1) + n2), n3, n4, n5, n6);
                return;
            }
            for (n5 = 0; n5 < n7; ++n5) {
                try {
                    n9 = al.a(a, n2);
                    n8 = a[n2 + 2];
                    bf.a(graphics, a[n9], 0, 0, n8 ^ n6, n3, n4);
                    n2 += 3;
                    continue;
                }
                catch (Exception exception) {}
            }
            return;
        }
        for (n5 = 0; n5 < n7; ++n5) {
            n8 = al.a(a, n2);
            int n10 = al.a(a, n2 + 2);
            n9 = al.a(a, n2 + 4);
            int n11 = n6 ^ a[n2 + 6];
            try {
                Image image = a[n8];
                if ((ag.h & n11) != 0) {
                    n9 = -n9 - image.getHeight();
                }
                n8 = n10;
                if ((ag.g & n11) != 0) {
                    n8 = -n10 - image.getWidth();
                }
                bf.a(graphics, image, 0, 0, n11, n8 + n3, n9 + n4);
                n2 += 7;
                continue;
            }
            catch (Exception exception) {}
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(Graphics graphics, Image image, int n2, int n3, int n4, int n5, int n6) {
        if (n4 == 0) {
            graphics.drawImage(image, n5 - n2, n6 - n3, 20);
            return;
        }
        if (n4 == ag.g) {
            int n7 = 2;
            n4 = n3;
            n3 = n2;
            n2 = n7;
        } else if (n4 == ag.h) {
            n2 = 1;
            n4 = 0;
            n3 = 0;
        } else if (n4 == (ag.g | ag.h)) {
            n2 = 3;
            n4 = 0;
            n3 = 0;
        } else {
            int n8 = 0;
            n3 = 0;
            n2 = n4;
            n4 = n8;
        }
        try {
            bg.a(graphics, image, 0, 0, image.getWidth(), image.getHeight(), n2, n5 - n3, n6 - n4, 20);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static byte[] a() {
        return new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
    }

    public static byte b(int n2) {
        n2 = bf.b(n2);
        return a[n2 + (c + d) + 3];
    }

    private static int b(int n2) {
        int n3 = n2;
        if (n2 < 0) {
            n3 = n2 + 65536;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Image b(int n2) {
        if (n2 != 0) return bf.a(n2);
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static short b(int n2) {
        try {
            return al.a(a, c + (n2 << 1));
        }
        catch (Exception exception) {
            return 0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void b() {
        if (a == null) {
            return;
        }
        for (int i2 = 0; i2 < a.size(); ++i2) {
            int n2 = Integer.parseInt((String)a.elementAt(i2));
            if (n2 < 310000) continue;
            bf.c(n2);
        }
        a.removeAllElements();
    }

    public static byte[] b() {
        return new byte[]{0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Image c(int n2) {
        Image image;
        Image image2;
        block14: {
            block13: {
                block12: {
                    image2 = (Image)a.a(n2);
                    if (image2 != null) {
                        return image2;
                    }
                    try {
                        if (n2 / 10000000 == 9) {
                            image2 = image = bf.a(bf.a(n2 % 10000000, false, false, 0, 0, 0));
                            break block12;
                        }
                        image2 = image = bf.a(n2, false, false, 0, 0, 0);
                    }
                    catch (Exception exception) {}
                }
                if (image2 == null) {
                    return null;
                }
                if (n2 != 5010000) break block13;
                try {
                    image = al.a(image2, (int)ac.a, (int)ac.b);
                }
                catch (Exception exception) {
                    image = null;
                }
                if (image != null) break block14;
            }
            image = image2;
        }
        a.a(n2, image);
        if (a == null) {
            a = new Vector();
        }
        image2 = image;
        if (a.contains(Integer.toString(n2))) return image2;
        a.addElement(Integer.toString(n2));
        return image;
    }

    public static void c() {
        bf.b();
        for (int i2 = 0; i2 < 1000; ++i2) {
            if (i2 < 80) {
                bf.d(1000000 + i2 * 10000);
                bf.d(8000000 + i2 * 10000);
                bf.d(2010000 + i2 * 10000);
            }
            bf.c(i2 + 7000);
            bf.d(700000 + i2 * 100);
        }
        bg.a.clear();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void c(int n2) {
        if (n2 == 2080000 || n2 == 2200000 || n2 == 2210000 || n2 == 2220000 || n2 == 2230000) {
            return;
        }
        a.a(n2);
    }

    public static void cinitclone() {
        a = null;
        c = 4;
        a = new p();
        a = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d() {
        int n2 = 685;
        try {
            if (aa.f == null) return;
            ac.a(false, false);
            f.a(4);
            f.a(11);
            f.a(10);
            f.b(61);
            Object object = aa.f;
            aq aq2 = new aq((byte[])object);
            a = aq2.a();
            int n3 = al.a(a, 0);
            d = n3 << 1;
            int n4 = al.a(a, 2);
            a = new Image[n4];
            if (aa.g != null) {
                if (ap.d == 0) {
                    // empty if block
                }
                while (n2 < n4) {
                    object = bf.a(n2, true, true, 0, 0, 0);
                    bf.a[n2] = (Image)object;
                    ++n2;
                }
            }
            if (aa.f == null) return;
            for (n2 = 0; n2 < n3; ++n2) {
                int n5 = bf.b(n2);
                n4 = bf.a(n2);
                int n6 = a[c + n5 + d + 4];
                int n7 = c;
                int n8 = d;
                if ((ag.c & n4) == 0) {
                    n4 = (n4 & ag.b) != 0 ? 3 : 7;
                    n5 = n5 + n7 + n8 + 5;
                    for (int i2 = 0; i2 < n6; ++i2, n5 += n4) {
                        n8 = al.a(a, n5);
                        if (n8 < 0 || n8 >= a.length || a[n8] != null) continue;
                        bf.a[n8] = bf.a(n8, false, true, 0, 0, 0);
                    }
                }
                if ((n4 = n2 * 100 / n3) >= 100 || ac.f == n4) continue;
                object = ac.a();
                if (n2 == 0) {
                    n4 = 0;
                }
                ((ac)object).a(n4);
            }
        }
        catch (Exception exception) {
            return;
        }
        ac.a().a(100);
        aa.f = null;
        aa.e = null;
        aa.g = null;
    }

    public static void d(int n2) {
        bf.c(n2);
        bg.d.remove(Integer.toString(n2));
        bg.c.remove(Integer.toString(n2));
        bg.b.remove(Integer.toString(n2));
    }

    public int a() {
        return this.a;
    }

    public void a() {
        bf.c(this.a);
    }

    public void a(int n2) {
        this.a = n2;
        this.a = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Graphics graphics, int n2, int n3, int n4) {
        Image image;
        try {
            image = bf.a(this.a, this.a);
            if (image == null) {
                return;
            }
            this.a = image;
            if ((this.a & 0x40) != 0) {
                short s2 = this.a;
                bg.a(graphics, image, this.b * s2, 0, this.b, image.getHeight(), n4, n2, n3, 20);
                return;
            }
        }
        catch (Exception exception) {
            return;
        }
        bg.a(graphics, image, 0, 0, image.getWidth(), image.getHeight(), n4, n2, n3, 20);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        Image image;
        block4: {
            try {
                image = bf.a(this.a, this.a);
                if (image != null) break block4;
            }
            catch (Exception exception) {
                return;
            }
            return;
        }
        this.a = image;
        bg.a(graphics, image, n2, n3, n4, n5, n6, n7, n8, 20);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int b() {
        Image image = bf.a(this.a, this.a);
        if (image == null) {
            return 0;
        }
        if ((this.a & 0x40) == 0) return image.getWidth();
        return this.c();
    }

    public void b(int n2) {
        this.a = (short)n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int c() {
        int n2;
        Image image = bf.a(this.a, this.a);
        if (image == null) {
            return 0;
        }
        int n3 = n2 = bf.a(this.a);
        if (n2 != 0) return n3;
        return image.getWidth();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int d() {
        Image image = bf.a(this.a, this.a);
        if (image != null) return image.getHeight();
        return 0;
    }
}

