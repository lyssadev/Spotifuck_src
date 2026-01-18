package androidx.activity;

import p034S0.C0383c;
import p045Y0.InterfaceC0438a;
import p047Z0.AbstractC0470d;

/* renamed from: androidx.activity.v */
/* loaded from: classes.dex */
public final class C0540v extends AbstractC0470d implements InterfaceC0438a {

    /* renamed from: a */
    public final /* synthetic */ int f1320a;

    /* renamed from: b */
    public final /* synthetic */ C0517A f1321b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0540v(C0517A c0517a, int i) {
        super(0);
        this.f1320a = i;
        this.f1321b = c0517a;
    }

    @Override // p045Y0.InterfaceC0438a
    /* renamed from: a */
    public final Object mo1093a() {
        switch (this.f1320a) {
            case 0:
                this.f1321b.m1280c();
                break;
            case 1:
                this.f1321b.m1279b();
                break;
            default:
                this.f1321b.m1280c();
                break;
        }
        return C0383c.f975c;
    }
}
