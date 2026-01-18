package p017K;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.C0587S;
import androidx.fragment.app.C0597i;
import java.util.ArrayList;
import p003C.RunnableC0015b;
import p007E.C0057j;
import p023N.C0226f0;
import p023N.C0234j0;
import p030Q0.AbstractC0328E;

/* renamed from: K.n */
/* loaded from: classes.dex */
public final class RunnableC0141n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f374a = 0;

    /* renamed from: b */
    public Object f375b;

    /* renamed from: c */
    public Object f376c;

    /* renamed from: d */
    public Object f377d;

    public /* synthetic */ RunnableC0141n() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f374a) {
            case 0:
                try {
                    objCall = ((CallableC0133f) this.f375b).call();
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f377d).post(new RunnableC0015b((C0134g) this.f376c, objCall, 4));
                break;
            case 1:
                C0226f0.m718h((View) this.f375b, (C0057j) this.f376c);
                ((ValueAnimator) this.f377d).start();
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f375b;
                C0587S c0587s = (C0587S) this.f376c;
                if (arrayList.contains(c0587s)) {
                    arrayList.remove(c0587s);
                    ((C0597i) this.f377d).getClass();
                    AbstractC0328E.m931a(c0587s.f1802c.f1903J, c0587s.f1800a);
                    break;
                }
                break;
        }
    }

    public RunnableC0141n(C0597i c0597i, ArrayList arrayList, C0587S c0587s) {
        this.f377d = c0597i;
        this.f375b = arrayList;
        this.f376c = c0587s;
    }

    public RunnableC0141n(View view, C0234j0 c0234j0, C0057j c0057j, ValueAnimator valueAnimator) {
        this.f375b = view;
        this.f376c = c0057j;
        this.f377d = valueAnimator;
    }
}
