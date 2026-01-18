package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import it.deviato.spotifuck.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p000A.C0005f;
import p007E.RunnableC0063p;
import p018K0.C0142a;
import p018K0.C0148g;
import p018K0.C0151j;
import p018K0.C0152k;
import p020L0.C0175a;
import p020L0.C0177c;
import p020L0.C0178d;
import p020L0.C0179e;
import p023N.AbstractC0195F;
import p023N.AbstractC0206Q;
import p025O.C0304f;
import p025O.InterfaceC0319u;
import p027P.AbstractC0321a;
import p030Q0.AbstractC0328E;
import p039V.C0421e;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends AbstractC0002c {

    /* renamed from: a */
    public AbstractC1230a f2509a;

    /* renamed from: b */
    public final C0148g f2510b;

    /* renamed from: c */
    public final ColorStateList f2511c;

    /* renamed from: d */
    public final C0152k f2512d;

    /* renamed from: e */
    public final C0179e f2513e;

    /* renamed from: f */
    public final float f2514f;

    /* renamed from: g */
    public final boolean f2515g;

    /* renamed from: h */
    public int f2516h;

    /* renamed from: i */
    public C0421e f2517i;

    /* renamed from: j */
    public boolean f2518j;

    /* renamed from: k */
    public final float f2519k;

    /* renamed from: l */
    public int f2520l;

    /* renamed from: m */
    public int f2521m;

    /* renamed from: n */
    public int f2522n;

    /* renamed from: o */
    public int f2523o;

    /* renamed from: p */
    public WeakReference f2524p;

    /* renamed from: q */
    public WeakReference f2525q;

    /* renamed from: r */
    public final int f2526r;

    /* renamed from: s */
    public VelocityTracker f2527s;

    /* renamed from: t */
    public int f2528t;

    /* renamed from: u */
    public final LinkedHashSet f2529u;

    /* renamed from: v */
    public final C0177c f2530v;

    public SideSheetBehavior() {
        this.f2513e = new C0179e(this);
        this.f2515g = true;
        this.f2516h = 5;
        this.f2519k = 0.1f;
        this.f2526r = -1;
        this.f2529u = new LinkedHashSet();
        this.f2530v = new C0177c(this, 0);
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: c */
    public final void mo63c(C0005f c0005f) {
        this.f2524p = null;
        this.f2517i = null;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: e */
    public final void mo65e() {
        this.f2524p = null;
        this.f2517i = null;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: f */
    public final boolean mo66f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C0421e c0421e;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC0206Q.m669d(view) == null) || !this.f2515g) {
            this.f2518j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2527s) != null) {
            velocityTracker.recycle();
            this.f2527s = null;
        }
        if (this.f2527s == null) {
            this.f2527s = VelocityTracker.obtain();
        }
        this.f2527s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2528t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f2518j) {
            this.f2518j = false;
            return false;
        }
        return (this.f2518j || (c0421e = this.f2517i) == null || !c0421e.m1088p(motionEvent)) ? false : true;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: g */
    public final boolean mo67g(CoordinatorLayout coordinatorLayout, View view, int i) throws Resources.NotFoundException {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        int iMo565V = 0;
        int i3 = 1;
        C0148g c0148g = this.f2510b;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2524p == null) {
            this.f2524p = new WeakReference(view);
            Context context = view.getContext();
            AbstractC1230a.m2907r0(context, R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0321a.m921b(0.0f, 0.0f, 0.0f, 1.0f));
            AbstractC1230a.m2905q0(context, R.attr.motionDurationMedium2, 300);
            AbstractC1230a.m2905q0(context, R.attr.motionDurationShort3, 150);
            AbstractC1230a.m2905q0(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (c0148g != null) {
                view.setBackground(c0148g);
                float fM603i = this.f2514f;
                if (fM603i == -1.0f) {
                    fM603i = AbstractC0195F.m603i(view);
                }
                c0148g.m516i(fM603i);
            } else {
                ColorStateList colorStateList = this.f2511c;
                if (colorStateList != null) {
                    AbstractC0206Q.m683r(view, colorStateList);
                }
            }
            int i4 = this.f2516h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            m1916u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC0206Q.m669d(view) == null) {
                AbstractC0206Q.m682q(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((C0005f) view.getLayoutParams()).f6c, i) == 3 ? 1 : 0;
        AbstractC1230a abstractC1230a = this.f2509a;
        if (abstractC1230a == null || abstractC1230a.mo567X() != i5) {
            C0152k c0152k = this.f2512d;
            C0005f c0005f = null;
            if (i5 == 0) {
                this.f2509a = new C0175a(this, i3);
                if (c0152k != null) {
                    WeakReference weakReference = this.f2524p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof C0005f)) {
                        c0005f = (C0005f) view3.getLayoutParams();
                    }
                    if (c0005f == null || ((ViewGroup.MarginLayoutParams) c0005f).rightMargin <= 0) {
                        C0151j c0151jM527e = c0152k.m527e();
                        c0151jM527e.f437f = new C0142a(0.0f);
                        c0151jM527e.f438g = new C0142a(0.0f);
                        C0152k c0152kM522a = c0151jM527e.m522a();
                        if (c0148g != null) {
                            c0148g.setShapeAppearanceModel(c0152kM522a);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i5 + ". Must be 0 or 1.");
                }
                this.f2509a = new C0175a(this, iMo565V);
                if (c0152k != null) {
                    WeakReference weakReference2 = this.f2524p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof C0005f)) {
                        c0005f = (C0005f) view2.getLayoutParams();
                    }
                    if (c0005f == null || ((ViewGroup.MarginLayoutParams) c0005f).leftMargin <= 0) {
                        C0151j c0151jM527e2 = c0152k.m527e();
                        c0151jM527e2.f436e = new C0142a(0.0f);
                        c0151jM527e2.f439h = new C0142a(0.0f);
                        C0152k c0152kM522a2 = c0151jM527e2.m522a();
                        if (c0148g != null) {
                            c0148g.setShapeAppearanceModel(c0152kM522a2);
                        }
                    }
                }
            }
        }
        if (this.f2517i == null) {
            this.f2517i = new C0421e(coordinatorLayout.getContext(), coordinatorLayout, this.f2530v);
        }
        int iMo565V2 = this.f2509a.mo565V(view);
        coordinatorLayout.m1388q(view, i);
        this.f2521m = coordinatorLayout.getWidth();
        this.f2522n = this.f2509a.mo566W(coordinatorLayout);
        this.f2520l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2523o = marginLayoutParams != null ? this.f2509a.mo569e(marginLayoutParams) : 0;
        int i6 = this.f2516h;
        if (i6 == 1 || i6 == 2) {
            iMo565V = iMo565V2 - this.f2509a.mo565V(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f2516h);
            }
            iMo565V = this.f2509a.mo562Q();
        }
        AbstractC0206Q.m675j(view, iMo565V);
        if (this.f2525q == null && (i2 = this.f2526r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f2525q = new WeakReference(viewFindViewById);
        }
        Iterator it2 = this.f2529u.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: h */
    public final boolean mo68h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: m */
    public final void mo73m(View view, Parcelable parcelable) {
        int i = ((C0178d) parcelable).f522c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f2516h = i;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: n */
    public final Parcelable mo74n(View view) {
        return new C0178d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: q */
    public final boolean mo77q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2516h == 1 && actionMasked == 0) {
            return true;
        }
        if (m1914s()) {
            this.f2517i.m1082j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2527s) != null) {
            velocityTracker.recycle();
            this.f2527s = null;
        }
        if (this.f2527s == null) {
            this.f2527s = VelocityTracker.obtain();
        }
        this.f2527s.addMovement(motionEvent);
        if (m1914s() && actionMasked == 2 && !this.f2518j && m1914s()) {
            float fAbs = Math.abs(this.f2528t - motionEvent.getX());
            C0421e c0421e = this.f2517i;
            if (fAbs > c0421e.f1056b) {
                c0421e.m1074b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f2518j;
    }

    /* renamed from: r */
    public final void m1913r(int i) {
        View view;
        if (this.f2516h == i) {
            return;
        }
        this.f2516h = i;
        WeakReference weakReference = this.f2524p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f2516h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it2 = this.f2529u.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        }
        m1916u();
    }

    /* renamed from: s */
    public final boolean m1914s() {
        return this.f2517i != null && (this.f2515g || this.f2516h == 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.m1087o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        m1913r(2);
        r2.f2513e.m581a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1915t(View view, int i, boolean z2) {
        int iMo561P;
        if (i == 3) {
            iMo561P = this.f2509a.mo561P();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC0328E.m935e("Invalid state to get outer edge offset: ", i));
            }
            iMo561P = this.f2509a.mo562Q();
        }
        C0421e c0421e = this.f2517i;
        if (c0421e != null) {
            if (!z2) {
                int top = view.getTop();
                c0421e.f1072r = view;
                c0421e.f1057c = -1;
                boolean zM1080h = c0421e.m1080h(iMo561P, top, 0, 0);
                if (!zM1080h && c0421e.f1055a == 0 && c0421e.f1072r != null) {
                    c0421e.f1072r = null;
                }
            }
        }
        m1913r(i);
    }

    /* renamed from: u */
    public final void m1916u() {
        View view;
        WeakReference weakReference = this.f2524p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC0206Q.m678m(view, 262144);
        AbstractC0206Q.m674i(view, 0);
        AbstractC0206Q.m678m(view, 1048576);
        AbstractC0206Q.m674i(view, 0);
        final int i = 5;
        if (this.f2516h != 5) {
            AbstractC0206Q.m679n(view, C0304f.f817j, new InterfaceC0319u() { // from class: L0.b
                /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
                @Override // p025O.InterfaceC0319u
                /* renamed from: c */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean mo489c(View view2) {
                    int i2 = 1;
                    SideSheetBehavior sideSheetBehavior = this.f518f;
                    sideSheetBehavior.getClass();
                    int i3 = i;
                    if (i3 == 1 || i3 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f2524p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m1913r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2524p.get();
                        RunnableC0063p runnableC0063p = new RunnableC0063p(i3, i2, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent == null || !parent.isLayoutRequested()) {
                            runnableC0063p.run();
                        } else {
                            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(runnableC0063p);
                            }
                        }
                    }
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.f2516h != 3) {
            AbstractC0206Q.m679n(view, C0304f.f815h, new InterfaceC0319u() { // from class: L0.b
                /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
                @Override // p025O.InterfaceC0319u
                /* renamed from: c */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean mo489c(View view2) {
                    int i22 = 1;
                    SideSheetBehavior sideSheetBehavior = this.f518f;
                    sideSheetBehavior.getClass();
                    int i3 = i2;
                    if (i3 == 1 || i3 == 2) {
                        StringBuilder sb = new StringBuilder("STATE_");
                        sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
                        sb.append(" should not be set externally.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f2524p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.m1913r(i3);
                    } else {
                        View view3 = (View) sideSheetBehavior.f2524p.get();
                        RunnableC0063p runnableC0063p = new RunnableC0063p(i3, i22, sideSheetBehavior);
                        ViewParent parent = view3.getParent();
                        if (parent == null || !parent.isLayoutRequested()) {
                            runnableC0063p.run();
                        } else {
                            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                            if (view3.isAttachedToWindow()) {
                                view3.post(runnableC0063p);
                            }
                        }
                    }
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f2513e = new C0179e(this);
        this.f2515g = true;
        this.f2516h = 5;
        this.f2519k = 0.1f;
        this.f2526r = -1;
        this.f2529u = new LinkedHashSet();
        this.f2530v = new C0177c(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1241a.f4959w);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f2511c = AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f2512d = C0152k.m524b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).m522a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f2526r = resourceId;
            WeakReference weakReference = this.f2525q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2525q = null;
            WeakReference weakReference2 = this.f2524p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        C0152k c0152k = this.f2512d;
        if (c0152k != null) {
            C0148g c0148g = new C0148g(c0152k);
            this.f2510b = c0148g;
            c0148g.m515h(context);
            ColorStateList colorStateList = this.f2511c;
            if (colorStateList != null) {
                this.f2510b.m517j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2510b.setTint(typedValue.data);
            }
        }
        this.f2514f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f2515g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
