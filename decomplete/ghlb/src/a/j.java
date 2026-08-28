/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.af;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class j
extends af {
    private StringBuffer a;

    public j(String string) {
        this.a = new StringBuffer(string);
    }

    @Override
    public int a() {
        return 6;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String a() {
        if (this.a == null) return null;
        return this.a.toString();
    }

    @Override
    public void a(int n2) {
        this.a = new StringBuffer(n2);
    }

    public void a(String string) {
        if (this.a != null) {
            this.a.delete(0, this.a.length());
            this.a.append(string);
        }
    }

    @Override
    public int b() {
        return 0;
    }

    public String toString() {
        return this.a.toString();
    }
}

