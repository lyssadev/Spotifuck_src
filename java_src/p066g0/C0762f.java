package p066g0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p035T.C0394k;

/* renamed from: g0.f */
/* loaded from: classes.dex */
public final class C0762f extends C0768l {
    public static final Parcelable.Creator<C0762f> CREATOR = new C0394k(16);

    /* renamed from: a */
    public String f2779a;

    public C0762f(Parcel parcel) {
        super(parcel);
        this.f2779a = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f2779a);
    }

    public C0762f(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
