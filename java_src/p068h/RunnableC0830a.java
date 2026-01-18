package p068h;

import android.view.View;

/* renamed from: h.a */
/* loaded from: classes.dex */
public final class RunnableC0830a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3213a;

    /* renamed from: b */
    public final /* synthetic */ View f3214b;

    /* renamed from: c */
    public final /* synthetic */ View f3215c;

    /* renamed from: d */
    public final /* synthetic */ C0837h f3216d;

    public /* synthetic */ RunnableC0830a(C0837h c0837h, View view, View view2, int i) {
        this.f3213a = i;
        this.f3216d = c0837h;
        this.f3214b = view;
        this.f3215c = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3213a) {
            case 0:
                C0837h.m2111b(this.f3216d.f3270r, this.f3214b, this.f3215c);
                break;
            default:
                C0837h.m2111b(this.f3216d.f3258f, this.f3214b, this.f3215c);
                break;
        }
    }
}
