package p058d0;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.C0513t;
import p000A.C0001b;

/* renamed from: d0.h */
/* loaded from: classes.dex */
public final class C0720h extends C0717e {

    /* renamed from: h */
    public final /* synthetic */ C0721i f2682h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0720h(C0721i c0721i, Context context) {
        super(c0721i, context);
        this.f2682h = c0721i;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        C0513t.m1226j(bundle);
        C0721i c0721i = this.f2682h;
        AbstractServiceC0729q abstractServiceC0729q = c0721i.f2683k;
        C0715c c0715c = abstractServiceC0729q.f2716h;
        C0719g c0719g = new C0719g(c0721i, str, new C0001b(23, result), bundle);
        c0719g.f2687d = 1;
        abstractServiceC0729q.mo1958b(str, c0719g);
        c0721i.f2683k.getClass();
    }
}
