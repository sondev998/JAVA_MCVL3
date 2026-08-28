/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connection
 *  javax.microedition.io.Connector
 */
package lib;

import chen.chen;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import javax.microedition.io.Connection;

public class Connector {
    public static final int READ = 1;
    public static final int READ_WRITE = 3;
    public static final int WRITE = 2;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(String string) {
        String string2;
        String string3;
        Object object;
        Object object2;
        block5: {
            object2 = chen.map;
            if (((Hashtable)object2).isEmpty()) return string;
            if (((Hashtable)object2).containsKey(string)) {
                return (String)((Hashtable)object2).get(string);
            }
            object = ((Hashtable)object2).keys();
            while (object.hasMoreElements()) {
                string3 = (String)object.nextElement();
                if (string3.length() <= 1 || !string3.endsWith("*")) continue;
                string2 = string3.substring(0, string3.length() - 1);
                if (string2.startsWith("*")) {
                    int n2 = string.indexOf(string2 = string2.substring(1, string2.length()));
                    if (n2 <= 0) continue;
                    object = object2 = (String)((Hashtable)object2).get(string3);
                    if (((String)object2).startsWith("*")) {
                        object = new StringBuffer().append(string.substring(0, n2)).append(((String)object2).substring(1)).toString();
                    }
                    object2 = object;
                    if (!((String)object).endsWith("*")) return object2;
                    return new StringBuffer().append(((String)object).substring(0, ((String)object).length() - 1)).append(string.substring(string2.length() + n2)).toString();
                }
                if (!string.startsWith(string2)) {
                    continue;
                }
                break block5;
            }
            return string;
        }
        object2 = object = (String)((Hashtable)object2).get(string3);
        if (!((String)object).endsWith("*")) return object2;
        return new StringBuffer().append(((String)object).substring(0, ((String)object).length() - 1)).append(string.substring(string2.length())).toString();
    }

    public static Connection open(String string) {
        return javax.microedition.io.Connector.open((String)Connector.a(string));
    }

    public static Connection open(String string, int n2) {
        return javax.microedition.io.Connector.open((String)Connector.a(string), (int)n2);
    }

    public static Connection open(String string, int n2, boolean bl2) {
        return javax.microedition.io.Connector.open((String)Connector.a(string), (int)n2, (boolean)bl2);
    }

    public static DataInputStream openDataInputStream(String string) {
        return javax.microedition.io.Connector.openDataInputStream((String)Connector.a(string));
    }

    public static DataOutputStream openDataOutputStream(String string) {
        return javax.microedition.io.Connector.openDataOutputStream((String)Connector.a(string));
    }

    public static InputStream openInputStream(String string) {
        return javax.microedition.io.Connector.openInputStream((String)Connector.a(string));
    }

    public static OutputStream openOutputStream(String string) {
        return javax.microedition.io.Connector.openOutputStream((String)Connector.a(string));
    }
}

