package com.google.android.material.datepicker;

import android.view.View;
import p023N.C0260w0;
import p023N.InterfaceC0249r;

/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: classes.dex */
public final class C0685k implements InterfaceC0249r {

    /* renamed from: f */
    public final View f2439f;

    /* renamed from: g */
    public int f2440g;

    /* renamed from: h */
    public int f2441h;

    public C0685k(View view) {
        this.f2439f = view;
    }

    @Override // p023N.InterfaceC0249r
    /* renamed from: l */
    public C0260w0 mo47l(View view, C0260w0 c0260w0) {
        int i = c0260w0.f658a.mo774f(7).f250b;
        View view2 = this.f2439f;
        int i2 = this.f2440g;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f2441h + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return c0260w0;
    }

    public C0685k(View view, int i, int i2) {
        this.f2440g = i;
        this.f2439f = view;
        this.f2441h = i2;
    }
}
