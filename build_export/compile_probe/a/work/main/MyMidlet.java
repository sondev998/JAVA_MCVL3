/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.ConnectionNotFoundException
 *  javax.microedition.lcdui.Displayable
 */
package a.work.main;

import a.Static;
import a.ac;
import a.bb;
import a.s;
import a.w;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Displayable;
import lib.Display;
import lib.MIDlet;

public class MyMidlet
extends MIDlet {
    public static Display display;
    public static MyMidlet m_Midlet;
    public String BindAddr = "";
    public String ConnectAddr = "";
    public String UpdateAddr = "";

    static {
        Static.regClass(35);
        MyMidlet.cinitclone();
    }

    public static void cinitclone() {
    }

    public static void setDisplayable(Displayable displayable) {
        display.setCurrent(displayable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void Connect() {
        if (this.ConnectAddr == null || this.ConnectAddr.equals("")) {
            this.ConnectAddr = s.d[0];
        }
        try {
            m_Midlet.platformRequest(this.ConnectAddr);
            return;
        }
        catch (ConnectionNotFoundException connectionNotFoundException) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void destroyApp(boolean bl2) {
        if (bl2 && bb.a().b != null) {
            long l2 = System.currentTimeMillis();
            while (!bb.a().b.a()) {
                synchronized (this) {
                    try {
                        this.wait(1000L);
                    }
                    catch (Exception exception) {}
                    if (System.currentTimeMillis() - l2 <= 5000L) continue;
                }
            }
            bb.a().c();
        }
    }

    public void exit(boolean bl2) {
        w.a(0);
        this.Connect();
        this.destroyApp(bl2);
        this.notifyDestroyed();
    }

    @Override
    protected void pauseApp() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void startApp() {
        if (bb.c) {
            return;
        }
        m_Midlet = this;
        display = Display.getDisplay(m_Midlet);
        MyMidlet.setDisplayable((Displayable)ac.a());
        if (!bb.c) return;
        m_Midlet.exit(false);
    }
}

