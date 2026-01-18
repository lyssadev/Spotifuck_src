package p084n;

import android.view.ActionProvider;
import p074j0.C0944w;

/* renamed from: n.o */
/* loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC1038o implements ActionProvider.VisibilityListener {

    /* renamed from: a */
    public C0944w f4314a;

    /* renamed from: b */
    public final ActionProvider f4315b;

    /* renamed from: c */
    public final /* synthetic */ MenuItemC1042s f4316c;

    public ActionProviderVisibilityListenerC1038o(MenuItemC1042s menuItemC1042s, ActionProvider actionProvider) {
        this.f4316c = menuItemC1042s;
        this.f4315b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z2) {
        C0944w c0944w = this.f4314a;
        if (c0944w != null) {
            MenuC1035l menuC1035l = ((C1037n) c0944w.f3861f).f4301n;
            menuC1035l.f4265h = true;
            menuC1035l.m2587p(true);
        }
    }
}
