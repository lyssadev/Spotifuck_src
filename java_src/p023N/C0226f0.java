package p023N;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import it.deviato.spotifuck.R;
import java.util.List;
import p007E.C0057j;
import p049a0.C0480a;

/* renamed from: N.f0 */
/* loaded from: classes.dex */
public final class C0226f0 extends AbstractC0232i0 {

    /* renamed from: e */
    public static final PathInterpolator f594e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f */
    public static final C0480a f595f = new C0480a();

    /* renamed from: g */
    public static final DecelerateInterpolator f596g = new DecelerateInterpolator();

    /* renamed from: e */
    public static void m715e(View view) {
        C0221d c0221dM720j = m720j(view);
        if (c0221dM720j != null) {
            ((View) c0221dM720j.f586j).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m715e(viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: f */
    public static void m716f(View view, WindowInsets windowInsets, boolean z2) {
        C0221d c0221dM720j = m720j(view);
        if (c0221dM720j != null) {
            c0221dM720j.f583g = windowInsets;
            if (!z2) {
                View view2 = (View) c0221dM720j.f586j;
                int[] iArr = (int[]) c0221dM720j.f587k;
                view2.getLocationOnScreen(iArr);
                z2 = true;
                c0221dM720j.f584h = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m716f(viewGroup.getChildAt(i), windowInsets, z2);
            }
        }
    }

    /* renamed from: g */
    public static void m717g(View view, C0260w0 c0260w0, List list) {
        C0221d c0221dM720j = m720j(view);
        if (c0221dM720j != null) {
            c0221dM720j.m714c(c0260w0, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m717g(viewGroup.getChildAt(i), c0260w0, list);
            }
        }
    }

    /* renamed from: h */
    public static void m718h(View view, C0057j c0057j) {
        C0221d c0221dM720j = m720j(view);
        if (c0221dM720j != null) {
            View view2 = (View) c0221dM720j.f586j;
            int[] iArr = (int[]) c0221dM720j.f587k;
            view2.getLocationOnScreen(iArr);
            int i = c0221dM720j.f584h - iArr[1];
            c0221dM720j.f585i = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m718h(viewGroup.getChildAt(i2), c0057j);
            }
        }
    }

    /* renamed from: i */
    public static WindowInsets m719i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: j */
    public static C0221d m720j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof ViewOnApplyWindowInsetsListenerC0224e0) {
            return ((ViewOnApplyWindowInsetsListenerC0224e0) tag).f591a;
        }
        return null;
    }
}
