package IlIlIIlIII1;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:IlIlIIlIII1/llllIIIIll1.class */
public class llllIIIIll1 {

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

        public lIIIIlllllIlll1(int i, String str, String str2, Map<String, List<String>> map) {
            this.f216llllIIIIll1 = i;
            this.f217lIIIIlllllIlll1 = str;
            this.f218llllIllIl1 = str2;
            this.f219IllIIlIIII1 = map;
        }

        public int lIIIIlllllIlll1() {
            return this.f216llllIIIIll1;
        }

        public String IllIIlIIII1() {
            return this.f217lIIIIlllllIlll1;
        }

        public String llllIIIIll1() {
            return this.f218llllIllIl1;
        }

        public Map<String, List<String>> llllIllIl1() {
            return this.f219IllIIlIIII1;
        }

        public boolean IlIlllIIlI1() {
            int i = this.f216llllIIIIll1;
            return i >= 200 && i <= 299;
        }
    }

    public llllIIIIll1(String str) {
        this.f213llllIIIIll1 = str;
        this.f214lIIIIlllllIlll1 = 10000;
        this.f215llllIllIl1 = 30000;
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f211IllIIlIIII1 = lllliiiill1.llllIIIIll1(new byte[]{51, -67, -83, -56, -100, -110, -108, -108, 21, -67}, new byte[]{123, -55, -39, -72, -33, -2, -3, -15});
        f212IlIlllIIlI1 = lllliiiill1.llllIIIIll1(new byte[]{118, 29, -43, Byte.MIN_VALUE, 33, 71, 86, 29, 126, 2, -53, -61, 34, 87, 88, 7, 44, 77, -58, -124, 41, 86, 68, 12, 99, 80, -48, -104, 46, 9, 15}, new byte[]{23, 109, -91, -20, 72, 36, 55, 105});
    }

    public <T extends lllllIllIl1> lIIIIlllllIlll1 llllIIIIll1(String str, T t, Map<String, String> map) throws JSONException {
        String jSONObject = t.toJSONObject().toString();
        HashMap hashMap = new HashMap(map);
        hashMap.put(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{71, -88, -101, -122, 17, 92, 76, -123, 80, -66, -123, -105}, new byte[]{4, -57, -11, -14, 116, 50, 56, -88}), f212IlIlllIIlI1);
        return llllIIIIll1(str, jSONObject, hashMap);
    }

    /* renamed from: IlIlIIlIII1.llllIIIIll1$llllIIIIll1, reason: collision with other inner class name */
    /* loaded from: classes.jar:IlIlIIlIII1/llllIIIIll1$llllIIIIll1.class */
    public static class C0006llllIIIIll1 extends RuntimeException {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final int f220llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final String f221lIIIIlllllIlll1;

        public C0006llllIIIIll1(String str, int i, String str2) {
            super(str, null);
            this.f220llllIIIIll1 = i;
            this.f221lIIIIlllllIlll1 = str2;
        }

        public int lIIIIlllllIlll1() {
            return this.f220llllIIIIll1;
        }

        public String llllIIIIll1() {
            return this.f221lIIIIlllllIlll1;
        }

        public C0006llllIIIIll1(String str, int i, String str2, Throwable th) {
            super(str, th);
            this.f220llllIIIIll1 = i;
            this.f221lIIIIlllllIlll1 = str2;
        }
    }

    public llllIIIIll1(String str, int i, int i2) {
        this.f213llllIIIIll1 = str;
        this.f214lIIIIlllllIlll1 = i;
        this.f215llllIllIl1 = i2;
    }

    public lIIIIlllllIlll1 llllIIIIll1(String str) {
        return llllIIIIll1(str, new HashMap());
    }

    public lIIIIlllllIlll1 llllIIIIll1(String str, Map<String, String> map) {
        return llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{97, 49, 106}, new byte[]{38, 116, 62, 92, 20, -18, -15, -59}), str, (String) null, map);
    }

    public lIIIIlllllIlll1 llllIIIIll1(String str, String str2) {
        return llllIIIIll1(str, str2, new HashMap());
    }

    public lIIIIlllllIlll1 llllIIIIll1(String str, String str2, Map<String, String> map) {
        return llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-69, 93, -10, -2}, new byte[]{-21, 18, -91, -86, -46, -100, 103, 3}), str, str2, map);
    }

    public <T extends lllllIllIl1> lIIIIlllllIlll1 llllIIIIll1(String str, T t) throws JSONException {
        return llllIIIIll1(str, (String) t, (Map<String, String>) new HashMap());
    }

    public <REQ extends lllllIllIl1, RESP extends lllllIllIl1> RESP llllIIIIll1(String str, REQ req, Class<RESP> cls) throws JSONException {
        return (RESP) llllIIIIll1(str, (String) req, (Class) cls, (Map<String, String>) new HashMap());
    }

    public <REQ extends lllllIllIl1, RESP extends lllllIllIl1> RESP llllIIIIll1(String str, REQ req, Class<RESP> cls, Map<String, String> map) throws JSONException {
        lIIIIlllllIlll1 llllIIIIll12 = llllIIIIll1(str, (String) req, map);
        if (llllIIIIll12.IlIlllIIlI1()) {
            if (llllIIIIll12.llllIIIIll1() != null && !llllIIIIll12.llllIIIIll1().isEmpty()) {
                try {
                    return (RESP) lllllIllIl1.llllIIIIll1(new JSONObject(llllIIIIll12.llllIIIIll1()), cls);
                } catch (Exception e) {
                    IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                    Log.e(f211IllIIlIIII1, lllliiiill1.llllIIIIll1(new byte[]{-30, 100, -32, 36, 77, 11, -1, 74, -53, 37, -7, 41, 90, 28, -70, 30, -42, 96, -6, 56, 71, 1, -84, 91, -124, 79, -38, 7, 102}, new byte[]{-92, 5, -119, 72, 40, 111, -33, 62}), e);
                    throw new C0006llllIIIIll1(llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(lllliiiill1.llllIIIIll1(new byte[]{67, 70, -100, 70, 33, -61, -89, -20, 106, 7, -123, 75, 54, -44, -30, -72, 119, 66, -122, 90, 43, -55, -12, -3, 63, 7}, new byte[]{5, 39, -11, 42, 68, -89, -121, -104}))), llllIIIIll12.lIIIIlllllIlll1(), llllIIIIll12.llllIIIIll1());
                }
            }
            throw new C0006llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{35, 74, 82, 24, -79, 14, 95, 83, 21, 87, 77, 2, -69, 75, 13, 84, 9, 67, 91}, new byte[]{102, 39, 34, 108, -56, 46, 45, 54}), llllIIIIll12.lIIIIlllllIlll1(), null);
        }
        throw new C0006llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-45, -37, -126, 26, 10, -8, -126, 38, -18, -22, -91, 62, 10, -20, -122, 62, -9, -22, -78, 112, 10}, new byte[]{-101, -113, -42, 74, 42, -118, -25, 87}) + llllIIIIll12.lIIIIlllllIlll1() + " " + llllIIIIll12.IllIIlIIII1(), llllIIIIll12.lIIIIlllllIlll1(), llllIIIIll12.llllIIIIll1());
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0328 A[Catch: all -> 0x018b, Exception -> 0x018f, IOException -> 0x0317, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x018f, blocks: (B:6:0x0121, B:8:0x0133, B:9:0x015c, B:11:0x0165, B:13:0x0173, B:17:0x0197, B:19:0x01a0, B:20:0x01a5, B:21:0x01aa, B:23:0x01b9, B:24:0x01be, B:25:0x01c3, B:26:0x01c8, B:27:0x01cd, B:28:0x01d2, B:29:0x01d7, B:30:0x01dd, B:32:0x01ef, B:33:0x0201, B:34:0x0214, B:35:0x021b, B:39:0x0227, B:42:0x0231, B:44:0x0236, B:45:0x0239, B:47:0x0254, B:48:0x0259, B:49:0x025e, B:50:0x0263, B:51:0x0268, B:52:0x026d, B:53:0x0272, B:54:0x0278, B:55:0x027e, B:56:0x0284, B:57:0x028a, B:58:0x028f, B:59:0x0295, B:60:0x029b, B:61:0x02a1, B:63:0x02b2, B:64:0x02b7, B:65:0x02bb, B:66:0x02c0, B:67:0x02c4, B:68:0x02c9, B:69:0x02ce, B:70:0x02d4, B:74:0x0302, B:77:0x030d, B:81:0x0328, B:82:0x0332, B:84:0x04b2, B:85:0x04b6, B:89:0x031b, B:91:0x0338, B:91:0x0338, B:92:0x033b, B:94:0x0345, B:96:0x034f, B:98:0x0359, B:100:0x0363, B:102:0x036d, B:104:0x0377, B:106:0x0381, B:108:0x038c, B:110:0x0397, B:112:0x03a2, B:114:0x03ac, B:116:0x03b7, B:118:0x03c2, B:120:0x03cd, B:122:0x03d8, B:124:0x03e3, B:126:0x03ee, B:128:0x03f9, B:130:0x0404, B:132:0x040f, B:134:0x041a, B:136:0x0425, B:138:0x0430, B:140:0x043b, B:142:0x0446, B:144:0x0451, B:146:0x045c, B:148:0x0467, B:150:0x047b, B:151:0x0480, B:152:0x0485, B:153:0x048a, B:154:0x048f, B:155:0x0494, B:156:0x0499, B:157:0x049f), top: B:5:0x0121, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final IlIlIIlIII1.llllIIIIll1.lIIIIlllllIlll1 llllIIIIll1(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.util.Map<java.lang.String, java.lang.String> r27) {
        /*
            Method dump skipped, instructions count: 1681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: IlIlIIlIII1.llllIIIIll1.llllIIIIll1(java.lang.String, java.lang.String, java.lang.String, java.util.Map):IlIlIIlIII1.llllIIIIll1$lIIIIlllllIlll1");
    }

    public final String llllIIIIll1(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                sb.append(new String(bArr, 0, read, StandardCharsets.UTF_8));
            } else {
                return sb.toString();
            }
        }
    }
}
