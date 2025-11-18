package IlIIIlIlIlIII1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.jar:IlIIIlIlIlIII1/IllIIlIIII1.class */
public class IllIIlIIII1 implements ThreadFactory {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final ThreadFactory f95llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final AtomicInteger f96lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f97llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final boolean f98IllIIlIIII1;

    public IllIIlIIII1(String str) {
        this.f95llllIIIIll1 = Executors.defaultThreadFactory();
        this.f96lIIIIlllllIlll1 = new AtomicInteger(1);
        this.f97llllIllIl1 = str;
        this.f98IllIIlIIII1 = false;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f95llllIIIIll1.newThread(runnable);
        newThread.setDaemon(this.f98IllIIlIIII1);
        newThread.setName(this.f97llllIllIl1 + "-" + this.f96lIIIIlllllIlll1);
        return newThread;
    }

    public IllIIlIIII1(String str, boolean z) {
        this.f95llllIIIIll1 = Executors.defaultThreadFactory();
        this.f96lIIIIlllllIlll1 = new AtomicInteger(1);
        this.f97llllIllIl1 = str;
        this.f98IllIIlIIII1 = z;
    }
}
