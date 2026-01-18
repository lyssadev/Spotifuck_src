package p023N;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* renamed from: N.H */
/* loaded from: classes.dex */
public abstract class AbstractC0197H {
    /* renamed from: a */
    public static void m625a(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    /* renamed from: b */
    public static AutofillId m626b(View view) {
        return view.getAutofillId();
    }

    /* renamed from: c */
    public static int m627c(View view) {
        return view.getImportantForAutofill();
    }

    /* renamed from: d */
    public static int m628d(View view) {
        return view.getNextClusterForwardId();
    }

    /* renamed from: e */
    public static boolean m629e(View view) {
        return view.hasExplicitFocusable();
    }

    /* renamed from: f */
    public static boolean m630f(View view) {
        return view.isFocusedByDefault();
    }

    /* renamed from: g */
    public static boolean m631g(View view) {
        return view.isImportantForAutofill();
    }

    /* renamed from: h */
    public static boolean m632h(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* renamed from: i */
    public static View m633i(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* renamed from: j */
    public static boolean m634j(View view) {
        return view.restoreDefaultFocus();
    }

    /* renamed from: k */
    public static void m635k(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* renamed from: l */
    public static void m636l(View view, boolean z2) {
        view.setFocusedByDefault(z2);
    }

    /* renamed from: m */
    public static void m637m(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* renamed from: n */
    public static void m638n(View view, boolean z2) {
        view.setKeyboardNavigationCluster(z2);
    }

    /* renamed from: o */
    public static void m639o(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* renamed from: p */
    public static void m640p(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
