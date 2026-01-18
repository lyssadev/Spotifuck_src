package p043X;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.C0555j;
import p036T0.AbstractC0411g;

/* renamed from: X.g */
/* loaded from: classes.dex */
public final class C0433g extends AbstractC0411g {

    /* renamed from: l */
    public final C0432f f1091l;

    public C0433g(TextView textView) {
        this.f1091l = new C0432f(textView);
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: L */
    public final void mo1053L(boolean z2) {
        if (C0555j.f1650k != null) {
            this.f1091l.mo1053L(z2);
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: M */
    public final void mo1054M(boolean z2) {
        boolean z3 = C0555j.f1650k != null;
        C0432f c0432f = this.f1091l;
        if (z3) {
            c0432f.mo1054M(z2);
        } else {
            c0432f.f1090n = z2;
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: T */
    public final TransformationMethod mo1057T(TransformationMethod transformationMethod) {
        return !(C0555j.f1650k != null) ? transformationMethod : this.f1091l.mo1057T(transformationMethod);
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: p */
    public final InputFilter[] mo1060p(InputFilter[] inputFilterArr) {
        return !(C0555j.f1650k != null) ? inputFilterArr : this.f1091l.mo1060p(inputFilterArr);
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: v */
    public final boolean mo1061v() {
        return this.f1091l.f1090n;
    }
}
