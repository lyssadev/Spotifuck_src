package p066g0;

import android.os.Bundle;
import androidx.preference.ListPreference;
import p017K.C0137j;
import p068h.C0835f;

/* renamed from: g0.h */
/* loaded from: classes.dex */
public class C0764h extends AbstractDialogInterfaceOnClickListenerC0772p {

    /* renamed from: v0 */
    public int f2781v0;

    /* renamed from: w0 */
    public CharSequence[] f2782w0;

    /* renamed from: x0 */
    public CharSequence[] f2783x0;

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p
    /* renamed from: N */
    public final void mo1978N(boolean z2) {
        int i;
        if (!z2 || (i = this.f2781v0) < 0) {
            return;
        }
        String string = this.f2783x0[i].toString();
        ListPreference listPreference = (ListPreference) m1982L();
        listPreference.getClass();
        listPreference.m1650y(string);
    }

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p
    /* renamed from: O */
    public final void mo1980O(C0137j c0137j) {
        CharSequence[] charSequenceArr = this.f2782w0;
        int i = this.f2781v0;
        DialogInterfaceOnClickListenerC0763g dialogInterfaceOnClickListenerC0763g = new DialogInterfaceOnClickListenerC0763g(this);
        C0835f c0835f = (C0835f) c0137j.f365g;
        c0835f.f3237l = charSequenceArr;
        c0835f.f3239n = dialogInterfaceOnClickListenerC0763g;
        c0835f.f3244s = i;
        c0835f.f3243r = true;
        c0835f.f3232g = null;
        c0835f.f3233h = null;
    }

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p, androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: t */
    public final void mo1572t(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.mo1572t(bundle);
        if (bundle != null) {
            this.f2781v0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f2782w0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f2783x0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) m1982L();
        if (listPreference.f2053S == null || (charSequenceArr = listPreference.f2054T) == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f2781v0 = listPreference.m1648w(listPreference.f2055U);
        this.f2782w0 = listPreference.f2053S;
        this.f2783x0 = charSequenceArr;
    }

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p, androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: y */
    public final void mo1576y(Bundle bundle) {
        super.mo1576y(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f2781v0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f2782w0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f2783x0);
    }
}
