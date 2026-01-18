package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes.dex */
public final class C0494a implements InterfaceC0495b {

    /* renamed from: b */
    public IBinder f1220b;

    @Override // android.support.v4.media.session.InterfaceC0495b
    /* renamed from: G */
    public final void mo1167G(PlaybackStateCompat playbackStateCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackStateCompat != null) {
                parcelObtain.writeInt(1);
                playbackStateCompat.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1220b.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1220b;
    }
}
