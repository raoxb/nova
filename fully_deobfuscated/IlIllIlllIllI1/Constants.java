/**
 * 完全反混淆的Java类
 *
 * 原始: IlIllIlllIllI1.lIIIIlllllIlll1
 * 反混淆: IlIllIlllIllI1.Constants
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIllIlllIllI1 → IlIllIlllIllI1
 * ✓ 类名重命名: lIIIIlllllIlll1 → Constants
 * ✓ 字符串解密: 9 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIllIlllIllI1;

import com.client.IIlIllIIll1;
import com.crypto.VirtualDisplayCapture;
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
import com.util.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:IlIllIlllIllI1/lIIIIlllllIlll1.class */
public class Constants {

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final int f227lIIIIlllllIlll1 = 15000;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final int f228llllIllIl1 = 15000;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f226llllIIIIll1 = IllIIlIIII1."HttpClient";

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

        public static EnumC0007lIIIIlllllIlll1 valueOf(String message) {
            return (EnumC0007lIIIIlllllIlll1) Enum.valueOf(EnumC0007lIIIIlllllIlll1.class, message);
        }

        public EnumC0007lIIIIlllllIlll1(String message, int i) {
        }

        public static /* synthetic */ EnumC0007lIIIIlllllIlll1[] decrypt() {
            return new EnumC0007lIIIIlllllIlll1[]{f231llllIIIIll1, f232lIIIIlllllIlll1, f233llllIllIl1, f234IllIIlIIII1};
        }

        static {
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
            f231llllIIIIll1 = new EnumC0007lIIIIlllllIlll1("GET", 0);
            f232lIIIIlllllIlll1 = new EnumC0007lIIIIlllllIlll1("POST", 1);
            f233llllIllIl1 = new EnumC0007lIIIIlllllIlll1("PUT", 2);
            f234IllIIlIIII1 = new EnumC0007lIIIIlllllIlll1("DELETE", 3);
            f235IlIlllIIlI1 = decrypt();
        }
    }

    /* loaded from: classes.jar:IlIllIlllIllI1/lIIIIlllllIlll1$llllIllIl1.class */
    public interface llllIllIl1<T> {
        T decrypt(JSONObject jSONObject) throws JSONException;
    }

    public static void decrypt(String message) {
        f230IlIlllIIlI1 = Base64.decode(message, 2);
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
    public static String getClassLoader(InputStream inputStream) throws IOException {
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

    public static <T extends lllllIllIl1, R extends lllllIllIl1> T decrypt(String message, EnumC0007lIIIIlllllIlll1 enumC0007lIIIIlllllIlll1, R r, llllIllIl1<T> llllillil1) throws llllIIIIll1 {
        return (T) decrypt(message, enumC0007lIIIIlllllIlll1, r, llllillil1, null);
    }

    /* loaded from: classes.jar:IlIllIlllIllI1/lIIIIlllllIlll1$llllIIIIll1.class */
    public static class llllIIIIll1 extends Exception {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final int f236llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public final String f237lIIIIlllllIlll1;

        public decrypt(String message) {
            super(message);
            this.f236llllIIIIll1 = 0;
            this.f237lIIIIlllllIlll1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }

        public decrypt(String message, Throwable th) {
            super(message, th);
            this.f236llllIIIIll1 = 0;
            this.f237lIIIIlllllIlll1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }

        public decrypt(String message, int i, String logMessage) {
            super(message);
            this.f236llllIIIIll1 = i;
            this.f237lIIIIlllllIlll1 = logMessage;
        }
    }

    public static <T extends lllllIllIl1, R extends lllllIllIl1> T decrypt(String message, EnumC0007lIIIIlllllIlll1 enumC0007lIIIIlllllIlll1, R r, llllIllIl1<T> llllillil1, Map<String, String> map) throws llllIIIIll1 {
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(message).openConnection();
                    httpURLConnection2.setRequestMethod(enumC0007lIIIIlllllIlll1.name());
                    httpURLConnection2.setConnectTimeout(15000);
                    httpURLConnection2.setReadTimeout(15000);
                    decrypt(httpURLConnection2, map);
                    if (r != null && (enumC0007lIIIIlllllIlll1 == EnumC0007lIIIIlllllIlll1.f232lIIIIlllllIlll1 || enumC0007lIIIIlllllIlll1 == EnumC0007lIIIIlllllIlll1.f233llllIllIl1)) {
                        httpURLConnection2.setDoOutput(true);
                        String jSONObject = r.toJSONObject().toString();
                        String logMessage = f226llllIIIIll1;
                        StringBuilder sb = new StringBuilder();
                        byte[] byteArray = new byte[]{-74, -41, 67, -13, -76, -81, 10};
                        byte[] keyArray = new byte[]{-19, -94, 49, -97, -23, -107, 42, 25};
                        StringBuilder append = sb.append(IllIIlIIII1.decrypt(byteArray, keyArray)).append(message);
                        byte[] encryptedData = new byte[]{-6, -55, -124, -74, -74, 118, 12, 101, -82, -49, -52, -13};
                        byte[] decryptionKey = new byte[]{-38, -110, -10, -45, -57, 3, 105, 22};
                        lllllIllIl1.IllIIlIIII1.getWebViewProvider(logMessage, append.append(IllIIlIIII1.decrypt(encryptedData, decryptionKey)).append(jSONObject).toString());
                        if (f230IlIlllIIlI1 != null) {
                            jSONObject = new String(Base64.encode(IlIlIIIlIlIlll1.lIIIIlllllIlll1.getClassLoader(jSONObject.getBytes(StandardCharsets.UTF_8), f230IlIlllIIlI1), 2));
                        }
                        String str3 = jSONObject;
                        StringBuilder sb2 = new StringBuilder();
                        byte[] bArr5 = new byte[]{-33, -55, -93, -15, 71, 8, 119};
                        byte[] bArr6 = new byte[]{-124, -68, -47, -99, 26, 50, 87, -100};
                        StringBuilder append2 = sb2.append(IllIIlIIII1.decrypt(bArr5, bArr6)).append(message);
                        byte[] bArr7 = new byte[]{-29, 55, 78, -56, -51, 47, -103, 94, -73, 49, 6, -115};
                        byte[] bArr8 = new byte[]{-61, 108, 60, -83, -68, 90, -4, 45};
                        lllllIllIl1.IllIIlIIII1.getWebViewProvider(logMessage, append2.append(IllIIlIIII1.decrypt(bArr7, bArr8)).append(jSONObject).toString());
                        decrypt(httpURLConnection2, str3);
                    }
                    int responseCode = httpURLConnection2.getResponseCode();
                    if (responseCode >= 200 && responseCode <= 299) {
                        String lIIIIlllllIlll12 = getClassLoader(httpURLConnection2.getInputStream());
                        StringBuilder sb3 = new StringBuilder();
                        byte[] bArr9 = new byte[]{-124, 15, 80, 8, -15, 48, 83, 117, -52, 74};
                        byte[] bArr10 = new byte[]{-10, 106, 35, 120, -98, 94, 32, 16};
                        lllllIllIl1.IllIIlIIII1.getWebViewProvider(sb3.append(IllIIlIIII1.decrypt(bArr9, bArr10)).append(lIIIIlllllIlll12).toString());
                        if (f230IlIlllIIlI1 != null) {
                            String str4 = new String(IlIlIIIlIlIlll1.lIIIIlllllIlll1.decrypt(Base64.decode(lIIIIlllllIlll12, 2), f230IlIlllIIlI1));
                            String str5 = f226llllIIIIll1;
                            StringBuilder sb4 = new StringBuilder();
                            byte[] bArr11 = new byte[]{80, -17, -30, -41, -12, 102, -40};
                            byte[] bArr12 = new byte[]{11, -102, -112, -69, -87, 92, -8, -1};
                            StringBuilder append3 = sb4.append(IllIIlIIII1.decrypt(bArr11, bArr12)).append(message);
                            byte[] bArr13 = new byte[]{-89, -82, -120, 74, 113, 60, 110, 10, -12, -112, -89, 21, 34};
                            byte[] bArr14 = new byte[]{-121, -11, -6, 47, 2, 76, 1, 100};
                            lllllIllIl1.IllIIlIIII1.getWebViewProvider(str5, append3.append(IllIIlIIII1.decrypt(bArr13, bArr14)).append(str4).toString());
                            T llllIIIIll12 = llllillil1.decrypt(new JSONObject(str4));
                            httpURLConnection2.disconnect();
                            return llllIIIIll12;
                        }
                        T llllIIIIll13 = llllillil1.decrypt(new JSONObject(lIIIIlllllIlll12));
                        httpURLConnection2.disconnect();
                        return llllIIIIll13;
                    }
                    String lIIIIlllllIlll13 = getClassLoader(httpURLConnection2.getErrorStream());
                    StringBuilder sb5 = new StringBuilder();
                    byte[] bArr15 = new byte[]{115, 40, 62, -124, -32, -53, -90, 56, -108, -45, -123, 104, -109};
                    byte[] bArr16 = new byte[]{59, 124, 106, -44, 9, 95, 63, -48};
                    throw new decrypt(sb5.append(IllIIlIIII1.decrypt(bArr15, bArr16)).append(responseCode).toString(), responseCode, lIIIIlllllIlll13);
                } catch (Exception e) {
                    StringBuilder sb6 = new StringBuilder();
                    byte[] bArr17 = new byte[]{96, -116, 20, -16, 35, -98, -44, -25, -89, 125, -78, 42, 82, -53, -41, -82, 16, -1};
                    byte[] bArr18 = new byte[]{42, -33, 91, -66, -53, 35, 120, 1};
                    throw new decrypt(sb6.append(IllIIlIIII1.decrypt(bArr17, bArr18)).append(e.getMessage()).toString(), e);
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (IOException e2) {
            StringBuilder sb7 = new StringBuilder();
            byte[] bArr19 = new byte[]{-22, -9, 9, 38, 31, 22, 13, 65, -108, -94, 55, 110, -98, -86};
            byte[] bArr20 = new byte[]{13, 74, -104, -63, -92, -118, -28, -43};
            throw new decrypt(sb7.append(IllIIlIIII1.decrypt(bArr19, bArr20)).append(e2.getMessage()).toString(), e2);
        }
    }

    public static void decrypt(HttpURLConnection httpURLConnection, Map<String, String> map) {
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        httpURLConnection.setRequestProperty("Content-Type", lllliiiill1.decrypt(new byte[]{50, 26, 62, -112, -40, Byte.MAX_VALUE, -4, 60, 58, 5, 32, -45, -37, 111, -14, 38, 104, 74, 45, -108, -48, 110, -18, 45, 39, 87, 59, -120, -41, 49, -91}, new byte[]{83, 106, 78, -4, -79, 28, -99, 72}));
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("User-Agent", IIlIllIIll1.initialize());
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
    public static void decrypt(HttpURLConnection httpURLConnection, String message) throws IOException {
        ?? outputStream = httpURLConnection.getOutputStream();
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream) outputStream, StandardCharsets.UTF_8));
            try {
                bufferedWriter.write(message);
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

    public static byte[] decrypt(InputStream inputStream) throws IOException {
        byte[] byteArray = new byte[1048576];
        byte[] keyArray = null;
        while (true) {
            int read = inputStream.read(byteArray);
            if (read <= 0) {
                break;
            }
            if (keyArray == null) {
                keyArray = new byte[read];
                System.arraycopy(byteArray, 0, keyArray, 0, read);
            } else {
                byte[] encryptedData = keyArray;
                int length = encryptedData.length;
                byte[] decryptionKey = new byte[length + read];
                System.arraycopy(encryptedData, 0, decryptionKey, 0, length);
                System.arraycopy(byteArray, 0, decryptionKey, length, read);
                keyArray = decryptionKey;
            }
        }
        if (keyArray == null) {
            keyArray = new byte[0];
        }
        return keyArray;
    }
}
