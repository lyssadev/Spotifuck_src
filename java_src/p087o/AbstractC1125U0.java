package p087o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p009F.AbstractC0082a;
import p065g.AbstractC0752a;
import p091p0.AbstractC1230a;

/* renamed from: o.U0 */
/* loaded from: classes.dex */
public abstract class AbstractC1125U0 {

    /* renamed from: a */
    public static final ThreadLocal f4557a = new ThreadLocal();

    /* renamed from: b */
    public static final int[] f4558b = {-16842910};

    /* renamed from: c */
    public static final int[] f4559c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f4560d = {R.attr.state_pressed};

    /* renamed from: e */
    public static final int[] f4561e = {R.attr.state_checked};

    /* renamed from: f */
    public static final int[] f4562f = new int[0];

    /* renamed from: g */
    public static final int[] f4563g = new int[1];

    /* renamed from: a */
    public static void m2741a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0752a.f2746j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m2742b(Context context, int i) {
        ColorStateList colorStateListM2744d = m2744d(context, i);
        if (colorStateListM2744d != null && colorStateListM2744d.isStateful()) {
            return colorStateListM2744d.getColorForState(f4558b, colorStateListM2744d.getDefaultColor());
        }
        ThreadLocal threadLocal = f4557a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        return AbstractC0082a.m326d(m2743c(context, i), Math.round(Color.alpha(r4) * f2));
    }

    /* renamed from: c */
    public static int m2743c(Context context, int i) {
        int[] iArr = f4563g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public static ColorStateList m2744d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f4563g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC1230a.m2870I(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
