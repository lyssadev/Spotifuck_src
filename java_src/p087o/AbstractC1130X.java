package p087o;

import android.widget.TextView;

/* renamed from: o.X */
/* loaded from: classes.dex */
public abstract class AbstractC1130X {
    /* renamed from: a */
    public static int m2749a(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    /* renamed from: b */
    public static void m2750b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static void m2751c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* renamed from: d */
    public static boolean m2752d(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}
