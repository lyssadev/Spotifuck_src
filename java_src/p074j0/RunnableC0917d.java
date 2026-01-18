package p074j0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: j0.d */
/* loaded from: classes.dex */
public final class RunnableC0917d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3684a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f3685b;

    /* renamed from: c */
    public final /* synthetic */ C0929j f3686c;

    public /* synthetic */ RunnableC0917d(C0929j c0929j, ArrayList arrayList, int i) {
        this.f3684a = i;
        this.f3686c = c0929j;
        this.f3685b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it2;
        switch (this.f3684a) {
            case 0:
                ArrayList arrayList = this.f3685b;
                Iterator it3 = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    C0929j c0929j = this.f3686c;
                    if (!zHasNext) {
                        arrayList.clear();
                        c0929j.f3751m.remove(arrayList);
                        break;
                    } else {
                        C0927i c0927i = (C0927i) it3.next();
                        AbstractC0912a0 abstractC0912a0 = c0927i.f3733a;
                        c0929j.getClass();
                        View view = abstractC0912a0.f3654a;
                        int i = c0927i.f3736d - c0927i.f3734b;
                        int i2 = c0927i.f3737e - c0927i.f3735c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c0929j.f3754p.add(abstractC0912a0);
                        viewPropertyAnimatorAnimate.setDuration(c0929j.f3578e).setListener(new C0921f(c0929j, abstractC0912a0, i, view, i2, viewPropertyAnimatorAnimate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f3685b;
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it4.hasNext();
                    C0929j c0929j2 = this.f3686c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c0929j2.f3752n.remove(arrayList2);
                        break;
                    } else {
                        C0925h c0925h = (C0925h) it4.next();
                        c0929j2.getClass();
                        AbstractC0912a0 abstractC0912a02 = c0925h.f3717a;
                        View view2 = abstractC0912a02 == null ? null : abstractC0912a02.f3654a;
                        AbstractC0912a0 abstractC0912a03 = c0925h.f3718b;
                        View view3 = abstractC0912a03 != null ? abstractC0912a03.f3654a : null;
                        ArrayList arrayList3 = c0929j2.f3756r;
                        long j2 = c0929j2.f3579f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0925h.f3717a);
                            duration.translationX(c0925h.f3721e - c0925h.f3719c);
                            duration.translationY(c0925h.f3722f - c0925h.f3720d);
                            it2 = it4;
                            duration.alpha(0.0f).setListener(new C0923g(c0929j2, c0925h, duration, view2, 0)).start();
                        } else {
                            it2 = it4;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c0925h.f3718b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0923g(c0929j2, c0925h, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                        it4 = it2;
                    }
                }
            default:
                ArrayList arrayList4 = this.f3685b;
                Iterator it5 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it5.hasNext();
                    C0929j c0929j3 = this.f3686c;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c0929j3.f3750l.remove(arrayList4);
                        break;
                    } else {
                        AbstractC0912a0 abstractC0912a04 = (AbstractC0912a0) it5.next();
                        c0929j3.getClass();
                        View view4 = abstractC0912a04.f3654a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c0929j3.f3753o.add(abstractC0912a04);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c0929j3.f3576c).setListener(new C0919e(c0929j3, abstractC0912a04, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                }
        }
    }
}
