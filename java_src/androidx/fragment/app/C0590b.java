package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p035T.C0394k;

/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public final class C0590b implements Parcelable {
    public static final Parcelable.Creator<C0590b> CREATOR = new C0394k(5);

    /* renamed from: a */
    public final int[] f1827a;

    /* renamed from: b */
    public final ArrayList f1828b;

    /* renamed from: c */
    public final int[] f1829c;

    /* renamed from: d */
    public final int[] f1830d;

    /* renamed from: e */
    public final int f1831e;

    /* renamed from: f */
    public final String f1832f;

    /* renamed from: g */
    public final int f1833g;

    /* renamed from: h */
    public final int f1834h;

    /* renamed from: i */
    public final CharSequence f1835i;

    /* renamed from: j */
    public final int f1836j;

    /* renamed from: k */
    public final CharSequence f1837k;

    /* renamed from: l */
    public final ArrayList f1838l;

    /* renamed from: m */
    public final ArrayList f1839m;

    /* renamed from: n */
    public final boolean f1840n;

    public C0590b(C0589a c0589a) {
        int size = c0589a.f1808a.size();
        this.f1827a = new int[size * 6];
        if (!c0589a.f1814g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1828b = new ArrayList(size);
        this.f1829c = new int[size];
        this.f1830d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0583N c0583n = (C0583N) c0589a.f1808a.get(i2);
            int i3 = i + 1;
            this.f1827a[i] = c0583n.f1783a;
            ArrayList arrayList = this.f1828b;
            AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = c0583n.f1784b;
            arrayList.add(abstractComponentCallbacksC0606r != null ? abstractComponentCallbacksC0606r.f1922j : null);
            int[] iArr = this.f1827a;
            iArr[i3] = c0583n.f1785c ? 1 : 0;
            iArr[i + 2] = c0583n.f1786d;
            iArr[i + 3] = c0583n.f1787e;
            int i4 = i + 5;
            iArr[i + 4] = c0583n.f1788f;
            i += 6;
            iArr[i4] = c0583n.f1789g;
            this.f1829c[i2] = c0583n.f1790h.ordinal();
            this.f1830d[i2] = c0583n.f1791i.ordinal();
        }
        this.f1831e = c0589a.f1813f;
        this.f1832f = c0589a.f1816i;
        this.f1833g = c0589a.f1826s;
        this.f1834h = c0589a.f1817j;
        this.f1835i = c0589a.f1818k;
        this.f1836j = c0589a.f1819l;
        this.f1837k = c0589a.f1820m;
        this.f1838l = c0589a.f1821n;
        this.f1839m = c0589a.f1822o;
        this.f1840n = c0589a.f1823p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1827a);
        parcel.writeStringList(this.f1828b);
        parcel.writeIntArray(this.f1829c);
        parcel.writeIntArray(this.f1830d);
        parcel.writeInt(this.f1831e);
        parcel.writeString(this.f1832f);
        parcel.writeInt(this.f1833g);
        parcel.writeInt(this.f1834h);
        TextUtils.writeToParcel(this.f1835i, parcel, 0);
        parcel.writeInt(this.f1836j);
        TextUtils.writeToParcel(this.f1837k, parcel, 0);
        parcel.writeStringList(this.f1838l);
        parcel.writeStringList(this.f1839m);
        parcel.writeInt(this.f1840n ? 1 : 0);
    }

    public C0590b(Parcel parcel) {
        this.f1827a = parcel.createIntArray();
        this.f1828b = parcel.createStringArrayList();
        this.f1829c = parcel.createIntArray();
        this.f1830d = parcel.createIntArray();
        this.f1831e = parcel.readInt();
        this.f1832f = parcel.readString();
        this.f1833g = parcel.readInt();
        this.f1834h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1835i = (CharSequence) creator.createFromParcel(parcel);
        this.f1836j = parcel.readInt();
        this.f1837k = (CharSequence) creator.createFromParcel(parcel);
        this.f1838l = parcel.createStringArrayList();
        this.f1839m = parcel.createStringArrayList();
        this.f1840n = parcel.readInt() != 0;
    }
}
