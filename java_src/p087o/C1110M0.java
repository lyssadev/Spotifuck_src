package p087o;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p074j0.C0944w;
import p084n.C1037n;
import p084n.MenuC1035l;

/* renamed from: o.M0 */
/* loaded from: classes.dex */
public final class C1110M0 extends C1100H0 implements InterfaceC1102I0 {

    /* renamed from: J */
    public static final Method f4513J;

    /* renamed from: I */
    public C0944w f4514I;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f4513J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // p087o.InterfaceC1102I0
    /* renamed from: g */
    public final void mo2405g(MenuC1035l menuC1035l, C1037n c1037n) {
        C0944w c0944w = this.f4514I;
        if (c0944w != null) {
            c0944w.mo2405g(menuC1035l, c1037n);
        }
    }

    @Override // p087o.InterfaceC1102I0
    /* renamed from: o */
    public final void mo2408o(MenuC1035l menuC1035l, C1037n c1037n) {
        C0944w c0944w = this.f4514I;
        if (c0944w != null) {
            c0944w.mo2408o(menuC1035l, c1037n);
        }
    }

    @Override // p087o.C1100H0
    /* renamed from: q */
    public final C1193v0 mo2705q(Context context, boolean z2) {
        C1108L0 c1108l0 = new C1108L0(context, z2);
        c1108l0.setHoverListener(this);
        return c1108l0;
    }
}
