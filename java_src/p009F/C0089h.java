package p009F;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p007E.C0054g;
import p007E.C0055h;
import p017K.C0138k;
import p091p0.AbstractC1230a;

/* renamed from: F.h */
/* loaded from: classes.dex */
public class C0089h extends AbstractC1230a {

    /* renamed from: o */
    public static Class f258o = null;

    /* renamed from: p */
    public static Constructor f259p = null;

    /* renamed from: q */
    public static Method f260q = null;

    /* renamed from: r */
    public static Method f261r = null;

    /* renamed from: s */
    public static boolean f262s = false;

    /* renamed from: L0 */
    public static boolean m337L0(Object obj, String str, int i, boolean z2) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        m338M0();
        try {
            return ((Boolean) f260q.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: M0 */
    public static void m338M0() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f262s) {
            return;
        }
        f262s = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f259p = constructor;
        f258o = cls;
        f260q = method2;
        f261r = method;
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: t */
    public Typeface mo339t(Context context, C0054g c0054g, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        m338M0();
        try {
            Object objNewInstance = f259p.newInstance(null);
            for (C0055h c0055h : c0054g.f110a) {
                File fileM2880Y = AbstractC1230a.m2880Y(context);
                if (fileM2880Y == null) {
                    return null;
                }
                try {
                    if (!AbstractC1230a.m2904q(fileM2880Y, resources, c0055h.f116f)) {
                        return null;
                    }
                    if (!m337L0(objNewInstance, fileM2880Y.getPath(), c0055h.f112b, c0055h.f113c)) {
                        return null;
                    }
                    fileM2880Y.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileM2880Y.delete();
                }
            }
            m338M0();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f258o, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f261r.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: u */
    public Typeface mo340u(Context context, C0138k[] c0138kArr, int i) throws IOException {
        String str;
        if (c0138kArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(mo354D(i, c0138kArr).f366a, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                if (file != null && file.canRead()) {
                    Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceCreateFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    Typeface typefaceMo355v = mo355v(context, fileInputStream);
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceMo355v;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
