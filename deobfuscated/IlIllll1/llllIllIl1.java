/**
 * 反混淆的Java类
 * 原始包名: IlIllll1
 * 原始类名: llllIllIl1
 * 反混淆后: com.obfuscated.unknown.IlIllll1.Exception
 *
 * 注意：此文件是自动反混淆生成的，可能包含推断的名称
 */

package com.obfuscated.unknown.IlIllll1;

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
import com.obfuscated.unknown.lIIIIlllllIlll1.Helper;

/* loaded from: classes.jar:IlIllll1/llllIllIl1.class */
public class Exception extends PackageManager {

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final String IllIIlIIII1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{47, -113, -119, -55, 10, 105, 17, -65, 4, -117, -121, -59, 10, 64, 32, -80, 6, -121, -125, -48}, new byte[]{103, -32, -26, -94, 111, 13, 65, -34});

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public PackageManager helper;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String constants = IlIllll1.llllIIIIll1.llllIIIIll1();

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String llllIllIl1 = IlIllll1.llllIIIIll1.f286IllIIlIIII1;

    /* loaded from: classes.jar:IlIllll1/llllIllIl1$llllIIIIll1.class */
    public static class llllIIIIll1 extends RuntimeException {
        public llllIIIIll1(String str) {
            super(str);
        }
    }

    public llllIllIl1(PackageManager packageManager) throws llllIIIIll1 {
        this.helper = packageManager;
        llllIIIIll1();
    }

    public final void llllIIIIll1() throws llllIIIIll1 {
        if (this.helper == null) {
            throw new llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-127, 122, 59, -52, -5, 14, 85, 94, -120, 122, 47, -52, -5, 19, 85, 83, -126, 124, 45, -37, -5, 23, 71, 29, -115, 110, 36, -59, -11}, new byte[]{-29, 27, 72, -87, -37, 126, 52, 61}));
        }
    }

    @Override // android.content.pm.PackageManager
    public PackageInfo getPackageInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        if (str != null && str.equals(this.constants)) {
            str = this.llllIllIl1;
        }
        return this.helper.getPackageInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    public String[] currentToCanonicalPackageNames(@NonNull String[] strArr) {
        return this.helper.currentToCanonicalPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    public String[] canonicalToCurrentPackageNames(@NonNull String[] strArr) {
        return this.helper.canonicalToCurrentPackageNames(strArr);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Intent getLaunchIntentForPackage(@NonNull String str) {
        return this.helper.getLaunchIntentForPackage(str);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 21)
    public Intent getLeanbackLaunchIntentForPackage(@NonNull String str) {
        return this.helper.getLeanbackLaunchIntentForPackage(str);
    }

    @Override // android.content.pm.PackageManager
    public int[] getPackageGids(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.helper.getPackageGids(str);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 24)
    public int getPackageUid(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.helper.getPackageUid(str, i);
    }

    @Override // android.content.pm.PackageManager
    public PermissionInfo getPermissionInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.helper.getPermissionInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<PermissionInfo> queryPermissionsByGroup(@Nullable String str, int i) throws PackageManager.NameNotFoundException {
        return this.helper.queryPermissionsByGroup(str, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public PermissionGroupInfo getPermissionGroupInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.helper.getPermissionGroupInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<PermissionGroupInfo> getAllPermissionGroups(int i) {
        return this.helper.getAllPermissionGroups(i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public ApplicationInfo getApplicationInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.helper.getApplicationInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public ActivityInfo getActivityInfo(@NonNull ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return this.helper.getActivityInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public ActivityInfo getReceiverInfo(@NonNull ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return this.helper.getReceiverInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public ServiceInfo getServiceInfo(@NonNull ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return this.helper.getServiceInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public ProviderInfo getProviderInfo(@NonNull ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return this.helper.getProviderInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<PackageInfo> getInstalledPackages(int i) {
        return this.helper.getInstalledPackages(i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 18)
    public List<PackageInfo> getPackagesHoldingPermissions(@NonNull String[] strArr, int i) {
        return this.helper.getPackagesHoldingPermissions(strArr, i);
    }

    @Override // android.content.pm.PackageManager
    public int checkPermission(@NonNull String str, @NonNull String str2) {
        return this.helper.checkPermission(str, str2);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 23)
    public boolean isPermissionRevokedByPolicy(@NonNull String str, @NonNull String str2) {
        return this.helper.isPermissionRevokedByPolicy(str, str2);
    }

    @Override // android.content.pm.PackageManager
    public boolean addPermission(@NonNull PermissionInfo permissionInfo) {
        return this.helper.addPermission(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public boolean addPermissionAsync(@NonNull PermissionInfo permissionInfo) {
        return this.helper.addPermissionAsync(permissionInfo);
    }

    @Override // android.content.pm.PackageManager
    public void removePermission(@NonNull String str) {
        this.helper.removePermission(str);
    }

    @Override // android.content.pm.PackageManager
    public int checkSignatures(@NonNull String str, @NonNull String str2) {
        return this.helper.checkSignatures(str, str2);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public String[] getPackagesForUid(int i) {
        return this.helper.getPackagesForUid(i);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public String getNameForUid(int i) {
        return this.helper.getNameForUid(i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ApplicationInfo> getInstalledApplications(int i) {
        return this.helper.getInstalledApplications(i);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public boolean isInstantApp() {
        return this.helper.isInstantApp();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public int getInstantAppCookieMaxBytes() {
        return this.helper.getInstantAppCookieMaxBytes();
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 26)
    public byte[] getInstantAppCookie() {
        return this.helper.getInstantAppCookie();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public void clearInstantAppCookie() {
        this.helper.clearInstantAppCookie();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public void updateInstantAppCookie(@Nullable byte[] bArr) {
        this.helper.updateInstantAppCookie(bArr);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public String[] getSystemSharedLibraryNames() {
        return this.helper.getSystemSharedLibraryNames();
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 26)
    public List<SharedLibraryInfo> getSharedLibraries(int i) {
        return this.helper.getSharedLibraries(i);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 26)
    public ChangedPackages getChangedPackages(int i) {
        return this.helper.getChangedPackages(i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public FeatureInfo[] getSystemAvailableFeatures() {
        return this.helper.getSystemAvailableFeatures();
    }

    @Override // android.content.pm.PackageManager
    public boolean hasSystemFeature(@NonNull String str) {
        return this.helper.hasSystemFeature(str);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public ResolveInfo resolveActivity(@NonNull Intent intent, int i) {
        return this.helper.resolveActivity(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ResolveInfo> queryIntentActivities(@NonNull Intent intent, int i) {
        return this.helper.queryIntentActivities(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ResolveInfo> queryIntentActivityOptions(@Nullable ComponentName componentName, @Nullable Intent[] intentArr, @NonNull Intent intent, int i) {
        return this.helper.queryIntentActivityOptions(componentName, intentArr, intent, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ResolveInfo> queryBroadcastReceivers(@NonNull Intent intent, int i) {
        return this.helper.queryBroadcastReceivers(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public ResolveInfo resolveService(@NonNull Intent intent, int i) {
        return this.helper.resolveService(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ResolveInfo> queryIntentServices(@NonNull Intent intent, int i) {
        return this.helper.queryIntentServices(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = llllIIIIll1.IllIIlIIII1.f336IIlIllIIll1)
    public List<ResolveInfo> queryIntentContentProviders(@NonNull Intent intent, int i) {
        return this.helper.queryIntentContentProviders(intent, i);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public ProviderInfo resolveContentProvider(@NonNull String str, int i) {
        return this.helper.resolveContentProvider(str, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ProviderInfo> queryContentProviders(@Nullable String str, int i, int i2) {
        return this.helper.queryContentProviders(str, i, i2);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public InstrumentationInfo getInstrumentationInfo(@NonNull ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return this.helper.getInstrumentationInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<InstrumentationInfo> queryInstrumentation(@NonNull String str, int i) {
        return this.helper.queryInstrumentation(str, i);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getDrawable(@NonNull String str, int i, @Nullable ApplicationInfo applicationInfo) {
        return this.helper.getDrawable(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Drawable getActivityIcon(@NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        return this.helper.getActivityIcon(componentName);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 20)
    public Drawable getActivityBanner(@NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        return this.helper.getActivityBanner(componentName);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Drawable getDefaultActivityIcon() {
        return this.helper.getDefaultActivityIcon();
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Drawable getApplicationIcon(@NonNull ApplicationInfo applicationInfo) {
        return this.helper.getApplicationIcon(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 20)
    public Drawable getApplicationBanner(@NonNull ApplicationInfo applicationInfo) {
        return this.helper.getApplicationBanner(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getActivityLogo(@NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        return this.helper.getActivityLogo(componentName);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getApplicationLogo(@NonNull ApplicationInfo applicationInfo) {
        return this.helper.getApplicationLogo(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 21)
    public Drawable getUserBadgedIcon(@NonNull Drawable drawable, @NonNull UserHandle userHandle) {
        return this.helper.getUserBadgedIcon(drawable, userHandle);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 21)
    public Drawable getUserBadgedDrawableForDensity(@NonNull Drawable drawable, @NonNull UserHandle userHandle, @Nullable Rect rect, int i) {
        return this.helper.getUserBadgedDrawableForDensity(drawable, userHandle, rect, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 21)
    public CharSequence getUserBadgedLabel(@NonNull CharSequence charSequence, @NonNull UserHandle userHandle) {
        return this.helper.getUserBadgedLabel(charSequence, userHandle);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public CharSequence getText(@NonNull String str, int i, @Nullable ApplicationInfo applicationInfo) {
        return this.helper.getText(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public XmlResourceParser getXml(@NonNull String str, int i, @Nullable ApplicationInfo applicationInfo) {
        return this.helper.getXml(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public CharSequence getApplicationLabel(@NonNull ApplicationInfo applicationInfo) {
        return this.helper.getApplicationLabel(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Resources getResourcesForActivity(@NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        return this.helper.getResourcesForActivity(componentName);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Resources getResourcesForApplication(@NonNull ApplicationInfo applicationInfo) throws PackageManager.NameNotFoundException {
        return this.helper.getResourcesForApplication(applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    public void verifyPendingInstall(int i, int i2) {
        this.helper.verifyPendingInstall(i, i2);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 17)
    public void extendVerificationTimeout(int i, int i2, long j) {
        this.helper.extendVerificationTimeout(i, i2, j);
    }

    @Override // android.content.pm.PackageManager
    public void setInstallerPackageName(@NonNull String str, @Nullable String str2) {
        this.helper.setInstallerPackageName(str, str2);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public String getInstallerPackageName(@NonNull String str) {
        if (str != null && str.equals(this.constants)) {
            str = this.llllIllIl1;
        }
        return this.helper.getInstallerPackageName(str);
    }

    @Override // android.content.pm.PackageManager
    public void addPackageToPreferred(@NonNull String str) {
        this.helper.addPackageToPreferred(str);
    }

    @Override // android.content.pm.PackageManager
    public void removePackageFromPreferred(@NonNull String str) {
        this.helper.removePackageFromPreferred(str);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<PackageInfo> getPreferredPackages(int i) {
        return this.helper.getPreferredPackages(i);
    }

    @Override // android.content.pm.PackageManager
    public void addPreferredActivity(@NonNull IntentFilter intentFilter, int i, @Nullable ComponentName[] componentNameArr, @NonNull ComponentName componentName) {
        this.helper.addPreferredActivity(intentFilter, i, componentNameArr, componentName);
    }

    @Override // android.content.pm.PackageManager
    public void clearPackagePreferredActivities(@NonNull String str) {
        this.helper.clearPackagePreferredActivities(str);
    }

    @Override // android.content.pm.PackageManager
    public int getPreferredActivities(@NonNull List<IntentFilter> list, @NonNull List<ComponentName> list2, @Nullable String str) {
        return this.helper.getPreferredActivities(list, list2, str);
    }

    @Override // android.content.pm.PackageManager
    public void setComponentEnabledSetting(@NonNull ComponentName componentName, int i, int i2) {
        this.helper.setComponentEnabledSetting(componentName, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public int getComponentEnabledSetting(@NonNull ComponentName componentName) {
        return this.helper.getComponentEnabledSetting(componentName);
    }

    @Override // android.content.pm.PackageManager
    public void setApplicationEnabledSetting(@NonNull String str, int i, int i2) {
        this.helper.setApplicationEnabledSetting(str, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public int getApplicationEnabledSetting(@NonNull String str) {
        return this.helper.getApplicationEnabledSetting(str);
    }

    @Override // android.content.pm.PackageManager
    public boolean isSafeMode() {
        return this.helper.isSafeMode();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public void setApplicationCategoryHint(@NonNull String str, int i) {
        this.helper.setApplicationCategoryHint(str, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    @RequiresApi(api = 21)
    public PackageInstaller getPackageInstaller() {
        return this.helper.getPackageInstaller();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public boolean canRequestPackageInstalls() {
        return this.helper.canRequestPackageInstalls();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 24)
    public int[] getPackageGids(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.helper.getPackageGids(str, i);
    }

    @Override // android.content.pm.PackageManager
    public int checkSignatures(int i, int i2) {
        return this.helper.checkSignatures(i, i2);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public boolean isInstantApp(@NonNull String str) {
        return this.helper.isInstantApp(str);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 24)
    public boolean hasSystemFeature(@NonNull String str, int i) {
        return this.helper.hasSystemFeature(str, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Drawable getActivityIcon(@NonNull Intent intent) throws PackageManager.NameNotFoundException {
        return this.helper.getActivityIcon(intent);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 20)
    public Drawable getActivityBanner(@NonNull Intent intent) throws PackageManager.NameNotFoundException {
        return this.helper.getActivityBanner(intent);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Drawable getApplicationIcon(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.helper.getApplicationIcon(str);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 20)
    public Drawable getApplicationBanner(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.helper.getApplicationBanner(str);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getActivityLogo(@NonNull Intent intent) throws PackageManager.NameNotFoundException {
        return this.helper.getActivityLogo(intent);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getApplicationLogo(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.helper.getApplicationLogo(str);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Resources getResourcesForApplication(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.helper.getResourcesForApplication(str);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public PackageInfo getPackageInfo(@NonNull VersionedPackage versionedPackage, int i) throws PackageManager.NameNotFoundException {
        return this.helper.getPackageInfo(versionedPackage, i);
    }
}
