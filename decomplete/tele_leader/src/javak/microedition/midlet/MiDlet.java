/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Alert
 *  javax.microedition.lcdui.AlertType
 *  javax.microedition.lcdui.ChoiceGroup
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.ItemCommandListener
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.lcdui.Ticker
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 */
package javak.microedition.midlet;

import java.io.InputStream;
import javak.microedition.lcdui.Formk;
import javak.microedition.midlet.MiDletKeySelector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemCommandListener;
import javax.microedition.lcdui.TextField;
import javax.microedition.lcdui.Ticker;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public class MiDlet
extends MIDlet
implements CommandListener,
ItemCommandListener {
    public static MiDlet m;
    final byte[] b1;
    final byte[] b2;
    final byte[] b3;
    public Command cancel;
    public Display d;
    public Formk f = new Formk("C\u00e0i \u0111\u1eb7t");
    public Displayable lastDisp;
    public Formk s = new Formk("\u0110\u1eb7t ph\u00edm");
    public ChoiceGroup sa;
    public Command save;
    public Command selectKey;
    public TextField setkey;
    public TextField tfdur;
    public TextField tfkey;
    public TextField tfsetdur;
    public TextField tfsetkey;
    final String vd;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MiDlet() {
        TextField textField;
        this.tfkey = textField = new TextField("M\u00e3 ph\u00edm:Th\u1eddi gian:\n(Nhi\u1ec1u m\u00e3 c\u00e1ch nhau b\u1eb1ng d\u1ea5u \",\"):", null, 5000, 0);
        textField.setString("49:1,50:1,51:1,52:1,53:1,54:1,55:1,56:1");
        this.tfkey = textField;
        this.tfdur = new TextField("Qu\u00e3ng ngh\u1ec9 (mili gi\u00e2y):", "400", 10, 2);
        this.setkey = new TextField("Ph\u00edm c\u00e0i \u0111\u1eb7t:", null, 3, 2);
        this.tfsetkey = new TextField("M\u00e3 ph\u00edm:", null, 3, 2);
        this.tfsetdur = new TextField("\u1ea4n ph\u00edm n\u00e0y sau (gi\u00e2y):", "0", 100, 2);
        this.sa = new ChoiceGroup("Th\u00f4ng b\u00e1o b\u1eadt/t\u1eaft auto:", 1);
        this.save = new Command("L\u01b0u", 4, 0);
        this.cancel = new Command("H\u1ee7y", 3, 1);
        this.selectKey = new Command("M\u00e3 ph\u00edm", 8, 2);
        this.vd = new String(new byte[]{77, 111, 98, 105, 108, 101, 70, 111, 114, 117, 109, 46, 118, 110, 45, 118, 50, 46, 53, 32, 98, 121, 32, 77, 114, 46, 75, 105, 101, 116, 40, 99, 111, 100, 101, 32, 97, 117, 116, 111, 32, 98, 121, 32, 107, 97, 108, 101, 110, 122, 41});
        this.b1 = new byte[]{106, 97, 118, 97, 107, 46, 109, 105, 99, 114, 111, 101, 100, 105, 116, 105, 111, 110, 46};
        this.b2 = new byte[]{108, 99, 100, 117, 105, 46, 75, 97, 108, 118, 97, 122};
        this.b3 = new byte[]{109, 105, 100, 108, 101, 116, 46, 77, 105, 68, 108, 101, 116};
        MiDlet.cc$(this);
        m = this;
        this.d = Display.getDisplay((MIDlet)this);
        this.sa.append("Kh\u00f4ng", null);
        this.sa.append("C\u00f3", null);
        this.f.setTicker(new Ticker(this.vd));
        this.f.append((Item)this.tfkey);
        this.f.append((Item)this.tfdur);
        this.f.append((Item)this.setkey);
        try {
            InputStream inputStream = ((Object)((Object)this)).getClass().getResourceAsStream("/javak/config.txt");
            byte[] byArray = new byte[inputStream.available()];
            inputStream.read(byArray, 0, byArray.length);
            TextField textField2 = this.setkey;
            String string = new String(byArray);
            textField2.setString(string.trim());
            inputStream.close();
        }
        catch (Exception exception) {}
        this.f.append((Item)this.sa);
        this.f.append("N\u00ean \u0111\u1ec3 qu\u00e3ng ngh\u1ec9 t\u1eeb 100 tr\u1edf l\u00ean");
        this.f.addCommand(this.save);
        this.f.addCommand(this.cancel);
        this.f.setCommandListener(this);
        this.tfkey.addCommand(this.selectKey);
        this.tfkey.setItemCommandListener((ItemCommandListener)this);
        this.s.append((Item)this.tfsetkey);
        this.s.append((Item)this.tfsetdur);
        this.s.append("B\u1eb1ng 0 s\u1ebd \u1ea5n ngay khi t\u1edbi l\u01b0\u1ee3t ph\u00edm n\u00e0y");
        this.s.addCommand(this.save);
        this.s.addCommand(this.cancel);
        this.s.setCommandListener(this);
        this.recoverSetting();
    }

    static final void cc$(MiDlet miDlet) {
        try {
            String string = new String(miDlet.b1);
            string = String.valueOf(string);
            String string2 = new String(miDlet.b2);
            Class.forName(string.concat(String.valueOf(string2)));
            string = new String(miDlet.b1);
            string = String.valueOf(string);
            string2 = new String(miDlet.b3);
            Class.forName(string.concat(String.valueOf(string2)));
            return;
        }
        catch (Exception exception) {
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                stringBuffer.append("AutoClick");
            }
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void commandAction(Command command, Displayable object) {
        block12: {
            block13: {
                int n2 = 0;
                if (object != this.f) break block12;
                if (command != this.save) break block13;
                try {
                    RecordStore recordStore = RecordStore.openRecordStore((String)"AutoClick", (boolean)true);
                    boolean bl2 = true;
                    while (true) {
                        block15: {
                            block14: {
                                if (bl2 && !(bl2 = false) && recordStore.getNumRecords() >= 1) break block14;
                                if (n2 < 4) break block15;
                            }
                            byte[] byArray = this.tfkey.getString().getBytes();
                            byte[] byArray2 = this.tfdur.getString().getBytes();
                            byte[] byArray3 = this.setkey.getString().getBytes();
                            byte[] byArray4 = String.valueOf(this.sa.getSelectedIndex()).getBytes();
                            recordStore.setRecord(1, byArray, 0, byArray.length);
                            recordStore.setRecord(2, byArray2, 0, byArray2.length);
                            recordStore.setRecord(3, byArray3, 0, byArray3.length);
                            recordStore.setRecord(4, byArray4, 0, byArray4.length);
                            recordStore.closeRecordStore();
                            break;
                        }
                        recordStore.addRecord(new byte[1], 0, 1);
                        ++n2;
                    }
                }
                catch (Exception exception) {}
                this.d.setCurrent(new Alert(null, "\u0110\u00e3 l\u01b0u!", null, AlertType.INFO), this.lastDisp);
            }
            if (command == this.cancel) {
                this.d.setCurrent(this.lastDisp);
            }
        }
        if (object == this.s) {
            if (command == this.save) {
                String string = String.valueOf(this.tfsetkey.getString()).concat(":").concat(String.valueOf(this.tfsetdur.getString()));
                if (this.tfkey.getString().length() < 1) {
                    this.tfkey.setString(string);
                } else {
                    this.tfkey.setString(String.valueOf(this.tfkey.getString()).concat(",").concat(String.valueOf(string)));
                }
                this.d.setCurrent((Displayable)this.f);
            }
            if (command == this.cancel) {
                this.d.setCurrent((Displayable)this.f);
            }
        }
    }

    public void commandAction(Command command, Item item) {
        if (command == this.selectKey) {
            this.d.setCurrent((Displayable)new MiDletKeySelector(this));
        }
    }

    public void destroyApp(boolean bl2) {
    }

    public void pauseApp() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void recoverSetting() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)"AutoClick", (boolean)false);
            byte[] byArray = recordStore.getRecord(1);
            byte[] byArray2 = recordStore.getRecord(2);
            byte[] byArray3 = recordStore.getRecord(3);
            byte[] byArray4 = recordStore.getRecord(4);
            TextField textField = this.tfkey;
            String string = new String(byArray);
            textField.setString(string);
            TextField textField2 = this.tfdur;
            string = new String(byArray2);
            textField2.setString(string);
            string = this.setkey;
            String string2 = new String(byArray3);
            string.setString(string2);
            ChoiceGroup choiceGroup = this.sa;
            String string3 = new String(byArray4);
            choiceGroup.setSelectedIndex(Integer.parseInt(string3), true);
            recordStore.closeRecordStore();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public void showSetting(Displayable displayable) {
        this.lastDisp = displayable;
        this.d.setCurrent((Displayable)this.f);
    }

    public void startApp() {
    }
}

