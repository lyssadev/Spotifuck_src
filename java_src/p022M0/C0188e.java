package p022M0;

import android.os.Handler;
import android.os.Message;
import p000A.C0001b;
import p030Q0.AbstractC0328E;

/* renamed from: M0.e */
/* loaded from: classes.dex */
public final class C0188e implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C0001b f543a;

    public C0188e(C0001b c0001b) {
        this.f543a = c0001b;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0001b c0001b = this.f543a;
        AbstractC0328E.m938h(message.obj);
        synchronized (c0001b.f2g) {
            throw null;
        }
    }
}
