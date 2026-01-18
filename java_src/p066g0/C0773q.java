package p066g0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p074j0.AbstractC0893H;
import p074j0.AbstractC0912a0;

/* renamed from: g0.q */
/* loaded from: classes.dex */
public final class C0773q extends AbstractC0893H {

    /* renamed from: a */
    public Drawable f2799a;

    /* renamed from: b */
    public int f2800b;

    /* renamed from: c */
    public boolean f2801c = true;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0774r f2802d;

    public C0773q(AbstractC0774r abstractC0774r) {
        this.f2802d = abstractC0774r;
    }

    @Override // p074j0.AbstractC0893H
    /* renamed from: a */
    public final void mo1983a(Rect rect, View view, RecyclerView recyclerView) {
        if (m1985d(view, recyclerView)) {
            rect.bottom = this.f2800b;
        }
    }

    @Override // p074j0.AbstractC0893H
    /* renamed from: c */
    public final void mo1984c(Canvas canvas, RecyclerView recyclerView) {
        if (this.f2799a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (m1985d(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f2799a.setBounds(0, height, width, this.f2800b + height);
                this.f2799a.draw(canvas);
            }
        }
    }

    /* renamed from: d */
    public final boolean m1985d(View view, RecyclerView recyclerView) {
        AbstractC0912a0 abstractC0912a0M1763H = recyclerView.m1763H(view);
        boolean z2 = false;
        if (!(abstractC0912a0M1763H instanceof C0781y) || !((C0781y) abstractC0912a0M1763H).f2844x) {
            return false;
        }
        boolean z3 = this.f2801c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z3;
        }
        AbstractC0912a0 abstractC0912a0M1763H2 = recyclerView.m1763H(recyclerView.getChildAt(iIndexOfChild + 1));
        if ((abstractC0912a0M1763H2 instanceof C0781y) && ((C0781y) abstractC0912a0M1763H2).f2843w) {
            z2 = true;
        }
        return z2;
    }
}
