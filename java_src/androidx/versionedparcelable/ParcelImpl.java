package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import p035T.C0394k;
import p091p0.C1232c;
import p091p0.InterfaceC1233d;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0394k(26);

    /* renamed from: a */
    public final InterfaceC1233d f2252a;

    public ParcelImpl(InterfaceC1233d interfaceC1233d) {
        this.f2252a = interfaceC1233d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new C1232c(parcel).m2929l(this.f2252a);
    }

    public ParcelImpl(Parcel parcel) {
        this.f2252a = new C1232c(parcel).m2925h();
    }
}
