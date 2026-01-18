package p009F;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p007E.C0054g;
import p007E.C0055h;
import p017K.C0138k;
import p091p0.AbstractC1230a;

/* renamed from: F.j */
/* loaded from: classes.dex */
public class C0091j extends C0089h {

    /* renamed from: t */
    public final Class f267t;

    /* renamed from: u */
    public final Constructor f268u;

    /* renamed from: v */
    public final Method f269v;

    /* renamed from: w */
    public final Method f270w;

    /* renamed from: x */
    public final Method f271x;

    /* renamed from: y */
    public final Method f272y;

    /* renamed from: z */
    public final Method f273z;

    public C0091j() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodMo350U0;
        Constructor<?> constructor;
        Method methodM343T0;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodM343T0 = m343T0(cls2);
            Class<?> cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodMo350U0 = mo350U0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodMo350U0 = null;
            constructor = null;
            methodM343T0 = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f267t = cls;
        this.f268u = constructor;
        this.f269v = methodM343T0;
        this.f270w = method;
        this.f271x = method2;
        this.f272y = method3;
        this.f273z = methodMo350U0;
    }

    /* renamed from: T0 */
    public static Method m343T0(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: N0 */
    public final void m344N0(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f272y.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: O0 */
    public final boolean m345O0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f269v.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: P0 */
    public Typeface mo346P0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f267t, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f273z.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: Q0 */
    public final boolean m347Q0(Object obj) {
        try {
            return ((Boolean) this.f271x.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: R0 */
    public final boolean m348R0() {
        Method method = this.f269v;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: S0 */
    public final Object m349S0() {
        try {
            return this.f268u.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: U0 */
    public Method mo350U0(Class cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p009F.C0089h, p091p0.AbstractC1230a
    /* renamed from: t */
    public final Typeface mo339t(Context context, C0054g c0054g, Resources resources, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m348R0()) {
            return super.mo339t(context, c0054g, resources, i);
        }
        Object objM349S0 = m349S0();
        if (objM349S0 == null) {
            return null;
        }
        for (C0055h c0055h : c0054g.f110a) {
            if (!m345O0(context, objM349S0, c0055h.f111a, c0055h.f115e, c0055h.f112b, c0055h.f113c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0055h.f114d))) {
                m344N0(objM349S0);
                return null;
            }
        }
        if (m347Q0(objM349S0)) {
            return mo346P0(objM349S0);
        }
        return null;
    }

    @Override // p009F.C0089h, p091p0.AbstractC1230a
    /* renamed from: u */
    public final Typeface mo340u(Context context, C0138k[] c0138kArr, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceMo346P0;
        boolean zBooleanValue;
        if (c0138kArr.length < 1) {
            return null;
        }
        if (!m348R0()) {
            C0138k c0138kMo354D = mo354D(i, c0138kArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c0138kMo354D.f366a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c0138kMo354D.f368c).setItalic(c0138kMo354D.f369d).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C0138k c0138k : c0138kArr) {
            if (c0138k.f370e == 0) {
                Uri uri = c0138k.f366a;
                if (!map.containsKey(uri)) {
                    map.put(uri, AbstractC1230a.m2893j0(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objM349S0 = m349S0();
        if (objM349S0 == null) {
            return null;
        }
        boolean z2 = false;
        for (C0138k c0138k2 : c0138kArr) {
            ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c0138k2.f366a);
            if (byteBuffer != null) {
                try {
                    zBooleanValue = ((Boolean) this.f270w.invoke(objM349S0, byteBuffer, Integer.valueOf(c0138k2.f367b), null, Integer.valueOf(c0138k2.f368c), Integer.valueOf(c0138k2.f369d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    m344N0(objM349S0);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            m344N0(objM349S0);
            return null;
        }
        if (m347Q0(objM349S0) && (typefaceMo346P0 = mo346P0(objM349S0)) != null) {
            return Typeface.create(typefaceMo346P0, i);
        }
        return null;
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: w */
    public final Typeface mo351w(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!m348R0()) {
            return super.mo351w(context, resources, i, str, i2);
        }
        Object objM349S0 = m349S0();
        if (objM349S0 == null) {
            return null;
        }
        if (!m345O0(context, objM349S0, str, 0, -1, -1, null)) {
            m344N0(objM349S0);
            return null;
        }
        if (m347Q0(objM349S0)) {
            return mo346P0(objM349S0);
        }
        return null;
    }
}
