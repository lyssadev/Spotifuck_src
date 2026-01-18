package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;
import p007E.C0057j;
import p063f0.C0744b;
import p096r.C1247b;

/* renamed from: android.support.v4.media.c */
/* loaded from: classes.dex */
public class C0485c {

    /* renamed from: a */
    public final Context f1179a;

    /* renamed from: b */
    public final MediaBrowser f1180b;

    /* renamed from: c */
    public final Bundle f1181c;

    /* renamed from: d */
    public final HandlerC0483a f1182d = new HandlerC0483a(this);

    /* renamed from: e */
    public final C1247b f1183e = new C1247b();

    /* renamed from: f */
    public C0057j f1184f;

    /* renamed from: g */
    public Messenger f1185g;

    /* renamed from: h */
    public MediaSessionCompat$Token f1186h;

    public C0485c(Context context, ComponentName componentName, C0744b c0744b) {
        this.f1179a = context;
        Bundle bundle = new Bundle();
        this.f1181c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        c0744b.f2731b = this;
        this.f1180b = new MediaBrowser(context, componentName, (C0484b) c0744b.f2730a, bundle);
    }
}
