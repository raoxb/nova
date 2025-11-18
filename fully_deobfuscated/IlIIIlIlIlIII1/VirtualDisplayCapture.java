/**
 * 完全反混淆的Java类
 *
 * 原始: IlIIIlIlIlIII1.IllIIlIIII1
 * 反混淆: IlIIIlIlIlIII1.VirtualDisplayCapture
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIIIlIlIlIII1 → IlIIIlIlIlIII1
 * ✓ 类名重命名: IllIIlIIII1 → VirtualDisplayCapture
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIIIlIlIlIII1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.jar:IlIIIlIlIlIII1/IllIIlIIII1.class */
public class VirtualDisplayCapture implements ThreadFactory {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final ThreadFactory f95llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final AtomicInteger f96lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f97llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final boolean f98IllIIlIIII1;

    public isEnabled(String message) {
        this.f95llllIIIIll1 = Executors.defaultThreadFactory();
        this.f96lIIIIlllllIlll1 = new AtomicInteger(1);
        this.f97llllIllIl1 = message;
        this.f98IllIIlIIII1 = false;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f95llllIIIIll1.newThread(runnable);
        newThread.setDaemon(this.f98IllIIlIIII1);
        newThread.setName(this.f97llllIllIl1 + "-" + this.f96lIIIIlllllIlll1);
        return newThread;
    }

    public isEnabled(String message, boolean result) {
        this.f95llllIIIIll1 = Executors.defaultThreadFactory();
        this.f96lIIIIlllllIlll1 = new AtomicInteger(1);
        this.f97llllIllIl1 = message;
        this.f98IllIIlIIII1 = result;
    }
}
