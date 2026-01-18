package androidx.lifecycle;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0648p {

    /* renamed from: a */
    public final C0624J f1990a;

    public SavedStateHandleAttacher(C0624J c0624j) {
        this.f1990a = c0624j;
    }

    @Override // androidx.lifecycle.InterfaceC0648p
    /* renamed from: b */
    public final void mo1283b(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) {
        if (enumC0644l != EnumC0644l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0644l).toString());
        }
        interfaceC0650r.mo1299d().m1620f(this);
        C0624J c0624j = this.f1990a;
        if (c0624j.f1977b) {
            return;
        }
        Bundle bundleM2441c = c0624j.f1976a.m2441c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = c0624j.f1978c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleM2441c != null) {
            bundle.putAll(bundleM2441c);
        }
        c0624j.f1978c = bundle;
        c0624j.f1977b = true;
    }
}
