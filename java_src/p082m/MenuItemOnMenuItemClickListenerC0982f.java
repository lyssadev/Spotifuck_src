package p082m;

import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: m.f */
/* loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC0982f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: h */
    public static final Class[] f3984h = {MenuItem.class};

    /* renamed from: f */
    public Object f3985f;

    /* renamed from: g */
    public Method f3986g;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f3986g;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f3985f;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
