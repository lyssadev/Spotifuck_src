package p000A;

import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.session.MediaSession;
import android.view.WindowInsets;
import it.deviato.spotifuck.WebService;

/* renamed from: A.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0000a {
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ ColorStateListDrawable m7d(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    /* renamed from: f */
    public static /* synthetic */ MediaSession m9f(WebService webService, String str) {
        return new MediaSession(webService, str, null);
    }

    /* renamed from: g */
    public static /* synthetic */ WindowInsets.Builder m10g() {
        return new WindowInsets.Builder();
    }

    /* renamed from: h */
    public static /* synthetic */ WindowInsets.Builder m11h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m23t(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
