package p073j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import java.lang.reflect.InvocationTargetException;
import p010G.AbstractC0094a;
import p091p0.AbstractC1230a;
import p096r.C1250e;
import p096r.C1257l;

/* renamed from: j.b */
/* loaded from: classes.dex */
public final class C0880b extends Drawable.ConstantState {

    /* renamed from: A */
    public boolean f3506A;

    /* renamed from: B */
    public ColorFilter f3507B;

    /* renamed from: C */
    public boolean f3508C;

    /* renamed from: D */
    public ColorStateList f3509D;

    /* renamed from: E */
    public PorterDuff.Mode f3510E;

    /* renamed from: F */
    public boolean f3511F;

    /* renamed from: G */
    public boolean f3512G;

    /* renamed from: H */
    public int[][] f3513H;

    /* renamed from: I */
    public C1250e f3514I;

    /* renamed from: J */
    public C1257l f3515J;

    /* renamed from: a */
    public final C0883e f3516a;

    /* renamed from: b */
    public Resources f3517b;

    /* renamed from: c */
    public int f3518c;

    /* renamed from: d */
    public int f3519d;

    /* renamed from: e */
    public int f3520e;

    /* renamed from: f */
    public SparseArray f3521f;

    /* renamed from: g */
    public Drawable[] f3522g;

    /* renamed from: h */
    public int f3523h;

    /* renamed from: i */
    public boolean f3524i;

    /* renamed from: j */
    public boolean f3525j;

    /* renamed from: k */
    public Rect f3526k;

    /* renamed from: l */
    public boolean f3527l;

    /* renamed from: m */
    public boolean f3528m;

    /* renamed from: n */
    public int f3529n;

    /* renamed from: o */
    public int f3530o;

    /* renamed from: p */
    public int f3531p;

    /* renamed from: q */
    public int f3532q;

    /* renamed from: r */
    public boolean f3533r;

    /* renamed from: s */
    public int f3534s;

    /* renamed from: t */
    public boolean f3535t;

    /* renamed from: u */
    public boolean f3536u;

    /* renamed from: v */
    public boolean f3537v;

    /* renamed from: w */
    public boolean f3538w;

    /* renamed from: x */
    public int f3539x;

    /* renamed from: y */
    public int f3540y;

    /* renamed from: z */
    public int f3541z;

    public C0880b(C0880b c0880b, C0883e c0883e, Resources resources) {
        this.f3524i = false;
        this.f3527l = false;
        this.f3538w = true;
        this.f3540y = 0;
        this.f3541z = 0;
        this.f3516a = c0883e;
        this.f3517b = resources != null ? resources : c0880b != null ? c0880b.f3517b : null;
        int i = c0880b != null ? c0880b.f3518c : 0;
        int i2 = AbstractC0885g.f3556r;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.f3518c = i;
        if (c0880b != null) {
            this.f3519d = c0880b.f3519d;
            this.f3520e = c0880b.f3520e;
            this.f3536u = true;
            this.f3537v = true;
            this.f3524i = c0880b.f3524i;
            this.f3527l = c0880b.f3527l;
            this.f3538w = c0880b.f3538w;
            this.f3539x = c0880b.f3539x;
            this.f3540y = c0880b.f3540y;
            this.f3541z = c0880b.f3541z;
            this.f3506A = c0880b.f3506A;
            this.f3507B = c0880b.f3507B;
            this.f3508C = c0880b.f3508C;
            this.f3509D = c0880b.f3509D;
            this.f3510E = c0880b.f3510E;
            this.f3511F = c0880b.f3511F;
            this.f3512G = c0880b.f3512G;
            if (c0880b.f3518c == i) {
                if (c0880b.f3525j) {
                    this.f3526k = c0880b.f3526k != null ? new Rect(c0880b.f3526k) : null;
                    this.f3525j = true;
                }
                if (c0880b.f3528m) {
                    this.f3529n = c0880b.f3529n;
                    this.f3530o = c0880b.f3530o;
                    this.f3531p = c0880b.f3531p;
                    this.f3532q = c0880b.f3532q;
                    this.f3528m = true;
                }
            }
            if (c0880b.f3533r) {
                this.f3534s = c0880b.f3534s;
                this.f3533r = true;
            }
            if (c0880b.f3535t) {
                this.f3535t = true;
            }
            Drawable[] drawableArr = c0880b.f3522g;
            this.f3522g = new Drawable[drawableArr.length];
            this.f3523h = c0880b.f3523h;
            SparseArray sparseArray = c0880b.f3521f;
            if (sparseArray != null) {
                this.f3521f = sparseArray.clone();
            } else {
                this.f3521f = new SparseArray(this.f3523h);
            }
            int i3 = this.f3523h;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f3521f.put(i4, constantState);
                    } else {
                        this.f3522g[i4] = drawableArr[i4];
                    }
                }
            }
        } else {
            this.f3522g = new Drawable[10];
            this.f3523h = 0;
        }
        if (c0880b != null) {
            this.f3513H = c0880b.f3513H;
        } else {
            this.f3513H = new int[this.f3522g.length][];
        }
        if (c0880b != null) {
            this.f3514I = c0880b.f3514I;
            this.f3515J = c0880b.f3515J;
        } else {
            this.f3514I = new C1250e();
            this.f3515J = new C1257l();
        }
    }

    /* renamed from: a */
    public final int m2233a(Drawable drawable) {
        int i = this.f3523h;
        if (i >= this.f3522g.length) {
            int i2 = i + 10;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f3522g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f3522g = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f3513H, 0, iArr, 0, i);
            this.f3513H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f3516a);
        this.f3522g[i] = drawable;
        this.f3523h++;
        this.f3520e = drawable.getChangingConfigurations() | this.f3520e;
        this.f3533r = false;
        this.f3535t = false;
        this.f3526k = null;
        this.f3525j = false;
        this.f3528m = false;
        this.f3536u = false;
        return i;
    }

    /* renamed from: b */
    public final void m2234b() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.f3528m = true;
        m2235c();
        int i = this.f3523h;
        Drawable[] drawableArr = this.f3522g;
        this.f3530o = -1;
        this.f3529n = -1;
        this.f3532q = 0;
        this.f3531p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f3529n) {
                this.f3529n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f3530o) {
                this.f3530o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f3531p) {
                this.f3531p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f3532q) {
                this.f3532q = minimumHeight;
            }
        }
    }

    /* renamed from: c */
    public final void m2235c() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        SparseArray sparseArray = this.f3521f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f3521f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f3521f.valueAt(i);
                Drawable[] drawableArr = this.f3522g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f3517b);
                if (Build.VERSION.SDK_INT >= 23) {
                    AbstractC1230a.m2915y0(drawableNewDrawable, this.f3539x);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f3516a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f3521f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.f3523h;
        Drawable[] drawableArr = this.f3522g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f3521f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (AbstractC0094a.m357b(drawable)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m2236d(int i) {
        int iIndexOfKey;
        Drawable drawable = this.f3522g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f3521f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f3521f.valueAt(iIndexOfKey)).newDrawable(this.f3517b);
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC1230a.m2915y0(drawableNewDrawable, this.f3539x);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f3516a);
        this.f3522g[i] = drawableMutate;
        this.f3521f.removeAt(iIndexOfKey);
        if (this.f3521f.size() == 0) {
            this.f3521f = null;
        }
        return drawableMutate;
    }

    /* renamed from: e */
    public final int m2237e(int[] iArr) {
        int[][] iArr2 = this.f3513H;
        int i = this.f3523h;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f3519d | this.f3520e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0883e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0883e(this, resources);
    }
}
