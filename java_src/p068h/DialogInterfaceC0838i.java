package p068h;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.activity.DialogC0533o;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import it.deviato.spotifuck.R;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;
import p007E.C0057j;
import p023N.AbstractC0196G;
import p023N.AbstractC0206Q;
import p023N.InterfaceC0235k;
import p032R0.ViewOnClickListenerC0367i;
import p082m.C0986j;
import p087o.C1201z0;
import p091p0.AbstractC1230a;

/* renamed from: h.i */
/* loaded from: classes.dex */
public final class DialogInterfaceC0838i extends DialogC0533o implements DialogInterface, InterfaceC0842m {

    /* renamed from: i */
    public LayoutInflaterFactory2C0819D f3279i;

    /* renamed from: j */
    public final C0820E f3280j;

    /* renamed from: k */
    public final C0837h f3281k;

    /* JADX WARN: Type inference failed for: r2v2, types: [h.E] */
    public DialogInterfaceC0838i(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int iM2114h = m2114h(contextThemeWrapper, i);
        if (iM2114h == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = iM2114h;
        }
        super(contextThemeWrapper, i2);
        this.f3280j = new InterfaceC0235k() { // from class: h.E
            @Override // p023N.InterfaceC0235k
            /* renamed from: e */
            public final boolean mo110e(KeyEvent keyEvent) {
                return this.f3160f.m2118j(keyEvent);
            }
        };
        AbstractC0848s abstractC0848sM2115f = m2115f();
        if (iM2114h == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            iM2114h = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0819D) abstractC0848sM2115f).f3134Z = iM2114h;
        abstractC0848sM2115f.mo2067b();
        this.f3281k = new C0837h(getContext(), this, getWindow());
    }

    /* renamed from: h */
    public static int m2114h(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.DialogC0533o, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        m1306e();
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2115f();
        layoutInflaterFactory2C0819D.m2083u();
        ((ViewGroup) layoutInflaterFactory2C0819D.f3115G.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0819D.f3151r.m2142a(layoutInflaterFactory2C0819D.f3150q.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m2115f().mo2068c();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC1230a.m2860C(this.f3280j, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: f */
    public final AbstractC0848s m2115f() {
        if (this.f3279i == null) {
            ExecutorC0846q executorC0846q = AbstractC0848s.f3297f;
            this.f3279i = new LayoutInflaterFactory2C0819D(getContext(), getWindow(), this, this);
        }
        return this.f3279i;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2115f();
        layoutInflaterFactory2C0819D.m2083u();
        return layoutInflaterFactory2C0819D.f3150q.findViewById(i);
    }

    /* renamed from: g */
    public final void m2116g(Bundle bundle) {
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2115f();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C0819D.f3149p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C0819D);
        } else {
            boolean z2 = layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0819D;
        }
        super.onCreate(bundle);
        m2115f().mo2067b();
    }

    /* renamed from: i */
    public final void m2117i(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2115f().mo2075k(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2115f();
        if (layoutInflaterFactory2C0819D.f3153t != null) {
            layoutInflaterFactory2C0819D.m2087z();
            layoutInflaterFactory2C0819D.f3153t.getClass();
            layoutInflaterFactory2C0819D.m2059A(0);
        }
    }

    /* renamed from: j */
    public final boolean m2118j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.DialogC0533o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        int i2 = 0;
        m2116g(bundle);
        C0837h c0837h = this.f3281k;
        c0837h.f3254b.setContentView(c0837h.f3278z);
        Window window = c0837h.f3255c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = c0837h.f3259g;
        if (view == null) {
            view = null;
        }
        boolean z2 = view != null;
        if (!z2 || !C0837h.m2110a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c0837h.f3260h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c0837h.f3258f != null) {
                ((LinearLayout.LayoutParams) ((C1201z0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM2112c = C0837h.m2112c(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM2112c2 = C0837h.m2112c(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM2112c3 = C0837h.m2112c(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0837h.f3270r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0837h.f3270r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM2112c2.findViewById(android.R.id.message);
        c0837h.f3274v = textView;
        if (textView != null) {
            CharSequence charSequence = c0837h.f3257e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                c0837h.f3270r.removeView(c0837h.f3274v);
                if (c0837h.f3258f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) c0837h.f3270r.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(c0837h.f3270r);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(c0837h.f3258f, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM2112c2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM2112c3.findViewById(android.R.id.button1);
        c0837h.f3261i = button;
        ViewOnClickListenerC0367i viewOnClickListenerC0367i = c0837h.f3252G;
        button.setOnClickListener(viewOnClickListenerC0367i);
        if (TextUtils.isEmpty(c0837h.f3262j)) {
            c0837h.f3261i.setVisibility(8);
            i = 0;
        } else {
            c0837h.f3261i.setText(c0837h.f3262j);
            c0837h.f3261i.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupM2112c3.findViewById(android.R.id.button2);
        c0837h.f3264l = button2;
        button2.setOnClickListener(viewOnClickListenerC0367i);
        if (TextUtils.isEmpty(c0837h.f3265m)) {
            c0837h.f3264l.setVisibility(8);
        } else {
            c0837h.f3264l.setText(c0837h.f3265m);
            c0837h.f3264l.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupM2112c3.findViewById(android.R.id.button3);
        c0837h.f3267o = button3;
        button3.setOnClickListener(viewOnClickListenerC0367i);
        if (TextUtils.isEmpty(c0837h.f3268p)) {
            c0837h.f3267o.setVisibility(8);
        } else {
            c0837h.f3267o.setText(c0837h.f3268p);
            c0837h.f3267o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0837h.f3253a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0837h.f3261i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0837h.f3264l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0837h.f3267o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupM2112c3.setVisibility(8);
        }
        if (c0837h.f3275w != null) {
            viewGroupM2112c.addView(c0837h.f3275w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0837h.f3272t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0837h.f3256d) || !c0837h.f3250E) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0837h.f3272t.setVisibility(8);
                viewGroupM2112c.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0837h.f3273u = textView2;
                textView2.setText(c0837h.f3256d);
                Drawable drawable = c0837h.f3271s;
                if (drawable != null) {
                    c0837h.f3272t.setImageDrawable(drawable);
                } else {
                    c0837h.f3273u.setPadding(c0837h.f3272t.getPaddingLeft(), c0837h.f3272t.getPaddingTop(), c0837h.f3272t.getPaddingRight(), c0837h.f3272t.getPaddingBottom());
                    c0837h.f3272t.setVisibility(8);
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i3 = (viewGroupM2112c == null || viewGroupM2112c.getVisibility() == 8) ? 0 : 1;
        boolean z4 = viewGroupM2112c3.getVisibility() != 8;
        if (!z4 && (viewFindViewById = viewGroupM2112c2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i3 != 0) {
            NestedScrollView nestedScrollView2 = c0837h.f3270r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (c0837h.f3257e == null && c0837h.f3258f == null) ? null : viewGroupM2112c.findViewById(R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM2112c2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0837h.f3258f;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z4 || i3 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1338f, alertController$RecycleListView.getPaddingRight(), z4 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1339g);
            }
        }
        if (!z3) {
            View view2 = c0837h.f3258f;
            if (view2 == null) {
                view2 = c0837h.f3270r;
            }
            if (view2 != null) {
                int i4 = i3 | (z4 ? 2 : 0);
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 23) {
                    WeakHashMap weakHashMap = AbstractC0206Q.f560a;
                    if (i5 >= 23) {
                        AbstractC0196G.m624d(view2, i4, 3);
                    }
                    if (viewFindViewById11 != null) {
                        viewGroupM2112c2.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupM2112c2.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i4 & 1) == 0) {
                        viewGroupM2112c2.removeView(viewFindViewById11);
                        viewFindViewById11 = null;
                    }
                    if (viewFindViewById12 != null && (2 & i4) == 0) {
                        viewGroupM2112c2.removeView(viewFindViewById12);
                        viewFindViewById12 = null;
                    }
                    if (viewFindViewById11 != null || viewFindViewById12 != null) {
                        if (c0837h.f3257e != null) {
                            c0837h.f3270r.setOnScrollChangeListener(new C0057j(viewFindViewById11, viewFindViewById12, 13));
                            c0837h.f3270r.post(new RunnableC0830a(c0837h, viewFindViewById11, viewFindViewById12, i2));
                        } else {
                            AlertController$RecycleListView alertController$RecycleListView2 = c0837h.f3258f;
                            if (alertController$RecycleListView2 != null) {
                                alertController$RecycleListView2.setOnScrollListener(new C0831b(viewFindViewById11, viewFindViewById12));
                                c0837h.f3258f.post(new RunnableC0830a(c0837h, viewFindViewById11, viewFindViewById12, 1));
                            } else {
                                if (viewFindViewById11 != null) {
                                    viewGroupM2112c2.removeView(viewFindViewById11);
                                }
                                if (viewFindViewById12 != null) {
                                    viewGroupM2112c2.removeView(viewFindViewById12);
                                }
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = c0837h.f3258f;
        if (alertController$RecycleListView3 == null || (listAdapter = c0837h.f3276x) == null) {
            return;
        }
        alertController$RecycleListView3.setAdapter(listAdapter);
        int i6 = c0837h.f3277y;
        if (i6 > -1) {
            alertController$RecycleListView3.setItemChecked(i6, true);
            alertController$RecycleListView3.setSelection(i6);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3281k.f3270r;
        if (nestedScrollView == null || !nestedScrollView.m1401i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3281k.f3270r;
        if (nestedScrollView == null || !nestedScrollView.m1401i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.DialogC0533o, android.app.Dialog
    public final void onStop() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onStop();
        LayoutInflaterFactory2C0819D layoutInflaterFactory2C0819D = (LayoutInflaterFactory2C0819D) m2115f();
        layoutInflaterFactory2C0819D.m2087z();
        C0829N c0829n = layoutInflaterFactory2C0819D.f3153t;
        if (c0829n != null) {
            c0829n.f3193E = false;
            C0986j c0986j = c0829n.f3192D;
            if (c0986j != null) {
                c0986j.m2479a();
            }
        }
    }

    @Override // androidx.activity.DialogC0533o, android.app.Dialog
    public final void setContentView(int i) {
        m1306e();
        m2115f().mo2072h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m2115f().mo2075k(getContext().getString(i));
    }

    @Override // androidx.activity.DialogC0533o, android.app.Dialog
    public final void setContentView(View view) {
        m1306e();
        m2115f().mo2073i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m2117i(charSequence);
        C0837h c0837h = this.f3281k;
        c0837h.f3256d = charSequence;
        TextView textView = c0837h.f3273u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.activity.DialogC0533o, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m1306e();
        m2115f().mo2074j(view, layoutParams);
    }
}
