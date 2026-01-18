package p087o;

import android.content.Context;
import android.view.View;
import it.deviato.spotifuck.R;
import p074j0.C0944w;
import p084n.AbstractC1043t;
import p084n.C1045v;
import p084n.MenuC1035l;
import p084n.SubMenuC1023D;

/* renamed from: o.g */
/* loaded from: classes.dex */
public final class C1154g extends C1045v {

    /* renamed from: l */
    public final /* synthetic */ int f4620l = 0;

    /* renamed from: m */
    public final /* synthetic */ C1166k f4621m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154g(C1166k c1166k, Context context, MenuC1035l menuC1035l, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC1035l, true);
        this.f4621m = c1166k;
        this.f4331f = 8388613;
        C0944w c0944w = c1166k.f4664B;
        this.f4333h = c0944w;
        AbstractC1043t abstractC1043t = this.f4334i;
        if (abstractC1043t != null) {
            abstractC1043t.mo2551j(c0944w);
        }
    }

    @Override // p084n.C1045v
    /* renamed from: c */
    public final void mo2604c() {
        switch (this.f4620l) {
            case 0:
                C1166k c1166k = this.f4621m;
                c1166k.f4684y = null;
                c1166k.getClass();
                super.mo2604c();
                break;
            default:
                C1166k c1166k2 = this.f4621m;
                MenuC1035l menuC1035l = c1166k2.f4667h;
                if (menuC1035l != null) {
                    menuC1035l.m2582c(true);
                }
                c1166k2.f4683x = null;
                super.mo2604c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1154g(C1166k c1166k, Context context, SubMenuC1023D subMenuC1023D, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC1023D, false);
        this.f4621m = c1166k;
        if (!subMenuC1023D.f4193A.m2598f()) {
            View view2 = c1166k.f4673n;
            this.f4330e = view2 == null ? (View) c1166k.f4672m : view2;
        }
        C0944w c0944w = c1166k.f4664B;
        this.f4333h = c0944w;
        AbstractC1043t abstractC1043t = this.f4334i;
        if (abstractC1043t != null) {
            abstractC1043t.mo2551j(c0944w);
        }
    }
}
