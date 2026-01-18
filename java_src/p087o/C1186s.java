package p087o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import p063f0.C0744b;
import p067g1.C0804o;

/* renamed from: o.s */
/* loaded from: classes.dex */
public final class C1186s {

    /* renamed from: b */
    public static final PorterDuff.Mode f4724b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C1186s f4725c;

    /* renamed from: a */
    public C1116P0 f4726a;

    /* renamed from: a */
    public static synchronized C1186s m2807a() {
        try {
            if (f4725c == null) {
                m2809d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4725c;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m2808c(int i, PorterDuff.Mode mode) {
        return C1116P0.m2725h(i, mode);
    }

    /* renamed from: d */
    public static synchronized void m2809d() {
        if (f4725c == null) {
            C1186s c1186s = new C1186s();
            f4725c = c1186s;
            c1186s.f4726a = C1116P0.m2724d();
            f4725c.f4726a.m2736m(new C0744b());
        }
    }

    /* renamed from: e */
    public static void m2810e(Drawable drawable, C0804o c0804o, int[] iArr) {
        PorterDuff.Mode mode = C1116P0.f4522h;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = c0804o.f2986b;
            if (z2 || c0804o.f2985a) {
                PorterDuffColorFilter porterDuffColorFilterM2725h = null;
                ColorStateList colorStateList = z2 ? (ColorStateList) c0804o.f2987c : null;
                PorterDuff.Mode mode2 = c0804o.f2985a ? (PorterDuff.Mode) c0804o.f2988d : C1116P0.f4522h;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilterM2725h = C1116P0.m2725h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilterM2725h);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* renamed from: b */
    public final synchronized Drawable m2811b(Context context, int i) {
        return this.f4726a.m2731f(context, i);
    }
}
