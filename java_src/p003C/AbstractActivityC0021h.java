package p003C;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0623I;
import androidx.lifecycle.C0652t;
import androidx.lifecycle.FragmentC0620F;
import androidx.lifecycle.InterfaceC0650r;
import p023N.InterfaceC0235k;
import p047Z0.AbstractC0469c;
import p091p0.AbstractC1230a;

/* renamed from: C.h */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0021h extends Activity implements InterfaceC0650r, InterfaceC0235k {

    /* renamed from: f */
    public final C0652t f57f = new C0652t(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0469c.m1102e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        AbstractC0469c.m1101d("window.decorView", decorView);
        if (AbstractC1230a.m2858B(decorView, keyEvent)) {
            return true;
        }
        return AbstractC1230a.m2860C(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC0469c.m1102e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        AbstractC0469c.m1101d("window.decorView", decorView);
        if (AbstractC1230a.m2858B(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // p023N.InterfaceC0235k
    /* renamed from: e */
    public final boolean mo110e(KeyEvent keyEvent) {
        AbstractC0469c.m1102e("event", keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC0620F.f1970g;
        AbstractC0623I.m1604c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC0469c.m1102e("outState", bundle);
        this.f57f.m1621g();
        super.onSaveInstanceState(bundle);
    }
}
