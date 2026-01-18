package p014I0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: I0.d */
/* loaded from: classes.dex */
public abstract class AbstractC0115d {

    /* renamed from: a */
    public static final int[] f315a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: b */
    public static final String f316b = AbstractC0115d.class.getSimpleName();

    /* renamed from: a */
    public static ColorStateList m441a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f315a, 0)) != 0) {
            Log.w(f316b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static boolean m442b(int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z2 = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }
}
