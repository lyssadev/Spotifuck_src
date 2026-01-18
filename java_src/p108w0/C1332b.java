package p108w0;

import android.os.Parcel;
import android.os.Parcelable;
import p000A.C0007h;
import p037U.AbstractC0414b;

/* renamed from: w0.b */
/* loaded from: classes.dex */
public final class C1332b extends AbstractC0414b {
    public static final Parcelable.Creator<C1332b> CREATOR = new C0007h(8);

    /* renamed from: c */
    public boolean f5404c;

    public C1332b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C1332b.class.getClassLoader();
        }
        this.f5404c = parcel.readInt() == 1;
    }

    @Override // p037U.AbstractC0414b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5404c ? 1 : 0);
    }
}
