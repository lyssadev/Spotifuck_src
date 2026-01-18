package p097r0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p049a0.C0480a;

/* renamed from: r0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1258a {

    /* renamed from: a */
    public static final LinearInterpolator f5017a = new LinearInterpolator();

    /* renamed from: b */
    public static final C0480a f5018b = new C0480a(C0480a.f1155d);

    /* renamed from: c */
    public static final C0480a f5019c = new C0480a();

    /* renamed from: d */
    public static final C0480a f5020d = new C0480a(C0480a.f1156e);

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    public static float m2980a(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    /* renamed from: b */
    public static float m2981b(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : m2980a(f2, f3, (f6 - f4) / (f5 - f4));
    }

    /* renamed from: c */
    public static int m2982c(int i, int i2, float f2) {
        return Math.round(f2 * (i2 - i)) + i;
    }
}
