package p098r1;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: r1.t */
/* loaded from: classes.dex */
public final class C1280t extends C1268h {

    /* renamed from: f */
    public final transient byte[][] f5079f;

    /* renamed from: g */
    public final transient int[] f5080g;

    public C1280t(C1265e c1265e, int i) {
        super(null);
        AbstractC1285y.m3066a(c1265e.f5044b, 0L, i);
        C1278r c1278r = c1265e.f5043a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c1278r.f5071c;
            int i6 = c1278r.f5070b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c1278r = c1278r.f5074f;
        }
        this.f5079f = new byte[i4][];
        this.f5080g = new int[i4 * 2];
        C1278r c1278r2 = c1265e.f5043a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f5079f;
            bArr[i7] = c1278r2.f5069a;
            int i8 = c1278r2.f5071c;
            int i9 = c1278r2.f5070b;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.f5080g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c1278r2.f5072d = true;
            i7++;
            c1278r2 = c1278r2.f5074f;
        }
    }

    @Override // p098r1.C1268h
    /* renamed from: a */
    public final String mo3019a() {
        throw null;
    }

    @Override // p098r1.C1268h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1268h) {
            C1268h c1268h = (C1268h) obj;
            if (c1268h.mo3025l() == mo3025l() && mo3024k(c1268h, mo3025l())) {
                return true;
            }
        }
        return false;
    }

    @Override // p098r1.C1268h
    /* renamed from: g */
    public final byte mo3021g(int i) {
        byte[][] bArr = this.f5079f;
        int length = bArr.length - 1;
        int[] iArr = this.f5080g;
        AbstractC1285y.m3066a(iArr[length], i, 1L);
        int iM3064q = m3064q(i);
        return bArr[iM3064q][(i - (iM3064q == 0 ? 0 : iArr[iM3064q - 1])) + iArr[bArr.length + iM3064q]];
    }

    @Override // p098r1.C1268h
    /* renamed from: h */
    public final String mo3022h() {
        return m3065r().mo3022h();
    }

    @Override // p098r1.C1268h
    public final int hashCode() {
        int i = this.f5048b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f5079f;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            int[] iArr = this.f5080g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f5048b = i4;
        return i4;
    }

    @Override // p098r1.C1268h
    /* renamed from: j */
    public final boolean mo3023j(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo3025l() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iM3064q = m3064q(i);
        while (i3 > 0) {
            int[] iArr = this.f5080g;
            int i4 = iM3064q == 0 ? 0 : iArr[iM3064q - 1];
            int iMin = Math.min(i3, ((iArr[iM3064q] - i4) + i4) - i);
            byte[][] bArr2 = this.f5079f;
            int i5 = (i - i4) + iArr[bArr2.length + iM3064q];
            byte[] bArr3 = bArr2[iM3064q];
            Charset charset = AbstractC1285y.f5085a;
            for (int i6 = 0; i6 < iMin; i6++) {
                if (bArr3[i6 + i5] != bArr[i6 + i2]) {
                    return false;
                }
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iM3064q++;
        }
        return true;
    }

    @Override // p098r1.C1268h
    /* renamed from: k */
    public final boolean mo3024k(C1268h c1268h, int i) {
        if (mo3025l() - i < 0) {
            return false;
        }
        int iM3064q = m3064q(0);
        int i2 = 0;
        int i3 = 0;
        while (i > 0) {
            int[] iArr = this.f5080g;
            int i4 = iM3064q == 0 ? 0 : iArr[iM3064q - 1];
            int iMin = Math.min(i, ((iArr[iM3064q] - i4) + i4) - i2);
            byte[][] bArr = this.f5079f;
            if (!c1268h.mo3023j(i3, bArr[iM3064q], (i2 - i4) + iArr[bArr.length + iM3064q], iMin)) {
                return false;
            }
            i2 += iMin;
            i3 += iMin;
            i -= iMin;
            iM3064q++;
        }
        return true;
    }

    @Override // p098r1.C1268h
    /* renamed from: l */
    public final int mo3025l() {
        return this.f5080g[this.f5079f.length - 1];
    }

    @Override // p098r1.C1268h
    /* renamed from: m */
    public final C1268h mo3026m() {
        return m3065r().mo3026m();
    }

    @Override // p098r1.C1268h
    /* renamed from: n */
    public final C1268h mo3027n() {
        return m3065r().mo3027n();
    }

    @Override // p098r1.C1268h
    /* renamed from: o */
    public final String mo3028o() {
        return m3065r().mo3028o();
    }

    @Override // p098r1.C1268h
    /* renamed from: p */
    public final void mo3029p(C1265e c1265e) {
        byte[][] bArr = this.f5079f;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f5080g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C1278r c1278r = new C1278r(bArr[i], i3, (i3 + i4) - i2);
            C1278r c1278r2 = c1265e.f5043a;
            if (c1278r2 == null) {
                c1278r.f5075g = c1278r;
                c1278r.f5074f = c1278r;
                c1265e.f5043a = c1278r;
            } else {
                c1278r2.f5075g.m3059b(c1278r);
            }
            i++;
            i2 = i4;
        }
        c1265e.f5044b += i2;
    }

    /* renamed from: q */
    public final int m3064q(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f5080g, 0, this.f5079f.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    /* renamed from: r */
    public final C1268h m3065r() {
        byte[][] bArr = this.f5079f;
        int length = bArr.length - 1;
        int[] iArr = this.f5080g;
        byte[] bArr2 = new byte[iArr[length]];
        int length2 = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            int i3 = iArr[length2 + i];
            int i4 = iArr[i];
            System.arraycopy(bArr[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return new C1268h(bArr2);
    }

    @Override // p098r1.C1268h
    public final String toString() {
        return m3065r().toString();
    }
}
