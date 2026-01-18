package androidx.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* renamed from: androidx.activity.t */
/* loaded from: classes.dex */
public final class C0538t extends AbstractC0535q {

    /* renamed from: a */
    public final Field f1315a;

    /* renamed from: b */
    public final Field f1316b;

    /* renamed from: c */
    public final Field f1317c;

    public C0538t(Field field, Field field2, Field field3) {
        this.f1315a = field;
        this.f1316b = field2;
        this.f1317c = field3;
    }

    @Override // androidx.activity.AbstractC0535q
    /* renamed from: a */
    public final boolean mo1307a(InputMethodManager inputMethodManager) throws IllegalAccessException, IllegalArgumentException {
        try {
            this.f1317c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // androidx.activity.AbstractC0535q
    /* renamed from: b */
    public final Object mo1308b(InputMethodManager inputMethodManager) {
        try {
            return this.f1315a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // androidx.activity.AbstractC0535q
    /* renamed from: c */
    public final View mo1309c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f1316b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
