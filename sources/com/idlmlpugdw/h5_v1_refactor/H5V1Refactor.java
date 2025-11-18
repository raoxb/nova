package com.idlmlpugdw.h5_v1_refactor;

import IlIlllIIlI1.llllIllIl1;
import android.content.Context;
import c13.nim5.ez8.h5_proto.Atom;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:com/idlmlpugdw/h5_v1_refactor/H5V1Refactor.class */
public class H5V1Refactor {

    /* loaded from: classes.jar:com/idlmlpugdw/h5_v1_refactor/H5V1Refactor$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ String f326llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ Context f327lIIIIlllllIlll1;

        public llllIIIIll1(String str, Context context) {
            this.f326llllIIIIll1 = str;
            this.f327lIIIIlllllIlll1 = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new llllIllIl1().llllIIIIll1(this.f327lIIIIlllllIlll1, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, Atom.fromJSONObject(new JSONObject(this.f326llllIIIIll1)));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void init(Context context, String str) {
        new Thread(new llllIIIIll1(str, context)).start();
    }
}
