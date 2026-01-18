package p068h;

import android.view.ViewGroup;
import p023N.AbstractC0206Q;
import p023N.C0214Z;

/* renamed from: h.t */
/* loaded from: classes.dex */
public final class RunnableC0849t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3306a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0819D f3307b;

    public /* synthetic */ RunnableC0849t(LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D, int i) {
        this.f3306a = i;
        this.f3307b = layoutInflaterFactory2C0819D;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f3306a) {
            case 0:
                LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = this.f3307b;
                if ((layoutInflaterFactory2C0819D.f3140f0 & 1) != 0) {
                    layoutInflaterFactory2C0819D.m2082t(0);
                }
                if ((layoutInflaterFactory2C0819D.f3140f0 & 4096) != 0) {
                    layoutInflaterFactory2C0819D.m2082t(108);
                }
                layoutInflaterFactory2C0819D.f3139e0 = false;
                layoutInflaterFactory2C0819D.f3140f0 = 0;
                break;
            default:
                LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D2 = this.f3307b;
                layoutInflaterFactory2C0819D2.f3110B.showAtLocation(layoutInflaterFactory2C0819D2.f3109A, 55, 0, 0);
                C0214Z c0214z = layoutInflaterFactory2C0819D2.f3112D;
                if (c0214z != null) {
                    c0214z.m700b();
                }
                if (!(layoutInflaterFactory2C0819D2.f3114F && (viewGroup = layoutInflaterFactory2C0819D2.f3115G) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0819D2.f3109A.setAlpha(1.0f);
                    layoutInflaterFactory2C0819D2.f3109A.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0819D2.f3109A.setAlpha(0.0f);
                    C0214Z c0214zM666a = AbstractC0206Q.m666a(layoutInflaterFactory2C0819D2.f3109A);
                    c0214zM666a.m699a(1.0f);
                    layoutInflaterFactory2C0819D2.f3112D = c0214zM666a;
                    c0214zM666a.m702d(new C0851v(0, this));
                    break;
                }
                break;
        }
    }
}
