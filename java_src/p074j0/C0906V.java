package p074j0;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.V */
/* loaded from: classes.dex */
public final class C0906V {

    /* renamed from: a */
    public int f3621a;

    /* renamed from: b */
    public int f3622b;

    /* renamed from: c */
    public int f3623c;

    /* renamed from: d */
    public int f3624d;

    /* renamed from: e */
    public Interpolator f3625e;

    /* renamed from: f */
    public boolean f3626f;

    /* renamed from: g */
    public int f3627g;

    /* renamed from: a */
    public final void m2311a(RecyclerView recyclerView) {
        int i = this.f3624d;
        if (i >= 0) {
            this.f3624d = -1;
            recyclerView.m1767M(i);
            this.f3626f = false;
            return;
        }
        if (!this.f3626f) {
            this.f3627g = 0;
            return;
        }
        Interpolator interpolator = this.f3625e;
        if (interpolator != null && this.f3623c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f3623c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f2191g0.m2315b(this.f3621a, this.f3622b, i2, interpolator);
        int i3 = this.f3627g + 1;
        this.f3627g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f3626f = false;
    }
}
