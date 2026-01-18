package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p084n.C1037n;
import p084n.InterfaceC1034k;
import p084n.InterfaceC1049z;
import p084n.MenuC1035l;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1034k, InterfaceC1049z, AdapterView.OnItemClickListener {

    /* renamed from: g */
    public static final int[] f1351g = {R.attr.background, R.attr.divider};

    /* renamed from: f */
    public MenuC1035l f1352f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0513t c0513tM1223A = C0513t.m1223A(context, attributeSet, f1351g, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c0513tM1223A.m1240o(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c0513tM1223A.m1240o(1));
        }
        c0513tM1223A.m1228C();
    }

    @Override // p084n.InterfaceC1049z
    /* renamed from: b */
    public final void mo1318b(MenuC1035l menuC1035l) {
        this.f1352f = menuC1035l;
    }

    @Override // p084n.InterfaceC1034k
    /* renamed from: c */
    public final boolean mo1319c(C1037n c1037n) {
        return this.f1352f.m2588q(c1037n, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        mo1319c((C1037n) getAdapter().getItem(i));
    }
}
