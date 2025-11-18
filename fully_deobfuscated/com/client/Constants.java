/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIIlIlIlll1.lIIIIlllllIlll1
 * 反混淆: com.client.Constants
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIIlIlIlll1 → com.client
 * ✓ 类名重命名: lIIIIlllllIlll1 → Constants
 * ✓ 字符串解密: 4 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.client;

import android.text.TextUtils;
import c13.nim5.ez8.h5_proto.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/lIIIIlllllIlll1.class */
public class Constants {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f154llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String f155lIIIIlllllIlll1;

    public static byte[] decrypt(byte[] byteArray) throws NoSuchAlgorithmException {
        if (byteArray == null || byteArray.length == 0) {
            return null;
        }
        return MessageDigest.getInstance(f154llllIIIIll1).digest(byteArray);
    }

    public static byte[] getClassLoader(byte[] byteArray, byte[] keyArray) throws GeneralSecurityException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyArray, f155lIIIIlllllIlll1);
        Cipher cipher = Cipher.getInstance(IlIlllIIlI1.IllIIlIIII1."AES/ECB/PKCS5Padding");
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(byteArray);
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f154llllIIIIll1 = "MD5";
        f155lIIIIlllllIlll1 = "AES";
    }

    public static byte[] decrypt(byte[] byteArray, byte[] keyArray) throws GeneralSecurityException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyArray, f155lIIIIlllllIlll1);
        Cipher cipher = Cipher.getInstance(IlIlllIIlI1.IllIIlIIII1."AES/ECB/PKCS5Padding");
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(byteArray);
    }

    public static void decrypt(InputStream inputStream, OutputStream outputStream, byte[] byteArray, String message) throws GeneralSecurityException, IOException {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(byteArray, f155lIIIIlllllIlll1);
            byte[] keyArray = new byte[]{-1, 79, 20, -103, -100, 46, -27, 62, -18, 65, 4, -27, -20, 61, -58, 117, -38, 99, 41, -47};
            byte[] encryptedData = new byte[]{-66, 10, 71, -74, -39, 109, -89, 17};
            Cipher cipher = Cipher.getInstance(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(keyArray, encryptedData));
            cipher.init(2, secretKeySpec);
            MessageDigest messageDigest = MessageDigest.getInstance(f154llllIIIIll1);
            byte[] decryptionKey = new byte[4096];
            while (true) {
                int read = inputStream.read(decryptionKey);
                if (read <= 0) {
                    break;
                }
                byte[] update = cipher.update(decryptionKey, 0, read);
                if (!TextUtils.isEmpty(message)) {
                    messageDigest.update(update);
                }
                outputStream.write(update);
            }
            byte[] doFinal = cipher.doFinal();
            outputStream.write(doFinal);
            outputStream.flush();
            if (!TextUtils.isEmpty(message)) {
                String llllIIIIll12 = llllIIIIll1.decrypt(messageDigest.digest(doFinal), false);
                if (!llllIIIIll12.equals(message)) {
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr5 = new byte[]{65, 78, -60, 1, 38, -123};
                    byte[] bArr6 = new byte[]{26, 60, -91, 118, 123, -65, 71, 36};
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    StringBuilder append = sb.append(lllliiiill1.decrypt(bArr5, bArr6)).append(message);
                    byte[] bArr7 = new byte[]{-114, -120, -97, 34, 102, -124, 101};
                    byte[] bArr8 = new byte[]{-82, -45, -14, 70, 83, -39, 95, -6};
                    lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.DEBUG, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, append.append(lllliiiill1.decrypt(bArr7, bArr8)).append(llllIIIIll12).toString());
                }
            }
            llllIIIIll1.decrypt(inputStream, outputStream);
        } catch (Throwable th) {
            llllIIIIll1.decrypt(inputStream, outputStream);
            throw th;
        }
    }
}
