/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.af;

public class ak
extends af {
    public boolean a = false;

    public ak(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public int a() {
        return 8;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(int n2) {
        if (n2 == 0) {
            this.a = false;
            return;
        }
        if (n2 != 1) return;
        this.a = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int b() {
        if (!this.a) return 0;
        return 1;
    }
}

