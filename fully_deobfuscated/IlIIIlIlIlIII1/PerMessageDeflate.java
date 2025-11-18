/**
 * 完全反混淆的Java类
 *
 * 原始: IlIIIlIlIlIII1.llllIIIIll1
 * 反混淆: IlIIIlIlIlIII1.PerMessageDeflate
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIIIlIlIlIII1 → IlIIIlIlIlIII1
 * ✓ 类名重命名: llllIIIIll1 → PerMessageDeflate
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIIIlIlIlIII1;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.jar:IlIIIlIlIlIII1/llllIIIIll1.class */
public class PerMessageDeflate {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final int f99llllIIIIll1 = 0;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final int f100lIIIIlllllIlll1 = 1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final int f101llllIllIl1 = 2;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final int f102IllIIlIIII1 = 8;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static final int f103IlIlllIIlI1 = 16;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public static final int f104IlIllIlllIllI1 = 32;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public static final int f105llllllIlIIIlll1 = 76;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static final byte f106IlIlIIlIII1 = 61;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public static final byte f107lIllIIIlIl1 = 10;

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final String f108IIlIllIIll1 = "US-ASCII";

    /* renamed from: IlIllll1, reason: collision with root package name */
    public static final byte f109IlIllll1 = -5;

    /* renamed from: llIIllIl1, reason: collision with root package name */
    public static final /* synthetic */ boolean f116llIIllIl1 = !llllIIIIll1.class.desiredAssertionStatus();

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public static final byte[] f110lllllIllIl1 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public static final byte[] f111IlIIlllllI1 = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public static final byte[] f112llIIIIlIlllIII1 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public static final byte[] f113lIllIlIll1 = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public static final byte[] f114IlIlIIIlIlIlll1 = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: IIIlIllIlI1, reason: collision with root package name */
    public static final byte[] f115IIIlIllIlI1 = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: IlIIIlIlIlIII1.llllIIIIll1$llllIIIIll1, reason: collision with other inner class name */
    /* loaded from: classes.jar:IlIIIlIlIlIII1/llllIIIIll1$llllIIIIll1.class */
    public static class C0001llllIIIIll1 extends FilterOutputStream {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public boolean f117llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public int f118lIIIIlllllIlll1;

        /* renamed from: llllIllIl1, reason: collision with root package name */
        public byte[] f119llllIllIl1;

        /* renamed from: IllIIlIIII1, reason: collision with root package name */
        public int f120IllIIlIIII1;

        /* renamed from: IlIlllIIlI1, reason: collision with root package name */
        public int f121IlIlllIIlI1;

        /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
        public boolean f122IlIllIlllIllI1;

        /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
        public byte[] f123llllllIlIIIlll1;

        /* renamed from: IlIlIIlIII1, reason: collision with root package name */
        public boolean f124IlIlIIlIII1;

        /* renamed from: lIllIIIlIl1, reason: collision with root package name */
        public int f125lIllIIIlIl1;

        /* renamed from: IIlIllIIll1, reason: collision with root package name */
        public byte[] f126IIlIllIIll1;

        public C0001llllIIIIll1(OutputStream outputStream) {
            this(outputStream, 1);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) throws IOException {
            if (this.f124IlIlIIlIII1) {
                ((FilterOutputStream) this).out.write(i);
                return;
            }
            if (!this.f117llllIIIIll1) {
                byte b = this.f126IIlIllIIll1[i & 127];
                if (b <= -5) {
                    if (b != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] byteArray = this.f119llllIllIl1;
                int i2 = this.f118lIIIIlllllIlll1;
                int i3 = i2 + 1;
                this.f118lIIIIlllllIlll1 = i3;
                byteArray[i2] = (byte) i;
                if (i3 >= this.f120IllIIlIIII1) {
                    ((FilterOutputStream) this).out.write(this.f123llllllIlIIIlll1, 0, llllIIIIll1.getClassLoader(byteArray, 0, this.f123llllllIlIIIlll1, 0, this.f125lIllIIIlIl1));
                    this.f118lIIIIlllllIlll1 = 0;
                    return;
                }
                return;
            }
            byte[] keyArray = this.f119llllIllIl1;
            int i4 = this.f118lIIIIlllllIlll1;
            int i5 = i4 + 1;
            this.f118lIIIIlllllIlll1 = i5;
            keyArray[i4] = (byte) i;
            int i6 = this.f120IllIIlIIII1;
            if (i5 >= i6) {
                ((FilterOutputStream) this).out.write(llllIIIIll1.decrypt(this.f123llllllIlIIIlll1, keyArray, i6, this.f125lIllIIIlIl1));
                int i7 = this.f121IlIlllIIlI1 + 4;
                this.f121IlIlllIIlI1 = i7;
                if (this.f122IlIllIlllIllI1 && i7 >= 76) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f121IlIlllIIlI1 = 0;
                }
                this.f118lIIIIlllllIlll1 = 0;
            }
        }

        public void isEnabled() throws IOException {
            int i = this.f118lIIIIlllllIlll1;
            if (i > 0) {
                if (!this.f117llllIIIIll1) {
                    throw new IOException("Base64 input not properly padded.");
                }
                ((FilterOutputStream) this).out.write(llllIIIIll1.decrypt(this.f123llllllIlIIIlll1, this.f119llllIllIl1, i, this.f125lIllIIIlIl1));
                this.f118lIIIIlllllIlll1 = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            isEnabled();
            super.close();
            this.f119llllIllIl1 = null;
            ((FilterOutputStream) this).out = null;
        }

        public C0001llllIIIIll1(OutputStream outputStream, int i) {
            super(outputStream);
            this.f122IlIllIlllIllI1 = (i & 8) != 0;
            boolean result = (i & 1) != 0;
            boolean z2 = result;
            this.f117llllIIIIll1 = result;
            int i2 = z2 ? 3 : 4;
            this.f120IllIIlIIII1 = i2;
            this.f119llllIllIl1 = new byte[i2];
            this.f118lIIIIlllllIlll1 = 0;
            this.f121IlIlllIIlI1 = 0;
            this.f124IlIlIIlIII1 = false;
            this.f123llllllIlIIIlll1 = new byte[4];
            this.f125lIllIIIlIl1 = i;
            this.f126IIlIllIIll1 = llllIIIIll1.getWebViewProvider(i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] byteArray, int i, int i2) throws IOException {
            if (this.f124IlIlIIlIII1) {
                ((FilterOutputStream) this).out.write(byteArray, i, i2);
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                write(byteArray[i + i3]);
            }
        }
    }

    public static final byte[] getClassLoader(int i) {
        return (i & 16) == 16 ? f112llIIIIlIlllIII1 : (i & 32) == 32 ? f114IlIlIIIlIlIlll1 : f110lllllIllIl1;
    }

    public static final byte[] getWebViewProvider(int i) {
        return (i & 16) == 16 ? f113lIllIlIll1 : (i & 32) == 32 ? f115IIIlIllIlI1 : f111IlIIlllllI1;
    }

    public static byte[] decrypt(byte[] byteArray, byte[] keyArray, int i, int i2) {
        decrypt(keyArray, 0, i, byteArray, 0, i2);
        return byteArray;
    }

    public static byte[] decrypt(byte[] byteArray, int i, int i2, byte[] keyArray, int i3, int i4) {
        byte[] lIIIIlllllIlll12 = getClassLoader(i4);
        int i5 = (i2 > 0 ? (byteArray[i] << 24) >>> 8 : 0) | (i2 > 1 ? (byteArray[i + 1] << 24) >>> 16 : 0) | (i2 > 2 ? (byteArray[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            keyArray[i3] = lIIIIlllllIlll12[i5 >>> 18];
            keyArray[i3 + 1] = lIIIIlllllIlll12[(i5 >>> 12) & 63];
            keyArray[i3 + 2] = 61;
            keyArray[i3 + 3] = 61;
            return keyArray;
        }
        if (i2 == 2) {
            keyArray[i3] = lIIIIlllllIlll12[i5 >>> 18];
            keyArray[i3 + 1] = lIIIIlllllIlll12[(i5 >>> 12) & 63];
            keyArray[i3 + 2] = lIIIIlllllIlll12[(i5 >>> 6) & 63];
            keyArray[i3 + 3] = 61;
            return keyArray;
        }
        if (i2 != 3) {
            return keyArray;
        }
        keyArray[i3] = lIIIIlllllIlll12[i5 >>> 18];
        keyArray[i3 + 1] = lIIIIlllllIlll12[(i5 >>> 12) & 63];
        keyArray[i3 + 2] = lIIIIlllllIlll12[(i5 >>> 6) & 63];
        keyArray[i3 + 3] = lIIIIlllllIlll12[i5 & 63];
        return keyArray;
    }

    public static byte[] getClassLoader(byte[] byteArray, byte[] keyArray, int i, int i2) {
        decrypt(keyArray, 0, i, byteArray, 0, i2);
        return byteArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.io.ByteArrayOutputStream, java.io.OutputStream, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v52, types: [IlIIIlIlIlIII1.llllIIIIll1$llllIIIIll1, java.io.OutputStream, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.io.OutputStream, java.lang.Throwable, java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.io.IOException] */
    public static byte[] getClassLoader(byte[] byteArray, int i, int i2, int i3) throws IOException {
        ?? byteArrayOutputStream;
        ?? c0001llllIIIIll1;
        ?? gZIPOutputStream;
        if (byteArray == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Cannot have negative offset: " + i);
        }
        if (i2 >= 0) {
            if (i + i2 > byteArray.length) {
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(byteArray.length)));
            }
            if ((i3 & 2) != 0) {
                ByteArrayOutputStream byteArrayOutputStream2 = null;
                OutputStream outputStream = null;
                AutoCloseable autoCloseable = null;
                try {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            c0001llllIIIIll1 = new C0001llllIIIIll1(byteArrayOutputStream, i3 | 1);
                            try {
                                gZIPOutputStream = new GZIPOutputStream(c0001llllIIIIll1);
                            } catch (IOException e) {
                                throw c0001llllIIIIll1;
                            } catch (Throwable th) {
                                th = th;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                autoCloseable = c0001llllIIIIll1;
                            }
                        } catch (IOException e2) {
                            throw byteArrayOutputStream;
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream2 = byteArrayOutputStream;
                        }
                    } catch (IOException unused) {
                        throw null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    gZIPOutputStream.write(byteArray, i, i2);
                    gZIPOutputStream.close();
                    try {
                        gZIPOutputStream.close();
                    } catch (Exception unused2) {
                    }
                    try {
                        c0001llllIIIIll1.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception unused4) {
                    }
                    return byteArrayOutputStream.toByteArray();
                } catch (IOException e3) {
                    autoCloseable = c0001llllIIIIll1;
                    outputStream = gZIPOutputStream;
                    byteArrayOutputStream2 = e3;
                    throw gZIPOutputStream;
                } catch (Throwable th4) {
                    th = th4;
                    byteArrayOutputStream2 = byteArrayOutputStream;
                    autoCloseable = c0001llllIIIIll1;
                    outputStream = gZIPOutputStream;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                    if (autoCloseable != null) {
                        try {
                            autoCloseable.close();
                        } catch (Exception unused6) {
                        }
                    }
                    if (byteArrayOutputStream2 != null) {
                        try {
                            byteArrayOutputStream2.close();
                        } catch (Exception unused7) {
                        }
                    }
                    throw th;
                }
            }
            boolean result = (i3 & 8) != 0;
            int i4 = ((i2 / 3) * 4) + (i2 % 3 > 0 ? 4 : 0);
            if (result) {
                i4 = (i4 / 76) + i4;
            }
            byte[] keyArray = new byte[i4];
            int i5 = 0;
            int i6 = 0;
            int i7 = i2 - 2;
            int i8 = 0;
            while (i5 < i7) {
                boolean z2 = result;
                decrypt(byteArray, i5 + i, 3, keyArray, i6, i3);
                i8 += 4;
                if (z2 && i8 >= 76) {
                    keyArray[i6 + 4] = 10;
                    i6++;
                    i8 = 0;
                }
                i5 += 3;
                i6 += 4;
            }
            if (i5 < i2) {
                decrypt(byteArray, i5 + i, i2 - i5, keyArray, i6, i3);
                i6 += 4;
            }
            if (i6 > i4 - 1) {
                return keyArray;
            }
            byte[] encryptedData = new byte[i6];
            System.arraycopy(keyArray, 0, encryptedData, 0, i6);
            return encryptedData;
        }
        throw new IllegalArgumentException("Cannot have length offset: " + i2);
    }

    public static String decrypt(byte[] byteArray) {
        String message = null;
        try {
            message = decrypt(byteArray, 0, byteArray.length, 0);
        } catch (IOException e) {
            if (!f116llIIllIl1) {
                throw new AssertionError(e.getMessage());
            }
        }
        if (f116llIIllIl1 || message != null) {
            return message;
        }
        throw new AssertionError();
    }

    public static String decrypt(byte[] byteArray, int i, int i2, int i3) throws IOException {
        byte[] lIIIIlllllIlll12 = getClassLoader(byteArray, i, i2, i3);
        try {
            return new String(lIIIIlllllIlll12, f108IIlIllIIll1);
        } catch (UnsupportedEncodingException unused) {
            return new String(lIIIIlllllIlll12);
        }
    }

    public static int getClassLoader(byte[] byteArray, int i, byte[] keyArray, int i2, int i3) {
        int i4;
        int i5;
        if (byteArray == null) {
            throw new IllegalArgumentException("Source array was null.");
        }
        if (keyArray != null) {
            if (i >= 0 && (i4 = i + 3) < byteArray.length) {
                if (i2 >= 0 && (i5 = i2 + 2) < keyArray.length) {
                    byte[] llllIllIl12 = getWebViewProvider(i3);
                    byte b = byteArray[i + 2];
                    if (b == 61) {
                        keyArray[i2] = (byte) ((((llllIllIl12[byteArray[i]] & 255) << 18) | ((llllIllIl12[byteArray[i + 1]] & 255) << 12)) >>> 16);
                        return 1;
                    }
                    byte b2 = byteArray[i4];
                    if (b2 == 61) {
                        int i6 = ((llllIllIl12[byteArray[i]] & 255) << 18) | ((llllIllIl12[byteArray[i + 1]] & 255) << 12) | ((llllIllIl12[b] & 255) << 6);
                        keyArray[i2] = (byte) (i6 >>> 16);
                        keyArray[i2 + 1] = (byte) (i6 >>> 8);
                        return 2;
                    }
                    int i7 = ((llllIllIl12[byteArray[i]] & 255) << 18) | ((llllIllIl12[byteArray[i + 1]] & 255) << 12) | ((llllIllIl12[b] & 255) << 6) | (llllIllIl12[b2] & 255);
                    keyArray[i2] = (byte) (i7 >> 16);
                    keyArray[i2 + 1] = (byte) (i7 >> 8);
                    keyArray[i5] = (byte) i7;
                    return 3;
                }
                throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(keyArray.length), Integer.valueOf(i2)));
            }
            throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(byteArray.length), Integer.valueOf(i)));
        }
        throw new IllegalArgumentException("Destination array was null.");
    }
}
