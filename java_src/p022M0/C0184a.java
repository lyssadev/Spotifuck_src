package p022M0;

import android.os.Handler;
import android.os.Message;
import p030Q0.AbstractC0328E;

/* renamed from: M0.a */
/* loaded from: classes.dex */
public final class C0184a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            AbstractC0328E.m938h(message.obj);
            throw null;
        }
        if (i != 1) {
            return false;
        }
        AbstractC0328E.m938h(message.obj);
        throw null;
    }
}
