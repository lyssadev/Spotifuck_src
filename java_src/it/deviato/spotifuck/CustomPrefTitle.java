package it.deviato.spotifuck;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import p066g0.C0781y;

/* loaded from: classes.dex */
public class CustomPrefTitle extends Preference {
    public CustomPrefTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public final void mo1636k(C0781y c0781y) {
        super.mo1636k(c0781y);
        c0781y.f3654a.setBackgroundColor(Color.parseColor("#B71C1C"));
        TextView textView = (TextView) c0781y.m2001r(android.R.id.title);
        if (textView != null) {
            textView.setTextColor(-1);
            textView.setTextSize(18.0f);
            textView.setTypeface(textView.getTypeface(), 1);
        }
        TextView textView2 = (TextView) c0781y.m2001r(android.R.id.summary);
        if (textView2 != null) {
            textView2.setTextColor(-3355444);
            textView2.setTextSize(13.0f);
            textView2.setTypeface(textView.getTypeface(), 1);
        }
    }
}
