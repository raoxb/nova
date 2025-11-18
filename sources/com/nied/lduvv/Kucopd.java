package com.nied.lduvv;

import IlIlllIIlI1.llllIllIl1;
import android.content.Context;

/* loaded from: classes.jar:com/nied/lduvv/Kucopd.class */
public class Kucopd {

    /* loaded from: classes.jar:com/nied/lduvv/Kucopd$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ Context f328llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ String f329lIIIIlllllIlll1;

        public llllIIIIll1(Context context, String str) {
            this.f328llllIIIIll1 = context;
            this.f329lIIIIlllllIlll1 = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            new llllIllIl1().llllIIIIll1(this.f328llllIIIIll1, this.f329lIIIIlllllIlll1, null);
        }
    }

    public static void init(Context context, String str) {
        new Thread(new llllIIIIll1(context, str)).start();
    }
}
