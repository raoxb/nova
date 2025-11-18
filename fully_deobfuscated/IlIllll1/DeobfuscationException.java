/**
 * 完全反混淆的Java类
 *
 * 原始: IlIllll1.llllIllIl1
 * 反混淆: IlIllll1.DeobfuscationException
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIllll1 → IlIllll1
 * ✓ 类名重命名: llllIllIl1 → DeobfuscationException
 * ✓ 字符串解密: 2 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package IlIllll1;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ChangedPackages;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.VersionedPackage;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;
import lIIIIlllllIlll1.PerMessageDeflate;

/* loaded from: classes.jar:IlIllll1/llllIllIl1.class */
public class DeobfuscationException extends PackageManager {

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final String f291IllIIlIIII1 = IlIlllIIlI1.IllIIlIIII1."HookedPackageManager";

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public PackageManager f292llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f293lIIIIlllllIlll1 = IlIllll1.llllIIIIll1.decrypt();

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f294llllIllIl1 = IlIllll1.llllIIIIll1.f286IllIIlIIII1;

    /* loaded from: classes.jar:IlIllll1/llllIllIl1$llllIIIIll1.class */
    public static class llllIIIIll1 extends RuntimeException {
        public decrypt(String message) {
            super(message);
        }
    }

    public getWebViewProvider(PackageManager packageManager) throws llllIIIIll1 {
        this.f292llllIIIIll1 = packageManager;
        decrypt();
    }

    public final void decrypt() throws llllIIIIll1 {
        if (this.f292llllIIIIll1 == null) {
            throw new decrypt(IlIlllIIlI1.IllIIlIIII1."base package manager is null.");
        }
    }

    @Override // android.content.pm.PackageManager
    public PackageInfo getPackageInfo(@NonNull String message, int i) throws PackageManager.NameNotFoundException {
        if (message != null && message.equals(this.f293lIIIIlllllIlll1)) {
            message = this.f294llllIllIl1;
        }
        return this.f292llllIIIIll1.getPackageInfo(message, i);
    }

    @Override // android.content.pm.PackageManager
    public String[] currentToCanonicalPackageNames(@NonNull String[] strArr) {
        return this.f292llllIIIIll1.currentToCanonicalPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    public String[] canonicalToCurrentPackageNames(@NonNull String[] strArr) {
        return this.f292llllIIIIll1.canonicalToCurrentPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Intent getLaunchIntentForPackage(@NonNull String message) {
        return this.f292llllIIIIll1.getLaunchIntentForPackage(message);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 21)
    public Intent getLeanbackLaunchIntentForPackage(@NonNull String message) {
        return this.f292llllIIIIll1.getLeanbackLaunchIntentForPackage(message);
    }

    @Override // android.content.pm.PackageManager
    public int[] getPackageGids(@NonNull String message) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPackageGids(message);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 24)
    public int getPackageUid(@NonNull String message, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPackageUid(message, i);
    }

    @Override // android.content.pm.PackageManager
    public PermissionInfo getPermissionInfo(@NonNull String message, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPermissionInfo(message, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<PermissionInfo> queryPermissionsByGroup(@Nullable String message, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.queryPermissionsByGroup(message, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public PermissionGroupInfo getPermissionGroupInfo(@NonNull String message, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPermissionGroupInfo(message, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<PermissionGroupInfo> getAllPermissionGroups(int i) {
        return this.f292llllIIIIll1.getAllPermissionGroups(i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public ApplicationInfo getApplicationInfo(@NonNull String message, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getApplicationInfo(message, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public ActivityInfo getActivityInfo(@NonNull ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getActivityInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public ActivityInfo getReceiverInfo(@NonNull ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getReceiverInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public ServiceInfo getServiceInfo(@NonNull ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getServiceInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public ProviderInfo getProviderInfo(@NonNull ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getProviderInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<PackageInfo> getInstalledPackages(int i) {
        return this.f292llllIIIIll1.getInstalledPackages(i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 18)
    public List<PackageInfo> getPackagesHoldingPermissions(@NonNull String[] strArr, int i) {
        return this.f292llllIIIIll1.getPackagesHoldingPermissions(strArr, i);
    }

    @Override // android.content.pm.PackageManager
    public int checkPermission(@NonNull String message, @NonNull String logMessage) {
        return this.f292llllIIIIll1.checkPermission(message, logMessage);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 23)
    public boolean isPermissionRevokedByPolicy(@NonNull String message, @NonNull String logMessage) {
        return this.f292llllIIIIll1.isPermissionRevokedByPolicy(message, logMessage);
    }

    @Override // android.content.pm.PackageManager
    public boolean addPermission(@NonNull PermissionInfo permissionInfo) {
        return this.f292llllIIIIll1.addPermission(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public boolean addPermissionAsync(@NonNull PermissionInfo permissionInfo) {
        return this.f292llllIIIIll1.addPermissionAsync(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public void removePermission(@NonNull String message) {
        this.f292llllIIIIll1.removePermission(message);
    }

    @Override // android.content.pm.PackageManager
    public int checkSignatures(@NonNull String message, @NonNull String logMessage) {
        return this.f292llllIIIIll1.checkSignatures(message, logMessage);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public String[] getPackagesForUid(int i) {
        return this.f292llllIIIIll1.getPackagesForUid(i);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public String getNameForUid(int i) {
        return this.f292llllIIIIll1.getNameForUid(i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ApplicationInfo> getInstalledApplications(int i) {
        return this.f292llllIIIIll1.getInstalledApplications(i);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public boolean isInstantApp() {
        return this.f292llllIIIIll1.isInstantApp();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public int getInstantAppCookieMaxBytes() {
        return this.f292llllIIIIll1.getInstantAppCookieMaxBytes();
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 26)
    public byte[] getInstantAppCookie() {
        return this.f292llllIIIIll1.getInstantAppCookie();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public void clearInstantAppCookie() {
        this.f292llllIIIIll1.clearInstantAppCookie();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public void updateInstantAppCookie(@Nullable byte[] byteArray) {
        this.f292llllIIIIll1.updateInstantAppCookie(byteArray);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public String[] getSystemSharedLibraryNames() {
        return this.f292llllIIIIll1.getSystemSharedLibraryNames();
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 26)
    public List<SharedLibraryInfo> getSharedLibraries(int i) {
        return this.f292llllIIIIll1.getSharedLibraries(i);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 26)
    public ChangedPackages getChangedPackages(int i) {
        return this.f292llllIIIIll1.getChangedPackages(i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public FeatureInfo[] getSystemAvailableFeatures() {
        return this.f292llllIIIIll1.getSystemAvailableFeatures();
    }

    @Override // android.content.pm.PackageManager
    public boolean hasSystemFeature(@NonNull String message) {
        return this.f292llllIIIIll1.hasSystemFeature(message);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public ResolveInfo resolveActivity(@NonNull Intent intent, int i) {
        return this.f292llllIIIIll1.resolveActivity(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ResolveInfo> queryIntentActivities(@NonNull Intent intent, int i) {
        return this.f292llllIIIIll1.queryIntentActivities(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ResolveInfo> queryIntentActivityOptions(@Nullable ComponentName componentName, @Nullable Intent[] intentArr, @NonNull Intent intent, int i) {
        return this.f292llllIIIIll1.queryIntentActivityOptions(componentName, intentArr, intent, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ResolveInfo> queryBroadcastReceivers(@NonNull Intent intent, int i) {
        return this.f292llllIIIIll1.queryBroadcastReceivers(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public ResolveInfo resolveService(@NonNull Intent intent, int i) {
        return this.f292llllIIIIll1.resolveService(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ResolveInfo> queryIntentServices(@NonNull Intent intent, int i) {
        return this.f292llllIIIIll1.queryIntentServices(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = llllIIIIll1.IllIIlIIII1.f336IIlIllIIll1)
    public List<ResolveInfo> queryIntentContentProviders(@NonNull Intent intent, int i) {
        return this.f292llllIIIIll1.queryIntentContentProviders(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public ProviderInfo resolveContentProvider(@NonNull String message, int i) {
        return this.f292llllIIIIll1.resolveContentProvider(message, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ProviderInfo> queryContentProviders(@Nullable String message, int i, int i2) {
        return this.f292llllIIIIll1.queryContentProviders(message, i, i2);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public InstrumentationInfo getInstrumentationInfo(@NonNull ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getInstrumentationInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<InstrumentationInfo> queryInstrumentation(@NonNull String message, int i) {
        return this.f292llllIIIIll1.queryInstrumentation(message, i);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getDrawable(@NonNull String message, int i, @Nullable ApplicationInfo applicationInfo) {
        return this.f292llllIIIIll1.getDrawable(message, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Drawable getActivityIcon(@NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getActivityIcon(componentName);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 20)
    public Drawable getActivityBanner(@NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getActivityBanner(componentName);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Drawable getDefaultActivityIcon() {
        return this.f292llllIIIIll1.getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Drawable getApplicationIcon(@NonNull ApplicationInfo applicationInfo) {
        return this.f292llllIIIIll1.getApplicationIcon(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 20)
    public Drawable getApplicationBanner(@NonNull ApplicationInfo applicationInfo) {
        return this.f292llllIIIIll1.getApplicationBanner(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getActivityLogo(@NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getActivityLogo(componentName);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getApplicationLogo(@NonNull ApplicationInfo applicationInfo) {
        return this.f292llllIIIIll1.getApplicationLogo(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 21)
    public Drawable getUserBadgedIcon(@NonNull Drawable drawable, @NonNull UserHandle userHandle) {
        return this.f292llllIIIIll1.getUserBadgedIcon(drawable, userHandle);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 21)
    public Drawable getUserBadgedDrawableForDensity(@NonNull Drawable drawable, @NonNull UserHandle userHandle, @Nullable Rect rect, int i) {
        return this.f292llllIIIIll1.getUserBadgedDrawableForDensity(drawable, userHandle, rect, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 21)
    public CharSequence getUserBadgedLabel(@NonNull CharSequence charSequence, @NonNull UserHandle userHandle) {
        return this.f292llllIIIIll1.getUserBadgedLabel(charSequence, userHandle);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public CharSequence getText(@NonNull String message, int i, @Nullable ApplicationInfo applicationInfo) {
        return this.f292llllIIIIll1.getText(message, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public XmlResourceParser getXml(@NonNull String message, int i, @Nullable ApplicationInfo applicationInfo) {
        return this.f292llllIIIIll1.getXml(message, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public CharSequence getApplicationLabel(@NonNull ApplicationInfo applicationInfo) {
        return this.f292llllIIIIll1.getApplicationLabel(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Resources getResourcesForActivity(@NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getResourcesForActivity(componentName);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Resources getResourcesForApplication(@NonNull ApplicationInfo applicationInfo) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getResourcesForApplication(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public void verifyPendingInstall(int i, int i2) {
        this.f292llllIIIIll1.verifyPendingInstall(i, i2);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 17)
    public void extendVerificationTimeout(int i, int i2, long j) {
        this.f292llllIIIIll1.extendVerificationTimeout(i, i2, j);
    }

    @Override // android.content.pm.PackageManager
    public void setInstallerPackageName(@NonNull String message, @Nullable String logMessage) {
        this.f292llllIIIIll1.setInstallerPackageName(message, logMessage);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public String getInstallerPackageName(@NonNull String message) {
        if (message != null && message.equals(this.f293lIIIIlllllIlll1)) {
            message = this.f294llllIllIl1;
        }
        return this.f292llllIIIIll1.getInstallerPackageName(message);
    }

    @Override // android.content.pm.PackageManager
    public void addPackageToPreferred(@NonNull String message) {
        this.f292llllIIIIll1.addPackageToPreferred(message);
    }

    @Override // android.content.pm.PackageManager
    public void removePackageFromPreferred(@NonNull String message) {
        this.f292llllIIIIll1.removePackageFromPreferred(message);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<PackageInfo> getPreferredPackages(int i) {
        return this.f292llllIIIIll1.getPreferredPackages(i);
    }

    @Override // android.content.pm.PackageManager
    public void addPreferredActivity(@NonNull IntentFilter intentFilter, int i, @Nullable ComponentName[] componentNameArr, @NonNull ComponentName componentName) {
        this.f292llllIIIIll1.addPreferredActivity(intentFilter, i, componentNameArr, componentName);
    }

    @Override // android.content.pm.PackageManager
    public void clearPackagePreferredActivities(@NonNull String message) {
        this.f292llllIIIIll1.clearPackagePreferredActivities(message);
    }

    @Override // android.content.pm.PackageManager
    public int getPreferredActivities(@NonNull List<IntentFilter> list, @NonNull List<ComponentName> list2, @Nullable String message) {
        return this.f292llllIIIIll1.getPreferredActivities(list, list2, message);
    }

    @Override // android.content.pm.PackageManager
    public void setComponentEnabledSetting(@NonNull ComponentName componentName, int i, int i2) {
        this.f292llllIIIIll1.setComponentEnabledSetting(componentName, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public int getComponentEnabledSetting(@NonNull ComponentName componentName) {
        return this.f292llllIIIIll1.getComponentEnabledSetting(componentName);
    }

    @Override // android.content.pm.PackageManager
    public void setApplicationEnabledSetting(@NonNull String message, int i, int i2) {
        this.f292llllIIIIll1.setApplicationEnabledSetting(message, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public int getApplicationEnabledSetting(@NonNull String message) {
        return this.f292llllIIIIll1.getApplicationEnabledSetting(message);
    }

    @Override // android.content.pm.PackageManager
    public boolean isSafeMode() {
        return this.f292llllIIIIll1.isSafeMode();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public void setApplicationCategoryHint(@NonNull String message, int i) {
        this.f292llllIIIIll1.setApplicationCategoryHint(message, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 21)
    public PackageInstaller getPackageInstaller() {
        return this.f292llllIIIIll1.getPackageInstaller();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public boolean canRequestPackageInstalls() {
        return this.f292llllIIIIll1.canRequestPackageInstalls();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 24)
    public int[] getPackageGids(@NonNull String message, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPackageGids(message, i);
    }

    @Override // android.content.pm.PackageManager
    public int checkSignatures(int i, int i2) {
        return this.f292llllIIIIll1.checkSignatures(i, i2);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public boolean isInstantApp(@NonNull String message) {
        return this.f292llllIIIIll1.isInstantApp(message);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 24)
    public boolean hasSystemFeature(@NonNull String message, int i) {
        return this.f292llllIIIIll1.hasSystemFeature(message, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Drawable getActivityIcon(@NonNull Intent intent) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getActivityIcon(intent);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 20)
    public Drawable getActivityBanner(@NonNull Intent intent) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getActivityBanner(intent);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Drawable getApplicationIcon(@NonNull String message) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getApplicationIcon(message);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 20)
    public Drawable getApplicationBanner(@NonNull String message) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getApplicationBanner(message);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getActivityLogo(@NonNull Intent intent) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getActivityLogo(intent);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getApplicationLogo(@NonNull String message) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getApplicationLogo(message);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Resources getResourcesForApplication(@NonNull String message) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getResourcesForApplication(message);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public PackageInfo getPackageInfo(@NonNull VersionedPackage versionedPackage, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPackageInfo(versionedPackage, i);
    }
}
