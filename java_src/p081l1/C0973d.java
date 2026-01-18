package p081l1;

import java.net.ProtocolException;
import p070h1.AbstractC0869c;
import p098r1.C1265e;
import p098r1.C1271k;
import p098r1.C1284x;
import p098r1.InterfaceC1281u;

/* renamed from: l1.d */
/* loaded from: classes.dex */
public final class C0973d implements InterfaceC1281u {

    /* renamed from: a */
    public final C1271k f3956a;

    /* renamed from: b */
    public boolean f3957b;

    /* renamed from: c */
    public long f3958c;

    /* renamed from: d */
    public final /* synthetic */ C0976g f3959d;

    public C0973d(C0976g c0976g, long j2) {
        this.f3959d = c0976g;
        this.f3956a = new C1271k(c0976g.f3965d.f5064b.mo2470a());
        this.f3958c = j2;
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: a */
    public final C1284x mo2470a() {
        return this.f3956a;
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: b */
    public final void mo2201b(C1265e c1265e, long j2) throws ProtocolException {
        if (this.f3957b) {
            throw new IllegalStateException("closed");
        }
        long j3 = c1265e.f5044b;
        byte[] bArr = AbstractC0869c.f3362a;
        if (j2 < 0 || 0 > j3 || j3 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (j2 <= this.f3958c) {
            this.f3959d.f3965d.mo2201b(c1265e, j2);
            this.f3958c -= j2;
        } else {
            throw new ProtocolException("expected " + this.f3958c + " bytes but received " + j2);
        }
    }

    @Override // p098r1.InterfaceC1281u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws ProtocolException {
        if (this.f3957b) {
            return;
        }
        this.f3957b = true;
        if (this.f3958c > 0) {
            throw new ProtocolException("unexpected end of stream");
        }
        C0976g c0976g = this.f3959d;
        c0976g.getClass();
        C1271k c1271k = this.f3956a;
        C1284x c1284x = c1271k.f5052e;
        c1271k.f5052e = C1284x.f5081d;
        c1284x.mo3030a();
        c1284x.mo3031b();
        c0976g.f3966e = 3;
    }

    @Override // p098r1.InterfaceC1281u, java.io.Flushable
    public final void flush() {
        if (this.f3957b) {
            return;
        }
        this.f3959d.f3965d.flush();
    }
}
