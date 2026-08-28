/*
 * Decompiled with CFR 0.152.
 */
package lib;

import chen.chen;
import lib.Canvas;
import lib.Thread;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class a
extends java.lang.Thread {
    private final int a;
    private final Canvas a;

    a(Canvas canvas, int n2) {
        this.a = canvas;
        this.a = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        try {
            Thread.sleep(Canvas.waittime);
            chen.pause();
        }
        catch (Exception exception) {
            try {
                this.a.leyPressed(this.a);
                this.a.leyReleased(this.a);
            }
            catch (Throwable throwable) {
                chen.showError(throwable);
            }
        }
        Canvas.a(this.a, null);
    }
}

