package llIIIIlIlllIII1;

import IlIlIIlIII1.lIIIIlllllIlll1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Log;
import c13.nim5.ez8.h5_proto.signaling.ICECandidate;
import c13.nim5.ez8.h5_proto.signaling.Pong;
import c13.nim5.ez8.h5_proto.signaling.SDPOffer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.CapturerObserver;
import org.webrtc.DataChannel;
import org.webrtc.DefaultVideoDecoderFactory;
import org.webrtc.DefaultVideoEncoderFactory;
import org.webrtc.EglBase;
import org.webrtc.IceCandidate;
import org.webrtc.IceCandidateErrorEvent;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

@SourceDebugExtension({"SMAP\nWebviewRtc.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewRtc.kt\ncom/nied/lduvv/rtc/WebviewRtc\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1986:1\n1251#2,2:1987\n1863#3,2:1989\n*S KotlinDebug\n*F\n+ 1 WebviewRtc.kt\ncom/nied/lduvv/rtc/WebviewRtc\n*L\n133#1:1987,2\n381#1:1989,2\n*E\n"})
/* loaded from: classes.jar:llIIIIlIlllIII1/IllIIlIIII1.class */
public final class IllIIlIIII1 implements lIIIIlllllIlll1.IlIllIlllIllI1 {
    public static final int lIlIlIlIIl1 = 0;
    public static final boolean lllIlIllI1 = false;
    public static final int llIllIIIlI1 = 0;
    public static final int IIllllIll1 = 1;
    public static final int IIIllllllIIl1 = 2;
    public static final int IIlIlIIIllIIl1 = 3;
    public static final int IllllIl1 = 0;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    @NotNull
    public final String f619llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    @NotNull
    public final lIllIlIll1.llllIIIIll1 f620lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public PeerConnectionFactory f621llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    @Nullable
    public PeerConnection f622IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    @Nullable
    public DataChannel f623IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f624IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    @Nullable
    public VideoSource f625llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    @Nullable
    public VideoTrack f626IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    @Nullable
    public llIIIIlIlllIII1.llllIllIl1 f627lIllIIIlIl1;

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public EglBase.Context f628IIlIllIIll1;

    /* renamed from: IlIllll1, reason: collision with root package name */
    @NotNull
    public final WebView f629IlIllll1;

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<IceCandidate> f630lllllIllIl1;

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public boolean f631IlIIlllllI1;

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public float f632llIIIIlIlllIII1;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public float f633lIllIlIll1;

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public long f634IlIlIIIlIlIlll1;

    /* renamed from: IIIlIllIlI1, reason: collision with root package name */
    public final int f635IIIlIllIlI1;

    /* renamed from: llIIllIl1, reason: collision with root package name */
    public final int f636llIIllIl1;

    /* renamed from: lllIlIIIlI1, reason: collision with root package name */
    public final int f637lllIlIIIlI1;

    /* renamed from: lIlllIIIII1, reason: collision with root package name */
    public final int f638lIlllIIIII1;

    /* renamed from: lIIlIIIIlIlII1, reason: collision with root package name */
    public float f639lIIlIIIIlIlII1;

    /* renamed from: IllIlIllll1, reason: collision with root package name */
    public float f640IllIlIllll1;

    /* renamed from: lIIlllIIIlllII1, reason: collision with root package name */
    public float f641lIIlllIIIlllII1;

    /* renamed from: IllllIllllll1, reason: collision with root package name */
    public int f642IllllIllllll1;

    /* renamed from: IlIIIIllllIlI1, reason: collision with root package name */
    public long f643IlIIIIllllIlI1;

    /* renamed from: lllIlIlllI1, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f644lllIlIlllI1;

    /* renamed from: llIlIIlll1, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f645llIlIIlll1;

    /* renamed from: IIlllllIlll1, reason: collision with root package name */
    @NotNull
    public final Handler f646IIlllllIlll1;

    /* renamed from: IIlIIllll1, reason: collision with root package name */
    @NotNull
    public final ScheduledExecutorService f647IIlIIllll1;

    /* renamed from: IlIIIlIlIlIII1, reason: collision with root package name */
    @Nullable
    public ScheduledFuture<?> f648IlIIIlIlIlIII1;
    public final long IlIIIIIlll1;
    public final int llIIIlIIIlIII1;
    public int IIlIlllllllI1;

    @Nullable
    public ScheduledFuture<?> lIlIIIllll1;
    public final long llIllllIlI1;
    public long lIIIllllllIIII1;

    @Nullable
    public ScheduledFuture<?> lIlIlIlI1;

    @NotNull
    public static final String lIIlIIIllII1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{101, -53, 56, 97, -16, 95, -44}, new byte[]{6, -92, 86, 21, -126, 48, -72, -97});

    @NotNull
    public static final llllIIIIll1 IIIlIllIl1 = new llllIIIIll1(null);

    /* loaded from: classes.jar:llIIIIlIlllIII1/IllIIlIIII1$IlIlllIIlI1.class */
    public static final class IlIlllIIlI1 implements DataChannel.Observer {

        /* loaded from: classes.jar:llIIIIlIlllIII1/IllIIlIIII1$IlIlllIIlI1$llllIIIIll1.class */
        public /* synthetic */ class llllIIIIll1 {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public static final /* synthetic */ int[] f650llllIIIIll1;

            static {
                int[] iArr = new int[DataChannel.State.values().length];
                try {
                    iArr[DataChannel.State.OPEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DataChannel.State.CLOSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DataChannel.State.CLOSING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f650llllIIIIll1 = iArr;
            }
        }

        public IlIlllIIlI1() {
        }

        public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1) {
            if (illIIlIIII1.f644lllIlIlllI1.get()) {
                return;
            }
            PeerConnection peerConnection = illIIlIIII1.f622IllIIlIIII1;
            PeerConnection.IceConnectionState iceConnectionState = peerConnection != null ? peerConnection.iceConnectionState() : null;
            PeerConnection.IceConnectionState iceConnectionState2 = iceConnectionState;
            illIIlIIII1.IlIllll1();
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(new byte[]{-36, 84, -86, -14, -1, -111, 17, -91, -96, 40, -101, -121, -105, -70, 75, -52, -83, 108, -1, -124, -4, -39, 91, -91, -36, 94, -65, 93, 49, 122, 16, -102, -92, 39, -108, -79, -107, -75, 78, -61, -70, 64, 32, 52}, new byte[]{58, -63, 26, 20, 114, 63, -8, 37});
            Objects.toString(iceConnectionState2);
            if (iceConnectionState2 == PeerConnection.IceConnectionState.CONNECTED || iceConnectionState == PeerConnection.IceConnectionState.COMPLETED) {
                return;
            }
            illIIlIIII1.IlIllll1();
            lllliiiill1.llllIIIIll1(new byte[]{79, 41, 103, 12, 13, 52, 44, -103, 51, 85, 86, 121, 101, 45, 119, -4, 44, 15, 62, 125, 45, 126, 125, -115, 65, 3, 73, 12, 14, 63, 34, -109, 31, 90, 87, 107, 101, 38, 71, -4, 17, 4, 56, 86, 12, Byte.MAX_VALUE, 66, -97, 76, 24, 80, 3, 7, 23, 45, -90, 55}, new byte[]{-87, -68, -41, -22, Byte.MIN_VALUE, -102, -59, 25});
            illIIlIIII1.llIIllIl1();
        }

        public void onBufferedAmountChange(long j) {
        }

        public void onStateChange() {
            DataChannel dataChannel = IllIIlIIII1.this.f623IlIlllIIlI1;
            DataChannel.State state = dataChannel != null ? dataChannel.state() : null;
            DataChannel.State state2 = state;
            IllIIlIIII1.this.IlIllll1();
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(new byte[]{67, -13, 31, 121, 13, -2, -126, 74, 63, -113, 46, 12, 103, -38, -35, 44, 37, -25, 74, 16, 24, -75, -25, 92, -97, 70}, new byte[]{-91, 102, -81, -97, Byte.MIN_VALUE, 80, 107, -54});
            Objects.toString(state2);
            int i = state2 == null ? -1 : llllIIIIll1.f650llllIIIIll1[state.ordinal()];
            if (i == 1) {
                IllIIlIIII1.this.IlIllll1();
                lllliiiill1.llllIIIIll1(new byte[]{122, 101, 95, -83, 102, 46, 18, -60, 6, 25, 110, -40, 14, 55, 73, -94, 21, 99, 10, -9, 107}, new byte[]{-100, -16, -17, 75, -21, Byte.MIN_VALUE, -5, 68});
                IllIIlIIII1 illIIlIIII1 = IllIIlIIII1.this;
                illIIlIIII1.IIlIlllllllI1 = 0;
                illIIlIIII1.lIlllIIIII1();
                return;
            }
            if (i == 2 || i == 3) {
                IllIIlIIII1.this.IlIllll1();
                lllliiiill1.llllIIIIll1(new byte[]{34, 100, 23, 54, -49, 69, 49, -90, 94, 24, 38, 67, -89, 92, 106, -61, 65, 66, 78, 71, -17, 13, 80, -80, 34, 92, 4, 53, -34, 67, 61, -93, 119, 24, 48, 125}, new byte[]{-60, -15, -89, -48, 66, -21, -40, 38});
                if (IllIIlIIII1.this.f644lllIlIlllI1.get()) {
                    return;
                }
                Handler handler = new Handler(Looper.getMainLooper());
                IllIIlIIII1 illIIlIIII12 = IllIIlIIII1.this;
                handler.postDelayed(() -> {
                    llllIIIIll1(r1);
                }, 1000L);
            }
        }

        public void onMessage(DataChannel.Buffer buffer) {
            Intrinsics.checkNotNullParameter(buffer, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-24, 17, -87, -92, -25, -96}, new byte[]{-118, 100, -49, -62, -126, -46, 121, -10}));
            IllIIlIIII1.this.llllIIIIll1(buffer);
        }
    }

    @SourceDebugExtension({"SMAP\nWebviewRtc.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewRtc.kt\ncom/nied/lduvv/rtc/WebviewRtc$handleRemoteOffer$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1986:1\n1863#2,2:1987\n*S KotlinDebug\n*F\n+ 1 WebviewRtc.kt\ncom/nied/lduvv/rtc/WebviewRtc$handleRemoteOffer$1$1\n*L\n1845#1:1987,2\n*E\n"})
    /* renamed from: llIIIIlIlllIII1.IllIIlIIII1$IllIIlIIII1, reason: collision with other inner class name */
    /* loaded from: classes.jar:llIIIIlIlllIII1/IllIIlIIII1$IllIIlIIII1.class */
    public static final class C0014IllIIlIIII1 implements SdpObserver {
        public C0014IllIIlIIII1() {
        }

        public void onCreateSuccess(SessionDescription sessionDescription) {
        }

        public void onSetSuccess() {
            IllIIlIIII1.this.IlIllll1();
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(new byte[]{-87, -25, -103, -54, 82, 19, 79, -26, -99, -28, -111, -41, 6, 5, 10, -3, -37, -15, -127, -58, 69, 19, 28, -6, -99, -9, -104, -55, 95}, new byte[]{-5, -126, -12, -91, 38, 118, 111, -119});
            IllIIlIIII1.this.IlIlIIlIII1();
            if (IllIIlIIII1.this.f630lllllIllIl1.isEmpty()) {
                IllIIlIIII1.this.IlIllll1();
                lllliiiill1.llllIIIIll1(new byte[]{-81, -2, 46, 24, -28, -74, -85, -56, -38, -87, 34, 102, -97, -91, -56, 61, 10, 9, 106, 126, -31, -42, -52, -3, -95, -52, 10, 23, -28, -65, -92, -46, -56, -87, 53, 106, -97, -85, -28}, new byte[]{73, 76, -113, -2, 120, 63, 76, 116});
                return;
            }
            IllIIlIIII1.this.IlIllll1();
            lllliiiill1.llllIIIIll1(new byte[]{111, -72, 90, -67, 43, -90, 5, 31, 30, -29, 78, -16, -84}, new byte[]{-118, 4, -38, 88, -116, 45, -32, -91});
            IllIIlIIII1.this.f630lllllIllIl1.size();
            lllliiiill1.llllIIIIll1(new byte[]{-5, -13, 66, -34, -16, -28, -70, -90, 118, -113, 29, -18, -109, 17, 106, 6, 62, -105, 99, -99, -105, -47, -63, -61, 94}, new byte[]{-37, 23, -6, 116, 23, 88, 41, 67});
            IllIIlIIII1 illIIlIIII1 = IllIIlIIII1.this;
            for (IceCandidate iceCandidate : illIIlIIII1.f630lllllIllIl1) {
                try {
                    PeerConnection peerConnection = illIIlIIII1.f622IllIIlIIII1;
                    if (!Intrinsics.areEqual(peerConnection != null ? Boolean.valueOf(peerConnection.addIceCandidate(iceCandidate)) : null, Boolean.TRUE)) {
                        String IlIllll12 = illIIlIIII1.IlIllll1();
                        StringBuilder sb = new StringBuilder();
                        byte[] bArr = new byte[26];
                        bArr[0] = -100;
                        bArr[1] = 32;
                        bArr[2] = 19;
                        bArr[3] = 88;
                        bArr[4] = 120;
                        bArr[5] = 66;
                        bArr[6] = 19;
                        bArr[7] = 116;
                        bArr[8] = 63;
                        bArr[9] = 114;
                        bArr[10] = 40;
                        bArr[11] = 36;
                        bArr[12] = 27;
                        bArr[13] = 98;
                        bArr[14] = -45;
                        bArr[15] = -33;
                        bArr[16] = -6;
                        bArr[17] = 18;
                        bArr[18] = 77;
                        bArr[19] = 25;
                        bArr[20] = 67;
                        bArr[21] = 10;
                        bArr[22] = -18;
                        bArr[23] = -110;
                        bArr[24] = 64;
                        bArr[25] = -73;
                        byte[] bArr2 = new byte[8];
                        bArr2[0] = 122;
                        bArr2[1] = -105;
                        bArr2[2] = -88;
                        bArr2[3] = -67;
                        bArr2[4] = -14;
                        bArr2[5] = -30;
                        bArr2[6] = 90;
                        bArr2[7] = 55;
                        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, IlIllll12, sb.append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2)).append(iceCandidate.sdp).toString());
                    }
                } catch (Exception e) {
                    String IlIllll13 = illIIlIIII1.IlIllll1();
                    IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll13, lllliiiill12.llllIIIIll1(new byte[]{123, 101, -33, 116, 37, -2, 96, -124, -40, 55, -28, 8, 70, -34, -96, 47, 29, 87, -127, 45, 45, -69, -111, Byte.MAX_VALUE, -89, -14}, new byte[]{-99, -46, 100, -111, -81, 94, 41, -57}) + e.getMessage() + lllliiiill12.llllIIIIll1(new byte[]{-2, 91, 120, -68, -40, -16, -87, 98, 58, -5, 24, 6, 97}, new byte[]{-46, 123, -99, 60, 65, 25, 41, -21}) + iceCandidate.sdp);
                }
            }
            IllIIlIIII1.this.IlIllll1();
            IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill13.llllIIIIll1(new byte[]{-125, -88, 73, 113, -71, 120, -40, -79, -11, -9, 112, 14, 100, -109, 122, -24, -26, -117, 52, 22, -92, 56, -65, -120, -125, -68, 81, 112, -91, 64, 5, 45, Byte.MIN_VALUE, -102, 77, 115, -89, 79, 2}, new byte[]{102, 18, -35, -106, 45, -48, 63, 13});
            lllliiiill13.llllIIIIll1(new byte[]{-29, -84, 117, -86, -89, 43, 8, 13, -14}, new byte[]{-49, -116, -112, 14, 22, -61, -68, -88});
            IllIIlIIII1.this.f630lllllIllIl1.clear();
        }

        public void onCreateFailure(String str) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IllIIlIIII1.this.IlIllll1(), llllIIIIll1.llllIIIIll1.llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1, new byte[]{98, 18, -61, 103, -120, 19, -64, -49, -12, -19, 61, -16, -42, 13, 48, 73, 51, 63, 98, -94}, new byte[]{-121, -102, 88, -126, 51, -87, -127, -95}, new StringBuilder(), str));
            IllIIlIIII1.this.llIIllIl1();
        }

        public void onSetFailure(String str) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IllIIlIIII1.this.IlIllll1(), llllIIIIll1.llllIIIIll1.llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1, new byte[]{-46, -73, 110, 56, 33, Byte.MIN_VALUE, 58, 18, -90, -2, 120, 84, 122, -95, 93, 69, -123, -87, 53, 123, 45, -58, 102, 8, 0, 57}, new byte[]{58, 25, -48, -33, -100, 46, -46, -83}, new StringBuilder(), str));
            IllIIlIIII1.this.llIIllIl1();
        }
    }

    /* loaded from: classes.jar:llIIIIlIlllIII1/IllIIlIIII1$lIIIIlllllIlll1.class */
    public static final class lIIIIlllllIlll1 implements SdpObserver {

        /* loaded from: classes.jar:llIIIIlIlllIII1/IllIIlIIII1$lIIIIlllllIlll1$llllIIIIll1.class */
        public static final class llllIIIIll1 implements SdpObserver {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public final /* synthetic */ IllIIlIIII1 f653llllIIIIll1;

            /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
            public final /* synthetic */ SessionDescription f654lIIIIlllllIlll1;

            public llllIIIIll1(IllIIlIIII1 illIIlIIII1, SessionDescription sessionDescription) {
                this.f653llllIIIIll1 = illIIlIIII1;
                this.f654lIIIIlllllIlll1 = sessionDescription;
            }

            public void onCreateSuccess(SessionDescription sessionDescription) {
            }

            public void onSetSuccess() {
                this.f653llllIIIIll1.IlIllll1();
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                lllliiiill1.llllIIIIll1(new byte[]{24, 1, 96, 96, 21, 24, -96, 68, 39, 25, 102, 115, 89, 75, -92, 94, 116, 29, 118, 98, 26, 93, -78, 89, 50, 27, 111, 109, 0}, new byte[]{84, 110, 3, 1, 121, 56, -63, 42});
                IlIlIIlIII1.lIIIIlllllIlll1 IlIlllIIlI12 = IlIlllIIlI1.lIIIIlllllIlll1.IlIllIlllIllI1().IlIlllIIlI1();
                if (IlIlllIIlI12 != null) {
                    IlIlllIIlI12.llllIIIIll1(lllliiiill1.llllIIIIll1(new byte[]{98, 3, 95, -26, 35, -43}, new byte[]{3, 109, 44, -111, 70, -89, -62, 58}), this.f654lIIIIlllllIlll1.description);
                }
                this.f653llllIIIIll1.IlIllll1();
                lllliiiill1.llllIIIIll1(new byte[]{-5, 67, -35, 70, 86, 76, -117, 123, -55, 72, -64, 85, 90, 80}, new byte[]{-88, 38, -77, 34, 63, 34, -20, 91});
                this.f653llllIIIIll1.lIIIllllllIIII1 = SystemClock.elapsedRealtime();
            }

            public void onCreateFailure(String str) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, this.f653llllIIIIll1.IlIllll1(), llllIIIIll1.llllIIIIll1.llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1, new byte[]{13, -114, -5, -121, 13, 5, -43, -76, 68, -29, -4, -46, 80, 48, -68, -64, 87, -74, -123, -58, 7, 87, -121, -115, -46, 38}, new byte[]{-24, 6, 96, 98, -74, -65, 51, 40}, new StringBuilder(), str));
                this.f653llllIIIIll1.llIIllIl1();
            }

            public void onSetFailure(String str) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, this.f653llllIIIIll1.IlIllll1(), llllIIIIll1.llllIIIIll1.llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1, new byte[]{-25, -43, 111, -46, 118, 40, -64, -68, -93, -98, 77, -123, 45, 9, -87, -56, -80, -53, 52, -111, 122, 110, -110, -123, 53, 91}, new byte[]{15, 123, -47, 53, -53, -122, 38, 32}, new StringBuilder(), str));
                this.f653llllIIIIll1.llIIllIl1();
            }
        }

        public lIIIIlllllIlll1() {
        }

        public void onCreateSuccess(SessionDescription sessionDescription) {
            if (sessionDescription == null) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IllIIlIIII1.this.IlIllll1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-66, -10, 10, -9, -29, 96, 40, 86, 100, 125, -62, 58, 99, -74, 124, 54, 75, 61, 67, -96, 97, -87, 94, 56, 97, 4, -99, 56, 60, 124, -72, -78, -109}, new byte[]{-1, -104, 121, Byte.MIN_VALUE, -122, 18, -51, -34}));
                return;
            }
            IllIIlIIII1.this.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-92, 80, -22, -44, -96, -23, 2, -31, 126, -37, 34, 25, 35, 19, 119, -116, 111, -95, -93, -125}, new byte[]{-27, 62, -103, -93, -59, -101, -25, 105});
            Objects.toString(sessionDescription.type);
            IllIIlIIII1 illIIlIIII1 = IllIIlIIII1.this;
            PeerConnection peerConnection = illIIlIIII1.f622IllIIlIIII1;
            if (peerConnection != null) {
                peerConnection.setLocalDescription(new llllIIIIll1(illIIlIIII1, sessionDescription), sessionDescription);
            }
        }

        public void onSetSuccess() {
        }

        public void onCreateFailure(String str) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IllIIlIIII1.this.IlIllll1(), llllIIIIll1.llllIIIIll1.llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1, new byte[]{-108, 120, 64, -29, 15, -61, -22, -105, 2, -121, -66, 116, 81, -35, 26, 17, -59, 85, -31, 38}, new byte[]{113, -16, -37, 6, -76, 121, -85, -7}, new StringBuilder(), str));
            IllIIlIIII1.this.llIIllIl1();
        }

        public void onSetFailure(String str) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IllIIlIIII1.this.IlIllll1(), llllIIIIll1.llllIIIIll1.llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1, new byte[]{-57, 46, -101, 6, 95, 46, -97, -6, 92, -9, 64, -109, 7, 36, 111, 124, -101, 37, 31, -63}, new byte[]{47, Byte.MIN_VALUE, 37, -31, -30, Byte.MIN_VALUE, -34, -108}, new StringBuilder(), str));
            IllIIlIIII1.this.llIIllIl1();
        }
    }

    /* loaded from: classes.jar:llIIIIlIlllIII1/IllIIlIIII1$llllIIIIll1.class */
    public static final class llllIIIIll1 {
        public llllIIIIll1() {
        }

        public llllIIIIll1(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.jar:llIIIIlIlllIII1/IllIIlIIII1$llllIllIl1.class */
    public static final class llllIllIl1 implements PeerConnection.Observer {

        /* loaded from: classes.jar:llIIIIlIlllIII1/IllIIlIIII1$llllIllIl1$llllIIIIll1.class */
        public /* synthetic */ class llllIIIIll1 {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public static final /* synthetic */ int[] f656llllIIIIll1;

            static {
                int[] iArr = new int[PeerConnection.IceConnectionState.values().length];
                try {
                    iArr[PeerConnection.IceConnectionState.CONNECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PeerConnection.IceConnectionState.COMPLETED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PeerConnection.IceConnectionState.FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PeerConnection.IceConnectionState.DISCONNECTED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f656llllIIIIll1 = iArr;
            }
        }

        public llllIllIl1() {
        }

        public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1) {
            try {
                PeerConnection peerConnection = illIIlIIII1.f622IllIIlIIII1;
                if ((peerConnection != null ? peerConnection.iceConnectionState() : null) == PeerConnection.IceConnectionState.FAILED) {
                    illIIlIIII1.IlIllll1();
                    byte[] bArr = new byte[42];
                    bArr[0] = 80;
                    bArr[1] = -24;
                    bArr[2] = -90;
                    bArr[3] = -105;
                    bArr[4] = 112;
                    bArr[5] = 23;
                    bArr[6] = 98;
                    bArr[7] = 97;
                    bArr[8] = -68;
                    bArr[9] = 79;
                    bArr[10] = 88;
                    bArr[11] = -14;
                    bArr[12] = 40;
                    bArr[13] = 13;
                    bArr[14] = 50;
                    bArr[15] = 10;
                    bArr[16] = -67;
                    bArr[17] = 26;
                    bArr[18] = 11;
                    bArr[19] = -53;
                    bArr[20] = 106;
                    bArr[21] = 102;
                    bArr[22] = 56;
                    bArr[23] = 99;
                    bArr[24] = -4;
                    bArr[25] = 5;
                    bArr[26] = 106;
                    bArr[27] = -103;
                    bArr[28] = 65;
                    bArr[29] = 27;
                    bArr[30] = 97;
                    bArr[31] = 65;
                    bArr[32] = -107;
                    bArr[33] = 78;
                    bArr[34] = 102;
                    bArr[35] = -41;
                    bArr[36] = 38;
                    bArr[37] = 14;
                    bArr[38] = 9;
                    bArr[39] = 7;
                    bArr[40] = -90;
                    bArr[41] = 53;
                    byte[] bArr2 = new byte[8];
                    bArr2[0] = 25;
                    bArr2[1] = -85;
                    bArr2[2] = -29;
                    bArr2[3] = Byte.MAX_VALUE;
                    bArr2[4] = -49;
                    bArr2[5] = -119;
                    bArr2[6] = -124;
                    bArr2[7] = -17;
                    IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2);
                    illIIlIIII1.llIIllIl1();
                }
            } catch (Throwable unused) {
            }
        }

        public static final void lIIIIlllllIlll1(IllIIlIIII1 illIIlIIII1) {
            try {
                PeerConnection peerConnection = illIIlIIII1.f622IllIIlIIII1;
                if ((peerConnection != null ? peerConnection.iceConnectionState() : null) == PeerConnection.IceConnectionState.DISCONNECTED) {
                    illIIlIIII1.IlIllll1();
                    byte[] bArr = new byte[39];
                    bArr[0] = -28;
                    bArr[1] = 36;
                    bArr[2] = 20;
                    bArr[3] = 48;
                    bArr[4] = -50;
                    bArr[5] = 26;
                    bArr[6] = -110;
                    bArr[7] = 117;
                    bArr[8] = 8;
                    bArr[9] = -125;
                    bArr[10] = -22;
                    bArr[11] = 85;
                    bArr[12] = -106;
                    bArr[13] = 0;
                    bArr[14] = -62;
                    bArr[15] = 29;
                    bArr[16] = 59;
                    bArr[17] = -54;
                    bArr[18] = -76;
                    bArr[19] = 100;
                    bArr[20] = -15;
                    bArr[21] = 107;
                    bArr[22] = -56;
                    bArr[23] = 119;
                    bArr[24] = 72;
                    bArr[25] = -41;
                    bArr[26] = -52;
                    bArr[27] = 48;
                    bArr[28] = -34;
                    bArr[29] = 17;
                    bArr[30] = -99;
                    bArr[31] = 124;
                    bArr[32] = 32;
                    bArr[33] = -126;
                    bArr[34] = -63;
                    bArr[35] = 119;
                    bArr[36] = 56;
                    bArr[37] = -57;
                    bArr[38] = 49;
                    byte[] bArr2 = new byte[8];
                    bArr2[0] = -83;
                    bArr2[1] = 103;
                    bArr2[2] = 81;
                    bArr2[3] = -40;
                    bArr2[4] = 113;
                    bArr2[5] = -124;
                    bArr2[6] = 116;
                    bArr2[7] = -5;
                    IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2);
                    PeerConnection peerConnection2 = illIIlIIII1.f622IllIIlIIII1;
                    if (peerConnection2 != null) {
                        peerConnection2.restartIce();
                    }
                }
            } catch (Throwable unused) {
            }
        }

        @SuppressLint({"SuspiciousIndentation"})
        public void onIceCandidate(IceCandidate iceCandidate) {
            if (iceCandidate == null) {
                return;
            }
            IllIIlIIII1.this.IlIllll1();
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(new byte[]{99, -96, 9, 35, -29, -41, 74, -49, 41, -47, 35, 118, 75, 21, -55, 63, -28, 77, -97, -113, 40, 34, -116, -74, 5, -83, 86, 70, -30, 93, -116}, new byte[]{-123, 52, -65, -58, 107, 103, -84, 83});
            try {
                IlIlIIlIII1.lIIIIlllllIlll1 IlIlllIIlI12 = IlIlllIIlI1.lIIIIlllllIlll1.IlIllIlllIllI1().IlIlllIIlI1();
                if (IlIlllIIlI12 != null) {
                    IlIlllIIlI12.llllIIIIll1(iceCandidate.sdp, iceCandidate.sdpMid, iceCandidate.sdpMLineIndex);
                }
                IllIIlIIII1.this.IlIllll1();
                byte[] bArr = new byte[50];
                bArr[0] = -120;
                bArr[1] = 62;
                bArr[2] = -51;
                bArr[3] = -118;
                bArr[4] = -92;
                bArr[5] = -91;
                bArr[6] = 95;
                bArr[7] = 74;
                bArr[8] = -1;
                bArr[9] = 95;
                bArr[10] = -35;
                bArr[11] = -18;
                bArr[12] = 14;
                bArr[13] = 72;
                bArr[14] = -33;
                bArr[15] = -87;
                bArr[16] = 15;
                bArr[17] = -49;
                bArr[18] = 125;
                bArr[19] = 38;
                bArr[20] = 109;
                bArr[21] = Byte.MAX_VALUE;
                bArr[22] = -102;
                bArr[23] = 32;
                bArr[24] = -18;
                bArr[25] = 47;
                bArr[26] = -76;
                bArr[27] = -17;
                bArr[28] = -89;
                bArr[29] = -46;
                bArr[30] = 58;
                bArr[31] = 64;
                bArr[32] = -117;
                bArr[33] = 62;
                bArr[34] = -19;
                bArr[35] = -117;
                bArr[36] = -111;
                bArr[37] = -101;
                bArr[38] = 94;
                bArr[39] = 126;
                bArr[40] = -54;
                bArr[41] = 80;
                bArr[42] = -63;
                bArr[43] = -30;
                bArr[44] = -53;
                bArr[45] = -80;
                bArr[46] = 27;
                bArr[47] = 32;
                bArr[48] = -9;
                bArr[49] = 30;
                byte[] bArr2 = new byte[8];
                bArr2[0] = 110;
                bArr2[1] = -74;
                bArr2[2] = 93;
                bArr2[3] = 111;
                bArr2[4] = 46;
                bArr2[5] = 58;
                bArr2[6] = -70;
                bArr2[7] = -59;
                lllliiiill1.llllIIIIll1(bArr, bArr2);
            } catch (Exception e) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IllIIlIIII1.this.IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-125, -9, 25, 53, -40, -119, -1, 125, 37, 61, -88, 57, -40, -111, 54, -76, -17, -112, 8, 89, -67, -84, 110, -36, -46, -35, -78, -4}, new byte[]{102, 120, -120, -36, 88, 8, -33, 52}))));
            }
        }

        public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
            IllIIlIIII1.this.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{116, -40, 26, -100, 93, -97, -31, -92, -67, 18, -73, 30, 19, -8, -33, -10, -44, 2, -5}, new byte[]{61, -101, 95, -68, -72, 31, 120, 77});
        }

        public void onDataChannel(DataChannel dataChannel) {
            IllIIlIIII1.this.IlIllll1();
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(new byte[]{-56, -73, 101, 122, 88, -19, -47, -102, -78, -60, 123, 20, 54, -56, -119, -61, -93, -115, 58, 31, 74, -76, -72, -74, 20, 3}, new byte[]{46, 35, -45, -97, -48, 93, 57, 37});
            if (dataChannel != null) {
                dataChannel.label();
            }
            lllliiiill1.llllIIIIll1(new byte[]{-123, 49, 78, -63, -77, -33, -23, 109, -97, 57}, new byte[]{-91, 25, -87, 75, 5, 57, 105, -20});
            Objects.toString(dataChannel != null ? dataChannel.state() : null);
            if (dataChannel != null) {
                IllIIlIIII1 illIIlIIII1 = IllIIlIIII1.this;
                illIIlIIII1.f623IlIlllIIlI1 = dataChannel;
                illIIlIIII1.lIIlIIIIlIlII1();
            }
        }

        public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
            IllIIlIIII1.this.IlIllll1();
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(new byte[]{100, -10, 49, -118, 112, 124, -25, 15, -93, 16, -109, 32, 46, 37, -7, 104, -56, 58, -20, 79, 20, 85, 67, -55}, new byte[]{45, -75, 116, -86, -104, -61, 121, -23});
            Objects.toString(iceConnectionState);
            switch (iceConnectionState == null ? -1 : llllIIIIll1.f656llllIIIIll1[iceConnectionState.ordinal()]) {
                case 1:
                case 2:
                    IllIIlIIII1.this.IlIllll1();
                    lllliiiill1.llllIIIIll1(new byte[]{-29, 3, -111, 31, -58, 109, 63, -22, 36, -27, 50, -73, -66, 55, 43, -109, -118, 104}, new byte[]{-86, 64, -44, 63, 46, -46, -95, 12});
                    Objects.toString(iceConnectionState);
                    break;
                case 3:
                    IllIIlIIII1.this.IlIllll1();
                    lllliiiill1.llllIIIIll1(new byte[]{6, -8, 47, -44, -7, 108, 26, -114, -22, 94, -50, -115, -82, 70, 89, -17, -13, 55, -113, -116, -37, 26, 83, -107, -90, 60, -25, -39, -42, 93, -75, 67, 10}, new byte[]{79, -69, 106, 60, 70, -14, -4, 0});
                    PeerConnection peerConnection = IllIIlIIII1.this.f622IllIIlIIII1;
                    if (peerConnection != null) {
                        peerConnection.restartIce();
                    }
                    Handler handler = new Handler(Looper.getMainLooper());
                    IllIIlIIII1 illIIlIIII1 = IllIIlIIII1.this;
                    handler.postDelayed(() -> {
                        llllIIIIll1(r1);
                    }, llllllIlIIIlll1.llllIIIIll1.f812llllllIlIIIlll1);
                    break;
                case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                    Handler handler2 = new Handler(Looper.getMainLooper());
                    IllIIlIIII1 illIIlIIII12 = IllIIlIIII1.this;
                    handler2.postDelayed(() -> {
                        lIIIIlllllIlll1(r1);
                    }, IlIlIIlIII1.IllIIlIIII1.f160IlIllll1);
                    break;
            }
        }

        public void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
            IllIIlIIII1.this.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-88, -83, 116, -9, 116, 86, -107, 126, -40, 45, -70, 81, -74, -16, -104, 77, -48, -21, 125, -73, 20, 90, -58, 20, -50, -116, 22, -99, 107, 53, -4, 100, 116, 45}, new byte[]{78, 13, -13, 18, -13, -48, 112, -14});
            Objects.toString(iceConnectionState);
            onIceConnectionChange(iceConnectionState);
        }

        public void onIceConnectionReceivingChange(boolean z) {
            IllIIlIIII1.this.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-3, 82, -17, 110, -61, -28, -91, -58, 58, -76, 76, -64, -114, -67, -81, -106, 83, -101, 28, -88, -85, -38, -34, -81, 44, -12, 38, -40, 17, 123}, new byte[]{-76, 17, -86, 78, 43, 91, 59, 32});
        }

        public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
            IllIIlIIII1.this.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-26, -52, 6, 73, -41, 31, 109, -61, -54, -3, 42, 7, -41, 94, 106, -33, -50, -5, 38, 73, -45, 22, 120, -59, -56, -22, 39, 83, -112}, new byte[]{-81, -113, 67, 105, -80, 126, 25, -85});
            Objects.toString(iceGatheringState);
        }

        public void onSignalingChange(PeerConnection.SignalingState signalingState) {
            IllIIlIIII1.this.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{25, 28, 26, 82, -88, -100, -85, 46, 45, 85, 14, 72, -88, -124, -89, 96, 41, 29, 28, 82, -82, -107, -90, 122, 106}, new byte[]{74, 117, 125, 60, -55, -16, -62, 64});
            Objects.toString(signalingState);
        }

        public void onAddStream(MediaStream mediaStream) {
        }

        public void onRemoveStream(MediaStream mediaStream) {
        }

        public void onRenegotiationNeeded() {
            IllIIlIIII1.this.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-37, -22, 107, 59, -109, -71, -21, -99, -24, -5, 108, 49, -102, -10, -15, -111, -20, -21, 96, 58}, new byte[]{-119, -113, 5, 94, -12, -42, -97, -12});
        }

        public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
            MediaStreamTrack track;
            IllIIlIIII1.this.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{62, -79, -46, 55, -9, 30, -93, -70, 112, -17, -24, 65, 71, -98}, new byte[]{-40, 6, 105, -46, 125, -66, 75, 7});
            if (rtpReceiver == null || (track = rtpReceiver.track()) == null) {
                return;
            }
            track.kind();
        }

        public void onRemoveTrack(RtpReceiver rtpReceiver) {
            MediaStreamTrack track;
            IllIIlIIII1.this.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{46, 40, 2, -7, -20, 120, -126, -89, 97, 102, 56, -125, 79, -4}, new byte[]{-55, -113, -71, 16, 117, -36, 106, 26});
            if (rtpReceiver == null || (track = rtpReceiver.track()) == null) {
                return;
            }
            track.kind();
        }

        /* JADX WARN: Code restructure failed: missing block: B:237:0x0096, code lost:
        
            if (r0.toString() != null) goto L70;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onTrack(org.webrtc.RtpTransceiver r21) {
            /*
                Method dump skipped, instructions count: 1343
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: llIIIIlIlllIII1.IllIIlIIII1.llllIllIl1.onTrack(org.webrtc.RtpTransceiver):void");
        }

        public void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
            IllIIlIIII1.this.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-77, -127, 12, 14, 73, -89, -109, 47, -122, -121, 29, 21, 101, -90, -35, -90, 105, 82, -113, -4, -117, 45, 114, -39, 6, 104, -1, 70, 42}, new byte[]{-29, -28, 105, 124, 10, -56, -3, 65});
            Objects.toString(peerConnectionState);
        }

        public void onIceCandidateError(IceCandidateErrorEvent iceCandidateErrorEvent) {
            String IlIllll12 = IllIIlIIII1.this.IlIllll1();
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll12, lllliiiill1.llllIIIIll1(new byte[]{-43, 98, -73, -69, 106, -92, -29, -47, 21, -55, 114, -37, 3, -87, -109, -71, 51, -114, -56, 126}, new byte[]{-100, 33, -14, 94, -22, 61, 10, 81}) + (iceCandidateErrorEvent != null ? Integer.valueOf(iceCandidateErrorEvent.errorCode) : null) + lllliiiill1.llllIIIIll1(new byte[]{-16, 100, 97}, new byte[]{-48, 73, 65, -121, 27, -115, 121, -70}) + (iceCandidateErrorEvent != null ? iceCandidateErrorEvent.errorText : null));
            if ((iceCandidateErrorEvent == null || iceCandidateErrorEvent.errorCode != 701) && (iceCandidateErrorEvent == null || iceCandidateErrorEvent.errorCode != 702)) {
                return;
            }
            IllIIlIIII1.this.IlIllll1();
            lllliiiill1.llllIIIIll1(new byte[]{-69, 31, -113, 85, 57, -33, -23, 9, -19, 89, -109, 3, 105, -55, -116, 102, -58, 4, -22, 54, 63, -67, -104, 24, -75, 19, -96, 92, 48, -40, -23, 49, -64, 84, -96, 38, 101, -45, -127, 100, -51, 19, 70, -16, -55}, new byte[]{93, -68, 15, -77, -116, 84, 12, -127});
            PeerConnection peerConnection = IllIIlIIII1.this.f622IllIIlIIII1;
            if (peerConnection != null) {
                peerConnection.restartIce();
            }
        }

        public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
            try {
                IllIIlIIII1.this.IlIllll1();
                byte[] bArr = new byte[35];
                bArr[0] = 76;
                bArr[1] = 25;
                bArr[2] = 63;
                bArr[3] = -16;
                bArr[4] = -96;
                bArr[5] = 68;
                bArr[6] = -13;
                bArr[7] = 81;
                bArr[8] = 33;
                bArr[9] = 124;
                bArr[10] = 54;
                bArr[11] = -115;
                bArr[12] = -15;
                bArr[13] = 105;
                bArr[14] = -99;
                bArr[15] = 35;
                bArr[16] = 37;
                bArr[17] = 28;
                bArr[18] = 83;
                bArr[19] = -69;
                bArr[20] = -95;
                bArr[21] = 12;
                bArr[22] = -101;
                bArr[23] = 90;
                bArr[24] = 66;
                bArr[25] = 13;
                bArr[26] = 41;
                bArr[27] = -15;
                bArr[28] = -105;
                bArr[29] = 113;
                bArr[30] = -15;
                bArr[31] = 71;
                bArr[32] = 51;
                bArr[33] = -93;
                bArr[34] = -106;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -91;
                bArr2[1] = -103;
                bArr2[2] = -74;
                bArr2[3] = 20;
                bArr2[4] = 24;
                bArr2[5] = -23;
                bArr2[6] = 20;
                bArr2[7] = -53;
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                lllliiiill1.llllIIIIll1(bArr, bArr2);
                byte[] bArr3 = new byte[4];
                bArr3[0] = 35;
                bArr3[1] = -67;
                bArr3[2] = 29;
                bArr3[3] = 38;
                byte[] bArr4 = new byte[8];
                bArr4[0] = 3;
                bArr4[1] = -112;
                bArr4[2] = 35;
                bArr4[3] = 6;
                bArr4[4] = -13;
                bArr4[5] = 62;
                bArr4[6] = -96;
                bArr4[7] = -127;
                lllliiiill1.llllIIIIll1(bArr3, bArr4);
            } catch (Exception e) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IllIIlIIII1.this.IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-119, 110, 19, 114, -90, -96, -81, 38, -11, 35, 23, 28, -34, -90, -49, 67, -61, 115, 114, 26, -82, -61, -58, 48, -118, 93, 33, 112, -79, -100, -93, 50, -11, -16, -73}, new byte[]{108, -54, -105, -107, 54, 38, 74, -90}))));
            }
        }
    }

    public IllIIlIIII1(@NotNull String str, @NotNull lIllIlIll1.llllIIIIll1 lllliiiill1) {
        IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(str, lllliiiill12.llllIIIIll1(new byte[]{-43, -29}, new byte[]{-68, -121, -127, 101, -25, -112, -39, -5}));
        Intrinsics.checkNotNullParameter(lllliiiill1, lllliiiill12.llllIIIIll1(new byte[]{76, -101, -94, -7, 75, -103, 25, -86}, new byte[]{45, -1, -22, -106, 39, -3, 124, -40}));
        this.f619llllIIIIll1 = str;
        this.f620lIIIIlllllIlll1 = lllliiiill1;
        this.f624IlIllIlllIllI1 = new AtomicBoolean(false);
        WebView webView = lllliiiill1.f546llllIIIIll1;
        Intrinsics.checkNotNullExpressionValue(webView, lllliiiill12.llllIIIIll1(new byte[]{-31, -44, -6, -89, -16, 109, 112}, new byte[]{-106, -79, -104, -15, -103, 8, 7, 50}));
        this.f629IlIllll1 = webView;
        this.f630lllllIllIl1 = new CopyOnWriteArrayList<>();
        this.f635IIIlIllIlI1 = 50;
        this.f637lllIlIIIlI1 = 1;
        this.f638lIlllIIIII1 = 2;
        this.f642IllllIllllll1 = this.f636llIIllIl1;
        this.f644lllIlIlllI1 = new AtomicBoolean(false);
        this.f645llIlIIlll1 = new AtomicBoolean(false);
        this.f646IIlllllIlll1 = new Handler(Looper.getMainLooper());
        this.f647IIlIIllll1 = new ScheduledThreadPoolExecutor(1);
        this.IlIIIIIlll1 = llllllIlIIIlll1.llllIIIIll1.f812llllllIlIIIlll1;
        this.llIIIlIIIlIII1 = 10;
        this.llIllllIlI1 = IlIlIIlIII1.IllIIlIIII1.f162IlIIlllllI1;
        this.lIIIllllllIIII1 = SystemClock.elapsedRealtime();
        IlIlIIlIII1.lIIIIlllllIlll1 IlIlllIIlI12 = IlIlllIIlI1.lIIIIlllllIlll1.IlIllIlllIllI1().IlIlllIIlI1();
        if (IlIlllIIlI12 != null) {
            IlIlllIIlI12.llllIIIIll1(this);
        }
        lllllIllIl1();
        IllllIllllll1();
        lIIlllIIIlllII1();
    }

    public final void lllllIllIl1() {
        if (this.f644lllIlIlllI1.get()) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, IlIllll1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-56, -120, 59, -30, -68, 29, -50, -15, -80, -35, 1, -127, -10, 4, -67, -99, -107, -72, 66, -78, -71, 109, -100, -53, -60, -65, 44, -20, -121, 54, -52, -29, -87, 111, -61, 104, 101, -31, 78, 14, Byte.MAX_VALUE, 76, -59, -17, -67, 22, -49, -57, -90}, new byte[]{45, 56, -90, 10, 19, -120, 43, 121}));
            return;
        }
        Iterator it = ArrayIteratorKt.iterator(new MediaCodecList(1).getCodecInfos());
        while (it.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) it.next();
            if (mediaCodecInfo.isEncoder()) {
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, lllliiiill1.llllIIIIll1(new byte[]{-34, 108, -52, -68}, new byte[]{-106, 94, -6, -120, 74, 120, 73, -101}), lllliiiill1.llllIIIIll1(new byte[]{78, 34, 35, 55, 115, 88, -58, 54, 109, 35, 53, 54, 115, 7, -108}, new byte[]{11, 76, 64, 88, 23, 61, -76, 22}) + mediaCodecInfo.getName());
            } else {
                IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, lllliiiill12.llllIIIIll1(new byte[]{-70, 22, -69, 97}, new byte[]{-14, 36, -115, 85, 65, 71, 121, 9}), lllliiiill12.llllIIIIll1(new byte[]{27, -105, 38, -34, 56, 105, -86, -34, 57, -99, 48, -33, 56, 54, -8}, new byte[]{95, -14, 69, -79, 92, 12, -40, -2}) + mediaCodecInfo.getName());
            }
        }
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, IlIllll1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-27, -74, -75, -91, 76, 68, 28, -111, -40, -101}, new byte[]{-116, -40, -36, -47, 27, 33, 126, -61}));
        lIllIlIll1();
        IlIlllIIlI1.lIIIIlllllIlll1.llllIIIIll1(() -> {
            IIlIllIIll1(r0);
        });
    }

    public final void llIIIIlIlllIII1() {
        EglBase.Context context = this.f628IIlIllIIll1;
        EglBase.Context context2 = context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{124, 71, 80, -117, 73, -32, 4, 36, 118, 78, 72, -84, 80, -25}, new byte[]{25, 32, 60, -55, 40, -109, 97, 103}));
            context2 = null;
        }
        DefaultVideoDecoderFactory defaultVideoDecoderFactory = new DefaultVideoDecoderFactory(context2);
        EglBase.Context context3 = this.f628IIlIllIIll1;
        EglBase.Context context4 = context3;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-103, 114, -43, 36, 36, 55, -61, -56, -109, 123, -51, 3, 61, 48}, new byte[]{-4, 21, -71, 102, 69, 68, -90, -117}));
            context4 = null;
        }
        llIIIIlIlllIII1.lIIIIlllllIlll1 liiiilllllilll1 = new llIIIIlIlllIII1.lIIIIlllllIlll1(defaultVideoDecoderFactory, context4);
        PeerConnectionFactory.Options options = new PeerConnectionFactory.Options();
        EglBase.Context context5 = this.f628IIlIllIIll1;
        EglBase.Context context6 = context5;
        if (context5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{80, 31, -93, 57, -89, -51, 123, -13, 90, 22, -69, 30, -66, -54}, new byte[]{53, 120, -49, 123, -58, -66, 30, -80}));
            context6 = null;
        }
        DefaultVideoEncoderFactory defaultVideoEncoderFactory = new DefaultVideoEncoderFactory(context6, true, true);
        try {
            IlIllll1();
            byte[] bArr = new byte[33];
            bArr[0] = 91;
            bArr[1] = 89;
            bArr[2] = -20;
            bArr[3] = -103;
            bArr[4] = 81;
            bArr[5] = -110;
            bArr[6] = -64;
            bArr[7] = 40;
            bArr[8] = 37;
            bArr[9] = 0;
            bArr[10] = -41;
            bArr[11] = -58;
            bArr[12] = -90;
            bArr[13] = 124;
            bArr[14] = 64;
            bArr[15] = -46;
            bArr[16] = -3;
            bArr[17] = -118;
            bArr[18] = 2;
            bArr[19] = 18;
            bArr[20] = -109;
            bArr[21] = 122;
            bArr[22] = 81;
            bArr[23] = -55;
            bArr[24] = -47;
            bArr[25] = -117;
            bArr[26] = 42;
            bArr[27] = 29;
            bArr[28] = -107;
            bArr[29] = 109;
            bArr[30] = 74;
            bArr[31] = -46;
            bArr[32] = -57;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -66;
            bArr2[1] = -27;
            bArr2[2] = 108;
            bArr2[3] = 124;
            bArr2[4] = -10;
            bArr2[5] = 25;
            bArr2[6] = 37;
            bArr2[7] = -96;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(bArr, bArr2);
            IlIllll1();
            byte[] bArr3 = new byte[13];
            bArr3[0] = 55;
            bArr3[1] = -83;
            bArr3[2] = Byte.MAX_VALUE;
            bArr3[3] = 123;
            bArr3[4] = -27;
            bArr3[5] = 59;
            bArr3[6] = -99;
            bArr3[7] = 34;
            bArr3[8] = 23;
            bArr3[9] = -110;
            bArr3[10] = 71;
            bArr3[11] = 97;
            bArr3[12] = -122;
            byte[] bArr4 = new byte[8];
            bArr4[0] = 114;
            bArr4[1] = -22;
            bArr4[2] = 51;
            bArr4[3] = 91;
            bArr4[4] = -90;
            bArr4[5] = 84;
            bArr4[6] = -13;
            bArr4[7] = 86;
            lllliiiill1.llllIIIIll1(bArr3, bArr4);
            EglBase.Context context7 = this.f628IIlIllIIll1;
            EglBase.Context context8 = context7;
            if (context7 == null) {
                byte[] bArr5 = new byte[14];
                bArr5[0] = 22;
                bArr5[1] = 65;
                bArr5[2] = 78;
                bArr5[3] = -13;
                bArr5[4] = 50;
                bArr5[5] = -49;
                bArr5[6] = 57;
                bArr5[7] = 14;
                bArr5[8] = 28;
                bArr5[9] = 72;
                bArr5[10] = 86;
                bArr5[11] = -44;
                bArr5[12] = 43;
                bArr5[13] = -56;
                byte[] bArr6 = new byte[8];
                bArr6[0] = 115;
                bArr6[1] = 38;
                bArr6[2] = 34;
                bArr6[3] = -79;
                bArr6[4] = 83;
                bArr6[5] = -68;
                bArr6[6] = 92;
                bArr6[7] = 77;
                Intrinsics.throwUninitializedPropertyAccessException(lllliiiill1.llllIIIIll1(bArr5, bArr6));
                context8 = null;
            }
            Objects.toString(context8);
            IlIllll1();
            byte[] bArr7 = new byte[17];
            bArr7[0] = -107;
            bArr7[1] = -107;
            bArr7[2] = -57;
            bArr7[3] = 72;
            bArr7[4] = -18;
            bArr7[5] = 60;
            bArr7[6] = 107;
            bArr7[7] = -27;
            bArr7[8] = -106;
            bArr7[9] = -102;
            bArr7[10] = -57;
            bArr7[11] = 83;
            bArr7[12] = -27;
            bArr7[13] = 43;
            bArr7[14] = 96;
            bArr7[15] = -1;
            bArr7[16] = -16;
            byte[] bArr8 = new byte[8];
            bArr8[0] = -48;
            bArr8[1] = -5;
            bArr8[2] = -92;
            bArr8[3] = 39;
            bArr8[4] = -118;
            bArr8[5] = 89;
            bArr8[6] = 25;
            bArr8[7] = -59;
            lllliiiill1.llllIIIIll1(bArr7, bArr8);
            defaultVideoEncoderFactory.toString();
            IlIllll1();
            byte[] bArr9 = new byte[17];
            bArr9[0] = 58;
            bArr9[1] = -86;
            bArr9[2] = 11;
            bArr9[3] = 72;
            bArr9[4] = -89;
            bArr9[5] = 102;
            bArr9[6] = -121;
            bArr9[7] = -10;
            bArr9[8] = 56;
            bArr9[9] = -82;
            bArr9[10] = 11;
            bArr9[11] = 83;
            bArr9[12] = -84;
            bArr9[13] = 113;
            bArr9[14] = -116;
            bArr9[15] = -20;
            bArr9[16] = 94;
            byte[] bArr10 = new byte[8];
            bArr10[0] = 126;
            bArr10[1] = -49;
            bArr10[2] = 104;
            bArr10[3] = 39;
            bArr10[4] = -61;
            bArr10[5] = 3;
            bArr10[6] = -11;
            bArr10[7] = -42;
            lllliiiill1.llllIIIIll1(bArr9, bArr10);
            this.f621llllIllIl1 = PeerConnectionFactory.builder().setOptions(options).setVideoEncoderFactory(defaultVideoEncoderFactory).setVideoDecoderFactory(liiiilllllilll1).createPeerConnectionFactory();
            IlIllll1();
            byte[] bArr11 = new byte[33];
            bArr11[0] = 116;
            bArr11[1] = -40;
            bArr11[2] = -51;
            bArr11[3] = 95;
            bArr11[4] = 31;
            bArr11[5] = 22;
            bArr11[6] = 30;
            bArr11[7] = -51;
            bArr11[8] = 65;
            bArr11[9] = -34;
            bArr11[10] = -36;
            bArr11[11] = 68;
            bArr11[12] = 51;
            bArr11[13] = 23;
            bArr11[14] = 54;
            bArr11[15] = -62;
            bArr11[16] = 71;
            bArr11[17] = -55;
            bArr11[18] = -57;
            bArr11[19] = 95;
            bArr11[20] = 37;
            bArr11[21] = -100;
            bArr11[22] = -8;
            bArr11[23] = 56;
            bArr11[24] = -63;
            bArr11[25] = 6;
            bArr11[26] = 18;
            bArr11[27] = -53;
            bArr11[28] = -44;
            bArr11[29] = -23;
            bArr11[30] = -107;
            bArr11[31] = 41;
            bArr11[32] = -69;
            byte[] bArr12 = new byte[8];
            bArr12[0] = 36;
            bArr12[1] = -67;
            bArr12[2] = -88;
            bArr12[3] = 45;
            bArr12[4] = 92;
            bArr12[5] = 121;
            bArr12[6] = 112;
            bArr12[7] = -93;
            lllliiiill1.llllIIIIll1(bArr11, bArr12);
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{89, -30, 0, 72, 57, -98, 71, -101, -39, 15, -23, -18, -19, 74, 9, -82, -33, 30, -14, -62, -20, 98, 6, -88, -56, 5, -23, -44, -94, -63, -61, 122, 84, -34, 62, -105, -94}, new byte[]{-68, 106, -101, -83, -126, 36, 103, -53}))));
            e.printStackTrace();
            throw e;
        }
    }

    public final void IlIIlllllI1() {
        RtpSender rtpSender;
        this.f627lIllIIIlIl1 = new llIIIIlIlllIII1.llllIllIl1();
        PeerConnectionFactory peerConnectionFactory = this.f621llllIllIl1;
        PeerConnectionFactory peerConnectionFactory2 = peerConnectionFactory;
        if (peerConnectionFactory == null) {
            Intrinsics.throwUninitializedPropertyAccessException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-81, -80, -121, -2, 111, 82, 38, 13, -70, -74, -106, -27, 67, 83, 14, 2, -68, -95, -115, -2, 85}, new byte[]{-33, -43, -30, -116, 44, 61, 72, 99}));
            peerConnectionFactory2 = null;
        }
        this.f625llllllIlIIIlll1 = peerConnectionFactory2.createVideoSource(false);
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String llllIIIIll12 = lllliiiill1.llllIIIIll1(new byte[]{16, 97, -76, -54, 13, 56, 50, -114, 59, 114, -95, -33, 28}, new byte[]{83, 0, -60, -66, 120, 74, 87, -38});
        EglBase.Context context = this.f628IIlIllIIll1;
        EglBase.Context context2 = context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(lllliiiill1.llllIIIIll1(new byte[]{-59, 50, -58, -27, 65, -89, 81, -96, -49, 59, -34, -62, 88, -96}, new byte[]{-96, 85, -86, -89, 32, -44, 52, -29}));
            context2 = null;
        }
        SurfaceTextureHelper create = SurfaceTextureHelper.create(llllIIIIll12, context2);
        llIIIIlIlllIII1.llllIllIl1 llllillil1 = this.f627lIllIIIlIl1;
        Intrinsics.checkNotNull(llllillil1);
        Intrinsics.checkNotNull(create);
        Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1();
        Intrinsics.checkNotNull(llllIllIl12);
        VideoSource videoSource = this.f625llllllIlIIIlll1;
        Intrinsics.checkNotNull(videoSource);
        CapturerObserver capturerObserver = videoSource.getCapturerObserver();
        Intrinsics.checkNotNullExpressionValue(capturerObserver, lllliiiill1.llllIIIIll1(new byte[]{-96, 76, -76, 48, 49, -119, 27, -121, -75, 76, -78, 60, 50, -118, 10, Byte.MIN_VALUE, -79, 76, -78, 91, 126, -41, 65, -37}, new byte[]{-57, 41, -64, 115, 80, -7, 111, -14}));
        llllillil1.initialize(create, llllIllIl12, capturerObserver);
        llIIIIlIlllIII1.llllIllIl1 llllillil12 = this.f627lIllIIIlIl1;
        Intrinsics.checkNotNull(llllillil12);
        Context IllIIlIIII12 = IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.IllIIlIIII1();
        Intrinsics.checkNotNull(IllIIlIIII12);
        llllillil12.llllIIIIll1(IllIIlIIII12, this.f629IlIllll1);
        Context IllIIlIIII13 = IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.IllIIlIIII1();
        Intrinsics.checkNotNull(IllIIlIIII13);
        DisplayMetrics displayMetrics = IllIIlIIII13.getResources().getDisplayMetrics();
        llIIIIlIlllIII1.llllIllIl1 llllillil13 = this.f627lIllIIIlIl1;
        Intrinsics.checkNotNull(llllillil13);
        llllillil13.startCapture(displayMetrics.widthPixels, displayMetrics.heightPixels, 15);
        PeerConnectionFactory peerConnectionFactory3 = this.f621llllIllIl1;
        PeerConnectionFactory peerConnectionFactory4 = peerConnectionFactory3;
        if (peerConnectionFactory3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(lllliiiill1.llllIIIIll1(new byte[]{-37, -37, -81, -24, 40, 125, -45, 117, -50, -35, -66, -13, 4, 124, -5, 122, -56, -54, -91, -24, 18}, new byte[]{-85, -66, -54, -102, 107, 18, -67, 27}));
            peerConnectionFactory4 = null;
        }
        this.f626IlIlIIlIII1 = peerConnectionFactory4.createVideoTrack(lllliiiill1.llllIIIIll1(new byte[]{111, 3, 39, -84, 46, -59, -103, 81, 110, 15, 33, -65, 40}, new byte[]{24, 102, 69, -38, 71, -96, -18, 124}), this.f625llllllIlIIIlll1);
        IlIllll1();
        lllliiiill1.llllIIIIll1(new byte[]{26, -35, -45, 36, 85, 89, 123, -32, 121, -68, -22, 80, 6, 94, 59, -82, 126, -58, -89, 125, 116}, new byte[]{-1, 85, 72, -63, -18, -29, -109, 71});
        try {
            byte[] bArr = new byte[14];
            bArr[0] = -80;
            bArr[1] = 30;
            bArr[2] = -47;
            bArr[3] = -52;
            bArr[4] = -109;
            bArr[5] = 47;
            bArr[6] = -126;
            bArr[7] = -12;
            bArr[8] = -76;
            bArr[9] = 15;
            bArr[10] = -63;
            bArr[11] = -33;
            bArr[12] = -101;
            bArr[13] = 39;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -57;
            bArr2[1] = 123;
            bArr2[2] = -77;
            bArr2[3] = -70;
            bArr2[4] = -6;
            bArr2[5] = 74;
            bArr2[6] = -11;
            bArr2[7] = -39;
            List listOf = CollectionsKt.listOf(lllliiiill1.llllIIIIll1(bArr, bArr2));
            PeerConnection peerConnection = this.f622IllIIlIIII1;
            if (peerConnection != null) {
                VideoTrack videoTrack = this.f626IlIlIIlIII1;
                Intrinsics.checkNotNull(videoTrack);
                rtpSender = peerConnection.addTrack(videoTrack, listOf);
            } else {
                rtpSender = null;
            }
            RtpSender rtpSender2 = rtpSender;
            IlIllll1();
            byte[] bArr3 = new byte[44];
            bArr3[0] = 11;
            bArr3[1] = -14;
            bArr3[2] = 10;
            bArr3[3] = 52;
            bArr3[4] = 12;
            bArr3[5] = 7;
            bArr3[6] = -82;
            bArr3[7] = -106;
            bArr3[8] = 107;
            bArr3[9] = -84;
            bArr3[10] = 19;
            bArr3[11] = 64;
            bArr3[12] = 110;
            bArr3[13] = 26;
            bArr3[14] = -18;
            bArr3[15] = -40;
            bArr3[16] = 108;
            bArr3[17] = -42;
            bArr3[18] = 84;
            bArr3[19] = 89;
            bArr3[20] = 54;
            bArr3[21] = -9;
            bArr3[22] = 35;
            bArr3[23] = 84;
            bArr3[24] = -97;
            bArr3[25] = 6;
            bArr3[26] = -34;
            bArr3[27] = -65;
            bArr3[28] = -24;
            bArr3[29] = -62;
            bArr3[30] = 37;
            bArr3[31] = 69;
            bArr3[32] = -124;
            bArr3[33] = 42;
            bArr3[34] = -33;
            bArr3[35] = 54;
            bArr3[36] = 61;
            bArr3[37] = 52;
            bArr3[38] = -96;
            bArr3[39] = -81;
            bArr3[40] = 113;
            bArr3[41] = -86;
            bArr3[42] = 13;
            bArr3[43] = 75;
            byte[] bArr4 = new byte[8];
            bArr4[0] = -19;
            bArr4[1] = 69;
            bArr4[2] = -79;
            bArr4[3] = -47;
            bArr4[4] = -122;
            bArr4[5] = -89;
            bArr4[6] = 70;
            bArr4[7] = 49;
            lllliiiill1.llllIIIIll1(bArr3, bArr4);
            Objects.toString(rtpSender2);
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-103, 51, -30, 21, 56, 0, -62, 57, -7, 109, -5, 97, 90, 29, -126, 119, -2, 23, -68, 84, 3, 72, -98, 59, 69, -92}, new byte[]{Byte.MAX_VALUE, -124, 89, -16, -78, -96, 42, -98}))));
            e.printStackTrace();
        }
        IllIlIllll1();
    }

    public final void lllIlIIIlI1() {
        this.IIlIlllllllI1 = 0;
        IlIllll1();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllliiiill1.llllIIIIll1(new byte[]{-8, 88, 53, 113, -110, -74, 10, 110, -116, 13, 53, 21, -48, -126, 108, 9, -86, 87}, new byte[]{29, -28, -75, -108, 53, 61, -17, -31});
        try {
            IlIlIIlIII1.lIIIIlllllIlll1 IlIlllIIlI12 = IlIlllIIlI1.lIIIIlllllIlll1.IlIllIlllIllI1().IlIlllIIlI1();
            if (IlIlllIIlI12 != null) {
                IlIlllIIlI12.IlIllIlllIllI1();
            }
            IlIllll1();
            byte[] bArr = new byte[18];
            bArr[0] = 78;
            bArr[1] = 82;
            bArr[2] = -127;
            bArr[3] = -43;
            bArr[4] = -10;
            bArr[5] = -53;
            bArr[6] = 114;
            bArr[7] = -46;
            bArr[8] = 40;
            bArr[9] = 53;
            bArr[10] = -89;
            bArr[11] = -113;
            bArr[12] = -112;
            bArr[13] = -62;
            bArr[14] = 7;
            bArr[15] = -120;
            bArr[16] = 33;
            bArr[17] = 66;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -85;
            bArr2[1] = -35;
            bArr2[2] = 16;
            bArr2[3] = 60;
            bArr2[4] = 118;
            bArr2[5] = 74;
            bArr2[6] = -105;
            bArr2[7] = 109;
            lllliiiill1.llllIIIIll1(bArr, bArr2);
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-74, 11, 95, 59, 106, 73, 119, 17, 61, -29, 40, 100, 98, 46, -90, -41, -74, 32, Byte.MAX_VALUE, 58, 94, 109, 29, 88}, new byte[]{83, -124, -50, -46, -22, -56, 39, 120}))));
            llIIllIl1();
        }
    }

    public final void IllllIllllll1() {
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, IlIllll1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{98, -111, -82, 94, -24, -86, 22, 32, 29, -53, -71, 13, -86, -98, 112, 102, 48, -98, -54, 0, -12, -60, 121, 47}, new byte[]{-121, 45, 46, -69, 79, 33, -13, -114}));
        lllIlIlllI1();
        ScheduledExecutorService scheduledExecutorService = this.f647IIlIIllll1;
        Runnable runnable = () -> {
            lIllIlIll1(r3);
        };
        long j = this.llIllllIlI1;
        this.lIlIIIllll1 = scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, TimeUnit.MILLISECONDS);
    }

    public final void lllIlIlllI1() {
        ScheduledFuture<?> scheduledFuture = this.lIlIIIllll1;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.lIlIIIllll1 = null;
    }

    public final void llIIllIl1() {
        llllIIIIll1(1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{87, -43, -36, -75, -91, -101, -40, -70, 50, -70, -55, -50, -54, -124, -125, -38, 25, -45, -111, -60, -121}, new byte[]{-65, 82, 118, 80, 47, 51, 49, 61}), (Object) null);
    }

    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Exception, llIIIIlIlllIII1.IllIIlIIII1] */
    public final void lIIlIIIIlIlII1() {
        if (this.f623IlIlllIIlI1 == null) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{59, -45, 116, 52, 57, -35, 66, -18, 71, -81, 69, 65, 80, -53, 17, -119, 116, -4, 43, 110, 56, -107, 60, -50, 59, -11, 81, 58, 26, -51, 76, -45, 115}, new byte[]{-35, 70, -60, -46, -76, 115, -85, 110}));
            return;
        }
        IlIllll1();
        IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-50, -31, 112, 77, -11, -120, 21, 120, -106, -87, 67, 4, -95, -90, 105, 4, -89, -36, 33, 22, -60, -61, 78, 126, -61, -58, 67, 77, -62, -112, 21, 109, -89, 117, -18}, new byte[]{38, 79, -50, -86, 72, 38, -13, -19});
        DataChannel dataChannel = this.f623IlIlllIIlI1;
        DataChannel objects = Objects.toString(dataChannel != null ? dataChannel.state() : null);
        try {
            DataChannel dataChannel2 = this.f623IlIlllIIlI1;
            if (dataChannel2 != null) {
                objects = dataChannel2;
                objects.unregisterObserver();
            }
        } catch (Exception e) {
            e.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{25, -42, 89, -30, -90, 109, 108, -65, 89, 62, Byte.MIN_VALUE, 120, 90, -69, -4, 77, -116, -108, 70, -70, -41, 125, 47, -57, 66, -3, 7, -124, -112, 33, 9, -107, 24, -23, 77, -30, -103, 95, 108, -124, 95, -103, 76, -75, -40, 116, 36, 18, -34}, new byte[]{-2, 113, -30, 11, 63, -55, -118, 40});
            objects.getMessage();
        }
        DataChannel dataChannel3 = this.f623IlIlllIIlI1;
        if (dataChannel3 != null) {
            dataChannel3.registerObserver(new IlIlllIIlI1());
        }
        DataChannel dataChannel4 = this.f623IlIlllIIlI1;
        if ((dataChannel4 != null ? dataChannel4.state() : null) == DataChannel.State.OPEN) {
            IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{87, 0, -1, 123, 73, 60, 126, 94, 43, 124, -50, 14, 33, 37, 37, 57, 10, 26, -87, 5, 107, 116, 30, 77, 84, 41, -49, 122, 78, 36, 113, 94, 48, 122, -13, 17, 33, 29, 6, 55, 49, 20, -87, 40, 79, 122, 56, 75, 87, 35, -57, 123, 69, 61}, new byte[]{-79, -107, 79, -99, -60, -110, -105, -34});
            lIlllIIIII1();
        }
    }

    public final void lIlllIIIII1() {
        try {
            DataChannel dataChannel = this.f623IlIlllIIlI1;
            if ((dataChannel != null ? dataChannel.state() : null) == DataChannel.State.OPEN) {
                JSONObject jSONObject = new JSONObject();
                byte[] bArr = new byte[4];
                bArr[0] = -116;
                bArr[1] = -27;
                bArr[2] = -1;
                bArr[3] = Byte.MIN_VALUE;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -8;
                bArr2[1] = -100;
                bArr2[2] = -113;
                bArr2[3] = -27;
                bArr2[4] = -56;
                bArr2[5] = 61;
                bArr2[6] = 50;
                bArr2[7] = -6;
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                String llllIIIIll12 = lllliiiill1.llllIIIIll1(bArr, bArr2);
                byte[] bArr3 = new byte[4];
                bArr3[0] = 40;
                bArr3[1] = 120;
                bArr3[2] = 94;
                bArr3[3] = 125;
                byte[] bArr4 = new byte[8];
                bArr4[0] = 92;
                bArr4[1] = 29;
                bArr4[2] = 45;
                bArr4[3] = 9;
                bArr4[4] = 80;
                bArr4[5] = 61;
                bArr4[6] = 4;
                bArr4[7] = 76;
                jSONObject.put(llllIIIIll12, lllliiiill1.llllIIIIll1(bArr3, bArr4));
                byte[] bArr5 = new byte[7];
                bArr5[0] = -17;
                bArr5[1] = -122;
                bArr5[2] = -92;
                bArr5[3] = 75;
                bArr5[4] = -28;
                bArr5[5] = 85;
                bArr5[6] = 58;
                byte[] bArr6 = new byte[8];
                bArr6[0] = -126;
                bArr6[1] = -29;
                bArr6[2] = -41;
                bArr6[3] = 56;
                bArr6[4] = -123;
                bArr6[5] = 50;
                bArr6[6] = 95;
                bArr6[7] = -24;
                String llllIIIIll13 = lllliiiill1.llllIIIIll1(bArr5, bArr6);
                byte[] bArr7 = new byte[25];
                bArr7[0] = -91;
                bArr7[1] = 70;
                bArr7[2] = -11;
                bArr7[3] = 32;
                bArr7[4] = Byte.MAX_VALUE;
                bArr7[5] = -107;
                bArr7[6] = 62;
                bArr7[7] = 10;
                bArr7[8] = -110;
                bArr7[9] = 75;
                bArr7[10] = -25;
                bArr7[11] = 58;
                bArr7[12] = 49;
                bArr7[13] = -106;
                bArr7[14] = 32;
                bArr7[15] = 69;
                bArr7[16] = -117;
                bArr7[17] = 14;
                bArr7[18] = -43;
                bArr7[19] = 32;
                bArr7[20] = 117;
                bArr7[21] = -126;
                bArr7[22] = 61;
                bArr7[23] = 67;
                bArr7[24] = -126;
                byte[] bArr8 = new byte[8];
                bArr8[0] = -26;
                bArr8[1] = 46;
                bArr8[2] = -108;
                bArr8[3] = 78;
                bArr8[4] = 17;
                bArr8[5] = -16;
                bArr8[6] = 82;
                bArr8[7] = 42;
                jSONObject.put(llllIIIIll13, lllliiiill1.llllIIIIll1(bArr7, bArr8));
                String jSONObject2 = jSONObject.toString();
                byte[] bArr9 = new byte[13];
                bArr9[0] = -68;
                bArr9[1] = 90;
                bArr9[2] = -90;
                bArr9[3] = -79;
                bArr9[4] = 0;
                bArr9[5] = -121;
                bArr9[6] = -54;
                bArr9[7] = 113;
                bArr9[8] = -32;
                bArr9[9] = 27;
                bArr9[10] = -37;
                bArr9[11] = -21;
                bArr9[12] = 91;
                byte[] bArr10 = new byte[8];
                bArr10[0] = -56;
                bArr10[1] = 53;
                bArr10[2] = -11;
                bArr10[3] = -59;
                bArr10[4] = 114;
                bArr10[5] = -18;
                bArr10[6] = -92;
                bArr10[7] = 22;
                Intrinsics.checkNotNullExpressionValue(jSONObject2, lllliiiill1.llllIIIIll1(bArr9, bArr10));
                byte[] bytes = jSONObject2.getBytes(Charsets.UTF_8);
                byte[] bArr11 = new byte[13];
                bArr11[0] = -23;
                bArr11[1] = -76;
                bArr11[2] = 125;
                bArr11[3] = -74;
                bArr11[4] = 3;
                bArr11[5] = 22;
                bArr11[6] = 53;
                bArr11[7] = 11;
                bArr11[8] = -90;
                bArr11[9] = -1;
                bArr11[10] = 39;
                bArr11[11] = -38;
                bArr11[12] = 83;
                byte[] bArr12 = new byte[8];
                bArr12[0] = -114;
                bArr12[1] = -47;
                bArr12[2] = 9;
                bArr12[3] = -12;
                bArr12[4] = 122;
                bArr12[5] = 98;
                bArr12[6] = 80;
                bArr12[7] = 120;
                Intrinsics.checkNotNullExpressionValue(bytes, lllliiiill1.llllIIIIll1(bArr11, bArr12));
                ByteBuffer wrap = ByteBuffer.wrap(bytes);
                DataChannel dataChannel2 = this.f623IlIlllIIlI1;
                if (dataChannel2 != null) {
                    dataChannel2.send(new DataChannel.Buffer(wrap, false));
                }
                IlIllll1();
                byte[] bArr13 = new byte[24];
                bArr13[0] = 76;
                bArr13[1] = -75;
                bArr13[2] = -102;
                bArr13[3] = 95;
                bArr13[4] = Byte.MAX_VALUE;
                bArr13[5] = 60;
                bArr13[6] = -68;
                bArr13[7] = 93;
                bArr13[8] = 34;
                bArr13[9] = -46;
                bArr13[10] = -92;
                bArr13[11] = 35;
                bArr13[12] = 25;
                bArr13[13] = 11;
                bArr13[14] = -46;
                bArr13[15] = 14;
                bArr13[16] = 40;
                bArr13[17] = -107;
                bArr13[18] = -19;
                bArr13[19] = 62;
                bArr13[20] = 111;
                bArr13[21] = 88;
                bArr13[22] = -48;
                bArr13[23] = 119;
                byte[] bArr14 = new byte[8];
                bArr14[0] = -87;
                bArr14[1] = 58;
                bArr14[2] = 11;
                bArr14[3] = -74;
                bArr14[4] = -1;
                bArr14[5] = -67;
                bArr14[6] = 90;
                bArr14[7] = -24;
                lllliiiill1.llllIIIIll1(bArr13, bArr14);
            }
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{11, 41, -19, 52, -108, -120, -75, 92, 101, 78, -45, 72, -14, -65, -37, 15, 111, 9, -103, 121, -91, -31, -25, 76, -44, -122}, new byte[]{-18, -90, 124, -35, 20, 9, 83, -23}))));
        }
    }

    public final void IlIIIIllllIlI1() {
        this.f624IlIllIlllIllI1.set(false);
    }

    public final void IlIlIIIlIlIlll1() {
        this.f629IlIllll1.post(() -> {
            IlIllll1(r1);
        });
    }

    public final void lIIlllIIIlllII1() {
        ScheduledFuture<?> scheduledFuture = this.lIlIlIlI1;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.lIlIlIlI1 = this.f647IIlIIllll1.scheduleWithFixedDelay(() -> {
            llIIIIlIlllIII1(r2);
        }, llllllIlIIIlll1.llllIIIIll1.f812llllllIlIIIlll1, llllllIlIIIlll1.llllIIIIll1.f812llllllIlIIIlll1, TimeUnit.MILLISECONDS);
    }

    public static final void IIlIllIIll1(IllIIlIIII1 illIIlIIII1) {
        try {
            try {
                Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1();
                Intrinsics.checkNotNull(llllIllIl12);
                PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(llllIllIl12).setEnableInternalTracer(false).createInitializationOptions());
                illIIlIIII1.IlIllll1();
                byte[] bArr = new byte[36];
                bArr[0] = -82;
                bArr[1] = -82;
                bArr[2] = 3;
                bArr[3] = 79;
                bArr[4] = 37;
                bArr[5] = -62;
                bArr[6] = -11;
                bArr[7] = Byte.MIN_VALUE;
                bArr[8] = -101;
                bArr[9] = -88;
                bArr[10] = 18;
                bArr[11] = 84;
                bArr[12] = 9;
                bArr[13] = -61;
                bArr[14] = -35;
                bArr[15] = -113;
                bArr[16] = -99;
                bArr[17] = -65;
                bArr[18] = 9;
                bArr[19] = 79;
                bArr[20] = 31;
                bArr[21] = 72;
                bArr[22] = 19;
                bArr[23] = 115;
                bArr[24] = 27;
                bArr[25] = 108;
                bArr[26] = -19;
                bArr[27] = -40;
                bArr[28] = -22;
                bArr[29] = 59;
                bArr[30] = 125;
                bArr[31] = 102;
                bArr[32] = 110;
                bArr[33] = 46;
                bArr[34] = -20;
                bArr[35] = -94;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -2;
                bArr2[1] = -53;
                bArr2[2] = 102;
                bArr2[3] = 61;
                bArr2[4] = 102;
                bArr2[5] = -83;
                bArr2[6] = -101;
                bArr2[7] = -18;
                IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2);
            } catch (Exception e) {
                String IlIllll12 = illIIlIIII1.IlIllll1();
                StringBuilder sb = new StringBuilder();
                byte[] bArr3 = new byte[23];
                bArr3[0] = -12;
                bArr3[1] = 99;
                bArr3[2] = -23;
                bArr3[3] = 20;
                bArr3[4] = 7;
                bArr3[5] = 63;
                bArr3[6] = -117;
                bArr3[7] = -79;
                bArr3[8] = 62;
                bArr3[9] = -29;
                bArr3[10] = 44;
                bArr3[11] = -51;
                bArr3[12] = -74;
                bArr3[13] = -16;
                bArr3[14] = -8;
                bArr3[15] = -36;
                bArr3[16] = 7;
                bArr3[17] = -73;
                bArr3[18] = 99;
                bArr3[19] = -14;
                bArr3[20] = -10;
                bArr3[21] = 70;
                bArr3[22] = 78;
                byte[] bArr4 = new byte[8];
                bArr4[0] = -93;
                bArr4[1] = 6;
                bArr4[2] = -117;
                bArr4[3] = 70;
                bArr4[4] = 83;
                bArr4[5] = 124;
                bArr4[6] = 110;
                bArr4[7] = 57;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll12, sb.append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr3, bArr4)).append(e.getMessage()).toString());
                return;
            } catch (UnsatisfiedLinkError e2) {
                String IlIllll13 = illIIlIIII1.IlIllll1();
                StringBuilder sb2 = new StringBuilder();
                byte[] bArr5 = new byte[62];
                bArr5[0] = 101;
                bArr5[1] = -7;
                bArr5[2] = 74;
                bArr5[3] = 84;
                bArr5[4] = -90;
                bArr5[5] = -33;
                bArr5[6] = 57;
                bArr5[7] = 96;
                bArr5[8] = 80;
                bArr5[9] = -1;
                bArr5[10] = 91;
                bArr5[11] = 79;
                bArr5[12] = -118;
                bArr5[13] = -34;
                bArr5[14] = 17;
                bArr5[15] = 111;
                bArr5[16] = 86;
                bArr5[17] = -24;
                bArr5[18] = 64;
                bArr5[19] = 84;
                bArr5[20] = -100;
                bArr5[21] = 85;
                bArr5[22] = -33;
                bArr5[23] = -109;
                bArr5[24] = -48;
                bArr5[25] = 59;
                bArr5[26] = -92;
                bArr5[27] = -61;
                bArr5[28] = 105;
                bArr5[29] = 38;
                bArr5[30] = -78;
                bArr5[31] = -86;
                bArr5[32] = -124;
                bArr5[33] = 116;
                bArr5[34] = -101;
                bArr5[35] = -125;
                bArr5[36] = 10;
                bArr5[37] = 12;
                bArr5[38] = -37;
                bArr5[39] = -21;
                bArr5[40] = -123;
                bArr5[41] = 1;
                bArr5[42] = -57;
                bArr5[43] = -119;
                bArr5[44] = 112;
                bArr5[45] = 86;
                bArr5[46] = -34;
                bArr5[47] = -123;
                bArr5[48] = -48;
                bArr5[49] = 22;
                bArr5[50] = -121;
                bArr5[51] = -61;
                bArr5[52] = 111;
                bArr5[53] = 16;
                bArr5[54] = -65;
                bArr5[55] = -77;
                bArr5[56] = -120;
                bArr5[57] = 121;
                bArr5[58] = -107;
                bArr5[59] = -75;
                bArr5[60] = -33;
                bArr5[61] = -112;
                byte[] bArr6 = new byte[8];
                bArr6[0] = 53;
                bArr6[1] = -100;
                bArr6[2] = 47;
                bArr6[3] = 38;
                bArr6[4] = -27;
                bArr6[5] = -80;
                bArr6[6] = 87;
                bArr6[7] = 14;
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.WARN, IlIllll13, sb2.append(lllliiiill1.llllIIIIll1(bArr5, bArr6)).append(e2.getMessage()).toString());
                try {
                    byte[] bArr7 = new byte[24];
                    bArr7[0] = 48;
                    bArr7[1] = 27;
                    bArr7[2] = 4;
                    bArr7[3] = 4;
                    bArr7[4] = 82;
                    bArr7[5] = 8;
                    bArr7[6] = -81;
                    bArr7[7] = 49;
                    bArr7[8] = 63;
                    bArr7[9] = 23;
                    bArr7[10] = 24;
                    bArr7[11] = 0;
                    bArr7[12] = 81;
                    bArr7[13] = 3;
                    bArr7[14] = -98;
                    bArr7[15] = 36;
                    bArr7[16] = 57;
                    bArr7[17] = 6;
                    bArr7[18] = 3;
                    bArr7[19] = 12;
                    bArr7[20] = 80;
                    bArr7[21] = 50;
                    bArr7[22] = -125;
                    bArr7[23] = 46;
                    byte[] bArr8 = new byte[8];
                    bArr8[0] = 90;
                    bArr8[1] = 114;
                    bArr8[2] = 106;
                    bArr8[3] = 99;
                    bArr8[4] = 62;
                    bArr8[5] = 109;
                    bArr8[6] = -16;
                    bArr8[7] = 65;
                    System.loadLibrary(lllliiiill1.llllIIIIll1(bArr7, bArr8));
                    illIIlIIII1.IlIllll1();
                    byte[] bArr9 = new byte[42];
                    bArr9[0] = 54;
                    bArr9[1] = -40;
                    bArr9[2] = 103;
                    bArr9[3] = 113;
                    bArr9[4] = 116;
                    bArr9[5] = 34;
                    bArr9[6] = 39;
                    bArr9[7] = -101;
                    bArr9[8] = 112;
                    bArr9[9] = -71;
                    bArr9[10] = 81;
                    bArr9[11] = 41;
                    bArr9[12] = -108;
                    bArr9[13] = -29;
                    bArr9[14] = -84;
                    bArr9[15] = 118;
                    bArr9[16] = -68;
                    bArr9[17] = 52;
                    bArr9[18] = -77;
                    bArr9[19] = -28;
                    bArr9[20] = -101;
                    bArr9[21] = -17;
                    bArr9[22] = -80;
                    bArr9[23] = 114;
                    bArr9[24] = -65;
                    bArr9[25] = 63;
                    bArr9[26] = -126;
                    bArr9[27] = -15;
                    bArr9[28] = -99;
                    bArr9[29] = -2;
                    bArr9[30] = -85;
                    bArr9[31] = 126;
                    bArr9[32] = -66;
                    bArr9[33] = 14;
                    bArr9[34] = -97;
                    bArr9[35] = -5;
                    bArr9[36] = 24;
                    bArr9[37] = 2;
                    bArr9[38] = 82;
                    bArr9[39] = -12;
                    bArr9[40] = 90;
                    bArr9[41] = -50;
                    byte[] bArr10 = new byte[8];
                    bArr10[0] = -48;
                    bArr10[1] = 81;
                    bArr10[2] = -20;
                    bArr10[3] = -108;
                    bArr10[4] = -2;
                    bArr10[5] = -118;
                    bArr10[6] = -62;
                    bArr10[7] = 17;
                    lllliiiill1.llllIIIIll1(bArr9, bArr10);
                    Context IllIIlIIII12 = IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.IllIIlIIII1();
                    Intrinsics.checkNotNull(IllIIlIIII12);
                    PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(IllIIlIIII12).setEnableInternalTracer(true).createInitializationOptions());
                    illIIlIIII1.IlIllll1();
                    byte[] bArr11 = new byte[42];
                    bArr11[0] = 46;
                    bArr11[1] = 40;
                    bArr11[2] = 104;
                    bArr11[3] = 100;
                    bArr11[4] = 111;
                    bArr11[5] = -1;
                    bArr11[6] = -118;
                    bArr11[7] = 15;
                    bArr11[8] = 90;
                    bArr11[9] = 74;
                    bArr11[10] = 66;
                    bArr11[11] = 9;
                    bArr11[12] = 28;
                    bArr11[13] = -61;
                    bArr11[14] = -7;
                    bArr11[15] = -41;
                    bArr11[16] = -94;
                    bArr11[17] = -54;
                    bArr11[18] = -105;
                    bArr11[19] = -63;
                    bArr11[20] = -106;
                    bArr11[21] = 33;
                    bArr11[22] = 1;
                    bArr11[23] = -30;
                    bArr11[24] = -92;
                    bArr11[25] = -37;
                    bArr11[26] = -116;
                    bArr11[27] = -19;
                    bArr11[28] = -105;
                    bArr11[29] = 9;
                    bArr11[30] = 14;
                    bArr11[31] = -28;
                    bArr11[32] = -77;
                    bArr11[33] = -64;
                    bArr11[34] = -105;
                    bArr11[35] = -5;
                    bArr11[36] = 31;
                    bArr11[37] = -57;
                    bArr11[38] = -1;
                    bArr11[39] = 98;
                    bArr11[40] = 77;
                    bArr11[41] = 48;
                    byte[] bArr12 = new byte[8];
                    bArr12[0] = -57;
                    bArr12[1] = -81;
                    bArr12[2] = -27;
                    bArr12[3] = -126;
                    bArr12[4] = -7;
                    bArr12[5] = 79;
                    bArr12[6] = 111;
                    bArr12[7] = -121;
                    lllliiiill1.llllIIIIll1(bArr11, bArr12);
                } catch (Exception e3) {
                    String IlIllll14 = illIIlIIII1.IlIllll1();
                    StringBuilder sb3 = new StringBuilder();
                    byte[] bArr13 = new byte[23];
                    bArr13[0] = 76;
                    bArr13[1] = -47;
                    bArr13[2] = 76;
                    bArr13[3] = -105;
                    bArr13[4] = 112;
                    bArr13[5] = -51;
                    bArr13[6] = -125;
                    bArr13[7] = 10;
                    bArr13[8] = 10;
                    bArr13[9] = -80;
                    bArr13[10] = 122;
                    bArr13[11] = -49;
                    bArr13[12] = 31;
                    bArr13[13] = -33;
                    bArr13[14] = -11;
                    bArr13[15] = 101;
                    bArr13[16] = 14;
                    bArr13[17] = -23;
                    bArr13[18] = 47;
                    bArr13[19] = -58;
                    bArr13[20] = 95;
                    bArr13[21] = 95;
                    bArr13[22] = 70;
                    byte[] bArr14 = new byte[8];
                    bArr14[0] = -86;
                    bArr14[1] = 88;
                    bArr14[2] = -57;
                    bArr14[3] = 114;
                    bArr14[4] = -6;
                    bArr14[5] = 101;
                    bArr14[6] = 102;
                    bArr14[7] = Byte.MIN_VALUE;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll14, sb3.append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr13, bArr14)).append(e3.getMessage()).toString());
                    return;
                }
            }
            Thread.sleep(100L);
            EglBase.Context IIlIllIIll12 = illIIlIIII1.IIlIllIIll1();
            if (IIlIllIIll12 == null) {
                byte[] bArr15 = new byte[6];
                bArr15[0] = 114;
                bArr15[1] = 106;
                bArr15[2] = 72;
                bArr15[3] = -78;
                bArr15[4] = -63;
                bArr15[5] = 41;
                byte[] bArr16 = new byte[8];
                bArr16[0] = 37;
                bArr16[1] = 15;
                bArr16[2] = 42;
                bArr16[3] = -32;
                bArr16[4] = -107;
                bArr16[5] = 106;
                bArr16[6] = 76;
                bArr16[7] = 81;
                IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                String llllIIIIll12 = lllliiiill12.llllIIIIll1(bArr15, bArr16);
                byte[] bArr17 = new byte[27];
                bArr17[0] = 62;
                bArr17[1] = 78;
                bArr17[2] = -17;
                bArr17[3] = 5;
                bArr17[4] = -59;
                bArr17[5] = -67;
                bArr17[6] = -79;
                bArr17[7] = 26;
                bArr17[8] = 30;
                bArr17[9] = 113;
                bArr17[10] = -41;
                bArr17[11] = 5;
                bArr17[12] = 78;
                bArr17[13] = 92;
                bArr17[14] = 104;
                bArr17[15] = -117;
                bArr17[16] = -12;
                bArr17[17] = -97;
                bArr17[18] = 70;
                bArr17[19] = -127;
                bArr17[20] = 23;
                bArr17[21] = 58;
                bArr17[22] = 107;
                bArr17[23] = -53;
                bArr17[24] = -108;
                bArr17[25] = -75;
                bArr17[26] = 34;
                byte[] bArr18 = new byte[8];
                bArr18[0] = 123;
                bArr18[1] = 9;
                bArr18[2] = -93;
                bArr18[3] = 37;
                bArr18[4] = -90;
                bArr18[5] = -46;
                bArr18[6] = -33;
                bArr18[7] = 110;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, llllIIIIll12, lllliiiill12.llllIIIIll1(bArr17, bArr18));
                return;
            }
            byte[] bArr19 = new byte[6];
            bArr19[0] = -117;
            bArr19[1] = -5;
            bArr19[2] = 111;
            bArr19[3] = 84;
            bArr19[4] = 27;
            bArr19[5] = 120;
            byte[] bArr20 = new byte[8];
            bArr20[0] = -36;
            bArr20[1] = -98;
            bArr20[2] = 13;
            bArr20[3] = 6;
            bArr20[4] = 79;
            bArr20[5] = 59;
            bArr20[6] = 52;
            bArr20[7] = 56;
            IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill13.llllIIIIll1(bArr19, bArr20);
            byte[] bArr21 = new byte[26];
            bArr21[0] = -67;
            bArr21[1] = 30;
            bArr21[2] = -48;
            bArr21[3] = 90;
            bArr21[4] = -43;
            bArr21[5] = 22;
            bArr21[6] = 67;
            bArr21[7] = -112;
            bArr21[8] = -20;
            bArr21[9] = 115;
            bArr21[10] = -49;
            bArr21[11] = 41;
            bArr21[12] = Byte.MAX_VALUE;
            bArr21[13] = -52;
            bArr21[14] = -20;
            bArr21[15] = 82;
            bArr21[16] = 123;
            bArr21[17] = -11;
            bArr21[18] = 47;
            bArr21[19] = -47;
            bArr21[20] = 43;
            bArr21[21] = -20;
            bArr21[22] = -45;
            bArr21[23] = 106;
            bArr21[24] = 97;
            bArr21[25] = -74;
            byte[] bArr22 = new byte[8];
            bArr22[0] = 91;
            bArr22[1] = -106;
            bArr22[2] = 64;
            bArr22[3] = -65;
            bArr22[4] = 95;
            bArr22[5] = -119;
            bArr22[6] = -85;
            bArr22[7] = 30;
            lllliiiill13.llllIIIIll1(bArr21, bArr22);
            IIlIllIIll12.toString();
            illIIlIIII1.f628IIlIllIIll1 = IIlIllIIll12;
            try {
                illIIlIIII1.llIIIIlIlllIII1();
                illIIlIIII1.lIllIIIlIl1();
                illIIlIIII1.lllIlIIIlI1();
                illIIlIIII1.IlIIlllllI1();
            } catch (Exception e4) {
                String IlIllll15 = illIIlIIII1.IlIllll1();
                StringBuilder sb4 = new StringBuilder();
                byte[] bArr23 = new byte[30];
                bArr23[0] = 28;
                bArr23[1] = -85;
                bArr23[2] = 47;
                bArr23[3] = 80;
                bArr23[4] = -28;
                bArr23[5] = 44;
                bArr23[6] = -126;
                bArr23[7] = 13;
                bArr23[8] = -16;
                bArr23[9] = 74;
                bArr23[10] = -87;
                bArr23[11] = -71;
                bArr23[12] = 6;
                bArr23[13] = -118;
                bArr23[14] = 42;
                bArr23[15] = 119;
                bArr23[16] = -82;
                bArr23[17] = 105;
                bArr23[18] = -58;
                bArr23[19] = -25;
                bArr23[20] = 60;
                bArr23[21] = -7;
                bArr23[22] = 71;
                bArr23[23] = 78;
                bArr23[24] = -6;
                bArr23[25] = 38;
                bArr23[26] = -7;
                bArr23[27] = -89;
                bArr23[28] = -118;
                bArr23[29] = 79;
                byte[] bArr24 = new byte[8];
                bArr24[0] = 75;
                bArr24[1] = -50;
                bArr24[2] = 77;
                bArr24[3] = 2;
                bArr24[4] = -80;
                bArr24[5] = 111;
                bArr24[6] = -94;
                bArr24[7] = -22;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll15, sb4.append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr23, bArr24)).append(e4.getMessage()).toString());
                illIIlIIII1.llIIllIl1();
            }
        } catch (Exception e5) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, illIIlIIII1.IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e5, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-17, -89, -42, 65, 107, -6, -74, 44, -100, 120, 46, -58, -98, 37, 16, 69, -82, -98, -93, 16, 105, 75, 115}, new byte[]{10, 47, 75, -92, -52, 113, 83, -96}))));
            illIIlIIII1.llIIllIl1();
        }
    }

    public static final void lIllIlIll1(IllIIlIIII1 illIIlIIII1) {
        if (illIIlIIII1.f644lllIlIlllI1.get()) {
            return;
        }
        illIIlIIII1.lllIlIIIlI1();
    }

    public static final void IlIllll1(IllIIlIIII1 illIIlIIII1) {
        if (illIIlIIII1.f629IlIllll1.canGoBack()) {
            illIIlIIII1.f629IlIllll1.goBack();
            illIIlIIII1.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{23, 71, 19, -82, -61, -125, 52, 38, -90, -85, -42, 16, 11, 106, -85, -71, -44, -57, -22, 102, 76, 117, -50, -30, -3, -66}, new byte[]{64, 34, 113, -8, -86, -26, 67, 6});
        } else {
            illIIlIIII1.IlIllll1();
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(new byte[]{3, -109, -3, -86, 57, -68, 39, -120, -78, 97, 63, 26, -29, 76, -72, 23, -64, 19, 4, 98, -65, 101, -36, 77, -29, 68, 120, 71, -33, 63, -56, 7, -77, 90, 51, 24, -24, 89, -71, 9, -31}, new byte[]{84, -10, -97, -4, 80, -39, 80, -88});
            illIIlIIII1.llllIIIIll1(lllliiiill1.llllIIIIll1(new byte[]{-110, 91, -51, 44, 94, 84, -21, -42, -109, 85, -5, 34, 90, 83}, new byte[]{-11, 52, -110, 78, 63, 55, Byte.MIN_VALUE, -119}), lllliiiill1.llllIIIIll1(new byte[]{78, 81, 108, 83, -24, -14, 26, 5, -82, -122, -23, -66, 14, 113, -11, 79, -2, -104, -94, -31, 57, 23, -124, 65, -84, -37, -78, -119, 103, 0, -51, 6, -86, -95, -26, -70, 21, 114, -10, 126}, new byte[]{25, 52, 14, 5, -127, -105, 109, -32}));
        }
    }

    public final void IllIlIllll1() {
        this.f624IlIllIlllIllI1.compareAndSet(false, true);
    }

    public final void IIIlIllIlI1() {
        try {
            if (this.f644lllIlIlllI1.compareAndSet(false, true)) {
                IlIllll1();
                byte[] bArr = new byte[22];
                bArr[0] = 104;
                bArr[1] = 53;
                bArr[2] = 117;
                bArr[3] = 70;
                bArr[4] = 75;
                bArr[5] = 16;
                bArr[6] = 108;
                bArr[7] = 34;
                bArr[8] = -29;
                bArr[9] = -60;
                bArr[10] = -106;
                bArr[11] = -59;
                bArr[12] = -88;
                bArr[13] = -4;
                bArr[14] = 79;
                bArr[15] = 36;
                bArr[16] = 105;
                bArr[17] = 7;
                bArr[18] = 123;
                bArr[19] = 70;
                bArr[20] = 101;
                bArr[21] = 62;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -127;
                bArr2[1] = -78;
                bArr2[2] = -1;
                bArr2[3] = -96;
                bArr2[4] = -33;
                bArr2[5] = -82;
                bArr2[6] = 59;
                bArr2[7] = 71;
                IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2);
                try {
                    ScheduledFuture<?> scheduledFuture = this.f648IlIIIlIlIlIII1;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f648IlIIIlIlIlIII1 = null;
                } catch (Throwable unused) {
                }
                try {
                    lllIlIlllI1();
                } catch (Throwable unused2) {
                }
                try {
                    this.f624IlIllIlllIllI1.set(false);
                } catch (Throwable unused3) {
                }
                try {
                    DataChannel dataChannel = this.f623IlIlllIIlI1;
                    if (dataChannel != null) {
                        dataChannel.close();
                    }
                    this.f623IlIlllIIlI1 = null;
                } catch (Exception e) {
                    String IlIllll12 = IlIllll1();
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr3 = new byte[26];
                    bArr3[0] = 105;
                    bArr3[1] = 125;
                    bArr3[2] = -74;
                    bArr3[3] = -59;
                    bArr3[4] = 21;
                    bArr3[5] = -125;
                    bArr3[6] = 44;
                    bArr3[7] = -104;
                    bArr3[8] = 60;
                    bArr3[9] = 30;
                    bArr3[10] = -120;
                    bArr3[11] = -126;
                    bArr3[12] = 107;
                    bArr3[13] = -82;
                    bArr3[14] = 80;
                    bArr3[15] = -28;
                    bArr3[16] = 13;
                    bArr3[17] = 107;
                    bArr3[18] = -32;
                    bArr3[19] = -120;
                    bArr3[20] = 51;
                    bArr3[21] = -58;
                    bArr3[22] = 126;
                    bArr3[23] = -88;
                    bArr3[24] = -74;
                    bArr3[25] = -40;
                    byte[] bArr4 = new byte[8];
                    bArr4[0] = -116;
                    bArr4[1] = -8;
                    bArr4[2] = 5;
                    bArr4[3] = 44;
                    bArr4[4] = -126;
                    bArr4[5] = 46;
                    bArr4[6] = -54;
                    bArr4[7] = 13;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll12, sb.append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr3, bArr4)).append(e.getMessage()).toString());
                }
                try {
                    PeerConnection peerConnection = this.f622IllIIlIIII1;
                    if (peerConnection != null) {
                        peerConnection.close();
                    }
                    this.f622IllIIlIIII1 = null;
                } catch (Exception e2) {
                    String IlIllll13 = IlIllll1();
                    StringBuilder sb2 = new StringBuilder();
                    byte[] bArr5 = new byte[28];
                    bArr5[0] = -7;
                    bArr5[1] = 18;
                    bArr5[2] = 30;
                    bArr5[3] = 7;
                    bArr5[4] = -125;
                    bArr5[5] = 10;
                    bArr5[6] = -49;
                    bArr5[7] = 115;
                    bArr5[8] = 121;
                    bArr5[9] = -27;
                    bArr5[10] = -18;
                    bArr5[11] = -127;
                    bArr5[12] = 122;
                    bArr5[13] = -55;
                    bArr5[14] = -6;
                    bArr5[15] = 117;
                    bArr5[16] = 104;
                    bArr5[17] = -2;
                    bArr5[18] = -62;
                    bArr5[19] = Byte.MIN_VALUE;
                    bArr5[20] = -15;
                    bArr5[21] = 3;
                    bArr5[22] = 46;
                    bArr5[23] = -2;
                    bArr5[24] = -88;
                    bArr5[25] = 50;
                    bArr5[26] = -105;
                    bArr5[27] = -50;
                    byte[] bArr6 = new byte[8];
                    bArr6[0] = 28;
                    bArr6[1] = -105;
                    bArr6[2] = -83;
                    bArr6[3] = -18;
                    bArr6[4] = 20;
                    bArr6[5] = -89;
                    bArr6[6] = -97;
                    bArr6[7] = 22;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll13, sb2.append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr5, bArr6)).append(e2.getMessage()).toString());
                }
                try {
                    VideoTrack videoTrack = this.f626IlIlIIlIII1;
                    if (videoTrack != null) {
                        videoTrack.dispose();
                    }
                    this.f626IlIlIIlIII1 = null;
                    VideoSource videoSource = this.f625llllllIlIIIlll1;
                    if (videoSource != null) {
                        videoSource.dispose();
                    }
                    this.f625llllllIlIIIlll1 = null;
                } catch (Exception e3) {
                    String IlIllll14 = IlIllll1();
                    StringBuilder sb3 = new StringBuilder();
                    byte[] bArr7 = new byte[26];
                    bArr7[0] = -37;
                    bArr7[1] = 105;
                    bArr7[2] = 114;
                    bArr7[3] = -68;
                    bArr7[4] = 54;
                    bArr7[5] = 17;
                    bArr7[6] = -48;
                    bArr7[7] = 4;
                    bArr7[8] = -76;
                    bArr7[9] = 7;
                    bArr7[10] = 90;
                    bArr7[11] = -53;
                    bArr7[12] = 74;
                    bArr7[13] = 26;
                    bArr7[14] = -68;
                    bArr7[15] = 69;
                    bArr7[16] = -120;
                    bArr7[17] = 126;
                    bArr7[18] = 29;
                    bArr7[19] = -2;
                    bArr7[20] = 19;
                    bArr7[21] = 71;
                    bArr7[22] = -116;
                    bArr7[23] = 6;
                    bArr7[24] = 8;
                    bArr7[25] = -50;
                    byte[] bArr8 = new byte[8];
                    bArr8[0] = 50;
                    bArr8[1] = -18;
                    bArr8[2] = -8;
                    bArr8[3] = 90;
                    bArr8[4] = -94;
                    bArr8[5] = -81;
                    bArr8[6] = 56;
                    bArr8[7] = -93;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll14, sb3.append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr7, bArr8)).append(e3.getMessage()).toString());
                }
                try {
                    PeerConnectionFactory peerConnectionFactory = this.f621llllIllIl1;
                    if (peerConnectionFactory != null) {
                        peerConnectionFactory.dispose();
                    }
                } catch (Exception e4) {
                    String IlIllll15 = IlIllll1();
                    StringBuilder sb4 = new StringBuilder();
                    byte[] bArr9 = new byte[35];
                    bArr9[0] = -1;
                    bArr9[1] = -24;
                    bArr9[2] = -63;
                    bArr9[3] = -70;
                    bArr9[4] = -20;
                    bArr9[5] = 81;
                    bArr9[6] = -87;
                    bArr9[7] = -85;
                    bArr9[8] = 115;
                    bArr9[9] = 29;
                    bArr9[10] = 8;
                    bArr9[11] = 51;
                    bArr9[12] = 22;
                    bArr9[13] = -127;
                    bArr9[14] = -100;
                    bArr9[15] = -83;
                    bArr9[16] = 98;
                    bArr9[17] = 6;
                    bArr9[18] = 36;
                    bArr9[19] = 50;
                    bArr9[20] = 62;
                    bArr9[21] = -114;
                    bArr9[22] = -102;
                    bArr9[23] = -70;
                    bArr9[24] = 121;
                    bArr9[25] = 29;
                    bArr9[26] = 50;
                    bArr9[27] = -71;
                    bArr9[28] = -36;
                    bArr9[29] = 94;
                    bArr9[30] = 17;
                    bArr9[31] = 122;
                    bArr9[32] = -77;
                    bArr9[33] = 85;
                    bArr9[34] = 107;
                    byte[] bArr10 = new byte[8];
                    bArr10[0] = 22;
                    bArr10[1] = 111;
                    bArr10[2] = 75;
                    bArr10[3] = 92;
                    bArr10[4] = 120;
                    bArr10[5] = -17;
                    bArr10[6] = -7;
                    bArr10[7] = -50;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll15, sb4.append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr9, bArr10)).append(e4.getMessage()).toString());
                }
                try {
                    IlIlIIlIII1.lIIIIlllllIlll1 IlIlllIIlI12 = IlIlllIIlI1.lIIIIlllllIlll1.IlIllIlllIllI1().IlIlllIIlI1();
                    if (IlIlllIIlI12 != null) {
                        IlIlllIIlI12.llllIIIIll1();
                    }
                } catch (Exception e5) {
                    String IlIllll16 = IlIllll1();
                    StringBuilder sb5 = new StringBuilder();
                    byte[] bArr11 = new byte[21];
                    bArr11[0] = -111;
                    bArr11[1] = 108;
                    bArr11[2] = -38;
                    bArr11[3] = 55;
                    bArr11[4] = 18;
                    bArr11[5] = 75;
                    bArr11[6] = -21;
                    bArr11[7] = 16;
                    bArr11[8] = 36;
                    bArr11[9] = -86;
                    bArr11[10] = -113;
                    bArr11[11] = 107;
                    bArr11[12] = 4;
                    bArr11[13] = 3;
                    bArr11[14] = 8;
                    bArr11[15] = -13;
                    bArr11[16] = -100;
                    bArr11[17] = 93;
                    bArr11[18] = -52;
                    bArr11[19] = -28;
                    bArr11[20] = -91;
                    byte[] bArr12 = new byte[8];
                    bArr12[0] = 116;
                    bArr12[1] = -23;
                    bArr12[2] = 105;
                    bArr12[3] = -34;
                    bArr12[4] = -123;
                    bArr12[5] = -26;
                    bArr12[6] = -84;
                    bArr12[7] = 66;
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll16, sb5.append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr11, bArr12)).append(e5.getMessage()).toString());
                }
                try {
                    this.f647IIlIIllll1.shutdownNow();
                } catch (Exception unused4) {
                }
                ScheduledFuture<?> scheduledFuture2 = this.lIlIlIlI1;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                }
                this.lIlIlIlI1 = null;
            }
        } catch (Throwable unused5) {
        }
    }

    @Override // IlIlIIlIII1.lIIIIlllllIlll1.IlIllIlllIllI1
    public void llllIIIIll1(@NotNull Exception exc) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(exc, lllliiiill1.llllIIIIll1(new byte[]{-42, 7, -30, 48, 73}, new byte[]{-77, 117, -112, 95, 59, -125, -34, -27}));
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(exc, new StringBuilder().append(lllliiiill1.llllIIIIll1(new byte[]{-77, -57, -85, -124, 39, -63, 9, 107, -42, -58, -80, -116, 59, Byte.MIN_VALUE, 12, 108, -104, -46, -29, -53}, new byte[]{-10, -75, -39, -21, 85, -31, 96, 5}))));
        llIIllIl1();
    }

    public final boolean lIIIIlllllIlll1(String str) {
        boolean z;
        try {
            Runtime runtime = Runtime.getRuntime();
            Class<?> cls = runtime.getClass();
            byte[] bArr = new byte[15];
            bArr[0] = -97;
            bArr[1] = -55;
            bArr[2] = -49;
            bArr[3] = 102;
            bArr[4] = 103;
            bArr[5] = 58;
            bArr[6] = -116;
            bArr[7] = -1;
            bArr[8] = -111;
            bArr[9] = -44;
            bArr[10] = -49;
            bArr[11] = 112;
            bArr[12] = 107;
            bArr[13] = 59;
            bArr[14] = -77;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -13;
            bArr2[1] = -90;
            bArr2[2] = -82;
            bArr2[3] = 2;
            bArr2[4] = 2;
            bArr2[5] = 94;
            bArr2[6] = -64;
            bArr2[7] = -106;
            Field declaredField = cls.getDeclaredField(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2));
            declaredField.setAccessible(true);
            Object obj = declaredField.get(runtime);
            Set set = TypeIntrinsics.isMutableSet(obj) ? (Set) obj : null;
            if (set != null) {
                if (set.contains(System.mapLibraryName(str))) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            IlIllll1();
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(new byte[]{-67, -1, -51, -30, -66, 63, 36, -45, -39, -102, -25, -114, -25, 27, 65, -70, -53, -38, -78, -80, -110, 93, 75, -4, -68, -62, -22, -19, -117, 14, 39, -36, -43, -102, -13, -69, -23, 12, 100, -77, -24, -13, -78, -70, -100, 80, 110, -55, -79, -6, -31, -18, -70, 46, 39, -54, -19, -102, -21, -123}, new byte[]{84, Byte.MAX_VALUE, 87, 10, 1, -72, -63, 92});
            try {
                String mapLibraryName = System.mapLibraryName(str);
                Runtime runtime2 = Runtime.getRuntime();
                StringBuilder sb = new StringBuilder();
                byte[] bArr3 = new byte[9];
                bArr3[0] = -30;
                bArr3[1] = -71;
                bArr3[2] = 20;
                bArr3[3] = -40;
                bArr3[4] = 77;
                bArr3[5] = -90;
                bArr3[6] = -65;
                bArr3[7] = -124;
                bArr3[8] = -95;
                byte[] bArr4 = new byte[8];
                bArr4[0] = -114;
                bArr4[1] = -54;
                bArr4[2] = 52;
                bArr4[3] = -9;
                bArr4[4] = 61;
                bArr4[5] = -44;
                bArr4[6] = -48;
                bArr4[7] = -25;
                StringBuilder append = sb.append(lllliiiill1.llllIIIIll1(bArr3, bArr4)).append(Process.myPid());
                byte[] bArr5 = new byte[5];
                bArr5[0] = -118;
                bArr5[1] = -109;
                bArr5[2] = 80;
                bArr5[3] = 44;
                bArr5[4] = 93;
                byte[] bArr6 = new byte[8];
                bArr6[0] = -91;
                bArr6[1] = -2;
                bArr6[2] = 49;
                bArr6[3] = 92;
                bArr6[4] = 46;
                bArr6[5] = -8;
                bArr6[6] = -15;
                bArr6[7] = 18;
                InputStream inputStream = runtime2.exec(append.append(lllliiiill1.llllIIIIll1(bArr5, bArr6)).toString()).getInputStream();
                byte[] bArr7 = new byte[19];
                bArr7[0] = 13;
                bArr7[1] = 53;
                bArr7[2] = -64;
                bArr7[3] = -6;
                bArr7[4] = 7;
                bArr7[5] = 35;
                bArr7[6] = -75;
                bArr7[7] = 60;
                bArr7[8] = 57;
                bArr7[9] = 36;
                bArr7[10] = -58;
                bArr7[11] = -42;
                bArr7[12] = 8;
                bArr7[13] = 62;
                bArr7[14] = -24;
                bArr7[15] = 102;
                bArr7[16] = 68;
                bArr7[17] = 126;
                bArr7[18] = -99;
                byte[] bArr8 = new byte[8];
                bArr8[0] = 106;
                bArr8[1] = 80;
                bArr8[2] = -76;
                bArr8[3] = -77;
                bArr8[4] = 105;
                bArr8[5] = 83;
                bArr8[6] = -64;
                bArr8[7] = 72;
                Intrinsics.checkNotNullExpressionValue(inputStream, lllliiiill1.llllIIIIll1(bArr7, bArr8));
                Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    Iterator it = TextStreamsKt.lineSequence(bufferedReader).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        String str2 = (String) it.next();
                        Intrinsics.checkNotNull(mapLibraryName);
                        if (StringsKt.contains$default(str2, mapLibraryName, false, 2, (Object) null)) {
                            z = true;
                            break;
                        }
                    }
                    CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                    return z;
                } finally {
                }
            } catch (Exception e) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-123, 68, -2, -112, 63, 67, -11, 105, 23, -114, 8, 19, 69, 92, 8, -19, -23, 71, -106, -53, 29, 1, 17, -66, -123, 103, -1, -109, 4, 87, 115, -68, -58, -35, 94}, new byte[]{99, -25, 126, 118, -96, -26, -101, 8}))));
                return false;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(12:5|(2:6|(7:8|9|10|12|13|(3:15|16|17)(1:19)|18)(0))|24|25|(1:27)|29|30|31|32|(1:34)|36|37)(0))(0)|23|24|25|(0)|29|30|31|32|(0)|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0225, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0226, code lost:
    
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(c13.nim5.ez8.h5_proto.Log.LogLevel.ERROR, r1.IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(r0, new java.lang.StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{69, -28, -23, -92, 82, -105, -103, 1, 16, -121, -41, -29, 44, -70, -27, 125, 33, -14, -65, -23, 116, -46, -53, 49, -102, 65}, new byte[]{-96, 97, 90, 77, -59, 58, Byte.MAX_VALUE, -108}))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0111, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0112, code lost:
    
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(c13.nim5.ez8.h5_proto.Log.LogLevel.ERROR, r1.IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(r0, new java.lang.StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{68, 62, 60, -38, -82, -121, -57, 84, -60, -34, -3, 112, 86, 68, -119, 97, -62, -49, -26, 92, 87, 10, 2, -96, 16, 83, 59, -106, 3, 10}, new byte[]{-95, -69, -113, 51, 57, 42, -25, 4}))));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010a A[Catch: Exception -> 0x0111, TRY_ENTER, TryCatch #2 {Exception -> 0x0111, blocks: (B:24:0x0101, B:27:0x010a), top: B:23:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021e A[Catch: Exception -> 0x0225, TRY_ENTER, TryCatch #1 {Exception -> 0x0225, blocks: (B:31:0x0216, B:34:0x021e), top: B:30:0x0216 }] */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.webrtc.DataChannel] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [llIIIIlIlllIII1.IllIIlIIII1] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v27, types: [org.webrtc.PeerConnection] */
    /* JADX WARN: Type inference failed for: r0v6, types: [llIIIIlIlllIII1.IllIIlIIII1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Exception, llIIIIlIlllIII1.IllIIlIIII1] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Exception, llIIIIlIlllIII1.IllIIlIIII1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Exception, llIIIIlIlllIII1.IllIIlIIII1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IlIllIlllIllI1() {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: llIIIIlIlllIII1.IllIIlIIII1.IlIllIlllIllI1():void");
    }

    public final void lIllIIIlIl1() {
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(CollectionsKt.listOf(new PeerConnection.IceServer[]{PeerConnection.IceServer.builder(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-105, 38, -107, -13, -59, 48, 70, -18, -51, 96, -47, -77, -50, 51, 70, -15, -48, 105, -44, -87, -56, 57}, new byte[]{-29, 83, -25, -99, -1, 1, 118, -33})).setUsername(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-13, -114, -62, 70, 85, 45, 17, -78}, new byte[]{-124, -5, -81, 47, 33, 72, 114, -38})).setPassword(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-19, -7, -43, -22, 125, 55, 13, -73, -76, -17, -41, -18, 73, 99, 92, -20}, new byte[]{-102, -116, -72, -125, 9, 82, 110, -33})).createIceServer(), PeerConnection.IceServer.builder(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{48, 67, 70, 94, -65, -71, -77, 71, 106, 1, 1, 30, -76, -67, -80, 95, 117, 6, 1, 10, -74, -68, -76, 73}, new byte[]{68, 54, 52, 48, -123, -120, -125, 113})).setUsername(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{116, 118, -119, -93, 14, 22, -104, 109}, new byte[]{3, 3, -28, -54, 122, 115, -5, 5})).setPassword(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-54, -53, -59, 118, -21, -10, 81, -113, -109, -35, -57, 114, -33, -94, 0, -44}, new byte[]{-67, -66, -88, 31, -97, -109, 50, -25})).createIceServer()}));
        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
        rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
        rTCConfiguration.disableIPv6OnWifi = true;
        rTCConfiguration.iceCandidatePoolSize = 0;
        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.ALL;
        IlIllll1();
        IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{115, 75, 0, 42, -85, 65, 102, -54, 22, 38, 23, 89, -9, 114, 9, 68, -60, -105, -40, -97, 117, -98, -13, 39, -7, -83, -11, -86, 115, -113, -24, 11, -8, -29, 114, 74, -99, 28, 60, -54}, new byte[]{-106, -61, -101, -49, 16, -5, -127, 100});
        MediaConstraints mediaConstraints = new MediaConstraints();
        mediaConstraints.optional.add(new MediaConstraints.KeyValuePair(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{15, 20, -105, -46, -52, 2, -5, -119, 0, 5, -126, -32, -8, 2, -22, -100, 38, 5, -107, -43}, new byte[]{75, 96, -5, -95, -97, 112, -113, -7}), IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{110, -41, 110, 56}, new byte[]{26, -91, 27, 93, 81, -96, -30, -50})));
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{69, 116, 37, -29, 125, -80, -91, 39, 124, 120, 50, -61, 124, -123, -78, 36, 105}, new byte[]{12, 23, 64, -73, 15, -47, -53, 84}), IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-124, -45, -118}, new byte[]{-27, -65, -26, -37, 20, 25, -47, 49})));
        PeerConnection peerConnection = this.f622IllIIlIIII1;
        if (peerConnection != null) {
            if (peerConnection != null) {
                try {
                    peerConnection.close();
                } catch (Exception e) {
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(IlIllll1(), IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{3, 35, -34, 54, 100, -116, -125, -57, 65, 65, -9, 91, -45, 113, 0, 53, -108, -27, 2, -79, -99, 68, 6, 36, -113, -55, 3, -1, 22, -123, -44, -72, 82, 3, 87, -1}, new byte[]{-26, -90, 109, -33, -13, 33, 101, 80}) + e.getMessage());
                }
            }
            this.f622IllIIlIIII1 = null;
            IlIllll1();
            byte[] bArr = new byte[27];
            bArr[0] = -1;
            bArr[1] = -105;
            bArr[2] = -71;
            bArr[3] = 89;
            bArr[4] = -89;
            bArr[5] = -28;
            bArr[6] = 55;
            bArr[7] = 54;
            bArr[8] = -67;
            bArr[9] = -11;
            bArr[10] = -112;
            bArr[11] = 52;
            bArr[12] = 16;
            bArr[13] = 25;
            bArr[14] = -76;
            bArr[15] = -60;
            bArr[16] = 104;
            bArr[17] = 81;
            bArr[18] = 101;
            bArr[19] = -34;
            bArr[20] = 94;
            bArr[21] = 44;
            bArr[22] = -78;
            bArr[23] = -43;
            bArr[24] = 115;
            bArr[25] = 125;
            bArr[26] = 100;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 26;
            bArr2[1] = 18;
            bArr2[2] = 10;
            bArr2[3] = -80;
            bArr2[4] = 48;
            bArr2[5] = 73;
            bArr2[6] = -47;
            bArr2[7] = -95;
            IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr, bArr2);
        }
        DataChannel dataChannel = this.f623IlIlllIIlI1;
        if (dataChannel != null) {
            if (dataChannel != null) {
                try {
                    dataChannel.close();
                } catch (Exception e2) {
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(IlIllll1(), IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{125, 111, -106, 101, -75, -114, -94, 19, 63, 13, -65, 8, -60, -74, -12, 98, 21, 68, -52, 12, -72, -54, -59, 23, 125, 78, -108, 100, -106, -122, 126, -92}, new byte[]{-104, -22, 37, -116, 34, 35, 68, -124}) + e2.getMessage());
                }
            }
            this.f623IlIlllIIlI1 = null;
            IlIllll1();
            byte[] bArr3 = new byte[24];
            bArr3[0] = 86;
            bArr3[1] = -8;
            bArr3[2] = 32;
            bArr3[3] = 73;
            bArr3[4] = 9;
            bArr3[5] = 55;
            bArr3[6] = 67;
            bArr3[7] = 0;
            bArr3[8] = 20;
            bArr3[9] = -102;
            bArr3[10] = 9;
            bArr3[11] = 36;
            bArr3[12] = 120;
            bArr3[13] = 15;
            bArr3[14] = 21;
            bArr3[15] = 113;
            bArr3[16] = 62;
            bArr3[17] = -45;
            bArr3[18] = 122;
            bArr3[19] = 32;
            bArr3[20] = 4;
            bArr3[21] = 115;
            bArr3[22] = 36;
            bArr3[23] = 4;
            byte[] bArr4 = new byte[8];
            bArr4[0] = -77;
            bArr4[1] = 125;
            bArr4[2] = -109;
            bArr4[3] = -96;
            bArr4[4] = -98;
            bArr4[5] = -102;
            bArr4[6] = -91;
            bArr4[7] = -105;
            IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr3, bArr4);
        }
        try {
            PeerConnectionFactory peerConnectionFactory = this.f621llllIllIl1;
            PeerConnectionFactory peerConnectionFactory2 = peerConnectionFactory;
            if (peerConnectionFactory == null) {
                byte[] bArr5 = new byte[21];
                bArr5[0] = -40;
                bArr5[1] = -25;
                bArr5[2] = -103;
                bArr5[3] = 32;
                bArr5[4] = 92;
                bArr5[5] = -14;
                bArr5[6] = -41;
                bArr5[7] = -54;
                bArr5[8] = -51;
                bArr5[9] = -31;
                bArr5[10] = -120;
                bArr5[11] = 59;
                bArr5[12] = 112;
                bArr5[13] = -13;
                bArr5[14] = -1;
                bArr5[15] = -59;
                bArr5[16] = -53;
                bArr5[17] = -10;
                bArr5[18] = -109;
                bArr5[19] = 32;
                bArr5[20] = 102;
                byte[] bArr6 = new byte[8];
                bArr6[0] = -88;
                bArr6[1] = -126;
                bArr6[2] = -4;
                bArr6[3] = 82;
                bArr6[4] = 31;
                bArr6[5] = -99;
                bArr6[6] = -71;
                bArr6[7] = -92;
                Intrinsics.throwUninitializedPropertyAccessException(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr5, bArr6));
                peerConnectionFactory2 = null;
            }
            PeerConnection createPeerConnection = peerConnectionFactory2.createPeerConnection(rTCConfiguration, new llllIllIl1());
            this.f622IllIIlIIII1 = createPeerConnection;
            if (createPeerConnection != null) {
                IlIllll1();
                byte[] bArr7 = new byte[27];
                bArr7[0] = Byte.MAX_VALUE;
                bArr7[1] = 35;
                bArr7[2] = -17;
                bArr7[3] = 103;
                bArr7[4] = -32;
                bArr7[5] = Byte.MAX_VALUE;
                bArr7[6] = -96;
                bArr7[7] = -41;
                bArr7[8] = 74;
                bArr7[9] = 37;
                bArr7[10] = -2;
                bArr7[11] = 124;
                bArr7[12] = -52;
                bArr7[13] = 126;
                bArr7[14] = -18;
                bArr7[15] = 92;
                bArr7[16] = -89;
                bArr7[17] = -35;
                bArr7[18] = 111;
                bArr7[19] = -82;
                bArr7[20] = 25;
                bArr7[21] = -10;
                bArr7[22] = 70;
                bArr7[23] = 41;
                bArr7[24] = -54;
                bArr7[25] = -52;
                bArr7[26] = 21;
                byte[] bArr8 = new byte[8];
                bArr8[0] = 47;
                bArr8[1] = 70;
                bArr8[2] = -118;
                bArr8[3] = 21;
                bArr8[4] = -93;
                bArr8[5] = 16;
                bArr8[6] = -50;
                bArr8[7] = -71;
                IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr7, bArr8);
                return;
            }
            String IlIllll12 = IlIllll1();
            byte[] bArr9 = new byte[31];
            bArr9[0] = -87;
            bArr9[1] = -86;
            bArr9[2] = 76;
            bArr9[3] = -76;
            bArr9[4] = -125;
            bArr9[5] = -80;
            bArr9[6] = 62;
            bArr9[7] = 89;
            bArr9[8] = Byte.MIN_VALUE;
            bArr9[9] = -21;
            bArr9[10] = 70;
            bArr9[11] = -86;
            bArr9[12] = -125;
            bArr9[13] = -75;
            bArr9[14] = 106;
            bArr9[15] = 72;
            bArr9[16] = -49;
            bArr9[17] = -101;
            bArr9[18] = 64;
            bArr9[19] = -67;
            bArr9[20] = -108;
            bArr9[21] = -105;
            bArr9[22] = 113;
            bArr9[23] = 67;
            bArr9[24] = -127;
            bArr9[25] = -82;
            bArr9[26] = 70;
            bArr9[27] = -84;
            bArr9[28] = -113;
            bArr9[29] = -69;
            bArr9[30] = 112;
            byte[] bArr10 = new byte[8];
            bArr10[0] = -17;
            bArr10[1] = -53;
            bArr10[2] = 37;
            bArr10[3] = -40;
            bArr10[4] = -26;
            bArr10[5] = -44;
            bArr10[6] = 30;
            bArr10[7] = 45;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(IlIllll12, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr9, bArr10));
            llIIllIl1();
        } catch (Exception e3) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(IlIllll1(), IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{6, -87, 111, 6, 68, 37, -100, -73, -122, 68, -122, -96, -112, -15, -46, -126, Byte.MIN_VALUE, 85, -99, -116, -111, -65, 89, 67, 82, -55, 64, 70, -59, -65}, new byte[]{-29, 33, -12, -29, -1, -97, -68, -25}) + e3.getMessage());
            e3.printStackTrace();
            llIIllIl1();
        }
    }

    public final void llllIllIl1() {
    }

    public final void IllIIlIIII1(double d, double d2) {
        this.f629IlIllll1.post(() -> {
            IlIlllIIlI1(r1, r2, r3);
        });
    }

    public final void IlIlIIlIII1() {
        IlIllll1();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllliiiill1.llllIIIIll1(new byte[]{121, -96, -31, 32, 108, -27, 57, -8, 7, -7, -38, Byte.MAX_VALUE, -118, 0, -81, 7, -7, 110}, new byte[]{-100, 28, 97, -59, -53, 110, -36, 112});
        MediaConstraints mediaConstraints = new MediaConstraints();
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair(lllliiiill1.llllIIIIll1(new byte[]{-26, -71, 20, 87, 13, 66, 3, 58, -52, -68, 23, 91, 9, 115, 58, 1, -51, -70, 29}, new byte[]{-87, -33, 114, 50, Byte.MAX_VALUE, 22, 108, 104}), lllliiiill1.llllIIIIll1(new byte[]{38, 56, -103, 10}, new byte[]{82, 74, -20, 111, -94, -114, -52, 124})));
        mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair(lllliiiill1.llllIIIIll1(new byte[]{-61, -116, -81, -63, 122, 62, 13, -119, -23, -119, -84, -51, 126, 15, 35, -82, -24, -125, -90}, new byte[]{-116, -22, -55, -92, 8, 106, 98, -37}), lllliiiill1.llllIIIIll1(new byte[]{-39, -29, 29, 98, -112}, new byte[]{-65, -126, 113, 17, -11, -97, -9, 111})));
        PeerConnection peerConnection = this.f622IllIIlIIII1;
        if (peerConnection != null) {
            peerConnection.createAnswer(new lIIIIlllllIlll1(), mediaConstraints);
        }
    }

    public static final void IlIlllIIlI1(IllIIlIIII1 illIIlIIII1, double d, double d2) {
        int width = illIIlIIII1.f629IlIllll1.getWidth();
        int height = illIIlIIII1.f629IlIllll1.getHeight();
        float f = (float) (d * width);
        illIIlIIII1.f632llIIIIlIlllIII1 = f;
        float f2 = (float) (d2 * height);
        illIIlIIII1.f633lIllIlIll1 = f2;
        illIIlIIII1.f640IllIlIllll1 = f;
        illIIlIIII1.f641lIIlllIIIlllII1 = f2;
        illIIlIIII1.f639lIIlIIIIlIlII1 = 0.0f;
        illIIlIIII1.f634IlIlIIIlIlIlll1 = SystemClock.uptimeMillis();
        illIIlIIII1.f631IlIIlllllI1 = true;
    }

    public final void llllllIlIIIlll1() {
        IIIlIllIlI1();
    }

    public final void lIllIlIll1() {
        String IlIllll12 = IlIllll1();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String llllIIIIll12 = lllliiiill1.llllIIIIll1(new byte[]{-123, 50, -80, 110, -30, 32, -67, 47, -2, 104, -66, 46}, new byte[]{96, -114, 48, -117, 69, -85, 85, -112});
        Log.LogLevel logLevel = Log.LogLevel.INFO;
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, IlIllll12, llllIIIIll12);
        try {
            IlIlIIlIII1.lIIIIlllllIlll1 IlIlllIIlI12 = IlIlllIIlI1.lIIIIlllllIlll1.f240llllIIIIll1.IlIlllIIlI1();
            if (IlIlllIIlI12 != null) {
                IlIlllIIlI12.lIIIIlllllIlll1();
            }
            String IlIllll13 = IlIllll1();
            byte[] bArr = new byte[33];
            bArr[0] = -58;
            bArr[1] = -115;
            bArr[2] = -90;
            bArr[3] = -119;
            bArr[4] = 14;
            bArr[5] = -50;
            bArr[6] = 100;
            bArr[7] = -93;
            bArr[8] = -113;
            bArr[9] = -42;
            bArr[10] = -125;
            bArr[11] = -53;
            bArr[12] = 102;
            bArr[13] = -9;
            bArr[14] = 13;
            bArr[15] = -7;
            bArr[16] = -92;
            bArr[17] = -109;
            bArr[18] = -34;
            bArr[19] = -13;
            bArr[20] = 13;
            bArr[21] = -114;
            bArr[22] = 10;
            bArr[23] = -67;
            bArr[24] = -56;
            bArr[25] = -70;
            bArr[26] = -88;
            bArr[27] = -118;
            bArr[28] = 10;
            bArr[29] = -12;
            bArr[30] = 111;
            bArr[31] = -96;
            bArr[32] = -81;
            byte[] bArr2 = new byte[8];
            bArr2[0] = 46;
            bArr2[1] = 50;
            bArr2[2] = 56;
            bArr2[3] = 111;
            bArr2[4] = Byte.MIN_VALUE;
            bArr2[5] = 107;
            bArr2[6] = Byte.MIN_VALUE;
            bArr2[7] = 28;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, IlIllll13, lllliiiill1.llllIIIIll1(bArr, bArr2));
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{59, 78, -84, 121, -60, 32, -58, 28, -125, -78, -44, 3, -57, 96, 11, -17, 54, 85, -125, 119, -2, 32, -69, 110}, new byte[]{-45, -15, 50, -97, 74, -123, -127, 78}) + e);
            llIIllIl1();
        }
    }

    public final void llllIllIl1(double d, double d2) {
        this.f629IlIllll1.post(() -> {
            llllIllIl1(r1, r2, r3);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [float, int] */
    public static final void IllIIlIIII1(IllIIlIIII1 illIIlIIII1, double d, double d2) {
        if (!illIIlIIII1.f631IlIIlllllI1) {
            illIIlIIII1.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{67, 83, -37, -41, -53, -30, 125, 17, 49, 82, -54, -45, -59, -76, 117, 26, 103, 83, -104, -59, -53, -32, 112, 26, 100, 66, -104, -42, -48, -11, Byte.MAX_VALUE, 85, 98, 66, -39, -64, -42, -72, 56, 7, 116, 69, -35, -58, -42, -3, 118, 18, 49, 82, -54, -45, -59, -76, 107, 1, 112, 66, -35}, new byte[]{17, 54, -72, -78, -94, -108, 24, 117});
            illIIlIIII1.IllIIlIIII1(d, d2);
            return;
        }
        float width = (float) (d * illIIlIIII1.f629IlIllll1.getWidth());
        float height = (float) (d2 * illIIlIIII1.f629IlIllll1.getHeight());
        float abs = illIIlIIII1.f639lIIlIIIIlIlII1 + Math.abs(height - illIIlIIII1.f641lIIlllIIIlllII1) + Math.abs(width - illIIlIIII1.f640IllIlIllll1);
        illIIlIIII1.f639lIIlIIIIlIlII1 = abs;
        if (abs > illIIlIIII1.f635IIIlIllIlI1) {
            if (illIIlIIII1.f642IllllIllllll1 == illIIlIIII1.f637lllIlIIIlI1) {
                ?? r0 = illIIlIIII1.f632llIIIIlIlllIII1;
                float f = illIIlIIII1.f633lIllIlIll1;
                long j = illIIlIIII1.f634IlIlIIIlIlIlll1;
                MotionEvent llllIIIIll12 = illIIlIIII1.llllIIIIll1((int) r0, (float) r0, f, j, j);
                illIIlIIII1.f629IlIllll1.dispatchTouchEvent(llllIIIIll12);
                llllIIIIll12.recycle();
                illIIlIIII1.f642IllllIllllll1 = illIIlIIII1.f638lIlllIIIII1;
            }
            if (illIIlIIII1.f642IllllIllllll1 == illIIlIIII1.f638lIlllIIIII1) {
                MotionEvent llllIIIIll13 = illIIlIIII1.llllIIIIll1(2, width, height, illIIlIIII1.f634IlIlIIIlIlIlll1, SystemClock.uptimeMillis());
                illIIlIIII1.f629IlIllll1.dispatchTouchEvent(llllIIIIll13);
                llllIIIIll13.recycle();
            }
        }
        illIIlIIII1.f640IllIlIllll1 = width;
        illIIlIIII1.f641lIIlllIIIlllII1 = height;
    }

    public static final void llllIllIl1(IllIIlIIII1 illIIlIIII1, double d, double d2) {
        if (!illIIlIIII1.f631IlIIlllllI1) {
            illIIlIIII1.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-28, -13, 78, -119, -28, 93, 112, 61, 99, 0, -67, 2, 8, 9, -87, -55, -28, -43, 89, -118, -16, 100, -15, -32, -69, -126, 66, -8, -117, 119, -112, 43, 112, 6, -97, 63, 24, -116, 102, 59, -19, -37, 116, -119, -45, 80, -13, -38, -89, -127, 85, -56, -120, 87, -97, -85, -71, -47}, new byte[]{2, 103, -8, 108, 108, -19, 20, 79});
            return;
        }
        float width = (float) (d * illIIlIIII1.f629IlIllll1.getWidth());
        float height = (float) (d2 * illIIlIIII1.f629IlIllll1.getHeight());
        illIIlIIII1.f639lIIlIIIIlIlII1 += Math.abs(height - illIIlIIII1.f641lIIlllIIIlllII1) + Math.abs(width - illIIlIIII1.f640IllIlIllll1);
        int i = illIIlIIII1.f642IllllIllllll1;
        if (i == illIIlIIII1.f638lIlllIIIII1) {
            MotionEvent llllIIIIll12 = illIIlIIII1.llllIIIIll1(3, width, height, illIIlIIII1.f634IlIlIIIlIlIlll1, SystemClock.uptimeMillis());
            illIIlIIII1.f629IlIllll1.dispatchTouchEvent(llllIIIIll12);
            llllIIIIll12.recycle();
            illIIlIIII1.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{1, -50, 110, -64, -93, 42, 1, 18, 116, -93, 101, -70, -58, 62, 124, 76, 104, -44, 17, -91, -88, -61, -91, -3, -82, 10, -74, 122, 106, -61, -88, -22, -94, 9, 28, -97, -94, 102, 93, 31}, new byte[]{-25, 69, -8, 37, 41, -126, -26, -87});
        } else if (i == illIIlIIII1.f637lllIlIIIlI1) {
            illIIlIIII1.IlIllll1();
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{69, -22, 124, -51, -14, 65, 11, -93, 52, -112, 91, -125, -113, 120, 126, -50, 63, -22, 62, -105, -14, 39, 85, -91, 74, -46, 119, -50, -25, 82, 9, -109, 25, -111, 108, -66, -116, 121, 102, -52, 25, -61, 62, -105, -28, 42, 108, -105, 71, -16, 92, -61, -57, 108, 5, -113, 4}, new byte[]{-94, 117, -47, 43, 104, -61, -19, 40});
        }
        illIIlIIII1.f631IlIIlllllI1 = false;
        illIIlIIII1.f642IllllIllllll1 = illIIlIIII1.f636llIIllIl1;
        illIIlIIII1.IlIllll1();
        IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{49, 122, 104, 49, 56, 84, 6, -18, 91, 20, 123, 124, 85, 71, 112, -90, 74, 110, 17, 104, 62, 21, 100, -51, 48, 76, 80, 51, 56, 74, 5, -64, 86}, new byte[]{-41, -15, -2, -44, -78, -4, -29, 64});
    }

    public final String IlIllll1() {
        return IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{70, -17, 12, -95, -14, -99, 67, 25, 78, -37, 27, -90, -63, -102, 85, 6, 114, -52, 58, -90, -54, -112, 67, 28, 39}, new byte[]{29, -72, 105, -61, -92, -12, 38, 110}) + this.f619llllIIIIll1 + ']';
    }

    public final void IlIlllIIlI1(String str) {
        this.f629IlIllll1.post(() -> {
            llllIIIIll1(r1, r2);
        });
    }

    public final void IlIlllIIlI1() {
        Object obj;
        try {
            Context llllIllIl12 = IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1();
            if (llllIllIl12 != null) {
                byte[] bArr = new byte[12];
                bArr[0] = -34;
                bArr[1] = 11;
                bArr[2] = 120;
                bArr[3] = -99;
                bArr[4] = 72;
                bArr[5] = 34;
                bArr[6] = 111;
                bArr[7] = 56;
                bArr[8] = -53;
                bArr[9] = 13;
                bArr[10] = 98;
                bArr[11] = -118;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -67;
                bArr2[1] = 100;
                bArr2[2] = 22;
                bArr2[3] = -13;
                bArr2[4] = 45;
                bArr2[5] = 65;
                bArr2[6] = 27;
                bArr2[7] = 81;
                obj = llllIllIl12.getSystemService(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2));
            } else {
                obj = null;
            }
            ConnectivityManager connectivityManager = obj instanceof ConnectivityManager ? (ConnectivityManager) obj : null;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(connectivityManager != null ? connectivityManager.getActiveNetwork() : null) : null;
            NetworkCapabilities networkCapabilities2 = networkCapabilities;
            byte[] bArr3 = new byte[11];
            bArr3[0] = 20;
            bArr3[1] = -6;
            bArr3[2] = -118;
            bArr3[3] = 36;
            bArr3[4] = -73;
            bArr3[5] = 61;
            bArr3[6] = 110;
            bArr3[7] = 6;
            bArr3[8] = 9;
            bArr3[9] = -20;
            bArr3[10] = -83;
            byte[] bArr4 = new byte[8];
            bArr4[0] = 125;
            bArr4[1] = -119;
            bArr4[2] = -55;
            bArr4[3] = 75;
            bArr4[4] = -39;
            bArr4[5] = 83;
            bArr4[6] = 11;
            bArr4[7] = 101;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            String llllIIIIll12 = lllliiiill1.llllIIIIll1(bArr3, bArr4);
            boolean z = networkCapabilities2 != null;
            NetworkCapabilities networkCapabilities3 = networkCapabilities;
            Pair pair = TuplesKt.to(llllIIIIll12, Boolean.valueOf(z));
            byte[] bArr5 = new byte[11];
            bArr5[0] = 40;
            bArr5[1] = -96;
            bArr5[2] = 106;
            bArr5[3] = 22;
            bArr5[4] = -103;
            bArr5[5] = 27;
            bArr5[6] = 81;
            bArr5[7] = -50;
            bArr5[8] = 46;
            bArr5[9] = -92;
            bArr5[10] = 109;
            byte[] bArr6 = new byte[8];
            bArr6[0] = 64;
            bArr6[1] = -63;
            bArr6[2] = 25;
            bArr6[3] = 95;
            bArr6[4] = -9;
            bArr6[5] = 111;
            bArr6[6] = 52;
            bArr6[7] = -68;
            String llllIIIIll13 = lllliiiill1.llllIIIIll1(bArr5, bArr6);
            boolean z2 = networkCapabilities3 != null && networkCapabilities.hasCapability(12);
            NetworkCapabilities networkCapabilities4 = networkCapabilities;
            Pair pair2 = TuplesKt.to(llllIIIIll13, Boolean.valueOf(z2));
            byte[] bArr7 = new byte[11];
            bArr7[0] = 63;
            bArr7[1] = -72;
            bArr7[2] = 15;
            bArr7[3] = 49;
            bArr7[4] = 94;
            bArr7[5] = -65;
            bArr7[6] = -80;
            bArr7[7] = 121;
            bArr7[8] = 59;
            bArr7[9] = -72;
            bArr7[10] = 14;
            byte[] bArr8 = new byte[8];
            bArr8[0] = 87;
            bArr8[1] = -39;
            bArr8[2] = 124;
            bArr8[3] = 114;
            bArr8[4] = 59;
            bArr8[5] = -45;
            bArr8[6] = -36;
            bArr8[7] = 12;
            String llllIIIIll14 = lllliiiill1.llllIIIIll1(bArr7, bArr8);
            boolean z3 = networkCapabilities4 != null && networkCapabilities.hasTransport(0);
            NetworkCapabilities networkCapabilities5 = networkCapabilities;
            Pair pair3 = TuplesKt.to(llllIIIIll14, Boolean.valueOf(z3));
            byte[] bArr9 = new byte[7];
            bArr9[0] = -98;
            bArr9[1] = 4;
            bArr9[2] = -74;
            bArr9[3] = 124;
            bArr9[4] = 67;
            bArr9[5] = -82;
            bArr9[6] = -50;
            byte[] bArr10 = new byte[8];
            bArr10[0] = -10;
            bArr10[1] = 101;
            bArr10[2] = -59;
            bArr10[3] = 43;
            bArr10[4] = 42;
            bArr10[5] = -56;
            bArr10[6] = -89;
            bArr10[7] = -103;
            String llllIIIIll15 = lllliiiill1.llllIIIIll1(bArr9, bArr10);
            boolean z4 = networkCapabilities5 != null && networkCapabilities.hasTransport(1);
            NetworkCapabilities networkCapabilities6 = networkCapabilities;
            Pair pair4 = TuplesKt.to(llllIIIIll15, Boolean.valueOf(z4));
            byte[] bArr11 = new byte[11];
            bArr11[0] = 22;
            bArr11[1] = -103;
            bArr11[2] = 3;
            bArr11[3] = -98;
            bArr11[4] = 53;
            bArr11[5] = -59;
            bArr11[6] = 111;
            bArr11[7] = 80;
            bArr11[8] = 16;
            bArr11[9] = -99;
            bArr11[10] = 4;
            byte[] bArr12 = new byte[8];
            bArr12[0] = 126;
            bArr12[1] = -8;
            bArr12[2] = 112;
            bArr12[3] = -37;
            bArr12[4] = 65;
            bArr12[5] = -83;
            bArr12[6] = 10;
            bArr12[7] = 34;
            String llllIIIIll16 = lllliiiill1.llllIIIIll1(bArr11, bArr12);
            boolean z5 = networkCapabilities6 != null && networkCapabilities.hasTransport(3);
            NetworkCapabilities networkCapabilities7 = networkCapabilities;
            Pair pair5 = TuplesKt.to(llllIIIIll16, Boolean.valueOf(z5));
            byte[] bArr13 = new byte[6];
            bArr13[0] = -34;
            bArr13[1] = 105;
            bArr13[2] = -105;
            bArr13[3] = 69;
            bArr13[4] = 21;
            bArr13[5] = 20;
            byte[] bArr14 = new byte[8];
            bArr14[0] = -74;
            bArr14[1] = 8;
            bArr14[2] = -28;
            bArr14[3] = 19;
            bArr14[4] = 101;
            bArr14[5] = 122;
            bArr14[6] = -11;
            bArr14[7] = -92;
            String llllIIIIll17 = lllliiiill1.llllIIIIll1(bArr13, bArr14);
            boolean z6 = networkCapabilities7 != null && networkCapabilities.hasTransport(4);
            NetworkCapabilities networkCapabilities8 = networkCapabilities;
            Pair pair6 = TuplesKt.to(llllIIIIll17, Boolean.valueOf(z6));
            byte[] bArr15 = new byte[19];
            bArr15[0] = 26;
            bArr15[1] = 88;
            bArr15[2] = -80;
            bArr15[3] = 105;
            bArr15[4] = Byte.MAX_VALUE;
            bArr15[5] = 52;
            bArr15[6] = -96;
            bArr15[7] = 13;
            bArr15[8] = 31;
            bArr15[9] = 90;
            bArr15[10] = -123;
            bArr15[11] = 102;
            bArr15[12] = 98;
            bArr15[13] = 36;
            bArr15[14] = -91;
            bArr15[15] = 1;
            bArr15[16] = 26;
            bArr15[17] = 67;
            bArr15[18] = -81;
            byte[] bArr16 = new byte[8];
            bArr16[0] = 126;
            bArr16[1] = 55;
            bArr16[2] = -57;
            bArr16[3] = 7;
            bArr16[4] = 12;
            bArr16[5] = 64;
            bArr16[6] = -46;
            bArr16[7] = 104;
            String llllIIIIll18 = lllliiiill1.llllIIIIll1(bArr15, bArr16);
            Integer valueOf = networkCapabilities8 != null ? Integer.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps()) : null;
            NetworkCapabilities networkCapabilities9 = networkCapabilities;
            Pair pair7 = TuplesKt.to(llllIIIIll18, valueOf);
            byte[] bArr17 = new byte[17];
            bArr17[0] = 84;
            bArr17[1] = -87;
            bArr17[2] = 101;
            bArr17[3] = -30;
            bArr17[4] = 69;
            bArr17[5] = -107;
            bArr17[6] = 85;
            bArr17[7] = 116;
            bArr17[8] = 99;
            bArr17[9] = -72;
            bArr17[10] = 120;
            bArr17[11] = -14;
            bArr17[12] = 64;
            bArr17[13] = -103;
            bArr17[14] = 80;
            bArr17[15] = 109;
            bArr17[16] = 73;
            byte[] bArr18 = new byte[8];
            bArr18[0] = 33;
            bArr18[1] = -39;
            bArr18[2] = 22;
            bArr18[3] = -106;
            bArr18[4] = 55;
            bArr18[5] = -16;
            bArr18[6] = 52;
            bArr18[7] = 25;
            String llllIIIIll19 = lllliiiill1.llllIIIIll1(bArr17, bArr18);
            Integer valueOf2 = networkCapabilities9 != null ? Integer.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps()) : null;
            NetworkCapabilities networkCapabilities10 = networkCapabilities;
            Pair pair8 = TuplesKt.to(llllIIIIll19, valueOf2);
            byte[] bArr19 = new byte[14];
            bArr19[0] = -11;
            bArr19[1] = -114;
            bArr19[2] = -125;
            bArr19[3] = -4;
            bArr19[4] = -89;
            bArr19[5] = -75;
            bArr19[6] = -31;
            bArr19[7] = 109;
            bArr19[8] = -12;
            bArr19[9] = -126;
            bArr19[10] = -118;
            bArr19[11] = -11;
            bArr19[12] = -78;
            bArr19[13] = -79;
            byte[] bArr20 = new byte[8];
            bArr20[0] = -122;
            bArr20[1] = -25;
            bArr20[2] = -28;
            bArr20[3] = -110;
            bArr20[4] = -58;
            bArr20[5] = -39;
            bArr20[6] = -78;
            bArr20[7] = 25;
            Map mapOf = MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, TuplesKt.to(lllliiiill1.llllIIIIll1(bArr19, bArr20), networkCapabilities10 != null ? Integer.valueOf(networkCapabilities.getSignalStrength()) : null)});
            byte[] bArr21 = new byte[12];
            bArr21[0] = 59;
            bArr21[1] = 118;
            bArr21[2] = -85;
            bArr21[3] = -107;
            bArr21[4] = -80;
            bArr21[5] = -83;
            bArr21[6] = 70;
            bArr21[7] = -28;
            bArr21[8] = 106;
            bArr21[9] = 45;
            bArr21[10] = -70;
            bArr21[11] = -13;
            byte[] bArr22 = new byte[8];
            bArr22[0] = -36;
            bArr22[1] = -53;
            bArr22[2] = 58;
            bArr22[3] = 114;
            bArr22[4] = 11;
            bArr22[5] = 49;
            bArr22[6] = -95;
            bArr22[7] = 110;
            llllIIIIll1(1, lllliiiill1.llllIIIIll1(bArr21, bArr22), mapOf);
        } catch (Exception e) {
            llllIIIIll1(3, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{85, -26, -34, -14, -108, 10, 109, 119, 34, -94, -27, -120, -20, 37, 60, 44, 51, -60, -69, -80, -70, 71, 62, 111}, new byte[]{-77, 69, 94, 20, 11, -81, -118, -54}), e.getMessage());
        }
    }

    public static final void lllllIllIl1(IllIIlIIII1 illIIlIIII1) {
        illIIlIIII1.IIlIlllllllI1++;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        illIIlIIII1.llllIIIIll1(1, lllliiiill1.llllIIIIll1(new byte[]{-44, 35, -23, 102, -1, 29, -2, 64, -68, 123, -53, 16, 112, -33, 114, -91, 71, -6, 17, -7, 2, -4, 116}, new byte[]{49, -109, 116, -114, 80, -120, 23, -57}), lllliiiill1.llllIIIIll1(new byte[]{-75, -74, 69, -83}, new byte[]{82, 26, -23, -115, 97, 105, 105, -122}) + illIIlIIII1.IIlIlllllllI1 + lllliiiill1.llllIIIIll1(new byte[]{-24, -69, 78, 50, -127, -81, -26, -114, 103, -56}, new byte[]{-56, 93, -30, -109, 100, 31, 123, 102}));
        illIIlIIII1.f646IIlllllIlll1.post(() -> {
            IlIIlllllI1(r1);
        });
    }

    public final void llllIllIl1(String str) {
        this.f629IlIllll1.post(() -> {
            llllIllIl1(r1, r2);
        });
    }

    public static final void llllIllIl1(IllIIlIIII1 illIIlIIII1, String str) {
        illIIlIIII1.f629IlIllll1.evaluateJavascript(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{3, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -58, -93, -108, -89, -114, 71, 14, 102, Byte.MIN_VALUE, -19, -56, -23, -106, 57, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -105, -88, -97, 19, 6, 106, -102, -84, -105, -84, -88, 95, 2, 100, -117, -85, -107, -23, -48, 19, 3, 102, -115, -80, -116, -84, -125, 71, 73, 104, -115, -79, -120, -65, -120, 118, 11, 108, -125, -96, -113, -67, -42, 57, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -120, -81, -51, 27, 6, 106, -102, -84, -105, -84, -88, 95, 2, 100, -117, -85, -107, -23, -53, 21, 71, 33, -113, -90, -107, -96, -101, 86, 34, 101, -117, -88, -124, -89, -103, 29, 19, 104, -119, -117, Byte.MIN_VALUE, -92, -120, 19, 90, 52, -45, -27, -58, Byte.MIN_VALUE, -93, 99, 50, 93, -55, -27, -99, -75, -51, 57, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 104, -115, -79, -120, -65, -120, 118, 11, 108, -125, -96, -113, -67, -61, 71, 6, 110, -96, -92, -116, -84, -51, 14, 90, 52, -50, -30, -75, -116, -75, 103, 38, 91, -85, -124, -58, -23, -111, 79, 71, 3, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -92, -126, -67, -124, 69, 2, 76, -126, -96, -116, -84, -125, 71, 73, 96, -99, -122, -114, -89, -103, 86, 9, 125, -85, -95, -120, -67, -116, 81, 11, 108, -57, -20, -63, -78, -25, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 28, 72, 41, 11, 99, 99, 47, 115, -81, -127, -107, 103, 45, 95, 90, 8, -74, -62, -17, 79, 67, 9, 107, 70, -37, -26, -109, 9, 65, 71, 38, 81, -65, -127, -95, 79, 35, 106, 86, 10, -127, -1, -31, 90, 113, 7, 90, 96, -41, -38, -107, -28, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -84, -121, -23, -59, 82, 4, 125, -121, -77, -124, -116, -127, 86, 10, 108, Byte.MIN_VALUE, -79, -49, -96, -98, 112, 8, 103, -102, -96, -113, -67, -88, 87, 14, 125, -113, -89, -115, -84, -60, 19, 28, 3, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -62, 28, 71, -20, 65, 124, 5, 115, 99, 80, 8, 103, -102, -96, -113, -67, -88, 87, 14, 125, -113, -89, -115, -84, 8, -74, -28, -18, 90, 101, -21, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, Byte.MAX_VALUE, -113, -73, -63, -70, -120, 95, 2, 106, -102, -84, -114, -89, -51, 14, 71, 126, -121, -85, -123, -90, -102, 29, 0, 108, -102, -106, -124, -91, -120, 80, 19, 96, -127, -85, -55, -32, -42, 57, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -105, -88, -97, 19, 21, 104, Byte.MIN_VALUE, -94, -124, -23, -48, 19, 20, 108, -126, -96, -126, -67, -124, 92, 9, 39, -119, -96, -107, -101, -116, 93, 0, 108, -81, -79, -55, -7, -60, 8, 109, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -23, -51, 19, 71, 41, -50, -27, -63, -65, -116, 65, 71, 125, -117, -67, -107, -121, -126, 87, 2, 41, -45, -27, -123, -90, -114, 70, 10, 108, Byte.MIN_VALUE, -79, -49, -86, -97, 86, 6, 125, -117, -111, -124, -79, -103, 125, 8, 109, -117, -19, -58}, new byte[]{9, -18, -59, -31, -55, -19, 51, 103}) + str + IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-34, 82, 99, -49, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -117, 26, 54, -94, -110, 82, 33, -53, -107, 30, 44, -96, -76, 19, 43, -38, -100, 21, 44, -74, -33, 85, 126, -114, -42, 84, 120, 32, Byte.MAX_VALUE, -36, -84, 55, 93, -98, -17, 119, 30, -4, -52, 74, 65, -42, -65, 95, 115, -103, -61, 43, 28, -43, -31, -49, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -117, 26, 54, -94, -110, 82, 44, -64, -118, 30, 42, -79, -71, 19, 33, -53, -47, 15, 61, -67, -125, 50, 42, -54, -100, 82, 99, -49, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -117, 26, 54, -94, -110, 82, 54, -53, -115, 40, 44, -92, -123, 8, 4, -56, -115, 30, 42, -19, -125, 25, 61, -38, -73, 20, 60, -96, -34, 71, 79, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -73, -106, 18, 34, -53, -41, 8, 61, -79, -78, 18, 33, -17, -97, 15, 61, -73, -33, 8, 32, -42, -115, 53, 55, -95, -110, 85, 126, -92, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -124, 25, 41, -53, -102, 15, 49, -86, -103, 82, 55, -53, -108, 20, 46, -96, -74, 16, 41, -4, -104, 21, 63, -96, -124, 84, 108, -107, -13, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 15, 32, -62, -100, 24, 44, -84, -104, 18, 107, -49, -99, 31, 10, -92, -103, 27, 32, -122, -117, 26, 54, -94, -110, 85, 126, -92, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -3, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 84, 119, -27, 31, -37, -29, 75, 118, -22, 49, -85, -121, 9, 49, 74, 67, -16, -68, 126, 65, 118, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 46, -92, -123, 92, 32, -40, -100, 21, 44, -27, -54, 92, 43, -53, -114, 91, 29, -77, -110, 18, 49, -122, -34, 18, 54, -75, -126, 8, 98, -126, -39, 0, 120, -89, -126, 30, 39, -62, -100, 8, 98, -27, -125, 14, 48, -53, -39, 6, 113, -2, -3, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 26, 59, -79, -98, 10, 32, -21, -107, 30, 53, -96, -103, 8, 107, -54, -112, 8, 40, -92, -125, 31, 45, -21, -113, 30, 54, -79, -33, 25, 51, -53, -105, 15, 113, -2, -3, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 9, 61, -79, -126, 14, 43, -114, -115, 9, 45, -96, -52, 118, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 56, -114, -100, 23, 43, -96, -41, 7, 79, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -22, -40, 92, -96, 1, 64, -97, -30, 75, 17, -27, -21, 71, 121, -31, -80, 123, 100, -103, -64, 11, 31, -38, -34, -49, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -113, 26, 42, -27, -104, 16, 33, -8, -104, 23, 45, -96, -41, 65, 101, -49, -102, 15, 49, -77, -110, 57, 41, -53, -108, 30, 54, -79, -39, 10, 36, -62, -116, 30, 120, -71, -117, 92, 98, -119, -62, 113, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 51, -49, -117, 91, 54, -96, Byte.MIN_VALUE, 47, 49, -49, -117, 15, 120, -8, -41, 29, 38, -38, -112, 13, 61, Byte.MIN_VALUE, -101, 25, 40, -53, -105, 15, 118, -74, -110, 16, 32, -51, -115, 18, 55, -85, -92, 8, 36, -36, -115, 91, 36, -71, -41, 19, 41, -54, -81, 26, 52, -80, -110, 82, 41, -53, -105, 28, 44, -83, -52, 118, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 46, -92, -123, 92, 43, -53, -114, 62, 54, -95, -41, 65, 101, -49, -102, 15, 49, -77, -110, 57, 41, -53, -108, 30, 54, -79, -39, 15, 32, -62, -100, 24, 44, -84, -104, 18, 0, -64, -99, 91, 36, -71, -41, 19, 41, -54, -81, 26, 52, -80, -110, 82, 41, -53, -105, 28, 44, -83, -52, 118, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 120, -27, -41, 92, 101, -114, -39, 91, 46, -92, -123, 92, 43, -53, 
        -114, 45, 57, -87, -126, 25, 101, -109, -39, 20, 52, -95, -95, 29, 41, -37, -100, 85, 43, -80, -107, 15, 49, -36, -112, 21, 63, -19, -57, 80, 101, -64, -100, 12, 11, -79, -106, 14, 49, -121, -39, 80, 120, -30}, new byte[]{-7, 123, 88, -59, -9, 124, 69, -82}) + str + IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-19, -94, -80, 92, 104, -38, -89, -41, -85, -18, -18, 25, 41, -59, -74, -29, -71, -10, -23, 21, 105, -47, -21, -17, -81, -11, -34, 18, 99, -97, -8, -117, -22, -94, -69, 92, 39, -106, -29, -95, -22, -94, -69, 92, 39, -106, -29, -95, -22, -94, -69, 92, 39, -106, -29, -95, -22, -94, -69, 92, 102, -43, -73, -24, -68, -25, -34, 16, 98, -37, -90, -17, -66, -84, -19, 29, 107, -61, -90, -95, -9, -94, -11, 25, 112, -32, -94, -19, -65, -25, -96, 118, 39, -106, -29, -95, -22, -94, -69, 92, 39, -106, -29, -95, -22, -94, -69, 92, 39, -106, -29, -95, -22, -94, -69, 92, 39, -106, -29, -95, -85, -31, -17, 21, 113, -45, -122, -19, -81, -17, -2, 18, 115, -104, -80, -28, -90, -25, -8, 8, 110, -39, -83, -46, -66, -29, -23, 8, 39, -117, -29, -32, -87, -10, -14, 10, 98, -13, -81, -28, -89, -25, -11, 8, 41, -59, -90, -19, -81, -31, -17, 21, 104, -40, -122, -17, -82, -94, -90, 92, 105, -45, -76, -46, -66, -29, -23, 8, 39, -99, -29, -90}, new byte[]{-54, -126, -101, 124, 7, -74, -61, -127}) + str + IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{95, 11, -123, -116, 94, 82, 76, 76, 67, 47, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 50, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -58, 31, 21, -48, -125, -34, -64, 102, 120, 89, 91, 72, 81, 12, -63, 83, 98, -44, -114, -114, 46, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 70, 84, 74, 4, 29, 83, -116, -121, 68, 21, 5, 4, 22, 64, -98, -55, 117, 67, 93, 74, 12, 13, -50, Byte.MIN_VALUE, 94, 69, 77, 80, 95, 9, -55, -110, 16, 87, 77, 70, 26, 73, -116, -102, 10, 21, 76, 86, 13, 64, -55, -108, 25, 14, 50, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -120, 83, 65, 81, 82, 29, 96, -123, -116, 93, 80, 86, 80, 86, 65, Byte.MIN_VALUE, -102, 64, 84, 76, 71, 16, 96, -97, -116, 94, 65, 16, 65, 14, 64, -121, -99, 25, 14, 50, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -101, 85, 65, 77, 86, 22, 5, -99, -101, 69, 80, 3, 46, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 5, 47, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 69, 46, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 66, 80, 76, 81, 10, 75, -55, -113, 81, 89, 75, 65, 67, 47, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -108, -64, 24, 28, 3, 46, 88, 5, -55, -55, 16, 21, 24, 4, 88, 5, -55, -55, 16, 21, 24, 4}, new byte[]{120, 37, -23, -23, 48, 53, 56, 36}), (v2) -> {
            llllIIIIll1(r1, r2, v2);
        });
    }

    public final void IllIIlIIII1(String str) {
        this.f629IlIllll1.evaluateJavascript(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-108, -5, -55, 82, -49, -42, -56, 11, -66, -5, -55, 82, -49, -34, -114, 94, -16, -72, -99, 27, Byte.MIN_VALUE, -104, -64, 2, -66, -96, -29, 82, -49, -42, -56, 11, -66, -5, -55, 82, -49, -42, -56, 11, -66, -5, -55, 4, -114, -124, -56, 95, -5, -93, -99, 82, -46, -42, -49}, new byte[]{-98, -37, -23, 114, -17, -10, -24, 43}) + StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-49}, new byte[]{-109, 74, -78, -41, -7, -64, 124, 123}), IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-99, -94}, new byte[]{-63, -2, 111, 56, 38, -22, -91, -122}), false, 4, (Object) null), IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-79}, new byte[]{-106, -92, -15, 0, 124, 118, -34, -10}), IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-101, 73}, new byte[]{-57, 110, -93, -92, -9, 48, -35, 84}), false, 4, (Object) null), IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{67}, new byte[]{97, 11, -120, -85, 125, -2, 4, -54}), IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{46, 72}, new byte[]{114, 106, 93, 68, 19, 57, 63, 14}), false, 4, (Object) null), "\n", IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-40, -59}, new byte[]{-124, -85, -12, 15, -99, -80, -44, -78}), false, 4, (Object) null), "\r", IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{18, -111}, new byte[]{78, -29, 92, 113, -75, Byte.MIN_VALUE, -106, 118}), false, 4, (Object) null), "\t", IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{64, -45}, new byte[]{28, -89, 104, 43, 59, 39, 33, 74}), false, 4, (Object) null) + IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{123, 92, 117, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -113, 9, 79, 123, -59, 63, 19, 22, -113, 13, 120, 55, -63, 49, 2, 17, -115, 72, 0, 123, -64, 51, 4, 10, -108, 13, 83, 47, -118, 61, 4, 11, -112, 30, 88, 30, -56, 57, 10, 26, -105, 28, 6, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 53, 1, 95, -47, 9, 94, 47, -51, 42, 2, 58, -107, 13, 80, 62, -54, 40, 71, 89, -33, 72, 21, 58, -57, 40, 14, 9, -100, 45, 81, 62, -55, 57, 9, 11, -41, 28, 92, 60, -22, 61, 10, 26, -39, 85, 0, 102, -124, 123, 46, 49, -87, 61, 105, 124, -124, 32, 27, 95, -13, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 6, 28, -115, 1, 75, 62, -31, 48, 2, 18, -100, 6, 73, 117, -48, 61, 0, 49, -104, 5, 88, 123, -103, 97, 90, 95, -34, 60, 120, 3, -16, 29, 53, 58, -72, 79, 29, 39, -40, 124, 109, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -59, 63, 19, 22, -113, 13, 120, 55, -63, 49, 2, 17, -115, 70, 84, 40, -25, 51, 9, 11, -100, 6, 73, 30, -64, 53, 19, 30, -101, 4, 88, 114, -115, 124, 28, 117, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 1, 91, 123, -116, 61, 4, 11, -112, 30, 88, 30, -56, 57, 10, 26, -105, 28, 19, 50, -41, 31, 8, 17, -115, 13, 83, 47, -31, 56, 14, 11, -104, 10, 81, 62, -115, 124, 28, 117, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -42, 71, 29, -66, 0, -40, Byte.MIN_VALUE, -17, Byte.MAX_VALUE, -115, -78, -12, 67, -32, -15, -105, 71, -7, 89, 50, -46, -71, -30, -4, 30, -36, -99, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -46, 61, 21, 95, -118, 13, 81, 62, -57, 40, 14, 16, -105, 72, 0, 123, -45, 53, 9, 27, -106, 31, 19, 60, -63, 40, 52, 26, -107, 13, 94, 47, -51, 51, 9, 87, -48, 83, 55, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 45, -59, 46, 71, 13, -104, 6, 90, 62, -97, 86, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 109, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 22, -97, 72, 21, 40, -63, 48, 2, 28, -115, 1, 82, 53, -118, 46, 6, 17, -98, 13, 126, 52, -47, 50, 19, 95, -57, 72, 13, 114, -124, 39, 109, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 41, -59, 50, 0, 26, -39, 85, 29, 40, -63, 48, 2, 28, -115, 1, 82, 53, -118, 59, 2, 11, -85, 9, 83, 60, -63, 29, 19, 87, -55, 65, 6, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -39, 124, 2, 19, -118, 13, 29, 32, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 71, 18, 123, 65, -6, -27, -103, 103, -12, -37, -23, 5, -70, -5, -10, 16, -24, -76, -67, 47, -11, -113, -13, 122, -115, -90, -17, 75, -32, -21, -102, 113, -13, -40, -32, 30, -72, -33, -1, 29, -48, -105, -66, 56, -12, -126, -6, 122, -113, -119, -5, 66, -64, -52, -102, 73, -42, -38, -63, 32, -76, -21, -4, 28, -13, -119, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -117, 9, 83, 60, -63, 124, 90, 95, -99, 7, 94, 46, -55, 57, 9, 11, -41, 11, 79, 62, -59, 40, 2, 45, -104, 6, 90, 62, -116, 117, 92, 117, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -42, 61, 9, 24, -100, 70, 78, 62, -56, 57, 4, 11, -73, 7, 89, 62, -25, 51, 9, 11, -100, 6, 73, 40, -116, 61, 4, 11, -112, 30, 88, 30, -56, 57, 10, 26, -105, 28, 20, 96, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 26, 92, 53, -61, 57, 73, 28, -106, 4, 81, 58, -44, 47, 2, 87, -97, 9, 81, 40, -63, 117, 92, 117, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 
        124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -124, 98, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 55, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 116, -117, 124, -126, -9, 89, -127, -92, -1, 77, -36, -18, -101, 65, -59, -38, -63, 32, -71, -31, -6, 28, -58, -124, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -42, 61, 9, 24, -100, 70, 89, 62, -56, 57, 19, 26, -70, 7, 83, 47, -63, 50, 19, 12, -47, 65, 6, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 115, 72, 95, 31, -25, -81, -66, 33, -7, -127, -23, 126, -114, -95, -9, 76, -42, -27, -104, 123, -47, 55, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 45, -59, 46, 71, 11, -100, 16, 73, 21, -53, 56, 2, 95, -60, 72, 89, 52, -57, 41, 10, 26, -105, 28, 19, 56, -42, 57, 6, 11, -100, 60, 88, 35, -48, 18, 8, 27, -100, 64, 73, 62, -36, 40, 78, 68, -13, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 26, 92, 53, -61, 57, 73, 22, -105, 27, 88, 41, -48, 18, 8, 27, -100, 64, 73, 62, -36, 40, 41, 16, -99, 13, 20, 96, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 86, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 72, 80, -39, Byte.MIN_VALUE, -109, -27, 67, -31, -55, -102, 124, -31, -37, -5, 35, -71, -17, -49, 31, -2, -70, -67, 56, -16, -126, -17, 119, -127, -96, -7, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 46, 6, 17, -98, 13, 19, 40, -63, 40, 52, 11, -104, 26, 73, 26, -62, 40, 2, 13, -47, 28, 88, 35, -48, 18, 8, 27, -100, 65, 6, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -42, 61, 9, 24, -100, 70, 78, 62, -48, 25, 9, 27, -72, 14, 73, 62, -42, 116, 19, 26, -127, 28, 115, 52, -64, 57, 78, 68, -13, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 27, 88, 55, -63, 63, 19, 22, -106, 6, 19, 41, -63, 49, 8, 9, -100, 41, 81, 55, -10, 61, 9, 24, -100, 27, 21, 114, -97, 86, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 20, 26, -107, 13, 94, 47, -51, 51, 9, 81, -104, 12, 89, 9, -59, 50, 0, 26, -47, 26, 92, 53, -61, 57, 78, 68, -13, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 98, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 18, 116, -124, -76, -64, -39, 28, -25, -84, 50, -54, 44, 18, 11, 29, -46, -74, -65, 31, -22, 109, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 9, -104, 26, 29, 50, -54, 44, 18, 11, -68, 30, 88, 53, -48, 124, 90, 95, -105, 13, 74, 123, -31, 42, 2, 17, -115, 64, 26, 50, -54, 44, 18, 11, -34, 68, 29, 32, -124, 62, 18, 29, -101, 4, 88, 40, -98, 124, 19, 13, -116, 13, 17, 123, -57, 61, 9, 28, -100, 4, 92, 57, -56, 57, 93, 95, -115, 26, 72, 62, -124, 33, 78, 68, -13, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 9, 94, 47, -51, 42, 2, 58, -107, 13, 80, 62, -54, 40, 73, 27, -112, 27, 77, 58, -48, 63, 15, 58, -113, 13, 83, 47, -116, 53, 9, 15, -116, 28, 120, 45, -63, 50, 19, 86, -62, 98, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 55, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 41, -63, 40, 18, 13, -105, 72, 73, 41, -47, 57, 92, 117, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -39, 124, 2, 19, -118, 13, 29, 32, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 115, 72, 95, 28, -52, -71, -68, 52, -38, 14, 17, -119, 29, 73, -66, 54, -48, 19, 26, -127, 28, 92, 41, -63, 61, -126, -6, 122, -113, -119, -5, -82, 
        124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 42, 6, 13, -39, 7, 81, 63, -14, 61, 11, 10, -100, 72, 0, 123, -59, 63, 19, 22, -113, 13, 120, 55, -63, 49, 2, 17, -115, 70, 75, 58, -56, 41, 2, 95, -123, 20, 29, 124, -125, 103, 109, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 9, -104, 26, 29, 40, -63, 48, 2, 28, -115, 1, 82, 53, -9, 40, 6, 13, -115, 72, 0, 123, -59, 63, 19, 22, -113, 13, 120, 55, -63, 49, 2, 17, -115, 70, 78, 62, -56, 57, 4, 11, -112, 7, 83, 8, -48, 61, 21, 11, -39, 20, 65, 123, -108, 103, 109, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 9, -104, 26, 29, 40, -63, 48, 2, 28, -115, 1, 82, 53, -31, 50, 3, 95, -60, 72, 92, 56, -48, 53, 17, 26, -68, 4, 88, 54, -63, 50, 19, 81, -118, 13, 81, 62, -57, 40, 14, 16, -105, 45, 83, 63, -124, 32, 27, 95, -55, 83, 55, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -117, 115, 71, -103, 103, -20, -40, -32, 30, -70, -15, -49, 28, -24, -127, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -46, 61, 21, 95, -105, 13, 74, 13, -59, 48, 18, 26, -39, 85, 29, 52, -56, 56, 49, 30, -107, 29, 88, 117, -41, 41, 5, 12, -115, 26, 84, 53, -61, 116, 87, 83, -39, 27, 88, 55, -63, 63, 19, 22, -106, 6, 110, 47, -59, 46, 19, 86, -39, 67, 29, 47, -63, 36, 19, 95, -46, 72, 82, 55, -64, 10, 6, 19, -116, 13, 19, 40, -47, 62, 20, 11, -117, 1, 83, 60, -116, 47, 2, 19, -100, 11, 73, 50, -53, 50, 34, 17, -99, 65, 6, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -46, 61, 21, 95, -105, 13, 74, 24, -47, 46, 20, 16, -117, 56, 82, 40, -124, 97, 71, 12, -100, 4, 88, 56, -48, 53, 8, 17, -86, 28, 92, 41, -48, 124, 76, 95, -115, 13, 69, 47, -118, 48, 2, 17, -98, 28, 85, 96, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 86, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 72, 80, -39, Byte.MIN_VALUE, -109, -27, 67, -31, -55, -103, 111, -40, -40, -37, 24, 86, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 6, 28, -115, 1, 75, 62, -31, 48, 2, 18, -100, 6, 73, 117, -46, 61, 11, 10, -100, 72, 0, 123, -54, 57, 16, 41, -104, 4, 72, 62, -97, 86, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 109, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 80, -42, 72, -43, -11, 26, -69, -38, -47, 28, -19, -76, -67, 4, -37, -125, -62, 116, -113, Byte.MIN_VALUE, -11, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 61, 4, 11, -112, 30, 88, 30, -56, 57, 10, 26, -105, 28, 19, 40, -63, 48, 2, 28, -115, 1, 82, 53, -9, 40, 6, 13, -115, 72, 0, 123, -54, 57, 16, 60, -116, 26, 78, 52, -42, 12, 8, 12, -62, 98, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 92, 56, -48, 53, 17, 26, -68, 4, 88, 54, -63, 50, 19, 81, -118, 13, 81, 62, -57, 40, 14, 16, -105, 45, 83, 63, -124, 97, 71, 17, -100, 31, 126, 46, -42, 47, 8, 13, -87, 7, 78, 96, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 86, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 72, 80, -39, Byte.MIN_VALUE, -102, -3, 65, -45, -10, 22, -105, 24, 72, 47, 64, -26, -20, -101, 66, -34, 55, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 45, -59, 46, 71, 22, -105, 24, 72, 47, -31, 42, 2, 17, -115, 72, 0, 123, -54, 57, 16, 95, -68, 30, 88, 53, -48, 116, 64, 22, -105, 24, 72, 47, -125, 112, 71, 4, -39, 10, 72, 57, -58, 48, 2, 12, -61, 72, 73, 41, -47, 57, 75, 95, -102, 9, 83, 56, -63, 48, 6, 29, -107, 13, 7, 123, -48, 46, 18, 26, -39, 21, 20, 96, -82, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 
        61, 4, 11, -112, 30, 88, 30, -56, 57, 10, 26, -105, 28, 19, 63, -51, 47, 23, 30, -115, 11, 85, 30, -46, 57, 9, 11, -47, 1, 83, 43, -47, 40, 34, 9, -100, 6, 73, 114, -97, 86, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 109, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 80, -42, 72, -39, -30, 59, -76, -64, -39, 28, -25, -84, 56, -52, 61, 9, 24, -100, -116, -121, -48, 64, -25, -47, -101, 66, -51, -38, -6, 10, -72, -40, -30, 17, -55, -107, -66, 41, -55, -114, -43, 117, Byte.MIN_VALUE, -110, -38, 67, -15, -18, 117, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -113, 9, 79, 123, -57, 52, 6, 17, -98, 13, 120, 45, -63, 50, 19, 95, -60, 72, 83, 62, -45, 124, 34, 9, -100, 6, 73, 115, -125, 63, 15, 30, -105, 15, 88, 124, -120, 124, 28, 95, -101, 29, 95, 57, -56, 57, 20, 69, -39, 28, 79, 46, -63, 112, 71, 28, -104, 6, 94, 62, -56, 61, 5, 19, -100, 82, 29, 47, -42, 41, 2, 95, -124, 65, 6, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -59, 63, 19, 22, -113, 13, 120, 55, -63, 49, 2, 17, -115, 70, 89, 50, -41, 44, 6, 11, -102, 0, 120, 45, -63, 50, 19, 87, -102, 0, 92, 53, -61, 57, 34, 9, -100, 6, 73, 114, -97, 86, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 109, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 13, -100, 28, 72, 41, -54, 124, 19, 13, -116, 13, 6, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -124, 98, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 64, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -42, 57, 19, 10, -117, 6, 29, 61, -59, 48, 20, 26, -62, 98, 29, 123, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 26, 86, -47, 65, 6, 81, -124, 124, 71, 95, -39, 72, 29, 123, -124, 124, 71, 95}, new byte[]{92, 103, Byte.MAX_VALUE, -7, 104, 61, 91, -92}), (v2) -> {
            lIIIIlllllIlll1(r1, r2, v2);
        });
    }

    public static final void llIIIIlIlllIII1(IllIIlIIII1 illIIlIIII1) {
        if (illIIlIIII1.f644lllIlIlllI1.get()) {
            return;
        }
        illIIlIIII1.IllIIlIIII1();
    }

    public final void IllIIlIIII1() {
        if (this.f644lllIlIlllI1.get() || this.f645llIlIIlll1.get()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.lIIIllllllIIII1;
        PeerConnection peerConnection = this.f622IllIIlIIII1;
        PeerConnection.IceConnectionState iceConnectionState = peerConnection != null ? peerConnection.iceConnectionState() : null;
        PeerConnection peerConnection2 = this.f622IllIIlIIII1;
        PeerConnection.PeerConnectionState connectionState = peerConnection2 != null ? peerConnection2.connectionState() : null;
        PeerConnection peerConnection3 = this.f622IllIIlIIII1;
        PeerConnection.SignalingState signalingState = peerConnection3 != null ? peerConnection3.signalingState() : null;
        DataChannel dataChannel = this.f623IlIlllIIlI1;
        DataChannel.State state = dataChannel != null ? dataChannel.state() : null;
        PeerConnection.SignalingState signalingState2 = signalingState;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        llllIIIIll1(1, lllliiiill1.llllIIIIll1(new byte[]{-57, 125, -68, -64, 95, -32, Byte.MIN_VALUE, -41, -65, 56, -78, -125, 39, -49, -34, -114, -95, 95}, new byte[]{33, -34, 60, 38, -64, 69, 104, 104}), MapsKt.mapOf(new Pair[]{TuplesKt.to(lllliiiill1.llllIIIIll1(new byte[]{59, 75, -2, 19, -58, -77, -89, -99, 71, 55, -49, 102}, new byte[]{-35, -34, 78, -11, 75, 29, 78, 29}), state), TuplesKt.to(lllliiiill1.llllIIIIll1(new byte[]{89, 113, -22}, new byte[]{16, 50, -81, 79, 119, 99, 123, -83}), iceConnectionState), TuplesKt.to(lllliiiill1.llllIIIIll1(new byte[]{38, -123, 93, -53}, new byte[]{118, -32, 56, -71, -27, 116, 16, -16}), connectionState), TuplesKt.to(lllliiiill1.llllIIIIll1(new byte[]{24, 97, -18, -107, -37, -81, 47, 112, 44}, new byte[]{75, 8, -119, -5, -70, -61, 70, 30}), signalingState), TuplesKt.to(lllliiiill1.llllIIIIll1(new byte[]{-21, -18, 73, -69, -48, -112, -13, 59, -71, -80, 67, -36, -103, -66, -116, 84, -125, -64}, new byte[]{15, 86, -61, 93, 124, 49, 20, -79}), (elapsedRealtime / IlIIIIllllIlI1.lIIIIlllllIlll1.f67IIlIllIIll1) + lllliiiill1.llllIIIIll1(new byte[]{120, 126, 69, -94, -10, 32}, new byte[]{-97, -39, -41, 71, Byte.MAX_VALUE, -83, -107, -114}))}));
        if (signalingState2 == PeerConnection.SignalingState.CLOSED) {
            llllIIIIll1(2, lllliiiill1.llllIIIIll1(new byte[]{24, 112, -120, -56, -66, -102, -122, -103, 74, 41, -87, -83, -32, -119, -45, -10, 121, 124, -64, -69, -88, -47, -35, -97, 21, 83, -87, -60, -93, -65, -120, -108, 113, 39, -106, -78}, new byte[]{-4, -49, 41, 44, 5, 62, 97, 19}), (Object) null);
            return;
        }
        if ((iceConnectionState == PeerConnection.IceConnectionState.CONNECTED || iceConnectionState == PeerConnection.IceConnectionState.COMPLETED) && (state == null || state != DataChannel.State.OPEN)) {
            if (elapsedRealtime > IlIlIIlIII1.IllIIlIIII1.f162IlIIlllllI1) {
                llllIIIIll1(2, lllliiiill1.llllIIIIll1(new byte[]{110, 101, 124, 86, 97, -115, 46, -82, -50, 61, 126, 47, 41, -94, -62, 11, 3, 69, 36, 59, 80, -61, -37, 97, 111, 104, 71, 87, 90, -100, -127, 96, 37, 60, 65, 43, 38, -83, -12, 5, 61, 80, 41, 14, 72, 31, 87, 10, 44, 71, 39, 45, 101, -54, -18, 126, 110, 105, 65}, new byte[]{-117, -43, -63, -79, -49, 44, 103, -19}), lllliiiill1.llllIIIIll1(new byte[]{-119, 98, 55, -19, -124, 23, -17, -107, -31, 58, 21, -101}, new byte[]{108, -46, -86, 5, 43, -126, 6, 18}));
                return;
            }
            return;
        }
        PeerConnection.IceConnectionState iceConnectionState2 = iceConnectionState;
        PeerConnection.IceConnectionState iceConnectionState3 = PeerConnection.IceConnectionState.FAILED;
        if (iceConnectionState2 == iceConnectionState3 || iceConnectionState == PeerConnection.IceConnectionState.CLOSED || iceConnectionState == PeerConnection.IceConnectionState.DISCONNECTED) {
            if (elapsedRealtime > 15000) {
                llllIIIIll1(2, lllliiiill1.llllIIIIll1(new byte[]{48, 115, 75, 89, -61, -109, 68, -117, -36, -41, -124, 7, -102, -115, 35, -32, -59, -78, -21, 9, -60, -27, 20, Byte.MIN_VALUE, -111, -113, -119, Byte.MIN_VALUE, 73, -22, 5, -105}, new byte[]{121, 48, 14, -79, 124, 13, -94, 5}), MapsKt.mapOf(new Pair[]{TuplesKt.to(lllliiiill1.llllIIIIll1(new byte[]{35, 1, -13, 44, -85, -34}, new byte[]{-60, -117, 69, -54, 43, 95, -16, -51}), iceConnectionState), TuplesKt.to(lllliiiill1.llllIIIIll1(new byte[]{-117, -91, 68, -82, -78, 68, -3, -87, -37, -64, 82, -3}, new byte[]{109, 41, -59, 73, 9, -23, 27, 62}), new StringBuilder().append(124L).append((char) 31186).toString())}));
                return;
            }
            if (iceConnectionState == iceConnectionState3) {
                llllIIIIll1(1, lllliiiill1.llllIIIIll1(new byte[]{100, 20, -85, -34, -113, -88, -37, 71, -120, -78, 74, -121, -40, -126, -104, 38, -111, -37, 11, -122, -83, -34, -110, 92, -60, -48, 99, -45, -96, -103, 116, -118, 104}, new byte[]{45, 87, -18, 54, 48, 54, 61, -55}), (Object) null);
                PeerConnection peerConnection4 = this.f622IllIIlIIII1;
                if (peerConnection4 != null) {
                    peerConnection4.restartIce();
                }
            }
        }
    }

    public static final void IlIIlllllI1(IllIIlIIII1 illIIlIIII1) {
        try {
            illIIlIIII1.IlIlllIIlI1();
            if (illIIlIIII1.f626IlIlIIlIII1 == null || illIIlIIII1.f625llllllIlIIIlll1 == null) {
                byte[] bArr = new byte[27];
                bArr[0] = -99;
                bArr[1] = -44;
                bArr[2] = 25;
                bArr[3] = -114;
                bArr[4] = 14;
                bArr[5] = 20;
                bArr[6] = 64;
                bArr[7] = 27;
                bArr[8] = -23;
                bArr[9] = -74;
                bArr[10] = 51;
                bArr[11] = -29;
                bArr[12] = 125;
                bArr[13] = 40;
                bArr[14] = 51;
                bArr[15] = 123;
                bArr[16] = -45;
                bArr[17] = -43;
                bArr[18] = 125;
                bArr[19] = -54;
                bArr[20] = 9;
                bArr[21] = 76;
                bArr[22] = 16;
                bArr[23] = 23;
                bArr[24] = -110;
                bArr[25] = -23;
                bArr[26] = 4;
                byte[] bArr2 = new byte[8];
                bArr2[0] = 116;
                bArr2[1] = 83;
                bArr2[2] = -108;
                bArr2[3] = 104;
                bArr2[4] = -104;
                bArr2[5] = -92;
                bArr2[6] = -91;
                bArr2[7] = -109;
                illIIlIIII1.llllIIIIll1(1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2), (Object) null);
                illIIlIIII1.IlIIlllllI1();
            }
            illIIlIIII1.IlIllIlllIllI1();
            illIIlIIII1.lIllIlIll1();
            illIIlIIII1.lIllIIIlIl1();
            illIIlIIII1.lllIlIIIlI1();
            illIIlIIII1.f645llIlIIlll1.set(false);
        } catch (Throwable th) {
            illIIlIIII1.llllIIIIll1(3, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-28, -97, -41, -26, 9, -33, -51, 30, -68, -16, -18, -85}, new byte[]{13, 24, 90, 14, -74, 65, 40, -70}), th.getMessage());
            illIIlIIII1.f645llIlIIlll1.set(false);
            illIIlIIII1.llIIllIl1();
        }
    }

    @Nullable
    public final EglBase.Context IIlIllIIll1() {
        try {
            byte[] bArr = new byte[18];
            bArr[0] = -102;
            bArr[1] = -31;
            bArr[2] = 112;
            bArr[3] = 100;
            bArr[4] = -50;
            bArr[5] = 8;
            bArr[6] = 44;
            bArr[7] = 26;
            bArr[8] = -127;
            bArr[9] = -16;
            bArr[10] = 57;
            bArr[11] = 15;
            bArr[12] = -34;
            bArr[13] = 1;
            bArr[14] = 12;
            bArr[15] = 9;
            bArr[16] = -122;
            bArr[17] = -10;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -11;
            bArr2[1] = -109;
            bArr2[2] = 23;
            bArr2[3] = 74;
            bArr2[4] = -71;
            bArr2[5] = 109;
            bArr2[6] = 78;
            bArr2[7] = 104;
            Class<?> cls = Class.forName(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr, bArr2));
            byte[] bArr3 = new byte[6];
            bArr3[0] = 110;
            bArr3[1] = -38;
            bArr3[2] = 68;
            bArr3[3] = -85;
            bArr3[4] = 69;
            bArr3[5] = -84;
            byte[] bArr4 = new byte[8];
            bArr4[0] = 13;
            bArr4[1] = -88;
            bArr4[2] = 33;
            bArr4[3] = -54;
            bArr4[4] = 49;
            bArr4[5] = -55;
            bArr4[6] = -98;
            bArr4[7] = 29;
            Object invoke = cls.getDeclaredMethod(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr3, bArr4), null).invoke(null, null);
            byte[] bArr5 = new byte[55];
            bArr5[0] = 25;
            bArr5[1] = -108;
            bArr5[2] = 2;
            bArr5[3] = 26;
            bArr5[4] = -126;
            bArr5[5] = 113;
            bArr5[6] = -35;
            bArr5[7] = -82;
            bArr5[8] = 25;
            bArr5[9] = -114;
            bArr5[10] = 26;
            bArr5[11] = 86;
            bArr5[12] = -64;
            bArr5[13] = 119;
            bArr5[14] = -100;
            bArr5[15] = -93;
            bArr5[16] = 22;
            bArr5[17] = -110;
            bArr5[18] = 26;
            bArr5[19] = 86;
            bArr5[20] = -42;
            bArr5[21] = 125;
            bArr5[22] = -100;
            bArr5[23] = -82;
            bArr5[24] = 24;
            bArr5[25] = -113;
            bArr5[26] = 67;
            bArr5[27] = 24;
            bArr5[28] = -41;
            bArr5[29] = 126;
            bArr5[30] = -48;
            bArr5[31] = -32;
            bArr5[32] = 3;
            bArr5[33] = -104;
            bArr5[34] = 30;
            bArr5[35] = 19;
            bArr5[36] = -126;
            bArr5[37] = 125;
            bArr5[38] = -50;
            bArr5[39] = -89;
            bArr5[40] = 89;
            bArr5[41] = -106;
            bArr5[42] = 11;
            bArr5[43] = 20;
            bArr5[44] = -48;
            bArr5[45] = 102;
            bArr5[46] = -33;
            bArr5[47] = -18;
            bArr5[48] = 50;
            bArr5[49] = -122;
            bArr5[50] = 2;
            bArr5[51] = 52;
            bArr5[52] = -61;
            bArr5[53] = 97;
            bArr5[54] = -39;
            byte[] bArr6 = new byte[8];
            bArr6[0] = 119;
            bArr6[1] = -31;
            bArr6[2] = 110;
            bArr6[3] = 118;
            bArr6[4] = -94;
            bArr6[5] = 18;
            bArr6[6] = -68;
            bArr6[7] = -64;
            Intrinsics.checkNotNull(invoke, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr5, bArr6));
            return ((EglBase) invoke).getEglBaseContext();
        } catch (Exception unused) {
            try {
                byte[] bArr7 = new byte[6];
                bArr7[0] = 11;
                bArr7[1] = 113;
                bArr7[2] = -98;
                bArr7[3] = -54;
                bArr7[4] = 103;
                bArr7[5] = 34;
                byte[] bArr8 = new byte[8];
                bArr8[0] = 92;
                bArr8[1] = 20;
                bArr8[2] = -4;
                bArr8[3] = -104;
                bArr8[4] = 51;
                bArr8[5] = 97;
                bArr8[6] = -11;
                bArr8[7] = -83;
                IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr7, bArr8);
                byte[] bArr9 = new byte[53];
                bArr9[0] = 2;
                bArr9[1] = -108;
                bArr9[2] = 92;
                bArr9[3] = -19;
                bArr9[4] = 4;
                bArr9[5] = -54;
                bArr9[6] = -114;
                bArr9[7] = 97;
                bArr9[8] = 82;
                bArr9[9] = -22;
                bArr9[10] = 103;
                bArr9[11] = -99;
                bArr9[12] = -86;
                bArr9[13] = 12;
                bArr9[14] = 20;
                bArr9[15] = -118;
                bArr9[16] = -124;
                bArr9[17] = 123;
                bArr9[18] = -115;
                bArr9[19] = 43;
                bArr9[20] = 108;
                bArr9[21] = -7;
                bArr9[22] = -33;
                bArr9[23] = 9;
                bArr9[24] = 86;
                bArr9[25] = -102;
                bArr9[26] = 13;
                bArr9[27] = -81;
                bArr9[28] = 59;
                bArr9[29] = -121;
                bArr9[30] = -46;
                bArr9[31] = 74;
                bArr9[32] = 10;
                bArr9[33] = -77;
                bArr9[34] = 100;
                bArr9[35] = -18;
                bArr9[36] = 58;
                bArr9[37] = -14;
                bArr9[38] = -114;
                bArr9[39] = 64;
                bArr9[40] = 112;
                bArr9[41] = -22;
                bArr9[42] = 109;
                bArr9[43] = -67;
                bArr9[44] = 110;
                bArr9[45] = -44;
                bArr9[46] = -16;
                bArr9[47] = 9;
                bArr9[48] = 115;
                bArr9[49] = -74;
                bArr9[50] = 13;
                bArr9[51] = -73;
                bArr9[52] = 5;
                byte[] bArr10 = new byte[8];
                bArr10[0] = -27;
                bArr10[1] = 15;
                bArr10[2] = -24;
                bArr10[3] = 11;
                bArr10[4] = -118;
                bArr10[5] = 111;
                bArr10[6] = 102;
                bArr10[7] = -17;
                IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr9, bArr10);
                try {
                    byte[] bArr11 = new byte[22];
                    bArr11[0] = 116;
                    bArr11[1] = 39;
                    bArr11[2] = 88;
                    bArr11[3] = 111;
                    bArr11[4] = -110;
                    bArr11[5] = 15;
                    bArr11[6] = 26;
                    bArr11[7] = 52;
                    bArr11[8] = 111;
                    bArr11[9] = 54;
                    bArr11[10] = 17;
                    bArr11[11] = 4;
                    bArr11[12] = -126;
                    bArr11[13] = 6;
                    bArr11[14] = 58;
                    bArr11[15] = 39;
                    bArr11[16] = 104;
                    bArr11[17] = 48;
                    bArr11[18] = 27;
                    bArr11[19] = 108;
                    bArr11[20] = -90;
                    bArr11[21] = 41;
                    byte[] bArr12 = new byte[8];
                    bArr12[0] = 27;
                    bArr12[1] = 85;
                    bArr12[2] = 63;
                    bArr12[3] = 65;
                    bArr12[4] = -27;
                    bArr12[5] = 106;
                    bArr12[6] = 120;
                    bArr12[7] = 70;
                    Class<?> cls2 = Class.forName(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr11, bArr12));
                    byte[] bArr13 = new byte[6];
                    bArr13[0] = 103;
                    bArr13[1] = -90;
                    bArr13[2] = 28;
                    bArr13[3] = 39;
                    bArr13[4] = 19;
                    bArr13[5] = -70;
                    byte[] bArr14 = new byte[8];
                    bArr14[0] = 4;
                    bArr14[1] = -44;
                    bArr14[2] = 121;
                    bArr14[3] = 70;
                    bArr14[4] = 103;
                    bArr14[5] = -33;
                    bArr14[6] = -37;
                    bArr14[7] = 76;
                    Object invoke2 = cls2.getDeclaredMethod(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr13, bArr14), null).invoke(null, null);
                    byte[] bArr15 = new byte[55];
                    bArr15[0] = 93;
                    bArr15[1] = -126;
                    bArr15[2] = 82;
                    bArr15[3] = 39;
                    bArr15[4] = -37;
                    bArr15[5] = 44;
                    bArr15[6] = 81;
                    bArr15[7] = -89;
                    bArr15[8] = 93;
                    bArr15[9] = -104;
                    bArr15[10] = 74;
                    bArr15[11] = 107;
                    bArr15[12] = -103;
                    bArr15[13] = 42;
                    bArr15[14] = 16;
                    bArr15[15] = -86;
                    bArr15[16] = 82;
                    bArr15[17] = -124;
                    bArr15[18] = 74;
                    bArr15[19] = 107;
                    bArr15[20] = -113;
                    bArr15[21] = 32;
                    bArr15[22] = 16;
                    bArr15[23] = -89;
                    bArr15[24] = 92;
                    bArr15[25] = -103;
                    bArr15[26] = 19;
                    bArr15[27] = 37;
                    bArr15[28] = -114;
                    bArr15[29] = 35;
                    bArr15[30] = 92;
                    bArr15[31] = -23;
                    bArr15[32] = 71;
                    bArr15[33] = -114;
                    bArr15[34] = 78;
                    bArr15[35] = 46;
                    bArr15[36] = -37;
                    bArr15[37] = 32;
                    bArr15[38] = 66;
                    bArr15[39] = -82;
                    bArr15[40] = 29;
                    bArr15[41] = Byte.MIN_VALUE;
                    bArr15[42] = 91;
                    bArr15[43] = 41;
                    bArr15[44] = -119;
                    bArr15[45] = 59;
                    bArr15[46] = 83;
                    bArr15[47] = -25;
                    bArr15[48] = 118;
                    bArr15[49] = -112;
                    bArr15[50] = 82;
                    bArr15[51] = 9;
                    bArr15[52] = -102;
                    bArr15[53] = 60;
                    bArr15[54] = 85;
                    byte[] bArr16 = new byte[8];
                    bArr16[0] = 51;
                    bArr16[1] = -9;
                    bArr16[2] = 62;
                    bArr16[3] = 75;
                    bArr16[4] = -5;
                    bArr16[5] = 79;
                    bArr16[6] = 48;
                    bArr16[7] = -55;
                    Intrinsics.checkNotNull(invoke2, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr15, bArr16));
                    return ((EglBase) invoke2).getEglBaseContext();
                } catch (Exception unused2) {
                    byte[] bArr17 = new byte[6];
                    bArr17[0] = 72;
                    bArr17[1] = -63;
                    bArr17[2] = 34;
                    bArr17[3] = 28;
                    bArr17[4] = 126;
                    bArr17[5] = -85;
                    byte[] bArr18 = new byte[8];
                    bArr18[0] = 31;
                    bArr18[1] = -92;
                    bArr18[2] = 64;
                    bArr18[3] = 78;
                    bArr18[4] = 42;
                    bArr18[5] = -24;
                    bArr18[6] = 72;
                    bArr18[7] = -124;
                    IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr17, bArr18);
                    byte[] bArr19 = new byte[58];
                    bArr19[0] = -15;
                    bArr19[1] = -4;
                    bArr19[2] = -83;
                    bArr19[3] = 86;
                    bArr19[4] = 8;
                    bArr19[5] = 51;
                    bArr19[6] = 59;
                    bArr19[7] = -96;
                    bArr19[8] = Byte.MAX_VALUE;
                    bArr19[9] = 16;
                    bArr19[10] = 117;
                    bArr19[11] = -33;
                    bArr19[12] = -60;
                    bArr19[13] = -47;
                    bArr19[14] = 63;
                    bArr19[15] = -56;
                    bArr19[16] = 91;
                    bArr19[17] = 63;
                    bArr19[18] = 23;
                    bArr19[19] = 86;
                    bArr19[20] = 57;
                    bArr19[21] = 3;
                    bArr19[22] = -2;
                    bArr19[23] = 106;
                    bArr19[24] = -114;
                    bArr19[25] = -103;
                    bArr19[26] = -109;
                    bArr19[27] = 15;
                    bArr19[28] = 95;
                    bArr19[29] = 0;
                    bArr19[30] = -66;
                    bArr19[31] = 10;
                    bArr19[32] = -92;
                    bArr19[33] = -16;
                    bArr19[34] = -46;
                    bArr19[35] = 14;
                    bArr19[36] = 42;
                    bArr19[37] = 92;
                    bArr19[38] = -76;
                    bArr19[39] = 112;
                    bArr19[40] = -2;
                    bArr19[41] = -32;
                    bArr19[42] = -73;
                    bArr19[43] = 91;
                    bArr19[44] = 39;
                    bArr19[45] = 58;
                    bArr19[46] = -1;
                    bArr19[47] = 93;
                    bArr19[48] = -104;
                    bArr19[49] = -101;
                    bArr19[50] = -112;
                    bArr19[51] = 51;
                    bArr19[52] = 81;
                    bArr19[53] = 34;
                    bArr19[54] = -94;
                    bArr19[55] = 0;
                    bArr19[56] = -92;
                    bArr19[57] = -13;
                    byte[] bArr20 = new byte[8];
                    bArr20[0] = 24;
                    bArr20[1] = 124;
                    bArr20[2] = 55;
                    bArr20[3] = -66;
                    bArr20[4] = -73;
                    bArr20[5] = -76;
                    bArr20[6] = 27;
                    bArr20[7] = -27;
                    IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr19, bArr20);
                    try {
                        byte[] bArr21 = new byte[21];
                        bArr21[0] = 101;
                        bArr21[1] = -32;
                        bArr21[2] = 8;
                        bArr21[3] = 2;
                        bArr21[4] = -38;
                        bArr21[5] = -116;
                        bArr21[6] = -58;
                        bArr21[7] = -58;
                        bArr21[8] = 126;
                        bArr21[9] = -15;
                        bArr21[10] = 65;
                        bArr21[11] = 105;
                        bArr21[12] = -54;
                        bArr21[13] = -123;
                        bArr21[14] = -26;
                        bArr21[15] = -43;
                        bArr21[16] = 121;
                        bArr21[17] = -9;
                        bArr21[18] = 75;
                        bArr21[19] = 111;
                        bArr21[20] = -18;
                        byte[] bArr22 = new byte[8];
                        bArr22[0] = 10;
                        bArr22[1] = -110;
                        bArr22[2] = 111;
                        bArr22[3] = 44;
                        bArr22[4] = -83;
                        bArr22[5] = -23;
                        bArr22[6] = -92;
                        bArr22[7] = -76;
                        Class<?> cls3 = Class.forName(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr21, bArr22));
                        byte[] bArr23 = new byte[6];
                        bArr23[0] = 9;
                        bArr23[1] = -127;
                        bArr23[2] = Byte.MIN_VALUE;
                        bArr23[3] = -97;
                        bArr23[4] = 93;
                        bArr23[5] = 60;
                        byte[] bArr24 = new byte[8];
                        bArr24[0] = 106;
                        bArr24[1] = -13;
                        bArr24[2] = -27;
                        bArr24[3] = -2;
                        bArr24[4] = 41;
                        bArr24[5] = 89;
                        bArr24[6] = -32;
                        bArr24[7] = -50;
                        Object invoke3 = cls3.getDeclaredMethod(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr23, bArr24), null).invoke(null, null);
                        byte[] bArr25 = new byte[55];
                        bArr25[0] = -15;
                        bArr25[1] = -124;
                        bArr25[2] = -30;
                        bArr25[3] = 74;
                        bArr25[4] = -73;
                        bArr25[5] = 65;
                        bArr25[6] = -83;
                        bArr25[7] = 85;
                        bArr25[8] = -15;
                        bArr25[9] = -98;
                        bArr25[10] = -6;
                        bArr25[11] = 6;
                        bArr25[12] = -11;
                        bArr25[13] = 71;
                        bArr25[14] = -20;
                        bArr25[15] = 88;
                        bArr25[16] = -2;
                        bArr25[17] = -126;
                        bArr25[18] = -6;
                        bArr25[19] = 6;
                        bArr25[20] = -29;
                        bArr25[21] = 77;
                        bArr25[22] = -20;
                        bArr25[23] = 85;
                        bArr25[24] = -16;
                        bArr25[25] = -97;
                        bArr25[26] = -93;
                        bArr25[27] = 72;
                        bArr25[28] = -30;
                        bArr25[29] = 78;
                        bArr25[30] = -96;
                        bArr25[31] = 27;
                        bArr25[32] = -21;
                        bArr25[33] = -120;
                        bArr25[34] = -2;
                        bArr25[35] = 67;
                        bArr25[36] = -73;
                        bArr25[37] = 77;
                        bArr25[38] = -66;
                        bArr25[39] = 92;
                        bArr25[40] = -79;
                        bArr25[41] = -122;
                        bArr25[42] = -21;
                        bArr25[43] = 68;
                        bArr25[44] = -27;
                        bArr25[45] = 86;
                        bArr25[46] = -81;
                        bArr25[47] = 21;
                        bArr25[48] = -38;
                        bArr25[49] = -106;
                        bArr25[50] = -30;
                        bArr25[51] = 100;
                        bArr25[52] = -10;
                        bArr25[53] = 81;
                        bArr25[54] = -87;
                        byte[] bArr26 = new byte[8];
                        bArr26[0] = -97;
                        bArr26[1] = -15;
                        bArr26[2] = -114;
                        bArr26[3] = 38;
                        bArr26[4] = -105;
                        bArr26[5] = 34;
                        bArr26[6] = -52;
                        bArr26[7] = 59;
                        Intrinsics.checkNotNull(invoke3, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr25, bArr26));
                        return ((EglBase) invoke3).getEglBaseContext();
                    } catch (Exception unused3) {
                        byte[] bArr27 = new byte[6];
                        bArr27[0] = -16;
                        bArr27[1] = 112;
                        bArr27[2] = -80;
                        bArr27[3] = 55;
                        bArr27[4] = -118;
                        bArr27[5] = -28;
                        byte[] bArr28 = new byte[8];
                        bArr28[0] = -89;
                        bArr28[1] = 21;
                        bArr28[2] = -46;
                        bArr28[3] = 101;
                        bArr28[4] = -34;
                        bArr28[5] = -89;
                        bArr28[6] = 102;
                        bArr28[7] = -81;
                        IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr27, bArr28);
                        byte[] bArr29 = new byte[33];
                        bArr29[0] = 107;
                        bArr29[1] = -102;
                        bArr29[2] = -41;
                        bArr29[3] = -115;
                        bArr29[4] = -49;
                        bArr29[5] = 15;
                        bArr29[6] = 26;
                        bArr29[7] = 106;
                        bArr29[8] = -27;
                        bArr29[9] = 118;
                        bArr29[10] = 15;
                        bArr29[11] = 4;
                        bArr29[12] = 3;
                        bArr29[13] = -19;
                        bArr29[14] = 30;
                        bArr29[15] = 108;
                        bArr29[16] = -63;
                        bArr29[17] = 58;
                        bArr29[18] = -91;
                        bArr29[19] = -21;
                        bArr29[20] = -57;
                        bArr29[21] = 109;
                        bArr29[22] = -75;
                        bArr29[23] = -71;
                        bArr29[24] = 102;
                        bArr29[25] = -93;
                        bArr29[26] = -46;
                        bArr29[27] = Byte.MIN_VALUE;
                        bArr29[28] = -44;
                        bArr29[29] = 57;
                        bArr29[30] = -46;
                        bArr29[31] = -101;
                        bArr29[32] = 39;
                        byte[] bArr30 = new byte[8];
                        bArr30[0] = -126;
                        bArr30[1] = 26;
                        bArr30[2] = 77;
                        bArr30[3] = 101;
                        bArr30[4] = 112;
                        bArr30[5] = -120;
                        bArr30[6] = 58;
                        bArr30[7] = 47;
                        IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr29, bArr30);
                        byte[] bArr31 = new byte[6];
                        bArr31[0] = 11;
                        bArr31[1] = -66;
                        bArr31[2] = -39;
                        bArr31[3] = -91;
                        bArr31[4] = 74;
                        bArr31[5] = 116;
                        byte[] bArr32 = new byte[8];
                        bArr32[0] = 92;
                        bArr32[1] = -37;
                        bArr32[2] = -69;
                        bArr32[3] = -9;
                        bArr32[4] = 30;
                        bArr32[5] = 55;
                        bArr32[6] = 86;
                        bArr32[7] = 81;
                        String llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr31, bArr32);
                        byte[] bArr33 = new byte[52];
                        bArr33[0] = -81;
                        bArr33[1] = 54;
                        bArr33[2] = 71;
                        bArr33[3] = -24;
                        bArr33[4] = 120;
                        bArr33[5] = -110;
                        bArr33[6] = 32;
                        bArr33[7] = 39;
                        bArr33[8] = -2;
                        bArr33[9] = 68;
                        bArr33[10] = 104;
                        bArr33[11] = -104;
                        bArr33[12] = -21;
                        bArr33[13] = 66;
                        bArr33[14] = -81;
                        bArr33[15] = -59;
                        bArr33[16] = 11;
                        bArr33[17] = -64;
                        bArr33[18] = -108;
                        bArr33[19] = 107;
                        bArr33[20] = -27;
                        bArr33[21] = 68;
                        bArr33[22] = -89;
                        bArr33[23] = -57;
                        bArr33[24] = 61;
                        bArr33[25] = -60;
                        bArr33[26] = -97;
                        bArr33[27] = 122;
                        bArr33[28] = 36;
                        bArr33[29] = -69;
                        bArr33[30] = 68;
                        bArr33[31] = 79;
                        bArr33[32] = -64;
                        bArr33[33] = 33;
                        bArr33[34] = 1;
                        bArr33[35] = -110;
                        bArr33[36] = 66;
                        bArr33[37] = -30;
                        bArr33[38] = 120;
                        bArr33[39] = 52;
                        bArr33[40] = -95;
                        bArr33[41] = 14;
                        bArr33[42] = 114;
                        bArr33[43] = -25;
                        bArr33[44] = 72;
                        bArr33[45] = -70;
                        bArr33[46] = 45;
                        bArr33[47] = 13;
                        bArr33[48] = -8;
                        bArr33[49] = 73;
                        bArr33[50] = 83;
                        bArr33[51] = -85;
                        byte[] bArr34 = new byte[8];
                        bArr34[0] = 73;
                        bArr34[1] = -95;
                        bArr34[2] = -25;
                        bArr34[3] = 14;
                        bArr34[4] = -53;
                        bArr34[5] = 7;
                        bArr34[6] = -56;
                        bArr34[7] = -87;
                        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(llllIIIIll12, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(bArr33, bArr34));
                        return null;
                    }
                }
            } catch (Exception e) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{97, 74, -54, -123, 3, -119}, new byte[]{54, 47, -88, -41, 87, -54, -23, 120}), IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{109, 16, -85, -85, -37, -51, 57, 6, -30, -14, 94, 47, 39, 62, 55, 0, -22, -16, 104, 43, 44, 47, 57, -91, 18, 40, -7, -63, -59, -68, -115, -36, 96, 34, -98, -85, -20, -29, 35, 99}, new byte[]{-123, -98, 28, 78, 84, 91, 25, 67}) + e.getMessage());
                return null;
            }
        }
    }

    @Override // IlIlIIlIII1.lIIIIlllllIlll1.IlIllIlllIllI1
    public void llllIIIIll1(@NotNull ICECandidate iCECandidate) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(iCECandidate, lllliiiill1.llllIIIIll1(new byte[]{70, -112, 72, 107, 95, 41, 82, 65, 64}, new byte[]{37, -15, 38, 15, 54, 77, 51, 53}));
        this.IIlIlllllllI1 = 0;
        String candidate = iCECandidate.getCandidate();
        String sdpMid = iCECandidate.getSdpMid();
        int sdpMlineIndex = iCECandidate.getSdpMlineIndex();
        llllIIIIll1(1, lllliiiill1.llllIIIIll1(new byte[]{98, -12, -33, 61, 27, 123, -16, 63, 24, -121, -63, 83, -38, -120, 93, 101, 4, -7, Byte.MIN_VALUE, 88, 26, 35, -104, 5}, new byte[]{-124, 96, 105, -40, -109, -53, 24, Byte.MIN_VALUE}), MapsKt.mapOf(new Pair[]{TuplesKt.to(lllliiiill1.llllIIIIll1(new byte[]{-94, 18, 76, -80, 98, -35, 41, 88, -92}, new byte[]{-63, 115, 34, -44, 11, -71, 72, 44}), candidate), TuplesKt.to(lllliiiill1.llllIIIIll1(new byte[]{-59, -10, 27, 32, 85, 20}, new byte[]{-74, -110, 107, 109, 60, 112, -15, -31}), sdpMid), TuplesKt.to(lllliiiill1.llllIIIIll1(new byte[]{-12, -18, -23, 79, -65, -116, -127, -92, -32}, new byte[]{-104, -121, -121, 42, -10, -30, -27, -63}), Integer.valueOf(sdpMlineIndex))}));
        try {
            IceCandidate iceCandidate = new IceCandidate(sdpMid, sdpMlineIndex, candidate);
            PeerConnection peerConnection = this.f622IllIIlIIII1;
            if ((peerConnection != null ? peerConnection.getRemoteDescription() : null) == null) {
                this.f630lllllIllIl1.add(iceCandidate);
                byte[] bArr = new byte[42];
                bArr[0] = 83;
                bArr[1] = 18;
                bArr[2] = -117;
                bArr[3] = -109;
                bArr[4] = 25;
                bArr[5] = -60;
                bArr[6] = 56;
                bArr[7] = 35;
                bArr[8] = 52;
                bArr[9] = 69;
                bArr[10] = -88;
                bArr[11] = -60;
                bArr[12] = 87;
                bArr[13] = -45;
                bArr[14] = 116;
                bArr[15] = 68;
                bArr[16] = 21;
                bArr[17] = 19;
                bArr[18] = -16;
                bArr[19] = -55;
                bArr[20] = 31;
                bArr[21] = -96;
                bArr[22] = 98;
                bArr[23] = 32;
                bArr[24] = 92;
                bArr[25] = 17;
                bArr[26] = -124;
                bArr[27] = -111;
                bArr[28] = 28;
                bArr[29] = -41;
                bArr[30] = -105;
                bArr[31] = -17;
                bArr[32] = -2;
                bArr[33] = 72;
                bArr[34] = -105;
                bArr[35] = -19;
                bArr[36] = 88;
                bArr[37] = -49;
                bArr[38] = 87;
                bArr[39] = 68;
                bArr[40] = 59;
                bArr[41] = 40;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -69;
                bArr2[1] = -83;
                bArr2[2] = 23;
                bArr2[3] = 116;
                bArr2[4] = -79;
                bArr2[5] = 79;
                bArr2[6] = -34;
                bArr2[7] = -84;
                String llllIIIIll12 = lllliiiill1.llllIIIIll1(bArr, bArr2);
                StringBuilder sb = new StringBuilder();
                byte[] bArr3 = new byte[10];
                bArr3[0] = 25;
                bArr3[1] = -51;
                bArr3[2] = -90;
                bArr3[3] = -98;
                bArr3[4] = -4;
                bArr3[5] = -8;
                bArr3[6] = -90;
                bArr3[7] = Byte.MIN_VALUE;
                bArr3[8] = 77;
                bArr3[9] = 80;
                byte[] bArr4 = new byte[8];
                bArr4[0] = -4;
                bArr4[1] = 112;
                bArr4[2] = 53;
                bArr4[3] = 123;
                bArr4[4] = 117;
                bArr4[5] = 117;
                bArr4[6] = 67;
                bArr4[7] = 5;
                StringBuilder append = sb.append(lllliiiill1.llllIIIIll1(bArr3, bArr4)).append(this.f630lllllIllIl1.size());
                byte[] bArr5 = new byte[4];
                bArr5[0] = 31;
                bArr5[1] = -115;
                bArr5[2] = 2;
                bArr5[3] = 114;
                byte[] bArr6 = new byte[8];
                bArr6[0] = 63;
                bArr6[1] = 105;
                bArr6[2] = -70;
                bArr6[3] = -40;
                bArr6[4] = -16;
                bArr6[5] = 51;
                bArr6[6] = 56;
                bArr6[7] = 95;
                llllIIIIll1(1, llllIIIIll12, append.append(lllliiiill1.llllIIIIll1(bArr5, bArr6)).toString());
                return;
            }
            PeerConnection peerConnection2 = this.f622IllIIlIIII1;
            Boolean valueOf = peerConnection2 != null ? Boolean.valueOf(peerConnection2.addIceCandidate(iceCandidate)) : null;
            byte[] bArr7 = new byte[30];
            bArr7[0] = 88;
            bArr7[1] = -18;
            bArr7[2] = -108;
            bArr7[3] = -66;
            bArr7[4] = -29;
            bArr7[5] = 89;
            bArr7[6] = -38;
            bArr7[7] = -32;
            bArr7[8] = 4;
            bArr7[9] = -112;
            bArr7[10] = -86;
            bArr7[11] = -8;
            bArr7[12] = 36;
            bArr7[13] = -65;
            bArr7[14] = 121;
            bArr7[15] = -78;
            bArr7[16] = 63;
            bArr7[17] = -20;
            bArr7[18] = -55;
            bArr7[19] = -40;
            bArr7[20] = -28;
            bArr7[21] = 20;
            bArr7[22] = -68;
            bArr7[23] = -46;
            bArr7[24] = 88;
            bArr7[25] = -50;
            bArr7[26] = -77;
            bArr7[27] = -66;
            bArr7[28] = -13;
            bArr7[29] = 96;
            byte[] bArr8 = new byte[8];
            bArr8[0] = -65;
            bArr8[1] = 117;
            bArr8[2] = 32;
            bArr8[3] = 88;
            bArr8[4] = 109;
            bArr8[5] = -4;
            bArr8[6] = 60;
            bArr8[7] = 87;
            llllIIIIll1(1, lllliiiill1.llllIIIIll1(bArr7, bArr8), valueOf);
        } catch (Exception e) {
            llllIIIIll1(3, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-101, -69, 106, 43, -36, -2, -101, -123, -30, -8, 70, 71, 5, 59, 54, -33, -2, -122, 7, 76, -59, -112, -13, -65, -101, -93, 108, 41, -12, -64}, new byte[]{126, 31, -18, -52, 76, 120, 115, 58}), e.getMessage());
        }
    }

    public final void lIIIIlllllIlll1(double d, double d2) {
        this.f629IlIllll1.post(() -> {
            lIIIIlllllIlll1(r1, r2, r3);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void lIIIIlllllIlll1(IllIIlIIII1 illIIlIIII1, double d, double d2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float width = (int) (d * illIIlIIII1.f629IlIllll1.getWidth());
        float height = (int) (d2 * illIIlIIII1.f629IlIllll1.getHeight());
        MotionEvent llllIIIIll12 = illIIlIIII1.llllIIIIll1(0, width, height, (long) illIIlIIII1, (long) illIIlIIII1);
        illIIlIIII1.f629IlIllll1.dispatchTouchEvent(llllIIIIll12);
        llllIIIIll12.recycle();
        MotionEvent llllIIIIll13 = illIIlIIII1.llllIIIIll1(1, width, height, (long) illIIlIIII1, uptimeMillis + 50);
        illIIlIIII1.f629IlIllll1.dispatchTouchEvent(llllIIIIll13);
        llllIIIIll13.recycle();
        illIIlIIII1.IlIllll1();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllliiiill1.llllIIIIll1(new byte[]{5, -108, -36, 55, 118, 46, -44, 0, 49, -47, -51, 61, 112, 63, -46, 69, 52, -123, -114, 121}, new byte[]{85, -15, -82, 81, 25, 92, -71, 101});
        lllliiiill1.llllIIIIll1(new byte[]{44, -16}, new byte[]{0, -48, -6, 112, -24, -95, -49, -4});
    }

    public static final void lIIIIlllllIlll1(IllIIlIIII1 illIIlIIII1, String str, String str2) {
        byte[] bArr = {-73, 84, -39, 35};
        byte[] bArr2 = {-61, 38, -84, 70, 21, 10, 1, 71};
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        if (!StringsKt.equals(str2, lllliiiill1.llllIIIIll1(bArr, bArr2), true)) {
            illIIlIIII1.IlIllll1();
            lllliiiill1.llllIIIIll1(new byte[]{50, 63, -14, -94, 86, 105, 29, 100, 115, 64, -13, -56, 12, 104, 85, 10, 79, 48, -70, -6, 118, 25, 126, 72, 59, 20, -34, -94, 87, 93, 29, 113, 93, 64, -45, -34, 2, 120, 93, 10, 78, 44, -70, -6, 118, 25, 126, 72, 50, 9, -44}, new byte[]{-44, -88, 82, 68, -27, -4, -5, -19});
        } else {
            illIIlIIII1.IlIllll1();
            lllliiiill1.llllIIIIll1(new byte[]{98, 54, 81, 9, -68, 74, -123, -106, 24, 71, 122, 75, -63, 90, -3, -51, 1, 61, -59, -50}, new byte[]{-117, -94, -1, -18, 39, -46, 109, 40});
        }
    }

    public final void lIIIIlllllIlll1(String str, double d, double d2) {
        this.f629IlIllll1.post(() -> {
            llllIIIIll1(r1, r2, r3, r4);
        });
    }

    public static final void lIIIIlllllIlll1(IllIIlIIII1 illIIlIIII1, String str) {
        illIIlIIII1.llllIllIl1(str);
    }

    @Override // IlIlIIlIII1.lIIIIlllllIlll1.IlIllIlllIllI1
    public void lIIIIlllllIlll1() {
        this.IIlIlllllllI1 = 0;
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, IlIllll1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{7, 45, -20, 114, 8, 99, 3, -13, 117, 12, -64, 89, 36, 53, 20, -14, 38, 56, -32, 121, 18, 112}, new byte[]{85, 72, -113, 23, 97, 21, 102, -105}));
        this.f620lIIIIlllllIlll1.IlIlllIIlI1();
    }

    @Override // IlIlIIlIII1.lIIIIlllllIlll1.IlIllIlllIllI1
    public void llllIIIIll1(@NotNull Pong pong) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(pong, lllliiiill1.llllIIIIll1(new byte[]{107, -94, 115, -21}, new byte[]{27, -51, 29, -116, 76, -122, 39, 101}));
        this.IIlIlllllllI1 = 0;
        IlIllll1();
        lllliiiill1.llllIIIIll1(new byte[]{-33, -16, -76, -77, 106, -37, -120, 109, -83, -59, -104, -104, 68, -115, -97, 108, -2, -27, -72, -72, 112, -56}, new byte[]{-115, -107, -41, -42, 3, -83, -19, 9});
    }

    @Override // IlIlIIlIII1.lIIIIlllllIlll1.IlIllIlllIllI1
    public void llllIIIIll1(@NotNull SDPOffer sDPOffer) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(sDPOffer, lllliiiill1.llllIIIIll1(new byte[]{51, -121, 55, 96, 42}, new byte[]{92, -31, 81, 5, 88, -48, 37, 1}));
        this.IIlIlllllllI1 = 0;
        String sdp = sDPOffer.getSdp();
        Intrinsics.checkNotNull(sdp);
        if (sdp.length() == 0) {
            llllIIIIll1(3, lllliiiill1.llllIIIIll1(new byte[]{91, 63, 25, 29, 20, -112, -105, 20, 7, 76, 53, 124, -49, 100, 32, -99, -46, -51, -55, -99, -18}, new byte[]{-67, -85, -81, -8, -100, 32, 112, -67}), (Object) null);
        } else {
            llllIIIIll1(1, lllliiiill1.llllIIIIll1(new byte[]{82, 51, -119, 6, -22, 99, -61, -72, -28, -121, 80, -123, 4, -74, -30}, new byte[]{-76, -89, 63, -29, 98, -45, -112, -4}), sdp);
            llllIIIIll1(sdp);
        }
    }

    public final MotionEvent llllIIIIll1(int i, float f, float f2, long j, long j2) {
        MotionEvent obtain = MotionEvent.obtain(j, j2, i, f, f2, 0);
        Intrinsics.checkNotNullExpressionValue(obtain, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{111, -17, -119, 84, 123, -43, 6, 122, 46, -93, -44}, new byte[]{0, -115, -3, 53, 18, -69, 46, 84}));
        return obtain;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0153, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(r1, r2)) != false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void llllIIIIll1(org.webrtc.DataChannel.Buffer r23) {
        /*
            Method dump skipped, instructions count: 4855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: llIIIIlIlllIII1.IllIIlIIII1.llllIIIIll1(org.webrtc.DataChannel$Buffer):void");
    }

    public final double llllIIIIll1(JSONObject jSONObject, String str, double d) {
        try {
            if (jSONObject.has(str)) {
                d = jSONObject.getDouble(str);
            }
        } catch (Exception unused) {
        }
        return d;
    }

    public final String llllIIIIll1(JSONObject jSONObject, String str, String str2) {
        try {
            String string = jSONObject.has(str) ? jSONObject.getString(str) : str2;
            Intrinsics.checkNotNull(string);
            str2 = string;
        } catch (Exception unused) {
        }
        return str2;
    }

    public final void llllIIIIll1(double d, double d2, double d3, double d4) {
        this.f629IlIllll1.post(() -> {
            IllIIlIIII1(r1, r2, r3);
        });
    }

    public final void llllIIIIll1(double d, double d2) {
        this.f629IlIllll1.post(() -> {
            llllIIIIll1(r1, r2, r3);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1, double d, double d2) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float width = (int) (d * illIIlIIII1.f629IlIllll1.getWidth());
        float height = (int) (d2 * illIIlIIII1.f629IlIllll1.getHeight());
        MotionEvent llllIIIIll12 = illIIlIIII1.llllIIIIll1(0, width, height, (long) illIIlIIII1, (long) illIIlIIII1);
        illIIlIIII1.f629IlIllll1.dispatchTouchEvent(llllIIIIll12);
        llllIIIIll12.recycle();
        MotionEvent llllIIIIll13 = illIIlIIII1.llllIIIIll1(1, width, height, (long) illIIlIIII1, uptimeMillis + 50);
        illIIlIIII1.f629IlIllll1.dispatchTouchEvent(llllIIIIll13);
        llllIIIIll13.recycle();
        illIIlIIII1.IlIllll1();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllliiiill1.llllIIIIll1(new byte[]{101, 33, -113, 21, -34, -31, 33, -87, 81, 100, -98, 31, -40, -16, 39, -20, 84, 48, -35, 91}, new byte[]{53, 68, -3, 115, -79, -109, 76, -52});
        lllliiiill1.llllIIIIll1(new byte[]{-98, 36}, new byte[]{-78, 4, -81, -65, -31, -54, 15, -7});
        lllliiiill1.llllIIIIll1(new byte[]{118, 89, -16, 110, -61, -54, 19, 47, 49, 28, -27, Byte.MAX_VALUE, -40, -35, 10, 47, 59, 28, -3, 105, -50}, new byte[]{95, 121, -111, 8, -73, -81, 97, 15});
    }

    public static final void llllIIIIll1(String str, IllIIlIIII1 illIIlIIII1) {
        int hashCode = str.hashCode();
        if (hashCode != 8) {
            if (hashCode != 127) {
                switch (hashCode) {
                    case 8592:
                        if (str.equals(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{26, 8, 126}, new byte[]{-8, -114, -18, 118, 35, -55, 76, 92}))) {
                            illIIlIIII1.llllIIIIll1(21);
                            return;
                        }
                        break;
                    case 8593:
                        if (str.equals(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-3, -58, 119}, new byte[]{31, 64, -26, 10, -122, 40, 99, 34}))) {
                            illIIlIIII1.llllIIIIll1(19);
                            return;
                        }
                        break;
                    case 8594:
                        if (str.equals(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{80, 70, 66}, new byte[]{-78, -64, -48, -44, -59, -95, -7, -108}))) {
                            illIIlIIII1.llllIIIIll1(22);
                            return;
                        }
                        break;
                    case 8595:
                        if (str.equals(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{86, -63, -34}, new byte[]{-76, 71, 77, 91, -100, -68, -22, 103}))) {
                            illIIlIIII1.llllIIIIll1(20);
                            return;
                        }
                        break;
                }
            } else if (str.equals(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{113}, new byte[]{14, 82, -105, -117, -31, 19, -102, -63}))) {
                illIIlIIII1.llllIIIIll1(112);
                return;
            }
        } else if (str.equals("\b")) {
            illIIlIIII1.llllIIIIll1(67);
            return;
        }
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            if (Character.isLetterOrDigit(charAt) || charAt == ' ') {
                illIIlIIII1.IllIIlIIII1(str);
                return;
            } else if (charAt < ' ') {
                illIIlIIII1.llllIIIIll1(charAt);
                return;
            }
        }
        illIIlIIII1.IllIIlIIII1(str);
    }

    public final void llllIIIIll1(int i) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = 10;
        long j2 = uptimeMillis + j;
        this.f629IlIllll1.dispatchKeyEvent(new KeyEvent(uptimeMillis, j2, 0, i, 0, 0, -1, 0, 2));
        this.f629IlIllll1.dispatchKeyEvent(new KeyEvent(uptimeMillis, j2 + j, 1, i, 0, 0, -1, 0, 2));
        IlIllll1();
        IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-49, -17, 43, -22, 18, -87, 110, -7, -96, -82, 30, -94, 125, -116, 3, -111, -110, -15, -80, 44}, new byte[]{41, 71, -118, 12, -103, 54, -120, 117});
    }

    public final void llllIIIIll1(char c) {
        int i = c != '\t' ? c != '\n' ? -1 : 66 : 61;
        int i2 = i;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = 10;
        long j2 = uptimeMillis + j;
        if (i2 != -1) {
            this.f629IlIllll1.dispatchKeyEvent(new KeyEvent(uptimeMillis, j2, 0, i, 1, 0, -1, c, 2));
            this.f629IlIllll1.dispatchKeyEvent(new KeyEvent(uptimeMillis, j2 + j, 1, i, 1, 0, -1, c, 2));
            IlIllll1();
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            lllliiiill1.llllIIIIll1(new byte[]{-12, -80, -99, 67, -115, 58, 98, -9, -75, -3, -76, 19, -29, 8, 19, -98, -66, -66, -40, 31, -115, 65, 63, -49, 40, 56}, new byte[]{18, 24, 60, -91, 6, -91, -124, 121});
            lllliiiill1.llllIIIIll1(new byte[]{-40, 111, -21, -92, -86, 64, 52, -23, -99, 122}, new byte[]{-8, 71, Byte.MIN_VALUE, -63, -45, 3, 91, -115});
            return;
        }
        this.f629IlIllll1.dispatchKeyEvent(new KeyEvent(uptimeMillis, j2, 2, 0, 1, 0, -1, c, 2));
        IlIllll1();
        IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllliiiill12.llllIIIIll1(new byte[]{-71, -71, 28, -42, 10, 25, 60, -79, -26, -9, 19, -70, 103, 8, 124, -35, -41, -89, 88, -99, 22, 97, 119, -98, 101, 49}, new byte[]{95, 17, -67, 48, -127, -122, -37, 56});
        lllliiiill12.llllIIIIll1(new byte[]{-59, 86, -56, -23, 28, -31, 91, -27, Byte.MIN_VALUE, 67}, new byte[]{-27, 126, -67, -121, 117, -126, 52, -127});
    }

    public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1, String str, double d, double d2) {
        illIIlIIII1.f629IlIllll1.evaluateJavascript(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{19, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -89, -85, 55, -110, -47, -24, -19, 118, -31, -27, 107, -36, -55, -106, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 52, -99, -64, -68, -27, 122, -5, -92, 52, -103, -9, -16, -31, 116, -22, -93, 54, -36, -113, -68, -32, 118, -20, -72, 47, -103, -36, -24, -86, 120, -20, -71, 43, -118, -41, -39, -24, 124, -30, -88, 44, -120, -119, -106, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 43, -102, -110, -76, -27, 122, -5, -92, 52, -103, -9, -16, -31, 116, -22, -93, 54, -36, -108, -70, -92, 49, -18, -82, 54, -107, -60, -7, -63, 117, -22, -96, 39, -110, -58, -78, -16, 120, -24, -125, 35, -111, -41, -68, -71, 36, -78, -19, 101, -75, -4, -52, -47, 77, -88, -19, 62, Byte.MIN_VALUE, -110, -106, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 120, -20, -71, 43, -118, -41, -39, -24, 124, -30, -88, 44, -120, -100, -24, -27, 126, -63, -84, 47, -103, -110, -95, -71, 36, -81, -22, 22, -71, -22, -56, -59, 75, -54, -116, 101, -36, -50, -32, -92, 19, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -84, 33, -120, -37, -22, -31, 92, -29, -88, 47, -103, -36, -24, -86, 112, -4, -114, 45, -110, -58, -7, -22, 109, -54, -87, 43, -120, -45, -2, -24, 124, -90, -28, 98, -121, -72, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -18, -31, 109, -6, -65, 44, -36, -58, -18, -15, 124, -76, -57, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -7, 19, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -64, -7, -16, 108, -3, -93, 98, -102, -45, -16, -9, 124, -76, -57, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 63, -43, -102, -75, -65, 19, -81, -19, 98, -36, -110, -68, -92, 57, -81, -19, 98, -36, -110, -68, -92, 57}, new byte[]{25, -113, -51, 66, -4, -78, -100, -124}), (v4) -> {
            llllIIIIll1(r1, r2, r3, r4, v4);
        });
    }

    public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1, String str, double d, double d2, String str2) {
        if (StringsKt.equals(str2, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-127, -42, -100, 14}, new byte[]{-11, -92, -23, 107, -18, -60, -82, 113}), true)) {
            illIIlIIII1.llllIllIl1(str);
        } else {
            illIIlIIII1.llllIIIIll1(str, d, d2);
        }
    }

    public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1, String str, String str2) {
        byte[] bArr = {99, -3, -87, 50};
        byte[] bArr2 = {23, -113, -36, 87, 123, 60, -98, -82};
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        if (StringsKt.equals(str2, lllliiiill1.llllIIIIll1(bArr, bArr2), true)) {
            illIIlIIII1.IlIllll1();
            lllliiiill1.llllIIIIll1(new byte[]{-100, 0, -50, -121, 58, -82, -42, -84, -29, 115, -50, -43, 82, -125, -95, -5, -15, 4, 64, 65}, new byte[]{123, -101, 122, 97, -76, 11, 49, 30});
        } else {
            illIIlIIII1.IlIllll1();
            lllliiiill1.llllIIIIll1(new byte[]{61, -124, -98, -100, -74, -73, 12, -46, 66, -9, -98, -50, -35, -74, 90, -120, 110, -70, -59, -58, -76, -12, 89, -63, 60, -125, -93, -110, -71, -120, 12, -28, 124, -8, -80, -2, -48, -84, 120, -123, 95, -70, -52, -37, -66}, new byte[]{-38, 31, 42, 122, 56, 18, -21, 96});
        }
    }

    public final void llllIIIIll1(String str, double d, double d2) {
        this.f629IlIllll1.post(() -> {
            llllIIIIll1(r1, r2, r3, r4);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1, double d, double d2, String str) {
        int width = (int) (d * illIIlIIII1.f629IlIllll1.getWidth());
        int height = (int) (d2 * illIIlIIII1.f629IlIllll1.getHeight());
        long uptimeMillis = SystemClock.uptimeMillis();
        float f = width;
        float f2 = height;
        MotionEvent llllIIIIll12 = illIIlIIII1.llllIIIIll1(0, f, f2, (long) illIIlIIII1, (long) illIIlIIII1);
        illIIlIIII1.f629IlIllll1.dispatchTouchEvent(llllIIIIll12);
        llllIIIIll12.recycle();
        MotionEvent llllIIIIll13 = illIIlIIII1.llllIIIIll1(1, f, f2, (long) illIIlIIII1, uptimeMillis + 50);
        illIIlIIII1.f629IlIllll1.dispatchTouchEvent(llllIIIIll13);
        llllIIIIll13.recycle();
        illIIlIIII1.IlIllll1();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllliiiill1.llllIIIIll1(new byte[]{28, -62, 87, 51, -58, -127, -36, -85, 117, -90, 77, 86, -89, -91, -100, -35, 99, -17, 11, 70, -25, -46, -70, -122, 28, -14, 118, 62, -11, -114, 25, 90, -113, 96, -58}, new byte[]{-5, 64, -18, -42, 65, 58, 57, 59});
        lllliiiill1.llllIIIIll1(new byte[]{-70, 26}, new byte[]{-106, 58, -64, 44, 70, 46, 30, 64});
        illIIlIIII1.f629IlIllll1.postDelayed(() -> {
            llllIIIIll1(r1, r2, r3, r4);
        }, 100L);
    }

    public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1, String str, int i, int i2) {
        illIIlIIII1.f629IlIllll1.evaluateJavascript(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-2, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 54, -34, 113, -102, -111, 119, -35, -65, 112, -112, 45, -44, -119, 9, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -62, -79, 108, -104, 101, -105, -122, 106, -62, -75, 91, -44, 97, -103, -105, 109, -64, -16, 35, -104, 96, -101, -111, 118, -39, -75, 112, -52, 42, -107, -111, 119, -35, -90, 123, -3, 104, -111, -97, 102, -38, -92, 37, -78, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 109, -110, -46, 43, -43, -77, 106, -47, 114, -111, -73, 111, -47, -67, 123, -42, 112, -44, -44, 37, -108, -8, Byte.MAX_VALUE, -37, 112, -99, -124, 102, -15, -68, 123, -43, 97, -102, -122, 45, -64, -79, 121, -10, 101, -103, -105, 35, -119, -19, 35, -104, 35, -67, -68, 83, -31, -124, 57, -104, 120, -120, -46, 9, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -107, -111, 119, -35, -90, 123, -3, 104, -111, -97, 102, -38, -92, 48, -52, 101, -109, -68, 98, -39, -75, 62, -123, 57, -55, -46, 36, -32, -107, 70, -20, 69, -90, -73, 66, -109, -16, 98, -60, 36, -2, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -39, 103, Byte.MIN_VALUE, -101, 117, -47, -107, 114, -35, 105, -111, -100, 119, -102, -71, 109, -5, 107, -102, -122, 102, -38, -92, 91, -36, 109, Byte.MIN_VALUE, -109, 97, -40, -75, 55, -111, 36, -113, -8, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -54, 97, Byte.MIN_VALUE, -121, 113, -38, -16, 106, -54, 113, -111, -55, 9, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -55, -38, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 108, -35, 112, -127, Byte.MIN_VALUE, 109, -108, -74, Byte.MAX_VALUE, -44, 119, -111, -55, 9, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 121, -35, -38, 42, -113, -38, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44, -46, 35, -108, -16, 62, -104, 36, -44}, new byte[]{-12, -14, 3, -76, -48, 30, -72, 4}), (v4) -> {
            llllIIIIll1(r1, r2, r3, r4, v4);
        });
    }

    public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1, String str, int i, int i2, String str2) {
        if (StringsKt.equals(str2, IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{48, -93, 83, 4}, new byte[]{68, -47, 38, 97, 124, 11, 53, 55}), true)) {
            illIIlIIII1.llllIllIl1(str);
        } else {
            illIIlIIII1.f629IlIllll1.evaluateJavascript(IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-118, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -89, -108, 48, 19, 9, -118, -16, -17, -31, -38, 108, 93, 17, -12, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 49, 15, 19, -34, -30, -118, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -96, -35, 101, -107, -28, 73, 124, 15, 25, 21, -57, -60, -113, 121, 34, 100, 50, Byte.MAX_VALUE, -94, -64, -60, 25, 3, 4, 106, 119, -58, -102, -34, 94, -109, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -96, -81, -46, 101, 93, 74, -34, -71, -10, -18, Byte.MIN_VALUE, 101, 5, 74, -61, -71}, new byte[]{Byte.MIN_VALUE, -113, -14, 69, 125, 106, -2, -103}) + i + IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-84, -27, 26, -79, 64, 58, 56, -34, -73, -49, 26, -79, 64, 58, 56, -34, -73, -49, 26, -79, 64, 58, 56, -34, -73, -49, 26, -79, 64, 58, 56, -34, -73, -49, 26, -79, 64, 58, 56, -34, -73, -49, 76, -16, 18, 58, 97, -34, -86, -49}, new byte[]{-105, -17, 58, -111, 96, 26, 24, -2}) + i2 + IlIlllIIlI1.IllIIlIIII1.llllIIIIll1(new byte[]{-15, -91, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 48, 34, 5, -107, 116, 13, -81, -62, 35, 45, 3, -107, 44, 65, -82, -64, 37, 54, 26, -48, Byte.MAX_VALUE, 21, -28, -54, 42, 38, 26, -48, Byte.MAX_VALUE, 21, -116, -35, 41, 46, 39, -38, 120, 15, -66, -121, 62, 111, 87, -52, 56, 90, -64, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -91, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 105, 108, 87, 83, -78, -31, 44, 48, -29, -90, -14, 54, -10, -43, 106, 73, -50, -43, -110, 48, -89, -122, 66, 25, -93, -58, -12, 82, -91, -63, 44, 55, -23, -90, -25, 19, -9, -7, 101, 71, -8, -48, -110, 48, -76, -121, 107, 41, -96, -53, -31, 80, -98, -50, 45, 19, -48, -85, -55, 36, -12, -19, 112, 74, -39, -36, 125, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -62, 121, 8, -90, -54, 102, 107, 18, -39, 116, 12, -81, -63, 50, 106, 87, -50, 27, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 42, 17, -107, 57, 4, -90, -54, 43, 38, 25, -63, 63, 21, -85, -56, 8, 34, 26, -48, 49, 92, -9, -110, 102, 100, 62, -5, 65, 52, -98, -120, 102, 63, 11, -107, 27, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 4, -90, -54, 43, 38, 25, -63, 63, 21, -85, -56, 8, 34, 26, -48, 49, 92, -9, -110, 102, 100, 35, -16, 73, 53, -117, -3, 3, 2, 80, -107, 109, 29, -22, -91, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 35, 47, 18, -40, 116, 15, -66, -127, 47, 48, 52, -38, Byte.MAX_VALUE, 21, -81, -63, 50, 6, 19, -36, 101, 0, -88, -61, 35, 106, 87, -50, 27, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 19, -81, -37, 51, 49, 25, -107, 101, 19, -65, -54, 125, 73, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -73, -91, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 116, 13, -81, -62, 35, 45, 3, -107, 44, 65, -81, -61, 35, 46, 18, -37, 101, 79, -70, -50, 52, 38, 25, -63, 84, 13, -81, -62, 35, 45, 3, -114, 27, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 28, -64, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -56, 49, 2, -85, -37, 37, 43, 87, -99, 116, 72, -22, -44, 76, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 32, 24, -37, 98, 14, -90, -54, 104, 38, 5, -57, 126, 19, -30, -54, 111, 120, 125, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -46, 76, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 19, -81, -37, 51, 49, 25, -107, 119, 0, -90, -36, 35, 120, 125, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -56, 56, 73, -29, -108, 76, 99, 87, -107, 49, 65, 
            -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102, 99, 87, -107, 49, 65, -22, -113, 102}, new byte[]{-54, -81, 70, 67, 119, -75, 17, 97}), (v4) -> {
                llllIIIIll1(r1, r2, r3, r4, v4);
            });
        }
    }

    public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1, int i, int i2, String str, String str2) {
        byte[] bArr = {-100, -126, 100, -53};
        byte[] bArr2 = {-24, -16, 17, -82, 70, 43, 76, -3};
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        if (StringsKt.equals(str2, lllliiiill1.llllIIIIll1(bArr, bArr2), true)) {
            illIIlIIII1.f629IlIllll1.post(() -> {
                llllIIIIll1(r1, r2, r3, r4);
            });
            return;
        }
        illIIlIIII1.IlIllll1();
        lllliiiill1.llllIIIIll1(new byte[]{8, -72, 8, -51, -71, -2, -26, 53, 98, -35, 12, -122, -38, -3, -113, 110, 119, -107, 89, -106, -83, -96, -121, 45, 10, -65, 50, -49, -118, -27, -19, 52, 99, -36, 38, -120, -40, -10, -105, 111, 93, -94, 89, -100, -118}, new byte[]{-17, 58, -79, 40, 62, 69, 2, -120});
        illIIlIIII1.llllIIIIll1(lllliiiill1.llllIIIIll1(new byte[]{14, -28, 12, -115, 120, 45, 98, -125, 23, -23, 26, -99}, new byte[]{126, -123, Byte.MAX_VALUE, -7, 29, 114, 4, -30}), lllliiiill1.llllIIIIll1(new byte[]{-127, -1, 33, -69, -120, 47, -96, 76, -21, -102, 37, -16, -21, 44, -55, 23, -2, -46, 112, -32, -100, 113, -63, 84, -125, -8, 27, -71, -69, 52, -85, 77, -22, -101, 15, -2, -23, 39, -47, 22, -44, -27, 112, -22, -69}, new byte[]{102, 125, -104, 94, 15, -108, 68, -15}));
    }

    public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1, int i, int i2, String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        float f = i;
        float f2 = i2;
        MotionEvent llllIIIIll12 = illIIlIIII1.llllIIIIll1(0, f, f2, uptimeMillis, uptimeMillis);
        illIIlIIII1.f629IlIllll1.dispatchTouchEvent(llllIIIIll12);
        llllIIIIll12.recycle();
        MotionEvent llllIIIIll13 = illIIlIIII1.llllIIIIll1(1, f, f2, uptimeMillis, uptimeMillis + 50);
        illIIlIIII1.f629IlIllll1.dispatchTouchEvent(llllIIIIll13);
        llllIIIIll13.recycle();
        illIIlIIII1.f629IlIllll1.postDelayed(() -> {
            lIIIIlllllIlll1(r1, r2);
        }, 100L);
    }

    public final void llllIIIIll1(String str, String str2) {
        try {
            DataChannel dataChannel = this.f623IlIlllIIlI1;
            if ((dataChannel != null ? dataChannel.state() : null) == DataChannel.State.OPEN) {
                JSONObject jSONObject = new JSONObject();
                byte[] bArr = new byte[4];
                bArr[0] = -62;
                bArr[1] = 90;
                bArr[2] = -108;
                bArr[3] = 38;
                byte[] bArr2 = new byte[8];
                bArr2[0] = -74;
                bArr2[1] = 35;
                bArr2[2] = -28;
                bArr2[3] = 67;
                bArr2[4] = -13;
                bArr2[5] = -19;
                bArr2[6] = -83;
                bArr2[7] = -36;
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                jSONObject.put(lllliiiill1.llllIIIIll1(bArr, bArr2), str);
                byte[] bArr3 = new byte[7];
                bArr3[0] = 67;
                bArr3[1] = -63;
                bArr3[2] = 113;
                bArr3[3] = 4;
                bArr3[4] = 50;
                bArr3[5] = 38;
                bArr3[6] = 21;
                byte[] bArr4 = new byte[8];
                bArr4[0] = 46;
                bArr4[1] = -92;
                bArr4[2] = 2;
                bArr4[3] = 119;
                bArr4[4] = 83;
                bArr4[5] = 65;
                bArr4[6] = 112;
                bArr4[7] = 58;
                jSONObject.put(lllliiiill1.llllIIIIll1(bArr3, bArr4), str2);
                String jSONObject2 = jSONObject.toString();
                byte[] bArr5 = new byte[13];
                bArr5[0] = 100;
                bArr5[1] = 55;
                bArr5[2] = 14;
                bArr5[3] = 9;
                bArr5[4] = 95;
                bArr5[5] = 5;
                bArr5[6] = -83;
                bArr5[7] = -82;
                bArr5[8] = 56;
                bArr5[9] = 118;
                bArr5[10] = 115;
                bArr5[11] = 83;
                bArr5[12] = 4;
                byte[] bArr6 = new byte[8];
                bArr6[0] = 16;
                bArr6[1] = 88;
                bArr6[2] = 93;
                bArr6[3] = 125;
                bArr6[4] = 45;
                bArr6[5] = 108;
                bArr6[6] = -61;
                bArr6[7] = -55;
                Intrinsics.checkNotNullExpressionValue(jSONObject2, lllliiiill1.llllIIIIll1(bArr5, bArr6));
                byte[] bytes = jSONObject2.getBytes(Charsets.UTF_8);
                byte[] bArr7 = new byte[13];
                bArr7[0] = -76;
                bArr7[1] = -36;
                bArr7[2] = -106;
                bArr7[3] = -38;
                bArr7[4] = 42;
                bArr7[5] = 111;
                bArr7[6] = 65;
                bArr7[7] = -101;
                bArr7[8] = -5;
                bArr7[9] = -105;
                bArr7[10] = -52;
                bArr7[11] = -74;
                bArr7[12] = 122;
                byte[] bArr8 = new byte[8];
                bArr8[0] = -45;
                bArr8[1] = -71;
                bArr8[2] = -30;
                bArr8[3] = -104;
                bArr8[4] = 83;
                bArr8[5] = 27;
                bArr8[6] = 36;
                bArr8[7] = -24;
                Intrinsics.checkNotNullExpressionValue(bytes, lllliiiill1.llllIIIIll1(bArr7, bArr8));
                ByteBuffer wrap = ByteBuffer.wrap(bytes);
                DataChannel dataChannel2 = this.f623IlIlllIIlI1;
                if (dataChannel2 != null) {
                    dataChannel2.send(new DataChannel.Buffer(wrap, false));
                }
                IlIllll1();
                byte[] bArr9 = new byte[23];
                bArr9[0] = 115;
                bArr9[1] = 4;
                bArr9[2] = -21;
                bArr9[3] = 34;
                bArr9[4] = 24;
                bArr9[5] = -64;
                bArr9[6] = -85;
                bArr9[7] = -29;
                bArr9[8] = 23;
                bArr9[9] = 86;
                bArr9[10] = -42;
                bArr9[11] = 74;
                bArr9[12] = 126;
                bArr9[13] = -9;
                bArr9[14] = -54;
                bArr9[15] = -123;
                bArr9[16] = 32;
                bArr9[17] = 59;
                bArr9[18] = -65;
                bArr9[19] = 70;
                bArr9[20] = 56;
                bArr9[21] = 107;
                bArr9[22] = 98;
                byte[] bArr10 = new byte[8];
                bArr10[0] = -106;
                bArr10[1] = -77;
                bArr10[2] = 89;
                bArr10[3] = -57;
                bArr10[4] = -105;
                bArr10[5] = 81;
                bArr10[6] = 66;
                bArr10[7] = 99;
                lllliiiill1.llllIIIIll1(bArr9, bArr10);
                byte[] bArr11 = new byte[3];
                bArr11[0] = -60;
                bArr11[1] = -66;
                bArr11[2] = 52;
                byte[] bArr12 = new byte[8];
                bArr12[0] = -28;
                bArr12[1] = -109;
                bArr12[2] = 20;
                bArr12[3] = -71;
                bArr12[4] = 48;
                bArr12[5] = -30;
                bArr12[6] = 119;
                bArr12[7] = 49;
                lllliiiill1.llllIIIIll1(bArr11, bArr12);
            }
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{22, -28, 18, -103, -30, -46, 51, -111, 126, -126, 37, -8, -124, -27, 94, -8, 114, -60, 102, -44, -45, -69, 98, -69, -55, 75}, new byte[]{-13, 107, -125, 112, 98, 83, -42, 30}))));
        }
    }

    public static /* synthetic */ Bitmap llllIIIIll1(IllIIlIIII1 illIIlIIII1, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        return illIIlIIII1.llllIIIIll1(j);
    }

    @Nullable
    public final Bitmap llllIIIIll1(long j) {
        if (this.f627lIllIIIlIl1 == null) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-30, 22, -97, -113, -110, -38, -88, -3, -82, 100, -92, -41, -50, -13, -44, 35, 109, -13, 75, 28, 64, 35, 10, 28, 119, -15, 83, 8, 88, 12, 47, 5, 112, -12, 77, 12, 83, -87, -46, -33, -31, 9, -94, -116, -122, -60, -85, -7, -110}, new byte[]{4, -127, 63, 105, 33, 79, 78, 117}));
            return null;
        }
        if (this.f629IlIllll1.getWidth() > 0 && this.f629IlIllll1.getHeight() > 0) {
            llIIIIlIlllIII1.llllIllIl1 llllillil1 = this.f627lIllIIIlIl1;
            Intrinsics.checkNotNull(llllillil1);
            Bitmap llllIIIIll12 = llllillil1.llllIIIIll1(j);
            if (llllIIIIll12 == null) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{112, 90, -113, 123, 23, -41, 7, -42, 39, 58, -111, 59}, new byte[]{-106, -46, 37, -98, -116, 105, -30, 114}));
            } else {
                IlIllll1();
                IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-58, 40, Byte.MIN_VALUE, -14, -98, -125, -2, -85, -80, 69, -96, -120, -22, -127, -108, -58, -112, 26, -49, -72, -67, -46, -92, -71}, new byte[]{32, -96, 42, 23, 5, 61, 24, 35});
                llllIIIIll12.getWidth();
                llllIIIIll12.getHeight();
            }
            return llllIIIIll12;
        }
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, IlIllll1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{72, 77, 48, 7, 44, 32, 81, 35, 4, 63, 11, 95, 112, 9, 45, -4, -53, -72, -58, -120, -6, -62, 82, 27, 20, 63, 63, 89, 121, 34, 23, 77, 59, 82}, new byte[]{-82, -38, -112, -31, -97, -75, -73, -85}));
        return null;
    }

    public final void llllIIIIll1(String str) {
        IlIlllIIlI1.lIIIIlllllIlll1.llllIIIIll1(() -> {
            llllIIIIll1(r0, r1);
        });
    }

    public static final void llllIIIIll1(IllIIlIIII1 illIIlIIII1, String str) {
        try {
            illIIlIIII1.IlIllll1();
            byte[] bArr = new byte[29];
            bArr[0] = -85;
            bArr[1] = 93;
            bArr[2] = -33;
            bArr[3] = 47;
            bArr[4] = 78;
            bArr[5] = 11;
            bArr[6] = 99;
            bArr[7] = 109;
            bArr[8] = -97;
            bArr[9] = 94;
            bArr[10] = -41;
            bArr[11] = 50;
            bArr[12] = 26;
            bArr[13] = 29;
            bArr[14] = 38;
            bArr[15] = 118;
            bArr[16] = -39;
            bArr[17] = 75;
            bArr[18] = -57;
            bArr[19] = 35;
            bArr[20] = 89;
            bArr[21] = 11;
            bArr[22] = 48;
            bArr[23] = 113;
            bArr[24] = -97;
            bArr[25] = 77;
            bArr[26] = -34;
            bArr[27] = 44;
            bArr[28] = 67;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -7;
            bArr2[1] = 56;
            bArr2[2] = -78;
            bArr2[3] = 64;
            bArr2[4] = 58;
            bArr2[5] = 110;
            bArr2[6] = 67;
            bArr2[7] = 2;
            IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2);
            SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.OFFER, str);
            PeerConnection peerConnection = illIIlIIII1.f622IllIIlIIII1;
            if (peerConnection != null) {
                peerConnection.setRemoteDescription(illIIlIIII1.new C0014IllIIlIIII1(), sessionDescription);
            }
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, illIIlIIII1.IlIllll1(), llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{118, -42, 22, -33, 4, 111, -20, -98, 15, -107, 58, -77, -5, -113, 98, 68, -31, -108, 5, -114, 113, 102, -107, -58, 7, -19, 123, -84, 13, 1, -85, -114, -87, 82}, new byte[]{-109, 114, -110, 56, -108, -23, 4, 33}))));
            illIIlIIII1.llIIllIl1();
        }
    }

    public static /* synthetic */ void llllIIIIll1(IllIIlIIII1 illIIlIIII1, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            obj = null;
        }
        illIIlIIII1.llllIIIIll1(i, str, obj);
    }

    public final void llllIIIIll1(int i, String str, Object obj) {
        if (i >= 0) {
            switch (i) {
                case 0:
                    IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-100, 54, -65, 55, 33, -101, -109, 70, -125, 36, -104, 0, 52, -110}, new byte[]{-57, 97, -38, 85, 115, -49, -48, 107});
                    break;
                case 1:
                    IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-10, 27, 94, -85, -110, 101, 64, -1, -28, 2, 125, -122, -99}, new byte[]{-83, 76, 59, -55, -64, 49, 3, -46});
                    break;
                case 2:
                    IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{82, -3, 69, 57, 41, 86, 91, 24, 94, -21, 114, 21, 38}, new byte[]{9, -86, 32, 91, 123, 2, 24, 53});
                    break;
                case 3:
                    IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{111, -67, 56, -95, 113, 75, 89, 123, 113, -72, 15, -116, 113, 66}, new byte[]{52, -22, 93, -61, 35, 31, 26, 86});
                    break;
                default:
                    IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{15, -6, -114, 40, -90, 44, 34, -102}, new byte[]{84, -83, -21, 74, -12, 120, 97, -57});
                    break;
            }
            if (obj != null) {
                IlIllll1();
                IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{126, 101}, new byte[]{68, 69, 28, 11, -122, 28, 13, 92});
                obj.toString();
                return;
            }
            IlIllll1();
        }
    }
}
