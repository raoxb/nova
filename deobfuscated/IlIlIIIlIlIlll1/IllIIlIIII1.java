/**
 * 反混淆的Java类
 * 原始包名: IlIlIIIlIlIlll1
 * 原始类名: IllIIlIIII1
 * 反混淆后: com.obfuscated.client.StringDecryptor
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.client;

import c13.nim5.ez8.h5_proto.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/IllIIlIIII1.class */
public class StringDecryptor {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.String] */
    public static String lIIIIlllllIlll1(File file) {
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
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill1.llllIIIIll1(new byte[]{-113, 31, -5, 55, -20, 74, 80, -46, -72, 90, -78}, new byte[]{-35, 122, -102, 83, -52, 44, 57, -66}) + file.getAbsolutePath() + lllliiiill1.llllIIIIll1(new byte[]{-49, -107, -95, -18, 4, 19, 117, 22, -36, -107}, new byte[]{-26, -75, -57, -113, 109, Byte.MAX_VALUE, 16, 114}) + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    public static byte[] llllIIIIll1(File file) {
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        byte[] bArr = null;
        byte[] bArr2 = new byte[4096];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                ?? r0 = fileInputStream;
                try {
                    r0 = r0.read(bArr2);
                    if (r0 <= 0) {
                        byte[] bArr3 = bArr;
                        fileInputStream.close();
                        return bArr3;
                    }
                    if (bArr == null) {
                        bArr = Arrays.copyOf(bArr2, (int) r0);
                    } else {
                        byte[] bArr4 = bArr;
                        int length = bArr4.length;
                        byte[] bArr5 = new byte[length + r0];
                        System.arraycopy(bArr4, 0, bArr5, 0, length);
                        System.arraycopy(bArr2, 0, bArr5, length, r0);
                        bArr = bArr5;
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill1.llllIIIIll1(new byte[]{105, -56, 126, 71, -23, -62, 107, -38, 94, -115, 55}, new byte[]{59, -83, 31, 35, -55, -92, 2, -74}) + file.getAbsolutePath() + lllliiiill1.llllIIIIll1(new byte[]{53, 43, -79, -75, -94, 110, -77, 31, 38, 43}, new byte[]{28, 11, -41, -44, -53, 2, -42, 123}) + e.getMessage());
            return null;
        }
    }
}
