package c13.nim5.ez8.h5_proto;

import IlIlIIIlIlIlll1.IIlIllIIll1;
import IlIlllIIlI1.IllIIlIIII1;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import lIIlllIIIlllII1.llllIllIl1;
import llllIIIIll1.llllIIIIll1;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/HttpGatewayClient.class */
public class HttpGatewayClient {
    private static final String AES_KEY;
    private static final String CONTENT_TYPE;
    private static final String USER_AGENT;
    private final String baseUrl;

    public HttpGatewayClient(String str) {
        this.baseUrl = llllIIIIll1.llllIIIIll1(IllIIlIIII1.f239llllIIIIll1, new byte[]{-48, -54, -103, 103, 64, -17, 29, 105}, new byte[]{-72, -66, -19, 23, 51, -43, 50, 70}, new StringBuilder(), str);
    }

    private JSONObject callAPI(String str, JSONObject jSONObject) throws Exception {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return new JSONObject(new String(sendHttpRequest(str, aesEncryptString(Base64.encodeToString(gzipCompress(jSONObject.toString().getBytes(lllliiiill1.llllIIIIll1(new byte[]{-104, -96, -106, Byte.MIN_VALUE, -39}, new byte[]{-51, -12, -48, -83, -31, -8, 4, -113}))), 2)).getBytes(lllliiiill1.llllIIIIll1(new byte[]{-49, 24, -119, -4, 48}, new byte[]{-102, 76, -49, -47, 8, 106, -119, -19}))), lllliiiill1.llllIIIIll1(new byte[]{8, -15, 101, -2, -72}, new byte[]{93, -91, 35, -45, Byte.MIN_VALUE, 10, -3, -105})));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable] */
    private byte[] sendHttpRequest(String str, byte[] bArr) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.baseUrl + str).openConnection();
        try {
            byte[] bArr2 = new byte[4];
            bArr2[0] = 22;
            bArr2[1] = -109;
            bArr2[2] = -23;
            bArr2[3] = -112;
            byte[] bArr3 = new byte[8];
            bArr3[0] = 70;
            bArr3[1] = -36;
            bArr3[2] = -70;
            bArr3[3] = -60;
            bArr3[4] = 122;
            bArr3[5] = -88;
            bArr3[6] = -26;
            bArr3[7] = 18;
            IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
            httpURLConnection.setRequestMethod(lllliiiill1.llllIIIIll1(bArr2, bArr3));
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            byte[] bArr4 = new byte[12];
            bArr4[0] = 18;
            bArr4[1] = 65;
            bArr4[2] = 88;
            bArr4[3] = 26;
            bArr4[4] = -34;
            bArr4[5] = -122;
            bArr4[6] = -19;
            bArr4[7] = -16;
            bArr4[8] = 5;
            bArr4[9] = 87;
            bArr4[10] = 70;
            bArr4[11] = 11;
            byte[] bArr5 = new byte[8];
            bArr5[0] = 81;
            bArr5[1] = 46;
            bArr5[2] = 54;
            bArr5[3] = 110;
            bArr5[4] = -69;
            bArr5[5] = -24;
            bArr5[6] = -103;
            bArr5[7] = -35;
            httpURLConnection.setRequestProperty(lllliiiill1.llllIIIIll1(bArr4, bArr5), CONTENT_TYPE);
            byte[] bArr6 = new byte[10];
            bArr6[0] = 4;
            bArr6[1] = 21;
            bArr6[2] = -54;
            bArr6[3] = -35;
            bArr6[4] = -33;
            bArr6[5] = 16;
            bArr6[6] = 27;
            bArr6[7] = -44;
            bArr6[8] = 63;
            bArr6[9] = 18;
            byte[] bArr7 = new byte[8];
            bArr7[0] = 81;
            bArr7[1] = 102;
            bArr7[2] = -81;
            bArr7[3] = -81;
            bArr7[4] = -14;
            bArr7[5] = 81;
            bArr7[6] = 124;
            bArr7[7] = -79;
            httpURLConnection.setRequestProperty(lllliiiill1.llllIIIIll1(bArr6, bArr7), USER_AGENT);
            byte[] bArr8 = new byte[14];
            bArr8[0] = 32;
            bArr8[1] = 105;
            bArr8[2] = -20;
            bArr8[3] = -121;
            bArr8[4] = 34;
            bArr8[5] = 5;
            bArr8[6] = 32;
            bArr8[7] = 96;
            bArr8[8] = 47;
            bArr8[9] = 99;
            bArr8[10] = -20;
            bArr8[11] = -108;
            bArr8[12] = 51;
            bArr8[13] = 3;
            byte[] bArr9 = new byte[8];
            bArr9[0] = 99;
            bArr9[1] = 6;
            bArr9[2] = -126;
            bArr9[3] = -13;
            bArr9[4] = 71;
            bArr9[5] = 107;
            bArr9[6] = 84;
            bArr9[7] = 77;
            httpURLConnection.setRequestProperty(lllliiiill1.llllIIIIll1(bArr8, bArr9), String.valueOf(bArr.length));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    String str2 = llllIllIl1.f377llllIllIl1;
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    if (errorStream != null) {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            byte[] bArr10 = new byte[IllllIllllll1.llllIIIIll1.f318IlIlIIIlIlIlll1];
                            while (true) {
                                int read = errorStream.read(bArr10);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr10, 0, read);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byte[] bArr11 = new byte[5];
                            bArr11[0] = -47;
                            bArr11[1] = -84;
                            bArr11[2] = 50;
                            bArr11[3] = 29;
                            bArr11[4] = 78;
                            byte[] bArr12 = new byte[8];
                            bArr12[0] = -124;
                            bArr12[1] = -8;
                            bArr12[2] = 116;
                            bArr12[3] = 48;
                            bArr12[4] = 118;
                            bArr12[5] = 54;
                            bArr12[6] = 98;
                            bArr12[7] = -126;
                            str2 = new String(byteArray, IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr11, bArr12));
                        } finally {
                        }
                    }
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr13 = new byte[31];
                    bArr13[0] = 94;
                    bArr13[1] = -12;
                    bArr13[2] = -125;
                    bArr13[3] = -110;
                    bArr13[4] = 86;
                    bArr13[5] = 1;
                    bArr13[6] = -39;
                    bArr13[7] = 81;
                    bArr13[8] = 99;
                    bArr13[9] = -59;
                    bArr13[10] = -92;
                    bArr13[11] = -74;
                    bArr13[12] = 86;
                    bArr13[13] = 21;
                    bArr13[14] = -35;
                    bArr13[15] = 73;
                    bArr13[16] = 122;
                    bArr13[17] = -59;
                    bArr13[18] = -77;
                    bArr13[19] = -30;
                    bArr13[20] = 1;
                    bArr13[21] = 26;
                    bArr13[22] = -56;
                    bArr13[23] = 72;
                    bArr13[24] = 54;
                    bArr13[25] = -61;
                    bArr13[26] = -72;
                    bArr13[27] = -90;
                    bArr13[28] = 19;
                    bArr13[29] = 73;
                    bArr13[30] = -100;
                    byte[] bArr14 = new byte[8];
                    bArr14[0] = 22;
                    bArr14[1] = -96;
                    bArr14[2] = -41;
                    bArr14[3] = -62;
                    bArr14[4] = 118;
                    bArr14[5] = 115;
                    bArr14[6] = -68;
                    bArr14[7] = 32;
                    IllIIlIIII1.llllIIIIll1 lllliiiill12 = IllIIlIIII1.f239llllIIIIll1;
                    StringBuilder append = sb.append(lllliiiill12.llllIIIIll1(bArr13, bArr14)).append(responseCode);
                    byte[] bArr15 = new byte[9];
                    bArr15[0] = -21;
                    bArr15[1] = -2;
                    bArr15[2] = 63;
                    bArr15[3] = -30;
                    bArr15[4] = -122;
                    bArr15[5] = -106;
                    bArr15[6] = -27;
                    bArr15[7] = -77;
                    bArr15[8] = -25;
                    byte[] bArr16 = new byte[8];
                    bArr16[0] = -57;
                    bArr16[1] = -34;
                    bArr16[2] = 90;
                    bArr16[3] = -112;
                    bArr16[4] = -12;
                    bArr16[5] = -7;
                    bArr16[6] = -105;
                    bArr16[7] = -119;
                    throw new IOException(append.append(lllliiiill12.llllIIIIll1(bArr15, bArr16)).append(str2).toString());
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    byte[] bArr17 = new byte[8192];
                    while (true) {
                        int read2 = inputStream.read(bArr17);
                        if (read2 == -1) {
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            inputStream.close();
                            httpURLConnection.disconnect();
                            return byteArray2;
                        }
                        byteArrayOutputStream2.write(bArr17, 0, read2);
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
        httpURLConnection.disconnect();
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    private byte[] gzipCompress(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                byteArrayOutputStream = gZIPOutputStream;
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th2.addSuppressed(byteArrayOutputStream);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.InputStream, java.lang.Throwable, java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r0v15, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private byte[] gzipDecompress(byte[] bArr) throws IOException {
        ?? gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ByteArrayOutputStream byteArrayOutputStream2 = 8192;
            try {
                byte[] bArr2 = new byte[8192];
                while (true) {
                    int read = gZIPInputStream.read(bArr2);
                    if (read == -1) {
                        byteArrayOutputStream2 = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        gZIPInputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                gZIPInputStream.close();
            } catch (Throwable th2) {
                th2.addSuppressed(gZIPInputStream);
            }
            throw th;
        }
    }

    public static String aesEncryptString(String str) throws Exception {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        byte[] bytes = IIlIllIIll1.IlIllIlllIllI1(AES_KEY).getBytes(lllliiiill1.llllIIIIll1(new byte[]{4, -97, 17, 3, 24}, new byte[]{81, -53, 87, 46, 32, -47, 78, -83}));
        byte[] bArr = bytes;
        if (bytes.length > 32) {
            bArr = new byte[32];
            System.arraycopy(bArr, 0, bArr, 0, 32);
        } else if (bArr.length < 32) {
            bArr = new byte[32];
            System.arraycopy(bArr, 0, bArr, 0, bArr.length);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, lllliiiill1.llllIIIIll1(new byte[]{115, 94, 23}, new byte[]{50, 27, 68, 45, 106, 117, -110, 69}));
        byte[] bArr2 = new byte[16];
        new SecureRandom().nextBytes(bArr2);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipher = Cipher.getInstance(lllliiiill1.llllIIIIll1(new byte[]{50, 62, -114, -85, 82, -20, -88, -88, 61, 20, -115, -27, 117, -50, -125, -23, 20}, new byte[]{115, 123, -35, -124, 17, -86, -22, -121}));
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] doFinal = cipher.doFinal(str.getBytes(lllliiiill1.llllIIIIll1(new byte[]{92, 123, -68, 61, -77}, new byte[]{9, 47, -6, 16, -117, 75, -35, -71})));
        byte[] bArr3 = new byte[16 + doFinal.length];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        System.arraycopy(doFinal, 0, bArr3, 16, doFinal.length);
        return Base64.encodeToString(bArr3, 2);
    }

    public static String aesDecryptString(String str) throws Exception {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        byte[] bytes = IIlIllIIll1.IlIllIlllIllI1(AES_KEY).getBytes(lllliiiill1.llllIIIIll1(new byte[]{-88, -29, -52, 26, -74}, new byte[]{-3, -73, -118, 55, -114, -35, 51, -16}));
        byte[] bArr = bytes;
        if (bytes.length > 32) {
            bArr = new byte[32];
            System.arraycopy(bArr, 0, bArr, 0, 32);
        } else if (bArr.length < 32) {
            bArr = new byte[32];
            System.arraycopy(bArr, 0, bArr, 0, bArr.length);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, lllliiiill1.llllIIIIll1(new byte[]{105, -29, -55}, new byte[]{40, -90, -102, 63, 55, 97, 14, 33}));
        byte[] decode = Base64.decode(str, 2);
        if (decode.length < 16) {
            throw new IllegalArgumentException(lllliiiill1.llllIIIIll1(new byte[]{83, 104, 45, 35, 7, 65, -76, 74, 6, 4, 0, 104, 65, 82, -19, 58, 12, 68, 105, 126, 37, 47, -28, 108, 89, 94, 1, 32, 63, 103, -76, 108, 35, 4, 2, 86, 77, 72, -60, -106, -32}, new byte[]{-74, -30, -115, -58, -88, -57, 82, -33}));
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(decode, 0, bArr2, 0, 16);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        int length = decode.length - 16;
        byte[] bArr3 = new byte[length];
        System.arraycopy(decode, 16, bArr3, 0, length);
        Cipher cipher = Cipher.getInstance(lllliiiill1.llllIIIIll1(new byte[]{-114, 40, -6, -30, 76, -15, -116, -11, -127, 2, -7, -84, 107, -45, -89, -76, -88}, new byte[]{-49, 109, -87, -51, 15, -73, -50, -38}));
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(bArr3), lllliiiill1.llllIIIIll1(new byte[]{-95, -72, -100, -64, 80}, new byte[]{-12, -20, -38, -19, 104, 23, -7, 25}));
    }

    private byte[] aesEncrypt(byte[] bArr) throws Exception {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        byte[] bytes = IIlIllIIll1.IlIllIlllIllI1(AES_KEY).getBytes(lllliiiill1.llllIIIIll1(new byte[]{-62, 93, 37, -99, -46}, new byte[]{-105, 9, 99, -80, -22, -37, -77, -21}));
        byte[] bArr2 = bytes;
        if (bytes.length > 32) {
            bArr2 = new byte[32];
            System.arraycopy(bArr2, 0, bArr2, 0, 32);
        } else if (bArr2.length < 32) {
            bArr2 = new byte[32];
            System.arraycopy(bArr2, 0, bArr2, 0, bArr2.length);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, lllliiiill1.llllIIIIll1(new byte[]{115, 106, -90}, new byte[]{50, 47, -11, 62, -114, 34, 22, -81}));
        byte[] bArr3 = new byte[16];
        new SecureRandom().nextBytes(bArr3);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        Cipher cipher = Cipher.getInstance(lllliiiill1.llllIIIIll1(new byte[]{-36, 87, 69, 120, 12, 106, 73, 31, -45, 125, 70, 54, 43, 72, 98, 94, -6}, new byte[]{-99, 18, 22, 87, 79, 44, 11, 48}));
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] doFinal = cipher.doFinal(bArr);
        byte[] bArr4 = new byte[16 + doFinal.length];
        System.arraycopy(bArr3, 0, bArr4, 0, 16);
        System.arraycopy(doFinal, 0, bArr4, 16, doFinal.length);
        return bArr4;
    }

    private byte[] aesDecrypt(byte[] bArr) throws Exception {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        byte[] bytes = IIlIllIIll1.IlIllIlllIllI1(AES_KEY).getBytes(lllliiiill1.llllIIIIll1(new byte[]{76, -62, 111, -24, 5}, new byte[]{25, -106, 41, -59, 61, -31, 113, -101}));
        byte[] bArr2 = bytes;
        if (bytes.length > 32) {
            bArr2 = new byte[32];
            System.arraycopy(bArr2, 0, bArr2, 0, 32);
        } else if (bArr2.length < 32) {
            bArr2 = new byte[32];
            System.arraycopy(bArr2, 0, bArr2, 0, bArr2.length);
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, lllliiiill1.llllIIIIll1(new byte[]{121, 52, -33}, new byte[]{56, 113, -116, 102, 85, 22, 84, -22}));
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr, 0, bArr3, 0, 16);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        int length = bArr.length - 16;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 16, bArr4, 0, length);
        Cipher cipher = Cipher.getInstance(lllliiiill1.llllIIIIll1(new byte[]{84, 33, 119, 85, -103, -9, 30, -75, 91, 11, 116, 27, -66, -43, 53, -12, 114}, new byte[]{21, 100, 36, 122, -38, -79, 92, -102}));
        cipher.init(2, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr4);
    }

    private JSONObject callAPIPlaintext(String str, JSONObject jSONObject) throws Exception {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return new JSONObject(new String(sendHttpRequest(str, jSONObject.toString().getBytes(lllliiiill1.llllIIIIll1(new byte[]{54, -114, -103, -77, -117}, new byte[]{99, -38, -33, -98, -77, -49, -24, -1}))), lllliiiill1.llllIIIIll1(new byte[]{105, 46, -75, 43, 2}, new byte[]{60, 122, -13, 6, 58, 77, -76, 59})));
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        AES_KEY = lllliiiill1.llllIIIIll1(new byte[]{18, -63, 110, -6, 107, -11, 61, 100}, new byte[]{85, -77, 11, -97, 5, -79, 92, 29});
        CONTENT_TYPE = lllliiiill1.llllIIIIll1(new byte[]{-2, -9, -96, -122, 48, -82, -81, -29, -10, -24, -66, -59, 51, -66, -95, -7}, new byte[]{-97, -121, -48, -22, 89, -51, -50, -105});
        USER_AGENT = lllliiiill1.llllIIIIll1(new byte[]{-117, -117, -51, -110, 33, -114, 63, -50, -69, -126, -30, -114, 47, -113, 29, -45, -32, -43, -113, -46}, new byte[]{-49, -25, -95, -30, 70, -22, 115, -89});
    }

    public JSONObject getConfig(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject2.put(lllliiiill1.llllIIIIll1(new byte[]{-15, -66, 90, -88}, new byte[]{-112, -54, 53, -59, 39, 39, 68, 46}), jSONObject);
        return callAPI(lllliiiill1.llllIIIIll1(new byte[]{13, -87, 95, -58, 84, -18, -33, -59, 70, -92, 67, -33, 28, -4, -63, -115, 71, -68, 108, -64, 21, -2, -121, -115}, new byte[]{34, -56, 47, -81, 123, -104, -18, -22}), jSONObject2);
    }

    public CommonResponse updateLog(UpdateLogRequest updateLogRequest) throws Exception {
        return CommonResponse.fromJSONObject(callAPI(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{12, 80, -74, -22, -27, 8, 84, -100, 71, 93, -86, -13, -83, 26, 74, -58, 83, 85, -89, -9, -81, 50, 10, -44}, new byte[]{35, 49, -58, -125, -54, 126, 101, -77}), updateLogRequest.toJSONObject()));
    }

    public CommonResponse updateEvent(UpdateEventRequest updateEventRequest) throws Exception {
        return CommonResponse.fromJSONObject(callAPI(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{19, -2, 10, -94, -58, 125, -74, 20, 88, -13, 22, -69, -114, 111, -88, 78, 76, -5, 27, -65, -116, 78, -15, 94, 82, -21}, new byte[]{60, -97, 122, -53, -23, 11, -121, 59}), updateEventRequest.toJSONObject()));
    }

    public HttpGatewayClient(String str, int i, boolean z) {
        String llllIIIIll12;
        StringBuilder sb = new StringBuilder();
        if (z) {
            llllIIIIll12 = IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-90, -52, -32, 48, 34, 73, -114, 90}, new byte[]{-50, -72, -108, 64, 81, 115, -95, 117});
        } else {
            llllIIIIll12 = IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-121, -70, 3, -76, 23, -100, -9}, new byte[]{-17, -50, 119, -60, 45, -77, -40, -101});
        }
        this.baseUrl = sb.append(llllIIIIll12).append(str).append(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{113}, new byte[]{75, 9, -97, 15, 119, -77, 26, -122})).append(i).toString();
    }
}
