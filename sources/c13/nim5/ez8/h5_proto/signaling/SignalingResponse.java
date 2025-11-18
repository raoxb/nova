package c13.nim5.ez8.h5_proto.signaling;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import lIIlllIIIlllII1.llllIllIl1;
import lIllIIIlIl1.lllllIllIl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingResponse.class */
public class SignalingResponse implements lllllIllIl1 {
    private final Content content;
    private final Error error;

    /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingResponse$Content.class */
    public static abstract class Content implements lllllIllIl1 {

        /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingResponse$Content$DoneMessage.class */
        public static class DoneMessage extends Content {
            private final Done done;

            public DoneMessage(Done done) {
                this.done = done;
            }

            public Done getDone() {
                return this.done;
            }

            @Override // lIllIIIlIl1.lllllIllIl1
            public JSONObject toJSONObject() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-8, -107, 105, -70, 44, -13, 10, 117, -17, -125, 119, -85}, new byte[]{-101, -6, 7, -50, 73, -99, 126, 42}), lllliiiill1.llllIIIIll1(new byte[]{-63, -16, 58, -50}, new byte[]{-91, -97, 84, -85, 71, -77, -19, -43}));
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-7, -65, -28, 38}, new byte[]{-99, -48, -118, 67, 48, 41, -13, 99}), this.done.toJSONObject());
                return jSONObject;
            }
        }

        /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingResponse$Content$IceCandidate.class */
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
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{30, 49, 95, -116, 25, -80, 54, 16, 9, 39, 65, -99}, new byte[]{125, 94, 49, -8, 124, -34, 66, 79}), lllliiiill1.llllIIIIll1(new byte[]{58, 42, -95, 104, 70, -23, -102, 106, 58, 45, -91, 67, 64}, new byte[]{83, 73, -60, 55, 37, -120, -12, 14}));
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{102, 98, 102, -23, 124, 98, -38, -71, 102, 101, 98, -62, 122}, new byte[]{15, 1, 3, -74, 31, 3, -76, -35}), this.iceCandidate.toJSONObject());
                return jSONObject;
            }
        }

        /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingResponse$Content$PongMessage.class */
        public static class PongMessage extends Content {
            private final Pong pong;

            public PongMessage(Pong pong) {
                this.pong = pong;
            }

            public Pong getPong() {
                return this.pong;
            }

            @Override // lIllIIIlIl1.lllllIllIl1
            public JSONObject toJSONObject() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-53, -122, -4, -28, 27, -33, -103, 6, -36, -112, -30, -11}, new byte[]{-88, -23, -110, -112, 126, -79, -19, 89}), lllliiiill1.llllIIIIll1(new byte[]{-98, -33, -8, -59}, new byte[]{-18, -80, -106, -94, 109, -54, 38, -93}));
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-90, 84, 38, 12}, new byte[]{-42, 59, 72, 107, 65, 121, 58, -4}), this.pong.toJSONObject());
                return jSONObject;
            }
        }

        /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingResponse$Content$SdpAnswer.class */
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
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-77, -38, -105, -33, -26, -87, 54, -107, -92, -52, -119, -50}, new byte[]{-48, -75, -7, -85, -125, -57, 66, -54}), lllliiiill1.llllIIIIll1(new byte[]{95, 34, -57, 94, 95, -83, -95, -77, 73, 52}, new byte[]{44, 70, -73, 1, 62, -61, -46, -60}));
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-53, 105, -62, Byte.MAX_VALUE, 47, -18, -22, 124, -35, Byte.MAX_VALUE}, new byte[]{-72, 13, -78, 32, 78, Byte.MIN_VALUE, -103, 11}), this.sdpAnswer.toJSONObject());
                return jSONObject;
            }
        }

        /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingResponse$Content$SdpOffer.class */
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
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{126, -104, -123, -112, -111, 92, 105, -109, 105, -114, -101, -127}, new byte[]{29, -9, -21, -28, -12, 50, 29, -52}), lllliiiill1.llllIIIIll1(new byte[]{-59, 6, 38, -77, -52, -59, 14, -104, -60}, new byte[]{-74, 98, 86, -20, -93, -93, 104, -3}));
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-10, 85, -3, 68, 74, -28, 66, -98, -9}, new byte[]{-123, 49, -115, 27, 37, -126, 36, -5}), this.sdpOffer.toJSONObject());
                return jSONObject;
            }
        }

        /* loaded from: classes.jar:c13/nim5/ez8/h5_proto/signaling/SignalingResponse$Content$Status.class */
        public static class Status extends Content {
            private final ConnectionStatus status;

            public Status(ConnectionStatus connectionStatus) {
                this.status = connectionStatus;
            }

            public ConnectionStatus getStatus() {
                return this.status;
            }

            @Override // lIllIIIlIl1.lllllIllIl1
            public JSONObject toJSONObject() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-54, 107, -95, 92, 95, -63, 39, 34, -35, 125, -65, 77}, new byte[]{-87, 4, -49, 40, 58, -81, 83, 125}), lllliiiill1.llllIIIIll1(new byte[]{-115, 52, -41, -72, 4, 114}, new byte[]{-2, 64, -74, -52, 113, 1, 53, 9}));
                jSONObject.put(lllliiiill1.llllIIIIll1(new byte[]{-105, -40, 67, -91, 45, -41}, new byte[]{-28, -84, 34, -47, 88, -92, 79, -93}), this.status.getValue());
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
            String optString = jSONObject.optString(lllliiiill1.llllIIIIll1(new byte[]{-104, -48, -53, 1, Byte.MIN_VALUE, -84, Byte.MAX_VALUE, 120, -113, -58, -43, 16}, new byte[]{-5, -65, -91, 117, -27, -62, 11, 39}), llllIllIl1.f377llllIllIl1);
            boolean z = -1;
            switch (optString.hashCode()) {
                case -892481550:
                    if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{-73, -47, 79, -103, 40, 40}, new byte[]{-60, -91, 46, -19, 93, 91, -53, -71}))) {
                        z = 3;
                        break;
                    }
                    break;
                case -69874084:
                    if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{109, 105, 91, 62, 81, -123, Byte.MAX_VALUE, -33, 108}, new byte[]{30, 13, 43, 97, 62, -29, 25, -70}))) {
                        z = false;
                        break;
                    }
                    break;
                case 3089282:
                    if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{-103, -51, -81, -86}, new byte[]{-3, -94, -63, -49, 11, -4, 64, 4}))) {
                        z = 5;
                        break;
                    }
                    break;
                case 3446776:
                    if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{17, -90, 76, -15}, new byte[]{97, -55, 34, -106, 46, -104, -75, 120}))) {
                        z = 4;
                        break;
                    }
                    break;
                case 1362998479:
                    if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{56, -48, -126, -18, -60, 104, -125, -68, 56, -41, -122, -59, -62}, new byte[]{81, -77, -25, -79, -89, 9, -19, -40}))) {
                        z = 2;
                        break;
                    }
                    break;
                case 1735855038:
                    if (optString.equals(lllliiiill1.llllIIIIll1(new byte[]{-65, -41, 40, 42, -54, 121, -53, 118, -87, -63}, new byte[]{-52, -77, 88, 117, -85, 23, -72, 1}))) {
                        z = true;
                        break;
                    }
                    break;
            }
            switch (z) {
                case false:
                    if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-23, 80, 70, -101, -80, -30, 53, -11, -24}, new byte[]{-102, 52, 54, -60, -33, -124, 83, -112})) != null) {
                        jSONObject2 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{124, 44, 29, 74, -123, -88, 14, 28, 125}, new byte[]{15, 72, 109, 21, -22, -50, 104, 121}));
                    } else {
                        jSONObject2 = r0;
                        JSONObject jSONObject7 = new JSONObject();
                    }
                    return new SdpOffer(SDPOffer.fromJSONObject(jSONObject2));
                case true:
                    if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{67, 41, -87, -68, 80, -38, 110, 2, 85, 63}, new byte[]{48, 77, -39, -29, 49, -76, 29, 117})) != null) {
                        jSONObject3 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-80, 114, 34, 75, -107, 114, 109, 64, -90, 100}, new byte[]{-61, 22, 82, 20, -12, 28, 30, 55}));
                    } else {
                        jSONObject3 = r0;
                        JSONObject jSONObject8 = new JSONObject();
                    }
                    return new SdpAnswer(SDPAnswer.fromJSONObject(jSONObject3));
                case true:
                    if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{67, 83, -90, 108, 71, -93, 33, 53, 67, 84, -94, 71, 65}, new byte[]{42, 48, -61, 51, 36, -62, 79, 81})) != null) {
                        jSONObject4 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-126, -99, -70, 18, -77, 60, -107, 50, -126, -102, -66, 57, -75}, new byte[]{-21, -2, -33, 77, -48, 93, -5, 86}));
                    } else {
                        jSONObject4 = r0;
                        JSONObject jSONObject9 = new JSONObject();
                    }
                    return new IceCandidate(ICECandidate.fromJSONObject(jSONObject4));
                case true:
                    return new Status(ConnectionStatus.fromValue(jSONObject.optInt(lllliiiill1.llllIIIIll1(new byte[]{97, -111, 25, 71, -18, 100}, new byte[]{18, -27, 120, 51, -101, 23, -109, 30}), 0)));
                case lIIIIlllllIlll1.llllIIIIll1.f334IllIIlIIII1 /* 4 */:
                    if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{95, 15, 49, 57}, new byte[]{47, 96, 95, 94, 22, -72, -98, 63})) != null) {
                        jSONObject5 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{32, -26, -21, -66}, new byte[]{80, -119, -123, -39, 34, 124, 83, -40}));
                    } else {
                        jSONObject5 = r0;
                        JSONObject jSONObject10 = new JSONObject();
                    }
                    return new PongMessage(Pong.fromJSONObject(jSONObject5));
                case IlIlIIlIII1.IllIIlIIII1.f161lllllIllIl1 /* 5 */:
                    if (jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-113, 122, -73, 7}, new byte[]{-21, 21, -39, 98, -20, 33, -57, -114})) != null) {
                        jSONObject6 = jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{92, -57, -37, -25}, new byte[]{56, -88, -75, -126, -17, -10, 61, 2}));
                    } else {
                        jSONObject6 = r0;
                        JSONObject jSONObject11 = new JSONObject();
                    }
                    return new DoneMessage(Done.fromJSONObject(jSONObject6));
                default:
                    throw new IllegalArgumentException(lllliiiill1.llllIIIIll1(new byte[]{-45, 19, 62, 45, -90, 103, 36, -90, -27, 18, 59, 55, -84, 126, 62, -90, -14, 4, 37, 38, -13, 48}, new byte[]{-122, 125, 85, 67, -55, 16, 74, -122}).concat(optString));
            }
        }
    }

    public SignalingResponse(Content content, Error error) {
        this.content = content;
        this.error = error;
    }

    public static SignalingResponse fromJSONObject(JSONObject jSONObject) throws JSONException {
        Content content = null;
        byte[] bArr = {-1, 41, -15, 84, 96, 112, -3};
        byte[] bArr2 = {-100, 70, -97, 32, 5, 30, -119, 101};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{-56, -18, 23, -46, 48, 117, 124}, new byte[]{-85, -127, 121, -90, 85, 27, 8, 76}))) {
            content = Content.fromJSONObject(jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{55, 35, 66, 98, 73, 116, 33}, new byte[]{84, 76, 44, 22, 44, 26, 85, -16})));
        }
        Error error = null;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{91, -69, -54, -66, -70}, new byte[]{62, -55, -72, -47, -56, 36, -32, -33})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{70, 52, 82, 85, -42}, new byte[]{35, 70, 32, 58, -92, -83, 4, -33}))) {
            error = Error.fromJSONObject(jSONObject.optJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-118, 2, -117, -96, 42}, new byte[]{-17, 112, -7, -49, 88, -19, 104, 24})));
        }
        return new SignalingResponse(content, error);
    }

    public Content getContent() {
        return this.content;
    }

    public Error getError() {
        return this.error;
    }

    @Override // lIllIIIlIl1.lllllIllIl1
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.content != null) {
            jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{-44, -87, 74, -121, -104, -58, -100}, new byte[]{-73, -58, 36, -13, -3, -88, -24, 4}), this.content.toJSONObject());
        }
        if (this.error != null) {
            jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{55, 7, -79, 20, -8}, new byte[]{82, 117, -61, 123, -118, -104, -72, 96}), this.error.toJSONObject());
        }
        return jSONObject;
    }
}
