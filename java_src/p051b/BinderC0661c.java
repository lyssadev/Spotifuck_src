package p051b;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: b.c */
/* loaded from: classes.dex */
public final class BinderC0661c extends Binder implements InterfaceC0660b {

    /* renamed from: c */
    public static final /* synthetic */ int f2255c = 0;

    /* renamed from: b */
    public final /* synthetic */ C0662d f2256b;

    public BinderC0661c(C0662d c0662d) {
        this.f2256b = c0662d;
        attachInterface(this, InterfaceC0660b.f2254a);
    }

    @Override // p051b.InterfaceC0660b
    /* renamed from: T */
    public final void mo1839T(int i, Bundle bundle) {
        C0662d c0662d = this.f2256b;
        c0662d.getClass();
        c0662d.mo1133a(i, bundle);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC0660b.f2254a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        mo1839T(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
