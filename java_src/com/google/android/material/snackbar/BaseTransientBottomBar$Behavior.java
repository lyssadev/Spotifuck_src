package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000A.C0001b;
import p018K0.C0146e;
import p022M0.AbstractC0186c;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h */
    public final C0146e f2531h;

    public BaseTransientBottomBar$Behavior() {
        C0146e c0146e = new C0146e(2);
        this.f2292e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f2293f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f2291d = 0;
        this.f2531h = c0146e;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000A.AbstractC0002c
    /* renamed from: f */
    public final boolean mo66f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f2531h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0001b.f0h == null) {
                    C0001b.f0h = new C0001b(4);
                }
                synchronized (C0001b.f0h.f2g) {
                }
            }
        } else if (coordinatorLayout.m1386o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0001b.f0h == null) {
                C0001b.f0h = new C0001b(4);
            }
            C0001b.f0h.m60z();
        }
        return super.mo66f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: r */
    public final boolean mo1846r(View view) {
        this.f2531h.getClass();
        return view instanceof AbstractC0186c;
    }
}
