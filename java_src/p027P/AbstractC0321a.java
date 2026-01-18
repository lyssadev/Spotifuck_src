package p027P;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: P.a */
/* loaded from: classes.dex */
public abstract class AbstractC0321a {
    /* renamed from: a */
    public static Interpolator m920a(float f2, float f3) {
        return new PathInterpolator(f2, f3);
    }

    /* renamed from: b */
    public static Interpolator m921b(float f2, float f3, float f4, float f5) {
        return new PathInterpolator(f2, f3, f4, f5);
    }

    /* renamed from: c */
    public static Interpolator m922c(Path path) {
        return new PathInterpolator(path);
    }
}
