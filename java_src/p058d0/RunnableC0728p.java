package p058d0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import p000A.C0001b;
import p051b.C0662d;

/* renamed from: d0.p */
/* loaded from: classes.dex */
public final class RunnableC0728p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2708a = 1;

    /* renamed from: b */
    public final /* synthetic */ C0001b f2709b;

    /* renamed from: c */
    public final /* synthetic */ String f2710c;

    /* renamed from: d */
    public final /* synthetic */ C0662d f2711d;

    /* renamed from: e */
    public final /* synthetic */ C0001b f2712e;

    public RunnableC0728p(C0001b c0001b, C0001b c0001b2, String str, C0662d c0662d) {
        this.f2712e = c0001b;
        this.f2709b = c0001b2;
        this.f2710c = str;
        this.f2711d = c0662d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2708a) {
            case 0:
                IBinder binder = ((Messenger) this.f2709b.f2g).getBinder();
                C0001b c0001b = this.f2712e;
                C0715c c0715c = (C0715c) ((AbstractServiceC0729q) c0001b.f2g).f2718j.getOrDefault(binder, null);
                String str = this.f2710c;
                if (c0715c == null) {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str);
                    return;
                }
                ((AbstractServiceC0729q) c0001b.f2g).getClass();
                C0714b c0714b = new C0714b(str, this.f2711d, 0);
                c0714b.f2687d = 2;
                c0714b.m1956d(null);
                if (c0714b.m1955b()) {
                    return;
                }
                throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
            default:
                IBinder binder2 = ((Messenger) this.f2709b.f2g).getBinder();
                C0001b c0001b2 = this.f2712e;
                C0715c c0715c2 = (C0715c) ((AbstractServiceC0729q) c0001b2.f2g).f2718j.getOrDefault(binder2, null);
                String str2 = this.f2710c;
                if (c0715c2 == null) {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str2);
                    return;
                }
                ((AbstractServiceC0729q) c0001b2.f2g).getClass();
                C0714b c0714b2 = new C0714b(str2, this.f2711d, 1);
                c0714b2.f2687d = 4;
                c0714b2.m1956d(null);
                if (c0714b2.m1955b()) {
                    return;
                }
                throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str2);
        }
    }

    public RunnableC0728p(C0001b c0001b, C0001b c0001b2, String str, Bundle bundle, C0662d c0662d) {
        this.f2712e = c0001b;
        this.f2709b = c0001b2;
        this.f2710c = str;
        this.f2711d = c0662d;
    }
}
