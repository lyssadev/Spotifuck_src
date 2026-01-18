package p023N;

import android.view.VelocityTracker;

/* renamed from: N.w */
/* loaded from: classes.dex */
public abstract class AbstractC0259w {
    /* renamed from: a */
    public static float m796a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    /* renamed from: b */
    public static float m797b(VelocityTracker velocityTracker, int i, int i2) {
        return velocityTracker.getAxisVelocity(i, i2);
    }

    /* renamed from: c */
    public static boolean m798c(VelocityTracker velocityTracker, int i) {
        return velocityTracker.isAxisSupported(i);
    }
}
