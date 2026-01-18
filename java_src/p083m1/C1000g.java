package p083m1;

import java.io.IOException;
import p098r1.AbstractC1270j;
import p098r1.C1265e;

/* renamed from: m1.g */
/* loaded from: classes.dex */
public final class C1000g extends AbstractC1270j {

    /* renamed from: b */
    public boolean f4074b;

    /* renamed from: c */
    public long f4075c;

    /* renamed from: d */
    public final /* synthetic */ C1001h f4076d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1000g(C1001h c1001h, C1016w c1016w) {
        super(c1016w);
        this.f4076d = c1001h;
        this.f4074b = false;
        this.f4075c = 0L;
    }

    @Override // p098r1.AbstractC1270j, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f4074b) {
            return;
        }
        this.f4074b = true;
        C1001h c1001h = this.f4076d;
        c1001h.f4080b.m2435h(false, c1001h, null);
    }

    @Override // p098r1.AbstractC1270j, p098r1.InterfaceC1282v
    /* renamed from: e */
    public final long mo2197e(C1265e c1265e, long j2) throws IOException {
        try {
            long jMo2197e = this.f5051a.mo2197e(c1265e, 8192L);
            if (jMo2197e > 0) {
                this.f4075c += jMo2197e;
            }
            return jMo2197e;
        } catch (IOException e) {
            if (!this.f4074b) {
                this.f4074b = true;
                C1001h c1001h = this.f4076d;
                c1001h.f4080b.m2435h(false, c1001h, e);
            }
            throw e;
        }
    }
}
