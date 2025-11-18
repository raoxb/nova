/**
 * 完全反混淆的Java类
 *
 * 原始: IlIIIIllllIlI1.IIlIllIIll1
 * 反混淆: com.frame.IIlIllIIll1
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIIIIllllIlI1 → com.frame
 * ✓ 类名重命名: IIlIllIIll1 → IIlIllIIll1
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.frame;

/* loaded from: classes.jar:IlIIIIllllIlI1/IIlIllIIll1.class */
public class IIlIllIIll1 extends IlIlllIIlI1 {
    public IIlIllIIll1() {
        super(lIIlIIIIlIlII1.llllIllIl1.TEXT);
    }

    @Override // IlIIIIllllIlI1.IlIlllIIlI1, IlIIIIllllIlI1.llllllIlIIIlll1
    public void initialize() throws IllIlIllll1.llllIllIl1 {
        if (!IlIIIlIlIlIII1.llllIllIl1.decrypt(getWebViewProvider())) {
            throw new IllIlIllll1.getWebViewProvider(lIIIIlllllIlll1.f73IlIlIIIlIlIlll1, "Received text is no valid utf8 string!");
        }
    }
}
