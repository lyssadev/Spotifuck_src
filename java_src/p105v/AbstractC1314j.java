package p105v;

import java.util.ArrayList;
import p101t.C1297b;
import p101t.C1298c;
import p101t.C1301f;

/* renamed from: v.j */
/* loaded from: classes.dex */
public abstract class AbstractC1314j {

    /* renamed from: a */
    public static final boolean[] f5343a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:185:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x069c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x06e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0704 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3199a(C1309e c1309e, C1298c c1298c, ArrayList arrayList, int i) {
        int i2;
        C1306b[] c1306bArr;
        int i3;
        int i4;
        boolean z2;
        float f2;
        C1308d c1308d;
        boolean z3;
        boolean z4;
        C1307c[] c1307cArr;
        int i5;
        C1306b[] c1306bArr2;
        C1308d c1308d2;
        int i6;
        int i7;
        int i8;
        C1308d c1308d3;
        int i9;
        int i10;
        C1308d c1308d4;
        C1301f c1301f;
        C1301f c1301f2;
        C1307c c1307c;
        C1307c c1307c2;
        C1301f c1301f3;
        C1308d c1308d5;
        C1308d c1308d6;
        C1308d c1308d7;
        C1308d c1308d8;
        C1301f c1301f4;
        int size;
        C1306b c1306b;
        ArrayList arrayList2;
        int i11;
        C1308d c1308d9;
        C1308d c1308d10;
        C1306b c1306b2;
        C1308d c1308d11;
        C1308d c1308d12;
        int i12;
        int i13;
        C1308d c1308d13;
        C1309e c1309e2 = c1309e;
        ArrayList arrayList3 = arrayList;
        int i14 = 2;
        if (i == 0) {
            i2 = c1309e2.f5280z0;
            c1306bArr = c1309e2.f5261C0;
            i3 = 0;
        } else {
            i2 = c1309e2.f5259A0;
            c1306bArr = c1309e2.f5260B0;
            i3 = 2;
        }
        int i15 = 0;
        while (i15 < i2) {
            C1306b c1306b3 = c1306bArr[i15];
            boolean z5 = c1306b3.f5181q;
            C1308d c1308d14 = c1306b3.f5165a;
            int i16 = 3;
            int i17 = 1;
            int i18 = 8;
            if (z5) {
                i4 = i15;
            } else {
                int i19 = c1306b3.f5176l;
                int i20 = i19 * 2;
                C1308d c1308d15 = c1308d14;
                C1308d c1308d16 = c1308d15;
                boolean z6 = false;
                while (!z6) {
                    c1306b3.f5173i += i17;
                    c1308d15.f5242m0[i19] = null;
                    c1308d15.f5240l0[i19] = null;
                    int i21 = c1308d15.f5230g0;
                    C1307c[] c1307cArr2 = c1308d15.f5207Q;
                    if (i21 != i18) {
                        c1308d15.m3165j(i19);
                        c1307cArr2[i20].m3133e();
                        int i22 = i20 + 1;
                        c1307cArr2[i22].m3133e();
                        c1307cArr2[i20].m3133e();
                        c1307cArr2[i22].m3133e();
                        if (c1306b3.f5166b == null) {
                            c1306b3.f5166b = c1308d15;
                        }
                        c1306b3.f5168d = c1308d15;
                        int i23 = c1308d15.f5248p0[i19];
                        if (i23 == i16) {
                            int i24 = c1308d15.f5252t[i19];
                            if (i24 == 0 || i24 == i16 || i24 == i14) {
                                c1306b3.f5174j++;
                                float f3 = c1308d15.f5238k0[i19];
                                if (f3 > 0.0f) {
                                    c1306b3.f5175k += f3;
                                }
                                i13 = i15;
                                if (c1308d15.f5230g0 != 8 && i23 == 3 && (i24 == 0 || i24 == 3)) {
                                    if (f3 < 0.0f) {
                                        c1306b3.f5178n = true;
                                    } else {
                                        c1306b3.f5179o = true;
                                    }
                                    if (c1306b3.f5172h == null) {
                                        c1306b3.f5172h = new ArrayList();
                                    }
                                    c1306b3.f5172h.add(c1308d15);
                                }
                                if (c1306b3.f5170f == null) {
                                    c1306b3.f5170f = c1308d15;
                                }
                                C1308d c1308d17 = c1306b3.f5171g;
                                if (c1308d17 != null) {
                                    c1308d17.f5240l0[i19] = c1308d15;
                                }
                                c1306b3.f5171g = c1308d15;
                            } else {
                                i13 = i15;
                            }
                            if (i19 == 0) {
                                if (c1308d15.f5250r == 0 && c1308d15.f5253u == 0) {
                                    int i25 = c1308d15.f5254v;
                                }
                            } else if (c1308d15.f5251s == 0 && c1308d15.f5256x == 0) {
                                int i26 = c1308d15.f5257y;
                            }
                        } else {
                            i13 = i15;
                        }
                    }
                    C1308d c1308d18 = c1308d16;
                    if (c1308d18 != c1308d15) {
                        c1308d18.f5242m0[i19] = c1308d15;
                    }
                    C1307c c1307c3 = c1307cArr2[i20 + 1].f5187f;
                    if (c1307c3 != null) {
                        c1308d13 = c1307c3.f5185d;
                        C1307c c1307c4 = c1308d13.f5207Q[i20].f5187f;
                        if (c1307c4 == null || c1307c4.f5185d != c1308d15) {
                            c1308d13 = null;
                        }
                    }
                    if (c1308d13 == null) {
                        c1308d13 = c1308d15;
                        z6 = true;
                    }
                    c1308d16 = c1308d15;
                    i15 = i13;
                    i17 = 1;
                    i18 = 8;
                    i14 = 2;
                    c1308d15 = c1308d13;
                    i16 = 3;
                }
                i4 = i15;
                C1308d c1308d19 = c1306b3.f5166b;
                if (c1308d19 != null) {
                    c1308d19.f5207Q[i20].m3133e();
                }
                C1308d c1308d20 = c1306b3.f5168d;
                if (c1308d20 != null) {
                    c1308d20.f5207Q[i20 + 1].m3133e();
                }
                c1306b3.f5167c = c1308d15;
                if (i19 == 0 && c1306b3.f5177m) {
                    c1306b3.f5169e = c1308d15;
                } else {
                    c1306b3.f5169e = c1308d14;
                }
                c1306b3.f5180p = c1306b3.f5179o && c1306b3.f5178n;
            }
            c1306b3.f5181q = true;
            if (arrayList3 == null || arrayList3.contains(c1308d14)) {
                C1308d c1308d21 = c1306b3.f5167c;
                C1308d c1308d22 = c1306b3.f5166b;
                C1308d c1308d23 = c1306b3.f5168d;
                C1308d c1308d24 = c1306b3.f5169e;
                float f4 = c1306b3.f5175k;
                boolean z7 = c1309e2.f5248p0[i] == 2;
                if (i == 0) {
                    int i27 = c1308d24.f5234i0;
                    boolean z8 = i27 == 0;
                    z4 = i27 == 1;
                    z2 = i27 == 2;
                    f2 = f4;
                    c1308d = c1308d14;
                    z3 = z8;
                } else {
                    int i28 = c1308d24.f5236j0;
                    boolean z9 = i28 == 0;
                    boolean z10 = i28 == 1;
                    z2 = i28 == 2;
                    f2 = f4;
                    c1308d = c1308d14;
                    z3 = z9;
                    z4 = z10;
                }
                boolean z11 = false;
                while (true) {
                    c1307cArr = c1309e2.f5207Q;
                    if (z11) {
                        break;
                    }
                    C1307c c1307c5 = c1308d.f5207Q[i3];
                    int i29 = z2 ? 1 : 4;
                    int iM3133e = c1307c5.m3133e();
                    boolean z12 = z11;
                    int[] iArr = c1308d.f5248p0;
                    int i30 = i2;
                    C1306b[] c1306bArr3 = c1306bArr;
                    boolean z13 = iArr[i] == 3 && c1308d.f5252t[i] == 0;
                    C1307c c1307c6 = c1307c5.f5187f;
                    if (c1307c6 != null && c1308d != c1308d14) {
                        iM3133e = c1307c6.m3133e() + iM3133e;
                    }
                    int i31 = iM3133e;
                    if (!z2 || c1308d == c1308d14 || c1308d == c1308d22) {
                        c1308d10 = c1308d24;
                    } else {
                        c1308d10 = c1308d24;
                        i29 = 8;
                    }
                    C1307c c1307c7 = c1307c5.f5187f;
                    if (c1307c7 != null) {
                        if (c1308d == c1308d22) {
                            c1308d11 = c1308d14;
                            c1306b2 = c1306b3;
                            c1298c.m3100f(c1307c5.f5190i, c1307c7.f5190i, i31, 6);
                        } else {
                            c1306b2 = c1306b3;
                            c1308d11 = c1308d14;
                            c1298c.m3100f(c1307c5.f5190i, c1307c7.f5190i, i31, 8);
                        }
                        if (z13 && !z2) {
                            i29 = 5;
                        }
                        c1298c.m3099e(c1307c5.f5190i, c1307c5.f5187f.f5190i, i31, (c1308d == c1308d22 && z2 && c1308d.f5209S[i]) ? 5 : i29);
                    } else {
                        c1306b2 = c1306b3;
                        c1308d11 = c1308d14;
                    }
                    C1307c[] c1307cArr3 = c1308d.f5207Q;
                    if (z7) {
                        if (c1308d.f5230g0 == 8 || iArr[i] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            c1298c.m3100f(c1307cArr3[i3 + 1].f5190i, c1307cArr3[i3].f5190i, 0, 5);
                        }
                        c1298c.m3100f(c1307cArr3[i3].f5190i, c1307cArr[i3].f5190i, i12, 8);
                    }
                    C1307c c1307c8 = c1307cArr3[i3 + 1].f5187f;
                    if (c1307c8 != null) {
                        c1308d12 = c1307c8.f5185d;
                        C1307c c1307c9 = c1308d12.f5207Q[i3].f5187f;
                        if (c1307c9 == null || c1307c9.f5185d != c1308d) {
                            c1308d12 = null;
                        }
                    }
                    if (c1308d12 != null) {
                        c1308d = c1308d12;
                        z11 = z12;
                    } else {
                        z11 = true;
                    }
                    c1308d24 = c1308d10;
                    i2 = i30;
                    c1306bArr = c1306bArr3;
                    c1308d14 = c1308d11;
                    c1306b3 = c1306b2;
                }
                C1306b c1306b4 = c1306b3;
                C1308d c1308d25 = c1308d24;
                C1308d c1308d26 = c1308d14;
                i5 = i2;
                c1306bArr2 = c1306bArr;
                if (c1308d23 != null) {
                    int i32 = i3 + 1;
                    if (c1308d21.f5207Q[i32].f5187f != null) {
                        C1307c c1307c10 = c1308d23.f5207Q[i32];
                        if (c1308d23.f5248p0[i] == 3 && c1308d23.f5252t[i] == 0 && !z2) {
                            C1307c c1307c11 = c1307c10.f5187f;
                            if (c1307c11.f5185d == c1309e2) {
                                c1298c.m3099e(c1307c10.f5190i, c1307c11.f5190i, -c1307c10.m3133e(), 5);
                            }
                            c1298c.m3101g(c1307c10.f5190i, c1308d21.f5207Q[i32].f5187f.f5190i, -c1307c10.m3133e(), 6);
                        } else {
                            if (z2) {
                                C1307c c1307c12 = c1307c10.f5187f;
                                if (c1307c12.f5185d == c1309e2) {
                                    c1298c.m3099e(c1307c10.f5190i, c1307c12.f5190i, -c1307c10.m3133e(), 4);
                                }
                            }
                            c1298c.m3101g(c1307c10.f5190i, c1308d21.f5207Q[i32].f5187f.f5190i, -c1307c10.m3133e(), 6);
                        }
                    }
                    if (z7) {
                        int i33 = i3 + 1;
                        C1301f c1301f5 = c1307cArr[i33].f5190i;
                        C1307c c1307c13 = c1308d21.f5207Q[i33];
                        c1298c.m3100f(c1301f5, c1307c13.f5190i, c1307c13.m3133e(), 8);
                    }
                    C1306b c1306b5 = c1306b4;
                    ArrayList arrayList4 = c1306b5.f5172h;
                    if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                        float f5 = (!c1306b5.f5178n || c1306b5.f5180p) ? f2 : c1306b5.f5174j;
                        C1308d c1308d27 = null;
                        float f6 = 0.0f;
                        int i34 = 0;
                        while (i34 < size) {
                            C1308d c1308d28 = (C1308d) arrayList4.get(i34);
                            float f7 = c1308d28.f5238k0[i];
                            C1307c[] c1307cArr4 = c1308d28.f5207Q;
                            if (f7 < 0.0f) {
                                if (c1306b5.f5180p) {
                                    c1298c.m3099e(c1307cArr4[i3 + 1].f5190i, c1307cArr4[i3].f5190i, 0, 4);
                                    c1306b = c1306b5;
                                    arrayList2 = arrayList4;
                                    i11 = size;
                                    i34++;
                                    c1306b5 = c1306b;
                                    size = i11;
                                    arrayList4 = arrayList2;
                                } else {
                                    f7 = 1.0f;
                                }
                            }
                            if (f7 == 0.0f) {
                                c1298c.m3099e(c1307cArr4[i3 + 1].f5190i, c1307cArr4[i3].f5190i, 0, 8);
                                c1306b = c1306b5;
                                arrayList2 = arrayList4;
                                i11 = size;
                                i34++;
                                c1306b5 = c1306b;
                                size = i11;
                                arrayList4 = arrayList2;
                            } else {
                                if (c1308d27 != null) {
                                    C1307c[] c1307cArr5 = c1308d27.f5207Q;
                                    C1301f c1301f6 = c1307cArr5[i3].f5190i;
                                    int i35 = i3 + 1;
                                    C1301f c1301f7 = c1307cArr5[i35].f5190i;
                                    arrayList2 = arrayList4;
                                    C1301f c1301f8 = c1307cArr4[i3].f5190i;
                                    C1301f c1301f9 = c1307cArr4[i35].f5190i;
                                    i11 = size;
                                    C1297b c1297bM3106l = c1298c.m3106l();
                                    c1308d9 = c1308d28;
                                    c1297bM3106l.f5118b = 0.0f;
                                    c1306b = c1306b5;
                                    if (f5 == 0.0f || f6 == f7) {
                                        c1297bM3106l.f5120d.m3083g(c1301f6, 1.0f);
                                        c1297bM3106l.f5120d.m3083g(c1301f7, -1.0f);
                                        c1297bM3106l.f5120d.m3083g(c1301f9, 1.0f);
                                        c1297bM3106l.f5120d.m3083g(c1301f8, -1.0f);
                                    } else if (f6 == 0.0f) {
                                        c1297bM3106l.f5120d.m3083g(c1301f6, 1.0f);
                                        c1297bM3106l.f5120d.m3083g(c1301f7, -1.0f);
                                    } else if (f7 == 0.0f) {
                                        c1297bM3106l.f5120d.m3083g(c1301f8, 1.0f);
                                        c1297bM3106l.f5120d.m3083g(c1301f9, -1.0f);
                                    } else {
                                        float f8 = (f6 / f5) / (f7 / f5);
                                        c1297bM3106l.f5120d.m3083g(c1301f6, 1.0f);
                                        c1297bM3106l.f5120d.m3083g(c1301f7, -1.0f);
                                        c1297bM3106l.f5120d.m3083g(c1301f9, f8);
                                        c1297bM3106l.f5120d.m3083g(c1301f8, -f8);
                                    }
                                    c1298c.m3097c(c1297bM3106l);
                                } else {
                                    c1306b = c1306b5;
                                    arrayList2 = arrayList4;
                                    i11 = size;
                                    c1308d9 = c1308d28;
                                }
                                f6 = f7;
                                c1308d27 = c1308d9;
                                i34++;
                                c1306b5 = c1306b;
                                size = i11;
                                arrayList4 = arrayList2;
                            }
                        }
                    }
                    C1306b c1306b6 = c1306b5;
                    if (c1308d22 == null || !(c1308d22 == c1308d23 || z2)) {
                        c1308d2 = c1308d23;
                        i6 = i4;
                        if (!z3 || c1308d22 == null) {
                            int i36 = 8;
                            if (z4 && c1308d22 != null) {
                                int i37 = c1306b6.f5174j;
                                boolean z14 = i37 > 0 && c1306b6.f5173i == i37;
                                C1308d c1308d29 = c1308d22;
                                C1308d c1308d30 = c1308d29;
                                while (c1308d30 != null) {
                                    C1308d c1308d31 = c1308d30.f5242m0[i];
                                    while (c1308d31 != null && c1308d31.f5230g0 == i36) {
                                        c1308d31 = c1308d31.f5242m0[i];
                                    }
                                    if (c1308d30 == c1308d22 || c1308d30 == c1308d2 || c1308d31 == null) {
                                        c1308d3 = c1308d29;
                                        i9 = i6;
                                        i10 = 8;
                                    } else {
                                        C1308d c1308d32 = c1308d31 == c1308d2 ? null : c1308d31;
                                        C1307c[] c1307cArr6 = c1308d30.f5207Q;
                                        C1307c c1307c14 = c1307cArr6[i3];
                                        C1301f c1301f10 = c1307c14.f5190i;
                                        int i38 = i3 + 1;
                                        C1301f c1301f11 = c1308d29.f5207Q[i38].f5190i;
                                        int iM3133e2 = c1307c14.m3133e();
                                        int iM3133e3 = c1307cArr6[i38].m3133e();
                                        if (c1308d32 != null) {
                                            c1307c = c1308d32.f5207Q[i3];
                                            c1301f = c1307c.f5190i;
                                            c1308d4 = c1308d32;
                                            C1307c c1307c15 = c1307c.f5187f;
                                            c1301f2 = c1307c15 != null ? c1307c15.f5190i : null;
                                        } else {
                                            c1308d4 = c1308d32;
                                            C1307c c1307c16 = c1308d2.f5207Q[i3];
                                            c1301f = c1307c16 != null ? c1307c16.f5190i : null;
                                            c1301f2 = c1307cArr6[i38].f5190i;
                                            c1307c = c1307c16;
                                        }
                                        int iM3133e4 = c1307c != null ? c1307c.m3133e() + iM3133e3 : iM3133e3;
                                        int iM3133e5 = c1308d29.f5207Q[i38].m3133e() + iM3133e2;
                                        int i39 = z14 ? 8 : 4;
                                        if (c1301f10 == null || c1301f11 == null || c1301f == null || c1301f2 == null) {
                                            c1308d3 = c1308d29;
                                            i9 = i6;
                                            i10 = 8;
                                        } else {
                                            c1308d3 = c1308d29;
                                            int i40 = iM3133e4;
                                            i9 = i6;
                                            i10 = 8;
                                            c1298c.m3096b(c1301f10, c1301f11, iM3133e5, 0.5f, c1301f, c1301f2, i40, i39);
                                        }
                                        c1308d31 = c1308d4;
                                    }
                                    c1308d29 = c1308d30.f5230g0 != i10 ? c1308d30 : c1308d3;
                                    c1308d30 = c1308d31;
                                    i6 = i9;
                                    i36 = 8;
                                }
                                i7 = i6;
                                C1307c c1307c17 = c1308d22.f5207Q[i3];
                                C1307c c1307c18 = c1308d26.f5207Q[i3].f5187f;
                                int i41 = i3 + 1;
                                C1307c c1307c19 = c1308d2.f5207Q[i41];
                                C1307c c1307c20 = c1308d21.f5207Q[i41].f5187f;
                                if (c1307c18 == null) {
                                    i8 = 5;
                                    if (c1307c20 != null && c1308d22 != c1308d2) {
                                        c1298c.m3099e(c1307c19.f5190i, c1307c20.f5190i, -c1307c19.m3133e(), i8);
                                    }
                                } else {
                                    if (c1308d22 != c1308d2) {
                                        c1298c.m3099e(c1307c17.f5190i, c1307c18.f5190i, c1307c17.m3133e(), 5);
                                    } else {
                                        if (c1307c20 != null) {
                                            i8 = 5;
                                            c1298c.m3096b(c1307c17.f5190i, c1307c18.f5190i, c1307c17.m3133e(), 0.5f, c1307c19.f5190i, c1307c20.f5190i, c1307c19.m3133e(), 5);
                                        }
                                        if (c1307c20 != null) {
                                            c1298c.m3099e(c1307c19.f5190i, c1307c20.f5190i, -c1307c19.m3133e(), i8);
                                        }
                                    }
                                    i8 = 5;
                                    if (c1307c20 != null) {
                                    }
                                }
                            }
                            if ((z3 || z4) && c1308d22 != null && c1308d22 != c1308d2) {
                                C1307c[] c1307cArr7 = c1308d22.f5207Q;
                                C1307c c1307c21 = c1307cArr7[i3];
                                c1308d8 = c1308d2 == null ? c1308d22 : c1308d2;
                                int i42 = i3 + 1;
                                C1307c[] c1307cArr8 = c1308d8.f5207Q;
                                C1307c c1307c22 = c1307cArr8[i42];
                                C1307c c1307c23 = c1307c21.f5187f;
                                c1301f4 = c1307c23 != null ? c1307c23.f5190i : null;
                                C1307c c1307c24 = c1307c22.f5187f;
                                C1301f c1301f12 = c1307c24 != null ? c1307c24.f5190i : null;
                                if (c1308d21 != c1308d8) {
                                    C1307c c1307c25 = c1308d21.f5207Q[i42].f5187f;
                                    c1301f12 = c1307c25 != null ? c1307c25.f5190i : null;
                                }
                                if (c1308d22 == c1308d8) {
                                    c1307c22 = c1307cArr7[i42];
                                }
                                if (c1301f4 != null && c1301f12 != null) {
                                    c1298c.m3096b(c1307c21.f5190i, c1301f4, c1307c21.m3133e(), 0.5f, c1301f12, c1307c22.f5190i, c1307cArr8[i42].m3133e(), 5);
                                }
                            }
                        } else {
                            int i43 = c1306b6.f5174j;
                            boolean z15 = i43 > 0 && c1306b6.f5173i == i43;
                            C1308d c1308d33 = c1308d22;
                            for (C1308d c1308d34 = c1308d33; c1308d34 != null; c1308d34 = c1308d6) {
                                C1308d c1308d35 = c1308d34.f5242m0[i];
                                while (c1308d35 != null && c1308d35.f5230g0 == 8) {
                                    c1308d35 = c1308d35.f5242m0[i];
                                }
                                if (c1308d35 != null || c1308d34 == c1308d2) {
                                    C1307c[] c1307cArr9 = c1308d34.f5207Q;
                                    C1307c c1307c26 = c1307cArr9[i3];
                                    C1301f c1301f13 = c1307c26.f5190i;
                                    C1307c c1307c27 = c1307c26.f5187f;
                                    C1301f c1301f14 = c1307c27 != null ? c1307c27.f5190i : null;
                                    if (c1308d33 != c1308d34) {
                                        c1301f14 = c1308d33.f5207Q[i3 + 1].f5190i;
                                    } else if (c1308d34 == c1308d22) {
                                        C1307c c1307c28 = c1308d26.f5207Q[i3].f5187f;
                                        c1301f14 = c1307c28 != null ? c1307c28.f5190i : null;
                                    }
                                    int iM3133e6 = c1307c26.m3133e();
                                    int i44 = i3 + 1;
                                    int iM3133e7 = c1307cArr9[i44].m3133e();
                                    if (c1308d35 != null) {
                                        c1307c2 = c1308d35.f5207Q[i3];
                                        c1301f3 = c1307c2.f5190i;
                                    } else {
                                        c1307c2 = c1308d21.f5207Q[i44].f5187f;
                                        c1301f3 = c1307c2 != null ? c1307c2.f5190i : null;
                                    }
                                    C1301f c1301f15 = c1307cArr9[i44].f5190i;
                                    if (c1307c2 != null) {
                                        iM3133e7 = c1307c2.m3133e() + iM3133e7;
                                    }
                                    int iM3133e8 = c1308d33.f5207Q[i44].m3133e() + iM3133e6;
                                    if (c1301f13 == null || c1301f14 == null || c1301f3 == null || c1301f15 == null) {
                                        c1308d6 = c1308d35;
                                        c1308d5 = c1308d33;
                                        c1308d7 = c1308d34;
                                    } else {
                                        if (c1308d34 == c1308d22) {
                                            iM3133e8 = c1308d22.f5207Q[i3].m3133e();
                                        }
                                        if (c1308d34 == c1308d2) {
                                            iM3133e7 = c1308d2.f5207Q[i44].m3133e();
                                        }
                                        C1301f c1301f16 = c1301f14;
                                        int i45 = iM3133e8;
                                        C1301f c1301f17 = c1301f3;
                                        c1308d5 = c1308d33;
                                        int i46 = iM3133e7;
                                        c1308d6 = c1308d35;
                                        c1308d7 = c1308d34;
                                        c1298c.m3096b(c1301f13, c1301f16, i45, 0.5f, c1301f17, c1301f15, i46, z15 ? 8 : 5);
                                    }
                                }
                                c1308d33 = c1308d7.f5230g0 != 8 ? c1308d7 : c1308d5;
                            }
                        }
                    } else {
                        C1307c c1307c29 = c1308d26.f5207Q[i3];
                        int i47 = i3 + 1;
                        C1307c c1307c30 = c1308d21.f5207Q[i47];
                        C1307c c1307c31 = c1307c29.f5187f;
                        C1301f c1301f18 = c1307c31 != null ? c1307c31.f5190i : null;
                        C1307c c1307c32 = c1307c30.f5187f;
                        C1301f c1301f19 = c1307c32 != null ? c1307c32.f5190i : null;
                        C1307c c1307c33 = c1308d22.f5207Q[i3];
                        if (c1308d23 != null) {
                            c1307c30 = c1308d23.f5207Q[i47];
                        }
                        if (c1301f18 == null || c1301f19 == null) {
                            c1308d2 = c1308d23;
                            i6 = i4;
                        } else {
                            c1308d2 = c1308d23;
                            i6 = i4;
                            c1298c.m3096b(c1307c33.f5190i, c1301f18, c1307c33.m3133e(), i == 0 ? c1308d25.f5224d0 : c1308d25.f5226e0, c1301f19, c1307c30.f5190i, c1307c30.m3133e(), 7);
                        }
                    }
                    i7 = i6;
                    if (z3) {
                        C1307c[] c1307cArr72 = c1308d22.f5207Q;
                        C1307c c1307c212 = c1307cArr72[i3];
                        if (c1308d2 == null) {
                        }
                        int i422 = i3 + 1;
                        C1307c[] c1307cArr82 = c1308d8.f5207Q;
                        C1307c c1307c222 = c1307cArr82[i422];
                        C1307c c1307c232 = c1307c212.f5187f;
                        if (c1307c232 != null) {
                        }
                        C1307c c1307c242 = c1307c222.f5187f;
                        if (c1307c242 != null) {
                        }
                        if (c1308d21 != c1308d8) {
                        }
                        if (c1308d22 == c1308d8) {
                        }
                        if (c1301f4 != null) {
                        }
                    } else {
                        C1307c[] c1307cArr722 = c1308d22.f5207Q;
                        C1307c c1307c2122 = c1307cArr722[i3];
                        if (c1308d2 == null) {
                        }
                        int i4222 = i3 + 1;
                        C1307c[] c1307cArr822 = c1308d8.f5207Q;
                        C1307c c1307c2222 = c1307cArr822[i4222];
                        C1307c c1307c2322 = c1307c2122.f5187f;
                        if (c1307c2322 != null) {
                        }
                        C1307c c1307c2422 = c1307c2222.f5187f;
                        if (c1307c2422 != null) {
                        }
                        if (c1308d21 != c1308d8) {
                        }
                        if (c1308d22 == c1308d8) {
                        }
                        if (c1301f4 != null) {
                        }
                    }
                }
            } else {
                i5 = i2;
                c1306bArr2 = c1306bArr;
                i7 = i4;
            }
            i15 = i7 + 1;
            i14 = 2;
            c1309e2 = c1309e;
            arrayList3 = arrayList;
            i2 = i5;
            c1306bArr = c1306bArr2;
        }
    }

    /* renamed from: b */
    public static void m3200b(C1309e c1309e, C1298c c1298c, C1308d c1308d) {
        c1308d.f5245o = -1;
        c1308d.f5247p = -1;
        int i = c1309e.f5248p0[0];
        int[] iArr = c1308d.f5248p0;
        if (i != 2 && iArr[0] == 4) {
            C1307c c1307c = c1308d.f5199I;
            int i2 = c1307c.f5188g;
            int iM3170q = c1309e.m3170q();
            C1307c c1307c2 = c1308d.f5201K;
            int i3 = iM3170q - c1307c2.f5188g;
            c1307c.f5190i = c1298c.m3105k(c1307c);
            c1307c2.f5190i = c1298c.m3105k(c1307c2);
            c1298c.m3098d(c1307c.f5190i, i2);
            c1298c.m3098d(c1307c2.f5190i, i3);
            c1308d.f5245o = 2;
            c1308d.f5215Y = i2;
            int i4 = i3 - i2;
            c1308d.f5211U = i4;
            int i5 = c1308d.f5220b0;
            if (i4 < i5) {
                c1308d.f5211U = i5;
            }
        }
        if (c1309e.f5248p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C1307c c1307c3 = c1308d.f5200J;
        int i6 = c1307c3.f5188g;
        int iM3166k = c1309e.m3166k();
        C1307c c1307c4 = c1308d.f5202L;
        int i7 = iM3166k - c1307c4.f5188g;
        c1307c3.f5190i = c1298c.m3105k(c1307c3);
        c1307c4.f5190i = c1298c.m3105k(c1307c4);
        c1298c.m3098d(c1307c3.f5190i, i6);
        c1298c.m3098d(c1307c4.f5190i, i7);
        if (c1308d.f5218a0 > 0 || c1308d.f5230g0 == 8) {
            C1307c c1307c5 = c1308d.f5203M;
            C1301f c1301fM3105k = c1298c.m3105k(c1307c5);
            c1307c5.f5190i = c1301fM3105k;
            c1298c.m3098d(c1301fM3105k, c1308d.f5218a0 + i6);
        }
        c1308d.f5247p = 2;
        c1308d.f5216Z = i6;
        int i8 = i7 - i6;
        c1308d.f5212V = i8;
        int i9 = c1308d.f5222c0;
        if (i8 < i9) {
            c1308d.f5212V = i9;
        }
    }

    /* renamed from: c */
    public static final boolean m3201c(int i, int i2) {
        return (i & i2) == i2;
    }
}
