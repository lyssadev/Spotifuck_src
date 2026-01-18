package p023N;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p085n0.AbstractC1070m;
import p096r.C1247b;

/* renamed from: N.d0 */
/* loaded from: classes.dex */
public final class C0222d0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f588a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f589b;

    /* renamed from: c */
    public final /* synthetic */ Object f590c;

    public C0222d0(C0234j0 c0234j0, View view) {
        this.f589b = c0234j0;
        this.f590c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f588a) {
            case 0:
                ((C0234j0) this.f589b).f616a.mo726d(1.0f);
                C0226f0.m715e((View) this.f590c);
                break;
            default:
                ((C1247b) this.f589b).remove(animator);
                ((AbstractC1070m) this.f590c).f4409n.remove(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f588a) {
            case 1:
                ((AbstractC1070m) this.f590c).f4409n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0222d0(AbstractC1070m abstractC1070m, C1247b c1247b) {
        this.f590c = abstractC1070m;
        this.f589b = c1247b;
    }
}
