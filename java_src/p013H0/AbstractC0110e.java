package p013H0;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ClipData;
import android.view.ContentInfo;

/* renamed from: H0.e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0110e {
    /* renamed from: d */
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException m398d(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    /* renamed from: f */
    public static /* synthetic */ ContentInfo.Builder m400f(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ ContentInfo m402h(Object obj) {
        return (ContentInfo) obj;
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ boolean m408n(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
