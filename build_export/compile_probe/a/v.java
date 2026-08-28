/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
package a;

import a.Static;
import a.ac;
import a.al;
import a.au;
import a.s;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class v {
    public static v a;
    private byte a;
    private int a;
    private Vector a;
    private Image a;
    private final short a;
    public byte[] a;
    private int[] a = 0;
    private int b;
    private Vector b;
    private final short b;
    public byte[] b = new byte[0];
    private final int c;
    private final short c;
    private final int d;
    private final short d;
    private int e;
    private int f = 0;

    static {
        Static.regClass(33);
        v.cinitclone();
    }

    private v() {
        this.a = (short)10;
        this.b = (short)10;
        this.c = (short)64;
        this.d = (short)13;
        this.c = ac.b / 10 + 1;
        this.d = ac.a / 10 + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int a(Vector vector) {
        int n2 = 999;
        int n3 = -1;
        int n4 = 999;
        for (int i2 = 0; i2 < vector.size(); ++i2) {
            int n5;
            int[] nArray = (int[])vector.elementAt(i2);
            int n6 = Math.abs(nArray[0] - this.a[0]);
            int n7 = n6 + (n5 = Math.abs(nArray[1] - this.a[1]));
            if (n7 > n2 || n7 == n2 && Math.abs(n6 - n5) > n4) continue;
            n4 = Math.abs(n6 - n5);
            n3 = i2;
            n2 = n7;
        }
        if (n3 != -1) {
            this.a((int[])vector.elementAt(n3));
            this.c();
        }
        return n3;
    }

    public static v a() {
        if (a == null) {
            a = new v();
        }
        return a;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String a(int n2, int n3) {
        void var5_8;
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            String[] stringArray = al.a((String)this.a.elementAt(i2), "_");
            try {
                int n4;
                if (Integer.parseInt(stringArray[0]) != n2 || (n4 = Integer.parseInt(stringArray[1])) != n3) continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
            String string = stringArray[2];
            return var5_8;
        }
        return var5_8;
    }

    private void a(int[] nArray) {
        this.a(nArray[0], nArray[1]);
    }

    private void a(String[] stringArray) {
        au.a().a(0, 0, 0, stringArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a() {
        if (this.b == null) return true;
        if (this.b.size() == 0) return true;
        if (this.a == null) return true;
        if (this.b == null) return true;
        if (this.a == null) return true;
        if (this.a == null) return true;
        if (this.a != null) return false;
        return true;
    }

    private int[] a() {
        int n2 = this.a.length / 64;
        return new int[]{Math.min(Math.max(this.a - ac.a / 2, 0), Math.max(640 - ac.a, 0)), Math.min(Math.max(this.b - ac.b / 2, 0), Math.max(n2 * 10 - ac.b, 0))};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void c() {
        if (this.a()) {
            return;
        }
        String string = this.a(this.a[0], this.a[1]);
        if (string != null) {
            this.a(al.a(string, "@"));
            return;
        }
        au.a().a(0);
    }

    public static void cinitclone() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a() {
        if (this.b == null) {
            return;
        }
        this.a = new Vector();
        this.b = new Vector();
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            if (this.b[i2] != 8 && this.b[i2] != 59) continue;
            this.b.addElement(new int[]{i2 % 64, i2 / 64});
        }
        if (this.a == null && this.b.size() > 0) {
            this.a((int[])this.b.elementAt(0));
        }
        try {
            this.a = Image.createImage((String)"/1.png");
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2) {
        if (n2 > -1) return;
        if (n2 < -4) {
            return;
        }
        if (this.a()) return;
        int n3 = Math.abs((n2 + 1) / 2);
        int n4 = (n3 + 1) % 2;
        Vector<int[]> vector = new Vector<int[]>();
        Vector<int[]> vector2 = new Vector<int[]>();
        int n5 = 0;
        while (true) {
            if (n5 >= this.b.size()) {
                if (this.a(vector) != -1) return;
                this.a(vector2);
                return;
            }
            int[] nArray = (int[])this.b.elementAt(n5);
            int n6 = (nArray[n4] - this.a[n4]) * (n2 % 2 * 2 + 1);
            if (n6 > 0) {
                if (n6 >= Math.abs(nArray[n3] - this.a[n3])) {
                    if (!this.a.equals(nArray)) {
                        vector.addElement(nArray);
                    }
                } else {
                    vector2.addElement(nArray);
                }
            }
            ++n5;
        }
    }

    public void a(int n2, int n3) {
        if (this.a == null) {
            this.a = new int[2];
        }
        this.a[0] = n2;
        this.a[1] = n3;
        this.a = this.a[0] * 10;
        this.b = this.a[1] * 10;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(Graphics graphics) {
        if (this.a()) {
            return;
        }
        graphics.fillRect(0, 0, (int)ac.a, (int)ac.b);
        int[] nArray = this.a();
        int n2 = nArray[0] - this.e;
        int n3 = nArray[1];
        int n4 = this.f;
        this.e += n2 / 3 + n2 % 2;
        int n5 = this.f;
        this.f = (n3 - n4) / 3 + n2 % 2 + n5;
        n3 = Math.max(this.f / 10, 0);
        n5 = Math.max(this.e / 10, 0);
        n4 = n3 * 64 + n5;
        n2 = Math.min((this.c + n3) * 64 + n5 + this.d, this.a.length);
        while (true) {
            if (n4 >= n2) {
                byte by;
                this.a = by = (byte)(this.a + 1);
                this.a = (byte)(by % s.a.length);
                graphics.setColor(s.a[this.a]);
                graphics.setClip(this.a - this.e - 5, this.b - this.f - 5, 20, 20);
                graphics.drawRect(this.a - this.e - 2, this.b - this.f - 2, 14, 14);
                return;
            }
            int n6 = n4 / 64;
            int n7 = n4 % 64;
            if (n6 >= n3 && n6 <= this.c + n3 && n7 >= n5 && n7 <= this.d + n5) {
                n7 = n7 * 10 - this.e;
                n6 = n6 * 10 - this.f;
                graphics.setClip(n7, n6, 10, 10);
                graphics.drawImage(this.a, n7 - (this.a[n4] - 1) % 13 * 10, n6 - (this.a[n4] - 1) / 13 * 10, 0);
                if (this.b[n4] != 0) {
                    graphics.drawImage(this.a, n7 - (this.b[n4] - 1) % 13 * 10, n6 - (this.b[n4] - 1) / 13 * 10, 0);
                }
            }
            ++n4;
        }
    }

    public void b() {
        if (this.b != null) {
            this.b.removeAllElements();
        }
        this.b = null;
        this.a = null;
        this.b = null;
        this.a = null;
        this.a = null;
        this.a = null;
        a = null;
    }
}

