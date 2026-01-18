package p043X;

import android.text.Editable;
import androidx.emoji2.text.C0565t;

/* renamed from: X.a */
/* loaded from: classes.dex */
public final class C0427a extends Editable.Factory {

    /* renamed from: a */
    public static final Object f1077a = new Object();

    /* renamed from: b */
    public static volatile C0427a f1078b;

    /* renamed from: c */
    public static Class f1079c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f1079c;
        return cls != null ? new C0565t(cls, charSequence) : super.newEditable(charSequence);
    }
}
