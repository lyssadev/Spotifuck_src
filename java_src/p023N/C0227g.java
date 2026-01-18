package p023N;

import android.view.View;
import it.deviato.spotifuck.LockableHScrollView;
import it.deviato.spotifuck.MainActivity;
import p009F.C0084c;
import p024N0.InterfaceC0271E;
import p085n0.AbstractC1070m;
import p085n0.InterfaceC1068k;
import p085n0.InterfaceC1069l;

/* renamed from: N.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C0227g implements InterfaceC0271E, InterfaceC0249r, InterfaceC1069l {

    /* renamed from: f */
    public final /* synthetic */ int f597f;

    public /* synthetic */ C0227g(int i) {
        this.f597f = i;
    }

    @Override // p085n0.InterfaceC1069l
    /* renamed from: a */
    public void mo721a(InterfaceC1068k interfaceC1068k, AbstractC1070m abstractC1070m) {
        switch (this.f597f) {
            case 3:
                interfaceC1068k.mo2613f(abstractC1070m);
                break;
            case 4:
                interfaceC1068k.mo2610c(abstractC1070m);
                break;
            case 5:
                interfaceC1068k.mo2614g(abstractC1070m);
                break;
            case 6:
                interfaceC1068k.mo2608a();
                break;
            default:
                interfaceC1068k.mo2611d();
                break;
        }
    }

    @Override // p023N.InterfaceC0249r
    /* renamed from: l */
    public C0260w0 mo47l(View view, C0260w0 c0260w0) {
        LockableHScrollView lockableHScrollView = MainActivity.f3444F;
        C0084c c0084cMo774f = c0260w0.f658a.mo774f(7);
        view.setPadding(c0084cMo774f.f249a, c0084cMo774f.f250b, c0084cMo774f.f251c, c0084cMo774f.f252d);
        return c0260w0;
    }
}
