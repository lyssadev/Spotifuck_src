package p085n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import it.deviato.spotifuck.R;
import p018K0.C0146e;

/* renamed from: n0.g */
/* loaded from: classes.dex */
public final class C1064g extends AnimatorListenerAdapter implements InterfaceC1068k {

    /* renamed from: a */
    public final View f4377a;

    /* renamed from: b */
    public boolean f4378b = false;

    public C1064g(View view) {
        this.f4377a = view;
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: a */
    public final void mo2608a() {
        View view = this.f4377a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? AbstractC1080w.f4431a.mo499f(view) : 0.0f));
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: b */
    public final void mo2609b(AbstractC1070m abstractC1070m) {
        throw null;
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: c */
    public final void mo2610c(AbstractC1070m abstractC1070m) {
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: d */
    public final void mo2611d() {
        this.f4377a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: e */
    public final void mo2612e(AbstractC1070m abstractC1070m) {
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        AbstractC1080w.f4431a.mo504o(this.f4377a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f4377a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f4378b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        boolean z3 = this.f4378b;
        View view = this.f4377a;
        if (z3) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        C0146e c0146e = AbstractC1080w.f4431a;
        c0146e.mo504o(view, 1.0f);
        c0146e.getClass();
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: f */
    public final void mo2613f(AbstractC1070m abstractC1070m) {
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: g */
    public final void mo2614g(AbstractC1070m abstractC1070m) {
    }
}
