/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.nokia.mid.ui.DeviceControl
 *  javax.microedition.lcdui.Alert
 *  javax.microedition.lcdui.AlertType
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Form
 *  javax.microedition.lcdui.Gauge
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.ItemStateListener
 *  javax.microedition.lcdui.List
 *  javax.microedition.lcdui.TextField
 *  javax.microedition.midlet.MIDlet
 *  javax.microedition.rms.RecordStore
 */
package chen;

import chen.a;
import com.nokia.mid.ui.DeviceControl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javak.microedition.midlet.MiDlet;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Gauge;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import lib.Canvas;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class chen
extends MiDlet
implements Runnable,
CommandListener,
ItemStateListener {
    private static String a;
    private static Hashtable a;
    private static Alert a;
    private static Command a;
    private static Displayable a;
    private static final Form a;
    private static List a;
    private static lib.MIDlet[] a;
    private static String b;
    public static chen chen;
    public static Display d;
    public static final PrintStream debugout;
    public static final Hashtable map;
    public static int now;
    public static String nowmf;
    private int a;
    private TextField a;
    private boolean a;
    private int b;
    private List b;
    private TextField b;
    private TextField c;
    private TextField d;

    static {
        a = new Hashtable();
        a = new Form("C\u00e0i \u0111\u1eb7t");
        debugout = System.out;
        a = new Command("Tr\u1edf l\u1ea1i", 2, 10);
        map = new Hashtable();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public chen() {
        block14: {
            super();
            this.a = true;
            chen.chen.chen = this;
            chen.chen.d = Display.getDisplay((MIDlet)this);
            chen.chen.a = new Alert("G\u1ee3i \u00fd", "", null, AlertType.INFO);
            this.c = new TextField("M\u00e3 truy c\u1eadp:", "", 20, 65536);
            var2_1 = RecordStore.openRecordStore((String)"chen_rms_urlmap", (boolean)false);
            if (var2_1.getNumRecords() > 0 && (var3_2 /* !! */  = var2_1.getRecord(1)) != null) {
                var4_7 = new ByteArrayInputStream(var3_2 /* !! */ );
                super(var4_7);
            }
            ** GOTO lbl25
            {
                catch (Exception var1_5) {
                    chen.chen.map.put("sms://106*", "sms://10086");
                    break block14;
                }
                try {
                    while (true) {
                        chen.chen.map.put(var1_4.readUTF(), var1_4.readUTF());
                    }
                }
                catch (Exception var3_3) {}
                {
                    var1_4.close();
lbl25:
                    // 2 sources

                    var2_1.closeRecordStore();
                }
            }
        }
        try {
            var1_4 = RecordStore.openRecordStore((String)"chen_rms_setting", (boolean)false);
            if (var1_4.getNumRecords() > 0) {
                var3_2 /* !! */  = var1_4.getRecord(1);
                if (var3_2 /* !! */  == null) {
                    this.e();
                    var1_4.closeRecordStore();
                    return;
                }
            }
            ** GOTO lbl59
        }
        catch (Exception var1_6) {
            this.e();
            return;
        }
        {
            var4_7 = new ByteArrayInputStream(var3_2 /* !! */ );
            super(var4_7);
            Canvas.menukey = var2_1.readInt();
            Canvas.waittime = var2_1.readInt();
            chen.chen.a = var2_1.readUTF();
            chen.chen.b = var2_1.readUTF();
            var2_1.close();
            if (chen.chen.a.length() <= 0) ** GOTO lbl-1000
            var2_1 = new Form("M\u1eadt kh\u1ea9u");
            var2_1.append((Item)this.c);
            var2_1.setCommandListener((CommandListener)this);
            var3_2 /* !! */  = (byte[])new Command;
            super("X\u00e1c nh\u1eadn", 4, 12);
            var2_1.addCommand((Command)var3_2 /* !! */ );
            var3_2 /* !! */  = (byte[])new Command;
            super("Tho\u00e1t", 7, 13);
            var2_1.addCommand((Command)var3_2 /* !! */ );
            chen.chen.d.setCurrent((Displayable)var2_1);
lbl59:
            // 3 sources

            while (true) {
                var1_4.closeRecordStore();
                return;
            }
        }
lbl-1000:
        // 1 sources

        {
            this.e();
            ** continue;
        }
    }

    private void a() {
        List list;
        this.b = list = new List("\u0110\u1ecba ch\u1ec9 b\u1ea3n \u0111\u1ed3", 3);
        list.setCommandListener((CommandListener)this);
        list.addCommand(new Command("\u0110\u00e3 th\u00eam", 1, 18));
        Object object = new Command("S\u1eeda", 1, 20);
        list.addCommand((Command)object);
        list.setSelectCommand((Command)object);
        list.addCommand(new Command("X\u00f3a", 1, 19));
        list.addCommand(new Command("L\u01b0u", 1, 21));
        list.addCommand(a);
        object = map.keys();
        while (object.hasMoreElements()) {
            list.append((String)object.nextElement(), null);
        }
        list.setCommandListener((CommandListener)this);
        d.setCurrent((Displayable)list);
    }

    private void a(String string, String string2) {
        Form form = new Form("S\u1eeda");
        form.append((Item)new TextField("G\u1ed1c:", string, 512, 0));
        form.append((Item)new TextField("M\u1edbi: ", string2, 512, 0));
        form.setCommandListener((CommandListener)this);
        form.addCommand(new Command("X\u00e1c nh\u1eadn", 4, 22));
        form.addCommand(new Command("Hu\u1ef7", 2, 23));
        d.setCurrent((Displayable)form);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void b() {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        RecordStore recordStore;
        Object object = map;
        try {
            recordStore = RecordStore.openRecordStore((String)"chen_rms_urlmap", (boolean)true);
            if (map.isEmpty() && recordStore.getNumRecords() > 0) {
                recordStore.setRecord(1, new byte[0], 0, 0);
                recordStore.closeRecordStore();
                return;
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            Enumeration enumeration = ((Hashtable)object).keys();
            while (enumeration.hasMoreElements()) {
                String string = (String)enumeration.nextElement();
                dataOutputStream.writeUTF(string);
                dataOutputStream.writeUTF((String)((Hashtable)object).get(string));
            }
        }
        catch (Exception exception) {
            return;
        }
        dataOutputStream.flush();
        dataOutputStream.close();
        object = byteArrayOutputStream.toByteArray();
        if (recordStore.getNumRecords() > 0) {
            recordStore.setRecord(1, (byte[])object, 0, ((Object)object).length);
        } else {
            recordStore.addRecord((byte[])object, 0, ((Object)object).length);
        }
        recordStore.closeRecordStore();
    }

    private void c() {
        List list = new List("Mobile", 3);
        list.setCommandListener((CommandListener)this);
        list.addCommand(new Command("Gi\u1ea3i ph\u00f3ng b\u1ed9 nh\u1edb", 4, 11));
        list.addCommand(a);
        list.addCommand(new Command("Danh s\u00e1ch ch\u1ee7 \u0111\u1ec1", 4, 16));
        list.setFitPolicy(1);
        Runtime runtime = Runtime.getRuntime();
        list.append(new StringBuffer().append("T\u1ed5ng b\u1ed9 nh\u1edb: ").append(runtime.totalMemory() / 1024L).append(" k").toString(), null);
        list.append(new StringBuffer().append("B\u1ed9 nh\u1edb tr\u1ed1ng: ").append(runtime.freeMemory() / 1024L).append(" k").toString(), null);
        list.append(new StringBuffer().append("S\u1ed1 l\u01b0\u1ee3ng ch\u1ee7 \u0111\u1ec1: ").append(Thread.activeCount()).toString(), null);
        list.append(new StringBuffer().append("B\u1ed9 \u0111\u1ebfm ch\u1ee7 \u0111\u1ec1: ").append(lib.Thread.Threads.size()).toString(), null);
        if (a != null) {
            list.append(new StringBuffer().append("Hi\u1ec3n th\u1ecb: ").append(a).toString(), null);
        }
        d.setCurrent((Displayable)list);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d() {
        int n2;
        lib.Thread thread;
        int n3 = 0;
        List list = new List("Danh s\u00e1ch ch\u1ee7 \u0111\u1ec1", 3);
        list.setCommandListener((CommandListener)this);
        list.addCommand(new Command("X\u1eed l\u00ed k\u00edch ho\u1ea1t", 4, 14));
        list.addCommand(new Command("L\u1ed7i x\u1eed l\u00ed", 4, 15));
        list.addCommand(a);
        Vector vector = lib.Thread.Threads;
        int n4 = 0;
        while (true) {
            if (n4 >= vector.size()) break;
            thread = (lib.Thread)vector.elementAt(n4);
            n2 = n4;
            if (thread.end) {
                n2 = n4;
                if (!thread.isAlive()) {
                    vector.removeElementAt(n4);
                    n2 = n4 - 1;
                }
            }
            n4 = n2 + 1;
        }
        for (n2 = n3; n2 < vector.size(); ++n2) {
            thread = (lib.Thread)vector.elementAt(n2);
            list.append(new StringBuffer().append(n2).append(". ").append(thread.getName()).append(": ").append(thread.runnable).toString(), null);
        }
        try {
            list.setSelectedIndex(Math.min(now, list.size() - 1), true);
        }
        catch (Exception exception) {}
        d.setCurrent((Displayable)list);
    }

    public static void destroy(lib.MIDlet mIDlet) {
        int n2;
        d.setCurrent((Displayable)a);
        lib.Display.midlets.remove(mIDlet);
        for (n2 = 0; n2 < a.length && mIDlet != a[n2]; ++n2) {
        }
        chen.chen.a[n2] = null;
        String string = a.getString(n2);
        a a2 = (a)a.get(string);
        a.set(n2, string, a2.a);
        chen.a.a(mIDlet);
        System.gc();
    }

    private void e() {
        CharSequence charSequence;
        List list;
        a = list = new List("Danh s\u00e1ch ch\u01b0\u01a1ng tr\u00ecnh", 3);
        if (b == null) {
            b = new StringBuffer().append("E:/").append(this.getAppProperty("MIDlet-Name")).append(".rms").toString();
        }
        int n2 = 0;
        while ((charSequence = this.getAppProperty(String.valueOf(n2))) != null) {
            a a2 = chen.a.a((String)charSequence);
            if (a.containsKey(a2.a)) {
                String string = new StringBuffer().append(a2.a).append('_').toString();
                int n3 = 1;
                do {
                    charSequence = new StringBuffer().append(string);
                    a2.a = ((StringBuffer)charSequence).append(++n3).toString();
                } while (a.containsKey(a2.a));
            }
            a.put(a2.a, a2);
            list.append(a2.a, a2.a);
            ++n2;
        }
        a = new lib.MIDlet[a.size()];
        list.addCommand(new Command("Ch\u1ea1y", 1, 0));
        list.addCommand(new Command("D\u1eebng", 1, 1));
        list.addCommand(new Command("Ch\u1ea1y \u1ea9n", 1, 5));
        list.addCommand(new Command("\u00c1nh s\u00e1ng n\u1ec1n", 1, 8));
        list.addCommand(new Command("Th\u00f4ng tin", 1, 4));
        list.addCommand(new Command("C\u00e0i \u0111\u1eb7t", 1, 3));
        list.addCommand(new Command("Tho\u00e1t", 7, 2));
        list.setCommandListener((CommandListener)this);
        a.addCommand(a);
        a.addCommand(new Command("L\u01b0u", 4, 9));
        list = a;
        charSequence = new TextField("Ph\u00edm chuy\u1ec3n:", String.valueOf(Canvas.menukey), 10, 2);
        this.b = charSequence;
        list.append((Item)charSequence);
        list = a;
        charSequence = new TextField("Th\u1eddi gian chuy\u1ec3n \u1ee9ng d\u1ee5ng:", String.valueOf(Canvas.waittime), 10, 2);
        this.a = charSequence;
        list.append((Item)charSequence);
        a.append((Item)this.c);
        charSequence = a;
        list = new TextField("\u0110\u01b0\u1eddng d\u1eabn l\u01b0u tr\u1eef:", b, 200, 0);
        this.d = list;
        charSequence.append((Item)list);
        a.addCommand(new Command("L\u01b0u tr\u1eef", 4, 6));
        a.addCommand(new Command("Nh\u1eadp kh\u1ea9u", 4, 7));
        a.addCommand(new Command("\u0110\u1ecba ch\u1ec9 b\u1ea3n \u0111\u1ed3", 4, 17));
        a.setCommandListener((CommandListener)this);
        d.setCurrent((Displayable)a);
    }

    public static void pause() {
        if (d.getCurrent() != null) {
            a = d.getCurrent();
        }
        d.setCurrent((Displayable)a);
    }

    public static void resume() {
        d.setCurrent(a);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void showError(String string) {
        a.setTimeout(-2);
        a.setString(string);
        Display display = d;
        Alert alert = a;
        string = d.getCurrent() instanceof Alert ? a : d.getCurrent();
        display.setCurrent(alert, (Displayable)string);
    }

    public static void showError(Throwable throwable) {
        chen.chen.showError(throwable.toString());
    }

    /*
     * Exception decompiling
     */
    @Override
    public void commandAction(Command var1_1, Displayable var2_15) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [17, 18 : 521->529)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public void destroyApp(boolean bl2) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void itemStateChanged(Item item) {
        try {
            DeviceControl.setLights((int)0, (int)((Gauge)item).getValue());
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    @Override
    public void pauseApp() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        try {
            String string = a.getString(this.a);
            a a2 = (a)a.get(string);
            lib.MIDlet mIDlet = a2.a();
            if (mIDlet != null) {
                chen.chen.a[this.a] = mIDlet;
                a.set(this.a, string, chen.a.a(a2.a));
                mIDlet.start();
            }
        }
        catch (Throwable throwable) {
            chen.chen.showError(throwable.toString());
        }
        this.a = true;
    }

    @Override
    public void startApp() {
    }
}

