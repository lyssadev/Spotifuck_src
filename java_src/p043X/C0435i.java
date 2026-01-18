package p043X;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0555j;

/* renamed from: X.i */
/* loaded from: classes.dex */
public final class C0435i implements TextWatcher {

    /* renamed from: f */
    public final EditText f1094f;

    /* renamed from: g */
    public C0434h f1095g;

    /* renamed from: h */
    public boolean f1096h = true;

    public C0435i(EditText editText) {
        this.f1094f = editText;
    }

    /* renamed from: a */
    public static void m1092a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0555j c0555jM1436a = C0555j.m1436a();
            if (editableText == null) {
                length = 0;
            } else {
                c0555jM1436a.getClass();
                length = editableText.length();
            }
            c0555jM1436a.m1440e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f1094f;
        if (editText.isInEditMode() || !this.f1096h || C0555j.f1650k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM1437b = C0555j.m1436a().m1437b();
        if (iM1437b != 0) {
            if (iM1437b == 1) {
                C0555j.m1436a().m1440e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iM1437b != 3) {
                return;
            }
        }
        C0555j c0555jM1436a = C0555j.m1436a();
        if (this.f1095g == null) {
            this.f1095g = new C0434h(editText);
        }
        c0555jM1436a.m1441f(this.f1095g);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
