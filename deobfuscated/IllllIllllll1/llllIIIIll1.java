/**
 * 反混淆的Java类
 * 原始包名: IllllIllllll1
 * 原始类名: llllIIIIll1
 * 反混淆后: com.obfuscated.websocket.extensions.Helper
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.websocket.extensions;

import com.obfuscated.frame.Frame;
import com.obfuscated.frame.DataHandler;
import com.obfuscated.frame.Constants;
import com.obfuscated.frame.ByteBuffer;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import com.obfuscated.websocket.StringDecryptor;
import com.obfuscated.websocket.Exception;

/* loaded from: classes.jar:IllllIllllll1/llllIIIIll1.class */
public class Helper extends lIIlllIIIlllII1.llllIIIIll1 {

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static final String IlIlIIlIII1 = "permessage-deflate";

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public static final String lIllIIIlIl1 = "server_no_context_takeover";

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final String IIlIllIIll1 = "client_no_context_takeover";

    /* renamed from: IlIllll1, reason: collision with root package name */
    public static final String IlIllll1 = "server_max_window_bits";

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public static final String lllllIllIl1 = "client_max_window_bits";

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public static final int IlIIlllllI1 = 32768;

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public static final int llIIIIlIlllIII1 = 32768;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public static final byte[] lIllIlIll1 = {0, 0, -1, -1};

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public static final int IlIlIIIlIlIlll1 = 1024;

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public int helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public boolean constants;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public boolean llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public Map<String, String> IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public final int dataHandler;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public final Inflater IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public final Deflater llllllIlIIIlll1;

    public llllIIIIll1() {
        this(-1);
    }

    public int IlIlllIIlI1() {
        return this.dataHandler;
    }

    public int IlIllIlllIllI1() {
        return this.helper;
    }

    public void llllIIIIll1(int i) {
        this.helper = i;
    }

    public boolean IlIlIIlIII1() {
        return this.constants;
    }

    public void lIIIIlllllIlll1(boolean z) {
        this.constants = z;
    }

    public boolean llllllIlIIIlll1() {
        return this.llllIllIl1;
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public String llllIllIl1() {
        return "permessage-deflate; server_no_context_takeover".concat(this.llllIllIl1 ? "; client_no_context_takeover" : llllIllIl1.f377llllIllIl1);
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public String toString() {
        return "PerMessageDeflateExtension";
    }

    public llllIIIIll1(int i) {
        this.helper = IlIlIIIlIlIlll1;
        this.constants = true;
        this.llllIllIl1 = false;
        this.IllIIlIIII1 = new LinkedHashMap();
        this.dataHandler = i;
        this.llllllIlIIIlll1 = new Deflater(i, true);
        this.IlIllIlllIllI1 = new Inflater(true);
    }

    public void llllIIIIll1(boolean z) {
        this.llllIllIl1 = z;
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public void lIIIIlllllIlll1(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
        if (ilIllIlllIllI1 instanceof IlIlllIIlI1) {
            if (ilIllIlllIllI1.IlIlllIIlI1() || ilIllIlllIllI1.llllIIIIll1() == lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS) {
                if (ilIllIlllIllI1.llllIIIIll1() == lIIlIIIIlIlII1.llllIllIl1.CONTINUOUS && ilIllIlllIllI1.IlIlllIIlI1()) {
                    throw new IllIlIllll1.llllIllIl1(lIIIIlllllIlll1.f74IIIlIllIlI1, "RSV1 bit can only be set for the first frame.");
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    llllIIIIll1(ilIllIlllIllI1.llllIllIl1().array(), byteArrayOutputStream);
                    if (this.IlIllIlllIllI1.getRemaining() > 0) {
                        this.IlIllIlllIllI1.reset();
                        llllIIIIll1(ilIllIlllIllI1.llllIllIl1().array(), byteArrayOutputStream);
                    }
                    if (ilIllIlllIllI1.llllllIlIIIlll1()) {
                        llllIIIIll1(lIllIlIll1, byteArrayOutputStream);
                        if (this.llllIllIl1) {
                            this.IlIllIlllIllI1.reset();
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
    public void llllIllIl1(IlIllIlllIllI1 ilIllIlllIllI1) throws IllIlIllll1.llllIllIl1 {
        if ((ilIllIlllIllI1 instanceof IlIIIIllllIlI1.llllIllIl1) && (ilIllIlllIllI1.IlIlllIIlI1() || ilIllIlllIllI1.lIIIIlllllIlll1() || ilIllIlllIllI1.IlIllIlllIllI1())) {
            throw new IllIlIllll1.IlIlllIIlI1("bad rsv RSV1: " + ilIllIlllIllI1.IlIlllIIlI1() + " RSV2: " + ilIllIlllIllI1.lIIIIlllllIlll1() + " RSV3: " + ilIllIlllIllI1.IlIllIlllIllI1());
        }
        super.llllIllIl1(ilIllIlllIllI1);
    }

    public final void llllIIIIll1(byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) throws DataFormatException {
        this.IlIllIlllIllI1.setInput(bArr);
        byte[] bArr2 = new byte[IlIlIIIlIlIlll1];
        while (true) {
            int inflate = this.IlIllIlllIllI1.inflate(bArr2);
            if (inflate <= 0) {
                return;
            } else {
                byteArrayOutputStream.write(bArr2, 0, inflate);
            }
        }
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public void llllIIIIll1(IlIllIlllIllI1 ilIllIlllIllI1) {
        if (ilIllIlllIllI1 instanceof IlIlllIIlI1) {
            byte[] array = ilIllIlllIllI1.llllIllIl1().array();
            if (array.length < this.helper) {
                return;
            }
            if (!(ilIllIlllIllI1 instanceof IlIIIIllllIlI1.llllIllIl1)) {
                ((IlIlllIIlI1) ilIllIlllIllI1).lIIIIlllllIlll1(true);
            }
            this.llllllIlIIIlll1.setInput(array);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[IlIlIIIlIlIlll1];
            while (true) {
                int deflate = this.llllllIlIIIlll1.deflate(bArr, 0, IlIlIIIlIlIlll1, 2);
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
                    length -= lIllIlIll1.length;
                }
                if (this.constants) {
                    this.llllllIlIIIlll1.reset();
                }
            }
            ((llllllIlIIIlll1) ilIllIlllIllI1).llllIIIIll1(ByteBuffer.wrap(byteArray, 0, length));
        }
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public boolean lIIIIlllllIlll1(String str) {
        for (String str2 : str.split(",")) {
            if (IlIlIIlIII1.equalsIgnoreCase(llllIllIl1.llllIIIIll1(str2).f379lIIIIlllllIlll1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean llllIIIIll1(byte[] bArr) {
        if (bArr.length < 4) {
            return false;
        }
        int length = bArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            byte[] bArr2 = lIllIlIll1;
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
    public String lIIIIlllllIlll1() {
        this.IllIIlIIII1.put(IIlIllIIll1, llllIllIl1.f377llllIllIl1);
        this.IllIIlIIII1.put(lIllIIIlIl1, llllIllIl1.f377llllIllIl1);
        return "permessage-deflate; server_no_context_takeover; client_no_context_takeover";
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public boolean llllIIIIll1(String str) {
        for (String str2 : str.split(",")) {
            llllIllIl1 llllIIIIll12 = llllIllIl1.llllIIIIll1(str2);
            if (IlIlIIlIII1.equalsIgnoreCase(llllIIIIll12.f379lIIIIlllllIlll1)) {
                this.IllIIlIIII1.putAll(llllIIIIll12.f378llllIIIIll1);
                if (!this.IllIIlIIII1.containsKey(IIlIllIIll1)) {
                    return true;
                }
                this.llllIllIl1 = true;
                return true;
            }
        }
        return false;
    }

    @Override // lIIlllIIIlllII1.lIIIIlllllIlll1, lIIlllIIIlllII1.IllIIlIIII1
    public IllIIlIIII1 llllIIIIll1() {
        llllIIIIll1 lllliiiill1 = new llllIIIIll1(IlIlllIIlI1());
        lllliiiill1.helper = IlIllIlllIllI1();
        lllliiiill1.llllIllIl1 = llllllIlIIIlll1();
        lllliiiill1.constants = IlIlIIlIII1();
        return lllliiiill1;
    }
}
