package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.ref.WeakReference;
import p030Q0.AbstractC0328E;
import p036T0.AbstractC0411g;

/* renamed from: android.support.v4.media.session.e */
/* loaded from: classes.dex */
public final class BinderC0498e extends Binder implements InterfaceC0495b {

    /* renamed from: b */
    public final WeakReference f1222b;

    public BinderC0498e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f1222b = new WeakReference(null);
    }

    @Override // android.support.v4.media.session.InterfaceC0495b
    /* renamed from: G */
    public final void mo1167G(PlaybackStateCompat playbackStateCompat) {
        AbstractC0328E.m938h(this.f1222b.get());
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                AbstractC0328E.m938h(this.f1222b.get());
                return true;
            case 2:
                throw new AssertionError();
            case 3:
                mo1167G((PlaybackStateCompat) AbstractC0411g.m1030a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                throw new AssertionError();
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                throw new AssertionError();
            case 6:
                throw new AssertionError();
            case 7:
                throw new AssertionError();
            case 8:
                throw new AssertionError();
            case 9:
                parcel.readInt();
                AbstractC0328E.m938h(this.f1222b.get());
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                AbstractC0328E.m938h(this.f1222b.get());
                return true;
            case 12:
                parcel.readInt();
                AbstractC0328E.m938h(this.f1222b.get());
                return true;
            case 13:
                AbstractC0328E.m938h(this.f1222b.get());
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
