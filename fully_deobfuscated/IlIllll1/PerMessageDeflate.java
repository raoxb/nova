/**
 * 完全反混淆的Java类
 *
 * 原始: IlIllll1.llllIIIIll1
 * 反混淆: IlIllll1.PerMessageDeflate
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIllll1 → IlIllll1
 * ✓ 类名重命名: llllIIIIll1 → PerMessageDeflate
 * ✓ 字符串解密: 14 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIllll1;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.jar:IlIllll1/llllIIIIll1.class */
public class PerMessageDeflate {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final String f283llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static boolean f284lIIIIlllllIlll1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static String f285llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static String f286IllIIlIIII1;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static List<String> f287IlIlllIIlI1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public static List<String> f288IlIllIlllIllI1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public static boolean f289llllllIlIIIlll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public static final List<String> f290IlIlIIlIII1;

    public static final void decrypt(Context context, String message) {
        List<String> list = f290IlIlIIlIII1;
        f287IlIlllIIlI1 = list;
        f288IlIllIlllIllI1 = list;
        f286IllIIlIIII1 = context.getPackageName();
        if (message != null && !message.trim().isEmpty()) {
            f285llllIllIl1 = message;
            return;
        }
        lllllIllIl1.IllIIlIIII1.decrypt(IlIlllIIlI1."use build-in appId");
        List asList = Arrays.asList(IlIlllIIlI1."move.house.unpacking.master.games", IlIlllIIlI1."multido.sweet.sorting.game", IlIlllIIlI1."my.world.mine.craft.universe.simulator.strategy.games.free", IlIlllIIlI1."nail.art.games", IlIlllIIlI1."net.AddiktiveGames.BubbleWar", IlIlllIIlI1."net.beautysalongames.bff.rich.girls.shopping", IlIlllIIlI1."net.happygames.mergegame", IlIlllIIlI1."net.mobigame.IdleRush", IlIlllIIlI1.IllIIlIIII1.decrypt(new byte[]{39, Byte.MIN_VALUE, 105, 25, 124, 76, -1, 38, 46, -124, 112, 82, Byte.MAX_VALUE, 7, -13, 34, 43, -116, 113, 82, 34, 91, -21, 32, 36, -116, 51, 86, 98, 77, -20, 34, 32, -127}, new byte[]{73, -27, 29, 55, 12, 41, -98, 77}), IlIlllIIlI1."net.wordbit.deen", IlIlllIIlI1.IllIIlIIII1.decrypt(new byte[]{-89, -114, -70, -61, -23, -81, -121, 76, -25, Byte.MIN_VALUE, -68, -58, -30, -68, -117, 93, -90, -107, -9, -49, -26, -93, -125, 71, -82, -119, -72, -59, -30}, new byte[]{-55, -25, -39, -88, -121, -50, -22, 41}), IlIlllIIlI1."no.wifi.offline.games.puzzle.games", IlIlllIIlI1."pigment.collect.sort.tangle.puzzle.game");
        f285llllIllIl1 = (String) asList.get(new Random().nextInt(asList.size()));
    }

    public static boolean getWebViewProvider() {
        return (!f284lIIIIlllllIlll1 || TextUtils.isEmpty(f286IllIIlIIII1) || TextUtils.isEmpty(f285llllIllIl1) || f286IllIIlIIII1.equals(f285llllIllIl1)) ? false : true;
    }

    public static String getClassLoader() {
        return f286IllIIlIIII1;
    }

    public static boolean isEnabled() {
        return f289llllllIlIIIlll1;
    }

    static {
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        f283llllIIIIll1 = "HookConfig";
        f287IlIlllIIlI1 = new ArrayList();
        f288IlIllIlllIllI1 = new ArrayList();
        f290IlIlIIlIII1 = Arrays.asList(lllliiiill1.decrypt(new byte[]{62, -7, 37, 83, -89, -98, -38, Byte.MAX_VALUE, 60, -30, 55, 16, -22, -108, -55, 99, 52, -91, 0, 8, -83, -102, -52, 89, 63, -19, 45}, new byte[]{81, -117, 66, 125, -60, -10, -88, 16}), "org.chromium.base.ApkInfo");
    }

    public static boolean getClassLoader(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null || f287IlIlllIIlI1.size() <= 0) {
            return false;
        }
        Iterator<String> it = f287IlIlllIIlI1.iterator();
        while (it.hasNext()) {
            if (stackTraceElement.toString().contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void decrypt(JSONArray jSONArray, List<String> list) throws JSONException {
        if (jSONArray == null || list == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String trim = jSONArray.getString(i).trim();
            if (trim.length() > 0) {
                list.add(trim);
            }
        }
    }

    public static String decrypt() {
        return f285llllIllIl1;
    }

    public static boolean decrypt(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null || f288IlIllIlllIllI1.size() <= 0) {
            return false;
        }
        Iterator<String> it = f288IlIllIlllIllI1.iterator();
        while (it.hasNext()) {
            if (stackTraceElement.toString().contains(it.next())) {
                return true;
            }
        }
        return false;
    }
}
