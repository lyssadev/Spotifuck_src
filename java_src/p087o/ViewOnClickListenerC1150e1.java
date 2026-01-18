package p087o;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p084n.C1024a;

/* renamed from: o.e1 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1150e1 implements View.OnClickListener {

    /* renamed from: f */
    public final C1024a f4603f;

    /* renamed from: g */
    public final /* synthetic */ C1153f1 f4604g;

    public ViewOnClickListenerC1150e1(C1153f1 c1153f1) {
        this.f4604g = c1153f1;
        Context context = c1153f1.f4605a.getContext();
        CharSequence charSequence = c1153f1.f4612h;
        C1024a c1024a = new C1024a();
        c1024a.f4199e = 4096;
        c1024a.f4201g = 4096;
        c1024a.f4206l = null;
        c1024a.f4207m = null;
        c1024a.f4208n = false;
        c1024a.f4209o = false;
        c1024a.f4210p = 16;
        c1024a.f4203i = context;
        c1024a.f4195a = charSequence;
        this.f4603f = c1024a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1153f1 c1153f1 = this.f4604g;
        Window.Callback callback = c1153f1.f4615k;
        if (callback == null || !c1153f1.f4616l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f4603f);
    }
}
