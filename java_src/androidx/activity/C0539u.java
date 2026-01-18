package androidx.activity;

import java.util.ListIterator;
import p032R0.C0366h;
import p034S0.C0383c;
import p036T0.C0405a;
import p045Y0.InterfaceC0449l;
import p047Z0.AbstractC0469c;
import p047Z0.AbstractC0470d;

/* renamed from: androidx.activity.u */
/* loaded from: classes.dex */
public final class C0539u extends AbstractC0470d implements InterfaceC0449l {

    /* renamed from: a */
    public final /* synthetic */ int f1318a;

    /* renamed from: b */
    public final /* synthetic */ C0517A f1319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0539u(C0517A c0517a, int i) {
        super(1);
        this.f1318a = i;
        this.f1319b = c0517a;
    }

    /* renamed from: b */
    public final Object m1310b(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f1318a) {
            case 0:
                AbstractC0469c.m1102e("backEvent", (C0520b) obj);
                C0517A c0517a = this.f1319b;
                C0405a c0405a = c0517a.f1249b;
                ListIterator listIterator = c0405a.listIterator(c0405a.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((C0366h) objPrevious).f946a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                C0366h c0366h = (C0366h) objPrevious;
                if (c0517a.f1250c != null) {
                    c0517a.m1279b();
                }
                c0517a.f1250c = c0366h;
                break;
            default:
                AbstractC0469c.m1102e("backEvent", (C0520b) obj);
                C0517A c0517a2 = this.f1319b;
                if (c0517a2.f1250c == null) {
                    C0405a c0405a2 = c0517a2.f1249b;
                    ListIterator listIterator2 = c0405a2.listIterator(c0405a2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((C0366h) objPrevious2).f946a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                }
                break;
        }
        return C0383c.f975c;
    }
}
