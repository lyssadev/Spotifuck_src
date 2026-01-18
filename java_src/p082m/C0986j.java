package p082m;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p023N.C0214Z;
import p091p0.AbstractC1230a;

/* renamed from: m.j */
/* loaded from: classes.dex */
public final class C0986j {

    /* renamed from: c */
    public Interpolator f4030c;

    /* renamed from: d */
    public AbstractC1230a f4031d;

    /* renamed from: e */
    public boolean f4032e;

    /* renamed from: b */
    public long f4029b = -1;

    /* renamed from: f */
    public final C0985i f4033f = new C0985i(this);

    /* renamed from: a */
    public final ArrayList f4028a = new ArrayList();

    /* renamed from: a */
    public final void m2479a() {
        if (this.f4032e) {
            Iterator it2 = this.f4028a.iterator();
            while (it2.hasNext()) {
                ((C0214Z) it2.next()).m700b();
            }
            this.f4032e = false;
        }
    }

    /* renamed from: b */
    public final void m2480b() {
        View view;
        if (this.f4032e) {
            return;
        }
        Iterator it2 = this.f4028a.iterator();
        while (it2.hasNext()) {
            C0214Z c0214z = (C0214Z) it2.next();
            long j2 = this.f4029b;
            if (j2 >= 0) {
                c0214z.m701c(j2);
            }
            Interpolator interpolator = this.f4030c;
            if (interpolator != null && (view = (View) c0214z.f572a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f4031d != null) {
                c0214z.m702d(this.f4033f);
            }
            View view2 = (View) c0214z.f572a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f4032e = true;
    }
}
