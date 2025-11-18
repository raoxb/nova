package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import c13.nim5.ez8.h5_proto.Atom;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/UpdateSignalingStatusRequest.class */
public class UpdateSignalingStatusRequest implements lllllIllIl1 {
    private final Atom atom;
    private final String jobId;
    private final Status status;
    private final String url;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UNKNOWN' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/UpdateSignalingStatusRequest$Status.class */
    public static final class Status {
        public static final Status UNKNOWN;
        public static final Status START;
        public static final Status IN_LANDING;
        public static final Status DONE;
        private static final /* synthetic */ Status[] $VALUES;
        private final int value;

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        private Status(String str, int i, int i2) {
            this.value = i2;
        }

        public static Status fromValue(int i) {
            for (Status status : values()) {
                if (status.value == i) {
                    return status;
                }
            }
            return UNKNOWN;
        }

        private static /* synthetic */ Status[] $values() {
            return new Status[]{UNKNOWN, START, IN_LANDING, DONE};
        }

        static {
            llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
            UNKNOWN = new Status(lllliiiill1.llllIIIIll1(new byte[]{39, -16, 25, 70, -122, -119, -37}, new byte[]{114, -66, 82, 8, -55, -34, -107, -27}), 0, 0);
            START = new Status(lllliiiill1.llllIIIIll1(new byte[]{0, -6, 109, 110, 4}, new byte[]{83, -82, 44, 60, 80, 8, 25, -27}), 1, 1);
            IN_LANDING = new Status(lllliiiill1.llllIIIIll1(new byte[]{-102, 123, 109, 103, 2, -126, -93, -72, -99, 114}, new byte[]{-45, 53, 50, 43, 67, -52, -25, -15}), 2, 2);
            DONE = new Status(lllliiiill1.llllIIIIll1(new byte[]{23, -41, -36, -113}, new byte[]{83, -104, -110, -54, -46, 117, -20, -7}), 3, 3);
            $VALUES = $values();
        }

        public int getValue() {
            return this.value;
        }
    }

    public UpdateSignalingStatusRequest(Atom atom, String str, Status status, String str2) {
        this.atom = atom;
        this.jobId = str;
        this.status = status;
        this.url = str2;
    }

    public static UpdateSignalingStatusRequest fromJSONObject(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        byte[] bArr = {53, 111, 61, -48};
        byte[] bArr2 = {84, 27, 82, -67, 3, -45, -79, 41};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(bArr, bArr2)) != null) {
            jSONObject2 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{24, -60, 43, -9}, new byte[]{121, -80, 68, -102, 38, -35, 27, 118}));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject3 = new JSONObject();
        }
        return new UpdateSignalingStatusRequest(Atom.fromJSONObject(jSONObject2), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-123, -57, -94, -56, 25}, new byte[]{-17, -88, -64, -127, 125, 39, -106, 42}), llllIllIl1.f377llllIllIl1), Status.fromValue(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{-38, 91, 103, 82, 82, -22}, new byte[]{-87, 47, 6, 38, 39, -103, 11, 88}), 0)), jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{106, 45, -65}, new byte[]{31, 95, -45, 94, 105, 74, -29, -91}), llllIllIl1.f377llllIllIl1));
    }

    public Atom getAtom() {
        return this.atom;
    }

    public String getJobId() {
        return this.jobId;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getUrl() {
        return this.url;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{3, 30, 26, -53}, new byte[]{98, 106, 117, -90, 106, -118, 55, 102}), this.atom.toJSONObject());
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{80, 112, -109, -10, 100}, new byte[]{58, 31, -15, -65, 0, 41, -72, -83}), this.jobId);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{72, 125, 103, -32, 108, -80}, new byte[]{59, 9, 6, -108, 25, -61, 81, 25}), this.status.getValue());
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{71, 42, 36}, new byte[]{50, 88, 72, 32, 11, -97, -25, -63}), this.url);
        return jSONObject;
    }
}
