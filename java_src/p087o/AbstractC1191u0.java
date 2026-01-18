package p087o;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: o.u0 */
/* loaded from: classes.dex */
public abstract class AbstractC1191u0 {

    /* renamed from: a */
    public static final Field f4736a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f4736a = declaredField;
    }
}
