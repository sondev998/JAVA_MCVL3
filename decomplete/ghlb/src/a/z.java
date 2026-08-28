/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Static;
import a.a;
import a.ab;
import a.ad;
import a.af;
import a.al;
import a.am;
import a.an;
import a.ap;
import a.ba;
import a.bb;
import a.bl;
import a.i;
import a.j;
import a.t;
import a.u;
import a.work.main.MyMidlet;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;
import javak.microedition.lcdui.Kalvaz;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class z {
    public static String Auto;
    public static String BytesMod2;
    public static int OnClick;
    public static z a;
    public static int bossNum;
    public static String chuoiso;
    public static int null;
    public static String num1;
    public static String num2;
    public static int num3;
    public static int num4;
    public static int num5;
    public static int num6;
    public static int num7;
    public static int num8;
    public static String test;
    public Vector a = new Vector();

    static {
        Static.regClass(37);
        z.cinitclone();
    }

    public static z a() {
        if (a == null) {
            a = new z();
        }
        return a;
    }

    public static void cinitclone() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte a(int n2) {
        if (this.a == null) return 0;
        if (n2 >= this.a.size()) return 0;
        return ((t)this.a.elementAt((int)n2)).a;
    }

    public int a(int n2) {
        int n3 = 0;
        MyMidlet.packetttc = new byte[]{3, -14, 4, 0, 0, 0, 0, 4, 0, 16, -44, -4, 3, 0, 62, 3, 0, 10, 3, 0, 0, 4, 0, 0, 0, 2, 3, 0, -126};
        MyMidlet.packet2 = new byte[]{7, -16, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 3, 0, 0, 2, 1, 2, 101, 6, 0, 0};
        MyMidlet.packet1 = new byte[]{7, 239, 4, 0, ab.bytes3, ab.bytes2, ab.bytes1, 4, 0, 0, 0, 0, 3, 0, 51, 3, 0, 8, 3, 0, 0, 3, 0, 0};
        MyMidlet.packet3 = new byte[]{7, -16, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 3, 0, 0, 2, 1, 2, 101, 6, 0, 0};
        int n4 = n3;
        if (this.a != null) {
            n4 = n3;
            if (n2 < this.a.size()) {
                n4 = ((an)this.a.elementAt((int)n2)).a;
            }
        }
        return n4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public String a(int n2) {
        String string;
        CharSequence charSequence;
        String string2;
        block33: {
            block39: {
                boolean bl2;
                block34: {
                    block38: {
                        block37: {
                            block36: {
                                block35: {
                                    if (this.a == null) return null;
                                    if (n2 >= this.a.size()) return null;
                                    string2 = ((j)this.a.elementAt(n2)).a();
                                    if (ad.menu == 0) break block34;
                                    n2 = ad.menu;
                                    if (1 == n2) break block35;
                                    if (2 == n2) break block36;
                                    if (3 == n2) break block37;
                                    if (4 != n2) break block34;
                                    if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [Ph\u1ed5 th\u00f4ng ][5Ng\u01b0\u1eddi][C\u1ea5p 20]")) {
                                        ap.GetTRUE = 0;
                                        this.a(0);
                                        return null;
                                    }
                                    break block38;
                                }
                                if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [Ph\u1ed5 th\u00f4ng ][5Ng\u01b0\u1eddi][C\u1ea5p 20]")) {
                                    ap.GetTRUE = 0;
                                    this.a(0);
                                    return null;
                                }
                                if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [\u00c1c m\u1ed9ng ][9Ng\u01b0\u1eddi][C\u1ea5p 30]")) {
                                    ap.GetTRUE = 0;
                                    this.a(0);
                                    return null;
                                }
                                if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [Tinh anh ][2 Ng\u01b0\u1eddi][C\u1ea5p 90]")) {
                                    ap.GetTRUE = 0;
                                    this.a(0);
                                    return null;
                                }
                                break block34;
                            }
                            if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [\u0110\u01a1n gi\u1ea3n ][2 Ng\u01b0\u1eddi][C\u1ea5p 15]")) {
                                ap.GetTRUE = 0;
                                this.a(0);
                                return null;
                            }
                            if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [\u00c1c m\u1ed9ng ][9Ng\u01b0\u1eddi][C\u1ea5p 30]")) {
                                this.a(0);
                                return null;
                            }
                            if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [Tinh anh ][2 Ng\u01b0\u1eddi][C\u1ea5p 90]")) {
                                ap.GetTRUE = 0;
                                this.a(0);
                                return null;
                            }
                            break block34;
                        }
                        if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [Ph\u1ed5 th\u00f4ng ][5Ng\u01b0\u1eddi][C\u1ea5p 20]")) {
                            this.a(0);
                            return null;
                        }
                        if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [\u0110\u01a1n gi\u1ea3n ][2 Ng\u01b0\u1eddi][C\u1ea5p 15]")) {
                            ap.GetTRUE = 0;
                            this.a(0);
                            return null;
                        }
                        if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [Tinh anh ][2 Ng\u01b0\u1eddi][C\u1ea5p 90]")) {
                            ap.GetTRUE = 0;
                            this.a(0);
                            return null;
                        }
                        break block34;
                    }
                    if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [\u00c1c m\u1ed9ng ][9Ng\u01b0\u1eddi][C\u1ea5p 30]")) {
                        ap.GetTRUE = 0;
                        this.a(0);
                        return null;
                    }
                    if (string2.contains("C\u1ea5m \u0111\u1ecba Tuy\u1ec7t t\u00ecnh c\u1ed1c [\u0110\u01a1n gi\u1ea3n ][2 Ng\u01b0\u1eddi][C\u1ea5p 15]")) {
                        ap.GetTRUE = 0;
                        this.a(0);
                        return null;
                    }
                }
                if (string2.contains("Ph\u1ea7n th\u01b0\u1edfng qua \u1ea3i ")) {
                    ap.GetTRUE = 0;
                    this.a(0);
                    return null;
                }
                if (string2.contains("N\u01a1i n\u00e0y kh\u00f4ng n\u00ean \u1edf l\u1ea1i l\u00e2u")) {
                    bossNum = 0;
                    ap.GetTRUE = 0;
                    this.a(0);
                    return null;
                }
                if (string2.contains("Quay l\u1ea1i ")) {
                    this.a(0);
                    return null;
                }
                if ((string2 = String.valueOf(string2)).length() <= 20) break block33;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2.substring(0, 16));
                if (!stringBuilder.toString().equals("Ba\u0323n nh\u00e2\u0323n \u0111\u01b0\u01a1\u0323c") || !(bl2 = string2.contains("Giang h\u00f4\u0300 l\u00ea\u0323nh ba\u0300i"))) break block33;
                if (bl2) break block39;
                Kalvaz kalvaz = Kalvaz.kalvazInstance;
                if (kalvaz != null) {
                    kalvaz.auto = !kalvaz.auto ? true : true;
                }
                if ((n2 = bossNum) == 0) {
                    bl.Move2();
                    break block33;
                } else if (n2 != 1) {
                    bossNum = 0;
                    bb bb2 = u.a;
                    bb2.b(MyMidlet.packet1);
                    bb2.b(MyMidlet.packet2);
                    break block33;
                } else {
                    bl.Move4();
                }
                break block33;
            }
            Kalvaz kalvaz = Kalvaz.kalvazInstance;
            if (kalvaz != null) {
                kalvaz.auto = !kalvaz.auto ? false : false;
            }
            if ((n2 = bossNum) == 0) {
                bl.Move2();
            } else if (n2 != 1) {
                bossNum = 0;
                bb bb3 = u.a;
                bb3.b(MyMidlet.packet1);
                bb3.b(MyMidlet.packet2);
            } else {
                bl.Move4();
            }
        }
        if (string2.length() > 13) {
            void var4_15;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2.substring(0, 13));
            CharSequence charSequence2 = charSequence = stringBuilder.toString();
            if (((String)charSequence).equals("    Chu\u1ed1i s\u1ed7\uff1a")) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(string2.substring(15, 23));
                chuoiso = stringBuilder2.toString();
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(string2.substring(43, 44));
                num1 = stringBuilder3.toString();
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(string2.substring(58, 59));
                num2 = stringBuilder4.toString();
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append(string2.substring(74, 83));
                Auto = stringBuilder5.toString();
                n2 = Integer.parseInt(num1);
                charSequence = chuoiso;
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append(((String)charSequence).substring(n2 - 1, n2));
                num4 = Integer.parseInt(stringBuilder6.toString());
                n2 = Integer.parseInt(num2);
                String string3 = chuoiso;
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string3.substring(n2 - 1, n2));
                charSequence = ((StringBuilder)charSequence).toString();
                num5 = Integer.parseInt((String)charSequence);
                String string4 = Auto;
                if (string4.equals("ph\u00e9p nh\u00e2n")) {
                    num3 = num4 * num5;
                    CharSequence charSequence3 = charSequence;
                } else {
                    CharSequence charSequence4 = charSequence;
                    if (string4.equals("ph\u00e9p c\u1ed9ng")) {
                        num3 = num4 + num5;
                        CharSequence charSequence5 = charSequence;
                    }
                }
            }
            BytesMod2 = var4_15;
        }
        if ((string = Integer.toString(num3)).length() <= 1) {
            num6 = 1;
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string.substring(0, 1));
            num7 = Integer.parseInt(((StringBuilder)charSequence).toString());
            if (num7 == 0) {
                return string2;
            }
            if (!BytesMod2.equals("Cung c\u1ea5p c\u00e2u ")) return string2;
            u.a.b(new byte[]{7, 240, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 3, 0, 0, 2, 1, 2, 101, 6, 0, 1, num7 | 0x30});
            return string2;
        }
        num6 = 2;
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string.substring(0, 1));
        num7 = Integer.parseInt(((StringBuilder)charSequence).toString());
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string.substring(1, 2));
        num8 = Integer.parseInt(((StringBuilder)charSequence).toString());
        if (num8 == 0) {
            // empty if block
        }
        if (!BytesMod2.equals("Cung c\u1ea5p c\u00e2u ")) return string2;
        u.a.b(new byte[]{7, 240, 3, 0, 0, 3, 0, 0, 4, 0, 0, 0, 0, 3, 0, 0, 2, 1, 2, 101, 6, 0, 2, num7 | 0x30, num8 | 0x30});
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public short a(int n2) {
        if (this.a == null) return 0;
        if (n2 >= this.a.size()) return 0;
        return ((ba)this.a.elementAt((int)n2)).a;
    }

    public void a(int n2, af af2) {
        am am2 = new am();
        am2.a(n2);
        am2.a(af2);
        u.a.b(am2.a());
    }

    public void a(int n2, af af2, af af3) {
        am am2 = new am();
        am2.a(n2);
        am2.a(af2);
        am2.a(af3);
        u.a.b(am2.a());
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(int n2, af object, af object2, af af2) {
        am am2 = new am();
        am2.a(n2);
        am2.a((af)object);
        am2.a((af)object2);
        am2.a(af2);
        object2 = u.a;
        n2 = a.a.num;
        if (n2 != 0 && n2 >= 2100) {
            a.a.num = 0;
            object = new byte[12];
            object[0] = 3;
            object[1] = 242;
            object[2] = 3;
            object[3] = false;
            object[4] = 129;
            object[5] = 2;
            object[6] = true;
            object[7] = 4;
            object[8] = false;
            object[9] = false;
            object[10] = false;
            object[10] = false;
        } else if (null == 0) {
            null = 1;
            object = new byte[12];
            object[0] = 3;
            object[1] = 242;
            object[2] = 3;
            object[3] = false;
            object[4] = 129;
            object[5] = 2;
            object[6] = true;
            object[7] = 4;
            object[8] = false;
            object[9] = false;
            object[10] = false;
            object[10] = false;
        } else {
            object = am2.a();
        }
        ((bb)object2).b((byte[])object);
    }

    public void a(int n2, af af2, af af3, af af4, af af5) {
        am am2 = new am();
        am2.a(n2);
        am2.a(af2);
        am2.a(af3);
        am2.a(af4);
        am2.a(af5);
        u.a.b(am2.a());
    }

    public void a(int n2, af af2, af af3, af af4, af af5, af af6) {
        am am2 = new am();
        am2.a(n2);
        am2.a(af2);
        am2.a(af3);
        am2.a(af4);
        am2.a(af5);
        am2.a(af6);
        u.a.b(am2.a());
    }

    public void a(int n2, af af2, af af3, af af4, af af5, af af6, af af7) {
        am am2 = new am();
        am2.a(n2);
        am2.a(af2);
        am2.a(af3);
        am2.a(af4);
        am2.a(af5);
        am2.a(af6);
        am2.a(af7);
        u.a.b(am2.a());
    }

    public void a(int n2, af af2, af af3, af af4, af af5, af af6, af af7, af af8) {
        am am2 = new am();
        am2.a(n2);
        am2.a(af2);
        am2.a(af3);
        am2.a(af4);
        am2.a(af5);
        am2.a(af6);
        am2.a(af7);
        am2.a(af8);
        u.a.b(am2.a());
    }

    public void a(int n2, af af2, af af3, af af4, af af5, af af6, af af7, af af8, af af9) {
        am am2 = new am();
        am2.a(n2);
        am2.a(af2);
        am2.a(af3);
        am2.a(af4);
        am2.a(af5);
        am2.a(af6);
        am2.a(af7);
        am2.a(af8);
        am2.a(af9);
        u.a.b(am2.a());
    }

    public void a(int n2, af af2, af af3, af af4, af af5, af af6, af af7, af af8, af af9, af af10) {
        am am2 = new am();
        am2.a(n2);
        am2.a(af2);
        am2.a(af3);
        am2.a(af4);
        am2.a(af5);
        am2.a(af6);
        am2.a(af7);
        am2.a(af8);
        am2.a(af9);
        am2.a(af10);
        u.a.b(am2.a());
    }

    public void a(int n2, af af2, af af3, af[] afArray) {
        am am2 = new am();
        am2.a(n2);
        am2.a(af2);
        am2.a(af3);
        for (n2 = 0; n2 < afArray.length; ++n2) {
            am2.a(afArray[n2]);
        }
        u.a.b(am2.a());
    }

    public void a(int n2, af af2, af[] afArray) {
        am am2 = new am();
        am2.a(n2);
        am2.a(af2);
        for (n2 = 0; n2 < afArray.length; ++n2) {
            am2.a(afArray[n2]);
        }
        u.a.b(am2.a());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(DataInputStream dataInputStream) {
        block11: while (true) {
            Object object;
            int n2;
            try {
                n2 = dataInputStream.read();
                if (n2 == -1) return;
            }
            catch (IOException iOException) {
                // empty catch block
                return;
            }
            switch (n2) {
                default: {
                    continue block11;
                }
                case 1: {
                    short s2 = dataInputStream.readShort();
                    Object object2 = this.a;
                    object = new ba(s2);
                    ((Vector)object2).addElement(object);
                    continue block11;
                }
                case 2: {
                    byte by = dataInputStream.readByte();
                    object = this.a;
                    Object object2 = new t(by);
                    ((Vector)object).addElement(object2);
                    continue block11;
                }
                case 3: {
                    short s2 = dataInputStream.readShort();
                    Object object2 = this.a;
                    object = new ba(s2);
                    ((Vector)object2).addElement(object);
                    continue block11;
                }
                case 4: 
                case 5: {
                    n2 = dataInputStream.readInt();
                    Object object2 = this.a;
                    object = new an(n2);
                    ((Vector)object2).addElement(object);
                    continue block11;
                }
                case 6: {
                    object = new j(i.a(dataInputStream));
                    this.a.addElement(object);
                    continue block11;
                }
                case 7: 
            }
            object = new byte[al.c(dataInputStream.readShort())];
            dataInputStream.read((byte[])object);
            this.a.addElement(object);
        }
    }

    public void a(af[] afArray, int n2) {
        am am2 = new am();
        am2.a(afArray[n2].b());
        ++n2;
        while (n2 < afArray.length) {
            am2.a(afArray[n2]);
            ++n2;
        }
        u.a.b(am2.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte[] a(int n2) {
        if (this.a == null) return null;
        if (n2 >= this.a.size()) return null;
        return (byte[])this.a.elementAt(n2);
    }
}

