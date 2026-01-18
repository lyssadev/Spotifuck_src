package p074j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: j0.l */
/* loaded from: classes.dex */
public final class C0933l extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f3767a = false;

    /* renamed from: b */
    public final /* synthetic */ C0934m f3768b;

    public C0933l(C0934m c0934m) {
        this.f3768b = c0934m;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3767a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3767a) {
            this.f3767a = false;
            return;
        }
        C0934m c0934m = this.f3768b;
        if (((Float) c0934m.f3798z.getAnimatedValue()).floatValue() == 0.0f) {
            c0934m.f3771A = 0;
            c0934m.m2382g(0);
        } else {
            c0934m.f3771A = 2;
            c0934m.f3791s.invalidate();
        }
    }
}
