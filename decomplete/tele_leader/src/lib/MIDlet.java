/*
 * Decompiled with CFR 0.152.
 */
package lib;

import chen.chen;
import java.io.InputStream;
import java.util.Hashtable;
import lib.Display;
import lib.Stack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class MIDlet {
    private static byte[] a;
    private static final Hashtable b;
    private Hashtable a;
    private boolean a = false;
    public Stack stack;

    static {
        b = new Hashtable();
        a = new byte[4096];
    }

    protected MIDlet() {
        this.setAppProperty(chen.nowmf);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final String a(InputStream object) {
        int n2;
        int n3 = 0;
        block4: while (true) {
            n2 = ((InputStream)object).read();
            switch (n2) {
                default: {
                    MIDlet.a[n3] = (byte)n2;
                    ++n3;
                    continue block4;
                }
                case 13: {
                    ((InputStream)object).read();
                }
                case -1: 
                case 10: 
            }
            break;
        }
        if (n2 != -1) return new String(a, 0, n3, "utf-8");
        if (n3 != 0) return new String(a, 0, n3, "utf-8");
        return null;
    }

    public final int checkPermission(String string) {
        return chen.chen.checkPermission(string);
    }

    protected abstract void destroyApp(boolean var1);

    public String getAppProperty(String string) {
        return (String)this.a.get(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void notifyDestroyed() {
        if (!this.a) {
            this.a = true;
            try {
                this.destroyApp(true);
            }
            catch (Throwable throwable) {
                chen.showError(throwable);
            }
            chen.destroy(this);
        }
    }

    public void notifyPaused() {
        chen.pause();
    }

    protected abstract void pauseApp();

    public final boolean platformRequest(String string) {
        return chen.chen.platformRequest(string);
    }

    public void resumeRequest() {
        chen.resume();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setAppProperty(String string) {
        Object object;
        block5: {
            object = (Hashtable)b.get(string);
            this.a = object;
            if (object != null) return;
            this.a = new Hashtable();
            b.put(string, this.a);
            object = this.getClass().getResourceAsStream(string);
            if (object == null) return;
            string = "";
            try {
                Object object2;
                while ((object2 = MIDlet.a((InputStream)object)) != null) {
                    Object object3;
                    int n2 = ((String)object2).indexOf(58);
                    if (n2 > 0) {
                        object3 = this.a;
                        string = ((String)object2).substring(0, n2);
                        ((Hashtable)object3).put(string, ((String)object2).substring(n2 + 1).trim());
                        continue;
                    }
                    object3 = ((String)object2).trim();
                    if (((String)object3).length() <= 0) continue;
                    object2 = this.a;
                    StringBuffer stringBuffer = new StringBuffer();
                    ((Hashtable)object2).put(string, stringBuffer.append(this.a.get(string)).append((String)object3).toString());
                }
                break block5;
            }
            catch (Exception exception) {
                chen.showError(exception);
            }
            return;
        }
        ((InputStream)object).close();
    }

    public void showDisplay() {
        Display display = Display.getDisplay(this);
        display.setCurrent(display.getCurrent());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void start() {
        try {
            this.startApp();
            return;
        }
        catch (Throwable throwable) {
            chen.showError(throwable);
            return;
        }
    }

    protected abstract void startApp();
}

