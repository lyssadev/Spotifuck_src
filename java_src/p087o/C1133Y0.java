package p087o;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0570A;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p084n.InterfaceC1033j;
import p084n.MenuC1035l;

/* renamed from: o.Y0 */
/* loaded from: classes.dex */
public final class C1133Y0 implements InterfaceC1175n, InterfaceC1033j {

    /* renamed from: f */
    public final /* synthetic */ Toolbar f4567f;

    public /* synthetic */ C1133Y0(Toolbar toolbar) {
        this.f4567f = toolbar;
    }

    @Override // p084n.InterfaceC1033j
    /* renamed from: d */
    public boolean mo2069d(MenuC1035l menuC1035l, MenuItem menuItem) {
        this.f4567f.getClass();
        return false;
    }

    @Override // p084n.InterfaceC1033j
    /* renamed from: f */
    public void mo2070f(MenuC1035l menuC1035l) {
        Toolbar toolbar = this.f4567f;
        C1166k c1166k = toolbar.f1523f.f1439y;
        if (c1166k == null || !c1166k.m2799i()) {
            Iterator it2 = ((CopyOnWriteArrayList) toolbar.f1512L.f1246c).iterator();
            while (it2.hasNext()) {
                ((C0570A) it2.next()).f1697a.m1508s();
            }
        }
    }
}
