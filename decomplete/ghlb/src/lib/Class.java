/*
 * Decompiled with CFR 0.152.
 */
package lib;

public class Class {
    public static java.lang.Class aorName(String string) {
        return Class.load("a.", string);
    }

    public static java.lang.Class borName(String string) {
        return Class.load("b.", string);
    }

    public static java.lang.Class corName(String string) {
        return Class.load("c.", string);
    }

    public static java.lang.Class dorName(String string) {
        return Class.load("d.", string);
    }

    public static java.lang.Class eorName(String string) {
        return Class.load("e.", string);
    }

    public static java.lang.Class forName(String string) {
        return Class.load("f.", string);
    }

    public static java.lang.Class gorName(String string) {
        return Class.load("g.", string);
    }

    public static java.lang.Class horName(String string) {
        return Class.load("h.", string);
    }

    public static java.lang.Class iorName(String string) {
        return Class.load("i.", string);
    }

    public static java.lang.Class jorName(String string) {
        return Class.load("j.", string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static java.lang.Class load(String clazz, String string) {
        try {
            StringBuffer stringBuffer = new StringBuffer();
            return java.lang.Class.forName(stringBuffer.append((String)((Object)clazz)).append(string).toString());
        }
        catch (ClassNotFoundException classNotFoundException) {
            return java.lang.Class.forName(string);
        }
    }
}

