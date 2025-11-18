package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import c13.nim5.ez8.h5_proto.Atom;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingRequest.class */
public class SignalingRequest implements lllllIllIl1 {
    private final Content content;
    private final Atom atom;

    /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingRequest$Content.class */
    public static abstract class Content implements lllllIllIl1 {

        /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingRequest$Content$Control.class */
        public static class Control extends Content {
            private final ControlCommand control;

            public Control(ControlCommand controlCommand) {
                this.control = controlCommand;
            }

            public ControlCommand getControl() {
                return this.control;
            }

            @Override // lIllIIIlIl1.lllllIllIl1
            public JSONObject toJSONObject() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-42, 15, -41, 111, -112, 79, 102, -126, -63, 25, -55, 126}, new byte[]{-75, 96, -71, 27, -11, 33, 18, -35}), lllliiiill1.llllIIIIll1(new byte[]{97, -69, 24, -77, 26, 50, 17}, new byte[]{2, -44, 118, -57, 104, 93, 125, -45}));
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{8, -81, 61, -24, -63, 42, -5}, new byte[]{107, -64, 83, -100, -77, 69, -105, -7}), this.control.toJSONObject());
                return jSONObject;
            }
        }

        /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingRequest$Content$IceCandidate.class */
        public static class IceCandidate extends Content {
            private final ICECandidate iceCandidate;

            public IceCandidate(ICECandidate iCECandidate) {
                this.iceCandidate = iCECandidate;
            }

            public ICECandidate getIceCandidate() {
                return this.iceCandidate;
            }

            @Override // lIllIIIlIl1.lllllIllIl1
            public JSONObject toJSONObject() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-45, -62, -75, -48, 4, -93, 61, -32, -60, -44, -85, -63}, new byte[]{-80, -83, -37, -92, 97, -51, 73, -65}), lllliiiill1.llllIIIIll1(new byte[]{-103, 24, -110, 94, 111, -86, -21, -110, -103, 31, -106, 117, 105}, new byte[]{-16, 123, -9, 1, 12, -53, -123, -10}));
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-16, 30, -55, 53, -68, -29, 97, 102, -16, 25, -51, 30, -70}, new byte[]{-103, 125, -84, 106, -33, -126, 15, 2}), this.iceCandidate.toJSONObject());
                return jSONObject;
            }
        }

        /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingRequest$Content$PingMessage.class */
        public static class PingMessage extends Content {
            private final Ping ping;

            public PingMessage(Ping ping) {
                this.ping = ping;
            }

            public Ping getPing() {
                return this.ping;
            }

            @Override // lIllIIIlIl1.lllllIllIl1
            public JSONObject toJSONObject() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-77, -19, -120, -48, -61, -8, 46, 90, -92, -5, -106, -63}, new byte[]{-48, -126, -26, -92, -90, -106, 90, 5}), lllliiiill1.llllIIIIll1(new byte[]{-41, 11, -50, -51}, new byte[]{-89, 98, -96, -86, -39, -83, -108, -66}));
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-48, 102, 48, 72}, new byte[]{-96, 15, 94, 47, -25, -122, -126, 93}), this.ping.toJSONObject());
                return jSONObject;
            }
        }

        /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingRequest$Content$SdpAnswer.class */
        public static class SdpAnswer extends Content {
            private final SDPAnswer sdpAnswer;

            public SdpAnswer(SDPAnswer sDPAnswer) {
                this.sdpAnswer = sDPAnswer;
            }

            public SDPAnswer getSdpAnswer() {
                return this.sdpAnswer;
            }

            @Override // lIllIIIlIl1.lllllIllIl1
            public JSONObject toJSONObject() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-79, 95, -53, 48, 96, -106, -78, -105, -90, 73, -43, 33}, new byte[]{-46, 48, -91, 68, 5, -8, -58, -56}), lllliiiill1.llllIIIIll1(new byte[]{-26, -110, -1, -67, -3, -50, 56, 81, -16, -124}, new byte[]{-107, -10, -113, -30, -100, -96, 75, 38}));
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-121, -127, -4, -81, -77, -10, -9, 30, -111, -105}, new byte[]{-12, -27, -116, -16, -46, -104, -124, 105}), this.sdpAnswer.toJSONObject());
                return jSONObject;
            }
        }

        /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingRequest$Content$SdpOffer.class */
        public static class SdpOffer extends Content {
            private final SDPOffer sdpOffer;

            public SdpOffer(SDPOffer sDPOffer) {
                this.sdpOffer = sDPOffer;
            }

            public SDPOffer getSdpOffer() {
                return this.sdpOffer;
            }

            @Override // lIllIIIlIl1.lllllIllIl1
            public JSONObject toJSONObject() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-84, 108, -83, Byte.MAX_VALUE, 98, -4, 12, -95, -69, 122, -77, 110}, new byte[]{-49, 3, -61, 11, 7, -110, 120, -2}), lllliiiill1.llllIIIIll1(new byte[]{-108, -119, -101, -27, 33, -45, 45, 23, -107}, new byte[]{-25, -19, -21, -70, 78, -75, 75, 114}));
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{29, 116, 100, 52, 34, 50, -59, 17, 28}, new byte[]{110, 16, 20, 107, 77, 84, -93, 116}), this.sdpOffer.toJSONObject());
                return jSONObject;
            }
        }

        public static Content fromJSONObject(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            JSONObject jSONObject4;
            JSONObject jSONObject5;
            JSONObject jSONObject6;
            llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
            String optString = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-77, 14, 124, 76, -13, 14, -86, 42, -92, 24, 98, 93}, new byte[]{-48, 97, 18, 56, -106, 96, -34, 117}), llllIllIl1.f377llllIllIl1);
            boolean z = -1;
            switch (optString.hashCode()) {
                case -69874084:
                    if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{-127, 121, -105, -62, -36, -120, 76, 63, Byte.MIN_VALUE}, new byte[]{-14, 29, -25, -99, -77, -18, 42, 90}))) {
                        z = false;
                        break;
                    }
                    break;
                case 3441010:
                    if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{79, 103, 16, -42}, new byte[]{63, 14, 126, -79, -100, 111, -6, 38}))) {
                        z = 4;
                        break;
                    }
                    break;
                case 951543133:
                    if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{12, 110, -23, 53, 49, 110, 22}, new byte[]{111, 1, -121, 65, 67, 1, 122, -81}))) {
                        z = 3;
                        break;
                    }
                    break;
                case 1362998479:
                    if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{-70, 18, -3, 97, -91, -61, 58, 29, -70, 21, -7, 74, -93}, new byte[]{-45, 113, -104, 62, -58, -94, 84, 121}))) {
                        z = 2;
                        break;
                    }
                    break;
                case 1735855038:
                    if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{-39, -96, 50, -127, -104, 67, 59, -122, -49, -74}, new byte[]{-86, -60, 66, -34, -7, 45, 72, -15}))) {
                        z = true;
                        break;
                    }
                    break;
            }
            switch (z) {
                case false:
                    if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-53, -91, 49, 109, 108, -56, 31, 10, -54}, new byte[]{-72, -63, 65, 50, 3, -82, 121, 111})) != null) {
                        jSONObject2 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{125, -21, 44, 38, -5, 44, -45, 74, 124}, new byte[]{14, -113, 92, 121, -108, 74, -75, 47}));
                    } else {
                        jSONObject2 = r0;
                        JSONObject jSONObject7 = new JSONObject();
                    }
                    return new SdpOffer(SDPOffer.fromJSONObject(jSONObject2));
                case true:
                    if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{18, -79, -71, 60, -99, 10, -18, 82, 4, -89}, new byte[]{97, -43, -55, 99, -4, 100, -99, 37})) != null) {
                        jSONObject3 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{40, -96, 26, -1, 119, 61, -117, -123, 62, -74}, new byte[]{91, -60, 106, -96, 22, 83, -8, -14}));
                    } else {
                        jSONObject3 = r0;
                        JSONObject jSONObject8 = new JSONObject();
                    }
                    return new SdpAnswer(SDPAnswer.fromJSONObject(jSONObject3));
                case true:
                    if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{114, 17, 115, -91, -25, 121, -70, 6, 114, 22, 119, -114, -31}, new byte[]{27, 114, 22, -6, -124, 24, -44, 98})) != null) {
                        jSONObject4 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-115, -74, Byte.MIN_VALUE, -41, 35, -109, -35, -107, -115, -79, -124, -4, 37}, new byte[]{-28, -43, -27, -120, 64, -14, -77, -15}));
                    } else {
                        jSONObject4 = r0;
                        JSONObject jSONObject9 = new JSONObject();
                    }
                    return new IceCandidate(ICECandidate.fromJSONObject(jSONObject4));
                case true:
                    if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-32, -89, -105, -11, 24, 8, 43}, new byte[]{-125, -56, -7, -127, 106, 103, 71, -71})) != null) {
                        jSONObject5 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-38, 35, -39, 37, 108, -90, 15}, new byte[]{-71, 76, -73, 81, 30, -55, 99, 28}));
                    } else {
                        jSONObject5 = r0;
                        JSONObject jSONObject10 = new JSONObject();
                    }
                    return new Control(ControlCommand.fromJSONObject(jSONObject5));
                case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                    if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{34, 101, -21, 60}, new byte[]{82, 12, -123, 91, -80, -107, 58, 66})) != null) {
                        jSONObject6 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-23, 38, 33, 109}, new byte[]{-103, 79, 79, 10, -53, 95, 77, 35}));
                    } else {
                        jSONObject6 = r0;
                        JSONObject jSONObject11 = new JSONObject();
                    }
                    return new PingMessage(Ping.fromJSONObject(jSONObject6));
                default:
                    throw new IllegalArgumentException(lllliiiill1.llllIIIIll1(new byte[]{1, 3, 36, 24, 98, 82, -38, -27, 55, 2, 33, 2, 104, 75, -64, -27, 32, 20, 63, 19, 55, 5}, new byte[]{84, 109, 79, 118, 13, 37, -76, -59}).concat(optString));
            }
        }
    }

    public SignalingRequest(Content content, Atom atom) {
        this.content = content;
        this.atom = atom;
    }

    public static SignalingRequest fromJSONObject(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        byte[] bArr = {59, 47, 45, -46, 75, -4, -63};
        byte[] bArr2 = {88, 64, 67, -90, 46, -110, -75, 89};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(bArr, bArr2)) != null) {
            jSONObject2 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{76, 76, 78, -48, 64, 6, -120}, new byte[]{47, 35, 32, -92, 37, 104, -4, -5}));
        } else {
            jSONObject2 = r0;
            JSONObject jSONObject4 = new JSONObject();
        }
        Content fromJSONObject = Content.fromJSONObject(jSONObject2);
        if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{122, -9, -118, 39}, new byte[]{27, -125, -27, 74, 43, 70, 110, 30})) != null) {
            jSONObject3 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{76, -12, 114, 26}, new byte[]{45, Byte.MIN_VALUE, 29, 119, 124, -42, -106, -42}));
        } else {
            jSONObject3 = r0;
            JSONObject jSONObject5 = new JSONObject();
        }
        return new SignalingRequest(fromJSONObject, Atom.fromJSONObject(jSONObject3));
    }

    public Content getContent() {
        return this.content;
    }

    public Atom getAtom() {
        return this.atom;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{54, -90, 70, 33, 39, 58, 116}, new byte[]{85, -55, 40, 85, 66, 84, 0, -75}), this.content.toJSONObject());
        jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{91, -58, -110, -28}, new byte[]{58, -78, -3, -119, -55, -99, -30, -122}), this.atom.toJSONObject());
        return jSONObject;
    }
}
