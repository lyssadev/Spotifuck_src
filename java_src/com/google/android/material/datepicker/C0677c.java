package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import it.deviato.spotifuck.R;
import p018K0.C0146e;
import p091p0.AbstractC1230a;
import p094q0.AbstractC1241a;

/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: classes.dex */
public final class C0677c {

    /* renamed from: a */
    public final C0146e f2412a;

    /* renamed from: b */
    public final C0146e f2413b;

    public C0677c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC1230a.m2909s0(context, R.attr.materialCalendarStyle, C0684j.class.getCanonicalName()).data, AbstractC1241a.f4948l);
        C0146e.m493a(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        C0146e.m493a(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        C0146e.m493a(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        C0146e.m493a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM2871J = AbstractC1230a.m2871J(context, typedArrayObtainStyledAttributes, 7);
        this.f2412a = C0146e.m493a(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        C0146e.m493a(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f2413b = C0146e.m493a(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListM2871J.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
