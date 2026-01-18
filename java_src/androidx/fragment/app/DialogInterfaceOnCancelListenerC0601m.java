package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.DialogC0533o;
import androidx.lifecycle.AbstractC0655w;
import androidx.lifecycle.C0656x;
import it.deviato.spotifuck.R;
import p000A.C0001b;
import p024N0.RunnableC0268B;
import p030Q0.AbstractC0328E;
import p047Z0.AbstractC0469c;
import p068h.AbstractActivityC0841l;

/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0601m extends AbstractComponentCallbacksC0606r implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: Z */
    public final DialogInterfaceOnCancelListenerC0598j f1866Z;

    /* renamed from: a0 */
    public final DialogInterfaceOnDismissListenerC0599k f1867a0;

    /* renamed from: b0 */
    public int f1868b0;

    /* renamed from: c0 */
    public int f1869c0;

    /* renamed from: d0 */
    public boolean f1870d0;

    /* renamed from: e0 */
    public boolean f1871e0;

    /* renamed from: f0 */
    public int f1872f0;

    /* renamed from: g0 */
    public boolean f1873g0;

    /* renamed from: h0 */
    public final C0001b f1874h0;

    /* renamed from: i0 */
    public Dialog f1875i0;

    /* renamed from: j0 */
    public boolean f1876j0;

    /* renamed from: k0 */
    public boolean f1877k0;

    /* renamed from: l0 */
    public boolean f1878l0;

    /* renamed from: m0 */
    public boolean f1879m0;

    public DialogInterfaceOnCancelListenerC0601m() {
        new RunnableC0268B(5, this);
        this.f1866Z = new DialogInterfaceOnCancelListenerC0598j(this);
        this.f1867a0 = new DialogInterfaceOnDismissListenerC0599k(this);
        this.f1868b0 = 0;
        this.f1869c0 = 0;
        this.f1870d0 = true;
        this.f1871e0 = true;
        this.f1872f0 = -1;
        this.f1874h0 = new C0001b(17, this);
        this.f1879m0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: A */
    public void mo1565A() {
        this.f1901H = true;
        Dialog dialog = this.f1875i0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: C */
    public final void mo1566C(Bundle bundle) {
        Bundle bundle2;
        this.f1901H = true;
        if (this.f1875i0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1875i0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: D */
    public final void mo1567D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1567D(layoutInflater, viewGroup, bundle);
        if (this.f1903J != null || this.f1875i0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1875i0.onRestoreInstanceState(bundle2);
    }

    /* renamed from: K */
    public Dialog mo1568K() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        return new DialogC0533o(m1581F(), this.f1869c0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: e */
    public final AbstractC0610v mo1569e() {
        return new C0600l(this, new C0603o(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1876j0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        if (this.f1877k0) {
            return;
        }
        this.f1877k0 = true;
        this.f1878l0 = false;
        Dialog dialog = this.f1875i0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1875i0.dismiss();
        }
        this.f1876j0 = true;
        if (this.f1872f0 >= 0) {
            C0577H c0577hM1590j = m1590j();
            int i = this.f1872f0;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC0328E.m935e("Bad id: ", i));
            }
            c0577hM1590j.m1511v(new C0576G(c0577hM1590j, i), true);
            this.f1872f0 = -1;
            return;
        }
        C0589a c0589a = new C0589a(m1590j());
        c0589a.f1823p = true;
        C0577H c0577h = this.f1935w;
        if (c0577h == null || c0577h == c0589a.f1824q) {
            c0589a.m1543b(new C0583N(3, this));
            c0589a.m1545d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: r */
    public final void mo1570r() {
        this.f1901H = true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: s */
    public final void mo1571s(AbstractActivityC0841l abstractActivityC0841l) {
        super.mo1571s(abstractActivityC0841l);
        this.f1914U.m1630d(this.f1874h0);
        if (this.f1878l0) {
            return;
        }
        this.f1877k0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: t */
    public void mo1572t(Bundle bundle) {
        super.mo1572t(bundle);
        new Handler();
        this.f1871e0 = this.f1895B == 0;
        if (bundle != null) {
            this.f1868b0 = bundle.getInt("android:style", 0);
            this.f1869c0 = bundle.getInt("android:theme", 0);
            this.f1870d0 = bundle.getBoolean("android:cancelable", true);
            this.f1871e0 = bundle.getBoolean("android:showsDialog", this.f1871e0);
            this.f1872f0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: v */
    public final void mo1573v() {
        this.f1901H = true;
        Dialog dialog = this.f1875i0;
        if (dialog != null) {
            this.f1876j0 = true;
            dialog.setOnDismissListener(null);
            this.f1875i0.dismiss();
            if (!this.f1877k0) {
                onDismiss(this.f1875i0);
            }
            this.f1875i0 = null;
            this.f1879m0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: w */
    public final void mo1574w() {
        this.f1901H = true;
        if (!this.f1878l0 && !this.f1877k0) {
            this.f1877k0 = true;
        }
        C0001b c0001b = this.f1874h0;
        C0656x c0656x = this.f1914U;
        c0656x.getClass();
        C0656x.m1627a("removeObserver");
        AbstractC0655w abstractC0655w = (AbstractC0655w) c0656x.f2026b.mo2933b(c0001b);
        if (abstractC0655w == null) {
            return;
        }
        abstractC0655w.mo1605d();
        abstractC0655w.m1626c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0046, B:29:0x0050, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0068), top: B:45:0x001a }] */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater mo1575x(Bundle bundle) {
        Context contextM1588h;
        LayoutInflater layoutInflaterMo1575x = super.mo1575x(bundle);
        boolean z2 = this.f1871e0;
        if (!z2 || this.f1873g0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            return layoutInflaterMo1575x;
        }
        if (z2 && !this.f1879m0) {
            try {
                this.f1873g0 = true;
                Dialog dialogMo1568K = mo1568K();
                this.f1875i0 = dialogMo1568K;
                if (this.f1871e0) {
                    int i = this.f1868b0;
                    if (i == 1 || i == 2) {
                        dialogMo1568K.requestWindowFeature(1);
                        contextM1588h = m1588h();
                        if (contextM1588h instanceof Activity) {
                            this.f1875i0.setOwnerActivity((Activity) contextM1588h);
                        }
                        this.f1875i0.setCancelable(this.f1870d0);
                        this.f1875i0.setOnCancelListener(this.f1866Z);
                        this.f1875i0.setOnDismissListener(this.f1867a0);
                        this.f1879m0 = true;
                    } else if (i == 3) {
                        Window window = dialogMo1568K.getWindow();
                        if (window != null) {
                            window.addFlags(24);
                        }
                        dialogMo1568K.requestWindowFeature(1);
                        contextM1588h = m1588h();
                        if (contextM1588h instanceof Activity) {
                        }
                        this.f1875i0.setCancelable(this.f1870d0);
                        this.f1875i0.setOnCancelListener(this.f1866Z);
                        this.f1875i0.setOnDismissListener(this.f1867a0);
                        this.f1879m0 = true;
                    } else {
                        contextM1588h = m1588h();
                        if (contextM1588h instanceof Activity) {
                        }
                        this.f1875i0.setCancelable(this.f1870d0);
                        this.f1875i0.setOnCancelListener(this.f1866Z);
                        this.f1875i0.setOnDismissListener(this.f1867a0);
                        this.f1879m0 = true;
                    }
                } else {
                    this.f1875i0 = null;
                }
                this.f1873g0 = false;
            } catch (Throwable th) {
                this.f1873g0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        Dialog dialog = this.f1875i0;
        return dialog != null ? layoutInflaterMo1575x.cloneInContext(dialog.getContext()) : layoutInflaterMo1575x;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: y */
    public void mo1576y(Bundle bundle) {
        Dialog dialog = this.f1875i0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f1868b0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1869c0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1870d0;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1871e0;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1872f0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0606r
    /* renamed from: z */
    public void mo1577z() {
        this.f1901H = true;
        Dialog dialog = this.f1875i0;
        if (dialog != null) {
            this.f1876j0 = false;
            dialog.show();
            View decorView = this.f1875i0.getWindow().getDecorView();
            AbstractC0469c.m1102e("<this>", decorView);
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }
}
