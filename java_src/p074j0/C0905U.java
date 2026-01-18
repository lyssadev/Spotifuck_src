package p074j0;

import android.os.Parcel;
import android.os.Parcelable;
import p000A.C0007h;
import p037U.AbstractC0414b;

/* renamed from: j0.U */
/* loaded from: classes.dex */
public final class C0905U extends AbstractC0414b {
    public static final Parcelable.Creator<C0905U> CREATOR = new C0007h(5);

    /* renamed from: c */
    public Parcelable f3620c;

    public C0905U(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3620c = parcel.readParcelable(classLoader == null ? AbstractC0896K.class.getClassLoader() : classLoader);
    }

    @Override // p037U.AbstractC0414b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f3620c, 0);
    }
}
