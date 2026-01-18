package p003C;

import android.app.Notification;
import android.widget.RemoteViews;

/* renamed from: C.o */
/* loaded from: classes.dex */
public abstract class AbstractC0028o {
    /* renamed from: a */
    public static Notification.Action.Builder m133a(Notification.Action.Builder builder, boolean z2) {
        return builder.setAllowGeneratedReplies(z2);
    }

    /* renamed from: b */
    public static Notification.Builder m134b(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    /* renamed from: c */
    public static Notification.Builder m135c(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    /* renamed from: d */
    public static Notification.Builder m136d(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }

    /* renamed from: e */
    public static Notification.Builder m137e(Notification.Builder builder, CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }
}
