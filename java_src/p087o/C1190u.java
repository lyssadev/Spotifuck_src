package p087o;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import it.deviato.spotifuck.R;
import p000A.C0001b;
import p023N.AbstractC0206Q;
import p023N.C0221d;
import p023N.C0225f;
import p023N.InterfaceC0219c;
import p023N.InterfaceC0253t;
import p024N0.C0283k;
import p033S.AbstractC0376c;
import p033S.C0377d;
import p033S.C0378e;
import p035T.C0402s;
import p035T.InterfaceC0404u;
import p036T0.AbstractC0411g;
import p074j0.C0913b;
import p091p0.AbstractC1230a;

/* renamed from: o.u */
/* loaded from: classes.dex */
public class C1190u extends EditText implements InterfaceC0253t, InterfaceC0404u {

    /* renamed from: f */
    public final C0913b f4730f;

    /* renamed from: g */
    public final C1134Z f4731g;

    /* renamed from: h */
    public final C1089C f4732h;

    /* renamed from: i */
    public final C0402s f4733i;

    /* renamed from: j */
    public final C1089C f4734j;

    /* renamed from: k */
    public C1188t f4735k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC1127V0.m2746a(context);
        AbstractC1125U0.m2741a(this, getContext());
        C0913b c0913b = new C0913b(this);
        this.f4730f = c0913b;
        c0913b.m2343k(attributeSet, R.attr.editTextStyle);
        C1134Z c1134z = new C1134Z(this);
        this.f4731g = c1134z;
        c1134z.m2760f(attributeSet, R.attr.editTextStyle);
        c1134z.m2757b();
        C1089C c1089c = new C1089C();
        c1089c.f4451b = this;
        this.f4732h = c1089c;
        this.f4733i = new C0402s();
        C1089C c1089c2 = new C1089C(this);
        this.f4734j = c1089c2;
        c1089c2.mo2688b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM2687a = c1089c2.m2687a(keyListener);
        if (keyListenerM2687a == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM2687a);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C1188t getSuperCaller() {
        if (this.f4735k == null) {
            this.f4735k = new C1188t(this);
        }
        return this.f4735k;
    }

    @Override // p023N.InterfaceC0253t
    /* renamed from: a */
    public final C0225f mo793a(C0225f c0225f) {
        return this.f4733i.m1017a(this, c0225f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0913b c0913b = this.f4730f;
        if (c0913b != null) {
            c0913b.m2333a();
        }
        C1134Z c1134z = this.f4731g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1230a.m2869H0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0913b c0913b = this.f4730f;
        if (c0913b != null) {
            return c0913b.m2340h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0913b c0913b = this.f4730f;
        if (c0913b != null) {
            return c0913b.m2341i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4731g.m2758d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4731g.m2759e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1089C c1089c;
        if (Build.VERSION.SDK_INT >= 28 || (c1089c = this.f4732h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1089c.f4452c;
        return textClassifier == null ? AbstractC1120S.m2740a((TextView) c1089c.f4451b) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[PHI: r1
      0x0056: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x0069, B:22:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        String[] strArrM672g;
        String[] stringArray;
        InputConnection c0378e;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f4731g.getClass();
        C1134Z.m2755h(editorInfo, inputConnectionOnCreateInputConnection, this);
        AbstractC0411g.m1047z(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && (i = Build.VERSION.SDK_INT) <= 30 && (strArrM672g = AbstractC0206Q.m672g(this)) != null) {
            if (i >= 25) {
                editorInfo.contentMimeTypes = strArrM672g;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrM672g);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrM672g);
            }
            C0283k c0283k = new C0283k(this);
            if (i >= 25) {
                c0378e = new C0377d(inputConnectionOnCreateInputConnection, c0283k);
            } else {
                String[] strArr = AbstractC0376c.f965a;
                if (i >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                    if (strArr.length != 0) {
                        c0378e = new C0378e(inputConnectionOnCreateInputConnection, c0283k);
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                        }
                    }
                    if (strArr.length != 0) {
                    }
                }
            }
            inputConnectionOnCreateInputConnection = c0378e;
        }
        return this.f4734j.m2689c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean zM2694a = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && AbstractC0206Q.m672g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zM2694a = AbstractC1095F.m2694a(dragEvent, this, activity);
            }
        }
        if (zM2694a) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0219c c0001b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || AbstractC0206Q.m672g(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                c0001b = new C0001b(primaryClip, 1);
            } else {
                C0221d c0221d = new C0221d();
                c0221d.f583g = primaryClip;
                c0221d.f584h = 1;
                c0001b = c0221d;
            }
            c0001b.mo51p(i == 16908322 ? 0 : 1);
            AbstractC0206Q.m677l(this, c0001b.mo45j());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0913b c0913b = this.f4730f;
        if (c0913b != null) {
            c0913b.m2345m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0913b c0913b = this.f4730f;
        if (c0913b != null) {
            c0913b.m2346n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4731g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1134Z c1134z = this.f4731g;
        if (c1134z != null) {
            c1134z.m2757b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1230a.m2874K0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f4734j.m2690d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4734j.m2687a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0913b c0913b = this.f4730f;
        if (c0913b != null) {
            c0913b.m2351s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0913b c0913b = this.f4730f;
        if (c0913b != null) {
            c0913b.m2352t(mode);
        }
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1134Z c1134z = this.f4731g;
        c1134z.m2765l(colorStateList);
        c1134z.m2757b();
    }

    @Override // p035T.InterfaceC0404u
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1134Z c1134z = this.f4731g;
        c1134z.m2766m(mode);
        c1134z.m2757b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1134Z c1134z = this.f4731g;
        if (c1134z != null) {
            c1134z.m2761g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1089C c1089c;
        if (Build.VERSION.SDK_INT >= 28 || (c1089c = this.f4732h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1089c.f4452c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
