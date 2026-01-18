package androidx.activity;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import p045Y0.InterfaceC0438a;
import p047Z0.AbstractC0470d;

/* renamed from: androidx.activity.r */
/* loaded from: classes.dex */
public final class C0536r extends AbstractC0470d implements InterfaceC0438a {

    /* renamed from: a */
    public static final C0536r f1313a = new C0536r(0);

    @Override // p045Y0.InterfaceC0438a
    /* renamed from: a */
    public final Object mo1093a() throws NoSuchFieldException, SecurityException {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new C0538t(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return C0537s.f1314a;
        }
    }
}
