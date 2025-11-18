package lIllIlIll1;

/* loaded from: classes.jar:lIllIlIll1/lIllIIIlIl1.class */
public interface lIllIIIlIl1 {
    void setConfig(String str, String str2);

    String getConfig();

    String detectCloseBtn();

    void debugLog(String str);

    void done(String str);

    void touch(float f, float f2);

    boolean scroll(float f, float f2, float f3, float f4, long j);

    String screenshot();

    long getTime();

    void setTime(long j);

    String getGAID();

    void upload_log(String str);

    void upload_event(String str);

    boolean isSignaling();

    void updateSignalStatus(int i);

    void back();
}
