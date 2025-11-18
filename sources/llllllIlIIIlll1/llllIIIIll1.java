package llllllIlIIIlll1;

import IlIlIIIlIlIlll1.IIlIllIIll1;
import IlIlIIIlIlIlll1.IlIlllIIlI1;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import c13.nim5.ez8.h5_proto.Atom;
import c13.nim5.ez8.h5_proto.DeviceInfo;
import c13.nim5.ez8.h5_proto.Log;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ScheduledExecutorService;
import lIIlllIIIlllII1.llllIllIl1;
import llllIIIIll1.lIIIIlllllIlll1;
import lllllIllIl1.IllIIlIIII1;

/* loaded from: classes.jar:llllllIlIIIlll1/llllIIIIll1.class */
public class llllIIIIll1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f806llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static Atom f807lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static String f808llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final String f809IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static final String f810IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public static ScheduledExecutorService f811IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public static final long f812llllllIlIIIlll1 = 5000;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static boolean f813IlIlIIlIII1;

    public static void lIIIIlllllIlll1(Context context, String str) {
        IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, f806llllIIIIll1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-124, -53, -69, 122, -125, 53, 106, 85, -99, -21, -90, 123, -50}, new byte[]{-23, -86, -46, 20, -93, 92, 4, 60}));
        llllIIIIll1(context, str);
    }

    public static void llllIIIIll1(Context context, String str) {
        try {
            String str2 = f810IlIlllIIlI1;
            String llllIIIIll12 = IIlIllIIll1.llllIIIIll1(context, str2);
            String str3 = llllIIIIll12;
            if (llllIIIIll12 == null || str3.isEmpty()) {
                String llllIIIIll13 = IlIlllIIlI1.llllIIIIll1(context, 5);
                str3 = llllIIIIll13;
                if (llllIIIIll13 == null || str3.isEmpty()) {
                    byte[] bArr = new byte[36];
                    bArr[0] = 102;
                    bArr[1] = -62;
                    bArr[2] = 39;
                    bArr[3] = 112;
                    bArr[4] = 69;
                    bArr[5] = -3;
                    bArr[6] = 19;
                    bArr[7] = 97;
                    bArr[8] = 123;
                    bArr[9] = -62;
                    bArr[10] = 39;
                    bArr[11] = 112;
                    bArr[12] = 69;
                    bArr[13] = -32;
                    bArr[14] = 19;
                    bArr[15] = 97;
                    bArr[16] = 102;
                    bArr[17] = -62;
                    bArr[18] = 58;
                    bArr[19] = 112;
                    bArr[20] = 69;
                    bArr[21] = -3;
                    bArr[22] = 19;
                    bArr[23] = 124;
                    bArr[24] = 102;
                    bArr[25] = -62;
                    bArr[26] = 39;
                    bArr[27] = 112;
                    bArr[28] = 69;
                    bArr[29] = -3;
                    bArr[30] = 19;
                    bArr[31] = 97;
                    bArr[32] = 102;
                    bArr[33] = -62;
                    bArr[34] = 39;
                    bArr[35] = 24;
                    byte[] bArr2 = new byte[8];
                    bArr2[0] = 86;
                    bArr2[1] = -14;
                    bArr2[2] = 23;
                    bArr2[3] = 64;
                    bArr2[4] = 117;
                    bArr2[5] = -51;
                    bArr2[6] = 35;
                    bArr2[7] = 81;
                    str3 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2);
                }
                SharedPreferences.Editor edit = context.getSharedPreferences(IIlIllIIll1.f131llllIIIIll1, 0).edit();
                edit.putString(str2, str3);
                edit.apply();
            }
            Atom atom = new Atom();
            f807lIIIIlllllIlll1 = atom;
            atom.setDeviceId(IIlIllIIll1.lIIIIlllllIlll1(context));
            f807lIIIIlllllIlll1.setDeviceInfo(new DeviceInfo());
            f807lIIIIlllllIlll1.getDeviceInfo().setTimezone(TimeZone.getDefault().getID());
            f807lIIIIlllllIlll1.getDeviceInfo().setLocale(Locale.getDefault().toString());
            f807lIIIIlllllIlll1.getDeviceInfo().setPhoneTimestamp(Long.valueOf(System.currentTimeMillis()));
            f807lIIIIlllllIlll1.getDeviceInfo().setAndroidVersion(Build.VERSION.RELEASE);
            DeviceInfo deviceInfo = f807lIIIIlllllIlll1.getDeviceInfo();
            StringBuilder append = new StringBuilder().append(Build.BRAND);
            byte[] bArr3 = new byte[1];
            bArr3[0] = 45;
            byte[] bArr4 = new byte[8];
            bArr4[0] = 81;
            bArr4[1] = 6;
            bArr4[2] = -75;
            bArr4[3] = 96;
            bArr4[4] = -93;
            bArr4[5] = 76;
            bArr4[6] = -60;
            bArr4[7] = 94;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            deviceInfo.setPhoneModel(append.append(lllliiiill1.llllIIIIll1(bArr3, bArr4)).append(Build.MODEL).toString());
            f807lIIIIlllllIlll1.setVersion(Long.valueOf(IIlIllIIll1.llllIllIl1(context)));
            f807lIIIIlllllIlll1.setAppPackageName(context.getPackageName());
            f807lIIIIlllllIlll1.setAppVersion(IIlIllIIll1.llllIIIIll1(context));
            f807lIIIIlllllIlll1.setGaId(str3);
            f807lIIIIlllllIlll1.setAppChannel(str);
            String str4 = f806llllIIIIll1;
            byte[] bArr5 = new byte[28];
            bArr5[0] = 32;
            bArr5[1] = 97;
            bArr5[2] = 81;
            bArr5[3] = -109;
            bArr5[4] = 121;
            bArr5[5] = -61;
            bArr5[6] = -37;
            bArr5[7] = 48;
            bArr5[8] = 117;
            bArr5[9] = 14;
            bArr5[10] = 80;
            bArr5[11] = -14;
            bArr5[12] = -125;
            bArr5[13] = 13;
            bArr5[14] = 82;
            bArr5[15] = -53;
            bArr5[16] = 35;
            bArr5[17] = 124;
            bArr5[18] = 122;
            bArr5[19] = -112;
            bArr5[20] = 79;
            bArr5[21] = -41;
            bArr5[22] = -37;
            bArr5[23] = 46;
            bArr5[24] = 85;
            bArr5[25] = 12;
            bArr5[26] = 64;
            bArr5[27] = -23;
            byte[] bArr6 = new byte[8];
            bArr6[0] = -59;
            bArr6[1] = -23;
            bArr6[2] = -54;
            bArr6[3] = 118;
            bArr6[4] = -62;
            bArr6[5] = 121;
            bArr6[6] = 61;
            bArr6[7] = -90;
            IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, str4, lllliiiill1.llllIIIIll1(bArr5, bArr6));
        } catch (Exception e) {
            String str5 = f806llllIIIIll1;
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, str5, lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(lllliiiill12.llllIIIIll1(new byte[]{-121, -38, 93, 83, -34, 89, -14, 11, -46, -75, 92, 50, 36, -105, 123, -16, -124, -57, 118, 80, -24, 77, -15, 57, -45, -70, 114, 19, 95, -61}, new byte[]{98, 82, -58, -74, 101, -29, 20, -99}))));
            Atom atom2 = new Atom();
            f807lIIIIlllllIlll1 = atom2;
            atom2.setDeviceId(lllliiiill12.llllIIIIll1(new byte[]{-4, 122, -6, -7, -115, Byte.MAX_VALUE, -51}, new byte[]{-119, 20, -111, -105, -30, 8, -93, -111}));
            f807lIIIIlllllIlll1.setAppPackageName(context.getPackageName());
        }
    }

    public static String llllIllIl1() {
        return f808llllIllIl1;
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f806llllIIIIll1 = lllliiiill1.llllIIIIll1(new byte[]{-34, -49, 40, -12, -68, -45, 43, -60, -6}, new byte[]{-97, -69, 71, -103, -1, -78, 72, -84});
        f809IllIIlIIII1 = lllliiiill1.llllIIIIll1(new byte[]{-5, 115, -94, -15, 35, 96, 19, 3, -14, 98}, new byte[]{-102, 7, -51, -100, 124, 3, 114, 96});
        f810IlIlllIIlI1 = lllliiiill1.llllIIIIll1(new byte[]{-99, 95, 9, -93}, new byte[]{-6, 62, 96, -57, -118, -47, 43, 16});
        f807lIIIIlllllIlll1 = new Atom();
        f808llllIllIl1 = llllIllIl1.f377llllIllIl1;
        f813IlIlIIlIII1 = false;
    }

    public static String lIIIIlllllIlll1() {
        return f807lIIIIlllllIlll1.getAppChannel();
    }

    public static void llllIIIIll1(String str) {
        Atom atom;
        if (str == null || (atom = f807lIIIIlllllIlll1) == null) {
            return;
        }
        atom.setSessionId(str);
    }

    public static Atom llllIIIIll1() {
        Atom atom = f807lIIIIlllllIlll1;
        Atom atom2 = atom;
        if (atom == null) {
            atom2 = r0;
            Atom atom3 = new Atom();
        }
        if (Objects.equals(atom2.getSessionId(), llllIllIl1.f377llllIllIl1)) {
            atom2.setSessionId(IIlIllIIll1.lIIIIlllllIlll1((Context) Objects.requireNonNull(IIlIllIIll1.f145lIllIlIll1)));
        }
        return atom2;
    }

    public static void llllIIIIll1(Atom atom) {
        if (atom != null) {
            f807lIIIIlllllIlll1 = atom;
        }
    }
}
