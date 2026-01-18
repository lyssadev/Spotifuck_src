package p035T;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* renamed from: T.n */
/* loaded from: classes.dex */
public abstract class AbstractC0397n {
    /* renamed from: a */
    public static int m1003a(TextView textView) {
        return textView.getBreakStrategy();
    }

    /* renamed from: b */
    public static ColorStateList m1004b(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    /* renamed from: c */
    public static PorterDuff.Mode m1005c(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    /* renamed from: d */
    public static int m1006d(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    /* renamed from: e */
    public static void m1007e(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    /* renamed from: f */
    public static void m1008f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    /* renamed from: g */
    public static void m1009g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    /* renamed from: h */
    public static void m1010h(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
