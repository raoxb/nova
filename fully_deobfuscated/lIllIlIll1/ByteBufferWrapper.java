/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIlIll1.llllllIlIIIlll1
 * 反混淆: lIllIlIll1.ByteBufferWrapper
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIlIll1 → lIllIlIll1
 * ✓ 类名重命名: llllllIlIIIlll1 → ByteBufferWrapper
 * ✓ 字符串解密: 3 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lIllIlIll1;

import com.client.IIlIllIIll1;
import IlIlIIlIII1.Constants;
import android.graphics.Bitmap;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import c13.nim5.ez8.h5_proto.signaling.UpdateSignalingStatusRequest;
import c13.nim5.ez8.h5_proto.signaling.UpdateSignalingStatusResponse;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIlIll1/llllllIlIIIlll1.class */
public class ByteBufferWrapper extends lIllIlIll1.llllIIIIll1 {

    /* renamed from: lIIlllIIIlllII1, reason: collision with root package name */
    public llIIIIlIlllIII1.IllIIlIIII1 f587lIIlllIIIlllII1;

    /* renamed from: IllllIllllll1, reason: collision with root package name */
    public boolean f588IllllIllllll1;

    /* loaded from: classes.jar:lIllIlIll1/llllllIlIIIlll1$lIIIIlllllIlll1.class */
    public class lIIIIlllllIlll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ UpdateSignalingStatusRequest.Status f589llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ String[] f590lIIIIlllllIlll1;

        public getClassLoader(UpdateSignalingStatusRequest.Status status, String[] strArr) {
            this.f589llllIIIIll1 = status;
            this.f590lIIIIlllllIlll1 = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f589llllIIIIll1 == UpdateSignalingStatusRequest.Status.IN_LANDING) {
                this.f590lIIIIlllllIlll1[0] = llllllIlIIIlll1.this.f546llllIIIIll1.getUrl() != null ? llllllIlIIIlll1.this.f546llllIIIIll1.getUrl() : lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            } else {
                this.f590lIIIIlllllIlll1[0] = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            }
        }
    }

    /* loaded from: classes.jar:lIllIlIll1/llllllIlIIIlll1$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {
        public decrypt() {
        }

        @Override // java.lang.Runnable
        public void run() {
            llllllIlIIIlll1.super.IlIlllIIlI1();
            try {
                llIIIIlIlllIII1.IllIIlIIII1 illIIlIIII1 = llllllIlIIIlll1.this.f587lIIlllIIIlllII1;
                if (illIIlIIII1 != null) {
                    illIIlIIII1.IIIlIllIlI1();
                }
            } catch (Throwable th) {
                lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{9, 85, 17, 5, -32, 96, -61, -32, 8, 66, 16, 30, -32, 61, Byte.MIN_VALUE, -32}, new byte[]{109, 48, 98, 113, -110, 15, -70, -64}) + th);
            }
        }
    }

    /* loaded from: classes.jar:lIllIlIll1/llllllIlIIIlll1$llllIllIl1.class */
    public class llllIllIl1 implements lIIIIlllllIlll1.llllllIlIIIlll1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ UpdateSignalingStatusRequest.Status f593llllIIIIll1;

        public getWebViewProvider(UpdateSignalingStatusRequest.Status status) {
            this.f593llllIIIIll1 = status;
        }

        @Override // IlIlIIlIII1.lIIIIlllllIlll1.llllllIlIIIlll1
        public void decrypt(UpdateSignalingStatusResponse updateSignalingStatusResponse, Exception exc) {
            if (exc != null) {
                lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll1.lIIIIlllllIlll1.decrypt(exc, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1."updateSignalingStatus error: ")));
            } else {
                lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{-93, 15, 41, -91, 70, -34, 76, -99, -79, 17, 44, -88, 91, -43, 120, -89, -94, 30, 57, -79, 65, -101, 108, -127, -75, 28, 40, -73, 65}, new byte[]{-42, Byte.MAX_VALUE, 77, -60, 50, -69, 31, -12}));
            }
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1."updateSignalingStatus onCompleted");
            if (this.f593llllIIIIll1 == UpdateSignalingStatusRequest.Status.IN_LANDING) {
                llllllIlIIIlll1.this.f588IllllIllllll1 = true;
            }
        }
    }

    public llllllIlIIIlll1(WebView webView, JSONObject jSONObject, String message) throws JSONException {
        super(webView, jSONObject, message);
        this.f588IllllIllllll1 = false;
    }

    @Override // lIllIlIll1.llllIIIIll1
    public void IlIlllIIlI1() {
        IlIlllIIlI1.lIIIIlllllIlll1.decrypt(new decrypt());
    }

    @Override // lIllIlIll1.llllIIIIll1
    public boolean initialize() {
        return !this.f588IllllIllllll1;
    }

    @Override // lIllIlIll1.llllIIIIll1
    public boolean getClassLoader() {
        return IlIlllIIlI1.lIIIIlllllIlll1.IlIllIlllIllI1().IIlIllIIll1();
    }

    @Override // lIllIlIll1.llllIIIIll1
    public void decrypt() {
        this.f587lIIlllIIIlllII1 = new llIIIIlIlllIII1.isEnabled(UUID.randomUUID().toString(), this);
        IIlIllIIll1.decrypt(500L);
    }

    @Override // lIllIlIll1.llllIIIIll1
    public Bitmap decrypt(WebView webView) {
        llIIIIlIlllIII1.IllIIlIIII1 illIIlIIII1 = this.f587lIIlllIIIlllII1;
        if (illIIlIIII1 != null) {
            return illIIlIIII1.decrypt(1000L);
        }
        return null;
    }

    @Override // lIllIlIll1.llllIIIIll1
    public void decrypt(int i) {
        try {
            UpdateSignalingStatusRequest.Status fromValue = UpdateSignalingStatusRequest.Status.fromValue(i);
            if (this.f588IllllIllllll1 && fromValue == UpdateSignalingStatusRequest.Status.IN_LANDING) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            byte[] byteArray = new byte[]{62, -127, -113, -92, 125, 121, -113, 78, 44, -97, -118, -87, 90, 104, -67, 83, 62, -126, -47, -27};
            byte[] keyArray = new byte[]{75, -15, -21, -59, 9, 28, -36, 39};
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            String sb2 = sb.append(lllliiiill1.decrypt(byteArray, keyArray)).append(i).toString();
            Log.LogLevel logLevel = Log.LogLevel.INFO;
            lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, sb2);
            String[] strArr = new String[1];
            IlIlllIIlI1.lIIIIlllllIlll1.getClassLoader(new getClassLoader(fromValue, strArr));
            String message = strArr[0];
            StringBuilder sb3 = new StringBuilder();
            byte[] encryptedData = new byte[]{118, 3, 7, 117, -20, -96, -3, -88, 100, 29, 2, 120, -15, -85, -55, -110, 119, 18, 23, 97, -21, -1, -114};
            byte[] decryptionKey = new byte[]{3, 115, 99, 20, -104, -59, -82, -63};
            StringBuilder append = sb3.append(lllliiiill1.decrypt(encryptedData, decryptionKey)).append(i);
            byte[] bArr5 = new byte[]{92, -56, 8, 45, 35, -112, 22};
            byte[] bArr6 = new byte[]{112, -24, 125, 95, 79, -86, 54, -1};
            lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, append.append(lllliiiill1.decrypt(bArr5, bArr6)).append(message).toString());
            IlIlIIlIII1.lIIIIlllllIlll1 IlIlllIIlI12 = IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.IlIlllIIlI1();
            if (IlIlllIIlI12 != null) {
                IlIlllIIlI12.decrypt(IlIllIlllIllI1(), fromValue, message, new getWebViewProvider(fromValue));
            }
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll1.lIIIIlllllIlll1.decrypt(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1."updateSignalingStatus error!!: ")));
        }
    }
}
