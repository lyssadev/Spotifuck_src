package p023N;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p097r0.AbstractC1258a;

/* renamed from: N.d */
/* loaded from: classes.dex */
public final class C0221d implements InterfaceC0219c, InterfaceC0223e {

    /* renamed from: f */
    public final /* synthetic */ int f582f;

    /* renamed from: g */
    public Object f583g;

    /* renamed from: h */
    public int f584h;

    /* renamed from: i */
    public int f585i;

    /* renamed from: j */
    public Object f586j;

    /* renamed from: k */
    public Cloneable f587k;

    public /* synthetic */ C0221d() {
        this.f582f = 0;
    }

    @Override // p023N.InterfaceC0223e
    /* renamed from: a */
    public int mo36a() {
        return this.f585i;
    }

    @Override // p023N.InterfaceC0219c
    /* renamed from: b */
    public void mo37b(Bundle bundle) {
        this.f587k = bundle;
    }

    /* renamed from: c */
    public void m714c(C0260w0 c0260w0, List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if ((((C0234j0) it2.next()).f616a.mo725c() & 8) != 0) {
                ((View) this.f586j).setTranslationY(AbstractC1258a.m2982c(this.f585i, 0, r3.f616a.mo724b()));
                return;
            }
        }
    }

    @Override // p023N.InterfaceC0219c
    /* renamed from: d */
    public void mo39d(Uri uri) {
        this.f586j = uri;
    }

    @Override // p023N.InterfaceC0223e
    /* renamed from: f */
    public int mo41f() {
        return this.f584h;
    }

    @Override // p023N.InterfaceC0223e
    /* renamed from: i */
    public ClipData mo44i() {
        return (ClipData) this.f583g;
    }

    @Override // p023N.InterfaceC0219c
    /* renamed from: j */
    public C0225f mo45j() {
        return new C0225f(new C0221d(this));
    }

    @Override // p023N.InterfaceC0223e
    /* renamed from: n */
    public ContentInfo mo49n() {
        return null;
    }

    @Override // p023N.InterfaceC0219c
    /* renamed from: p */
    public void mo51p(int i) {
        this.f585i = i;
    }

    public String toString() {
        String str;
        switch (this.f582f) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f583g).getDescription());
                sb.append(", source=");
                int i = this.f584h;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.f585i;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                Uri uri = (Uri) this.f586j;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(((Bundle) this.f587k) != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int[], java.lang.Cloneable] */
    public C0221d(View view) {
        this.f582f = 2;
        this.f587k = new int[2];
        this.f586j = view;
    }

    public C0221d(C0221d c0221d) {
        this.f582f = 1;
        ClipData clipData = (ClipData) c0221d.f583g;
        clipData.getClass();
        this.f583g = clipData;
        int i = c0221d.f584h;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i <= 5) {
            this.f584h = i;
            int i2 = c0221d.f585i;
            if ((i2 & 1) == i2) {
                this.f585i = i2;
                this.f586j = (Uri) c0221d.f586j;
                this.f587k = (Bundle) c0221d.f587k;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
