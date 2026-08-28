/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Image
 *  javax.microedition.lcdui.List
 */
package lib;

import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Image;
import lib.Listener;

public class List
extends javax.microedition.lcdui.List {
    private Listener a;

    public List(String string, int n2) {
        super(string, n2);
        this.a();
    }

    public List(String string, int n2, String[] stringArray, Image[] imageArray) {
        super(string, n2, stringArray, imageArray);
        this.a();
    }

    private void a() {
        Listener listener;
        this.addCommand(Listener.small);
        this.a = listener = new Listener();
        super.setCommandListener((CommandListener)listener);
    }

    public void setCommandListener(CommandListener commandListener) {
        this.a.setCommandListener(commandListener);
    }
}

