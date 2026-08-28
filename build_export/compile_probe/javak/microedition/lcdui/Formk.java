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

    public Formk(String string) {
        super(string);
        string = new Gauge("Chi\u0309nh a\u0301nh sa\u0301ng n\u00ea\u0300n", true, 100, iLight);
        string.setLayout(3);
        this.append((Item)string);
        string = new Gauge("Chi\u0309nh a\u0301nh sa\u0301ng n\u00ea\u0300n", true, 10, iLight / 10);
        string.setLayout(3);
        this.append((Item)string);
        this.setItemStateListener(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void itemStateChanged(Item item) {
        try {
            item = (Gauge)item;
            if (item.getMaxValue() > 10) {
                iLight = item.getValue();
                ((Gauge)this.get(1)).setValue(iLight / 10);
            } else {
                iLight = item.getValue() * 10;
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

