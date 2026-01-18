package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public final class EnumC0645m {

    /* renamed from: a */
    public static final EnumC0645m f2001a;

    /* renamed from: b */
    public static final EnumC0645m f2002b;

    /* renamed from: c */
    public static final EnumC0645m f2003c;

    /* renamed from: d */
    public static final EnumC0645m f2004d;

    /* renamed from: e */
    public static final EnumC0645m f2005e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC0645m[] f2006f;

    static {
        EnumC0645m enumC0645m = new EnumC0645m("DESTROYED", 0);
        f2001a = enumC0645m;
        EnumC0645m enumC0645m2 = new EnumC0645m("INITIALIZED", 1);
        f2002b = enumC0645m2;
        EnumC0645m enumC0645m3 = new EnumC0645m("CREATED", 2);
        f2003c = enumC0645m3;
        EnumC0645m enumC0645m4 = new EnumC0645m("STARTED", 3);
        f2004d = enumC0645m4;
        EnumC0645m enumC0645m5 = new EnumC0645m("RESUMED", 4);
        f2005e = enumC0645m5;
        f2006f = new EnumC0645m[]{enumC0645m, enumC0645m2, enumC0645m3, enumC0645m4, enumC0645m5};
    }

    public static EnumC0645m valueOf(String str) {
        return (EnumC0645m) Enum.valueOf(EnumC0645m.class, str);
    }

    public static EnumC0645m[] values() {
        return (EnumC0645m[]) f2006f.clone();
    }
}
