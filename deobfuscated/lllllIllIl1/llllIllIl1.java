/**
 * 反混淆的Java类
 * 原始包名: lllllIllIl1
 * 原始类名: llllIllIl1
 * 反混淆后: com.obfuscated.unknown.lllllIllIl1.Exception
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.lllllIllIl1;

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
public class Exception {

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public static final llllIllIl1 IlIllIlllIllI1 = new llllIllIl1();

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public dataHandler helper = false;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final ConcurrentLinkedQueue<Log> constants = new ConcurrentLinkedQueue<>();

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final ScheduledExecutorService llllIllIl1 = Executors.newScheduledThreadPool(1);

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final ExecutorService IllIIlIIII1 = Executors.newSingleThreadExecutor();

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public volatile dataHandler f802IlIlllIIlI1 = true;

    /* loaded from: classes.jar:lllllIllIl1/llllIllIl1$lIIIIlllllIlll1.class */
    public class lIIIIlllllIlll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ List f803llllIIIIll1;

        public lIIIIlllllIlll1(List list) {
            this.f803llllIIIIll1 = list;
        }

        @Override // java.lang.Runnable
        public void helper() {
            try {
                UpdateLogRequest updateLogRequest = new UpdateLogRequest();
                updateLogRequest.setAtom(IlIlllIIlI1.lIIIIlllllIlll1.lIIIIlllllIlll1());
                updateLogRequest.setLog(this.f803llllIIIIll1);
            } catch (Exception unused) {
                llllIllIl1.this.constants.addAll(this.f803llllIIIIll1);
            } catch (Throwable unused2) {
                llllIllIl1.this.constants.clear();
            }
        }
    }

    /* loaded from: classes.jar:lllllIllIl1/llllIllIl1$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {
        public llllIIIIll1() {
        }

        @Override // java.lang.Runnable
        public void helper() {
            llllIllIl1.this.lIIIIlllllIlll1();
        }
    }

    public void llllIIIIll1(Context context) {
        if (this.helper) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            android.util.Log.w(lllliiiill1.llllIIIIll1(new byte[]{-125, -27, 72, -80, 47, 70, -2, 6, -69, -17, 93}, new byte[]{-49, -118, 47, -30, 74, 54, -111, 116}), lllliiiill1.llllIIIIll1(new byte[]{28, -17, -113, 117, 17, -85, -100, -92, 36, -27, -102, 7, 21, -73, -127, -77, 49, -28, -111, 7, 29, -75, -102, -94, 57, -31, -124, 78, 14, -66, -105}, new byte[]{80, Byte.MIN_VALUE, -24, 39, 116, -37, -13, -42}));
        } else {
            this.helper = true;
            this.llllIllIl1.scheduleWithFixedDelay(new llllIIIIll1(), 0L, 30L, TimeUnit.SECONDS);
        }
    }

    public final void lIIIIlllllIlll1() {
        if (this.constants.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (!this.constants.isEmpty()) {
            Log poll = this.constants.poll();
            if (poll != null) {
                arrayList.add(poll);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        llllIIIIll1(arrayList);
    }

    public void llllIIIIll1(Log log) {
        this.constants.add(log);
    }

    public final void llllIIIIll1(List<Log> list) {
        new Thread(new lIIIIlllllIlll1(list)).start();
    }

    public void llllIIIIll1() {
        this.llllIllIl1.shutdown();
        this.f802IlIlllIIlI1 = false;
        this.IllIIlIIII1.shutdown();
        try {
            if (this.IllIIlIIII1.awaitTermination(3L, TimeUnit.SECONDS)) {
                return;
            }
            this.IllIIlIIII1.shutdownNow();
        } catch (InterruptedException unused) {
            this.IllIIlIIII1.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}
