/*
 * Decompiled with CFR 0.152.
 */
package lib;

import chen.chen;
import java.util.Vector;

public class Thread
extends java.lang.Thread {
    public static final Vector Threads = new Vector(50);
    public boolean end;
    public Runnable runnable;

    public Thread() {
        this.a(this);
    }

    public Thread(Runnable runnable) {
        this.a(runnable);
    }

    public Thread(Runnable runnable, String string) {
        super(string);
        this.a(runnable);
    }

    public Thread(String string) {
        super(string);
        this.a(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Thread CurrentThread() {
        java.lang.Thread thread = java.lang.Thread.currentThread();
        if (!(thread instanceof Thread)) return new Thread(thread);
        return (Thread)thread;
    }

    private void a(Runnable runnable) {
        this.runnable = runnable;
        this.end = false;
        Threads.addElement(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        if (this.runnable != null) {
            try {
                this.runnable.run();
            }
            catch (Throwable throwable) {
                chen.showError(throwable);
            }
            Threads.removeElement(this);
        }
    }

    @Override
    public void start() {
        if (!this.end) {
            super.start();
            this.end = true;
        }
    }
}

