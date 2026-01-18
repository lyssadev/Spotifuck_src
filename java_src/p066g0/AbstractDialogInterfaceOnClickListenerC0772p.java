package p066g0;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.AbstractComponentCallbacksC0606r;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import p017K.C0137j;
import p068h.C0835f;
import p068h.DialogInterfaceC0838i;

/* renamed from: g0.p */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC0772p extends DialogInterfaceOnCancelListenerC0601m implements DialogInterface.OnClickListener {

    /* renamed from: n0 */
    public DialogPreference f2791n0;

    /* renamed from: o0 */
    public CharSequence f2792o0;

    /* renamed from: p0 */
    public CharSequence f2793p0;

    /* renamed from: q0 */
    public CharSequence f2794q0;

    /* renamed from: r0 */
    public CharSequence f2795r0;

    /* renamed from: s0 */
    public int f2796s0;

    /* renamed from: t0 */
    public BitmapDrawable f2797t0;

    /* renamed from: u0 */
    public int f2798u0;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m
    /* renamed from: K */
    public final Dialog mo1568K() {
        this.f2798u0 = -2;
        C0137j c0137j = new C0137j(m1581F());
        CharSequence charSequence = this.f2792o0;
        C0835f c0835f = (C0835f) c0137j.f365g;
        c0835f.f3229d = charSequence;
        c0835f.f3228c = this.f2797t0;
        c0835f.f3232g = this.f2793p0;
        c0835f.f3233h = this;
        c0835f.f3234i = this.f2794q0;
        c0835f.f3235j = this;
        m1581F();
        int i = this.f2796s0;
        View viewInflate = null;
        if (i != 0) {
            LayoutInflater layoutInflaterMo1575x = this.f1908O;
            if (layoutInflaterMo1575x == null) {
                layoutInflaterMo1575x = mo1575x(null);
                this.f1908O = layoutInflaterMo1575x;
            }
            viewInflate = layoutInflaterMo1575x.inflate(i, (ViewGroup) null);
        }
        if (viewInflate != null) {
            mo1977M(viewInflate);
            c0835f.f3240o = viewInflate;
        } else {
            c0835f.f3231f = this.f2795r0;
        }
        mo1980O(c0137j);
        DialogInterfaceC0838i dialogInterfaceC0838iM487a = c0137j.m487a();
        if (this instanceof C0760d) {
            Window window = dialogInterfaceC0838iM487a.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                AbstractC0771o.m1981a(window);
            } else {
                C0760d c0760d = (C0760d) this;
                c0760d.f2777y0 = SystemClock.currentThreadTimeMillis();
                c0760d.m1979P();
            }
        }
        return dialogInterfaceC0838iM487a;
    }

    /* renamed from: L */
    public final DialogPreference m1982L() {
        PreferenceScreen preferenceScreen;
        if (this.f2791n0 == null) {
            Bundle bundle = this.f1923k;
            if (bundle == null) {
                throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
            }
            String string = bundle.getString("key");
            C0779w c0779w = ((AbstractC0774r) m1592l(true)).f2804a0;
            Preference preferenceM1664w = null;
            if (c0779w != null && (preferenceScreen = c0779w.f2833g) != null) {
                preferenceM1664w = preferenceScreen.m1664w(string);
            }
            this.f2791n0 = (DialogPreference) preferenceM1664w;
        }
        return this.f2791n0;
    }

    /* renamed from: M */
    public void mo1977M(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f2795r0;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    /* renamed from: N */
    public abstract void mo1978N(boolean z2);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2798u0 = i;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo1978N(this.f2798u0 == -1);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: t */
    public void mo1572t(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        super.mo1572t(bundle);
        AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606rM1592l = m1592l(true);
        if (!(abstractComponentCallbacksC0606rM1592l instanceof AbstractC0774r)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        AbstractC0774r abstractC0774r = (AbstractC0774r) abstractComponentCallbacksC0606rM1592l;
        Bundle bundle2 = this.f1923k;
        if (bundle2 == null) {
            throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
        }
        String string = bundle2.getString("key");
        if (bundle != null) {
            this.f2792o0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f2793p0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f2794q0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f2795r0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f2796s0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f2797t0 = new BitmapDrawable(m1591k(), bitmap);
                return;
            }
            return;
        }
        C0779w c0779w = abstractC0774r.f2804a0;
        Preference preferenceM1664w = null;
        if (c0779w != null && (preferenceScreen = c0779w.f2833g) != null) {
            preferenceM1664w = preferenceScreen.m1664w(string);
        }
        DialogPreference dialogPreference = (DialogPreference) preferenceM1664w;
        this.f2791n0 = dialogPreference;
        this.f2792o0 = dialogPreference.f2043M;
        this.f2793p0 = dialogPreference.f2046P;
        this.f2794q0 = dialogPreference.f2047Q;
        this.f2795r0 = dialogPreference.f2044N;
        this.f2796s0 = dialogPreference.f2048R;
        Drawable drawable = dialogPreference.f2045O;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f2797t0 = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f2797t0 = new BitmapDrawable(m1591k(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: y */
    public void mo1576y(Bundle bundle) {
        super.mo1576y(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f2792o0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f2793p0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f2794q0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f2795r0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f2796s0);
        BitmapDrawable bitmapDrawable = this.f2797t0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    /* renamed from: O */
    public void mo1980O(C0137j c0137j) {
    }
}
