package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import p000A.C0001b;
import p008E0.C0067a;
import p017K.RunnableC0128a;
import p023N.AbstractC0206Q;
import p032R0.ViewOnClickListenerC0367i;
import p035T.C0391h;
import p074j0.C0918d0;
import p074j0.C0947z;

/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes.dex */
public final class C0684j<S> extends AbstractC0693s {

    /* renamed from: a0 */
    public int f2428a0;

    /* renamed from: b0 */
    public C0676b f2429b0;

    /* renamed from: c0 */
    public C0688n f2430c0;

    /* renamed from: d0 */
    public int f2431d0;

    /* renamed from: e0 */
    public C0677c f2432e0;

    /* renamed from: f0 */
    public RecyclerView f2433f0;

    /* renamed from: g0 */
    public RecyclerView f2434g0;

    /* renamed from: h0 */
    public View f2435h0;

    /* renamed from: i0 */
    public View f2436i0;

    /* renamed from: j0 */
    public View f2437j0;

    /* renamed from: k0 */
    public View f2438k0;

    /* renamed from: K */
    public final void m1893K(C0688n c0688n) {
        C0692r c0692r = (C0692r) this.f2434g0.getAdapter();
        int iM1901d = c0692r.f2484c.f2405a.m1901d(c0688n);
        int iM1901d2 = iM1901d - c0692r.f2484c.f2405a.m1901d(this.f2430c0);
        boolean z2 = Math.abs(iM1901d2) > 3;
        boolean z3 = iM1901d2 > 0;
        this.f2430c0 = c0688n;
        if (z2 && z3) {
            this.f2434g0.m1781a0(iM1901d - 3);
            this.f2434g0.post(new RunnableC0128a(iM1901d, 2, this));
        } else if (!z2) {
            this.f2434g0.post(new RunnableC0128a(iM1901d, 2, this));
        } else {
            this.f2434g0.m1781a0(iM1901d + 3);
            this.f2434g0.post(new RunnableC0128a(iM1901d, 2, this));
        }
    }

    /* renamed from: L */
    public final void m1894L(int i) {
        this.f2431d0 = i;
        if (i == 2) {
            this.f2433f0.getLayoutManager().mo1746n0(this.f2430c0.f2470c - ((C0698x) this.f2433f0.getAdapter()).f2490c.f2429b0.f2405a.f2470c);
            this.f2437j0.setVisibility(0);
            this.f2438k0.setVisibility(8);
            this.f2435h0.setVisibility(8);
            this.f2436i0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f2437j0.setVisibility(8);
            this.f2438k0.setVisibility(0);
            this.f2435h0.setVisibility(0);
            this.f2436i0.setVisibility(0);
            m1893K(this.f2430c0);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: t */
    public final void mo1572t(Bundle bundle) {
        super.mo1572t(bundle);
        if (bundle == null) {
            bundle = this.f1923k;
        }
        this.f2428a0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2429b0 = (C0676b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2430c0 = (C0688n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: u */
    public final View mo1598u(LayoutInflater layoutInflater, ViewGroup viewGroup) throws Resources.NotFoundException {
        int i;
        int i2;
        C0947z c0947z;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m1588h(), this.f2428a0);
        this.f2432e0 = new C0677c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0688n c0688n = this.f2429b0.f2405a;
        if (C0686l.m1896N(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = it.deviato.spotifuck.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = it.deviato.spotifuck.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = m1581F().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(it.deviato.spotifuck.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(it.deviato.spotifuck.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(it.deviato.spotifuck.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(it.deviato.spotifuck.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = C0689o.f2475d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(it.deviato.spotifuck.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(it.deviato.spotifuck.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(it.deviato.spotifuck.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(it.deviato.spotifuck.R.id.mtrl_calendar_days_of_week);
        AbstractC0206Q.m681p(gridView, new C0391h(1));
        int i4 = this.f2429b0.f2409e;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new C0679e(i4) : new C0679e()));
        gridView.setNumColumns(c0688n.f2471d);
        gridView.setEnabled(false);
        this.f2434g0 = (RecyclerView) viewInflate.findViewById(it.deviato.spotifuck.R.id.mtrl_calendar_months);
        this.f2434g0.setLayoutManager(new C0681g(this, i2, i2));
        this.f2434g0.setTag("MONTHS_VIEW_GROUP_TAG");
        C0692r c0692r = new C0692r(contextThemeWrapper, this.f2429b0, new C0001b(22, this));
        this.f2434g0.setAdapter(c0692r);
        int integer = contextThemeWrapper.getResources().getInteger(it.deviato.spotifuck.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(it.deviato.spotifuck.R.id.mtrl_calendar_year_selector_frame);
        this.f2433f0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f2433f0.setLayoutManager(new GridLayoutManager(integer));
            this.f2433f0.setAdapter(new C0698x(this));
            this.f2433f0.m1787g(new C0682h(this));
        }
        if (viewInflate.findViewById(it.deviato.spotifuck.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(it.deviato.spotifuck.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC0206Q.m681p(materialButton, new C0067a(2, this));
            View viewFindViewById = viewInflate.findViewById(it.deviato.spotifuck.R.id.month_navigation_previous);
            this.f2435h0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(it.deviato.spotifuck.R.id.month_navigation_next);
            this.f2436i0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f2437j0 = viewInflate.findViewById(it.deviato.spotifuck.R.id.mtrl_calendar_year_selector_frame);
            this.f2438k0 = viewInflate.findViewById(it.deviato.spotifuck.R.id.mtrl_calendar_day_selector_frame);
            m1894L(1);
            materialButton.setText(this.f2430c0.m1900c());
            this.f2434g0.m1788h(new C0683i(this, c0692r, materialButton));
            int i5 = 1;
            materialButton.setOnClickListener(new ViewOnClickListenerC0367i(i5, this));
            this.f2436i0.setOnClickListener(new ViewOnClickListenerC0680f(this, c0692r, i5));
            this.f2435h0.setOnClickListener(new ViewOnClickListenerC0680f(this, c0692r, 0));
        }
        if (!C0686l.m1896N(contextThemeWrapper, R.attr.windowFullscreen) && (recyclerView2 = (c0947z = new C0947z()).f3865a) != (recyclerView = this.f2434g0)) {
            C0918d0 c0918d0 = c0947z.f3866b;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f2201l0;
                if (arrayList != null) {
                    arrayList.remove(c0918d0);
                }
                c0947z.f3865a.setOnFlingListener(null);
            }
            c0947z.f3865a = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                c0947z.f3865a.m1788h(c0918d0);
                c0947z.f3865a.setOnFlingListener(c0947z);
                new Scroller(c0947z.f3865a.getContext(), new DecelerateInterpolator());
                c0947z.m2414f();
            }
        }
        this.f2434g0.m1781a0(c0692r.f2484c.f2405a.m1901d(this.f2430c0));
        AbstractC0206Q.m681p(this.f2434g0, new C0391h(2));
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: y */
    public final void mo1576y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2428a0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2429b0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2430c0);
    }
}
