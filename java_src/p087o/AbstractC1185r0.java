package p087o;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: o.r0 */
/* loaded from: classes.dex */
public abstract class AbstractC1185r0 {

    /* renamed from: a */
    public static final Method f4720a;

    /* renamed from: b */
    public static final Method f4721b;

    /* renamed from: c */
    public static final Method f4722c;

    /* renamed from: d */
    public static final boolean f4723d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f4720a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f4721b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f4722c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f4723d = true;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
