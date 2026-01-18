package p085n0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import p018K0.C0146e;

/* renamed from: n0.w */
/* loaded from: classes.dex */
public abstract class AbstractC1080w {

    /* renamed from: a */
    public static final C0146e f4431a;

    /* renamed from: b */
    public static final C1059b f4432b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f4431a = new C1054E(25);
        } else if (i >= 23) {
            f4431a = new C1053D(25);
        } else if (i >= 22) {
            f4431a = new C1051B(25);
        } else {
            f4431a = new C0146e(25);
        }
        f4432b = new C1059b(Float.class, "translationAlpha", 5);
        new C1059b(Rect.class, "clipBounds", 6);
    }

    /* renamed from: a */
    public static void m2663a(View view, int i, int i2, int i3, int i4) {
        f4431a.mo503n(view, i, i2, i3, i4);
    }

    /* renamed from: b */
    public static void m2664b(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f4431a.mo505p(view, i);
    }
}
