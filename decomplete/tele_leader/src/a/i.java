/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.HttpConnection
 */
package a;

import a.Static;
import a.ae;
import a.aj;
import a.al;
import a.bb;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import javax.microedition.io.HttpConnection;
import lib.Thread;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class i
extends aj {
    public static byte a;
    public static Vector a;
    public static boolean a;
    InputStream a;
    OutputStream a;
    HttpConnection a;
    private short a;
    public byte[] a = null;
    private long b = 4;
    private int d;
    private byte e = 0;

    static {
        Static.regClass(27);
        i.cinitclone();
    }

    public i(String string) {
    }

    public static DataInputStream a(byte[] byArray) {
        return new DataInputStream(new ByteArrayInputStream(byArray));
    }

    public static InputStream a(byte[] byArray) {
        return new ByteArrayInputStream(byArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(DataInputStream object) {
        byte[] byArray = i.a((DataInputStream)object);
        if (byArray == null) return "";
        try {
            return new String(byArray, "UTF-8");
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return "";
    }

    public static void a(InputStream inputStream, byte[] byArray) {
        int n2;
        for (int i2 = 0; i2 < byArray.length; i2 += n2) {
            n2 = inputStream.read(byArray, i2, byArray.length - i2);
            if (n2 != -1) continue;
            throw new IOException("Input stream closed");
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(byte[] var1_1, boolean var2_3) {
        block30: {
            if (var2_3) {
                this.b = al.a;
                this.e = 0;
            }
            this.e = (byte)(this.e + 1);
            this.a = null;
            this.a = null;
            this.a = null;
            this.b = (byte)(this.b & -17);
            this.b = (byte)(this.b & -65);
            try {
                try {
                    this.a = (HttpConnection)i.a((String)this.b);
                    this.a.setRequestProperty("X-Online-Host", (String)this.a);
                    this.a.setRequestProperty("Accept", "*/*");
                    this.a.setRequestMethod("POST");
                    this.a.setRequestProperty("Content-Type", "application/octet-stream");
                    this.a.setRequestProperty("Content-Length", String.valueOf(var1_1.length));
                    this.a = this.a.openOutputStream();
                    this.a.write(var1_1);
                    this.a = (byte)al.a;
                }
                catch (Exception var4_9) {
                    bb.a().b.f();
                    bb.a().b.e();
                    this.b = (byte)(this.b | 16);
                    this.c();
                    ** GOTO lbl61
                }
                try {
                    var3_4 = this.a.getResponseCode();
                }
                catch (Exception var4_5) {
                    var3_4 = 0;
                    ** continue;
                }
lbl-1000:
                // 2 sources

                {
                    while (true) {
                        this.a = (byte)al.a;
                        if (var3_4 == 0) {
                            this.b = (byte)(this.b | 64);
                            break;
                        }
                        ** GOTO lbl-1000
                        break;
                    }
                }
            }
            catch (IOException var4_7) {
                if (bb.a().e && this.a()) {
                    this.d();
                    i.a = 0;
                    i.b = 0;
                    this.e();
                    bb.a().a(true);
                }
                this.b = (byte)(this.b | 16);
                this.c();
                ** GOTO lbl61
            }
            catch (SecurityException var4_8) {
                bb.a().b.f();
                bb.a().b.e();
                this.b = (byte)(this.b | 16);
                this.c();
                ** GOTO lbl61
            }
            catch (Throwable var1_2) {
                this.c();
                throw var1_2;
            }
lbl59:
            // 7 sources

            while (true) {
                this.c();
lbl61:
                // 4 sources

                if (this.e > 7 || al.a - this.b > 20000L) {
                    this.e = 0;
                    return;
                }
                break block30;
                break;
            }
lbl-1000:
            // 1 sources

            {
                if (var3_4 != 200 || this.a == null) ** GOTO lbl59
                var4_6 = this.a.getHeaderField("Content-Type");
                if (var4_6 == null || !var4_6.startsWith("text/vnd.wap.wml") && !var4_6.startsWith("application/vnd.wap.wmlc")) ** GOTO lbl-1000
                this.b = (byte)(this.b | 64);
                ** GOTO lbl59
            }
lbl-1000:
            // 1 sources

            {
                this.b = (byte)(this.b | 4);
                if (!bb.a().e || !this.a()) ** GOTO lbl-1000
                this.d();
                i.a = 0;
                i.b = 0;
                this.e();
                bb.a().a(true);
                ** GOTO lbl59
            }
lbl-1000:
            // 1 sources

            {
                if (bb.a().e) ** GOTO lbl59
                this.a = this.a.openInputStream();
                this.d = 0;
                var4_6 = new byte[2];
                i.a(this.a, (byte[])var4_6);
                this.a = (short)this.a((byte[])var4_6);
                this.d = 0;
                var4_6 = new byte[4];
                i.a(this.a, (byte[])var4_6);
                var3_4 = this.b((byte[])var4_6);
                if (var3_4 != 0 && i.a == 0) {
                    i.a = (byte)var3_4;
                }
                this.d = 0;
                var4_6 = new byte[4];
                i.a(this.a, (byte[])var4_6);
                var3_4 = this.b((byte[])var4_6);
                if (var3_4 != 0 && i.b == false) {
                    i.b = var3_4;
                }
                var4_6 = new byte[this.a - 4 - 4];
                i.a(this.a, (byte[])var4_6);
                if (this.a != null) {
                    if ((this.b & 1) == 0) {
                        this.d();
                    }
                    this.a.a(i.a((byte[])var4_6));
                }
                if (i.a != 0 || i.b != false) ** GOTO lbl59
                this.d();
                this.e();
                ** continue;
            }
        }
        if ((this.b & 64) == 0) {
            if ((this.b & 16) == 0) return;
        }
        try {
            Thread.sleep(3000L);
lbl111:
            // 2 sources

            while (true) {
                this.a(var1_1, false);
                return;
            }
        }
        catch (InterruptedException var4_10) {
            ** continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static byte[] a(DataInputStream object) {
        int n2;
        block3: {
            Object var2_2 = null;
            try {
                n2 = ((DataInputStream)object).readUnsignedShort();
                if (n2 > 0) break block3;
                return var2_2;
            }
            catch (IOException iOException) {
                return var2_2;
            }
        }
        byte[] byArray = new byte[n2];
        ((DataInputStream)object).readFully(byArray, 0, n2);
        return byArray;
    }

    public static void cinitclone() {
        a = true;
        a = new Vector();
    }

    public int a(byte[] byArray) {
        short s2 = al.a(byArray, this.d);
        this.d += 2;
        return s2;
    }

    @Override
    public void a() {
        bb.a().e = false;
        if (this.a == null || (this.b & 2) != 0) {
            this.b = (byte)(this.b & 0xFFFFFFF7);
            this.b = (byte)(this.b | 2);
            this.a = (byte)new Thread(this);
            this.a.start();
        }
    }

    public void a(int n2, byte[] byArray) {
        int n3 = this.d;
        this.d = n3 + 1;
        byArray[n3] = (byte)(n2 & 0xFF);
    }

    @Override
    public void a(byte[] byArray) {
        byte[] byArray2 = new byte[byArray.length + 2];
        System.arraycopy(byArray, 0, byArray2, 2, byArray.length);
        al.a(byArray2, 0, (short)byArray2.length);
        a.addElement(byArray2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a() {
        if (a.size() != 0) return false;
        if ((this.b & 4) == 0) return false;
        return true;
    }

    public int b(byte[] byArray) {
        int n2 = al.a(byArray, this.d);
        this.d += 4;
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void b() {
        if (this.a != null) {
            this.a(this.a, true);
        } else {
            this.b = (byte)(this.b & 0xFFFFFFFB);
            if (a.size() > 0) {
                byte[] byArray;
                byte[] byArray2 = new byte[1000];
                int n2 = 0;
                int n3 = 0;
                while (a.size() > 0 && (byArray = (byte[])a.elementAt(0)).length + n3 < 1000) {
                    System.arraycopy(byArray, 0, byArray2, n3, byArray.length);
                    int n4 = byArray.length;
                    a.removeElementAt(0);
                    n3 += n4;
                    ++n2;
                }
                if (n3 > 0) {
                    this.a = new byte[n3 + 14 + 4 + 2];
                    this.d = 0;
                    this.b(65278, this.a);
                    this.a(d, this.a);
                    this.b(n3 + 9, this.a);
                    this.c(a, this.a);
                    this.c((int)b, this.a);
                    this.a(n2, this.a);
                    System.arraycopy(byArray2, 0, this.a, 14, n3);
                    al.a(this.a, 5, n3 + 9, (byte)d);
                    al.a(this.a, n3 + 14, al.a(this.a, 2, n3 + 12));
                    al.a(this.a, n3 + 14 + 4, (short)-21846);
                    d = (byte)(d + 1);
                    this.a(this.a, true);
                }
            } else if ((this.b & 1) != 0) {
                this.a = new byte[11];
                this.d = 0;
                this.b(0, this.a);
                this.c(a, this.a);
                this.c((int)b, this.a);
                this.a(254, this.a);
                this.a(this.a, true);
            }
        }
        this.a = null;
    }

    public void b(int n2, byte[] byArray) {
        al.a(byArray, this.d, (short)n2);
        this.d += 2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void c() {
        if (this.a != null) {
            try {
                this.a.close();
                // MONITORENTER : this
                this.a = null;
            }
            catch (Exception exception) {
                this.a = null;
            }
            // MONITOREXIT : this
        }
        if (this.a != null) {
            try {
                this.a.close();
                // MONITORENTER : this
                this.a = null;
            }
            catch (Exception exception) {
                this.a = null;
            }
            // MONITOREXIT : this
        }
        if (this.a == null) return;
        try {
            this.a.close();
            // MONITORENTER : this
            this.a = null;
        }
        catch (Exception exception) {
            this.a = null;
            return;
        }
    }

    public void c(int n2, byte[] byArray) {
        al.a(byArray, this.d, n2);
        this.d += 4;
    }

    @Override
    public void d() {
        this.b = (byte)(this.b & 0xFFFFFFFD);
        this.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void e() {
        synchronized (this) {
            a.removeAllElements();
            return;
        }
    }

    @Override
    public void f() {
        synchronized (this) {
            this.b = (byte)(this.b | 8);
            this.c();
            this.a = (byte)null;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        if (a) {
            a = false;
            new ae().a(false);
        }
        Thread thread = Thread.CurrentThread();
        while ((this.b & 8) == 0 && this.a == thread) {
            try {
                if ((this.b & 2) != 0) {
                    this.b();
                }
                synchronized (this) {
                }
            }
            catch (Exception exception) {
            }
            {
                this.wait(100L);
            }
            {
                Thread.yield();
            }
        }
    }
}

