package p085n0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: n0.E */
/* loaded from: classes.dex */
public final class C1054E extends C1053D {
    @Override // p018K0.C0146e
    /* renamed from: f */
    public final float mo499f(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p085n0.C1051B, p018K0.C0146e
    /* renamed from: n */
    public final void mo503n(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p018K0.C0146e
    /* renamed from: o */
    public final void mo504o(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // p085n0.C1053D, p018K0.C0146e
    /* renamed from: p */
    public final void mo505p(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p018K0.C0146e
    /* renamed from: q */
    public final void mo506q(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p018K0.C0146e
    /* renamed from: r */
    public final void mo507r(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
