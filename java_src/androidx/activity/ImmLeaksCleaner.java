package androidx.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0644l;
import androidx.lifecycle.InterfaceC0648p;
import androidx.lifecycle.InterfaceC0650r;
import p034S0.C0382b;
import p047Z0.AbstractC0469c;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC0648p {

    /* renamed from: b */
    public static final C0382b f1256b = new C0382b(C0536r.f1313a);

    /* renamed from: a */
    public final AbstractActivityC0532n f1257a;

    public ImmLeaksCleaner(AbstractActivityC0532n abstractActivityC0532n) {
        this.f1257a = abstractActivityC0532n;
    }

    @Override // androidx.lifecycle.InterfaceC0648p
    /* renamed from: b */
    public final void mo1283b(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) {
        if (enumC0644l != EnumC0644l.ON_DESTROY) {
            return;
        }
        Object systemService = this.f1257a.getSystemService("input_method");
        AbstractC0469c.m1100c("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager", systemService);
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        AbstractC0535q abstractC0535q = (AbstractC0535q) f1256b.m978a();
        Object objMo1308b = abstractC0535q.mo1308b(inputMethodManager);
        if (objMo1308b == null) {
            return;
        }
        synchronized (objMo1308b) {
            View viewMo1309c = abstractC0535q.mo1309c(inputMethodManager);
            if (viewMo1309c == null) {
                return;
            }
            if (viewMo1309c.isAttachedToWindow()) {
                return;
            }
            boolean zMo1307a = abstractC0535q.mo1307a(inputMethodManager);
            if (zMo1307a) {
                inputMethodManager.isActive();
            }
        }
    }
}
