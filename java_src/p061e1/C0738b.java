package p061e1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p047Z0.AbstractC0469c;
import p050a1.InterfaceC0482a;
import p057d.C0711c;

/* renamed from: e1.b */
/* loaded from: classes.dex */
public final class C0738b implements Iterator, InterfaceC0482a {

    /* renamed from: a */
    public Object f2726a;

    /* renamed from: b */
    public int f2727b = -2;

    /* renamed from: c */
    public final /* synthetic */ C0739c f2728c;

    public C0738b(C0739c c0739c) {
        this.f2728c = c0739c;
    }

    /* renamed from: a */
    public final void m1965a() {
        Object objMo1093a;
        int i = this.f2727b;
        C0739c c0739c = this.f2728c;
        if (i == -2) {
            c0739c.getClass();
            objMo1093a = C0711c.f2662a.mo1093a();
        } else {
            C0741e c0741e = c0739c.f2729a;
            Object obj = this.f2726a;
            AbstractC0469c.m1099b(obj);
            c0741e.getClass();
            AbstractC0469c.m1102e("it", obj);
            objMo1093a = C0711c.f2662a.mo1093a();
        }
        this.f2726a = objMo1093a;
        this.f2727b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2727b < 0) {
            m1965a();
        }
        return this.f2727b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2727b < 0) {
            m1965a();
        }
        if (this.f2727b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f2726a;
        AbstractC0469c.m1100c("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence", obj);
        this.f2727b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
