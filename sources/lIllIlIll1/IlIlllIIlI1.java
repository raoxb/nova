package lIllIlIll1;

import IlIlIIIlIlIlll1.IIlIllIIll1;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIlIll1/IlIlllIIlI1.class */
public class IlIlllIIlI1 extends lIllIlIll1.llllIIIIll1 {

    /* renamed from: lIIlllIIIlllII1, reason: collision with root package name */
    public IIIlIllIlI1.IllIIlIIII1 f473lIIlllIIIlllII1;

    /* renamed from: IllllIllllll1, reason: collision with root package name */
    public final Runnable f474IllllIllllll1;

    /* loaded from: classes.jar:lIllIlIll1/IlIlllIIlI1$llllIIIIll1.class */
    public class llllIIIIll1 implements IIIlIllIlI1.IlIlllIIlI1 {
        public llllIIIIll1() {
        }

        @Override // IIIlIllIlI1.IlIlllIIlI1
        public void llllIIIIll1(Bitmap bitmap) {
        }
    }

    public IlIlllIIlI1(WebView webView, JSONObject jSONObject, String str, Runnable runnable) throws JSONException {
        super(webView, jSONObject, str);
        this.f474IllllIllllll1 = runnable;
    }

    @Override // lIllIlIll1.llllIIIIll1
    public void llllIIIIll1() {
        IIIlIllIlI1.IllIIlIIII1 illIIlIIII1 = new IIIlIllIlI1.IllIIlIIII1(IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1(), 1.0f, new llllIIIIll1());
        this.f473lIIlllIIIlllII1 = illIIlIIII1;
        illIIlIIII1.llllIIIIll1(IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.IllIIlIIII1(), this.f546llllIIIIll1);
        IIlIllIIll1.llllIIIIll1(500L);
    }

    @Override // lIllIlIll1.llllIIIIll1
    public void IlIlllIIlI1() {
        super.IlIlllIIlI1();
        try {
            this.f473lIIlllIIIlllII1.lIIIIlllllIlll1();
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{63, 3, -124, 62, -23, -100, -66, 88, 62, 20, -123, 37, -23, -63, -3, 88}, new byte[]{91, 102, -9, 74, -101, -13, -57, 120}) + e);
        }
        SystemClock.sleep(1000L);
        this.f474IllllIllllll1.run();
    }

    @Override // lIllIlIll1.llllIIIIll1
    public boolean lIIIIlllllIlll1() {
        return false;
    }

    @Override // lIllIlIll1.llllIIIIll1
    public boolean IlIlIIlIII1() {
        return true;
    }

    @Override // lIllIlIll1.llllIIIIll1
    public Bitmap llllIIIIll1(WebView webView) {
        return this.f473lIIlllIIIlllII1.llllIIIIll1();
    }

    @Override // lIllIlIll1.llllIIIIll1
    public void llllIIIIll1(int i) {
    }
}
