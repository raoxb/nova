/**
 * 完全反混淆的Java类
 *
 * 原始: llllllIlIIIlll1.llllIIIIll1
 * 反混淆: llllllIlIIIlll1.PerMessageDeflate
 *
 * 反混淆处理:
 * ✓ 包名重组: llllllIlIIIlll1 → llllllIlIIIlll1
 * ✓ 类名重命名: llllIIIIll1 → PerMessageDeflate
 * ✓ 字符串解密: 5 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package llllllIlIIIlll1;

import com.client.IIlIllIIll1;
import com.client.DataHandler;
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
import com.websocket.DeobfuscationException;
import com.helper.Constants;
import lllllIllIl1.VirtualDisplayCapture;

/* loaded from: classes.jar:llllllIlIIIlll1/llllIIIIll1.class */
public class PerMessageDeflate {

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

    public static void getClassLoader(Context context, String message) {
        IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, f806llllIIIIll1, IlIlllIIlI1.IllIIlIIII1."main initAtom");
        decrypt(context, message);
    }

    public static void decrypt(Context context, String message) {
        try {
            String logMessage = f810IlIlllIIlI1;
            String llllIIIIll12 = IIlIllIIll1.decrypt(context, logMessage);
            String str3 = llllIIIIll12;
            if (llllIIIIll12 == null || str3.isEmpty()) {
                String llllIIIIll13 = IlIlllIIlI1.decrypt(context, 5);
                str3 = llllIIIIll13;
                if (llllIIIIll13 == null || str3.isEmpty()) {
                    byte[] byteArray = new byte[]{102, -62, 39, 112, 69, -3, 19, 97, 123, -62, 39, 112, 69, -32, 19, 97, 102, -62, 58, 112, 69, -3, 19, 124, 102, -62, 39, 112, 69, -3, 19, 97, 102, -62, 39, 24};
                    byte[] keyArray = new byte[]{86, -14, 23, 64, 117, -51, 35, 81};
                    str3 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray);
                }
                SharedPreferences.Editor edit = context.getSharedPreferences(IIlIllIIll1.f131llllIIIIll1, 0).edit();
                edit.putString(logMessage, str3);
                edit.apply();
            }
            Atom atom = new Atom();
            f807lIIIIlllllIlll1 = atom;
            atom.setDeviceId(IIlIllIIll1.getClassLoader(context));
            f807lIIIIlllllIlll1.setDeviceInfo(new DeviceInfo());
            f807lIIIIlllllIlll1.getDeviceInfo().setTimezone(TimeZone.getDefault().getID());
            f807lIIIIlllllIlll1.getDeviceInfo().setLocale(Locale.getDefault().toString());
            f807lIIIIlllllIlll1.getDeviceInfo().setPhoneTimestamp(Long.valueOf(System.currentTimeMillis()));
            f807lIIIIlllllIlll1.getDeviceInfo().setAndroidVersion(Build.VERSION.RELEASE);
            DeviceInfo deviceInfo = f807lIIIIlllllIlll1.getDeviceInfo();
            StringBuilder append = new StringBuilder().append(Build.BRAND);
            byte[] encryptedData = new byte[]{45};
            byte[] decryptionKey = new byte[]{81, 6, -75, 96, -93, 76, -60, 94};
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            deviceInfo.setPhoneModel(append.append(lllliiiill1.decrypt(encryptedData, decryptionKey)).append(Build.MODEL).toString());
            f807lIIIIlllllIlll1.setVersion(Long.valueOf(IIlIllIIll1.getWebViewProvider(context)));
            f807lIIIIlllllIlll1.setAppPackageName(context.getPackageName());
            f807lIIIIlllllIlll1.setAppVersion(IIlIllIIll1.decrypt(context));
            f807lIIIIlllllIlll1.setGaId(str3);
            f807lIIIIlllllIlll1.setAppChannel(message);
            String str4 = f806llllIIIIll1;
            byte[] bArr5 = new byte[]{32, 97, 81, -109, 121, -61, -37, 48, 117, 14, 80, -14, -125, 13, 82, -53, 35, 124, 122, -112, 79, -41, -37, 46, 85, 12, 64, -23};
            byte[] bArr6 = new byte[]{-59, -23, -54, 118, -62, 121, 61, -90};
            IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, str4, lllliiiill1.decrypt(bArr5, bArr6));
        } catch (Exception e) {
            String str5 = f806llllIIIIll1;
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, str5, lIIIIlllllIlll1.decrypt(e, new StringBuilder().append("创建新的Atom数据失败: ")));
            Atom atom2 = new Atom();
            f807lIIIIlllllIlll1 = atom2;
            atom2.setDeviceId(lllliiiill12.decrypt(new byte[]{-4, 122, -6, -7, -115, Byte.MAX_VALUE, -51}, new byte[]{-119, 20, -111, -105, -30, 8, -93, -111}));
            f807lIIIIlllllIlll1.setAppPackageName(context.getPackageName());
        }
    }

    public static String getWebViewProvider() {
        return f808llllIllIl1;
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f806llllIIIIll1 = "AtomCache";
        f809IllIIlIIII1 = "atom_cache";
        f810IlIlllIIlI1 = "gaid";
        f807lIIIIlllllIlll1 = new Atom();
        f808llllIllIl1 = llllIllIl1.f377llllIllIl1;
        f813IlIlIIlIII1 = false;
    }

    public static String getClassLoader() {
        return f807lIIIIlllllIlll1.getAppChannel();
    }

    public static void decrypt(String message) {
        Atom atom;
        if (message == null || (atom = f807lIIIIlllllIlll1) == null) {
            return;
        }
        atom.setSessionId(message);
    }

    public static Atom decrypt() {
        Atom atom = f807lIIIIlllllIlll1;
        Atom atom2 = atom;
        if (atom == null) {
            atom2 = r0;
            Atom atom3 = new Atom();
        }
        if (Objects.equals(atom2.getSessionId(), llllIllIl1.f377llllIllIl1)) {
            atom2.setSessionId(IIlIllIIll1.getClassLoader((Context) Objects.requireNonNull(IIlIllIIll1.f145lIllIlIll1)));
        }
        return atom2;
    }

    public static void decrypt(Atom atom) {
        if (atom != null) {
            f807lIIIIlllllIlll1 = atom;
        }
    }
}
