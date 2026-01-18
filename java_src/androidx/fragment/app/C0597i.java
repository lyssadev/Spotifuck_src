package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p000A.C0010k;
import p007E.C0057j;
import p015J.C0118c;
import p017K.RunnableC0141n;
import p018K0.C0146e;
import p023N.AbstractC0206Q;
import p030Q0.AbstractC0328E;
import p101t.AbstractC1300e;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public final class C0597i {

    /* renamed from: a */
    public final ViewGroup f1857a;

    /* renamed from: b */
    public final ArrayList f1858b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f1859c = new ArrayList();

    /* renamed from: d */
    public boolean f1860d = false;

    /* renamed from: e */
    public boolean f1861e = false;

    public C0597i(ViewGroup viewGroup) {
        this.f1857a = viewGroup;
    }

    /* renamed from: f */
    public static C0597i m1556f(ViewGroup viewGroup, C0146e c0146e) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0597i) {
            return (C0597i) tag;
        }
        c0146e.getClass();
        C0597i c0597i = new C0597i(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0597i);
        return c0597i;
    }

    /* renamed from: a */
    public final void m1557a(int i, int i2, C0582M c0582m) {
        synchronized (this.f1858b) {
            try {
                C0118c c0118c = new C0118c();
                C0587S c0587sM1560d = m1560d(c0582m.f1780c);
                if (c0587sM1560d != null) {
                    c0587sM1560d.m1541c(i, i2);
                    return;
                }
                C0587S c0587s = new C0587S(i, i2, c0582m, c0118c);
                this.f1858b.add(c0587s);
                c0587s.f1803d.add(new RunnableC0586Q(this, c0587s, 0));
                c0587s.f1803d.add(new RunnableC0586Q(this, c0587s, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m1558b(ArrayList arrayList, boolean z2) throws Resources.NotFoundException {
        int i;
        Iterator it2 = arrayList.iterator();
        C0587S c0587s = null;
        C0587S c0587s2 = null;
        while (true) {
            i = 2;
            if (!it2.hasNext()) {
                break;
            }
            C0587S c0587s3 = (C0587S) it2.next();
            int iM933c = AbstractC0328E.m933c(c0587s3.f1802c.f1903J);
            int iM3116a = AbstractC1300e.m3116a(c0587s3.f1800a);
            if (iM3116a != 0) {
                if (iM3116a != 1) {
                    if (iM3116a == 2 || iM3116a == 3) {
                    }
                } else if (iM933c != 2) {
                    c0587s2 = c0587s3;
                }
            }
            if (iM933c == 2 && c0587s == null) {
                c0587s = c0587s3;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(c0587s);
            Objects.toString(c0587s2);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = ((C0587S) arrayList.get(arrayList.size() - 1)).f1802c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0604p c0604p = ((C0587S) it3.next()).f1802c.f1906M;
            C0604p c0604p2 = abstractComponentCallbacksC0606r.f1906M;
            c0604p.f1883b = c0604p2.f1883b;
            c0604p.f1884c = c0604p2.f1884c;
            c0604p.f1885d = c0604p2.f1885d;
            c0604p.f1886e = c0604p2.f1886e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            if (!it4.hasNext()) {
                break;
            }
            C0587S c0587s4 = (C0587S) it4.next();
            C0118c c0118c = new C0118c();
            c0587s4.m1542d();
            HashSet hashSet = c0587s4.f1804e;
            hashSet.add(c0118c);
            C0594f c0594f = new C0594f(c0587s4, c0118c);
            c0594f.f1853d = false;
            c0594f.f1852c = z2;
            arrayList2.add(c0594f);
            C0118c c0118c2 = new C0118c();
            c0587s4.m1542d();
            hashSet.add(c0118c2);
            if (!z2 ? c0587s4 == c0587s2 : c0587s4 == c0587s) {
                z3 = true;
            }
            C0596h c0596h = new C0596h(c0587s4, c0118c2);
            int i2 = c0587s4.f1800a;
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r2 = c0587s4.f1802c;
            if (i2 == 2) {
                if (z2) {
                    C0604p c0604p3 = abstractComponentCallbacksC0606r2.f1906M;
                } else {
                    abstractComponentCallbacksC0606r2.getClass();
                }
                if (z2) {
                    C0604p c0604p4 = abstractComponentCallbacksC0606r2.f1906M;
                } else {
                    C0604p c0604p5 = abstractComponentCallbacksC0606r2.f1906M;
                }
            } else if (z2) {
                C0604p c0604p6 = abstractComponentCallbacksC0606r2.f1906M;
            } else {
                abstractComponentCallbacksC0606r2.getClass();
            }
            if (z3) {
                if (z2) {
                    C0604p c0604p7 = abstractComponentCallbacksC0606r2.f1906M;
                } else {
                    abstractComponentCallbacksC0606r2.getClass();
                }
            }
            arrayList3.add(c0596h);
            c0587s4.f1803d.add(new RunnableC0141n(this, arrayList4, c0587s4));
        }
        HashMap map = new HashMap();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            C0587S c0587s5 = (C0587S) ((C0596h) it5.next()).f1855a;
            AbstractC0328E.m933c(c0587s5.f1802c.f1903J);
            int i3 = c0587s5.f1800a;
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            C0596h c0596h2 = (C0596h) it6.next();
            map.put((C0587S) c0596h2.f1855a, Boolean.FALSE);
            c0596h2.m1550d();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1857a;
        Context context = viewGroup.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        boolean z4 = false;
        while (it7.hasNext()) {
            C0594f c0594f2 = (C0594f) it7.next();
            C0587S c0587s6 = (C0587S) c0594f2.f1855a;
            int iM933c2 = AbstractC0328E.m933c(c0587s6.f1802c.f1903J);
            int i4 = c0587s6.f1800a;
            if (iM933c2 == i4 || !(iM933c2 == i || i4 == i)) {
                c0594f2.m1550d();
                i = 2;
            } else {
                C0057j c0057jM1548j = c0594f2.m1548j(context);
                if (c0057jM1548j == null) {
                    c0594f2.m1550d();
                } else {
                    Animator animator = (Animator) c0057jM1548j.f123h;
                    if (animator == null) {
                        arrayList5.add(c0594f2);
                    } else {
                        C0587S c0587s7 = (C0587S) c0594f2.f1855a;
                        boolean zEquals = Boolean.TRUE.equals(map.get(c0587s7));
                        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r3 = c0587s7.f1802c;
                        if (zEquals) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Objects.toString(abstractComponentCallbacksC0606r3);
                            }
                            c0594f2.m1550d();
                        } else {
                            boolean z5 = c0587s7.f1800a == 3;
                            if (z5) {
                                arrayList4.remove(c0587s7);
                            }
                            View view = abstractComponentCallbacksC0606r3.f1903J;
                            viewGroup.startViewTransition(view);
                            animator.addListener(new C0592d(viewGroup, view, z5, c0587s7, c0594f2));
                            animator.setTarget(view);
                            animator.start();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                c0587s7.toString();
                            }
                            ((C0118c) c0594f2.f1856b).m448a(new C0057j(animator, c0587s7, 7));
                            i = 2;
                            z4 = true;
                        }
                    }
                }
                i = 2;
            }
        }
        Iterator it8 = arrayList5.iterator();
        while (it8.hasNext()) {
            C0594f c0594f3 = (C0594f) it8.next();
            C0587S c0587s8 = (C0587S) c0594f3.f1855a;
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r4 = c0587s8.f1802c;
            if (zContainsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(abstractComponentCallbacksC0606r4);
                }
                c0594f3.m1550d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(abstractComponentCallbacksC0606r4);
                }
                c0594f3.m1550d();
            } else {
                View view2 = abstractComponentCallbacksC0606r4.f1903J;
                C0057j c0057jM1548j2 = c0594f3.m1548j(context);
                c0057jM1548j2.getClass();
                Animation animation = (Animation) c0057jM1548j2.f122g;
                animation.getClass();
                if (c0587s8.f1800a != 1) {
                    view2.startAnimation(animation);
                    c0594f3.m1550d();
                } else {
                    viewGroup.startViewTransition(view2);
                    RunnableC0609u runnableC0609u = new RunnableC0609u(animation, viewGroup, view2);
                    runnableC0609u.setAnimationListener(new AnimationAnimationListenerC0593e(c0587s8, viewGroup, view2, c0594f3));
                    view2.startAnimation(runnableC0609u);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        c0587s8.toString();
                    }
                }
                C0010k c0010k = new C0010k();
                c0010k.f23f = view2;
                c0010k.f24g = viewGroup;
                c0010k.f25h = c0594f3;
                c0010k.f26i = c0587s8;
                ((C0118c) c0594f3.f1856b).m448a(c0010k);
            }
        }
        Iterator it9 = arrayList4.iterator();
        while (it9.hasNext()) {
            C0587S c0587s9 = (C0587S) it9.next();
            AbstractC0328E.m931a(c0587s9.f1802c.f1903J, c0587s9.f1800a);
        }
        arrayList4.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(c0587s);
            Objects.toString(c0587s2);
        }
    }

    /* renamed from: c */
    public final void m1559c() {
        if (this.f1861e) {
            return;
        }
        ViewGroup viewGroup = this.f1857a;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if (!viewGroup.isAttachedToWindow()) {
            m1561e();
            this.f1860d = false;
            return;
        }
        synchronized (this.f1858b) {
            try {
                if (!this.f1858b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1859c);
                    this.f1859c.clear();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C0587S c0587s = (C0587S) it2.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(c0587s);
                        }
                        c0587s.m1539a();
                        if (!c0587s.f1806g) {
                            this.f1859c.add(c0587s);
                        }
                    }
                    m1562g();
                    ArrayList arrayList2 = new ArrayList(this.f1858b);
                    this.f1858b.clear();
                    this.f1859c.addAll(arrayList2);
                    Log.isLoggable("FragmentManager", 2);
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((C0587S) it3.next()).m1542d();
                    }
                    m1558b(arrayList2, this.f1860d);
                    this.f1860d = false;
                    Log.isLoggable("FragmentManager", 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final C0587S m1560d(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        Iterator it2 = this.f1858b.iterator();
        while (it2.hasNext()) {
            C0587S c0587s = (C0587S) it2.next();
            if (c0587s.f1802c.equals(abstractComponentCallbacksC0606r) && !c0587s.f1805f) {
                return c0587s;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m1561e() {
        Log.isLoggable("FragmentManager", 2);
        ViewGroup viewGroup = this.f1857a;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1858b) {
            try {
                m1562g();
                Iterator it2 = this.f1858b.iterator();
                while (it2.hasNext()) {
                    ((C0587S) it2.next()).m1542d();
                }
                Iterator it3 = new ArrayList(this.f1859c).iterator();
                while (it3.hasNext()) {
                    C0587S c0587s = (C0587S) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.f1857a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(c0587s);
                    }
                    c0587s.m1539a();
                }
                Iterator it4 = new ArrayList(this.f1858b).iterator();
                while (it4.hasNext()) {
                    C0587S c0587s2 = (C0587S) it4.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f1857a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(c0587s2);
                    }
                    c0587s2.m1539a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m1562g() {
        Iterator it2 = this.f1858b.iterator();
        while (it2.hasNext()) {
            C0587S c0587s = (C0587S) it2.next();
            if (c0587s.f1801b == 2) {
                c0587s.m1541c(AbstractC0328E.m932b(c0587s.f1802c.m1582G().getVisibility()), 1);
            }
        }
    }
}
