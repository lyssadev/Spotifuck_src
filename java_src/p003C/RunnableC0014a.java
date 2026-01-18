package p003C;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.PermissionRequest;
import androidx.activity.DialogC0533o;
import androidx.activity.ViewTreeObserverOnDrawListenerC0529k;
import androidx.emoji2.text.C0561p;
import androidx.lifecycle.C0617C;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.EnumC0644l;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.AbstractC0704e;
import it.deviato.spotifuck.MainActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Arrays;
import p000A.C0010k;
import p005D.AbstractC0041b;
import p005D.AbstractC0044e;
import p009F.AbstractC0088g;
import p015J.AbstractC0126k;
import p017K.C0138k;
import p018K0.C0146e;
import p020L0.C0179e;
import p024N0.C0277e;
import p024N0.C0284l;
import p036T0.AbstractC0411g;
import p039V.C0421e;
import p047Z0.AbstractC0469c;
import p091p0.AbstractC1230a;

/* renamed from: C.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0014a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f38a;

    /* renamed from: b */
    public final /* synthetic */ Object f39b;

    public /* synthetic */ RunnableC0014a(int i, Object obj) {
        this.f38a = i;
        this.f39b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object systemService = null;
        switch (this.f38a) {
            case 0:
                Activity activity = (Activity) this.f39b;
                if (activity.isFinishing()) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    Class cls = AbstractC0017d.f49a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC0017d.f49a;
                boolean z2 = i == 26 || i == 27;
                Method method = AbstractC0017d.f54f;
                if ((!z2 || method != null) && (AbstractC0017d.f53e != null || AbstractC0017d.f52d != null)) {
                    try {
                        Object obj2 = AbstractC0017d.f51c.get(activity);
                        if (obj2 != null && (obj = AbstractC0017d.f50b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C0016c c0016c = new C0016c(activity);
                            application.registerActivityLifecycleCallbacks(c0016c);
                            Handler handler = AbstractC0017d.f55g;
                            handler.post(new RunnableC0015b(c0016c, obj2, 0));
                            try {
                                if (i == 26 || i == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC0015b(application, c0016c, 1, false));
                                return;
                            } finally {
                                handler.post(new RunnableC0015b(application, c0016c, 1, false));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                View view = (View) this.f39b;
                Context context = view.getContext();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    systemService = AbstractC0041b.m218b(context, InputMethodManager.class);
                } else {
                    String strM219c = i2 >= 23 ? AbstractC0041b.m219c(context, InputMethodManager.class) : (String) AbstractC0044e.f85a.get(InputMethodManager.class);
                    if (strM219c != null) {
                        systemService = context.getSystemService(strM219c);
                    }
                }
                ((InputMethodManager) systemService).showSoftInput(view, 1);
                return;
            case 2:
                C0179e c0179e = (C0179e) this.f39b;
                c0179e.f525c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0179e.f527e;
                C0421e c0421e = sideSheetBehavior.f2517i;
                if (c0421e != null && c0421e.m1078f()) {
                    c0179e.m581a(c0179e.f524b);
                    return;
                } else {
                    if (sideSheetBehavior.f2516h == 2) {
                        sideSheetBehavior.m1913r(c0179e.f524b);
                        return;
                    }
                    return;
                }
            case 3:
                ((C0277e) this.f39b).m818t(true);
                return;
            case 4:
                C0284l c0284l = (C0284l) this.f39b;
                boolean zIsPopupShowing = c0284l.f703h.isPopupShowing();
                c0284l.m828t(zIsPopupShowing);
                c0284l.f708m = zIsPopupShowing;
                return;
            case 5:
                ((TextInputLayout) this.f39b).f2579i.requestLayout();
                return;
            case 6:
                PermissionRequest permissionRequest = (PermissionRequest) this.f39b;
                if (Arrays.asList(permissionRequest.getResources()).contains("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                    permissionRequest.grant(permissionRequest.getResources());
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            case 7:
                MainActivity.m2226t((String) this.f39b);
                return;
            case 8:
                ViewTreeObserverOnDrawListenerC0529k viewTreeObserverOnDrawListenerC0529k = (ViewTreeObserverOnDrawListenerC0529k) this.f39b;
                Runnable runnable = viewTreeObserverOnDrawListenerC0529k.f1278b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0529k.f1278b = null;
                    return;
                }
                return;
            case 9:
                DialogC0533o.m1304a((DialogC0533o) this.f39b);
                return;
            case 10:
                C0561p c0561p = (C0561p) this.f39b;
                synchronized (c0561p.f1674i) {
                    try {
                        if (c0561p.f1678m == null) {
                            return;
                        }
                        try {
                            C0138k c0138kM1447c = c0561p.m1447c();
                            int i3 = c0138kM1447c.f370e;
                            if (i3 == 2) {
                                synchronized (c0561p.f1674i) {
                                }
                            }
                            if (i3 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i3 + ")");
                            }
                            try {
                                int i4 = AbstractC0126k.f327a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0146e c0146e = c0561p.f1673h;
                                Context context2 = c0561p.f1671f;
                                c0146e.getClass();
                                Typeface typefaceMo340u = AbstractC0088g.f256a.mo340u(context2, new C0138k[]{c0138kM1447c}, 0);
                                MappedByteBuffer mappedByteBufferM2893j0 = AbstractC1230a.m2893j0(c0561p.f1671f, c0138kM1447c.f366a);
                                if (mappedByteBufferM2893j0 == null || typefaceMo340u == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0010k c0010k = new C0010k(typefaceMo340u, AbstractC0411g.m1024I(mappedByteBufferM2893j0));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (c0561p.f1674i) {
                                        try {
                                            AbstractC0411g abstractC0411g = c0561p.f1678m;
                                            if (abstractC0411g != null) {
                                                abstractC0411g.mo1049B(c0010k);
                                            }
                                        } finally {
                                        }
                                    }
                                    c0561p.m1445a();
                                    return;
                                } finally {
                                    int i5 = AbstractC0126k.f327a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (c0561p.f1674i) {
                                try {
                                    AbstractC0411g abstractC0411g2 = c0561p.f1678m;
                                    if (abstractC0411g2 != null) {
                                        abstractC0411g2.mo1048A(th2);
                                    }
                                    c0561p.m1445a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 11:
                C0617C c0617c = (C0617C) this.f39b;
                AbstractC0469c.m1102e("this$0", c0617c);
                int i6 = c0617c.f1960g;
                C0652t c0652t = c0617c.f1964k;
                if (i6 == 0) {
                    c0617c.f1961h = true;
                    c0652t.m1618d(EnumC0644l.ON_PAUSE);
                }
                if (c0617c.f1959f == 0 && c0617c.f1961h) {
                    c0652t.m1618d(EnumC0644l.ON_STOP);
                    c0617c.f1962i = true;
                    return;
                }
                return;
            case 12:
                ((AbstractC0704e) this.f39b).mo1948m();
                return;
            default:
                ((CarouselLayoutManager) this.f39b).m2288l0();
                return;
        }
    }

    public /* synthetic */ RunnableC0014a(MainActivity mainActivity, String str) {
        this.f38a = 7;
        this.f39b = str;
    }
}
