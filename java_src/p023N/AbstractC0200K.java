package p023N;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import p031R.AbstractC0358a;

/* renamed from: N.K */
/* loaded from: classes.dex */
public abstract class AbstractC0200K {
    /* renamed from: a */
    public static View.AccessibilityDelegate m651a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* renamed from: b */
    public static ContentCaptureSession m652b(View view) {
        return view.getContentCaptureSession();
    }

    /* renamed from: c */
    public static List<Rect> m653c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* renamed from: d */
    public static void m654d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* renamed from: e */
    public static void m655e(View view, AbstractC0358a abstractC0358a) {
        view.setContentCaptureSession(null);
    }

    /* renamed from: f */
    public static void m656f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
