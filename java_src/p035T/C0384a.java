package p035T;

/* renamed from: T.a */
/* loaded from: classes.dex */
public final class C0384a {

    /* renamed from: a */
    public int f977a;

    /* renamed from: b */
    public int f978b;

    /* renamed from: c */
    public float f979c;

    /* renamed from: d */
    public float f980d;

    /* renamed from: e */
    public long f981e;

    /* renamed from: f */
    public long f982f;

    /* renamed from: g */
    public long f983g;

    /* renamed from: h */
    public float f984h;

    /* renamed from: i */
    public int f985i;

    /* renamed from: a */
    public final float m979a(long j2) {
        if (j2 < this.f981e) {
            return 0.0f;
        }
        long j3 = this.f983g;
        if (j3 < 0 || j2 < j3) {
            return ViewOnTouchListenerC0390g.m993b((j2 - r0) / this.f977a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f984h;
        return (ViewOnTouchListenerC0390g.m993b((j2 - j3) / this.f985i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
