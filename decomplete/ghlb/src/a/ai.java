/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.SocketConnection
 */
package a;

import a.Static;
import a.aj;
import a.al;
import a.bb;
import a.bh;
import a.bj;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;
import lib.Thread;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ai
extends aj {
    public static int d;
    public static int e;
    private InputStream a;
    private OutputStream a;
    Runnable a;
    private final Vector a;
    private SocketConnection a;
    private boolean a;
    public byte[] a = this;
    private long b;
    private boolean b = true;
    private long c;
    private boolean c = true;
    private int f = 0;

    static {
        Static.regClass(6);
        ai.cinitclone();
    }

    public ai(String string) {
    }

    static InputStream a(ai ai2) {
        return ai2.a;
    }

    static OutputStream a(ai ai2) {
        return ai2.a;
    }

    static Vector a(ai ai2) {
        return ai2.a;
    }

    static SocketConnection a(ai ai2) {
        return ai2.a;
    }

    public static void a(InputStream inputStream, byte[] byArray) {
        int n2;
        for (int i2 = 0; i2 < byArray.length; i2 += n2) {
            n2 = inputStream.read(byArray, i2, byArray.length - i2);
            if (n2 != -1) continue;
            throw new IOException("Input stream closed");
        }
    }

    static boolean a(ai ai2) {
        return ai2.a;
    }

    static boolean a(ai ai2, boolean bl2) {
        ai2.c = bl2;
        return bl2;
    }

    static boolean b(ai ai2) {
        return ai2.b;
    }

    static boolean b(ai ai2, boolean bl2) {
        ai2.a = bl2;
        return bl2;
    }

    static boolean c(ai ai2) {
        return ai2.c;
    }

    public static void cinitclone() {
        d = 0;
        e = 0;
    }

    public int a(byte[] byArray) {
        short s2 = al.a(byArray, e);
        e += 2;
        return s2;
    }

    @Override
    public void a() {
        this.a = true;
        this.g();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(byte[] object) {
        int n2 = ((byte[])object).length;
        this.a = new byte[n2 + 5 + 4 + 2];
        e = 0;
        System.arraycopy(object, 0, this.a, 5, n2);
        al.a(this.a, 0, (short)-258);
        this.a[2] = d;
        al.a(this.a, 3, (short)(n2 + 2));
        al.a(this.a, 5, n2, (byte)d);
        al.a(this.a, n2 + 5, al.a(this.a, 2, n2 + 3));
        al.a(this.a, n2 + 5 + 4, (short)-21846);
        d = (byte)(d + 1);
        object = this.a;
        synchronized (object) {
            this.a.addElement(this.a);
            this.a.notify();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void b() {
        if (this.a) return;
        // MONITORENTER : this
        this.a = true;
        // MONITOREXIT : this
        Vector vector = this.a;
        // MONITORENTER : vector
        this.a.notify();
        // MONITOREXIT : vector
        if (this.a != null) {
            try {
                this.a.close();
                // MONITORENTER : this
                this.a = null;
            }
            catch (Exception exception) {}
        }
        if (this.a != null) {
            try {
                this.a.close();
                // MONITORENTER : this
                this.a = null;
            }
            catch (Exception exception) {}
        }
        if (this.a != null) {
            try {
                this.a.close();
                // MONITORENTER : this
                this.a = null;
            }
            catch (Exception exception) {}
        }
        this.a = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(byte[] byArray) {
        try {
            this.a.write(byArray);
            this.a.flush();
            this.c += (long)byArray.length;
            return;
        }
        catch (IOException iOException) {
            this.b();
            short s2 = (short)((byArray[2] & 0xFF) << 8 | byArray[3] & 0xFF);
            bb.a(new StringBuffer().append("Th\u00f4ng tin g\u1eedi l\u1ed7i!").append(s2).toString(), false);
            return;
        }
    }

    public void c() {
        new Thread(new bh(this)).start();
    }

    @Override
    public void d() {
        this.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void e() {
        synchronized (this) {
            this.a.removeAllElements();
            return;
        }
    }

    @Override
    public void f() {
        synchronized (this) {
            this.b();
            return;
        }
    }

    public void g() {
        new Thread(new bj(this)).start();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        try {
            this.a = (SocketConnection)Connector.open((String)this.b);
            this.a.setSocketOption((byte)0, 0);
            this.a = this.a.openOutputStream();
            this.a = this.a.openInputStream();
            if (this.c != false) {
                this.a.write((byte[])this.b);
                this.a.flush();
            }
            this.c();
            this.b = false;
        }
        catch (IOException iOException) {
            if (this.a != null) {
                this.a.b(new StringBuffer().append("Error opening socket connection to: '").append((String)this.b).append("'").toString());
            }
            bb.a(new StringBuffer().append("Li\u00ean k\u1ebft m\u1ea1ng d\u1ecb th\u01b0\u1eddng!!").append(iOException.toString()).toString(), false);
            return;
        }
        while (true) {
            block16: {
                if (this.a) {
                    this.b = true;
                    return;
                }
                try {
                    Thread.sleep(5L);
                    break block16;
                }
                catch (IOException iOException) {
                    byte by = bb.b;
                    bb.b = 1;
                    continue;
                }
                catch (NegativeArraySizeException negativeArraySizeException) {
                    this.b();
                    continue;
                }
                catch (NullPointerException nullPointerException) {
                    this.b();
                    if (bb.b == 0) {
                        bb.b = 1;
                        continue;
                    }
                    bb.a("Truy\u1ec1n s\u1ed1 li\u1ec7u l\u1ed7i!", false);
                    continue;
                }
                catch (Exception exception) {
                    this.b();
                    if (bb.b == 0) {
                        bb.b = 1;
                        continue;
                    }
                    bb.a(exception.getMessage(), false);
                    continue;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw new VerifyError("bad dex opcode");
                }
                catch (InterruptedException interruptedException) {}
            }
            e = 0;
            Object object = new byte[2];
            ai.a(this.a, object);
            e = 0;
            this.f = (short)this.a((byte[])object);
            Object object2 = new byte[this.f - 2];
            ai.a(this.a, object2);
            if (this.a == null) continue;
            object = new ByteArrayInputStream;
            object((byte[])object2);
            object2 = new DataInputStream;
            object2((InputStream)object);
            this.a.a((DataInputStream)object2);
        }
    }
}

