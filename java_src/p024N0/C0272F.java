package p024N0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p000A.C0007h;
import p037U.AbstractC0414b;

/* renamed from: N0.F */
/* loaded from: classes.dex */
public final class C0272F extends AbstractC0414b {
    public static final Parcelable.Creator<C0272F> CREATOR = new C0007h(3);

    /* renamed from: c */
    public CharSequence f674c;

    /* renamed from: d */
    public boolean f675d;

    public C0272F(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f674c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f675d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f674c) + "}";
    }

    @Override // p037U.AbstractC0414b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f674c, parcel, i);
        parcel.writeInt(this.f675d ? 1 : 0);
    }
}
