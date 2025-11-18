/**
 * 深度反混淆的Java类
 * 原始类: IlIlllIIlI1.lIIIIlllllIlll1
 *
 * 反混淆处理:
 * - 解密字符串常量
 * - 推断方法语义化名称
 * - 简化代码结构
 * - 添加功能注释
 */

package IlIlllIIlI1;

import android.annotation.SuppressLint;
import android.content.Context;
import c13.nim5.ez8.h5_proto.Atom;
import c13.nim5.ez8.h5_proto.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.jar:IlIlllIIlI1/lIIIIlllllIlll1.class */
public class lIIIIlllllIlll1 {

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static String f243IllIIlIIII1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final String f241lIIIIlllllIlll1 = "dllpdg_debug";

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static llllIllIl1 f240llllIIIIll1 = new llllIllIl1();

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static int f242llllIllIl1 = -1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static String f244IlIlllIIlI1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public static String f245IlIllIlllIllI1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;

    /* renamed from: IlIlllIIlI1.lIIIIlllllIlll1$lIIIIlllllIlll1, reason: collision with other inner class name */
    /* loaded from: classes.jar:IlIlllIIlI1/lIIIIlllllIlll1$lIIIIlllllIlll1.class */
    public class RunnableC0008lIIIIlllllIlll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ Runnable f246llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f247lIIIIlllllIlll1;

        public RunnableC0008lIIIIlllllIlll1(Runnable runnable, CountDownLatch countDownLatch) {
            this.f246llllIIIIll1 = runnable;
            this.f247lIIIIlllllIlll1 = countDownLatch;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x011a -> B:3:0x000a). Please report as a decompilation issue!!! */
        @Override // java.lang.Runnable
        public void run() {
            RunnableC0008lIIIIlllllIlll1 runnableC0008lIIIIlllllIlll1;
            try {
                runnableC0008lIIIIlllllIlll1 = this;
                runnableC0008lIIIIlllllIlll1.f246llllIIIIll1.run();
            } catch (Throwable th) {
                try {
                    runnableC0008lIIIIlllllIlll1 = this;
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr = new byte[]{53, 29, 39, 91, 36, -114, 100, -74, 47, 26, 44, 117, 46, -5, 104, -112, 53, 7, 59, 52, 50, -31, 45};
                    byte[] bArr2 = new byte[]{71, 104, 73, 20, 74, -37, 13, -30};
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, sb.append(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2)).append(th).toString());
                } catch (Throwable th2) {
                    this.f247lIIIIlllllIlll1.countDown();
                    throw th2;
                }
            }
            runnableC0008lIIIIlllllIlll1.f247lIIIIlllllIlll1.countDown();
        }
    }

    /* loaded from: classes.jar:IlIlllIIlI1/lIIIIlllllIlll1$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ Runnable f248llllIIIIll1;

        public method_llllIIIIll1(Runnable runnable) {
            this.f248llllIIIIll1 = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f248llllIIIIll1.run();
            } catch (Throwable th) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-14, -87, -24, 20, 0, 48, -97, -37, -24, -82, -29, 58, 10, 69, -109, -3, -14, -77, -12, 123, 22, 95, -42}, new byte[]{Byte.MIN_VALUE, -36, -122, 91, 110, 101, -10, -113}) + th);
            }
        }
    }

    public static String method_llllllIlIIIlll1() {
        return f243IllIIlIIII1;
    }

    public static llllIllIl1 method_IlIllIlllIllI1() {
        return f240llllIIIIll1;
    }

    public static String method_llllIIIIll1() {
        return f240llllIIIIll1.llllIllIl1().isEmpty() ? f243IllIIlIIII1 : f243IllIIlIIII1 + "_" + f240llllIIIIll1.llllIllIl1();
    }

    public static String method_IlIlllIIlI1() {
        return f244IlIlllIIlI1;
    }

    public static String method_IllIIlIIII1() {
        return llllllIlIIIlll1.llllIIIIll1.llllIIIIll1().getDeviceId();
    }

    public static Atom method_lIIIIlllllIlll1() {
        return llllllIlIIIlll1.llllIIIIll1.llllIIIIll1();
    }

    public static boolean isIliliiliii1() {
        return f240llllIIIIll1.lIllIIIlIl1();
    }

    public static Context method_llllIllIl1() {
        return f240llllIIIIll1.IllIIlIIII1();
    }

    public static void method_lIIIIlllllIlll1(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f240llllIIIIll1.f269lIllIIIlIl1.post(new RunnableC0008lIIIIlllllIlll1(runnable, countDownLatch));
        try {
            countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public static void method_llllIIIIll1(String str) {
        f244IlIlllIIlI1 = str;
    }

    public static void method_llllIIIIll1(llllIllIl1 llllillil1) {
        f240llllIIIIll1 = llllillil1;
        f243IllIIlIIII1 = llllillil1.IllIIlIIII1().getPackageName();
    }

    public static void method_llllIIIIll1(Runnable runnable) {
        f240llllIIIIll1.f269lIllIIIlIl1.post(new llllIIIIll1(runnable));
    }
}
