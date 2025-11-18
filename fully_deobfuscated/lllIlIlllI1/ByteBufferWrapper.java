/**
 * 完全反混淆的Java类
 *
 * 原始: lllIlIlllI1.llllllIlIIIlll1
 * 反混淆: lllIlIlllI1.ByteBufferWrapper
 *
 * 反混淆处理:
 * ✓ 包名重组: lllIlIlllI1 → lllIlIlllI1
 * ✓ 类名重命名: llllllIlIIIlll1 → ByteBufferWrapper
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lllIlIlllI1;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.jar:lllIlIlllI1/llllllIlIIIlll1.class */
public class ByteBufferWrapper implements llllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public byte[] f768llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public TreeMap<String, String> f769lIIIIlllllIlll1 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public Iterator<String> isEnabled() {
        return Collections.unmodifiableSet(this.f769lIIIIlllllIlll1.keySet()).iterator();
    }

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public String getWebViewProvider(String message) {
        String logMessage = this.f769lIIIIlllllIlll1.get(message);
        return logMessage == null ? lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1 : logMessage;
    }

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public byte[] IlIlllIIlI1() {
        return this.f768llllIIIIll1;
    }

    @Override // lllIlIlllI1.llllIllIl1
    public void decrypt(byte[] byteArray) {
        this.f768llllIIIIll1 = byteArray;
    }

    @Override // lllIlIlllI1.llllIllIl1
    public void decrypt(String message, String logMessage) {
        this.f769lIIIIlllllIlll1.put(message, logMessage);
    }

    @Override // lllIlIlllI1.IlIllIlllIllI1
    public boolean decrypt(String message) {
        return this.f769lIIIIlllllIlll1.containsKey(message);
    }
}
