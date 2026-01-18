package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import p023N.AbstractC0206Q;
import p035T.C0391h;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: f */
    public final boolean f2402f;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC0696v.m1912c(null);
        if (C0686l.m1896N(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(it.deviato.spotifuck.R.id.cancel_button);
            setNextFocusRightId(it.deviato.spotifuck.R.id.confirm_button);
        }
        this.f2402f = C0686l.m1896N(getContext(), it.deviato.spotifuck.R.attr.nestedScrollable);
        AbstractC0206Q.m681p(this, new C0391h(3));
    }

    /* renamed from: a */
    public final C0689o m1889a() {
        return (C0689o) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C0689o) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0689o) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0689o c0689o = (C0689o) super.getAdapter();
        c0689o.getClass();
        int iMax = Math.max(c0689o.m1902a(), getFirstVisiblePosition());
        int iMin = Math.min(c0689o.m1904c(), getLastVisiblePosition());
        c0689o.getItem(iMax);
        c0689o.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((C0689o) super.getAdapter()).m1904c());
        } else if (i == 130) {
            setSelection(((C0689o) super.getAdapter()).m1902a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C0689o) super.getAdapter()).m1902a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((C0689o) super.getAdapter()).m1902a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f2402f) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((C0689o) super.getAdapter()).m1902a()) {
            super.setSelection(((C0689o) super.getAdapter()).m1902a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C0689o) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0689o)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0689o.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
