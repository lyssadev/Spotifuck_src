package p067g1;

import p072i1.C0874d;
import p098r1.AbstractC1269i;
import p098r1.InterfaceC1281u;

/* renamed from: g1.c */
/* loaded from: classes.dex */
public final class C0792c extends AbstractC1269i {

    /* renamed from: b */
    public final /* synthetic */ C0874d f2916b;

    /* renamed from: c */
    public final /* synthetic */ C0793d f2917c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0792c(C0793d c0793d, InterfaceC1281u interfaceC1281u, C0874d c0874d) {
        super(interfaceC1281u);
        this.f2917c = c0793d;
        this.f2916b = c0874d;
    }

    @Override // p098r1.AbstractC1269i, p098r1.InterfaceC1281u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f2917c.f2922e) {
            try {
                C0793d c0793d = this.f2917c;
                if (c0793d.f2921d) {
                    return;
                }
                c0793d.f2921d = true;
                c0793d.f2922e.getClass();
                super.close();
                this.f2916b.m2204b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
