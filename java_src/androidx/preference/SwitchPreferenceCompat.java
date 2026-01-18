package androidx.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import it.deviato.spotifuck.R;
import p066g0.AbstractC0782z;
import p066g0.C0757a;
import p066g0.C0781y;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: R */
    public final C0757a f2121R;

    /* renamed from: S */
    public final String f2122S;

    /* renamed from: T */
    public final String f2123T;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.f2121R = new C0757a(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0782z.f2857m, R.attr.switchPreferenceCompatStyle, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.f2125N = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f2124M) {
            mo1640g();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.f2126O = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f2124M) {
            mo1640g();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.f2122S = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        mo1640g();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f2123T = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        mo1640g();
        this.f2128Q = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public final void mo1636k(C0781y c0781y) throws Resources.NotFoundException {
        super.mo1636k(c0781y);
        m1668y(c0781y.m2001r(R.id.switchWidget));
        m1670x(c0781y.m2001r(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public final void mo1637r(View view) throws Resources.NotFoundException {
        super.mo1637r(view);
        if (((AccessibilityManager) this.f2073a.getSystemService("accessibility")).isEnabled()) {
            m1668y(view.findViewById(R.id.switchWidget));
            m1670x(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final void m1668y(View view) throws Resources.NotFoundException {
        boolean z2 = view instanceof SwitchCompat;
        if (z2) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f2124M);
        }
        if (z2) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f2122S);
            switchCompat.setTextOff(this.f2123T);
            switchCompat.setOnCheckedChangeListener(this.f2121R);
        }
    }
}
