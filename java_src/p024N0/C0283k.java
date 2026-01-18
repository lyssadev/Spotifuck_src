package p024N0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import p000A.C0001b;
import p023N.AbstractC0206Q;
import p023N.C0221d;
import p023N.InterfaceC0219c;
import p033S.InterfaceC0380g;
import p087o.C1190u;

/* renamed from: N0.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C0283k {

    /* renamed from: a */
    public final /* synthetic */ Object f699a;

    public /* synthetic */ C0283k(Object obj) {
        this.f699a = obj;
    }

    /* renamed from: a */
    public boolean m821a(C0001b c0001b, int i, Bundle bundle) {
        InterfaceC0219c c0001b2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((InterfaceC0380g) c0001b.f2g).mo974b();
                Parcelable parcelable = (Parcelable) ((InterfaceC0380g) c0001b.f2g).mo976d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipDescription clipDescriptionMo973a = ((InterfaceC0380g) c0001b.f2g).mo973a();
        InterfaceC0380g interfaceC0380g = (InterfaceC0380g) c0001b.f2g;
        ClipData clipData = new ClipData(clipDescriptionMo973a, new ClipData.Item(interfaceC0380g.mo977e()));
        if (i2 >= 31) {
            c0001b2 = new C0001b(clipData, 2);
        } else {
            C0221d c0221d = new C0221d();
            c0221d.f583g = clipData;
            c0221d.f584h = 2;
            c0001b2 = c0221d;
        }
        c0001b2.mo39d(interfaceC0380g.mo975c());
        c0001b2.mo37b(bundle);
        return AbstractC0206Q.m677l((C1190u) this.f699a, c0001b2.mo45j()) == null;
    }
}
