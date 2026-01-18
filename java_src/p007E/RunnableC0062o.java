package p007E;

import android.graphics.Typeface;
import androidx.activity.AbstractActivityC0532n;
import androidx.activity.C0517A;
import androidx.activity.C0526h;
import p068h.AbstractActivityC0841l;
import p068h.ExecutorC0846q;

/* renamed from: E.o */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0062o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f129a;

    /* renamed from: b */
    public final /* synthetic */ Object f130b;

    /* renamed from: c */
    public final /* synthetic */ Object f131c;

    public /* synthetic */ RunnableC0062o(Object obj, Object obj2, int i) {
        this.f129a = i;
        this.f130b = obj;
        this.f131c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f130b;
        Object obj2 = this.f131c;
        switch (this.f129a) {
            case 0:
                ((AbstractC0049b) obj).mo243j((Typeface) obj2);
                return;
            case 1:
                AbstractActivityC0841l abstractActivityC0841l = (AbstractActivityC0841l) obj;
                int i = AbstractActivityC0532n.f1290w;
                abstractActivityC0841l.f57f.m1615a(new C0526h((C0517A) obj2, abstractActivityC0841l));
                return;
            default:
                Runnable runnable = (Runnable) obj2;
                ExecutorC0846q executorC0846q = (ExecutorC0846q) obj;
                executorC0846q.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0846q.m2130a();
                }
        }
    }
}
