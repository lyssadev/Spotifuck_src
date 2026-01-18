package p098r1;

import java.io.IOException;
import java.io.InputStream;
import p083m1.C1017x;

/* renamed from: r1.b */
/* loaded from: classes.dex */
public final class C1262b implements InterfaceC1282v {

    /* renamed from: a */
    public final /* synthetic */ int f5031a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f5032b;

    /* renamed from: c */
    public final /* synthetic */ Object f5033c;

    public C1262b(C1284x c1284x, InputStream inputStream) {
        this.f5032b = c1284x;
        this.f5033c = inputStream;
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: a */
    public final C1284x mo2196a() {
        switch (this.f5031a) {
            case 0:
                return (C1017x) this.f5033c;
            default:
                return (C1284x) this.f5032b;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f5031a) {
            case 0:
                C1017x c1017x = (C1017x) this.f5033c;
                try {
                    try {
                        ((C1262b) this.f5032b).close();
                        c1017x.m2988j(true);
                        return;
                    } catch (IOException e) {
                        if (!c1017x.m2989k()) {
                            throw e;
                        }
                        throw c1017x.mo2521l(e);
                    }
                } catch (Throwable th) {
                    c1017x.m2988j(false);
                    throw th;
                }
            default:
                ((InputStream) this.f5033c).close();
                return;
        }
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: e */
    public final long mo2197e(C1265e c1265e, long j2) throws IOException {
        switch (this.f5031a) {
            case 0:
                C1017x c1017x = (C1017x) this.f5033c;
                c1017x.m2987i();
                try {
                    try {
                        long jMo2197e = ((C1262b) this.f5032b).mo2197e(c1265e, 8192L);
                        c1017x.m2988j(true);
                        return jMo2197e;
                    } catch (Throwable th) {
                        c1017x.m2988j(false);
                        throw th;
                    }
                } catch (IOException e) {
                    if (c1017x.m2989k()) {
                        throw c1017x.mo2521l(e);
                    }
                    throw e;
                }
            default:
                try {
                    ((C1284x) this.f5032b).mo3035f();
                    C1278r c1278rM3007t = c1265e.m3007t(1);
                    int i = ((InputStream) this.f5033c).read(c1278rM3007t.f5069a, c1278rM3007t.f5071c, (int) Math.min(8192L, 8192 - c1278rM3007t.f5071c));
                    if (i == -1) {
                        return -1L;
                    }
                    c1278rM3007t.f5071c += i;
                    long j3 = i;
                    c1265e.f5044b += j3;
                    return j3;
                } catch (AssertionError e2) {
                    if (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) {
                        throw e2;
                    }
                    throw new IOException(e2);
                }
        }
    }

    public final String toString() {
        switch (this.f5031a) {
            case 0:
                return "AsyncTimeout.source(" + ((C1262b) this.f5032b) + ")";
            default:
                return "source(" + ((InputStream) this.f5033c) + ")";
        }
    }

    public C1262b(C1017x c1017x, C1262b c1262b) {
        this.f5033c = c1017x;
        this.f5032b = c1262b;
    }
}
