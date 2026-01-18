package p074j0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p035T.C0394k;

/* renamed from: j0.g0 */
/* loaded from: classes.dex */
public final class C0924g0 implements Parcelable {
    public static final Parcelable.Creator<C0924g0> CREATOR = new C0394k(23);

    /* renamed from: a */
    public int f3713a;

    /* renamed from: b */
    public int f3714b;

    /* renamed from: c */
    public int[] f3715c;

    /* renamed from: d */
    public boolean f3716d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3713a + ", mGapDir=" + this.f3714b + ", mHasUnwantedGapAfter=" + this.f3716d + ", mGapPerSpan=" + Arrays.toString(this.f3715c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3713a);
        parcel.writeInt(this.f3714b);
        parcel.writeInt(this.f3716d ? 1 : 0);
        int[] iArr = this.f3715c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f3715c);
        }
    }
}
