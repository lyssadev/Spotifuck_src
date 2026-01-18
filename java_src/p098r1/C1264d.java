package p098r1;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: r1.d */
/* loaded from: classes.dex */
public final class C1264d extends InputStream {

    /* renamed from: a */
    public final /* synthetic */ int f5040a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1267g f5041b;

    public /* synthetic */ C1264d(InterfaceC1267g interfaceC1267g, int i) {
        this.f5040a = i;
        this.f5041b = interfaceC1267g;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        switch (this.f5040a) {
            case 0:
                return (int) Math.min(((C1265e) this.f5041b).f5044b, 2147483647L);
            default:
                C1277q c1277q = (C1277q) this.f5041b;
                if (c1277q.f5068c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c1277q.f5066a.f5044b, 2147483647L);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f5040a) {
            case 0:
                break;
            default:
                ((C1277q) this.f5041b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f5040a) {
            case 0:
                C1265e c1265e = (C1265e) this.f5041b;
                if (c1265e.f5044b > 0) {
                    return c1265e.m2997j() & 255;
                }
                return -1;
            default:
                C1277q c1277q = (C1277q) this.f5041b;
                if (c1277q.f5068c) {
                    throw new IOException("closed");
                }
                C1265e c1265e2 = c1277q.f5066a;
                if (c1265e2.f5044b == 0 && c1277q.f5067b.mo2197e(c1265e2, 8192L) == -1) {
                    return -1;
                }
                return c1265e2.m2997j() & 255;
        }
    }

    public final String toString() {
        switch (this.f5040a) {
            case 0:
                return ((C1265e) this.f5041b) + ".inputStream()";
            default:
                return ((C1277q) this.f5041b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.f5040a) {
            case 0:
                return ((C1265e) this.f5041b).m2996i(bArr, i, i2);
            default:
                C1277q c1277q = (C1277q) this.f5041b;
                if (!c1277q.f5068c) {
                    AbstractC1285y.m3066a(bArr.length, i, i2);
                    C1265e c1265e = c1277q.f5066a;
                    if (c1265e.f5044b == 0 && c1277q.f5067b.mo2197e(c1265e, 8192L) == -1) {
                        return -1;
                    }
                    return c1265e.m2996i(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }

    /* renamed from: f */
    private final void m2990f() {
    }
}
