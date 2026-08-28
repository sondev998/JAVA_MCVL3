package a;

import a.work.main.MyMidlet;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.TextField;
import lib.Form;

/** Shared text-entry dialog. The local .auto command never reaches the server. */
public class bn extends Form implements CommandListener {
    public static bn a;

    private final int constraints;
    private final bi callback;
    private final Command confirm;
    private final Command cancel;
    private final TextField primaryField;
    private TextField secondaryField;

    static {
        Static.regClass(23);
        cinitclone();
    }

    public static void cinitclone() {
        a = null;
    }

    public bn(String title, String label, String value, int maxSize, int constraints, bi callback) {
        super(title);
        this.constraints = constraints;
        this.callback = callback;
        this.confirm = new Command("OK", Command.OK, 0);
        this.cancel = new Command("Hủy", Command.CANCEL, 0);
        this.primaryField = new TextField(label, value, maxSize, constraints);
        this.addCommand(this.confirm);
        this.addCommand(this.cancel);
        this.append((Item)this.primaryField);
        this.setCommandListener(this);
        a = this;
    }

    public static void a(String title, int maxSize, int constraints, int primaryId, int secondaryId, bi callback) {
        av game = (av)callback;
        n primary = (n)(Object)game.a(primaryId);
        n secondary = (n)(Object)game.a(secondaryId);
        if (primary == null || secondary == null) return;
        if (maxSize == -1) maxSize = primary.g();
        String label = new StringBuffer().append(s.d[371]).append(maxSize).append("từ!").toString();
        String value = primary.a().length() > maxSize ? primary.a().substring(0, maxSize) : primary.a();
        MyMidlet.setDisplayable(new bn(title, label, value, maxSize, constraints, callback));
        a.secondaryField = new TextField(new StringBuffer().append(s.d[372]).append(maxSize).append("từ!").toString(), secondary.a(), maxSize, constraints);
        a.append((Item)a.secondaryField);
    }

    public static void a(String title, int maxSize, int constraints, int fieldId, bi callback) {
        n field = (n)(Object)((av)callback).a(fieldId);
        if (field == null) return;
        if (maxSize == -1) maxSize = field.g();
        a(title, maxSize, constraints, field.a(), callback);
    }

    public static void a(String title, int maxSize, int constraints, String value, bi callback) {
        ac.b();
        String label = new StringBuffer().append("Không thể quá").append(maxSize).append("từ!").toString();
        if (value.length() > maxSize) value = value.substring(0, maxSize);
        MyMidlet.setDisplayable(new bn(title, label, value, maxSize, constraints, callback));
    }

    public void a(boolean accepted) {
        this.commandAction(accepted ? this.confirm : this.cancel, ac.a());
    }

    public void commandAction(Command command, Displayable displayable) {
        if (command == this.confirm) {
            String primary = this.primaryField.getString();
            if (".auto".equalsIgnoreCase(primary.trim())) {
                MyMidlet.setDisplayable(new AutoMenu());
                a = null;
                return;
            }
            String secondary = this.secondaryField == null ? "" : this.secondaryField.getString();
            MyMidlet.setDisplayable(ac.a());
            this.callback.a(primary, secondary, this.constraints);
        } else if (command == this.cancel) {
            MyMidlet.setDisplayable(ac.a());
        }
        a = null;
    }
}
