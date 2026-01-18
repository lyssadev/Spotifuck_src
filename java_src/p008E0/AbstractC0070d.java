package p008E0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: E0.d */
/* loaded from: classes.dex */
public abstract class AbstractC0070d {

    /* renamed from: a */
    public static final ThreadLocal f210a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f211b = new ThreadLocal();

    /* renamed from: a */
    public static void m310a(ViewGroup viewGroup, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            m310a(viewGroup, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
