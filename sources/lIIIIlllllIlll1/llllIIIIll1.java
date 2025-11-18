package lIIIIlllllIlll1;

/* loaded from: classes.jar:lIIIIlllllIlll1/llllIIIIll1.class */
public final class llllIIIIll1 {

    /* renamed from: llllIIIIll1, reason: collision with root package name */
    public static final int f331llllIIIIll1 = 0;

    /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
    public static final int f332lIIIIlllllIlll1 = 1;

    /* renamed from: llllIllIl1, reason: collision with root package name */
    public static final int f333llllIllIl1 = 2;

    /* renamed from: IllIIlIIII1, reason: collision with root package name */
    public static final int f334IllIIlIIII1 = 4;

    /* renamed from: IlIlllIIlI1, reason: collision with root package name */
    public static final int f335IlIlllIIlI1 = 8;

    /* loaded from: classes.jar:lIIIIlllllIlll1/llllIIIIll1$IllIIlIIII1.class */
    public static class IllIIlIIII1 extends lIIIIlllllIlll1 {

        /* renamed from: IIlIllIIll1, reason: collision with root package name */
        public static final int f336IIlIllIIll1 = 19;

        /* renamed from: IlIllll1, reason: collision with root package name */
        public static final byte[] f337IlIllll1 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: lllllIllIl1, reason: collision with root package name */
        public static final byte[] f338lllllIllIl1 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: llllIllIl1, reason: collision with root package name */
        public final byte[] f339llllIllIl1;

        /* renamed from: IllIIlIIII1, reason: collision with root package name */
        public int f340IllIIlIIII1;

        /* renamed from: IlIlllIIlI1, reason: collision with root package name */
        public int f341IlIlllIIlI1;

        /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
        public final boolean f342IlIllIlllIllI1;

        /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
        public final boolean f343llllllIlIIIlll1;

        /* renamed from: IlIlIIlIII1, reason: collision with root package name */
        public final boolean f344IlIlIIlIII1;

        /* renamed from: lIllIIIlIl1, reason: collision with root package name */
        public final byte[] f345lIllIIIlIl1;

        @Override // lIIIIlllllIlll1.llllIIIIll1.lIIIIlllllIlll1
        public int llllIIIIll1(int i) {
            return ((i * 8) / 5) + 10;
        }

        public IllIIlIIII1(int i, byte[] bArr) {
            this.f346llllIIIIll1 = bArr;
            this.f342IlIllIlllIllI1 = (i & 1) == 0;
            boolean z = (i & 2) == 0;
            this.f343llllllIlIIIlll1 = z;
            this.f344IlIlIIlIII1 = (i & 4) != 0;
            boolean z2 = z;
            this.f345lIllIIIlIl1 = (i & 8) == 0 ? f337IlIllll1 : f338lllllIllIl1;
            this.f339llllIllIl1 = new byte[2];
            this.f340IllIIlIIII1 = 0;
            this.f341IlIlllIIlI1 = z2 ? 19 : -1;
        }

        @Override // lIIIIlllllIlll1.llllIIIIll1.lIIIIlllllIlll1
        public boolean llllIIIIll1(byte[] bArr, int i, int i2, boolean z) {
            byte b;
            byte b2;
            byte b3;
            int i3;
            byte[] bArr2 = this.f345lIllIIIlIl1;
            byte[] bArr3 = this.f346llllIIIIll1;
            int i4 = 0;
            int i5 = this.f341IlIlllIIlI1;
            int i6 = i2 + i;
            int i7 = -1;
            int i8 = this.f340IllIIlIIII1;
            if (i8 != 1) {
                if (i8 == 2 && (i3 = i + 1) <= i6) {
                    byte[] bArr4 = this.f339llllIllIl1;
                    i7 = ((bArr4[0] & 255) << 16) | ((bArr4[1] & 255) << 8) | (bArr[i] & 255);
                    this.f340IllIIlIIII1 = 0;
                    i = i3;
                }
            } else if (i + 2 <= i6) {
                int i9 = i + 1;
                int i10 = ((this.f339llllIllIl1[0] & 255) << 16) | ((bArr[i] & 255) << 8);
                i += 2;
                i7 = i10 | (bArr[i9] & 255);
                this.f340IllIIlIIII1 = 0;
            }
            if (i7 != -1) {
                bArr3[0] = bArr2[(i7 >> 18) & 63];
                bArr3[1] = bArr2[(i7 >> 12) & 63];
                bArr3[2] = bArr2[(i7 >> 6) & 63];
                i4 = 4;
                bArr3[3] = bArr2[i7 & 63];
                int i11 = i5 - 1;
                i5 = i11;
                if (i11 == 0) {
                    if (this.f344IlIlIIlIII1) {
                        bArr3[4] = 13;
                        i4 = 5;
                    }
                    bArr3[i4] = 10;
                    i5 = 19;
                    i4++;
                }
            }
            while (true) {
                int i12 = i + 3;
                if (i12 > i6) {
                    break;
                }
                int i13 = ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i + 2] & 255);
                bArr3[i4] = bArr2[(i13 >> 18) & 63];
                bArr3[i4 + 1] = bArr2[(i13 >> 12) & 63];
                bArr3[i4 + 2] = bArr2[(i13 >> 6) & 63];
                bArr3[i4 + 3] = bArr2[i13 & 63];
                int i14 = i4 + 4;
                int i15 = i5 - 1;
                i5 = i15;
                if (i15 == 0) {
                    if (this.f344IlIlIIlIII1) {
                        bArr3[i14] = 13;
                        i14 = i4 + 5;
                    }
                    i4 = i14 + 1;
                    bArr3[i14] = 10;
                    i5 = 19;
                    i = i12;
                } else {
                    i4 = i14;
                    i = i12;
                }
            }
            if (z) {
                int i16 = this.f340IllIIlIIII1;
                if (i - i16 == i6 - 1) {
                    int i17 = 0;
                    if (i16 > 0) {
                        i17 = 1;
                        b3 = this.f339llllIllIl1[0];
                    } else {
                        b3 = bArr[i];
                    }
                    int i18 = (b3 & 255) << 4;
                    this.f340IllIIlIIII1 = i16 - i17;
                    bArr3[i4] = bArr2[(i18 >> 6) & 63];
                    int i19 = i4 + 2;
                    bArr3[i4 + 1] = bArr2[i18 & 63];
                    if (this.f342IlIllIlllIllI1) {
                        bArr3[i19] = 61;
                        i19 = i4 + 4;
                        bArr3[i4 + 3] = 61;
                    }
                    if (this.f343llllllIlIIIlll1) {
                        if (this.f344IlIlIIlIII1) {
                            bArr3[i19] = 13;
                            i19++;
                        }
                        bArr3[i19] = 10;
                        i4 = i19 + 1;
                    } else {
                        i4 = i19;
                    }
                } else if (i - i16 == i6 - 2) {
                    int i20 = 0;
                    if (i16 > 1) {
                        i20 = 1;
                        b = this.f339llllIllIl1[0];
                    } else {
                        b = bArr[i];
                        i++;
                    }
                    int i21 = (b & 255) << 10;
                    if (i16 > 0) {
                        int i22 = i20;
                        i20 = i22 + 1;
                        b2 = this.f339llllIllIl1[i22];
                    } else {
                        b2 = bArr[i];
                    }
                    int i23 = i21 | ((b2 & 255) << 2);
                    this.f340IllIIlIIII1 = i16 - i20;
                    bArr3[i4] = bArr2[(i23 >> 12) & 63];
                    bArr3[i4 + 1] = bArr2[(i23 >> 6) & 63];
                    int i24 = i4 + 3;
                    bArr3[i4 + 2] = bArr2[i23 & 63];
                    if (this.f342IlIllIlllIllI1) {
                        bArr3[i24] = 61;
                        i24 = i4 + 4;
                    }
                    if (this.f343llllllIlIIIlll1) {
                        if (this.f344IlIlIIlIII1) {
                            bArr3[i24] = 13;
                            i24++;
                        }
                        bArr3[i24] = 10;
                        i4 = i24 + 1;
                    } else {
                        i4 = i24;
                    }
                } else if (this.f343llllllIlIIIlll1 && i4 > 0 && i5 != 19) {
                    if (this.f344IlIlIIlIII1) {
                        bArr3[i4] = 13;
                        i4++;
                    }
                    bArr3[i4] = 10;
                    i4++;
                }
            } else if (i == i6 - 1) {
                byte[] bArr5 = this.f339llllIllIl1;
                int i25 = this.f340IllIIlIIII1;
                this.f340IllIIlIIII1 = i25 + 1;
                bArr5[i25] = bArr[i];
            } else if (i == i6 - 2) {
                byte[] bArr6 = this.f339llllIllIl1;
                int i26 = this.f340IllIIlIIII1;
                int i27 = i26 + 1;
                this.f340IllIIlIIII1 = i27;
                bArr6[i26] = bArr[i];
                this.f340IllIIlIIII1 = i26 + 2;
                bArr6[i27] = bArr[i + 1];
            }
            this.f347lIIIIlllllIlll1 = i4;
            this.f341IlIlllIIlI1 = i5;
            return true;
        }
    }

    /* loaded from: classes.jar:lIIIIlllllIlll1/llllIIIIll1$lIIIIlllllIlll1.class */
    public static abstract class lIIIIlllllIlll1 {

        /* renamed from: llllIIIIll1, reason: collision with root package name */
        public byte[] f346llllIIIIll1;

        /* renamed from: lIIIIlllllIlll1, reason: collision with root package name */
        public int f347lIIIIlllllIlll1;

        public abstract boolean llllIIIIll1(byte[] bArr, int i, int i2, boolean z);

        public abstract int llllIIIIll1(int i);
    }

    /* loaded from: classes.jar:lIIIIlllllIlll1/llllIIIIll1$llllIllIl1.class */
    public static class llllIllIl1 extends lIIIIlllllIlll1 {

        /* renamed from: IlIllIlllIllI1, reason: collision with root package name */
        public static final int[] f348IlIllIlllIllI1 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: llllllIlIIIlll1, reason: collision with root package name */
        public static final int[] f349llllllIlIIIlll1 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: IlIlIIlIII1, reason: collision with root package name */
        public static final int f350IlIlIIlIII1 = -1;

        /* renamed from: lIllIIIlIl1, reason: collision with root package name */
        public static final int f351lIllIIIlIl1 = -2;

        /* renamed from: llllIllIl1, reason: collision with root package name */
        public int f352llllIllIl1;

        /* renamed from: IllIIlIIII1, reason: collision with root package name */
        public int f353IllIIlIIII1;

        /* renamed from: IlIlllIIlI1, reason: collision with root package name */
        public final int[] f354IlIlllIIlI1;

        @Override // lIIIIlllllIlll1.llllIIIIll1.lIIIIlllllIlll1
        public int llllIIIIll1(int i) {
            return ((i * 3) / 4) + 10;
        }

        public llllIllIl1(int i, byte[] bArr) {
            this.f346llllIIIIll1 = bArr;
            this.f354IlIlllIIlI1 = (i & 8) == 0 ? f348IlIllIlllIllI1 : f349llllllIlIIIlll1;
            this.f352llllIllIl1 = 0;
            this.f353IllIIlIIII1 = 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0243  */
        @Override // lIIIIlllllIlll1.llllIIIIll1.lIIIIlllllIlll1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean llllIIIIll1(byte[] r11, int r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 690
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: lIIIIlllllIlll1.llllIIIIll1.llllIllIl1.llllIIIIll1(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] llllIIIIll1(String str, int i) {
        byte[] bytes = str.getBytes();
        return llllIIIIll1(bytes, 0, bytes.length, i);
    }

    public static byte[] lIIIIlllllIlll1(String str, int i) {
        byte[] bytes = str.getBytes();
        return lIIIIlllllIlll1(bytes, 0, bytes.length, i);
    }

    public static byte[] llllIIIIll1(byte[] bArr, int i) {
        return llllIIIIll1(bArr, 0, bArr.length, i);
    }

    public static byte[] lIIIIlllllIlll1(byte[] bArr, int i) {
        return lIIIIlllllIlll1(bArr, 0, bArr.length, i);
    }

    public static byte[] llllIIIIll1(byte[] bArr, int i, int i2, int i3) {
        llllIllIl1 llllillil1 = new llllIllIl1(i3, new byte[(i2 * 3) / 4]);
        if (llllillil1.llllIIIIll1(bArr, i, i2, true)) {
            int i4 = llllillil1.f347lIIIIlllllIlll1;
            byte[] bArr2 = llllillil1.f346llllIIIIll1;
            if (i4 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            return bArr3;
        }
        throw new IllegalArgumentException(IlIlllIIlI1.IllIIlIIII1.f239llllIIIIll1.llllIIIIll1(new byte[]{19, -33, 61, 102, 64, 39, 70, -7, 92, -120, 109}, new byte[]{113, -66, 89, 70, 34, 70, 53, -100}));
    }

    public static byte[] lIIIIlllllIlll1(byte[] bArr, int i, int i2, int i3) {
        IllIIlIIII1 illIIlIIII1 = new IllIIlIIII1(i3, null);
        int i4 = (i2 / 3) * 4;
        if (illIIlIIII1.f342IlIllIlllIllI1) {
            if (i2 % 3 > 0) {
                i4 += 4;
            }
        } else {
            int i5 = i2 % 3;
            if (i5 == 1) {
                i4 += 2;
            } else if (i5 == 2) {
                i4 += 3;
            }
        }
        if (illIIlIIII1.f343llllllIlIIIlll1 && i2 > 0) {
            i4 = ((((i2 - 1) / 57) + 1) * (illIIlIIII1.f344IlIlIIlIII1 ? 2 : 1)) + i4;
        }
        illIIlIIII1.f346llllIIIIll1 = new byte[i4];
        illIIlIIII1.llllIIIIll1(bArr, i, i2, true);
        return illIIlIIII1.f346llllIIIIll1;
    }
}
