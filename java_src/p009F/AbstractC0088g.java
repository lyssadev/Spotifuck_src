package p009F;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000A.C0001b;
import p003C.RunnableC0015b;
import p007E.AbstractC0049b;
import p007E.C0054g;
import p007E.C0056i;
import p007E.C0057j;
import p007E.InterfaceC0053f;
import p007E.RunnableC0062o;
import p017K.AbstractC0136i;
import p017K.C0132e;
import p017K.C0134g;
import p017K.C0135h;
import p017K.CallableC0133f;
import p017K.RunnableC0128a;
import p017K.RunnableC0141n;
import p091p0.AbstractC1230a;
import p096r.C1251f;
import p096r.C1256k;

/* renamed from: F.g */
/* loaded from: classes.dex */
public abstract class AbstractC0088g {

    /* renamed from: a */
    public static final AbstractC1230a f256a;

    /* renamed from: b */
    public static final C1251f f257b;

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f256a = new C0093l();
        } else if (i >= 28) {
            f256a = new C0092k();
        } else if (i >= 26) {
            f256a = new C0091j();
        } else if (i < 24) {
            f256a = new C0089h();
        } else {
            Method method = C0090i.f265q;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f256a = new C0090i();
            }
        }
        f257b = new C1251f(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m335a(Context context, InterfaceC0053f interfaceC0053f, Resources resources, int i, String str, int i2, int i3, AbstractC0049b abstractC0049b, boolean z2) throws InterruptedException {
        Typeface typefaceMo339t;
        Typeface typefaceCreate;
        int i4 = 2;
        int i5 = 1;
        int i6 = 0;
        int i7 = -3;
        if (interfaceC0053f instanceof C0056i) {
            C0056i c0056i = (C0056i) interfaceC0053f;
            String str2 = c0056i.f120d;
            typefaceMo339t = null;
            if (str2 == null || str2.isEmpty()) {
                typefaceCreate = null;
                if (typefaceCreate == null) {
                    if (abstractC0049b != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0062o(abstractC0049b, typefaceCreate, 0));
                    }
                    return typefaceCreate;
                }
                boolean z3 = !z2 ? abstractC0049b != null : c0056i.f119c != 0;
                int i8 = z2 ? c0056i.f118b : -1;
                Handler handler = new Handler(Looper.getMainLooper());
                C0001b c0001b = new C0001b(2);
                c0001b.f2g = abstractC0049b;
                C0132e c0132e = c0056i.f117a;
                C0057j c0057j = new C0057j(c0001b, handler, i4);
                if (z3) {
                    C1251f c1251f = AbstractC0136i.f360a;
                    String str3 = c0132e.f350e + "-" + i3;
                    Typeface typeface = (Typeface) AbstractC0136i.f360a.m2963a(str3);
                    if (typeface != null) {
                        handler.post(new RunnableC0015b(c0001b, typeface, 3));
                        typefaceMo339t = typeface;
                    } else if (i8 == -1) {
                        C0135h c0135hM486a = AbstractC0136i.m486a(str3, context, c0132e, i3);
                        c0057j.m257G(c0135hM486a);
                        typefaceMo339t = c0135hM486a.f358a;
                    } else {
                        try {
                            try {
                                C0135h c0135h = (C0135h) AbstractC0136i.f361b.submit(new CallableC0133f(str3, context, c0132e, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                c0057j.m257G(c0135h);
                                typefaceMo339t = c0135h.f358a;
                            } catch (InterruptedException e) {
                                throw e;
                            } catch (ExecutionException e2) {
                                throw new RuntimeException(e2);
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (InterruptedException unused2) {
                            ((Handler) c0057j.f123h).post(new RunnableC0128a(i7, i6, (C0001b) c0057j.f122g));
                        }
                    }
                } else {
                    C1251f c1251f2 = AbstractC0136i.f360a;
                    String str4 = c0132e.f350e + "-" + i3;
                    Typeface typeface2 = (Typeface) AbstractC0136i.f360a.m2963a(str4);
                    if (typeface2 != null) {
                        handler.post(new RunnableC0015b(c0001b, typeface2, 3));
                        typefaceMo339t = typeface2;
                    } else {
                        C0134g c0134g = new C0134g(i6, c0057j);
                        synchronized (AbstractC0136i.f362c) {
                            try {
                                C1256k c1256k = AbstractC0136i.f363d;
                                ArrayList arrayList = (ArrayList) c1256k.getOrDefault(str4, null);
                                if (arrayList != null) {
                                    arrayList.add(c0134g);
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(c0134g);
                                    c1256k.put(str4, arrayList2);
                                    CallableC0133f callableC0133f = new CallableC0133f(str4, context, c0132e, i3, 1);
                                    ThreadPoolExecutor threadPoolExecutor = AbstractC0136i.f361b;
                                    C0134g c0134g2 = new C0134g(i5, str4);
                                    Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                    RunnableC0141n runnableC0141n = new RunnableC0141n();
                                    runnableC0141n.f375b = callableC0133f;
                                    runnableC0141n.f376c = c0134g2;
                                    runnableC0141n.f377d = handler2;
                                    threadPoolExecutor.execute(runnableC0141n);
                                }
                            } finally {
                            }
                        }
                    }
                }
            } else {
                typefaceCreate = Typeface.create(str2, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                }
                if (typefaceCreate == null) {
                }
            }
        } else {
            typefaceMo339t = f256a.mo339t(context, (C0054g) interfaceC0053f, resources, i3);
            if (abstractC0049b != null) {
                if (typefaceMo339t != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0062o(abstractC0049b, typefaceMo339t, 0));
                } else {
                    abstractC0049b.m241a(-3);
                }
            }
        }
        if (typefaceMo339t != null) {
            f257b.m2964b(m336b(resources, i, str, i2, i3), typefaceMo339t);
        }
        return typefaceMo339t;
    }

    /* renamed from: b */
    public static String m336b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
