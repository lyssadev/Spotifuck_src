package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p000A.C0010k;
import p041W.C0423a;
import p091p0.AbstractC1230a;

/* renamed from: androidx.emoji2.text.v */
/* loaded from: classes.dex */
public final class C0567v extends ReplacementSpan {

    /* renamed from: b */
    public final C0566u f1691b;

    /* renamed from: e */
    public TextPaint f1694e;

    /* renamed from: a */
    public final Paint.FontMetricsInt f1690a = new Paint.FontMetricsInt();

    /* renamed from: c */
    public short f1692c = -1;

    /* renamed from: d */
    public float f1693d = 1.0f;

    public C0567v(C0566u c0566u) {
        AbstractC1230a.m2892j("rasterizer cannot be null", c0566u);
        this.f1691b = c0566u;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f1694e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f1694e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint2 instanceof TextPaint) {
                    textPaint = (TextPaint) paint2;
                }
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f2, i3, f2 + this.f1692c, i5, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        C0555j.m1436a().getClass();
        float f3 = i4;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        C0566u c0566u = this.f1691b;
        C0010k c0010k = c0566u.f1688b;
        Typeface typeface = (Typeface) c0010k.f26i;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c0010k.f24g, c0566u.f1687a * 2, 2, f2, f3, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f1690a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0566u c0566u = this.f1691b;
        this.f1693d = fAbs / (c0566u.m1456c().m590a(14) != 0 ? ((ByteBuffer) r8.f551d).getShort(r1 + r8.f548a) : (short) 0);
        C0423a c0423aM1456c = c0566u.m1456c();
        int iM590a = c0423aM1456c.m590a(14);
        if (iM590a != 0) {
            ((ByteBuffer) c0423aM1456c.f551d).getShort(iM590a + c0423aM1456c.f548a);
        }
        short s2 = (short) ((c0566u.m1456c().m590a(12) != 0 ? ((ByteBuffer) r5.f551d).getShort(r7 + r5.f548a) : (short) 0) * this.f1693d);
        this.f1692c = s2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s2;
    }
}
