package p088o0;

import android.animation.TypeEvaluator;
import p009F.C0087f;
import p091p0.AbstractC1230a;

/* renamed from: o0.g */
/* loaded from: classes.dex */
public final class C1208g implements TypeEvaluator {

    /* renamed from: a */
    public C0087f[] f4799a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f2, Object obj, Object obj2) {
        C0087f[] c0087fArr = (C0087f[]) obj;
        C0087f[] c0087fArr2 = (C0087f[]) obj2;
        if (!AbstractC1230a.m2887g(c0087fArr, c0087fArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!AbstractC1230a.m2887g(this.f4799a, c0087fArr)) {
            this.f4799a = AbstractC1230a.m2856A(c0087fArr);
        }
        for (int i = 0; i < c0087fArr.length; i++) {
            C0087f c0087f = this.f4799a[i];
            C0087f c0087f2 = c0087fArr[i];
            C0087f c0087f3 = c0087fArr2[i];
            c0087f.getClass();
            c0087f.f254a = c0087f2.f254a;
            int i2 = 0;
            while (true) {
                float[] fArr = c0087f2.f255b;
                if (i2 < fArr.length) {
                    c0087f.f255b[i2] = (c0087f3.f255b[i2] * f2) + ((1.0f - f2) * fArr[i2]);
                    i2++;
                }
            }
        }
        return this.f4799a;
    }
}
