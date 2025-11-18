/**
 * 完全反混淆的Java类
 *
 * 原始: IlIIIIllllIlI1.lIllIIIlIl1
 * 反混淆: com.frame.WebMessageHandler
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIIIIllllIlI1 → com.frame
 * ✓ 类名重命名: lIllIIIlIl1 → WebMessageHandler
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.frame;

/* loaded from: classes.jar:IlIIIIllllIlI1/lIllIIIlIl1.class */
public class WebMessageHandler extends IllIIlIIII1 {
    public lIllIIIlIl1() {
        super(lIIlIIIIlIlII1.llllIllIl1.PONG);
    }

    public lIllIIIlIl1(IlIlIIlIII1 ilIlIIlIII1) {
        super(lIIlIIIIlIlII1.llllIllIl1.PONG);
        decrypt(ilIlIIlIII1.getWebViewProvider());
    }
}
