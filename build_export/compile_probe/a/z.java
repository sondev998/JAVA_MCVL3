/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Static;
import a.af;
import a.al;
import a.am;
import a.an;
import a.ba;
import a.i;
import a.j;
import a.t;
import a.u;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class z {
    public static z a;
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(int n2) {
        if (this.a == null) return 0;
        if (n2 >= this.a.size()) return 0;
        return ((an)this.a.elementAt((int)n2)).a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String a(int n2) {
        if (this.a == null) return null;
        if (n2 >= this.a.size()) return null;
        return ((j)this.a.elementAt(n2)).a();
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

    public void a(int n2, af af2, af af3, af af4) {
        am am2 = new am();
        am2.a(n2);
        am2.a(af2);
        am2.a(af3);
        am2.a(af4);
        u.a.b(am2.a());
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
                    object = this.a;
                    af af2 = new ba(s2);
                    ((Vector)object).addElement(af2);
                    continue block11;
                }
                case 2: {
                    byte by = dataInputStream.readByte();
                    object = this.a;
                    af af2 = new t(by);
                    ((Vector)object).addElement(af2);
                    continue block11;
                }
                case 3: {
                    short s2 = dataInputStream.readShort();
                    object = this.a;
                    af af2 = new ba(s2);
                    ((Vector)object).addElement(af2);
                    continue block11;
                }
                case 4: 
                case 5: {
                    n2 = dataInputStream.readInt();
                    object = this.a;
                    af af2 = new an(n2);
                    ((Vector)object).addElement(af2);
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

