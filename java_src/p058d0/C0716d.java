package p058d0;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.C0513t;
import android.support.v4.media.session.InterfaceC0497d;
import android.support.v4.media.session.MediaSessionCompat$Token;
import java.util.ArrayList;
import p000A.C0001b;
import p000A.C0010k;

/* renamed from: d0.d */
/* loaded from: classes.dex */
public class C0716d extends MediaBrowserService {

    /* renamed from: f */
    public final /* synthetic */ C0010k f2676f;

    public C0716d(C0010k c0010k, Context context) {
        this.f2676f = c0010k;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        int i2;
        C0513t.m1226j(bundle);
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        C0010k c0010k = this.f2676f;
        AbstractServiceC0729q abstractServiceC0729q = (AbstractServiceC0729q) c0010k.f26i;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
            i2 = -1;
        } else {
            bundle3.remove("extra_client_version");
            c0010k.f24g = new Messenger(abstractServiceC0729q.f2719k);
            bundle2 = new Bundle();
            bundle2.putInt("extra_service_version", 2);
            bundle2.putBinder("extra_messenger", ((Messenger) c0010k.f24g).getBinder());
            MediaSessionCompat$Token mediaSessionCompat$Token = abstractServiceC0729q.f2720l;
            if (mediaSessionCompat$Token != null) {
                InterfaceC0497d interfaceC0497dM1164a = mediaSessionCompat$Token.m1164a();
                bundle2.putBinder("extra_session_binder", interfaceC0497dM1164a == null ? null : interfaceC0497dM1164a.asBinder());
            } else {
                ((ArrayList) c0010k.f25h).add(bundle2);
            }
            int i3 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i2 = i3;
        }
        C0715c c0715c = new C0715c((AbstractServiceC0729q) c0010k.f26i, str, i2, i, null);
        abstractServiceC0729q.getClass();
        if (((Messenger) c0010k.f24g) != null) {
            abstractServiceC0729q.f2717i.add(c0715c);
        }
        return new MediaBrowserService.BrowserRoot("sfroot", bundle2 != null ? bundle2 : null);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        C0001b c0001b = new C0001b(23, result);
        C0010k c0010k = this.f2676f;
        c0010k.getClass();
        C0714b c0714b = new C0714b(str, c0001b, 2);
        AbstractServiceC0729q abstractServiceC0729q = (AbstractServiceC0729q) c0010k.f26i;
        C0715c c0715c = abstractServiceC0729q.f2716h;
        abstractServiceC0729q.mo1958b(str, c0714b);
    }
}
