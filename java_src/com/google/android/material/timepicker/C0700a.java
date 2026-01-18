package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p008E0.AbstractC0078l;

/* renamed from: com.google.android.material.timepicker.a */
/* loaded from: classes.dex */
public final class C0700a extends AbstractC0078l {

    /* renamed from: f */
    public final /* synthetic */ ChipTextInputComboView f2647f;

    public C0700a(ChipTextInputComboView chipTextInputComboView) {
        this.f2647f = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f2647f;
        if (zIsEmpty) {
            chipTextInputComboView.f2615f.setText(ChipTextInputComboView.m1947a(chipTextInputComboView, "00"));
            return;
        }
        String strM1947a = ChipTextInputComboView.m1947a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f2615f;
        if (TextUtils.isEmpty(strM1947a)) {
            strM1947a = ChipTextInputComboView.m1947a(chipTextInputComboView, "00");
        }
        chip.setText(strM1947a);
    }
}
