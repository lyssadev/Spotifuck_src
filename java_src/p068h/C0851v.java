package p068h;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import p007E.C0057j;
import p023N.AbstractC0193D;
import p023N.AbstractC0206Q;
import p091p0.AbstractC1230a;

/* renamed from: h.v */
/* loaded from: classes.dex */
public final class C0851v extends AbstractC1230a {

    /* renamed from: o */
    public final /* synthetic */ int f3310o;

    /* renamed from: p */
    public final /* synthetic */ Object f3311p;

    public /* synthetic */ C0851v(int i, Object obj) {
        this.f3310o = i;
        this.f3311p = obj;
    }

    @Override // p023N.InterfaceC0216a0
    /* renamed from: a */
    public final void mo704a() {
        Object obj = this.f3311p;
        switch (this.f3310o) {
            case 0:
                RunnableC0849t runnableC0849t = (RunnableC0849t) obj;
                runnableC0849t.f3307b.f3109A.setAlpha(1.0f);
                LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = runnableC0849t.f3307b;
                layoutInflaterFactory2C0819D.f3112D.m702d(null);
                layoutInflaterFactory2C0819D.f3112D = null;
                break;
            case 1:
                LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D2 = (LayoutInflaterFactory2C0819D) obj;
                layoutInflaterFactory2C0819D2.f3109A.setAlpha(1.0f);
                layoutInflaterFactory2C0819D2.f3112D.m702d(null);
                layoutInflaterFactory2C0819D2.f3112D = null;
                break;
            default:
                C0057j c0057j = (C0057j) obj;
                ((LayoutInflaterFactory2C0819D) c0057j.f123h).f3109A.setVisibility(8);
                LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D3 = (LayoutInflaterFactory2C0819D) c0057j.f123h;
                PopupWindow popupWindow = layoutInflaterFactory2C0819D3.f3110B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0819D3.f3109A.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0819D3.f3109A.getParent();
                    WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                    AbstractC0193D.m594c(view);
                }
                layoutInflaterFactory2C0819D3.f3109A.m1326e();
                layoutInflaterFactory2C0819D3.f3112D.m702d(null);
                layoutInflaterFactory2C0819D3.f3112D = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0819D3.f3115G;
                WeakHashMap weakHashMap2 = AbstractC0206Q.f560a;
                AbstractC0193D.m594c(viewGroup);
                break;
        }
    }

    @Override // p091p0.AbstractC1230a, p023N.InterfaceC0216a0
    /* renamed from: c */
    public void mo706c() {
        Object obj = this.f3311p;
        switch (this.f3310o) {
            case 0:
                ((RunnableC0849t) obj).f3307b.f3109A.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) obj;
                layoutInflaterFactory2C0819D.f3109A.setVisibility(0);
                if (layoutInflaterFactory2C0819D.f3109A.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0819D.f3109A.getParent();
                    WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                    AbstractC0193D.m594c(view);
                    break;
                }
                break;
        }
    }
}
