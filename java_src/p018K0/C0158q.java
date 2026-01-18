package p018K0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: K0.q */
/* loaded from: classes.dex */
public final class C0158q extends AbstractC0160s {

    /* renamed from: h */
    public static final RectF f475h = new RectF();

    /* renamed from: b */
    public final float f476b;

    /* renamed from: c */
    public final float f477c;

    /* renamed from: d */
    public final float f478d;

    /* renamed from: e */
    public final float f479e;

    /* renamed from: f */
    public float f480f;

    /* renamed from: g */
    public float f481g;

    public C0158q(float f2, float f3, float f4, float f5) {
        this.f476b = f2;
        this.f477c = f3;
        this.f478d = f4;
        this.f479e = f5;
    }

    @Override // p018K0.AbstractC0160s
    /* renamed from: a */
    public final void mo532a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f484a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f475h;
        rectF.set(this.f476b, this.f477c, this.f478d, this.f479e);
        path.arcTo(rectF, this.f480f, this.f481g, false);
        path.transform(matrix);
    }
}
