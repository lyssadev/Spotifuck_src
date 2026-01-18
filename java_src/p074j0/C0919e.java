package p074j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: j0.e */
/* loaded from: classes.dex */
public final class C0919e extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f3689a = 1;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0912a0 f3690b;

    /* renamed from: c */
    public final /* synthetic */ View f3691c;

    /* renamed from: d */
    public final /* synthetic */ ViewPropertyAnimator f3692d;

    /* renamed from: e */
    public final /* synthetic */ C0929j f3693e;

    public C0919e(C0929j c0929j, AbstractC0912a0 abstractC0912a0, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3693e = c0929j;
        this.f3690b = abstractC0912a0;
        this.f3692d = viewPropertyAnimator;
        this.f3691c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f3689a) {
            case 1:
                this.f3691c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3689a) {
            case 0:
                this.f3692d.setListener(null);
                this.f3691c.setAlpha(1.0f);
                C0929j c0929j = this.f3693e;
                AbstractC0912a0 abstractC0912a0 = this.f3690b;
                c0929j.m2259c(abstractC0912a0);
                c0929j.f3755q.remove(abstractC0912a0);
                c0929j.m2373i();
                break;
            default:
                this.f3692d.setListener(null);
                C0929j c0929j2 = this.f3693e;
                AbstractC0912a0 abstractC0912a02 = this.f3690b;
                c0929j2.m2259c(abstractC0912a02);
                c0929j2.f3753o.remove(abstractC0912a02);
                c0929j2.m2373i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3689a) {
            case 0:
                this.f3693e.getClass();
                break;
            default:
                this.f3693e.getClass();
                break;
        }
    }

    public C0919e(C0929j c0929j, AbstractC0912a0 abstractC0912a0, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3693e = c0929j;
        this.f3690b = abstractC0912a0;
        this.f3691c = view;
        this.f3692d = viewPropertyAnimator;
    }
}
