package p085n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p036T0.AbstractC0411g;

/* renamed from: n0.F */
/* loaded from: classes.dex */
public final class C1055F extends AnimatorListenerAdapter implements InterfaceC1068k {

    /* renamed from: a */
    public final View f4339a;

    /* renamed from: b */
    public final int f4340b;

    /* renamed from: c */
    public final ViewGroup f4341c;

    /* renamed from: e */
    public boolean f4343e;

    /* renamed from: f */
    public boolean f4344f = false;

    /* renamed from: d */
    public final boolean f4342d = true;

    public C1055F(View view, int i) {
        this.f4339a = view;
        this.f4340b = i;
        this.f4341c = (ViewGroup) view.getParent();
        m2615h(true);
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: a */
    public final void mo2608a() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        m2615h(false);
        if (this.f4344f) {
            return;
        }
        AbstractC1080w.m2664b(this.f4339a, this.f4340b);
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
    /* renamed from: d */
    public final void mo2611d() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        m2615h(true);
        if (this.f4344f) {
            return;
        }
        AbstractC1080w.m2664b(this.f4339a, 0);
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

    /* renamed from: h */
    public final void m2615h(boolean z2) {
        ViewGroup viewGroup;
        if (!this.f4342d || this.f4343e == z2 || (viewGroup = this.f4341c) == null) {
            return;
        }
        this.f4343e = z2;
        AbstractC0411g.m1027Q(viewGroup, z2);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f4344f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!this.f4344f) {
            AbstractC1080w.m2664b(this.f4339a, this.f4340b);
            ViewGroup viewGroup = this.f4341c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2615h(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z2) {
            AbstractC1080w.m2664b(this.f4339a, 0);
            ViewGroup viewGroup = this.f4341c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (z2) {
            return;
        }
        if (!this.f4344f) {
            AbstractC1080w.m2664b(this.f4339a, this.f4340b);
            ViewGroup viewGroup = this.f4341c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        m2615h(false);
    }

    @Override // p085n0.InterfaceC1068k
    /* renamed from: g */
    public final void mo2614g(AbstractC1070m abstractC1070m) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
