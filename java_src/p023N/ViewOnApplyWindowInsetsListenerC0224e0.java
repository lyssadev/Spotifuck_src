package p023N;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import p007E.C0057j;
import p009F.C0084c;
import p017K.RunnableC0141n;

/* renamed from: N.e0 */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0224e0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final C0221d f591a;

    /* renamed from: b */
    public C0260w0 f592b;

    public ViewOnApplyWindowInsetsListenerC0224e0(View view, C0221d c0221d) {
        C0260w0 c0260w0Mo734b;
        this.f591a = c0221d;
        C0260w0 c0260w0M673h = AbstractC0206Q.m673h(view);
        if (c0260w0M673h != null) {
            int i = Build.VERSION.SDK_INT;
            c0260w0Mo734b = (i >= 30 ? new C0242n0(c0260w0M673h) : i >= 29 ? new C0240m0(c0260w0M673h) : new C0238l0(c0260w0M673h)).mo734b();
        } else {
            c0260w0Mo734b = null;
        }
        this.f592b = c0260w0Mo734b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0256u0 c0256u0;
        if (!view.isLaidOut()) {
            this.f592b = C0260w0.m800g(view, windowInsets);
            return C0226f0.m719i(view, windowInsets);
        }
        C0260w0 c0260w0M800g = C0260w0.m800g(view, windowInsets);
        if (this.f592b == null) {
            this.f592b = AbstractC0206Q.m673h(view);
        }
        if (this.f592b == null) {
            this.f592b = c0260w0M800g;
            return C0226f0.m719i(view, windowInsets);
        }
        C0221d c0221dM720j = C0226f0.m720j(view);
        if (c0221dM720j != null && Objects.equals((WindowInsets) c0221dM720j.f583g, windowInsets)) {
            return C0226f0.m719i(view, windowInsets);
        }
        C0260w0 c0260w0 = this.f592b;
        int i = 0;
        int i2 = 1;
        while (true) {
            c0256u0 = c0260w0M800g.f658a;
            if (i2 > 256) {
                break;
            }
            if (!c0256u0.mo774f(i2).equals(c0260w0.f658a.mo774f(i2))) {
                i |= i2;
            }
            i2 <<= 1;
        }
        if (i == 0) {
            return C0226f0.m719i(view, windowInsets);
        }
        C0260w0 c0260w02 = this.f592b;
        C0234j0 c0234j0 = new C0234j0(i, (i & 8) != 0 ? c0256u0.mo774f(8).f252d > c0260w02.f658a.mo774f(8).f252d ? C0226f0.f594e : C0226f0.f595f : C0226f0.f596g, 160L);
        c0234j0.f616a.mo726d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0234j0.f616a.mo723a());
        C0084c c0084cMo774f = c0256u0.mo774f(i);
        C0084c c0084cMo774f2 = c0260w02.f658a.mo774f(i);
        int iMin = Math.min(c0084cMo774f.f249a, c0084cMo774f2.f249a);
        int i3 = c0084cMo774f.f250b;
        int i4 = c0084cMo774f2.f250b;
        int iMin2 = Math.min(i3, i4);
        int i5 = c0084cMo774f.f251c;
        int i6 = c0084cMo774f2.f251c;
        int iMin3 = Math.min(i5, i6);
        int i7 = c0084cMo774f.f252d;
        int i8 = i;
        int i9 = c0084cMo774f2.f252d;
        C0057j c0057j = new C0057j(C0084c.m329b(iMin, iMin2, iMin3, Math.min(i7, i9)), C0084c.m329b(Math.max(c0084cMo774f.f249a, c0084cMo774f2.f249a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)), 3);
        C0226f0.m716f(view, windowInsets, false);
        duration.addUpdateListener(new C0220c0(c0234j0, c0260w0M800g, c0260w02, i8, view));
        duration.addListener(new C0222d0(c0234j0, view));
        ViewTreeObserverOnPreDrawListenerC0255u.m794a(view, new RunnableC0141n(view, c0234j0, c0057j, duration));
        this.f592b = c0260w0M800g;
        return C0226f0.m719i(view, windowInsets);
    }
}
