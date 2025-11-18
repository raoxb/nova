/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlIIlIII1.llllIIIIll1
 * 反混淆: IlIlIIlIII1.PerMessageDeflate
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlIIlIII1 → IlIlIIlIII1
 * ✓ 类名重命名: llllIIIIll1 → PerMessageDeflate
 * ✓ 字符串解密: 8 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIlIIlIII1;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.util.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:IlIlIIlIII1/llllIIIIll1.class */
public class PerMessageDeflate {

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final String f211IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static final String f212IlIlllIIlI1;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final String f213llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final int f214lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final int f215llllIllIl1;

    /* loaded from: classes.jar:IlIlIIlIII1/llllIIIIll1$lIIIIlllllIlll1.class */
    public static class lIIIIlllllIlll1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final int f216llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final String f217lIIIIlllllIlll1;

        /* renamed from: llllIllIl1, reason: collision with root package name */
        public final String f218llllIllIl1;

        /* renamed from: IllIIlIIII1, reason: collision with root package name */
        public final Map<String, List<String>> f219IllIIlIIII1;

        public getClassLoader(int i, String message, String logMessage, Map<String, List<String>> map) {
            this.f216llllIIIIll1 = i;
            this.f217lIIIIlllllIlll1 = message;
            this.f218llllIllIl1 = logMessage;
            this.f219IllIIlIIII1 = map;
        }

        public int getClassLoader() {
            return this.f216llllIIIIll1;
        }

        public String isEnabled() {
            return this.f217lIIIIlllllIlll1;
        }

        public String decrypt() {
            return this.f218llllIllIl1;
        }

        public Map<String, List<String>> getWebViewProvider() {
            return this.f219IllIIlIIII1;
        }

        public boolean IlIlllIIlI1() {
            int i = this.f216llllIIIIll1;
            return i >= 200 && i <= 299;
        }
    }

    public decrypt(String message) {
        this.f213llllIIIIll1 = message;
        this.f214lIIIIlllllIlll1 = 10000;
        this.f215llllIllIl1 = 30000;
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f211IllIIlIIII1 = "HttpClient";
        f212IlIlllIIlI1 = lllliiiill1.decrypt(new byte[]{118, 29, -43, Byte.MIN_VALUE, 33, 71, 86, 29, 126, 2, -53, -61, 34, 87, 88, 7, 44, 77, -58, -124, 41, 86, 68, 12, 99, 80, -48, -104, 46, 9, 15}, new byte[]{23, 109, -91, -20, 72, 36, 55, 105});
    }

    public <T extends lllllIllIl1> lIIIIlllllIlll1 decrypt(String message, T t, Map<String, String> map) throws JSONException {
        String jSONObject = t.toJSONObject().toString();
        HashMap hashMap = new HashMap(map);
        hashMap.put(IlIlllIIlI1.IllIIlIIII1."Content-Type", f212IlIlllIIlI1);
        return decrypt(message, jSONObject, hashMap);
    }

    /* renamed from: IlIlIIlIII1.llllIIIIll1$llllIIIIll1, reason: collision with other inner class name */
    /* loaded from: classes.jar:IlIlIIlIII1/llllIIIIll1$llllIIIIll1.class */
    public static class C0006llllIIIIll1 extends RuntimeException {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final int f220llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final String f221lIIIIlllllIlll1;

        public C0006llllIIIIll1(String message, int i, String logMessage) {
            super(message, null);
            this.f220llllIIIIll1 = i;
            this.f221lIIIIlllllIlll1 = logMessage;
        }

        public int getClassLoader() {
            return this.f220llllIIIIll1;
        }

        public String decrypt() {
            return this.f221lIIIIlllllIlll1;
        }

        public C0006llllIIIIll1(String message, int i, String logMessage, Throwable th) {
            super(message, th);
            this.f220llllIIIIll1 = i;
            this.f221lIIIIlllllIlll1 = logMessage;
        }
    }

    public decrypt(String message, int i, int i2) {
        this.f213llllIIIIll1 = message;
        this.f214lIIIIlllllIlll1 = i;
        this.f215llllIllIl1 = i2;
    }

    public lIIIIlllllIlll1 decrypt(String message) {
        return decrypt(message, new HashMap());
    }

    public lIIIIlllllIlll1 decrypt(String message, Map<String, String> map) {
        return decrypt(IlIlllIIlI1.IllIIlIIII1."GET", message, (String) null, map);
    }

    public lIIIIlllllIlll1 decrypt(String message, String logMessage) {
        return decrypt(message, logMessage, new HashMap());
    }

    public lIIIIlllllIlll1 decrypt(String message, String logMessage, Map<String, String> map) {
        return decrypt(IlIlllIIlI1.IllIIlIIII1."POST", message, logMessage, map);
    }

    public <T extends lllllIllIl1> lIIIIlllllIlll1 decrypt(String message, T t) throws JSONException {
        return decrypt(message, (String) t, (Map<String, String>) new HashMap());
    }

    public <REQ extends lllllIllIl1, RESP extends lllllIllIl1> RESP decrypt(String message, REQ req, Class<RESP> clazz) throws JSONException {
        return (RESP) decrypt(message, (String) req, (Class) clazz, (Map<String, String>) new HashMap());
    }

    public <REQ extends lllllIllIl1, RESP extends lllllIllIl1> RESP decrypt(String message, REQ req, Class<RESP> clazz, Map<String, String> map) throws JSONException {
        lIIIIlllllIlll1 llllIIIIll12 = decrypt(message, (String) req, map);
        if (llllIIIIll12.IlIlllIIlI1()) {
            if (llllIIIIll12.decrypt() != null && !llllIIIIll12.decrypt().isEmpty()) {
                try {
                    return (RESP) lllllIllIl1.decrypt(new JSONObject(llllIIIIll12.decrypt()), clazz);
                } catch (Exception e) {
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    Log.e(f211IllIIlIIII1, "Failed to parse response JSON", e);
                    throw new C0006llllIIIIll1(llllIIIIll1.lIIIIlllllIlll1.decrypt(e, new StringBuilder().append("Failed to parse response: ")), llllIIIIll12.getClassLoader(), llllIIIIll12.decrypt());
                }
            }
            throw new C0006llllIIIIll1(IlIlllIIlI1.IllIIlIIII1."Empty response body", llllIIIIll12.getClassLoader(), null);
        }
        throw new C0006llllIIIIll1(IlIlllIIlI1.IllIIlIIII1."HTTP request failed: " + llllIIIIll12.getClassLoader() + " " + llllIIIIll12.isEnabled(), llllIIIIll12.getClassLoader(), llllIIIIll12.decrypt());
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0328 A[Catch: all -> 0x018b, Exception -> 0x018f, IOException -> 0x0317, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x018f, blocks: (B:6:0x0121, B:8:0x0133, B:9:0x015c, B:11:0x0165, B:13:0x0173, B:17:0x0197, B:19:0x01a0, B:20:0x01a5, B:21:0x01aa, B:23:0x01b9, B:24:0x01be, B:25:0x01c3, B:26:0x01c8, B:27:0x01cd, B:28:0x01d2, B:29:0x01d7, B:30:0x01dd, B:32:0x01ef, B:33:0x0201, B:34:0x0214, B:35:0x021b, B:39:0x0227, B:42:0x0231, B:44:0x0236, B:45:0x0239, B:47:0x0254, B:48:0x0259, B:49:0x025e, B:50:0x0263, B:51:0x0268, B:52:0x026d, B:53:0x0272, B:54:0x0278, B:55:0x027e, B:56:0x0284, B:57:0x028a, B:58:0x028f, B:59:0x0295, B:60:0x029b, B:61:0x02a1, B:63:0x02b2, B:64:0x02b7, B:65:0x02bb, B:66:0x02c0, B:67:0x02c4, B:68:0x02c9, B:69:0x02ce, B:70:0x02d4, B:74:0x0302, B:77:0x030d, B:81:0x0328, B:82:0x0332, B:84:0x04b2, B:85:0x04b6, B:89:0x031b, B:91:0x0338, B:91:0x0338, B:92:0x033b, B:94:0x0345, B:96:0x034f, B:98:0x0359, B:100:0x0363, B:102:0x036d, B:104:0x0377, B:106:0x0381, B:108:0x038c, B:110:0x0397, B:112:0x03a2, B:114:0x03ac, B:116:0x03b7, B:118:0x03c2, B:120:0x03cd, B:122:0x03d8, B:124:0x03e3, B:126:0x03ee, B:128:0x03f9, B:130:0x0404, B:132:0x040f, B:134:0x041a, B:136:0x0425, B:138:0x0430, B:140:0x043b, B:142:0x0446, B:144:0x0451, B:146:0x045c, B:148:0x0467, B:150:0x047b, B:151:0x0480, B:152:0x0485, B:153:0x048a, B:154:0x048f, B:155:0x0494, B:156:0x0499, B:157:0x049f), top: B:5:0x0121, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final IlIlIIlIII1.llllIIIIll1.lIIIIlllllIlll1 decrypt(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.Map<java.lang.String, java.lang.String> r27) {
        /*
            Method dump skipped, instructions count: 1681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: IlIlIIlIII1.llllIIIIll1.decrypt(java.lang.String, java.lang.String, java.lang.String, java.util.Map):IlIlIIlIII1.llllIIIIll1$lIIIIlllllIlll1");
    }

    public final String decrypt(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        byte[] byteArray = new byte[8192];
        while (true) {
            int read = inputStream.read(byteArray);
            if (read != -1) {
                sb.append(new String(byteArray, 0, read, StandardCharsets.UTF_8));
            } else {
                return sb.toString();
            }
        }
    }
}
