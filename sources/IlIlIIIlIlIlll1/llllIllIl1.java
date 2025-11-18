package IlIlIIIlIlIlll1;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.jar:IlIlIIIlIlIlll1/llllIllIl1.class */
public class llllIllIl1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    public static File llllIIIIll1(Context context, String str, String str2) throws IOException {
        File file = new File(context.getFilesDir(), str2);
        File file2 = new File(context.getFilesDir(), str2 + IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{27, -89, Byte.MIN_VALUE, 98, -59, -88, 110, 14, 81}, new byte[]{53, -61, -17, 21, -85, -60, 1, 111}));
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        File parentFile2 = file2.getParentFile();
        if (parentFile2 != null && !parentFile2.exists()) {
            parentFile2.mkdirs();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(35000);
        httpURLConnection.connect();
        if (httpURLConnection.getResponseCode() == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            Throwable fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[IllllIllllll1.llllIIIIll1.f318IlIlIIIlIlIlll1];
                while (true) {
                    fileOutputStream = inputStream.read(bArr);
                    if (fileOutputStream == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, fileOutputStream);
                }
                fileOutputStream.close();
                inputStream.close();
                IIlIllIIll1.llllIIIIll1(file2, file);
            } catch (Throwable th) {
                try {
                    fileOutputStream = fileOutputStream;
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th2.addSuppressed(fileOutputStream);
                }
                throw th;
            }
        }
        return file;
    }
}
