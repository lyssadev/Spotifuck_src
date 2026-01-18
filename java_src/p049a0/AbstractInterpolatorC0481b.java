package p049a0;

import android.view.animation.Interpolator;

/* renamed from: a0.b */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0481b implements Interpolator {

    /* renamed from: a */
    public final float[] f1157a;

    /* renamed from: b */
    public final float f1158b;

    public AbstractInterpolatorC0481b(float[] fArr) {
        this.f1157a = fArr;
        this.f1158b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1157a;
        int iMin = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f1158b;
        float f4 = (f2 - (iMin * f3)) / f3;
        float f5 = fArr[iMin];
        return ((fArr[iMin + 1] - f5) * f4) + f5;
    }
}
