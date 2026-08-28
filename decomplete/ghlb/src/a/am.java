/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.af;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class am {
    private ByteArrayOutputStream a;
    private DataOutputStream a = new DataOutputStream(this.a);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int n2) {
        try {
            this.a.reset();
            this.a.writeShort(n2);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(af af2) {
        switch (af2.a()) {
            case 2: {
                this.b(af2.b());
                return;
            }
            case 3: {
                this.c(af2.b());
                return;
            }
            case 4: 
            case 5: {
                this.d(af2.b());
                return;
            }
            case 6: {
                this.a(af2.toString());
                return;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(String object) {
        try {
            object = ((String)object).getBytes("UTF-8");
            this.a.writeByte(6);
            this.a.writeShort(((Object)object).length);
            int n2 = ((Object)object).length;
            this.a.write((byte[])object, 0, n2);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public byte[] a() {
        return this.a.toByteArray();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(int n2) {
        try {
            this.a.writeByte(2);
            this.a.writeByte(n2);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void c(int n2) {
        try {
            this.a.writeByte(3);
            this.a.writeShort(n2);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void d(int n2) {
        try {
            this.a.writeByte(4);
            this.a.writeInt(n2);
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }
}

