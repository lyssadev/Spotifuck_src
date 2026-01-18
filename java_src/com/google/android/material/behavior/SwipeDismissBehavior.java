package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import p000A.AbstractC0002c;
import p023N.AbstractC0206Q;
import p025O.C0304f;
import p039V.C0421e;
import p074j0.C0944w;
import p102t0.C1302a;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends AbstractC0002c {

    /* renamed from: a */
    public C0421e f2288a;

    /* renamed from: b */
    public boolean f2289b;

    /* renamed from: c */
    public boolean f2290c;

    /* renamed from: d */
    public int f2291d = 2;

    /* renamed from: e */
    public float f2292e = 0.0f;

    /* renamed from: f */
    public float f2293f = 0.5f;

    /* renamed from: g */
    public final C1302a f2294g = new C1302a(this);

    @Override // p000A.AbstractC0002c
    /* renamed from: f */
    public boolean mo66f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM1386o = this.f2289b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM1386o = coordinatorLayout.m1386o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2289b = zM1386o;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2289b = false;
        }
        if (!zM1386o) {
            return false;
        }
        if (this.f2288a == null) {
            this.f2288a = new C0421e(coordinatorLayout.getContext(), coordinatorLayout, this.f2294g);
        }
        return !this.f2290c && this.f2288a.m1088p(motionEvent);
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: g */
    public final boolean mo67g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC0206Q.m678m(view, 1048576);
            AbstractC0206Q.m674i(view, 0);
            if (mo1846r(view)) {
                AbstractC0206Q.m679n(view, C0304f.f817j, new C0944w(this));
            }
        }
        return false;
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: q */
    public final boolean mo77q(View view, MotionEvent motionEvent) {
        if (this.f2288a == null) {
            return false;
        }
        if (this.f2290c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2288a.m1082j(motionEvent);
        return true;
    }

    /* renamed from: r */
    public boolean mo1846r(View view) {
        return true;
    }
}
