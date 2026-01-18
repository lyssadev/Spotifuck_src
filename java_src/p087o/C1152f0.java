package p087o;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: o.f0 */
/* loaded from: classes.dex */
public class C1152f0 extends C1158h0 {
    @Override // p087o.C1158h0
    /* renamed from: a */
    public void mo2777a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C1161i0.m2785e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
