package p000A;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: A.g */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0006g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f */
    public final /* synthetic */ CoordinatorLayout f19f;

    public ViewTreeObserverOnPreDrawListenerC0006g(CoordinatorLayout coordinatorLayout) {
        this.f19f = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f19f.m1387p(0);
        return true;
    }
}
