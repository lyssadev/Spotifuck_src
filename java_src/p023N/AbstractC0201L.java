package p023N;

import android.view.View;

/* renamed from: N.L */
/* loaded from: classes.dex */
public abstract class AbstractC0201L {
    /* renamed from: a */
    public static int m657a(View view) {
        return view.getImportantForContentCapture();
    }

    /* renamed from: b */
    public static CharSequence m658b(View view) {
        return view.getStateDescription();
    }

    /* renamed from: c */
    public static boolean m659c(View view) {
        return view.isImportantForContentCapture();
    }

    /* renamed from: d */
    public static void m660d(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    /* renamed from: e */
    public static void m661e(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
