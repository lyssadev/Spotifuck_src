package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p000A.C0001b;
import p015J.C0118c;
import p015J.InterfaceC0117b;
import p101t.AbstractC1300e;

/* renamed from: androidx.fragment.app.S */
/* loaded from: classes.dex */
public final class C0587S {

    /* renamed from: a */
    public int f1800a;

    /* renamed from: b */
    public int f1801b;

    /* renamed from: c */
    public final AbstractComponentCallbacksC0606r f1802c;

    /* renamed from: d */
    public final ArrayList f1803d;

    /* renamed from: e */
    public final HashSet f1804e;

    /* renamed from: f */
    public boolean f1805f;

    /* renamed from: g */
    public boolean f1806g;

    /* renamed from: h */
    public final C0582M f1807h;

    public C0587S(int i, int i2, C0582M c0582m, C0118c c0118c) {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0582m.f1780c;
        this.f1803d = new ArrayList();
        this.f1804e = new HashSet();
        this.f1805f = false;
        this.f1806g = false;
        this.f1800a = i;
        this.f1801b = i2;
        this.f1802c = abstractComponentCallbacksC0606r;
        c0118c.m448a(new C0001b(19, this));
        this.f1807h = c0582m;
    }

    /* renamed from: a */
    public final void m1539a() {
        if (this.f1805f) {
            return;
        }
        this.f1805f = true;
        HashSet hashSet = this.f1804e;
        if (hashSet.isEmpty()) {
            m1540b();
            return;
        }
        Iterator it2 = new ArrayList(hashSet).iterator();
        while (it2.hasNext()) {
            C0118c c0118c = (C0118c) it2.next();
            synchronized (c0118c) {
                try {
                    if (!c0118c.f317a) {
                        c0118c.f317a = true;
                        c0118c.f319c = true;
                        InterfaceC0117b interfaceC0117b = c0118c.f318b;
                        if (interfaceC0117b != null) {
                            try {
                                interfaceC0117b.mo48m();
                            } catch (Throwable th) {
                                synchronized (c0118c) {
                                    c0118c.f319c = false;
                                    c0118c.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (c0118c) {
                            c0118c.f319c = false;
                            c0118c.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: b */
    public final void m1540b() {
        if (!this.f1806g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.f1806g = true;
            Iterator it2 = this.f1803d.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
        }
        this.f1807h.m1529k();
    }

    /* renamed from: c */
    public final void m1541c(int i, int i2) {
        int iM3116a = AbstractC1300e.m3116a(i2);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = this.f1802c;
        if (iM3116a == 0) {
            if (this.f1800a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(abstractComponentCallbacksC0606r);
                }
                this.f1800a = i;
                return;
            }
            return;
        }
        if (iM3116a != 1) {
            if (iM3116a != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC0606r);
            }
            this.f1800a = 1;
            this.f1801b = 3;
            return;
        }
        if (this.f1800a == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC0606r);
            }
            this.f1800a = 2;
            this.f1801b = 2;
        }
    }

    /* renamed from: d */
    public final void m1542d() {
        int i = this.f1801b;
        C0582M c0582m = this.f1807h;
        if (i != 2) {
            if (i == 3) {
                AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0582m.f1780c;
                View viewM1582G = abstractComponentCallbacksC0606r.m1582G();
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(viewM1582G.findFocus());
                    viewM1582G.toString();
                    abstractComponentCallbacksC0606r.toString();
                }
                viewM1582G.clearFocus();
                return;
            }
            return;
        }
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = c0582m.f1780c;
        View viewFindFocus = abstractComponentCallbacksC0606r2.f1903J.findFocus();
        if (viewFindFocus != null) {
            abstractComponentCallbacksC0606r2.m1586f().f1892k = viewFindFocus;
            if (Log.isLoggable("FragmentManager", 2)) {
                viewFindFocus.toString();
                abstractComponentCallbacksC0606r2.toString();
            }
        }
        View viewM1582G2 = this.f1802c.m1582G();
        if (viewM1582G2.getParent() == null) {
            c0582m.m1520b();
            viewM1582G2.setAlpha(0.0f);
        }
        if (viewM1582G2.getAlpha() == 0.0f && viewM1582G2.getVisibility() == 0) {
            viewM1582G2.setVisibility(4);
        }
        C0604p c0604p = abstractComponentCallbacksC0606r2.f1906M;
        viewM1582G2.setAlpha(c0604p == null ? 1.0f : c0604p.f1891j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Operation {");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} {mFinalState = ");
        int i = this.f1800a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        sb.append("} {mLifecycleImpact = ");
        int i2 = this.f1801b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE");
        sb.append("} {mFragment = ");
        sb.append(this.f1802c);
        sb.append("}");
        return sb.toString();
    }
}
