package androidx.lifecycle;

import p000A.C0001b;

/* renamed from: androidx.lifecycle.w */
/* loaded from: classes.dex */
public abstract class AbstractC0655w {

    /* renamed from: a */
    public final C0001b f2020a;

    /* renamed from: b */
    public boolean f2021b;

    /* renamed from: c */
    public int f2022c = -1;

    /* renamed from: d */
    public final /* synthetic */ C0656x f2023d;

    public AbstractC0655w(C0656x c0656x, C0001b c0001b) {
        this.f2023d = c0656x;
        this.f2020a = c0001b;
    }

    /* renamed from: c */
    public final void m1626c(boolean z2) {
        if (z2 == this.f2021b) {
            return;
        }
        this.f2021b = z2;
        int i = z2 ? 1 : -1;
        C0656x c0656x = this.f2023d;
        int i2 = c0656x.f2027c;
        c0656x.f2027c = i + i2;
        if (!c0656x.f2028d) {
            c0656x.f2028d = true;
            while (true) {
                try {
                    int i3 = c0656x.f2027c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    c0656x.f2028d = false;
                }
            }
        }
        if (this.f2021b) {
            c0656x.m1629c(this);
        }
    }

    /* renamed from: d */
    public void mo1605d() {
    }

    /* renamed from: e */
    public abstract boolean mo1606e();
}
