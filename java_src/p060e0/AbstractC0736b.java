package p060e0;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;

/* renamed from: e0.b */
/* loaded from: classes.dex */
public abstract class AbstractC0736b {
    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static Notification.MediaStyle m1964a(Notification.MediaStyle mediaStyle, CharSequence charSequence, int i, PendingIntent pendingIntent, Boolean bool) {
        if (bool.booleanValue()) {
            mediaStyle.setRemotePlaybackInfo(charSequence, i, pendingIntent);
        }
        return mediaStyle;
    }
}
