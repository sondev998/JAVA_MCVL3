/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Alert
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Item
 */
package lib;

import chen.chen;
import java.util.Hashtable;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;
import lib.Alert;
import lib.MIDlet;

public class Display {
    public static Hashtable midlets = new Hashtable();
    private Displayable a;

    private Display(MIDlet mIDlet) {
        midlets.put(mIDlet, this);
    }

    public static Display getDisplay(MIDlet mIDlet) {
        Display display;
        Display display2 = display = (Display)midlets.get(mIDlet);
        if (display == null) {
            display2 = new Display(mIDlet);
        }
        return display2;
    }

    public void callSerially(Runnable runnable) {
        chen.d.callSerially(runnable);
    }

    public boolean flashBacklight(int n2) {
        return chen.d.flashBacklight(n2);
    }

    public int getBestImageHeight(int n2) {
        return chen.d.getBestImageHeight(n2);
    }

    public int getBestImageWidth(int n2) {
        return chen.d.getBestImageWidth(n2);
    }

    public int getColor(int n2) {
        return chen.d.getColor(n2);
    }

    public Displayable getCurrent() {
        return this.a;
    }

    public boolean isColor() {
        return chen.d.isColor();
    }

    public int numAlphaLevels() {
        return chen.d.numAlphaLevels();
    }

    public int numColors() {
        return chen.d.numColors();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCurrent(Displayable displayable) {
        synchronized (this) {
            if (displayable == null) {
                chen.pause();
            } else {
                javax.microedition.lcdui.Display display = chen.d;
                this.a = displayable;
                display.setCurrent(displayable);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setCurrent(Alert alert, Displayable displayable) {
        javax.microedition.lcdui.Display display = chen.d;
        if (displayable == null) {
            displayable = this.a;
        } else {
            this.a = displayable;
        }
        display.setCurrent((javax.microedition.lcdui.Alert)alert, displayable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setCurrentItem(Item item) {
        if (item == null) return;
        try {
            chen.d.setCurrentItem(item);
            this.a = chen.d.getCurrent();
            return;
        }
        catch (Exception exception) {
            chen.showError(exception);
            return;
        }
    }

    public boolean vibrate(int n2) {
        return chen.d.vibrate(n2);
    }
}

