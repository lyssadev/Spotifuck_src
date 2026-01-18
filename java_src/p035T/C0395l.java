package p035T;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: T.l */
/* loaded from: classes.dex */
public final class C0395l extends View.BaseSavedState {
    public static final Parcelable.Creator<C0395l> CREATOR = new C0394k(0);

    /* renamed from: a */
    public int f1006a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1006a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1006a);
    }
}
