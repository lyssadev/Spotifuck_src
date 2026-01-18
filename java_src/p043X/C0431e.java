package p043X;

import android.support.v4.media.session.C0513t;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p018K0.C0146e;

/* renamed from: X.e */
/* loaded from: classes.dex */
public final class C0431e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f1086a;

    /* renamed from: b */
    public final C0146e f1087b;

    public C0431e(KeyListener keyListener) {
        C0146e c0146e = new C0146e(9);
        this.f1086a = keyListener;
        this.f1087b = c0146e;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f1086a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f1086a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z2;
        this.f1087b.getClass();
        if (i != 67 ? i != 112 ? false : C0513t.m1225h(editable, keyEvent, true) : C0513t.m1225h(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f1086a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1086a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f1086a.onKeyUp(view, editable, i, keyEvent);
    }
}
