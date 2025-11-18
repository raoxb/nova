package llIIIIlIlllIII1;

import IlIlIIIlIlIlll1.llllllIlIIIlll1;
import android.annotation.SuppressLint;
import android.opengl.GLES20;
import android.os.Build;
import c13.nim5.ez8.h5_proto.Log;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.webrtc.CalledByNative;
import org.webrtc.EglBase;
import org.webrtc.EncodedImage;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoCodecStatus;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;

@SourceDebugExtension({"SMAP\nCustomDecoderFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomDecoderFactory.kt\ncom/nied/lduvv/rtc/CustomDecoderFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,205:1\n1#2:206\n4154#3:207\n4254#3,2:208\n12567#3,2:214\n37#4:210\n36#4,3:211\n*S KotlinDebug\n*F\n+ 1 CustomDecoderFactory.kt\ncom/nied/lduvv/rtc/CustomDecoderFactory\n*L\n37#1:207\n37#1:208,2\n119#1:214,2\n38#1:210\n38#1:211,3\n*E\n"})
/* loaded from: classes.jar:llIIIIlIlllIII1/lIIIIlllllIlll1.class */
public final class lIIIIlllllIlll1 implements VideoDecoderFactory {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    @NotNull
    public final VideoDecoderFactory f657llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    @NotNull
    public final EglBase.Context f658lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    @NotNull
    public final Set<String> f659llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    @NotNull
    public final String[] f660IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    @NotNull
    public final String[] f661IlIlllIIlI1;

    /* loaded from: classes.jar:llIIIIlIlllIII1/lIIIIlllllIlll1$llllIIIIll1.class */
    public static final class llllIIIIll1 implements VideoDecoder {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ VideoDecoder f662llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final /* synthetic */ VideoDecoder f663lIIIIlllllIlll1;

        public llllIIIIll1(VideoDecoder videoDecoder) {
            this.f663lIIIIlllllIlll1 = videoDecoder;
            this.f662llllIIIIll1 = videoDecoder;
        }

        public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            Intrinsics.checkNotNullParameter(settings, lllliiiill1.llllIIIIll1(new byte[]{-96, 59, -71, -122, -65, -26, 54, -6}, new byte[]{-45, 94, -51, -14, -42, -120, 81, -119}));
            Intrinsics.checkNotNullParameter(callback, lllliiiill1.llllIIIIll1(new byte[]{-42, 27, -95, 12, -22, -42, -57, -23}, new byte[]{-75, 122, -51, 96, -120, -73, -92, -126}));
            return this.f663lIIIIlllllIlll1.initDecode(new VideoDecoder.Settings(settings.numberOfCores, Math.min(settings.width, 1280), Math.min(settings.height, 720)), callback);
        }

        @CalledByNative
        public VideoCodecStatus release() {
            return this.f662llllIIIIll1.release();
        }

        @CalledByNative
        public VideoCodecStatus decode(EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo) {
            return this.f662llllIIIIll1.decode(encodedImage, decodeInfo);
        }

        @CalledByNative
        public String getImplementationName() {
            return this.f662llllIIIIll1.getImplementationName();
        }
    }

    public lIIIIlllllIlll1(@NotNull VideoDecoderFactory videoDecoderFactory, @NotNull EglBase.Context context) {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(videoDecoderFactory, lllliiiill1.llllIIIIll1(new byte[]{6, -112, -100, -17, Byte.MAX_VALUE, 62, 78, 21, 10, -106, -102, -6, 111}, new byte[]{105, -30, -11, -120, 22, 80, 8, 116}));
        Intrinsics.checkNotNullParameter(context, lllliiiill1.llllIIIIll1(new byte[]{-32, 43, 121, -60, -121, -57, 18, 91, -3, 56}, new byte[]{-123, 76, 21, -121, -24, -87, 102, 62}));
        this.f657llllIIIIll1 = videoDecoderFactory;
        this.f658lIIIIlllllIlll1 = context;
        this.f659llllIllIl1 = SetsKt.setOf(new String[]{lllliiiill1.llllIIIIll1(new byte[]{-81, -44, -61, 36, -80, -14, -63, 36}, new byte[]{-4, -103, -18, 99, -119, -63, -15, 98}), lllliiiill1.llllIIIIll1(new byte[]{-83, 37, -119, 43, -44, 35, 49, -119}, new byte[]{-2, 104, -92, 108, -19, 22, 1, -49}), lllliiiill1.llllIIIIll1(new byte[]{-76, -69, 49, -26, 96, -1, 24, 4}, new byte[]{-25, -10, 28, -84, 87, -52, 40, 66}), lllliiiill1.llllIIIIll1(new byte[]{16, 115, 102, -83, -106, 85, -66, 42}, new byte[]{67, 62, 75, -20, -93, 103, -114, 108}), lllliiiill1.llllIIIIll1(new byte[]{-72, -5, -103, -18, 46, -102, -123, 122, -62, -98, -121, -11, 2, -89, -65}, new byte[]{-16, -82, -40, -71, 107, -45, -38, 42}), lllliiiill1.llllIIIIll1(new byte[]{109, 41, 88, 3, 59, -111, 90}, new byte[]{40, Byte.MAX_VALUE, 25, 46, 119, -95, 99, 37}), lllliiiill1.llllIIIIll1(new byte[]{-19, -93, -21, -62, 17, -53, 82}, new byte[]{-69, -9, -71, -17, 93, -7, 107, 62}), lllliiiill1.llllIIIIll1(new byte[]{31, -27, 67, -109}, new byte[]{82, -84, 28, -90, -31, -25, 94, 62}), lllliiiill1.llllIIIIll1(new byte[]{-68, -34, -78, -70, -85, -47, 69}, new byte[]{-15, -105, -19, -126, -12, -124, 1, -42}), lllliiiill1.llllIIIIll1(new byte[]{106, -88, 55, -58, -114, 122}, new byte[]{39, -31, 104, -123, -51, 67, 73, -81}), lllliiiill1.llllIIIIll1(new byte[]{-61, 120, -49, -6, -12, -78, -11, 25, -46, 32, -100, -94, -85}, new byte[]{-118, 22, -87, -109, -102, -37, -115, 70}), lllliiiill1.llllIIIIll1(new byte[]{-92, 107, -6, 126, -97, -68, 41, 9, -59}, new byte[]{-16, 46, -71, 48, -48, -29, 98, 76})});
        this.f660IllIIlIIII1 = new String[]{lllliiiill1.llllIIIIll1(new byte[]{65, 37, 94, 75, -114, 85, 68, Byte.MAX_VALUE, 49, 106, 23}, new byte[]{4, 93, 39, 37, -31, 38, 100, 72}), lllliiiill1.llllIIIIll1(new byte[]{-67, 34, -19, 98, 114, 96, -47, 98, -64, 109, -92}, new byte[]{-8, 90, -108, 12, 29, 19, -15, 85}), lllliiiill1.llllIIIIll1(new byte[]{57, -70, -38, 91, -39, Byte.MAX_VALUE, 52, 22, 68, -6, -109}, new byte[]{124, -62, -93, 53, -74, 12, 20, 33}), lllliiiill1.llllIIIIll1(new byte[]{-29, -63, 80, -89, 2, 111, -90, 30, -111}, new byte[]{-88, -88, 34, -50, 108, 79, -112, 43}), lllliiiill1.llllIIIIll1(new byte[]{-71, -93, -80, 48, 89, 74}, new byte[]{-12, -9, -122, 7, 108, 122, -13, 48}), lllliiiill1.llllIIIIll1(new byte[]{33, -1, -69, -12, 87, -113}, new byte[]{108, -85, -115, -61, 100, -70, -114, -65}), lllliiiill1.llllIIIIll1(new byte[]{-36, -27, -89, 115, 50, 47, 28, -122, -32, -27, -26, 55, 100, 104}, new byte[]{-113, -117, -58, 3, 86, 93, 125, -31}), lllliiiill1.llllIIIIll1(new byte[]{108, 0, -70, 120, 29, -57, 84, -24, 80, 0, -5, 62, 75, Byte.MIN_VALUE}, new byte[]{63, 110, -37, 8, 121, -75, 53, -113})};
        this.f661IlIlllIIlI1 = new String[]{lllliiiill1.llllIIIIll1(new byte[]{63, -4, 60}, new byte[]{8, -46, 12, 25, -117, -125, 126, -63}), lllliiiill1.llllIIIIll1(new byte[]{113, 66, 5}, new byte[]{70, 108, 52, -94, -11, 33, -37, 11}), lllliiiill1.llllIIIIll1(new byte[]{108, Byte.MAX_VALUE, -59}, new byte[]{84, 81, -11, -65, 51, -22, -105, 21})};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [org.webrtc.VideoDecoder] */
    /* JADX WARN: Type inference failed for: r0v21, types: [org.webrtc.VideoDecoder] */
    @Nullable
    public VideoDecoder createDecoder(@NotNull VideoCodecInfo videoCodecInfo) {
        llllIIIIll1 lllliiiill1;
        IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullParameter(videoCodecInfo, lllliiiill12.llllIIIIll1(new byte[]{64, 106, -124, -104, -91, 73, -101, 70, 83, 96, -87, -109, -84, 101}, new byte[]{54, 3, -32, -3, -54, 10, -12, 34}));
        Pair<Boolean, String> lIllIIIlIl12 = lIllIIIlIl1();
        if (((Boolean) lIllIIIlIl12.getFirst()).booleanValue()) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.llllIIIIll1(new byte[]{-80, -46, 49, -69, 45, 74, -75, -110, -10, -78, 10, -54, 94, 66, -36, -64, -27, -49}, new byte[]{89, 85, -74, 92, -71, -30, 93, 47}) + ((String) lIllIIIlIl12.getSecond()));
        }
        if (lIIIIlllllIlll1()) {
            lllliiiill1 = new SoftwareVideoDecoderFactory().createDecoder(videoCodecInfo);
        } else if (((Boolean) lIllIIIlIl12.getFirst()).booleanValue()) {
            lllliiiill1 = new SoftwareVideoDecoderFactory().createDecoder(videoCodecInfo);
        } else {
            VideoDecoder createDecoder = this.f657llllIIIIll1.createDecoder(videoCodecInfo);
            lllliiiill1 = createDecoder != null ? new llllIIIIll1(createDecoder) : null;
        }
        return lllliiiill1;
    }

    @NotNull
    public VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo[] supportedCodecs = this.f657llllIIIIll1.getSupportedCodecs();
        Intrinsics.checkNotNullExpressionValue(supportedCodecs, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-121, 80, -92, -87, -38, -120, 24, 48, -110, 65, -75, -98, -20, -105, 12, 58, -125, 70, -8, -44, -127, -42, 65}, new byte[]{-32, 53, -48, -6, -81, -8, 104, 95}));
        ArrayList arrayList = new ArrayList();
        for (VideoCodecInfo videoCodecInfo : supportedCodecs) {
            Intrinsics.checkNotNull(videoCodecInfo);
            if (!llllIIIIll1(videoCodecInfo)) {
                arrayList.add(videoCodecInfo);
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[0]);
    }

    public final boolean lIIIIlllllIlll1() {
        String str = Build.MANUFACTURER;
        byte[] bArr = {-56, 9, 6, -35, -116, -73};
        byte[] bArr2 = {Byte.MIN_VALUE, 92, 71, -118, -55, -2, 28, 116};
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        if (StringsKt.equals(str, lllliiiill1.llllIIIIll1(bArr, bArr2), true)) {
            String str2 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(str2, lllliiiill1.llllIIIIll1(new byte[]{47, -11, 79, 103, 50}, new byte[]{98, -70, 11, 34, 126, -125, Byte.MIN_VALUE, -81}));
            if (!StringsKt.startsWith$default(str2, lllliiiill1.llllIIIIll1(new byte[]{81, 15, 28, 115}, new byte[]{1, 93, 93, 94, 36, -111, 76, 47}), false, 2, (Object) null)) {
                Intrinsics.checkNotNullExpressionValue(str2, lllliiiill1.llllIIIIll1(new byte[]{114, 112, 16, 70, -32}, new byte[]{63, 63, 84, 3, -84, -10, -30, 124}));
                if (StringsKt.startsWith$default(str2, lllliiiill1.llllIIIIll1(new byte[]{57, 124, 114, -71}, new byte[]{124, 42, 51, -108, 98, -81, -4, 21}), false, 2, (Object) null)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean IlIlllIIlI1() {
        String str = Build.HARDWARE;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        Intrinsics.checkNotNullExpressionValue(str, lllliiiill1.llllIIIIll1(new byte[]{-4, 101, 83, -98, 60, -107, -13, -85}, new byte[]{-76, 36, 1, -38, 107, -44, -95, -18}));
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, lllliiiill1.llllIIIIll1(new byte[]{-107, 15, 73, 104, 9, -93, 42, 38, Byte.MIN_VALUE, 19, 96, 47, 80, -24, 118, 76}, new byte[]{-31, 96, 5, 7, 126, -58, 88, 101}));
        if (!StringsKt.contains$default(lowerCase, lllliiiill1.llllIIIIll1(new byte[]{55, 58}, new byte[]{90, 78, 54, -84, -85, -91, 80, -119}), false, 2, (Object) null)) {
            String str2 = Build.BOARD;
            Intrinsics.checkNotNullExpressionValue(str2, lllliiiill1.llllIIIIll1(new byte[]{-44, 106, 39, 102, 104}, new byte[]{-106, 37, 102, 52, 44, 5, -115, 38}));
            String lowerCase2 = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, lllliiiill1.llllIIIIll1(new byte[]{-36, 57, -54, 64, -85, 60, 83, -79, -55, 37, -29, 7, -14, 119, 15, -37}, new byte[]{-88, 86, -122, 47, -36, 89, 33, -14}));
            if (!StringsKt.contains$default(lowerCase2, lllliiiill1.llllIIIIll1(new byte[]{-68, -9}, new byte[]{-47, -125, -50, -15, -124, -95, 65, 17}), false, 2, (Object) null)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final Pair<Boolean, String> lIllIIIlIl1() {
        ArrayList arrayList = new ArrayList();
        Set<String> set = this.f659llllIllIl1;
        String str = Build.MODEL;
        if (set.contains(str)) {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            arrayList.add(lllliiiill1.llllIIIIll1(new byte[]{61, -51, -127, 67, 72, -45}, new byte[]{112, -94, -27, 38, 36, -13, -85, -38}) + str + lllliiiill1.llllIIIIll1(new byte[]{-112, -24, 2, 71, 0, -126, -89, -14, -37, -19, 5, 20, 22}, new byte[]{-80, -127, 108, 103, 98, -18, -58, -111}));
            return TuplesKt.to(Boolean.TRUE, CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
        String llllIIIIll12 = llllIIIIll1();
        for (String str2 : this.f660IllIIlIIII1) {
            if (StringsKt.contains(llllIIIIll12, str2, true)) {
                IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                arrayList.add(lllliiiill12.llllIIIIll1(new byte[]{96, -109, -65, 73, -93, 7, -52, 112}, new byte[]{35, -5, -42, 57, -48, 98, -72, 80}) + llllIIIIll12 + lllliiiill12.llllIIIIll1(new byte[]{0, -12, -55, 18, -100, 85, -16, 81, 75, -15, -50, 65, -118}, new byte[]{32, -99, -89, 50, -2, 57, -111, 50}));
                return TuplesKt.to(Boolean.TRUE, CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
            }
        }
        String[] strArr = this.f661IlIlllIIlI1;
        String str3 = Build.VERSION.RELEASE;
        if (ArraysKt.contains(strArr, str3)) {
            IllIIlIIII1.llllIIIIll1 lllliiiill13 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            arrayList.add(lllliiiill13.llllIIIIll1(new byte[]{21, 123, -127, -20, -46, -13, 85, 14}, new byte[]{84, 21, -27, -98, -67, -102, 49, 46}) + str3 + lllliiiill13.llllIIIIll1(new byte[]{-27, 4, -66, -43, -119, -65, -72, -112, -82, 1, -71, -122, -97}, new byte[]{-59, 109, -48, -11, -21, -45, -39, -13}));
            return TuplesKt.to(Boolean.TRUE, CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
        if (llllllIlIIIlll1()) {
            arrayList.add(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-100, -21, -57, -77, 78, 58, 82, 54, -85, -17, -36, -87, 88, 49, 21, 97, -90, -2, -62, -32, 118, 53, 89, Byte.MAX_VALUE, -17, -51, -6, -107}, new byte[]{-49, -118, -86, -64, 59, 84, 53, 22}));
            return TuplesKt.to(Boolean.TRUE, CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
        if (llllIllIl1()) {
            arrayList.add(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-75, -17, 121, -91, -127, -111, 4, 11, -104, -3, 121, -79, -99, -40, 111, 14, -113, -13, 118, -14, -121, -112, 77, 23, -114, -1, 108}, new byte[]{-3, -102, 24, -46, -28, -8, 36, 103}));
            return TuplesKt.to(Boolean.TRUE, CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
        if (IlIllIlllIllI1()) {
            arrayList.add(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-48, 9, 85, -7, 61, 2, 103, 23, -31, 20, 92, -74, 63, 7, 35, 64, -37, 14, 85, -26, 52, 25, 38, 7, -25, 14}, new byte[]{-120, 96, 52, -106, 80, 107, 71, 96}));
            return TuplesKt.to(Boolean.TRUE, CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
        if (!IllIIlIIII1()) {
            return TuplesKt.to(Boolean.FALSE, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-121, -108, 120, -109, -83, 0, 52, 107, -70, -37, 60, -97, -86, 22, 34, 122, -84, -97}, new byte[]{-55, -5, 88, -6, -34, 115, 65, 14}));
        }
        arrayList.add(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-111, -66, -27, 9, -60, 76, -126, 116, -71, -76, -28, 77, -62, 71, -58, 124, -113, -112, -33, 4, -99, 16, -95, 22, -15, -15, -47, 116, -12, 2, -38, 96, -3, -78, -3, 86, -60, 81, -49}, new byte[]{-35, -47, -110, 36, -95, 34, -26, 84}));
        return TuplesKt.to(Boolean.TRUE, CollectionsKt.joinToString$default(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
    }

    public final void IlIlIIlIII1() {
        Pair<Boolean, String> lIllIIIlIl12 = lIllIIIlIl1();
        boolean booleanValue = ((Boolean) lIllIIIlIl12.component1()).booleanValue();
        String str = (String) lIllIIIlIl12.component2();
        String str2 = str;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllliiiill1.llllIIIIll1(new byte[]{63, 108, 30, 0, 62, 4, 124, 26, 19, 108, 30, 4}, new byte[]{123, 9, 125, 111, 90, 97, 14, 89});
        StringBuilder append = new StringBuilder().append(lllliiiill1.llllIIIIll1(new byte[]{82, -35, 121, -75, -19, 84, 73, -85, 120, -35, 121, -75, -19, 48, 12, -3, 49, -98, 60, -75, -124, 26, 15, -28, 98, -9, 121, -75, -19, 84, 73, -85, 120, -35, 121, -75, -19, 84, 36, -28, 60, -104, 53, -81, -19}, new byte[]{88, -3, 89, -107, -51, 116, 105, -117})).append(Build.MODEL).append(lllliiiill1.llllIIIIll1(new byte[]{5, -50, -80, -60, 30, -31, -57, 25, 47, -50, -80, -60, 30, -125, -107, 88, 97, -118, -86, -60}, new byte[]{15, -18, -112, -28, 62, -63, -25, 57})).append(Build.BRAND).append(lllliiiill1.llllIIIIll1(new byte[]{-24, -13, 31, -74, -116, -35, 106, 117, -62, -13, 31, -74, -116, -82, 5, 22, -40, -13}, new byte[]{-30, -45, 63, -106, -84, -3, 74, 85})).append(llllIIIIll1()).append(lllliiiill1.llllIIIIll1(new byte[]{-29, -30, -102, -39, -92, 99, 122, -114, -55, -30, -102, -39, -92, 2, 52, -54, -101, -83, -45, -99, -66, 99}, new byte[]{-23, -62, -70, -7, -124, 67, 90, -82})).append(Build.VERSION.RELEASE).append(lllliiiill1.llllIIIIll1(new byte[]{88, -56, -11, -56, 38, -118, -106, 107, 114, -56, -11, -56, 38, -19, -26, 30, 104, -56}, new byte[]{82, -24, -43, -24, 6, -86, -74, 75})).append(GLES20.glGetString(7937)).append(lllliiiill1.llllIIIIll1(new byte[]{58, -59, -32, 50, 113, -2, -105, 57, 16, -59, -32, 50, 113, -104, -40, 107, 83, Byte.MIN_VALUE, -32, 65, 6, -28, -105}, new byte[]{48, -27, -64, 18, 81, -34, -73, 25})).append(booleanValue).append(lllliiiill1.llllIIIIll1(new byte[]{-9, 57, 88, 37, -8, 9, 22, 50, -35, 57, 88, 37, -8, 123, 83, 115, -114, 118, 22, 63, -8}, new byte[]{-3, 25, 120, 5, -40, 41, 54, 18}));
        if (str.length() == 0) {
            str2 = lllliiiill1.llllIIIIll1(new byte[]{35, 65, -40, -100}, new byte[]{109, 46, -74, -7, 34, 32, 61, -125});
        }
        StringsKt.trimIndent(append.append(str2).append("\n        ").toString());
    }

    @SuppressLint({"RestrictedApi"})
    public final boolean llllIIIIll1(VideoCodecInfo videoCodecInfo) {
        return (new llllllIlIIIlll1().llllIIIIll1().equals(llllllIlIIIlll1.f157lIIIIlllllIlll1) && Intrinsics.areEqual(videoCodecInfo.name, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{106, 96, 122}, new byte[]{43, 54, 75, 65, 58, 52, -12, -71}))) || (IlIlllIIlI1() && Intrinsics.areEqual(videoCodecInfo.name, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-33, -88, -126, -121}, new byte[]{-105, -102, -76, -78, -40, -53, 85, 38})));
    }

    public final boolean llllllIlIIIlll1() {
        String str = Build.BRAND;
        byte[] bArr = {-36, -53, -100, -65, 99, -53, 57};
        byte[] bArr2 = {-81, -86, -15, -52, 22, -91, 94, 25};
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        if (StringsKt.equals(str, lllliiiill1.llllIIIIll1(bArr, bArr2), true)) {
            String glGetString = GLES20.glGetString(7937);
            Intrinsics.checkNotNullExpressionValue(glGetString, lllliiiill1.llllIIIIll1(new byte[]{-33, 98, 53, -15, -95, 122, -119, 5, -47, 96, 21, -68, -5, 7, -45, 94}, new byte[]{-72, 14, 114, -108, -43, 41, -3, 119}));
            if (StringsKt.contains(glGetString, lllliiiill1.llllIIIIll1(new byte[]{-127, 103, -50, -119}, new byte[]{-52, 6, -94, -32, 53, 52, -122, 49}), true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean llllIllIl1() {
        String str = Build.BRAND;
        byte[] bArr = {-32, -45, 67, 103, 16, -121};
        byte[] bArr2 = {-88, -90, 34, 16, 117, -18, -73, 107};
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        return StringsKt.equals(str, lllliiiill1.llllIIIIll1(bArr, bArr2), true) && StringsKt.contains(llllIIIIll1(), lllliiiill1.llllIIIIll1(new byte[]{-104, 24, 82, 21, 85}, new byte[]{-45, 113, 32, 124, 59, -103, 4, -120}), true) && Build.VERSION.SDK_INT < 28;
    }

    public final boolean IlIllIlllIllI1() {
        return StringsKt.contains(llllIIIIll1(), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{4, -93, -39, -30, -96, -70, -120, 8, 56, -93}, new byte[]{87, -51, -72, -110, -60, -56, -23, 111}), true) && Build.VERSION.SDK_INT < 27;
    }

    public final boolean IllIIlIIII1() {
        return Runtime.getRuntime().availableProcessors() < 4;
    }

    public final VideoDecoder llllIIIIll1(VideoDecoder videoDecoder) {
        return new llllIIIIll1(videoDecoder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x019f, code lost:
    
        if (r0 != null) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String llllIIIIll1() {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: llIIIIlIlllIII1.lIIIIlllllIlll1.llllIIIIll1():java.lang.String");
    }
}
