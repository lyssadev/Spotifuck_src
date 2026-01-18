package p003C;

import android.app.Notification;

/* renamed from: C.s */
/* loaded from: classes.dex */
public abstract class AbstractC0032s {
    /* renamed from: a */
    public static Notification.Action.Builder m151a(Notification.Action.Builder builder, boolean z2) {
        return builder.setAuthenticationRequired(z2);
    }

    /* renamed from: b */
    public static Notification.Builder m152b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
