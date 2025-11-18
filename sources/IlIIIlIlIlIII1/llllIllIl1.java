package IlIIIlIlIlIII1;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.jar:IlIIIlIlIlIII1/llllIllIl1.class */
public class llllIllIl1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final CodingErrorAction f127llllIIIIll1 = CodingErrorAction.REPORT;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final int[] f128lIIIIlllllIlll1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 1, 2, 3, 5, 8, 7, 1, 1, 1, 4, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public static byte[] lIIIIlllllIlll1(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] llllIIIIll1(String str) {
        return str.getBytes(StandardCharsets.US_ASCII);
    }

    public static String llllIIIIll1(byte[] bArr) {
        return new String(bArr, 0, bArr.length, StandardCharsets.US_ASCII);
    }

    public static String lIIIIlllllIlll1(byte[] bArr) throws IllIlIllll1.llllIllIl1 {
        return lIIIIlllllIlll1(ByteBuffer.wrap(bArr));
    }

    public static String lIIIIlllllIlll1(ByteBuffer byteBuffer) throws IllIlIllll1.llllIllIl1 {
        CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = f127llllIIIIll1;
        newDecoder.onMalformedInput(codingErrorAction);
        newDecoder.onUnmappableCharacter(codingErrorAction);
        try {
            byteBuffer.mark();
            String charBuffer = newDecoder.decode(byteBuffer).toString();
            byteBuffer.reset();
            return charBuffer;
        } catch (CharacterCodingException e) {
            throw new IllIlIllll1.llllIllIl1(IlIIIIllllIlI1.lIIIIlllllIlll1.f73IlIlIIIlIlIlll1, e);
        }
    }

    public static String llllIIIIll1(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, StandardCharsets.US_ASCII);
    }

    public static boolean llllIIIIll1(ByteBuffer byteBuffer, int i) {
        int remaining = byteBuffer.remaining();
        if (remaining < i) {
            return false;
        }
        int i2 = 0;
        while (i < remaining) {
            int[] iArr = f128lIIIIlllllIlll1;
            int i3 = iArr[(i2 << 4) + 256 + iArr[byteBuffer.get(i) & 255]];
            i2 = i3;
            if (i3 == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean llllIIIIll1(ByteBuffer byteBuffer) {
        return llllIIIIll1(byteBuffer, 0);
    }
}
