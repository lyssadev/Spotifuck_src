package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public abstract class AbstractC0653u {

    /* renamed from: a */
    public static final HashMap f2018a = new HashMap();

    /* renamed from: b */
    public static final HashMap f2019b = new HashMap();

    /* renamed from: a */
    public static void m1623a(Constructor constructor, InterfaceC0649q interfaceC0649q) {
        try {
            AbstractC0469c.m1101d("{\n            constructo…tance(`object`)\n        }", constructor.newInstance(interfaceC0649q));
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static final String m1624b(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int iIndexOf = str.indexOf(".", 0);
        if (iIndexOf >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            do {
                sb2.append((CharSequence) str, i, iIndexOf);
                sb2.append("_");
                i = iIndexOf + 1;
                if (iIndexOf >= str.length()) {
                    break;
                }
                iIndexOf = str.indexOf(".", i);
            } while (iIndexOf > 0);
            sb2.append((CharSequence) str, i, str.length());
            str = sb2.toString();
            AbstractC0469c.m1101d("stringBuilder.append(this, i, length).toString()", str);
        }
        sb.append(str);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0144 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1625c(Class cls) throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor;
        boolean zBooleanValue;
        int length;
        int i;
        int i2 = 1;
        HashMap map = f2018a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                AbstractC0469c.m1101d("fullPackage", name);
                if (name.length() != 0) {
                    AbstractC0469c.m1101d("name", canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC0469c.m1101d("this as java.lang.String).substring(startIndex)", canonicalName);
                }
                AbstractC0469c.m1101d("if (fullPackage.isEmpty(…g(fullPackage.length + 1)", canonicalName);
                String strM1624b = m1624b(canonicalName);
                if (name.length() != 0) {
                    strM1624b = name + '.' + strM1624b;
                }
                declaredConstructor = Class.forName(strM1624b).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap map2 = f2019b;
            if (declaredConstructor != null) {
                List listSingletonList = Collections.singletonList(declaredConstructor);
                AbstractC0469c.m1101d("singletonList(element)", listSingletonList);
                map2.put(cls, listSingletonList);
            } else {
                C0635c c0635c = C0635c.f1996c;
                HashMap map3 = c0635c.f1998b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC0657y) declaredMethods[i3].getAnnotation(InterfaceC0657y.class)) != null) {
                                c0635c.m1611a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0649q.class.isAssignableFrom(superclass)) {
                        AbstractC0469c.m1101d("superclass", superclass);
                        if (m1625c(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            AbstractC0469c.m1099b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            Class<?>[] interfaces = cls.getInterfaces();
                            AbstractC0469c.m1101d("klass.interfaces", interfaces);
                            length = interfaces.length;
                            i = 0;
                            while (true) {
                                if (i < length) {
                                    Class<?> cls2 = interfaces[i];
                                    if (cls2 != null && InterfaceC0649q.class.isAssignableFrom(cls2)) {
                                        AbstractC0469c.m1101d("intrface", cls2);
                                        if (m1625c(cls2) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        AbstractC0469c.m1099b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                    i++;
                                } else if (arrayList != null) {
                                    map2.put(cls, arrayList);
                                }
                            }
                        }
                    } else {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        AbstractC0469c.m1101d("klass.interfaces", interfaces2);
                        length = interfaces2.length;
                        i = 0;
                        while (true) {
                            if (i < length) {
                            }
                            i++;
                        }
                    }
                }
            }
            i2 = 2;
        }
        map.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
