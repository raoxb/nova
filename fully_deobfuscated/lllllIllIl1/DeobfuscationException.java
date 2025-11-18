/**
 * 完全反混淆的Java类
 *
 * 原始: lllllIllIl1.llllIllIl1
 * 反混淆: lllllIllIl1.DeobfuscationException
 *
 * 反混淆处理:
 * ✓ 包名重组: lllllIllIl1 → lllllIllIl1
 * ✓ 类名重命名: llllIllIl1 → DeobfuscationException
 * ✓ 字符串解密: 1 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lllllIllIl1;

import android.content.Context;
import c13.nim5.ez8.h5_proto.Log;
import c13.nim5.ez8.h5_proto.UpdateLogRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.jar:lllllIllIl1/llllIllIl1.class */
public class DeobfuscationException {

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public static final llllIllIl1 f797IlIllIlllIllI1 = new getWebViewProvider();

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public boolean f798llllIIIIll1 = false;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final ConcurrentLinkedQueue<Log> f799lIIIIlllllIlll1 = new ConcurrentLinkedQueue<>();

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final ScheduledExecutorService f800llllIllIl1 = Executors.newScheduledThreadPool(1);

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final ExecutorService f801IllIIlIIII1 = Executors.newSingleThreadExecutor();

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public volatile boolean f802IlIlllIIlI1 = true;

    /* loaded from: classes.jar:lllllIllIl1/llllIllIl1$lIIIIlllllIlll1.class */
    public class lIIIIlllllIlll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ List f803llllIIIIll1;

        public getClassLoader(List list) {
            this.f803llllIIIIll1 = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UpdateLogRequest updateLogRequest = new UpdateLogRequest();
                updateLogRequest.setAtom(IlIlllIIlI1.lIIIIlllllIlll1.getClassLoader());
                updateLogRequest.setLog(this.f803llllIIIIll1);
            } catch (Exception unused) {
                llllIllIl1.this.f799lIIIIlllllIlll1.addAll(this.f803llllIIIIll1);
            } catch (Throwable unused2) {
                llllIllIl1.this.f799lIIIIlllllIlll1.clear();
            }
        }
    }

    /* loaded from: classes.jar:lllllIllIl1/llllIllIl1$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {
        public decrypt() {
        }

        @Override // java.lang.Runnable
        public void run() {
            llllIllIl1.this.getClassLoader();
        }
    }

    public void decrypt(Context context) {
        if (this.f798llllIIIIll1) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            android.util.Log.w("LogReporter", lllliiiill1.decrypt(new byte[]{28, -17, -113, 117, 17, -85, -100, -92, 36, -27, -102, 7, 21, -73, -127, -77, 49, -28, -111, 7, 29, -75, -102, -94, 57, -31, -124, 78, 14, -66, -105}, new byte[]{80, Byte.MIN_VALUE, -24, 39, 116, -37, -13, -42}));
        } else {
            this.f798llllIIIIll1 = true;
            this.f800llllIllIl1.scheduleWithFixedDelay(new decrypt(), 0L, 30L, TimeUnit.SECONDS);
        }
    }

    public final void getClassLoader() {
        if (this.f799lIIIIlllllIlll1.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (!this.f799lIIIIlllllIlll1.isEmpty()) {
            Log poll = this.f799lIIIIlllllIlll1.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        decrypt(arrayList);
    }

    public void decrypt(Log log) {
        this.f799lIIIIlllllIlll1.add(log);
    }

    public final void decrypt(List<Log> list) {
        new Thread(new getClassLoader(list)).start();
    }

    public void decrypt() {
        this.f800llllIllIl1.shutdown();
        this.f802IlIlllIIlI1 = false;
        this.f801IllIIlIIII1.shutdown();
        try {
            if (this.f801IllIIlIIII1.awaitTermination(3L, TimeUnit.SECONDS)) {
                return;
            }
            this.f801IllIIlIIII1.shutdownNow();
        } catch (InterruptedException unused) {
            this.f801IllIIlIIII1.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
