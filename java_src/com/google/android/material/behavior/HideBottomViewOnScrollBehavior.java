package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import it.deviato.spotifuck.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000A.AbstractC0002c;
import p023N.C0213Y;
import p091p0.AbstractC1230a;
import p097r0.AbstractC1258a;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends AbstractC0002c {

    /* renamed from: b */
    public int f2281b;

    /* renamed from: c */
    public int f2282c;

    /* renamed from: d */
    public TimeInterpolator f2283d;

    /* renamed from: e */
    public TimeInterpolator f2284e;

    /* renamed from: h */
    public ViewPropertyAnimator f2287h;

    /* renamed from: a */
    public final LinkedHashSet f2280a = new LinkedHashSet();

    /* renamed from: f */
    public int f2285f = 0;

    /* renamed from: g */
    public int f2286g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: g */
    public boolean mo67g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f2285f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2281b = AbstractC1230a.m2905q0(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2282c = AbstractC1230a.m2905q0(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2283d = AbstractC1230a.m2907r0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1258a.f5020d);
        this.f2284e = AbstractC1230a.m2907r0(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1258a.f5019c);
        return false;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: k */
    public final void mo71k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f2280a;
        if (i > 0) {
            if (this.f2286g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f2287h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f2286g = 1;
            Iterator it2 = linkedHashSet.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            this.f2287h = view.animate().translationY(this.f2285f).setInterpolator(this.f2284e).setDuration(this.f2282c).setListener(new C0213Y(5, this));
            return;
        }
        if (i >= 0 || this.f2286g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f2287h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f2286g = 2;
        Iterator it3 = linkedHashSet.iterator();
        if (it3.hasNext()) {
            it3.next().getClass();
            throw new ClassCastException();
        }
        this.f2287h = view.animate().translationY(0).setInterpolator(this.f2283d).setDuration(this.f2281b).setListener(new C0213Y(5, this));
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: o */
    public boolean mo75o(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
