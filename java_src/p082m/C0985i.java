package p082m;

import p087o.C1153f1;
import p091p0.AbstractC1230a;

/* renamed from: m.i */
/* loaded from: classes.dex */
public final class C0985i extends AbstractC1230a {

    /* renamed from: o */
    public final /* synthetic */ int f4024o;

    /* renamed from: p */
    public boolean f4025p;

    /* renamed from: q */
    public int f4026q;

    /* renamed from: r */
    public final /* synthetic */ Object f4027r;

    public C0985i(C0986j c0986j) {
        this.f4024o = 0;
        this.f4027r = c0986j;
        this.f4025p = false;
        this.f4026q = 0;
    }

    @Override // p023N.InterfaceC0216a0
    /* renamed from: a */
    public final void mo704a() {
        switch (this.f4024o) {
            case 0:
                int i = this.f4026q + 1;
                this.f4026q = i;
                C0986j c0986j = (C0986j) this.f4027r;
                if (i == c0986j.f4028a.size()) {
                    AbstractC1230a abstractC1230a = c0986j.f4031d;
                    if (abstractC1230a != null) {
                        abstractC1230a.mo704a();
                    }
                    this.f4026q = 0;
                    this.f4025p = false;
                    c0986j.f4032e = false;
                    break;
                }
                break;
            default:
                if (!this.f4025p) {
                    ((C1153f1) this.f4027r).f4605a.setVisibility(this.f4026q);
                    break;
                }
                break;
        }
    }

    @Override // p091p0.AbstractC1230a, p023N.InterfaceC0216a0
    /* renamed from: b */
    public void mo705b() {
        switch (this.f4024o) {
            case 1:
                this.f4025p = true;
                break;
        }
    }

    @Override // p091p0.AbstractC1230a, p023N.InterfaceC0216a0
    /* renamed from: c */
    public final void mo706c() {
        switch (this.f4024o) {
            case 0:
                if (!this.f4025p) {
                    this.f4025p = true;
                    AbstractC1230a abstractC1230a = ((C0986j) this.f4027r).f4031d;
                    if (abstractC1230a != null) {
                        abstractC1230a.mo706c();
                        break;
                    }
                }
                break;
            default:
                ((C1153f1) this.f4027r).f4605a.setVisibility(0);
                break;
        }
    }

    public C0985i(C1153f1 c1153f1, int i) {
        this.f4024o = 1;
        this.f4027r = c1153f1;
        this.f4026q = i;
        this.f4025p = false;
    }
}
