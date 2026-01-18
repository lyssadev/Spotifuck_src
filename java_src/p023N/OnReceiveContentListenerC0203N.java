package p023N;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
import p000A.C0001b;
import p013H0.AbstractC0110e;
import p035T.C0402s;

/* renamed from: N.N */
/* loaded from: classes.dex */
public final class OnReceiveContentListenerC0203N implements OnReceiveContentListener {

    /* renamed from: a */
    public final InterfaceC0251s f555a;

    public OnReceiveContentListenerC0203N(InterfaceC0251s interfaceC0251s) {
        this.f555a = interfaceC0251s;
    }

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0225f c0225f = new C0225f(new C0001b(contentInfo));
        C0225f c0225fM1017a = ((C0402s) this.f555a).m1017a(view, c0225f);
        if (c0225fM1017a == null) {
            return null;
        }
        if (c0225fM1017a == c0225f) {
            return contentInfo;
        }
        ContentInfo contentInfoMo49n = c0225fM1017a.f593a.mo49n();
        Objects.requireNonNull(contentInfoMo49n);
        return AbstractC0110e.m402h(contentInfoMo49n);
    }
}
