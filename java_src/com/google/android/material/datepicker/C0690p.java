package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes.dex */
public final class C0690p implements AdapterView.OnItemClickListener {

    /* renamed from: f */
    public final /* synthetic */ MaterialCalendarGridView f2480f;

    /* renamed from: g */
    public final /* synthetic */ C0692r f2481g;

    public C0690p(C0692r c0692r, MaterialCalendarGridView materialCalendarGridView) {
        this.f2481g = c0692r;
        this.f2480f = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f2480f;
        C0689o c0689oM1889a = materialCalendarGridView.m1889a();
        if (i < c0689oM1889a.m1902a() || i > c0689oM1889a.m1904c()) {
            return;
        }
        if (materialCalendarGridView.m1889a().getItem(i).longValue() >= ((C0684j) this.f2481g.f2485d.f2g).f2429b0.f2407c.f2414a) {
            throw null;
        }
    }
}
