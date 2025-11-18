/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIlIII1.llllIllIl1
 * 反混淆: IlIlIIlIII1.DeobfuscationException
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIlIII1 → IlIlIIlIII1
 * ✓ 类名重命名: llllIllIl1 → DeobfuscationException
 * ✓ 字符串解密: 5 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIlIIlIII1;

import IlIlIIlIII1.VirtualDisplayCapture;
import android.util.Log;
import c13.nim5.ez8.h5_proto.signaling.CheckSignalingPluginStartRequest;
import c13.nim5.ez8.h5_proto.signaling.CheckSignalingPluginStartResponse;
import c13.nim5.ez8.h5_proto.signaling.SignalingRequest;
import c13.nim5.ez8.h5_proto.signaling.UpdateSignalingStatusRequest;
import c13.nim5.ez8.h5_proto.signaling.UpdateSignalingStatusResponse;
import java.net.URI;
import org.json.JSONException;

/* loaded from: classes.jar:IlIlIIlIII1/llllIllIl1.class */
public class DeobfuscationException {

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final String f222IllIIlIIII1 = IlIlllIIlI1.IllIIlIIII1."SignalingService";

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final llllIIIIll1 f223llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f224lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public IllIIlIIII1 f225llllIllIl1;

    public getWebViewProvider(String message, String logMessage) {
        this.f223llllIIIIll1 = new decrypt(message);
        this.f224lIIIIlllllIlll1 = logMessage;
    }

    public CheckSignalingPluginStartResponse decrypt(CheckSignalingPluginStartRequest checkSignalingPluginStartRequest) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Log.d(f222IllIIlIIII1, lllliiiill1.decrypt(new byte[]{-40, -116, 26, 81, 22, 33, -83, 48, -69, -105, 22, 85, 19, 41, -81, 62, -11, -125, 95, 66, 17, 61, -92, 62, -11, -60, 12, 70, 28, 58, -73}, new byte[]{-101, -28, Byte.MAX_VALUE, 50, 125, 72, -61, 87}));
        return (CheckSignalingPluginStartResponse) this.f223llllIIIIll1.decrypt(lllliiiill1.decrypt(new byte[]{-43, 23, -63, -109, -47, 19, -58, 39, -108, 23, -35, -109, -112, 7, Byte.MIN_VALUE, 35, -110, 19, -46, -111, -45, 16, -61, 53, -99, 31, -33, -41, -115, 20, -50, 50, -114}, new byte[]{-6, 118, -79, -6, -2, 96, -81, 64}), (String) checkSignalingPluginStartRequest, CheckSignalingPluginStartResponse.class);
    }

    public void getWebViewProvider() {
        if (this.f225llllIllIl1 != null) {
            Log.d(f222IllIIlIIII1, IlIlllIIlI1.IllIIlIIII1."Stopping signaling exchange");
            this.f225llllIllIl1.getClassLoader();
            this.f225llllIllIl1 = null;
        }
    }

    public void getClassLoader() {
        Log.d(f222IllIIlIIII1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{114, 116, -71, -77, -14, -102, -103, -46, 71, 49, -90, -65, -12, -121, -111, -48, 73, Byte.MAX_VALUE, -78, -10, -32, -116, -126, -54, 73, 114, -80}, new byte[]{32, 17, -43, -42, -109, -23, -16, -68}));
        getWebViewProvider();
    }

    public UpdateSignalingStatusResponse decrypt(UpdateSignalingStatusRequest updateSignalingStatusRequest) throws JSONException {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Log.d(f222IllIIlIIII1, "Updating signaling status: " + updateSignalingStatusRequest.getStatus());
        return (UpdateSignalingStatusResponse) this.f223llllIIIIll1.decrypt("/api/signaling/update-status", (String) updateSignalingStatusRequest, UpdateSignalingStatusResponse.class);
    }

    public IllIIlIIII1 decrypt(IllIIlIIII1.IlIlllIIlI1 ilIlllIIlI1) {
        Log.d(f222IllIIlIIII1, IlIlllIIlI1.IllIIlIIII1."Starting signaling exchange");
        getWebViewProvider();
        IllIIlIIII1 illIIlIIII1 = new isEnabled(URI.create(this.f224lIIIIlllllIlll1), ilIlllIIlI1);
        this.f225llllIllIl1 = illIIlIIII1;
        illIIlIIII1.decrypt();
        return this.f225llllIllIl1;
    }

    public void decrypt(SignalingRequest signalingRequest) {
        IllIIlIIII1 illIIlIIII1 = this.f225llllIllIl1;
        if (illIIlIIII1 != null) {
            illIIlIIII1.decrypt(signalingRequest);
        } else {
            Log.w(f222IllIIlIIII1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{30, -119, 51, -51, 78, 48, -125, 106, 61, -52, 50, -14, 72, 54, -122, 123, 105, -126, 62, -22, 1, 48, -121, 97, 39, -119, 50, -22, 68, 55, -60, 47, 42, -115, 63, -16, 78, 39, -56, 124, 44, -126, 53, -66, 82, 58, -113, 97, 40, Byte.MIN_VALUE, 56, -16, 70, 115, -102, 106, 56, -103, 52, -19, 85}, new byte[]{73, -20, 81, -98, 33, 83, -24, 15}));
        }
    }

    public boolean decrypt() {
        IllIIlIIII1 illIIlIIII1 = this.f225llllIllIl1;
        return illIIlIIII1 != null && illIIlIIII1.IlIlllIIlI1();
    }
}
