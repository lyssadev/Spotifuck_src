package p096r;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: r.g */
/* loaded from: classes.dex */
public final class C1252g implements Iterator {

    /* renamed from: a */
    public final int f4994a;

    /* renamed from: b */
    public int f4995b;

    /* renamed from: c */
    public int f4996c;

    /* renamed from: d */
    public boolean f4997d = false;

    /* renamed from: e */
    public final /* synthetic */ C1246a f4998e;

    public C1252g(C1246a c1246a, int i) {
        this.f4998e = c1246a;
        this.f4994a = i;
        this.f4995b = c1246a.m2943d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4996c < this.f4995b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objM2941b = this.f4998e.m2941b(this.f4996c, this.f4994a);
        this.f4996c++;
        this.f4997d = true;
        return objM2941b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4997d) {
            throw new IllegalStateException();
        }
        int i = this.f4996c - 1;
        this.f4996c = i;
        this.f4995b--;
        this.f4997d = false;
        this.f4998e.m2946g(i);
    }
}
