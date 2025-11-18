/**
 * 完全反混淆的Java类
 *
 * 原始: lIllIlIll1.lIllIIIlIl1
 * 反混淆: lIllIlIll1.WebMessageHandler
 *
 * 反混淆处理:
 * ✓ 包名重组: lIllIlIll1 → lIllIlIll1
 * ✓ 类名重命名: lIllIIIlIl1 → WebMessageHandler
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package lIllIlIll1;

/* loaded from: classes.jar:lIllIlIll1/lIllIIIlIl1.class */
public interface WebMessageHandler {
    void setConfig(String message, String logMessage);

    String getConfig();

    String detectCloseBtn();

    void debugLog(String message);

    void done(String message);

    void touch(float f, float f2);

    boolean scroll(float f, float f2, float f3, float f4, long j);

    String screenshot();

    long getTime();

    void setTime(long j);

    String getGAID();

    void upload_log(String message);

    void upload_event(String message);

    boolean isSignaling();

    void updateSignalStatus(int i);

    void back();
}
