package p111y;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p101t.AbstractC1300e;
import p105v.AbstractC1314j;
import p105v.C1307c;
import p105v.C1308d;
import p105v.C1309e;
import p105v.C1311g;
import p107w.C1317b;

/* renamed from: y.f */
/* loaded from: classes.dex */
public final class C1347f {

    /* renamed from: a */
    public final ConstraintLayout f5528a;

    /* renamed from: b */
    public int f5529b;

    /* renamed from: c */
    public int f5530c;

    /* renamed from: d */
    public int f5531d;

    /* renamed from: e */
    public int f5532e;

    /* renamed from: f */
    public int f5533f;

    /* renamed from: g */
    public int f5534g;

    /* renamed from: h */
    public final /* synthetic */ ConstraintLayout f5535h;

    public C1347f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f5535h = constraintLayout;
        this.f5528a = constraintLayout2;
    }

    /* renamed from: a */
    public static boolean m3263a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        return View.MeasureSpec.getMode(i2) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i3 == View.MeasureSpec.getSize(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0123  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3264b(C1308d c1308d, C1317b c1317b) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iM3116a;
        int iMakeMeasureSpec3;
        C1309e c1309e;
        int iMax;
        int i;
        int measuredHeight;
        int baseline;
        int i2;
        int i3;
        if (c1308d == null) {
            return;
        }
        if (c1308d.f5230g0 == 8) {
            c1317b.f5353e = 0;
            c1317b.f5354f = 0;
            c1317b.f5355g = 0;
            return;
        }
        if (c1308d.f5210T == null) {
            return;
        }
        C1360s c1360s = ConstraintLayout.f1549u;
        ConstraintLayout constraintLayout = this.f5535h;
        constraintLayout.getClass();
        int i4 = c1317b.f5349a;
        int i5 = c1317b.f5350b;
        int i6 = c1317b.f5351c;
        int i7 = c1317b.f5352d;
        int i8 = this.f5529b + this.f5530c;
        int i9 = this.f5531d;
        View view = c1308d.f5228f0;
        int iM3116a2 = AbstractC1300e.m3116a(i4);
        C1307c c1307c = c1308d.f5201K;
        C1307c c1307c2 = c1308d.f5199I;
        if (iM3116a2 == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (iM3116a2 == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5533f, i9, -2);
        } else {
            if (iM3116a2 != 2) {
                if (iM3116a2 != 3) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i10 = this.f5533f;
                    int i11 = c1307c2 != null ? c1307c2.f5188g : 0;
                    if (c1307c != null) {
                        i11 += c1307c.f5188g;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, i9 + i11, -1);
                }
                iM3116a = AbstractC1300e.m3116a(i5);
                if (iM3116a != 0) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else if (iM3116a == 1) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f5534g, i8, -2);
                } else if (iM3116a == 2) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f5534g, i8, -2);
                    boolean z2 = c1308d.f5251s == 1;
                    int i12 = c1317b.f5358j;
                    if (i12 != 1) {
                        i3 = 2;
                        if (i12 == 2) {
                        }
                    } else {
                        i3 = 2;
                    }
                    boolean z3 = view.getMeasuredWidth() == c1308d.m3170q();
                    if (c1317b.f5358j == i3 || !z2 || ((z2 && z3) || c1308d.mo3124B())) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c1308d.m3166k(), 1073741824);
                    }
                } else if (iM3116a != 3) {
                    iMakeMeasureSpec3 = 0;
                } else {
                    int i13 = this.f5534g;
                    int i14 = c1307c2 != null ? c1308d.f5200J.f5188g : 0;
                    if (c1307c != null) {
                        i14 += c1308d.f5202L.f5188g;
                    }
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i13, i8 + i14, -1);
                }
                c1309e = (C1309e) c1308d.f5210T;
                if (c1309e == null && AbstractC1314j.m3201c(constraintLayout.f1558n, 256) && view.getMeasuredWidth() == c1308d.m3170q() && view.getMeasuredWidth() < c1309e.m3170q() && view.getMeasuredHeight() == c1308d.m3166k() && view.getMeasuredHeight() < c1309e.m3166k() && view.getBaseline() == c1308d.f5218a0 && !c1308d.m3179z() && m3263a(c1308d.f5197G, iMakeMeasureSpec2, c1308d.m3170q()) && m3263a(c1308d.f5198H, iMakeMeasureSpec3, c1308d.m3166k())) {
                    c1317b.f5353e = c1308d.m3170q();
                    c1317b.f5354f = c1308d.m3166k();
                    c1317b.f5355g = c1308d.f5218a0;
                    return;
                }
                boolean z4 = i4 != 3;
                boolean z5 = i5 != 3;
                boolean z6 = i5 != 4 || i5 == 1;
                boolean z7 = i4 != 4 || i4 == 1;
                boolean z8 = !z4 && c1308d.f5213W > 0.0f;
                boolean z9 = !z5 && c1308d.f5213W > 0.0f;
                if (view != null) {
                    return;
                }
                C1346e c1346e = (C1346e) view.getLayoutParams();
                int i15 = c1317b.f5358j;
                if (i15 != 1 && i15 != 2 && z4 && c1308d.f5250r == 0 && z5 && c1308d.f5251s == 0) {
                    measuredHeight = 0;
                    i2 = -1;
                    baseline = 0;
                    iMax = 0;
                } else {
                    if ((view instanceof AbstractC1361t) && (c1308d instanceof C1311g)) {
                        ((AbstractC1361t) view).mo1369j((C1311g) c1308d, iMakeMeasureSpec2, iMakeMeasureSpec3);
                    } else {
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                    }
                    c1308d.f5197G = iMakeMeasureSpec2;
                    c1308d.f5198H = iMakeMeasureSpec3;
                    c1308d.f5229g = false;
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    int i16 = c1308d.f5253u;
                    iMax = i16 > 0 ? Math.max(i16, measuredWidth) : measuredWidth;
                    int i17 = c1308d.f5254v;
                    if (i17 > 0) {
                        iMax = Math.min(i17, iMax);
                    }
                    int i18 = c1308d.f5256x;
                    if (i18 > 0) {
                        measuredHeight = Math.max(i18, measuredHeight2);
                        i = iMakeMeasureSpec3;
                    } else {
                        i = iMakeMeasureSpec3;
                        measuredHeight = measuredHeight2;
                    }
                    int i19 = c1308d.f5257y;
                    if (i19 > 0) {
                        measuredHeight = Math.min(i19, measuredHeight);
                    }
                    if (!AbstractC1314j.m3201c(constraintLayout.f1558n, 1)) {
                        if (z8 && z6) {
                            iMax = (int) ((measuredHeight * c1308d.f5213W) + 0.5f);
                        } else if (z9 && z7) {
                            measuredHeight = (int) ((iMax / c1308d.f5213W) + 0.5f);
                        }
                    }
                    if (measuredWidth == iMax && measuredHeight2 == measuredHeight) {
                        baseline = baseline2;
                        i2 = -1;
                    } else {
                        if (measuredWidth != iMax) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                        }
                        int iMakeMeasureSpec4 = measuredHeight2 != measuredHeight ? View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824) : i;
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        c1308d.f5197G = iMakeMeasureSpec2;
                        c1308d.f5198H = iMakeMeasureSpec4;
                        c1308d.f5229g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        iMax = measuredWidth2;
                        baseline = view.getBaseline();
                        i2 = -1;
                    }
                }
                boolean z10 = baseline != i2;
                c1317b.f5357i = (iMax == c1317b.f5351c && measuredHeight == c1317b.f5352d) ? false : true;
                boolean z11 = c1346e.f5491c0 ? true : z10;
                if (z11 && baseline != -1 && c1308d.f5218a0 != baseline) {
                    c1317b.f5357i = true;
                }
                c1317b.f5353e = iMax;
                c1317b.f5354f = measuredHeight;
                c1317b.f5356h = z11;
                c1317b.f5355g = baseline;
                return;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5533f, i9, -2);
            boolean z12 = c1308d.f5250r == 1;
            int i20 = c1317b.f5358j;
            if (i20 == 1 || i20 == 2) {
                boolean z13 = view.getMeasuredHeight() == c1308d.m3166k();
                if (c1317b.f5358j == 2 || !z12 || ((z12 && z13) || c1308d.mo3123A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c1308d.m3170q(), 1073741824);
                }
            }
        }
        iMakeMeasureSpec2 = iMakeMeasureSpec;
        iM3116a = AbstractC1300e.m3116a(i5);
        if (iM3116a != 0) {
        }
        c1309e = (C1309e) c1308d.f5210T;
        if (c1309e == null) {
        }
        if (i4 != 3) {
        }
        if (i5 != 3) {
        }
        if (i5 != 4) {
        }
        if (i4 != 4) {
        }
        if (z4) {
        }
        if (z5) {
        }
        if (view != null) {
        }
    }
}
