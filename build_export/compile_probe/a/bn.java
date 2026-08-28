/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.CommandListener
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Item
 *  javax.microedition.lcdui.TextField
 */
package a;

import a.Static;
import a.ac;
import a.al;
import a.av;
import a.bi;
import a.n;
import a.s;
import a.work.main.MyMidlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import lib.Form;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bn
extends Form
implements CommandListener {
    public static bn a;
    private int a;
    private bi a;
    private Command a;
    private TextField a;
    private Command b;
    private TextField b;

    static {
        Static.regClass(23);
        bn.cinitclone();
    }

    public bn(String string, String string2, String string3, int n2, int n3, bi bi2) {
        super(string);
        this.a = n3;
        this.a = bi2;
        this.a = new Command(s.a[6], 4, 0);
        this.b = new Command(s.a[1], 2, 0);
        this.a = new TextField(string2, string3, n2, n3);
        this.addCommand(this.a);
        this.addCommand(this.b);
        this.append((Item)this.a);
        this.setCommandListener(this);
        a = this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(String string, int n2, int n3, int n4, int n5, bi bi2) {
        Object object = (av)bi2;
        Object object2 = (n)((av)object).a(n4);
        n n6 = (n)((av)object).a(n5);
        if (object2 == null) return;
        if (n6 == null) {
            return;
        }
        if (n2 == -1) {
            n2 = ((n)object2).g();
        }
        object = al.a(null, "Kh\u00f4ng th\u1ec3 qu\u00e1");
        al.a((StringBuffer)object, (long)n2);
        al.a((StringBuffer)object, "t\u1eeb!");
        String string2 = new StringBuffer().append(s.d[371]).append(((StringBuffer)object).toString()).toString();
        object2 = ((n)object2).a().length() > n2 ? ((n)object2).a().substring(0, n2) : ((n)object2).a();
        MyMidlet.setDisplayable((Displayable)new bn(string, string2, (String)object2, n2, n3, bi2));
        bn.a.b = new TextField(new StringBuffer().append(s.d[372]).append(((StringBuffer)object).toString()).toString(), n6.a(), n2, n3);
        a.append((Item)bn.a.b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(String string, int n2, int n3, int n4, bi bi2) {
        n n5 = (n)((av)bi2).a(n4);
        if (n5 == null) {
            return;
        }
        n4 = n2;
        if (n2 == -1) {
            n4 = n5.g();
        }
        bn.a(string, n4, n3, n5.a(), bi2);
    }

    public static void a(String string, int n2, int n3, String string2, bi bi2) {
        ac.b();
        CharSequence charSequence = al.a(null, "Kh\u00f4ng th\u1ec3 qu\u00e1");
        al.a(charSequence, (long)n2);
        al.a(charSequence, "t\u1eeb!");
        charSequence = charSequence.toString();
        if (string2.length() > n2) {
            string2 = string2.substring(0, n2);
        }
        MyMidlet.setDisplayable((Displayable)new bn(string, (String)charSequence, string2, n2, n3, bi2));
    }

    public static void cinitclone() {
        a = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(boolean bl2) {
        Command command = bl2 ? this.a : this.b;
        this.commandAction(command, (Displayable)ac.a());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void commandAction(Command object, Displayable object2) {
        if (this.a == object) {
            void var1_3;
            MyMidlet.setDisplayable((Displayable)ac.a());
            bi bi2 = this.a;
            String string = this.a.getString();
            if (this.b == null) {
                String string2 = "";
            } else {
                String string3 = this.b.getString();
            }
            bi2.a(string, (String)var1_3, this.a);
        } else if (this.b == object) {
            MyMidlet.setDisplayable((Displayable)ac.a());
        }
        a = null;
    }
}

