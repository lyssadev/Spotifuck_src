package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import p074j0.AbstractC0896K;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0680f implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f2419f;

    /* renamed from: g */
    public final /* synthetic */ C0692r f2420g;

    /* renamed from: h */
    public final /* synthetic */ C0684j f2421h;

    public /* synthetic */ ViewOnClickListenerC0680f(C0684j c0684j, C0692r c0692r, int i) {
        this.f2419f = i;
        this.f2421h = c0684j;
        this.f2420g = c0692r;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2419f) {
            case 0:
                C0684j c0684j = this.f2421h;
                int iM1717K0 = ((LinearLayoutManager) c0684j.f2434g0.getLayoutManager()).m1717K0() - 1;
                if (iM1717K0 >= 0) {
                    Calendar calendarM1910a = AbstractC0696v.m1910a(this.f2420g.f2484c.f2405a.f2468a);
                    calendarM1910a.add(2, iM1717K0);
                    c0684j.m1893K(new C0688n(calendarM1910a));
                    break;
                }
                break;
            default:
                C0684j c0684j2 = this.f2421h;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0684j2.f2434g0.getLayoutManager();
                View viewM1720M0 = linearLayoutManager.m1720M0(0, linearLayoutManager.m2296v(), false);
                int iM2268H = (viewM1720M0 == null ? -1 : AbstractC0896K.m2268H(viewM1720M0)) + 1;
                if (iM2268H < c0684j2.f2434g0.getAdapter().mo1905a()) {
                    Calendar calendarM1910a2 = AbstractC0696v.m1910a(this.f2420g.f2484c.f2405a.f2468a);
                    calendarM1910a2.add(2, iM2268H);
                    c0684j2.m1893K(new C0688n(calendarM1910a2));
                    break;
                }
                break;
        }
    }
}
