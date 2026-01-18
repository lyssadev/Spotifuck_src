package p087o;

import android.view.View;
import p084n.InterfaceC1033j;
import p084n.MenuC1035l;

/* renamed from: o.i */
/* loaded from: classes.dex */
public final class RunnableC1160i implements Runnable {

    /* renamed from: a */
    public final C1154g f4625a;

    /* renamed from: b */
    public final /* synthetic */ C1166k f4626b;

    public RunnableC1160i(C1166k c1166k, C1154g c1154g) {
        this.f4626b = c1166k;
        this.f4625a = c1154g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1033j interfaceC1033j;
        C1166k c1166k = this.f4626b;
        MenuC1035l menuC1035l = c1166k.f4667h;
        if (menuC1035l != null && (interfaceC1033j = menuC1035l.f4262e) != null) {
            interfaceC1033j.mo2070f(menuC1035l);
        }
        View view = (View) c1166k.f4672m;
        if (view != null && view.getWindowToken() != null) {
            C1154g c1154g = this.f4625a;
            if (c1154g.m2603b()) {
                c1166k.f4683x = c1154g;
            } else if (c1154g.f4330e != null) {
                c1154g.m2605d(0, 0, false, false);
                c1166k.f4683x = c1154g;
            }
        }
        c1166k.f4685z = null;
    }
}
