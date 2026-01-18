package p035T;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Objects;
import p023N.C0225f;
import p023N.InterfaceC0223e;
import p023N.InterfaceC0251s;

/* renamed from: T.s */
/* loaded from: classes.dex */
public final class C0402s implements InterfaceC0251s {
    /* renamed from: a */
    public final C0225f m1017a(View view, C0225f c0225f) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(c0225f);
        }
        if (c0225f.f593a.mo41f() == 2) {
            return c0225f;
        }
        InterfaceC0223e interfaceC0223e = c0225f.f593a;
        ClipData clipDataMo44i = interfaceC0223e.mo44i();
        int iMo36a = interfaceC0223e.mo36a();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i = 0; i < clipDataMo44i.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataMo44i.getItemAt(i);
            if ((iMo36a & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
