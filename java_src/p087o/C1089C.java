package p087o;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.support.v4.media.session.C0513t;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.emoji2.text.C0555j;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000A.C0001b;
import p007E.C0057j;
import p010G.C0102i;
import p010G.InterfaceC0101h;
import p043X.C0428b;
import p043X.C0431e;
import p043X.C0434h;
import p043X.C0435i;
import p065g.AbstractC0752a;
import p091p0.AbstractC1230a;

/* renamed from: o.C */
/* loaded from: classes.dex */
public class C1089C {

    /* renamed from: d */
    public static final int[] f4449d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final /* synthetic */ int f4450a = 2;

    /* renamed from: b */
    public View f4451b;

    /* renamed from: c */
    public Object f4452c;

    public /* synthetic */ C1089C() {
    }

    /* renamed from: a */
    public KeyListener m2687a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0057j) ((C0001b) this.f4452c).f2g).getClass();
        if (keyListener instanceof C0431e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0431e(keyListener);
    }

    /* renamed from: b */
    public void mo2688b(AttributeSet attributeSet, int i) {
        switch (this.f4450a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f4451b;
                C0513t c0513tM1223A = C0513t.m1223A(absSeekBar.getContext(), attributeSet, f4449d, i);
                Drawable drawableM1241p = c0513tM1223A.m1241p(0);
                if (drawableM1241p != null) {
                    if (drawableM1241p instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM1241p;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM2691e = m2691e(animationDrawable.getFrame(i2), true);
                            drawableM2691e.setLevel(10000);
                            animationDrawable2.addFrame(drawableM2691e, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM1241p = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM1241p);
                }
                Drawable drawableM1241p2 = c0513tM1223A.m1241p(1);
                if (drawableM1241p2 != null) {
                    absSeekBar.setProgressDrawable(m2691e(drawableM1241p2, false));
                }
                c0513tM1223A.m1228C();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f4451b).getContext().obtainStyledAttributes(attributeSet, AbstractC0752a.f2745i, i, 0);
                try {
                    boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
                    typedArrayObtainStyledAttributes.recycle();
                    m2690d(z2);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    /* renamed from: c */
    public C0428b m2689c(InputConnection inputConnection, EditorInfo editorInfo) {
        C0001b c0001b = (C0001b) this.f4452c;
        if (inputConnection == null) {
            c0001b.getClass();
            inputConnection = null;
        } else {
            C0057j c0057j = (C0057j) c0001b.f2g;
            c0057j.getClass();
            if (!(inputConnection instanceof C0428b)) {
                inputConnection = new C0428b((EditText) c0057j.f122g, inputConnection, editorInfo);
            }
        }
        return (C0428b) inputConnection;
    }

    /* renamed from: d */
    public void m2690d(boolean z2) {
        C0435i c0435i = (C0435i) ((C0057j) ((C0001b) this.f4452c).f2g).f123h;
        if (c0435i.f1096h != z2) {
            if (c0435i.f1095g != null) {
                C0555j c0555jM1436a = C0555j.m1436a();
                C0434h c0434h = c0435i.f1095g;
                c0555jM1436a.getClass();
                AbstractC1230a.m2892j("initCallback cannot be null", c0434h);
                ReentrantReadWriteLock reentrantReadWriteLock = c0555jM1436a.f1651a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0555jM1436a.f1652b.remove(c0434h);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0435i.f1096h = z2;
            if (z2) {
                C0435i.m1092a(c0435i.f1094f, C0555j.m1436a().m1437b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public Drawable m2691e(Drawable drawable, boolean z2) {
        if (drawable instanceof InterfaceC0101h) {
            C0102i c0102i = (C0102i) ((InterfaceC0101h) drawable);
            Drawable drawable2 = c0102i.f281k;
            if (drawable2 != null) {
                c0102i.m384h(m2691e(drawable2, z2));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m2691e(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        AbstractC1087B.m2685a(layerDrawable, layerDrawable2, i2);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f4452c) == null) {
                    this.f4452c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C1089C(AbsSeekBar absSeekBar) {
        this.f4451b = absSeekBar;
    }

    public C1089C(EditText editText) {
        this.f4451b = editText;
        this.f4452c = new C0001b(editText);
    }
}
