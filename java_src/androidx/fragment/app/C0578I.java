package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p035T.C0394k;

/* renamed from: androidx.fragment.app.I */
/* loaded from: classes.dex */
public final class C0578I implements Parcelable {
    public static final Parcelable.Creator<C0578I> CREATOR = new C0394k(8);

    /* renamed from: a */
    public ArrayList f1750a;

    /* renamed from: b */
    public ArrayList f1751b;

    /* renamed from: c */
    public C0590b[] f1752c;

    /* renamed from: d */
    public int f1753d;

    /* renamed from: e */
    public String f1754e;

    /* renamed from: f */
    public ArrayList f1755f;

    /* renamed from: g */
    public ArrayList f1756g;

    /* renamed from: h */
    public ArrayList f1757h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1750a);
        parcel.writeStringList(this.f1751b);
        parcel.writeTypedArray(this.f1752c, i);
        parcel.writeInt(this.f1753d);
        parcel.writeString(this.f1754e);
        parcel.writeStringList(this.f1755f);
        parcel.writeTypedList(this.f1756g);
        parcel.writeTypedList(this.f1757h);
    }
}
