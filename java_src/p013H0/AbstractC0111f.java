package p013H0;

import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* renamed from: H0.f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0111f {
    /* renamed from: j */
    public static /* synthetic */ PrecomputedText.Params.Builder m422j(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    /* renamed from: v */
    public static /* synthetic */ void m434v(String str, int i, int i2) {
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ boolean m435w(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
