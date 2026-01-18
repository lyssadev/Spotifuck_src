package p100s0;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.C0685k;
import p000A.AbstractC0002c;
import p023N.AbstractC0206Q;

/* renamed from: s0.a */
/* loaded from: classes.dex */
public abstract class AbstractC1295a extends AbstractC0002c {

    /* renamed from: a */
    public C0685k f5106a;

    @Override // p000A.AbstractC0002c
    /* renamed from: g */
    public boolean mo67g(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo1844r(coordinatorLayout, view, i);
        if (this.f5106a == null) {
            this.f5106a = new C0685k(view);
        }
        C0685k c0685k = this.f5106a;
        View view2 = c0685k.f2439f;
        c0685k.f2440g = view2.getTop();
        c0685k.f2441h = view2.getLeft();
        C0685k c0685k2 = this.f5106a;
        View view3 = c0685k2.f2439f;
        AbstractC0206Q.m676k(view3, 0 - (view3.getTop() - c0685k2.f2440g));
        AbstractC0206Q.m675j(view3, 0 - (view3.getLeft() - c0685k2.f2441h));
        return true;
    }

    /* renamed from: r */
    public void mo1844r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m1388q(view, i);
    }
}
