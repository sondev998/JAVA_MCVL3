/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.ai;
import lib.Thread;

public final class bj
implements Runnable {
    private final ai a;

    bj(ai ai2) {
        this.a = ai2;
    }

    @Override
    public void run() {
        while (!(ai.a(this.a) && this.a.a == null && ai.b(this.a) && ai.c(this.a) && ai.a(this.a) == null && ai.a(this.a) == null && ai.a(this.a) == null)) {
            try {
                this.a.b();
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
        }
        ai.b(this.a, false);
        this.a.a = new Thread(this.a.a);
        ((Thread)((Object)this.a.a)).start();
    }
}

