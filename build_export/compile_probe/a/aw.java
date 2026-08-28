/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.ac;
import a.al;
import a.bc;
import a.bf;
import a.l;
import a.s;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aw {
    public static final int a = 0;
    public static long a;
    public static String a;
    public static Font a;
    public static int b;
    public static Vector b;
    public static int c;
    public static int d;
    private static final int h = 0;
    public static int i;
    public static int j;
    public static int k;
    public static int l;
    byte a;
    private Vector a;
    boolean a = new Vector(1);
    private int e;
    private int f;
    private int g;

    static {
        Static.regClass(12);
        aw.cinitclone();
    }

    public aw() {
        if (b == null) {
            b = new Vector(1);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private byte a(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 0: {
                return 1;
            }
            case 8: {
                return 2;
            }
            case 12: 
        }
        return 3;
    }

    public static int a(int n2) {
        if (n2 >= c && n2 < i) {
            b = n2;
        }
        return i;
    }

    public static aw a(String string, int n2, boolean bl2, boolean bl3) {
        aw aw2 = new aw();
        aw2.a(string, n2, bl2, bl3);
        return aw2;
    }

    public static String a() {
        return a;
    }

    public static void a() {
        b = 0;
        c = 0;
        i = 0;
        a = 0L;
        k = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(String string, int n2, Font font, int n3, String string2, int n4, int n5, byte by) {
        if (string == null) {
            return;
        }
        if (this.g + font.stringWidth(string) <= this.e) {
            this.g += font.stringWidth(string);
            b.addElement(new l(string, 0, string2, n4, n5, by));
            return;
        }
        n4 = 0;
        while (n4 < string.length()) {
            if (font.substringWidth(string, 0, n4 + 1) >= n2) {
                if (n4 == 0) {
                    b.addElement(new l(5, 0, 0L, 0, 0));
                    this.f += a;
                    this.g = 0;
                    this.a(string, this.e, font, n3, string2, 0, n5, (byte)0);
                    return;
                }
                b.addElement(new l(string.substring(0, n4), 0, "", 0, 0, 0));
                b.addElement(new l(5, 0, 0L, 0, 0));
                this.f += a;
                this.g = 0;
                if (n4 >= string.length()) return;
                this.a(string.substring(n4, string.length()), this.e, font, n3, string2, 0, n5, (byte)0);
                return;
            }
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(String string, boolean bl2) {
        int n2 = 0;
        int n3 = 0;
        while (true) {
            String string2;
            int n4;
            int n5;
            block12: {
                block11: {
                    n5 = string.indexOf("*");
                    n4 = string.indexOf("#(");
                    if (n5 == -1 && n4 == -1) break block11;
                    if ((n5 > n4 || n5 == -1) && n4 != -1) {
                        string2 = string;
                        if (n4 > 0) {
                            string2 = string.substring(n4, string.length());
                        }
                        n4 = string2.indexOf("#(");
                        int n6 = string2.indexOf(")");
                        n5 = string2.indexOf(",");
                        if (n5 > n4 + 2 && n6 > n5 + 2 && aw.a(string2.substring(n4 + 2, n5)) && aw.a(string2.substring(n5 + 1, n6 - 1))) {
                            if (bl2 && string2.charAt(n6 - 1) != 'p') {
                                string = string2.substring(n6 + 1, string2.length());
                                ++n3;
                                continue;
                            }
                            string = string2.substring(n6 + 1, string2.length());
                            continue;
                        }
                        string = string2.substring(1, string2.length());
                        continue;
                    }
                    if (n5 >= n4 && n4 != -1 || n5 == -1) continue;
                    string2 = string;
                    if (n5 > 0) {
                        string2 = string.substring(n5, string.length());
                    }
                    if ((n4 = string2.indexOf("*")) + 1 < string2.length()) break block12;
                }
                c -= n3;
                k -= n2;
                return;
            }
            n5 = string2.indexOf(")");
            if (string2.charAt(n4 + 1) == '(' && string2.indexOf("(") < n5) {
                if (bl2) {
                    string = string2.substring(string2.indexOf("+") + 1, string2.length());
                    ++n2;
                    ++n3;
                    continue;
                }
                string = string2.substring(n5 + 1, string2.length());
                continue;
            }
            string = string2.substring(2, string2.length());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(Graphics graphics, l l2, int n2, int n3, int n4) {
        try {
            bc.b((int)l2.a, true).a(graphics, n2, n3, n4);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Graphics graphics, boolean bl2, int n2, int n3, int n4, int n5) {
        graphics.setColor(16754246);
        if (this.a && bl2 && n2 == n5) {
            graphics.fillRect(n2 - 1, n3 - 1, this.e, a);
            return;
        }
        if (this.a <= 0) return;
        if (!bl2) return;
        if (n4 <= 0) return;
        graphics.fillRect(n2 - 1, n3 - 1, n4 + 2, a + 3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(String string) {
        try {
            Long.parseLong(string);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static int b() {
        return b;
    }

    private int b(int n2, int n3) {
        return al.a(s.a, n2, n3, 2);
    }

    public static void b() {
        j = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void b(Graphics graphics, l l2, int n2, int n3, int n4) {
        try {
            bf bf2 = new bf(l2.b, (int)l2.a);
            bf2.a(graphics, n2, n3, n4);
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
    public static boolean b(String string) {
        try {
            Integer.parseInt(string);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static int c() {
        return j;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c() {
        this.g = 0;
        this.f = 0;
        int n2 = this.a.size();
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                this.f += a;
                b.addElement(new l(5, 0, 0L, 0, 0));
                this.a = b;
                b = null;
                return;
            }
            l l2 = (l)this.a.elementAt(n3);
            switch (l2.b) {
                default: {
                    b.addElement(l2);
                    break;
                }
                case 1: {
                    this.a(l2.a, this.e - this.g, a, l2.b, l2.b, l2.a, (int)l2.a, l2.a);
                    break;
                }
                case 0: 
                case 8: 
                case 9: 
                case 10: 
                case 12: {
                    int n4 = d;
                    if (l2.b == 9 || l2.b == 10) {
                        n4 = l2.b / 100 % 100;
                    }
                    if (this.e - this.g < n4) {
                        b.addElement(new l(5, 0, 0L, 0, 0));
                        this.f += a;
                        this.g = 0;
                    }
                    this.g += n4;
                    b.addElement(l2);
                }
            }
            ++n3;
        }
    }

    public static void cinitclone() {
        d = 16;
        a = s.a;
        h = a.stringWidth("A");
        a = a.getBaselinePosition() + 2;
        j = 0;
        k = 0;
        a = 0L;
        a = "";
    }

    public static int d() {
        return (int)a - k;
    }

    public static int e() {
        return l;
    }

    public int a() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(int n2, int n3) {
        int n4 = this.a.size();
        int n5 = 0;
        block4: for (int i2 = 0; i2 < n4; ++i2) {
            l l2 = (l)this.a.elementAt(i2);
            switch (l2.b) {
                case 1: {
                    if (l2.b == n2 && (l2.a & 4) != 0) {
                        return l2.a - 1;
                    }
                }
                default: {
                    continue block4;
                }
                case 0: 
                case 8: 
                case 12: {
                    if (n2 == -1 && n5 == n3 && (l2.a & 2) != 0) {
                        return l2.a - 1;
                    }
                    ++n5;
                }
            }
        }
        if (n2 != -1) {
            return -999;
        }
        if (n5 != 0) return -888;
        return -999;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public int a(int var1_1, int var2_2, int var3_3, int var4_4) {
        var11_5 = null;
        if (var4_4 != ac.g && this.f + var2_2 < var4_4) {
            return var2_2 + this.f;
        }
        var10_6 = this.a.size();
        var6_7 = 0;
        var5_8 = var1_1;
        while (true) {
            block21: {
                if (var6_7 >= var10_6) ** GOTO lbl77
                var11_5 = (l)this.a.elementAt(var6_7);
                var7_9 = var5_8;
                switch (var11_5.b) {
                    case 5: {
                        var2_2 = aw.a + var2_2;
                        var5_8 = var1_1;
                        ** break;
                    }
                    case 1: {
                        var7_9 = aw.a.stringWidth(var11_5.a);
                        var9_11 = var5_8 + var7_9;
                        if (var11_5.a - 1 == aw.b && (var11_5.a & 4) != 0) {
                            aw.j = var2_2;
                            aw.l = 0;
                            if (var3_3 == ac.f && var4_4 == ac.g) {
                                return -888;
                            }
                        } else if (var3_3 != ac.f && var3_3 >= var9_11 - var7_9 && var3_3 <= var9_11 && var4_4 >= var2_2 && var4_4 <= aw.a + var2_2) {
                            var8_10 = false;
                            var5_8 = var2_2;
                            block12: for (var7_9 = var6_7; var7_9 > 0; --var7_9) {
                                var12_12 = (l)this.a.elementAt(var7_9 - 1);
                                if (!var8_10) {
                                    if (var12_12.b == 5) {
                                        var5_8 -= aw.a;
                                        continue;
                                    }
                                    if (var12_12.b != 2) continue;
                                    var8_10 = true;
                                    continue;
                                }
                                switch (var12_12.b) {
                                    default: {
                                        var7_9 = 0;
                                        continue block12;
                                    }
                                    case 0: {
                                        aw.a(var12_12.a - 1);
                                        aw.a = Integer.toString(var12_12.b);
                                        aw.j = var5_8;
                                        aw.l = this.a(var12_12.b);
                                        return -999;
                                    }
                                    case 5: {
                                        var5_8 -= aw.a;
                                    }
                                }
                            }
                            var5_8 = var9_11;
                            ** break;
                        }
                        ** GOTO lbl89
                    }
                    case 0: 
                    case 8: 
                    case 12: {
                        if (var3_3 != ac.f && var3_3 >= (var5_8 += aw.d) - aw.d && var3_3 <= var5_8 && var4_4 >= var2_2 && var4_4 <= aw.a + var2_2) {
                            aw.a(var11_5.a - 1);
                            aw.a = Integer.toString(var11_5.b);
                            aw.j = var2_2;
                            aw.l = this.a(var11_5.b);
                            return -999;
                        }
                        var7_9 = var5_8;
                        if (var11_5.a - 1 != aw.b) break;
                        var7_9 = var5_8;
                        if ((var11_5.a & 2) == 0) break;
                        aw.j = var2_2;
                        aw.l = this.a(var11_5.b);
                        var7_9 = var5_8;
                        if (var3_3 != ac.f) break;
                        var7_9 = var5_8;
                        if (var4_4 != ac.g) break;
                        return -999;
                    }
                    case 9: 
                    case 10: {
                        var5_8 += var11_5.b / 100 % 100;
                    }
lbl75:
                    // 4 sources

                    default: {
                        break block21;
                    }
lbl77:
                    // 1 sources

                    var1_1 = var2_2;
                    if (var4_4 == ac.g) return var1_1;
                    var1_1 = var2_2;
                    if (var4_4 > var2_2) return var1_1;
                    var1_1 = var2_2;
                    if (var11_5 == null) return var1_1;
                    aw.a(((l)this.a.elementAt((int)1)).a - 1);
                    aw.a = ((l)this.a.elementAt((int)1)).b;
                    aw.j = var2_2;
                    aw.l = 0;
                    return -999;
lbl89:
                    // 2 sources

                    var5_8 = var9_11;
                    break block21;
                    case 2: 
                    case 3: 
                    case 4: 
                    case 6: 
                    case 7: 
                    case 11: 
                }
                var5_8 = var7_9;
            }
            ++var6_7;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a(Graphics graphics, int n2, int n3, int n4, int n5, boolean bl2, int n6, int n7) {
        int n8;
        int n9 = n8 = n3 + this.f;
        if (n8 < 0) return n9;
        if (n8 < n7) {
            return n8;
        }
        long l2 = 0L;
        graphics.setColor(this.b(s.a[0], n6));
        int n10 = this.a.size();
        n8 = 0;
        n7 = n3;
        n3 = n2;
        while (true) {
            block15: {
                int n11;
                n9 = n7;
                if (n8 >= n10) return n9;
                l l3 = (l)this.a.elementAt(n8);
                switch (l3.b) {
                    case 5: {
                        n9 = n7 += a;
                        if (n7 > ac.b) return n9;
                        n3 = n2;
                        break block15;
                    }
                    case 1: {
                        n11 = a.stringWidth(l3.a);
                        n9 = l2 == 2L ? n2 + (n4 - n11 >> 1) : n3;
                    }
                    case 0: 
                    case 8: 
                    case 12: {
                        if ((l3.a & 2) != 0 && l3.a - 1 == b) {
                            this.a = (byte)2;
                            a = Integer.toString(l3.b);
                            j = n7;
                            l = this.a(l3.b);
                        }
                        this.a(graphics, bl2, n3, n7, d, n2);
                        this.a(graphics, l3, n3, n7, n5);
                        n9 = graphics.getColor();
                        n3 += d;
                        graphics.setColor(n9);
                        break block15;
                    }
                    case 9: 
                    case 10: {
                        this.a(graphics, bl2, n3, n7, 0, n2);
                        this.b(graphics, l3, n3, n7, n5);
                        n3 += l3.b / 100 % 100;
                        break block15;
                    }
                    case 2: {
                        if (this.a > 0) {
                            this.a = (byte)(this.a - 1);
                        }
                        graphics.setColor(this.b(s.a[(int)l3.a], n6));
                        break block15;
                    }
                    case 4: {
                        l2 = l3.a;
                        break block15;
                    }
                }
                int n12 = graphics.getColor();
                if ((l3.a & 4) != 0) {
                    if (l3.a - 1 == b) {
                        this.a = true;
                        a = l3.b;
                        a = l3.a;
                        j = n7;
                        l = 0;
                    } else {
                        this.a = false;
                    }
                }
                this.a(graphics, bl2, n9, n7, n11, n2);
                al.a(graphics, l3.a, n9 - 1, n7 - 1, this.b(n12, n6), 0);
                graphics.setColor(n12);
                n3 += a.stringWidth(l3.a);
            }
            ++n8;
        }
    }

    public void a(int n2) {
        int n3 = -1;
        this.f = 0;
        for (int i2 = this.a.size() - 1; i2 >= 0; --i2) {
            int n4;
            if (((l)this.a.elementAt((int)i2)).b != 5) continue;
            n3 = n4 = n3 + 1;
            if (n4 < n2) continue;
            this.f = a * n2;
            for (n2 = i2; n2 >= 0; --n2) {
                this.a.removeElementAt(0);
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(String string, int n2, boolean bl2, boolean bl3) {
        if (bl3) {
            this.a(string, true);
        }
        this.e = n2;
        b = new Vector(1);
        this.a.removeAllElements();
        int n3 = 0;
        n2 = 0;
        while (true) {
            char c2;
            int n4;
            String string2;
            block23: {
                int n5;
                block24: {
                    int n6;
                    int n7;
                    int n8;
                    block26: {
                        block25: {
                            block22: {
                                block21: {
                                    n8 = string.indexOf("*");
                                    n7 = string.indexOf("#(");
                                    if (n8 != -1 || n7 != -1) break block21;
                                    if (string.length() > 0) {
                                        this.a.addElement(new l(string.substring(0, string.length()), 0, "", 0, 0, 0));
                                    }
                                    break block22;
                                }
                                if ((n8 > n7 || n8 == -1) && n7 != -1) {
                                    string2 = string;
                                    if (n7 > 0) {
                                        this.a.addElement(new l(string.substring(0, n7), 0, "", 0, 0, 0));
                                        string2 = string.substring(n7, string.length());
                                    }
                                    n8 = string2.indexOf("#(");
                                    n4 = string2.indexOf(")");
                                    n6 = string2.indexOf(",");
                                    if (n6 > n8 + 2 && n4 > n6 + 2 && aw.a(string2.substring(n8 + 2, n6)) && aw.a(string2.substring(n6 + 1, n4 - 1))) {
                                        byte by;
                                        n7 = string2.charAt(n4 - 1);
                                        long l2 = Long.parseLong(string2.substring(n8 + 2, n6));
                                        long l3 = Long.parseLong(string2.substring(n6 + 1, n4 - 1));
                                        if (n7 == 114) {
                                            by = 12;
                                            n8 = 1;
                                        } else if (n7 == 106) {
                                            by = 8;
                                            n8 = 1;
                                        } else if (n7 == 112) {
                                            by = 9;
                                            l2 %= 23L;
                                            l3 = 4491616L;
                                            n8 = 1;
                                        } else if (65 <= n7 && n7 <= 90) {
                                            by = 10;
                                            n8 = n7 - 65 + 1;
                                        } else {
                                            by = 0;
                                            n8 = 1;
                                        }
                                        n7 = 0;
                                        byte by2 = 0;
                                        if (bl2 && by != 9 && by != 10) {
                                            by2 = 2;
                                            n7 = bl3 ? c + ++n2 : ++i;
                                        }
                                        for (n6 = 0; n6 < n8; ++n6) {
                                            this.a.addElement(new l(by, n7, l2, (int)l3, by2));
                                        }
                                        string = string2.substring(n4 + 1, string2.length());
                                        continue;
                                    }
                                    this.a.addElement(new l(string2.substring(n8, n8 + 1), 0, "", 0, 0, 0));
                                    string = string2.substring(1, string2.length());
                                    continue;
                                }
                                if (n8 >= n7 && n7 != -1 || n8 == -1) continue;
                                string2 = string;
                                if (n8 > 0) {
                                    this.a.addElement(new l(string.substring(0, n8), 0, "", 0, 0, 0));
                                    string2 = string.substring(n8, string.length());
                                }
                                if ((n4 = string2.indexOf("*")) + 1 >= string2.length()) break block22;
                                n5 = string2.indexOf(")");
                                c2 = string2.charAt(n4 + 1);
                                if (c2 != '(' || string2.indexOf("(") >= n5) break block23;
                                if (!bl2) break block24;
                                if (!bl3) break block25;
                                n7 = c + ++n2;
                                n6 = k + n3;
                                n8 = n3 + 1;
                                n3 = n6;
                                break block26;
                            }
                            this.c();
                            return;
                        }
                        n7 = ++i;
                        n6 = (int)a;
                        ++a;
                        n8 = n3;
                        n3 = n6;
                    }
                    n6 = string2.indexOf("|");
                    int n9 = string2.indexOf("+");
                    int n10 = Integer.parseInt(string2.substring(n5 + 1, n6));
                    this.a.addElement(new l(string2.substring(n4 + 2, n5), n10, string2.substring(n6 + 1, n9), n7, n3, 4));
                    string = string2.substring(n9 + 1, string2.length());
                    n3 = n8;
                    continue;
                }
                this.a.addElement(new l(string2.substring(n4 + 2, n5), 0, "", 0, 0, 0));
                string = string2.substring(n5 + 1, string2.length());
                continue;
            }
            if (c2 == 'a' || c2 == 'b') {
                this.a.addElement(new l(2, 0, (byte)(c2 - 97 + 10), 0, 0));
            } else if (Character.isDigit(c2)) {
                this.a.addElement(new l(2, 0, Byte.parseByte(string2.substring(n4 + 1, n4 + 2)), 0, 0));
            } else {
                this.a.addElement(new l(string2.substring(n4, n4 + 2), 0, "", 0, 0, 0));
            }
            string = string2.substring(2, string2.length());
        }
    }

    public int f() {
        return this.f;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public int g() {
        int n2 = 0;
        block7: for (int i2 = 0; i2 < this.a.size(); ++i2) {
            l l2 = (l)this.a.elementAt(i2);
            int n3 = n2;
            int n4 = Integer.MIN_VALUE;
            block8: do {
                switch (n4 == Integer.MIN_VALUE ? l2.b : n4) {
                    default: {
                        n3 = n2;
                        n4 = 2;
                        continue block8;
                    }
                    case 1: {
                        n3 = n2 + a.stringWidth(l2.a);
                        n4 = 2;
                        continue block8;
                    }
                    case 0: 
                    case 8: 
                    case 12: {
                        n3 = n2 + d;
                        n4 = 2;
                        continue block8;
                    }
                    case 9: 
                    case 10: {
                        n3 = n2 + l2.b / 100 % 100;
                    }
                    case 2: 
                    case 3: 
                    case 4: 
                    case 6: 
                    case 7: 
                    case 11: {
                        n2 = n3;
                        continue block7;
                    }
                    case 5: 
                }
                return n2;
            } while (true);
        }
        return n2;
    }

    public int h() {
        int n2 = this.a.size();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((l)this.a.elementAt((int)i2)).b != 5) continue;
            ++n3;
        }
        return n3;
    }
}

