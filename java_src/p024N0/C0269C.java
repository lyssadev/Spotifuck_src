package p024N0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import p018K0.C0147f;
import p018K0.C0148g;
import p074j0.C0934m;

/* renamed from: N0.C */
/* loaded from: classes.dex */
public final class C0269C implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f671a;

    /* renamed from: b */
    public final /* synthetic */ Object f672b;

    public /* synthetic */ C0269C(int i, Object obj) {
        this.f671a = i;
        this.f672b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f671a) {
            case 0:
                ((TextInputLayout) this.f672b).f2539A0.m307k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0934m c0934m = (C0934m) this.f672b;
                c0934m.f3775c.setAlpha(iFloatValue);
                c0934m.f3776d.setAlpha(iFloatValue);
                c0934m.f3791s.invalidate();
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0148g c0148g = ((BottomSheetBehavior) this.f672b).f2333i;
                if (c0148g != null) {
                    C0147f c0147f = c0148g.f410f;
                    if (c0147f.f400i != fFloatValue) {
                        c0147f.f400i = fFloatValue;
                        c0148g.f414j = true;
                        c0148g.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
