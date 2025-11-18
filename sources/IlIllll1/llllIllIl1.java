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
import lIIIIlllllIlll1.llllIIIIll1;

/* loaded from: classes.jar:IlIllll1/llllIllIl1.class */
public class llllIllIl1 extends PackageManager {

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final String f291IllIIlIIII1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{47, -113, -119, -55, 10, 105, 17, -65, 4, -117, -121, -59, 10, 64, 32, -80, 6, -121, -125, -48}, new byte[]{103, -32, -26, -94, 111, 13, 65, -34});

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public PackageManager f292llllIIIIll1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public final String f293lIIIIlllllIlll1 = IlIllll1.llllIIIIll1.llllIIIIll1();

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public final String f294llllIllIl1 = IlIllll1.llllIIIIll1.f286IllIIlIIII1;

    /* loaded from: classes.jar:IlIllll1/llllIllIl1$llllIIIIll1.class */
    public static class llllIIIIll1 extends RuntimeException {
        public llllIIIIll1(String str) {
            super(str);
        }
    }

    public llllIllIl1(PackageManager packageManager) throws llllIIIIll1 {
        this.f292llllIIIIll1 = packageManager;
        llllIIIIll1();
    }

    public final void llllIIIIll1() throws llllIIIIll1 {
        if (this.f292llllIIIIll1 == null) {
            throw new llllIIIIll1(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-127, 122, 59, -52, -5, 14, 85, 94, -120, 122, 47, -52, -5, 19, 85, 83, -126, 124, 45, -37, -5, 23, 71, 29, -115, 110, 36, -59, -11}, new byte[]{-29, 27, 72, -87, -37, 126, 52, 61}));
        }
    }

    @Override // android.content.pm.PackageManager
    public PackageInfo getPackageInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        if (str != null && str.equals(this.f293lIIIIlllllIlll1)) {
            str = this.f294llllIllIl1;
        }
        return this.f292llllIIIIll1.getPackageInfo(str, i);
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
    public Intent getLaunchIntentForPackage(@NonNull String str) {
        return this.f292llllIIIIll1.getLaunchIntentForPackage(str);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 21)
    public Intent getLeanbackLaunchIntentForPackage(@NonNull String str) {
        return this.f292llllIIIIll1.getLeanbackLaunchIntentForPackage(str);
    }

    @Override // android.content.pm.PackageManager
    public int[] getPackageGids(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPackageGids(str);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 24)
    public int getPackageUid(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPackageUid(str, i);
    }

    @Override // android.content.pm.PackageManager
    public PermissionInfo getPermissionInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPermissionInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<PermissionInfo> queryPermissionsByGroup(@Nullable String str, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.queryPermissionsByGroup(str, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public PermissionGroupInfo getPermissionGroupInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPermissionGroupInfo(str, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<PermissionGroupInfo> getAllPermissionGroups(int i) {
        return this.f292llllIIIIll1.getAllPermissionGroups(i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public ApplicationInfo getApplicationInfo(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getApplicationInfo(str, i);
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
    public int checkPermission(@NonNull String str, @NonNull String str2) {
        return this.f292llllIIIIll1.checkPermission(str, str2);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 23)
    public boolean isPermissionRevokedByPolicy(@NonNull String str, @NonNull String str2) {
        return this.f292llllIIIIll1.isPermissionRevokedByPolicy(str, str2);
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
    public void removePermission(@NonNull String str) {
        this.f292llllIIIIll1.removePermission(str);
    }

    @Override // android.content.pm.PackageManager
    public int checkSignatures(@NonNull String str, @NonNull String str2) {
        return this.f292llllIIIIll1.checkSignatures(str, str2);
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
    public void updateInstantAppCookie(@Nullable byte[] bArr) {
        this.f292llllIIIIll1.updateInstantAppCookie(bArr);
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
    public boolean hasSystemFeature(@NonNull String str) {
        return this.f292llllIIIIll1.hasSystemFeature(str);
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
    public ProviderInfo resolveContentProvider(@NonNull String str, int i) {
        return this.f292llllIIIIll1.resolveContentProvider(str, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<ProviderInfo> queryContentProviders(@Nullable String str, int i, int i2) {
        return this.f292llllIIIIll1.queryContentProviders(str, i, i2);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public InstrumentationInfo getInstrumentationInfo(@NonNull ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getInstrumentationInfo(componentName, i);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public List<InstrumentationInfo> queryInstrumentation(@NonNull String str, int i) {
        return this.f292llllIIIIll1.queryInstrumentation(str, i);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getDrawable(@NonNull String str, int i, @Nullable ApplicationInfo applicationInfo) {
        return this.f292llllIIIIll1.getDrawable(str, i, applicationInfo);
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
    public CharSequence getText(@NonNull String str, int i, @Nullable ApplicationInfo applicationInfo) {
        return this.f292llllIIIIll1.getText(str, i, applicationInfo);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public XmlResourceParser getXml(@NonNull String str, int i, @Nullable ApplicationInfo applicationInfo) {
        return this.f292llllIIIIll1.getXml(str, i, applicationInfo);
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
    public void setInstallerPackageName(@NonNull String str, @Nullable String str2) {
        this.f292llllIIIIll1.setInstallerPackageName(str, str2);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public String getInstallerPackageName(@NonNull String str) {
        if (str != null && str.equals(this.f293lIIIIlllllIlll1)) {
            str = this.f294llllIllIl1;
        }
        return this.f292llllIIIIll1.getInstallerPackageName(str);
    }

    @Override // android.content.pm.PackageManager
    public void addPackageToPreferred(@NonNull String str) {
        this.f292llllIIIIll1.addPackageToPreferred(str);
    }

    @Override // android.content.pm.PackageManager
    public void removePackageFromPreferred(@NonNull String str) {
        this.f292llllIIIIll1.removePackageFromPreferred(str);
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
    public void clearPackagePreferredActivities(@NonNull String str) {
        this.f292llllIIIIll1.clearPackagePreferredActivities(str);
    }

    @Override // android.content.pm.PackageManager
    public int getPreferredActivities(@NonNull List<IntentFilter> list, @NonNull List<ComponentName> list2, @Nullable String str) {
        return this.f292llllIIIIll1.getPreferredActivities(list, list2, str);
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
    public void setApplicationEnabledSetting(@NonNull String str, int i, int i2) {
        this.f292llllIIIIll1.setApplicationEnabledSetting(str, i, i2);
    }

    @Override // android.content.pm.PackageManager
    public int getApplicationEnabledSetting(@NonNull String str) {
        return this.f292llllIIIIll1.getApplicationEnabledSetting(str);
    }

    @Override // android.content.pm.PackageManager
    public boolean isSafeMode() {
        return this.f292llllIIIIll1.isSafeMode();
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public void setApplicationCategoryHint(@NonNull String str, int i) {
        this.f292llllIIIIll1.setApplicationCategoryHint(str, i);
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
    public int[] getPackageGids(@NonNull String str, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPackageGids(str, i);
    }

    @Override // android.content.pm.PackageManager
    public int checkSignatures(int i, int i2) {
        return this.f292llllIIIIll1.checkSignatures(i, i2);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public boolean isInstantApp(@NonNull String str) {
        return this.f292llllIIIIll1.isInstantApp(str);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 24)
    public boolean hasSystemFeature(@NonNull String str, int i) {
        return this.f292llllIIIIll1.hasSystemFeature(str, i);
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
    public Drawable getApplicationIcon(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getApplicationIcon(str);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    @RequiresApi(api = 20)
    public Drawable getApplicationBanner(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getApplicationBanner(str);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getActivityLogo(@NonNull Intent intent) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getActivityLogo(intent);
    }

    @Override // android.content.pm.PackageManager
    @Nullable
    public Drawable getApplicationLogo(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getApplicationLogo(str);
    }

    @Override // android.content.pm.PackageManager
    @NonNull
    public Resources getResourcesForApplication(@NonNull String str) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getResourcesForApplication(str);
    }

    @Override // android.content.pm.PackageManager
    @RequiresApi(api = 26)
    public PackageInfo getPackageInfo(@NonNull VersionedPackage versionedPackage, int i) throws PackageManager.NameNotFoundException {
        return this.f292llllIIIIll1.getPackageInfo(versionedPackage, i);
    }
}
