package p024N0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import p087o.C1146d0;

/* renamed from: N0.s */
/* loaded from: classes.dex */
public final class C0291s extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f748a;

    /* renamed from: b */
    public final /* synthetic */ TextView f749b;

    /* renamed from: c */
    public final /* synthetic */ int f750c;

    /* renamed from: d */
    public final /* synthetic */ TextView f751d;

    /* renamed from: e */
    public final /* synthetic */ C0293u f752e;

    public C0291s(C0293u c0293u, int i, TextView textView, int i2, TextView textView2) {
        this.f752e = c0293u;
        this.f748a = i;
        this.f749b = textView;
        this.f750c = i2;
        this.f751d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1146d0 c1146d0;
        int i = this.f748a;
        C0293u c0293u = this.f752e;
        c0293u.f769n = i;
        c0293u.f767l = null;
        TextView textView = this.f749b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f750c == 1 && (c1146d0 = c0293u.f773r) != null) {
                c1146d0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f751d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f751d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
