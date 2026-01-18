package p087o;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: o.c */
/* loaded from: classes.dex */
public final class RunnableC1142c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4591a;

    /* renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f4592b;

    public /* synthetic */ RunnableC1142c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f4591a = i;
        this.f4592b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4591a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4592b;
                actionBarOverlayLayout.m1330h();
                actionBarOverlayLayout.f1403B = actionBarOverlayLayout.f1412i.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1404C);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4592b;
                actionBarOverlayLayout2.m1330h();
                actionBarOverlayLayout2.f1403B = actionBarOverlayLayout2.f1412i.animate().translationY(-actionBarOverlayLayout2.f1412i.getHeight()).setListener(actionBarOverlayLayout2.f1404C);
                break;
        }
    }
}
