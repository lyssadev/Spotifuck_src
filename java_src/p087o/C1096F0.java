package p087o;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: o.F0 */
/* loaded from: classes.dex */
public final class C1096F0 implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ C1100H0 f4461a;

    public C1096F0(C1100H0 c1100h0) {
        this.f4461a = c1100h0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            C1100H0 c1100h0 = this.f4461a;
            if (c1100h0.f4477E.getInputMethodMode() == 2 || c1100h0.f4477E.getContentView() == null) {
                return;
            }
            Handler handler = c1100h0.f4473A;
            RunnableC1092D0 runnableC1092D0 = c1100h0.f4495w;
            handler.removeCallbacks(runnableC1092D0);
            runnableC1092D0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
