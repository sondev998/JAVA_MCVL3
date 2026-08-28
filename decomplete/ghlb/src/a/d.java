/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.af;

public class d
extends af {
    public long a = 0L;

    public d(long l2) {
        this.a = l2;
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
        return (int)this.a;
    }

    public String toString() {
        return String.valueOf(this.a);
    }
}

