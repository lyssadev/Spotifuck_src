package p098r1;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import p030Q0.AbstractC0328E;

/* renamed from: r1.h */
/* loaded from: classes.dex */
public class C1268h implements Serializable, Comparable {

    /* renamed from: d */
    public static final char[] f5045d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e */
    public static final C1268h f5046e = m3018i(new byte[0]);

    /* renamed from: a */
    public final byte[] f5047a;

    /* renamed from: b */
    public transient int f5048b;

    /* renamed from: c */
    public transient String f5049c;

    public C1268h(byte[] bArr) {
        this.f5047a = bArr;
    }

    /* renamed from: b */
    public static C1268h m3014b(String str) {
        int i;
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                    i = cCharAt2 - 'A';
                } else if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                    i = cCharAt2 - 'G';
                } else if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i3++;
                    } else {
                        i = 63;
                    }
                } else {
                    i = 62;
                }
                i5 = (i5 << 6) | ((byte) i);
                i4++;
                if (i4 % 4 == 0) {
                    bArr[i6] = (byte) (i5 >> 16);
                    int i7 = i6 + 2;
                    bArr[i6 + 1] = (byte) (i5 >> 8);
                    i6 += 3;
                    bArr[i7] = (byte) i5;
                }
                i3++;
            } else {
                int i8 = i4 % 4;
                if (i8 == 1) {
                    break;
                }
                if (i8 == 2) {
                    bArr[i6] = (byte) ((i5 << 12) >> 16);
                    i6++;
                } else if (i8 == 3) {
                    int i9 = i5 << 6;
                    int i10 = i6 + 1;
                    bArr[i6] = (byte) (i9 >> 16);
                    i6 += 2;
                    bArr[i10] = (byte) (i9 >> 8);
                }
                if (i6 != i2) {
                    byte[] bArr2 = new byte[i6];
                    System.arraycopy(bArr, 0, bArr2, 0, i6);
                    bArr = bArr2;
                }
            }
        }
        bArr = null;
        if (bArr != null) {
            return new C1268h(bArr);
        }
        return null;
    }

    /* renamed from: c */
    public static void m3015c(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (m3016d(str.charAt(i2 + 1)) + (m3016d(str.charAt(i2)) << 4));
        }
        m3018i(bArr);
    }

    /* renamed from: d */
    public static int m3016d(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 'W';
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    /* renamed from: f */
    public static C1268h m3017f(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C1268h c1268h = new C1268h(str.getBytes(AbstractC1285y.f5085a));
        c1268h.f5049c = str;
        return c1268h;
    }

    /* renamed from: i */
    public static C1268h m3018i(byte... bArr) {
        if (bArr != null) {
            return new C1268h((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: a */
    public String mo3019a() {
        byte[] bArr = AbstractC1279s.f5078c;
        byte[] bArr2 = this.f5047a;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            bArr3[i] = bArr[(bArr2[i2] & 255) >> 2];
            int i3 = i2 + 1;
            bArr3[i + 1] = bArr[((bArr2[i2] & 3) << 4) | ((bArr2[i3] & 255) >> 4)];
            int i4 = i + 3;
            int i5 = (bArr2[i3] & 15) << 2;
            int i6 = i2 + 2;
            bArr3[i + 2] = bArr[i5 | ((bArr2[i6] & 255) >> 6)];
            i += 4;
            bArr3[i4] = bArr[bArr2[i6] & 63];
        }
        int length2 = bArr2.length % 3;
        if (length2 == 1) {
            bArr3[i] = bArr[(bArr2[length] & 255) >> 2];
            bArr3[i + 1] = bArr[(bArr2[length] & 3) << 4];
            bArr3[i + 2] = 61;
            bArr3[i + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i] = bArr[(bArr2[length] & 255) >> 2];
            int i7 = (bArr2[length] & 3) << 4;
            int i8 = length + 1;
            bArr3[i + 1] = bArr[((bArr2[i8] & 255) >> 4) | i7];
            bArr3[i + 2] = bArr[(bArr2[i8] & 15) << 2];
            bArr3[i + 3] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        C1268h c1268h = (C1268h) obj;
        int iMo3025l = mo3025l();
        int iMo3025l2 = c1268h.mo3025l();
        int iMin = Math.min(iMo3025l, iMo3025l2);
        for (int i = 0; i < iMin; i++) {
            int iMo3021g = mo3021g(i) & 255;
            int iMo3021g2 = c1268h.mo3021g(i) & 255;
            if (iMo3021g != iMo3021g2) {
                return iMo3021g < iMo3021g2 ? -1 : 1;
            }
        }
        if (iMo3025l == iMo3025l2) {
            return 0;
        }
        if (iMo3025l < iMo3025l2) {
        }
    }

    /* renamed from: e */
    public final C1268h m3020e(String str) {
        try {
            return m3018i(MessageDigest.getInstance(str).digest(this.f5047a));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1268h) {
            C1268h c1268h = (C1268h) obj;
            int iMo3025l = c1268h.mo3025l();
            byte[] bArr = this.f5047a;
            if (iMo3025l == bArr.length && c1268h.mo3023j(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public byte mo3021g(int i) {
        return this.f5047a[i];
    }

    /* renamed from: h */
    public String mo3022h() {
        byte[] bArr = this.f5047a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f5045d;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public int hashCode() {
        int i = this.f5048b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f5047a);
        this.f5048b = iHashCode;
        return iHashCode;
    }

    /* renamed from: j */
    public boolean mo3023j(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f5047a;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                Charset charset = AbstractC1285y.f5085a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo3024k(C1268h c1268h, int i) {
        return c1268h.mo3023j(0, this.f5047a, 0, i);
    }

    /* renamed from: l */
    public int mo3025l() {
        return this.f5047a.length;
    }

    /* renamed from: m */
    public C1268h mo3026m() {
        byte[] bArr = this.f5047a;
        if (64 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + bArr.length + ")");
        }
        if (64 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new C1268h(bArr2);
    }

    /* renamed from: n */
    public C1268h mo3027n() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f5047a;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new C1268h(bArr2);
            }
            i++;
        }
    }

    /* renamed from: o */
    public String mo3028o() {
        String str = this.f5049c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f5047a, AbstractC1285y.f5085a);
        this.f5049c = str2;
        return str2;
    }

    /* renamed from: p */
    public void mo3029p(C1265e c1265e) {
        byte[] bArr = this.f5047a;
        c1265e.m3008u(bArr, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r4 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        byte[] bArr = this.f5047a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        String strMo3028o = mo3028o();
        int length = strMo3028o.length();
        int length2 = 0;
        int i = 0;
        while (true) {
            if (length2 >= length) {
                length2 = strMo3028o.length();
                break;
            }
            if (i != 64) {
                int iCodePointAt = strMo3028o.codePointAt(length2);
                if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                    break;
                }
                i++;
                length2 += Character.charCount(iCodePointAt);
            } else {
                break;
            }
        }
        if (length2 != -1) {
            String strReplace = strMo3028o.substring(0, length2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (length2 >= strMo3028o.length()) {
                return AbstractC0328E.m937g("[text=", strReplace, "]");
            }
            return "[size=" + bArr.length + " text=" + strReplace + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + mo3022h() + "]";
        }
        return "[size=" + bArr.length + " hex=" + mo3026m().mo3022h() + "…]";
    }
}
