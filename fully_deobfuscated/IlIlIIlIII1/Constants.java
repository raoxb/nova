/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIlIII1.lIIIIlllllIlll1
 * 反混淆: IlIlIIlIII1.Constants
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIlIII1 → IlIlIIlIII1
 * ✓ 类名重命名: lIIIIlllllIlll1 → Constants
 * ✓ 字符串解密: 19 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIlIIlIII1;

import IlIlIIlIII1.VirtualDisplayCapture;
import android.content.Context;
import android.util.Log;
import c13.nim5.ez8.h5_proto.Atom;
import c13.nim5.ez8.h5_proto.signaling.CheckSignalingPluginStartRequest;
import c13.nim5.ez8.h5_proto.signaling.CheckSignalingPluginStartResponse;
import c13.nim5.ez8.h5_proto.signaling.ClickEvent;
import c13.nim5.ez8.h5_proto.signaling.ConnectionStatus;
import c13.nim5.ez8.h5_proto.signaling.ControlCommand;
import c13.nim5.ez8.h5_proto.signaling.ICECandidate;
import c13.nim5.ez8.h5_proto.signaling.Ping;
import c13.nim5.ez8.h5_proto.signaling.Pong;
import c13.nim5.ez8.h5_proto.signaling.SDPAnswer;
import c13.nim5.ez8.h5_proto.signaling.SDPOffer;
import c13.nim5.ez8.h5_proto.signaling.ScrollEvent;
import c13.nim5.ez8.h5_proto.signaling.SignalingRequest;
import c13.nim5.ez8.h5_proto.signaling.SignalingResponse;
import c13.nim5.ez8.h5_proto.signaling.TextInput;
import c13.nim5.ez8.h5_proto.signaling.UpdateSignalingStatusRequest;
import c13.nim5.ez8.h5_proto.signaling.UpdateSignalingStatusResponse;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1.class */
public class Constants {

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final String f188IIlIllIIll1 = IlIlllIIlI1.IllIIlIIII1."SignalingSDK";

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final Context f189llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final IlIlllIIlI1 f190lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final IlIlIIlIII1.llllIllIl1 f191llllIllIl1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public ScheduledFuture<?> f193IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public IlIllIlllIllI1 f194IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public Atom f195llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public volatile boolean f196IlIlIIlIII1 = false;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public final IllIIlIIII1.IlIlllIIlI1 f197lIllIIIlIl1 = new decrypt();

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final ScheduledExecutorService f192IllIIlIIII1 = Executors.newScheduledThreadPool(2);

    /* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1$IlIllIlllIllI1.class */
    public interface IlIllIlllIllI1 {
        default void decrypt() {
        }

        default void getClassLoader() {
        }

        default void decrypt(int i, String message, boolean result) {
        }

        default void decrypt(SDPOffer sDPOffer) {
        }

        default void decrypt(SDPAnswer sDPAnswer) {
        }

        default void decrypt(ICECandidate iCECandidate) {
        }

        default void decrypt(ConnectionStatus connectionStatus) {
        }

        default void decrypt(Pong pong) {
        }

        default void decrypt(Exception exc) {
        }
    }

    /* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1$IlIlllIIlI1.class */
    public static class IlIlllIIlI1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final String f198llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final String f199lIIIIlllllIlll1;

        /* renamed from: llllIllIl1, reason: collision with root package name */
        public final String f200llllIllIl1;

        /* renamed from: IllIIlIIII1, reason: collision with root package name */
        public final boolean f201IllIIlIIII1;

        /* renamed from: IlIlllIIlI1, reason: collision with root package name */
        public final long f202IlIlllIIlI1;

        public IlIlllIIlI1(String message, String logMessage) {
            this(message, logMessage, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, true, 30L);
        }

        public String decrypt() {
            return this.f198llllIIIIll1;
        }

        public String isEnabled() {
            return this.f199lIIIIlllllIlll1;
        }

        public String getWebViewProvider() {
            return this.f200llllIllIl1;
        }

        public boolean IlIlllIIlI1() {
            return this.f201IllIIlIIII1;
        }

        public long getClassLoader() {
            return this.f202IlIlllIIlI1;
        }

        public IlIlllIIlI1(String message, String logMessage, String str3, boolean result, long j) {
            this.f198llllIIIIll1 = message;
            this.f199lIIIIlllllIlll1 = logMessage;
            this.f200llllIllIl1 = str3;
            this.f201IllIIlIIII1 = result;
            this.f202IlIlllIIlI1 = j;
        }
    }

    /* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1$IllIIlIIII1.class */
    public interface IllIIlIIII1 {
        void decrypt(CheckSignalingPluginStartResponse checkSignalingPluginStartResponse, Exception exc);
    }

    /* renamed from: IlIlIIlIII1.lIIIIlllllIlll1$lIIIIlllllIlll1, reason: collision with other inner class name */
    /* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1$lIIIIlllllIlll1.class */
    public class RunnableC0005lIIIIlllllIlll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ IllIIlIIII1 f203llllIIIIll1;

        public RunnableC0005lIIIIlllllIlll1(IllIIlIIII1 illIIlIIII1) {
            this.f203llllIIIIll1 = illIIlIIII1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (lIIIIlllllIlll1.this.f195llllllIlIIIlll1 != null) {
                    this.f203llllIIIIll1.decrypt(lIIIIlllllIlll1.this.f191llllIllIl1.decrypt(new CheckSignalingPluginStartRequest(lIIIIlllllIlll1.this.f195llllllIlIIIlll1)), null);
                    return;
                }
                byte[] byteArray = new byte[]{-26, -12, -4, -118, -61, 85, 40, -49, -36, -34, -34, -34, -60, 91, 48, -122, -49, -43, -45};
                byte[] keyArray = new byte[]{-75, -80, -73, -86, -83, 58, 92, -17};
                throw new IllegalStateException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray));
            } catch (Exception e) {
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Log.e(lllliiiill1.decrypt(new byte[]{103, 122, 26, -30, 30, -92, 106, -127, 83, 64, 57, -57}, new byte[]{52, 19, 125, -116, Byte.MAX_VALUE, -56, 3, -17}), "Failed to check plugin start", e);
                this.f203llllIIIIll1.decrypt(null, e);
            }
        }
    }

    /* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1$llllIllIl1.class */
    public class llllIllIl1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ String f206llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ UpdateSignalingStatusRequest.Status f207lIIIIlllllIlll1;

        /* renamed from: llllIllIl1, reason: collision with root package name */
        public final /* synthetic */ String f208llllIllIl1;

        /* renamed from: IllIIlIIII1, reason: collision with root package name */
        public final /* synthetic */ llllllIlIIIlll1 f209IllIIlIIII1;

        public getWebViewProvider(String message, UpdateSignalingStatusRequest.Status status, String logMessage, llllllIlIIIlll1 lllllliliiilll1) {
            this.f206llllIIIIll1 = message;
            this.f207lIIIIlllllIlll1 = status;
            this.f208llllIllIl1 = logMessage;
            this.f209IllIIlIIII1 = lllllliliiilll1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (lIIIIlllllIlll1.this.f195llllllIlIIIlll1 != null) {
                    this.f209IllIIlIIII1.decrypt(lIIIIlllllIlll1.this.f191llllIllIl1.decrypt(new UpdateSignalingStatusRequest(lIIIIlllllIlll1.this.f195llllllIlIIIlll1, this.f206llllIIIIll1, this.f207lIIIIlllllIlll1, this.f208llllIllIl1)), null);
                    return;
                }
                byte[] byteArray = new byte[19];
                byteArray[0] = 14;
                byteArray[1] = -77;
                byteArray[2] = -90;
                byteArray[3] = 43;
                byteArray[4] = -117;
                byteArray[5] = 101;
                byteArray[6] = -118;
                byteArray[7] = -111;
                byteArray[8] = 52;
                byteArray[9] = -103;
                byteArray[10] = -124;
                byteArray[11] = Byte.MAX_VALUE;
                byteArray[12] = -116;
                byteArray[13] = 107;
                byteArray[14] = -110;
                byteArray[15] = -40;
                byteArray[16] = 39;
                byteArray[17] = -110;
                byteArray[18] = -119;
                byte[] keyArray = new byte[]{93, -9, -19, 11, -27, 10, -2, -79};
                throw new IllegalStateException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray));
            } catch (Exception e) {
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Log.e("SignalingSDK", "Failed to update signaling status", e);
                this.f209IllIIlIIII1.decrypt(null, e);
            }
        }
    }

    /* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1$llllllIlIIIlll1.class */
    public interface llllllIlIIIlll1 {
        void decrypt(UpdateSignalingStatusResponse updateSignalingStatusResponse, Exception exc);
    }

    public getClassLoader(Context context, IlIlllIIlI1 ilIlllIIlI1) {
        this.f189llllIIIIll1 = context;
        this.f190lIIIIlllllIlll1 = ilIlllIIlI1;
        this.f191llllIllIl1 = new IlIlIIlIII1.getWebViewProvider(ilIlllIIlI1.decrypt(), ilIlllIIlI1.isEnabled());
    }

    public void llllllIlIIIlll1() {
        Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1."Starting signaling exchange");
        getClassLoader();
    }

    public void initialize() {
        Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1."Stopping signaling exchange");
        this.f191llllIllIl1.getWebViewProvider();
    }

    public void IlIllIlllIllI1() {
        decrypt(IlIlllIIlI1.IllIIlIIII1."ping");
    }

    public boolean isEnabled() {
        return this.f191llllIllIl1.decrypt();
    }

    @Deprecated
    public void IlIlllIIlI1() {
        decrypt();
    }

    public void getWebViewProvider() {
        Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{-55, 125, -6, -55, -76, -4, 83, 34, -6, 122, -3, -38, -3, -50, 86, 44, -18, 114, -1, -44, -77, -6, 31, 24, -60, 88}, new byte[]{Byte.MIN_VALUE, 19, -109, -67, -35, -99, 63, 75}));
        this.f195llllllIlIIIlll1 = llllllIlIIIlll1.llllIIIIll1.decrypt();
    }

    public void getClassLoader(String message, String logMessage) {
        decrypt(new SignalingRequest.Content.SdpOffer(new SDPOffer(message, logMessage)));
    }

    public void decrypt(IlIllIlllIllI1 ilIllIlllIllI1) {
        this.f194IlIllIlllIllI1 = ilIllIlllIllI1;
    }

    public void decrypt(IllIIlIIII1 illIIlIIII1) {
        this.f192IllIIlIIII1.execute(new RunnableC0005lIIIIlllllIlll1(illIIlIIII1));
    }

    public void decrypt(String message, String logMessage) {
        decrypt(new SignalingRequest.Content.SdpAnswer(new SDPAnswer(message, logMessage)));
    }

    public void getClassLoader(double d, double d2) {
        decrypt(new SignalingRequest.Content.Control(new ControlCommand.Scroll(new ScrollEvent(d, d2))));
    }

    public void decrypt(String message, String logMessage, int i) {
        decrypt(new SignalingRequest.Content.IceCandidate(new ICECandidate(message, logMessage, i)));
    }

    /* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1$llllIIIIll1.class */
    public class llllIIIIll1 implements IllIIlIIII1.IlIlllIIlI1 {
        public decrypt() {
        }

        @Override // IlIlIIlIII1.IllIIlIIII1.IlIlllIIlI1
        public void decrypt() {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.i("SignalingSDK", "Signaling connected");
            if (lIIIIlllllIlll1.this.f194IlIllIlllIllI1 != null) {
                lIIIIlllllIlll1.this.f194IlIllIlllIllI1.getClass();
            }
        }

        @Override // IlIlIIlIII1.IllIIlIIII1.IlIlllIIlI1
        public void decrypt(SignalingResponse signalingResponse) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.v("SignalingSDK", lllliiiill1.decrypt(new byte[]{-125, -43, -68, -17, -13, -83, -60, Byte.MAX_VALUE, -15, -61, -74, -19, -12, -70, -51, 114, -65, -41, -1, -8, -1, -88, -47, 116, -65, -61, -70}, new byte[]{-47, -80, -33, -118, -102, -37, -95, 27}));
            lIIIIlllllIlll1.this.decrypt(signalingResponse);
        }

        @Override // IlIlIIlIII1.IllIIlIIII1.IlIlllIIlI1
        public void decrypt(int i, String message, boolean result) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.i("SignalingSDK", "Signaling disconnected: code=" + i + ", reason=" + message + ", remote=" + result);
            if (lIIIIlllllIlll1.this.f194IlIllIlllIllI1 != null) {
                lIIIIlllllIlll1.this.f194IlIllIlllIllI1.getClass();
            }
        }

        @Override // IlIlIIlIII1.IllIIlIIII1.IlIlllIIlI1
        public void decrypt(Exception exc) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.e("SignalingSDK", "Signaling error", exc);
            if (lIIIIlllllIlll1.this.f194IlIllIlllIllI1 != null) {
                lIIIIlllllIlll1.this.f194IlIllIlllIllI1.decrypt(exc);
            }
        }
    }

    public void getClassLoader(String message) {
        decrypt(new SignalingRequest.Content.Control(new ControlCommand.Input(new TextInput(message))));
    }

    public void decrypt(double d, double d2) {
        decrypt(new SignalingRequest.Content.Control(new ControlCommand.Click(new ClickEvent(d, d2))));
    }

    public void getClassLoader() {
        if (this.f196IlIlIIlIII1) {
            Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{61, 94, -73, 47, -30, -16, -60, 86, 10, Byte.MAX_VALUE, -113, 123, -25, -2, -50, 19, 10, 54, -36, 125, -16, -14, -59, 19, 15, 110, -107, 97, -14, -79, -44, 25, 0, 116, -103, 108, -31, -8, -40, 24}, new byte[]{110, 26, -4, 15, -107, -111, -73, 118}));
            this.f196IlIlIIlIII1 = false;
        }
        if (this.f191llllIllIl1.decrypt()) {
            return;
        }
        Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{-29, 35, -41, -122, -105, 101, -97, Byte.MAX_VALUE, -64, 102, -37, -70, -116, 38, -105, 117, -38, 40, -48, -74, -116, 99, -112, 54, -108, 53, -63, -76, -118, 114, -99, 116, -45, 102, -58, -68, -97, 104, -107, 118, -35, 40, -46, -11, -99, 126, -105, 114, -43, 40, -46, -80}, new byte[]{-76, 70, -75, -43, -8, 6, -12, 26}));
        this.f191llllIllIl1.decrypt(this.f197lIllIIIlIl1);
    }

    public void decrypt(String message) {
        decrypt(new SignalingRequest.Content.PingMessage(new Ping(message)));
    }

    public void decrypt(String message, UpdateSignalingStatusRequest.Status status, String logMessage, llllllIlIIIlll1 lllllliliiilll1) {
        this.f192IllIIlIIII1.execute(new getWebViewProvider(message, status, logMessage, lllllliliiilll1));
    }

    public void decrypt() {
        Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{-45, -38, -31, 8, -46, Byte.MIN_VALUE, 4, 52, -7, -40, -78, 47, -55, -120, 19, 60, -5, -42, -4, 27, Byte.MIN_VALUE, -68, 57, 22}, new byte[]{-105, -65, -110, 124, -96, -17, 125, 93}));
        this.f196IlIlIIlIII1 = true;
        ScheduledFuture<?> scheduledFuture = this.f193IlIlllIIlI1;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f191llllIllIl1.getClassLoader();
        this.f192IllIIlIIII1.shutdown();
    }

    public final void decrypt(SignalingRequest.Content content) {
        getClassLoader();
        Atom atom = this.f195llllllIlIIIlll1;
        if (atom != null) {
            this.f191llllIllIl1.decrypt(new SignalingRequest(content, atom));
            return;
        }
        throw new IllegalStateException(IlIlllIIlI1.IllIIlIIII1."SDK not initialized");
    }

    public final void decrypt(SignalingResponse signalingResponse) {
        IlIllIlllIllI1 ilIllIlllIllI1;
        if (signalingResponse.getError() != null) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.e(f188IIlIllIIll1, "Received signaling error: " + signalingResponse.getError().getCode() + " " + signalingResponse.getError().getMessage());
            IlIllIlllIllI1 ilIllIlllIllI12 = this.f194IlIllIlllIllI1;
            if (ilIllIlllIllI12 != null) {
                ilIllIlllIllI12.decrypt(new Exception("Signaling error: " + signalingResponse.getError().getCode() + " " + signalingResponse.getError().getMessage()));
                return;
            }
            return;
        }
        if (signalingResponse.getContent() != null) {
            SignalingResponse.Content content = signalingResponse.getContent();
            if (content instanceof SignalingResponse.Content.SdpOffer) {
                SignalingResponse.Content.SdpOffer sdpOffer = (SignalingResponse.Content.SdpOffer) content;
                IlIllIlllIllI1 ilIllIlllIllI13 = this.f194IlIllIlllIllI1;
                if (ilIllIlllIllI13 != null) {
                    ilIllIlllIllI13.decrypt(sdpOffer.getSdpOffer());
                    return;
                }
                return;
            }
            if (content instanceof SignalingResponse.Content.SdpAnswer) {
                SignalingResponse.Content.SdpAnswer sdpAnswer = (SignalingResponse.Content.SdpAnswer) content;
                if (this.f194IlIllIlllIllI1 != null) {
                    sdpAnswer.getSdpAnswer();
                    return;
                }
                return;
            }
            if (content instanceof SignalingResponse.Content.IceCandidate) {
                SignalingResponse.Content.IceCandidate iceCandidate = (SignalingResponse.Content.IceCandidate) content;
                IlIllIlllIllI1 ilIllIlllIllI14 = this.f194IlIllIlllIllI1;
                if (ilIllIlllIllI14 != null) {
                    ilIllIlllIllI14.decrypt(iceCandidate.getIceCandidate());
                    return;
                }
                return;
            }
            if (content instanceof SignalingResponse.Content.Status) {
                SignalingResponse.Content.Status status = (SignalingResponse.Content.Status) content;
                if (this.f194IlIllIlllIllI1 != null) {
                    status.getStatus();
                    return;
                }
                return;
            }
            if (content instanceof SignalingResponse.Content.PongMessage) {
                SignalingResponse.Content.PongMessage pongMessage = (SignalingResponse.Content.PongMessage) content;
                IlIllIlllIllI1 ilIllIlllIllI15 = this.f194IlIllIlllIllI1;
                if (ilIllIlllIllI15 != null) {
                    ilIllIlllIllI15.decrypt(pongMessage.getPong());
                    return;
                }
                return;
            }
            if (!(content instanceof SignalingResponse.Content.DoneMessage) || (ilIllIlllIllI1 = this.f194IlIllIlllIllI1) == null) {
                return;
            }
            ilIllIlllIllI1.getClassLoader();
        }
    }
}
