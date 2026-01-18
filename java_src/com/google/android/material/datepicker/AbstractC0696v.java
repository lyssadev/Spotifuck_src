package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.v */
/* loaded from: classes.dex */
public abstract class AbstractC0696v {

    /* renamed from: a */
    public static final AtomicReference f2488a = new AtomicReference();

    /* renamed from: a */
    public static Calendar m1910a(Calendar calendar) {
        Calendar calendarM1912c = m1912c(calendar);
        Calendar calendarM1912c2 = m1912c(null);
        calendarM1912c2.set(calendarM1912c.get(1), calendarM1912c.get(2), calendarM1912c.get(5));
        return calendarM1912c2;
    }

    /* renamed from: b */
    public static Calendar m1911b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: c */
    public static Calendar m1912c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
