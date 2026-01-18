package androidx.fragment.app;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0623I;
import androidx.lifecycle.C0628N;
import androidx.lifecycle.C0630P;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.C0656x;
import androidx.lifecycle.EnumC0645m;
import androidx.lifecycle.InterfaceC0631Q;
import androidx.lifecycle.InterfaceC0640h;
import androidx.lifecycle.InterfaceC0650r;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p046Z.AbstractC0464d;
import p046Z.C0463c;
import p046Z.C0465e;
import p047Z0.AbstractC0469c;
import p052b0.C0665c;
import p066g0.AbstractC0774r;
import p068h.AbstractActivityC0841l;
import p077k0.C0958c;
import p077k0.C0959d;
import p077k0.InterfaceC0960e;

/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0606r implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0650r, InterfaceC0631Q, InterfaceC0640h, InterfaceC0960e {

    /* renamed from: Y */
    public static final Object f1893Y = new Object();

    /* renamed from: A */
    public int f1894A;

    /* renamed from: B */
    public int f1895B;

    /* renamed from: C */
    public String f1896C;

    /* renamed from: D */
    public boolean f1897D;

    /* renamed from: E */
    public boolean f1898E;

    /* renamed from: F */
    public boolean f1899F;

    /* renamed from: H */
    public boolean f1901H;

    /* renamed from: I */
    public ViewGroup f1902I;

    /* renamed from: J */
    public View f1903J;

    /* renamed from: K */
    public boolean f1904K;

    /* renamed from: M */
    public C0604p f1906M;

    /* renamed from: N */
    public boolean f1907N;

    /* renamed from: O */
    public LayoutInflater f1908O;

    /* renamed from: P */
    public boolean f1909P;

    /* renamed from: Q */
    public String f1910Q;

    /* renamed from: S */
    public C0652t f1912S;

    /* renamed from: T */
    public C0584O f1913T;

    /* renamed from: V */
    public C0959d f1915V;

    /* renamed from: W */
    public final ArrayList f1916W;

    /* renamed from: X */
    public final C0602n f1917X;

    /* renamed from: g */
    public Bundle f1919g;

    /* renamed from: h */
    public SparseArray f1920h;

    /* renamed from: i */
    public Bundle f1921i;

    /* renamed from: k */
    public Bundle f1923k;

    /* renamed from: l */
    public AbstractComponentCallbacksC0606r f1924l;

    /* renamed from: n */
    public int f1926n;

    /* renamed from: p */
    public boolean f1928p;

    /* renamed from: q */
    public boolean f1929q;

    /* renamed from: r */
    public boolean f1930r;

    /* renamed from: s */
    public boolean f1931s;

    /* renamed from: t */
    public boolean f1932t;

    /* renamed from: u */
    public boolean f1933u;

    /* renamed from: v */
    public int f1934v;

    /* renamed from: w */
    public C0577H f1935w;

    /* renamed from: x */
    public C0608t f1936x;

    /* renamed from: z */
    public AbstractComponentCallbacksC0606r f1938z;

    /* renamed from: f */
    public int f1918f = -1;

    /* renamed from: j */
    public String f1922j = UUID.randomUUID().toString();

    /* renamed from: m */
    public String f1925m = null;

    /* renamed from: o */
    public Boolean f1927o = null;

    /* renamed from: y */
    public C0577H f1937y = new C0577H();

    /* renamed from: G */
    public final boolean f1900G = true;

    /* renamed from: L */
    public boolean f1905L = true;

    /* renamed from: R */
    public EnumC0645m f1911R = EnumC0645m.f2005e;

    /* renamed from: U */
    public final C0656x f1914U = new C0656x();

    public AbstractComponentCallbacksC0606r() {
        new AtomicInteger();
        this.f1916W = new ArrayList();
        this.f1917X = new C0602n(this);
        m1593m();
    }

    /* renamed from: A */
    public void mo1565A() {
        this.f1901H = true;
    }

    /* renamed from: C */
    public void mo1566C(Bundle bundle) {
        this.f1901H = true;
    }

    /* renamed from: D */
    public void mo1567D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1937y.m1474K();
        this.f1933u = true;
        this.f1913T = new C0584O(this, mo1298c());
        View viewMo1598u = mo1598u(layoutInflater, viewGroup);
        this.f1903J = viewMo1598u;
        if (viewMo1598u == null) {
            if (this.f1913T.f1794h != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1913T = null;
            return;
        }
        this.f1913T.m1537f();
        View view = this.f1903J;
        C0584O c0584o = this.f1913T;
        AbstractC0469c.m1102e("<this>", view);
        view.setTag(R.id.view_tree_lifecycle_owner, c0584o);
        View view2 = this.f1903J;
        C0584O c0584o2 = this.f1913T;
        AbstractC0469c.m1102e("<this>", view2);
        view2.setTag(R.id.view_tree_view_model_store_owner, c0584o2);
        View view3 = this.f1903J;
        C0584O c0584o3 = this.f1913T;
        AbstractC0469c.m1102e("<this>", view3);
        view3.setTag(R.id.view_tree_saved_state_registry_owner, c0584o3);
        this.f1914U.m1631e(this.f1913T);
    }

    /* renamed from: E */
    public final AbstractActivityC0841l m1580E() {
        C0608t c0608t = this.f1936x;
        AbstractActivityC0841l abstractActivityC0841l = c0608t == null ? null : c0608t.f1941f;
        if (abstractActivityC0841l != null) {
            return abstractActivityC0841l;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* renamed from: F */
    public final Context m1581F() {
        Context contextM1588h = m1588h();
        if (contextM1588h != null) {
            return contextM1588h;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* renamed from: G */
    public final View m1582G() {
        View view = this.f1903J;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* renamed from: H */
    public final void m1583H(int i, int i2, int i3, int i4) {
        if (this.f1906M == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m1586f().f1883b = i;
        m1586f().f1884c = i2;
        m1586f().f1885d = i3;
        m1586f().f1886e = i4;
    }

    /* renamed from: I */
    public final void m1584I(Bundle bundle) {
        C0577H c0577h = this.f1935w;
        if (c0577h != null && (c0577h.f1715E || c0577h.f1716F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f1923k = bundle;
    }

    /* renamed from: J */
    public final void m1585J(AbstractC0774r abstractC0774r) {
        if (abstractC0774r != null) {
            C0463c c0463c = AbstractC0464d.f1106a;
            AbstractC0464d.m1095b(new C0465e(this, "Attempting to set target fragment " + abstractC0774r + " with request code 0 for fragment " + this));
            AbstractC0464d.m1094a(this).getClass();
        }
        C0577H c0577h = this.f1935w;
        C0577H c0577h2 = abstractC0774r != null ? abstractC0774r.f1935w : null;
        if (c0577h != null && c0577h2 != null && c0577h != c0577h2) {
            throw new IllegalArgumentException("Fragment " + abstractC0774r + " must share the same FragmentManager to be set as a target fragment");
        }
        for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM1592l = abstractC0774r; abstractComponentCallbacksC0606rM1592l != null; abstractComponentCallbacksC0606rM1592l = abstractComponentCallbacksC0606rM1592l.m1592l(false)) {
            if (super.equals(this)) {
                throw new IllegalArgumentException("Setting " + abstractC0774r + " as the target of " + this + " would create a target cycle");
            }
        }
        if (abstractC0774r == null) {
            this.f1925m = null;
            this.f1924l = null;
        } else if (this.f1935w == null || abstractC0774r.f1935w == null) {
            this.f1925m = null;
            this.f1924l = abstractC0774r;
        } else {
            this.f1925m = abstractC0774r.f1922j;
            this.f1924l = null;
        }
        this.f1926n = 0;
    }

    @Override // androidx.lifecycle.InterfaceC0640h
    /* renamed from: a */
    public final C0665c mo1296a() {
        Application application;
        Context applicationContext = m1581F().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(m1581F().getApplicationContext());
        }
        C0665c c0665c = new C0665c(0);
        LinkedHashMap linkedHashMap = c0665c.f2259a;
        if (application != null) {
            linkedHashMap.put(C0628N.f1985a, application);
        }
        linkedHashMap.put(AbstractC0623I.f1973a, this);
        linkedHashMap.put(AbstractC0623I.f1974b, this);
        Bundle bundle = this.f1923k;
        if (bundle != null) {
            linkedHashMap.put(AbstractC0623I.f1975c, bundle);
        }
        return c0665c;
    }

    @Override // p077k0.InterfaceC0960e
    /* renamed from: b */
    public final C0958c mo1297b() {
        return this.f1915V.f3919b;
    }

    @Override // androidx.lifecycle.InterfaceC0631Q
    /* renamed from: c */
    public final C0630P mo1298c() {
        if (this.f1935w == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m1589i() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f1935w.f1722L.f1761e;
        C0630P c0630p = (C0630P) map.get(this.f1922j);
        if (c0630p != null) {
            return c0630p;
        }
        C0630P c0630p2 = new C0630P();
        map.put(this.f1922j, c0630p2);
        return c0630p2;
    }

    @Override // androidx.lifecycle.InterfaceC0650r
    /* renamed from: d */
    public final C0652t mo1299d() {
        return this.f1912S;
    }

    /* renamed from: e */
    public AbstractC0610v mo1569e() {
        return new C0603o(this);
    }

    /* renamed from: f */
    public final C0604p m1586f() {
        if (this.f1906M == null) {
            C0604p c0604p = new C0604p();
            Object obj = f1893Y;
            c0604p.f1888g = obj;
            c0604p.f1889h = obj;
            c0604p.f1890i = obj;
            c0604p.f1891j = 1.0f;
            c0604p.f1892k = null;
            this.f1906M = c0604p;
        }
        return this.f1906M;
    }

    /* renamed from: g */
    public final C0577H m1587g() {
        if (this.f1936x != null) {
            return this.f1937y;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* renamed from: h */
    public final Context m1588h() {
        C0608t c0608t = this.f1936x;
        if (c0608t == null) {
            return null;
        }
        return c0608t.f1942g;
    }

    /* renamed from: i */
    public final int m1589i() {
        EnumC0645m enumC0645m = this.f1911R;
        return (enumC0645m == EnumC0645m.f2002b || this.f1938z == null) ? enumC0645m.ordinal() : Math.min(enumC0645m.ordinal(), this.f1938z.m1589i());
    }

    /* renamed from: j */
    public final C0577H m1590j() {
        C0577H c0577h = this.f1935w;
        if (c0577h != null) {
            return c0577h;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* renamed from: k */
    public final Resources m1591k() {
        return m1581F().getResources();
    }

    /* renamed from: l */
    public final AbstractComponentCallbacksC0606r m1592l(boolean z2) {
        String str;
        if (z2) {
            C0463c c0463c = AbstractC0464d.f1106a;
            AbstractC0464d.m1095b(new C0465e(this, "Attempting to get target fragment from fragment " + this));
            AbstractC0464d.m1094a(this).getClass();
        }
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1924l;
        if (abstractComponentCallbacksC0606r != null) {
            return abstractComponentCallbacksC0606r;
        }
        C0577H c0577h = this.f1935w;
        if (c0577h == null || (str = this.f1925m) == null) {
            return null;
        }
        return c0577h.f1726c.m82d(str);
    }

    /* renamed from: m */
    public final void m1593m() {
        this.f1912S = new C0652t(this);
        this.f1915V = new C0959d(this);
        ArrayList arrayList = this.f1916W;
        C0602n c0602n = this.f1917X;
        if (arrayList.contains(c0602n)) {
            return;
        }
        if (this.f1918f >= 0) {
            c0602n.m1578a();
        } else {
            arrayList.add(c0602n);
        }
    }

    /* renamed from: n */
    public final void m1594n() {
        m1593m();
        this.f1910Q = this.f1922j;
        this.f1922j = UUID.randomUUID().toString();
        this.f1928p = false;
        this.f1929q = false;
        this.f1930r = false;
        this.f1931s = false;
        this.f1932t = false;
        this.f1934v = 0;
        this.f1935w = null;
        this.f1937y = new C0577H();
        this.f1936x = null;
        this.f1894A = 0;
        this.f1895B = 0;
        this.f1896C = null;
        this.f1897D = false;
        this.f1898E = false;
    }

    /* renamed from: o */
    public final boolean m1595o() {
        return this.f1936x != null && this.f1928p;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1901H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m1580E().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1901H = true;
    }

    /* renamed from: p */
    public final boolean m1596p() {
        if (!this.f1897D) {
            C0577H c0577h = this.f1935w;
            if (c0577h == null) {
                return false;
            }
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1938z;
            c0577h.getClass();
            if (!(abstractComponentCallbacksC0606r == null ? false : abstractComponentCallbacksC0606r.m1596p())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public final boolean m1597q() {
        return this.f1934v > 0;
    }

    /* renamed from: r */
    public void mo1570r() {
        this.f1901H = true;
    }

    /* renamed from: s */
    public void mo1571s(AbstractActivityC0841l abstractActivityC0841l) {
        this.f1901H = true;
        C0608t c0608t = this.f1936x;
        if ((c0608t == null ? null : c0608t.f1941f) != null) {
            this.f1901H = true;
        }
    }

    /* renamed from: t */
    public void mo1572t(Bundle bundle) {
        Parcelable parcelable;
        this.f1901H = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f1937y.m1480Q(parcelable);
            C0577H c0577h = this.f1937y;
            c0577h.f1715E = false;
            c0577h.f1716F = false;
            c0577h.f1722L.f1764h = false;
            c0577h.m1509t(1);
        }
        C0577H c0577h2 = this.f1937y;
        if (c0577h2.f1742s >= 1) {
            return;
        }
        c0577h2.f1715E = false;
        c0577h2.f1716F = false;
        c0577h2.f1722L.f1764h = false;
        c0577h2.m1509t(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1922j);
        if (this.f1894A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1894A));
        }
        if (this.f1896C != null) {
            sb.append(" tag=");
            sb.append(this.f1896C);
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public View mo1598u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* renamed from: v */
    public void mo1573v() {
        this.f1901H = true;
    }

    /* renamed from: w */
    public void mo1574w() {
        this.f1901H = true;
    }

    /* renamed from: x */
    public LayoutInflater mo1575x(Bundle bundle) {
        C0608t c0608t = this.f1936x;
        if (c0608t == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0841l abstractActivityC0841l = c0608t.f1945j;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC0841l.getLayoutInflater().cloneInContext(abstractActivityC0841l);
        layoutInflaterCloneInContext.setFactory2(this.f1937y.f1729f);
        return layoutInflaterCloneInContext;
    }

    /* renamed from: y */
    public abstract void mo1576y(Bundle bundle);

    /* renamed from: z */
    public void mo1577z() {
        this.f1901H = true;
    }

    /* renamed from: B */
    public void mo1579B(Bundle bundle) {
    }
}
