/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.AlertType
 */
package lib;

import chen.chen;
import lib.Display;

public class AlertType {
    public static final AlertType ALARM;
    public static final AlertType CONFIRMATION;
    public static final AlertType ERROR;
    public static final AlertType INFO;
    public static final AlertType WARNING;
    javax.microedition.lcdui.AlertType a;

    static {
        WARNING = new AlertType(javax.microedition.lcdui.AlertType.WARNING);
        ERROR = new AlertType(javax.microedition.lcdui.AlertType.ERROR);
        ALARM = new AlertType(javax.microedition.lcdui.AlertType.ALARM);
        CONFIRMATION = new AlertType(javax.microedition.lcdui.AlertType.CONFIRMATION);
        INFO = new AlertType(javax.microedition.lcdui.AlertType.INFO);
    }

    protected AlertType() {
    }

    private AlertType(javax.microedition.lcdui.AlertType alertType) {
        this.a = alertType;
    }

    public boolean playSound(Display display) {
        return this.a.playSound(chen.d);
    }
}

