package p074j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: j0.f */
/* loaded from: classes.dex */
public final class C0921f extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0912a0 f3701a;

    /* renamed from: b */
    public final /* synthetic */ int f3702b;

    /* renamed from: c */
    public final /* synthetic */ View f3703c;

    /* renamed from: d */
    public final /* synthetic */ int f3704d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f3705e;

    /* renamed from: f */
    public final /* synthetic */ C0929j f3706f;

    public C0921f(C0929j c0929j, AbstractC0912a0 abstractC0912a0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3706f = c0929j;
        this.f3701a = abstractC0912a0;
        this.f3702b = i;
        this.f3703c = view;
        this.f3704d = i2;
        this.f3705e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f3702b;
        View view = this.f3703c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f3704d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3705e.setListener(null);
        C0929j c0929j = this.f3706f;
        AbstractC0912a0 abstractC0912a0 = this.f3701a;
        c0929j.m2259c(abstractC0912a0);
        c0929j.f3754p.remove(abstractC0912a0);
        c0929j.m2373i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3706f.getClass();
    }
}
