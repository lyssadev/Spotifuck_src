package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p035T.C0394k;

/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
public final class C0688n implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0688n> CREATOR = new C0394k(13);

    /* renamed from: a */
    public final Calendar f2468a;

    /* renamed from: b */
    public final int f2469b;

    /* renamed from: c */
    public final int f2470c;

    /* renamed from: d */
    public final int f2471d;

    /* renamed from: e */
    public final int f2472e;

    /* renamed from: f */
    public final long f2473f;

    /* renamed from: g */
    public String f2474g;

    public C0688n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM1910a = AbstractC0696v.m1910a(calendar);
        this.f2468a = calendarM1910a;
        this.f2469b = calendarM1910a.get(2);
        this.f2470c = calendarM1910a.get(1);
        this.f2471d = calendarM1910a.getMaximum(7);
        this.f2472e = calendarM1910a.getActualMaximum(5);
        this.f2473f = calendarM1910a.getTimeInMillis();
    }

    /* renamed from: a */
    public static C0688n m1898a(int i, int i2) {
        Calendar calendarM1912c = AbstractC0696v.m1912c(null);
        calendarM1912c.set(1, i);
        calendarM1912c.set(2, i2);
        return new C0688n(calendarM1912c);
    }

    /* renamed from: b */
    public static C0688n m1899b(long j2) {
        Calendar calendarM1912c = AbstractC0696v.m1912c(null);
        calendarM1912c.setTimeInMillis(j2);
        return new C0688n(calendarM1912c);
    }

    /* renamed from: c */
    public final String m1900c() {
        String dateTime;
        if (this.f2474g == null) {
            long timeInMillis = this.f2468a.getTimeInMillis();
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
            this.f2474g = dateTime;
        }
        return this.f2474g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2468a.compareTo(((C0688n) obj).f2468a);
    }

    /* renamed from: d */
    public final int m1901d(C0688n c0688n) {
        if (!(this.f2468a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0688n.f2469b - this.f2469b) + ((c0688n.f2470c - this.f2470c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0688n)) {
            return false;
        }
        C0688n c0688n = (C0688n) obj;
        return this.f2469b == c0688n.f2469b && this.f2470c == c0688n.f2470c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2469b), Integer.valueOf(this.f2470c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2470c);
        parcel.writeInt(this.f2469b);
    }
}
