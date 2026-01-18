package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p091p0.InterfaceC1233d;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C0512s(2);

    /* renamed from: b */
    public final Object f1195b;

    /* renamed from: c */
    public InterfaceC0497d f1196c;

    /* renamed from: a */
    public final Object f1194a = new Object();

    /* renamed from: d */
    public InterfaceC1233d f1197d = null;

    public MediaSessionCompat$Token(Object obj, InterfaceC0497d interfaceC0497d) {
        this.f1195b = obj;
        this.f1196c = interfaceC0497d;
    }

    /* renamed from: a */
    public final InterfaceC0497d m1164a() {
        InterfaceC0497d interfaceC0497d;
        synchronized (this.f1194a) {
            interfaceC0497d = this.f1196c;
        }
        return interfaceC0497d;
    }

    /* renamed from: b */
    public final void m1165b(InterfaceC0497d interfaceC0497d) {
        synchronized (this.f1194a) {
            this.f1196c = interfaceC0497d;
        }
    }

    /* renamed from: c */
    public final void m1166c(InterfaceC1233d interfaceC1233d) {
        synchronized (this.f1194a) {
            this.f1197d = interfaceC1233d;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.f1195b;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f1195b == null;
        }
        Object obj3 = mediaSessionCompat$Token.f1195b;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.f1195b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f1195b, i);
    }
}
