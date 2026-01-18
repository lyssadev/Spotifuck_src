package p003C;

import android.app.Application;
import android.graphics.Typeface;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v4.media.session.InterfaceC0497d;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000A.C0001b;
import p000A.C0010k;
import p007E.AbstractC0049b;
import p017K.C0134g;
import p023N.AbstractC0206Q;
import p039V.C0421e;
import p058d0.C0716d;

/* renamed from: C.b */
/* loaded from: classes.dex */
public final class RunnableC0015b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f40a;

    /* renamed from: b */
    public final Object f41b;

    /* renamed from: c */
    public final /* synthetic */ Object f42c;

    public /* synthetic */ RunnableC0015b(Object obj, Object obj2, int i) {
        this.f40a = i;
        this.f41b = obj;
        this.f42c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f41b;
        Object obj2 = this.f42c;
        switch (this.f40a) {
            case 0:
                ((C0016c) obj).f43a = obj2;
                return;
            case 1:
                ((Application) obj2).unregisterActivityLifecycleCallbacks((C0016c) obj);
                return;
            case 2:
                try {
                    Method method = AbstractC0017d.f52d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0017d.f53e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 3:
                AbstractC0049b abstractC0049b = (AbstractC0049b) ((C0001b) obj).f2g;
                if (abstractC0049b != null) {
                    abstractC0049b.mo243j((Typeface) obj2);
                    return;
                }
                return;
            case 4:
                ((C0134g) obj).mo485a(obj2);
                return;
            case 5:
                C0010k c0010k = (C0010k) obj2;
                ArrayList arrayList = (ArrayList) c0010k.f25h;
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                if (!arrayList.isEmpty()) {
                    InterfaceC0497d interfaceC0497dM1164a = mediaSessionCompat$Token.m1164a();
                    if (interfaceC0497dM1164a != null) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((Bundle) it2.next()).putBinder("extra_session_binder", interfaceC0497dM1164a.asBinder());
                        }
                    }
                    arrayList.clear();
                }
                ((C0716d) c0010k.f23f).setSessionToken((MediaSession.Token) mediaSessionCompat$Token.f1195b);
                return;
            default:
                C0421e c0421e = ((SwipeDismissBehavior) obj2).f2288a;
                if (c0421e == null || !c0421e.m1078f()) {
                    return;
                }
                WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                ((View) obj).postOnAnimation(this);
                return;
        }
    }

    public /* synthetic */ RunnableC0015b(Object obj, Object obj2, int i, boolean z2) {
        this.f40a = i;
        this.f42c = obj;
        this.f41b = obj2;
    }

    public RunnableC0015b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f40a = 6;
        this.f42c = swipeDismissBehavior;
        this.f41b = view;
    }
}
