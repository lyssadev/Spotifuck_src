package p024N0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;

/* renamed from: N0.d */
/* loaded from: classes.dex */
public final class C0276d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f682a;

    /* renamed from: b */
    public final /* synthetic */ C0277e f683b;

    public /* synthetic */ C0276d(C0277e c0277e, int i) {
        this.f682a = i;
        this.f683b = c0277e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        switch (this.f682a) {
            case 1:
                this.f683b.f745b.m841h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) throws Resources.NotFoundException {
        switch (this.f682a) {
            case 0:
                this.f683b.f745b.m841h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
