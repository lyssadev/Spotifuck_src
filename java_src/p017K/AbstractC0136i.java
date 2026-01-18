package p017K;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p009F.AbstractC0088g;
import p096r.C1251f;
import p096r.C1256k;

/* renamed from: K.i */
/* loaded from: classes.dex */
public abstract class AbstractC0136i {

    /* renamed from: a */
    public static final C1251f f360a = new C1251f(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f361b;

    /* renamed from: c */
    public static final Object f362c;

    /* renamed from: d */
    public static final C1256k f363d;

    static {
        ThreadFactoryC0140m threadFactoryC0140m = new ThreadFactoryC0140m();
        threadFactoryC0140m.f372a = "fonts-androidx";
        threadFactoryC0140m.f373b = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), threadFactoryC0140m);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f361b = threadPoolExecutor;
        f362c = new Object();
        f363d = new C1256k();
    }

    /* renamed from: a */
    public static C0135h m486a(String str, Context context, C0132e c0132e, int i) {
        C1251f c1251f = f360a;
        Typeface typeface = (Typeface) c1251f.m2963a(str);
        if (typeface != null) {
            return new C0135h(typeface);
        }
        try {
            C0137j c0137jM484a = AbstractC0131d.m484a(context, c0132e);
            int i2 = 1;
            C0138k[] c0138kArr = (C0138k[]) c0137jM484a.f365g;
            int i3 = c0137jM484a.f364f;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else if (c0138kArr != null && c0138kArr.length != 0) {
                int length = c0138kArr.length;
                i2 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = c0138kArr[i4].f370e;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
            }
            if (i2 != 0) {
                return new C0135h(i2);
            }
            Typeface typefaceMo340u = AbstractC0088g.f256a.mo340u(context, c0138kArr, i);
            if (typefaceMo340u == null) {
                return new C0135h(-3);
            }
            c1251f.m2964b(str, typefaceMo340u);
            return new C0135h(typefaceMo340u);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0135h(-1);
        }
    }
}
