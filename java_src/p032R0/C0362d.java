package p032R0;

import android.os.Handler;
import android.os.Looper;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import p003C.RunnableC0014a;

/* renamed from: R0.d */
/* loaded from: classes.dex */
public final class C0362d extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0014a(6, permissionRequest));
    }
}
