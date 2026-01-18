package p043X;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p036T0.AbstractC0411g;

/* renamed from: X.f */
/* loaded from: classes.dex */
public final class C0432f extends AbstractC0411g {

    /* renamed from: l */
    public final TextView f1088l;

    /* renamed from: m */
    public final C0430d f1089m;

    /* renamed from: n */
    public boolean f1090n = true;

    public C0432f(TextView textView) {
        this.f1088l = textView;
        this.f1089m = new C0430d(textView);
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: L */
    public final void mo1053L(boolean z2) {
        if (z2) {
            TextView textView = this.f1088l;
            textView.setTransformationMethod(mo1057T(textView.getTransformationMethod()));
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: M */
    public final void mo1054M(boolean z2) {
        this.f1090n = z2;
        TextView textView = this.f1088l;
        textView.setTransformationMethod(mo1057T(textView.getTransformationMethod()));
        textView.setFilters(mo1060p(textView.getFilters()));
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: T */
    public final TransformationMethod mo1057T(TransformationMethod transformationMethod) {
        return this.f1090n ? ((transformationMethod instanceof C0436j) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C0436j(transformationMethod) : transformationMethod instanceof C0436j ? ((C0436j) transformationMethod).f1097a : transformationMethod;
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: p */
    public final InputFilter[] mo1060p(InputFilter[] inputFilterArr) {
        if (!this.f1090n) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C0430d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C0430d c0430d = this.f1089m;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0430d;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c0430d) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // p036T0.AbstractC0411g
    /* renamed from: v */
    public final boolean mo1061v() {
        return this.f1090n;
    }
}
