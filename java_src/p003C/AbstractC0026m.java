package p003C;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;

/* renamed from: C.m */
/* loaded from: classes.dex */
public abstract class AbstractC0026m {
    /* renamed from: a */
    public static Notification.Builder m124a(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    /* renamed from: b */
    public static Notification.Builder m125b(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    /* renamed from: c */
    public static Notification.Builder m126c(Notification.Builder builder, int i) {
        return builder.setColor(i);
    }

    /* renamed from: d */
    public static Notification.Builder m127d(Notification.Builder builder, Notification notification) {
        return builder.setPublicVersion(notification);
    }

    /* renamed from: e */
    public static Notification.Builder m128e(Notification.Builder builder, Uri uri, Object obj) {
        return builder.setSound(uri, (AudioAttributes) obj);
    }

    /* renamed from: f */
    public static Notification.Builder m129f(Notification.Builder builder, int i) {
        return builder.setVisibility(i);
    }
}
