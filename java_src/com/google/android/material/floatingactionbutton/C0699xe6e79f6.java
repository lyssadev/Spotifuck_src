package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000A.AbstractC0002c;
import p000A.C0005f;
import p094q0.AbstractC1241a;

/* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* loaded from: classes.dex */
public class C0699xe6e79f6<T> extends AbstractC0002c {
    public C0699xe6e79f6() {
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: a */
    public final /* synthetic */ boolean mo61a(View view) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: c */
    public final void mo63c(C0005f c0005f) {
        if (c0005f.f11h == 0) {
            c0005f.f11h = 80;
        }
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: d */
    public final boolean mo64d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p000A.AbstractC0002c
    /* renamed from: g */
    public final boolean mo67g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public C0699xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1241a.f4942f);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
