package p087o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p035T.C0394k;

/* renamed from: o.O */
/* loaded from: classes.dex */
public final class C1113O extends View.BaseSavedState {
    public static final Parcelable.Creator<C1113O> CREATOR = new C0394k(25);

    /* renamed from: a */
    public boolean f4520a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f4520a ? (byte) 1 : (byte) 0);
    }
}
