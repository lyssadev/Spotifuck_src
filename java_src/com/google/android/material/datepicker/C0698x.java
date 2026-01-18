package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import java.util.Locale;
import p018K0.C0146e;
import p074j0.AbstractC0888C;
import p074j0.AbstractC0912a0;

/* renamed from: com.google.android.material.datepicker.x */
/* loaded from: classes.dex */
public final class C0698x extends AbstractC0888C {

    /* renamed from: c */
    public final C0684j f2490c;

    public C0698x(C0684j c0684j) {
        this.f2490c = c0684j;
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: a */
    public final int mo1905a() {
        return this.f2490c.f2429b0.f2410f;
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: d */
    public final void mo1907d(AbstractC0912a0 abstractC0912a0, int i) {
        C0684j c0684j = this.f2490c;
        int i2 = c0684j.f2429b0.f2405a.f2470c + i;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((C0697w) abstractC0912a0).f2489t;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC0696v.m1911b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C0677c c0677c = c0684j.f2432e0;
        if (AbstractC0696v.m1911b().get(1) == i2) {
            C0146e c0146e = c0677c.f2413b;
        } else {
            C0146e c0146e2 = c0677c.f2412a;
        }
        throw null;
    }

    @Override // p074j0.AbstractC0888C
    /* renamed from: e */
    public final AbstractC0912a0 mo1908e(ViewGroup viewGroup, int i) {
        return new C0697w((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
