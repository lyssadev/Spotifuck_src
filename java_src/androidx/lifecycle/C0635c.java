package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C0635c {

    /* renamed from: c */
    public static final C0635c f1996c = new C0635c();

    /* renamed from: a */
    public final HashMap f1997a = new HashMap();

    /* renamed from: b */
    public final HashMap f1998b = new HashMap();

    /* renamed from: b */
    public static void m1610b(HashMap map, C0634b c0634b, EnumC0644l enumC0644l, Class cls) {
        EnumC0644l enumC0644l2 = (EnumC0644l) map.get(c0634b);
        if (enumC0644l2 == null || enumC0644l == enumC0644l2) {
            if (enumC0644l2 == null) {
                map.put(c0634b, enumC0644l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0634b.f1995b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0644l2 + ", new value " + enumC0644l);
    }

    /* renamed from: a */
    public final C0633a m1611a(Class cls, Method[] methodArr) throws SecurityException {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f1997a;
        if (superclass != null) {
            C0633a c0633aM1611a = (C0633a) map2.get(superclass);
            if (c0633aM1611a == null) {
                c0633aM1611a = m1611a(superclass, null);
            }
            map.putAll(c0633aM1611a.f1993b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0633a c0633aM1611a2 = (C0633a) map2.get(cls2);
            if (c0633aM1611a2 == null) {
                c0633aM1611a2 = m1611a(cls2, null);
            }
            for (Map.Entry entry : c0633aM1611a2.f1993b.entrySet()) {
                m1610b(map, (C0634b) entry.getKey(), (EnumC0644l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            InterfaceC0657y interfaceC0657y = (InterfaceC0657y) method.getAnnotation(InterfaceC0657y.class);
            if (interfaceC0657y != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0650r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0644l enumC0644lValue = interfaceC0657y.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0644l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0644lValue != EnumC0644l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m1610b(map, new C0634b(i, method), enumC0644lValue, cls);
                z2 = true;
            }
        }
        C0633a c0633a = new C0633a(map);
        map2.put(cls, c0633a);
        this.f1998b.put(cls, Boolean.valueOf(z2));
        return c0633a;
    }
}
