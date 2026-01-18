package p066g0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import p035T.C0394k;

/* renamed from: g0.c */
/* loaded from: classes.dex */
public final class C0759c extends C0768l {
    public static final Parcelable.Creator<C0759c> CREATOR = new C0394k(15);

    /* renamed from: a */
    public String f2773a;

    public C0759c(Parcel parcel) {
        super(parcel);
        this.f2773a = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f2773a);
    }

    public C0759c(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
