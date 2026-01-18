package p046Z;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Z.b */
/* loaded from: classes.dex */
public final class EnumC0462b {

    /* renamed from: a */
    public static final EnumC0462b f1100a;

    /* renamed from: b */
    public static final EnumC0462b f1101b;

    /* renamed from: c */
    public static final EnumC0462b f1102c;

    /* renamed from: d */
    public static final EnumC0462b f1103d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC0462b[] f1104e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0462b EF8;

    static {
        EnumC0462b enumC0462b = new EnumC0462b("PENALTY_LOG", 0);
        EnumC0462b enumC0462b2 = new EnumC0462b("PENALTY_DEATH", 1);
        EnumC0462b enumC0462b3 = new EnumC0462b("DETECT_FRAGMENT_REUSE", 2);
        f1100a = enumC0462b3;
        EnumC0462b enumC0462b4 = new EnumC0462b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f1101b = enumC0462b4;
        EnumC0462b enumC0462b5 = new EnumC0462b("DETECT_RETAIN_INSTANCE_USAGE", 4);
        EnumC0462b enumC0462b6 = new EnumC0462b("DETECT_SET_USER_VISIBLE_HINT", 5);
        EnumC0462b enumC0462b7 = new EnumC0462b("DETECT_TARGET_FRAGMENT_USAGE", 6);
        f1102c = enumC0462b7;
        EnumC0462b enumC0462b8 = new EnumC0462b("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        f1103d = enumC0462b8;
        f1104e = new EnumC0462b[]{enumC0462b, enumC0462b2, enumC0462b3, enumC0462b4, enumC0462b5, enumC0462b6, enumC0462b7, enumC0462b8};
    }

    public static EnumC0462b valueOf(String str) {
        return (EnumC0462b) Enum.valueOf(EnumC0462b.class, str);
    }

    public static EnumC0462b[] values() {
        return (EnumC0462b[]) f1104e.clone();
    }
}
