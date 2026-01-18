package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public final class EnumC0644l {
    private static final /* synthetic */ EnumC0644l[] $VALUES;
    public static final C0642j Companion;
    public static final EnumC0644l ON_ANY;
    public static final EnumC0644l ON_CREATE;
    public static final EnumC0644l ON_DESTROY;
    public static final EnumC0644l ON_PAUSE;
    public static final EnumC0644l ON_RESUME;
    public static final EnumC0644l ON_START;
    public static final EnumC0644l ON_STOP;

    static {
        EnumC0644l enumC0644l = new EnumC0644l("ON_CREATE", 0);
        ON_CREATE = enumC0644l;
        EnumC0644l enumC0644l2 = new EnumC0644l("ON_START", 1);
        ON_START = enumC0644l2;
        EnumC0644l enumC0644l3 = new EnumC0644l("ON_RESUME", 2);
        ON_RESUME = enumC0644l3;
        EnumC0644l enumC0644l4 = new EnumC0644l("ON_PAUSE", 3);
        ON_PAUSE = enumC0644l4;
        EnumC0644l enumC0644l5 = new EnumC0644l("ON_STOP", 4);
        ON_STOP = enumC0644l5;
        EnumC0644l enumC0644l6 = new EnumC0644l("ON_DESTROY", 5);
        ON_DESTROY = enumC0644l6;
        EnumC0644l enumC0644l7 = new EnumC0644l("ON_ANY", 6);
        ON_ANY = enumC0644l7;
        $VALUES = new EnumC0644l[]{enumC0644l, enumC0644l2, enumC0644l3, enumC0644l4, enumC0644l5, enumC0644l6, enumC0644l7};
        Companion = new C0642j();
    }

    public static EnumC0644l valueOf(String str) {
        return (EnumC0644l) Enum.valueOf(EnumC0644l.class, str);
    }

    public static EnumC0644l[] values() {
        return (EnumC0644l[]) $VALUES.clone();
    }

    /* renamed from: a */
    public final EnumC0645m m1613a() {
        switch (AbstractC0643k.f2000a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0645m.f2003c;
            case 3:
            case 4:
                return EnumC0645m.f2004d;
            case 5:
                return EnumC0645m.f2005e;
            case 6:
                return EnumC0645m.f2001a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
