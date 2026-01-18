package p068h;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import it.deviato.spotifuck.R;
import java.lang.ref.WeakReference;
import p030Q0.HandlerC0341j;
import p032R0.ViewOnClickListenerC0367i;
import p065g.AbstractC0752a;

/* renamed from: h.h */
/* loaded from: classes.dex */
public final class C0837h {

    /* renamed from: A */
    public final int f3246A;

    /* renamed from: B */
    public final int f3247B;

    /* renamed from: C */
    public final int f3248C;

    /* renamed from: D */
    public final int f3249D;

    /* renamed from: E */
    public final boolean f3250E;

    /* renamed from: F */
    public final HandlerC0341j f3251F;

    /* renamed from: a */
    public final Context f3253a;

    /* renamed from: b */
    public final DialogInterfaceC0838i f3254b;

    /* renamed from: c */
    public final Window f3255c;

    /* renamed from: d */
    public CharSequence f3256d;

    /* renamed from: e */
    public CharSequence f3257e;

    /* renamed from: f */
    public AlertController$RecycleListView f3258f;

    /* renamed from: g */
    public View f3259g;

    /* renamed from: i */
    public Button f3261i;

    /* renamed from: j */
    public CharSequence f3262j;

    /* renamed from: k */
    public Message f3263k;

    /* renamed from: l */
    public Button f3264l;

    /* renamed from: m */
    public CharSequence f3265m;

    /* renamed from: n */
    public Message f3266n;

    /* renamed from: o */
    public Button f3267o;

    /* renamed from: p */
    public CharSequence f3268p;

    /* renamed from: q */
    public Message f3269q;

    /* renamed from: r */
    public NestedScrollView f3270r;

    /* renamed from: s */
    public Drawable f3271s;

    /* renamed from: t */
    public ImageView f3272t;

    /* renamed from: u */
    public TextView f3273u;

    /* renamed from: v */
    public TextView f3274v;

    /* renamed from: w */
    public View f3275w;

    /* renamed from: x */
    public ListAdapter f3276x;

    /* renamed from: z */
    public final int f3278z;

    /* renamed from: h */
    public boolean f3260h = false;

    /* renamed from: y */
    public int f3277y = -1;

    /* renamed from: G */
    public final ViewOnClickListenerC0367i f3252G = new ViewOnClickListenerC0367i(3, this);

    public C0837h(Context context, DialogInterfaceC0838i dialogInterfaceC0838i, Window window) {
        this.f3253a = context;
        this.f3254b = dialogInterfaceC0838i;
        this.f3255c = window;
        HandlerC0341j handlerC0341j = new HandlerC0341j(5);
        handlerC0341j.f898b = new WeakReference(dialogInterfaceC0838i);
        this.f3251F = handlerC0341j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0752a.f2741e, R.attr.alertDialogStyle, 0);
        this.f3278z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f3246A = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f3247B = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f3248C = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f3249D = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f3250E = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC0838i.m2115f().mo2071g(1);
    }

    /* renamed from: a */
    public static boolean m2110a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m2110a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m2111b(ViewGroup viewGroup, View view, View view2) {
        if (view != null) {
            view.setVisibility(viewGroup.canScrollVertically(-1) ? 0 : 4);
        }
        if (view2 != null) {
            view2.setVisibility(viewGroup.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: c */
    public static ViewGroup m2112c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: d */
    public final void m2113d(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f3251F.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f3268p = charSequence;
            this.f3269q = messageObtainMessage;
        } else if (i == -2) {
            this.f3265m = charSequence;
            this.f3266n = messageObtainMessage;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f3262j = charSequence;
            this.f3263k = messageObtainMessage;
        }
    }
}
