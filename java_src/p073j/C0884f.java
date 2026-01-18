package p073j;

import android.graphics.drawable.Drawable;
import p088o0.C1207f;

/* renamed from: j.f */
/* loaded from: classes.dex */
public final class C0884f implements Drawable.Callback {

    /* renamed from: f */
    public final /* synthetic */ int f3554f = 0;

    /* renamed from: g */
    public Object f3555g;

    public /* synthetic */ C0884f() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f3554f) {
            case 0:
                break;
            default:
                ((C1207f) this.f3555g).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        switch (this.f3554f) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f3555g;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j2);
                    break;
                }
                break;
            default:
                ((C1207f) this.f3555g).scheduleSelf(runnable, j2);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f3554f) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f3555g;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            default:
                ((C1207f) this.f3555g).unscheduleSelf(runnable);
                break;
        }
    }

    public C0884f(C1207f c1207f) {
        this.f3555g = c1207f;
    }

    /* renamed from: a */
    private final void m2241a(Drawable drawable) {
    }
}
