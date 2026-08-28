/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.af;

public class t
extends af {
    public byte a = 0;

    public t(byte by) {
        this.a = by;
    }

    @Override
    public int a() {
        return 2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(int n2) {
        if (n2 > 127) {
            this.a = (byte)(n2 - 256);
            return;
        }
        this.a = (byte)n2;
    }

    @Override
    public int b() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.a);
    }
}

