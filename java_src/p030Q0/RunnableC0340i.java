package p030Q0;

import android.os.Message;

/* renamed from: Q0.i */
/* loaded from: classes.dex */
public final class RunnableC0340i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f895a;

    /* renamed from: b */
    public final /* synthetic */ Message f896b;

    public /* synthetic */ RunnableC0340i(Message message, int i) {
        this.f895a = i;
        this.f896b = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f895a) {
            case 0:
                throw new AssertionError("Unknown handler message received: " + this.f896b.what);
            default:
                throw new AssertionError("Unhandled stats message." + this.f896b.what);
        }
    }
}
