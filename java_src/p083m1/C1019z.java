package p083m1;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import p017K.C0137j;
import p030Q0.AbstractC0328E;
import p070h1.AbstractC0869c;
import p098r1.C1265e;
import p098r1.C1268h;
import p098r1.C1276p;
import p098r1.C1278r;

/* renamed from: m1.z */
/* loaded from: classes.dex */
public final class C1019z implements Closeable {

    /* renamed from: g */
    public static final Logger f4166g = Logger.getLogger(AbstractC0999f.class.getName());

    /* renamed from: a */
    public final C1276p f4167a;

    /* renamed from: b */
    public final boolean f4168b;

    /* renamed from: c */
    public final C1265e f4169c;

    /* renamed from: d */
    public int f4170d;

    /* renamed from: e */
    public boolean f4171e;

    /* renamed from: f */
    public final C0997d f4172f;

    public C1019z(C1276p c1276p, boolean z2) {
        this.f4167a = c1276p;
        this.f4168b = z2;
        C1265e c1265e = new C1265e();
        this.f4169c = c1265e;
        this.f4172f = new C0997d(c1265e);
        this.f4170d = 16384;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f4171e = true;
        this.f4167a.close();
    }

    /* renamed from: f */
    public final synchronized void m2534f(C0137j c0137j) {
        try {
            if (this.f4171e) {
                throw new IOException("closed");
            }
            int i = this.f4170d;
            int i2 = c0137j.f364f;
            if ((i2 & 32) != 0) {
                i = ((int[]) c0137j.f365g)[5];
            }
            this.f4170d = i;
            if (((i2 & 2) != 0 ? ((int[]) c0137j.f365g)[1] : -1) != -1) {
                C0997d c0997d = this.f4172f;
                int iMin = Math.min((i2 & 2) != 0 ? ((int[]) c0137j.f365g)[1] : -1, 16384);
                int i3 = c0997d.f4063d;
                if (i3 != iMin) {
                    if (iMin < i3) {
                        c0997d.f4061b = Math.min(c0997d.f4061b, iMin);
                    }
                    c0997d.f4062c = true;
                    c0997d.f4063d = iMin;
                    int i4 = c0997d.f4067h;
                    if (iMin < i4) {
                        if (iMin == 0) {
                            Arrays.fill(c0997d.f4064e, (Object) null);
                            c0997d.f4065f = c0997d.f4064e.length - 1;
                            c0997d.f4066g = 0;
                            c0997d.f4067h = 0;
                        } else {
                            c0997d.m2490a(i4 - iMin);
                        }
                    }
                }
            }
            m2536h(0, 0, (byte) 4, (byte) 1);
            this.f4167a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (this.f4171e) {
            throw new IOException("closed");
        }
        this.f4167a.flush();
    }

    /* renamed from: g */
    public final synchronized void m2535g(boolean z2, int i, C1265e c1265e, int i2) {
        if (this.f4171e) {
            throw new IOException("closed");
        }
        m2536h(i, i2, (byte) 0, z2 ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.f4167a.mo2201b(c1265e, i2);
        }
    }

    /* renamed from: h */
    public final void m2536h(int i, int i2, byte b2, byte b3) {
        Level level = Level.FINE;
        Logger logger = f4166g;
        if (logger.isLoggable(level)) {
            logger.fine(AbstractC0999f.m2495a(false, i, i2, b2, b3));
        }
        int i3 = this.f4170d;
        if (i2 > i3) {
            AbstractC0999f.m2496b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            AbstractC0999f.m2496b("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        C1276p c1276p = this.f4167a;
        c1276p.mo2992d((i2 >>> 16) & 255);
        c1276p.mo2992d((i2 >>> 8) & 255);
        c1276p.mo2992d(i2 & 255);
        c1276p.mo2992d(b2 & 255);
        c1276p.mo2992d(b3 & 255);
        c1276p.m3045i(i & Integer.MAX_VALUE);
    }

    /* renamed from: i */
    public final synchronized void m2537i(byte[] bArr, int i, int i2) {
        try {
            if (this.f4171e) {
                throw new IOException("closed");
            }
            if (AbstractC0328E.m934d(i2) == -1) {
                AbstractC0999f.m2496b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            m2536h(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f4167a.m3045i(i);
            this.f4167a.m3045i(AbstractC0328E.m934d(i2));
            if (bArr.length > 0) {
                this.f4167a.m3043g(bArr);
            }
            this.f4167a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2538j(boolean z2, int i, ArrayList arrayList) throws IOException {
        int length;
        int length2;
        if (this.f4171e) {
            throw new IOException("closed");
        }
        C0997d c0997d = this.f4172f;
        if (c0997d.f4062c) {
            int i2 = c0997d.f4061b;
            if (i2 < c0997d.f4063d) {
                c0997d.m2493d(i2, 31, 32);
            }
            c0997d.f4062c = false;
            c0997d.f4061b = Integer.MAX_VALUE;
            c0997d.m2493d(c0997d.f4063d, 31, 32);
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0995b c0995b = (C0995b) arrayList.get(i3);
            C1268h c1268hMo3027n = c0995b.f4049a.mo3027n();
            Integer num = (Integer) AbstractC0998e.f4069b.get(c1268hMo3027n);
            C1268h c1268h = c0995b.f4050b;
            if (num != null) {
                int iIntValue = num.intValue();
                length2 = iIntValue + 1;
                if (length2 > 1 && length2 < 8) {
                    C0995b[] c0995bArr = AbstractC0998e.f4068a;
                    if (AbstractC0869c.m2186i(c0995bArr[iIntValue].f4050b, c1268h)) {
                        length = length2;
                    } else if (AbstractC0869c.m2186i(c0995bArr[length2].f4050b, c1268h)) {
                        length2 = iIntValue + 2;
                        length = length2;
                    }
                    if (length2 == -1) {
                        int i4 = c0997d.f4065f + 1;
                        int length3 = c0997d.f4064e.length;
                        while (true) {
                            if (i4 >= length3) {
                                break;
                            }
                            if (AbstractC0869c.m2186i(c0997d.f4064e[i4].f4049a, c1268hMo3027n)) {
                                if (AbstractC0869c.m2186i(c0997d.f4064e[i4].f4050b, c1268h)) {
                                    length2 = (i4 - c0997d.f4065f) + AbstractC0998e.f4068a.length;
                                    break;
                                } else if (length == -1) {
                                    length = (i4 - c0997d.f4065f) + AbstractC0998e.f4068a.length;
                                }
                            }
                            i4++;
                        }
                    }
                    if (length2 == -1) {
                        c0997d.m2493d(length2, 127, 128);
                    } else if (length == -1) {
                        c0997d.f4060a.m3009v(64);
                        c0997d.m2492c(c1268hMo3027n);
                        c0997d.m2492c(c1268h);
                        c0997d.m2491b(c0995b);
                    } else {
                        C1268h c1268h2 = C0995b.f4043d;
                        c1268hMo3027n.getClass();
                        if (!c1268hMo3027n.mo3024k(c1268h2, c1268h2.f5047a.length) || C0995b.f4048i.equals(c1268hMo3027n)) {
                            c0997d.m2493d(length, 63, 64);
                            c0997d.m2492c(c1268h);
                            c0997d.m2491b(c0995b);
                        } else {
                            c0997d.m2493d(length, 15, 0);
                            c0997d.m2492c(c1268h);
                        }
                    }
                }
                length = length2;
            } else {
                length = -1;
            }
            length2 = -1;
            if (length2 == -1) {
            }
            if (length2 == -1) {
            }
        }
        C1265e c1265e = this.f4169c;
        long j2 = c1265e.f5044b;
        int iMin = (int) Math.min(this.f4170d, j2);
        long j3 = iMin;
        byte b2 = j2 == j3 ? (byte) 4 : (byte) 0;
        if (z2) {
            b2 = (byte) (b2 | 1);
        }
        m2536h(i, iMin, (byte) 1, b2);
        C1276p c1276p = this.f4167a;
        c1276p.mo2201b(c1265e, j3);
        if (j2 > j3) {
            long j4 = j2 - j3;
            while (j4 > 0) {
                int iMin2 = (int) Math.min(this.f4170d, j4);
                long j5 = iMin2;
                j4 -= j5;
                m2536h(i, iMin2, (byte) 9, j4 == 0 ? (byte) 4 : (byte) 0);
                c1276p.mo2201b(c1265e, j5);
            }
        }
    }

    /* renamed from: k */
    public final synchronized void m2539k(int i, int i2, boolean z2) {
        if (this.f4171e) {
            throw new IOException("closed");
        }
        m2536h(0, 8, (byte) 6, z2 ? (byte) 1 : (byte) 0);
        this.f4167a.m3045i(i);
        this.f4167a.m3045i(i2);
        this.f4167a.flush();
    }

    /* renamed from: l */
    public final synchronized void m2540l(int i, int i2) {
        if (this.f4171e) {
            throw new IOException("closed");
        }
        if (AbstractC0328E.m934d(i2) == -1) {
            throw new IllegalArgumentException();
        }
        m2536h(i, 4, (byte) 3, (byte) 0);
        this.f4167a.m3045i(AbstractC0328E.m934d(i2));
        this.f4167a.flush();
    }

    /* renamed from: m */
    public final synchronized void m2541m(C0137j c0137j) {
        try {
            if (this.f4171e) {
                throw new IOException("closed");
            }
            m2536h(0, Integer.bitCount(c0137j.f364f) * 6, (byte) 4, (byte) 0);
            int i = 0;
            while (i < 10) {
                boolean z2 = true;
                if (((1 << i) & c0137j.f364f) == 0) {
                    z2 = false;
                }
                if (z2) {
                    int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                    C1276p c1276p = this.f4167a;
                    if (c1276p.f5065c) {
                        throw new IllegalStateException("closed");
                    }
                    C1265e c1265e = c1276p.f5063a;
                    C1278r c1278rM3007t = c1265e.m3007t(2);
                    int i3 = c1278rM3007t.f5071c;
                    byte[] bArr = c1278rM3007t.f5069a;
                    bArr[i3] = (byte) ((i2 >>> 8) & 255);
                    bArr[i3 + 1] = (byte) (i2 & 255);
                    c1278rM3007t.f5071c = i3 + 2;
                    c1265e.f5044b += 2;
                    c1276p.m3042f();
                    this.f4167a.m3045i(((int[]) c0137j.f365g)[i]);
                }
                i++;
            }
            this.f4167a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: n */
    public final synchronized void m2542n(boolean z2, int i, ArrayList arrayList) {
        if (this.f4171e) {
            throw new IOException("closed");
        }
        m2538j(z2, i, arrayList);
    }

    /* renamed from: o */
    public final synchronized void m2543o(int i, long j2) {
        if (this.f4171e) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            AbstractC0999f.m2496b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            throw null;
        }
        m2536h(i, 4, (byte) 8, (byte) 0);
        this.f4167a.m3045i((int) j2);
        this.f4167a.flush();
    }
}
