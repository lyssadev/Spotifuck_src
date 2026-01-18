package p033S;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* renamed from: S.f */
/* loaded from: classes.dex */
public final class C0379f implements InterfaceC0380g {

    /* renamed from: a */
    public final InputContentInfo f968a;

    public C0379f(Object obj) {
        this.f968a = (InputContentInfo) obj;
    }

    @Override // p033S.InterfaceC0380g
    /* renamed from: a */
    public final ClipDescription mo973a() {
        return this.f968a.getDescription();
    }

    @Override // p033S.InterfaceC0380g
    /* renamed from: b */
    public final void mo974b() {
        this.f968a.requestPermission();
    }

    @Override // p033S.InterfaceC0380g
    /* renamed from: c */
    public final Uri mo975c() {
        return this.f968a.getLinkUri();
    }

    @Override // p033S.InterfaceC0380g
    /* renamed from: d */
    public final Object mo976d() {
        return this.f968a;
    }

    @Override // p033S.InterfaceC0380g
    /* renamed from: e */
    public final Uri mo977e() {
        return this.f968a.getContentUri();
    }

    public C0379f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f968a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
