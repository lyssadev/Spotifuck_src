package p023N;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
import p000A.C0001b;
import p013H0.AbstractC0110e;

/* renamed from: N.M */
/* loaded from: classes.dex */
public abstract class AbstractC0202M {
    /* renamed from: a */
    public static String[] m662a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* renamed from: b */
    public static C0225f m663b(View view, C0225f c0225f) {
        ContentInfo contentInfoMo49n = c0225f.f593a.mo49n();
        Objects.requireNonNull(contentInfoMo49n);
        ContentInfo contentInfoM402h = AbstractC0110e.m402h(contentInfoMo49n);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM402h);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM402h ? c0225f : new C0225f(new C0001b(contentInfoPerformReceiveContent));
    }

    /* renamed from: c */
    public static void m664c(View view, String[] strArr, InterfaceC0251s interfaceC0251s) {
        if (interfaceC0251s == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC0203N(interfaceC0251s));
        }
    }
}
