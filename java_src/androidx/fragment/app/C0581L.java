package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p035T.C0394k;

/* renamed from: androidx.fragment.app.L */
/* loaded from: classes.dex */
public final class C0581L implements Parcelable {
    public static final Parcelable.Creator<C0581L> CREATOR = new C0394k(9);

    /* renamed from: a */
    public final String f1765a;

    /* renamed from: b */
    public final String f1766b;

    /* renamed from: c */
    public final boolean f1767c;

    /* renamed from: d */
    public final int f1768d;

    /* renamed from: e */
    public final int f1769e;

    /* renamed from: f */
    public final String f1770f;

    /* renamed from: g */
    public final boolean f1771g;

    /* renamed from: h */
    public final boolean f1772h;

    /* renamed from: i */
    public final boolean f1773i;

    /* renamed from: j */
    public final Bundle f1774j;

    /* renamed from: k */
    public final boolean f1775k;

    /* renamed from: l */
    public final int f1776l;

    /* renamed from: m */
    public Bundle f1777m;

    public C0581L(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        this.f1765a = abstractComponentCallbacksC0606r.getClass().getName();
        this.f1766b = abstractComponentCallbacksC0606r.f1922j;
        this.f1767c = abstractComponentCallbacksC0606r.f1930r;
        this.f1768d = abstractComponentCallbacksC0606r.f1894A;
        this.f1769e = abstractComponentCallbacksC0606r.f1895B;
        this.f1770f = abstractComponentCallbacksC0606r.f1896C;
        this.f1771g = abstractComponentCallbacksC0606r.f1899F;
        this.f1772h = abstractComponentCallbacksC0606r.f1929q;
        this.f1773i = abstractComponentCallbacksC0606r.f1898E;
        this.f1774j = abstractComponentCallbacksC0606r.f1923k;
        this.f1775k = abstractComponentCallbacksC0606r.f1897D;
        this.f1776l = abstractComponentCallbacksC0606r.f1911R.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1765a);
        sb.append(" (");
        sb.append(this.f1766b);
        sb.append(")}:");
        if (this.f1767c) {
            sb.append(" fromLayout");
        }
        int i = this.f1769e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1770f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1771g) {
            sb.append(" retainInstance");
        }
        if (this.f1772h) {
            sb.append(" removing");
        }
        if (this.f1773i) {
            sb.append(" detached");
        }
        if (this.f1775k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1765a);
        parcel.writeString(this.f1766b);
        parcel.writeInt(this.f1767c ? 1 : 0);
        parcel.writeInt(this.f1768d);
        parcel.writeInt(this.f1769e);
        parcel.writeString(this.f1770f);
        parcel.writeInt(this.f1771g ? 1 : 0);
        parcel.writeInt(this.f1772h ? 1 : 0);
        parcel.writeInt(this.f1773i ? 1 : 0);
        parcel.writeBundle(this.f1774j);
        parcel.writeInt(this.f1775k ? 1 : 0);
        parcel.writeBundle(this.f1777m);
        parcel.writeInt(this.f1776l);
    }

    public C0581L(Parcel parcel) {
        this.f1765a = parcel.readString();
        this.f1766b = parcel.readString();
        this.f1767c = parcel.readInt() != 0;
        this.f1768d = parcel.readInt();
        this.f1769e = parcel.readInt();
        this.f1770f = parcel.readString();
        this.f1771g = parcel.readInt() != 0;
        this.f1772h = parcel.readInt() != 0;
        this.f1773i = parcel.readInt() != 0;
        this.f1774j = parcel.readBundle();
        this.f1775k = parcel.readInt() != 0;
        this.f1777m = parcel.readBundle();
        this.f1776l = parcel.readInt();
    }
}
