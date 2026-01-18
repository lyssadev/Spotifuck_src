package p043X;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0555j;

/* renamed from: X.d */
/* loaded from: classes.dex */
public final class C0430d implements InputFilter {

    /* renamed from: a */
    public final TextView f1084a;

    /* renamed from: b */
    public C0429c f1085b;

    public C0430d(TextView textView) {
        this.f1084a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f1084a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM1437b = C0555j.m1436a().m1437b();
        if (iM1437b != 0) {
            if (iM1437b == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0555j.m1436a().m1440e(charSequence, 0, charSequence.length());
            }
            if (iM1437b != 3) {
                return charSequence;
            }
        }
        C0555j c0555jM1436a = C0555j.m1436a();
        if (this.f1085b == null) {
            this.f1085b = new C0429c(textView, this);
        }
        c0555jM1436a.m1441f(this.f1085b);
        return charSequence;
    }
}
