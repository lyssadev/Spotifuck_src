package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.EnumC0644l;
import androidx.lifecycle.InterfaceC0650r;
import it.deviato.spotifuck.R;
import p003C.RunnableC0014a;
import p047Z0.AbstractC0469c;
import p077k0.C0958c;
import p077k0.C0959d;
import p077k0.InterfaceC0960e;

/* renamed from: androidx.activity.o */
/* loaded from: classes.dex */
public class DialogC0533o extends Dialog implements InterfaceC0650r, InterfaceC0518B, InterfaceC0960e {

    /* renamed from: f */
    public C0652t f1307f;

    /* renamed from: g */
    public final C0959d f1308g;

    /* renamed from: h */
    public final C0517A f1309h;

    public DialogC0533o(Context context, int i) {
        super(context, i);
        this.f1308g = new C0959d(this);
        this.f1309h = new C0517A(new RunnableC0014a(9, this));
    }

    /* renamed from: a */
    public static void m1304a(DialogC0533o dialogC0533o) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0469c.m1102e("view", view);
        m1306e();
        super.addContentView(view, layoutParams);
    }

    @Override // p077k0.InterfaceC0960e
    /* renamed from: b */
    public final C0958c mo1297b() {
        return this.f1308g.f3919b;
    }

    /* renamed from: c */
    public final C0652t m1305c() {
        C0652t c0652t = this.f1307f;
        if (c0652t != null) {
            return c0652t;
        }
        C0652t c0652t2 = new C0652t(this);
        this.f1307f = c0652t2;
        return c0652t2;
    }

    @Override // androidx.lifecycle.InterfaceC0650r
    /* renamed from: d */
    public final C0652t mo1299d() {
        return m1305c();
    }

    /* renamed from: e */
    public final void m1306e() {
        Window window = getWindow();
        AbstractC0469c.m1099b(window);
        View decorView = window.getDecorView();
        AbstractC0469c.m1101d("window!!.decorView", decorView);
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        AbstractC0469c.m1099b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC0469c.m1101d("window!!.decorView", decorView2);
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        AbstractC0469c.m1099b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC0469c.m1101d("window!!.decorView", decorView3);
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1309h.m1280c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC0469c.m1101d("onBackInvokedDispatcher", onBackInvokedDispatcher);
            C0517A c0517a = this.f1309h;
            c0517a.f1252e = onBackInvokedDispatcher;
            c0517a.m1281d(c0517a.f1254g);
        }
        this.f1308g.m2446b(bundle);
        m1305c().m1618d(EnumC0644l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC0469c.m1101d("super.onSaveInstanceState()", bundleOnSaveInstanceState);
        this.f1308g.m2447c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m1305c().m1618d(EnumC0644l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m1305c().m1618d(EnumC0644l.ON_DESTROY);
        this.f1307f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m1306e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC0469c.m1102e("view", view);
        m1306e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC0469c.m1102e("view", view);
        m1306e();
        super.setContentView(view, layoutParams);
    }
}
