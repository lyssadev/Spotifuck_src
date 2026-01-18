package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p100s0.AbstractC1295a;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC1295a {

    /* renamed from: b */
    public boolean f2268b;

    /* renamed from: d */
    public int f2270d;

    /* renamed from: f */
    public VelocityTracker f2272f;

    /* renamed from: c */
    public int f2269c = -1;

    /* renamed from: e */
    public int f2271e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: f */
    public final boolean mo66f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f2271e < 0) {
            this.f2271e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f2268b) {
            int i = this.f2269c;
            if (i == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y2 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y2 - this.f2270d) > this.f2271e) {
                this.f2270d = y2;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f2272f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f2269c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // p100s0.AbstractC1295a, p000A.AbstractC0002c
    /* renamed from: g */
    public final boolean mo67g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: h */
    public final boolean mo68h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: j */
    public final /* synthetic */ void mo70j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: k */
    public final void mo71k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: m */
    public final void mo73m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: n */
    public final Parcelable mo74n(View view) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: o */
    public final boolean mo75o(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: p */
    public final void mo76p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    @Override // p000A.AbstractC0002c
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo77q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f2269c);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                this.f2270d = (int) motionEvent.getY(iFindPointerIndex);
                view.getClass();
                throw new ClassCastException();
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() != 0 ? 0 : 1;
                    this.f2269c = motionEvent.getPointerId(i);
                    this.f2270d = (int) (motionEvent.getY(i) + 0.5f);
                }
            }
            velocityTracker = this.f2272f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return this.f2268b;
        }
        VelocityTracker velocityTracker2 = this.f2272f;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
            this.f2272f.computeCurrentVelocity(1000);
            this.f2272f.getYVelocity(this.f2269c);
            view.getClass();
            throw new ClassCastException();
        }
        this.f2268b = false;
        this.f2269c = -1;
        VelocityTracker velocityTracker3 = this.f2272f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f2272f = null;
        }
        velocityTracker = this.f2272f;
        if (velocityTracker != null) {
        }
        return this.f2268b;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
