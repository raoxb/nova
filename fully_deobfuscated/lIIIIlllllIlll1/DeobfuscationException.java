/**
 * 完全反混淆的Java类
 *
 * 原始: lIIIIlllllIlll1.llllIllIl1
 * 反混淆: lIIIIlllllIlll1.DeobfuscationException
 *
 * 反混淆处理:
 * ✓ 包名重组: lIIIIlllllIlll1 → lIIIIlllllIlll1
 * ✓ 类名重命名: llllIllIl1 → DeobfuscationException
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lIIIIlllllIlll1;

/* loaded from: classes.jar:lIIIIlllllIlll1/llllIllIl1.class */
public interface DeobfuscationException {
    byte[] decrypt(String message, byte[] byteArray);

    String decrypt(byte[] byteArray, byte[] keyArray);

    boolean decrypt(String message);
}
