package p066g0;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
import p024N0.RunnableC0268B;

/* renamed from: g0.d */
/* loaded from: classes.dex */
public class C0760d extends AbstractDialogInterfaceOnClickListenerC0772p {

    /* renamed from: v0 */
    public EditText f2774v0;

    /* renamed from: w0 */
    public CharSequence f2775w0;

    /* renamed from: x0 */
    public final RunnableC0268B f2776x0 = new RunnableC0268B(8, this);

    /* renamed from: y0 */
    public long f2777y0 = -1;

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p
    /* renamed from: M */
    public final void mo1977M(View view) {
        super.mo1977M(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f2774v0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f2774v0.setText(this.f2775w0);
        EditText editText2 = this.f2774v0;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) m1982L()).getClass();
    }

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p
    /* renamed from: N */
    public final void mo1978N(boolean z2) {
        if (z2) {
            String string = this.f2774v0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) m1982L();
            editTextPreference.getClass();
            editTextPreference.m1646w(string);
        }
    }

    /* renamed from: P */
    public final void m1979P() {
        long j2 = this.f2777y0;
        if (j2 == -1 || j2 + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.f2774v0;
        if (editText == null || !editText.isFocused()) {
            this.f2777y0 = -1L;
            return;
        }
        if (((InputMethodManager) this.f2774v0.getContext().getSystemService("input_method")).showSoftInput(this.f2774v0, 0)) {
            this.f2777y0 = -1L;
            return;
        }
        EditText editText2 = this.f2774v0;
        RunnableC0268B runnableC0268B = this.f2776x0;
        editText2.removeCallbacks(runnableC0268B);
        this.f2774v0.postDelayed(runnableC0268B, 50L);
    }

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p, androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: t */
    public final void mo1572t(Bundle bundle) {
        super.mo1572t(bundle);
        if (bundle == null) {
            this.f2775w0 = ((EditTextPreference) m1982L()).f2052S;
        } else {
            this.f2775w0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // p066g0.AbstractDialogInterfaceOnClickListenerC0772p, androidx.fragment.app.DialogInterfaceOnCancelListenerC0601m, androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: y */
    public final void mo1576y(Bundle bundle) {
        super.mo1576y(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f2775w0);
    }
}
