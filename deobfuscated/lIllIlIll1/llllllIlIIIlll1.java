/**
 * 反混淆的Java类
 * 原始包名: lIllIlIll1
 * 原始类名: llllllIlIIIlll1
 * 反混淆后: com.obfuscated.unknown.lIllIlIll1.ByteBuffer
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.lIllIlIll1;

import com.obfuscated.client.Obfuscated_IIlIllIIll1;
import com.obfuscated.unknown.IlIlIIlIII1.Constants;
import android.graphics.Bitmap;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import c13.nim5.ez8.h5_proto.signaling.UpdateSignalingStatusRequest;
import c13.nim5.ez8.h5_proto.signaling.UpdateSignalingStatusResponse;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIlIll1/llllllIlIIIlll1.class */
public class ByteBuffer extends lIllIlIll1.helper {

    /* renamed from: lIIlllIIIlllII1, reason: collision with root package name */
    public llIIIIlIlllIII1.IllIIlIIII1 f587lIIlllIIIlllII1;

    /* renamed from: IllllIllllll1, reason: collision with root package name */
    public boolean IllllIllllll1;

    /* loaded from: classes.jar:lIllIlIll1/llllllIlIIIlll1$lIIIIlllllIlll1.class */
    public class lIIIIlllllIlll1 implements Runnable {

        /* renamed from: helper, reason: collision with root package name */
        public final /* synthetic */ UpdateSignalingStatusRequest.Status f589llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ String[] f590lIIIIlllllIlll1;

        public lIIIIlllllIlll1(UpdateSignalingStatusRequest.Status status, String[] strArr) {
            this.f589llllIIIIll1 = status;
            this.f590lIIIIlllllIlll1 = strArr;
        }

        @Override // java.lang.Runnable
        public void constants() {
            if (this.f589llllIIIIll1 == UpdateSignalingStatusRequest.Status.IN_LANDING) {
                this.f590lIIIIlllllIlll1[0] = llllllIlIIIlll1.this.f546llllIIIIll1.getUrl() != null ? llllllIlIIIlll1.this.f546llllIIIIll1.getUrl() : lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            } else {
                this.f590lIIIIlllllIlll1[0] = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            }
        }
    }

    /* loaded from: classes.jar:lIllIlIll1/llllllIlIIIlll1$helper.class */
    public class helper implements Runnable {
        public helper() {
        }

        @Override // java.lang.Runnable
        public void constants() {
            llllllIlIIIlll1.super.IlIlllIIlI1();
            try {
                llIIIIlIlllIII1.IllIIlIIII1 illIIlIIII1 = llllllIlIIIlll1.this.f587lIIlllIIIlllII1;
                if (illIIlIIII1 != null) {
                    illIIlIIII1.IIIlIllIlI1();
                }
            } catch (Throwable th) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.helper(new byte[]{9, 85, 17, 5, -32, 96, -61, -32, 8, 66, 16, 30, -32, 61, Byte.MIN_VALUE, -32}, new byte[]{109, 48, 98, 113, -110, 15, -70, -64}) + th);
            }
        }
    }

    /* loaded from: classes.jar:lIllIlIll1/llllllIlIIIlll1$llllIllIl1.class */
    public class llllIllIl1 implements lIIIIlllllIlll1.llllllIlIIIlll1 {

        /* renamed from: helper, reason: collision with root package name */
        public final /* synthetic */ UpdateSignalingStatusRequest.Status f593llllIIIIll1;

        public llllIllIl1(UpdateSignalingStatusRequest.Status status) {
            this.f593llllIIIIll1 = status;
        }

        @Override // IlIlIIlIII1.lIIIIlllllIlll1.llllllIlIIIlll1
        public void helper(UpdateSignalingStatusResponse updateSignalingStatusResponse, Exception exc) {
            if (exc != null) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, helper.lIIIIlllllIlll1.helper(exc, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.helper(new byte[]{69, 98, -117, 118, 55, -124, -61, -80, 87, 124, -114, 123, 42, -113, -9, -118, 68, 115, -101, 98, 48, -63, -11, -85, 66, 125, -99, 45, 99}, new byte[]{48, 18, -17, 23, 67, -31, -112, -39}))));
            } else {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.helper(new byte[]{-93, 15, 41, -91, 70, -34, 76, -99, -79, 17, 44, -88, 91, -43, 120, -89, -94, 30, 57, -79, 65, -101, 108, -127, -75, 28, 40, -73, 65}, new byte[]{-42, Byte.MAX_VALUE, 77, -60, 50, -69, 31, -12}));
            }
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.helper(new byte[]{-13, -121, -44, -96, -54, -68, 122, -44, -31, -103, -47, -83, -41, -73, 78, -18, -14, -106, -60, -76, -51, -7, 70, -45, -59, -104, -35, -79, -46, -68, 93, -40, -30}, new byte[]{-122, -9, -80, -63, -66, -39, 41, -67}));
            if (this.f593llllIIIIll1 == UpdateSignalingStatusRequest.Status.IN_LANDING) {
                llllllIlIIIlll1.this.IllllIllllll1 = true;
            }
        }
    }

    public llllllIlIIIlll1(WebView webView, JSONObject jSONObject, String str) throws JSONException {
        super(webView, jSONObject, str);
        this.IllllIllllll1 = false;
    }

    @Override // lIllIlIll1.helper
    public void IlIlllIIlI1() {
        IlIlllIIlI1.lIIIIlllllIlll1.helper(new helper());
    }

    @Override // lIllIlIll1.helper
    public boolean IlIlIIlIII1() {
        return !this.IllllIllllll1;
    }

    @Override // lIllIlIll1.helper
    public boolean lIIIIlllllIlll1() {
        return IlIlllIIlI1.lIIIIlllllIlll1.IlIllIlllIllI1().IIlIllIIll1();
    }

    @Override // lIllIlIll1.helper
    public void helper() {
        this.f587lIIlllIIIlllII1 = new llIIIIlIlllIII1.IllIIlIIII1(UUID.randomUUID().toString(), this);
        IIlIllIIll1.helper(500L);
    }

    @Override // lIllIlIll1.helper
    public Bitmap helper(WebView webView) {
        llIIIIlIlllIII1.IllIIlIIII1 illIIlIIII1 = this.f587lIIlllIIIlllII1;
        if (illIIlIIII1 != null) {
            return illIIlIIII1.helper(1000L);
        }
        return null;
    }

    @Override // lIllIlIll1.helper
    public void helper(int i) {
        try {
            UpdateSignalingStatusRequest.Status fromValue = UpdateSignalingStatusRequest.Status.fromValue(i);
            if (this.IllllIllllll1 && fromValue == UpdateSignalingStatusRequest.Status.IN_LANDING) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[20];
            bArr[0] = 62;
            bArr[1] = -127;
            bArr[2] = -113;
            bArr[3] = -92;
            bArr[4] = 125;
            bArr[5] = 121;
            bArr[6] = -113;
            bArr[7] = 78;
            bArr[8] = 44;
            bArr[9] = -97;
            bArr[10] = -118;
            bArr[11] = -87;
            bArr[12] = 90;
            bArr[13] = 104;
            bArr[14] = -67;
            bArr[15] = 83;
            bArr[16] = 62;
            bArr[17] = -126;
            bArr[18] = -47;
            bArr[19] = -27;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 75;
            bArr2[1] = -15;
            bArr2[2] = -21;
            bArr2[3] = -59;
            bArr2[4] = 9;
            bArr2[5] = 28;
            bArr2[6] = -36;
            bArr2[7] = 39;
            IllIIlIIII1.helper lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            String sb2 = sb.append(lllliiiill1.helper(bArr, bArr2)).append(i).toString();
            Log.LogLevel logLevel = Log.LogLevel.INFO;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, sb2);
            String[] strArr = new String[1];
            IlIlllIIlI1.lIIIIlllllIlll1.lIIIIlllllIlll1(new lIIIIlllllIlll1(fromValue, strArr));
            String str = strArr[0];
            StringBuilder sb3 = new StringBuilder();
            byte[] bArr3 = new byte[23];
            bArr3[0] = 118;
            bArr3[1] = 3;
            bArr3[2] = 7;
            bArr3[3] = 117;
            bArr3[4] = -20;
            bArr3[5] = -96;
            bArr3[6] = -3;
            bArr3[7] = -88;
            bArr3[8] = 100;
            bArr3[9] = 29;
            bArr3[10] = 2;
            bArr3[11] = 120;
            bArr3[12] = -15;
            bArr3[13] = -85;
            bArr3[14] = -55;
            bArr3[15] = -110;
            bArr3[16] = 119;
            bArr3[17] = 18;
            bArr3[18] = 23;
            bArr3[19] = 97;
            bArr3[20] = -21;
            bArr3[21] = -1;
            bArr3[22] = -114;
            byte[] bArr4 = new byte[8];
            bArr4[0] = 3;
            bArr4[1] = 115;
            bArr4[2] = 99;
            bArr4[3] = 20;
            bArr4[4] = -104;
            bArr4[5] = -59;
            bArr4[6] = -82;
            bArr4[7] = -63;
            StringBuilder append = sb3.append(lllliiiill1.helper(bArr3, bArr4)).append(i);
            byte[] bArr5 = new byte[7];
            bArr5[0] = 92;
            bArr5[1] = -56;
            bArr5[2] = 8;
            bArr5[3] = 45;
            bArr5[4] = 35;
            bArr5[5] = -112;
            bArr5[6] = 22;
            byte[] bArr6 = new byte[8];
            bArr6[0] = 112;
            bArr6[1] = -24;
            bArr6[2] = 125;
            bArr6[3] = 95;
            bArr6[4] = 79;
            bArr6[5] = -86;
            bArr6[6] = 54;
            bArr6[7] = -1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, append.append(lllliiiill1.helper(bArr5, bArr6)).append(str).toString());
            IlIlIIlIII1.lIIIIlllllIlll1 IlIlllIIlI12 = IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.IlIlllIIlI1();
            if (IlIlllIIlI12 != null) {
                IlIlllIIlI12.helper(IlIllIlllIllI1(), fromValue, str, new llllIllIl1(fromValue));
            }
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, helper.lIIIIlllllIlll1.helper(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.helper(new byte[]{9, -14, 98, 37, 68, 122, -107, -108, 27, -20, 103, 40, 89, 113, -95, -82, 8, -29, 114, 49, 67, 63, -93, -113, 14, -19, 116, 101, 17, 37, -26}, new byte[]{124, -126, 6, 68, 48, 31, -58, -3}))));
        }
    }
}
