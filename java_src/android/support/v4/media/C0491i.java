package android.support.v4.media;

import android.os.Bundle;
import p030Q0.AbstractC0328E;
import p096r.C1247b;

/* renamed from: android.support.v4.media.i */
/* loaded from: classes.dex */
public final class C0491i {

    /* renamed from: a */
    public final Bundle f1189a;

    public C0491i() {
        this.f1189a = new Bundle();
    }

    /* renamed from: a */
    public void m1152a(String str, String str2) {
        C1247b c1247b = MediaMetadataCompat.f1170c;
        if (c1247b.containsKey(str) && ((Integer) c1247b.getOrDefault(str, null)).intValue() != 1) {
            throw new IllegalArgumentException(AbstractC0328E.m937g("The ", str, " key cannot be used to put a String"));
        }
        this.f1189a.putCharSequence(str, str2);
    }

    public C0491i(Bundle bundle) {
        this.f1189a = bundle;
    }
}
