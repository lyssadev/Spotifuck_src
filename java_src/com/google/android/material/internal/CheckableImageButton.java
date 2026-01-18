package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import p008E0.C0067a;
import p008E0.C0068b;
import p023N.AbstractC0206Q;
import p087o.C1194w;

/* loaded from: classes.dex */
public class CheckableImageButton extends C1194w implements Checkable {

    /* renamed from: l */
    public static final int[] f2492l = {R.attr.state_checked};

    /* renamed from: i */
    public boolean f2493i;

    /* renamed from: j */
    public boolean f2494j;

    /* renamed from: k */
    public boolean f2495k;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, it.deviato.spotifuck.R.attr.imageButtonStyle);
        this.f2494j = true;
        this.f2495k = true;
        AbstractC0206Q.m681p(this, new C0067a(0, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2493i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f2493i ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f2492l) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0068b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0068b c0068b = (C0068b) parcelable;
        super.onRestoreInstanceState(c0068b.f1033a);
        setChecked(c0068b.f151c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0068b c0068b = new C0068b(super.onSaveInstanceState());
        c0068b.f151c = this.f2493i;
        return c0068b;
    }

    public void setCheckable(boolean z2) {
        if (this.f2494j != z2) {
            this.f2494j = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f2494j || this.f2493i == z2) {
            return;
        }
        this.f2493i = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f2495k = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f2495k) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2493i);
    }
}
