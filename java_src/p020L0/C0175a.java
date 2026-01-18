package p020L0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p091p0.AbstractC1230a;

/* renamed from: L0.a */
/* loaded from: classes.dex */
public final class C0175a extends AbstractC1230a {

    /* renamed from: o */
    public final /* synthetic */ int f516o;

    /* renamed from: p */
    public final SideSheetBehavior f517p;

    public /* synthetic */ C0175a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f516o = i;
        this.f517p = sideSheetBehavior;
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: F0 */
    public final boolean mo559F0(View view, float f2) {
        switch (this.f516o) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f517p;
                float fAbs = Math.abs((f2 * sideSheetBehavior.f2519k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f517p;
                float fAbs2 = Math.abs((f2 * sideSheetBehavior2.f2519k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: I0 */
    public final void mo560I0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f516o) {
            case 0:
                if (i <= this.f517p.f2521m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f517p.f2521m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: P */
    public final int mo561P() {
        switch (this.f516o) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f517p;
                return Math.max(0, sideSheetBehavior.f2522n + sideSheetBehavior.f2523o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f517p;
                return Math.max(0, (sideSheetBehavior2.f2521m - sideSheetBehavior2.f2520l) - sideSheetBehavior2.f2523o);
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: Q */
    public final int mo562Q() {
        switch (this.f516o) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f517p;
                return (-sideSheetBehavior.f2520l) - sideSheetBehavior.f2523o;
            default:
                return this.f517p.f2521m;
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: T */
    public final int mo563T() {
        switch (this.f516o) {
            case 0:
                return this.f517p.f2523o;
            default:
                return this.f517p.f2521m;
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: U */
    public final int mo564U() {
        switch (this.f516o) {
            case 0:
                return -this.f517p.f2520l;
            default:
                return mo561P();
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: V */
    public final int mo565V(View view) {
        switch (this.f516o) {
            case 0:
                return view.getRight() + this.f517p.f2523o;
            default:
                return view.getLeft() - this.f517p.f2523o;
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: W */
    public final int mo566W(CoordinatorLayout coordinatorLayout) {
        switch (this.f516o) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: X */
    public final int mo567X() {
        switch (this.f516o) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: c0 */
    public final boolean mo568c0(float f2) {
        switch (this.f516o) {
            case 0:
                if (f2 > 0.0f) {
                }
                break;
            default:
                if (f2 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: e */
    public final int mo569e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f516o) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: f */
    public final float mo570f(int i) {
        switch (this.f516o) {
            case 0:
                float fMo562Q = mo562Q();
                return (i - fMo562Q) / (mo561P() - fMo562Q);
            default:
                float f2 = this.f517p.f2521m;
                return (f2 - i) / (f2 - mo561P());
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: f0 */
    public final boolean mo571f0(View view) {
        switch (this.f516o) {
            case 0:
                if (view.getRight() < (mo561P() - mo562Q()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo561P() + this.f517p.f2521m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: g0 */
    public final boolean mo572g0(float f2, float f3) {
        switch (this.f516o) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float fAbs = Math.abs(f2);
                    this.f517p.getClass();
                    if (fAbs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float fAbs2 = Math.abs(f2);
                    this.f517p.getClass();
                    if (fAbs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }
}
