package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import p030Q0.AbstractC0328E;
import p096r.C1256k;

/* renamed from: androidx.fragment.app.B */
/* loaded from: classes.dex */
public final class C0571B {

    /* renamed from: b */
    public static final C1256k f1698b = new C1256k();

    /* renamed from: a */
    public final /* synthetic */ C0577H f1699a;

    public C0571B(C0577H c0577h) {
        this.f1699a = c0577h;
    }

    /* renamed from: b */
    public static Class m1458b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C1256k c1256k = f1698b;
        C1256k c1256k2 = (C1256k) c1256k.getOrDefault(classLoader, null);
        if (c1256k2 == null) {
            c1256k2 = new C1256k();
            c1256k.put(classLoader, c1256k2);
        }
        Class cls = (Class) c1256k2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c1256k2.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class m1459c(ClassLoader classLoader, String str) {
        try {
            return m1458b(classLoader, str);
        } catch (ClassCastException e) {
            throw new C0605q(AbstractC0328E.m937g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new C0605q(AbstractC0328E.m937g("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* renamed from: a */
    public final AbstractComponentCallbacksC0606r m1460a(String str) {
        try {
            return (AbstractComponentCallbacksC0606r) m1459c(this.f1699a.f1743t.f1942g.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new C0605q(AbstractC0328E.m937g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new C0605q(AbstractC0328E.m937g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new C0605q(AbstractC0328E.m937g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new C0605q(AbstractC0328E.m937g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
