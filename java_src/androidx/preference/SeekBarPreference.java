package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import p066g0.AbstractC0782z;
import p066g0.C0753A;
import p066g0.C0755C;
import p066g0.C0781y;
import p066g0.ViewOnKeyListenerC0754B;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: M */
    public int f2106M;

    /* renamed from: N */
    public int f2107N;

    /* renamed from: O */
    public int f2108O;

    /* renamed from: P */
    public int f2109P;

    /* renamed from: Q */
    public boolean f2110Q;

    /* renamed from: R */
    public SeekBar f2111R;

    /* renamed from: S */
    public TextView f2112S;

    /* renamed from: T */
    public final boolean f2113T;

    /* renamed from: U */
    public final boolean f2114U;

    /* renamed from: V */
    public final boolean f2115V;

    /* renamed from: W */
    public final C0753A f2116W;

    /* renamed from: X */
    public final ViewOnKeyListenerC0754B f2117X;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.f2116W = new C0753A(this);
        this.f2117X = new ViewOnKeyListenerC0754B(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0782z.f2855k, R.attr.seekBarPreferenceStyle, 0);
        this.f2107N = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.f2107N;
        i = i < i2 ? i2 : i;
        if (i != this.f2108O) {
            this.f2108O = i;
            mo1640g();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.f2109P) {
            this.f2109P = Math.min(this.f2108O - this.f2107N, Math.abs(i3));
            mo1640g();
        }
        this.f2113T = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f2114U = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.f2115V = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public final void mo1636k(C0781y c0781y) {
        super.mo1636k(c0781y);
        c0781y.f3654a.setOnKeyListener(this.f2117X);
        this.f2111R = (SeekBar) c0781y.m2001r(R.id.seekbar);
        TextView textView = (TextView) c0781y.m2001r(R.id.seekbar_value);
        this.f2112S = textView;
        if (this.f2114U) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f2112S = null;
        }
        SeekBar seekBar = this.f2111R;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f2116W);
        this.f2111R.setMax(this.f2108O - this.f2107N);
        int i = this.f2109P;
        if (i != 0) {
            this.f2111R.setKeyProgressIncrement(i);
        } else {
            this.f2109P = this.f2111R.getKeyProgressIncrement();
        }
        this.f2111R.setProgress(this.f2106M - this.f2107N);
        int i2 = this.f2106M;
        TextView textView2 = this.f2112S;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.f2111R.setEnabled(mo1657f());
    }

    @Override // androidx.preference.Preference
    /* renamed from: n */
    public final Object mo1641n(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    /* renamed from: o */
    public final void mo1642o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0755C.class)) {
            super.mo1642o(parcelable);
            return;
        }
        C0755C c0755c = (C0755C) parcelable;
        super.mo1642o(c0755c.getSuperState());
        this.f2106M = c0755c.f2765a;
        this.f2107N = c0755c.f2766b;
        this.f2108O = c0755c.f2767c;
        mo1640g();
    }

    @Override // androidx.preference.Preference
    /* renamed from: p */
    public final Parcelable mo1643p() {
        this.f2069I = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f2089q) {
            return absSavedState;
        }
        C0755C c0755c = new C0755C(absSavedState);
        c0755c.f2765a = this.f2106M;
        c0755c.f2766b = this.f2107N;
        c0755c.f2767c = this.f2108O;
        return c0755c;
    }

    @Override // androidx.preference.Preference
    /* renamed from: q */
    public final void mo1644q(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (m1663v()) {
            iIntValue = this.f2074b.m1999c().getInt(this.f2083k, iIntValue);
        }
        m1666w(iIntValue, true);
    }

    /* renamed from: w */
    public final void m1666w(int i, boolean z2) {
        int i2 = this.f2107N;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f2108O;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f2106M) {
            this.f2106M = i;
            TextView textView = this.f2112S;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (m1663v()) {
                int i4 = ~i;
                if (m1663v()) {
                    i4 = this.f2074b.m1999c().getInt(this.f2083k, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor editorM1997a = this.f2074b.m1997a();
                    editorM1997a.putInt(this.f2083k, i);
                    if (!this.f2074b.f2831e) {
                        editorM1997a.apply();
                    }
                }
            }
            if (z2) {
                mo1640g();
            }
        }
    }
}
