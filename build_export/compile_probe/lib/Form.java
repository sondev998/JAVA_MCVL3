/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Item
 */
package lib;

import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Item;
import lib.Listener;

public class Form
extends javax.microedition.lcdui.Form {
    private Listener a;

    public Form(String string) {
        super(string);
        this.a();
    }

    public Form(String string, Item[] itemArray) {
        super(string, itemArray);
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

