package p051b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b.a */
/* loaded from: classes.dex */
public final class C0659a implements InterfaceC0660b {

    /* renamed from: b */
    public IBinder f2253b;

    @Override // p051b.InterfaceC0660b
    /* renamed from: T */
    public final void mo1839T(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0660b.f2254a);
            parcelObtain.writeInt(i);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2253b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2253b;
    }
}
