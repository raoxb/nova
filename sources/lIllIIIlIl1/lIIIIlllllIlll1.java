package lIllIIIlIl1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:lIllIIIlIl1/lIIIIlllllIlll1.class */
public class lIIIIlllllIlll1 implements lllllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f416llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f417lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f418llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public final llllIIIIll1 f419IllIIlIIII1;

    public lIIIIlllllIlll1(String str, String str2, String str3, llllIIIIll1 lllliiiill1) {
        this.f416llllIIIIll1 = str;
        this.f417lIIIIlllllIlll1 = str2;
        this.f418llllIllIl1 = str3 == null ? lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1 : str3;
        this.f419IllIIlIIII1 = lllliiiill1;
    }

    public String llllIIIIll1() {
        return this.f416llllIIIIll1;
    }

    public String llllIllIl1() {
        return this.f417lIIIIlllllIlll1;
    }

    public String IllIIlIIII1() {
        return this.f418llllIllIl1;
    }

    public llllIIIIll1 lIIIIlllllIlll1() {
        return this.f419IllIIlIIII1;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-84, -21, -7, -82, -83, 69}, new byte[]{-51, -101, -119, -15, -60, 33, 10, 85}), this.f416llllIIIIll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-16, -115, -61, 8, 3, -4, 31, -5, -16}, new byte[]{-108, -24, -75, 97, 96, -103, 64, -110}), this.f417lIIIIlllllIlll1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-115, 32, 0, 82, 8}, new byte[]{-7, 79, 107, 55, 102, 26, -40, 93}), this.f418llllIllIl1);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-114, -92, -47, -121}, new byte[]{-17, -48, -66, -22, 29, -13, -54, -81}), this.f419IllIIlIIII1.toJSONObject());
        return jSONObject;
    }

    public static lIIIIlllllIlll1 llllIIIIll1(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String optString = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-54, -60, 7, 104, Byte.MAX_VALUE, 28}, new byte[]{-85, -76, 119, 55, 22, 120, 16, -20}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString2 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-51, 43, -7, -42, 98, 89, -40, 26, -51}, new byte[]{-87, 78, -113, -65, 1, 60, -121, 115}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        String optString3 = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-100, 5, -65, -24, -2}, new byte[]{-24, 106, -44, -115, -112, 74, 112, -15}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{14, 44, 116, -81}, new byte[]{111, 88, 27, -62, -114, 80, -67, 116})) != null) {
            jSONObject2 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-66, -50, -60, -19}, new byte[]{-33, -70, -85, Byte.MIN_VALUE, 37, -87, -108, -23}));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new lIIIIlllllIlll1(optString, optString2, optString3, llllIIIIll1.llllIIIIll1(jSONObject2));
    }

    public static llllIIIIll1 llllIIIIll1(Context context, String str, String str2) {
        String locale;
        String str3;
        IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.getClass();
        byte[] lIIIIlllllIlll12 = IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{50, -60, 53, 56, -69, -118}, new byte[]{69, -83, 91, 92, -44, -3, 77, -89});
        Charset charset = StandardCharsets.UTF_8;
        WindowManager windowManager = (WindowManager) context.getSystemService(new String(lIIIIlllllIlll12, charset));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0).toString();
            } else {
                locale = context.getResources().getConfiguration().locale.toString();
            }
            int i = context.getResources().getConfiguration().orientation;
            if (i == 1) {
                str3 = r0;
                String str4 = new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{-94, -68, -49, 38, 111, 9, -71, 98}, new byte[]{-46, -45, -67, 82, 29, 104, -48, 22}), charset);
            } else if (i != 2) {
                str3 = r0;
                String str5 = new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{-87, 38, 110, 65, -118, -20, 15}, new byte[]{-36, 72, 5, 47, -27, -101, 97, 0}), charset);
            } else {
                str3 = r0;
                String str6 = new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{-110, 120, 7, 119, 124, -28, 29, 78, -101}, new byte[]{-2, 25, 105, 19, 15, -121, 124, 62}), charset);
            }
            String str7 = packageInfo.versionName;
            String str8 = str7;
            if (str7 == null) {
                str8 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
            }
            return new llllIIIIll1(str2, str, str8, UUID.randomUUID().toString().replace(new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{29}, new byte[]{48, -115, 114, -99, -11, -69, -84, 20}), charset), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1), new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{56, -106}, new byte[]{76, -11, -11, -85, -118, -76, 22, -58}), charset), TimeZone.getDefault().getID(), locale, Build.MODEL, Build.BRAND, displayMetrics.widthPixels + new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{-22}, new byte[]{-64, -105, 14, -49, -96, 59, -80, 116}), charset) + displayMetrics.heightPixels, displayMetrics.densityDpi + new String(IllIIlIIII1.llllIIIIll1.lIIIIlllllIlll1(new byte[]{39, 68, 113}, new byte[]{67, 52, 24, 89, -7, -77, 29, Byte.MIN_VALUE}), charset), str3, Build.VERSION.RELEASE, System.currentTimeMillis(), IlIlIIIlIlIlll1.IlIlIIlIII1.llllIIIIll1(IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1()));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
