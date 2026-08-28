import com.sun.xml.internal.ws.org.objectweb.asm.ClassAdapter;
import com.sun.xml.internal.ws.org.objectweb.asm.ClassReader;
import com.sun.xml.internal.ws.org.objectweb.asm.ClassVisitor;
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

/** Preserves the original text-entry UI while adding the local .auto command. */
public final class PatchAutoCommand {
    private static boolean injected;

    public static void main(String[] args) throws Exception {
        if (args.length != 2) throw new IllegalArgumentException("Usage: PatchAutoCommand <input.jar> <output.jar>");
        File input = new File(args[0]);
        File output = new File(args[1]);
        ZipFile source = new ZipFile(input);
        ZipOutputStream target = new ZipOutputStream(new FileOutputStream(output));
        try {
            Enumeration entries = source.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = (ZipEntry)entries.nextElement();
                ZipEntry copied = new ZipEntry(entry.getName());
                copied.setTime(entry.getTime());
                target.putNextEntry(copied);
                InputStream data = source.getInputStream(entry);
                try {
                    if ("a/bn.class".equals(entry.getName())) {
                        byte[] original = readAll(data);
                        target.write(patch(original));
                    } else {
                        copy(data, target);
                    }
                } finally {
                    data.close();
                    target.closeEntry();
                }
            }
        } finally {
            source.close();
            target.close();
        }
        if (!injected) throw new IllegalStateException("Could not find the chat text callback in a/bn.class");
    }

    private static byte[] patch(byte[] original) {
        ClassReader reader = new ClassReader(original);
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        reader.accept(new ClassAdapter(writer) {
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor visitor = super.visitMethod(access, name, descriptor, signature, exceptions);
                if (!"commandAction".equals(name) || !"(Ljavax/microedition/lcdui/Command;Ljavax/microedition/lcdui/Displayable;)V".equals(descriptor)) {
                    return visitor;
                }
                return new MethodAdapter(visitor) {
                    private boolean awaitingTextStore;

                    public void visitMethodInsn(int opcode, String owner, String method, String desc) {
                        super.visitMethodInsn(opcode, owner, method, desc);
                        awaitingTextStore = opcode == Opcodes.INVOKEVIRTUAL
                            && "javax/microedition/lcdui/TextField".equals(owner)
                            && "getString".equals(method)
                            && "()Ljava/lang/String;".equals(desc);
                    }

                    public void visitVarInsn(int opcode, int var) {
                        super.visitVarInsn(opcode, var);
                        if (awaitingTextStore && opcode == Opcodes.ASTORE && var == 3 && !injected) {
                            Label continueNormalChat = new Label();
                            super.visitVarInsn(Opcodes.ALOAD, 3);
                            super.visitMethodInsn(Opcodes.INVOKESTATIC, "a/AutoMenu", "openIfCommand", "(Ljava/lang/String;)Z");
                            super.visitJumpInsn(Opcodes.IFEQ, continueNormalChat);
                            super.visitInsn(Opcodes.RETURN);
                            super.visitLabel(continueNormalChat);
                            injected = true;
                        }
                        awaitingTextStore = false;
                    }
                };
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
        while ((count = input.read(buffer)) != -1) output.write(buffer, 0, count);
    }
}
