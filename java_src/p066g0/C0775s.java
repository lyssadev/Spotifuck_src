package p066g0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p035T.C0394k;

/* renamed from: g0.s */
/* loaded from: classes.dex */
public final class C0775s extends C0768l {
    public static final Parcelable.Creator<C0775s> CREATOR = new C0394k(19);

    /* renamed from: a */
    public final int f2811a;

    public C0775s(Parcel parcel) {
        super(parcel);
        this.f2811a = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2811a);
    }

    public C0775s(AbsSavedState absSavedState, int i) {
        super(absSavedState);
        this.f2811a = i;
    }
}
