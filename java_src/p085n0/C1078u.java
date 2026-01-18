package p085n0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p030Q0.AbstractC0328E;

/* renamed from: n0.u */
/* loaded from: classes.dex */
public final class C1078u {

    /* renamed from: b */
    public final View f4429b;

    /* renamed from: a */
    public final HashMap f4428a = new HashMap();

    /* renamed from: c */
    public final ArrayList f4430c = new ArrayList();

    public C1078u(View view) {
        this.f4429b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1078u)) {
            return false;
        }
        C1078u c1078u = (C1078u) obj;
        return this.f4429b == c1078u.f4429b && this.f4428a.equals(c1078u.f4428a);
    }

    public final int hashCode() {
        return this.f4428a.hashCode() + (this.f4429b.hashCode() * 31);
    }

    public final String toString() {
        String strM936f = AbstractC0328E.m936f(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4429b + "\n", "    values:");
        HashMap map = this.f4428a;
        for (String str : map.keySet()) {
            strM936f = strM936f + "    " + str + ": " + map.get(str) + "\n";
        }
        return strM936f;
    }
}
