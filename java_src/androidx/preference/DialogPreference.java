package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.AbstractComponentCallbacksC0606r;
import androidx.fragment.app.C0577H;
import androidx.fragment.app.C0589a;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m;
import it.deviato.spotifuck.R;
import p007E.AbstractC0049b;
import p066g0.AbstractC0774r;
import p066g0.AbstractC0782z;
import p066g0.C0760d;
import p066g0.C0764h;
import p066g0.C0767k;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: M */
    public final CharSequence f2043M;

    /* renamed from: N */
    public final String f2044N;

    /* renamed from: O */
    public final Drawable f2045O;

    /* renamed from: P */
    public final String f2046P;

    /* renamed from: Q */
    public final String f2047Q;

    /* renamed from: R */
    public final int f2048R;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0782z.f2847c, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(9);
        string = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        this.f2043M = string;
        if (string == null) {
            this.f2043M = this.f2079g;
        }
        String string2 = typedArrayObtainStyledAttributes.getString(8);
        this.f2044N = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.f2045O = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = typedArrayObtainStyledAttributes.getString(11);
        this.f2046P = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        String string4 = typedArrayObtainStyledAttributes.getString(10);
        this.f2047Q = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        this.f2048R = typedArrayObtainStyledAttributes.getResourceId(7, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: l */
    public void mo1639l() {
        DialogInterfaceOnCancelListenerC0601m c0767k;
        AbstractC0774r abstractC0774r = this.f2074b.f2835i;
        if (abstractC0774r != null) {
            for (AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r = abstractC0774r; abstractComponentCallbacksC0606r != null; abstractComponentCallbacksC0606r = abstractComponentCallbacksC0606r.f1938z) {
            }
            if (abstractC0774r.m1590j().m1467A("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            if (this instanceof EditTextPreference) {
                c0767k = new C0760d();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", this.f2083k);
                c0767k.m1584I(bundle);
            } else if (this instanceof ListPreference) {
                c0767k = new C0764h();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", this.f2083k);
                c0767k.m1584I(bundle2);
            } else {
                if (!(this instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                c0767k = new C0767k();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", this.f2083k);
                c0767k.m1584I(bundle3);
            }
            c0767k.m1585J(abstractC0774r);
            C0577H c0577hM1590j = abstractC0774r.m1590j();
            c0767k.f1877k0 = false;
            c0767k.f1878l0 = true;
            C0589a c0589a = new C0589a(c0577hM1590j);
            c0589a.f1823p = true;
            c0589a.m1546e(0, c0767k, "androidx.preference.PreferenceFragment.DIALOG", 1);
            c0589a.m1545d(false);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0049b.m229b(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
