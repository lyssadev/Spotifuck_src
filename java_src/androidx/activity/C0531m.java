package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.C0513t;
import androidx.lifecycle.C0625K;
import androidx.lifecycle.InterfaceC0631Q;
import androidx.lifecycle.InterfaceC0640h;
import java.util.ArrayList;
import java.util.Arrays;
import p000A.C0001b;
import p007E.RunnableC0062o;
import p034S0.C0383c;
import p045Y0.InterfaceC0438a;
import p047Z0.AbstractC0469c;
import p047Z0.AbstractC0470d;
import p047Z0.AbstractC0472f;
import p047Z0.C0468b;
import p052b0.C0663a;
import p052b0.C0666d;
import p068h.AbstractActivityC0841l;

/* renamed from: androidx.activity.m */
/* loaded from: classes.dex */
public final class C0531m extends AbstractC0470d implements InterfaceC0438a {

    /* renamed from: a */
    public final /* synthetic */ int f1288a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC0631Q f1289b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0531m(InterfaceC0631Q interfaceC0631Q, int i) {
        super(0);
        this.f1288a = i;
        this.f1289b = interfaceC0631Q;
    }

    @Override // p045Y0.InterfaceC0438a
    /* renamed from: a */
    public final Object mo1093a() {
        switch (this.f1288a) {
            case 0:
                ((AbstractActivityC0841l) this.f1289b).reportFullyDrawn();
                return C0383c.f975c;
            case 1:
                AbstractActivityC0841l abstractActivityC0841l = (AbstractActivityC0841l) this.f1289b;
                return new C0534p(abstractActivityC0841l.f1295k, new C0531m(abstractActivityC0841l, 0));
            case 2:
                AbstractActivityC0841l abstractActivityC0841l2 = (AbstractActivityC0841l) this.f1289b;
                C0517A c0517a = new C0517A(new RunnableC0522d(abstractActivityC0841l2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC0469c.m1098a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0841l2.f57f.m1615a(new C0526h(c0517a, abstractActivityC0841l2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0062o(abstractActivityC0841l2, c0517a, 1));
                    }
                }
                return c0517a;
            default:
                InterfaceC0631Q interfaceC0631Q = this.f1289b;
                ArrayList arrayList = new ArrayList();
                AbstractC0472f.f1112a.getClass();
                Class clsMo1097a = new C0468b(C0625K.class).mo1097a();
                AbstractC0469c.m1100c("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", clsMo1097a);
                arrayList.add(new C0666d(clsMo1097a));
                C0666d[] c0666dArr = (C0666d[]) arrayList.toArray(new C0666d[0]);
                return (C0625K) new C0513t(interfaceC0631Q.mo1298c(), new C0001b((C0666d[]) Arrays.copyOf(c0666dArr, c0666dArr.length)), interfaceC0631Q instanceof InterfaceC0640h ? ((InterfaceC0640h) interfaceC0631Q).mo1296a() : C0663a.f2258b).m1236k("androidx.lifecycle.internal.SavedStateHandlesVM", C0625K.class);
        }
    }
}
