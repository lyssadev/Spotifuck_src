package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: android.support.v4.media.g */
/* loaded from: classes.dex */
public abstract class AbstractC0489g {
    /* renamed from: a */
    public static MediaDescription m1134a(MediaDescription.Builder builder) {
        return builder.build();
    }

    /* renamed from: b */
    public static MediaDescription.Builder m1135b() {
        return new MediaDescription.Builder();
    }

    /* renamed from: c */
    public static CharSequence m1136c(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    /* renamed from: d */
    public static Bundle m1137d(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    /* renamed from: e */
    public static Bitmap m1138e(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    /* renamed from: f */
    public static Uri m1139f(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    /* renamed from: g */
    public static String m1140g(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    /* renamed from: h */
    public static CharSequence m1141h(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    /* renamed from: i */
    public static CharSequence m1142i(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    /* renamed from: j */
    public static void m1143j(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    /* renamed from: k */
    public static void m1144k(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* renamed from: l */
    public static void m1145l(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    /* renamed from: m */
    public static void m1146m(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    /* renamed from: n */
    public static void m1147n(MediaDescription.Builder builder, String str) {
        builder.setMediaId(str);
    }

    /* renamed from: o */
    public static void m1148o(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* renamed from: p */
    public static void m1149p(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
