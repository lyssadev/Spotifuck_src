package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import it.deviato.spotifuck.R;
import java.util.HashSet;
import java.util.Set;
import p007E.AbstractC0049b;
import p066g0.AbstractC0782z;
import p066g0.C0765i;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: S */
    public final CharSequence[] f2058S;

    /* renamed from: T */
    public final CharSequence[] f2059T;

    /* renamed from: U */
    public final HashSet f2060U;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iM229b = AbstractC0049b.m229b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iM229b);
        this.f2060U = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0782z.f2850f, iM229b, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f2058S = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f2059T = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: n */
    public final Object mo1641n(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    /* renamed from: o */
    public final void mo1642o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0765i.class)) {
            super.mo1642o(parcelable);
            return;
        }
        C0765i c0765i = (C0765i) parcelable;
        super.mo1642o(c0765i.getSuperState());
        m1651w(c0765i.f2784a);
    }

    @Override // androidx.preference.Preference
    /* renamed from: p */
    public final Parcelable mo1643p() {
        this.f2069I = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f2089q) {
            return absSavedState;
        }
        C0765i c0765i = new C0765i(absSavedState);
        c0765i.f2784a = this.f2060U;
        return c0765i;
    }

    @Override // androidx.preference.Preference
    /* renamed from: q */
    public final void mo1644q(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (m1663v()) {
            stringSet = this.f2074b.m1999c().getStringSet(this.f2083k, stringSet);
        }
        m1651w(stringSet);
    }

    /* renamed from: w */
    public final void m1651w(Set set) {
        HashSet hashSet = this.f2060U;
        hashSet.clear();
        hashSet.addAll(set);
        if (m1663v()) {
            if (!set.equals(m1663v() ? this.f2074b.m1999c().getStringSet(this.f2083k, null) : null)) {
                SharedPreferences.Editor editorM1997a = this.f2074b.m1997a();
                editorM1997a.putStringSet(this.f2083k, set);
                if (!this.f2074b.f2831e) {
                    editorM1997a.apply();
                }
            }
        }
        mo1640g();
    }
}
