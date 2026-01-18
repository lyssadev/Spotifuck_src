package p009F;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p007E.C0054g;
import p007E.C0055h;
import p017K.C0138k;
import p091p0.AbstractC1230a;
import p096r.C1256k;

/* renamed from: F.i */
/* loaded from: classes.dex */
public final class C0090i extends AbstractC1230a {

    /* renamed from: o */
    public static final Class f263o;

    /* renamed from: p */
    public static final Constructor f264p;

    /* renamed from: q */
    public static final Method f265q;

    /* renamed from: r */
    public static final Method f266r;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        f264p = constructor;
        f263o = cls;
        f265q = method2;
        f266r = method;
    }

    /* renamed from: L0 */
    public static boolean m341L0(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z2) {
        try {
            return ((Boolean) f265q.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: M0 */
    public static Typeface m342M0(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f263o, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f266r.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[SYNTHETIC] */
    @Override // p091p0.AbstractC1230a
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface mo339t(Context context, C0054g c0054g, Resources resources, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f264p.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (C0055h c0055h : c0054g.f110a) {
            int i2 = c0055h.f116f;
            File fileM2880Y = AbstractC1230a.m2880Y(context);
            if (fileM2880Y != null) {
                try {
                    if (AbstractC1230a.m2904q(fileM2880Y, resources, i2)) {
                        try {
                            fileInputStream = new FileInputStream(fileM2880Y);
                        } catch (IOException unused2) {
                            map = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (map != null) {
                                return null;
                            }
                            if (!m341L0(objNewInstance, map, c0055h.f115e, c0055h.f112b, c0055h.f113c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    fileM2880Y.delete();
                }
            }
            map = null;
            if (map != null) {
            }
        }
        return m342M0(objNewInstance);
    }

    @Override // p091p0.AbstractC1230a
    /* renamed from: u */
    public final Typeface mo340u(Context context, C0138k[] c0138kArr, int i) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f264p.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        C1256k c1256k = new C1256k();
        for (C0138k c0138k : c0138kArr) {
            Uri uri = c0138k.f366a;
            ByteBuffer byteBufferM2893j0 = (ByteBuffer) c1256k.getOrDefault(uri, null);
            if (byteBufferM2893j0 == null) {
                byteBufferM2893j0 = AbstractC1230a.m2893j0(context, uri);
                c1256k.put(uri, byteBufferM2893j0);
            }
            if (byteBufferM2893j0 == null) {
                return null;
            }
            if (!m341L0(objNewInstance, byteBufferM2893j0, c0138k.f367b, c0138k.f368c, c0138k.f369d)) {
                return null;
            }
        }
        Typeface typefaceM342M0 = m342M0(objNewInstance);
        if (typefaceM342M0 == null) {
            return null;
        }
        return Typeface.create(typefaceM342M0, i);
    }
}
