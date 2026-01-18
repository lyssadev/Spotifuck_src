package p038U0;

import p040V0.C0422a;
import p042W0.C0426b;
import p047Z0.AbstractC0469c;

/* renamed from: U0.b */
/* loaded from: classes.dex */
public abstract class AbstractC0416b {

    /* renamed from: a */
    public static final C0415a f1034a;

    static {
        C0415a c0415a;
        try {
            Object objNewInstance = C0426b.class.newInstance();
            AbstractC0469c.m1101d("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance);
            try {
                try {
                    c0415a = (C0415a) objNewInstance;
                } catch (ClassCastException e) {
                    ClassLoader classLoader = objNewInstance.getClass().getClassLoader();
                    ClassLoader classLoader2 = C0415a.class.getClassLoader();
                    if (AbstractC0469c.m1098a(classLoader, classLoader2)) {
                        throw e;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
            } catch (ClassNotFoundException unused) {
                Object objNewInstance2 = C0422a.class.newInstance();
                AbstractC0469c.m1101d("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance2);
                try {
                    try {
                        c0415a = (C0415a) objNewInstance2;
                    } catch (ClassNotFoundException unused2) {
                        c0415a = new C0415a();
                    }
                } catch (ClassCastException e2) {
                    ClassLoader classLoader3 = objNewInstance2.getClass().getClassLoader();
                    ClassLoader classLoader4 = C0415a.class.getClassLoader();
                    if (AbstractC0469c.m1098a(classLoader3, classLoader4)) {
                        throw e2;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                }
            }
        } catch (ClassNotFoundException unused3) {
            Object objNewInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            AbstractC0469c.m1101d("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance3);
            try {
                try {
                    c0415a = (C0415a) objNewInstance3;
                } catch (ClassNotFoundException unused4) {
                    Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    AbstractC0469c.m1101d("forName(\"kotlin.internal…entations\").newInstance()", objNewInstance4);
                    try {
                        c0415a = (C0415a) objNewInstance4;
                    } catch (ClassCastException e3) {
                        ClassLoader classLoader5 = objNewInstance4.getClass().getClassLoader();
                        ClassLoader classLoader6 = C0415a.class.getClassLoader();
                        if (AbstractC0469c.m1098a(classLoader5, classLoader6)) {
                            throw e3;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                    }
                }
            } catch (ClassCastException e4) {
                ClassLoader classLoader7 = objNewInstance3.getClass().getClassLoader();
                ClassLoader classLoader8 = C0415a.class.getClassLoader();
                if (AbstractC0469c.m1098a(classLoader7, classLoader8)) {
                    throw e4;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
            }
        }
        f1034a = c0415a;
    }
}
