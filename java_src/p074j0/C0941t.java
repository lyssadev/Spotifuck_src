package p074j0;

import android.view.View;
import java.util.List;

/* renamed from: j0.t */
/* loaded from: classes.dex */
public final class C0941t {

    /* renamed from: a */
    public boolean f3830a;

    /* renamed from: b */
    public int f3831b;

    /* renamed from: c */
    public int f3832c;

    /* renamed from: d */
    public int f3833d;

    /* renamed from: e */
    public int f3834e;

    /* renamed from: f */
    public int f3835f;

    /* renamed from: g */
    public int f3836g;

    /* renamed from: h */
    public int f3837h;

    /* renamed from: i */
    public int f3838i;

    /* renamed from: j */
    public int f3839j;

    /* renamed from: k */
    public List f3840k;

    /* renamed from: l */
    public boolean f3841l;

    /* renamed from: a */
    public final void m2393a(View view) {
        int iM2317b;
        int size = this.f3840k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((AbstractC0912a0) this.f3840k.get(i2)).f3654a;
            C0897L c0897l = (C0897L) view3.getLayoutParams();
            if (view3 != view && !c0897l.f3601a.m2324i() && (iM2317b = (c0897l.f3601a.m2317b() - this.f3833d) * this.f3834e) >= 0 && iM2317b < i) {
                view2 = view3;
                if (iM2317b == 0) {
                    break;
                } else {
                    i = iM2317b;
                }
            }
        }
        if (view2 == null) {
            this.f3833d = -1;
        } else {
            this.f3833d = ((C0897L) view2.getLayoutParams()).f3601a.m2317b();
        }
    }

    /* renamed from: b */
    public final View m2394b(C0902Q c0902q) {
        List list = this.f3840k;
        if (list == null) {
            View view = c0902q.m2308i(this.f3833d, Long.MAX_VALUE).f3654a;
            this.f3833d += this.f3834e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((AbstractC0912a0) this.f3840k.get(i)).f3654a;
            C0897L c0897l = (C0897L) view2.getLayoutParams();
            if (!c0897l.f3601a.m2324i() && this.f3833d == c0897l.f3601a.m2317b()) {
                m2393a(view2);
                return view2;
            }
        }
        return null;
    }
}
