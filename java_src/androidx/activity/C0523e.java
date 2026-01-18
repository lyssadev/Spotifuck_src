package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0644l;
import androidx.lifecycle.InterfaceC0648p;
import androidx.lifecycle.InterfaceC0650r;
import p047Z0.AbstractC0469c;
import p068h.AbstractActivityC0841l;
import p077k0.C0958c;

/* renamed from: androidx.activity.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0523e implements InterfaceC0648p {

    /* renamed from: a */
    public final /* synthetic */ int f1268a;

    /* renamed from: b */
    public final /* synthetic */ Object f1269b;

    public /* synthetic */ C0523e(int i, Object obj) {
        this.f1268a = i;
        this.f1269b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0648p
    /* renamed from: b */
    public final void mo1283b(InterfaceC0650r interfaceC0650r, EnumC0644l enumC0644l) {
        Window window;
        View viewPeekDecorView;
        switch (this.f1268a) {
            case 0:
                if (enumC0644l == EnumC0644l.ON_STOP && (window = ((AbstractActivityC0841l) this.f1269b).getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0841l abstractActivityC0841l = (AbstractActivityC0841l) this.f1269b;
                if (enumC0644l == EnumC0644l.ON_DESTROY) {
                    abstractActivityC0841l.f1291g.f2265b = null;
                    if (!abstractActivityC0841l.isChangingConfigurations()) {
                        abstractActivityC0841l.mo1298c().m1608a();
                    }
                    ViewTreeObserverOnDrawListenerC0529k viewTreeObserverOnDrawListenerC0529k = abstractActivityC0841l.f1295k;
                    AbstractActivityC0841l abstractActivityC0841l2 = viewTreeObserverOnDrawListenerC0529k.f1280d;
                    abstractActivityC0841l2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0529k);
                    abstractActivityC0841l2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0529k);
                    break;
                }
                break;
            default:
                C0958c c0958c = (C0958c) this.f1269b;
                AbstractC0469c.m1102e("this$0", c0958c);
                if (enumC0644l != EnumC0644l.ON_START) {
                    if (enumC0644l == EnumC0644l.ON_STOP) {
                        c0958c.f3914c = false;
                        break;
                    }
                } else {
                    c0958c.f3914c = true;
                    break;
                }
                break;
        }
    }
}
