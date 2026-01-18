package p039V;

import android.graphics.Rect;
import java.util.Comparator;
import p018K0.C0146e;
import p025O.C0309k;

/* renamed from: V.c */
/* loaded from: classes.dex */
public final class C0419c implements Comparator {

    /* renamed from: a */
    public final Rect f1049a = new Rect();

    /* renamed from: b */
    public final Rect f1050b = new Rect();

    /* renamed from: c */
    public final boolean f1051c;

    /* renamed from: d */
    public final C0146e f1052d;

    public C0419c(boolean z2, C0146e c0146e) {
        this.f1051c = z2;
        this.f1052d = c0146e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f1052d.getClass();
        Rect rect = this.f1049a;
        ((C0309k) obj).m913f(rect);
        Rect rect2 = this.f1050b;
        ((C0309k) obj2).m913f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z2 = this.f1051c;
        if (i3 < i4) {
            return z2 ? 1 : -1;
        }
        if (i3 > i4) {
            return z2 ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z2 ? 1 : -1;
        }
        if (i7 > i8) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
