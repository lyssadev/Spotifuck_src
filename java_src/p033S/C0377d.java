package p033S;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p000A.C0001b;
import p024N0.C0283k;

/* renamed from: S.d */
/* loaded from: classes.dex */
public final class C0377d extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C0283k f966a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0377d(InputConnection inputConnection, C0283k c0283k) {
        super(inputConnection, false);
        this.f966a = c0283k;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C0001b c0001b = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c0001b = new C0001b(10, new C0379f(inputContentInfo));
        }
        if (this.f966a.m821a(c0001b, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
