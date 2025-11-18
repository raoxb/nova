/**
 * 完全反混淆的Java类
 *
 * 原始: IlIllll1.IllIIlIIII1
 * 反混淆: IlIllll1.VirtualDisplayCapture
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIllll1 → IlIllll1
 * ✓ 类名重命名: IllIIlIIII1 → VirtualDisplayCapture
 * ✓ 字符串解密: 2 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIllll1;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import c13.nim5.ez8.h5_proto.Log;

/* loaded from: classes.jar:IlIllll1/IllIIlIIII1.class */
public class VirtualDisplayCapture extends ContextWrapper {

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String f279lIIIIlllllIlll1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{-73, 42, 85, -49, -17, 54, -122, 51, -100, 26, 73, -2, -31, 40, -126, 51, -106}, new byte[]{-28, 110, 30, -116, Byte.MIN_VALUE, 88, -14, 86});

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final llllIllIl1 f280llllIIIIll1;

    public isEnabled(Context context) {
        super(context);
        this.f280llllIIIIll1 = new getWebViewProvider(context.getPackageManager());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public String getPackageName() {
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (llllIIIIll1.getClassLoader(stackTraceElement)) {
                    String message = f279lIIIIlllllIlll1;
                    StringBuilder sb = new StringBuilder();
                    byte[] byteArray = new byte[]{-34, -65, -21, 46, -1, -118, 19, -71, -35, -79, -29, 32, -111, -101, 31, -65, -106, -71, -22, 51, -80, -111, 23, -66, -106, -74, -21, 55, -1};
                    byte[] keyArray = new byte[]{-74, -48, -124, 69, -33, -6, 114, -38};
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    StringBuilder append = sb.append(lllliiiill1.decrypt(byteArray, keyArray)).append(stackTraceElement.getClassName());
                    byte[] encryptedData = new byte[]{-39};
                    byte[] decryptionKey = new byte[]{-9, 5, 80, 59, 36, 5, 35, 60};
                    lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, message, append.append(lllliiiill1.decrypt(encryptedData, decryptionKey)).append(stackTraceElement.getMethodName()).toString());
                    return llllIIIIll1.f285llllIllIl1;
                }
            }
        } catch (Exception unused) {
        }
        return decrypt().getPackageName();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public PackageManager getPackageManager() {
        PackageManager packageManager = decrypt().getPackageManager();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (llllIIIIll1.decrypt(stackTraceElement)) {
                String message = f279lIIIIlllllIlll1;
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, message, "hook packageName 2 invoked for " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName());
                return this.f280llllIIIIll1;
            }
        }
        return packageManager;
    }

    public final Context decrypt() {
        Context baseContext = getBaseContext();
        Context context = baseContext;
        if (baseContext instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }
}
