package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import p035T.C0394k;

/* renamed from: androidx.fragment.app.E */
/* loaded from: classes.dex */
public final class C0574E implements Parcelable {
    public static final Parcelable.Creator<C0574E> CREATOR = new C0394k(7);

    /* renamed from: a */
    public String f1702a;

    /* renamed from: b */
    public int f1703b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1702a);
        parcel.writeInt(this.f1703b);
    }
}
