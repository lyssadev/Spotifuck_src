package p098r1;

import java.io.IOException;
import java.io.OutputStream;
import p083m1.C1017x;

/* renamed from: r1.a */
/* loaded from: classes.dex */
public final class C1261a implements InterfaceC1281u {

    /* renamed from: a */
    public final /* synthetic */ int f5028a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f5029b;

    /* renamed from: c */
    public final /* synthetic */ Object f5030c;

    public C1261a(C1284x c1284x, OutputStream outputStream) {
        this.f5029b = c1284x;
        this.f5030c = outputStream;
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: a */
    public final C1284x mo2470a() {
        switch (this.f5028a) {
            case 0:
                return (C1017x) this.f5030c;
            default:
                return (C1284x) this.f5029b;
        }
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: b */
    public final void mo2201b(C1265e c1265e, long j2) throws IOException {
        switch (this.f5028a) {
            case 0:
                AbstractC1285y.m3066a(c1265e.f5044b, 0L, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    C1278r c1278r = c1265e.f5043a;
                    while (true) {
                        if (j3 < 65536) {
                            j3 += c1278r.f5071c - c1278r.f5070b;
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                c1278r = c1278r.f5074f;
                            }
                        }
                    }
                    C1017x c1017x = (C1017x) this.f5030c;
                    c1017x.m2987i();
                    try {
                        try {
                            ((C1261a) this.f5029b).mo2201b(c1265e, j3);
                            j2 -= j3;
                            c1017x.m2988j(true);
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
                }
            default:
                AbstractC1285y.m3066a(c1265e.f5044b, 0L, j2);
                while (j2 > 0) {
                    ((C1284x) this.f5029b).mo3035f();
                    C1278r c1278r2 = c1265e.f5043a;
                    int iMin = (int) Math.min(j2, c1278r2.f5071c - c1278r2.f5070b);
                    ((OutputStream) this.f5030c).write(c1278r2.f5069a, c1278r2.f5070b, iMin);
                    int i = c1278r2.f5070b + iMin;
                    c1278r2.f5070b = i;
                    long j4 = iMin;
                    j2 -= j4;
                    c1265e.f5044b -= j4;
                    if (i == c1278r2.f5071c) {
                        c1265e.f5043a = c1278r2.m3058a();
                        AbstractC1279s.m3062a(c1278r2);
                    }
                }
                return;
        }
    }

    @Override // p098r1.InterfaceC1281u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f5028a) {
            case 0:
                C1017x c1017x = (C1017x) this.f5030c;
                c1017x.m2987i();
                try {
                    try {
                        ((C1261a) this.f5029b).close();
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
                ((OutputStream) this.f5030c).close();
                return;
        }
    }

    @Override // p098r1.InterfaceC1281u, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f5028a) {
            case 0:
                C1017x c1017x = (C1017x) this.f5030c;
                c1017x.m2987i();
                try {
                    try {
                        ((C1261a) this.f5029b).flush();
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
                ((OutputStream) this.f5030c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f5028a) {
            case 0:
                return "AsyncTimeout.sink(" + ((C1261a) this.f5029b) + ")";
            default:
                return "sink(" + ((OutputStream) this.f5030c) + ")";
        }
    }

    public C1261a(C1017x c1017x, C1261a c1261a) {
        this.f5030c = c1017x;
        this.f5029b = c1261a;
    }
}
