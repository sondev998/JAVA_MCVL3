/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connection
 */
package a;

import a.ac;
import a.aj;
import a.bb;
import a.f;
import a.i;
import a.s;
import a.w;
import javax.microedition.io.Connection;
import lib.Thread;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ae
extends aj
implements Runnable {
    private boolean a;
    private Thread b;

    /*
     * Exception decompiling
     */
    private int a(boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 13[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c() {
        Connection connection;
        Connection connection2 = null;
        Connection connection3 = connection = null;
        Connection connection4 = connection2;
        try {
            block7: {
                connection3 = connection;
                connection4 = connection2;
                String string = new String(bb.a);
                connection3 = connection;
                connection4 = connection2;
                connection = ae.a(string);
                if (connection != null) {
                    connection3 = connection;
                    connection4 = connection;
                    i.a = (byte)2;
                } else {
                    connection3 = connection;
                    connection4 = connection;
                    i.a = 1;
                }
                ae.a(connection);
                break block7;
                catch (Exception exception) {
                    Connection connection5 = connection3;
                    i.a = 1;
                    ae.a(connection3);
                }
            }
            bb.f = false;
            return;
        }
        catch (Throwable throwable) {
            ae.a(connection4);
            throw throwable;
        }
    }

    public void a(boolean bl2) {
        this.a = bl2;
        if (this.b == null) {
            this.b = new Thread(this);
            this.b.start();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b() {
        int n2 = this.a(false);
        if (n2 != 200) {
            n2 = this.a(true);
            w.c(0);
        } else {
            w.c(1);
        }
        try {
            CharSequence charSequence;
            ac.a(false, false);
            if (n2 != 200) {
                charSequence = "Hi\u1ec7n kh\u00f4ng c\u00f3 mang, h\u00e3y ki\u1ec3m tra l\u1ea1i!";
            } else if (bb.a != 1) {
                charSequence = new StringBuffer();
                charSequence = ((StringBuffer)charSequence).append("Thi\u1ebft l\u1eadp m\u1ea1ng th\u00e0nh c\u00f4ng, hi\u1ec7n s\u1eed d\u1ee5ng:").append(s.d[351]).toString();
            } else {
                charSequence = new StringBuffer();
                charSequence = ((StringBuffer)charSequence).append("Thi\u1ebft l\u1eadp m\u1ea1ng th\u00e0nh c\u00f4ng, hi\u1ec7n s\u1eed d\u1ee5ng:").append(s.d[352]).toString();
            }
            f.a("", (String)charSequence, 96, 5000L);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        try {
            if (this.a) {
                this.b();
            } else {
                this.c();
            }
            this.b = null;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

