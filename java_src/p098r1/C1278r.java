package p098r1;

/* renamed from: r1.r */
/* loaded from: classes.dex */
public final class C1278r {

    /* renamed from: a */
    public final byte[] f5069a;

    /* renamed from: b */
    public int f5070b;

    /* renamed from: c */
    public int f5071c;

    /* renamed from: d */
    public boolean f5072d;

    /* renamed from: e */
    public final boolean f5073e;

    /* renamed from: f */
    public C1278r f5074f;

    /* renamed from: g */
    public C1278r f5075g;

    public C1278r() {
        this.f5069a = new byte[8192];
        this.f5073e = true;
        this.f5072d = false;
    }

    /* renamed from: a */
    public final C1278r m3058a() {
        C1278r c1278r = this.f5074f;
        C1278r c1278r2 = c1278r != this ? c1278r : null;
        C1278r c1278r3 = this.f5075g;
        c1278r3.f5074f = c1278r;
        this.f5074f.f5075g = c1278r3;
        this.f5074f = null;
        this.f5075g = null;
        return c1278r2;
    }

    /* renamed from: b */
    public final void m3059b(C1278r c1278r) {
        c1278r.f5075g = this;
        c1278r.f5074f = this.f5074f;
        this.f5074f.f5075g = c1278r;
        this.f5074f = c1278r;
    }

    /* renamed from: c */
    public final C1278r m3060c() {
        this.f5072d = true;
        return new C1278r(this.f5069a, this.f5070b, this.f5071c);
    }

    /* renamed from: d */
    public final void m3061d(C1278r c1278r, int i) {
        if (!c1278r.f5073e) {
            throw new IllegalArgumentException();
        }
        int i2 = c1278r.f5071c;
        int i3 = i2 + i;
        byte[] bArr = c1278r.f5069a;
        if (i3 > 8192) {
            if (c1278r.f5072d) {
                throw new IllegalArgumentException();
            }
            int i4 = c1278r.f5070b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            c1278r.f5071c -= c1278r.f5070b;
            c1278r.f5070b = 0;
        }
        System.arraycopy(this.f5069a, this.f5070b, bArr, c1278r.f5071c, i);
        c1278r.f5071c += i;
        this.f5070b += i;
    }

    public C1278r(byte[] bArr, int i, int i2) {
        this.f5069a = bArr;
        this.f5070b = i;
        this.f5071c = i2;
        this.f5072d = true;
        this.f5073e = false;
    }
}
