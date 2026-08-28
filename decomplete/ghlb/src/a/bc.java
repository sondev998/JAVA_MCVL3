/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.af;
import a.bf;
import a.s;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bc {
    public byte a;
    public int a;
    public String a;
    public short a;
    public af[] a = "";
    public byte b;
    public int b;
    public String b;
    public short b = 1;
    public int c;
    public short c;
    public int d;
    public short d;
    public int e;
    public short e;
    public int f;
    public short f;
    public short g;

    public bc(int n2, int n3, String string) {
        this.a = n2;
        this.b = n3;
        this.a = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(int n2) {
        if (bc.a(110, n2)) {
            return 2;
        }
        if (!bc.a(203, n2)) return 8;
        return 4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(String string) {
        int n2;
        int n3 = n2 = -1;
        if (string == null) return n3;
        if (string.equals("")) {
            return n2;
        }
        if (string.equals(s.d[175])) {
            return 1;
        }
        if (string.equals(s.d[169])) {
            return 2;
        }
        if (string.equals(s.a[80])) {
            return 4;
        }
        if (string.equals(s.a[33])) {
            return 8;
        }
        if (string.equals(s.a[48])) {
            return 16;
        }
        if (string.equals("Th\u00fa nu\u00f4i/C\u01b0\u1ee1i")) {
            return 1024;
        }
        if (string.equals(s.a[148])) {
            return 256;
        }
        if (string.equals(s.a[69])) {
            return 2048;
        }
        if (string.equals(s.a[111])) {
            return 16384;
        }
        if (string.equals(s.a[101])) {
            return 65536;
        }
        if (string.equals(s.a[117])) {
            return 131072;
        }
        if (string.equals(s.b[20])) {
            return 262144;
        }
        if (string.equals(s.a[120])) {
            return 32;
        }
        if (string.equals("X\u00e2y d\u1ef1ng")) {
            return 524288;
        }
        if (string.equals("M\u00f3ng")) {
            return 0x100000;
        }
        if (string.equals(s.a[120])) {
            return 0x200000;
        }
        n3 = n2;
        if (!string.equals("\u0110\u1eb7c bi\u1ec7t")) return n3;
        return 0x400000;
    }

    public static long a(int n2) {
        long l2 = n2;
        if (n2 < 0) {
            l2 = (long)n2 + 94967296L + 4200000000L;
        }
        return l2;
    }

    public static bf a(int n2) {
        return bc.b(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static bf a(int n2, int n3, boolean bl2) {
        n3 %= 100;
        if (bl2) {
            bf bf2 = new bf(n2, n3);
            if (bf.a(n2, null) == null) {
                bf2 = new bf(5610000);
            }
            bf bf3 = bf2;
            if (bf2.b() >= n3 * (n2 % 100)) return bf3;
            return bf3;
        }
        bf.b(n2);
        return null;
    }

    public static bf a(int n2, boolean bl2) {
        return bc.b(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(int n2) {
        switch (n2) {
            default: {
                return "";
            }
            case 1: {
                return s.d[175];
            }
            case 2: {
                return s.d[169];
            }
            case 4: {
                return s.a[80];
            }
            case 8: {
                return s.a[33];
            }
            case 16: {
                return s.a[48];
            }
            case 256: {
                return s.a[148];
            }
            case 1024: {
                return "Th\u00fa nu\u00f4i/C\u01b0\u1ee1i";
            }
            case 2048: {
                return s.a[69];
            }
            case 8192: {
                return "Y\u00eau th\u00fa";
            }
            case 16384: {
                return s.a[111];
            }
            case 65536: {
                return s.a[101];
            }
            case 131072: {
                return s.a[117];
            }
            case 262144: {
                return s.b[20];
            }
            case 524288: {
                return "X\u00e2y d\u1ef1ng";
            }
            case 0x100000: {
                return "M\u00f3ng";
            }
            case 0x200000: {
                return s.a[120];
            }
            case 0x400000: 
        }
        return "\u0110\u1eb7c bi\u1ec7t";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2, int n3) {
        boolean bl2 = true;
        long l2 = n3;
        switch (n2) {
            default: {
                return false;
            }
            case 1: {
                if (l2 < 100000L) return false;
                if (l2 > 99999999L) return false;
                return bl2;
            }
            case 2: {
                if (l2 < 100000000L) return false;
                if (l2 > 199999999L) return false;
                return bl2;
            }
            case 3: {
                if (l2 < 200000000L) return false;
                if (l2 > 299999999L) return false;
                return bl2;
            }
            case 5: {
                if (l2 < 500000000L) return false;
                if (l2 > 599999999L) return false;
                return bl2;
            }
            case 10: {
                if (l2 < 600000000L) return false;
                if (l2 > 699999999L) return false;
                return bl2;
            }
            case 7: {
                if (l2 < 1000000000L) return false;
                if (l2 > 1099999999L) return false;
                return bl2;
            }
            case 11: {
                if (l2 < 900000000L) return false;
                if (l2 > 999999999L) return false;
                return bl2;
            }
            case 12: {
                if (l2 < 1500000000L) return false;
                if (l2 > 1599999999L) return false;
                return bl2;
            }
            case 110: {
                if (l2 < 32768L) return false;
                if (l2 > 1999999999L) return false;
                return bl2;
            }
            case 4: {
                if (l2 < 400000000L) return false;
                if (l2 > 499999999L) return false;
                return bl2;
            }
            case 6: {
                if (l2 < 800000000L) return false;
                if (l2 > 899999999L) return false;
                return bl2;
            }
            case 170: {
                if (l2 < 1700000000L) return false;
                if (l2 > 1799999999L) return false;
                return bl2;
            }
            case 160: {
                if (l2 < 1600000000L) return false;
                if (l2 > 1699999999L) return false;
                return bl2;
            }
            case 180: {
                if (l2 < 1110000000L) return false;
                if (l2 > 1199999999L) return false;
                return bl2;
            }
            case 20: {
                if (l2 < 1110000000L) return false;
                if (l2 > 1119999999L) return false;
                return bl2;
            }
            case 22: {
                if (l2 < 1130000000L) return false;
                if (l2 > 1139999999L) return false;
                return bl2;
            }
            case 24: {
                if (l2 < 1150000000L) return false;
                if (l2 > 1159999999L) return false;
                return bl2;
            }
            case 780: {
                if (l2 < 1310000000L) return false;
                if (l2 > 1399999999L) return false;
                return bl2;
            }
            case 34: {
                if (l2 < 1310000000L) return false;
                if (l2 > 1319999999L) return false;
                return bl2;
            }
            case 36: {
                if (l2 < 1330000000L) return false;
                if (l2 > 1339999999L) return false;
                return bl2;
            }
            case 38: {
                if (l2 < 1350000000L) return false;
                if (l2 > 1359999999L) return false;
                return bl2;
            }
            case 202: {
                if (l2 < 2000000000L) return false;
                if (l2 > 2009999999L) return false;
                return bl2;
            }
            case 200: {
                if (l2 < 2000000000L) return false;
                if (l2 > 2099999999L) return false;
                return bl2;
            }
            case 203: {
                if (bc.a((int)l2) < 2100000000L) return false;
                if (bc.a((int)l2) > bc.a(-2094967297)) return false;
                return bl2;
            }
            case 204: {
                if (l2 < -1994967296L) return false;
                if (l2 > -1894967297L) return false;
                return bl2;
            }
            case 217: {
                if (l2 < -1294967296L) return false;
                if (l2 > -294967297L) return false;
                return bl2;
            }
            case 205: {
                if (l2 < -1894967296L) return false;
                if (l2 > -1794967297L) return false;
                return bl2;
            }
            case 214: {
                if (l2 < -1951847296L) return false;
                if (l2 > -1951837297L) return false;
                return bl2;
            }
            case 215: {
                if (l2 < -1951747296L) return false;
                if (l2 > -1951737297L) return false;
                return bl2;
            }
            case 212: {
                if (l2 < -1951757296L) return false;
                if (l2 > -1951747297L) return false;
                return bl2;
            }
            case 213: {
                if (l2 < -1951857296L) return false;
                if (l2 > -1951847297L) return false;
                return bl2;
            }
            case 211: {
                if (l2 < -1942157296L) return false;
                if (l2 > -1942097297L) return false;
                return bl2;
            }
            case 207: {
                if (l2 < -1979967296L) return false;
                if (l2 > -1974967297L) return false;
                return bl2;
            }
            case 209: {
                if (l2 < -1952857296L) return false;
                if (l2 > -1952767297L) return false;
                return bl2;
            }
            case 210: {
                if (l2 < -1952757296L) return false;
                if (l2 > -1952667297L) return false;
                return bl2;
            }
            case 219: {
                if (l2 < 2020000000L) return false;
                if (l2 > 2029999999L) return false;
                return bl2;
            }
            case 218: {
                if (l2 < -1939467296L) return false;
                if (l2 > -1938967297L) return false;
                return bl2;
            }
            case 216: {
                if (l2 < -1939967296L) return false;
                if (l2 > -1939467297L) return false;
                return bl2;
            }
            case 208: 
        }
        if (l2 < -1974967296L) return false;
        if (l2 > -1964977296L) return false;
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(int n2, int n3, int n4) {
        boolean bl2 = true;
        if (n2 == 1) {
            return bl2;
        }
        if (n2 == 2) {
            if (bc.a(n4, n3)) return false;
            return bc.a(110, n3);
        }
        if (n2 == 4) {
            return bc.a(203, n3);
        }
        if (n2 == 8) {
            if (bc.a(110, n3)) return false;
            if (!bc.a(203, n3)) return bl2;
            return false;
        }
        if (n2 != 16) return false;
        return bc.a(205, n3);
    }

    public static bf b(int n2) {
        return bc.b(n2, true);
    }

    public static bf b(int n2, boolean bl2) {
        return bc.a(4000000 + n2 / 100 * 10000 + 1616, n2, bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(int n2, int n3) {
        switch (n2) {
            default: {
                return false;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 10: 
            case 11: 
            case 12: 
            case 20: 
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 26: 
            case 34: 
            case 36: 
            case 38: {
                return bc.a(n2, n3);
            }
            case 13: {
                if ((long)n3 < 1600000000L) return false;
                if ((long)n3 > 1799999999L) return false;
                return true;
            }
            case 9: 
        }
        return bc.a(170, n3);
    }

    public int a() {
        return this.b;
    }

    public bf a() {
        return bc.b(this.g);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        if ((this.e & 0x80) == 0) return false;
        return true;
    }
}

