/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.z;
import java.io.DataInputStream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ah {
    public z a;
    public short a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ah(DataInputStream dataInputStream) {
        try {
            z z2;
            this.a = dataInputStream.readShort();
            this.a = z2 = new z();
            this.a.a(dataInputStream);
            dataInputStream.close();
            return;
        }
        catch (Exception exception) {
            this.a = 0;
            return;
        }
    }
}

