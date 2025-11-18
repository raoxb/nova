/**
 * 反混淆的Java类
 * 原始包名: llIIllIl1
 * 原始类名: RunnableC0015llllIIIIll1
 * 反混淆后: com.obfuscated.unknown.llIIllIl1.RunnableC0015llllIIIIll1
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.llIIllIl1;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.jar:llIIllIl1/llllIIIIll1.class */
public abstract class llllIIIIll1 extends llllllIlIIIlll1 {

    /* renamed from: IlIllll1, reason: collision with root package name */
    public static final String f724IlIllll1 = "AbstractWebSocket";

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public static int f725lllllIllIl1 = 65536;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public boolean f726lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public boolean f727llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public ScheduledExecutorService f728IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public ScheduledFuture<?> f729IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public long f730IlIllIlllIllI1 = TimeUnit.SECONDS.toNanos(60);

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public boolean f731llllllIlIIIlll1 = false;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public boolean f732IlIlIIlIII1 = false;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public final Object f733lIllIIIlIl1 = new Object();

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public int f734IIlIllIIll1 = 0;

    /* renamed from: llIIllIl1.llllIIIIll1$llllIIIIll1, reason: collision with other inner class name */
    /* loaded from: classes.jar:llIIllIl1/llllIIIIll1$llllIIIIll1.class */
    public class RunnableC0015llllIIIIll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public ArrayList<IlIllIlllIllI1> f735llllIIIIll1 = new ArrayList<>();

        public RunnableC0015llllIIIIll1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long nanoTime;
            this.f735llllIIIIll1.clear();
            try {
                this.f735llllIIIIll1.addAll(llllIIIIll1.this.llIIllIl1());
                synchronized (llllIIIIll1.this.f733lIllIIIlIl1) {
                    nanoTime = (long) (System.nanoTime() - (llllIIIIll1.this.f730IlIllIlllIllI1 * 1.5d));
                }
                Iterator<IlIllIlllIllI1> it = this.f735llllIIIIll1.iterator();
                while (it.hasNext()) {
                    llllIIIIll1.this.llllIIIIll1(it.next(), nanoTime);
                }
            } catch (Exception unused) {
            }
            this.f735llllIIIIll1.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Throwable] */
    public int IIIlIllIlI1() {
        int seconds;
        ?? r0 = this.f733lIllIIIlIl1;
        synchronized (r0) {
            seconds = (int) TimeUnit.NANOSECONDS.toSeconds(this.f730IlIllIlllIllI1);
        }
        return seconds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [llIIllIl1.llllIIIIll1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public void IlIIIIllllIlI1() {
        ?? r0 = this;
        Object obj = r0.f733lIllIIIlIl1;
        synchronized (obj) {
            if (r0.f728IllIIlIIII1 != null || this.f729IlIlllIIlI1 != null) {
                this.f731llllllIlIIIlll1 = false;
                Log.v(f724IlIllll1, "Connection lost timer stopped");
                IlIlIIIlIlIlll1();
            }
            r0 = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void IllllIllllll1() {
        synchronized (this.f733lIllIIIlIl1) {
            if (this.f730IlIllIlllIllI1 <= 0) {
                Log.v(f724IlIllll1, "Connection lost timer deactivated");
                return;
            }
            Log.v(f724IlIllll1, "Connection lost timer started");
            this.f731llllllIlIIIlll1 = true;
            lIIlllIIIlllII1();
        }
    }

    public abstract Collection<IlIllIlllIllI1> llIIllIl1();

    public boolean IllIlIllll1() {
        return this.f726lIIIIlllllIlll1;
    }

    public void llllIllIl1(boolean z) {
        this.f726lIIIIlllllIlll1 = z;
    }

    public boolean lIIlIIIIlIlII1() {
        return this.f727llllIllIl1;
    }

    public boolean lIlllIIIII1() {
        return this.f732IlIlIIlIII1;
    }

    public int lllIlIIIlI1() {
        return this.f734IIlIllIIll1;
    }

    public final void lIIlllIIIlllII1() {
        IlIlIIIlIlIlll1();
        this.f728IllIIlIIII1 = Executors.newSingleThreadScheduledExecutor(new IlIIIlIlIlIII1.IllIIlIIII1("WebSocketConnectionLostChecker", this.f732IlIlIIlIII1));
        RunnableC0015llllIIIIll1 runnableC0015llllIIIIll1 = new RunnableC0015llllIIIIll1();
        ScheduledExecutorService scheduledExecutorService = this.f728IllIIlIIII1;
        long j = this.f730IlIllIlllIllI1;
        this.f729IlIlllIIlI1 = scheduledExecutorService.scheduleAtFixedRate(runnableC0015llllIIIIll1, j, j, TimeUnit.NANOSECONDS);
    }

    public final void IlIlIIIlIlIlll1() {
        ScheduledExecutorService scheduledExecutorService = this.f728IllIIlIIII1;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.f728IllIIlIIII1 = null;
        }
        ScheduledFuture<?> scheduledFuture = this.f729IlIlllIIlI1;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f729IlIlllIIlI1 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable] */
    public void lIIIIlllllIlll1(int i) {
        ?? r0 = this.f733lIllIIIlIl1;
        synchronized (r0) {
            long nanos = TimeUnit.SECONDS.toNanos(i);
            this.f730IlIllIlllIllI1 = nanos;
            if (nanos <= 0) {
                Log.v(f724IlIllll1, "Connection lost timer stopped");
                IlIlIIIlIlIlll1();
                return;
            }
            if (this.f731llllllIlIIIlll1) {
                Log.v(f724IlIllll1, "Connection lost timer restarted");
                try {
                    Iterator it = new ArrayList(llIIllIl1()).iterator();
                    while (true) {
                        r0 = it.hasNext();
                        if (r0 == 0) {
                            break;
                        }
                        IlIllIlllIllI1 ilIllIlllIllI1 = (IlIllIlllIllI1) it.next();
                        if (ilIllIlllIllI1 instanceof lIllIIIlIl1) {
                            ((lIllIIIlIl1) ilIllIlllIllI1).IllIlIllll1();
                        }
                    }
                } catch (Exception e) {
                    Log.e(f724IlIllll1, "Exception during connection lost restart", e);
                }
                lIIlllIIIlllII1();
            }
        }
    }

    public void llllIllIl1(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("buffer size < 0");
        }
        this.f734IIlIllIIll1 = i;
    }

    public final void llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1, long j) {
        if (ilIllIlllIllI1 instanceof lIllIIIlIl1) {
            lIllIIIlIl1 lilliiilil1 = (lIllIIIlIl1) ilIllIlllIllI1;
            if (lilliiilil1.llIIllIl1() < j) {
                Log.v(f724IlIllll1, "Closing connection due to no pong received: " + lilliiilil1);
                lilliiilil1.lIIIIlllllIlll1(IlIIIIllllIlI1.lIIIIlllllIlll1.f72lIllIlIll1, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            } else if (lilliiilil1.isOpen()) {
                lilliiilil1.IllIIlIIII1();
            } else {
                Log.v(f724IlIllll1, "Trying to ping a non open connection: " + lilliiilil1);
            }
        }
    }

    public void llllIIIIll1(boolean z) {
        this.f732IlIlIIlIII1 = z;
    }

    public void lIIIIlllllIlll1(boolean z) {
        this.f727llllIllIl1 = z;
    }
}
