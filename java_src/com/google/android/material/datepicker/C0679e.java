package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
public final class C0679e extends BaseAdapter {

    /* renamed from: d */
    public static final int f2415d;

    /* renamed from: a */
    public final Calendar f2416a;

    /* renamed from: b */
    public final int f2417b;

    /* renamed from: c */
    public final int f2418c;

    static {
        f2415d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C0679e() {
        Calendar calendarM1912c = AbstractC0696v.m1912c(null);
        this.f2416a = calendarM1912c;
        this.f2417b = calendarM1912c.getMaximum(7);
        this.f2418c = calendarM1912c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2417b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f2417b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f2418c;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f2418c;
        int i3 = this.f2417b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f2416a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, f2415d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0679e(int i) {
        Calendar calendarM1912c = AbstractC0696v.m1912c(null);
        this.f2416a = calendarM1912c;
        this.f2417b = calendarM1912c.getMaximum(7);
        this.f2418c = i;
    }
}
