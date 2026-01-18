package p051b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p035T.C0394k;

/* renamed from: b.d */
/* loaded from: classes.dex */
public class C0662d implements Parcelable {
    public static final Parcelable.Creator<C0662d> CREATOR = new C0394k(10);

    /* renamed from: a */
    public InterfaceC0660b f2257a;

    /* renamed from: b */
    public final void m1840b(int i, Bundle bundle) {
        InterfaceC0660b interfaceC0660b = this.f2257a;
        if (interfaceC0660b != null) {
            try {
                interfaceC0660b.mo1839T(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f2257a == null) {
                    this.f2257a = new BinderC0661c(this);
                }
                parcel.writeStrongBinder(this.f2257a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public void mo1133a(int i, Bundle bundle) {
    }
}
