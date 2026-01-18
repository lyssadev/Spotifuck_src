package p043X;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.C0551f;
import androidx.emoji2.text.C0555j;
import java.nio.ByteBuffer;
import p018K0.C0146e;
import p041W.C0424b;

/* renamed from: X.b */
/* loaded from: classes.dex */
public final class C0428b extends InputConnectionWrapper {

    /* renamed from: a */
    public final EditText f1080a;

    /* renamed from: b */
    public final C0146e f1081b;

    public C0428b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0146e c0146e = new C0146e(8);
        super(inputConnection, false);
        this.f1080a = editText;
        this.f1081b = c0146e;
        if (C0555j.f1650k != null) {
            C0555j c0555jM1436a = C0555j.m1436a();
            if (c0555jM1436a.m1437b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0551f c0551f = c0555jM1436a.f1655e;
            c0551f.getClass();
            Bundle bundle = editorInfo.extras;
            C0424b c0424b = (C0424b) c0551f.f1645c.f23f;
            int iM590a = c0424b.m590a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM590a != 0 ? ((ByteBuffer) c0424b.f551d).getInt(iM590a + c0424b.f548a) : 0);
            Bundle bundle2 = editorInfo.extras;
            c0551f.f1643a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f1080a.getEditableText();
        this.f1081b.getClass();
        return C0146e.m495i(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f1080a.getEditableText();
        this.f1081b.getClass();
        return C0146e.m495i(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
