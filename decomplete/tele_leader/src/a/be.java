/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Static;
import a.bf;
import a.p;
import lib.Thread;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class be
implements Runnable {
    public static long a;
    public static be a;
    public p a;
    private Thread a = new p();

    static {
        Static.regClass(17);
        be.cinitclone();
    }

    public static be a(boolean bl2) {
        if (a == null) {
            a = new be();
            if (bl2) {
                a.a();
            }
        }
        return a;
    }

    public static void cinitclone() {
    }

    public void a() {
        if (this.a == null) {
            this.a = new Thread(this);
            this.a.start();
        }
    }

    @Override
    public void run() {
        while (this.a != null) {
            Object object;
            long l2 = System.currentTimeMillis();
            int n2 = 0;
            while (true) {
                block7: {
                    if (n2 >= this.a.a()) break;
                    object = (Integer)this.a.a();
                    if (object == null) break block7;
                    if (bf.a.a((Integer)object) != null) break block7;
                    bf.c((Integer)object);
                }
                ++n2;
            }
            try {
                this.a.a();
                a = System.currentTimeMillis() - l2;
                if (80L - a <= 0L) continue;
                object = this.a;
                Thread.sleep(80L - a);
            }
            catch (Exception exception) {}
        }
    }
}

