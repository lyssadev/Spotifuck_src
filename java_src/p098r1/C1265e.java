package p098r1;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p030Q0.AbstractC0328E;

/* renamed from: r1.e */
/* loaded from: classes.dex */
public final class C1265e implements InterfaceC1267g, InterfaceC1266f, Cloneable, ByteChannel {

    /* renamed from: c */
    public static final byte[] f5042c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    public C1278r f5043a;

    /* renamed from: b */
    public long f5044b;

    @Override // p098r1.InterfaceC1282v
    /* renamed from: a */
    public final C1284x mo2196a() {
        return C1284x.f5081d;
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: b */
    public final void mo2201b(C1265e c1265e, long j2) {
        C1278r c1278rM3063b;
        if (c1265e == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c1265e == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC1285y.m3066a(c1265e.f5044b, 0L, j2);
        while (j2 > 0) {
            C1278r c1278r = c1265e.f5043a;
            int i = c1278r.f5071c - c1278r.f5070b;
            if (j2 < i) {
                C1278r c1278r2 = this.f5043a;
                C1278r c1278r3 = c1278r2 != null ? c1278r2.f5075g : null;
                if (c1278r3 != null && c1278r3.f5073e) {
                    if ((c1278r3.f5071c + j2) - (c1278r3.f5072d ? 0 : c1278r3.f5070b) <= 8192) {
                        c1278r.m3061d(c1278r3, (int) j2);
                        c1265e.f5044b -= j2;
                        this.f5044b += j2;
                        return;
                    }
                }
                int i2 = (int) j2;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException();
                }
                if (i2 >= 1024) {
                    c1278rM3063b = c1278r.m3060c();
                } else {
                    c1278rM3063b = AbstractC1279s.m3063b();
                    System.arraycopy(c1278r.f5069a, c1278r.f5070b, c1278rM3063b.f5069a, 0, i2);
                }
                c1278rM3063b.f5071c = c1278rM3063b.f5070b + i2;
                c1278r.f5070b += i2;
                c1278r.f5075g.m3059b(c1278rM3063b);
                c1265e.f5043a = c1278rM3063b;
            }
            C1278r c1278r4 = c1265e.f5043a;
            long j3 = c1278r4.f5071c - c1278r4.f5070b;
            c1265e.f5043a = c1278r4.m3058a();
            C1278r c1278r5 = this.f5043a;
            if (c1278r5 == null) {
                this.f5043a = c1278r4;
                c1278r4.f5075g = c1278r4;
                c1278r4.f5074f = c1278r4;
            } else {
                c1278r5.f5075g.m3059b(c1278r4);
                C1278r c1278r6 = c1278r4.f5075g;
                if (c1278r6 == c1278r4) {
                    throw new IllegalStateException();
                }
                if (c1278r6.f5073e) {
                    int i3 = c1278r4.f5071c - c1278r4.f5070b;
                    if (i3 <= (8192 - c1278r6.f5071c) + (c1278r6.f5072d ? 0 : c1278r6.f5070b)) {
                        c1278r4.m3061d(c1278r6, i3);
                        c1278r4.m3058a();
                        AbstractC1279s.m3062a(c1278r4);
                    }
                }
            }
            c1265e.f5044b -= j3;
            this.f5044b += j3;
            j2 -= j3;
        }
    }

    @Override // p098r1.InterfaceC1266f
    /* renamed from: c */
    public final InterfaceC1266f mo2991c(String str) {
        m3012y(str, 0, str.length());
        return this;
    }

    public final Object clone() {
        C1265e c1265e = new C1265e();
        if (this.f5044b != 0) {
            C1278r c1278rM3060c = this.f5043a.m3060c();
            c1265e.f5043a = c1278rM3060c;
            c1278rM3060c.f5075g = c1278rM3060c;
            c1278rM3060c.f5074f = c1278rM3060c;
            C1278r c1278r = this.f5043a;
            while (true) {
                c1278r = c1278r.f5074f;
                if (c1278r == this.f5043a) {
                    break;
                }
                c1265e.f5043a.f5075g.m3059b(c1278r.m3060c());
            }
            c1265e.f5044b = this.f5044b;
        }
        return c1265e;
    }

    @Override // p098r1.InterfaceC1266f
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC1266f mo2992d(int i) {
        m3009v(i);
        return this;
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
        long j3 = this.f5044b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        c1265e.mo2201b(this, j2);
        return j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1265e)) {
            return false;
        }
        C1265e c1265e = (C1265e) obj;
        long j2 = this.f5044b;
        if (j2 != c1265e.f5044b) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        C1278r c1278r = this.f5043a;
        C1278r c1278r2 = c1265e.f5043a;
        int i = c1278r.f5070b;
        int i2 = c1278r2.f5070b;
        while (j3 < this.f5044b) {
            long jMin = Math.min(c1278r.f5071c - i, c1278r2.f5071c - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c1278r.f5069a[i] != c1278r2.f5069a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c1278r.f5071c) {
                c1278r = c1278r.f5074f;
                i = c1278r.f5070b;
            }
            if (i2 == c1278r2.f5071c) {
                c1278r2 = c1278r2.f5074f;
                i2 = c1278r2.f5070b;
            }
            j3 += jMin;
        }
        return true;
    }

    /* renamed from: f */
    public final void m2993f(C1265e c1265e, long j2, long j3) {
        if (c1265e == null) {
            throw new IllegalArgumentException("out == null");
        }
        AbstractC1285y.m3066a(this.f5044b, j2, j3);
        if (j3 == 0) {
            return;
        }
        c1265e.f5044b += j3;
        C1278r c1278r = this.f5043a;
        while (true) {
            long j4 = c1278r.f5071c - c1278r.f5070b;
            if (j2 < j4) {
                break;
            }
            j2 -= j4;
            c1278r = c1278r.f5074f;
        }
        while (j3 > 0) {
            C1278r c1278rM3060c = c1278r.m3060c();
            int i = (int) (c1278rM3060c.f5070b + j2);
            c1278rM3060c.f5070b = i;
            c1278rM3060c.f5071c = Math.min(i + ((int) j3), c1278rM3060c.f5071c);
            C1278r c1278r2 = c1265e.f5043a;
            if (c1278r2 == null) {
                c1278rM3060c.f5075g = c1278rM3060c;
                c1278rM3060c.f5074f = c1278rM3060c;
                c1265e.f5043a = c1278rM3060c;
            } else {
                c1278r2.f5075g.m3059b(c1278rM3060c);
            }
            j3 -= c1278rM3060c.f5071c - c1278rM3060c.f5070b;
            c1278r = c1278r.f5074f;
            j2 = 0;
        }
    }

    /* renamed from: g */
    public final boolean m2994g() {
        return this.f5044b == 0;
    }

    /* renamed from: h */
    public final byte m2995h(long j2) {
        int i;
        AbstractC1285y.m3066a(this.f5044b, j2, 1L);
        long j3 = this.f5044b;
        if (j3 - j2 <= j2) {
            long j4 = j2 - j3;
            C1278r c1278r = this.f5043a;
            do {
                c1278r = c1278r.f5075g;
                int i2 = c1278r.f5071c;
                i = c1278r.f5070b;
                j4 += i2 - i;
            } while (j4 < 0);
            return c1278r.f5069a[i + ((int) j4)];
        }
        C1278r c1278r2 = this.f5043a;
        while (true) {
            int i3 = c1278r2.f5071c;
            int i4 = c1278r2.f5070b;
            long j5 = i3 - i4;
            if (j2 < j5) {
                return c1278r2.f5069a[i4 + ((int) j2)];
            }
            j2 -= j5;
            c1278r2 = c1278r2.f5074f;
        }
    }

    public final int hashCode() {
        C1278r c1278r = this.f5043a;
        if (c1278r == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c1278r.f5071c;
            for (int i3 = c1278r.f5070b; i3 < i2; i3++) {
                i = (i * 31) + c1278r.f5069a[i3];
            }
            c1278r = c1278r.f5074f;
        } while (c1278r != this.f5043a);
        return i;
    }

    /* renamed from: i */
    public final int m2996i(byte[] bArr, int i, int i2) {
        AbstractC1285y.m3066a(bArr.length, i, i2);
        C1278r c1278r = this.f5043a;
        if (c1278r == null) {
            return -1;
        }
        int iMin = Math.min(i2, c1278r.f5071c - c1278r.f5070b);
        System.arraycopy(c1278r.f5069a, c1278r.f5070b, bArr, i, iMin);
        int i3 = c1278r.f5070b + iMin;
        c1278r.f5070b = i3;
        this.f5044b -= iMin;
        if (i3 == c1278r.f5071c) {
            this.f5043a = c1278r.m3058a();
            AbstractC1279s.m3062a(c1278r);
        }
        return iMin;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final byte m2997j() {
        long j2 = this.f5044b;
        if (j2 == 0) {
            throw new IllegalStateException("size == 0");
        }
        C1278r c1278r = this.f5043a;
        int i = c1278r.f5070b;
        int i2 = c1278r.f5071c;
        int i3 = i + 1;
        byte b2 = c1278r.f5069a[i];
        this.f5044b = j2 - 1;
        if (i3 == i2) {
            this.f5043a = c1278r.m3058a();
            AbstractC1279s.m3062a(c1278r);
        } else {
            c1278r.f5070b = i3;
        }
        return b2;
    }

    /* renamed from: k */
    public final byte[] m2998k(long j2) throws EOFException {
        AbstractC1285y.m3066a(this.f5044b, 0L, j2);
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        }
        int i = (int) j2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iM2996i = m2996i(bArr, i2, i - i2);
            if (iM2996i == -1) {
                throw new EOFException();
            }
            i2 += iM2996i;
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[EDGE_INSN: B:48:0x009f->B:38:0x009f BREAK  A[LOOP:0: B:5:0x0011->B:50:?], SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m2999l() {
        if (this.f5044b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i = 0;
        long j2 = -7;
        boolean z2 = false;
        long j3 = 0;
        boolean z3 = false;
        do {
            C1278r c1278r = this.f5043a;
            byte[] bArr = c1278r.f5069a;
            int i2 = c1278r.f5070b;
            int i3 = c1278r.f5071c;
            while (i2 < i3) {
                byte b2 = bArr[i2];
                if (b2 >= 48 && b2 <= 57) {
                    int i4 = 48 - b2;
                    if (j3 < -922337203685477580L || (j3 == -922337203685477580L && i4 < j2)) {
                        C1265e c1265e = new C1265e();
                        c1265e.m3010w(j3);
                        c1265e.m3009v(b2);
                        if (!z2) {
                            c1265e.m2997j();
                        }
                        throw new NumberFormatException("Number too large: ".concat(c1265e.m3004q()));
                    }
                    j3 = (j3 * 10) + i4;
                } else if (b2 == 45 && i == 0) {
                    j2--;
                    z2 = true;
                } else {
                    if (i == 0) {
                        throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + Integer.toHexString(b2));
                    }
                    z3 = true;
                    if (i2 != i3) {
                        this.f5043a = c1278r.m3058a();
                        AbstractC1279s.m3062a(c1278r);
                    } else {
                        c1278r.f5070b = i2;
                    }
                    if (!z3) {
                        break;
                    }
                }
                i2++;
                i++;
            }
            if (i2 != i3) {
            }
            if (!z3) {
            }
        } while (this.f5043a != null);
        this.f5044b -= i;
        return z2 ? j3 : -j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[EDGE_INSN: B:43:0x0092->B:37:0x0092 BREAK  A[LOOP:0: B:5:0x000b->B:45:?], SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m3000m() {
        int i;
        if (this.f5044b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i2 = 0;
        long j2 = 0;
        boolean z2 = false;
        do {
            C1278r c1278r = this.f5043a;
            byte[] bArr = c1278r.f5069a;
            int i3 = c1278r.f5070b;
            int i4 = c1278r.f5071c;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else if (b2 >= 65 && b2 <= 70) {
                    i = b2 - 55;
                } else {
                    if (i2 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b2));
                    }
                    z2 = true;
                    if (i3 != i4) {
                        this.f5043a = c1278r.m3058a();
                        AbstractC1279s.m3062a(c1278r);
                    } else {
                        c1278r.f5070b = i3;
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j2) != 0) {
                    C1265e c1265e = new C1265e();
                    c1265e.m3011x(j2);
                    c1265e.m3009v(b2);
                    throw new NumberFormatException("Number too large: ".concat(c1265e.m3004q()));
                }
                j2 = (j2 << 4) | i;
                i3++;
                i2++;
            }
            if (i3 != i4) {
            }
            if (!z2) {
            }
        } while (this.f5043a != null);
        this.f5044b -= i2;
        return j2;
    }

    /* renamed from: n */
    public final int m3001n() {
        long j2 = this.f5044b;
        if (j2 < 4) {
            throw new IllegalStateException("size < 4: " + this.f5044b);
        }
        C1278r c1278r = this.f5043a;
        int i = c1278r.f5070b;
        int i2 = c1278r.f5071c;
        if (i2 - i < 4) {
            return ((m2997j() & 255) << 24) | ((m2997j() & 255) << 16) | ((m2997j() & 255) << 8) | (m2997j() & 255);
        }
        byte[] bArr = c1278r.f5069a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = i4 | (bArr[i3] & 255);
        this.f5044b = j2 - 4;
        if (i5 == i2) {
            this.f5043a = c1278r.m3058a();
            AbstractC1279s.m3062a(c1278r);
        } else {
            c1278r.f5070b = i5;
        }
        return i6;
    }

    /* renamed from: o */
    public final short m3002o() {
        long j2 = this.f5044b;
        if (j2 < 2) {
            throw new IllegalStateException("size < 2: " + this.f5044b);
        }
        C1278r c1278r = this.f5043a;
        int i = c1278r.f5070b;
        int i2 = c1278r.f5071c;
        if (i2 - i < 2) {
            return (short) (((m2997j() & 255) << 8) | (m2997j() & 255));
        }
        int i3 = i + 1;
        byte[] bArr = c1278r.f5069a;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f5044b = j2 - 2;
        if (i5 == i2) {
            this.f5043a = c1278r.m3058a();
            AbstractC1279s.m3062a(c1278r);
        } else {
            c1278r.f5070b = i5;
        }
        return (short) i6;
    }

    /* renamed from: p */
    public final String m3003p(long j2) {
        Charset charset = AbstractC1285y.f5085a;
        AbstractC1285y.m3066a(this.f5044b, 0L, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        }
        if (j2 == 0) {
            return "";
        }
        C1278r c1278r = this.f5043a;
        int i = c1278r.f5070b;
        if (i + j2 > c1278r.f5071c) {
            return new String(m2998k(j2), charset);
        }
        String str = new String(c1278r.f5069a, i, (int) j2, charset);
        int i2 = (int) (c1278r.f5070b + j2);
        c1278r.f5070b = i2;
        this.f5044b -= j2;
        if (i2 == c1278r.f5071c) {
            this.f5043a = c1278r.m3058a();
            AbstractC1279s.m3062a(c1278r);
        }
        return str;
    }

    /* renamed from: q */
    public final String m3004q() {
        try {
            long j2 = this.f5044b;
            Charset charset = AbstractC1285y.f5085a;
            return m3003p(j2);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: r */
    public final String m3005r(long j2) throws EOFException {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (m2995h(j3) == 13) {
                Charset charset = AbstractC1285y.f5085a;
                String strM3003p = m3003p(j3);
                m3006s(2L);
                return strM3003p;
            }
        }
        Charset charset2 = AbstractC1285y.f5085a;
        String strM3003p2 = m3003p(j2);
        m3006s(1L);
        return strM3003p2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C1278r c1278r = this.f5043a;
        if (c1278r == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c1278r.f5071c - c1278r.f5070b);
        byteBuffer.put(c1278r.f5069a, c1278r.f5070b, iMin);
        int i = c1278r.f5070b + iMin;
        c1278r.f5070b = i;
        this.f5044b -= iMin;
        if (i == c1278r.f5071c) {
            this.f5043a = c1278r.m3058a();
            AbstractC1279s.m3062a(c1278r);
        }
        return iMin;
    }

    /* renamed from: s */
    public final void m3006s(long j2) throws EOFException {
        while (j2 > 0) {
            if (this.f5043a == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, r0.f5071c - r0.f5070b);
            long j3 = iMin;
            this.f5044b -= j3;
            j2 -= j3;
            C1278r c1278r = this.f5043a;
            int i = c1278r.f5070b + iMin;
            c1278r.f5070b = i;
            if (i == c1278r.f5071c) {
                this.f5043a = c1278r.m3058a();
                AbstractC1279s.m3062a(c1278r);
            }
        }
    }

    /* renamed from: t */
    public final C1278r m3007t(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C1278r c1278r = this.f5043a;
        if (c1278r == null) {
            C1278r c1278rM3063b = AbstractC1279s.m3063b();
            this.f5043a = c1278rM3063b;
            c1278rM3063b.f5075g = c1278rM3063b;
            c1278rM3063b.f5074f = c1278rM3063b;
            return c1278rM3063b;
        }
        C1278r c1278r2 = c1278r.f5075g;
        if (c1278r2.f5071c + i <= 8192 && c1278r2.f5073e) {
            return c1278r2;
        }
        C1278r c1278rM3063b2 = AbstractC1279s.m3063b();
        c1278r2.m3059b(c1278rM3063b2);
        return c1278rM3063b2;
    }

    public final String toString() {
        long j2 = this.f5044b;
        if (j2 <= 2147483647L) {
            int i = (int) j2;
            return (i == 0 ? C1268h.f5046e : new C1280t(this, i)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f5044b);
    }

    /* renamed from: u */
    public final void m3008u(byte[] bArr, int i) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        int i2 = 0;
        long j2 = i;
        AbstractC1285y.m3066a(bArr.length, 0, j2);
        while (i2 < i) {
            C1278r c1278rM3007t = m3007t(1);
            int iMin = Math.min(i - i2, 8192 - c1278rM3007t.f5071c);
            System.arraycopy(bArr, i2, c1278rM3007t.f5069a, c1278rM3007t.f5071c, iMin);
            i2 += iMin;
            c1278rM3007t.f5071c += iMin;
        }
        this.f5044b += j2;
    }

    /* renamed from: v */
    public final void m3009v(int i) {
        C1278r c1278rM3007t = m3007t(1);
        int i2 = c1278rM3007t.f5071c;
        c1278rM3007t.f5071c = i2 + 1;
        c1278rM3007t.f5069a[i2] = (byte) i;
        this.f5044b++;
    }

    /* renamed from: w */
    public final void m3010w(long j2) {
        byte[] bArr;
        if (j2 == 0) {
            m3009v(48);
            return;
        }
        int i = 1;
        boolean z2 = false;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                m3012y("-9223372036854775808", 0, 20);
                return;
            }
            z2 = true;
        }
        if (j2 >= 100000000) {
            i = j2 < 1000000000000L ? j2 < 10000000000L ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i = 2;
        }
        if (z2) {
            i++;
        }
        C1278r c1278rM3007t = m3007t(i);
        int i2 = c1278rM3007t.f5071c + i;
        while (true) {
            bArr = c1278rM3007t.f5069a;
            if (j2 == 0) {
                break;
            }
            i2--;
            bArr[i2] = f5042c[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z2) {
            bArr[i2 - 1] = 45;
        }
        c1278rM3007t.f5071c += i;
        this.f5044b += i;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C1278r c1278rM3007t = m3007t(1);
            int iMin = Math.min(i, 8192 - c1278rM3007t.f5071c);
            byteBuffer.get(c1278rM3007t.f5069a, c1278rM3007t.f5071c, iMin);
            i -= iMin;
            c1278rM3007t.f5071c += iMin;
        }
        this.f5044b += iRemaining;
        return iRemaining;
    }

    /* renamed from: x */
    public final void m3011x(long j2) {
        if (j2 == 0) {
            m3009v(48);
            return;
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        C1278r c1278rM3007t = m3007t(iNumberOfTrailingZeros);
        int i = c1278rM3007t.f5071c;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            c1278rM3007t.f5069a[i2] = f5042c[(int) (15 & j2)];
            j2 >>>= 4;
        }
        c1278rM3007t.f5071c += iNumberOfTrailingZeros;
        this.f5044b += iNumberOfTrailingZeros;
    }

    /* renamed from: y */
    public final void m3012y(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0328E.m935e("beginIndex < 0: ", i));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                C1278r c1278rM3007t = m3007t(1);
                int i3 = c1278rM3007t.f5071c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = c1278rM3007t.f5069a;
                bArr[i + i3] = (byte) cCharAt;
                while (i4 < iMin) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i4 + i3] = (byte) cCharAt2;
                    i4++;
                }
                int i5 = c1278rM3007t.f5071c;
                int i6 = (i3 + i4) - i5;
                c1278rM3007t.f5071c = i5 + i6;
                this.f5044b += i6;
                i = i4;
            } else {
                if (cCharAt < 2048) {
                    m3009v((cCharAt >> 6) | 192);
                    m3009v((cCharAt & '?') | 128);
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    m3009v((cCharAt >> '\f') | 224);
                    m3009v(((cCharAt >> 6) & 63) | 128);
                    m3009v((cCharAt & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        m3009v(63);
                        i = i7;
                    } else {
                        int i8 = (((cCharAt & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        m3009v((i8 >> 18) | 240);
                        m3009v(((i8 >> 12) & 63) | 128);
                        m3009v(((i8 >> 6) & 63) | 128);
                        m3009v((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: z */
    public final void m3013z(int i) {
        if (i < 128) {
            m3009v(i);
            return;
        }
        if (i < 2048) {
            m3009v((i >> 6) | 192);
            m3009v((i & 63) | 128);
            return;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                m3009v(63);
                return;
            }
            m3009v((i >> 12) | 224);
            m3009v(((i >> 6) & 63) | 128);
            m3009v((i & 63) | 128);
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        m3009v((i >> 18) | 240);
        m3009v(((i >> 12) & 63) | 128);
        m3009v(((i >> 6) & 63) | 128);
        m3009v((i & 63) | 128);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p098r1.InterfaceC1281u
    public final void close() {
    }

    @Override // p098r1.InterfaceC1281u, java.io.Flushable
    public final void flush() {
    }
}
