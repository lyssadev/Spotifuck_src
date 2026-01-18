package p087o;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: o.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC1176n0 {

    /* renamed from: a */
    public static final boolean f4693a;

    /* renamed from: b */
    public static final Method f4694b;

    /* renamed from: c */
    public static final Field f4695c;

    /* renamed from: d */
    public static final Field f4696d;

    /* renamed from: e */
    public static final Field f4697e;

    /* renamed from: f */
    public static final Field f4698f;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    static {
        Method method;
        Field field;
        Field field2;
        Field field3;
        Field field4;
        boolean z2;
        Class<?> cls;
        try {
            cls = Class.forName("android.graphics.Insets");
            method = Drawable.class.getMethod("getOpticalInsets", null);
            try {
                field = cls.getField("left");
            } catch (ClassNotFoundException unused) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchFieldException unused2) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            } catch (NoSuchMethodException unused3) {
                field = null;
                field2 = field;
                field3 = field2;
                field4 = null;
                z2 = false;
                if (z2) {
                }
            }
        } catch (ClassNotFoundException unused4) {
            method = null;
            field = null;
        } catch (NoSuchFieldException unused5) {
            method = null;
            field = null;
        } catch (NoSuchMethodException unused6) {
            method = null;
            field = null;
        }
        try {
            field2 = cls.getField("top");
            try {
                field3 = cls.getField("right");
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused7) {
                field3 = null;
            }
            try {
                field4 = cls.getField("bottom");
                z2 = true;
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused8) {
                field4 = null;
                z2 = false;
                if (z2) {
                }
            }
        } catch (ClassNotFoundException unused9) {
            field2 = null;
            field3 = field2;
            field4 = null;
            z2 = false;
            if (z2) {
            }
        } catch (NoSuchFieldException unused10) {
            field2 = null;
            field3 = field2;
            field4 = null;
            z2 = false;
            if (z2) {
            }
        } catch (NoSuchMethodException unused11) {
            field2 = null;
            field3 = field2;
            field4 = null;
            z2 = false;
            if (z2) {
            }
        }
        if (z2) {
            f4694b = null;
            f4695c = null;
            f4696d = null;
            f4697e = null;
            f4698f = null;
            f4693a = false;
            return;
        }
        f4694b = method;
        f4695c = field;
        f4696d = field2;
        f4697e = field3;
        f4698f = field4;
        f4693a = true;
    }
}
