package p106v0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p000A.C0007h;
import p037U.AbstractC0414b;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public final class C1315a extends AbstractC0414b {
    public static final Parcelable.Creator<C1315a> CREATOR = new C0007h(7);

    /* renamed from: c */
    public final int f5344c;

    /* renamed from: d */
    public final int f5345d;

    /* renamed from: e */
    public final boolean f5346e;

    /* renamed from: f */
    public final boolean f5347f;

    /* renamed from: g */
    public final boolean f5348g;

    public C1315a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5344c = parcel.readInt();
        this.f5345d = parcel.readInt();
        this.f5346e = parcel.readInt() == 1;
        this.f5347f = parcel.readInt() == 1;
        this.f5348g = parcel.readInt() == 1;
    }

    @Override // p037U.AbstractC0414b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5344c);
        parcel.writeInt(this.f5345d);
        parcel.writeInt(this.f5346e ? 1 : 0);
        parcel.writeInt(this.f5347f ? 1 : 0);
        parcel.writeInt(this.f5348g ? 1 : 0);
    }

    public C1315a(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f5344c = bottomSheetBehavior.f2306L;
        this.f5345d = bottomSheetBehavior.f2329e;
        this.f5346e = bottomSheetBehavior.f2323b;
        this.f5347f = bottomSheetBehavior.f2303I;
        this.f5348g = bottomSheetBehavior.f2304J;
    }
}
