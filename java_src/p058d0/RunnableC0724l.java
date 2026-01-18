package p058d0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.C0491i;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import it.deviato.spotifuck.WebService;
import java.util.Iterator;
import p000A.C0001b;

/* renamed from: d0.l */
/* loaded from: classes.dex */
public final class RunnableC0724l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2688a = 1;

    /* renamed from: b */
    public final /* synthetic */ C0001b f2689b;

    /* renamed from: c */
    public final /* synthetic */ int f2690c;

    /* renamed from: d */
    public final /* synthetic */ String f2691d;

    /* renamed from: e */
    public final /* synthetic */ int f2692e;

    /* renamed from: f */
    public final /* synthetic */ C0001b f2693f;

    public RunnableC0724l(C0001b c0001b, C0001b c0001b2, String str, int i, int i2, Bundle bundle) {
        this.f2693f = c0001b;
        this.f2689b = c0001b2;
        this.f2691d = str;
        this.f2690c = i;
        this.f2692e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        C0715c c0715c;
        switch (this.f2688a) {
            case 0:
                C0001b c0001b = this.f2689b;
                IBinder binder = ((Messenger) c0001b.f2g).getBinder();
                C0001b c0001b2 = this.f2693f;
                ((AbstractServiceC0729q) c0001b2.f2g).f2718j.remove(binder);
                String str = this.f2691d;
                C0715c c0715c2 = new C0715c((AbstractServiceC0729q) c0001b2.f2g, str, this.f2690c, this.f2692e, c0001b);
                AbstractServiceC0729q abstractServiceC0729q = (AbstractServiceC0729q) c0001b2.f2g;
                abstractServiceC0729q.getClass();
                ((WebService) abstractServiceC0729q).getClass();
                c0715c2.f2674f = new C0491i(null);
                abstractServiceC0729q.getClass();
                if (c0715c2.f2674f == null) {
                    try {
                        c0001b.m33C(2, null);
                        break;
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str));
                        return;
                    }
                } else {
                    try {
                        abstractServiceC0729q.f2718j.put(binder, c0715c2);
                        binder.linkToDeath(c0715c2, 0);
                        MediaSessionCompat$Token mediaSessionCompat$Token = abstractServiceC0729q.f2720l;
                        if (mediaSessionCompat$Token != null) {
                            C0491i c0491i = c0715c2.f2674f;
                            c0491i.getClass();
                            Bundle bundle = c0491i.f1189a;
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putInt("extra_service_version", 2);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_media_item_id", "sfroot");
                            bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
                            bundle2.putBundle("data_root_hints", bundle);
                            c0001b.m33C(1, bundle2);
                            break;
                        }
                    } catch (RemoteException unused2) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str));
                        abstractServiceC0729q.f2718j.remove(binder);
                        return;
                    }
                }
                break;
            default:
                C0001b c0001b3 = this.f2689b;
                IBinder binder2 = ((Messenger) c0001b3.f2g).getBinder();
                C0001b c0001b4 = this.f2693f;
                ((AbstractServiceC0729q) c0001b4.f2g).f2718j.remove(binder2);
                AbstractServiceC0729q abstractServiceC0729q2 = (AbstractServiceC0729q) c0001b4.f2g;
                Iterator it2 = abstractServiceC0729q2.f2717i.iterator();
                while (true) {
                    c0715c = null;
                    if (it2.hasNext()) {
                        C0715c c0715c3 = (C0715c) it2.next();
                        if (c0715c3.f2671c == this.f2690c) {
                            if (TextUtils.isEmpty(this.f2691d) || this.f2692e <= 0) {
                                c0715c = new C0715c((AbstractServiceC0729q) c0001b4.f2g, c0715c3.f2669a, c0715c3.f2670b, c0715c3.f2671c, c0001b3);
                            }
                            it2.remove();
                        }
                    }
                }
                if (c0715c == null) {
                    c0715c = new C0715c((AbstractServiceC0729q) c0001b4.f2g, this.f2691d, this.f2692e, this.f2690c, c0001b3);
                }
                abstractServiceC0729q2.f2718j.put(binder2, c0715c);
                try {
                    binder2.linkToDeath(c0715c, 0);
                    break;
                } catch (RemoteException unused3) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
                break;
        }
    }

    public RunnableC0724l(C0001b c0001b, C0001b c0001b2, int i, String str, int i2, Bundle bundle) {
        this.f2693f = c0001b;
        this.f2689b = c0001b2;
        this.f2690c = i;
        this.f2691d = str;
        this.f2692e = i2;
    }
}
