package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p074j0.AbstractC0893H;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public final class C0682h extends AbstractC0893H {

    /* renamed from: a */
    public final /* synthetic */ C0684j f2424a;

    public C0682h(C0684j c0684j) {
        this.f2424a = c0684j;
        AbstractC0696v.m1912c(null);
        AbstractC0696v.m1912c(null);
    }

    @Override // p074j0.AbstractC0893H
    /* renamed from: b */
    public final void mo1890b(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C0698x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f2424a.getClass();
            throw null;
        }
    }
}
