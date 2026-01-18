package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p105v.C1307c;
import p105v.C1308d;
import p105v.C1309e;
import p105v.C1310f;
import p105v.C1311g;
import p105v.C1312h;
import p107w.C1317b;
import p111y.AbstractC1359r;
import p111y.AbstractC1361t;
import p111y.C1347f;

/* loaded from: classes.dex */
public class Flow extends AbstractC1361t {

    /* renamed from: o */
    public final C1311g f1548o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5452f = new int[32];
        this.f5458l = new HashMap();
        this.f5454h = context;
        super.mo3260g(attributeSet);
        C1311g c1311g = new C1311g();
        c1311g.f5327s0 = 0;
        c1311g.f5328t0 = 0;
        c1311g.f5329u0 = 0;
        c1311g.f5330v0 = 0;
        c1311g.f5331w0 = 0;
        c1311g.f5332x0 = 0;
        c1311g.f5333y0 = false;
        c1311g.f5334z0 = 0;
        c1311g.f5299A0 = 0;
        c1311g.f5300B0 = new C1317b();
        c1311g.f5301C0 = null;
        c1311g.f5302D0 = -1;
        c1311g.f5303E0 = -1;
        c1311g.f5304F0 = -1;
        c1311g.f5305G0 = -1;
        c1311g.f5306H0 = -1;
        c1311g.f5307I0 = -1;
        c1311g.f5308J0 = 0.5f;
        c1311g.f5309K0 = 0.5f;
        c1311g.f5310L0 = 0.5f;
        c1311g.f5311M0 = 0.5f;
        c1311g.f5312N0 = 0.5f;
        c1311g.f5313O0 = 0.5f;
        c1311g.f5314P0 = 0;
        c1311g.f5315Q0 = 0;
        c1311g.f5316R0 = 2;
        c1311g.f5317S0 = 2;
        c1311g.f5318T0 = 0;
        c1311g.f5319U0 = -1;
        c1311g.f5320V0 = 0;
        c1311g.f5321W0 = new ArrayList();
        c1311g.f5322X0 = null;
        c1311g.f5323Y0 = null;
        c1311g.f5324Z0 = null;
        c1311g.f5326b1 = 0;
        this.f1548o = c1311g;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1359r.f5663b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f1548o.f5320V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C1311g c1311g2 = this.f1548o;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1311g2.f5327s0 = dimensionPixelSize;
                    c1311g2.f5328t0 = dimensionPixelSize;
                    c1311g2.f5329u0 = dimensionPixelSize;
                    c1311g2.f5330v0 = dimensionPixelSize;
                } else if (index == 18) {
                    C1311g c1311g3 = this.f1548o;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1311g3.f5329u0 = dimensionPixelSize2;
                    c1311g3.f5331w0 = dimensionPixelSize2;
                    c1311g3.f5332x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1548o.f5330v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1548o.f5331w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1548o.f5327s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1548o.f5332x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1548o.f5328t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1548o.f5318T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1548o.f5302D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1548o.f5303E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1548o.f5304F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1548o.f5306H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1548o.f5305G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1548o.f5307I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1548o.f5308J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1548o.f5310L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1548o.f5312N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1548o.f5311M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1548o.f5313O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1548o.f5309K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1548o.f5316R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1548o.f5317S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1548o.f5314P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1548o.f5315Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1548o.f5319U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f5455i = this.f1548o;
        m3261i();
    }

    @Override // p111y.AbstractC1344c
    /* renamed from: h */
    public final void mo1368h(C1308d c1308d, boolean z2) {
        C1311g c1311g = this.f1548o;
        int i = c1311g.f5329u0;
        if (i > 0 || c1311g.f5330v0 > 0) {
            if (z2) {
                c1311g.f5331w0 = c1311g.f5330v0;
                c1311g.f5332x0 = i;
            } else {
                c1311g.f5331w0 = i;
                c1311g.f5332x0 = c1311g.f5330v0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x00ce A[EDGE_INSN: B:427:0x00ce->B:59:0x00ce BREAK  A[LOOP:1: B:53:0x00ba->B:58:0x00ca], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011c  */
    @Override // p111y.AbstractC1361t
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1369j(C1311g c1311g, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        C1310f c1310f;
        char c2;
        char c3;
        int i16;
        int i17;
        int iMin;
        int[] iArr2;
        int i18;
        int i19;
        int i20;
        int i21;
        ArrayList arrayList;
        int[] iArr3;
        C1308d c1308d;
        int i22;
        int i23;
        int i24;
        int iCeil;
        int iCeil2;
        boolean z2;
        Object obj;
        C1308d c1308d2;
        int i25;
        int i26;
        C1308d[] c1308dArr;
        int i27;
        int i28;
        ArrayList arrayList2;
        int i29;
        int i30;
        int i31;
        int i32;
        C1308d c1308d3;
        int i33;
        int i34;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c1311g == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (c1311g.f5342r0 <= 0) {
            int i35 = c1311g.f5331w0;
            int i36 = c1311g.f5332x0;
            int i37 = c1311g.f5327s0;
            int i38 = c1311g.f5328t0;
            int[] iArr4 = new int[2];
            int i39 = (size - i35) - i36;
            i3 = c1311g.f5320V0;
            if (i3 == 1) {
                i39 = (size2 - i37) - i38;
            }
            if (i3 != 0) {
                if (c1311g.f5302D0 == -1) {
                    c1311g.f5302D0 = 0;
                }
                if (c1311g.f5303E0 == -1) {
                    c1311g.f5303E0 = 0;
                }
            } else {
                if (c1311g.f5302D0 == -1) {
                    c1311g.f5302D0 = 0;
                }
                if (c1311g.f5303E0 == -1) {
                    c1311g.f5303E0 = 0;
                }
            }
            C1308d[] c1308dArr2 = c1311g.f5341q0;
            i4 = 0;
            i5 = 0;
            while (true) {
                i6 = c1311g.f5342r0;
                if (i4 < i6) {
                    break;
                }
                if (c1311g.f5341q0[i4].f5230g0 == 8) {
                    i5++;
                }
                i4++;
            }
            if (i5 > 0) {
                c1308dArr2 = new C1308d[i6 - i5];
                i6 = 0;
                int i40 = 0;
                while (i40 < c1311g.f5342r0) {
                    C1308d c1308d4 = c1311g.f5341q0[i40];
                    int i41 = i39;
                    int[] iArr5 = iArr4;
                    if (c1308d4.f5230g0 != 8) {
                        c1308dArr2[i6] = c1308d4;
                        i6++;
                    }
                    i40++;
                    i39 = i41;
                    iArr4 = iArr5;
                }
            }
            int i42 = i39;
            int[] iArr6 = iArr4;
            C1308d[] c1308dArr3 = c1308dArr2;
            int i43 = i6;
            c1311g.f5325a1 = c1308dArr3;
            c1311g.f5326b1 = i43;
            i7 = c1311g.f5318T0;
            ArrayList arrayList3 = c1311g.f5321W0;
            if (i7 == 0) {
                C1307c c1307c = c1311g.f5200J;
                C1307c c1307c2 = c1311g.f5199I;
                C1307c c1307c3 = c1311g.f5201K;
                C1307c c1307c4 = c1311g.f5202L;
                int[] iArr7 = c1311g.f5248p0;
                if (i7 == 1) {
                    i8 = i38;
                    i9 = i37;
                    i10 = i36;
                    i11 = i35;
                    i12 = mode;
                    i13 = size;
                    i14 = mode2;
                    i15 = size2;
                    iArr = iArr6;
                    ArrayList arrayList4 = arrayList3;
                    int i44 = c1311g.f5320V0;
                    if (i43 != 0) {
                        arrayList4.clear();
                        C1310f c1310f2 = new C1310f(c1311g, i44, c1311g.f5199I, c1311g.f5200J, c1311g.f5201K, c1311g.f5202L, i42);
                        arrayList4.add(c1310f2);
                        if (i44 == 0) {
                            C1310f c1310f3 = c1310f2;
                            int i45 = 0;
                            i19 = 0;
                            int i46 = 0;
                            while (i46 < i43) {
                                C1308d c1308d5 = c1308dArr3[i46];
                                int iM3194U = c1311g.m3194U(c1308d5, i42);
                                if (c1308d5.f5248p0[0] == 3) {
                                    i19++;
                                }
                                int i47 = i19;
                                boolean z3 = (i45 == i42 || (c1311g.f5314P0 + i45) + iM3194U > i42) && c1310f3.f5282b != null;
                                if (!z3 && i46 > 0 && (i23 = c1311g.f5319U0) > 0 && i46 % i23 == 0) {
                                    z3 = true;
                                }
                                if (z3) {
                                    iArr3 = iArr7;
                                    c1308d = c1308d5;
                                    i22 = i44;
                                    C1310f c1310f4 = new C1310f(c1311g, i44, c1311g.f5199I, c1311g.f5200J, c1311g.f5201K, c1311g.f5202L, i42);
                                    c1310f4.f5294n = i46;
                                    arrayList4.add(c1310f4);
                                    c1310f3 = c1310f4;
                                } else {
                                    iArr3 = iArr7;
                                    c1308d = c1308d5;
                                    i22 = i44;
                                    if (i46 > 0) {
                                        i45 = c1311g.f5314P0 + iM3194U + i45;
                                    }
                                    c1310f3.m3186a(c1308d);
                                    i46++;
                                    i19 = i47;
                                    iArr7 = iArr3;
                                    i44 = i22;
                                }
                                i45 = iM3194U;
                                c1310f3.m3186a(c1308d);
                                i46++;
                                i19 = i47;
                                iArr7 = iArr3;
                                i44 = i22;
                            }
                            iArr2 = iArr7;
                            i18 = i44;
                        } else {
                            iArr2 = iArr7;
                            i18 = i44;
                            int i48 = 0;
                            int i49 = 0;
                            i19 = 0;
                            while (i48 < i43) {
                                C1308d c1308d6 = c1308dArr3[i48];
                                int iM3193T = c1311g.m3193T(c1308d6, i42);
                                if (c1308d6.f5248p0[1] == 3) {
                                    i19++;
                                }
                                int i50 = i19;
                                boolean z4 = (i49 == i42 || (c1311g.f5315Q0 + i49) + iM3193T > i42) && c1310f2.f5282b != null;
                                if (!z4 && i48 > 0 && (i20 = c1311g.f5319U0) > 0 && i48 % i20 == 0) {
                                    z4 = true;
                                }
                                if (z4) {
                                    c1310f2 = new C1310f(c1311g, i18, c1311g.f5199I, c1311g.f5200J, c1311g.f5201K, c1311g.f5202L, i42);
                                    c1310f2.f5294n = i48;
                                    arrayList4.add(c1310f2);
                                } else {
                                    if (i48 > 0) {
                                        i49 = c1311g.f5315Q0 + iM3193T + i49;
                                    }
                                    c1310f2.m3186a(c1308d6);
                                    i48++;
                                    i19 = i50;
                                }
                                i49 = iM3193T;
                                c1310f2.m3186a(c1308d6);
                                i48++;
                                i19 = i50;
                            }
                        }
                        int size3 = arrayList4.size();
                        int i51 = c1311g.f5331w0;
                        int i52 = c1311g.f5327s0;
                        int i53 = c1311g.f5332x0;
                        int i54 = c1311g.f5328t0;
                        boolean z5 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i19 > 0 && z5) {
                            for (int i55 = 0; i55 < size3; i55++) {
                                C1310f c1310f5 = (C1310f) arrayList4.get(i55);
                                if (i18 == 0) {
                                    c1310f5.m3190e(i42 - c1310f5.m3189d());
                                } else {
                                    c1310f5.m3190e(i42 - c1310f5.m3188c());
                                }
                            }
                        }
                        int i56 = i51;
                        int i57 = i52;
                        C1307c c1307c5 = c1307c;
                        C1307c c1307c6 = c1307c2;
                        C1307c c1307c7 = c1307c3;
                        C1307c c1307c8 = c1307c4;
                        int iMax = 0;
                        int i58 = 0;
                        int i59 = 0;
                        while (i59 < size3) {
                            C1310f c1310f6 = (C1310f) arrayList4.get(i59);
                            if (i18 == 0) {
                                if (i59 < size3 - 1) {
                                    c1307c8 = ((C1310f) arrayList4.get(i59 + 1)).f5282b.f5200J;
                                    arrayList = arrayList4;
                                    i54 = 0;
                                } else {
                                    i54 = c1311g.f5328t0;
                                    arrayList = arrayList4;
                                    c1307c8 = c1307c4;
                                }
                                C1307c c1307c9 = c1310f6.f5282b.f5202L;
                                c1310f6.m3191f(i18, c1307c6, c1307c5, c1307c7, c1307c8, i56, i57, i53, i54, i42);
                                iMax = Math.max(iMax, c1310f6.m3189d());
                                int iM3188c = c1310f6.m3188c() + i58;
                                if (i59 > 0) {
                                    iM3188c += c1311g.f5315Q0;
                                }
                                i21 = size3;
                                i58 = iM3188c;
                                c1307c5 = c1307c9;
                                arrayList4 = arrayList;
                                i57 = 0;
                            } else {
                                ArrayList arrayList5 = arrayList4;
                                if (i59 < size3 - 1) {
                                    arrayList4 = arrayList5;
                                    i21 = size3;
                                    c1307c7 = ((C1310f) arrayList4.get(i59 + 1)).f5282b.f5199I;
                                    i53 = 0;
                                } else {
                                    arrayList4 = arrayList5;
                                    i53 = c1311g.f5332x0;
                                    i21 = size3;
                                    c1307c7 = c1307c3;
                                }
                                C1307c c1307c10 = c1310f6.f5282b.f5201K;
                                c1310f6.m3191f(i18, c1307c6, c1307c5, c1307c7, c1307c8, i56, i57, i53, i54, i42);
                                int iM3189d = c1310f6.m3189d() + iMax;
                                int iMax2 = Math.max(i58, c1310f6.m3188c());
                                if (i59 > 0) {
                                    iM3189d += c1311g.f5314P0;
                                }
                                i58 = iMax2;
                                iMax = iM3189d;
                                i56 = 0;
                                c1307c6 = c1307c10;
                            }
                            i59++;
                            size3 = i21;
                        }
                        iArr[0] = iMax;
                        iArr[1] = i58;
                    }
                } else if (i7 == 2) {
                    i8 = i38;
                    i9 = i37;
                    i10 = i36;
                    i11 = i35;
                    i12 = mode;
                    i13 = size;
                    i14 = mode2;
                    i15 = size2;
                    C1308d[] c1308dArr4 = c1308dArr3;
                    iArr = iArr6;
                    int i60 = c1311g.f5320V0;
                    if (i60 == 0) {
                        int i61 = c1311g.f5319U0;
                        if (i61 <= 0) {
                            int i62 = 0;
                            iCeil = 0;
                            for (int i63 = 0; i63 < i43; i63++) {
                                if (i63 > 0) {
                                    i62 += c1311g.f5314P0;
                                }
                                C1308d c1308d7 = c1308dArr4[i63];
                                if (c1308d7 != null) {
                                    int iM3194U2 = c1311g.m3194U(c1308d7, i42) + i62;
                                    if (iM3194U2 > i42) {
                                        break;
                                    }
                                    iCeil++;
                                    i62 = iM3194U2;
                                }
                            }
                        } else {
                            iCeil = i61;
                        }
                        i24 = 0;
                    } else {
                        i24 = c1311g.f5319U0;
                        if (i24 <= 0) {
                            int i64 = 0;
                            int i65 = 0;
                            for (int i66 = 0; i66 < i43; i66++) {
                                if (i66 > 0) {
                                    i64 += c1311g.f5315Q0;
                                }
                                C1308d c1308d8 = c1308dArr4[i66];
                                if (c1308d8 != null) {
                                    int iM3193T2 = c1311g.m3193T(c1308d8, i42) + i64;
                                    if (iM3193T2 > i42) {
                                        break;
                                    }
                                    i65++;
                                    i64 = iM3193T2;
                                }
                            }
                            i24 = i65;
                        }
                        iCeil = 0;
                    }
                    if (c1311g.f5324Z0 == null) {
                        c1311g.f5324Z0 = new int[2];
                    }
                    if ((i24 == 0 && i60 == 1) || (iCeil == 0 && i60 == 0)) {
                        iCeil2 = i24;
                        z2 = true;
                    } else {
                        iCeil2 = i24;
                        z2 = false;
                    }
                    while (!z2) {
                        if (i60 == 0) {
                            iCeil2 = (int) Math.ceil(i43 / iCeil);
                        } else {
                            iCeil = (int) Math.ceil(i43 / iCeil2);
                        }
                        C1308d[] c1308dArr5 = c1311g.f5323Y0;
                        if (c1308dArr5 == null || c1308dArr5.length < iCeil) {
                            obj = null;
                            c1311g.f5323Y0 = new C1308d[iCeil];
                        } else {
                            obj = null;
                            Arrays.fill(c1308dArr5, (Object) null);
                        }
                        C1308d[] c1308dArr6 = c1311g.f5322X0;
                        if (c1308dArr6 == null || c1308dArr6.length < iCeil2) {
                            c1311g.f5322X0 = new C1308d[iCeil2];
                        } else {
                            Arrays.fill(c1308dArr6, obj);
                        }
                        for (int i67 = 0; i67 < iCeil; i67++) {
                            int i68 = 0;
                            while (i68 < iCeil2) {
                                int i69 = (i68 * iCeil) + i67;
                                if (i60 == 1) {
                                    i69 = (i67 * iCeil2) + i68;
                                }
                                C1308d[] c1308dArr7 = c1308dArr4;
                                if (i69 < c1308dArr7.length && (c1308d2 = c1308dArr7[i69]) != null) {
                                    int iM3194U3 = c1311g.m3194U(c1308d2, i42);
                                    C1308d c1308d9 = c1311g.f5323Y0[i67];
                                    if (c1308d9 == null || c1308d9.m3170q() < iM3194U3) {
                                        c1311g.f5323Y0[i67] = c1308d2;
                                    }
                                    int iM3193T3 = c1311g.m3193T(c1308d2, i42);
                                    C1308d c1308d10 = c1311g.f5322X0[i68];
                                    if (c1308d10 == null || c1308d10.m3166k() < iM3193T3) {
                                        c1311g.f5322X0[i68] = c1308d2;
                                    }
                                }
                                i68++;
                                c1308dArr4 = c1308dArr7;
                            }
                        }
                        C1308d[] c1308dArr8 = c1308dArr4;
                        int iM3194U4 = 0;
                        for (int i70 = 0; i70 < iCeil; i70++) {
                            C1308d c1308d11 = c1311g.f5323Y0[i70];
                            if (c1308d11 != null) {
                                if (i70 > 0) {
                                    iM3194U4 += c1311g.f5314P0;
                                }
                                iM3194U4 = c1311g.m3194U(c1308d11, i42) + iM3194U4;
                            }
                        }
                        int iM3193T4 = 0;
                        for (int i71 = 0; i71 < iCeil2; i71++) {
                            C1308d c1308d12 = c1311g.f5322X0[i71];
                            if (c1308d12 != null) {
                                if (i71 > 0) {
                                    iM3193T4 += c1311g.f5315Q0;
                                }
                                iM3193T4 = c1311g.m3193T(c1308d12, i42) + iM3193T4;
                            }
                        }
                        iArr[0] = iM3194U4;
                        iArr[1] = iM3193T4;
                        if (i60 == 0) {
                            if (iM3194U4 <= i42 || iCeil <= 1) {
                                z2 = true;
                            } else {
                                iCeil--;
                            }
                        } else if (iM3193T4 > i42 && iCeil2 > 1) {
                            iCeil2--;
                        }
                        c1308dArr4 = c1308dArr8;
                    }
                    int[] iArr8 = c1311g.f5324Z0;
                    iArr8[0] = iCeil;
                    iArr8[1] = iCeil2;
                } else if (i7 != 3) {
                    i8 = i38;
                    i9 = i37;
                    i10 = i36;
                    i11 = i35;
                    i12 = mode;
                    i13 = size;
                    i14 = mode2;
                    i15 = size2;
                    iArr = iArr6;
                } else {
                    int i72 = c1311g.f5320V0;
                    if (i43 != 0) {
                        arrayList3.clear();
                        int i73 = i42;
                        iArr = iArr6;
                        i8 = i38;
                        i9 = i37;
                        i10 = i36;
                        i11 = i35;
                        i15 = size2;
                        ArrayList arrayList6 = arrayList3;
                        C1310f c1310f7 = new C1310f(c1311g, i72, c1311g.f5199I, c1311g.f5200J, c1311g.f5201K, c1311g.f5202L, i73);
                        arrayList6.add(c1310f7);
                        if (i72 == 0) {
                            int i74 = 0;
                            i26 = 0;
                            int i75 = 0;
                            int i76 = 0;
                            while (i76 < i43) {
                                i74++;
                                C1308d c1308d13 = c1308dArr3[i76];
                                int i77 = i73;
                                int iM3194U5 = c1311g.m3194U(c1308d13, i77);
                                int i78 = mode2;
                                if (c1308d13.f5248p0[0] == 3) {
                                    i26++;
                                }
                                int i79 = i26;
                                boolean z6 = (i75 == i77 || (c1311g.f5314P0 + i75) + iM3194U5 > i77) && c1310f7.f5282b != null;
                                if (!z6 && i76 > 0 && (i34 = c1311g.f5319U0) > 0 && i74 > i34) {
                                    z6 = true;
                                }
                                if (z6) {
                                    i32 = i79;
                                    i29 = i77;
                                    i31 = size;
                                    c1308d3 = c1308d13;
                                    i30 = mode;
                                    i33 = i76;
                                    C1310f c1310f8 = new C1310f(c1311g, i72, c1311g.f5199I, c1311g.f5200J, c1311g.f5201K, c1311g.f5202L, i29);
                                    c1310f8.f5294n = i33;
                                    arrayList6.add(c1310f8);
                                    c1310f7 = c1310f8;
                                    i75 = iM3194U5;
                                    i74 = 1;
                                } else {
                                    i29 = i77;
                                    i30 = mode;
                                    i31 = size;
                                    i32 = i79;
                                    c1308d3 = c1308d13;
                                    i33 = i76;
                                    i75 = i33 > 0 ? c1311g.f5314P0 + iM3194U5 + i75 : iM3194U5;
                                }
                                c1310f7.m3186a(c1308d3);
                                i76 = i33 + 1;
                                i26 = i32;
                                mode2 = i78;
                                i73 = i29;
                                size = i31;
                                mode = i30;
                            }
                            i12 = mode;
                            i13 = size;
                            int i80 = i73;
                            i14 = mode2;
                            i25 = i80;
                        } else {
                            i12 = mode;
                            i13 = size;
                            int i81 = i73;
                            i14 = mode2;
                            int i82 = 0;
                            int i83 = 0;
                            int i84 = 0;
                            int i85 = 0;
                            while (i85 < i43) {
                                i84++;
                                C1308d c1308d14 = c1308dArr3[i85];
                                int i86 = i81;
                                int iM3193T5 = c1311g.m3193T(c1308d14, i86);
                                if (c1308d14.f5248p0[1] == 3) {
                                    i82++;
                                }
                                int i87 = i82;
                                boolean z7 = (i83 == i86 || (c1311g.f5315Q0 + i83) + iM3193T5 > i86) && c1310f7.f5282b != null;
                                if ((z7 || i85 <= 0 || (i27 = c1311g.f5319U0) <= 0 || i84 <= i27) ? z7 : true) {
                                    c1308dArr = c1308dArr3;
                                    C1310f c1310f9 = new C1310f(c1311g, i72, c1311g.f5199I, c1311g.f5200J, c1311g.f5201K, c1311g.f5202L, i86);
                                    c1310f9.f5294n = i85;
                                    arrayList6.add(c1310f9);
                                    c1310f7 = c1310f9;
                                    i83 = iM3193T5;
                                    i84 = 1;
                                } else {
                                    c1308dArr = c1308dArr3;
                                    i83 = i85 > 0 ? c1311g.f5315Q0 + iM3193T5 + i83 : iM3193T5;
                                }
                                c1310f7.m3186a(c1308d14);
                                i85++;
                                i82 = i87;
                                c1308dArr3 = c1308dArr;
                                i81 = i86;
                            }
                            i25 = i81;
                            i26 = i82;
                        }
                        int size4 = arrayList6.size();
                        int i88 = c1311g.f5331w0;
                        int i89 = c1311g.f5327s0;
                        int i90 = c1311g.f5332x0;
                        int i91 = c1311g.f5328t0;
                        boolean z8 = iArr7[0] == 2 || iArr7[1] == 2;
                        if (i26 > 0 && z8) {
                            for (int i92 = 0; i92 < size4; i92++) {
                                C1310f c1310f10 = (C1310f) arrayList6.get(i92);
                                if (i72 == 0) {
                                    c1310f10.m3190e(i25 - c1310f10.m3189d());
                                } else {
                                    c1310f10.m3190e(i25 - c1310f10.m3188c());
                                }
                            }
                        }
                        int i93 = i88;
                        int i94 = i89;
                        C1307c c1307c11 = c1307c;
                        C1307c c1307c12 = c1307c2;
                        C1307c c1307c13 = c1307c3;
                        C1307c c1307c14 = c1307c4;
                        int iMax3 = 0;
                        int i95 = 0;
                        int i96 = 0;
                        while (i96 < size4) {
                            C1310f c1310f11 = (C1310f) arrayList6.get(i96);
                            if (i72 == 0) {
                                if (i96 < size4 - 1) {
                                    c1307c14 = ((C1310f) arrayList6.get(i96 + 1)).f5282b.f5200J;
                                    arrayList2 = arrayList6;
                                    i91 = 0;
                                } else {
                                    i91 = c1311g.f5328t0;
                                    arrayList2 = arrayList6;
                                    c1307c14 = c1307c4;
                                }
                                C1307c c1307c15 = c1310f11.f5282b.f5202L;
                                c1310f11.m3191f(i72, c1307c12, c1307c11, c1307c13, c1307c14, i93, i94, i90, i91, i25);
                                iMax3 = Math.max(iMax3, c1310f11.m3189d());
                                int iM3188c2 = c1310f11.m3188c() + i95;
                                if (i96 > 0) {
                                    iM3188c2 += c1311g.f5315Q0;
                                }
                                i28 = size4;
                                i95 = iM3188c2;
                                c1307c11 = c1307c15;
                                arrayList6 = arrayList2;
                                i94 = 0;
                            } else {
                                ArrayList arrayList7 = arrayList6;
                                if (i96 < size4 - 1) {
                                    arrayList6 = arrayList7;
                                    i28 = size4;
                                    c1307c13 = ((C1310f) arrayList6.get(i96 + 1)).f5282b.f5199I;
                                    i90 = 0;
                                } else {
                                    arrayList6 = arrayList7;
                                    i90 = c1311g.f5332x0;
                                    i28 = size4;
                                    c1307c13 = c1307c3;
                                }
                                C1307c c1307c16 = c1310f11.f5282b.f5201K;
                                c1310f11.m3191f(i72, c1307c12, c1307c11, c1307c13, c1307c14, i93, i94, i90, i91, i25);
                                int iM3189d2 = c1310f11.m3189d() + iMax3;
                                int iMax4 = Math.max(i95, c1310f11.m3188c());
                                if (i96 > 0) {
                                    iM3189d2 += c1311g.f5314P0;
                                }
                                i95 = iMax4;
                                iMax3 = iM3189d2;
                                i93 = 0;
                                c1307c12 = c1307c16;
                            }
                            i96++;
                            size4 = i28;
                        }
                        iArr[0] = iMax3;
                        iArr[1] = i95;
                    }
                }
            } else {
                i8 = i38;
                i9 = i37;
                i10 = i36;
                i11 = i35;
                i12 = mode;
                i13 = size;
                i14 = mode2;
                i15 = size2;
                iArr = iArr6;
                int i97 = c1311g.f5320V0;
                if (i43 != 0) {
                    if (arrayList3.size() == 0) {
                        c1310f = new C1310f(c1311g, i97, c1311g.f5199I, c1311g.f5200J, c1311g.f5201K, c1311g.f5202L, i42);
                        arrayList3.add(c1310f);
                    } else {
                        c1310f = (C1310f) arrayList3.get(0);
                        c1310f.f5283c = 0;
                        c1310f.f5282b = null;
                        c1310f.f5292l = 0;
                        c1310f.f5293m = 0;
                        c1310f.f5294n = 0;
                        c1310f.f5295o = 0;
                        c1310f.f5296p = 0;
                        c1310f.m3191f(i97, c1311g.f5199I, c1311g.f5200J, c1311g.f5201K, c1311g.f5202L, c1311g.f5331w0, c1311g.f5327s0, c1311g.f5332x0, c1311g.f5328t0, i42);
                    }
                    for (int i98 = 0; i98 < i43; i98++) {
                        c1310f.m3186a(c1308dArr3[i98]);
                    }
                    c2 = 0;
                    iArr[0] = c1310f.m3189d();
                    c3 = 1;
                    iArr[1] = c1310f.m3188c();
                }
                int i99 = iArr[c2] + i11 + i10;
                int i100 = iArr[c3] + i9 + i8;
                i16 = i12;
                if (i16 == 1073741824) {
                    i17 = i14;
                    iMin = i13;
                } else {
                    if (i16 == Integer.MIN_VALUE) {
                        iMin = Math.min(i99, i13);
                    } else if (i16 == 0) {
                        iMin = i99;
                    } else {
                        i17 = i14;
                        iMin = 0;
                    }
                    i17 = i14;
                }
                int iMin2 = i17 == 1073741824 ? i15 : i17 == Integer.MIN_VALUE ? Math.min(i100, i15) : i17 == 0 ? i100 : 0;
                c1311g.f5334z0 = iMin;
                c1311g.f5299A0 = iMin2;
                c1311g.m3155O(iMin);
                c1311g.m3152L(iMin2);
                c1311g.f5333y0 = c1311g.f5342r0 > 0;
            }
            c2 = 0;
            c3 = 1;
            int i992 = iArr[c2] + i11 + i10;
            int i1002 = iArr[c3] + i9 + i8;
            i16 = i12;
            if (i16 == 1073741824) {
            }
            if (i17 == 1073741824) {
            }
            c1311g.f5334z0 = iMin;
            c1311g.f5299A0 = iMin2;
            c1311g.m3155O(iMin);
            c1311g.m3152L(iMin2);
            c1311g.f5333y0 = c1311g.f5342r0 > 0;
        } else {
            C1308d c1308d15 = c1311g.f5210T;
            C1347f c1347f = c1308d15 != null ? ((C1309e) c1308d15).f5275u0 : null;
            if (c1347f == null) {
                c1311g.f5334z0 = 0;
                c1311g.f5299A0 = 0;
                c1311g.f5333y0 = false;
            } else {
                for (int i101 = 0; i101 < c1311g.f5342r0; i101++) {
                    C1308d c1308d16 = c1311g.f5341q0[i101];
                    if (c1308d16 != null && !(c1308d16 instanceof C1312h)) {
                        int iM3165j = c1308d16.m3165j(0);
                        int iM3165j2 = c1308d16.m3165j(1);
                        if (iM3165j != 3 || c1308d16.f5250r == 1 || iM3165j2 != 3 || c1308d16.f5251s == 1) {
                            if (iM3165j == 3) {
                                iM3165j = 2;
                            }
                            if (iM3165j2 == 3) {
                                iM3165j2 = 2;
                            }
                            C1317b c1317b = c1311g.f5300B0;
                            c1317b.f5349a = iM3165j;
                            c1317b.f5350b = iM3165j2;
                            c1317b.f5351c = c1308d16.m3170q();
                            c1317b.f5352d = c1308d16.m3166k();
                            c1347f.m3264b(c1308d16, c1317b);
                            c1308d16.m3155O(c1317b.f5353e);
                            c1308d16.m3152L(c1317b.f5354f);
                            c1308d16.m3149I(c1317b.f5355g);
                        }
                    }
                }
                int i352 = c1311g.f5331w0;
                int i362 = c1311g.f5332x0;
                int i372 = c1311g.f5327s0;
                int i382 = c1311g.f5328t0;
                int[] iArr42 = new int[2];
                int i392 = (size - i352) - i362;
                i3 = c1311g.f5320V0;
                if (i3 == 1) {
                }
                if (i3 != 0) {
                }
                C1308d[] c1308dArr22 = c1311g.f5341q0;
                i4 = 0;
                i5 = 0;
                while (true) {
                    i6 = c1311g.f5342r0;
                    if (i4 < i6) {
                    }
                    i4++;
                }
                if (i5 > 0) {
                }
                int i422 = i392;
                int[] iArr62 = iArr42;
                C1308d[] c1308dArr32 = c1308dArr22;
                int i432 = i6;
                c1311g.f5325a1 = c1308dArr32;
                c1311g.f5326b1 = i432;
                i7 = c1311g.f5318T0;
                ArrayList arrayList32 = c1311g.f5321W0;
                if (i7 == 0) {
                }
                c2 = 0;
                c3 = 1;
                int i9922 = iArr[c2] + i11 + i10;
                int i10022 = iArr[c3] + i9 + i8;
                i16 = i12;
                if (i16 == 1073741824) {
                }
                if (i17 == 1073741824) {
                }
                c1311g.f5334z0 = iMin;
                c1311g.f5299A0 = iMin2;
                c1311g.m3155O(iMin);
                c1311g.m3152L(iMin2);
                c1311g.f5333y0 = c1311g.f5342r0 > 0;
            }
        }
        setMeasuredDimension(c1311g.f5334z0, c1311g.f5299A0);
    }

    @Override // p111y.AbstractC1344c, android.view.View
    public final void onMeasure(int i, int i2) {
        mo1369j(this.f1548o, i, i2);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f1548o.f5310L0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1548o.f5304F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f1548o.f5311M0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1548o.f5305G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1548o.f5316R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f1548o.f5308J0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1548o.f5314P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1548o.f5302D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.f1548o.f5312N0 = f2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f1548o.f5306H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.f1548o.f5313O0 = f2;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f1548o.f5307I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1548o.f5319U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1548o.f5320V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C1311g c1311g = this.f1548o;
        c1311g.f5327s0 = i;
        c1311g.f5328t0 = i;
        c1311g.f5329u0 = i;
        c1311g.f5330v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1548o.f5328t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1548o.f5331w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1548o.f5332x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1548o.f5327s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1548o.f5317S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f1548o.f5309K0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1548o.f5315Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1548o.f5303E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1548o.f5318T0 = i;
        requestLayout();
    }
}
