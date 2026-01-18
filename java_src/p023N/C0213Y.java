package p023N;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import p010G.AbstractC0094a;
import p024N0.C0284l;
import p085n0.AbstractC1070m;
import p088o0.C1207f;
import p112y0.C1362a;
import p112y0.C1364c;

/* renamed from: N.Y */
/* loaded from: classes.dex */
public final class C0213Y extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f570a;

    /* renamed from: b */
    public final /* synthetic */ Object f571b;

    public /* synthetic */ C0213Y(int i, Object obj) {
        this.f570a = i;
        this.f571b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f570a) {
            case 0:
                ((InterfaceC0216a0) this.f571b).mo705b();
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f571b;
                actionBarOverlayLayout.f1403B = null;
                actionBarOverlayLayout.f1418o = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f570a) {
            case 0:
                ((InterfaceC0216a0) this.f571b).mo704a();
                break;
            case 1:
                C0284l c0284l = (C0284l) this.f571b;
                c0284l.m850q();
                c0284l.f713r.start();
                break;
            case 2:
                ((AbstractC1070m) this.f571b).m2652m();
                animator.removeListener(this);
                break;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f571b;
                actionBarOverlayLayout.f1403B = null;
                actionBarOverlayLayout.f1418o = false;
                break;
            case 4:
                C1207f c1207f = (C1207f) this.f571b;
                ArrayList arrayList = new ArrayList(c1207f.f4797j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C1362a) arrayList.get(i)).f5675b.f5694t;
                    if (colorStateList != null) {
                        AbstractC0094a.m363h(c1207f, colorStateList);
                    }
                }
                break;
            default:
                ((HideBottomViewOnScrollBehavior) this.f571b).f2287h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f570a) {
            case 0:
                ((InterfaceC0216a0) this.f571b).mo706c();
                break;
            case 4:
                C1207f c1207f = (C1207f) this.f571b;
                ArrayList arrayList = new ArrayList(c1207f.f4797j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C1364c c1364c = ((C1362a) arrayList.get(i)).f5675b;
                    ColorStateList colorStateList = c1364c.f5694t;
                    if (colorStateList != null) {
                        AbstractC0094a.m362g(c1207f, colorStateList.getColorForState(c1364c.f5698x, colorStateList.getDefaultColor()));
                    }
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0213Y(InterfaceC0216a0 interfaceC0216a0, View view) {
        this.f570a = 0;
        this.f571b = interfaceC0216a0;
    }
}
