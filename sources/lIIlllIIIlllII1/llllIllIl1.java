package lIIlllIIIlllII1;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.jar:lIIlllIIIlllII1/llllIllIl1.class */
public class llllIllIl1 {

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final String f377llllIllIl1 = "";

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public Map<String, String> f378llllIIIIll1 = new LinkedHashMap();

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public String f379lIIIIlllllIlll1;

    public static llllIllIl1 llllIIIIll1(String str) {
        llllIllIl1 llllillil1 = new llllIllIl1();
        String[] split = str.split(";");
        llllillil1.f379lIIIIlllllIlll1 = split[0].trim();
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].split("=");
            String str2 = f377llllIllIl1;
            if (split2.length > 1) {
                String trim = split2[1].trim();
                str2 = trim;
                if ((trim.startsWith("\"") && str2.endsWith("\"")) || (str2.startsWith("'") && str2.endsWith("'") && str2.length() > 2)) {
                    str2 = str2.substring(1, str2.length() - 1);
                }
            }
            llllillil1.f378llllIIIIll1.put(split2[0].trim(), str2);
        }
        return llllillil1;
    }

    public Map<String, String> lIIIIlllllIlll1() {
        return this.f378llllIIIIll1;
    }

    public String llllIIIIll1() {
        return this.f379lIIIIlllllIlll1;
    }
}
