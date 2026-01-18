package p018K0;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: K0.r */
/* loaded from: classes.dex */
public final class C0159r extends AbstractC0160s {

    /* renamed from: b */
    public float f482b;

    /* renamed from: c */
    public float f483c;

    @Override // p018K0.AbstractC0160s
    /* renamed from: a */
    public final void mo532a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f484a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f482b, this.f483c);
        path.transform(matrix);
    }
}
