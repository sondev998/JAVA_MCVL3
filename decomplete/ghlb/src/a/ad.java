/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Static;
import a.a;
import a.aa;
import a.ac;
import a.af;
import a.al;
import a.an;
import a.ap;
import a.ar;
import a.au;
import a.av;
import a.aw;
import a.ax;
import a.ay;
import a.b;
import a.ba;
import a.bb;
import a.bc;
import a.bf;
import a.bi;
import a.bk;
import a.bl;
import a.bn;
import a.d;
import a.e;
import a.f;
import a.g;
import a.h;
import a.j;
import a.k;
import a.m;
import a.n;
import a.q;
import a.r;
import a.s;
import a.t;
import a.u;
import a.w;
import a.x;
import a.z;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ad {
    public static ad a;
    public static int b;
    public static Vector[] b;
    public static String c;
    public static int menu;
    public byte a;
    public int a;
    public long a;
    public au a;
    private bb a;
    public w a;
    public String a;
    public Vector a;
    public af[] a;
    String[] a;
    public Vector[] a = "";
    private long b;
    public String b;
    public Vector b = "";
    private int c;
    public Vector c = new Vector(5);
    public Vector d = new Vector(5);
    public Vector e = new Vector(5);
    public Vector f = new Vector();
    public Vector g = new Vector();
    public Vector h = new Vector(5);
    public Vector i = new Vector(5);
    public Vector j;
    public Vector k;
    public Vector l;

    static {
        Static.regClass(4);
        ad.cinitclone();
    }

    public ad() {
        this.a = new Vector[10];
        this.a = bb.a();
    }

    private int a(int n2, int n3) {
        return ((af[])b[3].elementAt(n2 - 36021))[n3].b();
    }

    public static ad a() {
        if (a == null) {
            a = new ad();
        }
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bf a(int n2, boolean bl2) {
        if (n2 == 0) return new bf(5610000);
        if (n2 == 100) {
            return new bf(5610000);
        }
        if (n2 >= 11 && n2 <= 17) {
            return bc.a(n2 - 11 + 4100, bl2);
        }
        if (n2 < 14) {
            return bc.a(n2 - 1 + 4200, bl2);
        }
        if (n2 == 18) {
            return bc.a(n2 - 8 + 4200, bl2);
        }
        if (n2 == 19) {
            return bc.a(4100, bl2);
        }
        if (n2 == 20) {
            return bc.a(n2 - 9 + 4200, bl2);
        }
        if (n2 == 14) {
            return bc.a(3300, bl2);
        }
        if (n2 >= 20) return bc.a(n2 % 1000000, bl2);
        return new bf(5610000);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String a(int n2, Vector object) {
        int n3 = ((Vector)object).size();
        int n4 = 0;
        while (n4 < n3) {
            af[] afArray = (af[])((Vector)object).elementAt(n4);
            if (afArray[0].b() == n2) {
                return afArray[1].toString();
            }
            ++n4;
        }
        return "";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Vector a(av object) {
        if (!((object = ((av)object).a(2)) instanceof Vector)) return null;
        if (((Vector)object).size() <= 0) return null;
        return (Vector)object;
    }

    private Vector a(Vector vector, String string) {
        if (vector.size() >= 50) {
            vector.removeElementAt(0);
        }
        vector.addElement(string);
        return vector;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, int n3) {
        n2 = 320001;
        if (n3 < 320001 || n3 > 339999) {
            n2 = n3;
        }
        switch (n2) {
            case 319501: 
            case 319502: 
            case 319503: 
            case 319504: 
            case 320001: {
                this.a.a(null, 2804, n3);
                return;
            }
            case 319531: {
                z.a().a(1521, (af)new ba(13), new an(n3));
                return;
            }
            case 319532: {
                this.a.a(null, 2812, n3);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, Vector vector) {
        switch (n2) {
            case 145: {
                this.k = vector;
                return;
            }
            case 146: {
                this.l = vector;
                return;
            }
            case 93: {
                this.a = vector;
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(int n2, boolean bl2) {
        ba ba2 = new ba((new short[]{2021, 2001, 2000, 2004, 2003, 2000, 2022, 2017})[n2]);
        n2 = bl2 ? 1 : 0;
        t t2 = new t((byte)n2);
        z.a().a(1528, (af)new t(1), new af[]{ba2, t2});
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(av g2, int n2, int n3, int n4, int n5) {
        String[] stringArray;
        String[] stringArray2 = null;
        switch (((av)g2).a / 1000) {
            case 93: {
                if (s.f != 122) return;
                stringArray = new String[]{s.b[14], s.a[94], s.a[33], s.a[110]};
                break;
            }
            default: {
                return;
            }
            case 145: {
                stringArray = stringArray2;
                switch (n2) {
                    default: {
                        stringArray = stringArray2;
                        break;
                    }
                    case 5: {
                        stringArray = new String[]{s.a[148]};
                        ((av)g2).a(new StringBuffer().append("Xung quanh").append(stringArray[0]).toString());
                        break;
                    }
                    case 0: {
                        ((av)g2).a(s.b[4]);
                        stringArray = new String[]{s.d[175], s.d[169], s.a[33], s.a[80], s.a[120]};
                        break;
                    }
                    case 1: 
                    case 3: {
                        stringArray = new String[]{s.a[75], s.a[76]};
                        break;
                    }
                    case 2: {
                        if (n3 == 0) {
                            ((av)g2).a(s.b[0]);
                            stringArray = new String[]{s.a[9], s.a[10], s.b[10]};
                            break;
                        }
                        ((av)g2).a(s.a[50]);
                        stringArray = new String[]{s.b[43], s.b[44], s.b[45], s.b[46]};
                    }
                    case 4: {
                        break;
                    }
                    case 6: {
                        ((av)g2).a("C\u1eeda h\u00e0ng \u0111\u1eb7c bi\u1ec7t");
                        ((av)g2).c(145003);
                        ((av)g2).c(145007);
                        ((av)g2).f(145003);
                        stringArray = stringArray2;
                        break;
                    }
                }
                break;
            }
            case 146: {
                ((av)g2).a(s.a[69]);
                switch (n2) {
                    default: {
                        return;
                    }
                    case 0: {
                        stringArray = new String[]{s.d[175], s.a[69], s.a[111]};
                        break;
                    }
                }
                break;
            }
            case 12: {
                stringArray = n2 == 1 || n2 == 6 ? new String[]{s.a[85]} : new String[]{s.a[85], "B\u1ea1n th\u00f9"};
                break;
            }
            case 33: {
                stringArray = n2 % 10 == 0 ? (n2 / 10 == 1 ? new String[]{s.b[198].substring(2, 4), s.a[15], s.b[78]} : (ay.a.b() <= 4 ? new String[]{s.a[103], s.a[122], s.b[76], s.b[77], s.b[75]} : new String[]{s.a[103], s.a[122], s.b[76], s.b[75]})) : new String[]{s.a[103]};
                break;
            }
            case 38: {
                if (((av)g2).e.equals(new StringBuffer().append("\u203b").append(s.b[159]).append("\u203b").toString())) {
                    ((av)g2).d(38004);
                    stringArray = ay.a.d() == 0 ? new String[]{"Trang vi\u00ean"} : new String[]{"Trang vi\u00ean", "Th\u0103m b\u1ea1n"};
                } else {
                    stringArray = new String[]{s.a[72], s.a[18]};
                }
                break;
            }
            case 39: {
                if (n2 == 1) {
                    stringArray = new String[]{s.b[199], s.d[118], s.a[69], s.a[143]};
                    break;
                } else {
                    if (n2 != 0) return;
                    stringArray = new String[]{s.a[73], s.d[169], s.a[94]};
                }
            }
        }
        if (stringArray == null) return;
        g2 = (h)((av)g2).a(n5);
        ((h)g2).a(stringArray);
        ((h)g2).a(n4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(av av2, q q2, Vector vector, int n2) {
        af[] afArray = (af[])vector.elementAt(0);
        long l2 = 100000L - (System.currentTimeMillis() - ((d)afArray[4]).a);
        if (l2 <= 0L) {
            vector.removeElementAt(0);
            return;
        }
        ar ar2 = new ar("", 0, 0);
        ar2.d = afArray[0].b();
        ar2.e = afArray[1].b();
        ar2.a(bc.b(afArray[3].b()));
        ar2.b(ar2.e);
        q2.a(ar2, 0);
        q2.a(new ar(afArray[2].toString(), al.a((long)ar2.e, 0), 0), 1);
        ((ar)av2.a((int)n2)).m = (int)(l2 / 1000L * 10L + 3L);
        vector.removeElementAt(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(av av2, boolean bl2) {
        if (av2 == null) {
            return;
        }
        if (a.g.a.length > av2.a / 1000 && av2.a / 1000 > 0) {
            a.g.a[av2.a / 1000] = 0;
        }
        av2.c = 0;
        av2.d = 0;
        if (!bl2) return;
        av2.v = 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(ax ax2) {
        if (ax2.c() % 10 > 0) {
            a.f.a("Th\u00fa c\u01b0\u1ee1i kh\u00f4ng th\u1ec3 giao d\u1ecbch!");
            return;
        }
        a.f.a(s.d[393]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2, int n3) {
        boolean bl2 = false;
        if (n3 == 2) {
            if (!w.c) {
                a.f.a(s.d[395], "", 3030, -1, false, ap.a(), null);
                return bl2;
            }
            if (ay.a(n2) == null) {
                a.f.a(s.d[473]);
                return bl2;
            }
            z.a().a(1157, (af)new ba(2), (af)new an(ay.a.a()), new an(n2));
            return true;
        }
        if (n3 != 1) return bl2;
        z.a().a(1056, (af)new ba(1), new an(n2));
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(av g2, int n2, int n3) {
        if (((av)g2).f() != 20004) return false;
        q q2 = (q)((av)g2).a(20004);
        int n4 = q2.h();
        int n5 = q2.f() - 1;
        while (n5 >= 0) {
            void var3_5;
            void var2_4;
            g g3 = q2.a(n5 * n4);
            if (g3 != null && g3.d == var2_4 && g3.b == var3_5) {
                return true;
            }
            --n5;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(bc bc2, int n2) {
        boolean bl2 = true;
        if (bc2.d == 1) {
            a.f.a(new StringBuffer().append(bc2.a).append(s.d[638]).toString());
            return bl2;
        }
        if (n2 != 4 && n2 != 5 && (bc2.d == 2 || bc2.d == 3)) {
            a.f.a(new StringBuffer().append(bc2.a).append(s.d[639]).toString());
            return bl2;
        }
        if ((n2 == 1 || n2 == 2) && (bc2.e & 4) != 0) {
            a.f.a(s.d[308]);
            return bl2;
        }
        if (n2 == 3 && (bc2.e & 0x100) != 0) {
            a.f.a(s.d[595]);
            return bl2;
        }
        if (n2 != 5) return false;
        if ((bc2.e & 8) == 0) return false;
        a.f.a(s.d[590]);
        return bl2;
    }

    private boolean a(StringBuffer stringBuffer, int n2) {
        al.a(stringBuffer, "#(");
        al.a(stringBuffer, (long)n2);
        al.a(stringBuffer, ",0p)");
        return true;
    }

    private boolean a(StringBuffer stringBuffer, int n2, int n3, String string) {
        Object object = ay.a(n2, -1);
        if (n3 > 0 && ((Vector)object).size() > 0 && n3 <= ((Vector)object).size()) {
            object = (bc)((Vector)object).elementAt(((Vector)object).size() - n3);
            al.a(stringBuffer, "#(");
            al.a(stringBuffer, (long)((bc)object).g);
            al.a(stringBuffer, ",");
            al.a(stringBuffer, (long)((bc)object).a);
            al.a(stringBuffer, "a)");
            al.a(stringBuffer, al.a((long)((bc)object).a(), ((bc)object).f));
            al.a(stringBuffer, ((bc)object).a);
            al.a(stringBuffer, string);
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(StringBuffer stringBuffer, Vector object, int n2, String string) {
        if (n2 <= 0) return false;
        if (((Vector)object).size() <= 0) return false;
        if (n2 > ((Vector)object).size()) return false;
        object = (ax)((Vector)object).elementAt(((Vector)object).size() - n2);
        al.a(stringBuffer, "#(");
        al.a(stringBuffer, (long)((m)object).g(9));
        al.a(stringBuffer, ",");
        al.a(stringBuffer, (long)((ax)object).a());
        al.a(stringBuffer, "j)*0");
        al.a(stringBuffer, ((ax)object).a());
        al.a(stringBuffer, string);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(av av2, Object stringArray) {
        if (stringArray instanceof ax) {
            if (((ax)stringArray).b() != 1) {
                this.j(av2);
                return;
            }
            if (s.f == 70) {
                this.a((ax)stringArray);
                return;
            }
            a.f.a(new StringBuffer().append(s.d[543]).append(s.b[8]).toString(), "", (int)(av2.a + 2), -1, false, av2, null);
            return;
        }
        Object object = (bc)stringArray;
        int n2 = s.f == 20 ? 1 : (s.f == 70 ? 2 : 3);
        if (ad.a((bc)object, n2)) return;
        if (s.f == 104 && (((bc)stringArray).e & 0x200) != 0 || s.f == 20 && (((bc)stringArray).e & 0x20) != 0) {
            object = al.a(null, "*2");
            al.a((StringBuffer)object, ((bc)stringArray).a);
            stringArray = s.d;
            n2 = s.f == 104 ? 596 : 592;
            al.a((StringBuffer)object, stringArray[n2]);
            a.f.a(((StringBuffer)object).toString(), "", (int)(av2.a + 2), -1, false, av2, null);
            return;
        }
        if (((bc)stringArray).a > 1 && (((bc)stringArray).e & 0x80) != 0) {
            if ((av2 = a.f.a(s.d[193], s.d[194], (int)(av2.a + true), -1, true, av2, null)) == null) return;
            ((n)av2.a(1003)).b(3);
            return;
        }
        this.j(av2);
    }

    private void b(String string, av av2) {
        int n2 = this.i.size();
        int n3 = 0;
        while (true) {
            block5: {
                block4: {
                    if (n3 >= n2) break block4;
                    if (!string.equals((String)this.i.elementAt(n3))) break block5;
                    this.i.removeElementAt(n3);
                    this.i.removeElementAt(n3);
                    n3 /= 2;
                    while (n3 < this.a.length - 1) {
                        this.a[n3] = this.a[n3 + 1];
                        ++n3;
                    }
                    this.a[this.a.length - 1] = new Vector();
                    q.a(av2, 21013, -1, "");
                }
                return;
            }
            n3 += 2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String c(int n2) {
        switch (n2) {
            default: {
                return "*0";
            }
            case 7: 
            case 2026: {
                return "*2";
            }
            case 1: 
            case 2001: {
                return "*3";
            }
            case 2: 
            case 2003: {
                return "*6";
            }
            case 3: 
            case 2004: {
                return "*7";
            }
            case 4: 
            case 2000: {
                return "*4";
            }
            case 6: 
            case 2017: 
        }
        return "*5";
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(av av2, int n2, boolean bl2) {
        int n3 = 0;
        while (n3 < 5) {
            if (bl2) {
                av2.c(n3 + n2, false);
            } else {
                av2.c(n3 + n2);
            }
            ++n3;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(av av2, Object object) {
        Object object2;
        block6: {
            block5: {
                int n2;
                block3: {
                    block4: {
                        if (av2 == null) {
                            return;
                        }
                        object2 = a.f.a(57);
                        if (object2 == null) return;
                        n2 = ((av)object2).f();
                        if (n2 != 57004) break block3;
                        n2 = ((av)object2).b(0).b();
                        if (n2 != 2878) break block4;
                        if (((ax)object).b() >= 20) break block5;
                        String string = s.d[540];
                        object2 = string;
                        if (((ax)object).c() % 10 > 0) {
                            object2 = al.a(string, s.a[69], s.a[111]);
                        }
                        break block6;
                    }
                    if (n2 != 2826 || ((bc)object).a() % 100000 / 10000 != 9) break block5;
                    object2 = s.d[533];
                    break block6;
                }
                object2 = n2 == 57006 && ((av)object2).b(0).b() == 2878 && ((ax)object).a() == av.a((av)object2, (int)57004, (int)1000).e ? s.d[542] : null;
            }
            object2 = null;
        }
        if (object2 != null) {
            a.f.a((String)object2);
            return;
        }
        this.j(av2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(av av2, int n2) {
        q q2 = (q)av2.a(n2);
        if (!q2.a()) return false;
        q q3 = (q)av2.a(n2 + 10);
        q3.a(q2.a(0), 0);
        q3.a(q2.a(1), 1);
        ((ar)av2.a((int)(n2 + 13))).m = ((ar)av2.a((int)(n2 + 3))).m;
        return true;
    }

    public static void cinitclone() {
        b = 30000;
    }

    /*
     * Enabled aggressive block sorting
     */
    private q d(av object, String object2, int n2, Vector vector) {
        boolean bl2 = vector != null && vector.size() > 0;
        if (!av.a((av)object, n2, n2, bl2)) return null;
        object2 = (q)((av)object).a(n2);
        int n3 = vector.size();
        int n4 = ((q)object2).h();
        ((q)object2).b(n3 * n4, false);
        n2 = 0;
        while (true) {
            object = object2;
            if (n2 >= n3) return object;
            Object[] objectArray = (Object[])vector.elementAt(n2);
            object = new ar("", 0, 0);
            ((ar)object).a((bf)objectArray[0]);
            ((ar)object).d = ((af)objectArray[1]).b();
            ((ar)object).e = 0;
            ((q)object2).a((g)object, n2 * n4);
            ((q)object2).a(new ar(objectArray[2].toString(), s.a[0], 0), n2 * n4 + 1);
            ++n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String d(int n2) {
        int n3 = n2;
        if (n2 == -1) {
            n3 = ap.r;
        }
        switch (n3) {
            default: {
                return "";
            }
            case 0: {
                return s.d[425];
            }
            case 1: {
                return s.d[426];
            }
            case 2: {
                return s.d[427];
            }
            case 3: 
        }
        return s.d[422];
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void d() {
        m m2 = m.a();
        if (m2 == null) return;
        switch (m2.j) {
            case 64: {
                bb.a().a(m2);
                return;
            }
            case 8: {
                String string = ((bk)m2).b();
                if (string == null) return;
                au.a().a(string, null);
                return;
            }
            case 2: {
                w w2 = w.a();
                int n2 = ((ax)m2).s() == ay.a.a() ? 0 : 10;
                w2.a(null, n2, 0, m2.c);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private q e(av object, String object2, int n2, Vector vector) {
        boolean bl2 = vector != null && vector.size() > 0;
        if (!av.a((av)object, n2, n2, bl2)) return null;
        object2 = (q)((av)object).a(n2);
        int n3 = vector.size();
        int n4 = ((q)object2).h();
        ((q)object2).b(n3 * n4, false);
        n2 = 0;
        while (true) {
            object = object2;
            if (n2 >= n3) return object;
            af[] afArray = (af[])vector.elementAt(n2);
            object = new ar("", 0, 0);
            ((ar)object).d = afArray[0].b();
            ((ar)object).e = afArray[3].b();
            ((ar)object).a(bc.b(afArray[1].b()));
            ((q)object2).a((g)object, n2 * n4);
            ((q)object2).a(new ar(afArray[2].toString(), s.a[0], 0), n2 * n4 + 1);
            ++n2;
        }
    }

    private String e(int n2) {
        int n3 = n2;
        if (n2 == -1) {
            n3 = ap.q;
        }
        StringBuffer stringBuffer = al.a(null, s.d[483]);
        al.a(stringBuffer, (long)n3);
        al.a(stringBuffer, s.d[109]);
        return stringBuffer.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e(int n2, av av2) {
        r r2 = (r)av2.a(n2);
        int n3 = r2.f();
        if (n3 == 0) {
            n3 = 1;
            av2.c(n2);
            n2 = n3;
        } else {
            av2.b(n2);
            n2 = n3;
        }
        r2.a(0, n2);
        r2.n = 0;
        r2.m = 0;
        n2 = r2.b;
        av2.v = r2.h + n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void i(av av2, int n2) {
        int n3 = n2;
        if (n2 < 1) {
            n3 = 1;
        }
        Vector<String> vector = new Vector<String>();
        int n4 = 1;
        n2 = 1;
        while (true) {
            int n5;
            block10: {
                block9: {
                    n5 = n2;
                    if (n4 > 0x400000) break block9;
                    n5 = n2;
                    if ((n3 & n4) == 0) break block10;
                    if (n4 == 1024 && (n3 & 1) == 0) {
                        vector.addElement(bc.a(1));
                        n2 = 1024;
                    } else {
                        vector.addElement(bc.a(n4));
                    }
                    n5 = n2;
                    if (n3 != n4) break block10;
                    n5 = n2;
                }
                av2.b(0).a(n5);
                n3 = vector.size();
                String[] stringArray = new String[n3];
                n2 = 0;
                while (true) {
                    if (n2 >= n3) {
                        ((h)av2.a(93006)).a(stringArray);
                        return;
                    }
                    stringArray[n2] = (String)vector.elementAt(n2);
                    ++n2;
                }
            }
            n4 *= 2;
            n2 = n5;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void A(av av2) {
        String string = this.a.a(10);
        g g2 = av.a(av2, 51006, 1000);
        if (string.equals(s.a[3])) {
            this.a(g2.d, g2.e / 1000);
            return;
        }
        if (string.equals(s.a[2])) {
            z.a().a(1032, (af)new t(8), (af)new an(g2.e), new t(0));
            return;
        }
        if (string.equals(s.a[27])) {
            z.a().a(1032, new t(9), new an(0), new an(g2.e), new an(0), new an(av2.b(0).b()));
            return;
        }
        if (!string.equals(s.a[95])) return;
        this.h(null, 1);
    }

    public void B(av g2) {
        av av2 = g2;
        if (g2 == null) {
            av2 = a.f.b(18);
        }
        g2 = (q)av2.a(18003);
        ((q)g2).a(new ar("Trang b\u1ecb \u0111ang ch\u1ecdn", s.a[3], 0), 0);
        ((q)g2).a(new ar("Trang b\u1ecb hi\u1ec7n t\u1ea1i", s.a[2], 0), 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void C(av g2) {
        String string = this.a.a(10);
        if (((av)g2).f() == 38004) {
            Object object = (ar)av.a((av)g2, ((av)g2).f(), 1000);
            if (object == null) {
                return;
            }
            if (((ar)object).a().equals("V\u00e0o trang vi\u00ean")) {
                z.a().a(1312, (af)new ba(13), new an(ay.a.a()));
            } else if (((ar)object).a().equals("M\u1edf trang vi\u00ean")) {
                z.a().a(1312, (af)new ba(12), new an(ay.a.a()));
            } else if (string.equals(s.a[2])) {
                z.a().a(1303, (af)new t(1), new an(((ar)object).d));
            } else if (string.equals(s.a[12])) {
                this.a(((ar)object).a(), "");
            } else {
                String string2 = s.a[2];
                string = s.a[12];
                object = this.a;
                bb.a(new String[]{string2, string}, (av)g2);
            }
        }
        if (((av)g2).f() != 38003) return;
        ar ar2 = (ar)av.a((av)g2, ((av)g2).f(), 1000);
        if (ar2 == null) return;
        z.a().a(1312, (af)new ba(13), new an(ar2.d));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void D(av g2) {
        g g3 = g2;
        if (g2 == null) {
            g3 = a.f.b(17);
            ((av)g3).a(s.b[140]);
        }
        int n2 = 17005;
        while (n2 <= 17008) {
            g2 = (q)((av)g3).a(n2);
            if (n2 == 17005) {
                ((q)g2).a(new ar(this.b(ap.a[3].b()), s.a[0], 0), 0);
            } else if (n2 == 17007) {
                ((q)g2).a(new ar(this.b(ap.a[7].b()), s.a[0], 0), 0);
            } else if (n2 == 17006 || n2 == 17008) {
                ar ar2 = new ar("", 0, 0);
                ((q)g2).a(new ar("[", s.a[0], 0), 0);
                ((q)g2).a(new ar("]", s.a[0], 0), 3);
                if (n2 == 17006) {
                    ((q)g2).a(new ar(ap.a[1].toString(), s.a[0], 0), 2);
                    ar2.a(ad.a(ap.a[0].b(), false));
                } else {
                    ((q)g2).a(new ar(ap.a[5].toString(), s.a[0], 0), 2);
                    ar2.a(ad.a(ap.a[4].b(), false));
                }
                ((q)g2).a(ar2, 1);
            }
            ++n2;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void E(av av2) {
        int n2 = av2.f();
        if (n2 == 17005 || n2 == 17007) {
            String string = s.d[90];
            String string2 = s.d[91];
            String string3 = s.d[92];
            String string4 = s.d[93];
            String string5 = s.d[94];
            bb bb2 = this.a;
            bb.a(new String[]{string, string2, string3, string4, string5}, av2);
            return;
        }
        if (n2 != 17006) {
            if (n2 != 17008) return;
        }
        this.a(8, av2, 0, null, -1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void F(av g2) {
        int n2 = ((av)g2).f();
        g g3 = av.a((av)g2, n2, 1000);
        int n3 = this.a.a(0);
        String string = this.a.a(10);
        ((ar)g3).a(string);
        if (n2 == 17005) {
            ap.a[3] = new an(n3);
            return;
        }
        if (n2 != 17007) return;
        ap.a[7] = new an(n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void G(av av2) {
        Vector vector = ((h)av2.a(122004)).f() == 0 ? ay.v : ay.w;
        int n2 = vector.size();
        q q2 = (q)av2.a(122005);
        int n3 = q2.h();
        q2.b(n2 * n3, false);
        int n4 = 0;
        while (true) {
            if (n4 >= n2) {
                av2.f(122005);
                return;
            }
            af[] afArray = (af[])vector.elementAt(n4);
            int n5 = a.h.g(afArray[1].b());
            ar ar2 = new ar("", 0, 0);
            ar2.d = afArray[0].b();
            if (afArray[2].toString().equals("Ki\u1ec3m tra")) {
                ar2.d = 18;
            }
            ar2.a(ad.a(ar2.d, false));
            q2.a(ar2, n5 * n3);
            q2.a(new ar(afArray[2].toString(), s.a[6], 0), n5 * n3 + 1);
            q2.a(new ar(a.h.a(afArray[1].b()), s.a[0], 0), n5 * n3 + 3);
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void H(av av2) {
        int n2 = av2.f();
        if (n2 == 122004) {
            this.G(av2);
            return;
        }
        if (n2 != 122005) {
            if (n2 != 122006) return;
            a.f.a("C\u00f3 chuy\u1ec3n ph\u00edm v\u1ec1 tr\u1ea1ng th\u00e1i m\u1eb7c \u0111\u1ecbnh kh\u00f4ng?", "", (int)(av2.a + 2), -1, false, av2, null);
            return;
        }
        if (((q)av2.a(122005)).i() == 8) return;
        Vector[] vectorArray = new Vector[]{new Vector(), new Vector(), new Vector()};
        n2 = ((h)av2.a(122004)).f();
        if (n2 == 0 || n2 == 1) {
            String[] stringArray = new String[]{s.a[106], s.a[63], s.a[69], s.a[31], s.a[22], s.a[81], s.a[24], s.b[54], s.b[79], s.a[58], new StringBuffer().append(s.a[87]).append("Ng\u1eabu nhi\u00ean").toString(), new StringBuffer().append(s.a[87]).append("B\u1ea1n").toString(), new StringBuffer().append(s.a[87]).append("\u0110\u1ecbch").toString(), s.b[32], s.b[33], s.b[34], s.b[35], s.a[2], s.b[36], s.b[37]};
            for (n2 = 0; n2 < stringArray.length; ++n2) {
                if (n2 < 10) {
                    vectorArray[0].addElement(new Object[]{bc.a(n2 + 4200), new an(n2 + 1), stringArray[n2]});
                    continue;
                }
                if (n2 > 9 && n2 < 12) {
                    vectorArray[0].addElement(new Object[]{bc.a(n2 - 10 + 4100), new an(n2 + 1), stringArray[n2]});
                    continue;
                }
                if (n2 == 19) {
                    vectorArray[0].addElement(new Object[]{bc.a(n2 - 8 + 4200), new an(n2 + 1), stringArray[n2]});
                    continue;
                }
                if (n2 == 18) {
                    vectorArray[0].addElement(new Object[]{bc.a(4100), new an(n2 + 1), stringArray[n2]});
                    continue;
                }
                if (n2 == 17) {
                    vectorArray[0].addElement(new Object[]{bc.a(n2 - 7 + 4200), new an(n2 + 1), stringArray[n2]});
                    continue;
                }
                vectorArray[0].addElement(new Object[]{bc.a(n2 - 10 + 4100), new an(n2 + 1), stringArray[n2]});
            }
            int n3 = ay.h.size();
            for (n2 = 0; n2 < n3; ++n2) {
                af[] afArray = (af[])ay.h.elementAt(n2);
                if (afArray[9].b() != 0) continue;
                Vector vector = vectorArray[1];
                an an2 = new an(9000000 + afArray[4].b());
                af af2 = afArray[4];
                af af3 = afArray[0];
                int n4 = afArray[1].b();
                vector.addElement(new af[]{an2, af2, af3, new an(afArray[2].b() + n4 * 1000)});
            }
            vectorArray[2] = this.a.f;
        }
        this.a(av2, new String[]{s.b[9], s.a[2]}, vectorArray);
    }

    public int a() {
        int n2 = this.i.size() / 2;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((String)this.i.elementAt(i2 * 2 + 1)).equals("0")) continue;
            ++n3;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(int n2) {
        switch (n2) {
            default: {
                return 0;
            }
            case 0: {
                return 2021;
            }
            case 1: {
                return 2001;
            }
            case 2: {
                return 2003;
            }
            case 3: {
                return 2004;
            }
            case 4: {
                return 2000;
            }
            case 6: 
        }
        return 2017;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(av av2, int n2) {
        int n3 = 1970000000;
        int n4 = bc.a(this.a(av2, n2));
        if (n4 == -1) {
            return n3;
        }
        if (n4 < 256) {
            return 1930000000;
        }
        if (n4 < 1024) {
            return 1950000000;
        }
        if (n4 < 65536) {
            return 1940000000;
        }
        if (n4 <= 262144) {
            return 1960000000;
        }
        n2 = n3;
        if (n4 <= 0x400000) return n2;
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(av g2, bc bc2) {
        if ((bc2.e & 0x80) == 0) {
            return 0;
        }
        if (g2 == null) return bc2.a;
        if (((av)g2).f() != 20004) {
            return bc2.a;
        }
        g2 = (q)((av)g2).a(20004);
        int n2 = ((q)g2).h();
        int n3 = bc2.a;
        int n4 = ((q)g2).f() - 1;
        while (true) {
            int n5 = n3;
            if (n4 < 0) return n5;
            g g3 = ((q)g2).a(n4 * n2);
            n5 = n3;
            if (g3 != null) {
                n5 = n3;
                if (g3.d == 32) {
                    n5 = n3;
                    if (g3.b == bc2.a) {
                        n5 = n3 - g3.c;
                    }
                }
            }
            --n4;
            n3 = n5;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public av a(int n2, av av2, int n3, String[] stringArray, int n4) {
        av av3 = a.f.a(93);
        if (av3 != null) {
            av3.c();
        } else {
            av3 = a.f.b(93);
        }
        s.f = av2 == null ? 93 : av2.a() / 1000;
        if ((n2 & 0x20) != 0) {
            z.a().a(1009, new ba(78));
        }
        this.a = stringArray;
        av3.a(93005, 2, 0, ((q)av3.a(93005)).f(), null);
        if ((n3 & 1) != 0) {
            ((h)av3.a(93006)).d();
            av3.c(93006);
            return av3;
        }
        this.i(av3, n2);
        this.a(av3, 93005, 93006, n3, -1, n4);
        return av3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public av a(av object) {
        void var2_41;
        void var5_21;
        Object object2;
        Object object3;
        int n2;
        Object object4;
        block15: {
            void var1_5;
            void var1_3;
            block14: {
                object4 = object;
                if (object == null) {
                    object4 = a.f.b(23);
                }
                n2 = ((h)((av)object4).a(23008)).f();
                switch (n2) {
                    default: {
                        String[] stringArray = new String[]{new StringBuffer().append(s.a[20]).append(s.b[14]).toString(), new StringBuffer().append(s.b[153]).append(s.b[14]).toString(), "C\u1ef1 tuy\u1ec7t m\u1eddi", "Mini map", "Hi\u1ec3n th\u1ecb th\u01b0\u1edfng chi\u1ebfn \u0111\u1ea5u"};
                        object3 = new String[5];
                        object3[0] = "";
                        if (!w.c) break;
                        String string = s.d[74];
                        break block14;
                    }
                    case 1: {
                        void var1_9;
                        object3 = s.d[112];
                        String[] stringArray = new StringBuffer().append(s.b[15]).append(s.a[95]).toString();
                        object2 = s.b[140];
                        String[] stringArray2 = new String[4];
                        stringArray2[0] = s.b[16];
                        stringArray2[1] = s.b[16];
                        stringArray2[2] = s.b[16];
                        if ((bl.k & 0x10) == 0) {
                            String string = s.d[74];
                        } else {
                            String string = s.d[75];
                        }
                        stringArray2[3] = var1_9;
                        object3 = new String[]{object3, stringArray, object2, "T\u1ef1 \u0111\u1ed9ng ch\u1ecdn m\u1ee5c ti\u00eau g\u1ea7n"};
                        String[] stringArray3 = stringArray2;
                        Object object5 = object3;
                        break block15;
                    }
                    case 2: {
                        void var5_25;
                        void var1_13;
                        String string = s.d[430];
                        String string2 = s.d[108];
                        String string3 = new StringBuffer().append(s.d[442]).append(s.a[103]).toString();
                        String string4 = s.b[130];
                        String string5 = this.d(-1);
                        String string6 = this.e(-1);
                        if (ap.a) {
                            String string7 = s.d[74];
                        } else {
                            String string8 = s.d[75];
                        }
                        if ((bl.k & 2) == 0) {
                            String string9 = s.d[74];
                        } else {
                            String string10 = s.d[75];
                        }
                        String string11 = s.b[m.g + 110];
                        object3 = ap.c ? s.d[74] : s.d[75];
                        object2 = ap.d ? s.d[74] : s.d[75];
                        String string12 = s.b[m.g + 130];
                        String[] stringArray = new String[]{string, string2, string3, "Hi\u1ec3n th\u1ecb bang", "T\u00ean hi\u1ec7u qu\u1ea3", "Hi\u1ec3n th\u1ecb b\u1ea3ng m\u00e1u", "T\u00ean NPC", string4};
                        String[] stringArray4 = new String[]{string5, string6, var1_13, var5_25, string11, object3, object2, string12};
                        String[] stringArray5 = stringArray;
                        break block15;
                    }
                }
                String string = s.d[75];
            }
            object3[1] = var1_3;
            if (bl.e) {
                String string = s.d[74];
            } else {
                String string = s.d[75];
            }
            object3[2] = var1_5;
            object3[3] = s.d[al.a + 20];
            object3[4] = "";
            z.a().a(1056, new ba(33));
            z.a().a(1040, new t(14));
            ac.a(true, false);
            Object object6 = object3;
        }
        object3 = (q)((av)object4).a(23003);
        int n3 = ((q)object3).h();
        ((q)object3).b(((void)var5_21).length * n3, false);
        int n4 = ((void)var5_21).length - 1;
        while (var2_41 >= 0) {
            void var1_7;
            ((q)object3).a(new ar((String)var5_21[var2_41], s.a[6], 0), (int)(var2_41 * n3));
            object2 = new ar((String)var1_7[var2_41], s.a[0], 0);
            ((ar)object2).d = n2 * 100 + var2_41;
            ((q)object3).a((g)object2, (int)(var2_41 * n3 + 2));
            --var2_41;
        }
        int[] nArray = ((q)object3).b;
        ((av)object4).v = ((q)object3).h + nArray - 10;
        return object4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public av a(av g2, Vector vector, short s2) {
        g g3 = g2;
        if (g2 == null) {
            g3 = a.f.b(90);
            ((av)g3).a(0, vector);
            ((av)g3).a(1, new d(System.currentTimeMillis()));
            ((av)g3).a(2, new ba(s2));
        }
        vector = (Vector)((av)g3).a(0);
        int n2 = vector.size();
        int[] nArray = new int[]{90024, 90014, 90004};
        if (n2 > 0) {
            n2 = 0;
            while (true) {
                g2 = g3;
                if (n2 >= nArray.length) return g2;
                g2 = (q)((av)g3).a(nArray[n2]);
                if (!g2.a()) {
                    this.a((av)g3, (q)g2, vector, nArray[n2] + 3);
                    this.c((av)g3, nArray[n2] - 1, true);
                    ((av)g3).d(nArray[n2]);
                    if (vector.size() == 0) {
                        return g3;
                    }
                }
                ++n2;
            }
        }
        a.f.a(90);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public av a(av av2, String[] stringArray, Object object) {
        av av3 = a.f.a(93);
        if (av3 != null) {
            av3.c();
        } else {
            av3 = a.f.b(93);
        }
        s.f = av2.a() / 1000;
        this.a = stringArray;
        av3.a(5, object);
        ad.a(av3, 0, 0, 0, 93006);
        av3.a(93005, 2, 0, ((q)av3.a(93005)).f(), null);
        this.a(av3, 93005, 93006, 0, -1, -1);
        return av3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public av a(String string) {
        int n2;
        av av2 = a.f.b(21);
        h h2 = (h)av2.a(21007);
        String[] stringArray = w.b() > 0 && ay.a.b() != 0 ? new String[]{s.b[13], s.a[12], s.a[22], s.b[27], s.a[77], s.a[116], s.b[169]} : (ay.a.b() != 0 ? new String[]{s.b[13], s.a[12], s.b[27], s.a[77], s.a[116], s.b[169]} : (w.b() > 0 ? new String[]{s.b[13], s.a[12], s.a[22], s.a[77], s.a[116], s.b[169]} : new String[]{s.b[13], s.a[12], s.a[77], s.a[116], s.b[169]}));
        h2.a(stringArray);
        if (string != null) {
            for (n2 = 0; n2 < stringArray.length; ++n2) {
                if (!stringArray[n2].equals(string)) {
                    continue;
                }
                break;
            }
        } else {
            n2 = 0;
        }
        if (n2 < h2.m) {
            h2.a(n2);
        }
        this.a(0, h2.a(), 0, av2);
        return av2;
    }

    public ax a(boolean bl2) {
        return (ax)this.a(a.f.a(93), 93006, 93005, this.a, bl2);
    }

    public bc a(boolean bl2) {
        return (bc)this.a(a.f.a(93), 93006, 93005, this.a, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public q a(av g2, int n2, Vector vector) {
        boolean bl2 = vector != null && vector.size() > 0;
        if (!av.a((av)g2, n2, n2, bl2)) return null;
        Vector vector2 = ((av)g2).a / 1000 == 93 ? this.a((av)g2) : null;
        q q2 = (q)((av)g2).a(n2);
        int n3 = vector.size();
        int n4 = q2.h();
        q2.b(n3 * n4, false);
        n2 = 0;
        while (true) {
            g2 = q2;
            if (n2 >= n3) return g2;
            af[] afArray = (af[])vector.elementAt(n2);
            g2 = new ar("", 0, 0);
            ((ar)g2).a(bc.b(afArray[4].b()));
            ((ar)g2).e = afArray[1].b();
            q2.a(g2, n2 * n4);
            q2.a(new ar(afArray[0].toString(), s.a[0], 0), n2 * n4 + 1);
            if (vector2 != null) {
                q2.a(new ar(this.a(((ar)g2).d, vector2), s.a[0], 0), n2 * n4 + 2);
            }
            ++n2;
        }
    }

    /*
     * Unable to fully structure code
     */
    public q a(av var1_1, String var2_2, int var3_3) {
        block21: {
            block13: {
                block20: {
                    block14: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block15: {
                                            block12: {
                                                block11: {
                                                    switch (var1_1.a() / 1000) lbl-1000:
                                                    // 3 sources

                                                    {
                                                        default: lbl-1000:
                                                        // 3 sources

                                                        {
                                                            while (true) {
                                                                var1_1 = null;
lbl5:
                                                                // 12 sources

                                                                return var1_1;
                                                            }
                                                        }
                                                        case 45: {
                                                            var1_1 = this.a.a((av)var1_1);
                                                            ** GOTO lbl5
                                                        }
                                                        case 93: {
                                                            if (s.f != 122) ** GOTO lbl-1000
                                                            if (!var2_2.equals(s.b[14])) ** GOTO lbl15
                                                            var1_1 = this.d((av)var1_1, var2_2, var3_3, ((Vector[])var1_1.a(5))[0]);
                                                            ** GOTO lbl5
lbl15:
                                                            // 1 sources

                                                            if (!var2_2.equals(s.a[94])) ** GOTO lbl18
                                                            var1_1 = this.e((av)var1_1, var2_2, var3_3, ((Vector[])var1_1.a(5))[1]);
                                                            ** GOTO lbl5
lbl18:
                                                            // 1 sources

                                                            if (!var2_2.equals(s.a[110])) ** GOTO lbl-1000
                                                            var1_1 = this.e((av)var1_1, var2_2, var3_3, ((Vector[])var1_1.a(5))[2]);
                                                            ** GOTO lbl5
                                                        }
                                                        case 145: 
                                                    }
                                                    var5_4 = var1_1.b(0).b();
                                                    if (var5_4 != 0) break block11;
                                                    var3_3 = 0;
lbl25:
                                                    // 4 sources

                                                    while (true) {
                                                        if (var3_3 == 0) ** GOTO lbl-1000
                                                        ((q)var1_1.a(145005)).d();
                                                        var1_1.c(145005);
                                                        ac.a(true, false);
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                if (var5_4 != 1) break block12;
                                                if (!var2_2.equals(s.a[76])) break block13;
                                                var6_5 = this.a;
                                                this.k = w.a;
                                                var1_1 = this.a((av)var1_1, var2_2, var3_3, this.k);
                                                ** GOTO lbl5
                                            }
                                            if (var5_4 != 2) break block14;
                                            if (!var2_2.equals(s.b[10])) break block15;
                                            z.a().a(1033, new ba(9));
                                            var3_3 = 1;
                                            ** GOTO lbl25
                                        }
                                        if (!var2_2.equals(s.b[43])) break block16;
                                        this.k = this.a.a[0];
                                        var1_1 = this.a((av)var1_1, var2_2, var3_3, this.k);
                                        ** GOTO lbl5
                                    }
                                    if (!var2_2.equals(s.b[44])) break block17;
                                    this.k = this.a.a[1];
                                    var1_1 = this.a((av)var1_1, var2_2, var3_3, this.k);
                                    ** GOTO lbl5
                                }
                                if (!var2_2.equals(s.b[45])) break block18;
                                this.k = this.a.a[2];
                                var1_1 = this.a((av)var1_1, var2_2, var3_3, this.k);
                                ** GOTO lbl5
                            }
                            if (!var2_2.equals(s.b[46])) break block19;
                            this.k = this.a.a[3];
                            var1_1 = this.a((av)var1_1, var2_2, var3_3, this.k);
                            ** GOTO lbl5
                        }
                        if (!var2_2.equals(s.a[9])) break block13;
                        var6_6 = this.a;
                        this.k = w.a;
                        var1_1 = this.a((av)var1_1, var2_2, var3_3, this.k);
                        ** GOTO lbl5
                    }
                    if (var5_4 != 3) break block20;
                    if (!var2_2.equals(s.a[76])) break block13;
                    if (var1_1.b(1).b() != 1) break block21;
                    var4_8 = 63;
lbl75:
                    // 2 sources

                    while (true) {
                        z.a().a(1130, (af)new t(var4_8), new an(ap.o));
                        var3_3 = 1;
                        ** GOTO lbl25
                        break;
                    }
                }
                if (var5_4 == 6) {
                    var6_7 = this.a;
                    this.k = w.a;
                    var1_1 = this.a((av)var1_1, var2_2, var3_3, this.k);
                    ** continue;
                }
            }
            var3_3 = 0;
            ** while (true)
        }
        var4_8 = 2;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public q a(av object, String string, int n2, Vector vector) {
        q q2;
        Object object2;
        av av2;
        Object object3;
        int n3;
        block25: {
            block24: {
                block28: {
                    block26: {
                        block30: {
                            block29: {
                                block27: {
                                    if (((av)object).a / 1000 != 145) break block26;
                                    n3 = ((av)object).b(0).b();
                                    if (n3 != 0) break block27;
                                    if (((av)object).a(2).b() <= 3) break block28;
                                    ((av)object).a(2, 0, 0, 1, 0);
                                    object3 = null;
                                    n3 = 0;
                                    break block24;
                                }
                                if (n3 != 2) break block29;
                                if (((av)object).b(1).b() == 0) {
                                    n3 = 1;
                                    object3 = null;
                                    break block24;
                                } else {
                                    n3 = 3;
                                    object3 = bc.a(3201);
                                }
                                break block24;
                            }
                            if (n3 != 1) break block30;
                            n3 = 2;
                            object3 = null;
                            break block24;
                        }
                        if (n3 != 6) break block28;
                        n3 = 4;
                        object3 = null;
                        break block24;
                    }
                    if (((av)object).a / 1000 == 93) {
                        object3 = this.a((av)object);
                        if (s.f == 20) {
                            av2 = a.f.a(s.f);
                            object2 = null;
                            n3 = 0;
                            break block25;
                        } else {
                            av2 = null;
                            object2 = null;
                            n3 = 0;
                        }
                        break block25;
                    } else {
                        object3 = null;
                        av2 = null;
                        object2 = null;
                        n3 = 0;
                    }
                    break block25;
                }
                object3 = null;
                n3 = 0;
            }
            q2 = null;
            av2 = null;
            object2 = object3;
            object3 = q2;
        }
        int n4 = vector != null ? vector.size() : 0;
        boolean bl2 = n4 >= 1;
        if (!av.a((av)object, n2, n2, bl2)) return null;
        q2 = (q)((av)object).a(n2);
        int n5 = q2.h();
        q2.b(n4 * n5, false);
        int n6 = 0;
        while (true) {
            ar ar2;
            int n7;
            object = q2;
            if (n6 >= n4) return object;
            object = (bc)vector.elementAt(n6);
            Object object4 = new ar("", 0, 0);
            ((ar)object4).a((bc)object);
            ((ar)object4).d = ((bc)object).a;
            ((ar)object4).e = ((bc)object).a();
            int n8 = n6 * n5;
            q2.a((g)object4, n8);
            ((ar)object4).n = this.a(av2, (bc)object);
            n2 = al.a((long)((bc)object).a(), ((bc)object).f);
            q2.a(new ar(((bc)object).a, n2, 0), n8 + 1);
            if (string.equals(s.a[120])) {
                if (((bc)object).c < 0) {
                    ((bc)object).c = 0;
                }
                n2 = n7 = ((bc)object).c / 60;
                if (n7 == 0) {
                    n2 = 1;
                }
                q2.a(new ar(new StringBuffer().append("C\u00f2n l\u1ea1i").append(n2).append("Ph\u00fat").toString(), s.a[2], 0), n8 + 2);
            } else if (object3 != null) {
                q2.a(new ar(this.a(((bc)object).a, (Vector)object3), s.a[0], 0), n8 + 2);
            } else if (n3 == 1) {
                n2 = ((bc)object).c;
                if (string.equals(s.d[175])) {
                    if ((((bc)object).e & 0x80) != 0) {
                        n2 = ((bc)object).c / 2;
                        n2 = ((bc)object).a * n2;
                    } else {
                        n2 = ((bc)object).c / 2;
                    }
                }
                n7 = n2;
                if (n2 < 1) {
                    n7 = 1;
                }
                object = new ar(new StringBuffer().append(n7).append("").toString(), s.a[0], 0);
                ((ar)object).g = q2.d(2) - 2;
                ((g)object).a(8, true);
                q2.a((g)object, n8 + 2);
            } else if (n3 == 2) {
                q2.a(new ar(bc.a(bc.a(((bc)object).a())), s.a[0], 0), n8 + 2);
            } else if (n3 == 3) {
                ar2 = new ar("", s.a[0], 0);
                ar2.a((bf)object2);
                object4 = new StringBuffer();
                n2 = ((bc)object).c < 1 ? 1 : ((bc)object).c;
                ar2.a(((StringBuffer)object4).append(n2).append("").toString());
                ar2.b = ((bc)object).b;
                q2.a(ar2, n8 + 2);
            } else if (n3 == 4) {
                ar2 = new ar("", s.a[0], 0);
                object4 = new StringBuffer();
                n2 = ((bc)object).c < 1 ? 1 : ((bc)object).c;
                ar2.a(((StringBuffer)object4).append(n2).append("").toString());
                ar2.b = ((bc)object).b;
                q2.a(ar2, n8 + 2);
            }
            ++n6;
        }
    }

    /*
     * Unable to fully structure code
     */
    public Object a(av var1_1, int var2_2, int var3_3, Vector var4_4, boolean var5_5) {
        block4: {
            if (var1_1 == null) break block4;
            if (bc.a(this.a(var1_1, var2_2)) == -1) {
                var4_4 = av.a(var1_1, var3_3, 1000);
lbl4:
                // 3 sources

                while (true) {
                    if (var5_5) {
                        a.f.a(var1_1.a() / 1000);
                    }
                    return var4_4;
                }
            }
            if (var4_4 == null) break block4;
            var6_6 = (q)var1_1.a(var3_3);
            var2_2 = var6_6.i();
            if ((var6_6.f & 8192) != 0) {
                var2_2 = var6_6.c[0] + var2_2;
            }
            if (var2_2 >= var4_4.size()) break block4;
            var4_4 = var4_4.elementAt(var2_2);
            ** GOTO lbl4
        }
        var4_4 = null;
        ** while (true)
    }

    public Object a(boolean bl2) {
        return this.a(a.f.a(93), 93006, 93005, this.a, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String a(int n2) {
        int n3;
        Object object;
        switch (this.a) {
            default: {
                return "";
            }
            case 4: {
                object = this.b;
                break;
            }
            case 3: {
                object = this.c;
                break;
            }
            case 0: {
                object = this.e;
                break;
            }
            case 2: {
                object = this.d;
                break;
            }
            case 1: {
                object = this.a(this.a, false, null);
                break;
            }
            case 6: {
                object = this.g;
            }
        }
        if (n2 >= (n3 = ((Vector)object).size())) return "";
        return (String)((Vector)object).elementAt(n3 - n2 - 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String a(int n2, int n3, String string, String string2, boolean bl2, boolean bl3) {
        StringBuffer stringBuffer = al.a(null, "*3*(");
        al.a(stringBuffer, s.e[n2 % 7]);
        al.a(stringBuffer, ")");
        if (bl3) {
            al.a(stringBuffer, (long)n3);
            al.a(stringBuffer, "|");
            if (bl2) {
                al.a(stringBuffer, string2);
            } else {
                al.a(stringBuffer, string);
            }
            al.a(stringBuffer, "+");
        }
        if (bl2) {
            al.a(stringBuffer, s.d[81]);
            if (n2 == 1) {
                al.a(stringBuffer, s.d[83]);
                al.a(stringBuffer, string2);
            }
            al.a(stringBuffer, s.d[82]);
            return stringBuffer.toString();
        } else {
            if (n2 == 7 || string.equals(s.b[169])) {
                al.a(stringBuffer, s.e[7]);
                return stringBuffer.toString();
            }
            al.a(stringBuffer, string);
            if (n2 == 1) {
                al.a(stringBuffer, s.d[83]);
                al.a(stringBuffer, s.d[84]);
            }
            al.a(stringBuffer, s.d[82]);
        }
        return stringBuffer.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public String a(av av2, int n2) {
        String string;
        String string2 = av.a(av2, n2);
        if (av2.a / 1000 == 93) {
            string = string2;
            if (!string2.equals(s.d[175])) return string;
            string = string2;
            if ((av2.b(0).b() & 0x400) == 0) return string;
            return "Th\u00fa nu\u00f4i/C\u01b0\u1ee1i";
        }
        if (av2.a / 1000 != 145) {
            string = string2;
            if (av2.a / 1000 != 146) return string;
            string = string2;
            if (!string2.equals(s.d[175])) return string;
            return "Th\u00fa nu\u00f4i/C\u01b0\u1ee1i";
        }
        n2 = av2.b(1).b();
        switch (av2.b(0).b()) {
            default: {
                return string2;
            }
            case 1: {
                string = string2;
                if (string2.equals(s.a[75])) {
                    string = s.d[175];
                }
                this.o(av2);
                return string;
            }
            case 6: {
                return "";
            }
            case 2: {
                string = string2;
                if (!string2.equals(s.a[10])) return string;
                return s.d[175];
            }
            case 3: 
        }
        string = string2;
        if (!string2.equals(s.a[75])) return string;
        string = n2 == 0 ? s.a[69] : s.a[111];
        a.a.a().a(av2);
        return string;
    }

    public String a(String string) {
        return this.a(this.a(this.a(this.a(this.a(this.a(string, "a"), "d"), "g"), "j"), "m"), "p");
    }

    /*
     * Unable to fully structure code
     */
    public String a(String var1_1, String var2_2) {
        block3: {
            var5_3 = al.a(null, "");
            var4_4 = var1_1;
            if (var1_1 == null) break block3;
            var4_4 = var1_1;
            if (var2_2 != null) ** GOTO lbl18
            var4_4 = var1_1;
        }
lbl8:
        // 2 sources

        return var4_4;
        while ((var3_5 == 0 || var4_4.charAt(var3_5 - 1) != '[') && var3_5 < var4_4.length() - 1 && aw.a(var4_4.substring(var3_5 + 1, var3_5 + 2))) {
            var5_3.append(var4_4.substring(0, var3_5));
            var5_3.append('[');
            var5_3.append(var4_4.substring(var3_5, var3_5 + 2));
            var4_4 = var4_4.substring(var3_5 + 2, var4_4.length());
lbl18:
            // 3 sources

            while ((var3_5 = var4_4.indexOf(var2_2)) == -1) {
                var5_3.append(var4_4.substring(0, var4_4.length()));
                var4_4 = var5_3.toString();
                ** continue;
lbl23:
                // 1 sources

                ** GOTO lbl8
            }
        }
        var5_3.append(var4_4.substring(0, var3_5 + 1));
        var4_4 = var4_4.substring(var3_5 + 1, var4_4.length());
        ** GOTO lbl18
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Vector a(int n2) {
        switch (n2) {
            default: {
                return ay.a(2, -1);
            }
            case 0: {
                return ay.e;
            }
            case 1: {
                return ay.f;
            }
            case 2: 
        }
        return ay.g;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Vector a(av vector, int n2, Vector vector2) {
        av av2;
        if (vector == null) {
            return null;
        }
        Vector<bc> vector3 = new Vector<bc>();
        int n3 = vector2.size();
        int n4 = ((g)((Object)vector)).a() / 1000;
        switch (n4) {
            default: {
                av2 = null;
                break;
            }
            case 93: {
                av2 = a.f.a(s.f);
                break;
            }
        }
        block16: for (n2 = 0; n2 < n3; ++n2) {
            bc bc2 = (bc)vector2.elementAt(n2);
            block3 : switch (n4) {
                case 93: {
                    switch (s.f) {
                        default: {
                            break block3;
                        }
                        case 7: {
                            if (bc.b(av.a((av)av2, (int)7010, (int)1000).b, bc2.b)) break;
                            continue block16;
                        }
                        case 122: {
                            if (bc2.d % 10 != 0) break;
                            continue block16;
                        }
                        case 20: {
                            if (!this.a(av2, 32, bc2.a) || this.a(av2, bc2) != 0) break;
                            continue block16;
                        }
                        case 8: {
                            if (bc.b(av.a((av)av2, (int)8010, (int)1000).b, bc2.a())) break;
                            continue block16;
                        }
                        case 57: {
                            int n5;
                            if (!(av2.f() == 57004 ? ((n5 = av2.b(0).b()) == 2847 ? !this.a.a(au.a, bc2.a) : (n5 == 2870 || n5 == 2872 ? !bc.a(780, bc2.a()) : n5 == 2852 && bc.a(780, bc2.a()))) : av2.f() == 57010 && av2.b(0).b() == 2847 && !this.a.a(au.b, bc2.a))) break;
                            continue block16;
                        }
                        case 145: {
                            if (!(this.a == 1 ? bc2.d == 1 || !bc.a(110, bc2.a()) : this.a == 2 && (bc2.d == 0 || !bc.a(110, bc2.a())))) break;
                            continue block16;
                        }
                        case 17: {
                            if (av2.f() == 17006 ? bc2.d / 10 == 0 || bc2.d / 10 == 2 : bc2.d / 10 == 0 || bc2.d / 10 == 1) continue block16;
                        }
                    }
                }
                default: {
                    break;
                }
                case 145: {
                    if (((av)((Object)vector)).b(0).b() == 2 && (bc2.c == 0 || bc.a(203, bc2.a()))) continue block16;
                }
            }
            vector3.insertElementAt(bc2, 0);
        }
        this.a(n4, vector3);
        return vector3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Vector a(String string, boolean bl2, String string2) {
        Object object;
        int n2;
        int n3;
        block10: {
            if (this.a[0] == null) {
                for (n3 = 0; n3 < 10; ++n3) {
                    this.a[n3] = new Vector(5);
                }
            }
            int n4 = this.i.size();
            n3 = n4 / 2;
            for (n2 = 0; n2 < n4; n2 += 2) {
                String string3 = (String)this.i.elementAt(n2);
                object = (String)this.i.elementAt(n2 + 1);
                if (!string3.equals(string)) continue;
                n3 = n4 = Integer.parseInt((String)object);
                if (bl2) {
                    n3 = n4 + 1;
                }
                n4 = n3;
                if (n3 > 10) {
                    n4 = 10;
                }
                this.i.setElementAt(Integer.toString(n4), n2 + 1);
                n3 = n2 / 2;
                n2 = 1;
                break block10;
            }
            n2 = 0;
        }
        if (n2 == 0) {
            this.i.addElement(string);
            object = this.i;
            n3 = bl2 ? 1 : 0;
            ((Vector)object).addElement(Integer.toString(n3));
            if (this.i.size() / 2 > 10) {
                this.i.removeElementAt(0);
                this.i.removeElementAt(0);
                for (n3 = 0; n3 < this.a.length - 1; ++n3) {
                    this.a[n3] = this.a[n3 + 1];
                }
                this.a[this.a.length - 1] = new Vector();
            }
            n3 = this.i.indexOf(string) / 2;
        }
        if (string2 != null) {
            this.a[n3].addElement(string2);
            if (this.a[n3].size() > 10) {
                this.a[n3].removeElementAt(0);
            }
        }
        return this.a[n3];
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a() {
        String string;
        Object object;
        av av2;
        av av3;
        Object object2;
        block13: {
            block15: {
                block18: {
                    block17: {
                        block16: {
                            int n2;
                            block14: {
                                object2 = a.f.a(21);
                                av3 = a.f.a(22);
                                av2 = a.f.a(20);
                                object = "";
                                string = "";
                                if (av3 != null) {
                                    object = av3.a(22001).a();
                                    av3.b(22001, "");
                                    object2 = string;
                                } else if (object2 != null) {
                                    object = ((av)object2).a(21006).a();
                                    ((av)object2).b(21006, "");
                                    object2 = ((av)object2).a(21007).a();
                                } else {
                                    object2 = string;
                                    if (av2 != null) {
                                        object = av2.a(20023).a();
                                        av2.b(20023, "");
                                        object2 = string;
                                    }
                                }
                                if (this.a != 7 && !((String)object2).equals(s.a[12]) && !((String)object).equals("")) break block13;
                                bl.demluot = 0;
                                object = "Hacking Auto TTC Reset";
                                n2 = menu;
                                if (n2 != 0) break block14;
                                menu = 1;
                                object = "TTC C\u1ea5p \u0111\u01a1n gi\u1ea3n";
                                break block15;
                            }
                            if (1 == n2) break block16;
                            if (2 == n2) break block17;
                            if (3 == n2) break block18;
                            menu = 0;
                            break block15;
                        }
                        menu = 2;
                        object = "TTC C\u1ea5p ph\u1ed5 th\u00f4ng";
                        break block15;
                    }
                    menu = 3;
                    object = "TTC C\u1ea5p \u00c1c M\u1ed9ng";
                    break block15;
                }
                menu = 4;
                object = "TTC C\u1ea5p Tinh Anh";
            }
            a.f.a((String)object);
            return;
        }
        this.b = object;
        if (this.a == 0) {
            if (System.currentTimeMillis() - this.a < (long)b) {
                a.f.a(new StringBuffer().append(s.b[13]).append(s.d[263]).append(b / 1000).append(s.d[264]).toString());
                return;
            }
            this.a = System.currentTimeMillis();
        } else if (this.a == 6) {
            if (System.currentTimeMillis() - this.b < 10000L) {
                a.f.a(new StringBuffer().append(s.a[77]).append(s.d[263]).append(10).append(s.d[264]).toString());
                return;
            }
            this.b = System.currentTimeMillis();
        }
        string = new StringBuffer().append(this.c(this.a)).append((String)object).toString();
        object = "";
        if (av3 != null) {
            object = this.a;
        } else if (av2 != null) {
            object = this.a;
        }
        object2 = al.a(null, string);
        object2 = this.b(this.c(this.a), this.a(((StringBuffer)object2).toString()));
        object = al.a(null, this.a(this.a, ay.a.a(), ay.a.a(), (String)object, true, true));
        al.a((StringBuffer)object, (String)object2);
        this.a(this.a, ((StringBuffer)object).toString(), this.a, false);
        object = al.a(null, this.a(this.a, ay.a.a(), ay.a.a(), this.a, true, false));
        al.a((StringBuffer)object, (String)object2);
        ap.a().a(((StringBuffer)object).toString(), false);
        object = string.substring(2, 3).equals("/") ? ((String)object2).substring(2, ((String)object2).length()) : object2;
        u.a(this.a(this.a), (String)object, this.a, ay.a.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(byte by) {
        av av2 = a.f.a(1);
        av av3 = a.f.a(11);
        String string = null;
        if (av2 != null) {
            string = av2.a(1003).a();
        }
        if (c.equals(string)) {
            if (by == 1) {
                by = (byte)av3.f();
                z.a().a(1081, (af)new an(((af[])this.j.elementAt(by - 11001))[0].b()), new t(1));
                return;
            }
            z.a().a(1010, new an(ay.a.a()), new an(0), new ba(0), new ba(0), new ba(0), new an(0), new ba(149));
            return;
        }
        a.f.a(s.d[640]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void a(int var1_1) {
        block29: {
            block30: {
                block31: {
                    block28: {
                        var4_2 = true;
                        var3_3 = 0;
                        var6_4 /* !! */  = ay.b(var1_1, ay.a());
                        if (var6_4 /* !! */  == null) ** GOTO lbl-1000
                        switch (var6_4 /* !! */ [0].b()) {
                            default: {
                                var3_3 = var6_4 /* !! */ [0].b() / 1000000;
                                var1_1 = var6_4 /* !! */ [3].b();
                                if (var3_3 != 9) break block28;
                                var5_5 = ay.a(var1_1, ay.h);
                                if (var5_5 == null) break;
                                aa.a(m.a(), var5_5);
                            }
lbl13:
                            // 20 sources

                            case 0: 
                            case 21: 
                            case 22: 
                            case 23: 
                            case 24: lbl-1000:
                            // 7 sources

                            {
                                return;
                            }
                            {
                            }
                            case 1: {
                                this.a(null, 0, 0, 0);
                                ** GOTO lbl13
                            }
                            case 2: {
                                this.a.a(null, 0, 0, new an(ay.a.a()));
                                ** GOTO lbl13
                            }
                            case 3: {
                                a.a.a().a(null, 0, 0, 0);
                                ** GOTO lbl13
                            }
                            case 4: {
                                this.a.c(null, 22, 0);
                                ** GOTO lbl13
                            }
                            case 5: {
                                if (w.b() <= 0) ** GOTO lbl37
                                this.a.b(null, -1, 0, 2);
                                ** GOTO lbl13
lbl37:
                                // 1 sources

                                this.a.a((av)null);
                                ** GOTO lbl13
                            }
                            case 6: {
                                this.a.b(null, 0);
                                ** GOTO lbl13
                            }
                            case 7: {
                                if (++ap.r > 3) {
                                    ap.r = 0;
                                }
                                var5_6 = z.a();
                                var6_4 /* !! */  = new t(18);
                                if (ap.r >= 2) ** GOTO lbl58
                                var1_1 = var3_3;
lbl51:
                                // 2 sources

                                while (true) {
                                    var5_6.a(1040, (af)var6_4 /* !! */ , new an(var1_1));
                                    ac.b = true;
                                    a.f.a(this.d(-1));
                                    bb.j();
                                    ** GOTO lbl13
                                    break;
                                }
lbl58:
                                // 1 sources

                                var1_1 = 1;
                                ** continue;
                            }
                            case 8: {
                                this.a.d(0);
                                ** GOTO lbl13
                            }
                            case 9: {
                                this.a.a(null, 0);
                                ** GOTO lbl13
                            }
                            case 10: {
                                if (this.a() <= 0) ** GOTO lbl74
                                var5_7 = s.a[12];
lbl70:
                                // 2 sources

                                while (true) {
                                    this.a(var5_7);
                                    ** GOTO lbl13
                                    break;
                                }
lbl74:
                                // 1 sources

                                var5_7 = null;
                                ** continue;
                            }
                            case 11: {
                                this.a.a(0);
                                ** GOTO lbl13
                            }
                            case 12: {
                                this.a.a(1);
                                ** GOTO lbl13
                            }
                            case 13: {
                                this.a.a(2);
                                ** GOTO lbl13
                            }
                            case 14: 
                            case 15: 
                            case 16: 
                            case 17: {
                                ac.d = var2_9 = (short)s.a[var6_4 /* !! */ [0].b() - 14 + 2];
                                ac.c = var2_9;
                                ** GOTO lbl13
                            }
                            case 18: {
                                ad.d();
                                ** GOTO lbl13
                            }
                            case 19: {
                                if ((bl.k & 8) != 0) break block29;
lbl97:
                                // 2 sources

                                while (true) {
                                    bl.b(8, var4_2);
                                    ap.a().j();
                                    ** GOTO lbl13
                                    break;
                                }
                            }
                            case 20: {
                                a.f.a("T\u1ea1m th\u1eddi ch\u01b0a m\u1edf!");
                                ** GOTO lbl13
                            }
                        }
                        this.a(0, var1_1);
                        ** GOTO lbl-1000
                    }
                    if (var3_3 != 8) ** GOTO lbl-1000
                    var5_8 = ay.a(var1_1, ay.a, true);
                    if (var5_8 == null) break block30;
                    if (!bc.a(219, (int)bc.a(var1_1))) break block31;
                    aa.a(m.a(), var5_8.a);
                    ** GOTO lbl-1000
                }
                z.a().a(1009, (af)new ba(4), (af)new an(var5_8.a), new an(ay.a.a()));
                ** GOTO lbl-1000
            }
            a.k.a(new StringBuffer().append(s.d[10].substring(0, 4)).append(var6_4 /* !! */ [2].toString()).append(s.b[142]).toString());
            ** while (true)
        }
        var4_2 = false;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, int n3, int n4, String string, av av2) {
        StringBuffer stringBuffer = al.a(null, av2.a(n3).a());
        if (string == null) {
            al.a(stringBuffer, "p");
            al.a(stringBuffer, (long)((q)av2.a(n2)).e());
        } else {
            al.a(stringBuffer, string);
        }
        av2.b(n3, stringBuffer.toString());
        av2.c(n2);
        av2.d(n3);
        av2.v = av2.a((int)n4).b + av2.a((int)n4).h - 20;
        if (av2.v == 0) {
            av2.v = 1;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int object, av av2) {
        void var1_3;
        void var2_5;
        ((r)var2_5.a(21001)).d();
        int n2 = this.i.size() / 2;
        if (n2 < 1) {
            return;
        }
        q q2 = (q)var2_5.a((int)object);
        var2_5.c((int)object, true);
        q2.a(n2 * 3);
        boolean bl2 = false;
        while (var1_3 < n2) {
            String string = (String)this.i.elementAt((int)(var1_3 * 2));
            String string2 = (String)this.i.elementAt((int)(var1_3 * 2 + true));
            q2.a(string, 0xFFFFFF, (int)(var1_3 * 3));
            q2.a(al.a(al.a(al.a(null, string2), "/"), 10L).toString(), 0xFFFFFF, (int)(var1_3 * 3 + 2));
            ++var1_3;
        }
        int[] nArray = q2.b;
        var2_5.v = q2.h + nArray - 20;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, String string, int n3, av av2) {
        if (av2.a / 1000 == 21) {
            av2.c(21013);
            av2.c(21012);
            av2.d(21007);
            av2.a((int)21007).e = 21001;
            ad.a(av2, true);
        }
        if (s.b[13].equals(string)) {
            this.a = 0;
            this.b(21001, this.e, av2);
            return;
        }
        if (s.a[22].equals(string)) {
            this.a = 2;
            this.b(21001, this.d, av2);
            return;
        }
        if (s.b[27].equals(string)) {
            this.a = 3;
            this.b(21001, this.c, av2);
            return;
        }
        if (s.a[116].equals(string)) {
            this.a = 4;
            this.b(21001, this.b, av2);
            return;
        }
        if (s.b[169].equals(string)) {
            this.a = 7;
            this.b(21001, this.f, av2);
            return;
        }
        if (s.a[12].equals(string)) {
            ((h)av2.a(21007)).a(1);
            av2.a((int)21007).e = 21012;
            av2.c(21012, true);
            this.a(21013, av2);
            return;
        }
        if (s.a[77].equals(string)) {
            this.a = 6;
            this.b(21001, this.g, av2);
            return;
        }
        if (8 != n2) return;
        this.c(n3, av2);
    }

    public void a(int n2, String string, av av2) {
        ((r)av2.a(n2)).b(string, true);
        this.e(n2, av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, String string, String string2, boolean bl2) {
        av av2 = a.f.a(21);
        av av3 = a.f.a(22);
        av av4 = a.f.a(20);
        this.a(this.e, string);
        switch (n2) {
            case 1: 
            case 2001: {
                this.a(string2, bl2, string);
                break;
            }
            case 2: 
            case 2003: {
                this.a(this.d, string);
                break;
            }
            case 3: 
            case 2004: {
                this.a(this.c, string);
                break;
            }
            case 4: 
            case 2000: {
                this.a(this.b, string);
                break;
            }
            case 7: 
            case 2005: 
            case 2022: {
                this.a(this.f, string);
                break;
            }
            case 6: 
            case 2017: {
                this.a(this.g, string);
            }
        }
        if (this.a == n2 || this.a == 0) {
            if (av2 != null) {
                String string3 = av2.a(21007).a();
                if (!string3.equals(s.a[12])) {
                    this.a(21001, string, av2);
                } else {
                    this.a(0, string3, 0, av2);
                }
            }
            if (av3 != null) {
                if (!string2.equals(this.a)) return;
                this.a(22003, string, av3);
                return;
            }
            if (av4 == null) return;
            if (!string2.equals(this.a)) return;
            this.a(20024, string, av4);
            this.e(20024, av4);
            return;
        }
        if (av2 == null) return;
        string = av2.a(21007).a();
        if (!string.equals(s.a[12])) return;
        this.a(0, string, 0, av2);
    }

    public void a(int n2, Vector vector, av av2) {
        int n3 = vector.size();
        r r2 = (r)av2.a(n2);
        r2.d();
        aw.a();
        --n3;
        while (n3 >= 0) {
            r2.a((String)vector.elementAt(n3), true);
            --n3;
        }
        this.e(n2, av2);
        av2.c = 0;
        av.a[21] = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2) {
        int n2 = av2.f();
        if (21005 == n2) {
            this.a();
            return;
        }
        if (21006 == n2) {
            bn.a(s.d[375], 80, 0, 21006, (bi)av2);
            return;
        }
        if (21001 == n2) {
            if (av2.a((int)21001).h < 5) {
                av2.d(21006);
                return;
            }
            String string = aw.a();
            if (this.a(aw.e())) return;
            string = this.a(string) ? s.a[25] : s.a[24];
            String string2 = s.a[21];
            String string3 = s.a[20];
            String string4 = s.a[12];
            String string5 = s.a[2];
            String string6 = s.a[22];
            String string7 = s.a[23];
            bb bb2 = this.a;
            bb.a(new String[]{string2, string3, string4, string5, string6, string7, string}, av2);
            return;
        }
        if (21008 == n2) {
            this.b(av2);
            return;
        }
        if (n2 == 21002) {
            this.a(21002, 21006, 21001, null, av2);
            return;
        }
        if (n2 == 20025) {
            this.a(20025, 20023, 20024, null, av2);
            return;
        }
        if (n2 == 21012) {
            bb bb3 = this.a;
            bb.a(new String[]{s.d[120], s.d[121]}, av2);
            return;
        }
        if (n2 == 21013) {
            bb bb4 = this.a;
            bb.a(new String[]{s.a[2], s.a[41]}, av2);
            return;
        }
        if (n2 != 21007) return;
        this.a(av2, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2, int n2) {
        h h2 = (h)av2.a(21007);
        if (av2.f() == 21007 || av2.f() == 21013 || av2.f() == 21001 || av2.f() == 21012) {
            if (av2.f() != 21007) {
                int n3 = h2.f();
                n2 = n2 == s.a[2] ? (n3 - 1) % h2.m : (n3 + 1) % h2.m;
                h2.a(Math.abs(n2));
            }
            this.a(0, h2.a(), 0, av2);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void a(av var1_1, int var2_2, int var3_3) {
        block8: {
            block14: {
                block7: {
                    block9: {
                        var6_4 = null;
                        var7_5 = null;
                        var4_6 = 0;
                        var5_7 = 0;
                        if (1930000000 != var2_2 && 1940000000 != var2_2) break block8;
                        var8_8 = this.a(true);
                        if (1930000000 != var2_2) break block9;
                        var9_9 = ay.a(1, -1);
                        var4_6 = ((bc)var8_8).a;
                        var2_2 = var5_7;
                        while (true) {
                            block11: {
                                block10: {
                                    var6_4 = var7_5;
                                    if (var2_2 >= var9_9.size()) break block10;
                                    if (((bc)var9_9.elementAt((int)var2_2)).a != var4_6) break block11;
                                    var6_4 = new StringBuffer().append("a").append(var9_9.size() - var2_2).toString();
                                }
lbl17:
                                // 4 sources

                                while (var3_3 == 21006) {
                                    this.a(21002, 21006, 21001, var6_4, var1_1);
lbl19:
                                    // 5 sources

                                    return;
                                }
                                break block7;
                            }
                            ++var2_2;
                        }
                    }
                    var9_10 = ay.a(2048, -1);
                    var5_7 = ((ax)var8_8).a();
                    var2_2 = 0;
                    block3: while (true) {
                        block13: {
                            block12: {
                                var7_5 = var6_4;
                                if (var2_2 >= var9_10.size()) break block12;
                                if (((ax)var9_10.elementAt(var2_2)).a() != var5_7) break block13;
                                var7_5 = new StringBuffer().append("j").append(var9_10.size() - var2_2).toString();
                            }
                            var6_4 = var7_5;
                            if (var7_5 != null) ** GOTO lbl17
                            var8_8 = ay.a(16384, -1);
                            var2_2 = var4_6;
lbl39:
                            // 2 sources

                            while (true) {
                                var6_4 = var7_5;
                                if (var2_2 >= var8_8.size()) ** GOTO lbl17
                                if (((ax)var8_8.elementAt(var2_2)).a() != var5_7) break block3;
                                var6_4 = new StringBuffer().append("m").append(var8_8.size() - var2_2).toString();
                                ** GOTO lbl17
                                break;
                            }
                        }
                        ++var2_2;
                    }
                    ++var2_2;
                    ** while (true)
                }
                if (var3_3 != 22001) break block14;
                this.a(22011, 22001, 22003, var6_4, var1_1);
                ** GOTO lbl19
            }
            if (var3_3 != 20023) ** GOTO lbl19
            this.a(20025, 20023, 20024, var6_4, var1_1);
            ** GOTO lbl19
        }
        this.a(var1_1, this.a.a(10), var3_3);
        ** while (true)
    }

    public void a(av av2, int n2, int n3, int n4) {
        if (av2 == null) {
            av2 = a.f.b(145);
        }
        av2.a(145005, 2, 0, ((q)av2.a(145005)).f(), null);
        ((q)av2.a(145005)).b(0);
        ad.a(av2, true);
        av2.b(0).a(n2);
        av2.b(1).a(n3);
        if (n2 == 0) {
            z.a().a(1009, new ba(78));
        }
        this.o(av2);
        ad.a(av2, n2, n3, n4, 145003);
        this.a(av2, 145005, 145003, 0, -1, -1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2, int n2, int n3, int n4, int n5, int n6) {
        boolean bl2 = false;
        String string = this.a(av2, n3);
        int n7 = n5;
        if (n5 == -1) {
            n7 = bc.a(string);
        }
        Vector vector = ay.a(n7, n6);
        q q2 = null;
        if (vector == null) {
            q2 = this.a(av2, string, n2);
        } else if (n7 < 256) {
            q2 = this.a(av2, string, n2, this.a(av2, n7, vector));
        } else if (n7 < 1024) {
            q2 = this.c(av2, string, n2, this.c(av2, n7, vector));
        } else if (n7 < 65536) {
            q2 = this.b(av2, string, n2, this.b(av2, n7, vector));
        } else if (n7 <= 262144) {
            q2 = this.a(av2, n2, this.d(av2, n7, vector));
        } else if (n7 <= 0x400000) {
            this.a(93, vector);
            q2 = this.b(av2, n2, vector);
        }
        if (av2.a(2).b() > 3) {
            return;
        }
        if (q2 == null) {
            av2.a(2).a(3);
            av2.a(n2).a(8192, false);
        } else if (av2.a / 1000 != 93) {
            av2.a(2).a(3);
            av2.a(n2).a(8192, false);
        } else {
            av2.a(2).a(2);
            q2.a(8192, true);
            if ((n4 & 2) == 0) {
                bl2 = true;
            }
            q.a(q2, bl2);
        }
        if (av2.a / 1000 == 93) return;
        if (n3 > 0) {
            av2.f(n3);
            return;
        }
        av2.f(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2, int n2, boolean bl2) {
        if (av2 == null) {
            return;
        }
        q q2 = (q)av2.a(n2);
        n2 = ac.a < 240 ? 2 : 1;
        Object object = new ar("", 0, 0);
        ((ar)object).a(bc.a(3200));
        q2.a((g)object, 0);
        object = new x(30, 8, n2, 0, 0);
        Object object2 = ay.a;
        int n3 = bl2 ? 16 : 15;
        ((x)object).a(((m)object2).g(n3));
        q2.a((g)object, 1);
        object = new ar("", 0, 0);
        ((ar)object).a(bc.a(3201));
        q2.a((g)object, 2);
        object = new x(30, 8, n2, 0, 0);
        ((x)object).a(ay.a.g(17));
        q2.a((g)object, 3);
        object = new ar("", 0, 0);
        ((ar)object).a(bc.a(4200));
        q2.a((g)object, 4);
        x x2 = new x(30, 8, n2, 0, 0);
        if (!bl2) {
            x2.a(new StringBuffer().append(ay.a.size()).append("/").append(ay.a.a(9)).toString());
        } else {
            object = new StringBuffer();
            object2 = this.a;
            x2.a(((StringBuffer)object).append(w.a.size()).append("/").append(av2.b(2).b()).toString());
        }
        q2.a(x2, 5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2, Object object) {
        int n2;
        int n3;
        if (object instanceof bc) {
            n3 = ((bc)object).g;
            n2 = ((bc)object).a();
            n3 += 8000000;
        } else {
            n3 = ((g)object).d;
            n2 = ((g)object).e;
        }
        int n4 = a.h.g(((q)av2.a(122005)).i());
        object = z.a();
        byte by = ((h)av2.a(122004)).f() == 0 ? (byte)3 : 7;
        ((z)object).a(1523, new t(by), new an(n3), new t((byte)n4), new an(n2));
        ac.a(true, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(av av2, String string, int n2) {
        String string2 = aw.a();
        if (string.equals(s.a[20])) {
            z.a().a(1056, (af)new ba(1), (af)new an(0), new j(string2));
            return;
        }
        if (string.equals(s.a[21])) {
            if (aw.e() != 0) {
                this.a(aw.e());
                return;
            }
            string = string2 = this.a(aw.d());
            if (!string2.equals("")) {
                string = string2.substring(string2.indexOf("\uff1a") + 3, string2.length());
            }
            if (n2 == -1) return;
            this.b = string;
            av2.b(n2, string);
            av2.d(n2);
            if (n2 != 20023) return;
            ((r)av2.a(20024)).e();
            ad.a(av2, false);
            av2.c(30);
            return;
        }
        av av3 = a.f.a(22);
        av av4 = a.f.a(20);
        n2 = 21002;
        if (av3 != null) {
            n2 = 22011;
        } else if (av4 != null) {
            n2 = 20025;
        }
        if (string.equals("Bi\u1ec3u c\u1ea3m")) {
            this.a(8, "", n2, av2);
            return;
        }
        if (string.equals(s.a[121])) {
            this.a(15, av2, 0, new String[]{s.b[9], s.a[2]}, -1);
            return;
        }
        if (string.equals(s.a[69])) {
            this.a(2048, av2, 0, new String[]{s.b[9], s.a[2]}, -1);
            return;
        }
        if (string.equals(s.a[80])) {
            this.a.c(null, 22, 1);
            return;
        }
        if (string.equals(s.d[120])) {
            this.a.a(null, 6);
            return;
        }
        if (string.equals(s.d[121])) {
            a.f.a("", s.d[123], (int)(av2.a + 2), -1, true, av2, null);
            return;
        }
        if (string.equals(s.a[41])) {
            this.b(av.a(av2, 21013, 1000).a(), av2);
            return;
        }
        if (string.equals(s.a[2]) && av2.f() == 21013) {
            this.a(av.a(av2, 21013, 1000).a(), s.a[12]);
            return;
        }
        if (string2.equals(ay.a.a())) return;
        if (string2.equals("")) return;
        if (string.equals(s.a[12])) {
            this.a(string2, "");
            return;
        }
        if (string.equals(s.a[2])) {
            ac.a(true, false);
            if (this.a(aw.e())) return;
            z.a().a(1303, (af)new t(1), (af)new an(0), new j(string2));
            return;
        }
        if (string.equals(s.a[22])) {
            z.a().a(1023, (af)new ba(53), (af)new an(0), new j(string2));
            return;
        }
        if (string.equals(s.a[23])) {
            this.a.a(0, string2);
            return;
        }
        if (string.equals(s.a[24])) {
            this.a(string2, true);
            return;
        }
        if (!string.equals(s.a[25])) return;
        this.a(string2, false);
    }

    public void a(av av2, boolean bl2, int n2, int n3, int n4) {
        if (bl2) {
            while (n2 <= n3) {
                av2.b(n2 + n4);
                ++n2;
            }
        } else {
            for (int i2 = n2; i2 <= n3; ++i2) {
                av2.c(i2 + n4);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(String charSequence, int n2, String string, int n3, String string2) {
        CharSequence charSequence2;
        block14: {
            if (!this.b(n3)) return;
            if (this.a((String)charSequence)) return;
            if (ay.a == null) {
                return;
            }
            try {
                if (string.substring(0, 1).equals("*")) {
                    charSequence2 = string;
                    if (aw.a(string.substring(1, 2))) break block14;
                }
                charSequence2 = new StringBuffer();
                charSequence2 = ((StringBuffer)charSequence2).append(this.c(n3)).append(string).toString();
            }
            catch (Exception exception) {
                charSequence2 = string;
            }
        }
        switch (n3) {
            case 2001: 
            case 2026: {
                n3 = 1;
                break;
            }
            case 2000: {
                n3 = 4;
                break;
            }
            case 2004: {
                n3 = 3;
                break;
            }
            case 2005: 
            case 2022: {
                n3 = 7;
                break;
            }
            case 2021: {
                n3 = 0;
                break;
            }
            case 2003: {
                n3 = 2;
                break;
            }
            case 2017: {
                n3 = 6;
                break;
            }
        }
        string = this.b(((String)charSequence2).substring(0, 2), (String)charSequence2);
        charSequence2 = al.a(null, this.a(n3, n2, (String)charSequence, string2, false, true));
        al.a((StringBuffer)charSequence2, string);
        this.a(n3, ((StringBuffer)charSequence2).toString(), (String)charSequence, true);
        charSequence = al.a(null, this.a(n3, n2, (String)charSequence, string2, false, false));
        al.a((StringBuffer)charSequence, string);
        ap.a().a(((StringBuffer)charSequence).toString(), false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(String string, av av2) {
        int n2;
        block3: {
            for (n2 = 0; n2 < this.i.size() / 2; ++n2) {
                String string2 = (String)this.i.elementAt(n2 * 2);
                String string3 = (String)this.i.elementAt(n2 * 2 + 1);
                if (!string2.equals(string) && (!string.equals("") || string3.equals("0"))) continue;
                this.i.setElementAt(Integer.toString(0), n2 * 2 + 1);
                this.a = string2;
                string = string2;
                break block3;
            }
            n2 = -1;
        }
        if (!string.equals("")) {
            this.a = string;
        }
        av2.a(new StringBuffer().append("v\u00e0 ").append(string).append(" \u0111ang \u0111\u1ed1i tho\u1ea1i").toString());
        if (n2 == -1) {
            ((r)av2.a(22003)).d();
            return;
        }
        this.a(22003, this.a[n2], av2);
        this.e(22003, av2);
    }

    public void a(String string, String string2) {
        a.f.a(21);
        av av2 = a.f.b(22);
        if (string2.equals(s.a[12])) {
            av2.a(0, new t(1));
        }
        ad.a(av2, true);
        this.a = 1;
        aw.a();
        this.a(string, av2);
    }

    /*
     * Unable to fully structure code
     */
    public void a(String var1_1, boolean var2_2) {
        var4_3 = ": \u0111\u00e3 b\u1ecb ch\u1eb7n!";
        if (var2_2) {
            this.h.addElement(var1_1);
lbl4:
            // 2 sources

            while (true) {
                a.f.a(new StringBuffer().append(var1_1).append(var4_3).toString());
                return;
            }
        }
        var3_4 = 0;
        while (true) {
            block7: {
                block6: {
                    if (var3_4 >= this.h.size()) break block6;
                    if (!((String)this.h.elementAt(var3_4)).equals(var1_1)) break block7;
                    this.h.removeElementAt(var3_4);
                }
                var4_3 = ": ch\u1eb7n \u0111\u00e3 m\u1edf!";
                ** continue;
            }
            ++var3_4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(int n2) {
        boolean bl2 = true;
        if (n2 == 1) {
            z.a().a(1032, (af)new t(1), (af)new an(Integer.parseInt(aw.a())), new an(0));
            return bl2;
        }
        if (n2 == 2) {
            z.a().a(1127, (af)new t(29), new an(Integer.parseInt(aw.a())));
            return bl2;
        }
        if (n2 != 3) return false;
        this.a.d(null, 23, Integer.parseInt(aw.a()));
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(av g2, int n2) {
        Object object;
        short s2 = (short)((av)g2).b(2).b();
        if (n2 % 10 == 4) {
            g2 = av.a((av)g2, n2, 1000);
            z.a().a(1032, (af)new t(16), new an(g2.e));
            return true;
        }
        if (n2 % 10 == 5) {
            object = av.a((av)g2, n2 - 1, 1000);
            z.a().a(1171, new ba(s2), new t(1), new ba((short)((g)object).d), new t(1));
        } else {
            if (n2 % 10 != 6) {
                a.f.a(90);
                return false;
            }
            object = av.a((av)g2, n2 - 2, 1000);
            z.a().a(1171, new ba(s2), new t(1), new ba((short)((g)object).d), new t(0));
        }
        if (((Vector)(object = (Vector)((av)g2).a(0))).size() == 0) {
            if (n2 == 90025 || n2 == 90026) {
                if (!this.c((av)g2, 90014)) {
                    a.f.a(90);
                    return false;
                }
                if (this.c((av)g2, 90004)) {
                    this.c((av)g2, 90003, false);
                    return true;
                } else {
                    this.c((av)g2, 90013, false);
                }
                return true;
            }
            if (n2 == 90015 || n2 == 90016) {
                if (this.c((av)g2, 90004)) {
                    this.c((av)g2, 90003, false);
                    return true;
                } else {
                    this.c((av)g2, 90013, false);
                    ((av)g2).d(90025);
                }
                return true;
            }
            this.c((av)g2, 90003, false);
            ((av)g2).d(90015);
            return true;
        }
        n2 = n2 / 10 * 10 + 4;
        this.a((av)g2, (q)((av)g2).a(n2), (Vector)object, n2 + 3);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(av av2, int n2, String string, String string2) {
        boolean bl2 = true;
        if (string2.equals(s.a[2])) {
            z.a().a(1303, (af)new t(1), new an(n2));
            return bl2;
        }
        if (string2.equals(s.a[12])) {
            this.a(string, "");
            return bl2;
        }
        if (string2.equals(s.a[23])) {
            this.a.a(n2, string);
            return bl2;
        }
        if (string2.equals(s.b[153])) {
            ad.a(n2, 2);
            return bl2;
        }
        if (string2.equals(s.a[20])) {
            ad.a(n2, 1);
            return bl2;
        }
        if (string2.equals(s.b[1])) {
            z.a().a(1107, (af)new ba(29), new an(n2));
            return bl2;
        }
        if (!string2.equals(s.b[68])) return false;
        if (av2.a / 1000 == 43) {
            z.a().a(1023, (af)new ba(60), new an(0));
            return bl2;
        }
        this.a.a(new an(n2));
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(av av2, int n2, boolean bl2) {
        int n3;
        block4: {
            block3: {
                if (n2 % 2 != 0) break block3;
                if (bl2 && !av2.a(n2 + 1).a()) {
                    ((ar)av.a(av2, n2, 0)).a("-");
                    av2.c(n2 + 1, false);
                    ((q)av2.a(n2 + 1)).b(0);
                    n3 = n2;
                    break block4;
                } else {
                    n3 = n2;
                    if (!bl2) {
                        ((ar)av.a(av2, n2, 0)).a("+");
                        av2.c(n2 + 1);
                        n3 = n2;
                    }
                }
                break block4;
            }
            av2.c(n2);
            n3 = n2 - 1;
            ((ar)av.a(av2, n3, 0)).a("+");
        }
        av2.f(n3);
        return false;
    }

    public boolean a(String string) {
        boolean bl2 = false;
        int n2 = 0;
        while (true) {
            block4: {
                boolean bl3;
                block3: {
                    bl3 = bl2;
                    if (n2 >= this.h.size()) break block3;
                    if (!((String)this.h.elementAt(n2)).equals(string)) break block4;
                    bl3 = true;
                }
                return bl3;
            }
            ++n2;
        }
    }

    public boolean a(StringBuffer stringBuffer, String string, int n2) {
        al.a(stringBuffer, "*2\u3010#(");
        al.a(stringBuffer, 2810L);
        al.a(stringBuffer, ",");
        al.a(stringBuffer, (long)n2);
        al.a(stringBuffer, "r)");
        al.a(stringBuffer, "*3");
        al.a(stringBuffer, new StringBuffer().append(string).append("*2\u3011").toString());
        al.a(stringBuffer, this.c(this.a));
        return true;
    }

    public int b() {
        int n2 = b[3].size();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!this.c(i2)) continue;
            n3 = i2;
        }
        return n3;
    }

    public av b(av av2) {
        if (av2 == null) {
            av2 = a.f.b(25);
        }
        av2.a(25015, 2, 0, ((q)av2.a(25015)).f(), null);
        this.m(av2);
        this.b(av2, true);
        return av2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public q b(av g2, int n2, Vector vector) {
        void var1_6;
        void var3_8;
        int n3;
        q q2 = (q)((av)g2).a(n3);
        boolean bl2 = var3_8 != null && var3_8.size() > 0;
        if (!av.a((av)g2, n3, n3, bl2)) {
            q2.d();
            return var1_6;
        }
        int n4 = var3_8.size();
        int n5 = q2.h();
        q2.b(n4 * n5, false);
        n3 = 0;
        while (true) {
            q q3 = q2;
            if (n3 >= n4) {
                return var1_6;
            }
            af[] afArray = (af[])var3_8.elementAt(n3);
            ar ar2 = new ar(afArray[0].toString(), s.a[0], 0);
            ar2.e = afArray[1].b();
            q2.a(ar2, n3 * n5);
            q2.a(new ar(afArray[2].toString(), s.a[0], 0), n3 * n5 + 2);
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public q b(av g2, String object, int n2, Vector vector) {
        int n3;
        boolean bl2 = vector != null && vector.size() > 0;
        if (!av.a((av)g2, n2, n2, bl2)) return null;
        if (((av)g2).a / 1000 == 93) {
            object = this.a((av)g2);
            n3 = 1;
        } else if (((av)g2).a / 1000 == 146) {
            n3 = 2;
            object = null;
        } else {
            n3 = 0;
            object = null;
        }
        q q2 = (q)((av)g2).a(n2);
        int n4 = vector.size();
        int n5 = q2.h();
        q2.b(n4 * n5, false);
        int n6 = 0;
        int n7 = 0;
        while (true) {
            g2 = q2;
            if (n7 >= n4) return g2;
            ax ax2 = (ax)vector.elementAt(n7);
            n2 = ax2.b();
            n2 = ax2.r() == 1 ? s.a[5] : (n2 == 1 ? s.a[3] : (n2 == 2 ? s.a[2] : s.a[0]));
            short s2 = ax2.c();
            g2 = new ar("", 0, 0);
            ((ar)g2).d = ax2.a();
            ((ar)g2).e = s2;
            ((ar)g2).a(ax.a(ax2, 0));
            q2.a(g2, n6);
            q2.a(new ar(ax2.a(), n2, 0), n6 + 1);
            if (object != null) {
                q2.a(new ar(this.a(((ar)g2).d, (Vector)object), n2, 0), n6 + 2);
            } else if (n3 == 0) {
                q2.a(new ar(ax.b(s2), n2, 0), n6 + 2);
            } else {
                q2.a(new ar(ax2.b(), n2, 0), n6 + 4);
                q2.a(new ar(new StringBuffer().append("Lv").append(ax2.b()).toString(), n2, 0), n6 + 2);
            }
            n6 += n5;
            ++n7;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String b(int n2) {
        switch (n2) {
            default: {
                return s.d[94];
            }
            case 0: {
                return s.d[90];
            }
            case 1: {
                return s.d[91];
            }
            case 2: {
                return s.d[92];
            }
            case 3: {
                return s.d[93];
            }
            case 4: 
        }
        return s.d[94];
    }

    /*
     * Enabled aggressive block sorting
     */
    public String b(String string, String string2) {
        String[] stringArray = new String[]{"[a", "[d", "[g", "[j", "[m", "[p"};
        int n2 = 0;
        block0: while (n2 < stringArray.length) {
            StringBuffer stringBuffer = al.a(null, "");
            while (true) {
                int n3;
                int n4;
                block16: {
                    int n5;
                    block15: {
                        block14: {
                            block13: {
                                block12: {
                                    if ((n4 = string2.indexOf(stringArray[n2])) < 0) {
                                        al.a(stringBuffer, string2);
                                        string2 = stringBuffer.toString();
                                        ++n2;
                                        continue block0;
                                    }
                                    if (n4 + 4 > string2.length() || !aw.b(string2.substring(n4 + 2, n4 + 4))) break block12;
                                    n3 = 2;
                                    break block13;
                                }
                                if (n4 + 3 > string2.length() || !aw.b(string2.substring(n4 + 2, n4 + 3))) break block14;
                                n3 = 1;
                            }
                            n5 = Integer.parseInt(string2.substring(n4 + 2, n4 + 2 + n3));
                            al.a(stringBuffer, string2.substring(0, n4));
                            if (n2 >= 3) break block15;
                            int n6 = 1;
                            if (n2 == 1) {
                                n6 = 2;
                            } else if (n2 == 2) {
                                n6 = 8;
                            }
                            if (stringBuffer.length() < 100) {
                                this.a(stringBuffer, n6, n5, string);
                            }
                            break block16;
                        }
                        al.a(stringBuffer, string2.substring(0, n4 + 2));
                        string2 = string2.substring(n4 + 2, string2.length());
                        continue;
                    }
                    if (n2 < 5) {
                        if (stringBuffer.length() < 100) {
                            Vector vector = n2 == 3 ? ay.c : ay.d;
                            this.a(stringBuffer, vector, n5, string);
                        }
                    } else if (n2 == 5 && stringBuffer.length() < 120) {
                        this.a(stringBuffer, n5);
                    }
                }
                string2 = string2.substring(n3 + (n4 + 2), string2.length());
            }
            break;
        }
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Vector b(av vector, int n2, Vector vector2) {
        Vector<ax> vector3 = null;
        if (vector == null) {
            return vector3;
        }
        vector3 = new Vector<ax>();
        int n3 = vector2.size();
        int n4 = ((g)((Object)vector)).a() / 1000;
        switch (n4) {
            default: {
                vector = null;
                break;
            }
            case 93: {
                vector = a.f.a(s.f);
                break;
            }
        }
        for (n2 = 0; n2 < n3; ++n2) {
            ax ax2;
            block8: {
                ax2 = (ax)vector2.elementAt(n2);
                switch (n4) {
                    case 93: {
                        if (s.f == 20) break;
                    }
                    default: {
                        break block8;
                    }
                }
                if (this.a((av)((Object)vector), 2, ax2.a())) continue;
            }
            vector3.addElement(ax2);
        }
        this.a(n4, vector3);
        return vector3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        int n2;
        String string;
        int n3 = 1;
        try {
            string = a.b.a(s.b, 2);
            if (string == null) {
                return;
            }
            n2 = 0;
        }
        catch (Exception exception) {
            return;
        }
        while (n2 < 7) {
            int n4 = n3 * 2;
            try {
                n3 = Integer.parseInt(string.substring(n2, n2 + 1));
            }
            catch (Exception exception) {
                n3 = 0;
            }
            if (n3 == 0) {
                this.c |= n4;
                ad.a(n2, true);
            } else {
                this.c &= ~n4;
                ad.a(n2, false);
            }
            ++n2;
            n3 = n4;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(int n2) {
        switch (n2) {
            case 122: {
                this.a.f = null;
                return;
            }
            case 145: {
                this.k = null;
                w w2 = this.a;
                w.a = null;
                this.a.a = null;
                this.a.a(0);
                ap.p = -1;
                return;
            }
            case 146: {
                this.l = null;
                return;
            }
            case 21: 
            case 22: {
                aw.b();
                return;
            }
            case 36: {
                b = null;
                return;
            }
            case 93: {
                this.a = null;
                this.a = null;
                return;
            }
            case 17: {
                bb.l();
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(int n2, av object) {
        q q2 = (q)((av)object).a(n2);
        ((av)object).c(n2, true);
        q2.a(18);
        object = a.b.a(s.b, 2);
        n2 = 0;
        while (n2 < 6) {
            Object object2 = new ar(al.a(al.a(al.a(null, "\u3010"), s.b[n2 + 120]), "\u3011").toString(), 75, 18, 0, 0);
            ((ar)object2).f = 0;
            ((ar)object2).i = s.a[6];
            q2.a((g)object2, n2 * 3 + 1);
            if (object != null) {
                int n3;
                try {
                    n3 = Integer.parseInt(((String)object).substring(n2, n2 + 1));
                }
                catch (Exception exception) {
                    n3 = 0;
                }
                String string = s.d[n3 + 74];
                object2 = s.a;
                n3 = n3 == 1 ? 2 : 3;
                q2.a(new ar(string, (int)object2[n3], 0), n2 * 3 + 2);
            } else {
                q2.a(new ar(s.d[74], s.a[3], 0), n2 * 3 + 2);
            }
            ++n2;
        }
        return;
    }

    public void b(int n2, Vector vector, av av2) {
        this.a(n2, vector, av2);
        this.e(n2, av2);
    }

    public void b(av av2) {
        String string = s.a[121];
        String string2 = s.a[69];
        String string3 = s.a[80];
        bb bb2 = this.a;
        bb.a(new String[]{"Bi\u1ec3u c\u1ea3m", string, string2, string3}, av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(av av2, int n2) {
        h h2 = (h)av2.a(7003);
        if (av2.f() / 1000 == 8) {
            h2 = (h)av2.a(8003);
        }
        if (av2.f() == 7003 || av2.f() == 7007 || av2.f() == 7008 || av2.f() == 7009 || av2.f() == 7010 || av2.f() == 7011 || av2.f() == 7012 || av2.f() == 8003 || av2.f() == 8007 || av2.f() == 8008 || av2.f() == 8009 || av2.f() == 8010 || av2.f() == 8014 || av2.f() == 8038) {
            if (av2.f() != 7003 && av2.f() / 1000 == 7 || av2.f() != 8003 && av2.f() / 1000 == 8) {
                int n3 = h2.f();
                n2 = n2 == s.a[2] ? (n3 - 1) % h2.m : (n3 + 1) % h2.m;
                h2.a(Math.abs(n2));
            }
            this.a.a(av2, true);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(av av2, int n2, int n3) {
        Object object;
        String[] stringArray;
        block19: {
            block20: {
                block22: {
                    int n4;
                    ar ar2;
                    block21: {
                        boolean bl2 = true;
                        if (av2 == null) {
                            av2 = a.f.b(36);
                            av2.a(0, new t((byte)n2));
                            av2.a(1, new an(av2.f()));
                            z.a().a(1103, (af)new ba(55), new ba((short)n2));
                            return;
                        }
                        ar2 = (ar)av.a(av2, av2.f(), 1001);
                        stringArray = av.a(av2, av2.f(), 1000);
                        if (ar2 == null) return;
                        n3 = av2.f();
                        if (n3 < 36004 || n3 > 36019) break block20;
                        n4 = ((h)av2.a(36002)).f();
                        if (av2.a(n3 + 1).a() || n3 % 2 != 0) break block21;
                        if (av2.a(n3 + 1).a()) {
                            bl2 = false;
                        }
                        for (n2 = 36004; n2 <= av2.j / 100; n2 += 2) {
                            object = (ar)av.a(av2, n2, 0);
                            if (object != null && bl2) {
                                ((ar)object).a("+");
                            }
                            av2.c(n2 + 1);
                        }
                        this.a(av2, av2.f(), bl2);
                        object = av.a(av2, n3 + 1, 1001);
                        if (n4 >= 3) {
                            if (object == null || ((g)object).e != ar2.d) {
                                if (object != null) {
                                    ((q)av2.a).d();
                                }
                                z.a().a(1103, (af)new ba(65), (af)new an(ar2.d), new an(n3 + 1));
                            }
                        } else if (object == null || ((g)object).e != ar2.e) {
                            if (object != null) {
                                ((q)av2.a).d();
                            }
                            z.a().a(1103, (af)new ba(65), (af)new an(ar2.e), new an(n3 + 1));
                        }
                        av2.f(36004);
                        object = null;
                        break block19;
                    }
                    object = "";
                    if (ar2.b == false) {
                        object = s.b[81];
                    } else if (ar2.b != false && ar2.b != true) {
                        object = s.b[82];
                    } else if (ar2.b == true) {
                        object = "";
                    }
                    if (n4 < 3) break block22;
                    object = stringArray.d == 0 ? new String[]{s.d[53]} : (stringArray.d >= 1 && stringArray.d < stringArray.e ? new String[]{s.d[53], s.d[54]} : new String[]{s.d[54]});
                    break block19;
                }
                if (stringArray.d == 0) {
                    object = new String[]{s.a[26]};
                    break block19;
                } else if (stringArray.d < stringArray.e) {
                    stringArray = new String[]{s.a[27], s.a[2], s.a[95], object};
                    object = stringArray;
                    break block19;
                } else {
                    stringArray = new String[]{s.a[2], s.a[95], object};
                    object = stringArray;
                }
                break block19;
            }
            object = n3 >= 36021 && n3 <= 36028 && this.c(n3 - 36021) ? ((object = (af[])b[3].elementAt(n3 - 36021))[4].b() >= 1 && object[4].b() == object[5].b() ? new String[]{s.d[52], s.d[54]} : new String[]{s.d[52], s.d[53]}) : null;
        }
        if (object == null) return;
        stringArray = this.a;
        bb.a(object, av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(av av2, int n2, boolean bl2) {
        if (((h)av2.a(36002)).f() != n2) {
            return;
        }
        if (b == null) return;
        if (av2 == null) return;
        ad.a(av2, true);
        int n3 = 36004;
        for (int i2 = 0; i2 < b[n2].size(); ++i2) {
            af[] afArray = (af[])b[n2].elementAt(i2);
            n3 = afArray[4].b() == 0 ? 1 : 0;
            int n4 = i2 * 2 + 36004;
            av2.b(n4);
            if (i2 == 0 && (bl2 || av2.f() < 36004)) {
                av2.d(n4);
            }
            q q2 = (q)av2.a(n4);
            Object object = new ar("+", s.a[n3], 0);
            ((ar)object).d = afArray[4].b();
            ((ar)object).e = afArray[5].b();
            q2.a((g)object, 0);
            object = new ar("", 0, 0);
            ((ar)object).d = afArray[1].b();
            ((ar)object).e = afArray[2].b();
            ((ar)object).b = (String)afArray[6].b();
            ((ar)object).a(bc.b(afArray[0].b()));
            q2.a((g)object, 1);
            int n5 = n3;
            if (afArray[5].b() != 0) {
                n5 = n3;
                if (n2 == 3) {
                    n5 = 0;
                }
            }
            q2.a(new ar(afArray[3].toString(), s.a[n5], 0), 2);
            if (afArray[4].b() != 0 || afArray[5].b() != 0 && n2 == 3) {
                object = al.a(null, afArray[4].toString());
                al.a((StringBuffer)object, "/");
                al.a((StringBuffer)object, afArray[5].toString());
                q2.a(new ar(((StringBuffer)object).toString(), s.a[n5], 0), 4);
            } else if (n2 == 3) {
                q2.a(new ar("kh\u00f4ng \u0111\u1ea3 th\u00f4ng", s.a[n5], 0), 4);
            } else {
                q2.a(new ar("kh\u00f4ng h\u1ecdc t\u1eadp", s.a[n5], 0), 4);
            }
            if (bl2) {
                n3 = n4 + 1;
                av2.c(n3);
                ((q)av2.a(n3)).d();
                continue;
            }
            n3 = n4;
        }
        if (bl2) {
            n2 = n3;
            if (n3 > 36004) {
                n2 = n3 + 1;
            }
            while (n2 <= 36019) {
                av2.c(n2);
                ((q)av2.a(n2)).d();
                ++n2;
            }
        }
        av2.f(36004);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b(av av2, boolean bl2) {
        Vector vector = this.a(((h)av2.a(25012)).f());
        boolean bl3 = vector.size() > 0;
        if (!av.a(av2, 25015, 25015, bl3)) {
            av2.c(25015);
            av2.c(25020, false);
            return;
        }
        int n2 = vector.size();
        q q2 = (q)av2.a(25015);
        int n3 = q2.h();
        q2.b(n2 * n3, false);
        int n4 = 0;
        while (true) {
            if (n4 >= n2) {
                q.a(q2, bl2);
                av2.c(25020);
                return;
            }
            bc bc2 = (bc)vector.elementAt(n4);
            Object object = new ar("", 0, 0);
            ((ar)object).a(bc2);
            ((ar)object).d = bc2.a;
            if (bc2.b - bc2.a >= 1) {
                ((ar)object).e = 1;
            }
            q2.a((g)object, n4 * n3);
            q2.a(new ar(bc2.a, al.a(bc.a(bc2.a()), bc2.f), 0), n4 * n3 + 1);
            object = new StringBuffer().append(bc2.a).append("/").append(bc2.b).toString();
            int[] nArray = s.a;
            int n5 = bc2.a == 0 ? 2 : 0;
            q2.a(new ar((String)object, nArray[n5], 0), n4 * n3 + 2);
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean b(int n2) {
        boolean bl2 = true;
        if (n2 == 2022) {
            return bl2;
        }
        String string = a.b.a(s.b, 2);
        int n3 = 1;
        for (int i2 = 0; i2 < 7; ++i2) {
            int n4 = n3 * 2;
            if (string != null) {
                try {
                    n3 = Integer.parseInt(string.substring(i2, i2 + 1));
                }
                catch (Exception exception) {
                    this.c |= n4;
                    n3 = 0;
                }
                this.c = n3 == 0 ? (this.c |= n4) : (this.c &= ~n4);
            } else {
                this.c |= n4;
            }
            n3 = n4;
        }
        switch (n2) {
            default: {
                return false;
            }
            case 0: 
            case 2021: {
                if ((this.c & 2) != 0) return bl2;
                return false;
            }
            case 1: 
            case 2001: 
            case 2026: {
                if ((this.c & 4) != 0) return bl2;
                return false;
            }
            case 5: 
            case 2000: {
                if ((this.c & 0x20) != 0) return bl2;
                return false;
            }
            case 3: 
            case 2004: {
                if ((this.c & 0x10) != 0) return bl2;
                return false;
            }
            case 4: 
            case 2003: {
                if ((this.c & 8) != 0) return bl2;
                return false;
            }
            case 6: 
            case 2017: 
        }
        if ((this.c & 0x40) != 0) return bl2;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(av av2, int n2) {
        if (av2 == null) return false;
        if (n2 != 0) return true;
        a.f.a(43);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public q c(av g2, String object, int n2, Vector vector) {
        boolean bl2 = vector != null && vector.size() > 0;
        if (!av.a((av)g2, n2, n2, bl2)) return null;
        Vector vector2 = ((av)g2).a / 1000 == 93 ? this.a((av)g2) : null;
        q q2 = (q)((av)g2).a(n2);
        if (((String)object).equals(s.a[148]) && n2 == 145005) {
            q2.b = (int[])((av)g2).a(3);
        }
        int n3 = vector.size();
        int n4 = q2.h();
        q2.b(n3 * n4, false);
        n2 = 0;
        while (true) {
            g2 = q2;
            if (n2 >= n3) return g2;
            object = (e)vector.elementAt(n2);
            g2 = new ar("", 0, 0);
            ((ar)g2).a(a.e.a(((e)object).l()));
            ((ar)g2).d = ((e)object).a();
            q2.a(g2, n2 * n4);
            q2.a(new ar(((e)object).a(), s.a[0], 0), n2 * n4 + 1);
            if (vector2 != null) {
                q2.a(new ar(this.a(((ar)g2).d, vector2), s.a[0], 0), n2 * n4 + 2);
            } else {
                q2.a(new ar(new StringBuffer().append("Lv:").append(((e)object).b()).toString(), s.a[0], 0), n2 * n4 + 2);
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public Vector c(av vector, int n2, Vector vector2) {
        if (vector == null) {
            return null;
        }
        Vector<e> vector3 = new Vector<e>();
        int n3 = vector2.size();
        int n4 = ((g)((Object)vector)).a() / 1000;
        n2 = 0;
        while (true) {
            block6: {
                if (n2 >= n3) {
                    this.a(n4, vector3);
                    return vector3;
                }
                e e2 = (e)vector2.elementAt(n2);
                switch (n4) {
                    default: {
                        break;
                    }
                    case 145: {
                        if (((av)((Object)vector)).b(0).b() == 5 && w.a(e2) && e2.c() > 0) break block6;
                    }
                }
                vector3.addElement(e2);
            }
            ++n2;
        }
    }

    public void c() {
        this.b.removeAllElements();
        this.c.removeAllElements();
        this.d.removeAllElements();
        this.e.removeAllElements();
        this.g.removeAllElements();
        this.f.removeAllElements();
        this.h.removeAllElements();
        this.i.removeAllElements();
        this.a = new Vector[10];
    }

    public void c(int n2, av g2) {
        if (n2 == 20025) {
            ad.a((av)g2, true);
        }
        q q2 = (q)((av)g2).a(n2);
        q2.d();
        q2.b(0);
        ((av)g2).c(n2, false);
        ((av)g2).d(n2);
        q2.a(64, true);
        for (n2 = 0; n2 < 23; ++n2) {
            g2 = new ar("", 0, 0);
            ((ar)g2).a(new bf(4491616, n2));
            q2.a(g2, n2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void c(av av2) {
        if (av2.a(21002).a()) {
            av2.c(21002);
            av2.d(21008);
            ad.a(av2, true);
            return;
        }
        a.f.a(21);
    }

    /*
     * Unable to fully structure code
     */
    public void c(av var1_1, int var2_2) {
        block13: {
            block14: {
                block10: {
                    block11: {
                        block12: {
                            block9: {
                                var5_3 = ((q)var1_1.a(var2_2)).e() / 3;
                                var9_4 = a.b.a(s.b, 2);
                                var8_5 = al.a(null, "");
                                var4_6 = 1;
                                var3_7 = 0;
                                block4: while (true) {
                                    var7_9 = var8_5;
                                    if (var3_7 >= 7) break block9;
                                    var6_8 = Integer.parseInt(var9_4.substring(var3_7, var3_7 + 1));
                                    var4_6 *= 2;
                                    if (var5_3 != var3_7) break block10;
                                    if (var9_4 == null) break block11;
                                    ** if (var6_8 != 1) goto lbl-1000
lbl-1000:
                                    // 1 sources

                                    {
                                        al.a(var8_5, "0");
                                        this.c |= var4_6;
                                        ad.a(var3_7, true);
lbl19:
                                        // 5 sources

                                        while (true) {
                                            ++var3_7;
                                            continue block4;
                                            break;
                                        }
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        break block12;
                                    }
                                    break;
                                }
                                catch (Exception var7_10) {
                                    var7_9 = al.a(null, "0000000");
                                }
                            }
                            try {
                                a.b.a(s.b, 2, var7_9.toString());
lbl28:
                                // 2 sources

                                while (true) {
                                    this.b(var2_2, var1_1);
                                    return;
                                }
                            }
                            catch (Exception var7_11) {
                                ** continue;
                            }
                        }
                        al.a(var8_5, "1");
                        this.c &= ~var4_6;
                        ad.a(var3_7, false);
                        ** GOTO lbl19
                    }
                    al.a(var8_5, "1");
                    this.c &= ~var4_6;
                    ad.a(var3_7, false);
                    ** GOTO lbl19
                }
                if (var9_4 == null) break block13;
                if (var6_8 != 0) break block14;
                this.c |= var4_6;
lbl47:
                // 2 sources

                while (true) {
                    al.a(var8_5, (long)var6_8);
                    ** GOTO lbl19
                    break;
                }
            }
            this.c &= ~var4_6;
            ** while (true)
        }
        al.a(var8_5, "0");
        this.c |= var4_6;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void c(av g2, boolean bl2) {
        int n2 = ((av)g2).b(0).b();
        String string = ((av)g2).a(39002).a();
        if (bl2) {
            af[] afArray = null;
            if (string.equals(s.b[199])) {
                afArray = new af[]{new ba(10)};
            } else if (string.equals(s.d[118])) {
                afArray = new af[]{new ba(40)};
            } else if (string.equals(s.a[69])) {
                afArray = new af[]{new ba(70)};
            } else if (string.equals(s.a[73])) {
                afArray = new af[]{new ba(0)};
            } else if (string.equals(s.d[169])) {
                afArray = new af[]{new ba(1)};
            } else if (string.equals(s.a[94])) {
                afArray = new af[]{new ba(2)};
            } else if (string.equals(s.a[143])) {
                afArray = new af[]{new ba(65)};
            }
            if (n2 == 1) {
                if (((av)g2).a(0) == null) {
                    ((av)g2).a(0, 1151, 1, ((q)((av)g2).a(39004)).f(), afArray);
                } else {
                    ((av)g2).a(0, -1, 0, 1, 0);
                    ((av)g2).a(4).a(afArray[0].b());
                }
                ((r)((av)g2).a(39005)).d();
                ((av)g2).b(0);
                return;
            }
            if (n2 != 0) return;
            if (afArray[0].b() == 1) {
                ((av)g2).b(39003);
                ((av)g2).f(39004);
            } else {
                ((av)g2).c(39003);
            }
            ((av)g2).c(39004);
            z.a().a(1532, afArray[0]);
            return;
        }
        if (((av)g2).f() != 39004) {
            if (((av)g2).f() != 39003) return;
            this.a.a(null, -1, 2, -1);
            return;
        }
        if ((g2 = (ar)av.a((av)g2, ((av)g2).f(), 1001)) == null) return;
        if (string.equals(s.b[199]) || string.equals(s.d[118]) || string.equals(s.a[143])) {
            z.a().a(1303, (af)new t(1), new an(((ar)g2).d));
            return;
        }
        if (string.equals(s.a[69])) {
            z.a().a(1127, (af)new t(15), new an(((ar)g2).d));
            return;
        }
        if (!string.equals(s.d[169])) return;
        z.a().a(1032, (af)new t(1), (af)new an(((ar)g2).d), new an(0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(int n2) {
        if (n2 > b[3].size() - 1) {
            return false;
        }
        af[] afArray = (af[])b[3].elementAt(n2);
        if (n2 <= 0) return true;
        af[] afArray2 = (af[])b[3].elementAt(n2 - 1);
        if (afArray[4].b() > afArray[5].b()) return false;
        if (afArray2[4].b() < 1) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Vector d(av vector, int n2, Vector vector2) {
        if (vector == null) {
            return null;
        }
        Vector<af[]> vector3 = new Vector<af[]>();
        int n3 = vector2.size();
        int n4 = ((g)((Object)vector)).a() / 1000;
        for (n2 = 0; n2 < n3; ++n2) {
            vector3.addElement((af[])vector2.elementAt(n2));
        }
        this.a(n4, vector3);
        return vector3;
    }

    /*
     * Unable to fully structure code
     */
    public void d(int var1_1, av var2_2) {
        switch (var1_1) lbl-1000:
        // 4 sources

        {
            default: lbl-1000:
            // 2 sources

            {
                return;
            }
            case 122: {
                this.a.f = new Vector<E>();
                ** GOTO lbl-1000
            }
            case 145: {
                if (ap.p != -1) {
                    ap.o = ap.p;
                }
                this.k = new Vector<E>();
                var3_3 = this.a;
                w.a = new Vector<E>();
            }
            case 146: {
                if (var1_1 == 146) {
                    this.l = new Vector<E>();
                }
                var2_2.a(0, new an(0));
                var2_2.a(1, new an(0));
                var2_2.a(2, new an(1));
                var2_2.a(3, ((q)var2_2.a((int)(var2_2.a + 5))).b);
                var2_2.a(4, new d(System.currentTimeMillis()));
                ** GOTO lbl-1000
            }
            case 36: {
                ad.b = new Vector[]{new Vector<E>(), new Vector<E>(), new Vector<E>(), new Vector<E>()};
                ** GOTO lbl-1000
            }
            case 93: 
        }
        ((q)var2_2.a(93005)).c((int)q.a[1], true);
        this.a = new Vector<E>(5);
        var2_2.a(0, new an(1));
        var2_2.a(1, new an(0));
        var2_2.a(2, new j(""));
        var2_2.a(3, new j(""));
        var2_2.a(4, new an(0));
        var2_2.a(5, (Object)null);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void d(av av2) {
        String[] stringArray = null;
        int n2 = av2.f();
        if (n2 == 22001) {
            bn.a(s.d[375], 80, 0, 22001, (bi)av2);
            return;
        }
        if (n2 == 22002) {
            this.a = 1;
            this.a();
            return;
        }
        if (22008 == n2) {
            this.b(av2);
            return;
        }
        if (n2 == 22011) {
            this.a(22011, 22001, 22003, null, av2);
            return;
        }
        if (n2 != 22003) return;
        if (((r)av2.a(22003)).f() < 5) {
            av2.d(22001);
            return;
        }
        if (aw.e() == 0) {
            stringArray = new String[]{s.a[21], s.a[2], s.a[22], s.a[23]};
        } else if (this.a(aw.e())) {
            return;
        }
        bb bb2 = this.a;
        bb.a(stringArray, av2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void d(av av2, int n2) {
        g g2;
        ar ar2;
        int n3 = av2.f();
        int n4 = ((h)av2.a(36002)).f();
        if (n4 < 3) {
            ar2 = (ar)av.a(av2, av2.f(), 1001);
            g2 = av.a(av2, av2.f(), 1000);
        } else {
            g2 = null;
            ar2 = null;
        }
        if (n2 != 1789450000) return;
        String string = this.a.a(10);
        n2 = n4 < 3 ? (av2.f() % 2 == 0 ? (g2.d == 0 ? ar2.d * 1000 + g2.d + 1 : ar2.d * 1000 + g2.d) : ar2.d) : 0;
        if (string.equals(s.a[2])) {
            z.a().a(1032, (af)new t(8), (af)new an(n2), new t(0));
            return;
        }
        if (string.equals(s.a[26]) || string.equals(s.a[27])) {
            if (n3 % 2 == 0) {
                z.a().a(1032, new t(9), new an(0), new an(n2), new an(n4), new an(0));
            } else {
                z.a().a(1032, new t(9), new an(ar2.e), new an(n2), new an(n4), new an(n3));
            }
            av2.a(1, new an(n4));
            av2.a(2, new an(n3));
            return;
        }
        if (string.equals(s.a[95])) {
            this.h(null, 1);
            return;
        }
        if (string.equals(s.b[81])) {
            z.a().a(1103, new ba(61), new an(av.a((av)av2, (int)(av2.f() - 1), (int)1001).e), new an(n2), new an(n3));
            return;
        }
        if (string.equals(s.b[82])) {
            a.f.a(s.d[19], "", (int)(av2.a + 2), -1, false, av2, null);
            return;
        }
        if (string.equals(s.d[52])) {
            this.a.a(null, 0, this.a(n3, 1));
            return;
        }
        if (string.equals(s.d[53])) {
            z.a().a(1032, new t(9), new an(this.a(n3, 1)), new an(this.a(n3, 1) * 1000 + this.a(n3, 4)), new an(n4), new an(0));
            return;
        }
        if (!string.equals(s.d[54])) return;
        z.a().a(1032, (af)new t(8), (af)new an(this.a(n3, 1) * 1000 + this.a(n3, 4)), new t(0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void e(av av2) {
        if (av2.a(22011).a()) {
            av2.c(22011);
            ad.a(av2, true);
            av2.v = ((r)av2.a(22003)).f();
            if (av2.v == 0) {
                av2.v = 1;
            }
            return;
        }
        if (av2.b(0).b() == 1) {
            this.a(0, s.a[12], 1, this.a((String)null));
        }
        a.f.a(22);
    }

    public void e(av av2, int n2) {
        av av3 = av2;
        if (av2 == null) {
            av3 = a.f.b(51);
        }
        ((h)av3.a(51004)).a(n2);
        this.w(av3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void f(av var1_1) {
        block52: {
            block50: {
                block54: {
                    block51: {
                        block55: {
                            block53: {
                                block49: {
                                    var7_2 = true;
                                    var3_3 = true;
                                    var8_4 = true;
                                    var4_5 = true;
                                    var9_6 = true;
                                    var6_7 = true;
                                    var5_8 = false;
                                    var2_9 = var1_1.f();
                                    if (var2_9 == 23008) lbl-1000:
                                    // 5 sources

                                    {
                                        return;
                                    }
                                    if (var2_9 != 23003) break block49;
                                    var10_10 /* !! */  = av.a(var1_1, var2_9, 1002);
                                    block0 : switch (var10_10 /* !! */ .d) {
                                        default: {
                                            var10_10 /* !! */  = null;
lbl17:
                                            // 1 sources

                                            while (true) {
                                                if (var10_10 /* !! */  == null) ** GOTO lbl-1000
                                                var11_11 = this.a;
                                                bb.a(var10_10 /* !! */ , var1_1);
                                                ** GOTO lbl-1000
                                                break;
                                            }
                                        }
                                        case 0: 
                                        case 4: {
                                            if (var10_10 /* !! */ .d != 0) ** GOTO lbl30
                                            z.a().a(1056, new ba(31));
lbl25:
                                            // 2 sources

                                            while (var10_10 /* !! */ .a().equals(s.d[74])) {
                                                ((ar)var10_10 /* !! */ ).a(s.d[75]);
                                                var10_10 /* !! */  = null;
                                                break block0;
                                            }
                                            ** GOTO lbl32
lbl30:
                                            // 1 sources

                                            z.a().a(1040, new t(13));
                                            ** GOTO lbl25
lbl32:
                                            // 1 sources

                                            ((ar)var10_10 /* !! */ ).a(s.d[74]);
                                            var10_10 /* !! */  = null;
                                            break;
                                        }
                                        case 1: {
                                            if (!w.c) {
                                                var3_3 = var6_7;
lbl38:
                                                // 2 sources

                                                while (true) {
                                                    w.c = var3_3;
                                                    var11_11 = (ar)var10_10 /* !! */ ;
                                                    if (w.c) {
                                                        var10_10 /* !! */  = s.d[74];
lbl43:
                                                        // 2 sources

                                                        while (true) {
                                                            var11_11.a((String)var10_10 /* !! */ );
                                                            var10_10 /* !! */  = null;
                                                            break block0;
                                                            break;
                                                        }
                                                    }
                                                    var10_10 /* !! */  = s.d[75];
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            break block50;
                                        }
                                        case 2: {
                                            if (w.b() != 0) ** GOTO lbl66
                                            if (!bl.e) {
                                                var3_3 = var7_2;
lbl54:
                                                // 2 sources

                                                while (true) {
                                                    bl.e = var3_3;
                                                    var11_11 = (ar)var10_10 /* !! */ ;
                                                    if (bl.e) {
                                                        var10_10 /* !! */  = s.d[74];
lbl59:
                                                        // 2 sources

                                                        while (true) {
                                                            var11_11.a((String)var10_10 /* !! */ );
                                                            var10_10 /* !! */  = null;
                                                            break block0;
                                                            break;
                                                        }
                                                    }
                                                    var10_10 /* !! */  = s.d[75];
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            break block51;
lbl66:
                                            // 1 sources

                                            a.f.a(s.d[130]);
                                            var10_10 /* !! */  = null;
                                            break;
                                        }
                                        case 3: {
                                            var10_10 /* !! */  = new String[]{s.d[20], s.d[21], s.d[22], s.d[23]};
                                            break;
                                        }
                                        case 100: {
                                            this.h(null, 0);
                                            var10_10 /* !! */  = null;
                                            break;
                                        }
                                        case 101: {
                                            this.b(23005, var1_1);
                                            var1_1.a.b(0, ac.b - var1_1.a.h >> 1);
                                            var10_10 /* !! */  = null;
                                            break;
                                        }
                                        case 102: {
                                            this.D(null);
                                            var10_10 /* !! */  = null;
                                            break;
                                        }
                                        case 103: {
                                            if ((bl.k & 16) == 0) lbl-1000:
                                            // 2 sources

                                            {
                                                while (true) {
                                                    bl.b(16, var3_3);
                                                    var11_11 = (ar)var10_10 /* !! */ ;
                                                    if ((bl.k & 16) == 0) {
                                                        var10_10 /* !! */  = s.d[74];
lbl93:
                                                        // 2 sources

                                                        while (true) {
                                                            var11_11.a((String)var10_10 /* !! */ );
                                                            var10_10 /* !! */  = null;
                                                            break block0;
                                                            break;
                                                        }
                                                    }
                                                    var10_10 /* !! */  = s.d[75];
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            break block52;
                                        }
                                        case 200: {
                                            var10_10 /* !! */  = new String[]{this.d(0), this.d(1), this.d(2), this.d(3)};
                                            break;
                                        }
                                        case 201: {
                                            var10_10 /* !! */  = new String[]{this.e(1), this.e(2), this.e(3), this.e(4)};
                                            break;
                                        }
                                        case 202: {
                                            var3_3 = var5_8;
                                            if (!ap.a) {
                                                var3_3 = true;
                                            }
                                            ap.a = var3_3;
                                            var11_11 = (ar)var10_10 /* !! */ ;
                                            if (ap.a) {
                                                var10_10 /* !! */  = s.d[74];
lbl114:
                                                // 2 sources

                                                while (true) {
                                                    var11_11.a((String)var10_10 /* !! */ );
                                                    ad.a(6, ap.a);
                                                    var10_10 /* !! */  = null;
                                                    break block0;
                                                    break;
                                                }
                                            }
                                            var10_10 /* !! */  = s.d[75];
                                            ** continue;
                                        }
                                        case 203: {
                                            if ((bl.k & 2) == 0) {
                                                var3_3 = var8_4;
lbl124:
                                                // 2 sources

                                                while (true) {
                                                    bl.b(2, var3_3);
                                                    var11_11 = (ar)var10_10 /* !! */ ;
                                                    if ((bl.k & 2) == 0) {
                                                        var10_10 /* !! */  = s.d[74];
lbl129:
                                                        // 2 sources

                                                        while (true) {
                                                            var11_11.a((String)var10_10 /* !! */ );
                                                            var10_10 /* !! */  = null;
                                                            break block0;
                                                            break;
                                                        }
                                                    }
                                                    var10_10 /* !! */  = s.d[75];
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            break block53;
                                        }
                                        case 204: {
                                            var10_10 /* !! */  = new String[]{s.b[110], s.b[111], s.b[112]};
                                            break;
                                        }
                                        case 205: {
                                            if (!ap.c) {
                                                var3_3 = var4_5;
lbl142:
                                                // 2 sources

                                                while (true) {
                                                    ap.c = var3_3;
                                                    var11_11 = (ar)var10_10 /* !! */ ;
                                                    if (ap.c) {
                                                        var10_10 /* !! */  = s.d[74];
lbl147:
                                                        // 2 sources

                                                        while (true) {
                                                            var11_11.a((String)var10_10 /* !! */ );
                                                            var10_10 /* !! */  = null;
                                                            break block0;
                                                            break;
                                                        }
                                                    }
                                                    var10_10 /* !! */  = s.d[75];
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            break block54;
                                        }
                                        case 206: {
                                            if (!ap.d) {
                                                var3_3 = var9_6;
lbl157:
                                                // 2 sources

                                                while (true) {
                                                    ap.d = var3_3;
                                                    var11_11 = (ar)var10_10 /* !! */ ;
                                                    if (ap.d) {
                                                        var10_10 /* !! */  = s.d[74];
lbl162:
                                                        // 2 sources

                                                        while (true) {
                                                            var11_11.a((String)var10_10 /* !! */ );
                                                            var10_10 /* !! */  = null;
                                                            break block0;
                                                            break;
                                                        }
                                                    }
                                                    var10_10 /* !! */  = s.d[75];
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            break block55;
                                        }
                                        case 207: {
                                            var10_10 /* !! */  = new String[]{s.b[131], s.b[132], s.b[133]};
                                            break;
                                        }
                                    }
                                    ** while (true)
                                }
                                if (var2_9 != 23005) ** GOTO lbl-1000
                                this.c(var1_1, 23005);
                                ** while (true)
                            }
                            var3_3 = false;
                            ** while (true)
                        }
                        var3_3 = false;
                        ** while (true)
                    }
                    var3_3 = false;
                    ** while (true)
                }
                var3_3 = false;
                ** while (true)
            }
            var3_3 = false;
            ** while (true)
        }
        var3_3 = false;
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void f(av av2, int n2) {
        if (av2 == null) {
            av2 = a.f.b(39);
        }
        av2.a(0, new ba((short)n2));
        ad.a(av2, n2, 0, 0, 39002);
        if (n2 == 2) {
            av2.c(39001);
            av2.c(39002);
            av2.a(39005).b(0, av2.a((int)39002).b);
            av2.a(0, 1151, 1, ((q)av2.a(39004)).f(), new af[]{new ba(91)});
            av2.b(0);
            return;
        }
        this.c(av2, true);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void g(av var1_1) {
        var2_2 = 0;
        var5_3 = av.a((av)var1_1, var1_1.f(), 1002);
        var3_4 = this.a.a(0);
        var1_1 = this.a.a(10);
        cfr_temp_0 = 0;
        do {
            switch (cfr_temp_0 == 0 ? var5_3.d : cfr_temp_0) {
                case 204: {
                    m.g = var3_4;
                    ** break;
                }
                case 207: {
                    ** GOTO lbl29
                }
                case 3: {
                    al.a = (byte)var3_4;
                }
lbl15:
                // 3 sources

                default: {
                    ** GOTO lbl31
                }
                case 200: {
                    ap.r = var3_4;
                    var6_5 = z.a();
                    var4_6 = new t(18);
                    if (var3_4 >= 2) {
                        var2_2 = 1;
                    }
                    var6_5.a(1040, (af)var4_6, new an(var2_2));
                    ** GOTO lbl31
                }
                case 201: {
                    ap.q = var3_4 + 1;
                    ((ar)var5_3).a(this.e(-1));
                    return;
                }
lbl29:
                // 1 sources

                m.g = (byte)(var3_4 + 1);
                ((ar)var5_3).a(s.b[m.g + 130]);
lbl31:
                // 3 sources

                cfr_temp_0 = 102;
                ((ar)var5_3).a((String)var1_1);
                case 102: 
            }
            return;
        } while (true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void g(av g2, int n2) {
        bc bc2 = this.a(true);
        g2 = (q)((av)g2).a(n2);
        ar ar2 = (ar)((q)g2).a(1);
        ar2.d = bc2.a;
        ar2.b = (String)32;
        ar2.e = bc2.a();
        ar2.a(bc2);
        g2 = (ar)((q)g2).a(2);
        ((ar)g2).a(bc2.a);
        ((ar)g2).i = al.a((long)bc2.a(), bc2.f);
        if (n2 == 17006) {
            ap.a[0] = new an(bc2.g);
            ap.a[1] = new j(bc2.a);
            ap.a[2] = new an(bc2.a());
            return;
        }
        ap.a[4] = new an(bc2.g);
        ap.a[5] = new j(bc2.a);
        ap.a[6] = new an(bc2.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    public void h(av av2) {
        if (av2 == null) return;
        if (this.a == null) {
            return;
        }
        if (av2.f() != 93005) return;
        if (this.a(av2, 93006, 93005, this.a, false) == null) return;
        if (this.a != null && !((h)av2.a(93006)).a().equals(s.b[14])) {
            bb bb2 = this.a;
            bb.a(this.a, av2);
            return;
        }
        this.j(av2);
    }

    public void h(av av2, int n2) {
        av av3 = av2;
        if (av2 == null) {
            av3 = a.f.b(122);
            z.a().a(1523, new t(2));
            av3.a(s.d[112]);
        }
        ((h)av3.a(122004)).a(n2);
        this.G(av3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void i(av av2) {
        String string = this.a.a(10);
        Object object = this.a(av2, 93006, 93005, this.a, false);
        g g2 = av.a(av2, 93005, 1000);
        if (string.equals(s.a[2])) {
            if (object instanceof bc || object instanceof g && ((g)object).d == 32) {
                if (s.f == 8) {
                    av2 = a.f.a(8);
                    z.a().a(1032, (af)new t(1), (af)new an(g2.d), av2.b(1));
                    return;
                }
                z.a().a(1032, (af)new t(1), (af)new an(g2.d), new an(0));
                return;
            }
            if (object instanceof ax || object instanceof g && ((g)object).d == 2) {
                z.a().a(1127, (af)new t(29), new an(g2.d));
                return;
            }
            if (object instanceof e || object instanceof g && ((g)object).d == 64) {
                z.a().a(1303, (af)new t(1), new an(g2.d));
                return;
            }
            if (s.f == 93 && object instanceof g) {
                if (((g)object).e == 32) {
                    z.a().a(1032, (af)new t(1), (af)new an(g2.d), new an(0));
                    return;
                }
                if (((g)object).e == 2) {
                    z.a().a(1127, (af)new t(29), new an(g2.d));
                    return;
                }
                if (((g)object).e == 64) {
                    z.a().a(1303, (af)new t(1), new an(g2.d));
                    return;
                }
                if (g2.d <= 1000000000) return;
                a.f.a(93);
                this.a.a(null, 0, 0, g2.d);
                return;
            }
            if (s.f != 122) return;
            z.a().a(1032, (af)new t(8), (af)new an(g2.e), new an(0));
            return;
        }
        if (!string.equals(s.b[9])) {
            this.j(av2);
            return;
        }
        if (s.f == 93) {
            object = av2.b(3).toString();
            if (((String)object).equals("")) {
                this.k(av2);
                return;
            }
            a.f.a(al.a((String)object, "@#", av.a(av2, 93005, 1001).a()), "", (int)(av2.a + 3), -1, false, av2, null);
            return;
        }
        if (s.f == 57) {
            this.c(av2, object);
            return;
        }
        if (s.f == 20) {
            g2 = a.f.a(s.f);
            if (g2 != null && ((av)g2).f() == 20004) {
                this.b(av2, object);
                return;
            }
            this.j(av2);
            return;
        }
        if (s.f != 70 && s.f != 104) {
            this.j(av2);
            return;
        }
        this.b(av2, object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void j(av av2) {
        av av3 = a.f.a(s.f);
        if (av3 == null || av2.a == null) {
            a.f.a((int)(av2.a / 1000));
            return;
        }
        av3.a(this.a(av2, 93006), av2);
    }

    public void k(av av2) {
        af[] afArray = (af[])av2.a(1);
        afArray[2].a(av.a((av)av2, (int)93005, (int)1000).d);
        z.a().a(afArray, 0);
        if (av2.b(4).b() == 0) {
            a.f.a(93);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void l(av av2) {
        int n2 = 1;
        Object object = a.f.a(1);
        av av3 = a.f.a(s.f);
        if (object != null) {
            n2 = ((n)((av)object).a(1003)).f();
        }
        object = this.a(false);
        if (n2 > 0 && n2 <= this.a(av3, (bc)object)) {
            if (s.f == 70) {
                av.a((av)av3, (int)70020, (int)0).c = n2;
            } else if (s.f == 20) {
                av.a((av)av3, (int)20004, (int)1000).c = n2;
            } else {
                av.a((av)av3, (int)104009, (int)1000).c = n2;
            }
            this.j(av2);
            return;
        }
        a.f.a(s.d[200]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void m(av g2) {
        if (g2 == null) {
            return;
        }
        g2 = (q)((av)g2).a(25013);
        g g3 = new ar("", 0, 0);
        ((ar)g3).a(bc.a(3200));
        ((q)g2).a(g3, 0);
        g3 = new x(30, 8, 2, 0, 0);
        ((x)g3).a(ay.a.g(15));
        ((q)g2).a(g3, 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void n(av g2) {
        int n2 = ((av)g2).f();
        if (n2 == 25014) {
            if (!((av)g2).a(25015).a()) return;
            z.a().a(1009, (af)new ba(15), new ba((short)((h)((av)g2).a(25012)).f()));
            ac.a(true, false);
            return;
        }
        if (n2 != 25015) return;
        g2 = av.a((av)g2, n2, 1000);
        if (g2.e == 1) {
            z.a().a(1009, (af)new ba(14), new an(g2.d));
            ac.a(true, false);
            return;
        }
        a.f.a("Trang b\u1ecb n\u00e0y kh\u00f4ng th\u1ec3 s\u1eeda!");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void o(av av2) {
        int n2 = av2.b(0).b();
        if (av2.a / 1000 == 146) {
            a.a.a().a(av2);
            return;
        }
        if (n2 != 0 && n2 != 2 && n2 != 1) {
            if (n2 != 3) return;
            av2.c(145004, false);
            a.a.a().a(av2);
            return;
        }
        q q2 = (q)av2.a(145004);
        if (!q2.a()) {
            av2.c(145004, false);
            if (n2 == 1) {
                q2.a(1, true);
                q2.d = (int[])145003;
                q2.e = (int[])145005;
                av2.a((int)145003).e = 145004;
                av2.a((int)145005).d = 145004;
            }
        }
        this.a(av2, 145004, av.a(av2, 145003).equals(s.a[76]));
    }

    /*
     * Unable to fully structure code
     */
    public void p(av var1_1) {
        block25: {
            block24: {
                block23: {
                    block22: {
                        block20: {
                            block21: {
                                block19: {
                                    block18: {
                                        block17: {
                                            block16: {
                                                block15: {
                                                    block13: {
                                                        block14: {
                                                            var2_2 = var1_1.b(0).b();
                                                            var3_3 = var1_1.f();
                                                            if (var3_3 != 145004) break block13;
                                                            var4_4 = av.a(var1_1, 145003);
                                                            if (var2_2 != 1) ** GOTO lbl11
                                                            if (!var4_4.equals(s.a[75])) break block14;
                                                            var4_4 = new StringBuffer().append(s.d[417]).append(ay.a.g(15)).toString();
lbl8:
                                                            // 2 sources

                                                            while (true) {
                                                                a.f.a(var4_4, s.d[418], (int)(var1_1.a + 4), -1, true, var1_1, null);
lbl11:
                                                                // 6 sources

                                                                return;
                                                            }
                                                        }
                                                        var4_4 = new StringBuffer().append(s.d[416]).append(ay.a.g(16)).toString();
                                                        ** while (true)
                                                    }
                                                    if (var3_3 != 145005) ** GOTO lbl11
                                                    var5_6 = av.a(var1_1, 145003);
                                                    var4_5 = (String[])var1_1.a(145005);
                                                    var4_5 = null;
                                                    switch (var2_2) {
                                                        default: {
                                                            var2_2 = av.a((av)var1_1, (int)145005, (int)1000).e;
                                                            var4_5 = ay.a(av.a((av)var1_1, (int)145005, (int)1000).d, ay.a);
                                                            if (!var5_6.equals(s.a[80])) break block15;
                                                            if (bc.a(var2_2) <= bc.a(-2104967297) || bc.a(var2_2) > bc.a(-2094967297)) break;
                                                            var4_5 = new String[]{s.a[2], s.a[3], "", s.a[5]};
lbl28:
                                                            // 24 sources

                                                            while (true) {
                                                                if (var4_5 == null) ** GOTO lbl11
                                                                var5_6 = this.a;
                                                                bb.a(var4_5, var1_1);
                                                                ** GOTO lbl11
                                                                break;
                                                            }
                                                        }
                                                        case 5: {
                                                            var2_2 = var1_1.b(1).b();
                                                            if (var2_2 != 0) ** GOTO lbl44
                                                            if (ay.a.b() < bl.b % 10000) ** GOTO lbl39
                                                            var4_5 = new String[]{s.a[2], s.a[12], s.a[23], s.b[153], s.a[20], s.b[68], s.b[56]};
                                                            ** GOTO lbl28
lbl39:
                                                            // 1 sources

                                                            if (bl.b / 10000 % 10 != 0) ** GOTO lbl42
                                                            var4_5 = new String[]{s.a[2], s.a[12], s.a[23], s.b[153], s.a[20], s.b[68], s.b[55]};
                                                            ** GOTO lbl28
lbl42:
                                                            // 1 sources

                                                            var4_5 = new String[]{s.a[2], s.a[12], s.a[23], s.b[153], s.a[20], s.b[68]};
                                                            ** GOTO lbl28
lbl44:
                                                            // 1 sources

                                                            if (var2_2 != 15) ** GOTO lbl47
                                                            this.a.a(new an(av.a((av)var1_1, (int)145005, (int)1000).d));
                                                            ** GOTO lbl28
lbl47:
                                                            // 1 sources

                                                            if (var2_2 != 9) ** GOTO lbl50
                                                            var4_5 = new String[]{s.b[1], s.a[2], s.a[12]};
                                                            ** GOTO lbl28
lbl50:
                                                            // 1 sources

                                                            ad.a(av.a((av)var1_1, (int)145005, (int)1000).d, var2_2);
                                                            ** GOTO lbl28
                                                        }
                                                        case 1: 
                                                        case 3: {
                                                            if (!var5_6.equals(s.a[75])) ** GOTO lbl57
                                                            var4_5 = new String[]{s.a[2], s.a[7]};
                                                            ** GOTO lbl28
lbl57:
                                                            // 1 sources

                                                            var4_5 = new String[]{s.a[2], s.a[8]};
                                                            ** GOTO lbl28
                                                        }
                                                        case 2: {
                                                            if (var5_6.equals(s.b[10])) {
                                                                z.a().a(1033, (af)new ba(10), new an(av.a((av)var1_1, (int)145005, (int)1000).d));
                                                                ** continue;
                                                            }
                                                            if (!var5_6.equals(s.a[10])) ** GOTO lbl66
                                                            var4_5 = new String[]{s.a[10], s.a[2], s.a[5]};
                                                            ** GOTO lbl28
lbl66:
                                                            // 1 sources

                                                            var4_5 = new String[]{s.a[9], s.a[2]};
                                                            ** GOTO lbl28
                                                        }
                                                        case 6: {
                                                            var4_5 = new String[]{s.a[9], s.a[2]};
                                                            ** GOTO lbl28
                                                        }
                                                    }
                                                    var4_5 = new String[]{s.a[2], "", s.a[5]};
                                                    ** GOTO lbl28
                                                }
                                                if (!var5_6.equals(s.a[120])) break block16;
                                                var4_5 = new String[]{s.a[2], s.a[8], s.a[140], s.a[5]};
                                                ** GOTO lbl28
                                            }
                                            if (var2_2 != -1962864182 && var2_2 != -1952864180) break block17;
                                            var4_5 = new String[]{s.a[2], "", "", s.a[5]};
                                            ** GOTO lbl28
                                        }
                                        if (!bc.a(110, var2_2) || bc.a(208, var2_2)) break block18;
                                        var4_5 = new String[]{s.a[2], s.a[3], s.a[113], s.a[5]};
                                        ** GOTO lbl28
                                    }
                                    if (!bc.a(208, var2_2)) break block19;
                                    var4_5 = new String[]{s.a[2], s.a[3], "", s.a[5]};
                                    ** GOTO lbl28
                                }
                                if (!bc.a(205, var2_2) && !bc.a(203, var2_2)) break block20;
                                if (bc.a(var2_2) <= bc.a(-2104967297) || bc.a(var2_2) > bc.a(-2094967297)) break block21;
                                var4_5 = new String[]{s.a[2], s.a[3], "", s.a[5]};
                                ** GOTO lbl28
                            }
                            var4_5 = new String[]{s.a[2], "", "", s.a[5]};
                            ** GOTO lbl28
                        }
                        if (!((long)var2_2 > 2352810000L && (long)var2_2 < 2352869999L || (long)var2_2 > 2342110000L && (long)var2_2 < 2342299999L) && ((long)var2_2 <= 2303000000L || (long)var2_2 >= 2304999999L)) break block22;
                        var4_5 = new String[]{s.a[2], "", "", s.a[5]};
                        ** GOTO lbl28
                    }
                    if ((long)var2_2 <= 2315000000L || (long)var2_2 >= 2319999999L) break block23;
                    var4_5 = new String[]{s.a[2], s.a[3], "", s.a[5]};
                    ** GOTO lbl28
                }
                if ((long)var2_2 <= -1934967296L || (long)var2_2 >= -1924967297L) break block24;
                var4_5 = new String[]{s.a[2], "", "", s.a[5]};
                ** GOTO lbl28
            }
            if (var4_5.d % 10 != 1) break block25;
            var4_5 = new String[]{s.a[2], s.a[3], s.a[95], s.a[5]};
            ** GOTO lbl28
        }
        var4_5 = new String[]{s.a[2], s.a[3], "", s.a[5]};
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void q(av av2) {
        int n2 = 1;
        String string = this.a.a(10);
        g g2 = av.a(av2, 145005, 1000);
        int n3 = av2.b(0).b();
        if (n3 == 5) {
            String string2 = n3 == 4 && av.a(av2, 145003).equals(s.a[122]) ? g2.a() : av.a(av2, 145005, 1000).a();
            if (!this.a(av2, g2.d, string2, string)) {
                if (string.equals(s.b[55])) {
                    z.a().a(1132, (af)new ba(4), new an(g2.d));
                } else if (string.equals(s.b[56])) {
                    z.a().a(1132, (af)new ba(1), new an(g2.d));
                }
            }
            if (n3 != 5) return;
            a.f.a(145);
            return;
        }
        if (string.equals(s.a[2])) {
            ac.a(true, false);
            int n4 = av2.b(1).b();
            if (n3 == 2 && (n4 == 1 || av.a(av2, 145003).equals(s.a[9])) || n3 == 6 && n4 == 2) {
                if (n4 == 1 && av.a(av2, 145003).equals(s.b[46])) {
                    z.a().a(1032, (af)new t(22), new an(g2.e));
                    return;
                }
                z.a().a(1032, (af)new t(16), new an(g2.e));
                return;
            }
            if (n3 == 3) {
                this.a.a(null, 0, 0, g2.d);
                return;
            }
            z.a().a(1032, (af)new t(1), (af)new an(g2.d), new an(0));
            return;
        }
        if (string.equals(s.a[3])) {
            bc bc2 = ay.a(g2.d, this.k);
            n3 = bc2.a();
            if (bc.a(110, n3)) {
                if (bc.a(180, n3)) {
                    z.a().a(1009, (af)new ba(99), new an(bc2.a));
                    return;
                }
                if (bc.a(780, n3)) {
                    z.a().a(1009, (af)new ba(100), new an(bc2.a));
                    return;
                }
                z.a().a(1009, (af)new ba(5), (af)new an(bc2.a), new t(0));
                return;
            }
            if (bc.a(n3) > 2315000000L && bc.a(n3) < 2319999999L) {
                z.a().a(1009, new ba(111));
                return;
            }
            if (bc.a(219, n3)) {
                aa.a(m.a(), bc2.a);
                return;
            }
            if (bc.a(200, n3)) {
                z.a().a(1009, (af)new ba(4), (af)new an(bc2.a), new an(ay.a.a()));
                return;
            }
            if (!bc.a(204, n3)) {
                z.a().a(1009, (af)new ba(4), (af)new an(bc2.a), new an(ay.a.a()));
                return;
            }
            if (bc.a(213, n3)) {
                this.a = 1;
                ac.a(false, false);
                this.a(1, av2, 0, new String[]{s.b[9], s.a[2]}, -1);
                return;
            }
            if (bc.a(212, n3)) {
                this.a = (byte)2;
                ac.a(false, false);
                this.a(1, av2, 0, new String[]{s.b[9], s.a[2]}, -1);
                return;
            }
            if (bc.a(214, n3)) {
                z.a().a(1130, new t(57));
                return;
            }
            if (bc.a(215, n3)) {
                z.a().a(1130, new t(58));
                return;
            }
            z.a().a(1009, (af)new ba(4), (af)new an(bc2.a), new an(ay.a.a()));
            return;
        }
        if (string.equals(s.a[5])) {
            if (av.a(av2, 145003).equals(s.a[120])) {
                z.a().a(1009, (af)new ba(62), new an(g2.d));
                ac.a(true, false);
                return;
            }
            bc bc3 = ay.a(g2.d, ay.a);
            if (ad.a(bc3, 5)) return;
            if ((bc3.e & 0x40) != 0) {
                a.f.a(s.d[14], "", (int)(av2.a + 2), -1, false, av2, null);
                return;
            }
            this.a.a(bc3, bc3.a);
            if (bc.a(203, bc3.a())) return;
            this.a.a(bc3.a);
            return;
        }
        if (string.equals(s.a[140])) {
            z.a().a(1009, new ba(79));
            return;
        }
        if (string.equals(s.a[8]) || string.equals(s.a[7])) {
            if (n3 == 3) {
                byte by = string.equals(s.a[8]) ? (byte)4 : 3;
                z.a().a(1130, (af)new t(by), (af)new an(g2.d), new an(ap.o));
            } else if (av.a(av2, 145003).equals(s.a[120])) {
                if (string.equals(s.a[8])) {
                    z.a().a(1009, (af)new ba(59), new an(g2.d));
                }
            } else {
                bc bc4 = ay.a(g2.d, this.k);
                short s2 = 29;
                if (string.equals(s.a[8])) {
                    s2 = 30;
                    ay.a(bc4.a, w.a);
                } else {
                    ay.a(bc4.a, ay.a);
                }
                this.a(av2, 145005, 145003, 2, -1, -1);
                u.a(s2, ap.o, bc4.a, bc4.a, (short)0, (short)0, 0);
            }
            ac.a(true, false);
            return;
        }
        if (string.equals(s.a[9])) {
            this.a.a(av2, av.a(av2, 145005, 1001).a(), (int)(av2.a + true));
            return;
        }
        if (string.equals(s.a[10])) {
            bc bc5 = ay.a(g2.d, this.k);
            if (ad.a(bc5, 4)) return;
            n3 = bc5.c / 2;
            if (((t)ay.a.a.elementAt((int)21)).a == 1) {
                n3 = (bc5.c * 13 + 5) / 10 / 2;
            }
            int n5 = n3;
            if ((bc5.e & 0x80) != 0) {
                n5 = n3 * bc5.a;
            }
            if (n5 < 1) {
                n5 = n2;
            }
            a.f.a(new StringBuffer().append(s.d[409]).append("*2").append(bc5.a).append("*0").append(s.d[43]).toString(), new StringBuffer().append(s.d[410]).append(":").append(n5).toString(), (int)(av2.a + 3), -1, false, av2, null);
            return;
        }
        if (string.equals(s.a[95])) {
            this.h(null, 0);
            return;
        }
        if (!string.equals(s.a[113])) return;
        z.a().a(1009, (af)new ba(37), new an(g2.d));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void r(av object) {
        block4: {
            block3: {
                if (((av)object).b(0) == null || ((av)object).b(0).b() != 2 || ((av)object).b(1).b() != 1) break block3;
                if (((av)object).f() != 145005) break block4;
                q q2 = (q)((av)object).a;
                int n2 = q2.i() * q2.h();
                object = new StringBuffer().append(s.d[6]).append(q2.a(n2 + 1).a()).toString();
                String string = new StringBuffer().append(s.d[467]).append(((ar)q2.a((int)(n2 + 2))).b).toString();
                this.a.a(145005, q2.b(q2.e(), true), q2.a(q2.e(), true), new String[]{object, string});
                this.a.a(145005);
            }
            return;
        }
        this.a.a(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void s(av av2) {
        int n2 = av2.f();
        String[] stringArray = null;
        Object object = av.a(av2, av2.f(), 1000);
        if (n2 == 35001) {
            stringArray = new String[]{s.a[2], s.a[26]};
        } else if (n2 == 35002) {
            stringArray = ((g)object).d == 0 ? new String[]{s.d[55]} : (((g)object).d < ((g)object).e ? new String[]{s.d[55], s.a[2]} : new String[]{s.a[2]});
        }
        if (stringArray != null) {
            object = this.a;
            bb.a(stringArray, av2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void t(av av2) {
        String string = this.a.a(10);
        int n2 = av2.f();
        ar ar2 = (ar)av.a(av2, n2, 1001);
        av.a(av2, n2, 1000);
        if (n2 == 35001) {
            n2 = av2.b(0).b();
            if (ar2 == null) return;
            if (string.equals(s.a[2])) {
                z.a().a(1032, (af)new t(8), (af)new an(ar2.d), new t(1));
                return;
            }
            if (!string.equals(s.a[26])) return;
            if (n2 == 1) {
                z.a().a(1103, (af)new ba(35), (af)new an(ar2.d), new an(ap.o));
            } else {
                z.a().a(1103, (af)new ba(20), new an(ar2.d));
            }
            av2.b(0);
            ac.a(true, false);
            return;
        }
        if (n2 != 35002) return;
        if (string.equals(s.d[55])) {
            z.a().a(1032, new t(9), new an(ar2.e), new an(ar2.d), new an(3), new an(n2));
            return;
        }
        if (!string.equals(s.a[2])) return;
        z.a().a(1032, (af)new t(8), (af)new an(ar2.d), new an(0));
    }

    /*
     * Unable to fully structure code
     */
    public void u(av var1_1) {
        var3_2 = ((h)var1_1.a(36002)).f();
        switch (var3_2) {
            default: {
                var2_3 = -1;
lbl5:
                // 4 sources

                while (true) {
                    this.b(var1_1, var3_2, true);
                    if (var2_3 >= 0 && ((q)var1_1.a(36004)).a(0) == null) {
                        z.a().a(1103, new ba(var2_3));
                    }
lbl9:
                    // 4 sources

                    return;
                }
            }
            case 0: {
                this.a(var1_1, false, 20, 28, 36000);
                var2_3 = 55;
                ** GOTO lbl5
            }
            case 1: {
                this.a(var1_1, false, 20, 28, 36000);
                var2_3 = 56;
                ** GOTO lbl5
            }
            case 2: {
                this.a(var1_1, false, 20, 28, 36000);
                var2_3 = 57;
                ** continue;
            }
            case 3: 
        }
        this.a(var1_1, false, 4, 19, 36000);
        this.a(var1_1, true, 20, this.b() + 21, 36000);
        var1_1.d(36021);
        var1_1.v = var1_1.a((int)36020).b + var1_1.a((int)36020).h - 20;
        z.a().a(1103, new ba(66));
        ** while (true)
    }

    public void v(av av2) {
        ((ar)av2.a(36020)).a(new bf(40034));
        for (int i2 = 36021; i2 <= 36028; ++i2) {
            ((ar)av2.a(i2)).a(new bf(40025));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void w(av av2) {
        ac.a(true, false);
        if (av.a(av2, 51004).equals(s.b[97])) {
            av2.a(51006, 1103, 36, av2.b(0).b(), null);
        } else {
            av2.a(51006, 1103, 37, av2.b(0).b(), null);
        }
        av2.b(0);
        ((r)av2.a(51005)).d();
        av2.c(51006);
    }

    public void x(av av2) {
        av av3 = a.f.a(51);
        z.a().a((af[])av2.a(0), 0);
        ac.a(true, false);
        if (av3 != null) {
            av3.b(0);
        }
    }

    public void y(av afArray) {
        afArray = (af[])afArray.a(0);
        z.a().a(1103, (af)new ba(68), afArray[2]);
        ac.a(true, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void z(av av2) {
        int n2 = av2.f();
        Object object = av.a(av2, n2, 1000);
        if (object == null) {
            return;
        }
        if (n2 != 51006) return;
        n2 = ((h)av2.a(51004)).f();
        if (((g)object).d == 0) {
            z.a().a(1032, (af)new t(8), (af)new an(((g)object).e), new t(0));
            return;
        }
        if (n2 == 0) {
            if (((g)object).b == 0) {
                object = this.a;
                bb.a(new String[]{s.a[3], s.a[2], s.a[27], s.a[95]}, av2);
                return;
            }
            object = this.a;
            bb.a(new String[]{s.a[3], s.a[2], s.a[95]}, av2);
            return;
        }
        if (((g)object).b == 0) {
            object = this.a;
            bb.a(new String[]{s.a[27], s.a[2]}, av2);
            return;
        }
        object = this.a;
        bb.a(new String[]{s.a[2]}, av2);
    }
}

