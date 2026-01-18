package p074j0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p023N.AbstractC0206Q;

/* renamed from: j0.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC0912a0 {

    /* renamed from: s */
    public static final List f3653s = Collections.emptyList();

    /* renamed from: a */
    public final View f3654a;

    /* renamed from: b */
    public WeakReference f3655b;

    /* renamed from: j */
    public int f3663j;

    /* renamed from: r */
    public RecyclerView f3671r;

    /* renamed from: c */
    public int f3656c = -1;

    /* renamed from: d */
    public int f3657d = -1;

    /* renamed from: e */
    public long f3658e = -1;

    /* renamed from: f */
    public int f3659f = -1;

    /* renamed from: g */
    public int f3660g = -1;

    /* renamed from: h */
    public AbstractC0912a0 f3661h = null;

    /* renamed from: i */
    public AbstractC0912a0 f3662i = null;

    /* renamed from: k */
    public ArrayList f3664k = null;

    /* renamed from: l */
    public List f3665l = null;

    /* renamed from: m */
    public int f3666m = 0;

    /* renamed from: n */
    public C0902Q f3667n = null;

    /* renamed from: o */
    public boolean f3668o = false;

    /* renamed from: p */
    public int f3669p = 0;

    /* renamed from: q */
    public int f3670q = -1;

    public AbstractC0912a0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f3654a = view;
    }

    /* renamed from: a */
    public final void m2316a(int i) {
        this.f3663j = i | this.f3663j;
    }

    /* renamed from: b */
    public final int m2317b() {
        int i = this.f3660g;
        return i == -1 ? this.f3656c : i;
    }

    /* renamed from: c */
    public final List m2318c() {
        ArrayList arrayList;
        return ((this.f3663j & 1024) != 0 || (arrayList = this.f3664k) == null || arrayList.size() == 0) ? f3653s : this.f3665l;
    }

    /* renamed from: d */
    public final boolean m2319d(int i) {
        return (i & this.f3663j) != 0;
    }

    /* renamed from: e */
    public final boolean m2320e() {
        View view = this.f3654a;
        return (view.getParent() == null || view.getParent() == this.f3671r) ? false : true;
    }

    /* renamed from: f */
    public final boolean m2321f() {
        return (this.f3663j & 1) != 0;
    }

    /* renamed from: g */
    public final boolean m2322g() {
        return (this.f3663j & 4) != 0;
    }

    /* renamed from: h */
    public final boolean m2323h() {
        if ((this.f3663j & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            if (!this.f3654a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m2324i() {
        return (this.f3663j & 8) != 0;
    }

    /* renamed from: j */
    public final boolean m2325j() {
        return this.f3667n != null;
    }

    /* renamed from: k */
    public final boolean m2326k() {
        return (this.f3663j & 256) != 0;
    }

    /* renamed from: l */
    public final boolean m2327l() {
        return (this.f3663j & 2) != 0;
    }

    /* renamed from: m */
    public final void m2328m(int i, boolean z2) {
        if (this.f3657d == -1) {
            this.f3657d = this.f3656c;
        }
        if (this.f3660g == -1) {
            this.f3660g = this.f3656c;
        }
        if (z2) {
            this.f3660g += i;
        }
        this.f3656c += i;
        View view = this.f3654a;
        if (view.getLayoutParams() != null) {
            ((C0897L) view.getLayoutParams()).f3603c = true;
        }
    }

    /* renamed from: n */
    public final void m2329n() {
        this.f3663j = 0;
        this.f3656c = -1;
        this.f3657d = -1;
        this.f3658e = -1L;
        this.f3660g = -1;
        this.f3666m = 0;
        this.f3661h = null;
        this.f3662i = null;
        ArrayList arrayList = this.f3664k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f3663j &= -1025;
        this.f3669p = 0;
        this.f3670q = -1;
        RecyclerView.m1756j(this);
    }

    /* renamed from: o */
    public final void m2330o(boolean z2) {
        int i = this.f3666m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f3666m = i2;
        if (i2 < 0) {
            this.f3666m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i2 == 1) {
            this.f3663j |= 16;
        } else if (z2 && i2 == 0) {
            this.f3663j &= -17;
        }
    }

    /* renamed from: p */
    public final boolean m2331p() {
        return (this.f3663j & 128) != 0;
    }

    /* renamed from: q */
    public final boolean m2332q() {
        return (this.f3663j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3656c + " id=" + this.f3658e + ", oldPos=" + this.f3657d + ", pLpos:" + this.f3660g);
        if (m2325j()) {
            sb.append(" scrap ");
            sb.append(this.f3668o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m2322g()) {
            sb.append(" invalid");
        }
        if (!m2321f()) {
            sb.append(" unbound");
        }
        if ((this.f3663j & 2) != 0) {
            sb.append(" update");
        }
        if (m2324i()) {
            sb.append(" removed");
        }
        if (m2331p()) {
            sb.append(" ignored");
        }
        if (m2326k()) {
            sb.append(" tmpDetached");
        }
        if (!m2323h()) {
            sb.append(" not recyclable(" + this.f3666m + ")");
        }
        if ((this.f3663j & 512) != 0 || m2322g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f3654a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
