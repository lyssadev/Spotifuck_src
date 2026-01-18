package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import it.deviato.spotifuck.R;
import p003C.RunnableC0014a;
import p030Q0.AbstractC0328E;
import p074j0.AbstractC0896K;
import p074j0.C0897L;
import p074j0.C0902Q;
import p074j0.C0908X;
import p074j0.C0946y;
import p074j0.InterfaceC0907W;
import p094q0.AbstractC1241a;
import p110x0.C1338b;
import p110x0.C1339c;
import p110x0.C1341e;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0896K implements InterfaceC0907W {

    /* renamed from: p */
    public final C1341e f2378p;

    /* renamed from: q */
    public C1339c f2379q;

    /* renamed from: r */
    public final View.OnLayoutChangeListener f2380r;

    public CarouselLayoutManager() {
        C1341e c1341e = new C1341e();
        new C1338b();
        this.f2380r = new View.OnLayoutChangeListener() { // from class: x0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = this.f5434a;
                carouselLayoutManager.getClass();
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC0014a(13, carouselLayoutManager));
            }
        };
        this.f2378p = c1341e;
        m2288l0();
        m1877C0(0);
    }

    /* renamed from: A0 */
    public final boolean m1875A0() {
        return this.f2379q.f5437a == 0;
    }

    /* renamed from: B0 */
    public final boolean m1876B0() {
        return m1875A0() && m2276C() == 1;
    }

    /* renamed from: C0 */
    public final void m1877C0(int i) {
        C1339c c1339c;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0328E.m935e("invalid orientation:", i));
        }
        mo1735c(null);
        C1339c c1339c2 = this.f2379q;
        if (c1339c2 == null || i != c1339c2.f5437a) {
            if (i == 0) {
                c1339c = new C1339c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c1339c = new C1339c(this, 0);
            }
            this.f2379q = c1339c;
            m2288l0();
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: L */
    public final boolean mo1718L() {
        return true;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: Q */
    public final void mo1878Q(RecyclerView recyclerView) throws Resources.NotFoundException {
        C1341e c1341e = this.f2378p;
        Context context = recyclerView.getContext();
        float dimension = c1341e.f5440a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c1341e.f5440a = dimension;
        float dimension2 = c1341e.f5441b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c1341e.f5441b = dimension2;
        m2288l0();
        recyclerView.addOnLayoutChangeListener(this.f2380r);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: R */
    public final void mo1724R(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f2380r);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    @Override // p074j0.AbstractC0896K
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1674S(View view, int i, C0902Q c0902q, C0908X c0908x) {
        char c2;
        if (m2296v() == 0) {
            return null;
        }
        int i2 = this.f2379q.f5437a;
        if (i == 1) {
            c2 = 65535;
        } else if (i == 2) {
            c2 = 1;
        } else if (i == 17) {
            if (i2 == 0) {
                if (m1876B0()) {
                }
            }
            c2 = 0;
        } else if (i != 33) {
            if (i == 66) {
                if (i2 == 0) {
                    if (m1876B0()) {
                    }
                }
                c2 = 0;
            } else if (i != 130 || i2 != 1) {
                c2 = 0;
            }
        } else if (i2 == 1) {
        }
        if (c2 == 0) {
            return null;
        }
        if (c2 == 65535) {
            if (AbstractC0896K.m2268H(view) == 0) {
                return null;
            }
            int iM2268H = AbstractC0896K.m2268H(m2294u(0)) - 1;
            if (iM2268H < 0 || iM2268H >= m2275B()) {
                return m2294u(m1876B0() ? m2296v() - 1 : 0);
            }
            this.f2379q.m3251a();
            throw null;
        }
        if (AbstractC0896K.m2268H(view) == m2275B() - 1) {
            return null;
        }
        int iM2268H2 = AbstractC0896K.m2268H(m2294u(m2296v() - 1)) + 1;
        if (iM2268H2 < 0 || iM2268H2 >= m2275B()) {
            return m2294u(m1876B0() ? 0 : m2296v() - 1);
        }
        this.f2379q.m3251a();
        throw null;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: T */
    public final void mo1727T(AccessibilityEvent accessibilityEvent) {
        super.mo1727T(accessibilityEvent);
        if (m2296v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0896K.m2268H(m2294u(0)));
            accessibilityEvent.setToIndex(AbstractC0896K.m2268H(m2294u(m2296v() - 1)));
        }
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: W */
    public final void mo1678W(int i, int i2) {
        m2275B();
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: Z */
    public final void mo1681Z(int i, int i2) {
        m2275B();
    }

    @Override // p074j0.InterfaceC0907W
    /* renamed from: a */
    public final PointF mo1733a(int i) {
        return null;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: b0 */
    public final void mo1684b0(C0902Q c0902q, C0908X c0908x) {
        if (c0908x.m2313b() > 0) {
            if ((m1875A0() ? this.f3599n : this.f3600o) > 0.0f) {
                m1876B0();
                View view = c0902q.m2308i(0, Long.MAX_VALUE).f3654a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m2284g0(c0902q);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: c0 */
    public final void mo1685c0(C0908X c0908x) {
        if (m2296v() == 0) {
            return;
        }
        AbstractC0896K.m2268H(m2294u(0));
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: d */
    public final boolean mo1737d() {
        return m1875A0();
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: e */
    public final boolean mo1740e() {
        return !m1875A0();
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: j */
    public final int mo1744j(C0908X c0908x) {
        m2296v();
        return 0;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: k */
    public final int mo1693k(C0908X c0908x) {
        return 0;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: k0 */
    public final boolean mo1879k0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: l */
    public final int mo1695l(C0908X c0908x) {
        return 0;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: m */
    public final int mo1745m(C0908X c0908x) {
        m2296v();
        return 0;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: m0 */
    public final int mo1697m0(int i, C0902Q c0902q, C0908X c0908x) {
        if (!m1875A0() || m2296v() == 0 || i == 0) {
            return 0;
        }
        View view = c0902q.m2308i(0, Long.MAX_VALUE).f3654a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: n */
    public final int mo1699n(C0908X c0908x) {
        return 0;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: n0 */
    public final void mo1746n0(int i) {
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: o */
    public final int mo1700o(C0908X c0908x) {
        return 0;
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: o0 */
    public final int mo1701o0(int i, C0902Q c0902q, C0908X c0908x) {
        if (!mo1740e() || m2296v() == 0 || i == 0) {
            return 0;
        }
        View view = c0902q.m2308i(0, Long.MAX_VALUE).f3654a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: r */
    public final C0897L mo1702r() {
        return new C0897L(-2, -2);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: x0 */
    public final void mo1749x0(RecyclerView recyclerView, int i) {
        C0946y c0946y = new C0946y(this, recyclerView.getContext(), 1);
        c0946y.f3845a = i;
        m2298y0(c0946y);
    }

    @Override // p074j0.AbstractC0896K
    /* renamed from: y */
    public final void mo1880y(View view, Rect rect) {
        super.mo1880y(view, rect);
        rect.centerY();
        if (m1875A0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C1338b();
        this.f2380r = new View.OnLayoutChangeListener() { // from class: x0.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                CarouselLayoutManager carouselLayoutManager = this.f5434a;
                carouselLayoutManager.getClass();
                if (i3 == i5 && i22 == i6 && i32 == i7 && i4 == i8) {
                    return;
                }
                view.post(new RunnableC0014a(13, carouselLayoutManager));
            }
        };
        this.f2378p = new C1341e();
        m2288l0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1241a.f4938b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m2288l0();
            m1877C0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
