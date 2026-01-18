package android.support.v4.media;

import android.media.Rating;

/* renamed from: android.support.v4.media.j */
/* loaded from: classes.dex */
public abstract class AbstractC0492j {
    /* renamed from: a */
    public static float m1153a(Rating rating) {
        return rating.getPercentRating();
    }

    /* renamed from: b */
    public static int m1154b(Rating rating) {
        return rating.getRatingStyle();
    }

    /* renamed from: c */
    public static float m1155c(Rating rating) {
        return rating.getStarRating();
    }

    /* renamed from: d */
    public static boolean m1156d(Rating rating) {
        return rating.hasHeart();
    }

    /* renamed from: e */
    public static boolean m1157e(Rating rating) {
        return rating.isRated();
    }

    /* renamed from: f */
    public static boolean m1158f(Rating rating) {
        return rating.isThumbUp();
    }

    /* renamed from: g */
    public static Rating m1159g(boolean z2) {
        return Rating.newHeartRating(z2);
    }

    /* renamed from: h */
    public static Rating m1160h(float f2) {
        return Rating.newPercentageRating(f2);
    }

    /* renamed from: i */
    public static Rating m1161i(int i, float f2) {
        return Rating.newStarRating(i, f2);
    }

    /* renamed from: j */
    public static Rating m1162j(boolean z2) {
        return Rating.newThumbRating(z2);
    }

    /* renamed from: k */
    public static Rating m1163k(int i) {
        return Rating.newUnratedRating(i);
    }
}
