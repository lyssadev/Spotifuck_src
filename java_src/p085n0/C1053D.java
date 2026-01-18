package p085n0;

import android.os.Build;
import android.view.View;

/* renamed from: n0.D */
/* loaded from: classes.dex */
public class C1053D extends C1051B {

    /* renamed from: r */
    public static boolean f4338r = true;

    @Override // p018K0.C0146e
    /* renamed from: p */
    public void mo505p(View view, int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo505p(view, i);
        } else if (f4338r) {
            try {
                AbstractC1052C.m2607a(view, i);
            } catch (NoSuchMethodError unused) {
                f4338r = false;
            }
        }
    }
}
