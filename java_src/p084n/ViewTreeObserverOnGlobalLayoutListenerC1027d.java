package p084n;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p087o.C1110M0;
import p087o.C1111N;
import p087o.C1117Q;

/* renamed from: n.d */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1027d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f */
    public final /* synthetic */ int f4213f;

    /* renamed from: g */
    public final /* synthetic */ Object f4214g;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1027d(int i, Object obj) {
        this.f4213f = i;
        this.f4214g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f4213f) {
            case 0:
                ViewOnKeyListenerC1029f viewOnKeyListenerC1029f = (ViewOnKeyListenerC1029f) this.f4214g;
                if (viewOnKeyListenerC1029f.mo2544a()) {
                    ArrayList arrayList = viewOnKeyListenerC1029f.f4229m;
                    if (arrayList.size() > 0 && !((C1028e) arrayList.get(0)).f4215a.f4476D) {
                        View view = viewOnKeyListenerC1029f.f4236t;
                        if (view != null && view.isShown()) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                ((C1028e) it2.next()).f4215a.mo2546i();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC1029f.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC1022C viewOnKeyListenerC1022C = (ViewOnKeyListenerC1022C) this.f4214g;
                if (viewOnKeyListenerC1022C.mo2544a()) {
                    C1110M0 c1110m0 = viewOnKeyListenerC1022C.f4180m;
                    if (!c1110m0.f4476D) {
                        View view2 = viewOnKeyListenerC1022C.f4185r;
                        if (view2 != null && view2.isShown()) {
                            c1110m0.mo2546i();
                            break;
                        } else {
                            viewOnKeyListenerC1022C.dismiss();
                            break;
                        }
                    }
                }
                break;
            case 2:
                C1117Q c1117q = (C1117Q) this.f4214g;
                if (!c1117q.getInternalPopup().mo2710a()) {
                    c1117q.f4538k.mo2714f(c1117q.getTextDirection(), c1117q.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = c1117q.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            default:
                C1111N c1111n = (C1111N) this.f4214g;
                C1117Q c1117q2 = c1111n.f4519M;
                c1111n.getClass();
                if (!c1117q2.isAttachedToWindow() || !c1117q2.getGlobalVisibleRect(c1111n.f4517K)) {
                    c1111n.dismiss();
                    break;
                } else {
                    c1111n.m2722s();
                    c1111n.mo2546i();
                    break;
                }
                break;
        }
    }
}
