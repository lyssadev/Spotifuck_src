package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.InterfaceC0636d;
import androidx.lifecycle.InterfaceC0650r;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p000A.C0001b;
import p030Q0.RunnableC0336e;
import p080l0.C0968a;
import p080l0.InterfaceC0969b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0969b {
    @Override // p080l0.InterfaceC0969b
    /* renamed from: a */
    public final List mo1415a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p080l0.InterfaceC0969b
    /* renamed from: b */
    public final Object mo1416b(Context context) {
        C0562q c0562q = new C0562q(new C0001b(context, 15));
        c0562q.f1646a = 1;
        if (C0555j.f1650k == null) {
            synchronized (C0555j.f1649j) {
                try {
                    if (C0555j.f1650k == null) {
                        C0555j.f1650k = new C0555j(c0562q);
                    }
                } finally {
                }
            }
        }
        m1417c(context);
        return Boolean.TRUE;
    }

    /* renamed from: c */
    public final void m1417c(Context context) {
        Object objM2468b;
        C0968a c0968aM2466c = C0968a.m2466c(context);
        c0968aM2466c.getClass();
        synchronized (C0968a.f3941e) {
            try {
                objM2468b = c0968aM2466c.f3942a.get(ProcessLifecycleInitializer.class);
                if (objM2468b == null) {
                    objM2468b = c0968aM2466c.m2468b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final C0652t c0652tMo1299d = ((InterfaceC0650r) objM2468b).mo1299d();
        c0652tMo1299d.m1615a(new InterfaceC0636d() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0636d
            /* renamed from: a */
            public final void mo1418a() {
                EmojiCompatInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC0547b.m1419a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0336e(3), 500L);
                c0652tMo1299d.m1620f(this);
            }
        });
    }
}
