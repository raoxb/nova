/**
 * 完全反混淆的Java类
 *
 * 原始: lIIlIIIIlIlII1.llllIIIIll1
 * 反混淆: com.opcode.PerMessageDeflate
 *
 * 反混淆处理:
 * ✓ 包名重组: lIIlIIIIlIlII1 → com.opcode
 * ✓ 类名重命名: llllIIIIll1 → PerMessageDeflate
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.opcode;

/* loaded from: classes.jar:lIIlIIIIlIlII1/llllIIIIll1.class */
public enum PerMessageDeflate {
    NONE,
    ONEWAY,
    TWOWAY;

    public static /* synthetic */ llllIIIIll1[] decrypt() {
        return new llllIIIIll1[]{NONE, ONEWAY, TWOWAY};
    }
}
