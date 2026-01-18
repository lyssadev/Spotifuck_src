package p112y0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p035T.C0394k;

/* renamed from: y0.b */
/* loaded from: classes.dex */
public final class C1363b extends View.BaseSavedState {
    public static final Parcelable.Creator<C1363b> CREATOR = new C0394k(27);

    /* renamed from: a */
    public int f5676a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f5676a;
        sb.append(i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked");
        sb.append("}");
        return sb.toString();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f5676a));
    }
}
