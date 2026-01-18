package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: android.support.v4.media.session.f */
/* loaded from: classes.dex */
public class C0499f {

    /* renamed from: a */
    public final MediaController f1223a;

    /* renamed from: b */
    public final Object f1224b = new Object();

    /* renamed from: c */
    public final ArrayList f1225c = new ArrayList();

    /* renamed from: d */
    public final HashMap f1226d = new HashMap();

    /* renamed from: e */
    public final MediaSessionCompat$Token f1227e;

    public C0499f(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f1227e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f1195b);
        this.f1223a = mediaController;
        if (mediaSessionCompat$Token.m1164a() == null) {
            ResultReceiverC0493x50fd9e4a resultReceiverC0493x50fd9e4a = new ResultReceiverC0493x50fd9e4a(null);
            resultReceiverC0493x50fd9e4a.f1190a = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiverC0493x50fd9e4a);
        }
    }

    /* renamed from: a */
    public final void m1214a() {
        if (this.f1227e.m1164a() == null) {
            return;
        }
        ArrayList arrayList = this.f1225c;
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            arrayList.clear();
        } else {
            if (it2.next() != null) {
                throw new ClassCastException();
            }
            this.f1226d.put(null, new BinderC0498e());
            throw null;
        }
    }
}
