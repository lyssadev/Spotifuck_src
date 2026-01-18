package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import it.deviato.spotifuck.R;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: w */
    public static final /* synthetic */ int f2645w = 0;

    /* renamed from: v */
    public final Chip f2646v;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ViewOnClickListenerC0706g viewOnClickListenerC0706g = new ViewOnClickListenerC0706g(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        materialButtonToggleGroup.f2370h.add(new C0705f(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f2646v = chip2;
        ViewOnTouchListenerC0708i viewOnTouchListenerC0708i = new ViewOnTouchListenerC0708i(new GestureDetector(getContext(), new C0707h(this)));
        chip.setOnTouchListener(viewOnTouchListenerC0708i);
        chip2.setOnTouchListener(viewOnTouchListenerC0708i);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(viewOnClickListenerC0706g);
        chip2.setOnClickListener(viewOnClickListenerC0706g);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f2646v.sendAccessibilityEvent(8);
        }
    }
}
