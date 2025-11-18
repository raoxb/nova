/**
 * 反混淆的Java类
 * 原始包名: IlIllll1
 * 原始类名: IllIIlIIII1
 * 反混淆后: com.obfuscated.unknown.IlIllll1.StringDecryptor
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.IlIllll1;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import c13.nim5.ez8.h5_proto.Log;

/* loaded from: classes.jar:IlIllll1/IllIIlIIII1.class */
public class StringDecryptor extends ContextWrapper {

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String constants = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-73, 42, 85, -49, -17, 54, -122, 51, -100, 26, 73, -2, -31, 40, -126, 51, -106}, new byte[]{-28, 110, 30, -116, Byte.MIN_VALUE, 88, -14, 86});

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final llllIllIl1 helper;

    public IllIIlIIII1(Context context) {
        super(context);
        this.helper = new llllIllIl1(context.getPackageManager());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (llllIIIIll1.lIIIIlllllIlll1(stackTraceElement)) {
                    String str = constants;
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr = new byte[29];
                    bArr[0] = -34;
                    bArr[1] = -65;
                    bArr[2] = -21;
                    bArr[3] = 46;
                    bArr[4] = -1;
                    bArr[5] = -118;
                    bArr[6] = 19;
                    bArr[7] = -71;
                    bArr[8] = -35;
                    bArr[9] = -79;
                    bArr[10] = -29;
                    bArr[11] = 32;
                    bArr[12] = -111;
                    bArr[13] = -101;
                    bArr[14] = 31;
                    bArr[15] = -65;
                    bArr[16] = -106;
                    bArr[17] = -71;
                    bArr[18] = -22;
                    bArr[19] = 51;
                    bArr[20] = -80;
                    bArr[21] = -111;
                    bArr[22] = 23;
                    bArr[23] = -66;
                    bArr[24] = -106;
                    bArr[25] = -74;
                    bArr[26] = -21;
                    bArr[27] = 55;
                    bArr[28] = -1;
                    byte[] bArr2 = new byte[8];
                    bArr2[0] = -74;
                    bArr2[1] = -48;
                    bArr2[2] = -124;
                    bArr2[3] = 69;
                    bArr2[4] = -33;
                    bArr2[5] = -6;
                    bArr2[6] = 114;
                    bArr2[7] = -38;
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    StringBuilder append = sb.append(lllliiiill1.llllIIIIll1(bArr, bArr2)).append(stackTraceElement.getClassName());
                    byte[] bArr3 = new byte[1];
                    bArr3[0] = -39;
                    byte[] bArr4 = new byte[8];
                    bArr4[0] = -9;
                    bArr4[1] = 5;
                    bArr4[2] = 80;
                    bArr4[3] = 59;
                    bArr4[4] = 36;
                    bArr4[5] = 5;
                    bArr4[6] = 35;
                    bArr4[7] = 60;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, str, append.append(lllliiiill1.llllIIIIll1(bArr3, bArr4)).append(stackTraceElement.getMethodName()).toString());
                    return llllIIIIll1.f285llllIllIl1;
                }
            }
        } catch (Exception unused) {
        }
        return llllIIIIll1().getPackageName();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public PackageManager getPackageManager() {
        PackageManager packageManager = llllIIIIll1().getPackageManager();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (llllIIIIll1.llllIIIIll1(stackTraceElement)) {
                String str = constants;
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, str, lllliiiill1.llllIIIIll1(new byte[]{-65, 28, -84, 100, 14, 55, 43, 93, -68, 18, -92, 106, 96, 38, 39, 91, -9, 65, -29, 102, 64, 49, 37, 85, -78, 23, -29, 105, 65, 53, 106}, new byte[]{-41, 115, -61, 15, 46, 71, 74, 62}) + stackTraceElement.getClassName() + lllliiiill1.llllIIIIll1(new byte[]{-76}, new byte[]{-102, 97, -26, 77, 112, 45, 94, 8}) + stackTraceElement.getMethodName());
                return this.helper;
            }
        }
        return packageManager;
    }

    public final Context llllIIIIll1() {
        Context baseContext = getBaseContext();
        Context context = baseContext;
        if (baseContext instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }
}
