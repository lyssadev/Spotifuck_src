package p085n0;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import it.deviato.spotifuck.R;
import java.util.HashMap;
import p018K0.C0146e;

/* renamed from: n0.h */
/* loaded from: classes.dex */
public final class C1065h extends AbstractC1070m {

    /* renamed from: B */
    public static final String[] f4379B = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: A */
    public final int f4380A;

    public C1065h(int i) {
        this();
        this.f4380A = i;
    }

    /* renamed from: I */
    public static void m2638I(C1078u c1078u) {
        int visibility = c1078u.f4429b.getVisibility();
        HashMap map = c1078u.f4428a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = c1078u.f4429b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: K */
    public static float m2639K(C1078u c1078u, float f2) {
        Float f3;
        return (c1078u == null || (f3 = (Float) c1078u.f4428a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1057H m2640L(C1078u c1078u, C1078u c1078u2) {
        C1057H c1057h = new C1057H();
        c1057h.f4350a = false;
        c1057h.f4351b = false;
        if (c1078u != null) {
            HashMap map = c1078u.f4428a;
            if (map.containsKey("android:visibility:visibility")) {
                c1057h.f4352c = ((Integer) map.get("android:visibility:visibility")).intValue();
                c1057h.f4354e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                c1057h.f4352c = -1;
                c1057h.f4354e = null;
            }
        }
        if (c1078u2 != null) {
            HashMap map2 = c1078u2.f4428a;
            if (map2.containsKey("android:visibility:visibility")) {
                c1057h.f4353d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                c1057h.f4355f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                c1057h.f4353d = -1;
                c1057h.f4355f = null;
            }
        }
        if (c1078u != null && c1078u2 != null) {
            int i = c1057h.f4352c;
            int i2 = c1057h.f4353d;
            if (i == i2 && c1057h.f4354e == c1057h.f4355f) {
                return c1057h;
            }
            if (i != i2) {
                if (i == 0) {
                    c1057h.f4351b = false;
                    c1057h.f4350a = true;
                } else if (i2 == 0) {
                    c1057h.f4351b = true;
                    c1057h.f4350a = true;
                }
            } else if (c1057h.f4355f == null) {
                c1057h.f4351b = false;
                c1057h.f4350a = true;
            } else if (c1057h.f4354e == null) {
                c1057h.f4351b = true;
                c1057h.f4350a = true;
            }
        } else if (c1078u == null && c1057h.f4353d == 0) {
            c1057h.f4351b = true;
            c1057h.f4350a = true;
        } else if (c1078u2 == null && c1057h.f4352c == 0) {
            c1057h.f4351b = false;
            c1057h.f4350a = true;
        }
        return c1057h;
    }

    /* renamed from: J */
    public final ObjectAnimator m2641J(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        AbstractC1080w.f4431a.mo504o(view, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC1080w.f4432b, f3);
        C1064g c1064g = new C1064g(view);
        objectAnimatorOfFloat.addListener(c1064g);
        m2654o().m2648a(c1064g);
        return objectAnimatorOfFloat;
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: d */
    public final void mo2626d(C1078u c1078u) {
        m2638I(c1078u);
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: g */
    public final void mo2628g(C1078u c1078u) {
        m2638I(c1078u);
        View view = c1078u.f4429b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC1080w.f4431a.mo499f(view)) : Float.valueOf(0.0f);
        }
        c1078u.f4428a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (m2640L(m2653n(r3, false), m2655r(r3, false)).f4350a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0204  */
    @Override // p085n0.AbstractC1070m
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator mo2636k(FrameLayout frameLayout, C1078u c1078u, C1078u c1078u2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        View view;
        boolean z2;
        int i;
        View view2;
        View view3;
        ViewGroup viewGroup;
        int i2;
        Bitmap bitmapCreateBitmap;
        int i3 = this.f4380A;
        C1057H c1057hM2640L = m2640L(c1078u, c1078u2);
        if (!c1057hM2640L.f4350a || (c1057hM2640L.f4354e == null && c1057hM2640L.f4355f == null)) {
            return null;
        }
        boolean z3 = false;
        if (c1057hM2640L.f4351b) {
            if ((i3 & 1) == 1 && c1078u2 != null) {
                View view4 = c1078u2.f4429b;
                if (c1078u == null) {
                    View view5 = (View) view4.getParent();
                }
                AbstractC1080w.f4431a.getClass();
                return m2641J(view4, m2639K(c1078u, 0.0f), 1.0f);
            }
            return null;
        }
        int i4 = c1057hM2640L.f4353d;
        if ((i3 & 2) == 2 && c1078u != null) {
            View view6 = c1078u2 != null ? c1078u2.f4429b : null;
            View view7 = c1078u.f4429b;
            View view8 = (View) view7.getTag(R.id.save_overlay_view);
            if (view8 != null) {
                i = i4;
                view3 = null;
                z3 = true;
            } else {
                if (view6 == null || view6.getParent() == null) {
                    if (view6 != null) {
                        view = null;
                        z2 = false;
                    }
                    view6 = null;
                    view = null;
                    z2 = true;
                } else {
                    if (i4 == 4 || view7 == view6) {
                        view = view6;
                        view6 = null;
                        z2 = false;
                    }
                    view6 = null;
                    view = null;
                    z2 = true;
                }
                if (!z2) {
                    i = i4;
                    view2 = view;
                    view8 = view6;
                    view3 = view2;
                    z3 = false;
                } else if (view7.getParent() == null) {
                    i = i4;
                    view3 = view;
                    view8 = view7;
                } else {
                    if (view7.getParent() instanceof View) {
                        View view9 = (View) view7.getParent();
                        if (m2640L(m2655r(view9, true), m2653n(view9, true)).f4350a) {
                            i = i4;
                            view2 = view;
                            int id = view9.getId();
                            if (view9.getParent() == null && id != -1) {
                                frameLayout.findViewById(id);
                            }
                        } else {
                            boolean z4 = AbstractC1077t.f4427a;
                            Matrix matrix = new Matrix();
                            matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                            C0146e c0146e = AbstractC1080w.f4431a;
                            c0146e.mo506q(view7, matrix);
                            c0146e.mo507r(frameLayout, matrix);
                            RectF rectF = new RectF(0.0f, 0.0f, view7.getWidth(), view7.getHeight());
                            matrix.mapRect(rectF);
                            int iRound = Math.round(rectF.left);
                            int iRound2 = Math.round(rectF.top);
                            int iRound3 = Math.round(rectF.right);
                            int iRound4 = Math.round(rectF.bottom);
                            ImageView imageView = new ImageView(view7.getContext());
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            boolean zIsAttachedToWindow = view7.isAttachedToWindow();
                            boolean z5 = frameLayout != null && frameLayout.isAttachedToWindow();
                            if (zIsAttachedToWindow) {
                                view2 = view;
                                viewGroup = null;
                                i2 = 0;
                            } else if (z5) {
                                ViewGroup viewGroup2 = (ViewGroup) view7.getParent();
                                int iIndexOfChild = viewGroup2.indexOfChild(view7);
                                frameLayout.getOverlay().add(view7);
                                viewGroup = viewGroup2;
                                view2 = view;
                                i2 = iIndexOfChild;
                            } else {
                                i = i4;
                                view2 = view;
                                bitmapCreateBitmap = null;
                                if (bitmapCreateBitmap != null) {
                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                                imageView.layout(iRound, iRound2, iRound3, iRound4);
                                view8 = imageView;
                                view3 = view2;
                                z3 = false;
                            }
                            i = i4;
                            int iRound5 = Math.round(rectF.width());
                            int iRound6 = Math.round(rectF.height());
                            if (iRound5 <= 0 || iRound6 <= 0) {
                                bitmapCreateBitmap = null;
                            } else {
                                float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
                                int iRound7 = Math.round(iRound5 * fMin);
                                int iRound8 = Math.round(iRound6 * fMin);
                                matrix.postTranslate(-rectF.left, -rectF.top);
                                matrix.postScale(fMin, fMin);
                                if (AbstractC1077t.f4427a) {
                                    Picture picture = new Picture();
                                    Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
                                    canvasBeginRecording.concat(matrix);
                                    view7.draw(canvasBeginRecording);
                                    picture.endRecording();
                                    bitmapCreateBitmap = AbstractC1076s.m2660a(picture);
                                } else {
                                    bitmapCreateBitmap = Bitmap.createBitmap(iRound7, iRound8, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.concat(matrix);
                                    view7.draw(canvas);
                                }
                            }
                            if (!zIsAttachedToWindow) {
                                frameLayout.getOverlay().remove(view7);
                                viewGroup.addView(view7, i2);
                            }
                            if (bitmapCreateBitmap != null) {
                            }
                            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
                            imageView.layout(iRound, iRound2, iRound3, iRound4);
                            view8 = imageView;
                            view3 = view2;
                            z3 = false;
                        }
                    }
                    view8 = view6;
                    view3 = view2;
                    z3 = false;
                }
            }
            if (view8 != null) {
                if (!z3) {
                    int[] iArr = (int[]) c1078u.f4428a.get("android:visibility:screenLocation");
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    int[] iArr2 = new int[2];
                    frameLayout.getLocationOnScreen(iArr2);
                    view8.offsetLeftAndRight((i5 - iArr2[0]) - view8.getLeft());
                    view8.offsetTopAndBottom((i6 - iArr2[1]) - view8.getTop());
                    frameLayout.getOverlay().add(view8);
                }
                C0146e c0146e2 = AbstractC1080w.f4431a;
                c0146e2.getClass();
                ObjectAnimator objectAnimatorM2641J = m2641J(view8, m2639K(c1078u, 1.0f), 0.0f);
                if (objectAnimatorM2641J == null) {
                    c0146e2.mo504o(view8, m2639K(c1078u2, 1.0f));
                }
                if (z3) {
                    return objectAnimatorM2641J;
                }
                if (objectAnimatorM2641J == null) {
                    frameLayout.getOverlay().remove(view8);
                    return objectAnimatorM2641J;
                }
                view7.setTag(R.id.save_overlay_view, view8);
                C1056G c1056g = new C1056G(this, frameLayout, view8, view7);
                objectAnimatorM2641J.addListener(c1056g);
                objectAnimatorM2641J.addPauseListener(c1056g);
                m2654o().m2648a(c1056g);
                return objectAnimatorM2641J;
            }
            if (view3 != null) {
                int visibility = view3.getVisibility();
                AbstractC1080w.m2664b(view3, 0);
                C0146e c0146e3 = AbstractC1080w.f4431a;
                c0146e3.getClass();
                ObjectAnimator objectAnimatorM2641J2 = m2641J(view3, m2639K(c1078u, 1.0f), 0.0f);
                if (objectAnimatorM2641J2 == null) {
                    c0146e3.mo504o(view3, m2639K(c1078u2, 1.0f));
                }
                if (objectAnimatorM2641J2 != null) {
                    C1055F c1055f = new C1055F(view3, i);
                    objectAnimatorM2641J2.addListener(c1055f);
                    m2654o().m2648a(c1055f);
                } else {
                    AbstractC1080w.m2664b(view3, visibility);
                }
                return objectAnimatorM2641J2;
            }
        }
        return null;
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: q */
    public final String[] mo2637q() {
        return f4379B;
    }

    @Override // p085n0.AbstractC1070m
    /* renamed from: s */
    public final boolean mo2642s(C1078u c1078u, C1078u c1078u2) {
        if (c1078u == null && c1078u2 == null) {
            return false;
        }
        if (c1078u != null && c1078u2 != null && c1078u2.f4428a.containsKey("android:visibility:visibility") != c1078u.f4428a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1057H c1057hM2640L = m2640L(c1078u, c1078u2);
        if (c1057hM2640L.f4350a) {
            return c1057hM2640L.f4352c == 0 || c1057hM2640L.f4353d == 0;
        }
        return false;
    }

    public C1065h() {
        this.f4380A = 3;
    }
}
