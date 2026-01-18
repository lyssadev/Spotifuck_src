package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import p066g0.C0756D;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: M */
    public boolean f2124M;

    /* renamed from: N */
    public String f2125N;

    /* renamed from: O */
    public String f2126O;

    /* renamed from: P */
    public boolean f2127P;

    /* renamed from: Q */
    public boolean f2128Q;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: l */
    public final void mo1639l() {
        m1669w(!this.f2124M);
    }

    @Override // androidx.preference.Preference
    /* renamed from: n */
    public final Object mo1641n(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    /* renamed from: o */
    public final void mo1642o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0756D.class)) {
            super.mo1642o(parcelable);
            return;
        }
        C0756D c0756d = (C0756D) parcelable;
        super.mo1642o(c0756d.getSuperState());
        m1669w(c0756d.f2768a);
    }

    @Override // androidx.preference.Preference
    /* renamed from: p */
    public final Parcelable mo1643p() {
        this.f2069I = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f2089q) {
            return absSavedState;
        }
        C0756D c0756d = new C0756D(absSavedState);
        c0756d.f2768a = this.f2124M;
        return c0756d;
    }

    @Override // androidx.preference.Preference
    /* renamed from: q */
    public final void mo1644q(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (m1663v()) {
            zBooleanValue = this.f2074b.m1999c().getBoolean(this.f2083k, zBooleanValue);
        }
        m1669w(zBooleanValue);
    }

    @Override // androidx.preference.Preference
    /* renamed from: u */
    public final boolean mo1645u() {
        return (this.f2128Q ? this.f2124M : !this.f2124M) || super.mo1645u();
    }

    /* renamed from: w */
    public final void m1669w(boolean z2) {
        boolean z3 = this.f2124M != z2;
        if (z3 || !this.f2127P) {
            this.f2124M = z2;
            this.f2127P = true;
            if (m1663v()) {
                boolean z4 = !z2;
                if (m1663v()) {
                    z4 = this.f2074b.m1999c().getBoolean(this.f2083k, z4);
                }
                if (z2 != z4) {
                    SharedPreferences.Editor editorM1997a = this.f2074b.m1997a();
                    editorM1997a.putBoolean(this.f2083k, z2);
                    if (!this.f2074b.f2831e) {
                        editorM1997a.apply();
                    }
                }
            }
            if (z3) {
                mo1658h(mo1645u());
                mo1640g();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1670x(View view) {
        boolean z2;
        int i;
        if (!(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        if (this.f2124M && !TextUtils.isEmpty(this.f2125N)) {
            textView.setText(this.f2125N);
        } else {
            if (this.f2124M || TextUtils.isEmpty(this.f2126O)) {
                z2 = true;
                if (z2) {
                    CharSequence charSequenceMo1647e = mo1647e();
                    if (!TextUtils.isEmpty(charSequenceMo1647e)) {
                        textView.setText(charSequenceMo1647e);
                        z2 = false;
                    }
                }
                i = z2 ? 8 : 0;
                if (i == textView.getVisibility()) {
                    textView.setVisibility(i);
                    return;
                }
                return;
            }
            textView.setText(this.f2126O);
        }
        z2 = false;
        if (z2) {
        }
        if (z2) {
        }
        if (i == textView.getVisibility()) {
        }
    }
}
