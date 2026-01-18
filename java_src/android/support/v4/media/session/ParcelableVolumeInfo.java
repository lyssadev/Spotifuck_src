package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0512s(3);

    /* renamed from: a */
    public int f1198a;

    /* renamed from: b */
    public int f1199b;

    /* renamed from: c */
    public int f1200c;

    /* renamed from: d */
    public int f1201d;

    /* renamed from: e */
    public int f1202e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1198a);
        parcel.writeInt(this.f1200c);
        parcel.writeInt(this.f1201d);
        parcel.writeInt(this.f1202e);
        parcel.writeInt(this.f1199b);
    }
}
