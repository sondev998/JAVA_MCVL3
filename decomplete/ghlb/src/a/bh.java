/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.ai;
import a.al;
import a.bb;
import java.io.IOException;
import java.io.InputStream;

public final class bh
implements Runnable {
    private final ai a;

    bh(ai ai2) {
        this.a = ai2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        ai.a(this.a, false);
        while (true) {
            Object object;
            if (ai.a(this.a)) {
                ai.a(this.a, true);
                return;
            }
            if (!ai.a(this.a).isEmpty()) {
                object = (byte[])ai.a(this.a).elementAt(0);
                try {
                    this.a.b((byte[])object);
                    ai.a(this.a).removeElement(object);
                }
                catch (IOException iOException) {
                    this.a.b();
                    bb.a("G\u1eedi s\u1ed1 li\u1ec7u th\u1ea5t b\u1ea1i!", false);
                }
                this.a.a = (InputStream)al.a;
            }
            object = ai.a(this.a);
            synchronized (object) {
                int n2 = ai.a(this.a).size();
                if (n2 == 0) {
                    try {
                        ai.a(this.a).wait();
                    }
                    catch (InterruptedException interruptedException) {
                        bb.a("G\u1eedi s\u1ed1 li\u1ec7u th\u1ea5t b\u1ea1i!", false);
                    }
                }
            }
        }
    }
}

