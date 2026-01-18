package p015J;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: J.a */
/* loaded from: classes.dex */
public abstract class AbstractC0116a {
    /* renamed from: a */
    public static <T> T m443a(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }

    /* renamed from: b */
    public static <T> T[] m444b(Bundle bundle, String str, Class<T> cls) {
        return (T[]) bundle.getParcelableArray(str, cls);
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m445c(Bundle bundle, String str, Class<? extends T> cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    /* renamed from: d */
    public static <T extends Serializable> T m446d(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getSerializable(str, cls);
    }

    /* renamed from: e */
    public static <T> SparseArray<T> m447e(Bundle bundle, String str, Class<? extends T> cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }
}
