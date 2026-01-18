package p087o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p084n.C1032i;
import p084n.C1037n;
import p084n.MenuC1035l;

/* renamed from: o.L0 */
/* loaded from: classes.dex */
public final class C1108L0 extends C1193v0 {

    /* renamed from: r */
    public final int f4507r;

    /* renamed from: s */
    public final int f4508s;

    /* renamed from: t */
    public InterfaceC1102I0 f4509t;

    /* renamed from: u */
    public C1037n f4510u;

    public C1108L0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f4507r = 21;
            this.f4508s = 22;
        } else {
            this.f4507r = 22;
            this.f4508s = 21;
        }
    }

    @Override // p087o.C1193v0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1032i c1032i;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.f4509t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c1032i = (C1032i) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1032i = (C1032i) adapter;
                headersCount = 0;
            }
            C1037n c1037nM2579b = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c1032i.getCount()) ? null : c1032i.getItem(i);
            C1037n c1037n = this.f4510u;
            if (c1037n != c1037nM2579b) {
                MenuC1035l menuC1035l = c1032i.f4251a;
                if (c1037n != null) {
                    this.f4509t.mo2405g(menuC1035l, c1037n);
                }
                this.f4510u = c1037nM2579b;
                if (c1037nM2579b != null) {
                    this.f4509t.mo2408o(menuC1035l, c1037nM2579b);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f4507r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f4508s) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C1032i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1032i) adapter).f4251a.m2582c(false);
        return true;
    }

    public void setHoverListener(InterfaceC1102I0 interfaceC1102I0) {
        this.f4509t = interfaceC1102I0;
    }

    @Override // p087o.C1193v0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
