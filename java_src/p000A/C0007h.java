package p000A;

import android.os.Parcel;
import android.os.Parcelable;
import p008E0.C0068b;
import p020L0.C0178d;
import p024N0.C0272F;
import p037U.AbstractC0414b;
import p074j0.C0905U;
import p087o.C1147d1;
import p106v0.C1315a;
import p108w0.C1332b;

/* renamed from: A.h */
/* loaded from: classes.dex */
public final class C0007h implements Parcelable.ClassLoaderCreator {

    /* renamed from: a */
    public final /* synthetic */ int f20a;

    public /* synthetic */ C0007h(int i) {
        this.f20a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f20a) {
            case 0:
                return new C0008i(parcel, classLoader);
            case 1:
                return new C0068b(parcel, classLoader);
            case 2:
                return new C0178d(parcel, classLoader);
            case 3:
                return new C0272F(parcel, classLoader);
            case 4:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0414b.f1032b;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new C0905U(parcel, classLoader);
            case 6:
                return new C1147d1(parcel, classLoader);
            case 7:
                return new C1315a(parcel, classLoader);
            default:
                return new C1332b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f20a) {
            case 0:
                return new C0008i[i];
            case 1:
                return new C0068b[i];
            case 2:
                return new C0178d[i];
            case 3:
                return new C0272F[i];
            case 4:
                return new AbstractC0414b[i];
            case 5:
                return new C0905U[i];
            case 6:
                return new C1147d1[i];
            case 7:
                return new C1315a[i];
            default:
                return new C1332b[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f20a) {
            case 0:
                return new C0008i(parcel, null);
            case 1:
                return new C0068b(parcel, null);
            case 2:
                return new C0178d(parcel, (ClassLoader) null);
            case 3:
                return new C0272F(parcel, null);
            case 4:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0414b.f1032b;
                }
                throw new IllegalStateException("superState must be null");
            case 5:
                return new C0905U(parcel, null);
            case 6:
                return new C1147d1(parcel, null);
            case 7:
                return new C1315a(parcel, (ClassLoader) null);
            default:
                return new C1332b(parcel, null);
        }
    }
}
