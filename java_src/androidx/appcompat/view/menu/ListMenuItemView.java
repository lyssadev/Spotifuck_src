package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0513t;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import p065g.AbstractC0752a;
import p084n.C1037n;
import p084n.InterfaceC1048y;
import p084n.MenuC1035l;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1048y, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f */
    public C1037n f1353f;

    /* renamed from: g */
    public ImageView f1354g;

    /* renamed from: h */
    public RadioButton f1355h;

    /* renamed from: i */
    public TextView f1356i;

    /* renamed from: j */
    public CheckBox f1357j;

    /* renamed from: k */
    public TextView f1358k;

    /* renamed from: l */
    public ImageView f1359l;

    /* renamed from: m */
    public ImageView f1360m;

    /* renamed from: n */
    public LinearLayout f1361n;

    /* renamed from: o */
    public final Drawable f1362o;

    /* renamed from: p */
    public final int f1363p;

    /* renamed from: q */
    public final Context f1364q;

    /* renamed from: r */
    public boolean f1365r;

    /* renamed from: s */
    public final Drawable f1366s;

    /* renamed from: t */
    public final boolean f1367t;

    /* renamed from: u */
    public LayoutInflater f1368u;

    /* renamed from: v */
    public boolean f1369v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0513t c0513tM1223A = C0513t.m1223A(getContext(), attributeSet, AbstractC0752a.f2754r, R.attr.listMenuViewStyle);
        this.f1362o = c0513tM1223A.m1240o(5);
        TypedArray typedArray = (TypedArray) c0513tM1223A.f1246c;
        this.f1363p = typedArray.getResourceId(1, -1);
        this.f1365r = typedArray.getBoolean(7, false);
        this.f1364q = context;
        this.f1366s = c0513tM1223A.m1240o(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1367t = typedArrayObtainStyledAttributes.hasValue(0);
        c0513tM1223A.m1228C();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1368u == null) {
            this.f1368u = LayoutInflater.from(getContext());
        }
        return this.f1368u;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1359l;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    @Override // p084n.InterfaceC1048y
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1313a(C1037n c1037n) {
        boolean z2;
        int i;
        String string;
        boolean z3;
        this.f1353f = c1037n;
        setVisibility(c1037n.isVisible() ? 0 : 8);
        setTitle(c1037n.f4292e);
        setCheckable(c1037n.isCheckable());
        if (c1037n.f4301n.mo2567o()) {
            if ((c1037n.f4301n.mo2566n() ? c1037n.f4297j : c1037n.f4295h) != 0) {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        c1037n.f4301n.mo2566n();
        if (z2) {
            C1037n c1037n2 = this.f1353f;
            if (c1037n2.f4301n.mo2567o()) {
                if ((c1037n2.f4301n.mo2566n() ? c1037n2.f4297j : c1037n2.f4295h) != 0) {
                    z3 = true;
                }
                if (z3) {
                }
            } else {
                z3 = false;
                i = z3 ? 0 : 8;
            }
        }
        if (i == 0) {
            TextView textView = this.f1358k;
            C1037n c1037n3 = this.f1353f;
            char c2 = c1037n3.f4301n.mo2566n() ? c1037n3.f4297j : c1037n3.f4295h;
            if (c2 == 0) {
                string = "";
            } else {
                MenuC1035l menuC1035l = c1037n3.f4301n;
                Resources resources = menuC1035l.f4258a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(menuC1035l.f4258a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i2 = menuC1035l.mo2566n() ? c1037n3.f4298k : c1037n3.f4296i;
                C1037n.m2595c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb);
                C1037n.m2595c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb);
                C1037n.m2595c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb);
                C1037n.m2595c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb);
                C1037n.m2595c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb);
                C1037n.m2595c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb);
                if (c2 == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c2 == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c2 != ' ') {
                    sb.append(c2);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f1358k.getVisibility() != i) {
            this.f1358k.setVisibility(i);
        }
        setIcon(c1037n.getIcon());
        setEnabled(c1037n.isEnabled());
        setSubMenuArrowVisible(c1037n.hasSubMenu());
        setContentDescription(c1037n.f4304q);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1360m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1360m.getLayoutParams();
        rect.top = this.f1360m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // p084n.InterfaceC1048y
    public C1037n getItemData() {
        return this.f1353f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1362o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1356i = textView;
        int i = this.f1363p;
        if (i != -1) {
            textView.setTextAppearance(this.f1364q, i);
        }
        this.f1358k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1359l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1366s);
        }
        this.f1360m = (ImageView) findViewById(R.id.group_divider);
        this.f1361n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1354g != null && this.f1365r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1354g.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1355h == null && this.f1357j == null) {
            return;
        }
        if ((this.f1353f.f4311x & 4) != 0) {
            if (this.f1355h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1355h = radioButton;
                LinearLayout linearLayout = this.f1361n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1355h;
            view = this.f1357j;
        } else {
            if (this.f1357j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1357j = checkBox;
                LinearLayout linearLayout2 = this.f1361n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1357j;
            view = this.f1355h;
        }
        if (z2) {
            compoundButton.setChecked(this.f1353f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1357j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1355h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1353f.f4311x & 4) != 0) {
            if (this.f1355h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1355h = radioButton;
                LinearLayout linearLayout = this.f1361n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1355h;
        } else {
            if (this.f1357j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1357j = checkBox;
                LinearLayout linearLayout2 = this.f1361n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1357j;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1369v = z2;
        this.f1365r = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1360m;
        if (imageView != null) {
            imageView.setVisibility((this.f1367t || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1353f.f4301n.getClass();
        boolean z2 = this.f1369v;
        if (z2 || this.f1365r) {
            ImageView imageView = this.f1354g;
            if (imageView == null && drawable == null && !this.f1365r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1354g = imageView2;
                LinearLayout linearLayout = this.f1361n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1365r) {
                this.f1354g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1354g;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1354g.getVisibility() != 0) {
                this.f1354g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1356i.getVisibility() != 8) {
                this.f1356i.setVisibility(8);
            }
        } else {
            this.f1356i.setText(charSequence);
            if (this.f1356i.getVisibility() != 0) {
                this.f1356i.setVisibility(0);
            }
        }
    }
}
