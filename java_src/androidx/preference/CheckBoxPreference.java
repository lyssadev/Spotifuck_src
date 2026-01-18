package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import it.deviato.spotifuck.R;
import p007E.AbstractC0049b;
import p066g0.AbstractC0782z;
import p066g0.C0757a;
import p066g0.C0781y;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: R */
    public final C0757a f2042R;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iM229b = AbstractC0049b.m229b(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iM229b);
        this.f2042R = new C0757a(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0782z.f2846b, iM229b, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.f2125N = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.f2124M) {
            mo1640g();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.f2126O = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.f2124M) {
            mo1640g();
        }
        this.f2128Q = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public final void mo1636k(C0781y c0781y) {
        super.mo1636k(c0781y);
        m1638y(c0781y.m2001r(android.R.id.checkbox));
        m1670x(c0781y.m2001r(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public final void mo1637r(View view) {
        super.mo1637r(view);
        if (((AccessibilityManager) this.f2073a.getSystemService("accessibility")).isEnabled()) {
            m1638y(view.findViewById(android.R.id.checkbox));
            m1670x(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final void m1638y(View view) {
        boolean z2 = view instanceof CompoundButton;
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f2124M);
        }
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f2042R);
        }
    }
}
