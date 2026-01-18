package p003C;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* renamed from: C.n */
/* loaded from: classes.dex */
public abstract class AbstractC0027n {
    /* renamed from: a */
    public static Notification.Action.Builder m130a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }

    /* renamed from: b */
    public static Notification.Builder m131b(Notification.Builder builder, Icon icon) {
        return builder.setLargeIcon(icon);
    }

    /* renamed from: c */
    public static Notification.Builder m132c(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }
}
