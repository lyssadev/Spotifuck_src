package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import p018K0.C0146e;
import p068h.RunnableC0843n;
import p080l0.InterfaceC0969b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0969b {
    @Override // p080l0.InterfaceC0969b
    /* renamed from: a */
    public final List mo1415a() {
        return Collections.emptyList();
    }

    @Override // p080l0.InterfaceC0969b
    /* renamed from: b */
    public final Object mo1416b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C0146e(22);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: h0.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                this.f3347a.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0843n(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new C0146e(22);
    }
}
