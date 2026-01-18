package p084n;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: n.t */
/* loaded from: classes.dex */
public abstract class AbstractC1043t implements InterfaceC1021B, InterfaceC1047x, AdapterView.OnItemClickListener {

    /* renamed from: f */
    public Rect f4324f;

    /* renamed from: m */
    public static int m2600m(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: u */
    public static boolean m2601u(MenuC1035l menuC1035l) {
        int size = menuC1035l.f4263f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuC1035l.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: d */
    public final boolean mo2575d(C1037n c1037n) {
        return false;
    }

    @Override // p084n.InterfaceC1047x
    /* renamed from: k */
    public final boolean mo2577k(C1037n c1037n) {
        return false;
    }

    /* renamed from: l */
    public abstract void mo2552l(MenuC1035l menuC1035l);

    /* renamed from: n */
    public abstract void mo2553n(View view);

    /* renamed from: o */
    public abstract void mo2554o(boolean z2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1032i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1032i) listAdapter).f4251a.m2588q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC1029f) ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo2555p(int i);

    /* renamed from: q */
    public abstract void mo2556q(int i);

    /* renamed from: r */
    public abstract void mo2557r(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: s */
    public abstract void mo2558s(boolean z2);

    /* renamed from: t */
    public abstract void mo2559t(int i);

    @Override // p084n.InterfaceC1047x
    /* renamed from: f */
    public final void mo2576f(Context context, MenuC1035l menuC1035l) {
    }
}
