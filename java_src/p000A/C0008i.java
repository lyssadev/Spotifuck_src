package p000A;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p037U.AbstractC0414b;

/* renamed from: A.i */
/* loaded from: classes.dex */
public final class C0008i extends AbstractC0414b {
    public static final Parcelable.Creator<C0008i> CREATOR = new C0007h(0);

    /* renamed from: c */
    public SparseArray f21c;

    public C0008i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f21c = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f21c.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // p037U.AbstractC0414b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f21c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f21c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f21c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
