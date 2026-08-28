import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;
import com.sun.xml.internal.ws.org.objectweb.asm.ClassReader;
import com.sun.xml.internal.ws.org.objectweb.asm.ClassWriter;
import com.sun.xml.internal.ws.org.objectweb.asm.Label;
import com.sun.xml.internal.ws.org.objectweb.asm.MethodAdapter;
import com.sun.xml.internal.ws.org.objectweb.asm.MethodVisitor;
import com.sun.xml.internal.ws.org.objectweb.asm.Opcodes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public final class PatchAutoPopup {
    private static boolean injectedAd;
    private static boolean injectedAcPaint;
    private static boolean injectedAcPointerReleased;
    private static boolean injectedAcPointerPressed;
    private static boolean injectedAcKeyPressed;
    private static boolean injectedZ;

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            throw new IllegalArgumentException("Usage: PatchAutoPopup <input.jar> <output.jar> <autoMenu.class>");
        }
        File input = new File(args[0]);
        File output = new File(args[1]);
        File autoMenuClass = new File(args[2]);

        ZipFile source = new ZipFile(input);
        ZipOutputStream target = new ZipOutputStream(new FileOutputStream(output));
        try {
            Enumeration entries = source.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                String name = entry.getName();

                if ("a/AutoMenu.class".equals(name) || "a/MCT.class".equals(name)) {
                    continue;
                }

                ZipEntry copied = new ZipEntry(name);
                copied.setTime(entry.getTime());
                target.putNextEntry(copied);
                InputStream data = source.getInputStream(entry);
                try {
                    if ("a/ad.class".equals(name)) {
                        byte[] original = readAll(data);
                        target.write(patchAd(original));
                    } else if ("a/ac.class".equals(name)) {
                        byte[] original = readAll(data);
                        target.write(patchAc(original));
                    } else if ("a/z.class".equals(name)) {
                        byte[] original = readAll(data);
                        target.write(patchZ(original));
                    } else {
                        copy(data, target);
                    }
                } finally {
                    data.close();
                    target.closeEntry();
                }
            }

            // Add AutoMenu.class
            ZipEntry menuEntry = new ZipEntry("a/AutoMenu.class");
            target.putNextEntry(menuEntry);
            FileInputStream menuIn = new FileInputStream(autoMenuClass);
            try {
                copy(menuIn, target);
            } finally {
                menuIn.close();
                target.closeEntry();
            }

            // Add generated MCT.class
            ZipEntry mctEntry = new ZipEntry("a/MCT.class");
            target.putNextEntry(mctEntry);
            target.write(generateMCTClass());
            target.closeEntry();

        } finally {
            source.close();
            target.close();
        }

        if (!injectedAd) {
            throw new IllegalStateException("Could not patch in-game chat send in a/ad.class");
        }
        if (!injectedAcPaint) {
            throw new IllegalStateException("Could not patch canvas paint in a/ac.class");
        }
        System.out.println("Patch applied successfully!");
        System.out.println(" - a/ad.class chat send injected: " + injectedAd);
        System.out.println(" - a/ac.class paint overlay injected: " + injectedAcPaint);
        System.out.println(" - a/ac.class pointerReleased injected: " + injectedAcPointerReleased);
        System.out.println(" - a/ac.class pointerPressed injected: " + injectedAcPointerPressed);
        System.out.println(" - a/ac.class keyPressed injected: " + injectedAcKeyPressed);
        System.out.println(" - a/z.class server message hook injected: " + injectedZ);
        System.out.println(" - a/MCT.class bytecode generated and injected.");
    }

    private static byte[] generateMCTClass() {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cw.visit(Opcodes.V1_6, Opcodes.ACC_PUBLIC, "a/MCT", null, "java/lang/Object", null);

        // Constructor <init>()
        MethodVisitor init = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        init.visitCode();
        init.visitVarInsn(Opcodes.ALOAD, 0);
        init.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        init.visitInsn(Opcodes.RETURN);
        init.visitMaxs(1, 1);
        init.visitEnd();

        // 1. public static void tele()
        MethodVisitor mvTele = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "tele", "()V", null, null);
        mvTele.visitCode();
        Label tStart = new Label();
        Label tEnd = new Label();
        Label tHandler = new Label();
        mvTele.visitTryCatchBlock(tStart, tEnd, tHandler, "java/lang/Throwable");
        mvTele.visitLabel(tStart);
        mvTele.visitFieldInsn(Opcodes.GETSTATIC, "a/u", "a", "La/bb;");
        mvTele.visitInsn(Opcodes.DUP);
        Label isNullTele = new Label();
        mvTele.visitJumpInsn(Opcodes.IFNULL, isNullTele);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 7);
        mvTele.visitIntInsn(Opcodes.NEWARRAY, Opcodes.T_BYTE);
        mvTele.visitInsn(Opcodes.DUP);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 0);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 4);
        mvTele.visitInsn(Opcodes.BASTORE);
        mvTele.visitInsn(Opcodes.DUP);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 1);
        mvTele.visitIntInsn(Opcodes.BIPUSH, -110);
        mvTele.visitInsn(Opcodes.BASTORE);
        mvTele.visitInsn(Opcodes.DUP);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 2);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 3);
        mvTele.visitInsn(Opcodes.BASTORE);
        mvTele.visitInsn(Opcodes.DUP);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 3);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 0);
        mvTele.visitInsn(Opcodes.BASTORE);
        mvTele.visitInsn(Opcodes.DUP);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 4);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 6);
        mvTele.visitInsn(Opcodes.BASTORE);
        mvTele.visitInsn(Opcodes.DUP);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 5);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 2);
        mvTele.visitInsn(Opcodes.BASTORE);
        mvTele.visitInsn(Opcodes.DUP);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 6);
        mvTele.visitIntInsn(Opcodes.BIPUSH, 1);
        mvTele.visitInsn(Opcodes.BASTORE);
        mvTele.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "a/bb", "b", "([B)V");
        Label endTeleCall = new Label();
        mvTele.visitJumpInsn(Opcodes.GOTO, endTeleCall);
        mvTele.visitLabel(isNullTele);
        mvTele.visitInsn(Opcodes.POP);
        mvTele.visitLabel(endTeleCall);
        mvTele.visitLabel(tEnd);
        Label tFinish = new Label();
        mvTele.visitJumpInsn(Opcodes.GOTO, tFinish);
        mvTele.visitLabel(tHandler);
        mvTele.visitVarInsn(Opcodes.ASTORE, 0);
        mvTele.visitLabel(tFinish);
        mvTele.visitInsn(Opcodes.RETURN);
        mvTele.visitMaxs(4, 1);
        mvTele.visitEnd();

        // 2. public static void moveTo(int x, int y)
        MethodVisitor mvMove = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "moveTo", "(II)V", null, null);
        mvMove.visitCode();
        Label mStart = new Label();
        Label mEnd = new Label();
        Label mHandler = new Label();
        mvMove.visitTryCatchBlock(mStart, mEnd, mHandler, "java/lang/Throwable");
        mvMove.visitLabel(mStart);
        mvMove.visitFieldInsn(Opcodes.GETSTATIC, "a/ay", "a", "La/bl;");
        mvMove.visitInsn(Opcodes.DUP);
        Label isNullMove = new Label();
        mvMove.visitJumpInsn(Opcodes.IFNULL, isNullMove);
        mvMove.visitVarInsn(Opcodes.ILOAD, 0); // x
        mvMove.visitVarInsn(Opcodes.ILOAD, 1); // y
        mvMove.visitInsn(Opcodes.ICONST_1);    // true
        mvMove.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "a/bl", "a", "(IIZ)V");
        Label endMoveCall = new Label();
        mvMove.visitJumpInsn(Opcodes.GOTO, endMoveCall);
        mvMove.visitLabel(isNullMove);
        mvMove.visitInsn(Opcodes.POP);
        mvMove.visitLabel(endMoveCall);
        mvMove.visitLabel(mEnd);
        Label mFinish = new Label();
        mvMove.visitJumpInsn(Opcodes.GOTO, mFinish);
        mvMove.visitLabel(mHandler);
        mvMove.visitVarInsn(Opcodes.ASTORE, 2);
        mvMove.visitLabel(mFinish);
        mvMove.visitInsn(Opcodes.RETURN);
        mvMove.visitMaxs(4, 3);
        mvMove.visitEnd();

        // 3. public static void setAutoFight(boolean enable)
        MethodVisitor mvFight = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "setAutoFight", "(Z)V", null, null);
        mvFight.visitCode();
        Label fStart = new Label();
        Label fEnd = new Label();
        Label fHandler = new Label();
        mvFight.visitTryCatchBlock(fStart, fEnd, fHandler, "java/lang/Throwable");
        mvFight.visitLabel(fStart);
        mvFight.visitMethodInsn(Opcodes.INVOKESTATIC, "a/ap", "a", "()La/ap;");
        mvFight.visitInsn(Opcodes.DUP);
        Label isNullFight = new Label();
        mvFight.visitJumpInsn(Opcodes.IFNULL, isNullFight);
        mvFight.visitVarInsn(Opcodes.ILOAD, 0); // enable
        mvFight.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "a/ap", "c", "(Z)V");
        Label endFightCall = new Label();
        mvFight.visitJumpInsn(Opcodes.GOTO, endFightCall);
        mvFight.visitLabel(isNullFight);
        mvFight.visitInsn(Opcodes.POP);
        mvFight.visitLabel(endFightCall);
        mvFight.visitLabel(fEnd);
        Label fFinish = new Label();
        mvFight.visitJumpInsn(Opcodes.GOTO, fFinish);
        mvFight.visitLabel(fHandler);
        mvFight.visitVarInsn(Opcodes.ASTORE, 1);
        mvFight.visitLabel(fFinish);
        mvFight.visitInsn(Opcodes.RETURN);
        mvFight.visitMaxs(3, 2);
        mvFight.visitEnd();

        cw.visitEnd();
        return cw.toByteArray();
    }

    private static byte[] patchZ(byte[] original) {
        ClassReader reader = new ClassReader(original);
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        reader.accept(new ClassAdapter(writer) {
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor visitor = super.visitMethod(access, name, descriptor, signature, exceptions);

                // Patch: public String a(int) -> descriptor "(I)Ljava/lang/String;"
                if ("a".equals(name) && "(I)Ljava/lang/String;".equals(descriptor)) {
                    return new MethodAdapter(visitor) {
                        public void visitInsn(int opcode) {
                            if (opcode == Opcodes.ARETURN) {
                                super.visitInsn(Opcodes.DUP);
                                super.visitMethodInsn(Opcodes.INVOKESTATIC, "a/AutoMenu", "onServerMessage", "(Ljava/lang/String;)V");
                                injectedZ = true;
                            }
                            super.visitInsn(opcode);
                        }
                    };
                }
                return visitor;
            }
        }, 0);
        return writer.toByteArray();
    }

    private static byte[] patchAd(byte[] original) {
        ClassReader reader = new ClassReader(original);
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        reader.accept(new ClassAdapter(writer) {
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor visitor = super.visitMethod(access, name, descriptor, signature, exceptions);
                if (!"a".equals(name) || !"()V".equals(descriptor)) {
                    return visitor;
                }
                return new MethodAdapter(visitor) {
                    private boolean pendingAload0;

                    private void flushPendingAload0() {
                        if (pendingAload0) {
                            pendingAload0 = false;
                            super.visitVarInsn(Opcodes.ALOAD, 0);
                        }
                    }

                    public void visitInsn(int opcode) {
                        flushPendingAload0();
                        super.visitInsn(opcode);
                    }

                    public void visitIntInsn(int opcode, int operand) {
                        flushPendingAload0();
                        super.visitIntInsn(opcode, operand);
                    }

                    public void visitVarInsn(int opcode, int var) {
                        flushPendingAload0();
                        if (opcode == Opcodes.ALOAD && var == 0 && !injectedAd) {
                            pendingAload0 = true;
                            return;
                        }
                        super.visitVarInsn(opcode, var);
                    }

                    public void visitTypeInsn(int opcode, String type) {
                        flushPendingAload0();
                        super.visitTypeInsn(opcode, type);
                    }

                    public void visitFieldInsn(int opcode, String owner, String fieldName, String fieldDesc) {
                        if (pendingAload0 && opcode == Opcodes.GETFIELD && "a/ad".equals(owner) && "a".equals(fieldName) && "I".equals(fieldDesc) && !injectedAd) {
                            pendingAload0 = false;
                            Label continueNormal = new Label();
                            super.visitVarInsn(Opcodes.ALOAD, 1);
                            super.visitMethodInsn(Opcodes.INVOKESTATIC, "a/AutoMenu", "checkCommand", "(Ljava/lang/String;)Z");
                            super.visitJumpInsn(Opcodes.IFEQ, continueNormal);
                            super.visitInsn(Opcodes.RETURN);
                            super.visitLabel(continueNormal);
                            injectedAd = true;
                            super.visitVarInsn(Opcodes.ALOAD, 0);
                            super.visitFieldInsn(opcode, owner, fieldName, fieldDesc);
                            return;
                        }
                        flushPendingAload0();
                        super.visitFieldInsn(opcode, owner, fieldName, fieldDesc);
                    }

                    public void visitMethodInsn(int opcode, String owner, String methodName, String methodDesc) {
                        flushPendingAload0();
                        super.visitMethodInsn(opcode, owner, methodName, methodDesc);
                    }

                    public void visitJumpInsn(int opcode, Label label) {
                        flushPendingAload0();
                        super.visitJumpInsn(opcode, label);
                    }

                    public void visitLabel(Label label) {
                        flushPendingAload0();
                        super.visitLabel(label);
                    }

                    public void visitLdcInsn(Object cst) {
                        flushPendingAload0();
                        super.visitLdcInsn(cst);
                    }

                    public void visitIincInsn(int var, int increment) {
                        flushPendingAload0();
                        super.visitIincInsn(var, increment);
                    }

                    public void visitTableSwitchInsn(int min, int max, Label dflt, Label[] labels) {
                        flushPendingAload0();
                        super.visitTableSwitchInsn(min, max, dflt, labels);
                    }

                    public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {
                        flushPendingAload0();
                        super.visitLookupSwitchInsn(dflt, keys, labels);
                    }

                    public void visitMultiANewArrayInsn(String desc, int dims) {
                        flushPendingAload0();
                        super.visitMultiANewArrayInsn(desc, dims);
                    }

                    public void visitEnd() {
                        flushPendingAload0();
                        super.visitEnd();
                    }
                };
            }
        }, 0);
        return writer.toByteArray();
    }

    private static byte[] patchAc(byte[] original) {
        ClassReader reader = new ClassReader(original);
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        reader.accept(new ClassAdapter(writer) {
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor visitor = super.visitMethod(access, name, descriptor, signature, exceptions);

                // Patch paint: public void a(Graphics)
                if ("a".equals(name) && "(Ljavax/microedition/lcdui/Graphics;)V".equals(descriptor)) {
                    return new MethodAdapter(visitor) {
                        public void visitInsn(int opcode) {
                            if (opcode == Opcodes.RETURN) {
                                super.visitVarInsn(Opcodes.ALOAD, 1);
                                super.visitMethodInsn(Opcodes.INVOKESTATIC, "a/AutoMenu", "paint", "(Ljavax/microedition/lcdui/Graphics;)V");
                                injectedAcPaint = true;
                            }
                            super.visitInsn(opcode);
                        }
                    };
                }

                // Patch pointerReleased(int, int)
                if ("pointerReleased".equals(name) && "(II)V".equals(descriptor)) {
                    return new MethodAdapter(visitor) {
                        public void visitCode() {
                            super.visitCode();
                            Label continueLabel = new Label();
                            super.visitVarInsn(Opcodes.ILOAD, 1);
                            super.visitVarInsn(Opcodes.ILOAD, 2);
                            super.visitMethodInsn(Opcodes.INVOKESTATIC, "a/AutoMenu", "pointerReleased", "(II)Z");
                            super.visitJumpInsn(Opcodes.IFEQ, continueLabel);
                            super.visitInsn(Opcodes.RETURN);
                            super.visitLabel(continueLabel);
                            injectedAcPointerReleased = true;
                        }
                    };
                }

                // Patch pointerPressed(int, int)
                if ("pointerPressed".equals(name) && "(II)V".equals(descriptor)) {
                    return new MethodAdapter(visitor) {
                        public void visitCode() {
                            super.visitCode();
                            Label continueLabel = new Label();
                            super.visitVarInsn(Opcodes.ILOAD, 1);
                            super.visitVarInsn(Opcodes.ILOAD, 2);
                            super.visitMethodInsn(Opcodes.INVOKESTATIC, "a/AutoMenu", "pointerPressed", "(II)Z");
                            super.visitJumpInsn(Opcodes.IFEQ, continueLabel);
                            super.visitInsn(Opcodes.RETURN);
                            super.visitLabel(continueLabel);
                            injectedAcPointerPressed = true;
                        }
                    };
                }

                // Patch leyPressed(int)
                if ("leyPressed".equals(name) && "(I)V".equals(descriptor)) {
                    return new MethodAdapter(visitor) {
                        public void visitCode() {
                            super.visitCode();
                            Label continueLabel = new Label();
                            super.visitVarInsn(Opcodes.ILOAD, 1);
                            super.visitMethodInsn(Opcodes.INVOKESTATIC, "a/AutoMenu", "keyPressed", "(I)Z");
                            super.visitJumpInsn(Opcodes.IFEQ, continueLabel);
                            super.visitInsn(Opcodes.RETURN);
                            super.visitLabel(continueLabel);
                            injectedAcKeyPressed = true;
                        }
                    };
                }

                return visitor;
            }
        }, 0);
        return writer.toByteArray();
    }

    private static byte[] readAll(InputStream input) throws IOException {
        java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
        copy(input, output);
        return output.toByteArray();
    }

    private static void copy(InputStream input, java.io.OutputStream output) throws IOException {
        byte[] buffer = new byte[4096];
        int count;
        while ((count = input.read(buffer)) != -1) {
            output.write(buffer, 0, count);
        }
    }
}
