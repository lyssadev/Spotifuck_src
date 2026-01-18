package p091p0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p096r.C1247b;

/* renamed from: p0.b */
/* loaded from: classes.dex */
public abstract class AbstractC1231b {

    /* renamed from: a */
    public final C1247b f4901a;

    /* renamed from: b */
    public final C1247b f4902b;

    /* renamed from: c */
    public final C1247b f4903c;

    public AbstractC1231b(C1247b c1247b, C1247b c1247b2, C1247b c1247b3) {
        this.f4901a = c1247b;
        this.f4902b = c1247b2;
        this.f4903c = c1247b3;
    }

    /* renamed from: a */
    public abstract C1232c mo2918a();

    /* renamed from: b */
    public final Class m2919b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C1247b c1247b = this.f4903c;
        Class cls2 = (Class) c1247b.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c1247b.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: c */
    public final Method m2920c(String str) throws NoSuchMethodException, SecurityException {
        C1247b c1247b = this.f4901a;
        Method method = (Method) c1247b.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1231b.class.getClassLoader()).getDeclaredMethod("read", AbstractC1231b.class);
        c1247b.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final Method m2921d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C1247b c1247b = this.f4902b;
        Method method = (Method) c1247b.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM2919b = m2919b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM2919b.getDeclaredMethod("write", cls, AbstractC1231b.class);
        c1247b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public abstract boolean mo2922e(int i);

    /* renamed from: f */
    public final int m2923f(int i, int i2) {
        return !mo2922e(i2) ? i : ((C1232c) this).f4905e.readInt();
    }

    /* renamed from: g */
    public final Parcelable m2924g(Parcelable parcelable, int i) {
        if (!mo2922e(i)) {
            return parcelable;
        }
        return ((C1232c) this).f4905e.readParcelable(C1232c.class.getClassLoader());
    }

    /* renamed from: h */
    public final InterfaceC1233d m2925h() {
        String string = ((C1232c) this).f4905e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC1233d) m2920c(string).invoke(null, mo2918a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: i */
    public abstract void mo2926i(int i);

    /* renamed from: j */
    public final void m2927j(int i, int i2) {
        mo2926i(i2);
        ((C1232c) this).f4905e.writeInt(i);
    }

    /* renamed from: k */
    public final void m2928k(Parcelable parcelable, int i) {
        mo2926i(i);
        ((C1232c) this).f4905e.writeParcelable(parcelable, 0);
    }

    /* renamed from: l */
    public final void m2929l(InterfaceC1233d interfaceC1233d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (interfaceC1233d == null) {
            ((C1232c) this).f4905e.writeString(null);
            return;
        }
        try {
            ((C1232c) this).f4905e.writeString(m2919b(interfaceC1233d.getClass()).getName());
            C1232c c1232cMo2918a = mo2918a();
            try {
                m2921d(interfaceC1233d.getClass()).invoke(null, interfaceC1233d, c1232cMo2918a);
                int i = c1232cMo2918a.f4909i;
                if (i >= 0) {
                    int i2 = c1232cMo2918a.f4904d.get(i);
                    Parcel parcel = c1232cMo2918a.f4905e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC1233d.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
