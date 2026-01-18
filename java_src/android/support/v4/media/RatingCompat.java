package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p035T.C0394k;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0394k(4);

    /* renamed from: a */
    public final int f1173a;

    /* renamed from: b */
    public final float f1174b;

    /* renamed from: c */
    public Object f1175c;

    public RatingCompat(int i, float f2) {
        this.f1173a = i;
        this.f1174b = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f1173a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f1173a);
        sb.append(" rating=");
        float f2 = this.f1174b;
        sb.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1173a);
        parcel.writeFloat(this.f1174b);
    }
}
