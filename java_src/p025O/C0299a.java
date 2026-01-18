package p025O;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: O.a */
/* loaded from: classes.dex */
public final class C0299a extends ClickableSpan {

    /* renamed from: a */
    public final int f808a;

    /* renamed from: b */
    public final C0309k f809b;

    /* renamed from: c */
    public final int f810c;

    public C0299a(int i, C0309k c0309k, int i2) {
        this.f808a = i;
        this.f809b = c0309k;
        this.f810c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f808a);
        this.f809b.f826a.performAction(this.f810c, bundle);
    }
}
