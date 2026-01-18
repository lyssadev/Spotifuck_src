package p024N0;

import android.text.Editable;
import p008E0.AbstractC0078l;

/* renamed from: N0.m */
/* loaded from: classes.dex */
public final class C0285m extends AbstractC0078l {

    /* renamed from: f */
    public final /* synthetic */ C0289q f714f;

    public C0285m(C0289q c0289q) {
        this.f714f = c0289q;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f714f.m835b().mo808a();
    }

    @Override // p008E0.AbstractC0078l, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f714f.m835b().mo848b();
    }
}
