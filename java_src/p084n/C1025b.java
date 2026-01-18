package p084n;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p087o.AbstractViewOnTouchListenerC1199y0;
import p087o.C1154g;
import p087o.C1157h;
import p087o.C1163j;
import p087o.C1166k;

/* renamed from: n.b */
/* loaded from: classes.dex */
public final class C1025b extends AbstractViewOnTouchListenerC1199y0 {

    /* renamed from: o */
    public final /* synthetic */ int f4211o = 0;

    /* renamed from: p */
    public final /* synthetic */ View f4212p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f4212p = actionMenuItemView;
    }

    @Override // p087o.AbstractViewOnTouchListenerC1199y0
    /* renamed from: b */
    public final InterfaceC1021B mo2569b() {
        C1154g c1154g;
        switch (this.f4211o) {
            case 0:
                AbstractC1026c abstractC1026c = ((ActionMenuItemView) this.f4212p).f1345r;
                if (abstractC1026c == null || (c1154g = ((C1157h) abstractC1026c).f4622a.f4684y) == null) {
                    return null;
                }
                return c1154g.m2602a();
            default:
                C1154g c1154g2 = ((C1163j) this.f4212p).f4652i.f4683x;
                if (c1154g2 == null) {
                    return null;
                }
                return c1154g2.m2602a();
        }
    }

    @Override // p087o.AbstractViewOnTouchListenerC1199y0
    /* renamed from: c */
    public final boolean mo2570c() {
        InterfaceC1021B interfaceC1021BMo2569b;
        switch (this.f4211o) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f4212p;
                InterfaceC1034k interfaceC1034k = actionMenuItemView.f1343p;
                return interfaceC1034k != null && interfaceC1034k.mo1319c(actionMenuItemView.f1340m) && (interfaceC1021BMo2569b = mo2569b()) != null && interfaceC1021BMo2569b.mo2544a();
            default:
                ((C1163j) this.f4212p).f4652i.m2800l();
                return true;
        }
    }

    @Override // p087o.AbstractViewOnTouchListenerC1199y0
    /* renamed from: d */
    public boolean mo2571d() {
        switch (this.f4211o) {
            case 1:
                C1166k c1166k = ((C1163j) this.f4212p).f4652i;
                if (c1166k.f4685z != null) {
                    return false;
                }
                c1166k.m2798e();
                return true;
            default:
                return super.mo2571d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025b(C1163j c1163j, C1163j c1163j2) {
        super(c1163j2);
        this.f4212p = c1163j;
    }
}
