package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import it.deviato.spotifuck.WebService;
import p032R0.C0373o;
import p058d0.C0730r;

/* renamed from: android.support.v4.media.session.o */
/* loaded from: classes.dex */
public class C0508o {

    /* renamed from: a */
    public final MediaSession f1232a;

    /* renamed from: b */
    public final BinderC0507n f1233b;

    /* renamed from: c */
    public final MediaSessionCompat$Token f1234c;

    /* renamed from: d */
    public final Object f1235d = new Object();

    /* renamed from: e */
    public final RemoteCallbackList f1236e = new RemoteCallbackList();

    /* renamed from: f */
    public PlaybackStateCompat f1237f;

    /* renamed from: g */
    public MediaMetadataCompat f1238g;

    /* renamed from: h */
    public C0373o f1239h;

    /* renamed from: i */
    public C0730r f1240i;

    public C0508o(WebService webService, String str) {
        MediaSession mediaSessionMo1217a = mo1217a(webService, str);
        this.f1232a = mediaSessionMo1217a;
        BinderC0507n binderC0507n = new BinderC0507n(this);
        this.f1233b = binderC0507n;
        this.f1234c = new MediaSessionCompat$Token(mediaSessionMo1217a.getSessionToken(), binderC0507n);
        mediaSessionMo1217a.setFlags(3);
    }

    /* renamed from: a */
    public MediaSession mo1217a(WebService webService, String str) {
        return new MediaSession(webService, str);
    }

    /* renamed from: b */
    public final C0373o m1218b() {
        C0373o c0373o;
        synchronized (this.f1235d) {
            c0373o = this.f1239h;
        }
        return c0373o;
    }

    /* renamed from: c */
    public C0730r mo1219c() {
        C0730r c0730r;
        synchronized (this.f1235d) {
            c0730r = this.f1240i;
        }
        return c0730r;
    }

    /* renamed from: d */
    public final PlaybackStateCompat m1220d() {
        return this.f1237f;
    }

    /* renamed from: e */
    public final void m1221e(C0373o c0373o, Handler handler) {
        synchronized (this.f1235d) {
            try {
                this.f1239h = c0373o;
                this.f1232a.setCallback(c0373o == null ? null : c0373o.f960b, handler);
                if (c0373o != null) {
                    c0373o.m968l(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public void mo1222f(C0730r c0730r) {
        synchronized (this.f1235d) {
            this.f1240i = c0730r;
        }
    }
}
