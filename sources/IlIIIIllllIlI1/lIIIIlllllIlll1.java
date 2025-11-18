package IlIIIIllllIlI1;

import java.nio.ByteBuffer;

/* loaded from: classes.jar:IlIIIIllllIlI1/lIIIIlllllIlll1.class */
public class lIIIIlllllIlll1 extends IllIIlIIII1 {

    /* renamed from: IIlIllIIll1, reason: collision with root package name */
    public static final int f67IIlIllIIll1 = 1000;

    /* renamed from: IlIllll1, reason: collision with root package name */
    public static final int f68IlIllll1 = 1001;

    /* renamed from: lllllIllIl1, reason: collision with root package name */
    public static final int f69lllllIllIl1 = 1002;

    /* renamed from: IlIIlllllI1, reason: collision with root package name */
    public static final int f70IlIIlllllI1 = 1003;

    /* renamed from: llIIIIlIlllIII1, reason: collision with root package name */
    public static final int f71llIIIIlIlllIII1 = 1005;

    /* renamed from: lIllIlIll1, reason: collision with root package name */
    public static final int f72lIllIlIll1 = 1006;

    /* renamed from: IlIlIIIlIlIlll1, reason: collision with root package name */
    public static final int f73IlIlIIIlIlIlll1 = 1007;

    /* renamed from: IIIlIllIlI1, reason: collision with root package name */
    public static final int f74IIIlIllIlI1 = 1008;

    /* renamed from: llIIllIl1, reason: collision with root package name */
    public static final int f75llIIllIl1 = 1009;

    /* renamed from: lllIlIIIlI1, reason: collision with root package name */
    public static final int f76lllIlIIIlI1 = 1010;

    /* renamed from: lIlllIIIII1, reason: collision with root package name */
    public static final int f77lIlllIIIII1 = 1011;

    /* renamed from: lIIlIIIIlIlII1, reason: collision with root package name */
    public static final int f78lIIlIIIIlIlII1 = 1012;

    /* renamed from: IllIlIllll1, reason: collision with root package name */
    public static final int f79IllIlIllll1 = 1013;

    /* renamed from: lIIlllIIIlllII1, reason: collision with root package name */
    public static final int f80lIIlllIIIlllII1 = 1014;

    /* renamed from: IllllIllllll1, reason: collision with root package name */
    public static final int f81IllllIllllll1 = 1015;

    /* renamed from: IlIIIIllllIlI1, reason: collision with root package name */
    public static final int f82IlIIIIllllIlI1 = -1;

    /* renamed from: lllIlIlllI1, reason: collision with root package name */
    public static final int f83lllIlIlllI1 = -2;

    /* renamed from: llIlIIlll1, reason: collision with root package name */
    public static final int f84llIlIIlll1 = -3;

    /* renamed from: IlIlIIlIII1, reason: collision with root package name */
    public int f85IlIlIIlIII1;

    /* renamed from: lIllIIIlIl1, reason: collision with root package name */
    public String f86lIllIIIlIl1;

    public lIIIIlllllIlll1() {
        super(lIIlIIIIlIlII1.llllIllIl1.CLOSING);
        llllIIIIll1(lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1);
        llllIIIIll1(f67IIlIllIIll1);
    }

    public void llllIIIIll1(int i) {
        this.f85IlIlIIlIII1 = i;
        if (i == 1015) {
            this.f85IlIlIIlIII1 = f71llIIIIlIlllIII1;
            this.f86lIllIIIlIl1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
        IlIllll1();
    }

    public int lIllIIIlIl1() {
        return this.f85IlIlIIlIII1;
    }

    public String IIlIllIIll1() {
        return this.f86lIllIIIlIl1;
    }

    @Override // IlIIIIllllIlI1.llllllIlIIIlll1
    public String toString() {
        return super.toString() + "code: " + this.f85IlIlIIlIII1;
    }

    @Override // IlIIIIllllIlI1.IllIIlIIII1, IlIIIIllllIlI1.llllllIlIIIlll1
    public void IlIlIIlIII1() throws IllIlIllll1.llllIllIl1 {
        super.IlIlIIlIII1();
        if (this.f85IlIlIIlIII1 == 1007 && this.f86lIllIIIlIl1.isEmpty()) {
            throw new IllIlIllll1.llllIllIl1(f73IlIlIIIlIlIlll1, "Received text is no valid utf8 string!");
        }
        if (this.f85IlIlIIlIII1 == 1005 && this.f86lIllIIIlIl1.length() > 0) {
            throw new IllIlIllll1.llllIllIl1(f69lllllIllIl1, "A close frame must have a closecode if it has a reason");
        }
        int i = this.f85IlIlIIlIII1;
        if (i > 1015 && i < 3000) {
            throw new IllIlIllll1.llllIllIl1(f69lllllIllIl1, "Trying to send an illegal close code!");
        }
        if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
            throw new IllIlIllll1.IlIlllIIlI1("closecode must not be sent over the wire: " + this.f85IlIlIIlIII1);
        }
    }

    @Override // IlIIIIllllIlI1.llllllIlIIIlll1, IlIIIIllllIlI1.IlIllIlllIllI1
    public ByteBuffer llllIllIl1() {
        return this.f85IlIlIIlIII1 == 1005 ? ByteBuffer.allocate(0) : this.f89llllIllIl1;
    }

    @Override // IlIIIIllllIlI1.llllllIlIIIlll1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        lIIIIlllllIlll1 liiiilllllilll1 = (lIIIIlllllIlll1) obj;
        if (this.f85IlIlIIlIII1 != liiiilllllilll1.f85IlIlIIlIII1) {
            return false;
        }
        String str = this.f86lIllIIIlIl1;
        return str != null ? str.equals(liiiilllllilll1.f86lIllIIIlIl1) : liiiilllllilll1.f86lIllIIIlIl1 == null;
    }

    @Override // IlIIIIllllIlI1.llllllIlIIIlll1
    public int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.f85IlIlIIlIII1) * 31;
        String str = this.f86lIllIIIlIl1;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void IlIllll1() {
        byte[] lIIIIlllllIlll12 = IlIIIlIlIlIII1.llllIllIl1.lIIIIlllllIlll1(this.f86lIllIIIlIl1);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.f85IlIlIIlIII1);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(lIIIIlllllIlll12.length + 2);
        allocate2.put(allocate);
        allocate2.put(lIIIIlllllIlll12);
        allocate2.rewind();
        this.f89llllIllIl1 = allocate2;
    }

    public void llllIIIIll1(String str) {
        if (str == null) {
            str = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        }
        this.f86lIllIIIlIl1 = str;
        IlIllll1();
    }

    @Override // IlIIIIllllIlI1.llllllIlIIIlll1
    public void llllIIIIll1(ByteBuffer byteBuffer) {
        this.f85IlIlIIlIII1 = f71llIIIIlIlllIII1;
        this.f86lIllIIIlIl1 = lIIlllIIIlllII1.llllIllIl1.f377llllIllIl1;
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.f85IlIlIIlIII1 = f67IIlIllIIll1;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.f85IlIlIIlIII1 = f69lllllIllIl1;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(byteBuffer.getShort());
            allocate.position(0);
            this.f85IlIlIIlIII1 = allocate.getInt();
        }
        byteBuffer.reset();
        try {
            llllIIIIll1(byteBuffer, byteBuffer.position());
        } catch (IllIlIllll1.llllIllIl1 unused) {
            this.f85IlIlIIlIII1 = f73IlIlIIIlIlIlll1;
            this.f86lIllIIIlIl1 = null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public final void llllIIIIll1(
    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:222)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:202)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:58)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
        */
}
