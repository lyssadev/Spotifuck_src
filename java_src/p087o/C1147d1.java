package p087o;

import android.os.Parcel;
import android.os.Parcelable;
import p000A.C0007h;
import p037U.AbstractC0414b;

/* renamed from: o.d1 */
/* loaded from: classes.dex */
public final class C1147d1 extends AbstractC0414b {
    public static final Parcelable.Creator<C1147d1> CREATOR = new C0007h(6);

    /* renamed from: c */
    public int f4601c;

    /* renamed from: d */
    public boolean f4602d;

    public C1147d1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4601c = parcel.readInt();
        this.f4602d = parcel.readInt() != 0;
    }

    @Override // p037U.AbstractC0414b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f4601c);
        parcel.writeInt(this.f4602d ? 1 : 0);
    }
}
