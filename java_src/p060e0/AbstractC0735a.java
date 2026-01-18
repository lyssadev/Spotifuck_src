package p060e0;

import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* renamed from: e0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0735a {
    /* renamed from: a */
    public static Notification.MediaStyle m1959a() {
        return new Notification.MediaStyle();
    }

    /* renamed from: b */
    public static Notification.MediaStyle m1960b(Notification.MediaStyle mediaStyle, int[] iArr, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (iArr != null) {
            m1963e(mediaStyle, iArr);
        }
        if (mediaSessionCompat$Token != null) {
            m1961c(mediaStyle, (MediaSession.Token) mediaSessionCompat$Token.f1195b);
        }
        return mediaStyle;
    }

    /* renamed from: c */
    public static void m1961c(Notification.MediaStyle mediaStyle, MediaSession.Token token) {
        mediaStyle.setMediaSession(token);
    }

    /* renamed from: d */
    public static void m1962d(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    /* renamed from: e */
    public static void m1963e(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
