package p068h;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import p007E.C0057j;
import p023N.AbstractC0193D;
import p023N.AbstractC0206Q;
import p091p0.AbstractC1230a;

/* renamed from: h.L */
/* loaded from: classes.dex */
public final class C0827L extends AbstractC1230a {

    /* renamed from: o */
    public final /* synthetic */ int f3180o;

    /* renamed from: p */
    public final /* synthetic */ C0829N f3181p;

    public /* synthetic */ C0827L(C0829N c0829n, int i) {
        this.f3180o = i;
        this.f3181p = c0829n;
    }

    @Override // p023N.InterfaceC0216a0
    /* renamed from: a */
    public final void mo704a() {
        View view;
        C0829N c0829n = this.f3181p;
        switch (this.f3180o) {
            case 0:
                if (c0829n.f3212z && (view = c0829n.f3204r) != null) {
                    view.setTranslationY(0.0f);
                    c0829n.f3201o.setTranslationY(0.0f);
                }
                c0829n.f3201o.setVisibility(8);
                c0829n.f3201o.setTransitioning(false);
                c0829n.f3192D = null;
                C0057j c0057j = c0829n.f3208v;
                if (c0057j != null) {
                    c0057j.m255E(c0829n.f3207u);
                    c0829n.f3207u = null;
                    c0829n.f3208v = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0829n.f3200n;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                    AbstractC0193D.m594c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c0829n.f3192D = null;
                c0829n.f3201o.requestLayout();
                break;
        }
    }
}
