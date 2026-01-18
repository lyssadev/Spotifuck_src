package p074j0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: j0.I */
/* loaded from: classes.dex */
public final class C0894I {

    /* renamed from: a */
    public final /* synthetic */ int f3580a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0896K f3581b;

    public /* synthetic */ C0894I(AbstractC0896K abstractC0896K, int i) {
        this.f3580a = i;
        this.f3581b = abstractC0896K;
    }

    /* renamed from: a */
    public final int m2263a(View view) {
        switch (this.f3580a) {
            case 0:
                C0897L c0897l = (C0897L) view.getLayoutParams();
                this.f3581b.getClass();
                return view.getRight() + ((C0897L) view.getLayoutParams()).f3602b.right + ((ViewGroup.MarginLayoutParams) c0897l).rightMargin;
            default:
                C0897L c0897l2 = (C0897L) view.getLayoutParams();
                this.f3581b.getClass();
                return view.getBottom() + ((C0897L) view.getLayoutParams()).f3602b.bottom + ((ViewGroup.MarginLayoutParams) c0897l2).bottomMargin;
        }
    }

    /* renamed from: b */
    public final int m2264b(View view) {
        switch (this.f3580a) {
            case 0:
                C0897L c0897l = (C0897L) view.getLayoutParams();
                this.f3581b.getClass();
                return (view.getLeft() - ((C0897L) view.getLayoutParams()).f3602b.left) - ((ViewGroup.MarginLayoutParams) c0897l).leftMargin;
            default:
                C0897L c0897l2 = (C0897L) view.getLayoutParams();
                this.f3581b.getClass();
                return (view.getTop() - ((C0897L) view.getLayoutParams()).f3602b.top) - ((ViewGroup.MarginLayoutParams) c0897l2).topMargin;
        }
    }

    /* renamed from: c */
    public final int m2265c() {
        switch (this.f3580a) {
            case 0:
                AbstractC0896K abstractC0896K = this.f3581b;
                return abstractC0896K.f3599n - abstractC0896K.m2279F();
            default:
                AbstractC0896K abstractC0896K2 = this.f3581b;
                return abstractC0896K2.f3600o - abstractC0896K2.m2277D();
        }
    }

    /* renamed from: d */
    public final int m2266d() {
        switch (this.f3580a) {
            case 0:
                return this.f3581b.m2278E();
            default:
                return this.f3581b.m2280G();
        }
    }
}
