package p023N;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p009F.C0084c;

/* renamed from: N.c0 */
/* loaded from: classes.dex */
public final class C0220c0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C0234j0 f577a;

    /* renamed from: b */
    public final /* synthetic */ C0260w0 f578b;

    /* renamed from: c */
    public final /* synthetic */ C0260w0 f579c;

    /* renamed from: d */
    public final /* synthetic */ int f580d;

    /* renamed from: e */
    public final /* synthetic */ View f581e;

    public C0220c0(C0234j0 c0234j0, C0260w0 c0260w0, C0260w0 c0260w02, int i, View view) {
        this.f577a = c0234j0;
        this.f578b = c0260w0;
        this.f579c = c0260w02;
        this.f580d = i;
        this.f581e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f2;
        C0234j0 c0234j0;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0234j0 c0234j02 = this.f577a;
        c0234j02.f616a.mo726d(animatedFraction);
        float fMo724b = c0234j02.f616a.mo724b();
        PathInterpolator pathInterpolator = C0226f0.f594e;
        int i = Build.VERSION.SDK_INT;
        C0260w0 c0260w0 = this.f578b;
        AbstractC0244o0 c0242n0 = i >= 30 ? new C0242n0(c0260w0) : i >= 29 ? new C0240m0(c0260w0) : new C0238l0(c0260w0);
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.f580d & i2;
            C0256u0 c0256u0 = c0260w0.f658a;
            if (i3 == 0) {
                c0242n0.mo761c(i2, c0256u0.mo774f(i2));
                f2 = fMo724b;
                c0234j0 = c0234j02;
            } else {
                C0084c c0084cMo774f = c0256u0.mo774f(i2);
                C0084c c0084cMo774f2 = this.f579c.f658a.mo774f(i2);
                int i4 = (int) (((c0084cMo774f.f249a - c0084cMo774f2.f249a) * r10) + 0.5d);
                int i5 = (int) (((c0084cMo774f.f250b - c0084cMo774f2.f250b) * r10) + 0.5d);
                f2 = fMo724b;
                int i6 = (int) (((c0084cMo774f.f251c - c0084cMo774f2.f251c) * r10) + 0.5d);
                float f3 = (c0084cMo774f.f252d - c0084cMo774f2.f252d) * (1.0f - fMo724b);
                c0234j0 = c0234j02;
                c0242n0.mo761c(i2, C0260w0.m799e(c0084cMo774f, i4, i5, i6, (int) (f3 + 0.5d)));
            }
            i2 <<= 1;
            fMo724b = f2;
            c0234j02 = c0234j0;
        }
        C0226f0.m717g(this.f581e, c0242n0.mo734b(), Collections.singletonList(c0234j02));
    }
}
