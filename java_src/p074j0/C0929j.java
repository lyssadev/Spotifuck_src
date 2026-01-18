package p074j0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import p023N.C0247q;
import p030Q0.AbstractC0328E;

/* renamed from: j0.j */
/* loaded from: classes.dex */
public final class C0929j extends AbstractC0892G {

    /* renamed from: s */
    public static TimeInterpolator f3744s;

    /* renamed from: g */
    public boolean f3745g;

    /* renamed from: h */
    public ArrayList f3746h;

    /* renamed from: i */
    public ArrayList f3747i;

    /* renamed from: j */
    public ArrayList f3748j;

    /* renamed from: k */
    public ArrayList f3749k;

    /* renamed from: l */
    public ArrayList f3750l;

    /* renamed from: m */
    public ArrayList f3751m;

    /* renamed from: n */
    public ArrayList f3752n;

    /* renamed from: o */
    public ArrayList f3753o;

    /* renamed from: p */
    public ArrayList f3754p;

    /* renamed from: q */
    public ArrayList f3755q;

    /* renamed from: r */
    public ArrayList f3756r;

    /* renamed from: h */
    public static void m2371h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC0912a0) arrayList.get(size)).f3654a.animate().cancel();
        }
    }

    @Override // p074j0.AbstractC0892G
    /* renamed from: a */
    public final boolean mo2258a(AbstractC0912a0 abstractC0912a0, AbstractC0912a0 abstractC0912a02, C0247q c0247q, C0247q c0247q2) {
        int i;
        int i2;
        int i3 = c0247q.f645a;
        int i4 = c0247q.f646b;
        if (abstractC0912a02.m2331p()) {
            int i5 = c0247q.f645a;
            i2 = c0247q.f646b;
            i = i5;
        } else {
            i = c0247q2.f645a;
            i2 = c0247q2.f646b;
        }
        if (abstractC0912a0 == abstractC0912a02) {
            return m2372g(abstractC0912a0, i3, i4, i, i2);
        }
        View view = abstractC0912a0.f3654a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m2376l(abstractC0912a0);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m2376l(abstractC0912a02);
        float f2 = -((int) ((i - i3) - translationX));
        View view2 = abstractC0912a02.f3654a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f3749k;
        C0925h c0925h = new C0925h();
        c0925h.f3717a = abstractC0912a0;
        c0925h.f3718b = abstractC0912a02;
        c0925h.f3719c = i3;
        c0925h.f3720d = i4;
        c0925h.f3721e = i;
        c0925h.f3722f = i2;
        arrayList.add(c0925h);
        return true;
    }

    @Override // p074j0.AbstractC0892G
    /* renamed from: d */
    public final void mo2260d(AbstractC0912a0 abstractC0912a0) {
        View view = abstractC0912a0.f3654a;
        view.animate().cancel();
        ArrayList arrayList = this.f3748j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0927i) arrayList.get(size)).f3733a == abstractC0912a0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m2259c(abstractC0912a0);
                arrayList.remove(size);
            }
        }
        m2374j(this.f3749k, abstractC0912a0);
        if (this.f3746h.remove(abstractC0912a0)) {
            view.setAlpha(1.0f);
            m2259c(abstractC0912a0);
        }
        if (this.f3747i.remove(abstractC0912a0)) {
            view.setAlpha(1.0f);
            m2259c(abstractC0912a0);
        }
        ArrayList arrayList2 = this.f3752n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m2374j(arrayList3, abstractC0912a0);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f3751m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0927i) arrayList5.get(size4)).f3733a == abstractC0912a0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m2259c(abstractC0912a0);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f3750l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC0912a0)) {
                view.setAlpha(1.0f);
                m2259c(abstractC0912a0);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f3755q.remove(abstractC0912a0);
        this.f3753o.remove(abstractC0912a0);
        this.f3756r.remove(abstractC0912a0);
        this.f3754p.remove(abstractC0912a0);
        m2373i();
    }

    @Override // p074j0.AbstractC0892G
    /* renamed from: e */
    public final void mo2261e() {
        ArrayList arrayList = this.f3748j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0927i c0927i = (C0927i) arrayList.get(size);
            View view = c0927i.f3733a.f3654a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m2259c(c0927i.f3733a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f3746h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m2259c((AbstractC0912a0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f3747i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0912a0 abstractC0912a0 = (AbstractC0912a0) arrayList3.get(size3);
            abstractC0912a0.f3654a.setAlpha(1.0f);
            m2259c(abstractC0912a0);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f3749k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0925h c0925h = (C0925h) arrayList4.get(size4);
            AbstractC0912a0 abstractC0912a02 = c0925h.f3717a;
            if (abstractC0912a02 != null) {
                m2375k(c0925h, abstractC0912a02);
            }
            AbstractC0912a0 abstractC0912a03 = c0925h.f3718b;
            if (abstractC0912a03 != null) {
                m2375k(c0925h, abstractC0912a03);
            }
        }
        arrayList4.clear();
        if (mo2262f()) {
            ArrayList arrayList5 = this.f3751m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C0927i c0927i2 = (C0927i) arrayList6.get(size6);
                    View view2 = c0927i2.f3733a.f3654a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m2259c(c0927i2.f3733a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f3750l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC0912a0 abstractC0912a04 = (AbstractC0912a0) arrayList8.get(size8);
                    abstractC0912a04.f3654a.setAlpha(1.0f);
                    m2259c(abstractC0912a04);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f3752n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0925h c0925h2 = (C0925h) arrayList10.get(size10);
                    AbstractC0912a0 abstractC0912a05 = c0925h2.f3717a;
                    if (abstractC0912a05 != null) {
                        m2375k(c0925h2, abstractC0912a05);
                    }
                    AbstractC0912a0 abstractC0912a06 = c0925h2.f3718b;
                    if (abstractC0912a06 != null) {
                        m2375k(c0925h2, abstractC0912a06);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m2371h(this.f3755q);
            m2371h(this.f3754p);
            m2371h(this.f3753o);
            m2371h(this.f3756r);
            ArrayList arrayList11 = this.f3575b;
            if (arrayList11.size() > 0) {
                AbstractC0328E.m938h(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // p074j0.AbstractC0892G
    /* renamed from: f */
    public final boolean mo2262f() {
        return (this.f3747i.isEmpty() && this.f3749k.isEmpty() && this.f3748j.isEmpty() && this.f3746h.isEmpty() && this.f3754p.isEmpty() && this.f3755q.isEmpty() && this.f3753o.isEmpty() && this.f3756r.isEmpty() && this.f3751m.isEmpty() && this.f3750l.isEmpty() && this.f3752n.isEmpty()) ? false : true;
    }

    /* renamed from: g */
    public final boolean m2372g(AbstractC0912a0 abstractC0912a0, int i, int i2, int i3, int i4) {
        View view = abstractC0912a0.f3654a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0912a0.f3654a.getTranslationY());
        m2376l(abstractC0912a0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m2259c(abstractC0912a0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.f3748j;
        C0927i c0927i = new C0927i();
        c0927i.f3733a = abstractC0912a0;
        c0927i.f3734b = translationX;
        c0927i.f3735c = translationY;
        c0927i.f3736d = i3;
        c0927i.f3737e = i4;
        arrayList.add(c0927i);
        return true;
    }

    /* renamed from: i */
    public final void m2373i() {
        if (mo2262f()) {
            return;
        }
        ArrayList arrayList = this.f3575b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            AbstractC0328E.m938h(arrayList.get(0));
            throw null;
        }
    }

    /* renamed from: j */
    public final void m2374j(ArrayList arrayList, AbstractC0912a0 abstractC0912a0) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0925h c0925h = (C0925h) arrayList.get(size);
            if (m2375k(c0925h, abstractC0912a0) && c0925h.f3717a == null && c0925h.f3718b == null) {
                arrayList.remove(c0925h);
            }
        }
    }

    /* renamed from: k */
    public final boolean m2375k(C0925h c0925h, AbstractC0912a0 abstractC0912a0) {
        if (c0925h.f3718b == abstractC0912a0) {
            c0925h.f3718b = null;
        } else {
            if (c0925h.f3717a != abstractC0912a0) {
                return false;
            }
            c0925h.f3717a = null;
        }
        abstractC0912a0.f3654a.setAlpha(1.0f);
        View view = abstractC0912a0.f3654a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m2259c(abstractC0912a0);
        return true;
    }

    /* renamed from: l */
    public final void m2376l(AbstractC0912a0 abstractC0912a0) {
        if (f3744s == null) {
            f3744s = new ValueAnimator().getInterpolator();
        }
        abstractC0912a0.f3654a.animate().setInterpolator(f3744s);
        mo2260d(abstractC0912a0);
    }
}
