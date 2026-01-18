package p023N;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: N.u */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0255u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    public final View f652f;

    /* renamed from: g */
    public ViewTreeObserver f653g;

    /* renamed from: h */
    public final Runnable f654h;

    public ViewTreeObserverOnPreDrawListenerC0255u(View view, Runnable runnable) {
        this.f652f = view;
        this.f653g = view.getViewTreeObserver();
        this.f654h = runnable;
    }

    /* renamed from: a */
    public static void m794a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0255u viewTreeObserverOnPreDrawListenerC0255u = new ViewTreeObserverOnPreDrawListenerC0255u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0255u);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0255u);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f653g.isAlive();
        View view = this.f652f;
        if (zIsAlive) {
            this.f653g.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f654h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f653g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f653g.isAlive();
        View view2 = this.f652f;
        if (zIsAlive) {
            this.f653g.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
