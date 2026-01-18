package android.support.v4.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.BinderC0507n;
import android.support.v4.media.session.C0496c;
import android.support.v4.media.session.C0499f;
import android.support.v4.media.session.C0500g;
import android.support.v4.media.session.InterfaceC0497d;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import p007E.C0057j;
import p063f0.C0744b;

/* renamed from: android.support.v4.media.b */
/* loaded from: classes.dex */
public final class C0484b extends MediaBrowser.ConnectionCallback {

    /* renamed from: a */
    public final /* synthetic */ C0744b f1178a;

    public C0484b(C0744b c0744b) {
        this.f1178a = c0744b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.support.v4.media.session.d] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        C0496c c0496c;
        boolean z2 = false;
        C0744b c0744b = this.f1178a;
        C0485c c0485c = (C0485c) c0744b.f2731b;
        if (c0485c != null) {
            MediaBrowser mediaBrowser = c0485c.f1180b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        C0057j c0057j = new C0057j(5, z2);
                        c0057j.f122g = new Messenger(binder);
                        c0057j.f123h = c0485c.f1181c;
                        c0485c.f1184f = c0057j;
                        HandlerC0483a handlerC0483a = c0485c.f1182d;
                        Messenger messenger = new Messenger(handlerC0483a);
                        c0485c.f1185g = messenger;
                        handlerC0483a.getClass();
                        handlerC0483a.f1177b = new WeakReference(messenger);
                        try {
                            C0057j c0057j2 = c0485c.f1184f;
                            Context context = c0485c.f1179a;
                            Messenger messenger2 = c0485c.f1185g;
                            c0057j2.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) c0057j2.f123h);
                            c0057j2.m263M(6, bundle, messenger2);
                        } catch (RemoteException unused) {
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i = BinderC0507n.f1230c;
                    if (binder2 == null) {
                        c0496c = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0497d)) {
                            C0496c c0496c2 = new C0496c();
                            c0496c2.f1221b = binder2;
                            c0496c = c0496c2;
                        } else {
                            c0496c = (InterfaceC0497d) iInterfaceQueryLocalInterface;
                        }
                    }
                    if (c0496c != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        c0485c.f1186h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, c0496c) : null;
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        C0485c c0485c2 = ((C0488f) c0744b.f2735f).f1188a;
        if (c0485c2.f1186h == null) {
            MediaSession.Token sessionToken2 = c0485c2.f1180b.getSessionToken();
            c0485c2.f1186h = sessionToken2 != null ? new MediaSessionCompat$Token(sessionToken2, null) : null;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = c0485c2.f1186h;
        if (mediaSessionCompat$Token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        Collections.synchronizedSet(new HashSet());
        int i2 = Build.VERSION.SDK_INT;
        Context context2 = (Context) c0744b.f2732c;
        C0499f c0500g = i2 >= 29 ? new C0500g(context2, mediaSessionCompat$Token) : new C0499f(context2, mediaSessionCompat$Token);
        KeyEvent keyEvent = (KeyEvent) ((Intent) c0744b.f2733d).getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        c0500g.f1223a.dispatchMediaButtonEvent(keyEvent);
        c0744b.m1972c();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        C0744b c0744b = this.f1178a;
        C0485c c0485c = (C0485c) c0744b.f2731b;
        if (c0485c != null) {
            c0485c.getClass();
        }
        c0744b.m1972c();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        C0744b c0744b = this.f1178a;
        C0485c c0485c = (C0485c) c0744b.f2731b;
        if (c0485c != null) {
            c0485c.f1184f = null;
            c0485c.f1185g = null;
            c0485c.f1186h = null;
            HandlerC0483a handlerC0483a = c0485c.f1182d;
            handlerC0483a.getClass();
            handlerC0483a.f1177b = new WeakReference(null);
        }
        c0744b.m1972c();
    }
}
