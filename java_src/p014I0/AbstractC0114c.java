package p014I0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import it.deviato.spotifuck.R;
import p091p0.AbstractC1230a;

/* renamed from: I0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0114c {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static Drawable m440b(Context context, int i) {
        ColorStateList colorStateListM2870I;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i, i, i, i);
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        TypedValue typedValueM2901o0 = AbstractC1230a.m2901o0(context, R.attr.colorControlHighlight);
        if (typedValueM2901o0 != null) {
            int i2 = typedValueM2901o0.resourceId;
            colorStateListM2870I = i2 != 0 ? AbstractC1230a.m2870I(context, i2) : ColorStateList.valueOf(typedValueM2901o0.data);
        } else {
            colorStateListM2870I = null;
        }
        if (colorStateListM2870I != null) {
            colorStateListValueOf = colorStateListM2870I;
        }
        return new RippleDrawable(colorStateListValueOf, null, insetDrawable);
    }
}
