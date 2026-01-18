package p074j0;

/* renamed from: j0.c */
/* loaded from: classes.dex */
public final class C0915c {

    /* renamed from: a */
    public long f3680a = 0;

    /* renamed from: b */
    public C0915c f3681b;

    /* renamed from: a */
    public final void m2354a(int i) {
        if (i < 64) {
            this.f3680a &= ~(1 << i);
            return;
        }
        C0915c c0915c = this.f3681b;
        if (c0915c != null) {
            c0915c.m2354a(i - 64);
        }
    }

    /* renamed from: b */
    public final int m2355b(int i) {
        C0915c c0915c = this.f3681b;
        if (c0915c == null) {
            return i >= 64 ? Long.bitCount(this.f3680a) : Long.bitCount(this.f3680a & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f3680a & ((1 << i) - 1));
        }
        return Long.bitCount(this.f3680a) + c0915c.m2355b(i - 64);
    }

    /* renamed from: c */
    public final void m2356c() {
        if (this.f3681b == null) {
            this.f3681b = new C0915c();
        }
    }

    /* renamed from: d */
    public final boolean m2357d(int i) {
        if (i < 64) {
            return (this.f3680a & (1 << i)) != 0;
        }
        m2356c();
        return this.f3681b.m2357d(i - 64);
    }

    /* renamed from: e */
    public final void m2358e(int i, boolean z2) {
        if (i >= 64) {
            m2356c();
            this.f3681b.m2358e(i - 64, z2);
            return;
        }
        long j2 = this.f3680a;
        boolean z3 = (Long.MIN_VALUE & j2) != 0;
        long j3 = (1 << i) - 1;
        this.f3680a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            m2361h(i);
        } else {
            m2354a(i);
        }
        if (z3 || this.f3681b != null) {
            m2356c();
            this.f3681b.m2358e(0, z3);
        }
    }

    /* renamed from: f */
    public final boolean m2359f(int i) {
        if (i >= 64) {
            m2356c();
            return this.f3681b.m2359f(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f3680a;
        boolean z2 = (j3 & j2) != 0;
        long j4 = j3 & (~j2);
        this.f3680a = j4;
        long j5 = j2 - 1;
        this.f3680a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0915c c0915c = this.f3681b;
        if (c0915c != null) {
            if (c0915c.m2357d(0)) {
                m2361h(63);
            }
            this.f3681b.m2359f(0);
        }
        return z2;
    }

    /* renamed from: g */
    public final void m2360g() {
        this.f3680a = 0L;
        C0915c c0915c = this.f3681b;
        if (c0915c != null) {
            c0915c.m2360g();
        }
    }

    /* renamed from: h */
    public final void m2361h(int i) {
        if (i < 64) {
            this.f3680a |= 1 << i;
        } else {
            m2356c();
            this.f3681b.m2361h(i - 64);
        }
    }

    public final String toString() {
        if (this.f3681b == null) {
            return Long.toBinaryString(this.f3680a);
        }
        return this.f3681b.toString() + "xx" + Long.toBinaryString(this.f3680a);
    }
}
