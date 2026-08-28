/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.af;

public class ba
extends af {
    public short a = 0;

    public ba(short s2) {
        this.a = s2;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public void a(int n2) {
        this.a = (short)n2;
    }

    @Override
    public int b() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.a);
    }
}

