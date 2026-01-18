package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;
import p091p0.AbstractC1230a;
import p097r0.AbstractC1258a;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: f */
    public TextView f2532f;

    /* renamed from: g */
    public Button f2533g;

    /* renamed from: h */
    public int f2534h;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC1230a.m2907r0(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC1258a.f5018b);
    }

    /* renamed from: a */
    public final boolean m1917a(int i, int i2, int i3) {
        boolean z2;
        if (i != getOrientation()) {
            setOrientation(i);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f2532f.getPaddingTop() == i2 && this.f2532f.getPaddingBottom() == i3) {
            return z2;
        }
        TextView textView = this.f2532f;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f2533g;
    }

    public TextView getMessageView() {
        return this.f2532f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2532f = (TextView) findViewById(R.id.snackbar_text);
        this.f2533g = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f2532f.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f2534h <= 0 || this.f2533g.getMeasuredWidth() <= this.f2534h) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m1917a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m1917a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f2534h = i;
    }
}
