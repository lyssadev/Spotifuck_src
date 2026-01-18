package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0513t;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.EnumC0644l;
import androidx.lifecycle.EnumC0645m;
import androidx.lifecycle.InterfaceC0631Q;
import androidx.lifecycle.InterfaceC0648p;
import androidx.lifecycle.InterfaceC0650r;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p000A.C0010k;
import p007E.C0057j;
import p023N.AbstractC0193D;
import p023N.AbstractC0206Q;
import p024N0.ViewOnAttachStateChangeListenerC0287o;
import p030Q0.AbstractC0328E;
import p046Z.AbstractC0464d;
import p046Z.C0461a;
import p046Z.C0463c;
import p055c0.C0673a;
import p096r.C1257l;

/* renamed from: androidx.fragment.app.M */
/* loaded from: classes.dex */
public final class C0582M {

    /* renamed from: a */
    public final C0057j f1778a;

    /* renamed from: b */
    public final C0010k f1779b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0606r f1780c;

    /* renamed from: d */
    public boolean f1781d = false;

    /* renamed from: e */
    public int f1782e = -1;

    public C0582M(C0057j c0057j, C0010k c0010k, AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        this.f1778a = c0057j;
        this.f1779b = c0010k;
        this.f1780c = abstractComponentCallbacksC0606r;
    }

    /* renamed from: a */
    public final void m1519a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        Bundle bundle = abstractComponentCallbacksC0606r.f1919g;
        abstractComponentCallbacksC0606r.f1937y.m1474K();
        abstractComponentCallbacksC0606r.f1918f = 3;
        abstractComponentCallbacksC0606r.f1901H = false;
        abstractComponentCallbacksC0606r.mo1570r();
        if (!abstractComponentCallbacksC0606r.f1901H) {
            throw new C0588T("Fragment " + abstractComponentCallbacksC0606r + " did not call through to super.onActivityCreated()");
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            abstractComponentCallbacksC0606r.toString();
        }
        View view = abstractComponentCallbacksC0606r.f1903J;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0606r.f1919g;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0606r.f1920h;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0606r.f1920h = null;
            }
            if (abstractComponentCallbacksC0606r.f1903J != null) {
                abstractComponentCallbacksC0606r.f1913T.f1795i.m2446b(abstractComponentCallbacksC0606r.f1921i);
                abstractComponentCallbacksC0606r.f1921i = null;
            }
            abstractComponentCallbacksC0606r.f1901H = false;
            abstractComponentCallbacksC0606r.mo1566C(bundle2);
            if (!abstractComponentCallbacksC0606r.f1901H) {
                throw new C0588T("Fragment " + abstractComponentCallbacksC0606r + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0606r.f1903J != null) {
                abstractComponentCallbacksC0606r.f1913T.m1536e(EnumC0644l.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0606r.f1919g = null;
        C0577H c0577h = abstractComponentCallbacksC0606r.f1937y;
        c0577h.f1715E = false;
        c0577h.f1716F = false;
        c0577h.f1722L.f1764h = false;
        c0577h.m1509t(4);
        this.f1778a.m267d(false);
    }

    /* renamed from: b */
    public final void m1520b() {
        View view;
        View view2;
        C0010k c0010k = this.f1779b;
        c0010k.getClass();
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        ViewGroup viewGroup = abstractComponentCallbacksC0606r.f1902I;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c0010k.f25h;
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0606r);
            int i = iIndexOf - 1;
            while (true) {
                if (i < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = (AbstractComponentCallbacksC0606r) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC0606r2.f1902I == viewGroup && (view = abstractComponentCallbacksC0606r2.f1903J) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r3 = (AbstractComponentCallbacksC0606r) arrayList.get(i);
                    if (abstractComponentCallbacksC0606r3.f1902I == viewGroup && (view2 = abstractComponentCallbacksC0606r3.f1903J) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i--;
                }
            }
        }
        abstractComponentCallbacksC0606r.f1902I.addView(abstractComponentCallbacksC0606r.f1903J, iIndexOfChild);
    }

    /* renamed from: c */
    public final void m1521c() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = abstractComponentCallbacksC0606r.f1924l;
        C0582M c0582m = null;
        C0010k c0010k = this.f1779b;
        if (abstractComponentCallbacksC0606r2 != null) {
            C0582M c0582m2 = (C0582M) ((HashMap) c0010k.f23f).get(abstractComponentCallbacksC0606r2.f1922j);
            if (c0582m2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0606r + " declared target fragment " + abstractComponentCallbacksC0606r.f1924l + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0606r.f1925m = abstractComponentCallbacksC0606r.f1924l.f1922j;
            abstractComponentCallbacksC0606r.f1924l = null;
            c0582m = c0582m2;
        } else {
            String str = abstractComponentCallbacksC0606r.f1925m;
            if (str != null && (c0582m = (C0582M) ((HashMap) c0010k.f23f).get(str)) == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0606r + " declared target fragment " + abstractComponentCallbacksC0606r.f1925m + " that does not belong to this FragmentManager!");
            }
        }
        if (c0582m != null) {
            c0582m.m1529k();
        }
        C0577H c0577h = abstractComponentCallbacksC0606r.f1935w;
        abstractComponentCallbacksC0606r.f1936x = c0577h.f1743t;
        abstractComponentCallbacksC0606r.f1938z = c0577h.f1745v;
        C0057j c0057j = this.f1778a;
        c0057j.m273k(false);
        ArrayList arrayList = abstractComponentCallbacksC0606r.f1916W;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C0602n) it2.next()).m1578a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0606r.f1937y.m1491b(abstractComponentCallbacksC0606r.f1936x, abstractComponentCallbacksC0606r.mo1569e(), abstractComponentCallbacksC0606r);
        abstractComponentCallbacksC0606r.f1918f = 0;
        abstractComponentCallbacksC0606r.f1901H = false;
        abstractComponentCallbacksC0606r.mo1571s(abstractComponentCallbacksC0606r.f1936x.f1942g);
        if (!abstractComponentCallbacksC0606r.f1901H) {
            throw new C0588T("Fragment " + abstractComponentCallbacksC0606r + " did not call through to super.onAttach()");
        }
        Iterator it3 = abstractComponentCallbacksC0606r.f1935w.f1736m.iterator();
        while (it3.hasNext()) {
            ((InterfaceC0580K) it3.next()).mo1461a();
        }
        C0577H c0577h2 = abstractComponentCallbacksC0606r.f1937y;
        c0577h2.f1715E = false;
        c0577h2.f1716F = false;
        c0577h2.f1722L.f1764h = false;
        c0577h2.m1509t(0);
        c0057j.m268e(false);
    }

    /* renamed from: d */
    public final int m1522d() {
        C0587S c0587s;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (abstractComponentCallbacksC0606r.f1935w == null) {
            return abstractComponentCallbacksC0606r.f1918f;
        }
        int iMin = this.f1782e;
        int iOrdinal = abstractComponentCallbacksC0606r.f1911R.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0606r.f1930r) {
            if (abstractComponentCallbacksC0606r.f1931s) {
                iMin = Math.max(this.f1782e, 2);
                View view = abstractComponentCallbacksC0606r.f1903J;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1782e < 4 ? Math.min(iMin, abstractComponentCallbacksC0606r.f1918f) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0606r.f1928p) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0606r.f1902I;
        if (viewGroup != null) {
            C0597i c0597iM1556f = C0597i.m1556f(viewGroup, abstractComponentCallbacksC0606r.m1590j().m1470D());
            c0597iM1556f.getClass();
            C0587S c0587sM1560d = c0597iM1556f.m1560d(abstractComponentCallbacksC0606r);
            i = c0587sM1560d != null ? c0587sM1560d.f1801b : 0;
            Iterator it2 = c0597iM1556f.f1859c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    c0587s = null;
                    break;
                }
                c0587s = (C0587S) it2.next();
                if (c0587s.f1802c.equals(abstractComponentCallbacksC0606r) && !c0587s.f1805f) {
                    break;
                }
            }
            if (c0587s != null && (i == 0 || i == 1)) {
                i = c0587s.f1801b;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0606r.f1929q) {
            iMin = abstractComponentCallbacksC0606r.m1597q() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0606r.f1904K && abstractComponentCallbacksC0606r.f1918f < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        return iMin;
    }

    /* renamed from: e */
    public final void m1523e() {
        Parcelable parcelable;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        final AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        if (abstractComponentCallbacksC0606r.f1909P) {
            Bundle bundle = abstractComponentCallbacksC0606r.f1919g;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0606r.f1937y.m1480Q(parcelable);
                C0577H c0577h = abstractComponentCallbacksC0606r.f1937y;
                c0577h.f1715E = false;
                c0577h.f1716F = false;
                c0577h.f1722L.f1764h = false;
                c0577h.m1509t(1);
            }
            abstractComponentCallbacksC0606r.f1918f = 1;
            return;
        }
        C0057j c0057j = this.f1778a;
        c0057j.m274n(false);
        Bundle bundle2 = abstractComponentCallbacksC0606r.f1919g;
        abstractComponentCallbacksC0606r.f1937y.m1474K();
        abstractComponentCallbacksC0606r.f1918f = 1;
        abstractComponentCallbacksC0606r.f1901H = false;
        abstractComponentCallbacksC0606r.f1912S.m1615a(new InterfaceC0648p() { // from class: androidx.fragment.app.Fragment$6
            @Override // androidx.lifecycle.InterfaceC0648p
            /* renamed from: b */
            public final void mo1283b(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) {
                View view;
                if (enumC0644l != EnumC0644l.ON_STOP || (view = abstractComponentCallbacksC0606r.f1903J) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        abstractComponentCallbacksC0606r.f1915V.m2446b(bundle2);
        abstractComponentCallbacksC0606r.mo1572t(bundle2);
        abstractComponentCallbacksC0606r.f1909P = true;
        if (abstractComponentCallbacksC0606r.f1901H) {
            abstractComponentCallbacksC0606r.f1912S.m1618d(EnumC0644l.ON_CREATE);
            c0057j.m269f(false);
        } else {
            throw new C0588T("Fragment " + abstractComponentCallbacksC0606r + " did not call through to super.onCreate()");
        }
    }

    /* renamed from: f */
    public final void m1524f() throws Resources.NotFoundException {
        String resourceName;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (abstractComponentCallbacksC0606r.f1930r) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        LayoutInflater layoutInflaterMo1575x = abstractComponentCallbacksC0606r.mo1575x(abstractComponentCallbacksC0606r.f1919g);
        abstractComponentCallbacksC0606r.f1908O = layoutInflaterMo1575x;
        ViewGroup viewGroup = abstractComponentCallbacksC0606r.f1902I;
        if (viewGroup == null) {
            int i = abstractComponentCallbacksC0606r.f1895B;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0606r + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0606r.f1935w.f1744u.mo1563e(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0606r.f1932t) {
                        try {
                            resourceName = abstractComponentCallbacksC0606r.m1591k().getResourceName(abstractComponentCallbacksC0606r.f1895B);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0606r.f1895B) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0606r);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0463c c0463c = AbstractC0464d.f1106a;
                    AbstractC0464d.m1095b(new C0461a(abstractComponentCallbacksC0606r, "Attempting to add fragment " + abstractComponentCallbacksC0606r + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC0464d.m1094a(abstractComponentCallbacksC0606r).getClass();
                }
            }
        }
        abstractComponentCallbacksC0606r.f1902I = viewGroup;
        abstractComponentCallbacksC0606r.mo1567D(layoutInflaterMo1575x, viewGroup, abstractComponentCallbacksC0606r.f1919g);
        View view = abstractComponentCallbacksC0606r.f1903J;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0606r.f1903J.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0606r);
            if (viewGroup != null) {
                m1520b();
            }
            if (abstractComponentCallbacksC0606r.f1897D) {
                abstractComponentCallbacksC0606r.f1903J.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0606r.f1903J;
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            if (view2.isAttachedToWindow()) {
                AbstractC0193D.m594c(abstractComponentCallbacksC0606r.f1903J);
            } else {
                View view3 = abstractComponentCallbacksC0606r.f1903J;
                view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0287o(1, view3));
            }
            abstractComponentCallbacksC0606r.mo1579B(abstractComponentCallbacksC0606r.f1919g);
            abstractComponentCallbacksC0606r.f1937y.m1509t(2);
            this.f1778a.m279s(false);
            int visibility = abstractComponentCallbacksC0606r.f1903J.getVisibility();
            abstractComponentCallbacksC0606r.m1586f().f1891j = abstractComponentCallbacksC0606r.f1903J.getAlpha();
            if (abstractComponentCallbacksC0606r.f1902I != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0606r.f1903J.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0606r.m1586f().f1892k = viewFindFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        viewFindFocus.toString();
                        Objects.toString(abstractComponentCallbacksC0606r);
                    }
                }
                abstractComponentCallbacksC0606r.f1903J.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0606r.f1918f = 2;
    }

    /* renamed from: g */
    public final void m1525g() {
        boolean z2;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM82d;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        boolean z3 = abstractComponentCallbacksC0606r.f1929q && !abstractComponentCallbacksC0606r.m1597q();
        C0010k c0010k = this.f1779b;
        if (z3) {
        }
        if (!z3) {
            C0579J c0579j = (C0579J) c0010k.f26i;
            if (!((c0579j.f1759c.containsKey(abstractComponentCallbacksC0606r.f1922j) && c0579j.f1762f) ? c0579j.f1763g : true)) {
                String str = abstractComponentCallbacksC0606r.f1925m;
                if (str != null && (abstractComponentCallbacksC0606rM82d = c0010k.m82d(str)) != null && abstractComponentCallbacksC0606rM82d.f1899F) {
                    abstractComponentCallbacksC0606r.f1924l = abstractComponentCallbacksC0606rM82d;
                }
                abstractComponentCallbacksC0606r.f1918f = 0;
                return;
            }
        }
        C0608t c0608t = abstractComponentCallbacksC0606r.f1936x;
        if (c0608t instanceof InterfaceC0631Q) {
            z2 = ((C0579J) c0010k.f26i).f1763g;
        } else {
            z2 = c0608t.f1942g instanceof Activity ? !r7.isChangingConfigurations() : true;
        }
        if (z3 || z2) {
            C0579J c0579j2 = (C0579J) c0010k.f26i;
            c0579j2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(abstractComponentCallbacksC0606r);
            }
            c0579j2.m1517c(abstractComponentCallbacksC0606r.f1922j);
        }
        abstractComponentCallbacksC0606r.f1937y.m1500k();
        abstractComponentCallbacksC0606r.f1912S.m1618d(EnumC0644l.ON_DESTROY);
        abstractComponentCallbacksC0606r.f1918f = 0;
        abstractComponentCallbacksC0606r.f1909P = false;
        abstractComponentCallbacksC0606r.f1901H = true;
        this.f1778a.m270g(false);
        Iterator it2 = c0010k.m85g().iterator();
        while (it2.hasNext()) {
            C0582M c0582m = (C0582M) it2.next();
            if (c0582m != null) {
                String str2 = abstractComponentCallbacksC0606r.f1922j;
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = c0582m.f1780c;
                if (str2.equals(abstractComponentCallbacksC0606r2.f1925m)) {
                    abstractComponentCallbacksC0606r2.f1924l = abstractComponentCallbacksC0606r;
                    abstractComponentCallbacksC0606r2.f1925m = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC0606r.f1925m;
        if (str3 != null) {
            abstractComponentCallbacksC0606r.f1924l = c0010k.m82d(str3);
        }
        c0010k.m90l(this);
    }

    /* renamed from: h */
    public final void m1526h() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0606r.f1902I;
        if (viewGroup != null && (view = abstractComponentCallbacksC0606r.f1903J) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0606r.f1937y.m1509t(1);
        if (abstractComponentCallbacksC0606r.f1903J != null && abstractComponentCallbacksC0606r.f1913T.mo1299d().f2012c.compareTo(EnumC0645m.f2003c) >= 0) {
            abstractComponentCallbacksC0606r.f1913T.m1536e(EnumC0644l.ON_DESTROY);
        }
        abstractComponentCallbacksC0606r.f1918f = 1;
        abstractComponentCallbacksC0606r.f1901H = false;
        abstractComponentCallbacksC0606r.mo1573v();
        if (!abstractComponentCallbacksC0606r.f1901H) {
            throw new C0588T("Fragment " + abstractComponentCallbacksC0606r + " did not call through to super.onDestroyView()");
        }
        C0513t c0513t = new C0513t(abstractComponentCallbacksC0606r.mo1298c(), C0673a.f2266d);
        String canonicalName = C0673a.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        C1257l c1257l = ((C0673a) c0513t.m1236k("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), C0673a.class)).f2267c;
        if (c1257l.f5016c > 0) {
            c1257l.f5015b[0].getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0606r.f1933u = false;
        this.f1778a.m280t(false);
        abstractComponentCallbacksC0606r.f1902I = null;
        abstractComponentCallbacksC0606r.f1903J = null;
        abstractComponentCallbacksC0606r.f1913T = null;
        abstractComponentCallbacksC0606r.f1914U.m1631e(null);
        abstractComponentCallbacksC0606r.f1931s = false;
    }

    /* renamed from: i */
    public final void m1527i() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        abstractComponentCallbacksC0606r.f1918f = -1;
        abstractComponentCallbacksC0606r.f1901H = false;
        abstractComponentCallbacksC0606r.mo1574w();
        abstractComponentCallbacksC0606r.f1908O = null;
        if (!abstractComponentCallbacksC0606r.f1901H) {
            throw new C0588T("Fragment " + abstractComponentCallbacksC0606r + " did not call through to super.onDetach()");
        }
        C0577H c0577h = abstractComponentCallbacksC0606r.f1937y;
        if (!c0577h.f1717G) {
            c0577h.m1500k();
            abstractComponentCallbacksC0606r.f1937y = new C0577H();
        }
        this.f1778a.m271i(false);
        abstractComponentCallbacksC0606r.f1918f = -1;
        abstractComponentCallbacksC0606r.f1936x = null;
        abstractComponentCallbacksC0606r.f1938z = null;
        abstractComponentCallbacksC0606r.f1935w = null;
        if (!abstractComponentCallbacksC0606r.f1929q || abstractComponentCallbacksC0606r.m1597q()) {
            C0579J c0579j = (C0579J) this.f1779b.f26i;
            boolean z2 = true;
            if (c0579j.f1759c.containsKey(abstractComponentCallbacksC0606r.f1922j) && c0579j.f1762f) {
                z2 = c0579j.f1763g;
            }
            if (!z2) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        abstractComponentCallbacksC0606r.m1594n();
    }

    /* renamed from: j */
    public final void m1528j() {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (abstractComponentCallbacksC0606r.f1930r && abstractComponentCallbacksC0606r.f1931s && !abstractComponentCallbacksC0606r.f1933u) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(abstractComponentCallbacksC0606r);
            }
            LayoutInflater layoutInflaterMo1575x = abstractComponentCallbacksC0606r.mo1575x(abstractComponentCallbacksC0606r.f1919g);
            abstractComponentCallbacksC0606r.f1908O = layoutInflaterMo1575x;
            abstractComponentCallbacksC0606r.mo1567D(layoutInflaterMo1575x, null, abstractComponentCallbacksC0606r.f1919g);
            View view = abstractComponentCallbacksC0606r.f1903J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0606r.f1903J.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0606r);
                if (abstractComponentCallbacksC0606r.f1897D) {
                    abstractComponentCallbacksC0606r.f1903J.setVisibility(8);
                }
                abstractComponentCallbacksC0606r.mo1579B(abstractComponentCallbacksC0606r.f1919g);
                abstractComponentCallbacksC0606r.f1937y.m1509t(2);
                this.f1778a.m279s(false);
                abstractComponentCallbacksC0606r.f1918f = 2;
            }
        }
    }

    /* renamed from: k */
    public final void m1529k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C0010k c0010k = this.f1779b;
        boolean z2 = this.f1781d;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (z2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC0606r);
                return;
            }
            return;
        }
        try {
            this.f1781d = true;
            boolean z3 = false;
            while (true) {
                int iM1522d = m1522d();
                int i = abstractComponentCallbacksC0606r.f1918f;
                if (iM1522d == i) {
                    if (!z3 && i == -1 && abstractComponentCallbacksC0606r.f1929q && !abstractComponentCallbacksC0606r.m1597q()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(abstractComponentCallbacksC0606r);
                        }
                        C0579J c0579j = (C0579J) c0010k.f26i;
                        c0579j.getClass();
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(abstractComponentCallbacksC0606r);
                        }
                        c0579j.m1517c(abstractComponentCallbacksC0606r.f1922j);
                        c0010k.m90l(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(abstractComponentCallbacksC0606r);
                        }
                        abstractComponentCallbacksC0606r.m1594n();
                    }
                    if (abstractComponentCallbacksC0606r.f1907N) {
                        if (abstractComponentCallbacksC0606r.f1903J != null && (viewGroup = abstractComponentCallbacksC0606r.f1902I) != null) {
                            C0597i c0597iM1556f = C0597i.m1556f(viewGroup, abstractComponentCallbacksC0606r.m1590j().m1470D());
                            if (abstractComponentCallbacksC0606r.f1897D) {
                                c0597iM1556f.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(abstractComponentCallbacksC0606r);
                                }
                                c0597iM1556f.m1557a(3, 1, this);
                            } else {
                                c0597iM1556f.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(abstractComponentCallbacksC0606r);
                                }
                                c0597iM1556f.m1557a(2, 1, this);
                            }
                        }
                        C0577H c0577h = abstractComponentCallbacksC0606r.f1935w;
                        if (c0577h != null && abstractComponentCallbacksC0606r.f1928p && C0577H.m1464F(abstractComponentCallbacksC0606r)) {
                            c0577h.f1714D = true;
                        }
                        abstractComponentCallbacksC0606r.f1907N = false;
                        abstractComponentCallbacksC0606r.f1937y.m1503n();
                    }
                    this.f1781d = false;
                    return;
                }
                if (iM1522d <= i) {
                    switch (i - 1) {
                        case -1:
                            m1527i();
                            break;
                        case 0:
                            m1525g();
                            break;
                        case 1:
                            m1526h();
                            abstractComponentCallbacksC0606r.f1918f = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0606r.f1931s = false;
                            abstractComponentCallbacksC0606r.f1918f = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(abstractComponentCallbacksC0606r);
                            }
                            if (abstractComponentCallbacksC0606r.f1903J != null && abstractComponentCallbacksC0606r.f1920h == null) {
                                m1533o();
                            }
                            if (abstractComponentCallbacksC0606r.f1903J != null && (viewGroup2 = abstractComponentCallbacksC0606r.f1902I) != null) {
                                C0597i c0597iM1556f2 = C0597i.m1556f(viewGroup2, abstractComponentCallbacksC0606r.m1590j().m1470D());
                                c0597iM1556f2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(abstractComponentCallbacksC0606r);
                                }
                                c0597iM1556f2.m1557a(1, 3, this);
                            }
                            abstractComponentCallbacksC0606r.f1918f = 3;
                            break;
                        case 4:
                            m1535q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0606r.f1918f = 5;
                            break;
                        case 6:
                            m1530l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m1521c();
                            break;
                        case 1:
                            m1523e();
                            break;
                        case 2:
                            m1528j();
                            m1524f();
                            break;
                        case 3:
                            m1519a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0606r.f1903J != null && (viewGroup3 = abstractComponentCallbacksC0606r.f1902I) != null) {
                                C0597i c0597iM1556f3 = C0597i.m1556f(viewGroup3, abstractComponentCallbacksC0606r.m1590j().m1470D());
                                int iM932b = AbstractC0328E.m932b(abstractComponentCallbacksC0606r.f1903J.getVisibility());
                                c0597iM1556f3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(abstractComponentCallbacksC0606r);
                                }
                                c0597iM1556f3.m1557a(iM932b, 2, this);
                            }
                            abstractComponentCallbacksC0606r.f1918f = 4;
                            break;
                        case 5:
                            m1534p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0606r.f1918f = 6;
                            break;
                        case 7:
                            m1532n();
                            break;
                    }
                }
                z3 = true;
            }
        } catch (Throwable th) {
            this.f1781d = false;
            throw th;
        }
    }

    /* renamed from: l */
    public final void m1530l() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        abstractComponentCallbacksC0606r.f1937y.m1509t(5);
        if (abstractComponentCallbacksC0606r.f1903J != null) {
            abstractComponentCallbacksC0606r.f1913T.m1536e(EnumC0644l.ON_PAUSE);
        }
        abstractComponentCallbacksC0606r.f1912S.m1618d(EnumC0644l.ON_PAUSE);
        abstractComponentCallbacksC0606r.f1918f = 6;
        abstractComponentCallbacksC0606r.f1901H = true;
        this.f1778a.m272j(false);
    }

    /* renamed from: m */
    public final void m1531m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        Bundle bundle = abstractComponentCallbacksC0606r.f1919g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0606r.f1920h = abstractComponentCallbacksC0606r.f1919g.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0606r.f1921i = abstractComponentCallbacksC0606r.f1919g.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0606r.f1919g.getString("android:target_state");
        abstractComponentCallbacksC0606r.f1925m = string;
        if (string != null) {
            abstractComponentCallbacksC0606r.f1926n = abstractComponentCallbacksC0606r.f1919g.getInt("android:target_req_state", 0);
        }
        boolean z2 = abstractComponentCallbacksC0606r.f1919g.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0606r.f1905L = z2;
        if (z2) {
            return;
        }
        abstractComponentCallbacksC0606r.f1904K = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1532n() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        C0604p c0604p = abstractComponentCallbacksC0606r.f1906M;
        View view = c0604p == null ? null : c0604p.f1892k;
        if (view != null) {
            if (view == abstractComponentCallbacksC0606r.f1903J) {
                view.requestFocus();
                if (Log.isLoggable("FragmentManager", 2)) {
                    view.toString();
                    Objects.toString(abstractComponentCallbacksC0606r);
                    Objects.toString(abstractComponentCallbacksC0606r.f1903J.findFocus());
                }
            } else {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == abstractComponentCallbacksC0606r.f1903J) {
                        view.requestFocus();
                        if (Log.isLoggable("FragmentManager", 2)) {
                        }
                    }
                }
            }
        }
        abstractComponentCallbacksC0606r.m1586f().f1892k = null;
        abstractComponentCallbacksC0606r.f1937y.m1474K();
        abstractComponentCallbacksC0606r.f1937y.m1513x(true);
        abstractComponentCallbacksC0606r.f1918f = 7;
        abstractComponentCallbacksC0606r.f1901H = true;
        C0652t c0652t = abstractComponentCallbacksC0606r.f1912S;
        EnumC0644l enumC0644l = EnumC0644l.ON_RESUME;
        c0652t.m1618d(enumC0644l);
        if (abstractComponentCallbacksC0606r.f1903J != null) {
            abstractComponentCallbacksC0606r.f1913T.f1794h.m1618d(enumC0644l);
        }
        C0577H c0577h = abstractComponentCallbacksC0606r.f1937y;
        c0577h.f1715E = false;
        c0577h.f1716F = false;
        c0577h.f1722L.f1764h = false;
        c0577h.m1509t(7);
        this.f1778a.m275o(false);
        abstractComponentCallbacksC0606r.f1919g = null;
        abstractComponentCallbacksC0606r.f1920h = null;
        abstractComponentCallbacksC0606r.f1921i = null;
    }

    /* renamed from: o */
    public final void m1533o() {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (abstractComponentCallbacksC0606r.f1903J == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0606r);
            Objects.toString(abstractComponentCallbacksC0606r.f1903J);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0606r.f1903J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0606r.f1920h = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0606r.f1913T.f1795i.m2447c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0606r.f1921i = bundle;
    }

    /* renamed from: p */
    public final void m1534p() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        abstractComponentCallbacksC0606r.f1937y.m1474K();
        abstractComponentCallbacksC0606r.f1937y.m1513x(true);
        abstractComponentCallbacksC0606r.f1918f = 5;
        abstractComponentCallbacksC0606r.f1901H = false;
        abstractComponentCallbacksC0606r.mo1577z();
        if (!abstractComponentCallbacksC0606r.f1901H) {
            throw new C0588T("Fragment " + abstractComponentCallbacksC0606r + " did not call through to super.onStart()");
        }
        C0652t c0652t = abstractComponentCallbacksC0606r.f1912S;
        EnumC0644l enumC0644l = EnumC0644l.ON_START;
        c0652t.m1618d(enumC0644l);
        if (abstractComponentCallbacksC0606r.f1903J != null) {
            abstractComponentCallbacksC0606r.f1913T.f1794h.m1618d(enumC0644l);
        }
        C0577H c0577h = abstractComponentCallbacksC0606r.f1937y;
        c0577h.f1715E = false;
        c0577h.f1716F = false;
        c0577h.f1722L.f1764h = false;
        c0577h.m1509t(5);
        this.f1778a.m277q(false);
    }

    /* renamed from: q */
    public final void m1535q() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1780c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC0606r);
        }
        C0577H c0577h = abstractComponentCallbacksC0606r.f1937y;
        c0577h.f1716F = true;
        c0577h.f1722L.f1764h = true;
        c0577h.m1509t(4);
        if (abstractComponentCallbacksC0606r.f1903J != null) {
            abstractComponentCallbacksC0606r.f1913T.m1536e(EnumC0644l.ON_STOP);
        }
        abstractComponentCallbacksC0606r.f1912S.m1618d(EnumC0644l.ON_STOP);
        abstractComponentCallbacksC0606r.f1918f = 4;
        abstractComponentCallbacksC0606r.f1901H = false;
        abstractComponentCallbacksC0606r.mo1565A();
        if (abstractComponentCallbacksC0606r.f1901H) {
            this.f1778a.m278r(false);
            return;
        }
        throw new C0588T("Fragment " + abstractComponentCallbacksC0606r + " did not call through to super.onStop()");
    }

    public C0582M(C0057j c0057j, C0010k c0010k, ClassLoader classLoader, C0571B c0571b, C0581L c0581l) {
        this.f1778a = c0057j;
        this.f1779b = c0010k;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM1460a = c0571b.m1460a(c0581l.f1765a);
        Bundle bundle = c0581l.f1774j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0606rM1460a.m1584I(bundle);
        abstractComponentCallbacksC0606rM1460a.f1922j = c0581l.f1766b;
        abstractComponentCallbacksC0606rM1460a.f1930r = c0581l.f1767c;
        abstractComponentCallbacksC0606rM1460a.f1932t = true;
        abstractComponentCallbacksC0606rM1460a.f1894A = c0581l.f1768d;
        abstractComponentCallbacksC0606rM1460a.f1895B = c0581l.f1769e;
        abstractComponentCallbacksC0606rM1460a.f1896C = c0581l.f1770f;
        abstractComponentCallbacksC0606rM1460a.f1899F = c0581l.f1771g;
        abstractComponentCallbacksC0606rM1460a.f1929q = c0581l.f1772h;
        abstractComponentCallbacksC0606rM1460a.f1898E = c0581l.f1773i;
        abstractComponentCallbacksC0606rM1460a.f1897D = c0581l.f1775k;
        abstractComponentCallbacksC0606rM1460a.f1911R = EnumC0645m.values()[c0581l.f1776l];
        Bundle bundle2 = c0581l.f1777m;
        if (bundle2 != null) {
            abstractComponentCallbacksC0606rM1460a.f1919g = bundle2;
        } else {
            abstractComponentCallbacksC0606rM1460a.f1919g = new Bundle();
        }
        this.f1780c = abstractComponentCallbacksC0606rM1460a;
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC0606rM1460a);
        }
    }

    public C0582M(C0057j c0057j, C0010k c0010k, AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r, C0581L c0581l) {
        this.f1778a = c0057j;
        this.f1779b = c0010k;
        this.f1780c = abstractComponentCallbacksC0606r;
        abstractComponentCallbacksC0606r.f1920h = null;
        abstractComponentCallbacksC0606r.f1921i = null;
        abstractComponentCallbacksC0606r.f1934v = 0;
        abstractComponentCallbacksC0606r.f1931s = false;
        abstractComponentCallbacksC0606r.f1928p = false;
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = abstractComponentCallbacksC0606r.f1924l;
        abstractComponentCallbacksC0606r.f1925m = abstractComponentCallbacksC0606r2 != null ? abstractComponentCallbacksC0606r2.f1922j : null;
        abstractComponentCallbacksC0606r.f1924l = null;
        Bundle bundle = c0581l.f1777m;
        if (bundle != null) {
            abstractComponentCallbacksC0606r.f1919g = bundle;
        } else {
            abstractComponentCallbacksC0606r.f1919g = new Bundle();
        }
    }
}
