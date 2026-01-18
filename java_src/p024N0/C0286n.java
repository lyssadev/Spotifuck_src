package p024N0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: N0.n */
/* loaded from: classes.dex */
public final class C0286n {

    /* renamed from: a */
    public final /* synthetic */ C0289q f715a;

    public C0286n(C0289q c0289q) {
        this.f715a = c0289q;
    }

    /* renamed from: a */
    public final void m830a(TextInputLayout textInputLayout) {
        C0289q c0289q = this.f715a;
        if (c0289q.f741x == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0289q.f741x;
        C0285m c0285m = c0289q.f722A;
        if (editText != null) {
            editText.removeTextChangedListener(c0285m);
            if (c0289q.f741x.getOnFocusChangeListener() == c0289q.m835b().mo811e()) {
                c0289q.f741x.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0289q.f741x = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0285m);
        }
        c0289q.m835b().mo814m(c0289q.f741x);
        c0289q.m843j(c0289q.m835b());
    }
}
