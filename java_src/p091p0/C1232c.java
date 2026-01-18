package p091p0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p096r.C1247b;

/* renamed from: p0.c */
/* loaded from: classes.dex */
public final class C1232c extends AbstractC1231b {

    /* renamed from: d */
    public final SparseIntArray f4904d;

    /* renamed from: e */
    public final Parcel f4905e;

    /* renamed from: f */
    public final int f4906f;

    /* renamed from: g */
    public final int f4907g;

    /* renamed from: h */
    public final String f4908h;

    /* renamed from: i */
    public int f4909i;

    /* renamed from: j */
    public int f4910j;

    /* renamed from: k */
    public int f4911k;

    public C1232c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1247b(), new C1247b(), new C1247b());
    }

    @Override // p091p0.AbstractC1231b
    /* renamed from: a */
    public final C1232c mo2918a() {
        Parcel parcel = this.f4905e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f4910j;
        if (i == this.f4906f) {
            i = this.f4907g;
        }
        return new C1232c(parcel, iDataPosition, i, this.f4908h + "  ", this.f4901a, this.f4902b, this.f4903c);
    }

    @Override // p091p0.AbstractC1231b
    /* renamed from: e */
    public final boolean mo2922e(int i) {
        while (this.f4910j < this.f4907g) {
            int i2 = this.f4911k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f4910j;
            Parcel parcel = this.f4905e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f4911k = parcel.readInt();
            this.f4910j += i4;
        }
        return this.f4911k == i;
    }

    @Override // p091p0.AbstractC1231b
    /* renamed from: i */
    public final void mo2926i(int i) {
        int i2 = this.f4909i;
        SparseIntArray sparseIntArray = this.f4904d;
        Parcel parcel = this.f4905e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f4909i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C1232c(Parcel parcel, int i, int i2, String str, C1247b c1247b, C1247b c1247b2, C1247b c1247b3) {
        super(c1247b, c1247b2, c1247b3);
        this.f4904d = new SparseIntArray();
        this.f4909i = -1;
        this.f4911k = -1;
        this.f4905e = parcel;
        this.f4906f = i;
        this.f4907g = i2;
        this.f4910j = i;
        this.f4908h = str;
    }
}
