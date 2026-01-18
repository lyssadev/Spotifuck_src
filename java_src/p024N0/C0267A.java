package p024N0;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;

/* renamed from: N0.A */
/* loaded from: classes.dex */
public final class C0267A implements TextWatcher {

    /* renamed from: f */
    public int f666f;

    /* renamed from: g */
    public final /* synthetic */ EditText f667g;

    /* renamed from: h */
    public final /* synthetic */ TextInputLayout f668h;

    public C0267A(TextInputLayout textInputLayout, EditText editText) {
        this.f668h = textInputLayout;
        this.f667g = editText;
        this.f666f = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Resources.NotFoundException {
        TextInputLayout textInputLayout = this.f668h;
        textInputLayout.m1938u(!textInputLayout.f2549F0, false);
        if (textInputLayout.f2593p) {
            textInputLayout.m1931n(editable);
        }
        if (textInputLayout.f2609x) {
            textInputLayout.m1939v(editable);
        }
        EditText editText = this.f667g;
        int lineCount = editText.getLineCount();
        int i = this.f666f;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2612y0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f666f = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
