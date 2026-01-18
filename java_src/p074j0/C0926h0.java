package p074j0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p035T.C0394k;

/* renamed from: j0.h0 */
/* loaded from: classes.dex */
public final class C0926h0 implements Parcelable {
    public static final Parcelable.Creator<C0926h0> CREATOR = new C0394k(24);

    /* renamed from: a */
    public int f3723a;

    /* renamed from: b */
    public int f3724b;

    /* renamed from: c */
    public int f3725c;

    /* renamed from: d */
    public int[] f3726d;

    /* renamed from: e */
    public int f3727e;

    /* renamed from: f */
    public int[] f3728f;

    /* renamed from: g */
    public ArrayList f3729g;

    /* renamed from: h */
    public boolean f3730h;

    /* renamed from: i */
    public boolean f3731i;

    /* renamed from: j */
    public boolean f3732j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3723a);
        parcel.writeInt(this.f3724b);
        parcel.writeInt(this.f3725c);
        if (this.f3725c > 0) {
            parcel.writeIntArray(this.f3726d);
        }
        parcel.writeInt(this.f3727e);
        if (this.f3727e > 0) {
            parcel.writeIntArray(this.f3728f);
        }
        parcel.writeInt(this.f3730h ? 1 : 0);
        parcel.writeInt(this.f3731i ? 1 : 0);
        parcel.writeInt(this.f3732j ? 1 : 0);
        parcel.writeList(this.f3729g);
    }
}
