package p081l1;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p070h1.AbstractC0869c;
import p098r1.C1265e;

/* renamed from: l1.e */
/* loaded from: classes.dex */
public final class C0974e extends AbstractC0970a {

    /* renamed from: e */
    public long f3960e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM2193p;
        if (this.f3946b) {
            return;
        }
        if (this.f3960e != 0) {
            try {
                zM2193p = AbstractC0869c.m2193p(this, 100, TimeUnit.MILLISECONDS);
            } catch (IOException unused) {
                zM2193p = false;
            }
            if (!zM2193p) {
                m2469f(false, null);
            }
        }
        this.f3946b = true;
    }

    @Override // p081l1.AbstractC0970a, p098r1.InterfaceC1282v
    /* renamed from: e */
    public final long mo2197e(C1265e c1265e, long j2) throws IOException {
        if (this.f3946b) {
            throw new IllegalStateException("closed");
        }
        long j3 = this.f3960e;
        if (j3 == 0) {
            return -1L;
        }
        long jMo2197e = super.mo2197e(c1265e, Math.min(j3, 8192L));
        if (jMo2197e == -1) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m2469f(false, protocolException);
            throw protocolException;
        }
        long j4 = this.f3960e - jMo2197e;
        this.f3960e = j4;
        if (j4 == 0) {
            m2469f(true, null);
        }
        return jMo2197e;
    }
}
