package p066g0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;
import p035T.C0394k;

/* renamed from: g0.i */
/* loaded from: classes.dex */
public final class C0765i extends C0768l {
    public static final Parcelable.Creator<C0765i> CREATOR = new C0394k(17);

    /* renamed from: a */
    public HashSet f2784a;

    public C0765i(Parcel parcel) {
        super(parcel);
        int i = parcel.readInt();
        this.f2784a = new HashSet();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f2784a, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2784a.size());
        HashSet hashSet = this.f2784a;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public C0765i(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
