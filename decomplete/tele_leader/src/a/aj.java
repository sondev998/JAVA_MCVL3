/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connection
 *  javax.microedition.io.Connector
 */
package a;

import a.Static;
import a.bb;
import a.bi;
import java.io.IOException;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import lib.Thread;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aj
implements Runnable {
    public static int a;
    public static int b;
    public static int c;
    public static byte d;
    public long a;
    public bi a;
    public String a;
    public Thread a = "";
    public byte b;
    public String b;
    public byte[] b = new byte[]{66, 49};
    public byte c;

    static {
        Static.regClass(7);
        aj.cinitclone();
    }

    public aj() {
        this.a = bb.a().a("", false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Object a(Object object) {
        if (object == null) return null;
        try {
            ((Connection)object).close();
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Connection a(String string) {
        try {
            return Connector.open((String)string, (int)3, (boolean)true);
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public static void cinitclone() {
        d = 1;
    }

    public void a() {
    }

    public void a(bi bi2) {
        this.a = bi2;
    }

    public void a(byte[] byArray) {
    }

    public boolean a() {
        return true;
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    @Override
    public void run() {
    }
}

