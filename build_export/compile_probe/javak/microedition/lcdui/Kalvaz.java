/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Alert
 *  javax.microedition.lcdui.AlertType
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 */
package javak.microedition.lcdui;

import javak.microedition.lcdui.KalvazAutoClick;
import javak.microedition.midlet.MiDlet;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public abstract class Kalvaz
extends Canvas {
    boolean auto;
    MiDlet m = MiDlet.m;
    Thread t;

    public void KeyPressed(int n2) {
    }

    public void KeyReleased(int n2) {
    }

    public void KeyRepeated(int n2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void keyPressed(int n2) {
        if (n2 != Integer.parseInt(this.m.setkey.getString())) {
            this.KeyPressed(n2);
            return;
        }
        try {
            KalvazAutoClick kalvazAutoClick;
            Object object;
            boolean bl2 = !this.auto;
            this.auto = bl2;
            if (this.m.sa.getSelectedIndex() == 1) {
                Display display = this.m.d;
                bl2 = this.auto;
                object = bl2 ? "B\u1eadt" : "T\u1eaft";
                kalvazAutoClick = new Alert(null, String.valueOf(object).concat(" auto"), null, AlertType.INFO);
                display.setCurrent((Displayable)kalvazAutoClick);
            }
            kalvazAutoClick = new KalvazAutoClick(this);
            object = new Thread(kalvazAutoClick);
            this.t = object;
            ((Thread)object).start();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    protected void keyReleased(int n2) {
        this.KeyReleased(n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void keyRepeated(int n2) {
        if (n2 == Integer.parseInt(this.m.setkey.getString())) {
            this.auto = false;
            this.m.showSetting((Displayable)this);
            return;
        }
        this.KeyRepeated(n2);
    }

    public abstract void paint(Graphics var1);
}

