package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import it.deviato.spotifuck.R;
import java.util.Calendar;
import p000A.C0001b;
import p074j0.AbstractC0888C;
import p074j0.AbstractC0912a0;
import p074j0.C0897L;

/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes.dex */
public final class C0692r extends AbstractC0888C {

    /* renamed from: c */
    public final C0676b f2484c;

    /* renamed from: d */
    public final C0001b f2485d;

    /* renamed from: e */
    public final int f2486e;

    public C0692r(ContextThemeWrapper contextThemeWrapper, C0676b c0676b, C0001b c0001b) {
        C0688n c0688n = c0676b.f2405a;
        C0688n c0688n2 = c0676b.f2408d;
        if (c0688n.f2468a.compareTo(c0688n2.f2468a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0688n2.f2468a.compareTo(c0676b.f2406b.f2468a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f2486e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C0689o.f2475d) + (C0686l.m1896N(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f2484c = c0676b;
        this.f2485d = c0001b;
        m2253f(true);
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: a */
    public final int mo1905a() {
        return this.f2484c.f2411g;
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: b */
    public final long mo1906b(int i) {
        Calendar calendarM1910a = AbstractC0696v.m1910a(this.f2484c.f2405a.f2468a);
        calendarM1910a.add(2, i);
        calendarM1910a.set(5, 1);
        Calendar calendarM1910a2 = AbstractC0696v.m1910a(calendarM1910a);
        calendarM1910a2.get(2);
        calendarM1910a2.get(1);
        calendarM1910a2.getMaximum(7);
        calendarM1910a2.getActualMaximum(5);
        calendarM1910a2.getTimeInMillis();
        return calendarM1910a2.getTimeInMillis();
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: d */
    public final void mo1907d(AbstractC0912a0 abstractC0912a0, int i) {
        C0691q c0691q = (C0691q) abstractC0912a0;
        C0676b c0676b = this.f2484c;
        Calendar calendarM1910a = AbstractC0696v.m1910a(c0676b.f2405a.f2468a);
        calendarM1910a.add(2, i);
        C0688n c0688n = new C0688n(calendarM1910a);
        c0691q.f2482t.setText(c0688n.m1900c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0691q.f2483u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m1889a() == null || !c0688n.equals(materialCalendarGridView.m1889a().f2477a)) {
            new C0689o(c0688n, c0676b);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m1889a().getClass();
        throw null;
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: e */
    public final AbstractC0912a0 mo1908e(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0686l.m1896N(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C0691q(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0897L(-1, this.f2486e));
        return new C0691q(linearLayout, true);
    }
}
