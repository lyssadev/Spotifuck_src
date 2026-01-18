package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;
import p023N.C0189A;
import p074j0.AbstractC0912a0;

/* renamed from: com.google.android.material.datepicker.q */
/* loaded from: classes.dex */
public final class C0691q extends AbstractC0912a0 {

    /* renamed from: t */
    public final TextView f2482t;

    /* renamed from: u */
    public final MaterialCalendarGridView f2483u;

    public C0691q(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2482t = textView;
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        new C0189A(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).m591d(textView, Boolean.TRUE);
        this.f2483u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z2) {
            return;
        }
        textView.setVisibility(8);
    }
}
