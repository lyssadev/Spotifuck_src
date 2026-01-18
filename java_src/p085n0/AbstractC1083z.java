package p085n0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: n0.z */
/* loaded from: classes.dex */
public abstract class AbstractC1083z {
    /* renamed from: a */
    public static void m2676a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: b */
    public static void m2677b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: c */
    public static void m2678c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
