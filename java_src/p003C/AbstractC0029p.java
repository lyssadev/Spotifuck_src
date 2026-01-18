package p003C;

import android.app.Notification;
import android.content.Context;

/* renamed from: C.p */
/* loaded from: classes.dex */
public abstract class AbstractC0029p {
    /* renamed from: a */
    public static Notification.Builder m138a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* renamed from: b */
    public static Notification.Builder m139b(Notification.Builder builder, int i) {
        return builder.setBadgeIconType(i);
    }

    /* renamed from: c */
    public static Notification.Builder m140c(Notification.Builder builder, boolean z2) {
        return builder.setColorized(z2);
    }

    /* renamed from: d */
    public static Notification.Builder m141d(Notification.Builder builder, int i) {
        return builder.setGroupAlertBehavior(i);
    }

    /* renamed from: e */
    public static Notification.Builder m142e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    /* renamed from: f */
    public static Notification.Builder m143f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    /* renamed from: g */
    public static Notification.Builder m144g(Notification.Builder builder, long j2) {
        return builder.setTimeoutAfter(j2);
    }
}
