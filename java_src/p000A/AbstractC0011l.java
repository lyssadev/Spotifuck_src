package p000A;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: A.l */
/* loaded from: classes.dex */
public abstract class AbstractC0011l {

    /* renamed from: a */
    public static final ThreadLocal f27a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f28b = new ThreadLocal();

    /* renamed from: a */
    public static void m97a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            m97a(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
