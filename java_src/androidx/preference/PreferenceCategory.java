package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import it.deviato.spotifuck.R;
import p007E.AbstractC0049b;
import p066g0.C0781y;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC0049b.m229b(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    /* renamed from: f */
    public final boolean mo1657f() {
        return false;
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public final void mo1636k(C0781y c0781y) {
        super.mo1636k(c0781y);
        if (Build.VERSION.SDK_INT >= 28) {
            c0781y.f3654a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: u */
    public final boolean mo1645u() {
        return !super.mo1657f();
    }
}
