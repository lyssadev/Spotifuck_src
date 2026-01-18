package p023N;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: N.D */
/* loaded from: classes.dex */
public abstract class AbstractC0193D {
    /* renamed from: a */
    public static WindowInsets m592a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: b */
    public static WindowInsets m593b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: c */
    public static void m594c(View view) {
        view.requestApplyInsets();
    }
}
