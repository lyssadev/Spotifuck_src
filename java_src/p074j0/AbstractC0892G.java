package p074j0;

import android.support.v4.media.session.C0513t;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p023N.C0247q;

/* renamed from: j0.G */
/* loaded from: classes.dex */
public abstract class AbstractC0892G {

    /* renamed from: a */
    public C0887B f3574a;

    /* renamed from: b */
    public ArrayList f3575b;

    /* renamed from: c */
    public long f3576c;

    /* renamed from: d */
    public long f3577d;

    /* renamed from: e */
    public long f3578e;

    /* renamed from: f */
    public long f3579f;

    /* renamed from: b */
    public static void m2257b(AbstractC0912a0 abstractC0912a0) {
        RecyclerView recyclerView;
        int i = abstractC0912a0.f3663j;
        if (abstractC0912a0.m2322g() || (i & 4) != 0 || (recyclerView = abstractC0912a0.f3671r) == null) {
            return;
        }
        recyclerView.m1761F(abstractC0912a0);
    }

    /* renamed from: a */
    public abstract boolean mo2258a(AbstractC0912a0 abstractC0912a0, AbstractC0912a0 abstractC0912a02, C0247q c0247q, C0247q c0247q2);

    /* renamed from: c */
    public final void m2259c(AbstractC0912a0 abstractC0912a0) {
        C0887B c0887b = this.f3574a;
        if (c0887b != null) {
            boolean z2 = true;
            abstractC0912a0.m2330o(true);
            if (abstractC0912a0.f3661h != null && abstractC0912a0.f3662i == null) {
                abstractC0912a0.f3661h = null;
            }
            abstractC0912a0.f3662i = null;
            if ((abstractC0912a0.f3663j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0887b.f3571a;
            recyclerView.m1783c0();
            C0513t c0513t = recyclerView.f2196j;
            C0887B c0887b2 = (C0887B) c0513t.f1245b;
            RecyclerView recyclerView2 = c0887b2.f3571a;
            View view = abstractC0912a0.f3654a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                c0513t.m1231F(view);
            } else {
                C0915c c0915c = (C0915c) c0513t.f1246c;
                if (c0915c.m2357d(iIndexOfChild)) {
                    c0915c.m2359f(iIndexOfChild);
                    c0513t.m1231F(view);
                    c0887b2.m2252h(iIndexOfChild);
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                AbstractC0912a0 abstractC0912a0M1751I = RecyclerView.m1751I(view);
                C0902Q c0902q = recyclerView.f2190g;
                c0902q.m2309j(abstractC0912a0M1751I);
                c0902q.m2306g(abstractC0912a0M1751I);
            }
            recyclerView.m1784d0(!z2);
            if (z2 || !abstractC0912a0.m2326k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    /* renamed from: d */
    public abstract void mo2260d(AbstractC0912a0 abstractC0912a0);

    /* renamed from: e */
    public abstract void mo2261e();

    /* renamed from: f */
    public abstract boolean mo2262f();
}
