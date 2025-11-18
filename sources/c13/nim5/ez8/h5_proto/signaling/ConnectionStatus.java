package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'CONNECTED' uses external variables
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
/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/ConnectionStatus.class */
public final class ConnectionStatus {
    public static final ConnectionStatus CONNECTED;
    public static final ConnectionStatus RECONNECTING;
    public static final ConnectionStatus DISCONNECTED;
    private static final /* synthetic */ ConnectionStatus[] $VALUES;
    private final int value;

    public static ConnectionStatus[] values() {
        return (ConnectionStatus[]) $VALUES.clone();
    }

    public static ConnectionStatus valueOf(String str) {
        return (ConnectionStatus) Enum.valueOf(ConnectionStatus.class, str);
    }

    private ConnectionStatus(String str, int i, int i2) {
        this.value = i2;
    }

    public static ConnectionStatus fromValue(int i) {
        for (ConnectionStatus connectionStatus : values()) {
            if (connectionStatus.value == i) {
                return connectionStatus;
            }
        }
        return CONNECTED;
    }

    private static /* synthetic */ ConnectionStatus[] $values() {
        return new ConnectionStatus[]{CONNECTED, RECONNECTING, DISCONNECTED};
    }

    static {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        CONNECTED = new ConnectionStatus(lllliiiill1.llllIIIIll1(new byte[]{101, -81, 92, Byte.MAX_VALUE, -28, -104, -87, 97, 98}, new byte[]{38, -32, 18, 49, -95, -37, -3, 36}), 0, 0);
        RECONNECTING = new ConnectionStatus(lllliiiill1.llllIIIIll1(new byte[]{-57, 56, -75, -30, 98, 23, -48, 93, -63, 52, -72, -22}, new byte[]{-107, 125, -10, -83, 44, 89, -107, 30}), 1, 1);
        DISCONNECTED = new ConnectionStatus(lllliiiill1.llllIIIIll1(new byte[]{65, 58, 83, 103, -36, -127, -76, -41, 70, 39, 69, 96}, new byte[]{5, 115, 0, 36, -109, -49, -6, -110}), 2, 2);
        $VALUES = $values();
    }

    public int getValue() {
        return this.value;
    }
}
