package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p074j0.AbstractC0896K;
import p074j0.AbstractC0899N;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
public final class C0683i extends AbstractC0899N {

    /* renamed from: a */
    public final /* synthetic */ C0692r f2425a;

    /* renamed from: b */
    public final /* synthetic */ MaterialButton f2426b;

    /* renamed from: c */
    public final /* synthetic */ C0684j f2427c;

    public C0683i(C0684j c0684j, C0692r c0692r, MaterialButton materialButton) {
        this.f2427c = c0684j;
        this.f2425a = c0692r;
        this.f2426b = materialButton;
    }

    @Override // p074j0.AbstractC0899N
    /* renamed from: a */
    public final void mo1891a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f2426b.getText());
        }
    }

    @Override // p074j0.AbstractC0899N
    /* renamed from: b */
    public final void mo1892b(RecyclerView recyclerView, int i, int i2) {
        int iM1717K0;
        String dateTime;
        C0684j c0684j = this.f2427c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0684j.f2434g0.getLayoutManager();
            View viewM1720M0 = linearLayoutManager.m1720M0(0, linearLayoutManager.m2296v(), false);
            iM1717K0 = viewM1720M0 == null ? -1 : AbstractC0896K.m2268H(viewM1720M0);
        } else {
            iM1717K0 = ((LinearLayoutManager) c0684j.f2434g0.getLayoutManager()).m1717K0();
        }
        C0676b c0676b = this.f2425a.f2484c;
        Calendar calendarM1910a = AbstractC0696v.m1910a(c0676b.f2405a.f2468a);
        calendarM1910a.add(2, iM1717K0);
        c0684j.f2430c0 = new C0688n(calendarM1910a);
        Calendar calendarM1910a2 = AbstractC0696v.m1910a(c0676b.f2405a.f2468a);
        calendarM1910a2.add(2, iM1717K0);
        calendarM1910a2.set(5, 1);
        Calendar calendarM1910a3 = AbstractC0696v.m1910a(calendarM1910a2);
        calendarM1910a3.get(2);
        calendarM1910a3.get(1);
        calendarM1910a3.getMaximum(7);
        calendarM1910a3.getActualMaximum(5);
        calendarM1910a3.getTimeInMillis();
        long timeInMillis = calendarM1910a3.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = AbstractC0696v.f2488a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            dateTime = instanceForSkeleton.format(new Date(timeInMillis));
        } else {
            dateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f2426b.setText(dateTime);
    }
}
