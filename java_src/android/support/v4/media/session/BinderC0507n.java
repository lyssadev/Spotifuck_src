package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p036T0.AbstractC0411g;
import p058d0.C0730r;

/* renamed from: android.support.v4.media.session.n */
/* loaded from: classes.dex */
public final class BinderC0507n extends Binder implements InterfaceC0497d {

    /* renamed from: c */
    public static final /* synthetic */ int f1230c = 0;

    /* renamed from: b */
    public final AtomicReference f1231b;

    public BinderC0507n(C0508o c0508o) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f1231b = new AtomicReference(c0508o);
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: A */
    public final String mo1174A() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: B */
    public final void mo1175B(boolean z2) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: C */
    public final void mo1176C() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: D */
    public final void mo1177D(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: E */
    public final void mo1178E(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: F */
    public final void mo1179F(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: H */
    public final int mo1180H() {
        return ((C0508o) this.f1231b.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: I */
    public final void mo1168I() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: J */
    public final void mo1181J(long j2) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: K */
    public final void mo1182K(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: L */
    public final void mo1183L(int i, int i2) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: M */
    public final void mo1184M(float f2) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: N */
    public final ParcelableVolumeInfo mo1185N() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: O */
    public final PlaybackStateCompat mo1169O() {
        C0508o c0508o = (C0508o) this.f1231b.get();
        if (c0508o == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = c0508o.f1237f;
        MediaMetadataCompat mediaMetadataCompat = c0508o.f1238g;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j2 = -1;
        long j3 = playbackStateCompat.f1204b;
        if (j3 == -1) {
            return playbackStateCompat;
        }
        int i = playbackStateCompat.f1203a;
        if (i != 3 && i != 4 && i != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.f1210h <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = ((long) (playbackStateCompat.f1206d * (jElapsedRealtime - r9))) + j3;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.f1171a;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j2 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        long j5 = (j2 < 0 || j4 <= j2) ? j4 < 0 ? 0L : j4 : j2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = playbackStateCompat.f1211i;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f1203a, j5, playbackStateCompat.f1205c, playbackStateCompat.f1206d, playbackStateCompat.f1207e, playbackStateCompat.f1208f, playbackStateCompat.f1209g, jElapsedRealtime, arrayList, playbackStateCompat.f1212j, playbackStateCompat.f1213k);
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: P */
    public final void mo1186P(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: R */
    public final void mo1188R() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: S */
    public final Bundle mo1189S() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: U */
    public final void mo1190U(int i, int i2) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: V */
    public final boolean mo1170V(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: a */
    public final long mo1191a() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: b */
    public final void mo1192b(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: c */
    public final void mo1193c(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: d */
    public final void mo1194d(int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: e */
    public final boolean mo1195e() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: f */
    public final void mo1196f(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: g */
    public final void mo1197g() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: h */
    public final PendingIntent mo1198h() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: i */
    public final CharSequence mo1199i() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: j */
    public final int mo1200j() {
        return ((C0508o) this.f1231b.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: k */
    public final void mo1171k(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: l */
    public final void mo1201l(long j2) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: m */
    public final void mo1202m(int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: n */
    public final void mo1203n(int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: o */
    public final void mo1204o() {
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        InterfaceC0495b interfaceC0495b = null;
        InterfaceC0495b interfaceC0495b2 = null;
        switch (i) {
            case 1:
                mo1186P(parcel.readString(), (Bundle) AbstractC0411g.m1031b(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) AbstractC0411g.m1031b(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zMo1170V = mo1170V((KeyEvent) AbstractC0411g.m1031b(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zMo1170V ? 1 : 0);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0495b)) {
                        C0494a c0494a = new C0494a();
                        c0494a.f1220b = strongBinder;
                        interfaceC0495b = c0494a;
                    } else {
                        interfaceC0495b = (InterfaceC0495b) iInterfaceQueryLocalInterface;
                    }
                }
                mo1173r(interfaceC0495b);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC0495b)) {
                        C0494a c0494a2 = new C0494a();
                        c0494a2.f1220b = strongBinder2;
                        interfaceC0495b2 = c0494a2;
                    } else {
                        interfaceC0495b2 = (InterfaceC0495b) iInterfaceQueryLocalInterface2;
                    }
                }
                mo1211x(interfaceC0495b2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zMo1195e = mo1195e();
                parcel2.writeNoException();
                parcel2.writeInt(zMo1195e ? 1 : 0);
                return true;
            case 6:
                String strMo1174A = mo1174A();
                parcel2.writeNoException();
                parcel2.writeString(strMo1174A);
                return true;
            case 7:
                String strMo1213z = mo1213z();
                parcel2.writeNoException();
                parcel2.writeString(strMo1213z);
                return true;
            case 8:
                PendingIntent pendingIntentMo1198h = mo1198h();
                parcel2.writeNoException();
                AbstractC0411g.m1029U(parcel2, pendingIntentMo1198h, 1);
                return true;
            case 9:
                long jMo1191a = mo1191a();
                parcel2.writeNoException();
                parcel2.writeLong(jMo1191a);
                return true;
            case 10:
                ParcelableVolumeInfo parcelableVolumeInfoMo1185N = mo1185N();
                parcel2.writeNoException();
                AbstractC0411g.m1029U(parcel2, parcelableVolumeInfoMo1185N, 1);
                return true;
            case 11:
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                parcel.readString();
                mo1190U(i3, i4);
                parcel2.writeNoException();
                return true;
            case 12:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                parcel.readString();
                mo1183L(i5, i6);
                parcel2.writeNoException();
                return true;
            case 13:
                mo1168I();
                parcel2.writeNoException();
                return true;
            case 14:
                mo1178E(parcel.readString(), (Bundle) AbstractC0411g.m1031b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                mo1182K(parcel.readString(), (Bundle) AbstractC0411g.m1031b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                mo1192b((Uri) AbstractC0411g.m1031b(parcel, Uri.CREATOR), (Bundle) AbstractC0411g.m1031b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                mo1181J(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                mo1172q();
                parcel2.writeNoException();
                return true;
            case 19:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                mo1188R();
                parcel2.writeNoException();
                return true;
            case 23:
                mo1197g();
                parcel2.writeNoException();
                return true;
            case 24:
                mo1201l(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                mo1177D((RatingCompat) AbstractC0411g.m1031b(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                mo1171k(parcel.readString(), (Bundle) AbstractC0411g.m1031b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat mediaMetadataCompatMo1208u = mo1208u();
                parcel2.writeNoException();
                AbstractC0411g.m1029U(parcel2, mediaMetadataCompatMo1208u, 1);
                return true;
            case 28:
                PlaybackStateCompat playbackStateCompatMo1169O = mo1169O();
                parcel2.writeNoException();
                AbstractC0411g.m1029U(parcel2, playbackStateCompatMo1169O, 1);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                CharSequence charSequenceMo1199i = mo1199i();
                parcel2.writeNoException();
                if (charSequenceMo1199i != null) {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(charSequenceMo1199i, parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 31:
                Bundle bundleMo1189S = mo1189S();
                parcel2.writeNoException();
                AbstractC0411g.m1029U(parcel2, bundleMo1189S, 1);
                return true;
            case 32:
                mo1204o();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                mo1176C();
                parcel2.writeNoException();
                return true;
            case 34:
                mo1209v(parcel.readString(), (Bundle) AbstractC0411g.m1031b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                mo1205p(parcel.readString(), (Bundle) AbstractC0411g.m1031b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                mo1179F((Uri) AbstractC0411g.m1031b(parcel, Uri.CREATOR), (Bundle) AbstractC0411g.m1031b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int iMo1180H = mo1180H();
                parcel2.writeNoException();
                parcel2.writeInt(iMo1180H);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                mo1194d(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                mo1196f((MediaDescriptionCompat) AbstractC0411g.m1031b(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                mo1212y((MediaDescriptionCompat) AbstractC0411g.m1031b(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                mo1193c((MediaDescriptionCompat) AbstractC0411g.m1031b(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                mo1203n(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                mo1207t();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                mo1175B(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int iMo1200j = mo1200j();
                parcel2.writeNoException();
                parcel2.writeInt(iMo1200j);
                return true;
            case 48:
                mo1202m(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                mo1184M(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleMo1210w = mo1210w();
                parcel2.writeNoException();
                AbstractC0411g.m1029U(parcel2, bundleMo1210w, 1);
                return true;
            case 51:
                mo1206s((RatingCompat) AbstractC0411g.m1031b(parcel, RatingCompat.CREATOR), (Bundle) AbstractC0411g.m1031b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: p */
    public final void mo1205p(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: q */
    public final void mo1172q() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: r */
    public final void mo1173r(InterfaceC0495b interfaceC0495b) {
        C0508o c0508o = (C0508o) this.f1231b.get();
        if (c0508o == null) {
            return;
        }
        c0508o.f1236e.register(interfaceC0495b, new C0730r("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (c0508o.f1235d) {
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: s */
    public final void mo1206s(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: t */
    public final void mo1207t() {
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: u */
    public final MediaMetadataCompat mo1208u() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: v */
    public final void mo1209v(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: w */
    public final Bundle mo1210w() {
        ((C0508o) this.f1231b.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: x */
    public final void mo1211x(InterfaceC0495b interfaceC0495b) {
        C0508o c0508o = (C0508o) this.f1231b.get();
        if (c0508o == null) {
            return;
        }
        c0508o.f1236e.unregister(interfaceC0495b);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (c0508o.f1235d) {
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: y */
    public final void mo1212y(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: z */
    public final String mo1213z() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0497d
    /* renamed from: Q */
    public final void mo1187Q() {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
