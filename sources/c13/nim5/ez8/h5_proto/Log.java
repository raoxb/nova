package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/Log.class */
public class Log {
    private Long timestamp;
    private LogLevel level;
    private String tag;
    private String message;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DEBUG' uses external variables
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
    /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/Log$LogLevel.class */
    public static final class LogLevel {
        public static final LogLevel DEBUG;
        public static final LogLevel INFO;
        public static final LogLevel WARN;
        public static final LogLevel ERROR;
        private static final /* synthetic */ LogLevel[] $VALUES;
        private final String stringValue;
        private final int intValue;

        public static LogLevel[] values() {
            return (LogLevel[]) $VALUES.clone();
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }

        private LogLevel(String str, int i, String str2, int i2) {
            this.stringValue = str2;
            this.intValue = i2;
        }

        public static LogLevel fromValue(Object obj) {
            if (obj == null) {
                return DEBUG;
            }
            if (obj instanceof String) {
                String upperCase = ((String) obj).toUpperCase();
                for (LogLevel logLevel : values()) {
                    if (logLevel.stringValue.equals(upperCase)) {
                        return logLevel;
                    }
                }
            } else if ((obj instanceof Integer) || (obj instanceof Long)) {
                int intValue = ((Number) obj).intValue();
                for (LogLevel logLevel2 : values()) {
                    if (logLevel2.intValue == intValue) {
                        return logLevel2;
                    }
                }
            }
            return DEBUG;
        }

        private static /* synthetic */ LogLevel[] $values() {
            return new LogLevel[]{DEBUG, INFO, WARN, ERROR};
        }

        static {
            llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
            DEBUG = new LogLevel(lllliiiill1.llllIIIIll1(new byte[]{69, 102, -15, 57, Byte.MIN_VALUE}, new byte[]{1, 35, -77, 108, -57, 75, -78, -42}), 0, lllliiiill1.llllIIIIll1(new byte[]{-110, -94, 40, 23, 12}, new byte[]{-42, -25, 106, 66, 75, 111, -49, 88}), 0);
            INFO = new LogLevel(lllliiiill1.llllIIIIll1(new byte[]{-120, 36, -58, -106}, new byte[]{-63, 106, Byte.MIN_VALUE, -39, 71, 14, 28, 97}), 1, lllliiiill1.llllIIIIll1(new byte[]{-58, 105, 0, 1}, new byte[]{-113, 39, 70, 78, 29, -113, 97, -31}), 1);
            WARN = new LogLevel(lllliiiill1.llllIIIIll1(new byte[]{0, 96, 10, 14}, new byte[]{87, 33, 88, 64, -63, 41, 69, -25}), 2, lllliiiill1.llllIIIIll1(new byte[]{53, 84, -107, 6}, new byte[]{98, 21, -57, 72, 99, -124, 62, -52}), 2);
            ERROR = new LogLevel(lllliiiill1.llllIIIIll1(new byte[]{51, -95, 113, 73, -122}, new byte[]{118, -13, 35, 6, -44, -20, 24, 89}), 3, lllliiiill1.llllIIIIll1(new byte[]{-104, 17, 94, 82, -118}, new byte[]{-35, 67, 12, 29, -40, 74, -121, 47}), 3);
            $VALUES = $values();
        }

        public String getStringValue() {
            return this.stringValue;
        }

        public int getIntValue() {
            return this.intValue;
        }

        public String toJsonValue() {
            return this.stringValue;
        }
    }

    public Log() {
        this.timestamp = 0L;
        LogLevel logLevel = LogLevel.DEBUG;
        this.level = logLevel;
        this.tag = llllIllIl1.f377llllIllIl1;
        this.message = llllIllIl1.f377llllIllIl1;
        this.timestamp = 0L;
        this.level = logLevel;
        this.tag = llllIllIl1.f377llllIllIl1;
        this.message = llllIllIl1.f377llllIllIl1;
    }

    public static Log fromJSONObject(JSONObject jSONObject) throws JSONException {
        Log log = new Log();
        byte[] bArr = {75, 100, -71, 124, -118, -81, 3, -75, 79};
        byte[] bArr2 = {63, 13, -44, 25, -7, -37, 98, -40};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{79, -111, -34, -41, -102, 30, -115, -57, 75}, new byte[]{59, -8, -77, -78, -23, 106, -20, -86}))) {
            log.timestamp = Long.valueOf(jSONObject.getLong(lllliiiill1.llllIIIIll1(new byte[]{108, 83, 110, 14, -56, 118, -54, -91, 104}, new byte[]{24, 58, 3, 107, -69, 2, -85, -56})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{-15, -55, -65, -52, -108}, new byte[]{-99, -84, -55, -87, -8, 24, -104, 16})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-53, 4, 101, -46, -72}, new byte[]{-89, 97, 19, -73, -44, 102, 37, -77}))) {
            log.level = LogLevel.fromValue(jSONObject.get(lllliiiill1.llllIIIIll1(new byte[]{-67, 66, -108, 16, 60}, new byte[]{-47, 39, -30, 117, 80, 6, -10, -119})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{-84, -103, 71}, new byte[]{-40, -8, 32, -105, -100, 33, -12, 83})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-20, -16, 121}, new byte[]{-104, -111, 30, 114, 56, 48, 29, 51}))) {
            log.tag = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{-109, 85, -121}, new byte[]{-25, 52, -32, 15, 126, 36, -56, 113}));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{97, -50, 38, 70, 78, 66, -53}, new byte[]{12, -85, 85, 53, 47, 37, -82, -76})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{42, 107, 122, 29, -70, -61, 111}, new byte[]{71, 14, 9, 110, -37, -92, 10, 40}))) {
            log.message = jSONObject.getString(lllliiiill1.llllIIIIll1(new byte[]{-63, -41, -32, -46, 80, -82, 7}, new byte[]{-84, -78, -109, -95, 49, -55, 98, -113}));
        }
        return log;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long l) {
        this.timestamp = Long.valueOf(l != null ? l.longValue() : 0L);
    }

    public LogLevel getLevel() {
        return this.level;
    }

    public void setLevel(LogLevel logLevel) {
        if (logLevel == null) {
            logLevel = LogLevel.DEBUG;
        }
        this.level = logLevel;
    }

    public void setLevelFromValue(Object obj) {
        this.level = LogLevel.fromValue(obj);
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String str) {
        if (str == null) {
            str = llllIllIl1.f377llllIllIl1;
        }
        this.tag = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        if (str == null) {
            str = llllIllIl1.f377llllIllIl1;
        }
        this.message = str;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{-51, 39, 91, 103, 44, -74, 68, 123, -14, 60, 93, 113, 40, -30}, new byte[]{-127, 72, 60, 28, 88, -33, 41, 30}) + this.timestamp + lllliiiill1.llllIIIIll1(new byte[]{-55, 37, 71, 68, 61, -35, 57, -79}, new byte[]{-27, 5, 43, 33, 75, -72, 85, -116}) + this.level + lllliiiill1.llllIIIIll1(new byte[]{-20, 121, -120, -1, -81, 50}, new byte[]{-64, 89, -4, -98, -56, 15, 3, 5}) + this.tag + lllliiiill1.llllIIIIll1(new byte[]{-102, -37, Byte.MAX_VALUE, 117, -80, 125, -52, -54, -45, -58}, new byte[]{-74, -5, 18, 16, -61, 14, -83, -83}) + this.message + lllliiiill1.llllIIIIll1(new byte[]{-59}, new byte[]{-72, -42, -64, -74, -15, -37, -21, -93});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-41, 48, 126, -110, 30, -41, -90, 57, -45}, new byte[]{-93, 89, 19, -9, 109, -93, -57, 84}), this.timestamp);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{66, 29, 84, 116, -65}, new byte[]{46, 120, 34, 17, -45, 107, 91, 52}), this.level.toJsonValue());
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-35, -91, -123}, new byte[]{-87, -60, -30, -37, 2, 97, -13, -45}), this.tag);
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{90, -22, -73, -15, -41, 84, 71}, new byte[]{55, -113, -60, -126, -74, 51, 34, -121}), this.message);
        return jSONObject;
    }
}
