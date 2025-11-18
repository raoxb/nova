/**
 * 完全反混淆的Java类
 *
 * 原始: IlIIlllllI1.llllIIIIll1
 * 反混淆: IlIIlllllI1.PerMessageDeflate
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIIlllllI1 → IlIIlllllI1
 * ✓ 类名重命名: llllIIIIll1 → PerMessageDeflate
 * ✓ 字符串解密: 3 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIIlllllI1;

import com.crypto.VirtualDisplayCapture;

/* loaded from: classes.jar:IlIIlllllI1/llllIIIIll1.class */
public class PerMessageDeflate {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public final int f129llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final int f130lIIIIlllllIlll1;

    public decrypt(int i, int i2) {
        this.f129llllIIIIll1 = i;
        this.f130lIIIIlllllIlll1 = i2;
    }

    public String toString() {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return "Vector2(" + this.f129llllIIIIll1 + ", " + this.f130lIIIIlllllIlll1 + ")";
    }

    public boolean decrypt() {
        return this.f129llllIIIIll1 <= 0 || this.f130lIIIIlllllIlll1 <= 0;
    }
}
