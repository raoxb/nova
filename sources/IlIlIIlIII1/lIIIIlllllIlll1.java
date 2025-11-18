package IlIlIIlIII1;

import IlIlIIlIII1.IllIIlIIII1;
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
public class lIIIIlllllIlll1 {

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final String f188IIlIllIIll1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-61, -89, 95, -3, -58, -25, -43, 123, -9, -99, 124, -40}, new byte[]{-112, -50, 56, -109, -89, -117, -68, 21});

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
    public final IllIIlIIII1.IlIlllIIlI1 f197lIllIIIlIl1 = new llllIIIIll1();

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final ScheduledExecutorService f192IllIIlIIII1 = Executors.newScheduledThreadPool(2);

    /* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1$IlIllIlllIllI1.class */
    public interface IlIllIlllIllI1 {
        default void llllIIIIll1() {
        }

        default void lIIIIlllllIlll1() {
        }

        default void llllIIIIll1(int i, String str, boolean z) {
        }

        default void llllIIIIll1(SDPOffer sDPOffer) {
        }

        default void llllIIIIll1(SDPAnswer sDPAnswer) {
        }

        default void llllIIIIll1(ICECandidate iCECandidate) {
        }

        default void llllIIIIll1(ConnectionStatus connectionStatus) {
        }

        default void llllIIIIll1(Pong pong) {
        }

        default void llllIIIIll1(Exception exc) {
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

        public IlIlllIIlI1(String str, String str2) {
            this(str, str2, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, true, 30L);
        }

        public String llllIIIIll1() {
            return this.f198llllIIIIll1;
        }

        public String IllIIlIIII1() {
            return this.f199lIIIIlllllIlll1;
        }

        public String llllIllIl1() {
            return this.f200llllIllIl1;
        }

        public boolean IlIlllIIlI1() {
            return this.f201IllIIlIIII1;
        }

        public long lIIIIlllllIlll1() {
            return this.f202IlIlllIIlI1;
        }

        public IlIlllIIlI1(String str, String str2, String str3, boolean z, long j) {
            this.f198llllIIIIll1 = str;
            this.f199lIIIIlllllIlll1 = str2;
            this.f200llllIllIl1 = str3;
            this.f201IllIIlIIII1 = z;
            this.f202IlIlllIIlI1 = j;
        }
    }

    /* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1$IllIIlIIII1.class */
    public interface IllIIlIIII1 {
        void llllIIIIll1(CheckSignalingPluginStartResponse checkSignalingPluginStartResponse, Exception exc);
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
                    this.f203llllIIIIll1.llllIIIIll1(lIIIIlllllIlll1.this.f191llllIllIl1.llllIIIIll1(new CheckSignalingPluginStartRequest(lIIIIlllllIlll1.this.f195llllllIlIIIlll1)), null);
                    return;
                }
                byte[] bArr = new byte[19];
                bArr[0] = -26;
                bArr[1] = -12;
                bArr[2] = -4;
                bArr[3] = -118;
                bArr[4] = -61;
                bArr[5] = 85;
                bArr[6] = 40;
                bArr[7] = -49;
                bArr[8] = -36;
                bArr[9] = -34;
                bArr[10] = -34;
                bArr[11] = -34;
                bArr[12] = -60;
                bArr[13] = 91;
                bArr[14] = 48;
                bArr[15] = -122;
                bArr[16] = -49;
                bArr[17] = -43;
                bArr[18] = -45;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -75;
                bArr2[1] = -80;
                bArr2[2] = -73;
                bArr2[3] = -86;
                bArr2[4] = -83;
                bArr2[5] = 58;
                bArr2[6] = 92;
                bArr2[7] = -17;
                throw new IllegalStateException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2));
            } catch (Exception e) {
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Log.e(lllliiiill1.llllIIIIll1(new byte[]{103, 122, 26, -30, 30, -92, 106, -127, 83, 64, 57, -57}, new byte[]{52, 19, 125, -116, Byte.MAX_VALUE, -56, 3, -17}), lllliiiill1.llllIIIIll1(new byte[]{120, -23, -55, 18, 62, -37, -94, -120, 81, -88, -61, 22, 62, -36, -23, -36, 78, -28, -43, 25, 50, -47, -94, -113, 74, -23, -46, 10}, new byte[]{62, -120, -96, 126, 91, -65, -126, -4}), e);
                this.f203llllIIIIll1.llllIIIIll1(null, e);
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

        public llllIllIl1(String str, UpdateSignalingStatusRequest.Status status, String str2, llllllIlIIIlll1 lllllliliiilll1) {
            this.f206llllIIIIll1 = str;
            this.f207lIIIIlllllIlll1 = status;
            this.f208llllIllIl1 = str2;
            this.f209IllIIlIIII1 = lllllliliiilll1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (lIIIIlllllIlll1.this.f195llllllIlIIIlll1 != null) {
                    this.f209IllIIlIIII1.llllIIIIll1(lIIIIlllllIlll1.this.f191llllIllIl1.llllIIIIll1(new UpdateSignalingStatusRequest(lIIIIlllllIlll1.this.f195llllllIlIIIlll1, this.f206llllIIIIll1, this.f207lIIIIlllllIlll1, this.f208llllIllIl1)), null);
                    return;
                }
                byte[] bArr = new byte[19];
                bArr[0] = 14;
                bArr[1] = -77;
                bArr[2] = -90;
                bArr[3] = 43;
                bArr[4] = -117;
                bArr[5] = 101;
                bArr[6] = -118;
                bArr[7] = -111;
                bArr[8] = 52;
                bArr[9] = -103;
                bArr[10] = -124;
                bArr[11] = Byte.MAX_VALUE;
                bArr[12] = -116;
                bArr[13] = 107;
                bArr[14] = -110;
                bArr[15] = -40;
                bArr[16] = 39;
                bArr[17] = -110;
                bArr[18] = -119;
                byte[] bArr2 = new byte[8];
                bArr2[0] = 93;
                bArr2[1] = -9;
                bArr2[2] = -19;
                bArr2[3] = 11;
                bArr2[4] = -27;
                bArr2[5] = 10;
                bArr2[6] = -2;
                bArr2[7] = -79;
                throw new IllegalStateException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2));
            } catch (Exception e) {
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                Log.e(lllliiiill1.llllIIIIll1(new byte[]{-49, 30, -84, 65, -76, -45, -7, 57, -5, 36, -113, 100}, new byte[]{-100, 119, -53, 47, -43, -65, -112, 87}), lllliiiill1.llllIIIIll1(new byte[]{-85, -104, 5, 8, 5, -53, 4, 6, -126, -39, 25, 20, 4, -50, 80, 23, -51, -118, 5, 3, 14, -50, 72, 27, -125, -98, 76, 23, 20, -50, 80, 7, -98}, new byte[]{-19, -7, 108, 100, 96, -81, 36, 114}), e);
                this.f209IllIIlIIII1.llllIIIIll1(null, e);
            }
        }
    }

    /* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1$llllllIlIIIlll1.class */
    public interface llllllIlIIIlll1 {
        void llllIIIIll1(UpdateSignalingStatusResponse updateSignalingStatusResponse, Exception exc);
    }

    public lIIIIlllllIlll1(Context context, IlIlllIIlI1 ilIlllIIlI1) {
        this.f189llllIIIIll1 = context;
        this.f190lIIIIlllllIlll1 = ilIlllIIlI1;
        this.f191llllIllIl1 = new IlIlIIlIII1.llllIllIl1(ilIlllIIlI1.llllIIIIll1(), ilIlllIIlI1.IllIIlIIII1());
    }

    public void llllllIlIIIlll1() {
        Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{75, -28, 102, 15, -44, -62, -63, 46, 56, -29, 110, 26, -50, -54, -61, 32, 118, -9, 39, 24, -40, -56, -57, 40, 118, -9, 98}, new byte[]{24, -112, 7, 125, -96, -85, -81, 73}));
        lIIIIlllllIlll1();
    }

    public void IlIlIIlIII1() {
        Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-93, 99, -59, 63, -36, 20, -32, 90, -48, 100, -61, 40, -62, 28, -30, 84, -98, 112, -118, 42, -44, 30, -26, 92, -98, 112, -49}, new byte[]{-16, 23, -86, 79, -84, 125, -114, 61}));
        this.f191llllIllIl1.llllIllIl1();
    }

    public void IlIllIlllIllI1() {
        llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-62, -57, 35, -32}, new byte[]{-78, -82, 77, -121, -28, -126, -4, -66}));
    }

    public boolean IllIIlIIII1() {
        return this.f191llllIllIl1.llllIIIIll1();
    }

    @Deprecated
    public void IlIlllIIlI1() {
        llllIIIIll1();
    }

    public void llllIllIl1() {
        Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-55, 125, -6, -55, -76, -4, 83, 34, -6, 122, -3, -38, -3, -50, 86, 44, -18, 114, -1, -44, -77, -6, 31, 24, -60, 88}, new byte[]{Byte.MIN_VALUE, 19, -109, -67, -35, -99, 63, 75}));
        this.f195llllllIlIIIlll1 = llllllIlIIIlll1.llllIIIIll1.llllIIIIll1();
    }

    public void lIIIIlllllIlll1(String str, String str2) {
        llllIIIIll1(new SignalingRequest.Content.SdpOffer(new SDPOffer(str, str2)));
    }

    public void llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1) {
        this.f194IlIllIlllIllI1 = ilIllIlllIllI1;
    }

    public void llllIIIIll1(IllIIlIIII1 illIIlIIII1) {
        this.f192IllIIlIIII1.execute(new RunnableC0005lIIIIlllllIlll1(illIIlIIII1));
    }

    public void llllIIIIll1(String str, String str2) {
        llllIIIIll1(new SignalingRequest.Content.SdpAnswer(new SDPAnswer(str, str2)));
    }

    public void lIIIIlllllIlll1(double d, double d2) {
        llllIIIIll1(new SignalingRequest.Content.Control(new ControlCommand.Scroll(new ScrollEvent(d, d2))));
    }

    public void llllIIIIll1(String str, String str2, int i) {
        llllIIIIll1(new SignalingRequest.Content.IceCandidate(new ICECandidate(str, str2, i)));
    }

    /* loaded from: classes.jar:IlIlIIlIII1/lIIIIlllllIlll1$llllIIIIll1.class */
    public class llllIIIIll1 implements IllIIlIIII1.IlIlllIIlI1 {
        public llllIIIIll1() {
        }

        @Override // IlIlIIlIII1.IllIIlIIII1.IlIlllIIlI1
        public void llllIIIIll1() {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.i(lllliiiill1.llllIIIIll1(new byte[]{82, 61, -110, -32, 20, -25, 49, 27, 102, 7, -79, -59}, new byte[]{1, 84, -11, -114, 117, -117, 88, 117}), lllliiiill1.llllIIIIll1(new byte[]{-4, 74, 125, -111, -89, 15, -59, -93, -56, 3, 121, -112, -88, 13, -55, -82, -37, 70, 126}, new byte[]{-81, 35, 26, -1, -58, 99, -84, -51}));
            if (lIIIIlllllIlll1.this.f194IlIllIlllIllI1 != null) {
                lIIIIlllllIlll1.this.f194IlIllIlllIllI1.getClass();
            }
        }

        @Override // IlIlIIlIII1.IllIIlIIII1.IlIlllIIlI1
        public void llllIIIIll1(SignalingResponse signalingResponse) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.v(lllliiiill1.llllIIIIll1(new byte[]{32, 38, -26, 42, -108, 104, 65, -11, 20, 28, -59, 15}, new byte[]{115, 79, -127, 68, -11, 4, 40, -101}), lllliiiill1.llllIIIIll1(new byte[]{-125, -43, -68, -17, -13, -83, -60, Byte.MAX_VALUE, -15, -61, -74, -19, -12, -70, -51, 114, -65, -41, -1, -8, -1, -88, -47, 116, -65, -61, -70}, new byte[]{-47, -80, -33, -118, -102, -37, -95, 27}));
            lIIIIlllllIlll1.this.llllIIIIll1(signalingResponse);
        }

        @Override // IlIlIIlIII1.IllIIlIIII1.IlIlllIIlI1
        public void llllIIIIll1(int i, String str, boolean z) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.i(lllliiiill1.llllIIIIll1(new byte[]{-42, 14, -75, 28, 88, 9, -97, -2, -30, 52, -106, 57}, new byte[]{-123, 103, -46, 114, 57, 101, -10, -112}), lllliiiill1.llllIIIIll1(new byte[]{-100, 74, -61, 22, -77, 41, -111, 68, -88, 3, -64, 17, -95, 38, -105, 68, -95, 70, -57, 12, -73, 33, -62, 10, -84, 76, -64, 29, -17}, new byte[]{-49, 35, -92, 120, -46, 69, -8, 42}) + i + lllliiiill1.llllIIIIll1(new byte[]{-28, 23, -53, 106, -116, -16, -106, -71, -11}, new byte[]{-56, 55, -71, 15, -19, -125, -7, -41}) + str + lllliiiill1.llllIIIIll1(new byte[]{79, -29, -89, 39, 25, 19, 18, -109, 94}, new byte[]{99, -61, -43, 66, 116, 124, 102, -10}) + z);
            if (lIIIIlllllIlll1.this.f194IlIllIlllIllI1 != null) {
                lIIIIlllllIlll1.this.f194IlIllIlllIllI1.getClass();
            }
        }

        @Override // IlIlIIlIII1.IllIIlIIII1.IlIlllIIlI1
        public void llllIIIIll1(Exception exc) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.e(lllliiiill1.llllIIIIll1(new byte[]{106, 48, -21, 75, -120, -60, -63, 85, 94, 10, -56, 110}, new byte[]{57, 89, -116, 37, -23, -88, -88, 59}), lllliiiill1.llllIIIIll1(new byte[]{38, -92, 120, -55, 49, 30, -127, -115, 18, -19, 122, -43, 34, 29, -102}, new byte[]{117, -51, 31, -89, 80, 114, -24, -29}), exc);
            if (lIIIIlllllIlll1.this.f194IlIllIlllIllI1 != null) {
                lIIIIlllllIlll1.this.f194IlIllIlllIllI1.llllIIIIll1(exc);
            }
        }
    }

    public void lIIIIlllllIlll1(String str) {
        llllIIIIll1(new SignalingRequest.Content.Control(new ControlCommand.Input(new TextInput(str))));
    }

    public void llllIIIIll1(double d, double d2) {
        llllIIIIll1(new SignalingRequest.Content.Control(new ControlCommand.Click(new ClickEvent(d, d2))));
    }

    public void lIIIIlllllIlll1() {
        if (this.f196IlIlIIlIII1) {
            Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{61, 94, -73, 47, -30, -16, -60, 86, 10, Byte.MAX_VALUE, -113, 123, -25, -2, -50, 19, 10, 54, -36, 125, -16, -14, -59, 19, 15, 110, -107, 97, -14, -79, -44, 25, 0, 116, -103, 108, -31, -8, -40, 24}, new byte[]{110, 26, -4, 15, -107, -111, -73, 118}));
            this.f196IlIlIIlIII1 = false;
        }
        if (this.f191llllIllIl1.llllIIIIll1()) {
            return;
        }
        Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-29, 35, -41, -122, -105, 101, -97, Byte.MAX_VALUE, -64, 102, -37, -70, -116, 38, -105, 117, -38, 40, -48, -74, -116, 99, -112, 54, -108, 53, -63, -76, -118, 114, -99, 116, -45, 102, -58, -68, -97, 104, -107, 118, -35, 40, -46, -11, -99, 126, -105, 114, -43, 40, -46, -80}, new byte[]{-76, 70, -75, -43, -8, 6, -12, 26}));
        this.f191llllIllIl1.llllIIIIll1(this.f197lIllIIIlIl1);
    }

    public void llllIIIIll1(String str) {
        llllIIIIll1(new SignalingRequest.Content.PingMessage(new Ping(str)));
    }

    public void llllIIIIll1(String str, UpdateSignalingStatusRequest.Status status, String str2, llllllIlIIIlll1 lllllliliiilll1) {
        this.f192IllIIlIIII1.execute(new llllIllIl1(str, status, str2, lllllliliiilll1));
    }

    public void llllIIIIll1() {
        Log.i(f188IIlIllIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-45, -38, -31, 8, -46, Byte.MIN_VALUE, 4, 52, -7, -40, -78, 47, -55, -120, 19, 60, -5, -42, -4, 27, Byte.MIN_VALUE, -68, 57, 22}, new byte[]{-105, -65, -110, 124, -96, -17, 125, 93}));
        this.f196IlIlIIlIII1 = true;
        ScheduledFuture<?> scheduledFuture = this.f193IlIlllIIlI1;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f191llllIllIl1.lIIIIlllllIlll1();
        this.f192IllIIlIIII1.shutdown();
    }

    public final void llllIIIIll1(SignalingRequest.Content content) {
        lIIIIlllllIlll1();
        Atom atom = this.f195llllllIlIIIlll1;
        if (atom != null) {
            this.f191llllIllIl1.llllIIIIll1(new SignalingRequest(content, atom));
            return;
        }
        throw new IllegalStateException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-112, 22, -11, -74, -122, -9, -55, -17, -86, 60, -41, -30, -127, -7, -47, -90, -71, 55, -38}, new byte[]{-61, 82, -66, -106, -24, -104, -67, -49}));
    }

    public final void llllIIIIll1(SignalingResponse signalingResponse) {
        IlIllIlllIllI1 ilIllIlllIllI1;
        if (signalingResponse.getError() != null) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Log.e(f188IIlIllIIll1, lllliiiill1.llllIIIIll1(new byte[]{69, 109, -60, -69, -49, -22, -24, 39, 55, 123, -50, -71, -56, -3, -31, 42, 121, 111, -121, -69, -44, -18, -30, 49, 45, 40}, new byte[]{23, 8, -89, -34, -90, -100, -115, 67}) + signalingResponse.getError().getCode() + " " + signalingResponse.getError().getMessage());
            IlIllIlllIllI1 ilIllIlllIllI12 = this.f194IlIllIlllIllI1;
            if (ilIllIlllIllI12 != null) {
                ilIllIlllIllI12.llllIIIIll1(new Exception(lllliiiill1.llllIIIIll1(new byte[]{-111, 105, 1, -122, -22, -11, -126, -46, -91, 32, 3, -102, -7, -10, -103, -122, -30}, new byte[]{-62, 0, 102, -24, -117, -103, -21, -68}) + signalingResponse.getError().getCode() + " " + signalingResponse.getError().getMessage()));
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
                    ilIllIlllIllI13.llllIIIIll1(sdpOffer.getSdpOffer());
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
                    ilIllIlllIllI14.llllIIIIll1(iceCandidate.getIceCandidate());
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
                    ilIllIlllIllI15.llllIIIIll1(pongMessage.getPong());
                    return;
                }
                return;
            }
            if (!(content instanceof SignalingResponse.Content.DoneMessage) || (ilIllIlllIllI1 = this.f194IlIllIlllIllI1) == null) {
                return;
            }
            ilIllIlllIllI1.lIIIIlllllIlll1();
        }
    }
}
