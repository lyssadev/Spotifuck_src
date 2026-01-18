package p023N;

import android.animation.ValueAnimator;
import android.view.View;
import p000A.C0001b;
import p024N0.C0284l;
import p068h.C0829N;

/* renamed from: N.X */
/* loaded from: classes.dex */
public final /* synthetic */ class C0212X implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f568a = 0;

    /* renamed from: b */
    public final /* synthetic */ Object f569b;

    public /* synthetic */ C0212X(C0001b c0001b, View view) {
        this.f569b = c0001b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f568a) {
            case 0:
                ((View) ((C0829N) ((C0001b) this.f569b).f2g).f3201o.getParent()).invalidate();
                break;
            default:
                C0284l c0284l = (C0284l) this.f569b;
                c0284l.getClass();
                c0284l.f747d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ C0212X(C0284l c0284l) {
        this.f569b = c0284l;
    }
}
