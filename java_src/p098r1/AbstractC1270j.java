package p098r1;

import java.io.IOException;

/* renamed from: r1.j */
/* loaded from: classes.dex */
public abstract class AbstractC1270j implements InterfaceC1282v {

    /* renamed from: a */
    public final InterfaceC1282v f5051a;

    public AbstractC1270j(InterfaceC1282v interfaceC1282v) {
        if (interfaceC1282v == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f5051a = interfaceC1282v;
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: a */
    public final C1284x mo2196a() {
        return this.f5051a.mo2196a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5051a.close();
    }

    @Override // p098r1.InterfaceC1282v
    /* renamed from: e */
    public long mo2197e(C1265e c1265e, long j2) {
        return this.f5051a.mo2197e(c1265e, 8192L);
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f5051a.toString() + ")";
    }
}
