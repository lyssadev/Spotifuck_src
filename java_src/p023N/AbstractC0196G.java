package p023N;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: N.G */
/* loaded from: classes.dex */
public abstract class AbstractC0196G {
    /* renamed from: a */
    public static C0260w0 m621a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0260w0 c0260w0M800g = C0260w0.m800g(null, rootWindowInsets);
        C0256u0 c0256u0 = c0260w0M800g.f658a;
        c0256u0.mo779p(c0260w0M800g);
        c0256u0.mo773d(view.getRootView());
        return c0260w0M800g;
    }

    /* renamed from: b */
    public static int m622b(View view) {
        return view.getScrollIndicators();
    }

    /* renamed from: c */
    public static void m623c(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* renamed from: d */
    public static void m624d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
