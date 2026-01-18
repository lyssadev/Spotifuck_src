package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
public final class C0687m<S> extends AbstractC0693s {

    /* renamed from: a0 */
    public int f2466a0;

    /* renamed from: b0 */
    public C0676b f2467b0;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: t */
    public final void mo1572t(Bundle bundle) {
        super.mo1572t(bundle);
        if (bundle == null) {
            bundle = this.f1923k;
        }
        this.f2466a0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2467b0 = (C0676b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: u */
    public final View mo1598u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m1588h(), this.f2466a0));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: y */
    public final void mo1576y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2466a0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2467b0);
    }
}
