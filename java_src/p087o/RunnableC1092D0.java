package p087o;

/* renamed from: o.D0 */
/* loaded from: classes.dex */
public final class RunnableC1092D0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4457a;

    /* renamed from: b */
    public final /* synthetic */ C1100H0 f4458b;

    public /* synthetic */ RunnableC1092D0(C1100H0 c1100h0, int i) {
        this.f4457a = i;
        this.f4458b = c1100h0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4457a) {
            case 0:
                C1193v0 c1193v0 = this.f4458b.f4480h;
                if (c1193v0 != null) {
                    c1193v0.setListSelectionHidden(true);
                    c1193v0.requestLayout();
                    break;
                }
                break;
            default:
                C1100H0 c1100h0 = this.f4458b;
                C1193v0 c1193v02 = c1100h0.f4480h;
                if (c1193v02 != null && c1193v02.isAttachedToWindow() && c1100h0.f4480h.getCount() > c1100h0.f4480h.getChildCount() && c1100h0.f4480h.getChildCount() <= c1100h0.f4490r) {
                    c1100h0.f4477E.setInputMethodMode(2);
                    c1100h0.mo2546i();
                    break;
                }
                break;
        }
    }
}
