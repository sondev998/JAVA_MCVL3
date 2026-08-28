/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.TextBox
 */
package lib;

import javax.microedition.lcdui.CommandListener;
import lib.Listener;

public class TextBox
extends javax.microedition.lcdui.TextBox {
    private Listener a;

    public TextBox(String object, String string, int n2, int n3) {
        super((String)object, string, n2, n3);
        this.addCommand(Listener.small);
        this.a = object = new Listener();
        super.setCommandListener((CommandListener)object);
    }

    public void setCommandListener(CommandListener commandListener) {
        this.a.setCommandListener(commandListener);
    }
}

