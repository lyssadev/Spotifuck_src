package p061e1;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e1.a */
/* loaded from: classes.dex */
public final class C0737a implements InterfaceC0740d {

    /* renamed from: a */
    public final AtomicReference f2725a;

    public C0737a(InterfaceC0740d interfaceC0740d) {
        this.f2725a = new AtomicReference(interfaceC0740d);
    }

    @Override // p061e1.InterfaceC0740d
    public final Iterator iterator() {
        InterfaceC0740d interfaceC0740d = (InterfaceC0740d) this.f2725a.getAndSet(null);
        if (interfaceC0740d != null) {
            return interfaceC0740d.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
