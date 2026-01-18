package p085n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.FrameLayout;
import it.deviato.spotifuck.R;

/* renamed from: n0.G */
/* loaded from: classes.dex */
public final class C1056G extends AnimatorListenerAdapter implements InterfaceC1068k {

    /* renamed from: a */
    public final FrameLayout f4345a;

    /* renamed from: b */
    public final View f4346b;

    /* renamed from: c */
    public final View f4347c;

    /* renamed from: d */
    public boolean f4348d = true;

    /* renamed from: e */
    public final /* synthetic */ C1065h f4349e;

    public C1056G(C1065h c1065h, FrameLayout frameLayout, View view, View view2) {
        this.f4349e = c1065h;
        this.f4345a = frameLayout;
        this.f4346b = view;
        this.f4347c = view2;
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: b */
    public final void mo2609b(AbstractC1070m abstractC1070m) {
        abstractC1070m.mo2632x(this);
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: c */
    public final void mo2610c(AbstractC1070m abstractC1070m) {
        abstractC1070m.mo2632x(this);
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: e */
    public final void mo2612e(AbstractC1070m abstractC1070m) {
        throw null;
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: f */
    public final void mo2613f(AbstractC1070m abstractC1070m) {
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: g */
    public final void mo2614g(AbstractC1070m abstractC1070m) {
        if (this.f4348d) {
            m2616h();
        }
    }

    /* renamed from: h */
    public final void m2616h() {
        this.f4347c.setTag(R.id.save_overlay_view, null);
        this.f4345a.getOverlay().remove(this.f4346b);
        this.f4348d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m2616h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f4345a.getOverlay().remove(this.f4346b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f4346b;
        if (view.getParent() == null) {
            this.f4345a.getOverlay().add(view);
        } else {
            this.f4349e.mo2625c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.f4347c;
            View view2 = this.f4346b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f4345a.getOverlay().add(view2);
            this.f4348d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        m2616h();
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: a */
    public final void mo2608a() {
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: d */
    public final void mo2611d() {
    }
}
