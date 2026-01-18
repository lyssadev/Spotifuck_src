package p073j;

import android.graphics.drawable.Animatable;
import p036T0.AbstractC0411g;
import p088o0.C1207f;

/* renamed from: j.a */
/* loaded from: classes.dex */
public final class C0879a extends AbstractC0411g {

    /* renamed from: l */
    public final /* synthetic */ int f3504l;

    /* renamed from: m */
    public final Animatable f3505m;

    public /* synthetic */ C0879a(Animatable animatable, int i) {
        this.f3504l = i;
        this.f3505m = animatable;
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: O */
    public final void mo1055O() {
        switch (this.f3504l) {
            case 0:
                this.f3505m.start();
                break;
            default:
                ((C1207f) this.f3505m).start();
                break;
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: P */
    public final void mo1056P() {
        switch (this.f3504l) {
            case 0:
                this.f3505m.stop();
                break;
            default:
                ((C1207f) this.f3505m).stop();
                break;
        }
    }
}
