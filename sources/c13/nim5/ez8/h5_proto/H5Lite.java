package c13.nim5.ez8.h5_proto;

import IlIlllIIlI1.IllIIlIIII1;

/* loaded from: classes.jar:c13/nim5/ez8/h5_proto/H5Lite.class */
public class H5Lite {
    public static final H5Lite INSTANCE = new H5Lite(IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{10, -12, 106, -1, -74, -127, 10, -92, 2, -15, 101, -28}, new byte[]{110, -104, 6, -113, -47, -27, 36, -57}));
    private final HttpGatewayClient httpClient;

    public H5Lite(String str) {
        this.httpClient = new HttpGatewayClient(str);
    }

    public CommonResponse updateLog(UpdateLogRequest updateLogRequest) throws Exception {
        return this.httpClient.updateLog(updateLogRequest);
    }

    public CommonResponse updateEvent(UpdateEventRequest updateEventRequest) throws Exception {
        return this.httpClient.updateEvent(updateEventRequest);
    }

    public H5Lite(String str, int i, boolean z) {
        this.httpClient = new HttpGatewayClient(str, i, z);
    }
}
