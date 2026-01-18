package androidx.emoji2.text;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p018K0.C0146e;

/* renamed from: androidx.emoji2.text.c */
/* loaded from: classes.dex */
public final class C0548c extends C0146e {
    @Override // p018K0.C0146e
    /* renamed from: d */
    public final Signature[] mo498d(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
