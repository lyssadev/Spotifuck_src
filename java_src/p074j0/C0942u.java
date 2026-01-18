package p074j0;

import android.os.Parcel;
import android.os.Parcelable;
import p035T.C0394k;

/* renamed from: j0.u */
/* loaded from: classes.dex */
public final class C0942u implements Parcelable {
    public static final Parcelable.Creator<C0942u> CREATOR = new C0394k(22);

    /* renamed from: a */
    public int f3842a;

    /* renamed from: b */
    public int f3843b;

    /* renamed from: c */
    public boolean f3844c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3842a);
        parcel.writeInt(this.f3843b);
        parcel.writeInt(this.f3844c ? 1 : 0);
    }
}
