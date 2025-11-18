package IlIllIlllIllI1;

import IlIlIIIlIlIlll1.IIlIllIIll1;
import IlIlllIIlI1.IllIIlIIII1;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:IlIllIlllIllI1/lIIIIlllllIlll1.class */
public class lIIIIlllllIlll1 {

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final int f227lIIIIlllllIlll1 = 15000;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final int f228llllIllIl1 = 15000;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f226llllIIIIll1 = IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-23, -125, -124, -90, -2, 4, -48, 68, -49, -125}, new byte[]{-95, -9, -16, -42, -67, 104, -71, 33});

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final ExecutorService f229IllIIlIIII1 = Executors.newCachedThreadPool();

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static byte[] f230IlIlllIIlI1 = null;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'llllIIIIll1' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: IlIllIlllIllI1.lIIIIlllllIlll1$lIIIIlllllIlll1, reason: collision with other inner class name */
    /* loaded from: classes.jar:IlIllIlllIllI1/lIIIIlllllIlll1$lIIIIlllllIlll1.class */
    public static final class EnumC0007lIIIIlllllIlll1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public static final EnumC0007lIIIIlllllIlll1 f231llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public static final EnumC0007lIIIIlllllIlll1 f232lIIIIlllllIlll1;

        /* renamed from: llllIllIl1, reason: collision with root package name */
        public static final EnumC0007lIIIIlllllIlll1 f233llllIllIl1;

        /* renamed from: IllIIlIIII1, reason: collision with root package name */
        public static final EnumC0007lIIIIlllllIlll1 f234IllIIlIIII1;

        /* renamed from: IlIlllIIlI1, reason: collision with root package name */
        public static final /* synthetic */ EnumC0007lIIIIlllllIlll1[] f235IlIlllIIlI1;

        public static EnumC0007lIIIIlllllIlll1[] values() {
            return (EnumC0007lIIIIlllllIlll1[]) f235IlIlllIIlI1.clone();
        }

        public static EnumC0007lIIIIlllllIlll1 valueOf(String str) {
            return (EnumC0007lIIIIlllllIlll1) Enum.valueOf(EnumC0007lIIIIlllllIlll1.class, str);
        }

        public EnumC0007lIIIIlllllIlll1(String str, int i) {
        }

        public static /* synthetic */ EnumC0007lIIIIlllllIlll1[] llllIIIIll1() {
            return new EnumC0007lIIIIlllllIlll1[]{f231llllIIIIll1, f232lIIIIlllllIlll1, f233llllIllIl1, f234IllIIlIIII1};
        }

        static {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
            f231llllIIIIll1 = new EnumC0007lIIIIlllllIlll1(lllliiiill1.llllIIIIll1(new byte[]{37, -76, -81}, new byte[]{98, -15, -5, -38, -93, 102, 115, -33}), 0);
            f232lIIIIlllllIlll1 = new EnumC0007lIIIIlllllIlll1(lllliiiill1.llllIIIIll1(new byte[]{17, -82, -110, 40}, new byte[]{65, -31, -63, 124, -42, -87, 51, -56}), 1);
            f233llllIllIl1 = new EnumC0007lIIIIlllllIlll1(lllliiiill1.llllIIIIll1(new byte[]{-74, 72, -107}, new byte[]{-26, 29, -63, -64, 26, -41, -60, -104}), 2);
            f234IllIIlIIII1 = new EnumC0007lIIIIlllllIlll1(lllliiiill1.llllIIIIll1(new byte[]{97, 85, 103, 49, 112, -60}, new byte[]{37, 16, 43, 116, 36, -127, 69, -95}), 3);
            f235IlIlllIIlI1 = llllIIIIll1();
        }
    }

    /* loaded from: classes.jar:IlIllIlllIllI1/lIIIIlllllIlll1$llllIllIl1.class */
    public interface llllIllIl1<T> {
        T llllIIIIll1(JSONObject jSONObject) throws JSONException;
    }

    public static void llllIIIIll1(String str) {
        f230IlIlllIIlI1 = Base64.decode(str, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.BufferedReader] */
    public static String lIIIIlllllIlll1(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
        ?? sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        Throwable th = bufferedReader;
        while (true) {
            try {
                th = bufferedReader.readLine();
                if (th == 0) {
                    bufferedReader.close();
                    return sb.toString();
                }
                th = sb.append(th);
            } catch (Throwable th2) {
                try {
                    th = bufferedReader;
                    th.close();
                } catch (Throwable th3) {
                    th3.addSuppressed(th);
                }
                throw th2;
            }
        }
    }

    public static <T extends lllllIllIl1, R extends lllllIllIl1> T llllIIIIll1(String str, EnumC0007lIIIIlllllIlll1 enumC0007lIIIIlllllIlll1, R r, llllIllIl1<T> llllillil1) throws llllIIIIll1 {
        return (T) llllIIIIll1(str, enumC0007lIIIIlllllIlll1, r, llllillil1, null);
    }

    /* loaded from: classes.jar:IlIllIlllIllI1/lIIIIlllllIlll1$llllIIIIll1.class */
    public static class llllIIIIll1 extends Exception {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final int f236llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final String f237lIIIIlllllIlll1;

        public llllIIIIll1(String str) {
            super(str);
            this.f236llllIIIIll1 = 0;
            this.f237lIIIIlllllIlll1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }

        public llllIIIIll1(String str, Throwable th) {
            super(str, th);
            this.f236llllIIIIll1 = 0;
            this.f237lIIIIlllllIlll1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }

        public llllIIIIll1(String str, int i, String str2) {
            super(str);
            this.f236llllIIIIll1 = i;
            this.f237lIIIIlllllIlll1 = str2;
        }
    }

    public static <T extends lllllIllIl1, R extends lllllIllIl1> T llllIIIIll1(String str, EnumC0007lIIIIlllllIlll1 enumC0007lIIIIlllllIlll1, R r, llllIllIl1<T> llllillil1, Map<String, String> map) throws llllIIIIll1 {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection2.setRequestMethod(enumC0007lIIIIlllllIlll1.name());
                    httpURLConnection2.setConnectTimeout(15000);
                    httpURLConnection2.setReadTimeout(15000);
                    llllIIIIll1(httpURLConnection2, map);
                    if (r != null && (enumC0007lIIIIlllllIlll1 == EnumC0007lIIIIlllllIlll1.f232lIIIIlllllIlll1 || enumC0007lIIIIlllllIlll1 == EnumC0007lIIIIlllllIlll1.f233llllIllIl1)) {
                        httpURLConnection2.setDoOutput(true);
                        String jSONObject = r.toJSONObject().toString();
                        String str2 = f226llllIIIIll1;
                        StringBuilder sb = new StringBuilder();
                        byte[] bArr = new byte[7];
                        bArr[0] = -74;
                        bArr[1] = -41;
                        bArr[2] = 67;
                        bArr[3] = -13;
                        bArr[4] = -76;
                        bArr[5] = -81;
                        bArr[6] = 10;
                        byte[] bArr2 = new byte[8];
                        bArr2[0] = -19;
                        bArr2[1] = -94;
                        bArr2[2] = 49;
                        bArr2[3] = -97;
                        bArr2[4] = -23;
                        bArr2[5] = -107;
                        bArr2[6] = 42;
                        bArr2[7] = 25;
                        StringBuilder append = sb.append(IllIIlIIII1.llllIIIIll1(bArr, bArr2)).append(str);
                        byte[] bArr3 = new byte[12];
                        bArr3[0] = -6;
                        bArr3[1] = -55;
                        bArr3[2] = -124;
                        bArr3[3] = -74;
                        bArr3[4] = -74;
                        bArr3[5] = 118;
                        bArr3[6] = 12;
                        bArr3[7] = 101;
                        bArr3[8] = -82;
                        bArr3[9] = -49;
                        bArr3[10] = -52;
                        bArr3[11] = -13;
                        byte[] bArr4 = new byte[8];
                        bArr4[0] = -38;
                        bArr4[1] = -110;
                        bArr4[2] = -10;
                        bArr4[3] = -45;
                        bArr4[4] = -57;
                        bArr4[5] = 3;
                        bArr4[6] = 105;
                        bArr4[7] = 22;
                        lllllIllIl1.IllIIlIIII1.llllIllIl1(str2, append.append(IllIIlIIII1.llllIIIIll1(bArr3, bArr4)).append(jSONObject).toString());
                        if (f230IlIlllIIlI1 != null) {
                            jSONObject = new String(Base64.encode(IlIlIIIlIlIlll1.lIIIIlllllIlll1.lIIIIlllllIlll1(jSONObject.getBytes(StandardCharsets.UTF_8), f230IlIlllIIlI1), 2));
                        }
                        String str3 = jSONObject;
                        StringBuilder sb2 = new StringBuilder();
                        byte[] bArr5 = new byte[7];
                        bArr5[0] = -33;
                        bArr5[1] = -55;
                        bArr5[2] = -93;
                        bArr5[3] = -15;
                        bArr5[4] = 71;
                        bArr5[5] = 8;
                        bArr5[6] = 119;
                        byte[] bArr6 = new byte[8];
                        bArr6[0] = -124;
                        bArr6[1] = -68;
                        bArr6[2] = -47;
                        bArr6[3] = -99;
                        bArr6[4] = 26;
                        bArr6[5] = 50;
                        bArr6[6] = 87;
                        bArr6[7] = -100;
                        StringBuilder append2 = sb2.append(IllIIlIIII1.llllIIIIll1(bArr5, bArr6)).append(str);
                        byte[] bArr7 = new byte[12];
                        bArr7[0] = -29;
                        bArr7[1] = 55;
                        bArr7[2] = 78;
                        bArr7[3] = -56;
                        bArr7[4] = -51;
                        bArr7[5] = 47;
                        bArr7[6] = -103;
                        bArr7[7] = 94;
                        bArr7[8] = -73;
                        bArr7[9] = 49;
                        bArr7[10] = 6;
                        bArr7[11] = -115;
                        byte[] bArr8 = new byte[8];
                        bArr8[0] = -61;
                        bArr8[1] = 108;
                        bArr8[2] = 60;
                        bArr8[3] = -83;
                        bArr8[4] = -68;
                        bArr8[5] = 90;
                        bArr8[6] = -4;
                        bArr8[7] = 45;
                        lllllIllIl1.IllIIlIIII1.llllIllIl1(str2, append2.append(IllIIlIIII1.llllIIIIll1(bArr7, bArr8)).append(jSONObject).toString());
                        llllIIIIll1(httpURLConnection2, str3);
                    }
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode >= 200 && responseCode <= 299) {
                        String lIIIIlllllIlll12 = lIIIIlllllIlll1(httpURLConnection2.getInputStream());
                        StringBuilder sb3 = new StringBuilder();
                        byte[] bArr9 = new byte[10];
                        bArr9[0] = -124;
                        bArr9[1] = 15;
                        bArr9[2] = 80;
                        bArr9[3] = 8;
                        bArr9[4] = -15;
                        bArr9[5] = 48;
                        bArr9[6] = 83;
                        bArr9[7] = 117;
                        bArr9[8] = -52;
                        bArr9[9] = 74;
                        byte[] bArr10 = new byte[8];
                        bArr10[0] = -10;
                        bArr10[1] = 106;
                        bArr10[2] = 35;
                        bArr10[3] = 120;
                        bArr10[4] = -98;
                        bArr10[5] = 94;
                        bArr10[6] = 32;
                        bArr10[7] = 16;
                        lllllIllIl1.IllIIlIIII1.llllIllIl1(sb3.append(IllIIlIIII1.llllIIIIll1(bArr9, bArr10)).append(lIIIIlllllIlll12).toString());
                        if (f230IlIlllIIlI1 != null) {
                            String str4 = new String(IlIlIIIlIlIlll1.lIIIIlllllIlll1.llllIIIIll1(Base64.decode(lIIIIlllllIlll12, 2), f230IlIlllIIlI1));
                            String str5 = f226llllIIIIll1;
                            StringBuilder sb4 = new StringBuilder();
                            byte[] bArr11 = new byte[7];
                            bArr11[0] = 80;
                            bArr11[1] = -17;
                            bArr11[2] = -30;
                            bArr11[3] = -41;
                            bArr11[4] = -12;
                            bArr11[5] = 102;
                            bArr11[6] = -40;
                            byte[] bArr12 = new byte[8];
                            bArr12[0] = 11;
                            bArr12[1] = -102;
                            bArr12[2] = -112;
                            bArr12[3] = -69;
                            bArr12[4] = -87;
                            bArr12[5] = 92;
                            bArr12[6] = -8;
                            bArr12[7] = -1;
                            StringBuilder append3 = sb4.append(IllIIlIIII1.llllIIIIll1(bArr11, bArr12)).append(str);
                            byte[] bArr13 = new byte[13];
                            bArr13[0] = -89;
                            bArr13[1] = -82;
                            bArr13[2] = -120;
                            bArr13[3] = 74;
                            bArr13[4] = 113;
                            bArr13[5] = 60;
                            bArr13[6] = 110;
                            bArr13[7] = 10;
                            bArr13[8] = -12;
                            bArr13[9] = -112;
                            bArr13[10] = -89;
                            bArr13[11] = 21;
                            bArr13[12] = 34;
                            byte[] bArr14 = new byte[8];
                            bArr14[0] = -121;
                            bArr14[1] = -11;
                            bArr14[2] = -6;
                            bArr14[3] = 47;
                            bArr14[4] = 2;
                            bArr14[5] = 76;
                            bArr14[6] = 1;
                            bArr14[7] = 100;
                            lllllIllIl1.IllIIlIIII1.llllIllIl1(str5, append3.append(IllIIlIIII1.llllIIIIll1(bArr13, bArr14)).append(str4).toString());
                            T llllIIIIll12 = llllillil1.llllIIIIll1(new JSONObject(str4));
                            httpURLConnection2.disconnect();
                            return llllIIIIll12;
                        }
                        T llllIIIIll13 = llllillil1.llllIIIIll1(new JSONObject(lIIIIlllllIlll12));
                        httpURLConnection2.disconnect();
                        return llllIIIIll13;
                    }
                    String lIIIIlllllIlll13 = lIIIIlllllIlll1(httpURLConnection2.getErrorStream());
                    StringBuilder sb5 = new StringBuilder();
                    byte[] bArr15 = new byte[13];
                    bArr15[0] = 115;
                    bArr15[1] = 40;
                    bArr15[2] = 62;
                    bArr15[3] = -124;
                    bArr15[4] = -32;
                    bArr15[5] = -53;
                    bArr15[6] = -90;
                    bArr15[7] = 56;
                    bArr15[8] = -108;
                    bArr15[9] = -45;
                    bArr15[10] = -123;
                    bArr15[11] = 104;
                    bArr15[12] = -109;
                    byte[] bArr16 = new byte[8];
                    bArr16[0] = 59;
                    bArr16[1] = 124;
                    bArr16[2] = 106;
                    bArr16[3] = -44;
                    bArr16[4] = 9;
                    bArr16[5] = 95;
                    bArr16[6] = 63;
                    bArr16[7] = -48;
                    throw new llllIIIIll1(sb5.append(IllIIlIIII1.llllIIIIll1(bArr15, bArr16)).append(responseCode).toString(), responseCode, lIIIIlllllIlll13);
                } catch (Exception e) {
                    StringBuilder sb6 = new StringBuilder();
                    byte[] bArr17 = new byte[18];
                    bArr17[0] = 96;
                    bArr17[1] = -116;
                    bArr17[2] = 20;
                    bArr17[3] = -16;
                    bArr17[4] = 35;
                    bArr17[5] = -98;
                    bArr17[6] = -44;
                    bArr17[7] = -25;
                    bArr17[8] = -89;
                    bArr17[9] = 125;
                    bArr17[10] = -78;
                    bArr17[11] = 42;
                    bArr17[12] = 82;
                    bArr17[13] = -53;
                    bArr17[14] = -41;
                    bArr17[15] = -82;
                    bArr17[16] = 16;
                    bArr17[17] = -1;
                    byte[] bArr18 = new byte[8];
                    bArr18[0] = 42;
                    bArr18[1] = -33;
                    bArr18[2] = 91;
                    bArr18[3] = -66;
                    bArr18[4] = -53;
                    bArr18[5] = 35;
                    bArr18[6] = 120;
                    bArr18[7] = 1;
                    throw new llllIIIIll1(sb6.append(IllIIlIIII1.llllIIIIll1(bArr17, bArr18)).append(e.getMessage()).toString(), e);
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (IOException e2) {
            StringBuilder sb7 = new StringBuilder();
            byte[] bArr19 = new byte[14];
            bArr19[0] = -22;
            bArr19[1] = -9;
            bArr19[2] = 9;
            bArr19[3] = 38;
            bArr19[4] = 31;
            bArr19[5] = 22;
            bArr19[6] = 13;
            bArr19[7] = 65;
            bArr19[8] = -108;
            bArr19[9] = -94;
            bArr19[10] = 55;
            bArr19[11] = 110;
            bArr19[12] = -98;
            bArr19[13] = -86;
            byte[] bArr20 = new byte[8];
            bArr20[0] = 13;
            bArr20[1] = 74;
            bArr20[2] = -104;
            bArr20[3] = -63;
            bArr20[4] = -92;
            bArr20[5] = -118;
            bArr20[6] = -28;
            bArr20[7] = -43;
            throw new llllIIIIll1(sb7.append(IllIIlIIII1.llllIIIIll1(bArr19, bArr20)).append(e2.getMessage()).toString(), e2);
        }
    }

    public static void llllIIIIll1(HttpURLConnection httpURLConnection, Map<String, String> map) {
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        httpURLConnection.setRequestProperty(lllliiiill1.llllIIIIll1(new byte[]{106, -39, 119, 90, -120, -83, 85, 110, 125, -49, 105, 75}, new byte[]{41, -74, 25, 46, -19, -61, 33, 67}), lllliiiill1.llllIIIIll1(new byte[]{50, 26, 62, -112, -40, Byte.MAX_VALUE, -4, 60, 58, 5, 32, -45, -37, 111, -14, 38, 104, 74, 45, -108, -48, 110, -18, 45, 39, 87, 59, -120, -41, 49, -91}, new byte[]{83, 106, 78, -4, -79, 28, -99, 72}));
        httpURLConnection.setRequestProperty(lllliiiill1.llllIIIIll1(new byte[]{-88, -1, -102, 50, 123, 44}, new byte[]{-23, -100, -7, 87, 11, 88, -118, -20}), lllliiiill1.llllIIIIll1(new byte[]{99, -61, 10, 17, -66, -79, 9, -110, 107, -36, 20, 82, -67, -95, 7, -120}, new byte[]{2, -77, 122, 125, -41, -46, 104, -26}));
        httpURLConnection.setRequestProperty(lllliiiill1.llllIIIIll1(new byte[]{-64, 79, 101, 46, 107, -78, -28, 93, -5, 72}, new byte[]{-107, 60, 0, 92, 70, -13, -125, 56}), IIlIllIIll1.IlIlIIlIII1());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.BufferedWriter] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    public static void llllIIIIll1(HttpURLConnection httpURLConnection, String str) throws IOException {
        ?? outputStream = httpURLConnection.getOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream) outputStream, StandardCharsets.UTF_8));
            try {
                bufferedWriter.write(str);
                bufferedWriter.flush();
                bufferedWriter.close();
                if (outputStream != 0) {
                    outputStream.close();
                }
            } finally {
            }
        } catch (Throwable th) {
            OutputStream outputStream2 = outputStream;
            if (outputStream2 != null) {
                try {
                    outputStream2 = outputStream;
                    outputStream2.close();
                } catch (Throwable th2) {
                    th2.addSuppressed(outputStream2);
                }
            }
            throw th;
        }
    }

    public static byte[] llllIIIIll1(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1048576];
        byte[] bArr2 = null;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            if (bArr2 == null) {
                bArr2 = new byte[read];
                System.arraycopy(bArr, 0, bArr2, 0, read);
            } else {
                byte[] bArr3 = bArr2;
                int length = bArr3.length;
                byte[] bArr4 = new byte[length + read];
                System.arraycopy(bArr3, 0, bArr4, 0, length);
                System.arraycopy(bArr, 0, bArr4, length, read);
                bArr2 = bArr4;
            }
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return bArr2;
    }
}
