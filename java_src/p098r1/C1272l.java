package p098r1;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: r1.l */
/* loaded from: classes.dex */
public final class C1272l implements InterfaceC1282v {

    /* renamed from: b */
    public final C1277q f5054b;

    /* renamed from: c */
    public final Inflater f5055c;

    /* renamed from: d */
    public final C1273m f5056d;

    /* renamed from: a */
    public int f5053a = 0;

    /* renamed from: e */
    public final CRC32 f5057e = new CRC32();

    public C1272l(InterfaceC1282v interfaceC1282v) {
        if (interfaceC1282v == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f5055c = inflater;
        Logger logger = AbstractC1275o.f5062a;
        C1277q c1277q = new C1277q(interfaceC1282v);
        this.f5054b = c1277q;
        this.f5056d = new C1273m(c1277q, inflater);
    }

    /* renamed from: f */
    public static void m3037f(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: a */
    public final C1284x mo2196a() {
        return this.f5054b.f5067b.mo2196a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5056d.close();
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: e */
    public final long mo2197e(C1265e c1265e, long j2) throws DataFormatException, IOException {
        C1277q c1277q;
        C1265e c1265e2;
        long j3;
        int i = this.f5053a;
        CRC32 crc32 = this.f5057e;
        C1277q c1277q2 = this.f5054b;
        if (i == 0) {
            c1277q2.m3056p(10L);
            C1265e c1265e3 = c1277q2.f5066a;
            byte bM2995h = c1265e3.m2995h(3L);
            boolean z2 = ((bM2995h >> 1) & 1) == 1;
            if (z2) {
                c1265e2 = c1265e3;
                m3038g(c1265e3, 0L, 10L);
            } else {
                c1265e2 = c1265e3;
            }
            m3037f("ID1ID2", 8075, c1277q2.m3053m());
            c1277q2.m3057q(8L);
            if (((bM2995h >> 2) & 1) == 1) {
                c1277q2.m3056p(2L);
                if (z2) {
                    m3038g(c1265e2, 0L, 2L);
                }
                short sM3002o = c1265e2.m3002o();
                Charset charset = AbstractC1285y.f5085a;
                long j4 = (short) (((sM3002o & 255) << 8) | ((sM3002o & 65280) >>> 8));
                c1277q2.m3056p(j4);
                if (z2) {
                    m3038g(c1265e2, 0L, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                c1277q2.m3057q(j3);
            }
            if (((bM2995h >> 3) & 1) == 1) {
                long jM3047g = c1277q2.m3047g((byte) 0, 0L, Long.MAX_VALUE);
                if (jM3047g == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    c1277q = c1277q2;
                    m3038g(c1265e2, 0L, jM3047g + 1);
                } else {
                    c1277q = c1277q2;
                }
                c1277q.m3057q(jM3047g + 1);
            } else {
                c1277q = c1277q2;
            }
            if (((bM2995h >> 4) & 1) == 1) {
                long jM3047g2 = c1277q.m3047g((byte) 0, 0L, Long.MAX_VALUE);
                if (jM3047g2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    m3038g(c1265e2, 0L, jM3047g2 + 1);
                }
                c1277q.m3057q(jM3047g2 + 1);
            }
            if (z2) {
                c1277q.m3056p(2L);
                short sM3002o2 = c1265e2.m3002o();
                Charset charset2 = AbstractC1285y.f5085a;
                m3037f("FHCRC", (short) (((sM3002o2 & 255) << 8) | ((sM3002o2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            this.f5053a = 1;
        } else {
            c1277q = c1277q2;
        }
        if (this.f5053a == 1) {
            long j5 = c1265e.f5044b;
            long jMo2197e = this.f5056d.mo2197e(c1265e, 8192L);
            if (jMo2197e != -1) {
                m3038g(c1265e, j5, jMo2197e);
                return jMo2197e;
            }
            this.f5053a = 2;
        }
        if (this.f5053a == 2) {
            c1277q.m3056p(4L);
            C1265e c1265e4 = c1277q.f5066a;
            int iM3001n = c1265e4.m3001n();
            Charset charset3 = AbstractC1285y.f5085a;
            m3037f("CRC", ((iM3001n & 255) << 24) | ((iM3001n & (-16777216)) >>> 24) | ((iM3001n & 16711680) >>> 8) | ((iM3001n & 65280) << 8), (int) crc32.getValue());
            c1277q.m3056p(4L);
            int iM3001n2 = c1265e4.m3001n();
            m3037f("ISIZE", ((iM3001n2 & 255) << 24) | ((iM3001n2 & (-16777216)) >>> 24) | ((iM3001n2 & 16711680) >>> 8) | ((iM3001n2 & 65280) << 8), (int) this.f5055c.getBytesWritten());
            this.f5053a = 3;
            if (!c1277q.m3046f()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    /* renamed from: g */
    public final void m3038g(C1265e c1265e, long j2, long j3) {
        C1278r c1278r = c1265e.f5043a;
        while (true) {
            int i = c1278r.f5071c;
            int i2 = c1278r.f5070b;
            if (j2 < i - i2) {
                break;
            }
            j2 -= i - i2;
            c1278r = c1278r.f5074f;
        }
        while (j3 > 0) {
            int iMin = (int) Math.min(c1278r.f5071c - r7, j3);
            this.f5057e.update(c1278r.f5069a, (int) (c1278r.f5070b + j2), iMin);
            j3 -= iMin;
            c1278r = c1278r.f5074f;
            j2 = 0;
        }
    }
}
