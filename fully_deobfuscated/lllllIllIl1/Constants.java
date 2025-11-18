/**
 * 完全反混淆的Java类
 *
 * 原始: lllllIllIl1.lIIIIlllllIlll1
 * 反混淆: lllllIllIl1.Constants
 *
 * 反混淆处理:
 * ✓ 包名重组: lllllIllIl1 → lllllIllIl1
 * ✓ 类名重命名: lIIIIlllllIlll1 → Constants
 * ✓ 字符串解密: 8 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lllllIllIl1;

import android.content.Context;
import android.util.Log;
import c13.nim5.ez8.h5_proto.Event;
import c13.nim5.ez8.h5_proto.UpdateEventRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.jar:lllllIllIl1/lIIIIlllllIlll1.class */
public class Constants {

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public static final lIIIIlllllIlll1 f773llllllIlIIIlll1 = new getClassLoader();

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public File f774llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final ConcurrentLinkedQueue<Event> f775lIIIIlllllIlll1 = new ConcurrentLinkedQueue<>();

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final BlockingQueue<Event> f776llllIllIl1 = new LinkedBlockingQueue();

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final ScheduledExecutorService f777IllIIlIIII1 = Executors.newScheduledThreadPool(1);

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final ExecutorService f778IlIlllIIlI1 = Executors.newSingleThreadExecutor();

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public volatile boolean f779IlIllIlllIllI1 = true;

    /* renamed from: lllllIllIl1.lIIIIlllllIlll1$lIIIIlllllIlll1, reason: collision with other inner class name */
    /* loaded from: classes.jar:lllllIllIl1/lIIIIlllllIlll1$lIIIIlllllIlll1.class */
    public class RunnableC0017lIIIIlllllIlll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ List f780llllIIIIll1;

        public RunnableC0017lIIIIlllllIlll1(List list) {
            this.f780llllIIIIll1 = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                UpdateEventRequest updateEventRequest = new UpdateEventRequest();
                updateEventRequest.setAtom(IlIlllIIlI1.lIIIIlllllIlll1.getClassLoader());
                updateEventRequest.setEvents(this.f780llllIIIIll1);
                lIIIIlllllIlll1.this.decrypt();
            } catch (Exception unused) {
                lIIIIlllllIlll1.this.f775lIIIIlllllIlll1.addAll(this.f780llllIIIIll1);
            } catch (Throwable unused2) {
                lIIIIlllllIlll1.this.f775lIIIIlllllIlll1.clear();
            }
        }
    }

    /* loaded from: classes.jar:lllllIllIl1/lIIIIlllllIlll1$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {
        public decrypt() {
        }

        @Override // java.lang.Runnable
        public void run() {
            lIIIIlllllIlll1.this.getWebViewProvider();
        }
    }

    public void decrypt(Context context) {
        this.f774llllIIIIll1 = new File(context.getFilesDir(), IlIlllIIlI1.IllIIlIIII1."h5core.event");
        this.f777IllIIlIIII1.scheduleWithFixedDelay(new decrypt(), 0L, 10L, TimeUnit.SECONDS);
    }

    public void getClassLoader() {
        this.f777IllIIlIIII1.shutdown();
        this.f779IlIllIlllIllI1 = false;
        this.f778IlIlllIIlI1.shutdown();
        try {
            if (this.f778IlIlllIIlI1.awaitTermination(3L, TimeUnit.SECONDS)) {
                return;
            }
            this.f778IlIlllIIlI1.shutdownNow();
        } catch (InterruptedException unused) {
            this.f778IlIlllIIlI1.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public final void getWebViewProvider() {
        if (this.f775lIIIIlllllIlll1.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (!this.f775lIIIIlllllIlll1.isEmpty()) {
            Event poll = this.f775lIIIIlllllIlll1.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        decrypt(arrayList);
    }

    public final synchronized void decrypt() {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        File file = new File(this.f774llllIIIIll1.getParent(), "events_backup.txt");
        if (this.f774llllIIIIll1.exists() && this.f774llllIIIIll1.renameTo(file)) {
            Log.d("EventReporter", "Log file archived successfully.");
        } else {
            Log.e("EventReporter", "Failed to archive event file.");
        }
    }

    public void decrypt(String message, String logMessage) {
        Event event = new Event();
        event.setName(message);
        event.setDesc(logMessage);
        event.setTimestamp(Long.valueOf(new Date().getTime()));
        this.f775lIIIIlllllIlll1.add(event);
        this.f776llllIllIl1.offer(event);
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Log.d("EventReporter", "Log added to memory queue and write queue");
    }

    public final void decrypt(List<Event> list) {
        new Thread(new RunnableC0017lIIIIlllllIlll1(list)).start();
    }
}
