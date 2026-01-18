package p087o;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import p010G.C0102i;
import p010G.InterfaceC0101h;

/* renamed from: o.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC1181p0 {

    /* renamed from: a */
    public static final int[] f4709a = {R.attr.state_checked};

    /* renamed from: b */
    public static final int[] f4710b = new int[0];

    /* renamed from: c */
    public static final Rect f4711c = new Rect();

    /* renamed from: a */
    public static void m2803a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = f4709a;
        int[] iArr2 = f4710b;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state);
            return;
        }
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state2 = drawable.getState();
        if (state2 == null || state2.length == 0) {
            drawable.setState(iArr);
        } else {
            drawable.setState(iArr2);
        }
        drawable.setState(state2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static Rect m2804b(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsM2802a = AbstractC1179o0.m2802a(drawable);
            return new Rect(insetsM2802a.left, insetsM2802a.top, insetsM2802a.right, insetsM2802a.bottom);
        }
        boolean z2 = drawable instanceof InterfaceC0101h;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = ((C0102i) ((InterfaceC0101h) drawable)).f281k;
        }
        if (i >= 29) {
            boolean z3 = AbstractC1176n0.f4693a;
        } else if (AbstractC1176n0.f4693a) {
            try {
                Object objInvoke = AbstractC1176n0.f4694b.invoke(drawable2, null);
                if (objInvoke != null) {
                    return new Rect(AbstractC1176n0.f4695c.getInt(objInvoke), AbstractC1176n0.f4696d.getInt(objInvoke), AbstractC1176n0.f4697e.getInt(objInvoke), AbstractC1176n0.f4698f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f4711c;
    }

    /* renamed from: c */
    public static PorterDuff.Mode m2805c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
