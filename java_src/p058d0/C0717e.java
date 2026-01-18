package p058d0;

import android.content.Context;
import android.service.media.MediaBrowserService;
import p000A.C0001b;

/* renamed from: d0.e */
/* loaded from: classes.dex */
public class C0717e extends C0716d {

    /* renamed from: g */
    public final /* synthetic */ C0718f f2677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0717e(C0718f c0718f, Context context) {
        super(c0718f, context);
        this.f2677g = c0718f;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        C0001b c0001b = new C0001b(23, result);
        C0715c c0715c = this.f2677g.f2678j.f2716h;
        c0001b.m34D(null);
    }
}
