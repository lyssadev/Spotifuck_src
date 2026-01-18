package p074j0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: j0.e0 */
/* loaded from: classes.dex */
public final class C0920e0 {

    /* renamed from: a */
    public int f3694a;

    /* renamed from: b */
    public int f3695b;

    /* renamed from: c */
    public boolean f3696c;

    /* renamed from: d */
    public boolean f3697d;

    /* renamed from: e */
    public boolean f3698e;

    /* renamed from: f */
    public int[] f3699f;

    /* renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f3700g;

    public C0920e0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3700g = staggeredGridLayoutManager;
        m2362a();
    }

    /* renamed from: a */
    public final void m2362a() {
        this.f3694a = -1;
        this.f3695b = Integer.MIN_VALUE;
        this.f3696c = false;
        this.f3697d = false;
        this.f3698e = false;
        int[] iArr = this.f3699f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
