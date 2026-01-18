package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p035T.C0394k;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C0676b implements Parcelable {
    public static final Parcelable.Creator<C0676b> CREATOR = new C0394k(11);

    /* renamed from: a */
    public final C0688n f2405a;

    /* renamed from: b */
    public final C0688n f2406b;

    /* renamed from: c */
    public final C0678d f2407c;

    /* renamed from: d */
    public final C0688n f2408d;

    /* renamed from: e */
    public final int f2409e;

    /* renamed from: f */
    public final int f2410f;

    /* renamed from: g */
    public final int f2411g;

    public C0676b(C0688n c0688n, C0688n c0688n2, C0678d c0678d, C0688n c0688n3, int i) {
        Objects.requireNonNull(c0688n, "start cannot be null");
        Objects.requireNonNull(c0688n2, "end cannot be null");
        Objects.requireNonNull(c0678d, "validator cannot be null");
        this.f2405a = c0688n;
        this.f2406b = c0688n2;
        this.f2408d = c0688n3;
        this.f2409e = i;
        this.f2407c = c0678d;
        if (c0688n3 != null && c0688n.f2468a.compareTo(c0688n3.f2468a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0688n3 != null && c0688n3.f2468a.compareTo(c0688n2.f2468a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > AbstractC0696v.m1912c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f2411g = c0688n.m1901d(c0688n2) + 1;
        this.f2410f = (c0688n2.f2470c - c0688n.f2470c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0676b)) {
            return false;
        }
        C0676b c0676b = (C0676b) obj;
        return this.f2405a.equals(c0676b.f2405a) && this.f2406b.equals(c0676b.f2406b) && Objects.equals(this.f2408d, c0676b.f2408d) && this.f2409e == c0676b.f2409e && this.f2407c.equals(c0676b.f2407c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2405a, this.f2406b, this.f2408d, Integer.valueOf(this.f2409e), this.f2407c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2405a, 0);
        parcel.writeParcelable(this.f2406b, 0);
        parcel.writeParcelable(this.f2408d, 0);
        parcel.writeParcelable(this.f2407c, 0);
        parcel.writeInt(this.f2409e);
    }
}
