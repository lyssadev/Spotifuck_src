package p074j0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.v */
/* loaded from: classes.dex */
public class C0943v {

    /* renamed from: a */
    public int f3845a = -1;

    /* renamed from: b */
    public RecyclerView f3846b;

    /* renamed from: c */
    public AbstractC0896K f3847c;

    /* renamed from: d */
    public boolean f3848d;

    /* renamed from: e */
    public boolean f3849e;

    /* renamed from: f */
    public View f3850f;

    /* renamed from: g */
    public final C0906V f3851g;

    /* renamed from: h */
    public boolean f3852h;

    /* renamed from: i */
    public final LinearInterpolator f3853i;

    /* renamed from: j */
    public final DecelerateInterpolator f3854j;

    /* renamed from: k */
    public PointF f3855k;

    /* renamed from: l */
    public final DisplayMetrics f3856l;

    /* renamed from: m */
    public boolean f3857m;

    /* renamed from: n */
    public float f3858n;

    /* renamed from: o */
    public int f3859o;

    /* renamed from: p */
    public int f3860p;

    public C0943v(Context context) {
        C0906V c0906v = new C0906V();
        c0906v.f3624d = -1;
        c0906v.f3626f = false;
        c0906v.f3627g = 0;
        c0906v.f3621a = 0;
        c0906v.f3622b = 0;
        c0906v.f3623c = Integer.MIN_VALUE;
        c0906v.f3625e = null;
        this.f3851g = c0906v;
        this.f3853i = new LinearInterpolator();
        this.f3854j = new DecelerateInterpolator();
        this.f3857m = false;
        this.f3859o = 0;
        this.f3860p = 0;
        this.f3856l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public static int m2395a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* renamed from: b */
    public int mo2396b(View view, int i) {
        AbstractC0896K abstractC0896K = this.f3847c;
        if (abstractC0896K == null || !abstractC0896K.mo1737d()) {
            return 0;
        }
        C0897L c0897l = (C0897L) view.getLayoutParams();
        return m2395a((view.getLeft() - ((C0897L) view.getLayoutParams()).f3602b.left) - ((ViewGroup.MarginLayoutParams) c0897l).leftMargin, view.getRight() + ((C0897L) view.getLayoutParams()).f3602b.right + ((ViewGroup.MarginLayoutParams) c0897l).rightMargin, abstractC0896K.m2278E(), abstractC0896K.f3599n - abstractC0896K.m2279F(), i);
    }

    /* renamed from: c */
    public int mo2397c(View view, int i) {
        AbstractC0896K abstractC0896K = this.f3847c;
        if (abstractC0896K == null || !abstractC0896K.mo1740e()) {
            return 0;
        }
        C0897L c0897l = (C0897L) view.getLayoutParams();
        return m2395a((view.getTop() - ((C0897L) view.getLayoutParams()).f3602b.top) - ((ViewGroup.MarginLayoutParams) c0897l).topMargin, view.getBottom() + ((C0897L) view.getLayoutParams()).f3602b.bottom + ((ViewGroup.MarginLayoutParams) c0897l).bottomMargin, abstractC0896K.m2280G(), abstractC0896K.f3600o - abstractC0896K.m2277D(), i);
    }

    /* renamed from: d */
    public float mo1909d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: e */
    public int mo2398e(int i) {
        float fAbs = Math.abs(i);
        if (!this.f3857m) {
            this.f3858n = mo1909d(this.f3856l);
            this.f3857m = true;
        }
        return (int) Math.ceil(fAbs * this.f3858n);
    }

    /* renamed from: f */
    public PointF mo2399f(int i) {
        Object obj = this.f3847c;
        if (obj instanceof InterfaceC0907W) {
            return ((InterfaceC0907W) obj).mo1733a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC0907W.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2400g(int i, int i2) {
        PointF pointFMo2399f;
        RecyclerView recyclerView = this.f3846b;
        if (this.f3845a == -1 || recyclerView == null) {
            m2402i();
        }
        if (this.f3848d && this.f3850f == null && this.f3847c != null && (pointFMo2399f = mo2399f(this.f3845a)) != null) {
            float f2 = pointFMo2399f.x;
            if (f2 != 0.0f || pointFMo2399f.y != 0.0f) {
                recyclerView.m1780Z((int) Math.signum(f2), (int) Math.signum(pointFMo2399f.y), null);
            }
        }
        this.f3848d = false;
        View view = this.f3850f;
        C0906V c0906v = this.f3851g;
        if (view != null) {
            this.f3846b.getClass();
            AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
            if ((abstractC0912a0M1751I != null ? abstractC0912a0M1751I.m2317b() : -1) == this.f3845a) {
                View view2 = this.f3850f;
                C0908X c0908x = recyclerView.f2197j0;
                mo2401h(view2, c0906v);
                c0906v.m2311a(recyclerView);
                m2402i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f3850f = null;
            }
        }
        if (this.f3849e) {
            C0908X c0908x2 = recyclerView.f2197j0;
            if (this.f3846b.f2212r.m2296v() == 0) {
                m2402i();
            } else {
                int i3 = this.f3859o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f3859o = i4;
                int i5 = this.f3860p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f3860p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF pointFMo2399f2 = mo2399f(this.f3845a);
                    if (pointFMo2399f2 != null) {
                        if (pointFMo2399f2.x == 0.0f && pointFMo2399f2.y == 0.0f) {
                            c0906v.f3624d = this.f3845a;
                            m2402i();
                        } else {
                            float f3 = pointFMo2399f2.y;
                            float fSqrt = (float) Math.sqrt((f3 * f3) + (r10 * r10));
                            float f4 = pointFMo2399f2.x / fSqrt;
                            pointFMo2399f2.x = f4;
                            float f5 = pointFMo2399f2.y / fSqrt;
                            pointFMo2399f2.y = f5;
                            this.f3855k = pointFMo2399f2;
                            this.f3859o = (int) (f4 * 10000.0f);
                            this.f3860p = (int) (f5 * 10000.0f);
                            int iMo2398e = mo2398e(10000);
                            LinearInterpolator linearInterpolator = this.f3853i;
                            c0906v.f3621a = (int) (this.f3859o * 1.2f);
                            c0906v.f3622b = (int) (this.f3860p * 1.2f);
                            c0906v.f3623c = (int) (iMo2398e * 1.2f);
                            c0906v.f3625e = linearInterpolator;
                            c0906v.f3626f = true;
                        }
                    }
                }
            }
            boolean z2 = c0906v.f3624d >= 0;
            c0906v.m2311a(recyclerView);
            if (z2 && this.f3849e) {
                this.f3848d = true;
                recyclerView.f2191g0.m2314a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2401h(View view, C0906V c0906v) {
        int i;
        PointF pointF = this.f3855k;
        int i2 = 0;
        if (pointF != null) {
            float f2 = pointF.x;
            i = f2 == 0.0f ? 0 : f2 > 0.0f ? 1 : -1;
        }
        int iMo2396b = mo2396b(view, i);
        PointF pointF2 = this.f3855k;
        if (pointF2 != null) {
            float f3 = pointF2.y;
            if (f3 != 0.0f) {
                i2 = f3 > 0.0f ? 1 : -1;
            }
        }
        int iMo2397c = mo2397c(view, i2);
        int iCeil = (int) Math.ceil(mo2398e((int) Math.sqrt((iMo2397c * iMo2397c) + (iMo2396b * iMo2396b))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f3854j;
            c0906v.f3621a = -iMo2396b;
            c0906v.f3622b = -iMo2397c;
            c0906v.f3623c = iCeil;
            c0906v.f3625e = decelerateInterpolator;
            c0906v.f3626f = true;
        }
    }

    /* renamed from: i */
    public final void m2402i() {
        if (this.f3849e) {
            this.f3849e = false;
            this.f3860p = 0;
            this.f3859o = 0;
            this.f3855k = null;
            this.f3846b.f2197j0.f3628a = -1;
            this.f3850f = null;
            this.f3845a = -1;
            this.f3848d = false;
            AbstractC0896K abstractC0896K = this.f3847c;
            if (abstractC0896K.f3590e == this) {
                abstractC0896K.f3590e = null;
            }
            this.f3847c = null;
            this.f3846b = null;
        }
    }
}
