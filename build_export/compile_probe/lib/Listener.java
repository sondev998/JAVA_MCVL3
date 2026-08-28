/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 */
package lib;

import chen.chen;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;

public class Listener
implements CommandListener {
    public static final Command small = new Command("Programs List", 2, 1);
    private CommandListener a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void commandAction(Command command, Displayable displayable) {
        if (command == small) {
            chen.pause();
            return;
        }
        if (this.a == null) return;
        try {
            this.a.commandAction(command, displayable);
            return;
        }
        catch (Throwable throwable) {
            chen.showError(throwable);
            return;
        }
    }

    public void setCommandListener(CommandListener commandListener) {
        this.a = commandListener;
    }
}

