package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p007E.C0057j;
import p083m1.C0990A;
import p101t.C1298c;
import p105v.AbstractC1313i;
import p105v.AbstractC1314j;
import p105v.C1305a;
import p105v.C1308d;
import p105v.C1309e;
import p105v.C1311g;
import p105v.C1312h;
import p107w.AbstractC1330o;
import p107w.C1318c;
import p107w.C1320e;
import p107w.C1324i;
import p107w.C1326k;
import p107w.C1328m;
import p111y.AbstractC1344c;
import p111y.AbstractC1345d;
import p111y.AbstractC1356o;
import p111y.AbstractC1359r;
import p111y.C1346e;
import p111y.C1347f;
import p111y.C1348g;
import p111y.C1355n;
import p111y.C1357p;
import p111y.C1360s;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: u */
    public static C1360s f1549u;

    /* renamed from: f */
    public final SparseArray f1550f;

    /* renamed from: g */
    public final ArrayList f1551g;

    /* renamed from: h */
    public final C1309e f1552h;

    /* renamed from: i */
    public int f1553i;

    /* renamed from: j */
    public int f1554j;

    /* renamed from: k */
    public int f1555k;

    /* renamed from: l */
    public int f1556l;

    /* renamed from: m */
    public boolean f1557m;

    /* renamed from: n */
    public int f1558n;

    /* renamed from: o */
    public C1355n f1559o;

    /* renamed from: p */
    public C0057j f1560p;

    /* renamed from: q */
    public int f1561q;

    /* renamed from: r */
    public HashMap f1562r;

    /* renamed from: s */
    public final SparseArray f1563s;

    /* renamed from: t */
    public final C1347f f1564t;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.f1550f = new SparseArray();
        this.f1551g = new ArrayList(4);
        this.f1552h = new C1309e();
        this.f1553i = 0;
        this.f1554j = 0;
        this.f1555k = Integer.MAX_VALUE;
        this.f1556l = Integer.MAX_VALUE;
        this.f1557m = true;
        this.f1558n = 257;
        this.f1559o = null;
        this.f1560p = null;
        this.f1561q = -1;
        this.f1562r = new HashMap();
        this.f1563s = new SparseArray();
        this.f1564t = new C1347f(this, this);
        m1372i(attributeSet, 0);
    }

    /* renamed from: g */
    public static C1346e m1370g() {
        C1346e c1346e = new C1346e(-2, -2);
        c1346e.f5486a = -1;
        c1346e.f5488b = -1;
        c1346e.f5490c = -1.0f;
        c1346e.f5492d = true;
        c1346e.f5494e = -1;
        c1346e.f5496f = -1;
        c1346e.f5498g = -1;
        c1346e.f5500h = -1;
        c1346e.f5502i = -1;
        c1346e.f5504j = -1;
        c1346e.f5506k = -1;
        c1346e.f5508l = -1;
        c1346e.f5510m = -1;
        c1346e.f5512n = -1;
        c1346e.f5514o = -1;
        c1346e.f5516p = -1;
        c1346e.f5518q = 0;
        c1346e.f5519r = 0.0f;
        c1346e.f5520s = -1;
        c1346e.f5521t = -1;
        c1346e.f5522u = -1;
        c1346e.f5523v = -1;
        c1346e.f5524w = Integer.MIN_VALUE;
        c1346e.f5525x = Integer.MIN_VALUE;
        c1346e.f5526y = Integer.MIN_VALUE;
        c1346e.f5527z = Integer.MIN_VALUE;
        c1346e.f5460A = Integer.MIN_VALUE;
        c1346e.f5461B = Integer.MIN_VALUE;
        c1346e.f5462C = Integer.MIN_VALUE;
        c1346e.f5463D = 0;
        c1346e.f5464E = 0.5f;
        c1346e.f5465F = 0.5f;
        c1346e.f5466G = null;
        c1346e.f5467H = -1.0f;
        c1346e.f5468I = -1.0f;
        c1346e.f5469J = 0;
        c1346e.f5470K = 0;
        c1346e.f5471L = 0;
        c1346e.f5472M = 0;
        c1346e.f5473N = 0;
        c1346e.f5474O = 0;
        c1346e.f5475P = 0;
        c1346e.f5476Q = 0;
        c1346e.f5477R = 1.0f;
        c1346e.f5478S = 1.0f;
        c1346e.f5479T = -1;
        c1346e.f5480U = -1;
        c1346e.f5481V = -1;
        c1346e.f5482W = false;
        c1346e.f5483X = false;
        c1346e.f5484Y = null;
        c1346e.f5485Z = 0;
        c1346e.f5487a0 = true;
        c1346e.f5489b0 = true;
        c1346e.f5491c0 = false;
        c1346e.f5493d0 = false;
        c1346e.f5495e0 = false;
        c1346e.f5497f0 = -1;
        c1346e.f5499g0 = -1;
        c1346e.f5501h0 = -1;
        c1346e.f5503i0 = -1;
        c1346e.f5505j0 = Integer.MIN_VALUE;
        c1346e.f5507k0 = Integer.MIN_VALUE;
        c1346e.f5509l0 = 0.5f;
        c1346e.f5517p0 = new C1308d();
        return c1346e;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C1360s getSharedValues() {
        if (f1549u == null) {
            C1360s c1360s = new C1360s();
            new SparseIntArray();
            new HashMap();
            f1549u = c1360s;
        }
        return f1549u;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1346e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f1551g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC1344c) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i6;
                        float f3 = i7;
                        float f4 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1557m = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1370g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1346e c1346e = new C1346e(context, attributeSet);
        c1346e.f5486a = -1;
        c1346e.f5488b = -1;
        c1346e.f5490c = -1.0f;
        c1346e.f5492d = true;
        c1346e.f5494e = -1;
        c1346e.f5496f = -1;
        c1346e.f5498g = -1;
        c1346e.f5500h = -1;
        c1346e.f5502i = -1;
        c1346e.f5504j = -1;
        c1346e.f5506k = -1;
        c1346e.f5508l = -1;
        c1346e.f5510m = -1;
        c1346e.f5512n = -1;
        c1346e.f5514o = -1;
        c1346e.f5516p = -1;
        c1346e.f5518q = 0;
        c1346e.f5519r = 0.0f;
        c1346e.f5520s = -1;
        c1346e.f5521t = -1;
        c1346e.f5522u = -1;
        c1346e.f5523v = -1;
        c1346e.f5524w = Integer.MIN_VALUE;
        c1346e.f5525x = Integer.MIN_VALUE;
        c1346e.f5526y = Integer.MIN_VALUE;
        c1346e.f5527z = Integer.MIN_VALUE;
        c1346e.f5460A = Integer.MIN_VALUE;
        c1346e.f5461B = Integer.MIN_VALUE;
        c1346e.f5462C = Integer.MIN_VALUE;
        c1346e.f5463D = 0;
        c1346e.f5464E = 0.5f;
        c1346e.f5465F = 0.5f;
        c1346e.f5466G = null;
        c1346e.f5467H = -1.0f;
        c1346e.f5468I = -1.0f;
        c1346e.f5469J = 0;
        c1346e.f5470K = 0;
        c1346e.f5471L = 0;
        c1346e.f5472M = 0;
        c1346e.f5473N = 0;
        c1346e.f5474O = 0;
        c1346e.f5475P = 0;
        c1346e.f5476Q = 0;
        c1346e.f5477R = 1.0f;
        c1346e.f5478S = 1.0f;
        c1346e.f5479T = -1;
        c1346e.f5480U = -1;
        c1346e.f5481V = -1;
        c1346e.f5482W = false;
        c1346e.f5483X = false;
        c1346e.f5484Y = null;
        c1346e.f5485Z = 0;
        c1346e.f5487a0 = true;
        c1346e.f5489b0 = true;
        c1346e.f5491c0 = false;
        c1346e.f5493d0 = false;
        c1346e.f5495e0 = false;
        c1346e.f5497f0 = -1;
        c1346e.f5499g0 = -1;
        c1346e.f5501h0 = -1;
        c1346e.f5503i0 = -1;
        c1346e.f5505j0 = Integer.MIN_VALUE;
        c1346e.f5507k0 = Integer.MIN_VALUE;
        c1346e.f5509l0 = 0.5f;
        c1346e.f5517p0 = new C1308d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1359r.f5663b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = AbstractC1345d.f5459a.get(index);
            switch (i2) {
                case 1:
                    c1346e.f5481V = typedArrayObtainStyledAttributes.getInt(index, c1346e.f5481V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5516p);
                    c1346e.f5516p = resourceId;
                    if (resourceId == -1) {
                        c1346e.f5516p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c1346e.f5518q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5518q);
                    break;
                case 4:
                    float f2 = typedArrayObtainStyledAttributes.getFloat(index, c1346e.f5519r) % 360.0f;
                    c1346e.f5519r = f2;
                    if (f2 < 0.0f) {
                        c1346e.f5519r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c1346e.f5486a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1346e.f5486a);
                    break;
                case 6:
                    c1346e.f5488b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1346e.f5488b);
                    break;
                case 7:
                    c1346e.f5490c = typedArrayObtainStyledAttributes.getFloat(index, c1346e.f5490c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5494e);
                    c1346e.f5494e = resourceId2;
                    if (resourceId2 == -1) {
                        c1346e.f5494e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5496f);
                    c1346e.f5496f = resourceId3;
                    if (resourceId3 == -1) {
                        c1346e.f5496f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5498g);
                    c1346e.f5498g = resourceId4;
                    if (resourceId4 == -1) {
                        c1346e.f5498g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5500h);
                    c1346e.f5500h = resourceId5;
                    if (resourceId5 == -1) {
                        c1346e.f5500h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5502i);
                    c1346e.f5502i = resourceId6;
                    if (resourceId6 == -1) {
                        c1346e.f5502i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5504j);
                    c1346e.f5504j = resourceId7;
                    if (resourceId7 == -1) {
                        c1346e.f5504j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5506k);
                    c1346e.f5506k = resourceId8;
                    if (resourceId8 == -1) {
                        c1346e.f5506k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5508l);
                    c1346e.f5508l = resourceId9;
                    if (resourceId9 == -1) {
                        c1346e.f5508l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5510m);
                    c1346e.f5510m = resourceId10;
                    if (resourceId10 == -1) {
                        c1346e.f5510m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5520s);
                    c1346e.f5520s = resourceId11;
                    if (resourceId11 == -1) {
                        c1346e.f5520s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5521t);
                    c1346e.f5521t = resourceId12;
                    if (resourceId12 == -1) {
                        c1346e.f5521t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5522u);
                    c1346e.f5522u = resourceId13;
                    if (resourceId13 == -1) {
                        c1346e.f5522u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5523v);
                    c1346e.f5523v = resourceId14;
                    if (resourceId14 == -1) {
                        c1346e.f5523v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c1346e.f5524w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5524w);
                    break;
                case 22:
                    c1346e.f5525x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5525x);
                    break;
                case 23:
                    c1346e.f5526y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5526y);
                    break;
                case 24:
                    c1346e.f5527z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5527z);
                    break;
                case 25:
                    c1346e.f5460A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5460A);
                    break;
                case 26:
                    c1346e.f5461B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5461B);
                    break;
                case 27:
                    c1346e.f5482W = typedArrayObtainStyledAttributes.getBoolean(index, c1346e.f5482W);
                    break;
                case 28:
                    c1346e.f5483X = typedArrayObtainStyledAttributes.getBoolean(index, c1346e.f5483X);
                    break;
                case 29:
                    c1346e.f5464E = typedArrayObtainStyledAttributes.getFloat(index, c1346e.f5464E);
                    break;
                case 30:
                    c1346e.f5465F = typedArrayObtainStyledAttributes.getFloat(index, c1346e.f5465F);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1346e.f5471L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1346e.f5472M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c1346e.f5473N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5473N);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1346e.f5473N) == -2) {
                            c1346e.f5473N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c1346e.f5475P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5475P);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1346e.f5475P) == -2) {
                            c1346e.f5475P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c1346e.f5477R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1346e.f5477R));
                    c1346e.f5471L = 2;
                    break;
                case 36:
                    try {
                        c1346e.f5474O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5474O);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1346e.f5474O) == -2) {
                            c1346e.f5474O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c1346e.f5476Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5476Q);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1346e.f5476Q) == -2) {
                            c1346e.f5476Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c1346e.f5478S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1346e.f5478S));
                    c1346e.f5472M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C1355n.m3278h(c1346e, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c1346e.f5467H = typedArrayObtainStyledAttributes.getFloat(index, c1346e.f5467H);
                            break;
                        case 46:
                            c1346e.f5468I = typedArrayObtainStyledAttributes.getFloat(index, c1346e.f5468I);
                            break;
                        case 47:
                            c1346e.f5469J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1346e.f5470K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1346e.f5479T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1346e.f5479T);
                            break;
                        case 50:
                            c1346e.f5480U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1346e.f5480U);
                            break;
                        case 51:
                            c1346e.f5484Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5512n);
                            c1346e.f5512n = resourceId15;
                            if (resourceId15 == -1) {
                                c1346e.f5512n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c1346e.f5514o);
                            c1346e.f5514o = resourceId16;
                            if (resourceId16 == -1) {
                                c1346e.f5514o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c1346e.f5463D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5463D);
                            break;
                        case 55:
                            c1346e.f5462C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1346e.f5462C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    C1355n.m3277g(c1346e, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C1355n.m3277g(c1346e, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c1346e.f5485Z = typedArrayObtainStyledAttributes.getInt(index, c1346e.f5485Z);
                                    break;
                                case 67:
                                    c1346e.f5492d = typedArrayObtainStyledAttributes.getBoolean(index, c1346e.f5492d);
                                    break;
                            }
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c1346e.m3262a();
        return c1346e;
    }

    public int getMaxHeight() {
        return this.f1556l;
    }

    public int getMaxWidth() {
        return this.f1555k;
    }

    public int getMinHeight() {
        return this.f1554j;
    }

    public int getMinWidth() {
        return this.f1553i;
    }

    public int getOptimizationLevel() {
        return this.f1552h.f5262D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C1309e c1309e = this.f1552h;
        if (c1309e.f5235j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c1309e.f5235j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c1309e.f5235j = "parent";
            }
        }
        if (c1309e.f5232h0 == null) {
            c1309e.f5232h0 = c1309e.f5235j;
        }
        Iterator it2 = c1309e.f5271q0.iterator();
        while (it2.hasNext()) {
            C1308d c1308d = (C1308d) it2.next();
            View view = c1308d.f5228f0;
            if (view != null) {
                if (c1308d.f5235j == null && (id = view.getId()) != -1) {
                    c1308d.f5235j = getContext().getResources().getResourceEntryName(id);
                }
                if (c1308d.f5232h0 == null) {
                    c1308d.f5232h0 = c1308d.f5235j;
                }
            }
        }
        c1309e.mo3169n(sb);
        return sb.toString();
    }

    /* renamed from: h */
    public final C1308d m1371h(View view) {
        if (view == this) {
            return this.f1552h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1346e) {
            return ((C1346e) view.getLayoutParams()).f5517p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1346e) {
            return ((C1346e) view.getLayoutParams()).f5517p0;
        }
        return null;
    }

    /* renamed from: i */
    public final void m1372i(AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        C1309e c1309e = this.f1552h;
        c1309e.f5228f0 = this;
        C1347f c1347f = this.f1564t;
        c1309e.f5275u0 = c1347f;
        c1309e.f5273s0.f5366f = c1347f;
        this.f1550f.put(getId(), this);
        this.f1559o = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1359r.f5663b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f1553i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1553i);
                } else if (index == 17) {
                    this.f1554j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1554j);
                } else if (index == 14) {
                    this.f1555k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1555k);
                } else if (index == 15) {
                    this.f1556l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1556l);
                } else if (index == 113) {
                    this.f1558n = typedArrayObtainStyledAttributes.getInt(index, this.f1558n);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m1373j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1560p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1355n c1355n = new C1355n();
                        this.f1559o = c1355n;
                        c1355n.m3281e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1559o = null;
                    }
                    this.f1561q = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c1309e.f5262D0 = this.f1558n;
        C1298c.f5122q = c1309e.m3185W(512);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1373j(int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int eventType;
        C0990A c0990a;
        Context context = getContext();
        C0057j c0057j = new C0057j(21, false);
        c0057j.f122g = new SparseArray();
        c0057j.f123h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            c0990a = null;
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1560p = c0057j;
                return;
            }
            if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (!name.equals("ConstraintSet")) {
                            c2 = 65535;
                            break;
                        } else {
                            c2 = 4;
                            break;
                        }
                    case 80204913:
                        if (name.equals("State")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 2) {
                    C0990A c0990a2 = new C0990A(context, xml);
                    ((SparseArray) c0057j.f122g).put(c0990a2.f4034a, c0990a2);
                    c0990a = c0990a2;
                } else if (c2 == 3) {
                    C1348g c1348g = new C1348g(context, xml);
                    if (c0990a != null) {
                        ((ArrayList) c0990a.f4036c).add(c1348g);
                    }
                } else if (c2 == 4) {
                    c0057j.m258H(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1374k(C1309e c1309e, int i, int i2, int i3) {
        int iMin;
        int iMax;
        int iMin2;
        int iMax2;
        int i4;
        int iM3170q;
        C1320e c1320e;
        int i5;
        int i6;
        int i7;
        C0513t c0513t;
        int size;
        boolean z2;
        int i8;
        boolean z3;
        boolean z4;
        C1347f c1347f;
        int i9;
        int i10;
        int i11;
        boolean zM3183T;
        int size2;
        ArrayList arrayList;
        int i12;
        C1347f c1347f2;
        int i13;
        C1347f c1347f3;
        boolean z5;
        C1326k c1326k;
        C1328m c1328m;
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        boolean z6;
        Iterator it2;
        Iterator it3;
        boolean z7;
        C1309e c1309e2 = c1309e;
        int mode = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size4 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i20 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C1347f c1347f4 = this.f1564t;
        c1347f4.f5529b = iMax3;
        c1347f4.f5530c = iMax4;
        c1347f4.f5531d = paddingWidth;
        c1347f4.f5532e = i20;
        c1347f4.f5533f = i2;
        c1347f4.f5534g = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int i21 = 1;
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            iMax5 = iMax6;
        }
        int i22 = size3 - paddingWidth;
        int i23 = size4 - i20;
        int i24 = c1347f4.f5532e;
        int i25 = c1347f4.f5531d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    iMin = Math.min(this.f1555k - i25, i22);
                    i21 = 1;
                }
                if (mode2 == Integer.MIN_VALUE) {
                    if (mode2 != 0) {
                        if (mode2 == 1073741824) {
                            iMin2 = Math.min(this.f1556l - i24, i23);
                            i4 = 1;
                            iM3170q = c1309e.m3170q();
                            c1320e = c1309e2.f5273s0;
                            i5 = iMin;
                            if (i5 != iM3170q || iMin2 != c1309e.m3166k()) {
                                c1320e.f5363c = true;
                            }
                            c1309e2.f5215Y = 0;
                            c1309e2.f5216Z = 0;
                            int i26 = this.f1555k - i25;
                            int[] iArr2 = c1309e2.f5193C;
                            iArr2[0] = i26;
                            iArr2[1] = this.f1556l - i24;
                            c1309e2.f5220b0 = 0;
                            c1309e2.f5222c0 = 0;
                            c1309e2.m3153M(i21);
                            c1309e2.m3155O(i5);
                            c1309e2.m3154N(i4);
                            c1309e2.m3152L(iMin2);
                            i6 = this.f1553i - i25;
                            if (i6 < 0) {
                                c1309e2.f5220b0 = 0;
                            } else {
                                c1309e2.f5220b0 = i6;
                            }
                            i7 = this.f1554j - i24;
                            if (i7 < 0) {
                                c1309e2.f5222c0 = 0;
                            } else {
                                c1309e2.f5222c0 = i7;
                            }
                            c1309e2.f5278x0 = iMax5;
                            c1309e2.f5279y0 = iMax3;
                            c0513t = c1309e2.f5272r0;
                            c0513t.getClass();
                            C1347f c1347f5 = c1309e2.f5275u0;
                            size = c1309e2.f5271q0.size();
                            int iM3170q2 = c1309e.m3170q();
                            int iM3166k = c1309e.m3166k();
                            boolean zM3201c = AbstractC1314j.m3201c(i, 128);
                            z2 = zM3201c || AbstractC1314j.m3201c(i, 64);
                            if (z2) {
                                for (int i27 = 0; i27 < size; i27++) {
                                    C1308d c1308d = (C1308d) c1309e2.f5271q0.get(i27);
                                    int[] iArr3 = c1308d.f5248p0;
                                    boolean z8 = (iArr3[0] == 3) && (iArr3[1] == 3) && c1308d.f5213W > 0.0f;
                                    if ((c1308d.m3177x() && z8) || ((c1308d.m3178y() && z8) || (c1308d instanceof C1311g) || c1308d.m3177x() || c1308d.m3178y())) {
                                        i8 = 1073741824;
                                        z2 = false;
                                        break;
                                    }
                                }
                                i8 = 1073741824;
                            } else {
                                i8 = 1073741824;
                            }
                            z3 = ((mode == i8 && mode2 == i8) || zM3201c) & z2;
                            if (z3) {
                                int iMin3 = Math.min(iArr2[0], i22);
                                int iMin4 = Math.min(iArr2[1], i23);
                                if (mode == 1073741824 && c1309e.m3170q() != iMin3) {
                                    c1309e2.m3155O(iMin3);
                                    c1309e2.f5273s0.f5362b = true;
                                }
                                if (mode2 == 1073741824 && c1309e.m3166k() != iMin4) {
                                    c1309e2.m3152L(iMin4);
                                    c1309e2.f5273s0.f5362b = true;
                                }
                                if (mode == 1073741824 && mode2 == 1073741824) {
                                    boolean z9 = c1320e.f5362b;
                                    C1309e c1309e3 = c1320e.f5361a;
                                    if (z9 || c1320e.f5363c) {
                                        Iterator it4 = c1309e3.f5271q0.iterator();
                                        while (it4.hasNext()) {
                                            C1308d c1308d2 = (C1308d) it4.next();
                                            c1308d2.m3163h();
                                            c1308d2.f5217a = false;
                                            c1308d2.f5223d.m3232n();
                                            c1308d2.f5225e.m3235m();
                                        }
                                        i16 = 0;
                                        c1309e3.m3163h();
                                        c1309e3.f5217a = false;
                                        c1309e3.f5223d.m3232n();
                                        c1309e3.f5225e.m3235m();
                                        c1320e.f5363c = false;
                                    } else {
                                        i16 = 0;
                                    }
                                    c1320e.m3211b(c1320e.f5364d);
                                    c1309e3.f5215Y = i16;
                                    c1309e3.f5216Z = i16;
                                    int iM3165j = c1309e3.m3165j(i16);
                                    int iM3165j2 = c1309e3.m3165j(1);
                                    if (c1320e.f5362b) {
                                        c1320e.m3212c();
                                    }
                                    int iM3171r = c1309e3.m3171r();
                                    int iM3172s = c1309e3.m3172s();
                                    z4 = z3;
                                    c1309e3.f5223d.f5401h.mo3219d(iM3171r);
                                    c1309e3.f5225e.f5401h.mo3219d(iM3172s);
                                    c1320e.m3216g();
                                    ArrayList arrayList2 = c1320e.f5365e;
                                    c1347f = c1347f5;
                                    if (iM3165j == 2 || iM3165j2 == 2) {
                                        if (zM3201c) {
                                            Iterator it5 = arrayList2.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!((AbstractC1330o) it5.next()).mo3207k()) {
                                                        zM3201c = false;
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                        if (zM3201c && iM3165j == 2) {
                                            c1309e3.m3153M(1);
                                            i9 = iM3170q2;
                                            c1309e3.m3155O(c1320e.m3213d(c1309e3, 0));
                                            c1309e3.f5223d.f5398e.mo3219d(c1309e3.m3170q());
                                        } else {
                                            i9 = iM3170q2;
                                        }
                                        if (zM3201c && iM3165j2 == 2) {
                                            i17 = 1;
                                            c1309e3.m3154N(1);
                                            c1309e3.m3152L(c1320e.m3213d(c1309e3, 1));
                                            c1309e3.f5225e.f5398e.mo3219d(c1309e3.m3166k());
                                        }
                                        iArr = c1309e3.f5248p0;
                                        i10 = iM3166k;
                                        i18 = iArr[0];
                                        if (i18 != i17 || i18 == 4) {
                                            int iM3170q3 = c1309e3.m3170q() + iM3171r;
                                            c1309e3.f5223d.f5402i.mo3219d(iM3170q3);
                                            c1309e3.f5223d.f5398e.mo3219d(iM3170q3 - iM3171r);
                                            c1320e.m3216g();
                                            i19 = iArr[1];
                                            if (i19 != 1 || i19 == 4) {
                                                int iM3166k2 = c1309e3.m3166k() + iM3172s;
                                                c1309e3.f5225e.f5402i.mo3219d(iM3166k2);
                                                c1309e3.f5225e.f5398e.mo3219d(iM3166k2 - iM3172s);
                                            }
                                            c1320e.m3216g();
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        it2 = arrayList2.iterator();
                                        while (it2.hasNext()) {
                                            AbstractC1330o abstractC1330o = (AbstractC1330o) it2.next();
                                            if (abstractC1330o.f5395b != c1309e3 || abstractC1330o.f5400g) {
                                                abstractC1330o.mo3204e();
                                            }
                                        }
                                        it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            AbstractC1330o abstractC1330o2 = (AbstractC1330o) it3.next();
                                            if (z6 || abstractC1330o2.f5395b != c1309e3) {
                                                if (!abstractC1330o2.f5401h.f5378j || ((!abstractC1330o2.f5402i.f5378j && !(abstractC1330o2 instanceof C1324i)) || (!abstractC1330o2.f5398e.f5378j && !(abstractC1330o2 instanceof C1318c) && !(abstractC1330o2 instanceof C1324i)))) {
                                                    z7 = false;
                                                    break;
                                                }
                                            }
                                        }
                                        z7 = true;
                                        c1309e3.m3153M(iM3165j);
                                        c1309e3.m3154N(iM3165j2);
                                        zM3183T = z7;
                                        i15 = 1073741824;
                                        i11 = 2;
                                    } else {
                                        i9 = iM3170q2;
                                    }
                                    i17 = 1;
                                    iArr = c1309e3.f5248p0;
                                    i10 = iM3166k;
                                    i18 = iArr[0];
                                    if (i18 != i17) {
                                        int iM3170q32 = c1309e3.m3170q() + iM3171r;
                                        c1309e3.f5223d.f5402i.mo3219d(iM3170q32);
                                        c1309e3.f5223d.f5398e.mo3219d(iM3170q32 - iM3171r);
                                        c1320e.m3216g();
                                        i19 = iArr[1];
                                        if (i19 != 1) {
                                            int iM3166k22 = c1309e3.m3166k() + iM3172s;
                                            c1309e3.f5225e.f5402i.mo3219d(iM3166k22);
                                            c1309e3.f5225e.f5398e.mo3219d(iM3166k22 - iM3172s);
                                            c1320e.m3216g();
                                            z6 = true;
                                            it2 = arrayList2.iterator();
                                            while (it2.hasNext()) {
                                            }
                                            it3 = arrayList2.iterator();
                                            while (it3.hasNext()) {
                                            }
                                            z7 = true;
                                            c1309e3.m3153M(iM3165j);
                                            c1309e3.m3154N(iM3165j2);
                                            zM3183T = z7;
                                            i15 = 1073741824;
                                            i11 = 2;
                                        }
                                    }
                                } else {
                                    z4 = z3;
                                    c1347f = c1347f5;
                                    i9 = iM3170q2;
                                    i10 = iM3166k;
                                    boolean z10 = c1320e.f5362b;
                                    C1309e c1309e4 = c1320e.f5361a;
                                    if (z10) {
                                        Iterator it6 = c1309e4.f5271q0.iterator();
                                        while (it6.hasNext()) {
                                            C1308d c1308d3 = (C1308d) it6.next();
                                            c1308d3.m3163h();
                                            c1308d3.f5217a = false;
                                            C1326k c1326k2 = c1308d3.f5223d;
                                            c1326k2.f5398e.f5378j = false;
                                            c1326k2.f5400g = false;
                                            c1326k2.m3232n();
                                            C1328m c1328m2 = c1308d3.f5225e;
                                            c1328m2.f5398e.f5378j = false;
                                            c1328m2.f5400g = false;
                                            c1328m2.m3235m();
                                        }
                                        i14 = 0;
                                        c1309e4.m3163h();
                                        c1309e4.f5217a = false;
                                        C1326k c1326k3 = c1309e4.f5223d;
                                        c1326k3.f5398e.f5378j = false;
                                        c1326k3.f5400g = false;
                                        c1326k3.m3232n();
                                        C1328m c1328m3 = c1309e4.f5225e;
                                        c1328m3.f5398e.f5378j = false;
                                        c1328m3.f5400g = false;
                                        c1328m3.m3235m();
                                        c1320e.m3212c();
                                    } else {
                                        i14 = 0;
                                    }
                                    c1320e.m3211b(c1320e.f5364d);
                                    c1309e4.f5215Y = i14;
                                    c1309e4.f5216Z = i14;
                                    c1309e4.f5223d.f5401h.mo3219d(i14);
                                    c1309e4.f5225e.f5401h.mo3219d(i14);
                                    i15 = 1073741824;
                                    if (mode == 1073741824) {
                                        zM3183T = c1309e2.m3183T(i14, zM3201c);
                                        i11 = 1;
                                    } else {
                                        i11 = 0;
                                        zM3183T = true;
                                    }
                                    if (mode2 == 1073741824) {
                                        zM3183T &= c1309e2.m3183T(1, zM3201c);
                                        i11++;
                                    }
                                }
                                if (zM3183T) {
                                    c1309e2.mo3156P(mode == i15, mode2 == i15);
                                }
                            } else {
                                z4 = z3;
                                c1347f = c1347f5;
                                i9 = iM3170q2;
                                i10 = iM3166k;
                                i11 = 0;
                                zM3183T = false;
                            }
                            if (zM3183T || i11 != 2) {
                                int i28 = c1309e2.f5262D0;
                                if (size > 0) {
                                    int size5 = c1309e2.f5271q0.size();
                                    boolean zM3185W = c1309e2.m3185W(64);
                                    C1347f c1347f6 = c1309e2.f5275u0;
                                    for (int i29 = 0; i29 < size5; i29++) {
                                        C1308d c1308d4 = (C1308d) c1309e2.f5271q0.get(i29);
                                        if (!(c1308d4 instanceof C1312h) && !(c1308d4 instanceof C1305a) && !c1308d4.f5196F && (!zM3185W || (c1326k = c1308d4.f5223d) == null || (c1328m = c1308d4.f5225e) == null || !c1326k.f5398e.f5378j || !c1328m.f5398e.f5378j)) {
                                            int iM3165j3 = c1308d4.m3165j(0);
                                            int iM3165j4 = c1308d4.m3165j(1);
                                            boolean z11 = iM3165j3 == 3 && c1308d4.f5250r != 1 && iM3165j4 == 3 && c1308d4.f5251s != 1;
                                            if (!z11 && c1309e2.m3185W(1) && !(c1308d4 instanceof C1311g)) {
                                                if (iM3165j3 == 3 && c1308d4.f5250r == 0 && iM3165j4 != 3 && !c1308d4.m3177x()) {
                                                    z11 = true;
                                                }
                                                if (iM3165j4 == 3 && c1308d4.f5251s == 0 && iM3165j3 != 3 && !c1308d4.m3177x()) {
                                                    z11 = true;
                                                }
                                                if (iM3165j3 == 3 || iM3165j4 == 3) {
                                                    if (c1308d4.f5213W > 0.0f) {
                                                        z11 = true;
                                                    }
                                                }
                                                if (z11) {
                                                    c0513t.m1251z(0, c1308d4, c1347f6);
                                                }
                                            }
                                            if (z11) {
                                            }
                                        }
                                    }
                                    ConstraintLayout constraintLayout = c1347f6.f5528a;
                                    int childCount2 = constraintLayout.getChildCount();
                                    for (int i30 = 0; i30 < childCount2; i30++) {
                                        constraintLayout.getChildAt(i30);
                                    }
                                    ArrayList arrayList3 = constraintLayout.f1551g;
                                    int size6 = arrayList3.size();
                                    if (size6 > 0) {
                                        for (int i31 = 0; i31 < size6; i31++) {
                                            ((AbstractC1344c) arrayList3.get(i31)).getClass();
                                        }
                                    }
                                }
                                c0513t.m1232H(c1309e2);
                                ArrayList arrayList4 = (ArrayList) c0513t.f1247d;
                                size2 = arrayList4.size();
                                int i32 = i9;
                                int i33 = i10;
                                if (size > 0) {
                                    c0513t.m1230E(c1309e2, 0, i32, i33);
                                }
                                if (size2 > 0) {
                                    int[] iArr4 = c1309e2.f5248p0;
                                    boolean z12 = iArr4[0] == 2;
                                    boolean z13 = iArr4[1] == 2;
                                    int iM3170q4 = c1309e.m3170q();
                                    C1309e c1309e5 = (C1309e) c0513t.f1246c;
                                    int iMax7 = Math.max(iM3170q4, c1309e5.f5220b0);
                                    int iMax8 = Math.max(c1309e.m3166k(), c1309e5.f5222c0);
                                    int i34 = 0;
                                    boolean z14 = false;
                                    while (i34 < size2) {
                                        C1308d c1308d5 = (C1308d) arrayList4.get(i34);
                                        if (c1308d5 instanceof C1311g) {
                                            int iM3170q5 = c1308d5.m3170q();
                                            int iM3166k3 = c1308d5.m3166k();
                                            i13 = i28;
                                            c1347f3 = c1347f;
                                            boolean zM1251z = z14 | c0513t.m1251z(1, c1308d5, c1347f3);
                                            int iM3170q6 = c1308d5.m3170q();
                                            int iM3166k4 = c1308d5.m3166k();
                                            if (iM3170q6 != iM3170q5) {
                                                c1308d5.m3155O(iM3170q6);
                                                if (z12 && c1308d5.m3171r() + c1308d5.f5211U > iMax7) {
                                                    iMax7 = Math.max(iMax7, c1308d5.mo3164i(4).m3133e() + c1308d5.m3171r() + c1308d5.f5211U);
                                                }
                                                z5 = true;
                                            } else {
                                                z5 = zM1251z;
                                            }
                                            if (iM3166k4 != iM3166k3) {
                                                c1308d5.m3152L(iM3166k4);
                                                if (z13 && c1308d5.m3172s() + c1308d5.f5212V > iMax8) {
                                                    iMax8 = Math.max(iMax8, c1308d5.mo3164i(5).m3133e() + c1308d5.m3172s() + c1308d5.f5212V);
                                                }
                                                z5 = true;
                                            }
                                            z14 = ((C1311g) c1308d5).f5333y0 | z5;
                                        } else {
                                            i13 = i28;
                                            c1347f3 = c1347f;
                                        }
                                        i34++;
                                        c1347f = c1347f3;
                                        i28 = i13;
                                    }
                                    int i35 = i28;
                                    C1347f c1347f7 = c1347f;
                                    int i36 = 0;
                                    while (i36 < 2) {
                                        int i37 = 0;
                                        while (i37 < size2) {
                                            C1308d c1308d6 = (C1308d) arrayList4.get(i37);
                                            if (((c1308d6 instanceof AbstractC1313i) && !(c1308d6 instanceof C1311g)) || (c1308d6 instanceof C1312h) || c1308d6.f5230g0 == 8 || ((z4 && c1308d6.f5223d.f5398e.f5378j && c1308d6.f5225e.f5398e.f5378j) || (c1308d6 instanceof C1311g))) {
                                                c1347f2 = c1347f7;
                                                arrayList = arrayList4;
                                                i12 = size2;
                                            } else {
                                                int iM3170q7 = c1308d6.m3170q();
                                                int iM3166k5 = c1308d6.m3166k();
                                                arrayList = arrayList4;
                                                int i38 = c1308d6.f5218a0;
                                                i12 = size2;
                                                boolean zM1251z2 = c0513t.m1251z(i36 == 1 ? 2 : 1, c1308d6, c1347f7) | z14;
                                                int iM3170q8 = c1308d6.m3170q();
                                                c1347f2 = c1347f7;
                                                int iM3166k6 = c1308d6.m3166k();
                                                if (iM3170q8 != iM3170q7) {
                                                    c1308d6.m3155O(iM3170q8);
                                                    if (z12 && c1308d6.m3171r() + c1308d6.f5211U > iMax7) {
                                                        iMax7 = Math.max(iMax7, c1308d6.mo3164i(4).m3133e() + c1308d6.m3171r() + c1308d6.f5211U);
                                                    }
                                                    zM1251z2 = true;
                                                }
                                                if (iM3166k6 != iM3166k5) {
                                                    c1308d6.m3152L(iM3166k6);
                                                    if (z13 && c1308d6.m3172s() + c1308d6.f5212V > iMax8) {
                                                        iMax8 = Math.max(iMax8, c1308d6.mo3164i(5).m3133e() + c1308d6.m3172s() + c1308d6.f5212V);
                                                    }
                                                    zM1251z2 = true;
                                                }
                                                z14 = (!c1308d6.f5195E || i38 == c1308d6.f5218a0) ? zM1251z2 : true;
                                            }
                                            i37++;
                                            arrayList4 = arrayList;
                                            size2 = i12;
                                            c1347f7 = c1347f2;
                                        }
                                        C1347f c1347f8 = c1347f7;
                                        ArrayList arrayList5 = arrayList4;
                                        int i39 = size2;
                                        if (!z14) {
                                            break;
                                        }
                                        i36++;
                                        c0513t.m1230E(c1309e, i36, i32, i33);
                                        c1347f7 = c1347f8;
                                        arrayList4 = arrayList5;
                                        size2 = i39;
                                        z14 = false;
                                    }
                                    c1309e2 = c1309e;
                                    i28 = i35;
                                }
                                c1309e2.f5262D0 = i28;
                                C1298c.f5122q = c1309e2.m3185W(512);
                            }
                            return;
                        }
                        i4 = 1;
                    } else if (childCount == 0) {
                        iMax2 = Math.max(0, this.f1554j);
                    } else {
                        i4 = 2;
                    }
                    iMin2 = 0;
                    iM3170q = c1309e.m3170q();
                    c1320e = c1309e2.f5273s0;
                    i5 = iMin;
                    if (i5 != iM3170q) {
                        c1320e.f5363c = true;
                    }
                    c1309e2.f5215Y = 0;
                    c1309e2.f5216Z = 0;
                    int i262 = this.f1555k - i25;
                    int[] iArr22 = c1309e2.f5193C;
                    iArr22[0] = i262;
                    iArr22[1] = this.f1556l - i24;
                    c1309e2.f5220b0 = 0;
                    c1309e2.f5222c0 = 0;
                    c1309e2.m3153M(i21);
                    c1309e2.m3155O(i5);
                    c1309e2.m3154N(i4);
                    c1309e2.m3152L(iMin2);
                    i6 = this.f1553i - i25;
                    if (i6 < 0) {
                    }
                    i7 = this.f1554j - i24;
                    if (i7 < 0) {
                    }
                    c1309e2.f5278x0 = iMax5;
                    c1309e2.f5279y0 = iMax3;
                    c0513t = c1309e2.f5272r0;
                    c0513t.getClass();
                    C1347f c1347f52 = c1309e2.f5275u0;
                    size = c1309e2.f5271q0.size();
                    int iM3170q22 = c1309e.m3170q();
                    int iM3166k7 = c1309e.m3166k();
                    boolean zM3201c2 = AbstractC1314j.m3201c(i, 128);
                    if (zM3201c2) {
                    }
                    if (z2) {
                    }
                    z3 = ((mode == i8 && mode2 == i8) || zM3201c2) & z2;
                    if (z3) {
                    }
                    if (zM3183T) {
                    }
                    int i282 = c1309e2.f5262D0;
                    if (size > 0) {
                    }
                    c0513t.m1232H(c1309e2);
                    ArrayList arrayList42 = (ArrayList) c0513t.f1247d;
                    size2 = arrayList42.size();
                    int i322 = i9;
                    int i332 = i10;
                    if (size > 0) {
                    }
                    if (size2 > 0) {
                    }
                    c1309e2.f5262D0 = i282;
                    C1298c.f5122q = c1309e2.m3185W(512);
                }
                if (childCount != 0) {
                    iMin2 = i23;
                    i4 = 2;
                    iM3170q = c1309e.m3170q();
                    c1320e = c1309e2.f5273s0;
                    i5 = iMin;
                    if (i5 != iM3170q) {
                    }
                    c1309e2.f5215Y = 0;
                    c1309e2.f5216Z = 0;
                    int i2622 = this.f1555k - i25;
                    int[] iArr222 = c1309e2.f5193C;
                    iArr222[0] = i2622;
                    iArr222[1] = this.f1556l - i24;
                    c1309e2.f5220b0 = 0;
                    c1309e2.f5222c0 = 0;
                    c1309e2.m3153M(i21);
                    c1309e2.m3155O(i5);
                    c1309e2.m3154N(i4);
                    c1309e2.m3152L(iMin2);
                    i6 = this.f1553i - i25;
                    if (i6 < 0) {
                    }
                    i7 = this.f1554j - i24;
                    if (i7 < 0) {
                    }
                    c1309e2.f5278x0 = iMax5;
                    c1309e2.f5279y0 = iMax3;
                    c0513t = c1309e2.f5272r0;
                    c0513t.getClass();
                    C1347f c1347f522 = c1309e2.f5275u0;
                    size = c1309e2.f5271q0.size();
                    int iM3170q222 = c1309e.m3170q();
                    int iM3166k72 = c1309e.m3166k();
                    boolean zM3201c22 = AbstractC1314j.m3201c(i, 128);
                    if (zM3201c22) {
                    }
                    if (z2) {
                    }
                    z3 = ((mode == i8 && mode2 == i8) || zM3201c22) & z2;
                    if (z3) {
                    }
                    if (zM3183T) {
                    }
                    int i2822 = c1309e2.f5262D0;
                    if (size > 0) {
                    }
                    c0513t.m1232H(c1309e2);
                    ArrayList arrayList422 = (ArrayList) c0513t.f1247d;
                    size2 = arrayList422.size();
                    int i3222 = i9;
                    int i3322 = i10;
                    if (size > 0) {
                    }
                    if (size2 > 0) {
                    }
                    c1309e2.f5262D0 = i2822;
                    C1298c.f5122q = c1309e2.m3185W(512);
                }
                iMax2 = Math.max(0, this.f1554j);
                iMin2 = iMax2;
                i4 = 2;
                iM3170q = c1309e.m3170q();
                c1320e = c1309e2.f5273s0;
                i5 = iMin;
                if (i5 != iM3170q) {
                }
                c1309e2.f5215Y = 0;
                c1309e2.f5216Z = 0;
                int i26222 = this.f1555k - i25;
                int[] iArr2222 = c1309e2.f5193C;
                iArr2222[0] = i26222;
                iArr2222[1] = this.f1556l - i24;
                c1309e2.f5220b0 = 0;
                c1309e2.f5222c0 = 0;
                c1309e2.m3153M(i21);
                c1309e2.m3155O(i5);
                c1309e2.m3154N(i4);
                c1309e2.m3152L(iMin2);
                i6 = this.f1553i - i25;
                if (i6 < 0) {
                }
                i7 = this.f1554j - i24;
                if (i7 < 0) {
                }
                c1309e2.f5278x0 = iMax5;
                c1309e2.f5279y0 = iMax3;
                c0513t = c1309e2.f5272r0;
                c0513t.getClass();
                C1347f c1347f5222 = c1309e2.f5275u0;
                size = c1309e2.f5271q0.size();
                int iM3170q2222 = c1309e.m3170q();
                int iM3166k722 = c1309e.m3166k();
                boolean zM3201c222 = AbstractC1314j.m3201c(i, 128);
                if (zM3201c222) {
                }
                if (z2) {
                }
                z3 = ((mode == i8 && mode2 == i8) || zM3201c222) & z2;
                if (z3) {
                }
                if (zM3183T) {
                }
                int i28222 = c1309e2.f5262D0;
                if (size > 0) {
                }
                c0513t.m1232H(c1309e2);
                ArrayList arrayList4222 = (ArrayList) c0513t.f1247d;
                size2 = arrayList4222.size();
                int i32222 = i9;
                int i33222 = i10;
                if (size > 0) {
                }
                if (size2 > 0) {
                }
                c1309e2.f5262D0 = i28222;
                C1298c.f5122q = c1309e2.m3185W(512);
            }
            if (childCount == 0) {
                iMax = Math.max(0, this.f1553i);
            } else {
                i21 = 2;
            }
            iMin = 0;
            if (mode2 == Integer.MIN_VALUE) {
            }
            iMin2 = iMax2;
            i4 = 2;
            iM3170q = c1309e.m3170q();
            c1320e = c1309e2.f5273s0;
            i5 = iMin;
            if (i5 != iM3170q) {
            }
            c1309e2.f5215Y = 0;
            c1309e2.f5216Z = 0;
            int i262222 = this.f1555k - i25;
            int[] iArr22222 = c1309e2.f5193C;
            iArr22222[0] = i262222;
            iArr22222[1] = this.f1556l - i24;
            c1309e2.f5220b0 = 0;
            c1309e2.f5222c0 = 0;
            c1309e2.m3153M(i21);
            c1309e2.m3155O(i5);
            c1309e2.m3154N(i4);
            c1309e2.m3152L(iMin2);
            i6 = this.f1553i - i25;
            if (i6 < 0) {
            }
            i7 = this.f1554j - i24;
            if (i7 < 0) {
            }
            c1309e2.f5278x0 = iMax5;
            c1309e2.f5279y0 = iMax3;
            c0513t = c1309e2.f5272r0;
            c0513t.getClass();
            C1347f c1347f52222 = c1309e2.f5275u0;
            size = c1309e2.f5271q0.size();
            int iM3170q22222 = c1309e.m3170q();
            int iM3166k7222 = c1309e.m3166k();
            boolean zM3201c2222 = AbstractC1314j.m3201c(i, 128);
            if (zM3201c2222) {
            }
            if (z2) {
            }
            z3 = ((mode == i8 && mode2 == i8) || zM3201c2222) & z2;
            if (z3) {
            }
            if (zM3183T) {
            }
            int i282222 = c1309e2.f5262D0;
            if (size > 0) {
            }
            c0513t.m1232H(c1309e2);
            ArrayList arrayList42222 = (ArrayList) c0513t.f1247d;
            size2 = arrayList42222.size();
            int i322222 = i9;
            int i332222 = i10;
            if (size > 0) {
            }
            if (size2 > 0) {
            }
            c1309e2.f5262D0 = i282222;
            C1298c.f5122q = c1309e2.m3185W(512);
        }
        if (childCount != 0) {
            iMin = i22;
            i21 = 2;
            if (mode2 == Integer.MIN_VALUE) {
            }
            iMin2 = iMax2;
            i4 = 2;
            iM3170q = c1309e.m3170q();
            c1320e = c1309e2.f5273s0;
            i5 = iMin;
            if (i5 != iM3170q) {
            }
            c1309e2.f5215Y = 0;
            c1309e2.f5216Z = 0;
            int i2622222 = this.f1555k - i25;
            int[] iArr222222 = c1309e2.f5193C;
            iArr222222[0] = i2622222;
            iArr222222[1] = this.f1556l - i24;
            c1309e2.f5220b0 = 0;
            c1309e2.f5222c0 = 0;
            c1309e2.m3153M(i21);
            c1309e2.m3155O(i5);
            c1309e2.m3154N(i4);
            c1309e2.m3152L(iMin2);
            i6 = this.f1553i - i25;
            if (i6 < 0) {
            }
            i7 = this.f1554j - i24;
            if (i7 < 0) {
            }
            c1309e2.f5278x0 = iMax5;
            c1309e2.f5279y0 = iMax3;
            c0513t = c1309e2.f5272r0;
            c0513t.getClass();
            C1347f c1347f522222 = c1309e2.f5275u0;
            size = c1309e2.f5271q0.size();
            int iM3170q222222 = c1309e.m3170q();
            int iM3166k72222 = c1309e.m3166k();
            boolean zM3201c22222 = AbstractC1314j.m3201c(i, 128);
            if (zM3201c22222) {
            }
            if (z2) {
            }
            z3 = ((mode == i8 && mode2 == i8) || zM3201c22222) & z2;
            if (z3) {
            }
            if (zM3183T) {
            }
            int i2822222 = c1309e2.f5262D0;
            if (size > 0) {
            }
            c0513t.m1232H(c1309e2);
            ArrayList arrayList422222 = (ArrayList) c0513t.f1247d;
            size2 = arrayList422222.size();
            int i3222222 = i9;
            int i3322222 = i10;
            if (size > 0) {
            }
            if (size2 > 0) {
            }
            c1309e2.f5262D0 = i2822222;
            C1298c.f5122q = c1309e2.m3185W(512);
        }
        iMax = Math.max(0, this.f1553i);
        iMin = iMax;
        i21 = 2;
        if (mode2 == Integer.MIN_VALUE) {
        }
        iMin2 = iMax2;
        i4 = 2;
        iM3170q = c1309e.m3170q();
        c1320e = c1309e2.f5273s0;
        i5 = iMin;
        if (i5 != iM3170q) {
        }
        c1309e2.f5215Y = 0;
        c1309e2.f5216Z = 0;
        int i26222222 = this.f1555k - i25;
        int[] iArr2222222 = c1309e2.f5193C;
        iArr2222222[0] = i26222222;
        iArr2222222[1] = this.f1556l - i24;
        c1309e2.f5220b0 = 0;
        c1309e2.f5222c0 = 0;
        c1309e2.m3153M(i21);
        c1309e2.m3155O(i5);
        c1309e2.m3154N(i4);
        c1309e2.m3152L(iMin2);
        i6 = this.f1553i - i25;
        if (i6 < 0) {
        }
        i7 = this.f1554j - i24;
        if (i7 < 0) {
        }
        c1309e2.f5278x0 = iMax5;
        c1309e2.f5279y0 = iMax3;
        c0513t = c1309e2.f5272r0;
        c0513t.getClass();
        C1347f c1347f5222222 = c1309e2.f5275u0;
        size = c1309e2.f5271q0.size();
        int iM3170q2222222 = c1309e.m3170q();
        int iM3166k722222 = c1309e.m3166k();
        boolean zM3201c222222 = AbstractC1314j.m3201c(i, 128);
        if (zM3201c222222) {
        }
        if (z2) {
        }
        z3 = ((mode == i8 && mode2 == i8) || zM3201c222222) & z2;
        if (z3) {
        }
        if (zM3183T) {
        }
        int i28222222 = c1309e2.f5262D0;
        if (size > 0) {
        }
        c0513t.m1232H(c1309e2);
        ArrayList arrayList4222222 = (ArrayList) c0513t.f1247d;
        size2 = arrayList4222222.size();
        int i32222222 = i9;
        int i33222222 = i10;
        if (size > 0) {
        }
        if (size2 > 0) {
        }
        c1309e2.f5262D0 = i28222222;
        C1298c.f5122q = c1309e2.m3185W(512);
    }

    /* renamed from: l */
    public final void m1375l(C1308d c1308d, C1346e c1346e, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1550f.get(i);
        C1308d c1308d2 = (C1308d) sparseArray.get(i);
        if (c1308d2 == null || view == null || !(view.getLayoutParams() instanceof C1346e)) {
            return;
        }
        c1346e.f5491c0 = true;
        if (i2 == 6) {
            C1346e c1346e2 = (C1346e) view.getLayoutParams();
            c1346e2.f5491c0 = true;
            c1346e2.f5517p0.f5195E = true;
        }
        c1308d.mo3164i(6).m3130b(c1308d2.mo3164i(i2), c1346e.f5463D, c1346e.f5462C, true);
        c1308d.f5195E = true;
        c1308d.mo3164i(3).m3138j();
        c1308d.mo3164i(5).m3138j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1346e c1346e = (C1346e) childAt.getLayoutParams();
            C1308d c1308d = c1346e.f5517p0;
            if (childAt.getVisibility() != 8 || c1346e.f5493d0 || c1346e.f5495e0 || zIsInEditMode) {
                int iM3171r = c1308d.m3171r();
                int iM3172s = c1308d.m3172s();
                childAt.layout(iM3171r, iM3172s, c1308d.m3170q() + iM3171r, c1308d.m3166k() + iM3172s);
            }
        }
        ArrayList arrayList = this.f1551g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC1344c) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x051c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        boolean z2;
        int i3;
        int i4;
        C1308d c1308d;
        int i5;
        C1308d c1308d2;
        int i6;
        C1308d c1308d3;
        int i7;
        C1346e c1346e;
        float f2;
        int i8;
        int i9;
        float fAbs;
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        C1308d c1308d4;
        ConstraintLayout constraintLayout = this;
        boolean z3 = constraintLayout.f1557m;
        constraintLayout.f1557m = z3;
        int i11 = 0;
        if (!z3) {
            int childCount = getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i12).isLayoutRequested()) {
                    constraintLayout.f1557m = true;
                    break;
                }
                i12++;
            }
        }
        boolean z4 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C1309e c1309e = constraintLayout.f1552h;
        c1309e.f5276v0 = z4;
        if (constraintLayout.f1557m) {
            constraintLayout.f1557m = false;
            int childCount2 = getChildCount();
            int i13 = 0;
            while (true) {
                if (i13 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i13).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i13++;
                }
            }
            if (z2) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i14 = 0; i14 < childCount3; i14++) {
                    C1308d c1308dM1371h = constraintLayout.m1371h(constraintLayout.getChildAt(i14));
                    if (c1308dM1371h != null) {
                        c1308dM1371h.mo3145C();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i15 = 0; i15 < childCount3; i15++) {
                        View childAt = constraintLayout.getChildAt(i15);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName instanceof String) {
                                if (constraintLayout.f1562r == null) {
                                    constraintLayout.f1562r = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                constraintLayout.f1562r.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) constraintLayout.f1550f.get(id);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById == constraintLayout) {
                                    c1308d4 = c1309e;
                                    c1308d4.f5232h0 = resourceName;
                                } else {
                                    c1308d4 = viewFindViewById == null ? null : ((C1346e) viewFindViewById.getLayoutParams()).f5517p0;
                                    c1308d4.f5232h0 = resourceName;
                                }
                            } else {
                                c1308d4 = c1309e;
                                c1308d4.f5232h0 = resourceName;
                            }
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (constraintLayout.f1561q != -1) {
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        constraintLayout.getChildAt(i16).getId();
                    }
                }
                C1355n c1355n = constraintLayout.f1559o;
                if (c1355n != null) {
                    c1355n.m3279a(constraintLayout);
                }
                c1309e.f5271q0.clear();
                ArrayList arrayList3 = constraintLayout.f1551g;
                int size = arrayList3.size();
                if (size > 0) {
                    int i17 = 0;
                    while (i17 < size) {
                        AbstractC1344c abstractC1344c = (AbstractC1344c) arrayList3.get(i17);
                        if (abstractC1344c.isInEditMode()) {
                            abstractC1344c.setIds(abstractC1344c.f5456j);
                        }
                        AbstractC1313i abstractC1313i = abstractC1344c.f5455i;
                        if (abstractC1313i == null) {
                            arrayList = arrayList3;
                        } else {
                            abstractC1313i.f5342r0 = i11;
                            Arrays.fill(abstractC1313i.f5341q0, obj);
                            int i18 = 0;
                            while (i18 < abstractC1344c.f5453g) {
                                int i19 = abstractC1344c.f5452f[i18];
                                View view = (View) constraintLayout.f1550f.get(i19);
                                if (view == null) {
                                    Integer numValueOf2 = Integer.valueOf(i19);
                                    HashMap map = abstractC1344c.f5458l;
                                    String str = (String) map.get(numValueOf2);
                                    int iM3259f = abstractC1344c.m3259f(constraintLayout, str);
                                    if (iM3259f != 0) {
                                        abstractC1344c.f5452f[i18] = iM3259f;
                                        map.put(Integer.valueOf(iM3259f), str);
                                        view = (View) constraintLayout.f1550f.get(iM3259f);
                                    }
                                }
                                if (view != null) {
                                    AbstractC1313i abstractC1313i2 = abstractC1344c.f5455i;
                                    C1308d c1308dM1371h2 = constraintLayout.m1371h(view);
                                    abstractC1313i2.getClass();
                                    if (c1308dM1371h2 == abstractC1313i2 || c1308dM1371h2 == null) {
                                        arrayList2 = arrayList3;
                                    } else {
                                        int i20 = abstractC1313i2.f5342r0 + 1;
                                        C1308d[] c1308dArr = abstractC1313i2.f5341q0;
                                        arrayList2 = arrayList3;
                                        if (i20 > c1308dArr.length) {
                                            abstractC1313i2.f5341q0 = (C1308d[]) Arrays.copyOf(c1308dArr, c1308dArr.length * 2);
                                        }
                                        C1308d[] c1308dArr2 = abstractC1313i2.f5341q0;
                                        int i21 = abstractC1313i2.f5342r0;
                                        c1308dArr2[i21] = c1308dM1371h2;
                                        abstractC1313i2.f5342r0 = i21 + 1;
                                    }
                                }
                                i18++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC1344c.f5455i.mo3192S();
                        }
                        i17++;
                        arrayList3 = arrayList;
                        obj = null;
                        i11 = 0;
                    }
                }
                for (int i22 = 0; i22 < childCount3; i22++) {
                    constraintLayout.getChildAt(i22);
                }
                SparseArray sparseArray = constraintLayout.f1563s;
                sparseArray.clear();
                sparseArray.put(0, c1309e);
                sparseArray.put(getId(), c1309e);
                for (int i23 = 0; i23 < childCount3; i23++) {
                    View childAt2 = constraintLayout.getChildAt(i23);
                    sparseArray.put(childAt2.getId(), constraintLayout.m1371h(childAt2));
                }
                int i24 = 0;
                while (i24 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i24);
                    C1308d c1308dM1371h3 = constraintLayout.m1371h(childAt3);
                    if (c1308dM1371h3 == null) {
                        i3 = childCount3;
                    } else {
                        C1346e c1346e2 = (C1346e) childAt3.getLayoutParams();
                        c1309e.f5271q0.add(c1308dM1371h3);
                        C1308d c1308d5 = c1308dM1371h3.f5210T;
                        if (c1308d5 != null) {
                            ((C1309e) c1308d5).f5271q0.remove(c1308dM1371h3);
                            c1308dM1371h3.mo3145C();
                        }
                        c1308dM1371h3.f5210T = c1309e;
                        c1346e2.m3262a();
                        c1308dM1371h3.f5230g0 = childAt3.getVisibility();
                        c1308dM1371h3.f5228f0 = childAt3;
                        if (childAt3 instanceof AbstractC1344c) {
                            ((AbstractC1344c) childAt3).mo1368h(c1308dM1371h3, c1309e.f5276v0);
                        }
                        if (c1346e2.f5493d0) {
                            C1312h c1312h = (C1312h) c1308dM1371h3;
                            int i25 = c1346e2.f5511m0;
                            int i26 = c1346e2.f5513n0;
                            float f3 = c1346e2.f5515o0;
                            if (f3 != -1.0f) {
                                if (f3 > -1.0f) {
                                    c1312h.f5335q0 = f3;
                                    c1312h.f5336r0 = -1;
                                    c1312h.f5337s0 = -1;
                                }
                            } else if (i25 != -1) {
                                if (i25 > -1) {
                                    c1312h.f5335q0 = -1.0f;
                                    c1312h.f5336r0 = i25;
                                    c1312h.f5337s0 = -1;
                                }
                            } else if (i26 != -1 && i26 > -1) {
                                c1312h.f5335q0 = -1.0f;
                                c1312h.f5336r0 = -1;
                                c1312h.f5337s0 = i26;
                            }
                            i3 = childCount3;
                        } else {
                            int i27 = c1346e2.f5497f0;
                            int i28 = c1346e2.f5499g0;
                            int i29 = c1346e2.f5501h0;
                            int i30 = c1346e2.f5503i0;
                            int i31 = c1346e2.f5505j0;
                            i3 = childCount3;
                            int i32 = c1346e2.f5507k0;
                            float f4 = c1346e2.f5509l0;
                            int i33 = c1346e2.f5516p;
                            if (i33 != -1) {
                                C1308d c1308d6 = (C1308d) sparseArray.get(i33);
                                if (c1308d6 != null) {
                                    float f5 = c1346e2.f5519r;
                                    c1308dM1371h3.m3175v(7, 7, c1346e2.f5518q, 0, c1308d6);
                                    c1308dM1371h3.f5194D = f5;
                                }
                                c1346e = c1346e2;
                            } else {
                                if (i27 != -1) {
                                    C1308d c1308d7 = (C1308d) sparseArray.get(i27);
                                    if (c1308d7 != null) {
                                        c1308dM1371h3.m3175v(2, 2, ((ViewGroup.MarginLayoutParams) c1346e2).leftMargin, i31, c1308d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i28 != -1) {
                                        C1308d c1308d8 = (C1308d) sparseArray.get(i28);
                                        if (c1308d8 != null) {
                                            c1308dM1371h3.m3175v(2, 4, ((ViewGroup.MarginLayoutParams) c1346e2).leftMargin, i31, c1308d8);
                                        }
                                    }
                                    if (i29 == i4) {
                                        C1308d c1308d9 = (C1308d) sparseArray.get(i29);
                                        if (c1308d9 != null) {
                                            c1308dM1371h3.m3175v(4, 2, ((ViewGroup.MarginLayoutParams) c1346e2).rightMargin, i32, c1308d9);
                                        }
                                    } else if (i30 != i4 && (c1308d = (C1308d) sparseArray.get(i30)) != null) {
                                        c1308dM1371h3.m3175v(4, 4, ((ViewGroup.MarginLayoutParams) c1346e2).rightMargin, i32, c1308d);
                                    }
                                    i5 = c1346e2.f5502i;
                                    if (i5 == -1) {
                                        C1308d c1308d10 = (C1308d) sparseArray.get(i5);
                                        if (c1308d10 != null) {
                                            c1308dM1371h3.m3175v(3, 3, ((ViewGroup.MarginLayoutParams) c1346e2).topMargin, c1346e2.f5525x, c1308d10);
                                        }
                                    } else {
                                        int i34 = c1346e2.f5504j;
                                        if (i34 != -1 && (c1308d2 = (C1308d) sparseArray.get(i34)) != null) {
                                            c1308dM1371h3.m3175v(3, 5, ((ViewGroup.MarginLayoutParams) c1346e2).topMargin, c1346e2.f5525x, c1308d2);
                                        }
                                    }
                                    i6 = c1346e2.f5506k;
                                    if (i6 == -1) {
                                        C1308d c1308d11 = (C1308d) sparseArray.get(i6);
                                        if (c1308d11 != null) {
                                            c1308dM1371h3.m3175v(5, 3, ((ViewGroup.MarginLayoutParams) c1346e2).bottomMargin, c1346e2.f5527z, c1308d11);
                                        }
                                    } else {
                                        int i35 = c1346e2.f5508l;
                                        if (i35 != -1 && (c1308d3 = (C1308d) sparseArray.get(i35)) != null) {
                                            c1308dM1371h3.m3175v(5, 5, ((ViewGroup.MarginLayoutParams) c1346e2).bottomMargin, c1346e2.f5527z, c1308d3);
                                        }
                                    }
                                    i7 = c1346e2.f5510m;
                                    if (i7 == -1) {
                                        c1346e = c1346e2;
                                        m1375l(c1308dM1371h3, c1346e2, sparseArray, i7, 6);
                                    } else {
                                        c1346e = c1346e2;
                                        int i36 = c1346e.f5512n;
                                        if (i36 != -1) {
                                            m1375l(c1308dM1371h3, c1346e, sparseArray, i36, 3);
                                        } else {
                                            int i37 = c1346e.f5514o;
                                            if (i37 != -1) {
                                                m1375l(c1308dM1371h3, c1346e, sparseArray, i37, 5);
                                            }
                                        }
                                    }
                                    if (f4 >= 0.0f) {
                                        c1308dM1371h3.f5224d0 = f4;
                                    }
                                    f2 = c1346e.f5465F;
                                    if (f2 >= 0.0f) {
                                        c1308dM1371h3.f5226e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i29 == i4) {
                                }
                                i5 = c1346e2.f5502i;
                                if (i5 == -1) {
                                }
                                i6 = c1346e2.f5506k;
                                if (i6 == -1) {
                                }
                                i7 = c1346e2.f5510m;
                                if (i7 == -1) {
                                }
                                if (f4 >= 0.0f) {
                                }
                                f2 = c1346e.f5465F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (zIsInEditMode && ((i10 = c1346e.f5479T) != -1 || c1346e.f5480U != -1)) {
                                int i38 = c1346e.f5480U;
                                c1308dM1371h3.f5215Y = i10;
                                c1308dM1371h3.f5216Z = i38;
                            }
                            if (c1346e.f5487a0) {
                                c1308dM1371h3.m3153M(1);
                                c1308dM1371h3.m3155O(((ViewGroup.MarginLayoutParams) c1346e).width);
                                if (((ViewGroup.MarginLayoutParams) c1346e).width == -2) {
                                    c1308dM1371h3.m3153M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c1346e).width == -1) {
                                if (c1346e.f5482W) {
                                    c1308dM1371h3.m3153M(3);
                                } else {
                                    c1308dM1371h3.m3153M(4);
                                }
                                c1308dM1371h3.mo3164i(2).f5188g = ((ViewGroup.MarginLayoutParams) c1346e).leftMargin;
                                c1308dM1371h3.mo3164i(4).f5188g = ((ViewGroup.MarginLayoutParams) c1346e).rightMargin;
                            } else {
                                c1308dM1371h3.m3153M(3);
                                c1308dM1371h3.m3155O(0);
                            }
                            if (c1346e.f5489b0) {
                                c1308dM1371h3.m3154N(1);
                                c1308dM1371h3.m3152L(((ViewGroup.MarginLayoutParams) c1346e).height);
                                if (((ViewGroup.MarginLayoutParams) c1346e).height == -2) {
                                    c1308dM1371h3.m3154N(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c1346e).height == -1) {
                                if (c1346e.f5483X) {
                                    c1308dM1371h3.m3154N(3);
                                } else {
                                    c1308dM1371h3.m3154N(4);
                                }
                                c1308dM1371h3.mo3164i(3).f5188g = ((ViewGroup.MarginLayoutParams) c1346e).topMargin;
                                c1308dM1371h3.mo3164i(5).f5188g = ((ViewGroup.MarginLayoutParams) c1346e).bottomMargin;
                            } else {
                                c1308dM1371h3.m3154N(3);
                                c1308dM1371h3.m3152L(0);
                            }
                            String str2 = c1346e.f5466G;
                            if (str2 == null || str2.length() == 0) {
                                c1308dM1371h3.f5213W = 0.0f;
                            } else {
                                int length = str2.length();
                                int iIndexOf3 = str2.indexOf(44);
                                if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                    i8 = 0;
                                    i9 = -1;
                                } else {
                                    String strSubstring = str2.substring(0, iIndexOf3);
                                    i9 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                    i8 = iIndexOf3 + 1;
                                }
                                int iIndexOf4 = str2.indexOf(58);
                                if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                    String strSubstring2 = str2.substring(i8);
                                    if (strSubstring2.length() > 0) {
                                        try {
                                            fAbs = Float.parseFloat(strSubstring2);
                                        } catch (NumberFormatException unused2) {
                                        }
                                        if (fAbs > 0.0f) {
                                            c1308dM1371h3.f5213W = fAbs;
                                            c1308dM1371h3.f5214X = i9;
                                        }
                                    } else {
                                        fAbs = 0.0f;
                                        if (fAbs > 0.0f) {
                                        }
                                    }
                                } else {
                                    String strSubstring3 = str2.substring(i8, iIndexOf4);
                                    String strSubstring4 = str2.substring(iIndexOf4 + 1);
                                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                        try {
                                            float f6 = Float.parseFloat(strSubstring3);
                                            float f7 = Float.parseFloat(strSubstring4);
                                            if (f6 > 0.0f && f7 > 0.0f) {
                                                fAbs = i9 == 1 ? Math.abs(f7 / f6) : Math.abs(f6 / f7);
                                            }
                                        } catch (NumberFormatException unused3) {
                                        }
                                        if (fAbs > 0.0f) {
                                        }
                                    }
                                }
                            }
                            float f8 = c1346e.f5467H;
                            float[] fArr = c1308dM1371h3.f5238k0;
                            fArr[0] = f8;
                            fArr[1] = c1346e.f5468I;
                            c1308dM1371h3.f5234i0 = c1346e.f5469J;
                            c1308dM1371h3.f5236j0 = c1346e.f5470K;
                            int i39 = c1346e.f5485Z;
                            if (i39 >= 0 && i39 <= 3) {
                                c1308dM1371h3.f5249q = i39;
                            }
                            int i40 = c1346e.f5471L;
                            int i41 = c1346e.f5473N;
                            int i42 = c1346e.f5475P;
                            float f9 = c1346e.f5477R;
                            c1308dM1371h3.f5250r = i40;
                            c1308dM1371h3.f5253u = i41;
                            if (i42 == Integer.MAX_VALUE) {
                                i42 = 0;
                            }
                            c1308dM1371h3.f5254v = i42;
                            c1308dM1371h3.f5255w = f9;
                            if (f9 > 0.0f && f9 < 1.0f && i40 == 0) {
                                c1308dM1371h3.f5250r = 2;
                            }
                            int i43 = c1346e.f5472M;
                            int i44 = c1346e.f5474O;
                            int i45 = c1346e.f5476Q;
                            float f10 = c1346e.f5478S;
                            c1308dM1371h3.f5251s = i43;
                            c1308dM1371h3.f5256x = i44;
                            if (i45 == Integer.MAX_VALUE) {
                                i45 = 0;
                            }
                            c1308dM1371h3.f5257y = i45;
                            c1308dM1371h3.f5258z = f10;
                            if (f10 > 0.0f && f10 < 1.0f && i43 == 0) {
                                c1308dM1371h3.f5251s = 2;
                            }
                        }
                    }
                    i24++;
                    constraintLayout = this;
                    childCount3 = i3;
                }
            }
            if (z2) {
                c1309e.f5272r0.m1232H(c1309e);
            }
        }
        c1309e.f5277w0.getClass();
        m1374k(c1309e, this.f1558n, i, i2);
        int iM3170q = c1309e.m3170q();
        int iM3166k = c1309e.m3166k();
        boolean z5 = c1309e.f5263E0;
        boolean z6 = c1309e.f5264F0;
        C1347f c1347f = this.f1564t;
        int i46 = c1347f.f5532e;
        int iResolveSizeAndState = View.resolveSizeAndState(iM3170q + c1347f.f5531d, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(iM3166k + i46, i2, 0) & 16777215;
        int iMin = Math.min(this.f1555k, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f1556l, iResolveSizeAndState2);
        if (z5) {
            iMin |= 16777216;
        }
        if (z6) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C1308d c1308dM1371h = m1371h(view);
        if ((view instanceof C1357p) && !(c1308dM1371h instanceof C1312h)) {
            C1346e c1346e = (C1346e) view.getLayoutParams();
            C1312h c1312h = new C1312h();
            c1346e.f5517p0 = c1312h;
            c1346e.f5493d0 = true;
            c1312h.m3197S(c1346e.f5481V);
        }
        if (view instanceof AbstractC1344c) {
            AbstractC1344c abstractC1344c = (AbstractC1344c) view;
            abstractC1344c.m3261i();
            ((C1346e) view.getLayoutParams()).f5495e0 = true;
            ArrayList arrayList = this.f1551g;
            if (!arrayList.contains(abstractC1344c)) {
                arrayList.add(abstractC1344c);
            }
        }
        this.f1550f.put(view.getId(), view);
        this.f1557m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1550f.remove(view.getId());
        C1308d c1308dM1371h = m1371h(view);
        this.f1552h.f5271q0.remove(c1308dM1371h);
        c1308dM1371h.mo3145C();
        this.f1551g.remove(view);
        this.f1557m = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1557m = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1355n c1355n) {
        this.f1559o = c1355n;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1550f;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1556l) {
            return;
        }
        this.f1556l = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1555k) {
            return;
        }
        this.f1555k = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1554j) {
            return;
        }
        this.f1554j = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f1553i) {
            return;
        }
        this.f1553i = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1356o abstractC1356o) {
        C0057j c0057j = this.f1560p;
        if (c0057j != null) {
            c0057j.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1558n = i;
        C1309e c1309e = this.f1552h;
        c1309e.f5262D0 = i;
        C1298c.f5122q = c1309e.m3185W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        super(context, attributeSet, i);
        this.f1550f = new SparseArray();
        this.f1551g = new ArrayList(4);
        this.f1552h = new C1309e();
        this.f1553i = 0;
        this.f1554j = 0;
        this.f1555k = Integer.MAX_VALUE;
        this.f1556l = Integer.MAX_VALUE;
        this.f1557m = true;
        this.f1558n = 257;
        this.f1559o = null;
        this.f1560p = null;
        this.f1561q = -1;
        this.f1562r = new HashMap();
        this.f1563s = new SparseArray();
        this.f1564t = new C1347f(this, this);
        m1372i(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1346e c1346e = new C1346e(layoutParams);
        c1346e.f5486a = -1;
        c1346e.f5488b = -1;
        c1346e.f5490c = -1.0f;
        c1346e.f5492d = true;
        c1346e.f5494e = -1;
        c1346e.f5496f = -1;
        c1346e.f5498g = -1;
        c1346e.f5500h = -1;
        c1346e.f5502i = -1;
        c1346e.f5504j = -1;
        c1346e.f5506k = -1;
        c1346e.f5508l = -1;
        c1346e.f5510m = -1;
        c1346e.f5512n = -1;
        c1346e.f5514o = -1;
        c1346e.f5516p = -1;
        c1346e.f5518q = 0;
        c1346e.f5519r = 0.0f;
        c1346e.f5520s = -1;
        c1346e.f5521t = -1;
        c1346e.f5522u = -1;
        c1346e.f5523v = -1;
        c1346e.f5524w = Integer.MIN_VALUE;
        c1346e.f5525x = Integer.MIN_VALUE;
        c1346e.f5526y = Integer.MIN_VALUE;
        c1346e.f5527z = Integer.MIN_VALUE;
        c1346e.f5460A = Integer.MIN_VALUE;
        c1346e.f5461B = Integer.MIN_VALUE;
        c1346e.f5462C = Integer.MIN_VALUE;
        c1346e.f5463D = 0;
        c1346e.f5464E = 0.5f;
        c1346e.f5465F = 0.5f;
        c1346e.f5466G = null;
        c1346e.f5467H = -1.0f;
        c1346e.f5468I = -1.0f;
        c1346e.f5469J = 0;
        c1346e.f5470K = 0;
        c1346e.f5471L = 0;
        c1346e.f5472M = 0;
        c1346e.f5473N = 0;
        c1346e.f5474O = 0;
        c1346e.f5475P = 0;
        c1346e.f5476Q = 0;
        c1346e.f5477R = 1.0f;
        c1346e.f5478S = 1.0f;
        c1346e.f5479T = -1;
        c1346e.f5480U = -1;
        c1346e.f5481V = -1;
        c1346e.f5482W = false;
        c1346e.f5483X = false;
        c1346e.f5484Y = null;
        c1346e.f5485Z = 0;
        c1346e.f5487a0 = true;
        c1346e.f5489b0 = true;
        c1346e.f5491c0 = false;
        c1346e.f5493d0 = false;
        c1346e.f5495e0 = false;
        c1346e.f5497f0 = -1;
        c1346e.f5499g0 = -1;
        c1346e.f5501h0 = -1;
        c1346e.f5503i0 = -1;
        c1346e.f5505j0 = Integer.MIN_VALUE;
        c1346e.f5507k0 = Integer.MIN_VALUE;
        c1346e.f5509l0 = 0.5f;
        c1346e.f5517p0 = new C1308d();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) c1346e).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) c1346e).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) c1346e).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) c1346e).bottomMargin = marginLayoutParams.bottomMargin;
            c1346e.setMarginStart(marginLayoutParams.getMarginStart());
            c1346e.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (layoutParams instanceof C1346e) {
            C1346e c1346e2 = (C1346e) layoutParams;
            c1346e.f5486a = c1346e2.f5486a;
            c1346e.f5488b = c1346e2.f5488b;
            c1346e.f5490c = c1346e2.f5490c;
            c1346e.f5492d = c1346e2.f5492d;
            c1346e.f5494e = c1346e2.f5494e;
            c1346e.f5496f = c1346e2.f5496f;
            c1346e.f5498g = c1346e2.f5498g;
            c1346e.f5500h = c1346e2.f5500h;
            c1346e.f5502i = c1346e2.f5502i;
            c1346e.f5504j = c1346e2.f5504j;
            c1346e.f5506k = c1346e2.f5506k;
            c1346e.f5508l = c1346e2.f5508l;
            c1346e.f5510m = c1346e2.f5510m;
            c1346e.f5512n = c1346e2.f5512n;
            c1346e.f5514o = c1346e2.f5514o;
            c1346e.f5516p = c1346e2.f5516p;
            c1346e.f5518q = c1346e2.f5518q;
            c1346e.f5519r = c1346e2.f5519r;
            c1346e.f5520s = c1346e2.f5520s;
            c1346e.f5521t = c1346e2.f5521t;
            c1346e.f5522u = c1346e2.f5522u;
            c1346e.f5523v = c1346e2.f5523v;
            c1346e.f5524w = c1346e2.f5524w;
            c1346e.f5525x = c1346e2.f5525x;
            c1346e.f5526y = c1346e2.f5526y;
            c1346e.f5527z = c1346e2.f5527z;
            c1346e.f5460A = c1346e2.f5460A;
            c1346e.f5461B = c1346e2.f5461B;
            c1346e.f5462C = c1346e2.f5462C;
            c1346e.f5463D = c1346e2.f5463D;
            c1346e.f5464E = c1346e2.f5464E;
            c1346e.f5465F = c1346e2.f5465F;
            c1346e.f5466G = c1346e2.f5466G;
            c1346e.f5467H = c1346e2.f5467H;
            c1346e.f5468I = c1346e2.f5468I;
            c1346e.f5469J = c1346e2.f5469J;
            c1346e.f5470K = c1346e2.f5470K;
            c1346e.f5482W = c1346e2.f5482W;
            c1346e.f5483X = c1346e2.f5483X;
            c1346e.f5471L = c1346e2.f5471L;
            c1346e.f5472M = c1346e2.f5472M;
            c1346e.f5473N = c1346e2.f5473N;
            c1346e.f5475P = c1346e2.f5475P;
            c1346e.f5474O = c1346e2.f5474O;
            c1346e.f5476Q = c1346e2.f5476Q;
            c1346e.f5477R = c1346e2.f5477R;
            c1346e.f5478S = c1346e2.f5478S;
            c1346e.f5479T = c1346e2.f5479T;
            c1346e.f5480U = c1346e2.f5480U;
            c1346e.f5481V = c1346e2.f5481V;
            c1346e.f5487a0 = c1346e2.f5487a0;
            c1346e.f5489b0 = c1346e2.f5489b0;
            c1346e.f5491c0 = c1346e2.f5491c0;
            c1346e.f5493d0 = c1346e2.f5493d0;
            c1346e.f5497f0 = c1346e2.f5497f0;
            c1346e.f5499g0 = c1346e2.f5499g0;
            c1346e.f5501h0 = c1346e2.f5501h0;
            c1346e.f5503i0 = c1346e2.f5503i0;
            c1346e.f5505j0 = c1346e2.f5505j0;
            c1346e.f5507k0 = c1346e2.f5507k0;
            c1346e.f5509l0 = c1346e2.f5509l0;
            c1346e.f5484Y = c1346e2.f5484Y;
            c1346e.f5485Z = c1346e2.f5485Z;
            c1346e.f5517p0 = c1346e2.f5517p0;
        }
        return c1346e;
    }
}
