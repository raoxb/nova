/**
 * 反混淆的Java类
 * 原始包名: lIIlllIIIlllII1
 * 原始类名: llllIllIl1
 * 反混淆后: com.obfuscated.websocket.Exception
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.websocket;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.jar:lIIlllIIIlllII1/llllIllIl1.class */
public class Exception {

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String llllIllIl1 = "";

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public Map<String, String> helper = new LinkedHashMap();

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public String constants;

    public static llllIllIl1 llllIIIIll1(String str) {
        llllIllIl1 llllillil1 = new llllIllIl1();
        String[] split = str.split(";");
        llllillil1.constants = split[0].trim();
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            String str2 = llllIllIl1;
            if (split2.length > 1) {
                String trim = split2[1].trim();
                str2 = trim;
                if ((trim.startsWith("\"") && str2.endsWith("\"")) || (str2.startsWith("'") && str2.endsWith("'") && str2.length() > 2)) {
                    str2 = str2.substring(1, str2.length() - 1);
                }
            }
            llllillil1.helper.put(split2[0].trim(), str2);
        }
        return llllillil1;
    }

    public Map<String, String> lIIIIlllllIlll1() {
        return this.helper;
    }

    public String llllIIIIll1() {
        return this.constants;
    }
}
