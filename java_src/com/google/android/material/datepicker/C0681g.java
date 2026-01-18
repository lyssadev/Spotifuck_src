package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p074j0.C0908X;

/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: classes.dex */
public final class C0681g extends LinearLayoutManager {

    /* renamed from: E */
    public final /* synthetic */ int f2422E;

    /* renamed from: F */
    public final /* synthetic */ C0684j f2423F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0681g(C0684j c0684j, int i, int i2) {
        super(i);
        this.f2423F = c0684j;
        this.f2422E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: A0 */
    public final void mo1708A0(C0908X c0908x, int[] iArr) {
        int i = this.f2422E;
        C0684j c0684j = this.f2423F;
        if (i == 0) {
            iArr[0] = c0684j.f2434g0.getWidth();
            iArr[1] = c0684j.f2434g0.getWidth();
        } else {
            iArr[0] = c0684j.f2434g0.getHeight();
            iArr[1] = c0684j.f2434g0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p074j0.AbstractC0896K
    /* renamed from: x0 */
    public final void mo1749x0(RecyclerView recyclerView, int i) {
        C0694t c0694t = new C0694t(recyclerView.getContext());
        c0694t.f3845a = i;
        m2298y0(c0694t);
    }
}
