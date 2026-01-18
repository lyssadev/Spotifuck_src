package p085n0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000A.C0010k;
import p018K0.C0146e;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p023N.C0213Y;
import p023N.C0222d0;
import p036T0.AbstractC0411g;
import p096r.AbstractC1249d;
import p096r.C1247b;
import p096r.C1250e;

/* renamed from: n0.m */
/* loaded from: classes.dex */
public abstract class AbstractC1070m implements Cloneable {

    /* renamed from: w */
    public static final Animator[] f4392w = new Animator[0];

    /* renamed from: x */
    public static final int[] f4393x = {2, 1, 3, 4};

    /* renamed from: y */
    public static final C0146e f4394y = new C0146e(24);

    /* renamed from: z */
    public static final ThreadLocal f4395z = new ThreadLocal();

    /* renamed from: k */
    public ArrayList f4406k;

    /* renamed from: l */
    public ArrayList f4407l;

    /* renamed from: m */
    public InterfaceC1068k[] f4408m;

    /* renamed from: a */
    public final String f4396a = getClass().getName();

    /* renamed from: b */
    public long f4397b = -1;

    /* renamed from: c */
    public long f4398c = -1;

    /* renamed from: d */
    public TimeInterpolator f4399d = null;

    /* renamed from: e */
    public final ArrayList f4400e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f4401f = new ArrayList();

    /* renamed from: g */
    public C0010k f4402g = new C0010k(7);

    /* renamed from: h */
    public C0010k f4403h = new C0010k(7);

    /* renamed from: i */
    public C1058a f4404i = null;

    /* renamed from: j */
    public final int[] f4405j = f4393x;

    /* renamed from: n */
    public final ArrayList f4409n = new ArrayList();

    /* renamed from: o */
    public Animator[] f4410o = f4392w;

    /* renamed from: p */
    public int f4411p = 0;

    /* renamed from: q */
    public boolean f4412q = false;

    /* renamed from: r */
    public boolean f4413r = false;

    /* renamed from: s */
    public AbstractC1070m f4414s = null;

    /* renamed from: t */
    public ArrayList f4415t = null;

    /* renamed from: u */
    public ArrayList f4416u = new ArrayList();

    /* renamed from: v */
    public C0146e f4417v = f4394y;

    /* renamed from: b */
    public static void m2644b(C0010k c0010k, View view, C1078u c1078u) {
        ((C1247b) c0010k.f23f).put(view, c1078u);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c0010k.f24g;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        String strM605k = AbstractC0195F.m605k(view);
        if (strM605k != null) {
            C1247b c1247b = (C1247b) c0010k.f26i;
            if (c1247b.containsKey(strM605k)) {
                c1247b.put(strM605k, null);
            } else {
                c1247b.put(strM605k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1250e c1250e = (C1250e) c0010k.f25h;
                if (c1250e.f4985a) {
                    c1250e.m2958d();
                }
                if (AbstractC1249d.m2954b(c1250e.f4986b, c1250e.f4988d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1250e.m2960f(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1250e.m2959e(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1250e.m2960f(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: p */
    public static C1247b m2645p() {
        ThreadLocal threadLocal = f4395z;
        C1247b c1247b = (C1247b) threadLocal.get();
        if (c1247b != null) {
            return c1247b;
        }
        C1247b c1247b2 = new C1247b();
        threadLocal.set(c1247b2);
        return c1247b2;
    }

    /* renamed from: u */
    public static boolean m2646u(C1078u c1078u, C1078u c1078u2, String str) {
        Object obj = c1078u.f4428a.get(str);
        Object obj2 = c1078u2.f4428a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo2617A(long j2) {
        this.f4398c = j2;
    }

    /* renamed from: C */
    public void mo2619C(TimeInterpolator timeInterpolator) {
        this.f4399d = timeInterpolator;
    }

    /* renamed from: D */
    public void mo2620D(C0146e c0146e) {
        if (c0146e == null) {
            this.f4417v = f4394y;
        } else {
            this.f4417v = c0146e;
        }
    }

    /* renamed from: F */
    public void mo2622F(long j2) {
        this.f4397b = j2;
    }

    /* renamed from: G */
    public final void m2647G() {
        if (this.f4411p == 0) {
            m2657v(this, InterfaceC1069l.f4387a);
            this.f4413r = false;
        }
        this.f4411p++;
    }

    /* renamed from: H */
    public String mo2623H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f4398c != -1) {
            sb.append("dur(");
            sb.append(this.f4398c);
            sb.append(") ");
        }
        if (this.f4397b != -1) {
            sb.append("dly(");
            sb.append(this.f4397b);
            sb.append(") ");
        }
        if (this.f4399d != null) {
            sb.append("interp(");
            sb.append(this.f4399d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f4400e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4401f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m2648a(InterfaceC1068k interfaceC1068k) {
        if (this.f4415t == null) {
            this.f4415t = new ArrayList();
        }
        this.f4415t.add(interfaceC1068k);
    }

    /* renamed from: c */
    public void mo2625c() {
        ArrayList arrayList = this.f4409n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4410o);
        this.f4410o = f4392w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f4410o = animatorArr;
        m2657v(this, InterfaceC1069l.f4389c);
    }

    /* renamed from: d */
    public abstract void mo2626d(C1078u c1078u);

    /* renamed from: e */
    public final void m2649e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C1078u c1078u = new C1078u(view);
            if (z2) {
                mo2628g(c1078u);
            } else {
                mo2626d(c1078u);
            }
            c1078u.f4430c.add(this);
            mo2627f(c1078u);
            if (z2) {
                m2644b(this.f4402g, view, c1078u);
            } else {
                m2644b(this.f4403h, view, c1078u);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m2649e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    /* renamed from: g */
    public abstract void mo2628g(C1078u c1078u);

    /* renamed from: h */
    public final void m2650h(FrameLayout frameLayout, boolean z2) {
        m2651i(z2);
        ArrayList arrayList = this.f4400e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4401f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m2649e(frameLayout, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C1078u c1078u = new C1078u(viewFindViewById);
                if (z2) {
                    mo2628g(c1078u);
                } else {
                    mo2626d(c1078u);
                }
                c1078u.f4430c.add(this);
                mo2627f(c1078u);
                if (z2) {
                    m2644b(this.f4402g, viewFindViewById, c1078u);
                } else {
                    m2644b(this.f4403h, viewFindViewById, c1078u);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C1078u c1078u2 = new C1078u(view);
            if (z2) {
                mo2628g(c1078u2);
            } else {
                mo2626d(c1078u2);
            }
            c1078u2.f4430c.add(this);
            mo2627f(c1078u2);
            if (z2) {
                m2644b(this.f4402g, view, c1078u2);
            } else {
                m2644b(this.f4403h, view, c1078u2);
            }
        }
    }

    /* renamed from: i */
    public final void m2651i(boolean z2) {
        if (z2) {
            ((C1247b) this.f4402g.f23f).clear();
            ((SparseArray) this.f4402g.f24g).clear();
            ((C1250e) this.f4402g.f25h).m2956b();
        } else {
            ((C1247b) this.f4403h.f23f).clear();
            ((SparseArray) this.f4403h.f24g).clear();
            ((C1250e) this.f4403h.f25h).m2956b();
        }
    }

    @Override // 
    /* renamed from: j */
    public AbstractC1070m clone() {
        try {
            AbstractC1070m abstractC1070m = (AbstractC1070m) super.clone();
            abstractC1070m.f4416u = new ArrayList();
            abstractC1070m.f4402g = new C0010k(7);
            abstractC1070m.f4403h = new C0010k(7);
            abstractC1070m.f4406k = null;
            abstractC1070m.f4407l = null;
            abstractC1070m.f4414s = this;
            abstractC1070m.f4415t = null;
            return abstractC1070m;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: k */
    public Animator mo2636k(FrameLayout frameLayout, C1078u c1078u, C1078u c1078u2) {
        return null;
    }

    /* renamed from: l */
    public void mo2630l(FrameLayout frameLayout, C0010k c0010k, C0010k c0010k2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        C1078u c1078u;
        Animator animator;
        C1078u c1078u2;
        C1247b c1247bM2645p = m2645p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m2654o().getClass();
        int i2 = 0;
        while (i2 < size) {
            C1078u c1078u3 = (C1078u) arrayList.get(i2);
            C1078u c1078u4 = (C1078u) arrayList2.get(i2);
            if (c1078u3 != null && !c1078u3.f4430c.contains(this)) {
                c1078u3 = null;
            }
            if (c1078u4 != null && !c1078u4.f4430c.contains(this)) {
                c1078u4 = null;
            }
            if ((c1078u3 != null || c1078u4 != null) && (c1078u3 == null || c1078u4 == null || mo2642s(c1078u3, c1078u4))) {
                Animator animatorMo2636k = mo2636k(frameLayout, c1078u3, c1078u4);
                if (animatorMo2636k != null) {
                    String str = this.f4396a;
                    if (c1078u4 != null) {
                        String[] strArrMo2637q = mo2637q();
                        view = c1078u4.f4429b;
                        if (strArrMo2637q != null && strArrMo2637q.length > 0) {
                            c1078u2 = new C1078u(view);
                            C1078u c1078u5 = (C1078u) ((C1247b) c0010k2.f23f).getOrDefault(view, null);
                            i = size;
                            if (c1078u5 != null) {
                                int i3 = 0;
                                while (i3 < strArrMo2637q.length) {
                                    HashMap map = c1078u2.f4428a;
                                    String str2 = strArrMo2637q[i3];
                                    map.put(str2, c1078u5.f4428a.get(str2));
                                    i3++;
                                    strArrMo2637q = strArrMo2637q;
                                }
                            }
                            int i4 = c1247bM2645p.f5012c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = animatorMo2636k;
                                    break;
                                }
                                C1067j c1067j = (C1067j) c1247bM2645p.getOrDefault((Animator) c1247bM2645p.m2973h(i5), null);
                                if (c1067j.f4383c != null && c1067j.f4381a == view && c1067j.f4382b.equals(str) && c1067j.f4383c.equals(c1078u2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = animatorMo2636k;
                            c1078u2 = null;
                        }
                        animatorMo2636k = animator;
                        c1078u = c1078u2;
                    } else {
                        i = size;
                        view = c1078u3.f4429b;
                        c1078u = null;
                    }
                    if (animatorMo2636k != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        C1067j c1067j2 = new C1067j();
                        c1067j2.f4381a = view;
                        c1067j2.f4382b = str;
                        c1067j2.f4383c = c1078u;
                        c1067j2.f4384d = windowId;
                        c1067j2.f4385e = this;
                        c1067j2.f4386f = animatorMo2636k;
                        c1247bM2645p.put(animatorMo2636k, c1067j2);
                        this.f4416u.add(animatorMo2636k);
                    }
                }
                i2++;
                size = i;
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                C1067j c1067j3 = (C1067j) c1247bM2645p.getOrDefault((Animator) this.f4416u.get(sparseIntArray.keyAt(i6)), null);
                c1067j3.f4386f.setStartDelay(c1067j3.f4386f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: m */
    public final void m2652m() {
        int i = this.f4411p - 1;
        this.f4411p = i;
        if (i == 0) {
            m2657v(this, InterfaceC1069l.f4388b);
            for (int i2 = 0; i2 < ((C1250e) this.f4402g.f25h).m2961g(); i2++) {
                View view = (View) ((C1250e) this.f4402g.f25h).m2962h(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C1250e) this.f4403h.f25h).m2961g(); i3++) {
                View view2 = (View) ((C1250e) this.f4403h.f25h).m2962h(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f4413r = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f4407l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f4406k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (p085n0.C1078u) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1078u m2653n(View view, boolean z2) {
        C1058a c1058a = this.f4404i;
        if (c1058a != null) {
            return c1058a.m2653n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f4406k : this.f4407l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C1078u c1078u = (C1078u) arrayList.get(i);
            if (c1078u == null) {
                return null;
            }
            if (c1078u.f4429b == view) {
                break;
            }
            i++;
        }
    }

    /* renamed from: o */
    public final AbstractC1070m m2654o() {
        C1058a c1058a = this.f4404i;
        return c1058a != null ? c1058a.m2654o() : this;
    }

    /* renamed from: q */
    public String[] mo2637q() {
        return null;
    }

    /* renamed from: r */
    public final C1078u m2655r(View view, boolean z2) {
        C1058a c1058a = this.f4404i;
        if (c1058a != null) {
            return c1058a.m2655r(view, z2);
        }
        return (C1078u) ((C1247b) (z2 ? this.f4402g : this.f4403h).f23f).getOrDefault(view, null);
    }

    /* renamed from: s */
    public boolean mo2642s(C1078u c1078u, C1078u c1078u2) {
        if (c1078u == null || c1078u2 == null) {
            return false;
        }
        String[] strArrMo2637q = mo2637q();
        if (strArrMo2637q == null) {
            Iterator it2 = c1078u.f4428a.keySet().iterator();
            while (it2.hasNext()) {
                if (m2646u(c1078u, c1078u2, (String) it2.next())) {
                }
            }
            return false;
        }
        for (String str : strArrMo2637q) {
            if (!m2646u(c1078u, c1078u2, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: t */
    public final boolean m2656t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f4400e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4401f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo2623H("");
    }

    /* renamed from: v */
    public final void m2657v(AbstractC1070m abstractC1070m, InterfaceC1069l interfaceC1069l) {
        AbstractC1070m abstractC1070m2 = this.f4414s;
        if (abstractC1070m2 != null) {
            abstractC1070m2.m2657v(abstractC1070m, interfaceC1069l);
        }
        ArrayList arrayList = this.f4415t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f4415t.size();
        InterfaceC1068k[] interfaceC1068kArr = this.f4408m;
        if (interfaceC1068kArr == null) {
            interfaceC1068kArr = new InterfaceC1068k[size];
        }
        this.f4408m = null;
        InterfaceC1068k[] interfaceC1068kArr2 = (InterfaceC1068k[]) this.f4415t.toArray(interfaceC1068kArr);
        for (int i = 0; i < size; i++) {
            interfaceC1069l.mo721a(interfaceC1068kArr2[i], abstractC1070m);
            interfaceC1068kArr2[i] = null;
        }
        this.f4408m = interfaceC1068kArr2;
    }

    /* renamed from: w */
    public void mo2631w(ViewGroup viewGroup) {
        if (this.f4413r) {
            return;
        }
        ArrayList arrayList = this.f4409n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4410o);
        this.f4410o = f4392w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f4410o = animatorArr;
        m2657v(this, InterfaceC1069l.f4390d);
        this.f4412q = true;
    }

    /* renamed from: x */
    public AbstractC1070m mo2632x(InterfaceC1068k interfaceC1068k) {
        AbstractC1070m abstractC1070m;
        ArrayList arrayList = this.f4415t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC1068k) && (abstractC1070m = this.f4414s) != null) {
            abstractC1070m.mo2632x(interfaceC1068k);
        }
        if (this.f4415t.size() == 0) {
            this.f4415t = null;
        }
        return this;
    }

    /* renamed from: y */
    public void mo2633y(FrameLayout frameLayout) {
        if (this.f4412q) {
            if (!this.f4413r) {
                ArrayList arrayList = this.f4409n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4410o);
                this.f4410o = f4392w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f4410o = animatorArr;
                m2657v(this, InterfaceC1069l.f4391e);
            }
            this.f4412q = false;
        }
    }

    /* renamed from: z */
    public void mo2634z() {
        m2647G();
        C1247b c1247bM2645p = m2645p();
        Iterator it2 = this.f4416u.iterator();
        while (it2.hasNext()) {
            Animator animator = (Animator) it2.next();
            if (c1247bM2645p.containsKey(animator)) {
                m2647G();
                if (animator != null) {
                    animator.addListener(new C0222d0(this, c1247bM2645p));
                    long j2 = this.f4398c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f4397b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f4399d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0213Y(2, this));
                    animator.start();
                }
            }
        }
        this.f4416u.clear();
        m2652m();
    }

    /* renamed from: B */
    public void mo2618B(AbstractC0411g abstractC0411g) {
    }

    /* renamed from: f */
    public void mo2627f(C1078u c1078u) {
    }

    /* renamed from: E */
    public void mo2621E() {
    }
}
