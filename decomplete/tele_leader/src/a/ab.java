/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Static;
import a.aa;
import a.ao;
import a.az;
import java.util.Vector;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ab {
    public static ab a;
    private final byte a;
    private final short[] a = new short[]{1, 4, 16, 64};
    private final byte b;
    private final short[] b = new short[]{2, 8, 32, 128};
    private final byte c;
    private final byte d;
    private final byte e;
    private final byte f;

    static {
        Static.regClass(2);
        ab.cinitclone();
    }

    private ab() {
        this.a = (byte)10;
        this.b = (byte)14;
        this.c = 1;
        this.d = (byte)4;
        this.e = (byte)6;
        this.f = (byte)8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(byte by, az az2, az az3) {
        by = (byte)Math.abs(az2.d - az3.d);
        int n2 = Math.abs(az2.e - az3.e);
        if (by != 1) return (byte)((by + n2) * 10);
        if (n2 != 1) return (byte)((by + n2) * 10);
        return (byte)((by + n2) * 14);
    }

    private int a(az az2, az az3) {
        return (Math.abs(az2.d - az3.d) + Math.abs(az2.e - az3.e)) * 14;
    }

    public static ab a() {
        if (a == null) {
            a = new ab();
        }
        return a;
    }

    private Vector a(az az2) {
        Vector<az> vector = new Vector<az>();
        vector.addElement(az2);
        while (az2.a != null) {
            vector.insertElementAt(az2.a, 0);
            az2 = az2.a;
        }
        return vector;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(byte by, Vector vector, az az2, int n2, int n3) {
        int n4 = az2.d;
        int n5 = az2.e;
        if (this.a(by, n4 += n2, n5 += n3)) {
            return;
        }
        if (n2 == -1 && n3 == -1) {
            if (this.a(by, 1, n4, n5)) return;
        }
        if (n2 == -1 && n3 == 1) {
            if (this.a(by, 4, n4, n5)) return;
        }
        if (n2 == 1 && n3 == -1) {
            if (this.a(by, 6, n4, n5)) return;
        }
        if (n2 == 1 && n3 == 1) {
            if (this.a(by, 8, n4, n5)) return;
        }
        vector.addElement(new az(n4, n5));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(byte[] byArray, int n2, int n3, int n4, boolean bl2) {
        n2 = n4 * n2 + n3;
        if (bl2) {
            n3 = n2 / 4;
            n4 = byArray[n3];
            byArray[n3] = (byte)(this.a[n2 % 4] | n4);
            return;
        }
        n4 = n2 / 4;
        n3 = byArray[n4];
        byArray[n4] = (byte)(this.b[n2 % 4] | n3);
    }

    private boolean a(byte by, int n2, int n3) {
        return aa.a().a((int)by, n2, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean a(byte by, int n2, int n3, int n4) {
        int n5;
        boolean bl2 = false;
        switch (n2) {
            default: {
                n2 = 0;
                n4 = 0;
                n3 = 0;
                n5 = 0;
                break;
            }
            case 1: {
                n5 = n4 + 1;
                n2 = n3 + 1;
                break;
            }
            case 6: {
                n5 = n4 + 1;
                n2 = n3 - 1;
                break;
            }
            case 4: {
                n5 = n4 - 1;
                n2 = n3 + 1;
                break;
            }
            case 8: {
                n5 = n4 - 1;
                n2 = n3 - 1;
            }
        }
        if (this.a(by, n3, n5)) return true;
        if (!this.a(by, n2, n4)) return bl2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(az az2, az az3) {
        if (az2.d != az3.d) return false;
        if (az2.e != az3.e) return false;
        return true;
    }

    public static void cinitclone() {
        a = null;
    }

    public Vector a(byte by, az az2) {
        Vector vector = new Vector();
        this.a(by, vector, az2, -1, -1);
        this.a(by, vector, az2, -1, 0);
        this.a(by, vector, az2, -1, 1);
        this.a(by, vector, az2, 0, -1);
        this.a(by, vector, az2, 0, 1);
        this.a(by, vector, az2, 1, -1);
        this.a(by, vector, az2, 1, 0);
        this.a(by, vector, az2, 1, 1);
        return vector;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Vector a(byte by, az object, az az2, int n2) {
        byte by2 = aa.a().a;
        int n3 = aa.a().b;
        if (az2.d < 1) {
            az2.d = 1;
        } else if (az2.d > by2 - 1) {
            az2.d = by2 - 1;
        }
        if (az2.e < 1) {
            az2.e = 1;
        } else if (az2.e > n3 - 1) {
            az2.e = n3 - 1;
        }
        ao ao2 = new ao();
        byte[] byArray = new byte[n3 * by2 / 4 + 1];
        ((az)object).a = 0;
        ((az)object).b = this.a((az)object, az2);
        ((az)object).c = ((az)object).b + ((az)object).a;
        ((az)object).a = null;
        ao2.a((az)object);
        this.a(byArray, by2, ((az)object).d, ((az)object).e, true);
        n3 = 0;
        while (ao2.size() > 0) {
            int n4 = n3 + 1;
            if (n4 > n2) {
                return this.a(ao2.a());
            }
            az az3 = ao2.a();
            if (this.a(az3, az2)) {
                return this.a(az3);
            }
            this.a(byArray, by2, az3.d, az3.e, false);
            Vector vector = this.a(by, az3);
            for (n3 = 0; n3 < vector.size(); ++n3) {
                object = (az)vector.elementAt(n3);
                int n5 = ((az)object).d + ((az)object).e * by2;
                byte by3 = byArray[n5 / 4];
                if ((this.b[n5 % 4] & by3) != 0 || (this.a[n5 % 4] & by3) != 0) continue;
                ((az)object).a = az3.a + this.a(by, az3, (az)object);
                ((az)object).b = this.a((az)object, az2);
                ((az)object).c = ((az)object).a + ((az)object).b;
                ((az)object).a = az3;
                ao2.a((az)object);
                this.a(byArray, by2, ((az)object).d, ((az)object).e, true);
            }
            n3 = n4;
        }
        return null;
    }
}

