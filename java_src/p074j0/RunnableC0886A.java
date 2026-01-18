package p074j0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;

/* renamed from: j0.A */
/* loaded from: classes.dex */
public final class RunnableC0886A implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3569a;

    /* renamed from: b */
    public final /* synthetic */ RecyclerView f3570b;

    public /* synthetic */ RunnableC0886A(RecyclerView recyclerView, int i) {
        this.f3569a = i;
        this.f3570b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f3570b;
        switch (this.f3569a) {
            case 0:
                if (recyclerView.f2224x && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f2220v) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.f2160A) {
                        recyclerView.m1792m();
                        break;
                    } else {
                        recyclerView.f2228z = true;
                        break;
                    }
                }
                break;
            default:
                AbstractC0892G abstractC0892G = recyclerView.f2174O;
                if (abstractC0892G != null) {
                    C0929j c0929j = (C0929j) abstractC0892G;
                    ArrayList arrayList = c0929j.f3746h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0929j.f3748j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0929j.f3749k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0929j.f3747i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            long j2 = c0929j.f3577d;
                            if (zHasNext) {
                                AbstractC0912a0 abstractC0912a0 = (AbstractC0912a0) it2.next();
                                View view = abstractC0912a0.f3654a;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                c0929j.f3755q.add(abstractC0912a0);
                                viewPropertyAnimatorAnimate.setDuration(j2).alpha(0.0f).setListener(new C0919e(c0929j, abstractC0912a0, viewPropertyAnimatorAnimate, view)).start();
                                it2 = it2;
                            } else {
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0929j.f3751m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0917d runnableC0917d = new RunnableC0917d(c0929j, arrayList5, 0);
                                    if (zIsEmpty) {
                                        runnableC0917d.run();
                                    } else {
                                        View view2 = ((C0927i) arrayList5.get(0)).f3733a.f3654a;
                                        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                                        view2.postOnAnimationDelayed(runnableC0917d, j2);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0929j.f3752n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0917d runnableC0917d2 = new RunnableC0917d(c0929j, arrayList6, 1);
                                    if (zIsEmpty) {
                                        runnableC0917d2.run();
                                    } else {
                                        View view3 = ((C0925h) arrayList6.get(0)).f3717a.f3654a;
                                        WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
                                        view3.postOnAnimationDelayed(runnableC0917d2, j2);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0929j.f3750l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0917d runnableC0917d3 = new RunnableC0917d(c0929j, arrayList7, 2);
                                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                        runnableC0917d3.run();
                                    } else {
                                        if (zIsEmpty) {
                                            j2 = 0;
                                        }
                                        long jMax = Math.max(!zIsEmpty2 ? c0929j.f3578e : 0L, zIsEmpty3 ? 0L : c0929j.f3579f) + j2;
                                        View view4 = ((AbstractC0912a0) arrayList7.get(0)).f3654a;
                                        WeakHashMap weakHashMap3 = AbstractC0206Q.f560a;
                                        view4.postOnAnimationDelayed(runnableC0917d3, jMax);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f2209p0 = false;
                break;
        }
    }
}
