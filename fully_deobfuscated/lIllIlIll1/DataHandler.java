/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIlIll1.IlIlllIIlI1
 * 反混淆: lIllIlIll1.DataHandler
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIlIll1 → lIllIlIll1
 * ✓ 类名重命名: IlIlllIIlI1 → DataHandler
 * ✓ 字符串解密: 1 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lIllIlIll1;

import com.client.IIlIllIIll1;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIlIll1/IlIlllIIlI1.class */
public class DataHandler extends lIllIlIll1.llllIIIIll1 {

    /* renamed from: lIIlllIIIlllII1, reason: collision with root package name */
    public IIIlIllIlI1.IllIIlIIII1 f473lIIlllIIIlllII1;

    /* renamed from: IllllIllllll1, reason: collision with root package name */
    public final Runnable f474IllllIllllll1;

    /* loaded from: classes.jar:lIllIlIll1/IlIlllIIlI1$llllIIIIll1.class */
    public class llllIIIIll1 implements IIIlIllIlI1.IlIlllIIlI1 {
        public decrypt() {
        }

        @Override // IIIlIllIlI1.IlIlllIIlI1
        public void decrypt(Bitmap bitmap) {
        }
    }

    public IlIlllIIlI1(WebView webView, JSONObject jSONObject, String message, Runnable runnable) throws JSONException {
        super(webView, jSONObject, message);
        this.f474IllllIllllll1 = runnable;
    }

    @Override // lIllIlIll1.llllIIIIll1
    public void decrypt() {
        IIIlIllIlI1.IllIIlIIII1 illIIlIIII1 = new IIIlIllIlI1.isEnabled(IlIlllIIlI1.lIIIIlllllIlll1.getWebViewProvider(), 1.0f, new decrypt());
        this.f473lIIlllIIIlllII1 = illIIlIIII1;
        illIIlIIII1.decrypt(IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.isEnabled(), this.f546llllIIIIll1);
        IIlIllIIll1.decrypt(500L);
    }

    @Override // lIllIlIll1.llllIIIIll1
    public void IlIlllIIlI1() {
        super.IlIlllIIlI1();
        try {
            this.f473lIIlllIIIlllII1.getClassLoader();
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1."destroy error2: " + e);
        }
        SystemClock.sleep(1000L);
        this.f474IllllIllllll1.run();
    }

    @Override // lIllIlIll1.llllIIIIll1
    public boolean getClassLoader() {
        return false;
    }

    @Override // lIllIlIll1.llllIIIIll1
    public boolean initialize() {
        return true;
    }

    @Override // lIllIlIll1.llllIIIIll1
    public Bitmap decrypt(WebView webView) {
        return this.f473lIIlllIIIlllII1.decrypt();
    }

    @Override // lIllIlIll1.llllIIIIll1
    public void decrypt(int i) {
    }
}
