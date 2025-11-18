package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/ControlCommand.class */
public abstract class ControlCommand implements lllllIllIl1 {

    /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/ControlCommand$Click.class */
    public static class Click extends ControlCommand {
        private final ClickEvent click;

        public Click(ClickEvent clickEvent) {
            this.click = clickEvent;
        }

        public ClickEvent getClick() {
            return this.click;
        }

        @Override // lIllIIIlIl1.lllllIllIl1
        public JSONObject toJSONObject() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
            jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-109, 123, -67, -32, -43, 36, 30, 66, -124, 109, -96, -24}, new byte[]{-16, 20, -48, -115, -76, 74, 122, 29}), lllliiiill1.llllIIIIll1(new byte[]{-103, 103, 25, 61, 61}, new byte[]{-6, 11, 112, 94, 86, -17, 64, -124}));
            jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{87, -11, -20, -111, -13}, new byte[]{52, -103, -123, -14, -104, -27, -3, -111}), this.click.toJSONObject());
            return jSONObject;
        }
    }

    /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/ControlCommand$Input.class */
    public static class Input extends ControlCommand {
        private final TextInput input;

        public Input(TextInput textInput) {
            this.input = textInput;
        }

        public TextInput getInput() {
            return this.input;
        }

        @Override // lIllIIIlIl1.lllllIllIl1
        public JSONObject toJSONObject() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
            jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{65, -34, 94, -49, 93, 63, -31, -74, 86, -56, 67, -57}, new byte[]{34, -79, 51, -94, 60, 81, -123, -23}), lllliiiill1.llllIIIIll1(new byte[]{-79, -109, 109, -106, 45}, new byte[]{-40, -3, 29, -29, 89, 85, 38, Byte.MIN_VALUE}));
            jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-73, -23, -118, 44, 126}, new byte[]{-34, -121, -6, 89, 10, 33, -26, -115}), this.input.toJSONObject());
            return jSONObject;
        }
    }

    /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/ControlCommand$Scroll.class */
    public static class Scroll extends ControlCommand {
        private final ScrollEvent scroll;

        public Scroll(ScrollEvent scrollEvent) {
            this.scroll = scrollEvent;
        }

        public ScrollEvent getScroll() {
            return this.scroll;
        }

        @Override // lIllIIIlIl1.lllllIllIl1
        public JSONObject toJSONObject() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
            jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-19, -112, 7, -126, 34, -102, 28, -121, -6, -122, 26, -118}, new byte[]{-114, -1, 106, -17, 67, -12, 120, -40}), lllliiiill1.llllIIIIll1(new byte[]{-59, 3, -76, 97, 28, 104}, new byte[]{-74, 96, -58, 14, 112, 4, 85, -121}));
            jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{6, -52, 41, -47, -85, 95}, new byte[]{117, -81, 91, -66, -57, 51, -103, -108}), this.scroll.toJSONObject());
            return jSONObject;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ControlCommand fromJSONObject(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        String optString = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{89, -41, 99, 26, -45, 49, -89, 119, 78, -63, 126, 18}, new byte[]{58, -72, 14, 119, -78, 95, -61, 40}), llllIllIl1.f377llllIllIl1);
        boolean z = -1;
        int hashCode = optString.hashCode();
        if (hashCode != -907680051) {
            if (hashCode != 94750088) {
                if (hashCode == 100358090 && optString.equals(lllliiiill1.llllIIIIll1(new byte[]{106, 50, 100, 107, 56}, new byte[]{3, 92, 20, 30, 76, 82, 9, 10}))) {
                    z = 2;
                }
            } else if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{92, -112, -15, 60, 24}, new byte[]{63, -4, -104, 95, 115, -12, -46, 120}))) {
                z = false;
            }
        } else if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{88, 13, 48, -100, 61, 56}, new byte[]{43, 110, 66, -13, 81, 84, -115, 47}))) {
            z = true;
        }
        if (!z) {
            if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{111, 6, 9, -111, 96}, new byte[]{12, 106, 96, -14, 11, -40, -40, -100})) != null) {
                jSONObject2 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{103, 38, -62, 113, -81}, new byte[]{4, 74, -85, 18, -60, -68, 23, 14}));
            } else {
                jSONObject2 = r0;
                JSONObject jSONObject5 = new JSONObject();
            }
            return new Click(ClickEvent.fromJSONObject(jSONObject2));
        }
        if (z) {
            if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{113, -18, -16, -33, -77, 72}, new byte[]{2, -115, -126, -80, -33, 36, 13, -8})) != null) {
                jSONObject3 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-54, -55, -63, 102, 37, -19}, new byte[]{-71, -86, -77, 9, 73, -127, 72, 1}));
            } else {
                jSONObject3 = r0;
                JSONObject jSONObject6 = new JSONObject();
            }
            return new Scroll(ScrollEvent.fromJSONObject(jSONObject3));
        }
        if (z != 2) {
            throw new IllegalArgumentException(lllliiiill1.llllIIIIll1(new byte[]{-118, 79, 65, 83, -66, -125, -120, -98, -68, 78, 71, 80, -80, -102, -126, -98, -85, 88, 90, 88, -21, -44}, new byte[]{-33, 33, 42, 61, -47, -12, -26, -66}).concat(optString));
        }
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-108, 74, 84, -127, -75}, new byte[]{-3, 36, 36, -12, -63, 47, -88, -112})) != null) {
            jSONObject4 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{73, -34, 14, -91, 121}, new byte[]{32, -80, 126, -48, 13, -113, -105, 35}));
        } else {
            jSONObject4 = r0;
            JSONObject jSONObject7 = new JSONObject();
        }
        return new Input(TextInput.fromJSONObject(jSONObject4));
    }
}
