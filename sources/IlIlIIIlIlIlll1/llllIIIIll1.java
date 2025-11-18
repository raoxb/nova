package IlIlIIIlIlIlll1;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.util.Formatter;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/llllIIIIll1.class */
public class llllIIIIll1 {
    public static void llllIIIIll1(AutoCloseable... autoCloseableArr) {
        if (autoCloseableArr == null || autoCloseableArr.length <= 0) {
            return;
        }
        for (AutoCloseable autoCloseable : autoCloseableArr) {
            if (autoCloseable != null) {
                try {
                    autoCloseable.close();
                } catch (Exception e) {
                    Log.e(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-24, -5, 39, 23, -94, -114, Byte.MIN_VALUE, -24, -62, -8}, new byte[]{-85, -108, 74, 122, -51, -32, -43, -100}), IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{106, -18, 43, -49, -41, 66, -64, -101, 123, -25, 37, -47, -110, 13, -48, -116, 124, -16, 100, -39, -64, 16, -36, -99, 51, -94}, new byte[]{9, -126, 68, -68, -78, 98, -77, -17}) + e.getMessage());
                }
            }
        }
    }

    public static String llllIIIIll1(byte[] bArr, boolean z) {
        String llllIIIIll12;
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
        Formatter formatter = new Formatter();
        if (z) {
            llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-49, -86, 45, 45}, new byte[]{-22, -102, 31, 117, -98, 57, 116, 33});
        } else {
            llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{96, -32, -92, 99}, new byte[]{69, -48, -106, 27, -27, 24, 24, -82});
        }
        for (byte b : bArr) {
            formatter.format(llllIIIIll12, Byte.valueOf(b));
        }
        return formatter.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.BufferedWriter, java.io.Writer] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.AutoCloseable[]] */
    public static String llllIIIIll1(String str, String str2, String str3) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str2);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        File file2 = new File(file, str3);
        if (file2.exists() && file2.isFile()) {
            file2.delete();
        }
        file2.createNewFile();
        AutoCloseable autoCloseable = null;
        ?? r0 = 0;
        BufferedReader bufferedReader = null;
        try {
            r0 = new BufferedWriter(new FileWriter(file2));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new StringReader(str));
                while (true) {
                    r0 = bufferedReader2;
                    try {
                        String readLine = r0.readLine();
                        if (readLine != null) {
                            r0.write(readLine);
                        } else {
                            r0 = str3;
                            r0.flush();
                            llllIIIIll1(new AutoCloseable[]{r0, bufferedReader2});
                            return r0;
                        }
                    } catch (Throwable th) {
                        bufferedReader = bufferedReader2;
                        autoCloseable = th;
                        llllIIIIll1(autoCloseable, bufferedReader);
                        throw r0;
                    }
                }
            } catch (Throwable th2) {
                autoCloseable = th2;
            }
        } catch (Throwable unused) {
        }
    }
}
