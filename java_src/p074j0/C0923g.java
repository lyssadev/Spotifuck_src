package p074j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: j0.g */
/* loaded from: classes.dex */
public final class C0923g extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f3708a;

    /* renamed from: b */
    public final /* synthetic */ C0925h f3709b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f3710c;

    /* renamed from: d */
    public final /* synthetic */ View f3711d;

    /* renamed from: e */
    public final /* synthetic */ C0929j f3712e;

    public /* synthetic */ C0923g(C0929j c0929j, C0925h c0925h, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f3708a = i;
        this.f3712e = c0929j;
        this.f3709b = c0925h;
        this.f3710c = viewPropertyAnimator;
        this.f3711d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3708a) {
            case 0:
                this.f3710c.setListener(null);
                View view = this.f3711d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0925h c0925h = this.f3709b;
                AbstractC0912a0 abstractC0912a0 = c0925h.f3717a;
                C0929j c0929j = this.f3712e;
                c0929j.m2259c(abstractC0912a0);
                c0929j.f3756r.remove(c0925h.f3717a);
                c0929j.m2373i();
                break;
            default:
                this.f3710c.setListener(null);
                View view2 = this.f3711d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0925h c0925h2 = this.f3709b;
                AbstractC0912a0 abstractC0912a02 = c0925h2.f3718b;
                C0929j c0929j2 = this.f3712e;
                c0929j2.m2259c(abstractC0912a02);
                c0929j2.f3756r.remove(c0925h2.f3718b);
                c0929j2.m2373i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3708a) {
            case 0:
                AbstractC0912a0 abstractC0912a0 = this.f3709b.f3717a;
                this.f3712e.getClass();
                break;
            default:
                AbstractC0912a0 abstractC0912a02 = this.f3709b.f3718b;
                this.f3712e.getClass();
                break;
        }
    }
}
