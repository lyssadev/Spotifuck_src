package p111y;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p105v.AbstractC1313i;
import p105v.C1308d;

/* renamed from: y.c */
/* loaded from: classes.dex */
public abstract class AbstractC1344c extends View {

    /* renamed from: f */
    public int[] f5452f;

    /* renamed from: g */
    public int f5453g;

    /* renamed from: h */
    public Context f5454h;

    /* renamed from: i */
    public AbstractC1313i f5455i;

    /* renamed from: j */
    public String f5456j;

    /* renamed from: k */
    public String f5457k;

    /* renamed from: l */
    public HashMap f5458l;

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3254a(String str) throws IllegalAccessException, IllegalArgumentException {
        Context context;
        int identifier;
        HashMap map;
        if (str == null || str.length() == 0 || (context = this.f5454h) == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = ((strTrim instanceof String) && (map = constraintLayout.f1562r) != null && map.containsKey(strTrim)) ? constraintLayout.f1562r.get(strTrim) : null;
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m3259f(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = AbstractC1358q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f5458l.put(Integer.valueOf(identifier), strTrim);
            m3255b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    /* renamed from: b */
    public final void m3255b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f5453g + 1;
        int[] iArr = this.f5452f;
        if (i2 > iArr.length) {
            this.f5452f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f5452f;
        int i3 = this.f5453g;
        iArr2[i3] = i;
        this.f5453g = i3 + 1;
    }

    /* renamed from: c */
    public final void m3256c(String str) {
        if (str == null || str.length() == 0 || this.f5454h == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C1346e) && strTrim.equals(((C1346e) layoutParams).f5484Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m3255b(childAt.getId());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m3257d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f5453g; i++) {
            View view = (View) constraintLayout.f1550f.get(this.f5452f[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: f */
    public final int m3259f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f5454h.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    public void mo3260g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1359r.f5663b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f5456j = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f5457k = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f5452f, this.f5453g);
    }

    /* renamed from: h */
    public abstract void mo1368h(C1308d c1308d, boolean z2);

    /* renamed from: i */
    public final void m3261i() {
        if (this.f5455i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1346e) {
            ((C1346e) layoutParams).f5517p0 = this.f5455i;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f5456j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f5457k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f5456j = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f5453g = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m3254a(str.substring(i));
                return;
            } else {
                m3254a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f5457k = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f5453g = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m3256c(str.substring(i));
                return;
            } else {
                m3256c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f5456j = null;
        this.f5453g = 0;
        for (int i : iArr) {
            m3255b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f5456j == null) {
            m3255b(i);
        }
    }

    /* renamed from: e */
    public void mo3258e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
