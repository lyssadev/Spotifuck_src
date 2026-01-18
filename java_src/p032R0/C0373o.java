package p032R0;

import android.os.Handler;
import android.support.v4.media.session.C0506m;
import android.support.v4.media.session.C0508o;
import android.support.v4.media.session.C0513t;
import android.support.v4.media.session.PlaybackStateCompat;
import android.webkit.WebView;
import it.deviato.spotifuck.WebService;
import java.lang.ref.WeakReference;
import p030Q0.HandlerC0341j;

/* renamed from: R0.o */
/* loaded from: classes.dex */
public final class C0373o {

    /* renamed from: c */
    public boolean f961c;

    /* renamed from: e */
    public HandlerC0341j f963e;

    /* renamed from: f */
    public final /* synthetic */ int f964f;

    /* renamed from: a */
    public final Object f959a = new Object();

    /* renamed from: b */
    public final C0506m f960b = new C0506m(this);

    /* renamed from: d */
    public WeakReference f962d = new WeakReference(null);

    public C0373o(int i) {
        this.f964f = i;
    }

    /* renamed from: a */
    public final void m957a(C0508o c0508o, Handler handler) {
        if (this.f961c) {
            this.f961c = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompatM1220d = c0508o.m1220d();
            long j2 = playbackStateCompatM1220d == null ? 0L : playbackStateCompatM1220d.f1207e;
            boolean z2 = playbackStateCompatM1220d != null && playbackStateCompatM1220d.f1203a == 3;
            boolean z3 = (516 & j2) != 0;
            boolean z4 = (j2 & 514) != 0;
            if (z2 && z4) {
                m959c();
            } else {
                if (z2 || !z3) {
                    return;
                }
                m961e();
            }
        }
    }

    /* renamed from: c */
    public void m959c() {
        switch (this.f964f) {
            case 0:
                WebView webView = WebService.f3495r;
                if (webView != null) {
                    webView.evaluateJavascript("actPlayPause(false);", null);
                    WebService.f3486D = false;
                    break;
                }
                break;
        }
    }

    /* renamed from: e */
    public void m961e() {
        switch (this.f964f) {
            case 0:
                if (WebService.f3495r != null) {
                    C0513t c0513t = WebService.f3491n;
                    WebService.f3495r.evaluateJavascript("actPlayPause(true);", null);
                    break;
                }
                break;
        }
    }

    /* renamed from: i */
    public void m965i() {
        switch (this.f964f) {
            case 0:
                if (WebService.f3495r != null) {
                    WebService.f3484B = 6;
                    WebService.m2230e();
                    WebService.f3495r.evaluateJavascript("actSkipForward();", null);
                    break;
                }
                break;
        }
    }

    /* renamed from: l */
    public final void m968l(C0508o c0508o, Handler handler) {
        synchronized (this.f959a) {
            try {
                this.f962d = new WeakReference(c0508o);
                HandlerC0341j handlerC0341j = this.f963e;
                HandlerC0341j handlerC0341j2 = null;
                if (handlerC0341j != null) {
                    handlerC0341j.removeCallbacksAndMessages(null);
                }
                if (c0508o != null && handler != null) {
                    handlerC0341j2 = new HandlerC0341j(this, handler.getLooper(), 2);
                }
                this.f963e = handlerC0341j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m958b(String str) {
    }

    /* renamed from: g */
    public final void m963g(String str) {
    }

    /* renamed from: h */
    public final void m964h(long j2) {
    }

    /* renamed from: d */
    public final void m960d() {
    }

    /* renamed from: f */
    public final void m962f() {
    }

    /* renamed from: j */
    public final void m966j() {
    }

    /* renamed from: k */
    public final void m967k() {
    }
}
