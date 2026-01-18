package p098r1;

/* renamed from: r1.i */
/* loaded from: classes.dex */
public abstract class AbstractC1269i implements InterfaceC1281u {

    /* renamed from: a */
    public final InterfaceC1281u f5050a;

    public AbstractC1269i(InterfaceC1281u interfaceC1281u) {
        if (interfaceC1281u == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f5050a = interfaceC1281u;
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: a */
    public final C1284x mo2470a() {
        return this.f5050a.mo2470a();
    }

    @Override // p098r1.InterfaceC1281u
    /* renamed from: b */
    public void mo2201b(C1265e c1265e, long j2) {
        this.f5050a.mo2201b(c1265e, j2);
    }

    @Override // p098r1.InterfaceC1281u, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5050a.close();
    }

    @Override // p098r1.InterfaceC1281u, java.io.Flushable
    public void flush() {
        this.f5050a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f5050a.toString() + ")";
    }
}
