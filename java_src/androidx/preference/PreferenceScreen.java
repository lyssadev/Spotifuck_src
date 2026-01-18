package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.AbstractComponentCallbacksC0606r;
import it.deviato.spotifuck.R;
import p007E.AbstractC0049b;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: S */
    public final boolean f2105S;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, AbstractC0049b.m229b(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.f2105S = true;
    }

    @Override // androidx.preference.Preference
    /* renamed from: l */
    public final void mo1639l() {
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r;
        if (this.f2084l != null || this.f2085m != null || this.f2100N.size() == 0 || (abstractComponentCallbacksC0606r = this.f2074b.f2836j) == null) {
            return;
        }
        for (abstractComponentCallbacksC0606r = this.f2074b.f2836j; abstractComponentCallbacksC0606r != null; abstractComponentCallbacksC0606r = abstractComponentCallbacksC0606r.f1938z) {
        }
    }
}
