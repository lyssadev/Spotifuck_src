package p024N0;

import com.google.android.material.internal.CheckableImageButton;
import p091p0.AbstractC1230a;

/* renamed from: N0.f */
/* loaded from: classes.dex */
public final class C0278f extends AbstractC0290r {

    /* renamed from: e */
    public final /* synthetic */ int f693e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0278f(C0289q c0289q, int i) {
        super(c0289q);
        this.f693e = i;
    }

    @Override // p024N0.AbstractC0290r
    /* renamed from: r */
    public void mo816r() {
        switch (this.f693e) {
            case 0:
                C0289q c0289q = this.f745b;
                c0289q.f737t = null;
                CheckableImageButton checkableImageButton = c0289q.f729l;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC1230a.m2911w0(checkableImageButton, null);
                break;
        }
    }
}
