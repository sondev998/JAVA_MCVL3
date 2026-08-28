/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 */
package a;

import a.Static;
import a.ac;
import a.ak;
import a.al;
import a.ar;
import a.au;
import a.av;
import a.bb;
import a.bi;
import a.g;
import a.h;
import a.n;
import a.q;
import a.r;
import a.s;
import a.w;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f {
    public static int a;
    public static f a;
    public static Vector a;

    static {
        Static.regClass(25);
        f.cinitclone();
    }

    public f() {
        al.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a() {
        if (a.size() != 0) return (int)(((av)f.a.lastElement()).a / 1000);
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int a(av av2, DataInputStream object) {
        byte by;
        int n2 = ((DataInputStream)object).readInt();
        if ((object = f.a(n2, by = ((DataInputStream)object).readByte(), (DataInputStream)object)) != null) {
            ((g)object).b(((g)object).a - av2.e + av2.a, ((g)object).b - av2.f + av2.b);
            short s2 = (((g)object).f & 0x8000000) != 0 ? (short)(av2.h - ((g)object).b - ((g)object).h) : (short)0;
            int n3 = Math.max(av2.h, ac.b);
            if ((((g)object).f & 0x8000000) != 0 && (av2.f & 0x200000) != 0) {
                if (by == 12) {
                    ((q)object).c(n3 - ((g)object).b - s2, 11);
                } else {
                    ((g)object).a(0, n3 - ((g)object).b - s2);
                }
            }
            av2.c((g)object);
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static av a(int n2) {
        int n3 = a.size() - 1;
        while (n3 >= 0) {
            av av2 = (av)a.elementAt(n3);
            if (av2 != null && av2.a() == n2 * 1000) {
                return av2;
            }
            --n3;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static av a(int n2, byte by, av av2) {
        av av3;
        av av4;
        boolean bl2;
        System.out.println(new StringBuffer().append("UI:").append(n2).toString());
        if (n2 == 2) {
            bb.b = 0;
        }
        if (2 == by) {
            f.a(0);
            f.a(3);
        }
        if (!(bl2 = (av4 = f.a(n2)) != null) && av2 != null) {
            int n3 = 29 == n2 || 30 == n2 ? 28 : n2;
            av3 = f.a(av2, n3);
        } else {
            av3 = av4;
            if (av2 != null) {
                av3 = av4;
            }
        }
        if (av3 == null) {
            return null;
        }
        if (!bl2) {
            av3.c();
        }
        boolean bl3 = (by & 2) != 0;
        av3.a(bl3);
        if ((by & 1) == 0) {
            a.removeAllElements();
        } else {
            f.a(n2 * 1000, false, false);
        }
        a.addElement(av3);
        return av3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static av a(av av2, int n2) {
        av av3;
        av av4 = null;
        Object object = al.a(null, s.c[1]);
        al.a((StringBuffer)object, "u");
        al.a((StringBuffer)object, (long)n2);
        al.a((StringBuffer)object, ".ui");
        object = ((StringBuffer)object).toString();
        try {
            InputStream inputStream = al.a((String)object);
            object = new DataInputStream(inputStream);
            av3 = av4;
            if (object == null) return av3;
            if (inputStream == null) {
                return av4;
            }
        }
        catch (Exception exception) {
            object = null;
        }
        try {
            av2 = f.a(av2, (DataInputStream)object);
        }
        catch (Exception exception) {
            av2 = null;
        }
        av3 = av4;
        if (av2 == null) return av3;
        try {
            byte by = ((DataInputStream)object).readByte();
            av2.b = new int[by];
            n2 = 0;
            while (n2 < by) {
                av2.b[n2] = f.a(av2, (DataInputStream)object);
                ++n2;
            }
            return av2;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return av2;
    }

    private static av a(av av2, DataInputStream dataInputStream) {
        return (av)av2.a(av2, dataInputStream);
    }

    public static av a(String string) {
        au.a().a = false;
        return f.a("", string, 112, 3500L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static av a(String object, String string, int n2, int n3, boolean bl2, bi bi2, String[] stringArray) {
        av av2 = f.a(1);
        if (av2 != null && ((ak)av2.b((int)0)).a) {
            return null;
        }
        if (av2 != null) {
            f.a(1);
        }
        av2 = f.b(1);
        w.a().a((String)object, string, n2, n3, bl2, bi2, av2, stringArray);
        ac.c = 0;
        ac.d = 0;
        return av2;
    }

    public static av a(String string, String string2, int n2, long l2) {
        av av2 = f.b(50);
        n2 = w.a().a(string, string2, n2, l2, av2);
        w.a().c(ac.b - n2 >> 1, av2);
        return av2;
    }

    public static f a() {
        if (a == null) {
            a = new f();
        }
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static g a(int n2, byte by, DataInputStream dataInputStream) {
        g g2 = null;
        if (by == 2) {
            return ar.a(n2, by, dataInputStream);
        }
        if (by == 4) {
            return h.a(n2, by, dataInputStream);
        }
        if (by == 7) {
            return n.a(n2, by, dataInputStream);
        }
        if (by == 11) {
            return r.a(n2, by, dataInputStream);
        }
        if (by != 12) return g2;
        return q.a(n2, by, dataInputStream);
    }

    public static void a() {
        av av2;
        av av3 = av2 = f.a(21);
        if (av2 == null) {
            av3 = f.a(22);
        }
        if (av3 != null && (av2 = f.a(1)) != null) {
            a.removeElement(av2);
            a.insertElementAt(av2, a.indexOf(av3));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(int n2) {
        int n3 = a.size() - 1;
        while (true) {
            if (n3 < 0) {
                System.gc();
                return;
            }
            av av2 = (av)a.elementAt(n3);
            if (av2.a != 3000 && n2 != av2.a && av2 != null) {
                av2.c();
                a.removeElementAt(n3);
            }
            --n3;
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void a(int var0, int var1_1, int var2_2, int var3_3) {
        var4_4 = f.a.size();
        var5_5 = 1;
        f.a = 0;
        --var4_4;
        block14: while (var4_4 >= 0) {
            block19: {
                block20: {
                    if (var4_4 >= f.a.size()) break;
                    var10_10 = (av)f.a.elementAt(var4_4);
                    var6_6 = var5_5;
                    var7_7 = var1_1;
                    var8_8 = var0;
                    var9_9 = var4_4;
                    if (!var10_10.a()) ** GOTO lbl57
                    if (var5_5 == 0) break block19;
                    var5_5 = var10_10.e();
                    if (var5_5 == 0) break block20;
lbl21:
                    // 5 sources

                    while (true) {
                        f.a(var1_1, var10_10);
                        var0 = var5_5;
                        if (ac.e != 0) {
                            var0 = ac.c;
                            var1_1 = ac.d;
                        }
                        au.a().b();
                        var10_10.a(var0, var1_1, var2_2, var3_3);
                        var5_5 = 0;
lbl32:
                        // 2 sources

                        while (true) {
                            block21: {
                                var6_6 = var5_5;
                                var7_7 = var1_1;
                                var8_8 = var0;
                                var9_9 = var4_4;
                                if (!f.a.contains(var10_10)) break block21;
                                var4_4 = f.a.indexOf(var10_10);
                                var6_6 = var5_5;
                                var7_7 = var1_1;
                                var8_8 = var0;
                                var9_9 = var4_4;
                                if (!f.b((int)(var10_10.a / 1000))) break block21;
                                var6_6 = var5_5;
                                var7_7 = var1_1;
                                var8_8 = var0;
                                var9_9 = var4_4;
                                if (f.a != 0) break block21;
                                f.a = var4_4;
                                var9_9 = var4_4;
                                var8_8 = var0;
                                var7_7 = var1_1;
                                var6_6 = var5_5;
                            }
                            var4_4 = var9_9;
                            var0 = var8_8;
                            var1_1 = var7_7;
                            var5_5 = var6_6;
lbl62:
                            // 2 sources

                            while (true) {
                                --var4_4;
                                continue block14;
                                break;
                            }
                            break;
                        }
                        break;
                    }
                }
                var5_5 = var0;
                if (var0 != 0) ** GOTO lbl21
                var5_5 = var0;
                if (var1_1 != 0) ** GOTO lbl21
                var5_5 = var0;
                if (!ac.a(var2_2, var3_3)) ** GOTO lbl21
                var5_5 = var0;
                if (var10_10.b(var2_2, var3_3)) ** break;
                ** continue;
                var5_5 = 0;
                ** continue;
            }
            try {
                var10_10.a(0, 0, -1, -1);
                ** continue;
            }
            catch (Exception var10_11) {
                // empty catch block
                break;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(int n2, av av2) {
        if (av2.a == null) {
            return;
        }
        short s2 = ac.e;
        if (ac.e % 10 == 4) {
            s2 = 0;
        }
        if (s2 != 0) {
            if (ac.e < s.a[9]) return;
            if (s2 > s.a[18]) return;
            av2.a(s2 + 27 - s.a[9], (bi)av2.a);
            return;
        }
        if (n2 == s.a[7]) {
            av2.a(37, (bi)av2.a);
            return;
        }
        if (n2 != s.a[8]) return;
        av2.a(38, (bi)av2.a);
    }

    public static void a(Graphics graphics) {
        for (int i2 = a; i2 < a.size(); ++i2) {
            av av2 = (av)a.elementAt(i2);
            if (!av2.a()) continue;
            av2.a(graphics);
        }
        au.a().a(graphics);
    }

    public static boolean a(int n2) {
        return f.a(n2 * 1000, false, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(int n2, boolean bl2, boolean bl3) {
        int n3 = a.size() - 1;
        while (n3 >= 0) {
            av av2 = (av)a.elementAt(n3);
            if (av2 != null && av2.a == n2) {
                if (bl2) {
                    av2.a(false);
                    return true;
                }
                if (bl3) {
                    av2.c();
                }
                a.removeElementAt(n3);
                System.gc();
                return true;
            }
            --n3;
        }
        return false;
    }

    public static av b(int n2) {
        return f.a(n2, (byte)3, new av(0, 0, 0, -1));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean b(int n2) {
        switch (n2) {
            default: {
                return true;
            }
            case 1: 
            case 3: 
            case 6: 
            case 16: 
            case 28: 
            case 29: 
            case 30: 
            case 48: 
            case 50: 
            case 66: 
            case 90: 
            case 93: 
            case 103: 
        }
        return false;
    }

    public static void cinitclone() {
        a = 0;
        a = new Vector(5);
    }
}

