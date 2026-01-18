package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import it.deviato.spotifuck.R;
import p008E0.AbstractC0079m;
import p011G0.C0104a;
import p024N0.C0296x;
import p026O0.C0320a;
import p028P0.AbstractC0322a;
import p035T.AbstractC0385b;
import p068h.C0822G;
import p087o.C1091D;
import p087o.C1146d0;
import p087o.C1178o;
import p087o.C1180p;
import p087o.C1182q;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;
import p112y0.C1364c;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0822G {
    @Override // p068h.C0822G
    /* renamed from: a */
    public final C1178o mo1942a(Context context, AttributeSet attributeSet) {
        return new C0296x(context, attributeSet);
    }

    @Override // p068h.C0822G
    /* renamed from: b */
    public final C1180p mo1943b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p068h.C0822G
    /* renamed from: c */
    public final C1182q mo1944c(Context context, AttributeSet attributeSet) {
        return new C1364c(context, attributeSet);
    }

    @Override // p068h.C0822G
    /* renamed from: d */
    public final C1091D mo1945d(Context context, AttributeSet attributeSet) {
        C0104a c0104a = new C0104a(AbstractC0322a.m923a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0104a.getContext();
        TypedArray typedArrayM321f = AbstractC0079m.m321f(context2, attributeSet, AbstractC1241a.f4951o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM321f.hasValue(0)) {
            AbstractC0385b.m982c(c0104a, AbstractC1230a.m2871J(context2, typedArrayM321f, 0));
        }
        c0104a.f288k = typedArrayM321f.getBoolean(1, false);
        typedArrayM321f.recycle();
        return c0104a;
    }

    @Override // p068h.C0822G
    /* renamed from: e */
    public final C1146d0 mo1946e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        C0320a c0320a = new C0320a(AbstractC0322a.m923a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c0320a.getContext();
        if (AbstractC1230a.m2903p0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC1241a.f4954r;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iM919h = C0320a.m919h(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM919h == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC1241a.f4953q);
                    int iM919h2 = C0320a.m919h(c0320a.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM919h2 >= 0) {
                        c0320a.setLineHeight(iM919h2);
                    }
                }
            }
        }
        return c0320a;
    }
}
