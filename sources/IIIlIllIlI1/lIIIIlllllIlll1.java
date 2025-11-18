package IIIlIllIlI1;

import android.os.Handler;
import android.os.Looper;
import c13.nim5.ez8.h5_proto.Log;

/* loaded from: classes.jar:IIIlIllIlI1/lIIIIlllllIlll1.class */
public class lIIIIlllllIlll1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static Handler f13llllIIIIll1 = new Handler(Looper.getMainLooper());

    public static void llllIIIIll1(Runnable runnable) {
        new Thread(runnable).start();
    }

    public static void lIIIIlllllIlll1(Runnable runnable) {
        Handler handler = f13llllIIIIll1;
        if (handler != null) {
            handler.post(runnable);
        } else {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-51, -6, -21, -124, 121, -40, -57, -87, -3, -63, -21, -94, 119, -62, -125, -74, -3, -57}, new byte[]{-104, -77, -53, -52, 24, -74, -93, -59}));
        }
    }

    public static void llllIllIl1(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();
    }
}
