package p008E0;

import android.os.Parcel;
import android.os.Parcelable;
import p000A.C0007h;
import p037U.AbstractC0414b;

/* renamed from: E0.b */
/* loaded from: classes.dex */
public final class C0068b extends AbstractC0414b {
    public static final Parcelable.Creator<C0068b> CREATOR = new C0007h(1);

    /* renamed from: c */
    public boolean f151c;

    public C0068b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f151c = parcel.readInt() == 1;
    }

    @Override // p037U.AbstractC0414b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f151c ? 1 : 0);
    }
}
