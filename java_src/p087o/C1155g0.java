package p087o;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: o.g0 */
/* loaded from: classes.dex */
public final class C1155g0 extends C1152f0 {
    @Override // p087o.C1152f0, p087o.C1158h0
    /* renamed from: a */
    public void mo2777a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p087o.C1158h0
    /* renamed from: b */
    public boolean mo2781b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
