package p087o;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p000A.C0001b;
import p036T0.AbstractC0411g;
import p065g.AbstractC0752a;

/* renamed from: o.v */
/* loaded from: classes.dex */
public final class C1192v {

    /* renamed from: a */
    public final TextView f4737a;

    /* renamed from: b */
    public final C0001b f4738b;

    public C1192v(TextView textView) {
        this.f4737a = textView;
        this.f4738b = new C0001b(textView);
    }

    /* renamed from: a */
    public final InputFilter[] m2818a(InputFilter[] inputFilterArr) {
        return ((AbstractC0411g) this.f4738b.f2g).mo1060p(inputFilterArr);
    }

    /* renamed from: b */
    public final void m2819b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f4737a.getContext().obtainStyledAttributes(attributeSet, AbstractC0752a.f2745i, i, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m2821d(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: c */
    public final void m2820c(boolean z2) {
        ((AbstractC0411g) this.f4738b.f2g).mo1053L(z2);
    }

    /* renamed from: d */
    public final void m2821d(boolean z2) {
        ((AbstractC0411g) this.f4738b.f2g).mo1054M(z2);
    }
}
