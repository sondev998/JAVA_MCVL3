/*
 * Decompiled with CFR 0.152.
 */
package lib;

import java.util.Vector;

public abstract class Stack {
    private final Vector a;

    protected Stack(Vector vector) {
        this.a = vector;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cinitclone() {
        Vector vector = this.a;
        synchronized (vector) {
            int n2 = this.a.size();
            int n3 = 0;
            while (n3 < n2) {
                try {
                    this.cinitclones((Integer)this.a.elementAt(n3));
                }
                catch (Throwable throwable) {}
                ++n3;
            }
            return;
        }
    }

    protected abstract void cinitclones(int var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void clear() {
        Vector vector = this.a;
        synchronized (vector) {
            int n2 = this.a.size();
            int n3 = 0;
            while (n3 < n2) {
                try {
                    this.clears((Integer)this.a.elementAt(n3));
                    System.gc();
                }
                catch (Throwable throwable) {}
                ++n3;
            }
            return;
        }
    }

    protected abstract void clears(int var1);
}

