/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.az;
import java.util.Vector;

public class ao
extends Vector {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public az a() {
        if (this == null) return null;
        az az2 = (az)this.elementAt(0);
        this.removeElement(az2);
        return az2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(az az2) {
        for (int i2 = this.size() - 1; i2 >= 0; --i2) {
            if (((az)this.elementAt((int)i2)).c > az2.c) continue;
            this.insertElementAt(az2, i2 + 1);
            return;
        }
        this.insertElementAt(az2, 0);
    }
}

