package p003C;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* renamed from: C.l */
/* loaded from: classes.dex */
public abstract class AbstractC0025l {
    /* renamed from: a */
    public static Notification.Builder m114a(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    /* renamed from: b */
    public static Notification.Action.Builder m115b(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    /* renamed from: c */
    public static Notification.Action.Builder m116c(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    /* renamed from: d */
    public static Notification.Action m117d(Notification.Action.Builder builder) {
        return builder.build();
    }

    /* renamed from: e */
    public static Notification.Action.Builder m118e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }

    /* renamed from: f */
    public static String m119f(Notification notification) {
        return notification.getGroup();
    }

    /* renamed from: g */
    public static Notification.Builder m120g(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    /* renamed from: h */
    public static Notification.Builder m121h(Notification.Builder builder, boolean z2) {
        return builder.setGroupSummary(z2);
    }

    /* renamed from: i */
    public static Notification.Builder m122i(Notification.Builder builder, boolean z2) {
        return builder.setLocalOnly(z2);
    }

    /* renamed from: j */
    public static Notification.Builder m123j(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }
}
