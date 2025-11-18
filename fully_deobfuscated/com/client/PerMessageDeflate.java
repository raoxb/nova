/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIIlIlIlll1.llllIIIIll1
 * 反混淆: com.client.PerMessageDeflate
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIIlIlIlll1 → com.client
 * ✓ 类名重命名: llllIIIIll1 → PerMessageDeflate
 * ✓ 字符串解密: 3 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.client;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.Formatter;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/llllIIIIll1.class */
public class PerMessageDeflate {
    public static void decrypt(AutoCloseable... autoCloseableArr) {
        if (autoCloseableArr == null || autoCloseableArr.length <= 0) {
            return;
        }
        for (AutoCloseable autoCloseable : autoCloseableArr) {
            if (autoCloseable != null) {
                try {
                    autoCloseable.close();
                } catch (Exception e) {
                    Log.e(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{-24, -5, 39, 23, -94, -114, Byte.MIN_VALUE, -24, -62, -8}, new byte[]{-85, -108, 74, 122, -51, -32, -43, -100}), IlIlllIIlI1.IllIIlIIII1."close stream occur error: " + e.getMessage());
                }
            }
        }
    }

    public static String decrypt(byte[] byteArray, boolean result) {
        String llllIIIIll12;
        if (byteArray == null) {
            return null;
        }
        if (byteArray.length == 0) {
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
        Formatter formatter = new Formatter();
        if (result) {
            llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1."%02X";
        } else {
            llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1."%02x";
        }
        for (byte b : byteArray) {
            formatter.format(llllIIIIll12, Byte.valueOf(b));
        }
        return formatter.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.BufferedWriter, java.io.Writer] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.AutoCloseable[]] */
    public static String decrypt(String message, String logMessage, String str3) throws IOException {
        if (TextUtils.isEmpty(message)) {
            return null;
        }
        File file = new File(logMessage);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        File file2 = new File(file, str3);
        if (file2.exists() && file2.isFile()) {
            file2.delete();
        }
        file2.createNewFile();
        AutoCloseable autoCloseable = null;
        ?? r0 = 0;
        BufferedReader bufferedReader = null;
        try {
            r0 = new BufferedWriter(new FileWriter(file2));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new StringReader(message));
                while (true) {
                    r0 = bufferedReader2;
                    try {
                        String readLine = r0.readLine();
                        if (readLine != null) {
                            r0.write(readLine);
                        } else {
                            r0 = str3;
                            r0.flush();
                            decrypt(new AutoCloseable[]{r0, bufferedReader2});
                            return r0;
                        }
                    } catch (Throwable th) {
                        bufferedReader = bufferedReader2;
                        autoCloseable = th;
                        decrypt(autoCloseable, bufferedReader);
                        throw r0;
                    }
                }
            } catch (Throwable th2) {
                autoCloseable = th2;
            }
        } catch (Throwable unused) {
        }
    }
}
