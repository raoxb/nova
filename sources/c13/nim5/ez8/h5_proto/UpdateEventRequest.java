package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;
import IllIIlIIII1.llllIIIIll1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/UpdateEventRequest.class */
public class UpdateEventRequest {
    private Atom atom;
    private List<Event> events;

    public UpdateEventRequest() {
        this.atom = new Atom();
        this.events = new ArrayList();
        this.atom = new Atom();
        this.events = new ArrayList();
    }

    public static UpdateEventRequest fromJSONObject(JSONObject jSONObject) throws JSONException {
        UpdateEventRequest updateEventRequest = new UpdateEventRequest();
        byte[] bArr = {108, -53, -39, -45};
        byte[] bArr2 = {13, -65, -74, -66, -55, -56, -21, 61};
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        if (jSONObject.has(lllliiiill1.llllIIIIll1(bArr, bArr2)) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{78, 44, -29, -25}, new byte[]{47, 88, -116, -118, 25, -55, 25, -78}))) {
            updateEventRequest.atom = Atom.fromJSONObject(jSONObject.getJSONObject(lllliiiill1.llllIIIIll1(new byte[]{-95, -18, 81, 4}, new byte[]{-64, -102, 62, 105, 50, 78, 19, -32})));
        }
        if (jSONObject.has(lllliiiill1.llllIIIIll1(new byte[]{-15, -12, 95, 60, -74, 2}, new byte[]{-108, -126, 58, 82, -62, 113, -9, -110})) && !jSONObject.isNull(lllliiiill1.llllIIIIll1(new byte[]{1, 10, 44, -91, -10, 76}, new byte[]{100, 124, 73, -53, -126, 63, 26, -122}))) {
            JSONArray jSONArray = jSONObject.getJSONArray(lllliiiill1.llllIIIIll1(new byte[]{-68, 88, -42, 110, 59, -117}, new byte[]{-39, 46, -77, 0, 79, -8, 74, -55}));
            updateEventRequest.events = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                updateEventRequest.events.add(Event.fromJSONObject(jSONArray.getJSONObject(i)));
            }
        }
        return updateEventRequest;
    }

    public Atom getAtom() {
        return this.atom;
    }

    public void setAtom(Atom atom) {
        this.atom = atom;
    }

    public List<Event> getEvents() {
        return this.events;
    }

    public void setEvents(List<Event> list) {
        this.events = list;
    }

    public String toString() {
        llllIIIIll1 lllliiiill1 = IllIIlIIII1.f239llllIIIIll1;
        return lllliiiill1.llllIIIIll1(new byte[]{-58, 56, -56, -109, -65, -30, 9, 59, -10, 38, -40, -96, -82, -10, 57, 40, -32, 60, -41, -109, -65, -24, 33, 112}, new byte[]{-109, 72, -84, -14, -53, -121, 76, 77}) + this.atom + lllliiiill1.llllIIIIll1(new byte[]{18, -97, -88, 45, -101, 84, 19, 80, 3}, new byte[]{62, -65, -51, 91, -2, 58, 103, 35}) + this.events + lllliiiill1.llllIIIIll1(new byte[]{-72}, new byte[]{-59, -1, 97, 124, -84, -19, 74, -11});
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.atom != null) {
            jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{28, 26, -123, -39}, new byte[]{125, 110, -22, -76, 45, -27, -40, -67}), this.atom.toJSONObject());
        }
        if (this.events != null) {
            JSONArray jSONArray = new JSONArray();
            for (Event event : this.events) {
                if (event instanceof Event) {
                    jSONArray.put(event.toJSONObject());
                } else {
                    jSONArray.put(event);
                }
            }
            jSONObject.put(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{34, 22, -117, -114, -65, -58}, new byte[]{71, 96, -18, -32, -53, -75, -43, -77}), jSONArray);
        }
        return jSONObject;
    }
}
