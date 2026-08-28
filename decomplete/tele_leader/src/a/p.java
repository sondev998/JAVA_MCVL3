/*
 * Decompiled with CFR 0.152.
 */
package a;

import java.util.Enumeration;
import java.util.Hashtable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class p {
    protected Enumeration a;
    protected Hashtable a = new Hashtable(5);
    protected Enumeration b;

    public int a() {
        int n2 = this.a.size();
        this.a = this.a.elements();
        this.b = this.a.keys();
        return n2;
    }

    public Object a() {
        return this.a.nextElement();
    }

    public Object a(int n2) {
        return this.a.get(new Integer(n2));
    }

    public void a() {
        this.a.clear();
    }

    public void a(int n2) {
        this.a.remove(new Integer(n2));
    }

    public void a(int n2, Object object) {
        this.a.put(new Integer(n2), object);
    }
}

