package p085n0;

import android.animation.TimeInterpolator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p000A.C0010k;
import p018K0.C0146e;
import p036T0.AbstractC0411g;

/* renamed from: n0.a */
/* loaded from: classes.dex */
public final class C1058a extends AbstractC1070m {

    /* renamed from: A */
    public ArrayList f4356A;

    /* renamed from: B */
    public boolean f4357B;

    /* renamed from: C */
    public int f4358C;

    /* renamed from: D */
    public boolean f4359D;

    /* renamed from: E */
    public int f4360E;

    @Override // p085n0.AbstractC1070m
    /* renamed from: A */
    public final void mo2617A(long j2) {
        ArrayList arrayList;
        this.f4398c = j2;
        if (j2 < 0 || (arrayList = this.f4356A) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1070m) this.f4356A.get(i)).mo2617A(j2);
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: B */
    public final void mo2618B(AbstractC0411g abstractC0411g) {
        this.f4360E |= 8;
        int size = this.f4356A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1070m) this.f4356A.get(i)).mo2618B(abstractC0411g);
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: C */
    public final void mo2619C(TimeInterpolator timeInterpolator) {
        this.f4360E |= 1;
        ArrayList arrayList = this.f4356A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1070m) this.f4356A.get(i)).mo2619C(timeInterpolator);
            }
        }
        this.f4399d = timeInterpolator;
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: D */
    public final void mo2620D(C0146e c0146e) {
        super.mo2620D(c0146e);
        this.f4360E |= 4;
        if (this.f4356A != null) {
            for (int i = 0; i < this.f4356A.size(); i++) {
                ((AbstractC1070m) this.f4356A.get(i)).mo2620D(c0146e);
            }
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: E */
    public final void mo2621E() {
        this.f4360E |= 2;
        int size = this.f4356A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1070m) this.f4356A.get(i)).mo2621E();
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: F */
    public final void mo2622F(long j2) {
        this.f4397b = j2;
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: H */
    public final String mo2623H(String str) {
        String strMo2623H = super.mo2623H(str);
        for (int i = 0; i < this.f4356A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo2623H);
            sb.append("\n");
            sb.append(((AbstractC1070m) this.f4356A.get(i)).mo2623H(str + "  "));
            strMo2623H = sb.toString();
        }
        return strMo2623H;
    }

    /* renamed from: I */
    public final void m2624I(AbstractC1070m abstractC1070m) {
        this.f4356A.add(abstractC1070m);
        abstractC1070m.f4404i = this;
        long j2 = this.f4398c;
        if (j2 >= 0) {
            abstractC1070m.mo2617A(j2);
        }
        if ((this.f4360E & 1) != 0) {
            abstractC1070m.mo2619C(this.f4399d);
        }
        if ((this.f4360E & 2) != 0) {
            abstractC1070m.mo2621E();
        }
        if ((this.f4360E & 4) != 0) {
            abstractC1070m.mo2620D(this.f4417v);
        }
        if ((this.f4360E & 8) != 0) {
            abstractC1070m.mo2618B(null);
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: c */
    public final void mo2625c() {
        super.mo2625c();
        int size = this.f4356A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1070m) this.f4356A.get(i)).mo2625c();
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: d */
    public final void mo2626d(C1078u c1078u) {
        if (m2656t(c1078u.f4429b)) {
            Iterator it2 = this.f4356A.iterator();
            while (it2.hasNext()) {
                AbstractC1070m abstractC1070m = (AbstractC1070m) it2.next();
                if (abstractC1070m.m2656t(c1078u.f4429b)) {
                    abstractC1070m.mo2626d(c1078u);
                    c1078u.f4430c.add(abstractC1070m);
                }
            }
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: f */
    public final void mo2627f(C1078u c1078u) {
        int size = this.f4356A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1070m) this.f4356A.get(i)).mo2627f(c1078u);
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: g */
    public final void mo2628g(C1078u c1078u) {
        if (m2656t(c1078u.f4429b)) {
            Iterator it2 = this.f4356A.iterator();
            while (it2.hasNext()) {
                AbstractC1070m abstractC1070m = (AbstractC1070m) it2.next();
                if (abstractC1070m.m2656t(c1078u.f4429b)) {
                    abstractC1070m.mo2628g(c1078u);
                    c1078u.f4430c.add(abstractC1070m);
                }
            }
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC1070m clone() {
        C1058a c1058a = (C1058a) super.clone();
        c1058a.f4356A = new ArrayList();
        int size = this.f4356A.size();
        for (int i = 0; i < size; i++) {
            AbstractC1070m abstractC1070mClone = ((AbstractC1070m) this.f4356A.get(i)).clone();
            c1058a.f4356A.add(abstractC1070mClone);
            abstractC1070mClone.f4404i = c1058a;
        }
        return c1058a;
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: l */
    public final void mo2630l(FrameLayout frameLayout, C0010k c0010k, C0010k c0010k2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.f4397b;
        int size = this.f4356A.size();
        for (int i = 0; i < size; i++) {
            AbstractC1070m abstractC1070m = (AbstractC1070m) this.f4356A.get(i);
            if (j2 > 0 && (this.f4357B || i == 0)) {
                long j3 = abstractC1070m.f4397b;
                if (j3 > 0) {
                    abstractC1070m.mo2622F(j3 + j2);
                } else {
                    abstractC1070m.mo2622F(j2);
                }
            }
            abstractC1070m.mo2630l(frameLayout, c0010k, c0010k2, arrayList, arrayList2);
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: w */
    public final void mo2631w(ViewGroup viewGroup) {
        super.mo2631w(viewGroup);
        int size = this.f4356A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1070m) this.f4356A.get(i)).mo2631w(viewGroup);
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: x */
    public final AbstractC1070m mo2632x(InterfaceC1068k interfaceC1068k) {
        super.mo2632x(interfaceC1068k);
        return this;
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: y */
    public final void mo2633y(FrameLayout frameLayout) {
        super.mo2633y(frameLayout);
        int size = this.f4356A.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1070m) this.f4356A.get(i)).mo2633y(frameLayout);
        }
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: z */
    public final void mo2634z() {
        if (this.f4356A.isEmpty()) {
            m2647G();
            m2652m();
            return;
        }
        C1075r c1075r = new C1075r();
        c1075r.f4426b = this;
        Iterator it2 = this.f4356A.iterator();
        while (it2.hasNext()) {
            ((AbstractC1070m) it2.next()).m2648a(c1075r);
        }
        this.f4358C = this.f4356A.size();
        if (this.f4357B) {
            Iterator it3 = this.f4356A.iterator();
            while (it3.hasNext()) {
                ((AbstractC1070m) it3.next()).mo2634z();
            }
            return;
        }
        for (int i = 1; i < this.f4356A.size(); i++) {
            ((AbstractC1070m) this.f4356A.get(i - 1)).m2648a(new C1075r((AbstractC1070m) this.f4356A.get(i)));
        }
        AbstractC1070m abstractC1070m = (AbstractC1070m) this.f4356A.get(0);
        if (abstractC1070m != null) {
            abstractC1070m.mo2634z();
        }
    }
}
