/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.ac;
import a.al;
import a.g;
import a.s;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class n
extends g {
    private long a;
    private StringBuffer a;
    private String[] a;
    private long b;
    private String b;
    private int[] b = "";
    private byte c;
    private long c;
    private String c = null;
    private byte d;
    private String d = "";
    private int m;

    public n(String string, int n2, int n3, int n4, int n5, int n6) {
        super(n4, n5, n6, -1);
        this.a = new StringBuffer("");
        this.a = new String[]{"|", ""};
        this.a = this.a.append(string);
        this.b[0] = n2;
        this.a(n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static g a(int n2, byte by, DataInputStream dataInputStream) {
        n n3 = new n("", 10, 0, 0, 0, 0);
        a.g.a(n3, n2, by, dataInputStream);
        n3.b(dataInputStream.readByte());
        dataInputStream.readUTF();
        n2 = dataInputStream.readByte();
        if ((n2 & 8) != 0) {
            n3.a(1);
        } else if ((n2 & 4) != 0) {
            n3.a(2);
        }
        if ((n2 & 2) != 0) {
            n3.a(64, true);
            n3.a(4);
        }
        if ((n2 & 1) != 0) {
            n3.a(32, true);
        }
        n3.a();
        return n3;
    }

    private String a(String string) {
        if (this.c >= string.length()) {
            this.c = 0;
        }
        return string.substring(this.c, this.c + 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String b(String charSequence) {
        int n2;
        int n3;
        if (this.c == null) {
            this.c = "*";
        }
        if ((n3 = this.c.length()) > (n2 = ((String)charSequence).length())) {
            return this.c.substring(0, n2);
        }
        if (n3 >= n2) return this.c;
        charSequence = al.a(null, this.c);
        n2 -= n3;
        while (n2 > 0) {
            al.a((StringBuffer)charSequence, "*");
            --n2;
        }
        this.c = ((StringBuffer)charSequence).toString();
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(int n2, boolean bl2) {
        String string;
        this.c = System.currentTimeMillis();
        if (this.b[1] == 1) {
            this.a.append(n2);
            ++this.m;
            return;
        }
        if (this.b[1] != 2) {
            if (this.b[1] != 4) return;
        }
        if (this.d.equals(this.a(s.g[n2]))) {
            this.a = 0L;
            this.b = this.a(s.g[n2]);
            this.c();
            return;
        }
        if (this.b[2] != n2) {
            this.b[2] = n2;
            this.a = 0L;
            this.c();
            this.c = 0;
        }
        this.b = string = this.a(s.g[n2]);
        this.d = string;
        this.c = (byte)(this.c + 1);
        this.a = System.currentTimeMillis();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean c() {
        boolean bl2;
        boolean bl3 = bl2 = false;
        if (System.currentTimeMillis() - this.a <= 1000L) return bl3;
        if (this.b.equals("")) {
            return bl2;
        }
        String string = this.a.toString();
        string = this.m == 0 ? new StringBuffer().append(this.b).append(string).toString() : (this.m >= 1 && this.m < this.a.length() ? new StringBuffer().append(string.substring(0, this.m)).append(this.b).append(string.substring(this.m, string.length())).toString() : new StringBuffer().append(string).append(this.b).toString());
        ++this.m;
        this.a = new StringBuffer(string);
        this.b = "";
        this.c = 0;
        this.d = "";
        this.c = System.currentTimeMillis();
        return true;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static int d(int n2) {
        int n3;
        int n4 = n3 = 0;
        int n5 = 0;
        block5: do {
            switch (n5 == 0 ? n2 : n5) {
                default: {
                    n4 = n3;
                    n5 = 2;
                    continue block5;
                }
                case 1: {
                    n4 = 2;
                }
                case 2: 
                case 3: {
                    return n4;
                }
                case 4: 
            }
            return 65536;
        } while (true);
        return 65536;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void d() {
        if (this.b[0] <= this.a.length()) {
            this.b = "";
            return;
        }
        for (int i2 = 0; i2 < 10; ++i2) {
            if (ac.e != s.a[i2 + 9]) continue;
            this.b(i2, true);
        }
        this.c();
    }

    private void e() {
        if (System.currentTimeMillis() - this.b >= 100L) {
            this.b = System.currentTimeMillis();
            this.d = (byte)(this.d + 1);
            if (this.d > 1) {
                this.d = 0;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int a(int n2) {
        if (n2 == s.a[2] && this.b != -1 && this.m <= 0) {
            n2 = (int)this.b;
        } else if (n2 == s.a[3] && this.c != -1 && this.m >= this.a.length()) {
            n2 = this.c;
        } else if (n2 == s.a[4] && this.d != -1) {
            n2 = this.d;
        } else {
            if (n2 != s.a[5]) return -1;
            if (this.e == -1) return -1;
            n2 = this.e;
        }
        if (n2 == -1) return n2;
        if (this.b.equals("")) return n2;
        this.a = 0L;
        this.c();
        return n2;
    }

    @Override
    public String a() {
        this.a.append(this.b);
        this.b = "";
        return this.a.toString();
    }

    public void a(int n2) {
        this.b[1] = n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(int n2, int n3, int n4, int n5) {
        this.d();
        if (System.currentTimeMillis() - this.c > 1000L) {
            this.c = System.currentTimeMillis();
            this.c = 0;
            this.d = "";
        }
        if (!this.d.equals("")) {
            this.d = 0;
        }
        String string = this.a.toString();
        if (n3 == s.a[7] || n3 == s.a[45]) {
            this.d = "";
            this.c = 0;
            if (!this.b.equals("")) {
                this.b = "";
            } else {
                n2 = this.a.length();
                if (n2 > 0) {
                    StringBuffer stringBuffer;
                    if (this.m < 1) return;
                    if (this.m > string.length()) {
                        this.m = string.length();
                    }
                    StringBuffer stringBuffer2 = stringBuffer = al.a(null, string.substring(0, this.m - 1));
                    if (this.m != n2) {
                        stringBuffer2 = al.a(stringBuffer, string.substring(this.m, n2));
                    }
                    this.a = new StringBuffer("");
                    this.a.append(stringBuffer2.toString());
                    --this.m;
                }
            }
            if (this.m >= 0) return;
            this.m = 0;
            return;
        }
        if (n3 == s.a[6] && ac.e != s.a[14]) {
            if (this.a == null) return;
            this.a.a(4, this);
            return;
        }
        if (n3 == s.a[2]) {
            this.b = System.currentTimeMillis();
            this.d = 0;
            this.a = 0L;
            if (this.m < 0) {
                this.m = 0;
            }
            if (this.m > string.length()) {
                this.m = string.length();
            }
            this.c();
            --this.m;
            return;
        }
        if (n3 != s.a[3]) return;
        this.b = System.currentTimeMillis();
        this.d = 0;
        this.a = 0L;
        if (this.m < 0) {
            this.m = 0;
        }
        if (this.m > string.length()) {
            this.m = string.length();
        }
        this.c();
        ++this.m;
    }

    public void a(String string) {
        this.a = null;
        this.m = string.length();
        this.a = new StringBuffer("");
        this.a.append(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(Graphics graphics) {
        String string;
        super.a(graphics);
        int n2 = (this.f & 0x10) != 0 ? 0 : n.b((int)this.a);
        long l2 = this.b - n2;
        int n3 = this.h - s.h >> 1;
        String string2 = this.a.toString();
        if (this.b[1] == 4) {
            string2 = this.b(string2);
        }
        if (!this.b()) {
            al.a(graphics, (int)this.a, (int)l2, this.g, this.h, 0xCECBCE, 0, s.a[1]);
            string = string2;
        } else {
            al.a(graphics, (int)this.a, (int)l2, this.g, this.h, 0xFFFFFF, 0, s.a[1]);
            if (this.m == 0) {
                string = new StringBuffer().append(this.b).append(string2).toString();
            } else if (this.m >= 1 && this.m < this.a.length() && !this.b.equals("")) {
                string = new StringBuffer().append(string2.substring(0, this.m)).append(this.b).append(string2.substring(this.m, string2.length())).toString();
            } else {
                string = string2;
                if (this.m >= this.a.toString().length()) {
                    string = new StringBuffer().append(string2).append(this.b).toString();
                }
            }
            int n4 = 0;
            for (n2 = 0; n2 < this.m + this.b.length(); ++n2) {
                if (string.length() > n2) {
                    n4 += a.charWidth(string.charAt(n2));
                    continue;
                }
                this.m = string.length();
            }
            if (n4 < this.g) {
                graphics.drawString(this.a[this.d], n4 + (this.a + true), (int)(l2 + n3), 0);
            }
            this.e();
        }
        graphics.setClip((int)this.a, (int)l2, this.g + 1, this.h + 1);
        graphics.setColor(0);
        graphics.drawString(string, (int)(this.a + 2), (int)(l2 + n3), 0);
        al.b(graphics);
    }

    public void b(int n2) {
        this.b[0] = n2;
    }

    public int e() {
        return this.b[1];
    }

    public int f() {
        int n2;
        int n3 = n2 = -1;
        if ((this.b[1] & 1) != 0) {
            String string = this.a.toString();
            n3 = n2;
            if (string.compareTo("") != 0) {
                n3 = Integer.parseInt(string);
            }
        }
        return n3;
    }

    public int g() {
        return this.b[0];
    }
}

