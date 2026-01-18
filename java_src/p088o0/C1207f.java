package p088o0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007E.AbstractC0049b;
import p007E.AbstractC0058k;
import p007E.AbstractC0065r;
import p010G.AbstractC0094a;
import p023N.C0213Y;
import p073j.C0884f;
import p091p0.AbstractC1230a;
import p096r.C1247b;

/* renamed from: o0.f */
/* loaded from: classes.dex */
public final class C1207f extends AbstractC1210i implements Animatable {

    /* renamed from: l */
    public static final /* synthetic */ int f4793l = 0;

    /* renamed from: h */
    public final Context f4795h;

    /* renamed from: i */
    public C0213Y f4796i = null;

    /* renamed from: j */
    public ArrayList f4797j = null;

    /* renamed from: k */
    public final C0884f f4798k = new C0884f(this);

    /* renamed from: g */
    public final C1205d f4794g = new C1205d();

    public C1207f(Context context) {
        this.f4795h = context;
    }

    @Override // p088o0.AbstractC1210i, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            AbstractC0094a.m356a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            return AbstractC0094a.m357b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C1205d c1205d = this.f4794g;
        c1205d.f4788a.draw(canvas);
        if (c1205d.f4789b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.getAlpha() : this.f4794g.f4788a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f4794g.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4801f;
        return drawable != null ? AbstractC0094a.m358c(drawable) : this.f4794g.f4788a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4801f == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1206e(this.f4801f.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4794g.f4788a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4794g.f4788a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.getOpacity() : this.f4794g.f4788a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x018a, code lost:
    
        if (r8.f4789b != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018c, code lost:
    
        r8.f4789b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0193, code lost:
    
        r8.f4789b.playTogether(r8.f4790c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019a, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        XmlResourceParser xmlResourceParser;
        XmlResourceParser animation;
        Animator animatorM2827a;
        C1219r c1219r;
        int next;
        C1219r c1219r2;
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            AbstractC0094a.m359d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            C1205d c1205d = this.f4794g;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM235h = AbstractC0049b.m235h(resources, theme, attributeSet, AbstractC1202a.f4780e);
                    int resourceId = typedArrayM235h.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = C1219r.f4856o;
                        if (Build.VERSION.SDK_INT >= 24) {
                            c1219r = new C1219r();
                            ThreadLocal threadLocal = AbstractC0065r.f135a;
                            c1219r.f4801f = AbstractC0058k.m286a(resources, resourceId, theme);
                            new C1218q(c1219r.f4801f.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                c1219r = new C1219r();
                                c1219r.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e) {
                                Log.e("VectorDrawableCompat", "parser error", e);
                                c1219r = null;
                                c1219r.f4861k = false;
                                c1219r.setCallback(this.f4798k);
                                c1219r2 = c1205d.f4788a;
                                if (c1219r2 != null) {
                                }
                                c1205d.f4788a = c1219r;
                                typedArrayM235h.recycle();
                                eventType = xmlPullParser.next();
                            } catch (XmlPullParserException e2) {
                                Log.e("VectorDrawableCompat", "parser error", e2);
                                c1219r = null;
                                c1219r.f4861k = false;
                                c1219r.setCallback(this.f4798k);
                                c1219r2 = c1205d.f4788a;
                                if (c1219r2 != null) {
                                }
                                c1205d.f4788a = c1219r;
                                typedArrayM235h.recycle();
                                eventType = xmlPullParser.next();
                            }
                        }
                        c1219r.f4861k = false;
                        c1219r.setCallback(this.f4798k);
                        c1219r2 = c1205d.f4788a;
                        if (c1219r2 != null) {
                            c1219r2.setCallback(null);
                        }
                        c1205d.f4788a = c1219r;
                    }
                    typedArrayM235h.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC1202a.f4781f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4795h;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorM2827a = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                } catch (Throwable th) {
                                    th = th;
                                    xmlResourceParser = context;
                                }
                                try {
                                    animatorM2827a = AbstractC1202a.m2827a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                    animation.close();
                                } catch (IOException e3) {
                                    e = e3;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e4) {
                                    e = e4;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = animation;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e5) {
                                e = e5;
                            } catch (XmlPullParserException e6) {
                                e = e6;
                            } catch (Throwable th3) {
                                th = th3;
                                xmlResourceParser = null;
                            }
                        }
                        animatorM2827a.setTarget(c1205d.f4788a.f4857g.f4844b.f4842o.getOrDefault(string, null));
                        if (c1205d.f4790c == null) {
                            c1205d.f4790c = new ArrayList();
                            c1205d.f4791d = new C1247b();
                        }
                        c1205d.f4790c.add(animatorM2827a);
                        c1205d.f4791d.put(animatorM2827a, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.isAutoMirrored() : this.f4794g.f4788a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f4801f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4794g.f4789b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.isStateful() : this.f4794g.f4788a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4794g.f4788a.setBounds(rect);
        }
    }

    @Override // p088o0.AbstractC1210i, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.setLevel(i) : this.f4794g.f4788a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4801f;
        return drawable != null ? drawable.setState(iArr) : this.f4794g.f4788a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f4794g.f4788a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4794g.f4788a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4794g.f4788a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            AbstractC1230a.m2862D0(drawable, i);
        } else {
            this.f4794g.f4788a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            AbstractC0094a.m363h(drawable, colorStateList);
        } else {
            this.f4794g.f4788a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            AbstractC0094a.m364i(drawable, mode);
        } else {
            this.f4794g.f4788a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f4794g.f4788a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C1205d c1205d = this.f4794g;
        if (c1205d.f4789b.isStarted()) {
            return;
        }
        c1205d.f4789b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f4801f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4794g.f4789b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
