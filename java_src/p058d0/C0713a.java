package p058d0;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import p000A.C0001b;
import p096r.C1247b;

/* renamed from: d0.a */
/* loaded from: classes.dex */
public final class C0713a extends AbstractC0723k {

    /* renamed from: e */
    public final /* synthetic */ C0715c f2663e;

    /* renamed from: f */
    public final /* synthetic */ String f2664f;

    /* renamed from: g */
    public final /* synthetic */ Bundle f2665g;

    /* renamed from: h */
    public final /* synthetic */ AbstractServiceC0729q f2666h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0713a(AbstractServiceC0729q abstractServiceC0729q, Object obj, C0715c c0715c, String str, Bundle bundle) {
        super(obj);
        this.f2666h = abstractServiceC0729q;
        this.f2663e = c0715c;
        this.f2664f = str;
        this.f2665g = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    @Override // p058d0.AbstractC0723k
    /* renamed from: c */
    public final void mo1953c(ArrayList arrayList) {
        String str = this.f2664f;
        C1247b c1247b = this.f2666h.f2718j;
        C0715c c0715c = this.f2663e;
        C0001b c0001b = c0715c.f2672d;
        if (c1247b.getOrDefault(((Messenger) c0001b.f2g).getBinder(), null) != c0715c) {
            int i = AbstractServiceC0729q.f2713m;
            return;
        }
        int i2 = this.f2687d & 1;
        Bundle bundle = this.f2665g;
        ArrayList arrayListM1957a = arrayList;
        if (i2 != 0) {
            arrayListM1957a = AbstractServiceC0729q.m1957a(arrayList, bundle);
        }
        try {
            c0001b.m59y(str, arrayListM1957a, bundle);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str + " package=" + c0715c.f2669a);
        }
    }
}
