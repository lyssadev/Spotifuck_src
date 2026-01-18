package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p035T.C0394k;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public final class C0591c implements Parcelable {
    public static final Parcelable.Creator<C0591c> CREATOR = new C0394k(6);

    /* renamed from: a */
    public final ArrayList f1841a;

    /* renamed from: b */
    public final ArrayList f1842b;

    public C0591c(Parcel parcel) {
        this.f1841a = parcel.createStringArrayList();
        this.f1842b = parcel.createTypedArrayList(C0590b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1841a);
        parcel.writeTypedList(this.f1842b);
    }
}
