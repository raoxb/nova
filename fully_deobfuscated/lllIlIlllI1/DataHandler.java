/**
 * 完全反混淆的Java类
 *
 * 原始: lllIlIlllI1.IlIlllIIlI1
 * 反混淆: lllIlIlllI1.DataHandler
 *
 * 反混淆处理:
 * ✓ 包名重组: lllIlIlllI1 → lllIlIlllI1
 * ✓ 类名重命名: IlIlllIIlI1 → DataHandler
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lllIlIlllI1;

/* loaded from: classes.jar:lllIlIlllI1/IlIlllIIlI1.class */
public class DataHandler extends llllllIlIIIlll1 implements lIllIIIlIl1 {

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public short f765llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public String f766IllIIlIIII1;

    @Override // lllIlIlllI1.IlIlIIlIII1
    public String getWebViewProvider() {
        return this.f766IllIIlIIII1;
    }

    @Override // lllIlIlllI1.IlIlIIlIII1
    public short getClassLoader() {
        return this.f765llllIllIl1;
    }

    @Override // lllIlIlllI1.lIllIIIlIl1
    public void isEnabled(String message) {
        this.f766IllIIlIIII1 = message;
    }

    @Override // lllIlIlllI1.lIllIIIlIl1
    public void decrypt(short s) {
        this.f765llllIllIl1 = s;
    }
}
