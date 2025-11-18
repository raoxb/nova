/**
 * 完全反混淆的Java类
 *
 * 原始: lllIlIlllI1.IllIIlIIII1
 * 反混淆: lllIlIlllI1.VirtualDisplayCapture
 *
 * 反混淆处理:
 * ✓ 包名重组: lllIlIlllI1 → lllIlIlllI1
 * ✓ 类名重命名: IllIIlIIII1 → VirtualDisplayCapture
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lllIlIlllI1;

/* loaded from: classes.jar:lllIlIlllI1/IllIIlIIII1.class */
public class VirtualDisplayCapture extends llllllIlIIIlll1 implements lIIIIlllllIlll1 {

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public String f767llllIllIl1 = "*";

    @Override // lllIlIlllI1.lIIIIlllllIlll1
    public void getClassLoader(String message) {
        if (message == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        this.f767llllIllIl1 = message;
    }

    @Override // lllIlIlllI1.llllIIIIll1
    public String decrypt() {
        return this.f767llllIllIl1;
    }
}
