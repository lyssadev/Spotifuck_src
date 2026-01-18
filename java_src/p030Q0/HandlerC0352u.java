package p030Q0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: Q0.u */
/* loaded from: classes.dex */
public final class HandlerC0352u extends Handler {

    /* renamed from: a */
    public final /* synthetic */ int f926a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0352u(Looper looper, int i) {
        super(looper);
        this.f926a = i;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.f926a) {
            case 0:
                int i = message.what;
                if (i == 3) {
                    C0345n c0345n = (C0345n) message.obj;
                    c0345n.f914a.getClass();
                    c0345n.f914a.m953a(c0345n.m951a());
                    return;
                }
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        RunnableC0337f runnableC0337f = (RunnableC0337f) list.get(i2);
                        C0354w c0354w = runnableC0337f.f874b;
                        c0354w.getClass();
                        C0345n c0345n2 = runnableC0337f.f882j;
                        ArrayList arrayList = runnableC0337f.f883k;
                        boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                        if (c0345n2 != null || z2) {
                            Uri uri = runnableC0337f.f879g.f938a;
                            Exception exc = runnableC0337f.f887o;
                            Bitmap bitmap = runnableC0337f.f884l;
                            int i3 = runnableC0337f.f886n;
                            if (c0345n2 != null) {
                                c0354w.m954b(bitmap, i3, c0345n2, exc);
                            }
                            if (z2) {
                                int size2 = arrayList.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    c0354w.m954b(bitmap, i3, (C0345n) arrayList.get(i4), exc);
                                }
                            }
                        }
                    }
                    return;
                }
                if (i != 13) {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
                List list2 = (List) message.obj;
                int size3 = list2.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    C0345n c0345n3 = (C0345n) list2.get(i5);
                    C0354w c0354w2 = c0345n3.f914a;
                    c0354w2.getClass();
                    C0347p c0347p = (C0347p) ((C0346o) c0354w2.f933c.f2g).get(c0345n3.f916c);
                    Bitmap bitmap2 = c0347p != null ? c0347p.f920a : null;
                    C0326C c0326c = c0354w2.f934d;
                    if (bitmap2 != null) {
                        c0326c.f835b.sendEmptyMessage(0);
                    } else {
                        c0326c.f835b.sendEmptyMessage(1);
                    }
                    if (bitmap2 != null) {
                        c0354w2.m954b(bitmap2, 1, c0345n3, null);
                    } else {
                        Object objM951a = c0345n3.m951a();
                        if (objM951a != null) {
                            WeakHashMap weakHashMap = c0354w2.f935e;
                            if (weakHashMap.get(objM951a) != c0345n3) {
                                c0354w2.m953a(objM951a);
                                weakHashMap.put(objM951a, c0345n3);
                            }
                        }
                        HandlerC0341j handlerC0341j = c0354w2.f932b.f908h;
                        handlerC0341j.sendMessage(handlerC0341j.obtainMessage(1, c0345n3));
                    }
                }
                return;
            default:
                sendMessageDelayed(obtainMessage(), 1000L);
                return;
        }
    }
}
