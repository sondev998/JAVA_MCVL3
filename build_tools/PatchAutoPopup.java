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
    private static boolean injectedAcSleep;
    private static boolean injectedZ;
    private static boolean injectedAh;
    private static boolean injectedBb;

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
                        File gameGocAd = new File("decomplete/game_goc_raw/a/ad.class");
                        byte[] original;
                        if (gameGocAd.exists()) {
                            FileInputStream fis = new FileInputStream(gameGocAd);
                            original = readAll(fis);
                            fis.close();
                        } else {
                            original = readAll(data);
                        }
                        target.write(patchAd(original));
                    } else if ("a/ac.class".equals(name)) {
                        byte[] original = readAll(data);
                        target.write(patchAc(original));
                    } else if ("a/z.class".equals(name)) {
                        byte[] original = readAll(data);
                        target.write(patchZ(original));
                    } else if ("a/ah.class".equals(name)) {
                        byte[] original = readAll(data);
                        target.write(patchAh(original));
                    } else if ("a/bb.class".equals(name)) {
                        byte[] original = readAll(data);
                        target.write(patchBb(original));
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
        System.out.println(" - a/ac.class speed sleep wrapped: " + injectedAcSleep);
        System.out.println(" - a/z.class server message hook injected: " + injectedZ);
        System.out.println(" - a/ah.class [RECV] packet hook injected: " + injectedAh);
        System.out.println(" - a/bb.class [SEND] packet hook injected: " + injectedBb);
        System.out.println(" - a/MCT.class bytecode generated and injected.");
    }

    private static byte[] generateMCTClass() {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        cw.visit(Opcodes.V1_6, Opcodes.ACC_PUBLIC, "a/MCT", null, "java/lang/Object", null);

        // Constructor <init>()
        MethodVisitor init = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        init.visitCode();
        init.visitVarInsn(Opcodes.ALOAD, 0);
        init.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        init.visitInsn(Opcodes.RETURN);
        init.visitMaxs(1, 1);
        init.visitEnd();

        // 1. public static void tele() - No-op safe stub (prevents sending invalid team leader packet)
        MethodVisitor mvTele = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "tele", "()V", null, null);
        mvTele.visitCode();
        mvTele.visitInsn(Opcodes.RETURN);
        mvTele.visitMaxs(0, 0);
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

        // 4. public static java.util.Vector getEntityList()
        MethodVisitor mvEnt = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getEntityList", "()Ljava/util/Vector;", null, null);
        mvEnt.visitCode();
        mvEnt.visitFieldInsn(Opcodes.GETSTATIC, "a/ay", "k", "Ljava/util/Vector;");
        mvEnt.visitInsn(Opcodes.ARETURN);
        mvEnt.visitMaxs(1, 0);
        mvEnt.visitEnd();

        // 5. public static java.util.Vector getNpcTable()
        MethodVisitor mvNpc = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getNpcTable", "()Ljava/util/Vector;", null, null);
        mvNpc.visitCode();
        mvNpc.visitFieldInsn(Opcodes.GETSTATIC, "a/ay", "h", "Ljava/util/Vector;");
        mvNpc.visitInsn(Opcodes.ARETURN);
        mvNpc.visitMaxs(1, 0);
        mvNpc.visitEnd();

        // 6. public static String getEntityName(Object obj)
        MethodVisitor mvName = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getEntityName", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
        mvName.visitCode();
        Label startName = new Label();
        Label endName = new Label();
        Label handlerName = new Label();
        mvName.visitTryCatchBlock(startName, endName, handlerName, "java/lang/Throwable");
        mvName.visitLabel(startName);
        mvName.visitVarInsn(Opcodes.ALOAD, 0);
        mvName.visitTypeInsn(Opcodes.CHECKCAST, "a/m");
        mvName.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "a/m", "a", "()Ljava/lang/String;");
        mvName.visitLabel(endName);
        mvName.visitInsn(Opcodes.ARETURN);
        mvName.visitLabel(handlerName);
        mvName.visitVarInsn(Opcodes.ASTORE, 1);
        mvName.visitInsn(Opcodes.ACONST_NULL);
        mvName.visitInsn(Opcodes.ARETURN);
        mvName.visitMaxs(1, 2);
        mvName.visitEnd();

        // 7. public static int getEntityX(Object obj)
        MethodVisitor mvX = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getEntityX", "(Ljava/lang/Object;)I", null, null);
        mvX.visitCode();
        Label startX = new Label();
        Label endX = new Label();
        Label handlerX = new Label();
        mvX.visitTryCatchBlock(startX, endX, handlerX, "java/lang/Throwable");
        mvX.visitLabel(startX);
        mvX.visitVarInsn(Opcodes.ALOAD, 0);
        mvX.visitTypeInsn(Opcodes.CHECKCAST, "a/m");
        mvX.visitFieldInsn(Opcodes.GETFIELD, "a/y", "q", "B");
        mvX.visitLabel(endX);
        mvX.visitInsn(Opcodes.IRETURN);
        mvX.visitLabel(handlerX);
        mvX.visitVarInsn(Opcodes.ASTORE, 1);
        mvX.visitInsn(Opcodes.ICONST_0);
        mvX.visitInsn(Opcodes.IRETURN);
        mvX.visitMaxs(1, 2);
        mvX.visitEnd();

        // 8. public static int getEntityY(Object obj)
        MethodVisitor mvY = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getEntityY", "(Ljava/lang/Object;)I", null, null);
        mvY.visitCode();
        Label startY = new Label();
        Label endY = new Label();
        Label handlerY = new Label();
        mvY.visitTryCatchBlock(startY, endY, handlerY, "java/lang/Throwable");
        mvY.visitLabel(startY);
        mvY.visitVarInsn(Opcodes.ALOAD, 0);
        mvY.visitTypeInsn(Opcodes.CHECKCAST, "a/m");
        mvY.visitFieldInsn(Opcodes.GETFIELD, "a/y", "r", "B");
        mvY.visitLabel(endY);
        mvY.visitInsn(Opcodes.IRETURN);
        mvY.visitLabel(handlerY);
        mvY.visitVarInsn(Opcodes.ASTORE, 1);
        mvY.visitInsn(Opcodes.ICONST_0);
        mvY.visitInsn(Opcodes.IRETURN);
        mvY.visitMaxs(1, 2);
        mvY.visitEnd();

        // 9. public static int getEntityId(Object obj)
        MethodVisitor mvId = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getEntityId", "(Ljava/lang/Object;)I", null, null);
        mvId.visitCode();
        Label startId = new Label();
        Label endId = new Label();
        Label handlerId = new Label();
        mvId.visitTryCatchBlock(startId, endId, handlerId, "java/lang/Throwable");
        mvId.visitLabel(startId);
        mvId.visitVarInsn(Opcodes.ALOAD, 0);
        mvId.visitTypeInsn(Opcodes.CHECKCAST, "a/m");
        mvId.visitFieldInsn(Opcodes.GETFIELD, "a/y", "j", "I");
        mvId.visitLabel(endId);
        mvId.visitInsn(Opcodes.IRETURN);
        mvId.visitLabel(handlerId);
        mvId.visitVarInsn(Opcodes.ASTORE, 1);
        mvId.visitInsn(Opcodes.ICONST_0);
        mvId.visitInsn(Opcodes.IRETURN);
        mvId.visitMaxs(1, 2);
        mvId.visitEnd();

        // 10. public static String getAfString(Object obj)
        MethodVisitor mvAf = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getAfString", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
        mvAf.visitCode();
        Label sStart = new Label();
        Label sEnd = new Label();
        Label sHandler = new Label();
        mvAf.visitTryCatchBlock(sStart, sEnd, sHandler, "java/lang/Throwable");
        mvAf.visitLabel(sStart);
        mvAf.visitVarInsn(Opcodes.ALOAD, 0);
        mvAf.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;");
        mvAf.visitLabel(sEnd);
        mvAf.visitInsn(Opcodes.ARETURN);
        mvAf.visitLabel(sHandler);
        mvAf.visitVarInsn(Opcodes.ASTORE, 1);
        mvAf.visitInsn(Opcodes.ACONST_NULL);
        mvAf.visitInsn(Opcodes.ARETURN);
        mvAf.visitMaxs(1, 2);
        mvAf.visitEnd();

        // 11. public static void talkNpc(int npcId)
        MethodVisitor mvTalk = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "talkNpc", "(I)V", null, null);
        mvTalk.visitCode();
        Label tTalkStart = new Label();
        Label tTalkEnd = new Label();
        Label tTalkHandler = new Label();
        mvTalk.visitTryCatchBlock(tTalkStart, tTalkEnd, tTalkHandler, "java/lang/Throwable");
        mvTalk.visitLabel(tTalkStart);
        mvTalk.visitMethodInsn(Opcodes.INVOKESTATIC, "a/z", "a", "()La/z;");
        mvTalk.visitIntInsn(Opcodes.SIPUSH, 1032);
        mvTalk.visitTypeInsn(Opcodes.NEW, "a/t");
        mvTalk.visitInsn(Opcodes.DUP);
        mvTalk.visitIntInsn(Opcodes.BIPUSH, 1);
        mvTalk.visitMethodInsn(Opcodes.INVOKESPECIAL, "a/t", "<init>", "(B)V");
        mvTalk.visitTypeInsn(Opcodes.NEW, "a/an");
        mvTalk.visitInsn(Opcodes.DUP);
        mvTalk.visitVarInsn(Opcodes.ILOAD, 0); // npcId
        mvTalk.visitMethodInsn(Opcodes.INVOKESPECIAL, "a/an", "<init>", "(I)V");
        mvTalk.visitTypeInsn(Opcodes.NEW, "a/an");
        mvTalk.visitInsn(Opcodes.DUP);
        mvTalk.visitInsn(Opcodes.ICONST_0);
        mvTalk.visitMethodInsn(Opcodes.INVOKESPECIAL, "a/an", "<init>", "(I)V");
        mvTalk.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "a/z", "a", "(ILa/af;La/af;La/af;)V");
        mvTalk.visitLabel(tTalkEnd);
        Label tTalkFinish = new Label();
        mvTalk.visitJumpInsn(Opcodes.GOTO, tTalkFinish);
        mvTalk.visitLabel(tTalkHandler);
        mvTalk.visitVarInsn(Opcodes.ASTORE, 1);
        mvTalk.visitLabel(tTalkFinish);
        mvTalk.visitInsn(Opcodes.RETURN);
        mvTalk.visitMaxs(7, 2);
        mvTalk.visitEnd();

        // 12. public static void sendBytes(byte[] data)
        MethodVisitor mvSend = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "sendBytes", "([B)V", null, null);
        mvSend.visitCode();
        Label sSendStart = new Label();
        Label sSendEnd = new Label();
        Label sSendHandler = new Label();
        mvSend.visitTryCatchBlock(sSendStart, sSendEnd, sSendHandler, "java/lang/Throwable");
        mvSend.visitLabel(sSendStart);
        mvSend.visitFieldInsn(Opcodes.GETSTATIC, "a/u", "a", "La/bb;");
        mvSend.visitInsn(Opcodes.DUP);
        Label isNullSend = new Label();
        mvSend.visitJumpInsn(Opcodes.IFNULL, isNullSend);
        mvSend.visitVarInsn(Opcodes.ALOAD, 0);
        mvSend.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "a/bb", "b", "([B)V");
        Label endSendCall = new Label();
        mvSend.visitJumpInsn(Opcodes.GOTO, endSendCall);
        mvSend.visitLabel(isNullSend);
        mvSend.visitInsn(Opcodes.POP);
        mvSend.visitLabel(endSendCall);
        mvSend.visitLabel(sSendEnd);
        Label sSendFinish = new Label();
        mvSend.visitJumpInsn(Opcodes.GOTO, sSendFinish);
        mvSend.visitLabel(sSendHandler);
        mvSend.visitVarInsn(Opcodes.ASTORE, 1);
        mvSend.visitLabel(sSendFinish);
        mvSend.visitInsn(Opcodes.RETURN);
        mvSend.visitMaxs(2, 2);
        mvSend.visitEnd();

        // 13. public static int getMyX()
        MethodVisitor mvMyX = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getMyX", "()I", null, null);
        mvMyX.visitCode();
        Label startMyX = new Label();
        Label endMyX = new Label();
        Label handlerMyX = new Label();
        mvMyX.visitTryCatchBlock(startMyX, endMyX, handlerMyX, "java/lang/Throwable");
        mvMyX.visitLabel(startMyX);
        mvMyX.visitFieldInsn(Opcodes.GETSTATIC, "a/ay", "a", "La/bl;");
        Label isNullMyX = new Label();
        mvMyX.visitJumpInsn(Opcodes.IFNULL, isNullMyX);
        mvMyX.visitFieldInsn(Opcodes.GETSTATIC, "a/ay", "a", "La/bl;");
        mvMyX.visitFieldInsn(Opcodes.GETFIELD, "a/y", "q", "B");
        mvMyX.visitLabel(endMyX);
        mvMyX.visitInsn(Opcodes.IRETURN);
        mvMyX.visitLabel(isNullMyX);
        mvMyX.visitInsn(Opcodes.ICONST_M1);
        mvMyX.visitInsn(Opcodes.IRETURN);
        mvMyX.visitLabel(handlerMyX);
        mvMyX.visitVarInsn(Opcodes.ASTORE, 0);
        mvMyX.visitInsn(Opcodes.ICONST_M1);
        mvMyX.visitInsn(Opcodes.IRETURN);
        mvMyX.visitMaxs(1, 1);
        mvMyX.visitEnd();

        // 14. public static int getMyY()
        MethodVisitor mvMyY = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getMyY", "()I", null, null);
        mvMyY.visitCode();
        Label startMyY = new Label();
        Label endMyY = new Label();
        Label handlerMyY = new Label();
        mvMyY.visitTryCatchBlock(startMyY, endMyY, handlerMyY, "java/lang/Throwable");
        mvMyY.visitLabel(startMyY);
        mvMyY.visitFieldInsn(Opcodes.GETSTATIC, "a/ay", "a", "La/bl;");
        Label isNullMyY = new Label();
        mvMyY.visitJumpInsn(Opcodes.IFNULL, isNullMyY);
        mvMyY.visitFieldInsn(Opcodes.GETSTATIC, "a/ay", "a", "La/bl;");
        mvMyY.visitFieldInsn(Opcodes.GETFIELD, "a/y", "r", "B");
        mvMyY.visitLabel(endMyY);
        mvMyY.visitInsn(Opcodes.IRETURN);
        mvMyY.visitLabel(isNullMyY);
        mvMyY.visitInsn(Opcodes.ICONST_M1);
        mvMyY.visitInsn(Opcodes.IRETURN);
        mvMyY.visitLabel(handlerMyY);
        mvMyY.visitVarInsn(Opcodes.ASTORE, 0);
        mvMyY.visitInsn(Opcodes.ICONST_M1);
        mvMyY.visitInsn(Opcodes.IRETURN);
        mvMyY.visitMaxs(1, 1);
        mvMyY.visitEnd();

        // 15. public static java.util.Vector getBagVector()
        MethodVisitor mvBag = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getBagVector", "()Ljava/util/Vector;", null, null);
        mvBag.visitCode();
        Label startBag = new Label();
        Label endBag = new Label();
        Label handlerBag = new Label();
        mvBag.visitTryCatchBlock(startBag, endBag, handlerBag, "java/lang/Throwable");
        mvBag.visitLabel(startBag);
        mvBag.visitInsn(Opcodes.ICONST_1);
        mvBag.visitInsn(Opcodes.ICONST_M1);
        mvBag.visitMethodInsn(Opcodes.INVOKESTATIC, "a/ay", "a", "(II)Ljava/util/Vector;");
        mvBag.visitLabel(endBag);
        mvBag.visitInsn(Opcodes.ARETURN);
        mvBag.visitLabel(handlerBag);
        mvBag.visitVarInsn(Opcodes.ASTORE, 0);
        mvBag.visitFieldInsn(Opcodes.GETSTATIC, "a/ay", "a", "Ljava/util/Vector;");
        mvBag.visitInsn(Opcodes.ARETURN);
        mvBag.visitMaxs(2, 1);
        mvBag.visitEnd();

        // 16. public static String getItemName(Object obj)
        MethodVisitor mvIname = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getItemName", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
        mvIname.visitCode();
        Label s1 = new Label();
        Label s2 = new Label();
        Label s3 = new Label();
        mvIname.visitTryCatchBlock(s1, s2, s3, "java/lang/Throwable");
        mvIname.visitLabel(s1);
        mvIname.visitVarInsn(Opcodes.ALOAD, 0);
        mvIname.visitTypeInsn(Opcodes.CHECKCAST, "a/bc");
        mvIname.visitFieldInsn(Opcodes.GETFIELD, "a/bc", "a", "Ljava/lang/String;");
        mvIname.visitLabel(s2);
        mvIname.visitInsn(Opcodes.ARETURN);
        mvIname.visitLabel(s3);
        mvIname.visitVarInsn(Opcodes.ASTORE, 1);
        mvIname.visitInsn(Opcodes.ACONST_NULL);
        mvIname.visitInsn(Opcodes.ARETURN);
        mvIname.visitMaxs(1, 2);
        mvIname.visitEnd();

        // 17. public static int getItemId(Object obj)
        MethodVisitor mvIid = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getItemId", "(Ljava/lang/Object;)I", null, null);
        mvIid.visitCode();
        Label id1 = new Label();
        Label id2 = new Label();
        Label id3 = new Label();
        mvIid.visitTryCatchBlock(id1, id2, id3, "java/lang/Throwable");
        mvIid.visitLabel(id1);
        mvIid.visitVarInsn(Opcodes.ALOAD, 0);
        mvIid.visitTypeInsn(Opcodes.CHECKCAST, "a/bc");
        mvIid.visitFieldInsn(Opcodes.GETFIELD, "a/bc", "a", "I");
        mvIid.visitLabel(id2);
        mvIid.visitInsn(Opcodes.IRETURN);
        mvIid.visitLabel(id3);
        mvIid.visitVarInsn(Opcodes.ASTORE, 1);
        mvIid.visitInsn(Opcodes.ICONST_0);
        mvIid.visitInsn(Opcodes.IRETURN);
        mvIid.visitMaxs(1, 2);
        mvIid.visitEnd();

        // 18. public static int getItemCount(Object obj)
        MethodVisitor mvIcnt = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getItemCount", "(Ljava/lang/Object;)I", null, null);
        mvIcnt.visitCode();
        Label c1 = new Label();
        Label c2 = new Label();
        Label c3 = new Label();
        mvIcnt.visitTryCatchBlock(c1, c2, c3, "java/lang/Throwable");
        mvIcnt.visitLabel(c1);
        mvIcnt.visitVarInsn(Opcodes.ALOAD, 0);
        mvIcnt.visitTypeInsn(Opcodes.CHECKCAST, "a/bc");
        mvIcnt.visitFieldInsn(Opcodes.GETFIELD, "a/bc", "a", "S");
        mvIcnt.visitLabel(c2);
        mvIcnt.visitInsn(Opcodes.IRETURN);
        mvIcnt.visitLabel(c3);
        mvIcnt.visitVarInsn(Opcodes.ASTORE, 1);
        mvIcnt.visitInsn(Opcodes.ICONST_1);
        mvIcnt.visitInsn(Opcodes.IRETURN);
        mvIcnt.visitMaxs(1, 2);
        mvIcnt.visitEnd();

        // 19. public static void dropItem(int itemId, int count)
        MethodVisitor mvDrop = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "dropItem", "(II)V", null, null);
        mvDrop.visitCode();
        Label d1 = new Label();
        Label d2 = new Label();
        Label d3 = new Label();
        mvDrop.visitTryCatchBlock(d1, d2, d3, "java/lang/Throwable");
        mvDrop.visitLabel(d1);
        mvDrop.visitMethodInsn(Opcodes.INVOKESTATIC, "a/z", "a", "()La/z;");
        mvDrop.visitIntInsn(Opcodes.SIPUSH, 1009);
        mvDrop.visitTypeInsn(Opcodes.NEW, "a/ba");
        mvDrop.visitInsn(Opcodes.DUP);
        mvDrop.visitInsn(Opcodes.ICONST_3);
        mvDrop.visitMethodInsn(Opcodes.INVOKESPECIAL, "a/ba", "<init>", "(S)V");
        mvDrop.visitTypeInsn(Opcodes.NEW, "a/an");
        mvDrop.visitInsn(Opcodes.DUP);
        mvDrop.visitVarInsn(Opcodes.ILOAD, 0); // itemId
        mvDrop.visitMethodInsn(Opcodes.INVOKESPECIAL, "a/an", "<init>", "(I)V");
        mvDrop.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "a/z", "a", "(ILa/af;La/af;)V");
        mvDrop.visitLabel(d2);
        mvDrop.visitInsn(Opcodes.RETURN);
        mvDrop.visitLabel(d3);
        mvDrop.visitVarInsn(Opcodes.ASTORE, 2);
        mvDrop.visitInsn(Opcodes.RETURN);
        mvDrop.visitMaxs(6, 3);
        mvDrop.visitEnd();
        // 20. public static void openDungeonMenu()
        MethodVisitor mvOdm = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "openDungeonMenu", "()V", null, null);
        mvOdm.visitCode();
        Label odmStart = new Label();
        Label odmEnd = new Label();
        Label odmHandler = new Label();
        mvOdm.visitTryCatchBlock(odmStart, odmEnd, odmHandler, "java/lang/Throwable");
        mvOdm.visitLabel(odmStart);

        // ap.a().a(1) -> opens game menu cleanly
        mvOdm.visitMethodInsn(Opcodes.INVOKESTATIC, "a/ap", "a", "()La/ap;");
        mvOdm.visitInsn(Opcodes.DUP);
        Label isNullAp = new Label();
        mvOdm.visitJumpInsn(Opcodes.IFNULL, isNullAp);
        mvOdm.visitInsn(Opcodes.ICONST_1);
        mvOdm.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "a/ap", "a", "(I)V");
        Label endOdm = new Label();
        mvOdm.visitJumpInsn(Opcodes.GOTO, endOdm);
        mvOdm.visitLabel(isNullAp);
        mvOdm.visitInsn(Opcodes.POP);
        mvOdm.visitLabel(endOdm);
        mvOdm.visitLabel(odmEnd);
        mvOdm.visitInsn(Opcodes.RETURN);
        mvOdm.visitLabel(odmHandler);
        mvOdm.visitVarInsn(Opcodes.ASTORE, 0);
        mvOdm.visitInsn(Opcodes.RETURN);
        mvOdm.visitMaxs(2, 1);
        mvOdm.visitEnd();

        // 21. public static void enterManor(int playerId)
        MethodVisitor mvEm = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "enterManor", "(I)V", null, null);
        mvEm.visitCode();
        Label em1 = new Label();
        Label em2 = new Label();
        Label em3 = new Label();
        mvEm.visitTryCatchBlock(em1, em2, em3, "java/lang/Throwable");
        mvEm.visitLabel(em1);
        mvEm.visitMethodInsn(Opcodes.INVOKESTATIC, "a/z", "a", "()La/z;");
        mvEm.visitIntInsn(Opcodes.SIPUSH, 1312);
        mvEm.visitTypeInsn(Opcodes.NEW, "a/ba");
        mvEm.visitInsn(Opcodes.DUP);
        mvEm.visitIntInsn(Opcodes.BIPUSH, 13);
        mvEm.visitMethodInsn(Opcodes.INVOKESPECIAL, "a/ba", "<init>", "(S)V");
        mvEm.visitTypeInsn(Opcodes.NEW, "a/an");
        mvEm.visitInsn(Opcodes.DUP);
        mvEm.visitVarInsn(Opcodes.ILOAD, 0);
        mvEm.visitMethodInsn(Opcodes.INVOKESPECIAL, "a/an", "<init>", "(I)V");
        mvEm.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "a/z", "a", "(ILa/af;La/af;)V");
        mvEm.visitLabel(em2);
        mvEm.visitInsn(Opcodes.RETURN);
        mvEm.visitLabel(em3);
        mvEm.visitVarInsn(Opcodes.ASTORE, 1);
        mvEm.visitInsn(Opcodes.RETURN);
        mvEm.visitMaxs(6, 2);
        mvEm.visitEnd();

        // 22. public static int getPlayerId()
        MethodVisitor mvGpi = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC, "getPlayerId", "()I", null, null);
        mvGpi.visitCode();
        Label gpi1 = new Label();
        Label gpi2 = new Label();
        Label gpi3 = new Label();
        mvGpi.visitTryCatchBlock(gpi1, gpi2, gpi3, "java/lang/Throwable");
        mvGpi.visitLabel(gpi1);
        mvGpi.visitFieldInsn(Opcodes.GETSTATIC, "a/ay", "a", "La/af;");
        mvGpi.visitFieldInsn(Opcodes.GETFIELD, "a/af", "a", "I");
        mvGpi.visitLabel(gpi2);
        mvGpi.visitInsn(Opcodes.IRETURN);
        mvGpi.visitLabel(gpi3);
        mvGpi.visitVarInsn(Opcodes.ASTORE, 0);
        mvGpi.visitInsn(Opcodes.ICONST_0);
        mvGpi.visitInsn(Opcodes.IRETURN);
        mvGpi.visitMaxs(1, 1);
        mvGpi.visitEnd();

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
                                super.visitMethodInsn(Opcodes.INVOKESTATIC, "a/AutoMenu", "filterServerMessage", "(Ljava/lang/String;)Ljava/lang/String;");
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

    private static byte[] patchAh(byte[] original) {
        ClassReader reader = new ClassReader(original);
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        reader.accept(new ClassAdapter(writer) {
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor visitor = super.visitMethod(access, name, descriptor, signature, exceptions);
                if ("<init>".equals(name) && "(Ljava/io/DataInputStream;)V".equals(descriptor)) {
                    return new MethodAdapter(visitor) {
                        public void visitInsn(int opcode) {
                            if (opcode == Opcodes.RETURN) {
                                super.visitVarInsn(Opcodes.ALOAD, 0); // this (ah)
                                super.visitFieldInsn(Opcodes.GETFIELD, "a/ah", "a", "S"); // short cmd
                                super.visitVarInsn(Opcodes.ALOAD, 0); // this (ah)
                                super.visitFieldInsn(Opcodes.GETFIELD, "a/ah", "a", "La/z;"); // z
                                super.visitFieldInsn(Opcodes.GETFIELD, "a/z", "a", "Ljava/util/Vector;"); // Vector
                                super.visitMethodInsn(Opcodes.INVOKESTATIC, "a/AutoMenu", "logRecvPacket", "(ILjava/util/Vector;)V");
                                injectedAh = true;
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

    private static byte[] patchBb(byte[] original) {
        ClassReader reader = new ClassReader(original);
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        reader.accept(new ClassAdapter(writer) {
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor visitor = super.visitMethod(access, name, descriptor, signature, exceptions);
                if ("b".equals(name) && "([B)V".equals(descriptor)) {
                    return new MethodAdapter(visitor) {
                        public void visitCode() {
                            super.visitCode();
                            super.visitVarInsn(Opcodes.ALOAD, 1); // byte[] byArray
                            super.visitMethodInsn(Opcodes.INVOKESTATIC, "a/AutoMenu", "logSendPacket", "([B)V");
                            injectedBb = true;
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
                        // Loại bỏ lệnh MCT.tele() kích hoạt lỗi khi ấn gửi chat
                        if (opcode == Opcodes.INVOKESTATIC && "a/MCT".equals(owner) && "tele".equals(methodName)) {
                            return;
                        }
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

                // Patch Thread.sleep in main loop
                return new MethodAdapter(visitor) {
                    public void visitMethodInsn(int opcode, String owner, String methodName, String methodDesc) {
                        if (opcode == Opcodes.INVOKESTATIC && "sleep".equals(methodName) && "(J)V".equals(methodDesc)) {
                            super.visitMethodInsn(Opcodes.INVOKESTATIC, "a/AutoMenu", "getModifiedSleep", "(J)J");
                            super.visitMethodInsn(opcode, owner, methodName, methodDesc);
                            injectedAcSleep = true;
                            return;
                        }
                        super.visitMethodInsn(opcode, owner, methodName, methodDesc);
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
        while ((count = input.read(buffer)) != -1) {
            output.write(buffer, 0, count);
        }
    }
}
