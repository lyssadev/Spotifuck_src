package p015J;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: J.j */
/* loaded from: classes.dex */
public final class C0125j implements InterfaceC0123h {

    /* renamed from: a */
    public final LocaleList f326a;

    public C0125j(Object obj) {
        this.f326a = AbstractC0124i.m465h(obj);
    }

    @Override // p015J.InterfaceC0123h
    /* renamed from: a */
    public final Object mo456a() {
        return this.f326a;
    }

    @Override // p015J.InterfaceC0123h
    /* renamed from: b */
    public final String mo457b() {
        return this.f326a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return this.f326a.equals(((InterfaceC0123h) obj).mo456a());
    }

    @Override // p015J.InterfaceC0123h
    public final Locale get(int i) {
        return this.f326a.get(i);
    }

    public final int hashCode() {
        return this.f326a.hashCode();
    }

    @Override // p015J.InterfaceC0123h
    public final boolean isEmpty() {
        return this.f326a.isEmpty();
    }

    @Override // p015J.InterfaceC0123h
    public final int size() {
        return this.f326a.size();
    }

    public final String toString() {
        return this.f326a.toString();
    }
}
