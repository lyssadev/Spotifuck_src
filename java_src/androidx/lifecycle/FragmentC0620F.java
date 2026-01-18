package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import p000A.C0001b;
import p047Z0.AbstractC0469c;

/* renamed from: androidx.lifecycle.F */
/* loaded from: classes.dex */
public final class FragmentC0620F extends Fragment {

    /* renamed from: g */
    public static final /* synthetic */ int f1970g = 0;

    /* renamed from: f */
    public C0001b f1971f;

    /* renamed from: a */
    public final void m1601a(EnumC0644l enumC0644l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC0469c.m1101d("activity", activity);
            AbstractC0623I.m1602a(activity, enumC0644l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1601a(EnumC0644l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m1601a(EnumC0644l.ON_DESTROY);
        this.f1971f = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m1601a(EnumC0644l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0001b c0001b = this.f1971f;
        if (c0001b != null) {
            ((C0617C) c0001b.f2g).m1600a();
        }
        m1601a(EnumC0644l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0001b c0001b = this.f1971f;
        if (c0001b != null) {
            C0617C c0617c = (C0617C) c0001b.f2g;
            int i = c0617c.f1959f + 1;
            c0617c.f1959f = i;
            if (i == 1 && c0617c.f1962i) {
                c0617c.f1964k.m1618d(EnumC0644l.ON_START);
                c0617c.f1962i = false;
            }
        }
        m1601a(EnumC0644l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1601a(EnumC0644l.ON_STOP);
    }
}
