package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0648p {

    /* renamed from: a */
    public boolean f1991a;

    @Override // androidx.lifecycle.InterfaceC0648p
    /* renamed from: b */
    public final void mo1283b(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) {
        if (enumC0644l == EnumC0644l.ON_DESTROY) {
            this.f1991a = false;
            interfaceC0650r.mo1299d().m1620f(this);
        }
    }
}
