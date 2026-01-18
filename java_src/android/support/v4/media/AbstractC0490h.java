package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.h */
/* loaded from: classes.dex */
public abstract class AbstractC0490h {
    /* renamed from: a */
    public static Uri m1150a(MediaDescription mediaDescription) {
        return mediaDescription.getMediaUri();
    }

    /* renamed from: b */
    public static void m1151b(MediaDescription.Builder builder, Uri uri) {
        builder.setMediaUri(uri);
    }
}
