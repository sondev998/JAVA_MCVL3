/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordEnumeration
 *  javax.microedition.rms.RecordStore
 */
package a;

import a.al;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.rms.RecordEnumeration;
import lib.RecordStore;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(String string, int n2) {
        byte[] byArray;
        Object var2_3 = null;
        try {
            byArray = b.a(string, n2);
            string = var2_3;
            if (byArray == null) return string;
        }
        catch (Exception exception) {
            return var2_3;
        }
        return b.a(byArray);
    }

    private static String a(byte[] object) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[])object);
        DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
        object = dataInputStream.readUTF();
        dataInputStream.close();
        byteArrayInputStream.close();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Vector a(String string) {
        Vector<String[]> vector = new Vector<String[]>();
        try {
            string = RecordStore.apenRecordStore(string, true);
            RecordEnumeration recordEnumeration = string.enumerateRecords(null, null, false);
            while (true) {
                if (!recordEnumeration.hasNextElement()) {
                    string.closeRecordStore();
                    return vector;
                }
                vector.addElement(al.a(b.a(recordEnumeration.nextRecord()), "|"));
            }
        }
        catch (Exception exception) {
            return vector;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(String string) {
        try {
            javax.microedition.rms.RecordStore recordStore = RecordStore.apenRecordStore(string, true);
            if (recordStore == null) return;
            recordStore.closeRecordStore();
            RecordStore.aeleteRecordStore(string);
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
    public static void a(String string, int n2, String string2) {
        try {
            b.a(string, n2, b.a(string2));
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(String string, int n2, byte[] byArray) {
        javax.microedition.rms.RecordStore recordStore;
        boolean bl2;
        block4: {
            bl2 = true;
            recordStore = RecordStore.apenRecordStore(string, true);
            string = recordStore.enumerateRecords(null, null, false);
            byte[] byArray2 = new byte[]{};
            while (n2 > string.numRecords() + 1) {
                recordStore.addRecord(byArray2, 0, byArray2.length);
            }
            while (string.hasNextElement()) {
                if (string.nextRecordId() != n2) continue;
                break block4;
            }
            bl2 = false;
        }
        if (bl2) {
            recordStore.setRecord(n2, byArray, 0, byArray.length);
        } else {
            recordStore.addRecord(byArray, 0, byArray.length);
        }
        string.destroy();
        recordStore.closeRecordStore();
    }

    public static void a(String string, String object, String string2) {
        string = RecordStore.apenRecordStore(string, true);
        RecordEnumeration recordEnumeration = string.enumerateRecords(null, null, false);
        int n2 = -1;
        while (recordEnumeration.hasNextElement()) {
            int n3 = recordEnumeration.nextRecordId();
            int n4 = n2;
            if (n2 == -1) {
                n4 = n3;
            }
            n2 = n4;
            if (!al.a(b.a(string.getRecord(n3)), "|")[1].equals(object)) continue;
            string.deleteRecord(n3);
            n2 = n4;
        }
        object = b.a(string2);
        string.addRecord((byte[])object, 0, ((Object)object).length);
        if (string.getNumRecords() > 5 && n2 != -1) {
            string.deleteRecord(n2);
        }
        string.closeRecordStore();
    }

    private static byte[] a(String object) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF((String)object);
        object = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        dataOutputStream.close();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] a(String object, int n2) {
        int n3 = 0;
        try {
            int n4;
            int n5;
            javax.microedition.rms.RecordStore recordStore;
            block3: {
                recordStore = RecordStore.apenRecordStore((String)object, false);
                object = recordStore.enumerateRecords(null, null, false);
                n5 = n2;
                do {
                    n4 = n5;
                    n5 = n3;
                    if (!object.hasNextElement()) break block3;
                    n5 = n4 = object.nextRecordId();
                } while (n4 != n2);
                n5 = 1;
            }
            if (n5 == 0) return null;
            object = recordStore.getRecord(n4);
            recordStore.closeRecordStore();
            n2 = ((Object)object).length;
            if (n2 != 0) return object;
            return null;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

