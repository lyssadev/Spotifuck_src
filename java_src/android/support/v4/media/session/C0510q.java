package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import p058d0.C0730r;
import p058d0.C0731s;

/* renamed from: android.support.v4.media.session.q */
/* loaded from: classes.dex */
public class C0510q extends C0509p {
    @Override // android.support.v4.media.session.C0508o
    /* renamed from: c */
    public final C0730r mo1219c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.f1232a.getCurrentControllerInfo();
        C0730r c0730r = new C0730r();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        c0730r.f2721a = new C0731s(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return c0730r;
    }

    @Override // android.support.v4.media.session.C0508o
    /* renamed from: f */
    public final void mo1222f(C0730r c0730r) {
    }
}
