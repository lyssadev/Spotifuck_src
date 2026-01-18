package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import java.util.ArrayList;
import p066g0.AbstractC0782z;
import p066g0.C0775s;
import p096r.C1256k;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: M */
    public final C1256k f2099M;

    /* renamed from: N */
    public final ArrayList f2100N;

    /* renamed from: O */
    public boolean f2101O;

    /* renamed from: P */
    public int f2102P;

    /* renamed from: Q */
    public boolean f2103Q;

    /* renamed from: R */
    public int f2104R;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2099M = new C1256k();
        new Handler(Looper.getMainLooper());
        this.f2101O = true;
        this.f2102P = 0;
        this.f2103Q = false;
        this.f2104R = Integer.MAX_VALUE;
        this.f2100N = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0782z.f2853i, i, 0);
        this.f2101O = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i2 != Integer.MAX_VALUE && TextUtils.isEmpty(this.f2083k)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.f2104R = i2;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: a */
    public final void mo1653a(Bundle bundle) {
        super.mo1653a(bundle);
        int size = this.f2100N.size();
        for (int i = 0; i < size; i++) {
            m1665x(i).mo1653a(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: b */
    public final void mo1654b(Bundle bundle) {
        super.mo1654b(bundle);
        int size = this.f2100N.size();
        for (int i = 0; i < size; i++) {
            m1665x(i).mo1654b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: h */
    public final void mo1658h(boolean z2) {
        super.mo1658h(z2);
        int size = this.f2100N.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceM1665x = m1665x(i);
            if (preferenceM1665x.f2093u == z2) {
                preferenceM1665x.f2093u = !z2;
                preferenceM1665x.mo1658h(preferenceM1665x.mo1645u());
                preferenceM1665x.mo1640g();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: i */
    public final void mo1659i() {
        super.mo1659i();
        this.f2103Q = true;
        int size = this.f2100N.size();
        for (int i = 0; i < size; i++) {
            m1665x(i).mo1659i();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: m */
    public final void mo1661m() {
        super.mo1661m();
        this.f2103Q = false;
        int size = this.f2100N.size();
        for (int i = 0; i < size; i++) {
            m1665x(i).mo1661m();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: o */
    public final void mo1642o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0775s.class)) {
            super.mo1642o(parcelable);
            return;
        }
        C0775s c0775s = (C0775s) parcelable;
        this.f2104R = c0775s.f2811a;
        super.mo1642o(c0775s.getSuperState());
    }

    @Override // androidx.preference.Preference
    /* renamed from: p */
    public final Parcelable mo1643p() {
        this.f2069I = true;
        return new C0775s(AbsSavedState.EMPTY_STATE, this.f2104R);
    }

    /* renamed from: w */
    public final Preference m1664w(String str) {
        Preference preferenceM1664w;
        if (str == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.f2083k, str)) {
            return this;
        }
        int size = this.f2100N.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceM1665x = m1665x(i);
            if (TextUtils.equals(preferenceM1665x.f2083k, str)) {
                return preferenceM1665x;
            }
            if ((preferenceM1665x instanceof PreferenceGroup) && (preferenceM1664w = ((PreferenceGroup) preferenceM1665x).m1664w(str)) != null) {
                return preferenceM1664w;
            }
        }
        return null;
    }

    /* renamed from: x */
    public final Preference m1665x(int i) {
        return (Preference) this.f2100N.get(i);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
