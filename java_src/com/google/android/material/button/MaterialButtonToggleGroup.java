package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.C0705f;
import it.deviato.spotifuck.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p008E0.AbstractC0079m;
import p008E0.C0067a;
import p018K0.C0142a;
import p018K0.C0151j;
import p018K0.C0152k;
import p023N.AbstractC0206Q;
import p028P0.AbstractC0322a;
import p074j0.C0944w;
import p094q0.AbstractC1241a;
import p108w0.C1334d;
import p108w0.C1335e;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: p */
    public static final /* synthetic */ int f2367p = 0;

    /* renamed from: f */
    public final ArrayList f2368f;

    /* renamed from: g */
    public final C0944w f2369g;

    /* renamed from: h */
    public final LinkedHashSet f2370h;

    /* renamed from: i */
    public final C1334d f2371i;

    /* renamed from: j */
    public Integer[] f2372j;

    /* renamed from: k */
    public boolean f2373k;

    /* renamed from: l */
    public boolean f2374l;

    /* renamed from: m */
    public boolean f2375m;

    /* renamed from: n */
    public final int f2376n;

    /* renamed from: o */
    public HashSet f2377o;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0322a.m923a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f2368f = new ArrayList();
        this.f2369g = new C0944w(this);
        this.f2370h = new LinkedHashSet();
        this.f2371i = new C1334d(this);
        this.f2373k = false;
        this.f2377o = new HashSet();
        TypedArray typedArrayM321f = AbstractC0079m.m321f(getContext(), attributeSet, AbstractC1241a.f4947k, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM321f.getBoolean(3, false));
        this.f2376n = typedArrayM321f.getResourceId(1, -1);
        this.f2375m = typedArrayM321f.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM321f.getBoolean(0, true));
        typedArrayM321f.recycle();
        WeakHashMap weakHashMap = AbstractC0206Q.f560a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m1872c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m1872c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m1872c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0206Q.f560a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2369g);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void m1870a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m1871b(materialButton.getId(), materialButton.f2364t);
        C0152k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2368f.add(new C1335e(shapeAppearanceModel.f448e, shapeAppearanceModel.f451h, shapeAppearanceModel.f449f, shapeAppearanceModel.f450g));
        materialButton.setEnabled(isEnabled());
        AbstractC0206Q.m681p(materialButton, new C0067a(4, this));
    }

    /* renamed from: b */
    public final void m1871b(int i, boolean z2) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f2377o);
        if (z2 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f2374l && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f2375m || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m1873d(hashSet);
    }

    /* renamed from: c */
    public final boolean m1872c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: d */
    public final void m1873d(Set set) {
        HashSet hashSet = this.f2377o;
        this.f2377o = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f2373k = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f2373k = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it2 = this.f2370h.iterator();
                while (it2.hasNext()) {
                    ((C0705f) it2.next()).m1952a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2371i);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f2372j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m1874e() {
        C1335e c1335e;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                C0151j c0151jM527e = materialButton.getShapeAppearanceModel().m527e();
                C1335e c1335e2 = (C1335e) this.f2368f.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    C0142a c0142a = C1335e.f5428e;
                    if (i == firstVisibleChildIndex) {
                        c1335e = z2 ? AbstractC0079m.m320e(this) ? new C1335e(c0142a, c0142a, c1335e2.f5430b, c1335e2.f5431c) : new C1335e(c1335e2.f5429a, c1335e2.f5432d, c0142a, c0142a) : new C1335e(c1335e2.f5429a, c0142a, c1335e2.f5430b, c0142a);
                    } else if (i == lastVisibleChildIndex) {
                        c1335e = z2 ? AbstractC0079m.m320e(this) ? new C1335e(c1335e2.f5429a, c1335e2.f5432d, c0142a, c0142a) : new C1335e(c0142a, c0142a, c1335e2.f5430b, c1335e2.f5431c) : new C1335e(c0142a, c1335e2.f5432d, c0142a, c1335e2.f5431c);
                    } else {
                        c1335e2 = null;
                    }
                    c1335e2 = c1335e;
                }
                if (c1335e2 == null) {
                    c0151jM527e.f436e = new C0142a(0.0f);
                    c0151jM527e.f437f = new C0142a(0.0f);
                    c0151jM527e.f438g = new C0142a(0.0f);
                    c0151jM527e.f439h = new C0142a(0.0f);
                } else {
                    c0151jM527e.f436e = c1335e2.f5429a;
                    c0151jM527e.f439h = c1335e2.f5432d;
                    c0151jM527e.f437f = c1335e2.f5430b;
                    c0151jM527e.f438g = c1335e2.f5431c;
                }
                materialButton.setShapeAppearanceModel(c0151jM527e.m522a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f2374l || this.f2377o.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f2377o.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f2377o.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f2372j;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f2376n;
        if (i != -1) {
            m1873d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f2374l ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m1874e();
        m1870a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f2368f.remove(iIndexOfChild);
        }
        m1874e();
        m1870a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f2375m = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f2374l != z2) {
            this.f2374l = z2;
            m1873d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f2374l ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
