/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.ac;
import lib.Thread;

public final class at
extends Thread {
    private final ac a;

    at(ac ac2) {
        this.a = ac2;
    }

    @Override
    public void run() {
        while (ac.f > 0 && ac.f < 100) {
            try {
                ac.a(this.a, this.a.a);
                this.a.flushGraphics();
                Thread.sleep(10L);
            }
            catch (Exception exception) {}
        }
        ac.a(this.a, null);
    }
}

