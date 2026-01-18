package p057d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p035T.C0394k;
import p047Z0.AbstractC0469c;

/* renamed from: d.a */
/* loaded from: classes.dex */
public final class C0709a implements Parcelable {
    public static final Parcelable.Creator<C0709a> CREATOR = new C0394k(14);

    /* renamed from: a */
    public final int f2658a;

    /* renamed from: b */
    public final Intent f2659b;

    public C0709a(Intent intent, int i) {
        this.f2658a = i;
        this.f2659b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f2658a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2659b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC0469c.m1102e("dest", parcel);
        parcel.writeInt(this.f2658a);
        Intent intent = this.f2659b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
