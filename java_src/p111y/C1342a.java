package p111y;

import p105v.C1305a;
import p105v.C1308d;

/* renamed from: y.a */
/* loaded from: classes.dex */
public final class C1342a extends AbstractC1344c {

    /* renamed from: m */
    public int f5442m;

    /* renamed from: n */
    public int f5443n;

    /* renamed from: o */
    public C1305a f5444o;

    public boolean getAllowsGoneWidget() {
        return this.f5444o.f5162t0;
    }

    public int getMargin() {
        return this.f5444o.f5163u0;
    }

    public int getType() {
        return this.f5442m;
    }

    @Override // p111y.AbstractC1344c
    /* renamed from: h */
    public final void mo1368h(C1308d c1308d, boolean z2) {
        int i = this.f5442m;
        this.f5443n = i;
        if (z2) {
            if (i == 5) {
                this.f5443n = 1;
            } else if (i == 6) {
                this.f5443n = 0;
            }
        } else if (i == 5) {
            this.f5443n = 0;
        } else if (i == 6) {
            this.f5443n = 1;
        }
        if (c1308d instanceof C1305a) {
            ((C1305a) c1308d).f5161s0 = this.f5443n;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f5444o.f5162t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f5444o.f5163u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f5444o.f5163u0 = i;
    }

    public void setType(int i) {
        this.f5442m = i;
    }
}
