package p066g0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p035T.C0394k;

/* renamed from: g0.D */
/* loaded from: classes.dex */
public final class C0756D extends C0768l {
    public static final Parcelable.Creator<C0756D> CREATOR = new C0394k(21);

    /* renamed from: a */
    public boolean f2768a;

    public C0756D(Parcel parcel) {
        super(parcel);
        this.f2768a = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2768a ? 1 : 0);
    }

    public C0756D(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
