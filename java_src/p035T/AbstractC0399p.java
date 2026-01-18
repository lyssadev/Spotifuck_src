package p035T;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: T.p */
/* loaded from: classes.dex */
public abstract class AbstractC0399p {
    /* renamed from: b */
    public static String[] m1013b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* renamed from: c */
    public static PrecomputedText.Params m1014c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    /* renamed from: d */
    public static void m1015d(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* renamed from: a */
    public static CharSequence m1012a(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
