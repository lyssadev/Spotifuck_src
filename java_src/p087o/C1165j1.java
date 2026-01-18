package p087o;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import it.deviato.spotifuck.R;

/* renamed from: o.j1 */
/* loaded from: classes.dex */
public final class C1165j1 {

    /* renamed from: a */
    public final Context f4656a;

    /* renamed from: b */
    public final View f4657b;

    /* renamed from: c */
    public final TextView f4658c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f4659d;

    /* renamed from: e */
    public final Rect f4660e;

    /* renamed from: f */
    public final int[] f4661f;

    /* renamed from: g */
    public final int[] f4662g;

    public C1165j1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f4659d = layoutParams;
        this.f4660e = new Rect();
        this.f4661f = new int[2];
        this.f4662g = new int[2];
        this.f4656a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f4657b = viewInflate;
        this.f4658c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(C1165j1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
