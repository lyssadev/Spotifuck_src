package p020L0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p000A.C0007h;
import p037U.AbstractC0414b;

/* renamed from: L0.d */
/* loaded from: classes.dex */
public final class C0178d extends AbstractC0414b {
    public static final Parcelable.Creator<C0178d> CREATOR = new C0007h(2);

    /* renamed from: c */
    public final int f522c;

    public C0178d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f522c = parcel.readInt();
    }

    @Override // p037U.AbstractC0414b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f522c);
    }

    public C0178d(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f522c = sideSheetBehavior.f2516h;
    }
}
