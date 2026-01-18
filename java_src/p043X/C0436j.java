package p043X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C0555j;

/* renamed from: X.j */
/* loaded from: classes.dex */
public final class C0436j implements TransformationMethod {

    /* renamed from: a */
    public final TransformationMethod f1097a;

    public C0436j(TransformationMethod transformationMethod) {
        this.f1097a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1097a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0555j.m1436a().m1437b() != 1) {
            return charSequence;
        }
        C0555j c0555jM1436a = C0555j.m1436a();
        c0555jM1436a.getClass();
        return c0555jM1436a.m1440e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f1097a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i, rect);
        }
    }
}
