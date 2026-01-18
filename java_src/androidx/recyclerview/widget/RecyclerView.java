package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.emoji2.text.AbstractC0552g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p007E.C0057j;
import p015J.AbstractC0126k;
import p023N.AbstractC0195F;
import p023N.AbstractC0197H;
import p023N.AbstractC0206Q;
import p023N.AbstractC0207S;
import p023N.AbstractC0210V;
import p023N.C0241n;
import p023N.C0247q;
import p035T.AbstractC0387d;
import p039V.InterpolatorC0420d;
import p071i0.AbstractC0870a;
import p074j0.AbstractC0888C;
import p074j0.AbstractC0892G;
import p074j0.AbstractC0893H;
import p074j0.AbstractC0896K;
import p074j0.AbstractC0898M;
import p074j0.AbstractC0899N;
import p074j0.AbstractC0909Y;
import p074j0.AbstractC0912a0;
import p074j0.C0887B;
import p074j0.C0891F;
import p074j0.C0897L;
import p074j0.C0900O;
import p074j0.C0901P;
import p074j0.C0902Q;
import p074j0.C0904T;
import p074j0.C0905U;
import p074j0.C0908X;
import p074j0.C0911a;
import p074j0.C0913b;
import p074j0.C0915c;
import p074j0.C0916c0;
import p074j0.C0929j;
import p074j0.C0932k0;
import p074j0.C0934m;
import p074j0.C0935n;
import p074j0.C0943v;
import p074j0.C0946y;
import p074j0.C0947z;
import p074j0.InterfaceC0890E;
import p074j0.InterfaceC0903S;
import p074j0.InterfaceC0907W;
import p074j0.RunnableC0886A;
import p074j0.RunnableC0910Z;
import p074j0.RunnableC0937p;
import p096r.C1250e;
import p096r.C1256k;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: A0 */
    public static final boolean f2154A0;

    /* renamed from: B0 */
    public static final boolean f2155B0;

    /* renamed from: C0 */
    public static final boolean f2156C0;

    /* renamed from: D0 */
    public static final Class[] f2157D0;

    /* renamed from: E0 */
    public static final InterpolatorC0420d f2158E0;

    /* renamed from: z0 */
    public static final int[] f2159z0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: A */
    public boolean f2160A;

    /* renamed from: B */
    public boolean f2161B;

    /* renamed from: C */
    public int f2162C;

    /* renamed from: D */
    public boolean f2163D;

    /* renamed from: E */
    public final AccessibilityManager f2164E;

    /* renamed from: F */
    public boolean f2165F;

    /* renamed from: G */
    public boolean f2166G;

    /* renamed from: H */
    public int f2167H;

    /* renamed from: I */
    public int f2168I;

    /* renamed from: J */
    public C0891F f2169J;

    /* renamed from: K */
    public EdgeEffect f2170K;

    /* renamed from: L */
    public EdgeEffect f2171L;

    /* renamed from: M */
    public EdgeEffect f2172M;

    /* renamed from: N */
    public EdgeEffect f2173N;

    /* renamed from: O */
    public AbstractC0892G f2174O;

    /* renamed from: P */
    public int f2175P;

    /* renamed from: Q */
    public int f2176Q;

    /* renamed from: R */
    public VelocityTracker f2177R;

    /* renamed from: S */
    public int f2178S;

    /* renamed from: T */
    public int f2179T;

    /* renamed from: U */
    public int f2180U;

    /* renamed from: V */
    public int f2181V;

    /* renamed from: W */
    public int f2182W;

    /* renamed from: a0 */
    public AbstractC0898M f2183a0;

    /* renamed from: b0 */
    public final int f2184b0;

    /* renamed from: c0 */
    public final int f2185c0;

    /* renamed from: d0 */
    public final float f2186d0;

    /* renamed from: e0 */
    public final float f2187e0;

    /* renamed from: f */
    public final C0904T f2188f;

    /* renamed from: f0 */
    public boolean f2189f0;

    /* renamed from: g */
    public final C0902Q f2190g;

    /* renamed from: g0 */
    public final RunnableC0910Z f2191g0;

    /* renamed from: h */
    public C0905U f2192h;

    /* renamed from: h0 */
    public RunnableC0937p f2193h0;

    /* renamed from: i */
    public final C0913b f2194i;

    /* renamed from: i0 */
    public final C0935n f2195i0;

    /* renamed from: j */
    public final C0513t f2196j;

    /* renamed from: j0 */
    public final C0908X f2197j0;

    /* renamed from: k */
    public final C0057j f2198k;

    /* renamed from: k0 */
    public AbstractC0899N f2199k0;

    /* renamed from: l */
    public boolean f2200l;

    /* renamed from: l0 */
    public ArrayList f2201l0;

    /* renamed from: m */
    public final RunnableC0886A f2202m;

    /* renamed from: m0 */
    public boolean f2203m0;

    /* renamed from: n */
    public final Rect f2204n;

    /* renamed from: n0 */
    public boolean f2205n0;

    /* renamed from: o */
    public final Rect f2206o;

    /* renamed from: o0 */
    public final C0887B f2207o0;

    /* renamed from: p */
    public final RectF f2208p;

    /* renamed from: p0 */
    public boolean f2209p0;

    /* renamed from: q */
    public AbstractC0888C f2210q;

    /* renamed from: q0 */
    public C0916c0 f2211q0;

    /* renamed from: r */
    public AbstractC0896K f2212r;

    /* renamed from: r0 */
    public final int[] f2213r0;

    /* renamed from: s */
    public final ArrayList f2214s;

    /* renamed from: s0 */
    public C0241n f2215s0;

    /* renamed from: t */
    public final ArrayList f2216t;

    /* renamed from: t0 */
    public final int[] f2217t0;

    /* renamed from: u */
    public C0934m f2218u;

    /* renamed from: u0 */
    public final int[] f2219u0;

    /* renamed from: v */
    public boolean f2220v;

    /* renamed from: v0 */
    public final int[] f2221v0;

    /* renamed from: w */
    public boolean f2222w;

    /* renamed from: w0 */
    public final ArrayList f2223w0;

    /* renamed from: x */
    public boolean f2224x;

    /* renamed from: x0 */
    public final RunnableC0886A f2225x0;

    /* renamed from: y */
    public int f2226y;

    /* renamed from: y0 */
    public final C0887B f2227y0;

    /* renamed from: z */
    public boolean f2228z;

    static {
        f2154A0 = Build.VERSION.SDK_INT >= 23;
        f2155B0 = true;
        f2156C0 = true;
        Class cls = Integer.TYPE;
        f2157D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2158E0 = new InterpolatorC0420d(1);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, it.deviato.spotifuck.R.attr.recyclerViewStyle);
    }

    /* renamed from: D */
    public static RecyclerView m1750D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM1750D = m1750D(viewGroup.getChildAt(i));
            if (recyclerViewM1750D != null) {
                return recyclerViewM1750D;
            }
        }
        return null;
    }

    /* renamed from: I */
    public static AbstractC0912a0 m1751I(View view) {
        if (view == null) {
            return null;
        }
        return ((C0897L) view.getLayoutParams()).f3601a;
    }

    private C0241n getScrollingChildHelper() {
        if (this.f2215s0 == null) {
            this.f2215s0 = new C0241n(this);
        }
        return this.f2215s0;
    }

    /* renamed from: j */
    public static void m1756j(AbstractC0912a0 abstractC0912a0) {
        WeakReference weakReference = abstractC0912a0.f3655b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC0912a0.f3654a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC0912a0.f3655b = null;
        }
    }

    /* renamed from: A */
    public final View m1757A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1758B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f2216t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0934m c0934m = (C0934m) arrayList.get(i);
            int i2 = c0934m.f3794v;
            if (i2 == 1) {
                boolean zM2381e = c0934m.m2381e(motionEvent.getX(), motionEvent.getY());
                boolean zM2380d = c0934m.m2380d(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zM2381e || zM2380d)) {
                    if (zM2380d) {
                        c0934m.f3795w = 1;
                        c0934m.f3788p = (int) motionEvent.getX();
                    } else if (zM2381e) {
                        c0934m.f3795w = 2;
                        c0934m.f3785m = (int) motionEvent.getY();
                    }
                    c0934m.m2382g(2);
                    if (action == 3) {
                        this.f2218u = c0934m;
                        return true;
                    }
                }
            } else if (i2 != 2) {
                continue;
            } else if (action == 3) {
            }
        }
        return false;
    }

    /* renamed from: C */
    public final void m1759C(int[] iArr) {
        int iM1238m = this.f2196j.m1238m();
        if (iM1238m == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM1238m; i3++) {
            AbstractC0912a0 abstractC0912a0M1751I = m1751I(this.f2196j.m1237l(i3));
            if (!abstractC0912a0M1751I.m2331p()) {
                int iM2317b = abstractC0912a0M1751I.m2317b();
                if (iM2317b < i) {
                    i = iM2317b;
                }
                if (iM2317b > i2) {
                    i2 = iM2317b;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: E */
    public final AbstractC0912a0 m1760E(int i) {
        AbstractC0912a0 abstractC0912a0 = null;
        if (this.f2165F) {
            return null;
        }
        int iM1246u = this.f2196j.m1246u();
        for (int i2 = 0; i2 < iM1246u; i2++) {
            AbstractC0912a0 abstractC0912a0M1751I = m1751I(this.f2196j.m1245t(i2));
            if (abstractC0912a0M1751I != null && !abstractC0912a0M1751I.m2324i() && m1761F(abstractC0912a0M1751I) == i) {
                if (!((ArrayList) this.f2196j.f1247d).contains(abstractC0912a0M1751I.f3654a)) {
                    return abstractC0912a0M1751I;
                }
                abstractC0912a0 = abstractC0912a0M1751I;
            }
        }
        return abstractC0912a0;
    }

    /* renamed from: F */
    public final int m1761F(AbstractC0912a0 abstractC0912a0) {
        if (abstractC0912a0.m2319d(524) || !abstractC0912a0.m2321f()) {
            return -1;
        }
        C0913b c0913b = this.f2194i;
        int i = abstractC0912a0.f3656c;
        ArrayList arrayList = (ArrayList) c0913b.f3674c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0911a c0911a = (C0911a) arrayList.get(i2);
            int i3 = c0911a.f3649a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c0911a.f3650b;
                    if (i4 <= i) {
                        int i5 = c0911a.f3652d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c0911a.f3650b;
                    if (i6 == i) {
                        i = c0911a.f3652d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c0911a.f3652d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c0911a.f3650b <= i) {
                i += c0911a.f3652d;
            }
        }
        return i;
    }

    /* renamed from: G */
    public final long m1762G(AbstractC0912a0 abstractC0912a0) {
        return this.f2210q.f3573b ? abstractC0912a0.f3658e : abstractC0912a0.f3656c;
    }

    /* renamed from: H */
    public final AbstractC0912a0 m1763H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m1751I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: J */
    public final Rect m1764J(View view) {
        C0897L c0897l = (C0897L) view.getLayoutParams();
        boolean z2 = c0897l.f3603c;
        Rect rect = c0897l.f3602b;
        if (!z2) {
            return rect;
        }
        if (this.f2197j0.f3634g && (c0897l.f3601a.m2327l() || c0897l.f3601a.m2322g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2214s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f2204n;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0893H) arrayList.get(i)).mo1983a(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0897l.f3603c = false;
        return rect;
    }

    /* renamed from: K */
    public final boolean m1765K() {
        return !this.f2224x || this.f2165F || this.f2194i.m2342j();
    }

    /* renamed from: L */
    public final boolean m1766L() {
        return this.f2167H > 0;
    }

    /* renamed from: M */
    public final void m1767M(int i) {
        if (this.f2212r == null) {
            return;
        }
        setScrollState(2);
        this.f2212r.mo1746n0(i);
        awakenScrollBars();
    }

    /* renamed from: N */
    public final void m1768N() {
        int iM1246u = this.f2196j.m1246u();
        for (int i = 0; i < iM1246u; i++) {
            ((C0897L) this.f2196j.m1245t(i).getLayoutParams()).f3603c = true;
        }
        ArrayList arrayList = this.f2190g.f3613c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0897L c0897l = (C0897L) ((AbstractC0912a0) arrayList.get(i2)).f3654a.getLayoutParams();
            if (c0897l != null) {
                c0897l.f3603c = true;
            }
        }
    }

    /* renamed from: O */
    public final void m1769O(int i, int i2, boolean z2) {
        int i3 = i + i2;
        int iM1246u = this.f2196j.m1246u();
        for (int i4 = 0; i4 < iM1246u; i4++) {
            AbstractC0912a0 abstractC0912a0M1751I = m1751I(this.f2196j.m1245t(i4));
            if (abstractC0912a0M1751I != null && !abstractC0912a0M1751I.m2331p()) {
                int i5 = abstractC0912a0M1751I.f3656c;
                C0908X c0908x = this.f2197j0;
                if (i5 >= i3) {
                    abstractC0912a0M1751I.m2328m(-i2, z2);
                    c0908x.f3633f = true;
                } else if (i5 >= i) {
                    abstractC0912a0M1751I.m2316a(8);
                    abstractC0912a0M1751I.m2328m(-i2, z2);
                    abstractC0912a0M1751I.f3656c = i - 1;
                    c0908x.f3633f = true;
                }
            }
        }
        C0902Q c0902q = this.f2190g;
        ArrayList arrayList = c0902q.f3613c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0912a0 abstractC0912a0 = (AbstractC0912a0) arrayList.get(size);
            if (abstractC0912a0 != null) {
                int i6 = abstractC0912a0.f3656c;
                if (i6 >= i3) {
                    abstractC0912a0.m2328m(-i2, z2);
                } else if (i6 >= i) {
                    abstractC0912a0.m2316a(8);
                    c0902q.m2304e(size);
                }
            }
        }
        requestLayout();
    }

    /* renamed from: P */
    public final void m1770P() {
        this.f2167H++;
    }

    /* renamed from: Q */
    public final void m1771Q(boolean z2) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.f2167H - 1;
        this.f2167H = i2;
        if (i2 < 1) {
            this.f2167H = 0;
            if (z2) {
                int i3 = this.f2162C;
                this.f2162C = 0;
                if (i3 != 0 && (accessibilityManager = this.f2164E) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f2223w0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0912a0 abstractC0912a0 = (AbstractC0912a0) arrayList.get(size);
                    if (abstractC0912a0.f3654a.getParent() == this && !abstractC0912a0.m2331p() && (i = abstractC0912a0.f3670q) != -1) {
                        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                        abstractC0912a0.f3654a.setImportantForAccessibility(i);
                        abstractC0912a0.f3670q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* renamed from: R */
    public final void m1772R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2176Q) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2176Q = motionEvent.getPointerId(i);
            int x2 = (int) (motionEvent.getX(i) + 0.5f);
            this.f2180U = x2;
            this.f2178S = x2;
            int y2 = (int) (motionEvent.getY(i) + 0.5f);
            this.f2181V = y2;
            this.f2179T = y2;
        }
    }

    /* renamed from: S */
    public final void m1773S() {
        if (this.f2209p0 || !this.f2220v) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        postOnAnimation(this.f2225x0);
        this.f2209p0 = true;
    }

    /* renamed from: T */
    public final void m1774T() {
        boolean z2;
        boolean z3 = false;
        if (this.f2165F) {
            C0913b c0913b = this.f2194i;
            c0913b.m2349q((ArrayList) c0913b.f3674c);
            c0913b.m2349q((ArrayList) c0913b.f3675d);
            c0913b.f3672a = 0;
            if (this.f2166G) {
                this.f2212r.mo1679X();
            }
        }
        if (this.f2174O == null || !this.f2212r.mo1707z0()) {
            this.f2194i.m2336d();
        } else {
            this.f2194i.m2348p();
        }
        boolean z4 = this.f2203m0 || this.f2205n0;
        boolean z5 = this.f2224x && this.f2174O != null && ((z2 = this.f2165F) || z4 || this.f2212r.f3591f) && (!z2 || this.f2210q.f3573b);
        C0908X c0908x = this.f2197j0;
        c0908x.f3637j = z5;
        if (z5 && z4 && !this.f2165F && this.f2174O != null && this.f2212r.mo1707z0()) {
            z3 = true;
        }
        c0908x.f3638k = z3;
    }

    /* renamed from: U */
    public final void m1775U(boolean z2) {
        this.f2166G = z2 | this.f2166G;
        this.f2165F = true;
        int iM1246u = this.f2196j.m1246u();
        for (int i = 0; i < iM1246u; i++) {
            AbstractC0912a0 abstractC0912a0M1751I = m1751I(this.f2196j.m1245t(i));
            if (abstractC0912a0M1751I != null && !abstractC0912a0M1751I.m2331p()) {
                abstractC0912a0M1751I.m2316a(6);
            }
        }
        m1768N();
        C0902Q c0902q = this.f2190g;
        ArrayList arrayList = c0902q.f3613c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0912a0 abstractC0912a0 = (AbstractC0912a0) arrayList.get(i2);
            if (abstractC0912a0 != null) {
                abstractC0912a0.m2316a(6);
                abstractC0912a0.m2316a(1024);
            }
        }
        AbstractC0888C abstractC0888C = c0902q.f3618h.f2210q;
        if (abstractC0888C == null || !abstractC0888C.f3573b) {
            c0902q.m2303d();
        }
    }

    /* renamed from: V */
    public final void m1776V(AbstractC0912a0 abstractC0912a0, C0247q c0247q) {
        abstractC0912a0.f3663j &= -8193;
        boolean z2 = this.f2197j0.f3635h;
        C0057j c0057j = this.f2198k;
        if (z2 && abstractC0912a0.m2327l() && !abstractC0912a0.m2324i() && !abstractC0912a0.m2331p()) {
            ((C1250e) c0057j.f123h).m2960f(m1762G(abstractC0912a0), abstractC0912a0);
        }
        C1256k c1256k = (C1256k) c0057j.f122g;
        C0932k0 c0932k0M2378a = (C0932k0) c1256k.getOrDefault(abstractC0912a0, null);
        if (c0932k0M2378a == null) {
            c0932k0M2378a = C0932k0.m2378a();
            c1256k.put(abstractC0912a0, c0932k0M2378a);
        }
        c0932k0M2378a.f3765b = c0247q;
        c0932k0M2378a.f3764a |= 4;
    }

    /* renamed from: W */
    public final void m1777W(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2204n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0897L) {
            C0897L c0897l = (C0897L) layoutParams;
            if (!c0897l.f3603c) {
                int i = rect.left;
                Rect rect2 = c0897l.f3602b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2212r.mo1879k0(this, view, this.f2204n, !this.f2224x, view2 == null);
    }

    /* renamed from: X */
    public final void m1778X() {
        VelocityTracker velocityTracker = this.f2177R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m1785e0(0);
        EdgeEffect edgeEffect = this.f2170K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f2170K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2171L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f2171L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2172M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f2172M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2173N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f2173N.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1779Y(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        m1792m();
        AbstractC0888C abstractC0888C = this.f2210q;
        int[] iArr = this.f2221v0;
        if (abstractC0888C != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            m1780Z(i, i2, iArr);
            int i7 = iArr[0];
            int i8 = iArr[1];
            i3 = i7;
            i4 = i8;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.f2214s.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        m1798s(i3, i4, i5, i6, this.f2217t0, 0, iArr);
        int i9 = iArr[0];
        int i10 = i5 - i9;
        int i11 = iArr[1];
        int i12 = i6 - i11;
        boolean z3 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.f2180U;
        int[] iArr2 = this.f2217t0;
        int i14 = iArr2[0];
        this.f2180U = i13 - i14;
        int i15 = this.f2181V;
        int i16 = iArr2[1];
        this.f2181V = i15 - i16;
        int[] iArr3 = this.f2219u0;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x2 = motionEvent.getX();
                float f2 = i10;
                float y2 = motionEvent.getY();
                float f3 = i12;
                if (f2 < 0.0f) {
                    m1801v();
                    AbstractC0387d.m985a(this.f2170K, (-f2) / getWidth(), 1.0f - (y2 / getHeight()));
                } else if (f2 > 0.0f) {
                    m1802w();
                    AbstractC0387d.m985a(this.f2172M, f2 / getWidth(), y2 / getHeight());
                } else {
                    z2 = false;
                    if (f3 >= 0.0f) {
                        m1803x();
                        AbstractC0387d.m985a(this.f2171L, (-f3) / getHeight(), x2 / getWidth());
                    } else {
                        if (f3 > 0.0f) {
                            m1800u();
                            AbstractC0387d.m985a(this.f2173N, f3 / getHeight(), 1.0f - (x2 / getWidth()));
                        }
                        if (z2 || f2 != 0.0f || f3 != 0.0f) {
                            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                            postInvalidateOnAnimation();
                        }
                    }
                    z2 = true;
                    if (z2) {
                        WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
                        postInvalidateOnAnimation();
                    }
                }
                z2 = true;
                if (f3 >= 0.0f) {
                }
                z2 = true;
                if (z2) {
                }
            }
            m1791l(i, i2);
        }
        if (i3 != 0 || i4 != 0) {
            m1799t(i3, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z3 && i3 == 0 && i4 == 0) ? false : true;
    }

    /* renamed from: Z */
    public final void m1780Z(int i, int i2, int[] iArr) {
        AbstractC0912a0 abstractC0912a0;
        C0513t c0513t = this.f2196j;
        m1783c0();
        m1770P();
        int i3 = AbstractC0126k.f327a;
        Trace.beginSection("RV Scroll");
        C0908X c0908x = this.f2197j0;
        m1805z(c0908x);
        C0902Q c0902q = this.f2190g;
        int iMo1697m0 = i != 0 ? this.f2212r.mo1697m0(i, c0902q, c0908x) : 0;
        int iMo1701o0 = i2 != 0 ? this.f2212r.mo1701o0(i2, c0902q, c0908x) : 0;
        Trace.endSection();
        int iM1238m = c0513t.m1238m();
        for (int i4 = 0; i4 < iM1238m; i4++) {
            View viewM1237l = c0513t.m1237l(i4);
            AbstractC0912a0 abstractC0912a0M1763H = m1763H(viewM1237l);
            if (abstractC0912a0M1763H != null && (abstractC0912a0 = abstractC0912a0M1763H.f3662i) != null) {
                int left = viewM1237l.getLeft();
                int top = viewM1237l.getTop();
                View view = abstractC0912a0.f3654a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        m1771Q(true);
        m1784d0(false);
        if (iArr != null) {
            iArr[0] = iMo1697m0;
            iArr[1] = iMo1701o0;
        }
    }

    /* renamed from: a0 */
    public final void m1781a0(int i) {
        C0943v c0943v;
        if (this.f2160A) {
            return;
        }
        setScrollState(0);
        RunnableC0910Z runnableC0910Z = this.f2191g0;
        runnableC0910Z.f3648g.removeCallbacks(runnableC0910Z);
        runnableC0910Z.f3644c.abortAnimation();
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null && (c0943v = abstractC0896K.f3590e) != null) {
            c0943v.m2402i();
        }
        AbstractC0896K abstractC0896K2 = this.f2212r;
        if (abstractC0896K2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0896K2.mo1746n0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null) {
            abstractC0896K.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* renamed from: b0 */
    public final void m1782b0(int i, int i2, boolean z2) {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2160A) {
            return;
        }
        if (!abstractC0896K.mo1737d()) {
            i = 0;
        }
        if (!this.f2212r.mo1740e()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z2) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().m759g(i3, 1);
        }
        this.f2191g0.m2315b(i, i2, Integer.MIN_VALUE, null);
    }

    /* renamed from: c0 */
    public final void m1783c0() {
        int i = this.f2226y + 1;
        this.f2226y = i;
        if (i != 1 || this.f2160A) {
            return;
        }
        this.f2228z = false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0897L) && this.f2212r.mo1687f((C0897L) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null && abstractC0896K.mo1737d()) {
            return this.f2212r.mo1744j(this.f2197j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null && abstractC0896K.mo1737d()) {
            return this.f2212r.mo1693k(this.f2197j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null && abstractC0896K.mo1737d()) {
            return this.f2212r.mo1695l(this.f2197j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null && abstractC0896K.mo1740e()) {
            return this.f2212r.mo1745m(this.f2197j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null && abstractC0896K.mo1740e()) {
            return this.f2212r.mo1699n(this.f2197j0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null && abstractC0896K.mo1740e()) {
            return this.f2212r.mo1700o(this.f2197j0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public final void m1784d0(boolean z2) {
        if (this.f2226y < 1) {
            this.f2226y = 1;
        }
        if (!z2 && !this.f2160A) {
            this.f2228z = false;
        }
        if (this.f2226y == 1) {
            if (z2 && this.f2228z && !this.f2160A && this.f2212r != null && this.f2210q != null) {
                m1794o();
            }
            if (!this.f2160A) {
                this.f2228z = false;
            }
        }
        this.f2226y--;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().m753a(f2, f3, z2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().m754b(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m755c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m756d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        ArrayList arrayList = this.f2214s;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0893H) arrayList.get(i)).mo1984c(canvas, this);
        }
        EdgeEffect edgeEffect = this.f2170K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f2200l ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2170K;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f2171L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f2200l) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2171L;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f2172M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2200l ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2172M;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f2173N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2200l) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2173N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.f2174O == null || arrayList.size() <= 0 || !this.f2174O.mo2262f()) ? z2 : true) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* renamed from: e0 */
    public final void m1785e0(int i) {
        getScrollingChildHelper().m760h(i);
    }

    /* renamed from: f */
    public final void m1786f(AbstractC0912a0 abstractC0912a0) {
        View view = abstractC0912a0.f3654a;
        boolean z2 = view.getParent() == this;
        this.f2190g.m2309j(m1763H(view));
        if (abstractC0912a0.m2326k()) {
            this.f2196j.m1234g(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z2) {
            this.f2196j.m1233f(view, -1, true);
            return;
        }
        C0513t c0513t = this.f2196j;
        int iIndexOfChild = ((C0887B) c0513t.f1245b).f3571a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((C0915c) c0513t.f1246c).m2361h(iIndexOfChild);
            c0513t.m1248w(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View focusSearch(View view, int i) {
        View viewMo1674S;
        int i2;
        char c2;
        boolean z2;
        this.f2212r.getClass();
        boolean z3 = true;
        boolean z4 = (this.f2210q == null || this.f2212r == null || m1766L() || this.f2160A) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        C0908X c0908x = this.f2197j0;
        C0902Q c0902q = this.f2190g;
        if (!z4 || (i != 2 && i != 1)) {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z4) {
                m1792m();
                if (m1757A(view) == null) {
                    return null;
                }
                m1783c0();
                viewMo1674S = this.f2212r.mo1674S(view, i, c0902q, c0908x);
                m1784d0(false);
            } else {
                viewMo1674S = viewFindNextFocus;
            }
        } else if (this.f2212r.mo1740e()) {
            if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                z2 = true;
            }
            if (!z2) {
                if (focusFinder.findNextFocus(this, view, !((this.f2212r.m2276C() != 1) ^ (i != 2)) ? 66 : 17) != null) {
                }
            }
            if (z2) {
            }
            viewMo1674S = focusFinder.findNextFocus(this, view, i);
        } else {
            z2 = false;
            if (!z2 && this.f2212r.mo1737d()) {
                z2 = focusFinder.findNextFocus(this, view, !((this.f2212r.m2276C() != 1) ^ (i != 2)) ? 66 : 17) != null;
            }
            if (z2) {
                m1792m();
                if (m1757A(view) == null) {
                    return null;
                }
                m1783c0();
                this.f2212r.mo1674S(view, i, c0902q, c0908x);
                m1784d0(false);
            }
            viewMo1674S = focusFinder.findNextFocus(this, view, i);
        }
        if (viewMo1674S != null && !viewMo1674S.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            m1777W(viewMo1674S, null);
            return view;
        }
        if (viewMo1674S == null || viewMo1674S == this || m1757A(viewMo1674S) == null) {
            z3 = false;
        } else if (view != null && m1757A(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f2204n;
            rect.set(0, 0, width, height);
            int width2 = viewMo1674S.getWidth();
            int height2 = viewMo1674S.getHeight();
            Rect rect2 = this.f2206o;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewMo1674S, rect2);
            int i3 = this.f2212r.m2276C() == 1 ? -1 : 1;
            int i4 = rect.left;
            int i5 = rect2.left;
            if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                i2 = 1;
            } else {
                int i6 = rect.right;
                int i7 = rect2.right;
                i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                c2 = 1;
            } else {
                int i10 = rect.bottom;
                int i11 = rect2.bottom;
                c2 = ((i10 > i11 || i8 >= i11) && i8 > i9) ? (char) 65535 : (char) 0;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    throw new IllegalArgumentException("Invalid direction: " + i + m1804y());
                                }
                                if (c2 <= 0) {
                                }
                            } else if (i2 <= 0) {
                            }
                        } else if (c2 >= 0) {
                        }
                    } else if (i2 >= 0) {
                    }
                } else if (c2 <= 0 && (c2 != 0 || i2 * i3 < 0)) {
                }
            } else if (c2 >= 0 && (c2 != 0 || i2 * i3 > 0)) {
            }
        }
        return z3 ? viewMo1674S : super.focusSearch(view, i);
    }

    /* renamed from: g */
    public final void m1787g(AbstractC0893H abstractC0893H) {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null) {
            abstractC0896K.mo1735c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2214s;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0893H);
        m1768N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null) {
            return abstractC0896K.mo1702r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1804y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null) {
            return abstractC0896K.mo1704s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1804y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC0888C getAdapter() {
        return this.f2210q;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K == null) {
            return super.getBaseline();
        }
        abstractC0896K.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2200l;
    }

    public C0916c0 getCompatAccessibilityDelegate() {
        return this.f2211q0;
    }

    public C0891F getEdgeEffectFactory() {
        return this.f2169J;
    }

    public AbstractC0892G getItemAnimator() {
        return this.f2174O;
    }

    public int getItemDecorationCount() {
        return this.f2214s.size();
    }

    public AbstractC0896K getLayoutManager() {
        return this.f2212r;
    }

    public int getMaxFlingVelocity() {
        return this.f2185c0;
    }

    public int getMinFlingVelocity() {
        return this.f2184b0;
    }

    public long getNanoTime() {
        if (f2156C0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public AbstractC0898M getOnFlingListener() {
        return this.f2183a0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2189f0;
    }

    public C0901P getRecycledViewPool() {
        return this.f2190g.m2302c();
    }

    public int getScrollState() {
        return this.f2175P;
    }

    /* renamed from: h */
    public final void m1788h(AbstractC0899N abstractC0899N) {
        if (this.f2201l0 == null) {
            this.f2201l0 = new ArrayList();
        }
        this.f2201l0.add(abstractC0899N);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m758f(0);
    }

    /* renamed from: i */
    public final void m1789i(String str) {
        if (m1766L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + m1804y());
        }
        if (this.f2168I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + m1804y()));
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2220v;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f2160A;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f631d;
    }

    /* renamed from: k */
    public final void m1790k() {
        int iM1246u = this.f2196j.m1246u();
        for (int i = 0; i < iM1246u; i++) {
            AbstractC0912a0 abstractC0912a0M1751I = m1751I(this.f2196j.m1245t(i));
            if (!abstractC0912a0M1751I.m2331p()) {
                abstractC0912a0M1751I.f3657d = -1;
                abstractC0912a0M1751I.f3660g = -1;
            }
        }
        C0902Q c0902q = this.f2190g;
        ArrayList arrayList = c0902q.f3613c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0912a0 abstractC0912a0 = (AbstractC0912a0) arrayList.get(i2);
            abstractC0912a0.f3657d = -1;
            abstractC0912a0.f3660g = -1;
        }
        ArrayList arrayList2 = c0902q.f3611a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC0912a0 abstractC0912a02 = (AbstractC0912a0) arrayList2.get(i3);
            abstractC0912a02.f3657d = -1;
            abstractC0912a02.f3660g = -1;
        }
        ArrayList arrayList3 = c0902q.f3612b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AbstractC0912a0 abstractC0912a03 = (AbstractC0912a0) c0902q.f3612b.get(i4);
                abstractC0912a03.f3657d = -1;
                abstractC0912a03.f3660g = -1;
            }
        }
    }

    /* renamed from: l */
    public final void m1791l(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f2170K;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f2170K.onRelease();
            zIsFinished = this.f2170K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2172M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f2172M.onRelease();
            zIsFinished |= this.f2172M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2171L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f2171L.onRelease();
            zIsFinished |= this.f2171L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2173N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f2173N.onRelease();
            zIsFinished |= this.f2173N.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: m */
    public final void m1792m() {
        C0513t c0513t = this.f2196j;
        C0913b c0913b = this.f2194i;
        if (!this.f2224x || this.f2165F) {
            int i = AbstractC0126k.f327a;
            Trace.beginSection("RV FullInvalidate");
            m1794o();
            Trace.endSection();
            return;
        }
        if (c0913b.m2342j()) {
            int i2 = c0913b.f3672a;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (c0913b.m2342j()) {
                    int i3 = AbstractC0126k.f327a;
                    Trace.beginSection("RV FullInvalidate");
                    m1794o();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = AbstractC0126k.f327a;
            Trace.beginSection("RV PartialInvalidate");
            m1783c0();
            m1770P();
            c0913b.m2348p();
            if (!this.f2228z) {
                int iM1238m = c0513t.m1238m();
                int i5 = 0;
                while (true) {
                    if (i5 < iM1238m) {
                        AbstractC0912a0 abstractC0912a0M1751I = m1751I(c0513t.m1237l(i5));
                        if (abstractC0912a0M1751I != null && !abstractC0912a0M1751I.m2331p() && abstractC0912a0M1751I.m2327l()) {
                            m1794o();
                            break;
                        }
                        i5++;
                    } else {
                        c0913b.m2335c();
                        break;
                    }
                }
            }
            m1784d0(true);
            m1771Q(true);
            Trace.endSection();
        }
    }

    /* renamed from: n */
    public final void m1793n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        setMeasuredDimension(AbstractC0896K.m2272g(i, paddingRight, getMinimumWidth()), AbstractC0896K.m2272g(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03cd  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [j0.a0] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1794o() {
        ?? r10;
        View viewFindViewById;
        boolean z2;
        C0247q c0247q;
        int i;
        RecyclerView recyclerView;
        boolean zM2372g;
        if (this.f2210q == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f2212r == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        C0908X c0908x = this.f2197j0;
        c0908x.f3636i = false;
        if (c0908x.f3631d == 1) {
            m1795p();
            this.f2212r.m2290p0(this);
            m1796q();
        } else {
            C0913b c0913b = this.f2194i;
            if ((((ArrayList) c0913b.f3675d).isEmpty() || ((ArrayList) c0913b.f3674c).isEmpty()) && this.f2212r.f3599n == getWidth() && this.f2212r.f3600o == getHeight()) {
                this.f2212r.m2290p0(this);
            } else {
                this.f2212r.m2290p0(this);
                m1796q();
            }
        }
        c0908x.m2312a(4);
        m1783c0();
        m1770P();
        c0908x.f3631d = 1;
        boolean z3 = c0908x.f3637j;
        View view = null;
        Long l2 = null;
        C0902Q c0902q = this.f2190g;
        C0057j c0057j = this.f2198k;
        if (z3) {
            int iM1238m = this.f2196j.m1238m() - 1;
            while (iM1238m >= 0) {
                AbstractC0912a0 abstractC0912a0M1751I = m1751I(this.f2196j.m1237l(iM1238m));
                if (!abstractC0912a0M1751I.m2331p()) {
                    long jM1762G = m1762G(abstractC0912a0M1751I);
                    this.f2174O.getClass();
                    C0247q c0247q2 = new C0247q();
                    c0247q2.m782a(abstractC0912a0M1751I);
                    AbstractC0912a0 abstractC0912a0 = (AbstractC0912a0) ((C1250e) c0057j.f123h).m2959e(jM1762G, l2);
                    if (abstractC0912a0 == null || abstractC0912a0.m2331p()) {
                        c0057j.m266b(abstractC0912a0M1751I, c0247q2);
                    } else {
                        C1256k c1256k = (C1256k) c0057j.f122g;
                        C0932k0 c0932k0 = (C0932k0) c1256k.getOrDefault(abstractC0912a0, l2);
                        boolean z4 = (c0932k0 == null || (c0932k0.f3764a & 1) == 0) ? false : true;
                        C0932k0 c0932k02 = (C0932k0) c1256k.getOrDefault(abstractC0912a0M1751I, l2);
                        boolean z5 = (c0932k02 == null || (c0932k02.f3764a & 1) == 0) ? false : true;
                        if (z4 && abstractC0912a0 == abstractC0912a0M1751I) {
                            c0057j.m266b(abstractC0912a0M1751I, c0247q2);
                        } else {
                            C0247q c0247qM259I = c0057j.m259I(abstractC0912a0, 4);
                            c0057j.m266b(abstractC0912a0M1751I, c0247q2);
                            C0247q c0247qM259I2 = c0057j.m259I(abstractC0912a0M1751I, 8);
                            if (c0247qM259I == null) {
                                int iM1238m2 = this.f2196j.m1238m();
                                for (int i2 = 0; i2 < iM1238m2; i2++) {
                                    AbstractC0912a0 abstractC0912a0M1751I2 = m1751I(this.f2196j.m1237l(i2));
                                    if (abstractC0912a0M1751I2 != abstractC0912a0M1751I && m1762G(abstractC0912a0M1751I2) == jM1762G) {
                                        AbstractC0888C abstractC0888C = this.f2210q;
                                        if (abstractC0888C == null || !abstractC0888C.f3573b) {
                                            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + abstractC0912a0M1751I2 + " \n View Holder 2:" + abstractC0912a0M1751I + m1804y());
                                        }
                                        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + abstractC0912a0M1751I2 + " \n View Holder 2:" + abstractC0912a0M1751I + m1804y());
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC0912a0 + " cannot be found but it is necessary for " + abstractC0912a0M1751I + m1804y());
                            } else {
                                abstractC0912a0.m2330o(false);
                                if (z4) {
                                    m1786f(abstractC0912a0);
                                }
                                if (abstractC0912a0 != abstractC0912a0M1751I) {
                                    if (z5) {
                                        m1786f(abstractC0912a0M1751I);
                                    }
                                    abstractC0912a0.f3661h = abstractC0912a0M1751I;
                                    m1786f(abstractC0912a0);
                                    c0902q.m2309j(abstractC0912a0);
                                    abstractC0912a0M1751I.m2330o(false);
                                    abstractC0912a0M1751I.f3662i = abstractC0912a0;
                                }
                                if (this.f2174O.mo2258a(abstractC0912a0, abstractC0912a0M1751I, c0247qM259I, c0247qM259I2)) {
                                    m1773S();
                                }
                            }
                        }
                    }
                }
                iM1238m--;
                l2 = null;
            }
            C1256k c1256k2 = (C1256k) c0057j.f122g;
            for (int i3 = c1256k2.f5012c - 1; i3 >= 0; i3--) {
                AbstractC0912a0 abstractC0912a02 = (AbstractC0912a0) c1256k2.m2973h(i3);
                C0932k0 c0932k03 = (C0932k0) c1256k2.m2974i(i3);
                int i4 = c0932k03.f3764a;
                int i5 = i4 & 3;
                C0887B c0887b = this.f2227y0;
                if (i5 == 3) {
                    RecyclerView recyclerView2 = c0887b.f3571a;
                    recyclerView2.f2212r.m2286i0(abstractC0912a02.f3654a, recyclerView2.f2190g);
                } else if ((i4 & 1) != 0) {
                    C0247q c0247q3 = c0932k03.f3765b;
                    if (c0247q3 == null) {
                        RecyclerView recyclerView3 = c0887b.f3571a;
                        recyclerView3.f2212r.m2286i0(abstractC0912a02.f3654a, recyclerView3.f2190g);
                    } else {
                        c0887b.m2251g(abstractC0912a02, c0247q3, c0932k03.f3766c);
                    }
                } else if ((i4 & 14) == 14) {
                    c0887b.m2250f(abstractC0912a02, c0932k03.f3765b, c0932k03.f3766c);
                } else if ((i4 & 12) == 12) {
                    C0247q c0247q4 = c0932k03.f3765b;
                    C0247q c0247q5 = c0932k03.f3766c;
                    c0887b.getClass();
                    abstractC0912a02.m2330o(false);
                    RecyclerView recyclerView4 = c0887b.f3571a;
                    if (!recyclerView4.f2165F) {
                        C0929j c0929j = (C0929j) recyclerView4.f2174O;
                        c0929j.getClass();
                        int i6 = c0247q4.f645a;
                        int i7 = c0247q5.f645a;
                        if (i6 == i7 && c0247q4.f646b == c0247q5.f646b) {
                            c0929j.m2259c(abstractC0912a02);
                            recyclerView = recyclerView4;
                            zM2372g = false;
                        } else {
                            recyclerView = recyclerView4;
                            zM2372g = c0929j.m2372g(abstractC0912a02, i6, c0247q4.f646b, i7, c0247q5.f646b);
                        }
                        if (zM2372g) {
                            recyclerView.m1773S();
                        }
                    } else if (recyclerView4.f2174O.mo2258a(abstractC0912a02, abstractC0912a02, c0247q4, c0247q5)) {
                        recyclerView4.m1773S();
                    }
                } else {
                    if ((i4 & 4) != 0) {
                        c0247q = null;
                        c0887b.m2251g(abstractC0912a02, c0932k03.f3765b, null);
                    } else {
                        c0247q = null;
                        if ((i4 & 8) != 0) {
                            c0887b.m2250f(abstractC0912a02, c0932k03.f3765b, c0932k03.f3766c);
                        }
                    }
                    i = 0;
                    c0932k03.f3764a = i;
                    c0932k03.f3765b = c0247q;
                    c0932k03.f3766c = c0247q;
                    C0932k0.f3763d.mo584c(c0932k03);
                }
                i = 0;
                c0247q = null;
                c0932k03.f3764a = i;
                c0932k03.f3765b = c0247q;
                c0932k03.f3766c = c0247q;
                C0932k0.f3763d.mo584c(c0932k03);
            }
            view = null;
        }
        this.f2212r.m2285h0(c0902q);
        c0908x.f3629b = c0908x.f3632e;
        this.f2165F = false;
        this.f2166G = false;
        c0908x.f3637j = false;
        c0908x.f3638k = false;
        this.f2212r.f3591f = false;
        ArrayList arrayList = c0902q.f3612b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K.f3596k) {
            abstractC0896K.f3595j = 0;
            abstractC0896K.f3596k = false;
            c0902q.m2310k();
        }
        this.f2212r.mo1685c0(c0908x);
        m1771Q(true);
        m1784d0(false);
        ((C1256k) c0057j.f122g).clear();
        ((C1250e) c0057j.f123h).m2956b();
        int[] iArr = this.f2213r0;
        int i8 = iArr[0];
        int i9 = iArr[1];
        m1759C(iArr);
        if ((iArr[0] == i8 && iArr[1] == i9) ? false : true) {
            m1799t(0, 0);
        }
        if (this.f2189f0 && this.f2210q != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                if (((ArrayList) this.f2196j.f1247d).contains(getFocusedChild())) {
                    long j2 = c0908x.f3640m;
                    if (j2 != -1 && (z2 = this.f2210q.f3573b) && z2) {
                        int iM1246u = this.f2196j.m1246u();
                        r10 = view;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= iM1246u) {
                                break;
                            }
                            AbstractC0912a0 abstractC0912a0M1751I3 = m1751I(this.f2196j.m1245t(i10));
                            if (abstractC0912a0M1751I3 != null && !abstractC0912a0M1751I3.m2324i() && abstractC0912a0M1751I3.f3658e == j2) {
                                if (!((ArrayList) this.f2196j.f1247d).contains(abstractC0912a0M1751I3.f3654a)) {
                                    r10 = abstractC0912a0M1751I3;
                                    break;
                                }
                                r10 = abstractC0912a0M1751I3;
                            }
                            i10++;
                            r10 = r10;
                        }
                    } else {
                        r10 = view;
                    }
                    if (r10 != null) {
                        ArrayList arrayList2 = (ArrayList) this.f2196j.f1247d;
                        View view2 = r10.f3654a;
                        if (arrayList2.contains(view2) || !view2.hasFocusable()) {
                            if (this.f2196j.m1238m() > 0) {
                                int i11 = c0908x.f3639l;
                                if (i11 == -1) {
                                    i11 = 0;
                                }
                                int iM2313b = c0908x.m2313b();
                                for (int i12 = i11; i12 < iM2313b; i12++) {
                                    AbstractC0912a0 abstractC0912a0M1760E = m1760E(i12);
                                    if (abstractC0912a0M1760E == null) {
                                        break;
                                    }
                                    View view3 = abstractC0912a0M1760E.f3654a;
                                    if (view3.hasFocusable()) {
                                        view = view3;
                                        break;
                                    }
                                }
                                for (int iMin = Math.min(iM2313b, i11) - 1; iMin >= 0; iMin--) {
                                    AbstractC0912a0 abstractC0912a0M1760E2 = m1760E(iMin);
                                    if (abstractC0912a0M1760E2 == null) {
                                        break;
                                    }
                                    view2 = abstractC0912a0M1760E2.f3654a;
                                    if (view2.hasFocusable()) {
                                        view = view2;
                                        break;
                                    }
                                }
                            }
                            if (view != null) {
                                int i13 = c0908x.f3641n;
                                if (i13 != -1 && (viewFindViewById = view.findViewById(i13)) != null && viewFindViewById.isFocusable()) {
                                    view = viewFindViewById;
                                }
                                view.requestFocus();
                            }
                        } else {
                            view = view2;
                            if (view != null) {
                            }
                        }
                    }
                }
            }
        }
        c0908x.f3640m = -1L;
        c0908x.f3639l = -1;
        c0908x.f3641n = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f2167H = 0;
        this.f2220v = true;
        this.f2224x = this.f2224x && !isLayoutRequested();
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null) {
            abstractC0896K.f3592g = true;
            abstractC0896K.mo1878Q(this);
        }
        this.f2209p0 = false;
        if (f2156C0) {
            ThreadLocal threadLocal = RunnableC0937p.f3808e;
            RunnableC0937p runnableC0937p = (RunnableC0937p) threadLocal.get();
            this.f2193h0 = runnableC0937p;
            if (runnableC0937p == null) {
                RunnableC0937p runnableC0937p2 = new RunnableC0937p();
                runnableC0937p2.f3810a = new ArrayList();
                runnableC0937p2.f3813d = new ArrayList();
                this.f2193h0 = runnableC0937p2;
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                    RunnableC0937p runnableC0937p3 = this.f2193h0;
                    runnableC0937p3.f3812c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC0937p3);
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    RunnableC0937p runnableC0937p32 = this.f2193h0;
                    runnableC0937p32.f3812c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC0937p32);
                }
            }
            this.f2193h0.f3810a.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RunnableC0937p runnableC0937p;
        C0943v c0943v;
        super.onDetachedFromWindow();
        AbstractC0892G abstractC0892G = this.f2174O;
        if (abstractC0892G != null) {
            abstractC0892G.mo2261e();
        }
        setScrollState(0);
        RunnableC0910Z runnableC0910Z = this.f2191g0;
        runnableC0910Z.f3648g.removeCallbacks(runnableC0910Z);
        runnableC0910Z.f3644c.abortAnimation();
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null && (c0943v = abstractC0896K.f3590e) != null) {
            c0943v.m2402i();
        }
        this.f2220v = false;
        AbstractC0896K abstractC0896K2 = this.f2212r;
        if (abstractC0896K2 != null) {
            abstractC0896K2.f3592g = false;
            abstractC0896K2.mo1724R(this);
        }
        this.f2223w0.clear();
        removeCallbacks(this.f2225x0);
        this.f2198k.getClass();
        while (C0932k0.f3763d.mo582a() != null) {
        }
        if (!f2156C0 || (runnableC0937p = this.f2193h0) == null) {
            return;
        }
        runnableC0937p.f3810a.remove(this);
        this.f2193h0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2214s;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0893H) arrayList.get(i)).mo1890b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float axisValue;
        if (this.f2212r != null && !this.f2160A && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f2212r.mo1740e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f2212r.mo1737d() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f2 != 0.0f || axisValue != 0.0f) {
                    m1779Y((int) (axisValue * this.f2186d0), (int) (f2 * this.f2187e0), motionEvent);
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f2212r.mo1740e()) {
                    f2 = -axisValue2;
                    if (f2 != 0.0f) {
                        m1779Y((int) (axisValue * this.f2186d0), (int) (f2 * this.f2187e0), motionEvent);
                    }
                } else {
                    if (this.f2212r.mo1737d()) {
                        axisValue = axisValue2;
                        f2 = 0.0f;
                        if (f2 != 0.0f) {
                        }
                    }
                    f2 = 0.0f;
                    if (f2 != 0.0f) {
                    }
                }
            } else {
                f2 = 0.0f;
                if (f2 != 0.0f) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f2160A) {
            return false;
        }
        this.f2218u = null;
        if (m1758B(motionEvent)) {
            m1778X();
            setScrollState(0);
            return true;
        }
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K == null) {
            return false;
        }
        boolean zMo1737d = abstractC0896K.mo1737d();
        boolean zMo1740e = this.f2212r.mo1740e();
        if (this.f2177R == null) {
            this.f2177R = VelocityTracker.obtain();
        }
        this.f2177R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f2161B) {
                this.f2161B = false;
            }
            this.f2176Q = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f2180U = x2;
            this.f2178S = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f2181V = y2;
            this.f2179T = y2;
            if (this.f2175P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                m1785e0(1);
            }
            int[] iArr = this.f2219u0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zMo1737d;
            if (zMo1740e) {
                i = (zMo1737d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m759g(i, 0);
        } else if (actionMasked == 1) {
            this.f2177R.clear();
            m1785e0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f2176Q);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2176Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f2175P != 1) {
                int i2 = x3 - this.f2178S;
                int i3 = y3 - this.f2179T;
                if (zMo1737d == 0 || Math.abs(i2) <= this.f2182W) {
                    z2 = false;
                } else {
                    this.f2180U = x3;
                    z2 = true;
                }
                if (zMo1740e && Math.abs(i3) > this.f2182W) {
                    this.f2181V = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m1778X();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f2176Q = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2180U = x4;
            this.f2178S = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2181V = y4;
            this.f2179T = y4;
        } else if (actionMasked == 6) {
            m1772R(motionEvent);
        }
        return this.f2175P == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5 = AbstractC0126k.f327a;
        Trace.beginSection("RV OnLayout");
        m1794o();
        Trace.endSection();
        this.f2224x = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K == null) {
            m1793n(i, i2);
            return;
        }
        boolean zMo1718L = abstractC0896K.mo1718L();
        C0908X c0908x = this.f2197j0;
        if (zMo1718L) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f2212r.f3587b.m1793n(i, i2);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f2210q == null) {
                return;
            }
            if (c0908x.f3631d == 1) {
                m1795p();
            }
            this.f2212r.m2291q0(i, i2);
            c0908x.f3636i = true;
            m1796q();
            this.f2212r.m2292s0(i, i2);
            if (this.f2212r.mo1748v0()) {
                this.f2212r.m2291q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                c0908x.f3636i = true;
                m1796q();
                this.f2212r.m2292s0(i, i2);
                return;
            }
            return;
        }
        if (this.f2222w) {
            this.f2212r.f3587b.m1793n(i, i2);
            return;
        }
        if (this.f2163D) {
            m1783c0();
            m1770P();
            m1774T();
            m1771Q(true);
            if (c0908x.f3638k) {
                c0908x.f3634g = true;
            } else {
                this.f2194i.m2336d();
                c0908x.f3634g = false;
            }
            this.f2163D = false;
            m1784d0(false);
        } else if (c0908x.f3638k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC0888C abstractC0888C = this.f2210q;
        if (abstractC0888C != null) {
            c0908x.f3632e = abstractC0888C.mo1905a();
        } else {
            c0908x.f3632e = 0;
        }
        m1783c0();
        this.f2212r.f3587b.m1793n(i, i2);
        m1784d0(false);
        c0908x.f3634g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (m1766L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0905U)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0905U c0905u = (C0905U) parcelable;
        this.f2192h = c0905u;
        super.onRestoreInstanceState(c0905u.f1033a);
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K == null || (parcelable2 = this.f2192h.f3620c) == null) {
            return;
        }
        abstractC0896K.mo1738d0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0905U c0905u = new C0905U(super.onSaveInstanceState());
        C0905U c0905u2 = this.f2192h;
        if (c0905u2 != null) {
            c0905u.f3620c = c0905u2.f3620c;
        } else {
            AbstractC0896K abstractC0896K = this.f2212r;
            if (abstractC0896K != null) {
                c0905u.f3620c = abstractC0896K.mo1741e0();
            } else {
                c0905u.f3620c = null;
            }
        }
        return c0905u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f2173N = null;
        this.f2171L = null;
        this.f2172M = null;
        this.f2170K = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fa A[PHI: r0
      0x01fa: PHI (r0v49 int) = (r0v36 int), (r0v53 int) binds: [B:90:0x01e3, B:94:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fd  */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zM1758B;
        RecyclerView recyclerView;
        MotionEvent motionEvent2;
        MotionEvent motionEvent3;
        MotionEvent motionEvent4;
        RecyclerView recyclerView2;
        int minFlingVelocity;
        boolean z2;
        int iM2268H;
        PointF pointFMo1733a;
        boolean z3;
        if (this.f2160A || this.f2161B) {
            return false;
        }
        C0934m c0934m = this.f2218u;
        if (c0934m == null) {
            zM1758B = motionEvent.getAction() == 0 ? false : m1758B(motionEvent);
        } else {
            if (c0934m.f3794v != 0) {
                if (motionEvent.getAction() == 0) {
                    boolean zM2381e = c0934m.m2381e(motionEvent.getX(), motionEvent.getY());
                    boolean zM2380d = c0934m.m2380d(motionEvent.getX(), motionEvent.getY());
                    if (zM2381e || zM2380d) {
                        if (zM2380d) {
                            c0934m.f3795w = 1;
                            c0934m.f3788p = (int) motionEvent.getX();
                        } else if (zM2381e) {
                            c0934m.f3795w = 2;
                            c0934m.f3785m = (int) motionEvent.getY();
                        }
                        c0934m.m2382g(2);
                    }
                } else if (motionEvent.getAction() == 1 && c0934m.f3794v == 2) {
                    c0934m.f3785m = 0.0f;
                    c0934m.f3788p = 0.0f;
                    c0934m.m2382g(1);
                    c0934m.f3795w = 0;
                } else if (motionEvent.getAction() == 2 && c0934m.f3794v == 2) {
                    c0934m.m2383h();
                    int i = c0934m.f3795w;
                    int i2 = c0934m.f3774b;
                    if (i == 1) {
                        float x2 = motionEvent.getX();
                        int[] iArr = c0934m.f3797y;
                        iArr[0] = i2;
                        int i3 = c0934m.f3789q - i2;
                        iArr[1] = i3;
                        float fMax = Math.max(i2, Math.min(i3, x2));
                        if (Math.abs(c0934m.f3787o - fMax) >= 2.0f) {
                            int iM2379f = C0934m.m2379f(c0934m.f3788p, fMax, iArr, c0934m.f3791s.computeHorizontalScrollRange(), c0934m.f3791s.computeHorizontalScrollOffset(), c0934m.f3789q);
                            if (iM2379f != 0) {
                                c0934m.f3791s.scrollBy(iM2379f, 0);
                            }
                            c0934m.f3788p = fMax;
                        }
                    }
                    if (c0934m.f3795w == 2) {
                        float y2 = motionEvent.getY();
                        int[] iArr2 = c0934m.f3796x;
                        iArr2[0] = i2;
                        int i4 = c0934m.f3790r - i2;
                        iArr2[1] = i4;
                        float fMax2 = Math.max(i2, Math.min(i4, y2));
                        if (Math.abs(c0934m.f3784l - fMax2) >= 2.0f) {
                            int iM2379f2 = C0934m.m2379f(c0934m.f3785m, fMax2, iArr2, c0934m.f3791s.computeVerticalScrollRange(), c0934m.f3791s.computeVerticalScrollOffset(), c0934m.f3790r);
                            if (iM2379f2 != 0) {
                                c0934m.f3791s.scrollBy(0, iM2379f2);
                            }
                            c0934m.f3785m = fMax2;
                        }
                    }
                }
            }
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f2218u = null;
            }
            zM1758B = true;
        }
        if (zM1758B) {
            m1778X();
            setScrollState(0);
            return true;
        }
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K == null) {
            return false;
        }
        boolean zMo1737d = abstractC0896K.mo1737d();
        boolean zMo1740e = this.f2212r.mo1740e();
        if (this.f2177R == null) {
            this.f2177R = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int[] iArr3 = this.f2219u0;
        if (actionMasked == 0) {
            iArr3[1] = 0;
            iArr3[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(iArr3[0], iArr3[1]);
        if (actionMasked == 0) {
            recyclerView = this;
            motionEvent2 = motionEventObtain;
            recyclerView.f2176Q = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            recyclerView.f2180U = x3;
            recyclerView.f2178S = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            recyclerView.f2181V = y3;
            recyclerView.f2179T = y3;
            int i5 = zMo1737d;
            if (zMo1740e) {
                i5 = (zMo1737d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().m759g(i5, 0);
        } else {
            if (actionMasked == 1) {
                this.f2177R.addMovement(motionEventObtain);
                VelocityTracker velocityTracker = this.f2177R;
                int i6 = this.f2185c0;
                velocityTracker.computeCurrentVelocity(1000, i6);
                float f2 = zMo1737d != 0 ? -this.f2177R.getXVelocity(this.f2176Q) : 0.0f;
                float f3 = zMo1740e ? -this.f2177R.getYVelocity(this.f2176Q) : 0.0f;
                if (f2 == 0.0f && f3 == 0.0f) {
                    recyclerView2 = this;
                    motionEvent4 = motionEventObtain;
                    recyclerView2.setScrollState(0);
                    m1778X();
                    motionEvent3 = motionEvent4;
                } else {
                    int i7 = (int) f2;
                    int i8 = (int) f3;
                    AbstractC0896K abstractC0896K2 = this.f2212r;
                    if (abstractC0896K2 == null) {
                        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else if (!this.f2160A) {
                        int iMo1737d = abstractC0896K2.mo1737d();
                        boolean zMo1740e2 = this.f2212r.mo1740e();
                        int i9 = this.f2184b0;
                        if (iMo1737d == 0 || Math.abs(i7) < i9) {
                            i7 = 0;
                        }
                        if (!zMo1740e2 || Math.abs(i8) < i9) {
                            i8 = 0;
                        }
                        if (i7 != 0 || i8 != 0) {
                            float f4 = i7;
                            float f5 = i8;
                            if (!dispatchNestedPreFling(f4, f5)) {
                                boolean z4 = iMo1737d != 0 || zMo1740e2;
                                dispatchNestedFling(f4, f5, z4);
                                AbstractC0898M abstractC0898M = this.f2183a0;
                                if (abstractC0898M != null) {
                                    C0947z c0947z = (C0947z) abstractC0898M;
                                    AbstractC0896K layoutManager = c0947z.f3865a.getLayoutManager();
                                    if (layoutManager != 0 && c0947z.f3865a.getAdapter() != null && ((Math.abs(i8) > (minFlingVelocity = c0947z.f3865a.getMinFlingVelocity()) || Math.abs(i7) > minFlingVelocity) && ((z2 = layoutManager instanceof InterfaceC0907W)))) {
                                        C0946y c0946y = !z2 ? null : new C0946y(c0947z, c0947z.f3865a.getContext(), 0);
                                        if (c0946y == null) {
                                            motionEvent4 = motionEventObtain;
                                        } else {
                                            int iM2275B = layoutManager.m2275B();
                                            if (iM2275B != 0) {
                                                AbstractC0552g abstractC0552gM2413e = layoutManager.mo1740e() ? c0947z.m2413e(layoutManager) : layoutManager.mo1737d() ? c0947z.m2412d(layoutManager) : null;
                                                if (abstractC0552gM2413e == null) {
                                                    motionEvent4 = motionEventObtain;
                                                } else {
                                                    int iM2296v = layoutManager.m2296v();
                                                    motionEvent4 = motionEventObtain;
                                                    int i10 = 0;
                                                    int i11 = Integer.MIN_VALUE;
                                                    int i12 = Integer.MAX_VALUE;
                                                    View view = null;
                                                    View view2 = null;
                                                    while (i10 < iM2296v) {
                                                        int i13 = iM2296v;
                                                        View viewM2294u = layoutManager.m2294u(i10);
                                                        if (viewM2294u != null) {
                                                            int iM2409b = C0947z.m2409b(viewM2294u, abstractC0552gM2413e);
                                                            if (iM2409b <= 0 && iM2409b > i11) {
                                                                i11 = iM2409b;
                                                                view2 = viewM2294u;
                                                            }
                                                            if (iM2409b >= 0 && iM2409b < i12) {
                                                                i12 = iM2409b;
                                                                view = viewM2294u;
                                                            }
                                                        }
                                                        i10++;
                                                        iM2296v = i13;
                                                    }
                                                    boolean z5 = !layoutManager.mo1737d() ? i8 <= 0 : i7 <= 0;
                                                    if (z5 && view != null) {
                                                        iM2268H = AbstractC0896K.m2268H(view);
                                                    } else if (z5 || view2 == null) {
                                                        if (z5) {
                                                            view = view2;
                                                        }
                                                        if (view != null) {
                                                            int iM2268H2 = ((z2 && (pointFMo1733a = ((InterfaceC0907W) layoutManager).mo1733a(layoutManager.m2275B() - 1)) != null && ((pointFMo1733a.x > 0.0f ? 1 : (pointFMo1733a.x == 0.0f ? 0 : -1)) < 0 || (pointFMo1733a.y > 0.0f ? 1 : (pointFMo1733a.y == 0.0f ? 0 : -1)) < 0)) == z5 ? -1 : 1) + AbstractC0896K.m2268H(view);
                                                            if (iM2268H2 >= 0 && iM2268H2 < iM2275B) {
                                                                iM2268H = iM2268H2;
                                                            }
                                                        }
                                                    } else {
                                                        iM2268H = AbstractC0896K.m2268H(view2);
                                                    }
                                                    if (iM2268H == -1) {
                                                        c0946y.f3845a = iM2268H;
                                                        layoutManager.m2298y0(c0946y);
                                                    }
                                                    m1778X();
                                                    motionEvent3 = motionEvent4;
                                                }
                                                iM2268H = -1;
                                                if (iM2268H == -1) {
                                                }
                                                m1778X();
                                                motionEvent3 = motionEvent4;
                                            }
                                        }
                                        if (z4) {
                                            if (zMo1740e2) {
                                                iMo1737d = (iMo1737d == true ? 1 : 0) | 2;
                                            }
                                            getScrollingChildHelper().m759g(iMo1737d, 1);
                                            int i14 = -i6;
                                            int iMax = Math.max(i14, Math.min(i7, i6));
                                            int iMax2 = Math.max(i14, Math.min(i8, i6));
                                            RunnableC0910Z runnableC0910Z = this.f2191g0;
                                            RecyclerView recyclerView3 = runnableC0910Z.f3648g;
                                            recyclerView3.setScrollState(2);
                                            runnableC0910Z.f3643b = 0;
                                            runnableC0910Z.f3642a = 0;
                                            Interpolator interpolator = runnableC0910Z.f3645d;
                                            InterpolatorC0420d interpolatorC0420d = f2158E0;
                                            if (interpolator != interpolatorC0420d) {
                                                runnableC0910Z.f3645d = interpolatorC0420d;
                                                runnableC0910Z.f3644c = new OverScroller(recyclerView3.getContext(), interpolatorC0420d);
                                            }
                                            runnableC0910Z.f3644c.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                            runnableC0910Z.m2314a();
                                            m1778X();
                                            motionEvent3 = motionEvent4;
                                        } else {
                                            recyclerView2 = this;
                                        }
                                    }
                                }
                            }
                            recyclerView2.setScrollState(0);
                            m1778X();
                            motionEvent3 = motionEvent4;
                        }
                    }
                    recyclerView2 = this;
                    motionEvent4 = motionEventObtain;
                    recyclerView2.setScrollState(0);
                    m1778X();
                    motionEvent3 = motionEvent4;
                }
                motionEvent3.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2176Q);
                if (iFindPointerIndex < 0) {
                    Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2176Q + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                int x4 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y4 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax3 = this.f2180U - x4;
                int iMax4 = this.f2181V - y4;
                if (this.f2175P != 1) {
                    if (zMo1737d == 0) {
                        z3 = false;
                        if (zMo1740e) {
                            iMax4 = iMax4 > 0 ? Math.max(0, iMax4 - this.f2182W) : Math.min(0, iMax4 + this.f2182W);
                            if (iMax4 != 0) {
                                z3 = true;
                            }
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    } else {
                        iMax3 = iMax3 > 0 ? Math.max(0, iMax3 - this.f2182W) : Math.min(0, iMax3 + this.f2182W);
                        if (iMax3 != 0) {
                            z3 = true;
                        }
                        if (zMo1740e) {
                        }
                        if (z3) {
                        }
                    }
                    motionEvent3.recycle();
                    return true;
                }
                int i15 = iMax3;
                int i16 = iMax4;
                if (this.f2175P == 1) {
                    int[] iArr4 = this.f2221v0;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    boolean zM1797r = m1797r(zMo1737d != 0 ? i15 : 0, zMo1740e ? i16 : 0, iArr4, this.f2217t0, 0);
                    int[] iArr5 = this.f2217t0;
                    if (zM1797r) {
                        i15 -= iArr4[0];
                        i16 -= iArr4[1];
                        iArr3[0] = iArr3[0] + iArr5[0];
                        iArr3[1] = iArr3[1] + iArr5[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i17 = i15;
                    int i18 = i16;
                    this.f2180U = x4 - iArr5[0];
                    this.f2181V = y4 - iArr5[1];
                    if (m1779Y(zMo1737d != 0 ? i17 : 0, zMo1740e ? i18 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC0937p runnableC0937p = this.f2193h0;
                    if (runnableC0937p != null && (i17 != 0 || i18 != 0)) {
                        runnableC0937p.m2387a(this, i17, i18);
                    }
                }
            } else if (actionMasked == 3) {
                m1778X();
                setScrollState(0);
            } else if (actionMasked == 5) {
                this.f2176Q = motionEvent.getPointerId(actionIndex);
                int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.f2180U = x5;
                this.f2178S = x5;
                int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.f2181V = y5;
                this.f2179T = y5;
            } else if (actionMasked == 6) {
                m1772R(motionEvent);
            }
            recyclerView = this;
            motionEvent2 = motionEventObtain;
        }
        motionEvent3 = motionEvent2;
        recyclerView.f2177R.addMovement(motionEvent3);
        motionEvent3.recycle();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1795p() {
        View viewM1757A;
        int iM1761F;
        C0932k0 c0932k0;
        C0908X c0908x = this.f2197j0;
        c0908x.m2312a(1);
        m1805z(c0908x);
        c0908x.f3636i = false;
        m1783c0();
        C0057j c0057j = this.f2198k;
        ((C1256k) c0057j.f122g).clear();
        C1250e c1250e = (C1250e) c0057j.f123h;
        c1250e.m2956b();
        m1770P();
        m1774T();
        View focusedChild = (this.f2189f0 && hasFocus() && this.f2210q != null) ? getFocusedChild() : null;
        AbstractC0912a0 abstractC0912a0M1763H = (focusedChild == null || (viewM1757A = m1757A(focusedChild)) == null) ? null : m1763H(viewM1757A);
        if (abstractC0912a0M1763H == null) {
            c0908x.f3640m = -1L;
            c0908x.f3639l = -1;
            c0908x.f3641n = -1;
        } else {
            c0908x.f3640m = this.f2210q.f3573b ? abstractC0912a0M1763H.f3658e : -1L;
            if (!this.f2165F) {
                if (abstractC0912a0M1763H.m2324i()) {
                    iM1761F = abstractC0912a0M1763H.f3657d;
                } else {
                    RecyclerView recyclerView = abstractC0912a0M1763H.f3671r;
                    iM1761F = recyclerView == null ? -1 : recyclerView.m1761F(abstractC0912a0M1763H);
                }
                c0908x.f3639l = iM1761F;
                View focusedChild2 = abstractC0912a0M1763H.f3654a;
                int id = focusedChild2.getId();
                while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                    focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                    if (focusedChild2.getId() != -1) {
                        id = focusedChild2.getId();
                    }
                }
                c0908x.f3641n = id;
            }
        }
        c0908x.f3635h = c0908x.f3637j && this.f2205n0;
        this.f2205n0 = false;
        this.f2203m0 = false;
        c0908x.f3634g = c0908x.f3638k;
        c0908x.f3632e = this.f2210q.mo1905a();
        m1759C(this.f2213r0);
        boolean z2 = c0908x.f3637j;
        C1256k c1256k = (C1256k) c0057j.f122g;
        if (z2) {
            int iM1238m = this.f2196j.m1238m();
            for (int i = 0; i < iM1238m; i++) {
                AbstractC0912a0 abstractC0912a0M1751I = m1751I(this.f2196j.m1237l(i));
                if (!abstractC0912a0M1751I.m2331p() && (!abstractC0912a0M1751I.m2322g() || this.f2210q.f3573b)) {
                    AbstractC0892G abstractC0892G = this.f2174O;
                    AbstractC0892G.m2257b(abstractC0912a0M1751I);
                    abstractC0912a0M1751I.m2318c();
                    abstractC0892G.getClass();
                    C0247q c0247q = new C0247q();
                    c0247q.m782a(abstractC0912a0M1751I);
                    C0932k0 c0932k0M2378a = (C0932k0) c1256k.getOrDefault(abstractC0912a0M1751I, null);
                    if (c0932k0M2378a == null) {
                        c0932k0M2378a = C0932k0.m2378a();
                        c1256k.put(abstractC0912a0M1751I, c0932k0M2378a);
                    }
                    c0932k0M2378a.f3765b = c0247q;
                    c0932k0M2378a.f3764a |= 4;
                    if (c0908x.f3635h && abstractC0912a0M1751I.m2327l() && !abstractC0912a0M1751I.m2324i() && !abstractC0912a0M1751I.m2331p() && !abstractC0912a0M1751I.m2322g()) {
                        c1250e.m2960f(m1762G(abstractC0912a0M1751I), abstractC0912a0M1751I);
                    }
                }
            }
        }
        if (c0908x.f3638k) {
            int iM1246u = this.f2196j.m1246u();
            for (int i2 = 0; i2 < iM1246u; i2++) {
                AbstractC0912a0 abstractC0912a0M1751I2 = m1751I(this.f2196j.m1245t(i2));
                if (!abstractC0912a0M1751I2.m2331p() && abstractC0912a0M1751I2.f3657d == -1) {
                    abstractC0912a0M1751I2.f3657d = abstractC0912a0M1751I2.f3656c;
                }
            }
            boolean z3 = c0908x.f3633f;
            c0908x.f3633f = false;
            this.f2212r.mo1684b0(this.f2190g, c0908x);
            c0908x.f3633f = z3;
            for (int i3 = 0; i3 < this.f2196j.m1238m(); i3++) {
                AbstractC0912a0 abstractC0912a0M1751I3 = m1751I(this.f2196j.m1237l(i3));
                if (!abstractC0912a0M1751I3.m2331p() && ((c0932k0 = (C0932k0) c1256k.getOrDefault(abstractC0912a0M1751I3, null)) == null || (c0932k0.f3764a & 4) == 0)) {
                    AbstractC0892G.m2257b(abstractC0912a0M1751I3);
                    boolean zM2319d = abstractC0912a0M1751I3.m2319d(8192);
                    AbstractC0892G abstractC0892G2 = this.f2174O;
                    abstractC0912a0M1751I3.m2318c();
                    abstractC0892G2.getClass();
                    C0247q c0247q2 = new C0247q();
                    c0247q2.m782a(abstractC0912a0M1751I3);
                    if (zM2319d) {
                        m1776V(abstractC0912a0M1751I3, c0247q2);
                    } else {
                        C0932k0 c0932k0M2378a2 = (C0932k0) c1256k.getOrDefault(abstractC0912a0M1751I3, null);
                        if (c0932k0M2378a2 == null) {
                            c0932k0M2378a2 = C0932k0.m2378a();
                            c1256k.put(abstractC0912a0M1751I3, c0932k0M2378a2);
                        }
                        c0932k0M2378a2.f3764a |= 2;
                        c0932k0M2378a2.f3765b = c0247q2;
                    }
                }
            }
            m1790k();
        } else {
            m1790k();
        }
        m1771Q(true);
        m1784d0(false);
        c0908x.f3631d = 2;
    }

    /* renamed from: q */
    public final void m1796q() {
        m1783c0();
        m1770P();
        C0908X c0908x = this.f2197j0;
        c0908x.m2312a(6);
        this.f2194i.m2336d();
        c0908x.f3632e = this.f2210q.mo1905a();
        c0908x.f3630c = 0;
        c0908x.f3634g = false;
        this.f2212r.mo1684b0(this.f2190g, c0908x);
        c0908x.f3633f = false;
        this.f2192h = null;
        c0908x.f3637j = c0908x.f3637j && this.f2174O != null;
        c0908x.f3631d = 4;
        m1771Q(true);
        m1784d0(false);
    }

    /* renamed from: r */
    public final boolean m1797r(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m755c(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z2) {
        AbstractC0912a0 abstractC0912a0M1751I = m1751I(view);
        if (abstractC0912a0M1751I != null) {
            if (abstractC0912a0M1751I.m2326k()) {
                abstractC0912a0M1751I.f3663j &= -257;
            } else if (!abstractC0912a0M1751I.m2331p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC0912a0M1751I + m1804y());
            }
        }
        view.clearAnimation();
        m1751I(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0943v c0943v = this.f2212r.f3590e;
        if ((c0943v == null || !c0943v.f3849e) && !m1766L() && view2 != null) {
            m1777W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f2212r.mo1879k0(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f2216t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0934m) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2226y != 0 || this.f2160A) {
            this.f2228z = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void m1798s(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m756d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2160A) {
            return;
        }
        boolean zMo1737d = abstractC0896K.mo1737d();
        boolean zMo1740e = this.f2212r.mo1740e();
        if (zMo1737d || zMo1740e) {
            if (!zMo1737d) {
                i = 0;
            }
            if (!zMo1740e) {
                i2 = 0;
            }
            m1779Y(i, i2, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!m1766L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2162C |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0916c0 c0916c0) {
        this.f2211q0 = c0916c0;
        AbstractC0206Q.m681p(this, c0916c0);
    }

    public void setAdapter(AbstractC0888C abstractC0888C) {
        setLayoutFrozen(false);
        AbstractC0888C abstractC0888C2 = this.f2210q;
        C0904T c0904t = this.f2188f;
        if (abstractC0888C2 != null) {
            abstractC0888C2.f3572a.unregisterObserver(c0904t);
            this.f2210q.getClass();
        }
        AbstractC0892G abstractC0892G = this.f2174O;
        if (abstractC0892G != null) {
            abstractC0892G.mo2261e();
        }
        AbstractC0896K abstractC0896K = this.f2212r;
        C0902Q c0902q = this.f2190g;
        if (abstractC0896K != null) {
            abstractC0896K.m2284g0(c0902q);
            this.f2212r.m2285h0(c0902q);
        }
        c0902q.f3611a.clear();
        c0902q.m2303d();
        C0913b c0913b = this.f2194i;
        c0913b.m2349q((ArrayList) c0913b.f3674c);
        c0913b.m2349q((ArrayList) c0913b.f3675d);
        c0913b.f3672a = 0;
        AbstractC0888C abstractC0888C3 = this.f2210q;
        this.f2210q = abstractC0888C;
        if (abstractC0888C != null) {
            abstractC0888C.f3572a.registerObserver(c0904t);
        }
        AbstractC0888C abstractC0888C4 = this.f2210q;
        c0902q.f3611a.clear();
        c0902q.m2303d();
        C0901P c0901pM2302c = c0902q.m2302c();
        if (abstractC0888C3 != null) {
            c0901pM2302c.f3610b--;
        }
        if (c0901pM2302c.f3610b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c0901pM2302c.f3609a;
                if (i >= sparseArray.size()) {
                    break;
                }
                ((C0900O) sparseArray.valueAt(i)).f3605a.clear();
                i++;
            }
        }
        if (abstractC0888C4 != null) {
            c0901pM2302c.f3610b++;
        }
        this.f2197j0.f3633f = true;
        m1775U(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0890E interfaceC0890E) {
        if (interfaceC0890E == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f2200l) {
            this.f2173N = null;
            this.f2171L = null;
            this.f2172M = null;
            this.f2170K = null;
        }
        this.f2200l = z2;
        super.setClipToPadding(z2);
        if (this.f2224x) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0891F c0891f) {
        c0891f.getClass();
        this.f2169J = c0891f;
        this.f2173N = null;
        this.f2171L = null;
        this.f2172M = null;
        this.f2170K = null;
    }

    public void setHasFixedSize(boolean z2) {
        this.f2222w = z2;
    }

    public void setItemAnimator(AbstractC0892G abstractC0892G) {
        AbstractC0892G abstractC0892G2 = this.f2174O;
        if (abstractC0892G2 != null) {
            abstractC0892G2.mo2261e();
            this.f2174O.f3574a = null;
        }
        this.f2174O = abstractC0892G;
        if (abstractC0892G != null) {
            abstractC0892G.f3574a = this.f2207o0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C0902Q c0902q = this.f2190g;
        c0902q.f3615e = i;
        c0902q.m2310k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(AbstractC0896K abstractC0896K) {
        RecyclerView recyclerView;
        C0943v c0943v;
        if (abstractC0896K == this.f2212r) {
            return;
        }
        setScrollState(0);
        RunnableC0910Z runnableC0910Z = this.f2191g0;
        runnableC0910Z.f3648g.removeCallbacks(runnableC0910Z);
        runnableC0910Z.f3644c.abortAnimation();
        AbstractC0896K abstractC0896K2 = this.f2212r;
        if (abstractC0896K2 != null && (c0943v = abstractC0896K2.f3590e) != null) {
            c0943v.m2402i();
        }
        AbstractC0896K abstractC0896K3 = this.f2212r;
        C0902Q c0902q = this.f2190g;
        if (abstractC0896K3 != null) {
            AbstractC0892G abstractC0892G = this.f2174O;
            if (abstractC0892G != null) {
                abstractC0892G.mo2261e();
            }
            this.f2212r.m2284g0(c0902q);
            this.f2212r.m2285h0(c0902q);
            c0902q.f3611a.clear();
            c0902q.m2303d();
            if (this.f2220v) {
                AbstractC0896K abstractC0896K4 = this.f2212r;
                abstractC0896K4.f3592g = false;
                abstractC0896K4.mo1724R(this);
            }
            this.f2212r.m2293t0(null);
            this.f2212r = null;
        } else {
            c0902q.f3611a.clear();
            c0902q.m2303d();
        }
        C0513t c0513t = this.f2196j;
        ((C0915c) c0513t.f1246c).m2360g();
        ArrayList arrayList = (ArrayList) c0513t.f1247d;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = ((C0887B) c0513t.f1245b).f3571a;
            if (size < 0) {
                break;
            }
            AbstractC0912a0 abstractC0912a0M1751I = m1751I((View) arrayList.get(size));
            if (abstractC0912a0M1751I != null) {
                int i = abstractC0912a0M1751I.f3669p;
                if (recyclerView.m1766L()) {
                    abstractC0912a0M1751I.f3670q = i;
                    recyclerView.f2223w0.add(abstractC0912a0M1751I);
                } else {
                    WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                    abstractC0912a0M1751I.f3654a.setImportantForAccessibility(i);
                }
                abstractC0912a0M1751I.f3669p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            m1751I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2212r = abstractC0896K;
        if (abstractC0896K != null) {
            if (abstractC0896K.f3587b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0896K + " is already attached to a RecyclerView:" + abstractC0896K.f3587b.m1804y());
            }
            abstractC0896K.m2293t0(this);
            if (this.f2220v) {
                AbstractC0896K abstractC0896K5 = this.f2212r;
                abstractC0896K5.f3592g = true;
                abstractC0896K5.mo1878Q(this);
            }
        }
        c0902q.m2310k();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0241n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f631d) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            AbstractC0195F.m620z(scrollingChildHelper.f630c);
        }
        scrollingChildHelper.f631d = z2;
    }

    public void setOnFlingListener(AbstractC0898M abstractC0898M) {
        this.f2183a0 = abstractC0898M;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0899N abstractC0899N) {
        this.f2199k0 = abstractC0899N;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f2189f0 = z2;
    }

    public void setRecycledViewPool(C0901P c0901p) {
        C0902Q c0902q = this.f2190g;
        if (c0902q.f3617g != null) {
            r1.f3610b--;
        }
        c0902q.f3617g = c0901p;
        if (c0901p == null || c0902q.f3618h.getAdapter() == null) {
            return;
        }
        c0902q.f3617g.f3610b++;
    }

    public void setScrollState(int i) {
        C0943v c0943v;
        if (i == this.f2175P) {
            return;
        }
        this.f2175P = i;
        if (i != 2) {
            RunnableC0910Z runnableC0910Z = this.f2191g0;
            runnableC0910Z.f3648g.removeCallbacks(runnableC0910Z);
            runnableC0910Z.f3644c.abortAnimation();
            AbstractC0896K abstractC0896K = this.f2212r;
            if (abstractC0896K != null && (c0943v = abstractC0896K.f3590e) != null) {
                c0943v.m2402i();
            }
        }
        AbstractC0896K abstractC0896K2 = this.f2212r;
        if (abstractC0896K2 != null) {
            abstractC0896K2.mo1838f0(i);
        }
        AbstractC0899N abstractC0899N = this.f2199k0;
        if (abstractC0899N != null) {
            abstractC0899N.mo1891a(this, i);
        }
        ArrayList arrayList = this.f2201l0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0899N) this.f2201l0.get(size)).mo1891a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f2182W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f2182W = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0909Y abstractC0909Y) {
        this.f2190g.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m759g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().m760h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        C0943v c0943v;
        if (z2 != this.f2160A) {
            m1789i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f2160A = false;
                if (this.f2228z && this.f2212r != null && this.f2210q != null) {
                    requestLayout();
                }
                this.f2228z = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2160A = true;
            this.f2161B = true;
            setScrollState(0);
            RunnableC0910Z runnableC0910Z = this.f2191g0;
            runnableC0910Z.f3648g.removeCallbacks(runnableC0910Z);
            runnableC0910Z.f3644c.abortAnimation();
            AbstractC0896K abstractC0896K = this.f2212r;
            if (abstractC0896K == null || (c0943v = abstractC0896K.f3590e) == null) {
                return;
            }
            c0943v.m2402i();
        }
    }

    /* renamed from: t */
    public final void m1799t(int i, int i2) {
        this.f2168I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        AbstractC0899N abstractC0899N = this.f2199k0;
        if (abstractC0899N != null) {
            abstractC0899N.mo1892b(this, i, i2);
        }
        ArrayList arrayList = this.f2201l0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0899N) this.f2201l0.get(size)).mo1892b(this, i, i2);
            }
        }
        this.f2168I--;
    }

    /* renamed from: u */
    public final void m1800u() {
        if (this.f2173N != null) {
            return;
        }
        this.f2169J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2173N = edgeEffect;
        if (this.f2200l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: v */
    public final void m1801v() {
        if (this.f2170K != null) {
            return;
        }
        this.f2169J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2170K = edgeEffect;
        if (this.f2200l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: w */
    public final void m1802w() {
        if (this.f2172M != null) {
            return;
        }
        this.f2169J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2172M = edgeEffect;
        if (this.f2200l) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* renamed from: x */
    public final void m1803x() {
        if (this.f2171L != null) {
            return;
        }
        this.f2169J.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f2171L = edgeEffect;
        if (this.f2200l) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* renamed from: y */
    public final String m1804y() {
        return " " + super.toString() + ", adapter:" + this.f2210q + ", layout:" + this.f2212r + ", context:" + getContext();
    }

    /* renamed from: z */
    public final void m1805z(C0908X c0908x) {
        if (getScrollState() != 2) {
            c0908x.getClass();
            return;
        }
        OverScroller overScroller = this.f2191g0.f3644c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0908x.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException {
        float fM691a;
        TypedArray typedArray;
        int i2;
        char c2;
        Object[] objArr;
        Constructor constructor;
        super(context, attributeSet, i);
        int i3 = 1;
        this.f2188f = new C0904T(this);
        this.f2190g = new C0902Q(this);
        this.f2198k = new C0057j(19);
        this.f2202m = new RunnableC0886A(this, 0);
        this.f2204n = new Rect();
        this.f2206o = new Rect();
        this.f2208p = new RectF();
        this.f2214s = new ArrayList();
        this.f2216t = new ArrayList();
        this.f2226y = 0;
        this.f2165F = false;
        this.f2166G = false;
        this.f2167H = 0;
        this.f2168I = 0;
        this.f2169J = new C0891F();
        C0929j c0929j = new C0929j();
        c0929j.f3574a = null;
        c0929j.f3575b = new ArrayList();
        c0929j.f3576c = 120L;
        c0929j.f3577d = 120L;
        c0929j.f3578e = 250L;
        c0929j.f3579f = 250L;
        c0929j.f3745g = true;
        c0929j.f3746h = new ArrayList();
        c0929j.f3747i = new ArrayList();
        c0929j.f3748j = new ArrayList();
        c0929j.f3749k = new ArrayList();
        c0929j.f3750l = new ArrayList();
        c0929j.f3751m = new ArrayList();
        c0929j.f3752n = new ArrayList();
        c0929j.f3753o = new ArrayList();
        c0929j.f3754p = new ArrayList();
        c0929j.f3755q = new ArrayList();
        c0929j.f3756r = new ArrayList();
        this.f2174O = c0929j;
        this.f2175P = 0;
        this.f2176Q = -1;
        this.f2186d0 = Float.MIN_VALUE;
        this.f2187e0 = Float.MIN_VALUE;
        this.f2189f0 = true;
        this.f2191g0 = new RunnableC0910Z(this);
        this.f2195i0 = f2156C0 ? new C0935n() : null;
        C0908X c0908x = new C0908X();
        c0908x.f3628a = -1;
        c0908x.f3629b = 0;
        c0908x.f3630c = 0;
        c0908x.f3631d = 1;
        c0908x.f3632e = 0;
        c0908x.f3633f = false;
        c0908x.f3634g = false;
        c0908x.f3635h = false;
        c0908x.f3636i = false;
        c0908x.f3637j = false;
        c0908x.f3638k = false;
        this.f2197j0 = c0908x;
        this.f2203m0 = false;
        this.f2205n0 = false;
        C0887B c0887b = new C0887B(this);
        this.f2207o0 = c0887b;
        this.f2209p0 = false;
        this.f2213r0 = new int[2];
        this.f2217t0 = new int[2];
        this.f2219u0 = new int[2];
        this.f2221v0 = new int[2];
        this.f2223w0 = new ArrayList();
        this.f2225x0 = new RunnableC0886A(this, i3);
        this.f2227y0 = new C0887B(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2182W = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = AbstractC0210V.f567a;
            fM691a = AbstractC0207S.m685a(viewConfiguration);
        } else {
            fM691a = AbstractC0210V.m691a(viewConfiguration, context);
        }
        this.f2186d0 = fM691a;
        this.f2187e0 = i4 >= 26 ? AbstractC0207S.m686b(viewConfiguration) : AbstractC0210V.m691a(viewConfiguration, context);
        this.f2184b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2185c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2174O.f3574a = c0887b;
        this.f2194i = new C0913b(new C0887B(this));
        this.f2196j = new C0513t(new C0887B(this));
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if ((i4 >= 26 ? AbstractC0197H.m627c(this) : 0) == 0 && i4 >= 26) {
            AbstractC0197H.m637m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2164E = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0916c0(this));
        int[] iArr = AbstractC0870a.f3369a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i4 >= 29) {
            typedArray = typedArrayObtainStyledAttributes;
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        } else {
            typedArray = typedArrayObtainStyledAttributes;
        }
        String string = typedArray.getString(8);
        if (typedArray.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2200l = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArray.getDrawable(6);
            Drawable drawable = typedArray.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArray.getDrawable(4);
            Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + m1804y());
            }
            Resources resources = getContext().getResources();
            i2 = 4;
            c2 = 2;
            new C0934m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(it.deviato.spotifuck.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(it.deviato.spotifuck.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(it.deviato.spotifuck.R.dimen.fastscroll_margin));
        } else {
            i2 = 4;
            c2 = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0896K.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(f2157D0);
                        objArr = new Object[i2];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c2] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            objArr = null;
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strTrim, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((AbstractC0896K) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strTrim, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strTrim, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strTrim, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strTrim, e7);
                }
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        int[] iArr2 = f2159z0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        if (i5 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        }
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0896K abstractC0896K = this.f2212r;
        if (abstractC0896K != null) {
            return abstractC0896K.mo1705t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + m1804y());
    }

    public void setRecyclerListener(InterfaceC0903S interfaceC0903S) {
    }
}
