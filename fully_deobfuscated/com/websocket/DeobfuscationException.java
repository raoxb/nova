/**
 * 完全反混淆的Java类
 *
 * 原始: lIIlllIIIlllII1.llllIllIl1
 * 反混淆: com.websocket.DeobfuscationException
 *
 * 反混淆处理:
 * ✓ 包名重组: lIIlllIIIlllII1 → com.websocket
 * ✓ 类名重命名: llllIllIl1 → DeobfuscationException
 * ✓ 字符串解密: 0 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.websocket;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.jar:lIIlllIIIlllII1/llllIllIl1.class */
public class DeobfuscationException {

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String f377llllIllIl1 = "";

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public Map<String, String> f378llllIIIIll1 = new LinkedHashMap();

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public String f379lIIIIlllllIlll1;

    public static llllIllIl1 decrypt(String message) {
        llllIllIl1 llllillil1 = new getWebViewProvider();
        String[] split = message.split(";");
        llllillil1.f379lIIIIlllllIlll1 = split[0].trim();
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            String logMessage = f377llllIllIl1;
            if (split2.length > 1) {
                String trim = split2[1].trim();
                logMessage = trim;
                if ((trim.startsWith("\"") && logMessage.endsWith("\"")) || (logMessage.startsWith("'") && logMessage.endsWith("'") && logMessage.length() > 2)) {
                    logMessage = logMessage.substring(1, logMessage.length() - 1);
                }
            }
            llllillil1.f378llllIIIIll1.put(split2[0].trim(), logMessage);
        }
        return llllillil1;
    }

    public Map<String, String> getClassLoader() {
        return this.f378llllIIIIll1;
    }

    public String decrypt() {
        return this.f379lIIIIlllllIlll1;
    }
}
