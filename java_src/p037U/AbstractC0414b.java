package p037U;

import android.os.Parcel;
import android.os.Parcelable;
import p000A.C0007h;

/* renamed from: U.b */
/* loaded from: classes.dex */
public abstract class AbstractC0414b implements Parcelable {

    /* renamed from: a */
    public final Parcelable f1033a;

    /* renamed from: b */
    public static final C0413a f1032b = new C0413a();
    public static final Parcelable.Creator<AbstractC0414b> CREATOR = new C0007h(4);

    public AbstractC0414b() {
        this.f1033a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1033a, i);
    }

    public AbstractC0414b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1033a = parcelable == f1032b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0414b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f1033a = parcelable == null ? f1032b : parcelable;
    }
}
