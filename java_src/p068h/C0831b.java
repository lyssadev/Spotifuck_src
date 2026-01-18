package p068h;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: h.b */
/* loaded from: classes.dex */
public final class C0831b implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ View f3217a;

    /* renamed from: b */
    public final /* synthetic */ View f3218b;

    public C0831b(View view, View view2) {
        this.f3217a = view;
        this.f3218b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C0837h.m2111b(absListView, this.f3217a, this.f3218b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
