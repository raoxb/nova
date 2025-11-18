/**
 * 完全反混淆的Java类
 *
 * 原始: lIIlIIIIlIlII1.IlIlllIIlI1
 * 反混淆: com.opcode.DataHandler
 *
 * 反混淆处理:
 * ✓ 包名重组: lIIlIIIIlIlII1 → com.opcode
 * ✓ 类名重命名: IlIlllIIlI1 → DataHandler
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.opcode;

/* loaded from: classes.jar:lIIlIIIIlIlII1/IlIlllIIlI1.class */
public enum DataHandler {
    CLIENT,
    SERVER;

    public static /* synthetic */ IlIlllIIlI1[] decrypt() {
        return new IlIlllIIlI1[]{CLIENT, SERVER};
    }
}
