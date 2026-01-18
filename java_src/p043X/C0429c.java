package p043X;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0553h;
import androidx.emoji2.text.C0555j;
import java.lang.ref.WeakReference;

/* renamed from: X.c */
/* loaded from: classes.dex */
public final class C0429c extends AbstractC0553h {

    /* renamed from: a */
    public final WeakReference f1082a;

    /* renamed from: b */
    public final WeakReference f1083b;

    public C0429c(TextView textView, C0430d c0430d) {
        this.f1082a = new WeakReference(textView);
        this.f1083b = new WeakReference(c0430d);
    }

    @Override // androidx.emoji2.text.AbstractC0553h
    /* renamed from: b */
    public final void mo1090b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f1082a.get();
        InputFilter inputFilter = (InputFilter) this.f1083b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0555j c0555jM1436a = C0555j.m1436a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c0555jM1436a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM1440e = c0555jM1436a.m1440e(text, 0, length);
                    if (text == charSequenceM1440e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM1440e);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM1440e);
                    textView.setText(charSequenceM1440e);
                    if (charSequenceM1440e instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM1440e;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
