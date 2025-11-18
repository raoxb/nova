/**
 * 深度反混淆的Java类
 * 原始类: IllllIllllll1.llllIIIIll1
 *
 * 反混淆处理:
 * - 解密字符串常量
 * - 推断方法语义化名称
 * - 简化代码结构
 * - 添加功能注释
 */

package IllllIllllll1;

import IlIIIIllllIlI1.IlIllIlllIllI1;
import IlIIIIllllIlI1.IlIlllIIlI1;
import IlIIIIllllIlI1.lIIIIlllllIlll1;
import IlIIIIllllIlI1.llllllIlIIIlll1;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import lIIlllIIIlllII1.IllIIlIIII1;
import lIIlllIIIlllII1.llllIllIl1;

/**
 * WebSocket压缩扩展
 * 实现permessage-deflate协议
 * 用于压缩WebSocket消息帧
 */
public class llllIIIIll1 extends lIIlllIIIlllII1.llllIIIIll1 {

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static final String f310IlIlIIlIII1 = "permessage-deflate";

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public static final String f311lIllIIIlIl1 = "server_no_context_takeover";

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final String f312IIlIllIIll1 = "client_no_context_takeover";

    /* renamed from: IlIllll1, reason: collision with root package name */
    public static final String f313IlIllll1 = "server_max_window_bits";

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public static final String f314lllllIllIl1 = "client_max_window_bits";

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public static final int f315IlIIlllllI1 = 32768;

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public static final int f316llIIIIlIlllIII1 = 32768;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public static final byte[] f317lIllIlIll1 = {0, 0, -1, -1};

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public static final int f318IlIlIIIlIlIlll1 = 1024;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public int f319llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public boolean f320lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public boolean f321llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public Map<String, String> f322IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final int f323IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final Inflater inflater;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final Deflater deflater;

    public method_llllIIIIll1() {
        this(-1);
    }

    public int method_IlIlllIIlI1() {
        return this.f323IlIlllIIlI1;
    }

    public int method_IlIllIlllIllI1() {
        return this.f319llllIIIIll1;
    }

    public void method_llllIIIIll1(int i) {
        this.f319llllIIIIll1 = i;
    }

    public boolean isIliliiliii1() {
        return this.f320lIIIIlllllIlll1;
    }

    public void method_lIIIIlllllIlll1(boolean z) {
        this.f320lIIIIlllllIlll1 = z;
    }

    public boolean isLllllliliiilll1() {
        return this.f321llllIllIl1;
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public String method_llllIllIl1() {
        return "permessage-deflate; server_no_context_takeover".concat(this.f321llllIllIl1 ? "; client_no_context_takeover" : llllIllIl1.f377llllIllIl1);
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public String toString() {
        return "PerMessageDeflateExtension";
    }

    public method_llllIIIIll1(int i) {
        this.f319llllIIIIll1 = f318IlIlIIIlIlIlll1;
        this.f320lIIIIlllllIlll1 = true;
        this.f321llllIllIl1 = false;
        this.f322IllIIlIIII1 = new LinkedHashMap();
        this.f323IlIlllIIlI1 = i;
        this.deflater = new Deflater(i, true);
        this.inflater = new Inflater(true);
    }

    public void method_llllIIIIll1(boolean z) {
        this.f321llllIllIl1 = z;
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public void method_lIIIIlllllIlll1(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
        if (ilIllIlllIllI1 instanceof IlIlllIIlI1) {
            if (ilIllIlllIllI1.IlIlllIIlI1() || ilIllIlllIllI1.llllIIIIll1() == lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS) {
                if (ilIllIlllIllI1.llllIIIIll1() == lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS && ilIllIlllIllI1.IlIlllIIlI1()) {
                    throw new IllIlIllll1.llllIllIl1(lIIIIlllllIlll1.f74IIIlIllIlI1, "RSV1 bit can only be set for the first frame.");
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    llllIIIIll1(ilIllIlllIllI1.llllIllIl1().array(), byteArrayOutputStream);
                    if (this.inflater.getRemaining() > 0) {
                        this.inflater.reset();
                        llllIIIIll1(ilIllIlllIllI1.llllIllIl1().array(), byteArrayOutputStream);
                    }
                    if (ilIllIlllIllI1.llllllIlIIIlll1()) {
                        llllIIIIll1(f317lIllIlIll1, byteArrayOutputStream);
                        if (this.f321llllIllIl1) {
                            this.inflater.reset();
                        }
                    }
                    ((llllllIlIIIlll1) ilIllIlllIllI1).llllIIIIll1(ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size()));
                } catch (DataFormatException e) {
                    throw new IllIlIllll1.llllIllIl1(lIIIIlllllIlll1.f74IIIlIllIlI1, e.getMessage());
                }
            }
        }
    }

    @Override // lIIlllIIIlllII1.llllIIIIll1, lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public void method_llllIllIl1(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
        if ((ilIllIlllIllI1 instanceof IlIIIIllllIlI1.llllIllIl1) && (ilIllIlllIllI1.IlIlllIIlI1() || ilIllIlllIllI1.lIIIIlllllIlll1() || ilIllIlllIllI1.IlIllIlllIllI1())) {
            throw new IllIlIllll1.IlIlllIIlI1("bad rsv RSV1: " + ilIllIlllIllI1.IlIlllIIlI1() + " RSV2: " + ilIllIlllIllI1.lIIIIlllllIlll1() + " RSV3: " + ilIllIlllIllI1.IlIllIlllIllI1());
        }
        super.llllIllIl1(ilIllIlllIllI1);
    }

    public final void method_llllIIIIll1(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) throws DataFormatException {
        this.inflater.setInput(bArr);
        byte[] bArr2 = new byte[f318IlIlIIIlIlIlll1];
        while (true) {
            int inflate = this.inflater.inflate(bArr2);
            if (inflate <= 0) {
                return;
            } else {
                byteArrayOutputStream.write(bArr2, 0, inflate);
            }
        }
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public void method_llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1) {
        if (ilIllIlllIllI1 instanceof IlIlllIIlI1) {
            byte[] array = ilIllIlllIllI1.llllIllIl1().array();
            if (array.length < this.f319llllIIIIll1) {
                return;
            }
            if (!(ilIllIlllIllI1 instanceof IlIIIIllllIlI1.llllIllIl1)) {
                ((IlIlllIIlI1) ilIllIlllIllI1).lIIIIlllllIlll1(true);
            }
            this.deflater.setInput(array);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[f318IlIlIIIlIlIlll1];
            while (true) {
                int deflate = this.deflater.deflate(bArr, 0, f318IlIlIIIlIlIlll1, 2);
                if (deflate <= 0) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, deflate);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            if (ilIllIlllIllI1.llllllIlIIIlll1()) {
                if (llllIIIIll1(byteArray)) {
                    length -= f317lIllIlIll1.length;
                }
                if (this.f320lIIIIlllllIlll1) {
                    this.deflater.reset();
                }
            }
            ((llllllIlIIIlll1) ilIllIlllIllI1).llllIIIIll1(ByteBuffer.wrap(byteArray, 0, length));
        }
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public boolean isLiiiilllllilll1(String str) {
        for (String str2 : str.split(",")) {
            if (f310IlIlIIlIII1.equalsIgnoreCase(llllIllIl1.llllIIIIll1(str2).f379lIIIIlllllIlll1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLllliiiill1(byte[] bArr) {
        if (bArr.length < 4) {
            return false;
        }
        int length = bArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            byte[] bArr2 = f317lIllIlIll1;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr2[i] != bArr[(length - bArr2.length) + i]) {
                return false;
            }
            i++;
        }
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public String method_lIIIIlllllIlll1() {
        this.f322IllIIlIIII1.put(f312IIlIllIIll1, llllIllIl1.f377llllIllIl1);
        this.f322IllIIlIIII1.put(f311lIllIIIlIl1, llllIllIl1.f377llllIllIl1);
        return "permessage-deflate; server_no_context_takeover; client_no_context_takeover";
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public boolean isLllliiiill1(String str) {
        for (String str2 : str.split(",")) {
            llllIllIl1 llllIIIIll12 = llllIllIl1.llllIIIIll1(str2);
            if (f310IlIlIIlIII1.equalsIgnoreCase(llllIIIIll12.f379lIIIIlllllIlll1)) {
                this.f322IllIIlIIII1.putAll(llllIIIIll12.f378llllIIIIll1);
                if (!this.f322IllIIlIIII1.containsKey(f312IIlIllIIll1)) {
                    return true;
                }
                this.f321llllIllIl1 = true;
                return true;
            }
        }
        return false;
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public IllIIlIIII1 method_llllIIIIll1() {
        llllIIIIll1 lllliiiill1 = new llllIIIIll1(IlIlllIIlI1());
        lllliiiill1.f319llllIIIIll1 = IlIllIlllIllI1();
        lllliiiill1.f321llllIllIl1 = llllllIlIIIlll1();
        lllliiiill1.f320lIIIIlllllIlll1 = IlIlIIlIII1();
        return lllliiiill1;
    }
}
