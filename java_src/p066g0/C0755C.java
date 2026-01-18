package p066g0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p035T.C0394k;

/* renamed from: g0.C */
/* loaded from: classes.dex */
public final class C0755C extends C0768l {
    public static final Parcelable.Creator<C0755C> CREATOR = new C0394k(20);

    /* renamed from: a */
    public int f2765a;

    /* renamed from: b */
    public int f2766b;

    /* renamed from: c */
    public int f2767c;

    public C0755C(Parcel parcel) {
        super(parcel);
        this.f2765a = parcel.readInt();
        this.f2766b = parcel.readInt();
        this.f2767c = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2765a);
        parcel.writeInt(this.f2766b);
        parcel.writeInt(this.f2767c);
    }

    public C0755C(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
