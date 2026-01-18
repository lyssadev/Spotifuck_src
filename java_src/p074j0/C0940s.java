package p074j0;

import android.view.View;
import androidx.emoji2.text.AbstractC0552g;

/* renamed from: j0.s */
/* loaded from: classes.dex */
public final class C0940s {

    /* renamed from: a */
    public AbstractC0552g f3825a;

    /* renamed from: b */
    public int f3826b;

    /* renamed from: c */
    public int f3827c;

    /* renamed from: d */
    public boolean f3828d;

    /* renamed from: e */
    public boolean f3829e;

    public C0940s() {
        m2392d();
    }

    /* renamed from: a */
    public final void m2389a() {
        this.f3827c = this.f3828d ? this.f3825a.mo1426g() : this.f3825a.mo1430k();
    }

    /* renamed from: b */
    public final void m2390b(View view, int i) {
        if (this.f3828d) {
            this.f3827c = this.f3825a.m1432m() + this.f3825a.mo1421b(view);
        } else {
            this.f3827c = this.f3825a.mo1424e(view);
        }
        this.f3826b = i;
    }

    /* renamed from: c */
    public final void m2391c(View view, int i) {
        int iM1432m = this.f3825a.m1432m();
        if (iM1432m >= 0) {
            m2390b(view, i);
            return;
        }
        this.f3826b = i;
        if (!this.f3828d) {
            int iMo1424e = this.f3825a.mo1424e(view);
            int iMo1430k = iMo1424e - this.f3825a.mo1430k();
            this.f3827c = iMo1424e;
            if (iMo1430k > 0) {
                int iMo1426g = (this.f3825a.mo1426g() - Math.min(0, (this.f3825a.mo1426g() - iM1432m) - this.f3825a.mo1421b(view))) - (this.f3825a.mo1422c(view) + iMo1424e);
                if (iMo1426g < 0) {
                    this.f3827c -= Math.min(iMo1430k, -iMo1426g);
                    return;
                }
                return;
            }
            return;
        }
        int iMo1426g2 = (this.f3825a.mo1426g() - iM1432m) - this.f3825a.mo1421b(view);
        this.f3827c = this.f3825a.mo1426g() - iMo1426g2;
        if (iMo1426g2 > 0) {
            int iMo1422c = this.f3827c - this.f3825a.mo1422c(view);
            int iMo1430k2 = this.f3825a.mo1430k();
            int iMin = iMo1422c - (Math.min(this.f3825a.mo1424e(view) - iMo1430k2, 0) + iMo1430k2);
            if (iMin < 0) {
                this.f3827c = Math.min(iMo1426g2, -iMin) + this.f3827c;
            }
        }
    }

    /* renamed from: d */
    public final void m2392d() {
        this.f3826b = -1;
        this.f3827c = Integer.MIN_VALUE;
        this.f3828d = false;
        this.f3829e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f3826b + ", mCoordinate=" + this.f3827c + ", mLayoutFromEnd=" + this.f3828d + ", mValid=" + this.f3829e + '}';
    }
}
