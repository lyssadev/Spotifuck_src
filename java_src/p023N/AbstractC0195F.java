package p023N;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import it.deviato.spotifuck.R;
import p009F.C0084c;

/* renamed from: N.F */
/* loaded from: classes.dex */
public abstract class AbstractC0195F {
    /* renamed from: a */
    public static void m595a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* renamed from: b */
    public static C0260w0 m596b(View view, C0260w0 c0260w0, Rect rect) {
        WindowInsets windowInsetsM805f = c0260w0.m805f();
        if (windowInsetsM805f != null) {
            return C0260w0.m800g(view, view.computeSystemWindowInsets(windowInsetsM805f, rect));
        }
        rect.setEmpty();
        return c0260w0;
    }

    /* renamed from: c */
    public static boolean m597c(View view, float f2, float f3, boolean z2) {
        return view.dispatchNestedFling(f2, f3, z2);
    }

    /* renamed from: d */
    public static boolean m598d(View view, float f2, float f3) {
        return view.dispatchNestedPreFling(f2, f3);
    }

    /* renamed from: e */
    public static boolean m599e(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* renamed from: f */
    public static boolean m600f(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* renamed from: g */
    public static ColorStateList m601g(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: h */
    public static PorterDuff.Mode m602h(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: i */
    public static float m603i(View view) {
        return view.getElevation();
    }

    /* renamed from: j */
    public static C0260w0 m604j(View view) throws IllegalAccessException, IllegalArgumentException {
        if (!AbstractC0236k0.f620d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC0236k0.f617a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC0236k0.f618b.get(obj);
            Rect rect2 = (Rect) AbstractC0236k0.f619c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            AbstractC0244o0 c0242n0 = i >= 30 ? new C0242n0() : i >= 29 ? new C0240m0() : new C0238l0();
            c0242n0.mo735e(C0084c.m329b(rect.left, rect.top, rect.right, rect.bottom));
            c0242n0.mo736g(C0084c.m329b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            C0260w0 c0260w0Mo734b = c0242n0.mo734b();
            c0260w0Mo734b.f658a.mo779p(c0260w0Mo734b);
            c0260w0Mo734b.f658a.mo773d(view.getRootView());
            return c0260w0Mo734b;
        } catch (IllegalAccessException e) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: k */
    public static String m605k(View view) {
        return view.getTransitionName();
    }

    /* renamed from: l */
    public static float m606l(View view) {
        return view.getTranslationZ();
    }

    /* renamed from: m */
    public static float m607m(View view) {
        return view.getZ();
    }

    /* renamed from: n */
    public static boolean m608n(View view) {
        return view.hasNestedScrollingParent();
    }

    /* renamed from: o */
    public static boolean m609o(View view) {
        return view.isImportantForAccessibility();
    }

    /* renamed from: p */
    public static boolean m610p(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: q */
    public static void m611q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* renamed from: r */
    public static void m612r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* renamed from: s */
    public static void m613s(View view, float f2) {
        view.setElevation(f2);
    }

    /* renamed from: t */
    public static void m614t(View view, boolean z2) {
        view.setNestedScrollingEnabled(z2);
    }

    /* renamed from: u */
    public static void m615u(View view, InterfaceC0249r interfaceC0249r) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0249r);
        }
        if (interfaceC0249r == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0194E(view, interfaceC0249r));
        }
    }

    /* renamed from: v */
    public static void m616v(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: w */
    public static void m617w(View view, float f2) {
        view.setTranslationZ(f2);
    }

    /* renamed from: x */
    public static void m618x(View view, float f2) {
        view.setZ(f2);
    }

    /* renamed from: y */
    public static boolean m619y(View view, int i) {
        return view.startNestedScroll(i);
    }

    /* renamed from: z */
    public static void m620z(View view) {
        view.stopNestedScroll();
    }
}
