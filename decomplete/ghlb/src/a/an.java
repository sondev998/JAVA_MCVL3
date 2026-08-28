/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.af;

public class an
extends af {
    public int a = 0;

    public an(int n2) {
        this.a = n2;
    }

    @Override
    public int a() {
        return 4;
    }

    @Override
    public void a(int n2) {
        this.a = n2;
    }

    @Override
    public int b() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.a);
    }
}

