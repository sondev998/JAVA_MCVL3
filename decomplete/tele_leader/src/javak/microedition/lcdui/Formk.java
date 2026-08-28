/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nokia.mid.ui.DeviceControl
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Gauge
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.ItemStateListener
 */
package javak.microedition.lcdui;

import com.nokia.mid.ui.DeviceControl;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Gauge;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;

public class Formk
extends Form
implements ItemStateListener {
    public static int iLight = 50;

    public Formk(String title) {
        super(title);
        Gauge gauge = new Gauge("Chi\u0309nh a\u0301nh sa\u0301ng n\u00ea\u0300n", true, 100, iLight);
        gauge.setLayout(3);
        this.append(gauge);
        gauge = new Gauge("Chi\u0309nh a\u0301nh sa\u0301ng n\u00ea\u0300n", true, 10, iLight / 10);
        gauge.setLayout(3);
        this.append(gauge);
        this.setItemStateListener(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void itemStateChanged(Item item) {
        try {
            Gauge gauge = (Gauge)item;
            if (gauge.getMaxValue() > 10) {
                iLight = gauge.getValue();
                ((Gauge)this.get(1)).setValue(iLight / 10);
            } else {
                iLight = gauge.getValue() * 10;
                ((Gauge)this.get(0)).setValue(iLight);
            }
            DeviceControl.setLights((int)0, (int)iLight);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}
