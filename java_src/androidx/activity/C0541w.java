package androidx.activity;

import android.window.OnBackInvokedCallback;
import java.lang.reflect.InvocationTargetException;
import p068h.LayoutInflaterFactory2C0819D;

/* renamed from: androidx.activity.w */
/* loaded from: classes.dex */
public final /* synthetic */ class C0541w implements OnBackInvokedCallback {

    /* renamed from: a */
    public final /* synthetic */ int f1322a;

    /* renamed from: b */
    public final /* synthetic */ Object f1323b;

    public /* synthetic */ C0541w(int i, Object obj) {
        this.f1322a = i;
        this.f1323b = obj;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f1322a) {
            case 0:
                ((C0540v) this.f1323b).mo1093a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0819D) this.f1323b).m2061C();
                break;
            default:
                ((Runnable) this.f1323b).run();
                break;
        }
    }
}
