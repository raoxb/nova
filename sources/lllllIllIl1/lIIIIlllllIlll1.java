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
public class lIIIIlllllIlll1 {

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public static final lIIIIlllllIlll1 f773llllllIlIIIlll1 = new lIIIIlllllIlll1();

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
                updateEventRequest.setAtom(IlIlllIIlI1.lIIIIlllllIlll1.lIIIIlllllIlll1());
                updateEventRequest.setEvents(this.f780llllIIIIll1);
                lIIIIlllllIlll1.this.llllIIIIll1();
            } catch (Exception unused) {
                lIIIIlllllIlll1.this.f775lIIIIlllllIlll1.addAll(this.f780llllIIIIll1);
            } catch (Throwable unused2) {
                lIIIIlllllIlll1.this.f775lIIIIlllllIlll1.clear();
            }
        }
    }

    /* loaded from: classes.jar:lllllIllIl1/lIIIIlllllIlll1$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {
        public llllIIIIll1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            lIIIIlllllIlll1.this.llllIllIl1();
        }
    }

    public void llllIIIIll1(Context context) {
        this.f774llllIIIIll1 = new File(context.getFilesDir(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{93, 20, 99, 30, -46, 9, -32, 75, 67, 68, 110, 5}, new byte[]{53, 33, 0, 113, -96, 108, -50, 46}));
        this.f777IllIIlIIII1.scheduleWithFixedDelay(new llllIIIIll1(), 0L, 10L, TimeUnit.SECONDS);
    }

    public void lIIIIlllllIlll1() {
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

    public final void llllIllIl1() {
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
        llllIIIIll1(arrayList);
    }

    public final synchronized void llllIIIIll1() {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        File file = new File(this.f774llllIIIIll1.getParent(), lllliiiill1.llllIIIIll1(new byte[]{25, -31, 42, -23, 31, 55, 19, -2, 29, -12, 36, -14, 27, 106, 56, -28, 8}, new byte[]{124, -105, 79, -121, 107, 68, 76, -100}));
        if (this.f774llllIIIIll1.exists() && this.f774llllIIIIll1.renameTo(file)) {
            Log.d(lllliiiill1.llllIIIIll1(new byte[]{121, -32, -40, -3, -5, -88, -49, 110, 83, -28, -55, -10, -3}, new byte[]{60, -106, -67, -109, -113, -6, -86, 30}), lllliiiill1.llllIIIIll1(new byte[]{-61, 124, 94, 4, 62, -59, 53, -101, -81, 114, 75, 71, 48, -59, 47, -101, -21, 51, 74, 81, 59, -49, 60, -115, -4, 117, 76, 72, 52, -43, 119}, new byte[]{-113, 19, 57, 36, 88, -84, 89, -2}));
        } else {
            Log.e(lllliiiill1.llllIIIIll1(new byte[]{-73, 46, 104, 87, 100, 89, 73, 12, -99, 42, 121, 92, 98}, new byte[]{-14, 88, 13, 57, 16, 11, 44, 124}), lllliiiill1.llllIIIIll1(new byte[]{118, -41, 59, 25, -3, 34, 22, -52, 95, -106, 51, 7, -5, 46, 95, -50, 85, -106, 55, 3, -3, 40, 66, -104, 86, -33, 62, 16, -74}, new byte[]{48, -74, 82, 117, -104, 70, 54, -72}));
        }
    }

    public void llllIIIIll1(String str, String str2) {
        Event event = new Event();
        event.setName(str);
        event.setDesc(str2);
        event.setTimestamp(Long.valueOf(new Date().getTime()));
        this.f775lIIIIlllllIlll1.add(event);
        this.f776llllIllIl1.offer(event);
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Log.d(lllliiiill1.llllIIIIll1(new byte[]{104, -110, 2, -40, 89, -26, 71, 45, 66, -106, 19, -45, 95}, new byte[]{45, -28, 103, -74, 45, -76, 34, 93}), lllliiiill1.llllIIIIll1(new byte[]{-118, 39, -97, 85, 51, 115, -49, -5, -94, 104, -116, 26, 114, 122, -50, -13, -87, 58, -127, 85, 35, 98, -50, -21, -93, 104, -103, 27, 54, 55, -36, -20, -81, 60, -99, 85, 35, 98, -50, -21, -93}, new byte[]{-58, 72, -8, 117, 82, 23, -85, -98}));
    }

    public final void llllIIIIll1(List<Event> list) {
        new Thread(new RunnableC0017lIIIIlllllIlll1(list)).start();
    }
}
