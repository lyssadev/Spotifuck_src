package p032R0;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import it.deviato.spotifuck.AppSingleton;

/* renamed from: R0.c */
/* loaded from: classes.dex */
public final class C0361c extends WebView {
    /* renamed from: a */
    public static /* synthetic */ void m956a(C0361c c0361c, int i, String str) {
        c0361c.getClass();
        if ("true".equals(str)) {
            super.onWindowVisibilityChanged(0);
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        if (i == 8 || i == 4) {
            AppSingleton.f3426j.evaluateJavascript("typeof playing!=='undefined'&&playing&&!!document.querySelector('.VideoPlayer__container video');", new ValueCallback() { // from class: R0.b
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    C0361c.m956a(this.f942a, i, (String) obj);
                }
            });
        } else {
            super.onWindowVisibilityChanged(i);
        }
    }
}
