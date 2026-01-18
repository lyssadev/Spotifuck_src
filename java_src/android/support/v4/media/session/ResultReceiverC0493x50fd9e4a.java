package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import p091p0.AbstractC1230a;
import p091p0.InterfaceC1233d;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
/* loaded from: classes.dex */
class ResultReceiverC0493x50fd9e4a extends ResultReceiver {

    /* renamed from: a */
    public WeakReference f1190a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        InterfaceC0497d interfaceC0497d;
        C0499f c0499f = (C0499f) this.f1190a.get();
        if (c0499f == null || bundle == null) {
            return;
        }
        synchronized (c0499f.f1224b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = c0499f.f1227e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i2 = BinderC0507n.f1230c;
            InterfaceC1233d interfaceC1233d = null;
            if (binder == null) {
                interfaceC0497d = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0497d)) {
                    C0496c c0496c = new C0496c();
                    c0496c.f1221b = binder;
                    interfaceC0497d = c0496c;
                } else {
                    interfaceC0497d = (InterfaceC0497d) iInterfaceQueryLocalInterface;
                }
            }
            mediaSessionCompat$Token.m1165b(interfaceC0497d);
            MediaSessionCompat$Token mediaSessionCompat$Token2 = c0499f.f1227e;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(AbstractC1230a.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    interfaceC1233d = ((ParcelImpl) parcelable).f2252a;
                }
            } catch (RuntimeException unused) {
            }
            mediaSessionCompat$Token2.m1166c(interfaceC1233d);
            c0499f.m1214a();
        }
    }
}
