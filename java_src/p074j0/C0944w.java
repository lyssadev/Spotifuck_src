package p074j0;

import android.os.SystemClock;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.fragment.app.C0570A;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p023N.AbstractC0206Q;
import p025O.InterfaceC0319u;
import p058d0.RunnableC0727o;
import p067g1.C0788F;
import p084n.C1028e;
import p084n.C1037n;
import p084n.InterfaceC1033j;
import p084n.InterfaceC1046w;
import p084n.MenuC1035l;
import p084n.SubMenuC1023D;
import p084n.ViewOnKeyListenerC1029f;
import p087o.C1133Y0;
import p087o.C1166k;
import p087o.InterfaceC1102I0;
import p087o.InterfaceC1137a0;
import p087o.InterfaceC1175n;
import p108w0.InterfaceC1331a;

/* renamed from: j0.w */
/* loaded from: classes.dex */
public class C0944w implements InterfaceC1102I0, InterfaceC1046w, InterfaceC1033j, InterfaceC1137a0, InterfaceC0319u, InterfaceC1331a {

    /* renamed from: f */
    public final Object f3861f;

    public /* synthetic */ C0944w(Object obj) {
        this.f3861f = obj;
    }

    @Override // p084n.InterfaceC1046w
    /* renamed from: b */
    public void mo497b(MenuC1035l menuC1035l, boolean z2) {
        if (menuC1035l instanceof SubMenuC1023D) {
            ((SubMenuC1023D) menuC1035l).f4194z.mo2564k().m2582c(false);
        }
        InterfaceC1046w interfaceC1046w = ((C1166k) this.f3861f).f4669j;
        if (interfaceC1046w != null) {
            interfaceC1046w.mo497b(menuC1035l, z2);
        }
    }

    @Override // p025O.InterfaceC0319u
    /* renamed from: c */
    public boolean mo489c(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3861f;
        if (!swipeDismissBehavior.mo1846r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f2291d;
        AbstractC0206Q.m675j(view, (!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p084n.InterfaceC1033j
    /* renamed from: d */
    public boolean mo2069d(MenuC1035l menuC1035l, MenuItem menuItem) {
        InterfaceC1175n interfaceC1175n = ((ActionMenuView) this.f3861f).f1434E;
        if (interfaceC1175n != null) {
            Iterator it2 = ((CopyOnWriteArrayList) ((C1133Y0) interfaceC1175n).f4567f.f1512L.f1246c).iterator();
            while (it2.hasNext()) {
                if (((C0570A) it2.next()).f1697a.m1504o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p084n.InterfaceC1033j
    /* renamed from: f */
    public void mo2070f(MenuC1035l menuC1035l) {
        C1133Y0 c1133y0 = ((ActionMenuView) this.f3861f).f1440z;
        if (c1133y0 != null) {
            c1133y0.mo2070f(menuC1035l);
        }
    }

    @Override // p087o.InterfaceC1102I0
    /* renamed from: g */
    public void mo2405g(MenuC1035l menuC1035l, C1037n c1037n) {
        ((ViewOnKeyListenerC1029f) this.f3861f).f4227k.removeCallbacksAndMessages(menuC1035l);
    }

    @Override // p084n.InterfaceC1046w
    /* renamed from: h */
    public boolean mo500h(MenuC1035l menuC1035l) {
        C1166k c1166k = (C1166k) this.f3861f;
        if (menuC1035l == c1166k.f4667h) {
            return false;
        }
        ((SubMenuC1023D) menuC1035l).f4193A.getClass();
        c1166k.getClass();
        InterfaceC1046w interfaceC1046w = c1166k.f4669j;
        if (interfaceC1046w != null) {
            return interfaceC1046w.mo500h(menuC1035l);
        }
        return false;
    }

    /* renamed from: j */
    public synchronized void m2407j(C0788F c0788f) {
        ((LinkedHashSet) this.f3861f).remove(c0788f);
    }

    @Override // p087o.InterfaceC1102I0
    /* renamed from: o */
    public void mo2408o(MenuC1035l menuC1035l, C1037n c1037n) {
        ViewOnKeyListenerC1029f viewOnKeyListenerC1029f = (ViewOnKeyListenerC1029f) this.f3861f;
        viewOnKeyListenerC1029f.f4227k.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1029f.f4229m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC1035l == ((C1028e) arrayList.get(i)).f4216b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC1029f.f4227k.postAtTime(new RunnableC0727o(this, i2 < arrayList.size() ? (C1028e) arrayList.get(i2) : null, c1037n, menuC1035l, 1), menuC1035l, SystemClock.uptimeMillis() + 200);
    }

    public C0944w() {
        this.f3861f = new LinkedHashSet();
    }

    @Override // p087o.InterfaceC1137a0
    /* renamed from: a */
    public void mo2403a(int i) {
    }

    @Override // p087o.InterfaceC1137a0
    /* renamed from: i */
    public void mo2406i(int i) {
    }

    @Override // p087o.InterfaceC1137a0
    /* renamed from: e */
    public void mo2404e(int i, float f2) {
    }
}
