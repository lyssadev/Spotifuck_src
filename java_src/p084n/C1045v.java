package p084n;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import it.deviato.spotifuck.R;

/* renamed from: n.v */
/* loaded from: classes.dex */
public class C1045v {

    /* renamed from: a */
    public final Context f4326a;

    /* renamed from: b */
    public final MenuC1035l f4327b;

    /* renamed from: c */
    public final boolean f4328c;

    /* renamed from: d */
    public final int f4329d;

    /* renamed from: e */
    public View f4330e;

    /* renamed from: g */
    public boolean f4332g;

    /* renamed from: h */
    public InterfaceC1046w f4333h;

    /* renamed from: i */
    public AbstractC1043t f4334i;

    /* renamed from: j */
    public C1044u f4335j;

    /* renamed from: f */
    public int f4331f = 8388611;

    /* renamed from: k */
    public final C1044u f4336k = new C1044u(this);

    public C1045v(int i, Context context, View view, MenuC1035l menuC1035l, boolean z2) {
        this.f4326a = context;
        this.f4327b = menuC1035l;
        this.f4330e = view;
        this.f4328c = z2;
        this.f4329d = i;
    }

    /* renamed from: a */
    public final AbstractC1043t m2602a() {
        AbstractC1043t viewOnKeyListenerC1022C;
        if (this.f4334i == null) {
            Context context = this.f4326a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1022C = new ViewOnKeyListenerC1029f(context, this.f4330e, this.f4329d, this.f4328c);
            } else {
                View view = this.f4330e;
                Context context2 = this.f4326a;
                boolean z2 = this.f4328c;
                viewOnKeyListenerC1022C = new ViewOnKeyListenerC1022C(this.f4329d, context2, view, this.f4327b, z2);
            }
            viewOnKeyListenerC1022C.mo2552l(this.f4327b);
            viewOnKeyListenerC1022C.mo2557r(this.f4336k);
            viewOnKeyListenerC1022C.mo2553n(this.f4330e);
            viewOnKeyListenerC1022C.mo2551j(this.f4333h);
            viewOnKeyListenerC1022C.mo2554o(this.f4332g);
            viewOnKeyListenerC1022C.mo2555p(this.f4331f);
            this.f4334i = viewOnKeyListenerC1022C;
        }
        return this.f4334i;
    }

    /* renamed from: b */
    public final boolean m2603b() {
        AbstractC1043t abstractC1043t = this.f4334i;
        return abstractC1043t != null && abstractC1043t.mo2544a();
    }

    /* renamed from: c */
    public void mo2604c() {
        this.f4334i = null;
        C1044u c1044u = this.f4335j;
        if (c1044u != null) {
            c1044u.onDismiss();
        }
    }

    /* renamed from: d */
    public final void m2605d(int i, int i2, boolean z2, boolean z3) {
        AbstractC1043t abstractC1043tM2602a = m2602a();
        abstractC1043tM2602a.mo2558s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f4331f, this.f4330e.getLayoutDirection()) & 7) == 5) {
                i -= this.f4330e.getWidth();
            }
            abstractC1043tM2602a.mo2556q(i);
            abstractC1043tM2602a.mo2559t(i2);
            int i3 = (int) ((this.f4326a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC1043tM2602a.f4324f = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC1043tM2602a.mo2546i();
    }
}
