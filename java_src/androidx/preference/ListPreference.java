package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import it.deviato.spotifuck.R;
import p007E.AbstractC0049b;
import p018K0.C0146e;
import p066g0.AbstractC0782z;
import p066g0.C0762f;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: S */
    public final CharSequence[] f2053S;

    /* renamed from: T */
    public final CharSequence[] f2054T;

    /* renamed from: U */
    public String f2055U;

    /* renamed from: V */
    public final String f2056V;

    /* renamed from: W */
    public boolean f2057W;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0782z.f2849e, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.f2053S = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f2054T = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (C0146e.f383i == null) {
                C0146e.f383i = new C0146e(19);
            }
            this.f2071K = C0146e.f383i;
            mo1640g();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0782z.f2851g, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.f2056V = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: e */
    public final CharSequence mo1647e() {
        C0146e c0146e = this.f2071K;
        if (c0146e != null) {
            return c0146e.m502m(this);
        }
        CharSequence charSequenceM1649x = m1649x();
        CharSequence charSequenceMo1647e = super.mo1647e();
        String str = this.f2056V;
        if (str == null) {
            return charSequenceMo1647e;
        }
        if (charSequenceM1649x == null) {
            charSequenceM1649x = "";
        }
        String str2 = String.format(str, charSequenceM1649x);
        if (TextUtils.equals(str2, charSequenceMo1647e)) {
            return charSequenceMo1647e;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return str2;
    }

    @Override // androidx.preference.Preference
    /* renamed from: n */
    public final Object mo1641n(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    /* renamed from: o */
    public final void mo1642o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0762f.class)) {
            super.mo1642o(parcelable);
            return;
        }
        C0762f c0762f = (C0762f) parcelable;
        super.mo1642o(c0762f.getSuperState());
        m1650y(c0762f.f2779a);
    }

    @Override // androidx.preference.Preference
    /* renamed from: p */
    public final Parcelable mo1643p() {
        this.f2069I = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f2089q) {
            return absSavedState;
        }
        C0762f c0762f = new C0762f(absSavedState);
        c0762f.f2779a = this.f2055U;
        return c0762f;
    }

    @Override // androidx.preference.Preference
    /* renamed from: q */
    public final void mo1644q(Object obj) {
        m1650y(m1656d((String) obj));
    }

    /* renamed from: w */
    public final int m1648w(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f2054T) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: x */
    public final CharSequence m1649x() {
        CharSequence[] charSequenceArr;
        int iM1648w = m1648w(this.f2055U);
        if (iM1648w < 0 || (charSequenceArr = this.f2053S) == null) {
            return null;
        }
        return charSequenceArr[iM1648w];
    }

    /* renamed from: y */
    public final void m1650y(String str) {
        boolean zEquals = TextUtils.equals(this.f2055U, str);
        if (zEquals && this.f2057W) {
            return;
        }
        this.f2055U = str;
        this.f2057W = true;
        m1662s(str);
        if (zEquals) {
            return;
        }
        mo1640g();
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0049b.m229b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
