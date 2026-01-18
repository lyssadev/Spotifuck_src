package p046Z;

import android.util.Log;
import androidx.fragment.app.AbstractComponentCallbacksC0606r;
import p047Z0.AbstractC0469c;

/* renamed from: Z.d */
/* loaded from: classes.dex */
public abstract class AbstractC0464d {

    /* renamed from: a */
    public static final C0463c f1106a = C0463c.f1105a;

    /* renamed from: a */
    public static C0463c m1094a(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r) {
        while (abstractComponentCallbacksC0606r != null) {
            if (abstractComponentCallbacksC0606r.m1595o()) {
                abstractComponentCallbacksC0606r.m1590j();
            }
            abstractComponentCallbacksC0606r = abstractComponentCallbacksC0606r.f1938z;
        }
        return f1106a;
    }

    /* renamed from: b */
    public static void m1095b(AbstractC0466f abstractC0466f) {
        if (Log.isLoggable("FragmentManager", 3)) {
            abstractC0466f.f1107a.getClass();
        }
    }

    /* renamed from: c */
    public static final void m1096c(AbstractComponentCallbacksC0606r abstractComponentCallbacksC0606r, String str) {
        AbstractC0469c.m1102e("fragment", abstractComponentCallbacksC0606r);
        AbstractC0469c.m1102e("previousFragmentId", str);
        m1095b(new C0461a(abstractComponentCallbacksC0606r, "Attempting to reuse fragment " + abstractComponentCallbacksC0606r + " with previous ID " + str));
        m1094a(abstractComponentCallbacksC0606r).getClass();
    }
}
