package androidx.lifecycle;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0648p {

    /* renamed from: a */
    public final InterfaceC0636d f1968a;

    /* renamed from: b */
    public final InterfaceC0648p f1969b;

    public DefaultLifecycleObserverAdapter(InterfaceC0636d interfaceC0636d, InterfaceC0648p interfaceC0648p) {
        this.f1968a = interfaceC0636d;
        this.f1969b = interfaceC0648p;
    }

    @Override // androidx.lifecycle.InterfaceC0648p
    /* renamed from: b */
    public final void mo1283b(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) {
        int i = AbstractC0637e.f1999a[enumC0644l.ordinal()];
        InterfaceC0636d interfaceC0636d = this.f1968a;
        if (i == 3) {
            interfaceC0636d.mo1418a();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0648p interfaceC0648p = this.f1969b;
        if (interfaceC0648p != null) {
            interfaceC0648p.mo1283b(interfaceC0650r, enumC0644l);
        }
    }
}
