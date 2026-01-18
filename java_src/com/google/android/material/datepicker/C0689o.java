package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.o */
/* loaded from: classes.dex */
public final class C0689o extends BaseAdapter {

    /* renamed from: d */
    public static final int f2475d = AbstractC0696v.m1912c(null).getMaximum(4);

    /* renamed from: e */
    public static final int f2476e = (AbstractC0696v.m1912c(null).getMaximum(7) + AbstractC0696v.m1912c(null).getMaximum(5)) - 1;

    /* renamed from: a */
    public final C0688n f2477a;

    /* renamed from: b */
    public C0677c f2478b;

    /* renamed from: c */
    public final C0676b f2479c;

    public C0689o(C0688n c0688n, C0676b c0676b) {
        this.f2477a = c0688n;
        this.f2479c = c0676b;
        throw null;
    }

    /* renamed from: a */
    public final int m1902a() {
        int firstDayOfWeek = this.f2479c.f2409e;
        C0688n c0688n = this.f2477a;
        Calendar calendar = c0688n.f2468a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + c0688n.f2471d : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m1902a() || i > m1904c()) {
            return null;
        }
        int iM1902a = (i - m1902a()) + 1;
        Calendar calendarM1910a = AbstractC0696v.m1910a(this.f2477a.f2468a);
        calendarM1910a.set(5, iM1902a);
        return Long.valueOf(calendarM1910a.getTimeInMillis());
    }

    /* renamed from: c */
    public final int m1904c() {
        return (m1902a() + this.f2477a.f2472e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f2476e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f2477a.f2471d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f2478b == null) {
            this.f2478b = new C0677c(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iM1902a = i - m1902a();
        if (iM1902a >= 0) {
            C0688n c0688n = this.f2477a;
            if (iM1902a >= c0688n.f2472e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(c0688n);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iM1902a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        }
        if (getItem(i) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        AbstractC0696v.m1911b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
