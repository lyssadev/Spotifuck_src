package p068h;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p003C.AbstractC0018e;
import p015J.C0121f;
import p015J.C0125j;
import p069h0.AbstractC0861f;
import p069h0.ExecutorC0859d;
import p096r.C1252g;

/* renamed from: h.n */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0843n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3291a;

    /* renamed from: b */
    public final /* synthetic */ Context f3292b;

    public /* synthetic */ RunnableC0843n(Context context, int i) {
        this.f3291a = i;
        this.f3292b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        C0121f c0121f;
        Object systemService;
        Context context;
        switch (this.f3291a) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f3292b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i >= 33) {
                            Iterator it2 = AbstractC0848s.f3303l.iterator();
                            while (true) {
                                C1252g c1252g = (C1252g) it2;
                                if (c1252g.hasNext()) {
                                    AbstractC0848s abstractC0848s = (AbstractC0848s) ((WeakReference) c1252g.next()).get();
                                    if (abstractC0848s != null && (context = ((LayoutInflaterFactory2C0819D) abstractC0848s).f3149p) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            c0121f = systemService != null ? new C0121f(new C0125j(AbstractC0845p.m2128a(systemService))) : C0121f.f321b;
                            if (c0121f.f322a.isEmpty()) {
                                String strM102e = AbstractC0018e.m102e(context2);
                                Object systemService2 = context2.getSystemService("locale");
                                if (systemService2 != null) {
                                    AbstractC0845p.m2129b(systemService2, AbstractC0844o.m2127a(strM102e));
                                }
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        } else {
                            c0121f = AbstractC0848s.f3299h;
                            if (c0121f == null) {
                            }
                            if (c0121f.f322a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                AbstractC0848s.f3302k = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0843n(this.f3292b, 2));
                break;
            default:
                AbstractC0861f.m2168t(this.f3292b, new ExecutorC0859d(), AbstractC0861f.f3337a, false);
                break;
        }
    }
}
