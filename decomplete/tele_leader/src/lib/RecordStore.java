/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
package lib;

public class RecordStore {
    private static javax.microedition.rms.RecordStore a(char c2, String string, boolean bl2) {
        return javax.microedition.rms.RecordStore.openRecordStore((String)new StringBuffer().append(c2).append(string).toString(), (boolean)bl2);
    }

    private static javax.microedition.rms.RecordStore a(char c2, String string, boolean bl2, int n2, boolean bl3) {
        return javax.microedition.rms.RecordStore.openRecordStore((String)new StringBuffer().append(c2).append(string).toString(), (boolean)bl2, (int)n2, (boolean)bl3);
    }

    private static void a(char c2, String string) {
        javax.microedition.rms.RecordStore.deleteRecordStore((String)new StringBuffer().append(c2).append(string).toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String[] a(char c2) {
        int n2;
        String[] stringArray = javax.microedition.rms.RecordStore.listRecordStores();
        String[] stringArray2 = new String[stringArray.length];
        if (stringArray == null) return null;
        int n3 = stringArray.length - 1;
        int n4 = 0;
        while (true) {
            n2 = n4;
            if (n3 < 0) break;
            if (stringArray[n3].charAt(0) == c2) {
                n2 = n4 + 1;
                stringArray2[n4] = stringArray[n3].substring(1);
                n4 = n2;
            }
            --n3;
        }
        if (n2 == 0) {
            return null;
        }
        if (n2 == stringArray2.length) {
            return stringArray2;
        }
        stringArray = new String[n2];
        System.arraycopy(stringArray2, 0, stringArray, 0, n2);
        return stringArray;
    }

    public static void aeleteRecordStore(String string) {
        RecordStore.a('a', string);
    }

    public static String[] aistRecordStores() {
        return RecordStore.a('a');
    }

    public static javax.microedition.rms.RecordStore apenRecordStore(String string, boolean bl2) {
        return RecordStore.a('a', string, bl2);
    }

    public static javax.microedition.rms.RecordStore apenRecordStore(String string, boolean bl2, int n2, boolean bl3) {
        return RecordStore.a('a', string, bl2, n2, bl3);
    }

    public static void beleteRecordStore(String string) {
        RecordStore.a('b', string);
    }

    public static String[] bistRecordStores() {
        return RecordStore.a('b');
    }

    public static javax.microedition.rms.RecordStore bpenRecordStore(String string, boolean bl2) {
        return RecordStore.a('b', string, bl2);
    }

    public static javax.microedition.rms.RecordStore bpenRecordStore(String string, boolean bl2, int n2, boolean bl3) {
        return RecordStore.a('b', string, bl2, n2, bl3);
    }

    public static void celeteRecordStore(String string) {
        RecordStore.a('c', string);
    }

    public static String[] cistRecordStores() {
        return RecordStore.a('c');
    }

    public static javax.microedition.rms.RecordStore cpenRecordStore(String string, boolean bl2) {
        return RecordStore.a('c', string, bl2);
    }

    public static javax.microedition.rms.RecordStore cpenRecordStore(String string, boolean bl2, int n2, boolean bl3) {
        return RecordStore.a('c', string, bl2, n2, bl3);
    }

    public static void deleteRecordStore(String string) {
        RecordStore.a('d', string);
    }

    public static String[] distRecordStores() {
        return RecordStore.a('d');
    }

    public static javax.microedition.rms.RecordStore dpenRecordStore(String string, boolean bl2) {
        return RecordStore.a('d', string, bl2);
    }

    public static javax.microedition.rms.RecordStore dpenRecordStore(String string, boolean bl2, int n2, boolean bl3) {
        return RecordStore.a('d', string, bl2, n2, bl3);
    }

    public static void eeleteRecordStore(String string) {
        RecordStore.a('e', string);
    }

    public static String[] eistRecordStores() {
        return RecordStore.a('e');
    }

    public static javax.microedition.rms.RecordStore epenRecordStore(String string, boolean bl2) {
        return RecordStore.a('e', string, bl2);
    }

    public static javax.microedition.rms.RecordStore epenRecordStore(String string, boolean bl2, int n2, boolean bl3) {
        return RecordStore.a('e', string, bl2, n2, bl3);
    }

    public static void feleteRecordStore(String string) {
        RecordStore.a('f', string);
    }

    public static String[] fistRecordStores() {
        return RecordStore.a('f');
    }

    public static javax.microedition.rms.RecordStore fpenRecordStore(String string, boolean bl2) {
        return RecordStore.a('f', string, bl2);
    }

    public static javax.microedition.rms.RecordStore fpenRecordStore(String string, boolean bl2, int n2, boolean bl3) {
        return RecordStore.a('f', string, bl2, n2, bl3);
    }

    public static void geleteRecordStore(String string) {
        RecordStore.a('g', string);
    }

    public static String[] gistRecordStores() {
        return RecordStore.a('g');
    }

    public static javax.microedition.rms.RecordStore gpenRecordStore(String string, boolean bl2) {
        return RecordStore.a('g', string, bl2);
    }

    public static javax.microedition.rms.RecordStore gpenRecordStore(String string, boolean bl2, int n2, boolean bl3) {
        return RecordStore.a('g', string, bl2, n2, bl3);
    }

    public static void heleteRecordStore(String string) {
        RecordStore.a('h', string);
    }

    public static String[] histRecordStores() {
        return RecordStore.a('h');
    }

    public static javax.microedition.rms.RecordStore hpenRecordStore(String string, boolean bl2) {
        return RecordStore.a('h', string, bl2);
    }

    public static javax.microedition.rms.RecordStore hpenRecordStore(String string, boolean bl2, int n2, boolean bl3) {
        return RecordStore.a('h', string, bl2, n2, bl3);
    }

    public static void ieleteRecordStore(String string) {
        RecordStore.a('i', string);
    }

    public static String[] iistRecordStores() {
        return RecordStore.a('i');
    }

    public static javax.microedition.rms.RecordStore ipenRecordStore(String string, boolean bl2) {
        return RecordStore.a('i', string, bl2);
    }

    public static javax.microedition.rms.RecordStore ipenRecordStore(String string, boolean bl2, int n2, boolean bl3) {
        return RecordStore.a('i', string, bl2, n2, bl3);
    }

    public static void jeleteRecordStore(String string) {
        RecordStore.a('j', string);
    }

    public static String[] jistRecordStores() {
        return RecordStore.a('j');
    }

    public static javax.microedition.rms.RecordStore jpenRecordStore(String string, boolean bl2) {
        return RecordStore.a('j', string, bl2);
    }

    public static javax.microedition.rms.RecordStore jpenRecordStore(String string, boolean bl2, int n2, boolean bl3) {
        return RecordStore.a('j', string, bl2, n2, bl3);
    }
}

