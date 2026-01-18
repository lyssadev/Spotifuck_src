package p020L0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000A.AbstractC0002c;
import p036T0.AbstractC0411g;
import p091p0.AbstractC1230a;

/* renamed from: L0.c */
/* loaded from: classes.dex */
public final class C0177c extends AbstractC0411g {

    /* renamed from: l */
    public final /* synthetic */ int f520l;

    /* renamed from: m */
    public final /* synthetic */ AbstractC0002c f521m;

    public /* synthetic */ C0177c(AbstractC0002c abstractC0002c, int i) {
        this.f520l = i;
        this.f521m = abstractC0002c;
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: D */
    public final void mo573D(int i) throws Resources.NotFoundException {
        switch (this.f520l) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f521m;
                    if (sideSheetBehavior.f2515g) {
                        sideSheetBehavior.m1913r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f521m;
                    if (bottomSheetBehavior.f2305K) {
                        bottomSheetBehavior.m1851C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: E */
    public final void mo574E(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f520l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f521m;
                WeakReference weakReference = sideSheetBehavior.f2525q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2509a.mo560I0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2529u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f2509a.mo570f(i);
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f521m).m1861u(i2);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // p036T0.AbstractC0411g
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo575F(View view, float f2, float f3) throws Resources.NotFoundException {
        switch (this.f520l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f521m;
                int i = 3;
                if (!sideSheetBehavior.f2509a.mo568c0(f2)) {
                    if (sideSheetBehavior.f2509a.mo559F0(view, f2)) {
                        if (sideSheetBehavior.f2509a.mo572g0(f2, f3) || sideSheetBehavior.f2509a.mo571f0(view)) {
                            i = 5;
                        }
                    } else if (f2 == 0.0f || Math.abs(f2) <= Math.abs(f3)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.f2509a.mo561P()) >= Math.abs(left - sideSheetBehavior.f2509a.mo562Q())) {
                        }
                    }
                }
                sideSheetBehavior.m1915t(view, i, true);
                break;
            default:
                int i2 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f521m;
                if (f3 < 0.0f) {
                    if (bottomSheetBehavior.f2323b) {
                        i2 = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f2299E) {
                        }
                    }
                } else if (bottomSheetBehavior.f2303I && bottomSheetBehavior.m1852D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.f2327d) {
                        if (view.getTop() > (bottomSheetBehavior.m1862x() + bottomSheetBehavior.f2314T) / 2) {
                            i2 = 5;
                        } else if (bottomSheetBehavior.f2323b || Math.abs(view.getTop() - bottomSheetBehavior.m1862x()) < Math.abs(view.getTop() - bottomSheetBehavior.f2299E)) {
                        }
                    }
                } else if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f2323b) {
                        int i3 = bottomSheetBehavior.f2299E;
                        if (top2 < i3) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior.f2301G)) {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f2301G)) {
                            bottomSheetBehavior.getClass();
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f2298D) >= Math.abs(top2 - bottomSheetBehavior.f2301G)) {
                        i2 = 4;
                    }
                } else if (!bottomSheetBehavior.f2323b) {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f2299E) < Math.abs(top3 - bottomSheetBehavior.f2301G)) {
                        bottomSheetBehavior.getClass();
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.m1853E(view, i2, true);
                break;
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: S */
    public final boolean mo576S(View view, int i) {
        WeakReference weakReference;
        switch (this.f520l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f521m;
                if (sideSheetBehavior.f2516h != 1 && (weakReference = sideSheetBehavior.f2524p) != null && weakReference.get() == view) {
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f521m;
                int i2 = bottomSheetBehavior.f2306L;
                if (i2 != 1 && !bottomSheetBehavior.f2322a0) {
                    if (i2 == 3 && bottomSheetBehavior.f2319Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f2316V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f2315U;
                    if (weakReference3 == null || weakReference3.get() != view) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: f */
    public final int mo577f(View view, int i) {
        switch (this.f520l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f521m;
                return AbstractC1230a.m2895l(i, sideSheetBehavior.f2509a.mo564U(), sideSheetBehavior.f2509a.mo563T());
            default:
                return view.getLeft();
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: g */
    public final int mo578g(View view, int i) {
        switch (this.f520l) {
            case 0:
                return view.getTop();
            default:
                return AbstractC1230a.m2895l(i, ((BottomSheetBehavior) this.f521m).m1862x(), mo580s());
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: r */
    public int mo579r(View view) {
        switch (this.f520l) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f521m;
                return sideSheetBehavior.f2520l + sideSheetBehavior.f2523o;
            default:
                return super.mo579r(view);
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: s */
    public int mo580s() {
        switch (this.f520l) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f521m;
                return bottomSheetBehavior.f2303I ? bottomSheetBehavior.f2314T : bottomSheetBehavior.f2301G;
            default:
                return super.mo580s();
        }
    }
}
