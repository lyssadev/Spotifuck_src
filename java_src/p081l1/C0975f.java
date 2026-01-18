package p081l1;

import java.io.IOException;
import p098r1.C1265e;

/* renamed from: l1.f */
/* loaded from: classes.dex */
public final class C0975f extends AbstractC0970a {

    /* renamed from: e */
    public boolean f3961e;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f3946b) {
            return;
        }
        if (!this.f3961e) {
            m2469f(false, null);
        }
        this.f3946b = true;
    }

    @Override // p081l1.AbstractC0970a, p098r1.InterfaceC1282v
    /* renamed from: e */
    public final long mo2197e(C1265e c1265e, long j2) throws IOException {
        if (this.f3946b) {
            throw new IllegalStateException("closed");
        }
        if (this.f3961e) {
            return -1L;
        }
        long jMo2197e = super.mo2197e(c1265e, 8192L);
        if (jMo2197e != -1) {
            return jMo2197e;
        }
        this.f3961e = true;
        m2469f(true, null);
        return -1L;
    }
}
