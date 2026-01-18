package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import it.deviato.spotifuck.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p000A.C0005f;
import p007E.C0057j;
import p008E0.C0081o;
import p008E0.ViewOnAttachStateChangeListenerC0080n;
import p017K.C0137j;
import p018K0.C0147f;
import p018K0.C0148g;
import p018K0.C0152k;
import p019L.C0173j;
import p020L0.C0177c;
import p020L0.C0179e;
import p023N.AbstractC0193D;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p023N.C0215a;
import p023N.C0217b;
import p023N.C0221d;
import p023N.C0226f0;
import p023N.C0228g0;
import p023N.ViewOnApplyWindowInsetsListenerC0224e0;
import p024N0.C0269C;
import p025O.C0304f;
import p027P.AbstractC0321a;
import p030Q0.AbstractC0328E;
import p039V.C0421e;
import p087o.RunnableC1124U;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;
import p106v0.C1315a;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0002c {

    /* renamed from: A */
    public final C0179e f2295A;

    /* renamed from: B */
    public final ValueAnimator f2296B;

    /* renamed from: C */
    public final int f2297C;

    /* renamed from: D */
    public int f2298D;

    /* renamed from: E */
    public int f2299E;

    /* renamed from: F */
    public final float f2300F;

    /* renamed from: G */
    public int f2301G;

    /* renamed from: H */
    public final float f2302H;

    /* renamed from: I */
    public boolean f2303I;

    /* renamed from: J */
    public boolean f2304J;

    /* renamed from: K */
    public final boolean f2305K;

    /* renamed from: L */
    public int f2306L;

    /* renamed from: M */
    public C0421e f2307M;

    /* renamed from: N */
    public boolean f2308N;

    /* renamed from: O */
    public int f2309O;

    /* renamed from: P */
    public boolean f2310P;

    /* renamed from: Q */
    public final float f2311Q;

    /* renamed from: R */
    public int f2312R;

    /* renamed from: S */
    public int f2313S;

    /* renamed from: T */
    public int f2314T;

    /* renamed from: U */
    public WeakReference f2315U;

    /* renamed from: V */
    public WeakReference f2316V;

    /* renamed from: W */
    public final ArrayList f2317W;

    /* renamed from: X */
    public VelocityTracker f2318X;

    /* renamed from: Y */
    public int f2319Y;

    /* renamed from: Z */
    public int f2320Z;

    /* renamed from: a */
    public final int f2321a;

    /* renamed from: a0 */
    public boolean f2322a0;

    /* renamed from: b */
    public boolean f2323b;

    /* renamed from: b0 */
    public HashMap f2324b0;

    /* renamed from: c */
    public final float f2325c;

    /* renamed from: c0 */
    public final SparseIntArray f2326c0;

    /* renamed from: d */
    public final int f2327d;

    /* renamed from: d0 */
    public final C0177c f2328d0;

    /* renamed from: e */
    public int f2329e;

    /* renamed from: f */
    public boolean f2330f;

    /* renamed from: g */
    public int f2331g;

    /* renamed from: h */
    public final int f2332h;

    /* renamed from: i */
    public final C0148g f2333i;

    /* renamed from: j */
    public final ColorStateList f2334j;

    /* renamed from: k */
    public final int f2335k;

    /* renamed from: l */
    public final int f2336l;

    /* renamed from: m */
    public int f2337m;

    /* renamed from: n */
    public final boolean f2338n;

    /* renamed from: o */
    public final boolean f2339o;

    /* renamed from: p */
    public final boolean f2340p;

    /* renamed from: q */
    public final boolean f2341q;

    /* renamed from: r */
    public final boolean f2342r;

    /* renamed from: s */
    public final boolean f2343s;

    /* renamed from: t */
    public final boolean f2344t;

    /* renamed from: u */
    public final boolean f2345u;

    /* renamed from: v */
    public int f2346v;

    /* renamed from: w */
    public int f2347w;

    /* renamed from: x */
    public final boolean f2348x;

    /* renamed from: y */
    public final C0152k f2349y;

    /* renamed from: z */
    public boolean f2350z;

    public BottomSheetBehavior() {
        this.f2321a = 0;
        this.f2323b = true;
        this.f2335k = -1;
        this.f2336l = -1;
        this.f2295A = new C0179e(this);
        this.f2300F = 0.5f;
        this.f2302H = -1.0f;
        this.f2305K = true;
        this.f2306L = 4;
        this.f2311Q = 0.1f;
        this.f2317W = new ArrayList();
        this.f2320Z = -1;
        this.f2326c0 = new SparseIntArray();
        this.f2328d0 = new C0177c(this, 1);
    }

    /* renamed from: v */
    public static View m1847v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if (AbstractC0195F.m610p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewM1847v = m1847v(viewGroup.getChildAt(i));
                if (viewM1847v != null) {
                    return viewM1847v;
                }
            }
        }
        return null;
    }

    /* renamed from: w */
    public static int m1848w(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    /* renamed from: A */
    public final void m1849A(int i) {
        if (i == -1) {
            if (this.f2330f) {
                return;
            } else {
                this.f2330f = true;
            }
        } else {
            if (!this.f2330f && this.f2329e == i) {
                return;
            }
            this.f2330f = false;
            this.f2329e = Math.max(0, i);
        }
        m1857I();
    }

    /* renamed from: B */
    public final void m1850B(int i) throws Resources.NotFoundException {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f2303I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.f2323b && m1863y(i) <= this.f2298D) ? 3 : i;
        WeakReference weakReference = this.f2315U;
        if (weakReference == null || weakReference.get() == null) {
            m1851C(i);
            return;
        }
        View view = (View) this.f2315U.get();
        RunnableC1124U runnableC1124U = new RunnableC1124U(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            if (view.isAttachedToWindow()) {
                view.post(runnableC1124U);
                return;
            }
        }
        runnableC1124U.run();
    }

    /* renamed from: C */
    public final void m1851C(int i) throws Resources.NotFoundException {
        if (this.f2306L == i) {
            return;
        }
        this.f2306L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z2 = this.f2303I;
        }
        WeakReference weakReference = this.f2315U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m1856H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m1856H(false);
        }
        m1855G(i, true);
        ArrayList arrayList = this.f2317W;
        if (arrayList.size() <= 0) {
            m1854F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: D */
    public final boolean m1852D(View view, float f2) {
        if (this.f2304J) {
            return true;
        }
        if (view.getTop() < this.f2301G) {
            return false;
        }
        return Math.abs(((f2 * this.f2311Q) + ((float) view.getTop())) - ((float) this.f2301G)) / ((float) m1860t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        m1851C(2);
        m1855G(r4, true);
        r2.f2295A.m581a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.m1087o(r3.getLeft(), r0) != false) goto L16;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1853E(View view, int i, boolean z2) throws Resources.NotFoundException {
        int iM1863y = m1863y(i);
        C0421e c0421e = this.f2307M;
        if (c0421e != null) {
            if (!z2) {
                int left = view.getLeft();
                c0421e.f1072r = view;
                c0421e.f1057c = -1;
                boolean zM1080h = c0421e.m1080h(left, iM1863y, 0, 0);
                if (!zM1080h && c0421e.f1055a == 0 && c0421e.f1072r != null) {
                    c0421e.f1072r = null;
                }
            }
        }
        m1851C(i);
    }

    /* renamed from: F */
    public final void m1854F() throws Resources.NotFoundException {
        View view;
        int iM881a;
        WeakReference weakReference = this.f2315U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0206Q.m678m(view, 524288);
        AbstractC0206Q.m674i(view, 0);
        AbstractC0206Q.m678m(view, 262144);
        AbstractC0206Q.m674i(view, 0);
        AbstractC0206Q.m678m(view, 1048576);
        AbstractC0206Q.m674i(view, 0);
        SparseIntArray sparseIntArray = this.f2326c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC0206Q.m678m(view, i);
            AbstractC0206Q.m674i(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f2323b && this.f2306L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C0137j c0137j = new C0137j(this, 6);
            ArrayList arrayListM670e = AbstractC0206Q.m670e(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListM670e.size()) {
                    int i3 = -1;
                    for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                        int i5 = AbstractC0206Q.f564e[i4];
                        boolean z2 = true;
                        for (int i6 = 0; i6 < arrayListM670e.size(); i6++) {
                            z2 &= ((C0304f) arrayListM670e.get(i6)).m881a() != i5;
                        }
                        if (z2) {
                            i3 = i5;
                        }
                    }
                    iM881a = i3;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C0304f) arrayListM670e.get(i2)).f820a).getLabel())) {
                        iM881a = ((C0304f) arrayListM670e.get(i2)).m881a();
                        break;
                    }
                    i2++;
                }
            }
            if (iM881a != -1) {
                C0304f c0304f = new C0304f(null, iM881a, string, c0137j, null);
                View.AccessibilityDelegate accessibilityDelegateM668c = AbstractC0206Q.m668c(view);
                C0217b c0217b = accessibilityDelegateM668c == null ? null : accessibilityDelegateM668c instanceof C0215a ? ((C0215a) accessibilityDelegateM668c).f573a : new C0217b(accessibilityDelegateM668c);
                if (c0217b == null) {
                    c0217b = new C0217b();
                }
                AbstractC0206Q.m681p(view, c0217b);
                AbstractC0206Q.m678m(view, c0304f.m881a());
                AbstractC0206Q.m670e(view).add(c0304f);
                AbstractC0206Q.m674i(view, 0);
            }
            sparseIntArray.put(0, iM881a);
        }
        if (this.f2303I && this.f2306L != 5) {
            AbstractC0206Q.m679n(view, C0304f.f817j, new C0137j(this, 5));
        }
        int i7 = this.f2306L;
        if (i7 == 3) {
            AbstractC0206Q.m679n(view, C0304f.f816i, new C0137j(this, this.f2323b ? 4 : 6));
            return;
        }
        if (i7 == 4) {
            AbstractC0206Q.m679n(view, C0304f.f815h, new C0137j(this, this.f2323b ? 3 : 6));
        } else {
            if (i7 != 6) {
                return;
            }
            AbstractC0206Q.m679n(view, C0304f.f816i, new C0137j(this, 4));
            AbstractC0206Q.m679n(view, C0304f.f815h, new C0137j(this, 3));
        }
    }

    /* renamed from: G */
    public final void m1855G(int i, boolean z2) {
        C0148g c0148g = this.f2333i;
        ValueAnimator valueAnimator = this.f2296B;
        if (i == 2) {
            return;
        }
        boolean z3 = this.f2306L == 3 && (this.f2348x || m1864z());
        if (this.f2350z == z3 || c0148g == null) {
            return;
        }
        this.f2350z = z3;
        if (z2 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(c0148g.f410f.f400i, z3 ? m1859s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fM1859s = this.f2350z ? m1859s() : 1.0f;
        C0147f c0147f = c0148g.f410f;
        if (c0147f.f400i != fM1859s) {
            c0147f.f400i = fM1859s;
            c0148g.f414j = true;
            c0148g.invalidateSelf();
        }
    }

    /* renamed from: H */
    public final void m1856H(boolean z2) {
        WeakReference weakReference = this.f2315U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f2324b0 != null) {
                    return;
                } else {
                    this.f2324b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f2315U.get() && z2) {
                    this.f2324b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z2) {
                return;
            }
            this.f2324b0 = null;
        }
    }

    /* renamed from: I */
    public final void m1857I() {
        View view;
        if (this.f2315U != null) {
            m1858r();
            if (this.f2306L != 4 || (view = (View) this.f2315U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: c */
    public final void mo63c(C0005f c0005f) {
        this.f2315U = null;
        this.f2307M = null;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: e */
    public final void mo65e() {
        this.f2315U = null;
        this.f2307M = null;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: f */
    public final boolean mo66f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        C0421e c0421e;
        if (!view.isShown() || !this.f2305K) {
            this.f2308N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2319Y = -1;
            this.f2320Z = -1;
            VelocityTracker velocityTracker = this.f2318X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2318X = null;
            }
        }
        if (this.f2318X == null) {
            this.f2318X = VelocityTracker.obtain();
        }
        this.f2318X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f2320Z = (int) motionEvent.getY();
            if (this.f2306L != 2) {
                WeakReference weakReference = this.f2316V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m1386o(view2, x2, this.f2320Z)) {
                    this.f2319Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f2322a0 = true;
                }
            }
            this.f2308N = this.f2319Y == -1 && !coordinatorLayout.m1386o(view, x2, this.f2320Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2322a0 = false;
            this.f2319Y = -1;
            if (this.f2308N) {
                this.f2308N = false;
                return false;
            }
        }
        if (!this.f2308N && (c0421e = this.f2307M) != null && c0421e.m1088p(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f2316V;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f2308N || this.f2306L == 1 || coordinatorLayout.m1386o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f2307M == null || (i = this.f2320Z) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.f2307M.f1056b)) ? false : true;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: g */
    public final boolean mo67g(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        int i2 = this.f2336l;
        C0148g c0148g = this.f2333i;
        int i3 = 1;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2315U == null) {
            this.f2331g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i4 = Build.VERSION.SDK_INT;
            boolean z2 = (i4 < 29 || this.f2338n || this.f2330f) ? false : true;
            if (this.f2339o || this.f2340p || this.f2341q || this.f2343s || this.f2344t || this.f2345u || z2) {
                C0173j c0173j = new C0173j(this, z2);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C0081o c0081o = new C0081o();
                c0081o.f244a = paddingStart;
                c0081o.f245b = paddingEnd;
                c0081o.f246c = paddingBottom;
                AbstractC0195F.m615u(view, new C0057j(c0173j, c0081o, i3));
                if (view.isAttachedToWindow()) {
                    AbstractC0193D.m594c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0080n());
                }
            }
            C0221d c0221d = new C0221d(view);
            if (i4 >= 30) {
                view.setWindowInsetsAnimationCallback(new C0228g0(c0221d));
            } else {
                PathInterpolator pathInterpolator = C0226f0.f594e;
                Object tag = view.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0224e0 = new ViewOnApplyWindowInsetsListenerC0224e0(view, c0221d);
                view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0224e0);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0224e0);
                }
            }
            this.f2315U = new WeakReference(view);
            Context context = view.getContext();
            AbstractC1230a.m2907r0(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0321a.m921b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC1230a.m2905q0(context, R.attr.motionDurationMedium2, 300);
            AbstractC1230a.m2905q0(context, R.attr.motionDurationShort3, 150);
            AbstractC1230a.m2905q0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            if (c0148g != null) {
                view.setBackground(c0148g);
                float fM603i = this.f2302H;
                if (fM603i == -1.0f) {
                    fM603i = AbstractC0195F.m603i(view);
                }
                c0148g.m516i(fM603i);
            } else {
                ColorStateList colorStateList = this.f2334j;
                if (colorStateList != null) {
                    AbstractC0206Q.m683r(view, colorStateList);
                }
            }
            m1854F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f2307M == null) {
            this.f2307M = new C0421e(coordinatorLayout.getContext(), coordinatorLayout, this.f2328d0);
        }
        int top = view.getTop();
        coordinatorLayout.m1388q(view, i);
        this.f2313S = coordinatorLayout.getWidth();
        this.f2314T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f2312R = height;
        int iMin = this.f2314T;
        int i5 = iMin - height;
        int i6 = this.f2347w;
        if (i5 < i6) {
            if (this.f2342r) {
                if (i2 != -1) {
                    iMin = Math.min(iMin, i2);
                }
                this.f2312R = iMin;
            } else {
                int iMin2 = iMin - i6;
                if (i2 != -1) {
                    iMin2 = Math.min(iMin2, i2);
                }
                this.f2312R = iMin2;
            }
        }
        this.f2298D = Math.max(0, this.f2314T - this.f2312R);
        this.f2299E = (int) ((1.0f - this.f2300F) * this.f2314T);
        m1858r();
        int i7 = this.f2306L;
        if (i7 == 3) {
            AbstractC0206Q.m676k(view, m1862x());
        } else if (i7 == 6) {
            AbstractC0206Q.m676k(view, this.f2299E);
        } else if (this.f2303I && i7 == 5) {
            AbstractC0206Q.m676k(view, this.f2314T);
        } else if (i7 == 4) {
            AbstractC0206Q.m676k(view, this.f2301G);
        } else if (i7 == 1 || i7 == 2) {
            AbstractC0206Q.m676k(view, top - view.getTop());
        }
        m1855G(this.f2306L, false);
        this.f2316V = new WeakReference(m1847v(view));
        ArrayList arrayList = this.f2317W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: h */
    public final boolean mo68h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m1848w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f2335k, marginLayoutParams.width), m1848w(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f2336l, marginLayoutParams.height));
        return true;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: i */
    public final boolean mo69i(View view) {
        WeakReference weakReference = this.f2316V;
        return (weakReference == null || view != weakReference.get() || this.f2306L == 3) ? false : true;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: j */
    public final void mo70j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) throws Resources.NotFoundException {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.f2316V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < m1862x()) {
                int iM1862x = top - m1862x();
                iArr[1] = iM1862x;
                AbstractC0206Q.m676k(view, -iM1862x);
                m1851C(3);
            } else {
                if (!this.f2305K) {
                    return;
                }
                iArr[1] = i2;
                AbstractC0206Q.m676k(view, -i2);
                m1851C(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.f2301G;
            if (i4 > i5 && !this.f2303I) {
                int i6 = top - i5;
                iArr[1] = i6;
                AbstractC0206Q.m676k(view, -i6);
                m1851C(4);
            } else {
                if (!this.f2305K) {
                    return;
                }
                iArr[1] = i2;
                AbstractC0206Q.m676k(view, -i2);
                m1851C(1);
            }
        }
        m1861u(view.getTop());
        this.f2309O = i2;
        this.f2310P = true;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: m */
    public final void mo73m(View view, Parcelable parcelable) {
        C1315a c1315a = (C1315a) parcelable;
        int i = this.f2321a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f2329e = c1315a.f5345d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f2323b = c1315a.f5346e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f2303I = c1315a.f5347f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f2304J = c1315a.f5348g;
            }
        }
        int i2 = c1315a.f5344c;
        if (i2 == 1 || i2 == 2) {
            this.f2306L = 4;
        } else {
            this.f2306L = i2;
        }
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: n */
    public final Parcelable mo74n(View view) {
        return new C1315a(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: o */
    public final boolean mo75o(View view, int i, int i2) {
        this.f2309O = 0;
        this.f2310P = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // p000A.AbstractC0002c
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo76p(View view, View view2, int i) throws Resources.NotFoundException {
        float yVelocity;
        int i2 = 3;
        if (view.getTop() == m1862x()) {
            m1851C(3);
            return;
        }
        WeakReference weakReference = this.f2316V;
        if (weakReference != null && view2 == weakReference.get() && this.f2310P) {
            if (this.f2309O > 0) {
                if (!this.f2323b && view.getTop() > this.f2299E) {
                    i2 = 6;
                }
            } else if (this.f2303I) {
                VelocityTracker velocityTracker = this.f2318X;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.f2325c);
                    yVelocity = this.f2318X.getYVelocity(this.f2319Y);
                }
                if (m1852D(view, yVelocity)) {
                    i2 = 5;
                }
            } else if (this.f2309O == 0) {
                int top = view.getTop();
                if (!this.f2323b) {
                    int i3 = this.f2299E;
                    if (top < i3) {
                        if (top >= Math.abs(top - this.f2301G)) {
                        }
                    } else if (Math.abs(top - i3) < Math.abs(top - this.f2301G)) {
                    }
                    i2 = 6;
                } else if (Math.abs(top - this.f2298D) >= Math.abs(top - this.f2301G)) {
                    i2 = 4;
                }
            } else {
                if (!this.f2323b) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - this.f2299E) < Math.abs(top2 - this.f2301G)) {
                    }
                }
                i2 = 4;
            }
            m1853E(view, i2, false);
            this.f2310P = false;
        }
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: q */
    public final boolean mo77q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f2306L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C0421e c0421e = this.f2307M;
        if (c0421e != null && (this.f2305K || i == 1)) {
            c0421e.m1082j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f2319Y = -1;
            this.f2320Z = -1;
            VelocityTracker velocityTracker = this.f2318X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2318X = null;
            }
        }
        if (this.f2318X == null) {
            this.f2318X = VelocityTracker.obtain();
        }
        this.f2318X.addMovement(motionEvent);
        if (this.f2307M != null && ((this.f2305K || this.f2306L == 1) && actionMasked == 2 && !this.f2308N)) {
            float fAbs = Math.abs(this.f2320Z - motionEvent.getY());
            C0421e c0421e2 = this.f2307M;
            if (fAbs > c0421e2.f1056b) {
                c0421e2.m1074b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2308N;
    }

    /* renamed from: r */
    public final void m1858r() {
        int iM1860t = m1860t();
        if (this.f2323b) {
            this.f2301G = Math.max(this.f2314T - iM1860t, this.f2298D);
        } else {
            this.f2301G = this.f2314T - iM1860t;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m1859s() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        float f2;
        float f3 = 0.0f;
        if (this.f2333i != null && (weakReference = this.f2315U) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            View view = (View) this.f2315U.get();
            if (m1864z() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                C0148g c0148g = this.f2333i;
                float fMo491a = c0148g.f410f.f392a.f448e.mo491a(c0148g.m513f());
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(0);
                if (roundedCorner != null) {
                    float radius = roundedCorner.getRadius();
                    f2 = (radius <= 0.0f || fMo491a <= 0.0f) ? 0.0f : radius / fMo491a;
                }
                C0148g c0148g2 = this.f2333i;
                float fMo491a2 = c0148g2.f410f.f392a.f449f.mo491a(c0148g2.m513f());
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
                if (roundedCorner2 != null) {
                    float radius2 = roundedCorner2.getRadius();
                    if (radius2 > 0.0f && fMo491a2 > 0.0f) {
                        f3 = radius2 / fMo491a2;
                    }
                }
                return Math.max(f2, f3);
            }
        }
        return 0.0f;
    }

    /* renamed from: t */
    public final int m1860t() {
        int i;
        return this.f2330f ? Math.min(Math.max(this.f2331g, this.f2314T - ((this.f2313S * 9) / 16)), this.f2312R) + this.f2346v : (this.f2338n || this.f2339o || (i = this.f2337m) <= 0) ? this.f2329e + this.f2346v : Math.max(this.f2329e, i + this.f2332h);
    }

    /* renamed from: u */
    public final void m1861u(int i) {
        if (((View) this.f2315U.get()) != null) {
            ArrayList arrayList = this.f2317W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.f2301G;
            if (i <= i2 && i2 != m1862x()) {
                m1862x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            AbstractC0328E.m938h(arrayList.get(0));
            throw null;
        }
    }

    /* renamed from: x */
    public final int m1862x() {
        if (this.f2323b) {
            return this.f2298D;
        }
        return Math.max(this.f2297C, this.f2342r ? 0 : this.f2347w);
    }

    /* renamed from: y */
    public final int m1863y(int i) {
        if (i == 3) {
            return m1862x();
        }
        if (i == 4) {
            return this.f2301G;
        }
        if (i == 5) {
            return this.f2314T;
        }
        if (i == 6) {
            return this.f2299E;
        }
        throw new IllegalArgumentException(AbstractC0328E.m935e("Invalid state to get top offset: ", i));
    }

    /* renamed from: z */
    public final boolean m1864z() {
        WeakReference weakReference = this.f2315U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.f2315U.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i;
        int i2 = 2;
        this.f2321a = 0;
        this.f2323b = true;
        this.f2335k = -1;
        this.f2336l = -1;
        this.f2295A = new C0179e(this);
        this.f2300F = 0.5f;
        this.f2302H = -1.0f;
        this.f2305K = true;
        this.f2306L = 4;
        this.f2311Q = 0.1f;
        this.f2317W = new ArrayList();
        this.f2320Z = -1;
        this.f2326c0 = new SparseIntArray();
        this.f2328d0 = new C0177c(this, 1);
        this.f2332h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1241a.f4937a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f2334j = AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f2349y = C0152k.m524b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m522a();
        }
        C0152k c0152k = this.f2349y;
        if (c0152k != null) {
            C0148g c0148g = new C0148g(c0152k);
            this.f2333i = c0148g;
            c0148g.m515h(context);
            ColorStateList colorStateList = this.f2334j;
            if (colorStateList != null) {
                this.f2333i.m517j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2333i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(m1859s(), 1.0f);
        this.f2296B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f2296B.addUpdateListener(new C0269C(i2, this));
        this.f2302H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f2335k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f2336l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            m1849A(i);
        } else {
            m1849A(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f2303I != z2) {
            this.f2303I = z2;
            if (!z2 && this.f2306L == 5) {
                m1850B(4);
            }
            m1854F();
        }
        this.f2338n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f2323b != z3) {
            this.f2323b = z3;
            if (this.f2315U != null) {
                m1858r();
            }
            m1851C((this.f2323b && this.f2306L == 6) ? 3 : this.f2306L);
            m1855G(this.f2306L, true);
            m1854F();
        }
        this.f2304J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f2305K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f2321a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f2 = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f2300F = f2;
            if (this.f2315U != null) {
                this.f2299E = (int) ((1.0f - f2) * this.f2314T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.f2297C = i3;
                    m1855G(this.f2306L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f2297C = dimensionPixelOffset;
                    m1855G(this.f2306L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f2327d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f2339o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f2340p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f2341q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f2342r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f2343s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f2344t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f2345u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f2348x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f2325c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: k */
    public final void mo71k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
