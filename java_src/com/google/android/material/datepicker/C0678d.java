package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p035T.C0394k;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
public final class C0678d implements Parcelable {
    public static final Parcelable.Creator<C0678d> CREATOR = new C0394k(12);

    /* renamed from: a */
    public final long f2414a;

    public C0678d(long j2) {
        this.f2414a = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0678d) && this.f2414a == ((C0678d) obj).f2414a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2414a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2414a);
    }
}
