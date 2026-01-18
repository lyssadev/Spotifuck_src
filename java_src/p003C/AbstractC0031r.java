package p003C;

import android.app.Notification;
import android.content.LocusId;

/* renamed from: C.r */
/* loaded from: classes.dex */
public abstract class AbstractC0031r {
    /* renamed from: a */
    public static Notification.Builder m147a(Notification.Builder builder, boolean z2) {
        return builder.setAllowSystemGeneratedContextualActions(z2);
    }

    /* renamed from: b */
    public static Notification.Builder m148b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    /* renamed from: c */
    public static Notification.Action.Builder m149c(Notification.Action.Builder builder, boolean z2) {
        return builder.setContextual(z2);
    }

    /* renamed from: d */
    public static Notification.Builder m150d(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }
}
