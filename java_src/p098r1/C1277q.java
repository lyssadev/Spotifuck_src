package p098r1;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: r1.q */
/* loaded from: classes.dex */
public final class C1277q implements InterfaceC1267g {

    /* renamed from: a */
    public final C1265e f5066a = new C1265e();

    /* renamed from: b */
    public final InterfaceC1282v f5067b;

    /* renamed from: c */
    public boolean f5068c;

    public C1277q(InterfaceC1282v interfaceC1282v) {
        if (interfaceC1282v == null) {
            throw new NullPointerException("source == null");
        }
        this.f5067b = interfaceC1282v;
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: a */
    public final C1284x mo2196a() {
        return this.f5067b.mo2196a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f5068c) {
            return;
        }
        this.f5068c = true;
        this.f5067b.close();
        C1265e c1265e = this.f5066a;
        try {
            c1265e.m3006s(c1265e.f5044b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: e */
    public final long mo2197e(C1265e c1265e, long j2) {
        if (c1265e == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (this.f5068c) {
            throw new IllegalStateException("closed");
        }
        C1265e c1265e2 = this.f5066a;
        if (c1265e2.f5044b == 0 && this.f5067b.mo2197e(c1265e2, 8192L) == -1) {
            return -1L;
        }
        return c1265e2.mo2197e(c1265e, Math.min(j2, c1265e2.f5044b));
    }

    /* renamed from: f */
    public final boolean m3046f() {
        if (this.f5068c) {
            throw new IllegalStateException("closed");
        }
        C1265e c1265e = this.f5066a;
        return c1265e.m2994g() && this.f5067b.mo2197e(c1265e, 8192L) == -1;
    }

    /* renamed from: g */
    public final long m3047g(byte b2, long j2, long j3) {
        C1278r c1278r;
        long j4;
        long j5;
        long j6;
        long j7;
        if (this.f5068c) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (j3 < 0) {
            throw new IllegalArgumentException("fromIndex=0 toIndex=" + j3);
        }
        while (jMax < j3) {
            C1265e c1265e = this.f5066a;
            c1265e.getClass();
            if (jMax < 0 || j3 < jMax) {
                throw new IllegalArgumentException("size=" + c1265e.f5044b + " fromIndex=" + jMax + " toIndex=" + j3);
            }
            long j8 = c1265e.f5044b;
            long j9 = j3 > j8 ? j8 : j3;
            if (jMax == j9 || (c1278r = c1265e.f5043a) == null) {
                j5 = jMax;
                j7 = -1;
                j6 = -1;
            } else {
                if (j8 - jMax < jMax) {
                    while (j8 > jMax) {
                        c1278r = c1278r.f5075g;
                        j8 -= c1278r.f5071c - c1278r.f5070b;
                    }
                    j4 = jMax;
                } else {
                    C1278r c1278r2 = c1278r;
                    long j10 = 0;
                    while (true) {
                        long j11 = (c1278r2.f5071c - c1278r2.f5070b) + j10;
                        if (j11 >= jMax) {
                            break;
                        }
                        c1278r2 = c1278r2.f5074f;
                        j10 = j11;
                    }
                    j4 = jMax;
                    long j12 = j10;
                    c1278r = c1278r2;
                    j8 = j12;
                }
                while (j8 < j9) {
                    byte[] bArr = c1278r.f5069a;
                    j5 = jMax;
                    int iMin = (int) Math.min(c1278r.f5071c, (c1278r.f5070b + j9) - j8);
                    for (int i = (int) ((c1278r.f5070b + j4) - j8); i < iMin; i++) {
                        if (bArr[i] == b2) {
                            j6 = (i - c1278r.f5070b) + j8;
                            j7 = -1;
                            break;
                        }
                    }
                    j4 = j8 + (c1278r.f5071c - c1278r.f5070b);
                    c1278r = c1278r.f5074f;
                    j8 = j4;
                    jMax = j5;
                }
                j5 = jMax;
                j7 = -1;
                j6 = -1;
            }
            if (j6 != j7) {
                return j6;
            }
            long j13 = c1265e.f5044b;
            if (j13 >= j3 || this.f5067b.mo2197e(c1265e, 8192L) == j7) {
                return j7;
            }
            jMax = Math.max(j5, j13);
        }
        return -1L;
    }

    /* renamed from: h */
    public final boolean m3048h(long j2, C1268h c1268h) {
        byte[] bArr = c1268h.f5047a;
        int length = bArr.length;
        if (this.f5068c) {
            throw new IllegalStateException("closed");
        }
        if (j2 < 0 || length < 0 || bArr.length < length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            long j3 = i + j2;
            if (!m3055o(1 + j3) || this.f5066a.m2995h(j3) != c1268h.f5047a[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    public final byte m3049i() throws EOFException {
        m3056p(1L);
        return this.f5066a.m2997j();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f5068c;
    }

    /* renamed from: j */
    public final C1268h m3050j(long j2) throws EOFException {
        m3056p(j2);
        C1265e c1265e = this.f5066a;
        c1265e.getClass();
        return new C1268h(c1265e.m2998k(j2));
    }

    /* renamed from: k */
    public final void m3051k(byte[] bArr) throws EOFException {
        C1265e c1265e = this.f5066a;
        int i = 0;
        try {
            m3056p(bArr.length);
            while (i < bArr.length) {
                int iM2996i = c1265e.m2996i(bArr, i, bArr.length - i);
                if (iM2996i == -1) {
                    throw new EOFException();
                }
                i += iM2996i;
            }
        } catch (EOFException e) {
            while (true) {
                long j2 = c1265e.f5044b;
                if (j2 <= 0) {
                    throw e;
                }
                int iM2996i2 = c1265e.m2996i(bArr, i, (int) j2);
                if (iM2996i2 == -1) {
                    throw new AssertionError();
                }
                i += iM2996i2;
            }
        }
    }

    /* renamed from: l */
    public final int m3052l() throws EOFException {
        m3056p(4L);
        return this.f5066a.m3001n();
    }

    /* renamed from: m */
    public final short m3053m() throws EOFException {
        m3056p(2L);
        return this.f5066a.m3002o();
    }

    /* renamed from: n */
    public final String m3054n(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j2);
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long jM3047g = m3047g((byte) 10, 0L, j3);
        C1265e c1265e = this.f5066a;
        if (jM3047g != -1) {
            return c1265e.m3005r(jM3047g);
        }
        if (j3 < Long.MAX_VALUE && m3055o(j3) && c1265e.m2995h(j3 - 1) == 13 && m3055o(1 + j3) && c1265e.m2995h(j3) == 10) {
            return c1265e.m3005r(j3);
        }
        C1265e c1265e2 = new C1265e();
        c1265e.m2993f(c1265e2, 0L, Math.min(32L, c1265e.f5044b));
        StringBuilder sb = new StringBuilder("\\n not found: limit=");
        sb.append(Math.min(c1265e.f5044b, j2));
        sb.append(" content=");
        try {
            sb.append(new C1268h(c1265e2.m2998k(c1265e2.f5044b)).mo3022h());
            sb.append((char) 8230);
            throw new EOFException(sb.toString());
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: o */
    public final boolean m3055o(long j2) {
        C1265e c1265e;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (this.f5068c) {
            throw new IllegalStateException("closed");
        }
        do {
            c1265e = this.f5066a;
            if (c1265e.f5044b >= j2) {
                return true;
            }
        } while (this.f5067b.mo2197e(c1265e, 8192L) != -1);
        return false;
    }

    /* renamed from: p */
    public final void m3056p(long j2) throws EOFException {
        if (!m3055o(j2)) {
            throw new EOFException();
        }
    }

    /* renamed from: q */
    public final void m3057q(long j2) throws EOFException {
        if (this.f5068c) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            C1265e c1265e = this.f5066a;
            if (c1265e.f5044b == 0 && this.f5067b.mo2197e(c1265e, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, c1265e.f5044b);
            c1265e.m3006s(jMin);
            j2 -= jMin;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C1265e c1265e = this.f5066a;
        if (c1265e.f5044b == 0 && this.f5067b.mo2197e(c1265e, 8192L) == -1) {
            return -1;
        }
        return c1265e.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f5067b + ")";
    }
}
