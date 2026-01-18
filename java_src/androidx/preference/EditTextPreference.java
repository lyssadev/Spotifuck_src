package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import it.deviato.spotifuck.R;
import p007E.AbstractC0049b;
import p018K0.C0146e;
import p066g0.AbstractC0782z;
import p066g0.C0759c;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: S */
    public String f2052S;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iM229b = AbstractC0049b.m229b(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iM229b);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0782z.f2848d, iM229b, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (C0146e.f382h == null) {
                C0146e.f382h = new C0146e(18);
            }
            this.f2071K = C0146e.f382h;
            mo1640g();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: n */
    public final Object mo1641n(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    /* renamed from: o */
    public final void mo1642o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0759c.class)) {
            super.mo1642o(parcelable);
            return;
        }
        C0759c c0759c = (C0759c) parcelable;
        super.mo1642o(c0759c.getSuperState());
        m1646w(c0759c.f2773a);
    }

    @Override // androidx.preference.Preference
    /* renamed from: p */
    public final Parcelable mo1643p() {
        this.f2069I = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f2089q) {
            return absSavedState;
        }
        C0759c c0759c = new C0759c(absSavedState);
        c0759c.f2773a = this.f2052S;
        return c0759c;
    }

    @Override // androidx.preference.Preference
    /* renamed from: q */
    public final void mo1644q(Object obj) {
        m1646w(m1656d((String) obj));
    }

    @Override // androidx.preference.Preference
    /* renamed from: u */
    public final boolean mo1645u() {
        return TextUtils.isEmpty(this.f2052S) || super.mo1645u();
    }

    /* renamed from: w */
    public final void m1646w(String str) {
        boolean zMo1645u = mo1645u();
        this.f2052S = str;
        m1662s(str);
        boolean zMo1645u2 = mo1645u();
        if (zMo1645u2 != zMo1645u) {
            mo1658h(zMo1645u2);
        }
        mo1640g();
    }
}
