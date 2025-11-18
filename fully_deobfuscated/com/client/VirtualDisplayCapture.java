/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIIlIlIlll1.IllIIlIIII1
 * 反混淆: com.client.VirtualDisplayCapture
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIIlIlIlll1 → com.client
 * ✓ 类名重命名: IllIIlIIII1 → VirtualDisplayCapture
 * ✓ 字符串解密: 3 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.client;

import c13.nim5.ez8.h5_proto.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/IllIIlIIII1.class */
public class VirtualDisplayCapture {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.String] */
    public static String getClassLoader(File file) {
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                ?? r0 = bufferedReader;
                try {
                    String readLine = r0.readLine();
                    if (readLine == null) {
                        r0 = sb.toString();
                        bufferedReader.close();
                        return r0;
                    }
                    sb.append(readLine).append("\n");
                } finally {
                }
            }
        } catch (IOException e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, "Read file (" + file.getAbsolutePath() + lllliiiill1.decrypt(new byte[]{-49, -107, -95, -18, 4, 19, 117, 22, -36, -107}, new byte[]{-26, -75, -57, -113, 109, Byte.MAX_VALUE, 16, 114}) + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    public static byte[] decrypt(File file) {
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        byte[] byteArray = null;
        byte[] keyArray = new byte[4096];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                ?? r0 = fileInputStream;
                try {
                    r0 = r0.read(keyArray);
                    if (r0 <= 0) {
                        byte[] encryptedData = byteArray;
                        fileInputStream.close();
                        return encryptedData;
                    }
                    if (byteArray == null) {
                        byteArray = Arrays.copyOf(keyArray, (int) r0);
                    } else {
                        byte[] decryptionKey = byteArray;
                        int length = decryptionKey.length;
                        byte[] bArr5 = new byte[length + r0];
                        System.arraycopy(decryptionKey, 0, bArr5, 0, length);
                        System.arraycopy(keyArray, 0, bArr5, length, r0);
                        byteArray = bArr5;
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, "Read file (" + file.getAbsolutePath() + ") failed: " + e.getMessage());
            return null;
        }
    }
}
