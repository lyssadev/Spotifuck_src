package p066g0;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import p017K.C0137j;
import p068h.C0835f;

/* renamed from: g0.k */
/* loaded from: classes.dex */
public class C0767k extends AbstractDialogInterfaceOnClickListenerC0772p {

    /* renamed from: v0 */
    public final HashSet f2786v0 = new HashSet();

    /* renamed from: w0 */
    public boolean f2787w0;

    /* renamed from: x0 */
    public CharSequence[] f2788x0;

    /* renamed from: y0 */
    public CharSequence[] f2789y0;

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p
    /* renamed from: N */
    public final void mo1978N(boolean z2) {
        if (z2 && this.f2787w0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m1982L();
            multiSelectListPreference.getClass();
            multiSelectListPreference.m1651w(this.f2786v0);
        }
        this.f2787w0 = false;
    }

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p
    /* renamed from: O */
    public final void mo1980O(C0137j c0137j) {
        int length = this.f2789y0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f2786v0.contains(this.f2789y0[i].toString());
        }
        CharSequence[] charSequenceArr = this.f2788x0;
        DialogInterfaceOnMultiChoiceClickListenerC0766j dialogInterfaceOnMultiChoiceClickListenerC0766j = new DialogInterfaceOnMultiChoiceClickListenerC0766j(this);
        C0835f c0835f = (C0835f) c0137j.f365g;
        c0835f.f3237l = charSequenceArr;
        c0835f.f3245t = dialogInterfaceOnMultiChoiceClickListenerC0766j;
        c0835f.f3241p = zArr;
        c0835f.f3242q = true;
    }

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p, androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: t */
    public final void mo1572t(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.mo1572t(bundle);
        HashSet hashSet = this.f2786v0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f2787w0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f2788x0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f2789y0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) m1982L();
        if (multiSelectListPreference.f2058S == null || (charSequenceArr = multiSelectListPreference.f2059T) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.f2060U);
        this.f2787w0 = false;
        this.f2788x0 = multiSelectListPreference.f2058S;
        this.f2789y0 = charSequenceArr;
    }

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p, androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: y */
    public final void mo1576y(Bundle bundle) {
        super.mo1576y(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f2786v0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f2787w0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f2788x0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f2789y0);
    }
}
