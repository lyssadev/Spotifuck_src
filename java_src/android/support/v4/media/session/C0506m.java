package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.AbstractC0492j;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;
import it.deviato.spotifuck.WebService;
import p030Q0.HandlerC0341j;
import p032R0.C0373o;
import p058d0.C0730r;
import p091p0.InterfaceC1233d;

/* renamed from: android.support.v4.media.session.m */
/* loaded from: classes.dex */
public final class C0506m extends MediaSession.Callback {

    /* renamed from: a */
    public final /* synthetic */ C0373o f1229a;

    public C0506m(C0373o c0373o) {
        this.f1229a = c0373o;
    }

    /* renamed from: b */
    public static void m1215b(C0508o c0508o) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        MediaSession mediaSession = c0508o.f1232a;
        String str = null;
        if (i >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        c0508o.mo1222f(new C0730r(str, -1, -1));
    }

    /* renamed from: a */
    public final C0508o m1216a() {
        C0508o c0508o;
        synchronized (this.f1229a.f959a) {
            c0508o = (C0508o) this.f1229a.f962d.get();
        }
        if (c0508o == null || this.f1229a != c0508o.m1218b()) {
            return null;
        }
        return c0508o;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        InterfaceC1233d interfaceC1233d;
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        C0513t.m1226j(bundle);
        m1215b(c0508oM1216a);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = c0508oM1216a.f1234c;
                InterfaceC0497d interfaceC0497dM1164a = mediaSessionCompat$Token.m1164a();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", interfaceC0497dM1164a == null ? null : interfaceC0497dM1164a.asBinder());
                synchronized (mediaSessionCompat$Token.f1194a) {
                    interfaceC1233d = mediaSessionCompat$Token.f1197d;
                }
                if (interfaceC1233d != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(interfaceC1233d));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                C0373o c0373o = this.f1229a;
                c0373o.getClass();
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                C0373o c0373o2 = this.f1229a;
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                c0373o2.getClass();
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                C0373o c0373o3 = this.f1229a;
                c0373o3.getClass();
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.f1229a.getClass();
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        C0513t.m1226j(bundle);
        m1215b(c0508oM1216a);
        try {
            boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            C0373o c0373o = this.f1229a;
            if (!zEquals) {
                if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                    if (!str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        if (!str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            if (!str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                                if (!str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                                    if (!str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                                        if (!str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                                            if (!str.equals("android.support.v4.media.session.action.SET_RATING")) {
                                                if (!str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                                                    switch (c0373o.f964f) {
                                                        case 0:
                                                            if (WebService.f3495r != null) {
                                                                str.getClass();
                                                                if (!str.equals("REPEAT_ACTION")) {
                                                                    if (str.equals("ADDTOFAV_ACTION")) {
                                                                        WebService.f3495r.evaluateJavascript("actAddToFav();", null);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    WebService.f3495r.evaluateJavascript("actRepeat();", null);
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                                                    c0373o.getClass();
                                                }
                                            } else {
                                                C0513t.m1226j(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                                c0373o.getClass();
                                            }
                                        } else {
                                            bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                                            c0373o.getClass();
                                        }
                                    } else {
                                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                                        c0373o.getClass();
                                    }
                                } else {
                                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                                    c0373o.getClass();
                                }
                            } else {
                                C0513t.m1226j(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                                c0373o.getClass();
                            }
                        } else {
                            bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            C0513t.m1226j(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                            c0373o.getClass();
                        }
                    } else {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        C0513t.m1226j(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        c0373o.getClass();
                    }
                } else {
                    c0373o.getClass();
                }
            } else {
                C0513t.m1226j(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                c0373o.getClass();
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        C0508o c0508o;
        HandlerC0341j handlerC0341j;
        KeyEvent keyEvent;
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return false;
        }
        m1215b(c0508oM1216a);
        C0373o c0373o = this.f1229a;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 27) {
            c0373o.getClass();
        } else {
            synchronized (c0373o.f959a) {
                c0508o = (C0508o) c0373o.f962d.get();
                handlerC0341j = c0373o.f963e;
            }
            if (c0508o != null && handlerC0341j != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                C0730r c0730rMo1219c = c0508o.mo1219c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 79 || keyCode == 85) {
                    if (keyEvent.getRepeatCount() != 0) {
                        c0373o.m957a(c0508o, handlerC0341j);
                    } else if (c0373o.f961c) {
                        handlerC0341j.removeMessages(1);
                        c0373o.f961c = false;
                        PlaybackStateCompat playbackStateCompatM1220d = c0508o.m1220d();
                        if (((playbackStateCompatM1220d == null ? 0L : playbackStateCompatM1220d.f1207e) & 32) != 0) {
                            c0373o.m965i();
                        }
                    } else {
                        c0373o.f961c = true;
                        handlerC0341j.sendMessageDelayed(handlerC0341j.obtainMessage(1, c0730rMo1219c), ViewConfiguration.getDoubleTapTimeout());
                    }
                    z2 = true;
                } else {
                    c0373o.m957a(c0508o, handlerC0341j);
                }
            }
        }
        c0508oM1216a.mo1222f(null);
        return z2 || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        this.f1229a.m959c();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        this.f1229a.m961e();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        C0513t.m1226j(bundle);
        m1215b(c0508oM1216a);
        switch (this.f1229a.f964f) {
            case 0:
                if (WebService.f3495r != null) {
                    WebService.f3484B = 6;
                    WebService.m2230e();
                    WebService.f3495r.evaluateJavascript("playFromUri('" + str + "');", null);
                    break;
                }
                break;
        }
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        C0513t.m1226j(bundle);
        m1215b(c0508oM1216a);
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        C0513t.m1226j(bundle);
        m1215b(c0508oM1216a);
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        C0513t.m1226j(bundle);
        m1215b(c0508oM1216a);
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        C0513t.m1226j(bundle);
        m1215b(c0508oM1216a);
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        C0513t.m1226j(bundle);
        m1215b(c0508oM1216a);
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j2) {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        switch (this.f1229a.f964f) {
            case 0:
                if (WebService.f3495r != null) {
                    WebService.f3483A = j2;
                    WebService.m2230e();
                    WebService.f3495r.evaluateJavascript("actSeek(" + j2 + ");", null);
                    break;
                }
                break;
        }
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f2) {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f2;
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        RatingCompat ratingCompat = null;
        if (rating != null) {
            int iM1154b = AbstractC0492j.m1154b(rating);
            if (!AbstractC0492j.m1157e(rating)) {
                switch (iM1154b) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(iM1154b, -1.0f);
                        break;
                }
            } else {
                switch (iM1154b) {
                    case 1:
                        ratingCompat = new RatingCompat(1, AbstractC0492j.m1156d(rating) ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, AbstractC0492j.m1158f(rating) ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fM1155c = AbstractC0492j.m1155c(rating);
                        if (iM1154b == 3) {
                            f2 = 3.0f;
                        } else if (iM1154b == 4) {
                            f2 = 4.0f;
                        } else if (iM1154b != 5) {
                            Log.e("Rating", "Invalid rating style (" + iM1154b + ") for a star rating");
                            break;
                        } else {
                            f2 = 5.0f;
                        }
                        if (fM1155c >= 0.0f && fM1155c <= f2) {
                            ratingCompat = new RatingCompat(iM1154b, fM1155c);
                            break;
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                            break;
                        }
                    case 6:
                        float fM1153a = AbstractC0492j.m1153a(rating);
                        if (fM1153a >= 0.0f && fM1153a <= 100.0f) {
                            ratingCompat = new RatingCompat(6, fM1153a);
                            break;
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                            break;
                        }
                }
            }
            ratingCompat.getClass();
        }
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        this.f1229a.m965i();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        switch (this.f1229a.f964f) {
            case 0:
                if (WebService.f3495r != null) {
                    WebService.f3484B = 6;
                    WebService.m2230e();
                    WebService.f3495r.evaluateJavascript("actSkipBack();", null);
                    break;
                }
                break;
        }
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j2) {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        C0508o c0508oM1216a = m1216a();
        if (c0508oM1216a == null) {
            return;
        }
        m1215b(c0508oM1216a);
        this.f1229a.getClass();
        c0508oM1216a.mo1222f(null);
    }
}
