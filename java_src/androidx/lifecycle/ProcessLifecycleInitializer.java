package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import p036T0.C0408d;
import p047Z0.AbstractC0469c;
import p080l0.C0968a;
import p080l0.InterfaceC0969b;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0969b {
    @Override // p080l0.InterfaceC0969b
    /* renamed from: a */
    public final List mo1415a() {
        return C0408d.f1018a;
    }

    @Override // p080l0.InterfaceC0969b
    /* renamed from: b */
    public final Object mo1416b(Context context) {
        AbstractC0469c.m1102e("context", context);
        C0968a c0968aM2466c = C0968a.m2466c(context);
        AbstractC0469c.m1101d("getInstance(context)", c0968aM2466c);
        if (!c0968aM2466c.f3943b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!AbstractC0647o.f2007a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC0469c.m1100c("null cannot be cast to non-null type android.app.Application", applicationContext);
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0646n());
        }
        C0617C c0617c = C0617C.f1958n;
        c0617c.getClass();
        c0617c.f1963j = new Handler();
        c0617c.f1964k.m1618d(EnumC0644l.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC0469c.m1100c("null cannot be cast to non-null type android.app.Application", applicationContext2);
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new C0616B(c0617c));
        return c0617c;
    }
}
