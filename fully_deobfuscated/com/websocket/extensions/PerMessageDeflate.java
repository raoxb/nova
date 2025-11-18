/**
 * 完全反混淆的Java类
 *
 * 原始: IllllIllllll1.llllIIIIll1
 * 反混淆: com.websocket.extensions.PerMessageDeflate
 *
 * 反混淆处理:
 * ✓ 包名重组: IllllIllllll1 → com.websocket.extensions
 * ✓ 类名重命名: llllIIIIll1 → PerMessageDeflate
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.websocket.extensions;

import com.frame.Frame;
import com.frame.DataHandler;
import com.frame.Constants;
import com.frame.ByteBufferWrapper;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import com.websocket.VirtualDisplayCapture;
import com.websocket.DeobfuscationException;

/* loaded from: classes.jar:IllllIllllll1/llllIIIIll1.class */
public class PerMessageDeflate extends lIIlllIIIlllII1.llllIIIIll1 {

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
    public final Inflater f324IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final Deflater f325llllllIlIIIlll1;

    public decrypt() {
        this(-1);
    }

    public int IlIlllIIlI1() {
        return this.f323IlIlllIIlI1;
    }

    public int IlIllIlllIllI1() {
        return this.f319llllIIIIll1;
    }

    public void decrypt(int i) {
        this.f319llllIIIIll1 = i;
    }

    public boolean initialize() {
        return this.f320lIIIIlllllIlll1;
    }

    public void getClassLoader(boolean result) {
        this.f320lIIIIlllllIlll1 = result;
    }

    public boolean llllllIlIIIlll1() {
        return this.f321llllIllIl1;
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public String getWebViewProvider() {
        return "permessage-deflate; server_no_context_takeover".concat(this.f321llllIllIl1 ? "; client_no_context_takeover" : llllIllIl1.f377llllIllIl1);
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public String toString() {
        return "PerMessageDeflateExtension";
    }

    public decrypt(int i) {
        this.f319llllIIIIll1 = f318IlIlIIIlIlIlll1;
        this.f320lIIIIlllllIlll1 = true;
        this.f321llllIllIl1 = false;
        this.f322IllIIlIIII1 = new LinkedHashMap();
        this.f323IlIlllIIlI1 = i;
        this.f325llllllIlIIIlll1 = new Deflater(i, true);
        this.f324IlIllIlllIllI1 = new Inflater(true);
    }

    public void decrypt(boolean result) {
        this.f321llllIllIl1 = result;
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public void getClassLoader(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
        if (ilIllIlllIllI1 instanceof IlIlllIIlI1) {
            if (ilIllIlllIllI1.IlIlllIIlI1() || ilIllIlllIllI1.decrypt() == lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS) {
                if (ilIllIlllIllI1.decrypt() == lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS && ilIllIlllIllI1.IlIlllIIlI1()) {
                    throw new IllIlIllll1.getWebViewProvider(lIIIIlllllIlll1.f74IIIlIllIlI1, "RSV1 bit can only be set for the first frame.");
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    decrypt(ilIllIlllIllI1.getWebViewProvider().array(), byteArrayOutputStream);
                    if (this.f324IlIllIlllIllI1.getRemaining() > 0) {
                        this.f324IlIllIlllIllI1.reset();
                        decrypt(ilIllIlllIllI1.getWebViewProvider().array(), byteArrayOutputStream);
                    }
                    if (ilIllIlllIllI1.llllllIlIIIlll1()) {
                        decrypt(f317lIllIlIll1, byteArrayOutputStream);
                        if (this.f321llllIllIl1) {
                            this.f324IlIllIlllIllI1.reset();
                        }
                    }
                    ((llllllIlIIIlll1) ilIllIlllIllI1).decrypt(ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size()));
                } catch (DataFormatException e) {
                    throw new IllIlIllll1.getWebViewProvider(lIIIIlllllIlll1.f74IIIlIllIlI1, e.getMessage());
                }
            }
        }
    }

    @Override // lIIlllIIIlllII1.llllIIIIll1, lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public void getWebViewProvider(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
        if ((ilIllIlllIllI1 instanceof IlIIIIllllIlI1.llllIllIl1) && (ilIllIlllIllI1.IlIlllIIlI1() || ilIllIlllIllI1.getClassLoader() || ilIllIlllIllI1.IlIllIlllIllI1())) {
            throw new IllIlIllll1.IlIlllIIlI1("bad rsv RSV1: " + ilIllIlllIllI1.IlIlllIIlI1() + " RSV2: " + ilIllIlllIllI1.getClassLoader() + " RSV3: " + ilIllIlllIllI1.IlIllIlllIllI1());
        }
        super.getWebViewProvider(ilIllIlllIllI1);
    }

    public final void decrypt(byte[] byteArray, ByteArrayOutputStream byteArrayOutputStream) throws DataFormatException {
        this.f324IlIllIlllIllI1.setInput(byteArray);
        byte[] keyArray = new byte[f318IlIlIIIlIlIlll1];
        while (true) {
            int inflate = this.f324IlIllIlllIllI1.inflate(keyArray);
            if (inflate <= 0) {
                return;
            } else {
                byteArrayOutputStream.write(keyArray, 0, inflate);
            }
        }
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public void decrypt(IlIllIlllIllI1 ilIllIlllIllI1) {
        if (ilIllIlllIllI1 instanceof IlIlllIIlI1) {
            byte[] array = ilIllIlllIllI1.getWebViewProvider().array();
            if (array.length < this.f319llllIIIIll1) {
                return;
            }
            if (!(ilIllIlllIllI1 instanceof IlIIIIllllIlI1.llllIllIl1)) {
                ((IlIlllIIlI1) ilIllIlllIllI1).getClassLoader(true);
            }
            this.f325llllllIlIIIlll1.setInput(array);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] byteArray = new byte[f318IlIlIIIlIlIlll1];
            while (true) {
                int deflate = this.f325llllllIlIIIlll1.deflate(byteArray, 0, f318IlIlIIIlIlIlll1, 2);
                if (deflate <= 0) {
                    break;
                } else {
                    byteArrayOutputStream.write(byteArray, 0, deflate);
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int length = byteArray.length;
            if (ilIllIlllIllI1.llllllIlIIIlll1()) {
                if (decrypt(byteArray)) {
                    length -= f317lIllIlIll1.length;
                }
                if (this.f320lIIIIlllllIlll1) {
                    this.f325llllllIlIIIlll1.reset();
                }
            }
            ((llllllIlIIIlll1) ilIllIlllIllI1).decrypt(ByteBuffer.wrap(byteArray, 0, length));
        }
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public boolean getClassLoader(String message) {
        for (String logMessage : message.split(",")) {
            if (f310IlIlIIlIII1.equalsIgnoreCase(llllIllIl1.decrypt(logMessage).f379lIIIIlllllIlll1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean decrypt(byte[] byteArray) {
        if (byteArray.length < 4) {
            return false;
        }
        int length = byteArray.length;
        int i = 0;
        while (true) {
            int i2 = i;
            byte[] keyArray = f317lIllIlIll1;
            if (i2 >= keyArray.length) {
                return true;
            }
            if (keyArray[i] != byteArray[(length - keyArray.length) + i]) {
                return false;
            }
            i++;
        }
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public String getClassLoader() {
        this.f322IllIIlIIII1.put(f312IIlIllIIll1, llllIllIl1.f377llllIllIl1);
        this.f322IllIIlIIII1.put(f311lIllIIIlIl1, llllIllIl1.f377llllIllIl1);
        return "permessage-deflate; server_no_context_takeover; client_no_context_takeover";
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public boolean decrypt(String message) {
        for (String logMessage : message.split(",")) {
            llllIllIl1 llllIIIIll12 = llllIllIl1.decrypt(logMessage);
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
    public IllIIlIIII1 decrypt() {
        llllIIIIll1 lllliiiill1 = new decrypt(IlIlllIIlI1());
        lllliiiill1.f319llllIIIIll1 = IlIllIlllIllI1();
        lllliiiill1.f321llllIllIl1 = llllllIlIIIlll1();
        lllliiiill1.f320lIIIIlllllIlll1 = initialize();
        return lllliiiill1;
    }
}
