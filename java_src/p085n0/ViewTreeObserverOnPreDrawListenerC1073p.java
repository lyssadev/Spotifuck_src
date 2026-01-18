package p085n0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p000A.C0010k;
import p096r.C1247b;
import p096r.C1250e;

/* renamed from: n0.p */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC1073p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    public AbstractC1070m f4420f;

    /* renamed from: g */
    public FrameLayout f4421g;

    /* JADX WARN: Removed duplicated region for block: B:101:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e6 A[EDGE_INSN: B:136:0x01e6->B:91:0x01e6 BREAK  A[LOOP:1: B:19:0x0088->B:90:0x01dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01eb  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        AbstractC1070m abstractC1070m;
        C1247b c1247b;
        C1247b c1247b2;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        C1067j c1067j;
        View view;
        C1078u c1078u;
        View view2;
        FrameLayout frameLayout = this.f4421g;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = AbstractC1074q.f4424c;
        FrameLayout frameLayout2 = this.f4421g;
        int i5 = 1;
        if (!arrayList2.remove(frameLayout2)) {
            return true;
        }
        C1247b c1247bM2659b = AbstractC1074q.m2659b();
        Long l2 = null;
        ArrayList arrayList3 = (ArrayList) c1247bM2659b.getOrDefault(frameLayout2, null);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            abstractC1070m = this.f4420f;
            arrayList3.add(abstractC1070m);
            abstractC1070m.m2648a(new C1072o(this, c1247bM2659b));
            abstractC1070m.m2650h(frameLayout2, false);
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((AbstractC1070m) it2.next()).mo2633y(frameLayout2);
                }
            }
            abstractC1070m.f4406k = new ArrayList();
            abstractC1070m.f4407l = new ArrayList();
            C0010k c0010k = abstractC1070m.f4402g;
            C0010k c0010k2 = abstractC1070m.f4403h;
            c1247b = new C1247b((C1247b) c0010k.f23f);
            c1247b2 = new C1247b((C1247b) c0010k2.f23f);
            i = 0;
            while (true) {
                iArr = abstractC1070m.f4405j;
                if (i < iArr.length) {
                    break;
                }
                int i6 = iArr[i];
                if (i6 == i5) {
                    for (int i7 = c1247b.f5012c - 1; i7 >= 0; i7--) {
                        View view3 = (View) c1247b.m2973h(i7);
                        if (view3 != null && abstractC1070m.m2656t(view3) && (c1078u = (C1078u) c1247b2.remove(view3)) != null && abstractC1070m.m2656t(c1078u.f4429b)) {
                            abstractC1070m.f4406k.add((C1078u) c1247b.m2974i(i7));
                            abstractC1070m.f4407l.add(c1078u);
                        }
                    }
                } else if (i6 == 2) {
                    C1247b c1247b3 = (C1247b) c0010k.f26i;
                    int i8 = c1247b3.f5012c;
                    for (int i9 = 0; i9 < i8; i9++) {
                        View view4 = (View) c1247b3.m2975j(i9);
                        if (view4 != null && abstractC1070m.m2656t(view4)) {
                            View view5 = (View) ((C1247b) c0010k2.f26i).getOrDefault(c1247b3.m2973h(i9), null);
                            if (view5 != null && abstractC1070m.m2656t(view5)) {
                                C1078u c1078u2 = (C1078u) c1247b.getOrDefault(view4, null);
                                C1078u c1078u3 = (C1078u) c1247b2.getOrDefault(view5, null);
                                if (c1078u2 != null && c1078u3 != null) {
                                    abstractC1070m.f4406k.add(c1078u2);
                                    abstractC1070m.f4407l.add(c1078u3);
                                    c1247b.remove(view4);
                                    c1247b2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i6 == 3) {
                    SparseArray sparseArray = (SparseArray) c0010k.f24g;
                    SparseArray sparseArray2 = (SparseArray) c0010k2.f24g;
                    int size = sparseArray.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        View view6 = (View) sparseArray.valueAt(i10);
                        if (view6 != null && abstractC1070m.m2656t(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && abstractC1070m.m2656t(view2)) {
                            C1078u c1078u4 = (C1078u) c1247b.getOrDefault(view6, null);
                            C1078u c1078u5 = (C1078u) c1247b2.getOrDefault(view2, null);
                            if (c1078u4 != null && c1078u5 != null) {
                                abstractC1070m.f4406k.add(c1078u4);
                                abstractC1070m.f4407l.add(c1078u5);
                                c1247b.remove(view6);
                                c1247b2.remove(view2);
                            }
                        }
                    }
                } else if (i6 == 4) {
                    C1250e c1250e = (C1250e) c0010k.f25h;
                    int iM2961g = c1250e.m2961g();
                    int i11 = 0;
                    while (i11 < iM2961g) {
                        View view7 = (View) c1250e.m2962h(i11);
                        if (view7 != null && abstractC1070m.m2656t(view7)) {
                            if (c1250e.f4985a) {
                                c1250e.m2958d();
                            }
                            View view8 = (View) ((C1250e) c0010k2.f25h).m2959e(c1250e.f4986b[i11], l2);
                            abstractC1070m = abstractC1070m;
                            if (view8 != null && abstractC1070m.m2656t(view8)) {
                                C1078u c1078u6 = (C1078u) c1247b.getOrDefault(view7, l2);
                                C1078u c1078u7 = (C1078u) c1247b2.getOrDefault(view8, l2);
                                if (c1078u6 != null && c1078u7 != null) {
                                    abstractC1070m.f4406k.add(c1078u6);
                                    abstractC1070m.f4407l.add(c1078u7);
                                    c1247b.remove(view7);
                                    c1247b2.remove(view8);
                                }
                            }
                        }
                        i11++;
                        l2 = null;
                    }
                }
                i++;
                l2 = null;
                i5 = 1;
            }
            for (i2 = 0; i2 < c1247b.f5012c; i2++) {
                C1078u c1078u8 = (C1078u) c1247b.m2975j(i2);
                if (abstractC1070m.m2656t(c1078u8.f4429b)) {
                    abstractC1070m.f4406k.add(c1078u8);
                    abstractC1070m.f4407l.add(null);
                }
            }
            for (i3 = 0; i3 < c1247b2.f5012c; i3++) {
                C1078u c1078u9 = (C1078u) c1247b2.m2975j(i3);
                if (abstractC1070m.m2656t(c1078u9.f4429b)) {
                    abstractC1070m.f4407l.add(c1078u9);
                    abstractC1070m.f4406k.add(null);
                }
            }
            C1247b c1247bM2645p = AbstractC1070m.m2645p();
            int i12 = c1247bM2645p.f5012c;
            WindowId windowId = frameLayout2.getWindowId();
            for (i4 = i12 - 1; i4 >= 0; i4--) {
                Animator animator = (Animator) c1247bM2645p.m2973h(i4);
                if (animator != null && (c1067j = (C1067j) c1247bM2645p.getOrDefault(animator, null)) != null && (view = c1067j.f4381a) != null && windowId.equals(c1067j.f4384d)) {
                    C1078u c1078uM2655r = abstractC1070m.m2655r(view, true);
                    C1078u c1078uM2653n = abstractC1070m.m2653n(view, true);
                    if (c1078uM2655r == null && c1078uM2653n == null) {
                        c1078uM2653n = (C1078u) ((C1247b) abstractC1070m.f4403h.f23f).getOrDefault(view, null);
                    }
                    if (c1078uM2655r != null || c1078uM2653n != null) {
                        C1078u c1078u10 = c1067j.f4383c;
                        AbstractC1070m abstractC1070m2 = c1067j.f4385e;
                        if (abstractC1070m2.mo2642s(c1078u10, c1078uM2653n)) {
                            abstractC1070m2.m2654o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c1247bM2645p.remove(animator);
                            }
                        }
                    }
                }
            }
            abstractC1070m.mo2630l(frameLayout2, abstractC1070m.f4402g, abstractC1070m.f4403h, abstractC1070m.f4406k, abstractC1070m.f4407l);
            abstractC1070m.mo2634z();
            return true;
        }
        arrayList3 = new ArrayList();
        c1247bM2659b.put(frameLayout2, arrayList3);
        abstractC1070m = this.f4420f;
        arrayList3.add(abstractC1070m);
        abstractC1070m.m2648a(new C1072o(this, c1247bM2659b));
        abstractC1070m.m2650h(frameLayout2, false);
        if (arrayList != null) {
        }
        abstractC1070m.f4406k = new ArrayList();
        abstractC1070m.f4407l = new ArrayList();
        C0010k c0010k3 = abstractC1070m.f4402g;
        C0010k c0010k22 = abstractC1070m.f4403h;
        c1247b = new C1247b((C1247b) c0010k3.f23f);
        c1247b2 = new C1247b((C1247b) c0010k22.f23f);
        i = 0;
        while (true) {
            iArr = abstractC1070m.f4405j;
            if (i < iArr.length) {
            }
            i++;
            l2 = null;
            i5 = 1;
        }
        while (i2 < c1247b.f5012c) {
        }
        while (i3 < c1247b2.f5012c) {
        }
        C1247b c1247bM2645p2 = AbstractC1070m.m2645p();
        int i122 = c1247bM2645p2.f5012c;
        WindowId windowId2 = frameLayout2.getWindowId();
        while (i4 >= 0) {
        }
        abstractC1070m.mo2630l(frameLayout2, abstractC1070m.f4402g, abstractC1070m.f4403h, abstractC1070m.f4406k, abstractC1070m.f4407l);
        abstractC1070m.mo2634z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f4421g;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC1074q.f4424c;
        FrameLayout frameLayout2 = this.f4421g;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) AbstractC1074q.m2659b().getOrDefault(frameLayout2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((AbstractC1070m) it2.next()).mo2633y(frameLayout2);
            }
        }
        this.f4420f.m2651i(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
