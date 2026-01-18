package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import it.deviato.spotifuck.R;
import p007E.AbstractC0049b;
import p066g0.AbstractC0782z;
import p066g0.C0757a;
import p066g0.C0781y;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: R */
    public final C0757a f2118R;

    /* renamed from: S */
    public final String f2119S;

    /* renamed from: T */
    public final String f2120T;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iM229b = AbstractC0049b.m229b(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iM229b);
        this.f2118R = new C0757a(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0782z.f2856l, iM229b, 0);
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
        this.f2119S = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        mo1640g();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f2120T = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        mo1640g();
        this.f2128Q = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public final void mo1636k(C0781y c0781y) {
        super.mo1636k(c0781y);
        m1667y(c0781y.m2001r(android.R.id.switch_widget));
        m1670x(c0781y.m2001r(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public final void mo1637r(View view) {
        super.mo1637r(view);
        if (((AccessibilityManager) this.f2073a.getSystemService("accessibility")).isEnabled()) {
            m1667y(view.findViewById(android.R.id.switch_widget));
            m1670x(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final void m1667y(View view) {
        boolean z2 = view instanceof Switch;
        if (z2) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f2124M);
        }
        if (z2) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f2119S);
            r4.setTextOff(this.f2120T);
            r4.setOnCheckedChangeListener(this.f2118R);
        }
    }
}
