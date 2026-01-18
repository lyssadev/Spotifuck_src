package p098r1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: r1.k */
/* loaded from: classes.dex */
public final class C1271k extends C1284x {

    /* renamed from: e */
    public C1284x f5052e;

    public C1271k(C1284x c1284x) {
        if (c1284x == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f5052e = c1284x;
    }

    @Override // p098r1.C1284x
    /* renamed from: a */
    public final C1284x mo3030a() {
        return this.f5052e.mo3030a();
    }

    @Override // p098r1.C1284x
    /* renamed from: b */
    public final C1284x mo3031b() {
        return this.f5052e.mo3031b();
    }

    @Override // p098r1.C1284x
    /* renamed from: c */
    public final long mo3032c() {
        return this.f5052e.mo3032c();
    }

    @Override // p098r1.C1284x
    /* renamed from: d */
    public final C1284x mo3033d(long j2) {
        return this.f5052e.mo3033d(j2);
    }

    @Override // p098r1.C1284x
    /* renamed from: e */
    public final boolean mo3034e() {
        return this.f5052e.mo3034e();
    }

    @Override // p098r1.C1284x
    /* renamed from: f */
    public final void mo3035f() throws InterruptedIOException {
        this.f5052e.mo3035f();
    }

    @Override // p098r1.C1284x
    /* renamed from: g */
    public final C1284x mo3036g(long j2, TimeUnit timeUnit) {
        return this.f5052e.mo3036g(j2, timeUnit);
    }
}
