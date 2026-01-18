package p030Q0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import p000A.C0001b;
import p024N0.C0288p;
import p098r1.AbstractC1275o;
import p098r1.C1264d;
import p098r1.C1265e;
import p098r1.C1268h;
import p098r1.C1277q;
import p098r1.InterfaceC1282v;
import p101t.AbstractC1300e;

/* renamed from: Q0.f */
/* loaded from: classes.dex */
public final class RunnableC0337f implements Runnable {

    /* renamed from: s */
    public static final Object f869s = new Object();

    /* renamed from: t */
    public static final C0334c f870t = new C0334c(0);

    /* renamed from: u */
    public static final AtomicInteger f871u = new AtomicInteger();

    /* renamed from: v */
    public static final C0335d f872v = new C0335d();

    /* renamed from: a */
    public final int f873a = f871u.incrementAndGet();

    /* renamed from: b */
    public final C0354w f874b;

    /* renamed from: c */
    public final C0344m f875c;

    /* renamed from: d */
    public final C0001b f876d;

    /* renamed from: e */
    public final C0326C f877e;

    /* renamed from: f */
    public final String f878f;

    /* renamed from: g */
    public final C0357z f879g;

    /* renamed from: h */
    public int f880h;

    /* renamed from: i */
    public final AbstractC0325B f881i;

    /* renamed from: j */
    public C0345n f882j;

    /* renamed from: k */
    public ArrayList f883k;

    /* renamed from: l */
    public Bitmap f884l;

    /* renamed from: m */
    public Future f885m;

    /* renamed from: n */
    public int f886n;

    /* renamed from: o */
    public Exception f887o;

    /* renamed from: p */
    public int f888p;

    /* renamed from: q */
    public int f889q;

    /* renamed from: r */
    public int f890r;

    public RunnableC0337f(C0354w c0354w, C0344m c0344m, C0001b c0001b, C0326C c0326c, C0345n c0345n, AbstractC0325B abstractC0325B) {
        this.f874b = c0354w;
        this.f875c = c0344m;
        this.f876d = c0001b;
        this.f877e = c0326c;
        this.f882j = c0345n;
        this.f878f = c0345n.f916c;
        C0357z c0357z = c0345n.f915b;
        this.f879g = c0357z;
        this.f890r = c0357z.f940c;
        this.f880h = 0;
        this.f881i = abstractC0325B;
        this.f889q = abstractC0325B.mo926b();
    }

    /* renamed from: b */
    public static Bitmap m940b(InterfaceC1282v interfaceC1282v, C0357z c0357z) throws IOException {
        Logger logger = AbstractC1275o.f5062a;
        C1277q c1277q = new C1277q(interfaceC1282v);
        boolean z2 = c1277q.m3048h(0L, AbstractC0331H.f862a) && c1277q.m3048h(8L, AbstractC0331H.f863b);
        c0357z.getClass();
        if (!z2) {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new C1264d(c1277q, 1), null, null);
            if (bitmapDecodeStream != null) {
                return bitmapDecodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        C1265e c1265e = c1277q.f5066a;
        while (interfaceC1282v.mo2197e(c1265e, 8192L) != -1) {
        }
        try {
            byte[] bArrM2998k = c1265e.m2998k(c1265e.f5044b);
            return BitmapFactory.decodeByteArray(bArrM2998k, 0, bArrM2998k.length, null);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: d */
    public static RunnableC0337f m941d(C0354w c0354w, C0344m c0344m, C0001b c0001b, C0326C c0326c, C0345n c0345n) {
        C0357z c0357z = c0345n.f915b;
        List list = c0354w.f931a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC0325B abstractC0325B = (AbstractC0325B) list.get(i);
            if (abstractC0325B.mo925a(c0357z)) {
                return new RunnableC0337f(c0354w, c0344m, c0001b, c0326c, c0345n, abstractC0325B);
            }
        }
        return new RunnableC0337f(c0354w, c0344m, c0001b, c0326c, c0345n, f872v);
    }

    /* renamed from: f */
    public static void m942f(C0357z c0357z) {
        Uri uri = c0357z.f938a;
        String strValueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(0);
        StringBuilder sb = (StringBuilder) f870t.get();
        sb.ensureCapacity(strValueOf.length() + 8);
        sb.replace(8, sb.length(), strValueOf);
        Thread.currentThread().setName(sb.toString());
    }

    /* renamed from: a */
    public final boolean m943a() {
        Future future;
        if (this.f882j != null) {
            return false;
        }
        ArrayList arrayList = this.f883k;
        return (arrayList == null || arrayList.isEmpty()) && (future = this.f885m) != null && future.cancel(false);
    }

    /* renamed from: c */
    public final void m944c(C0345n c0345n) {
        boolean zRemove;
        if (this.f882j == c0345n) {
            this.f882j = null;
            zRemove = true;
        } else {
            ArrayList arrayList = this.f883k;
            zRemove = arrayList != null ? arrayList.remove(c0345n) : false;
        }
        if (zRemove) {
            if (c0345n.f915b.f940c == this.f890r) {
                ArrayList arrayList2 = this.f883k;
                boolean z2 = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
                C0345n c0345n2 = this.f882j;
                if (c0345n2 != null || z2) {
                    i = c0345n2 != null ? c0345n2.f915b.f940c : 1;
                    if (z2) {
                        int size = this.f883k.size();
                        for (int i = 0; i < size; i++) {
                            int i2 = ((C0345n) this.f883k.get(i)).f915b.f940c;
                            if (AbstractC1300e.m3116a(i2) > AbstractC1300e.m3116a(i)) {
                                i = i2;
                            }
                        }
                    }
                }
                this.f890r = i;
            }
        }
        this.f874b.getClass();
    }

    /* renamed from: e */
    public final Bitmap m945e() throws IOException {
        int i;
        int i2 = 0;
        C0347p c0347p = (C0347p) ((C0346o) this.f876d.f2g).get(this.f878f);
        Bitmap bitmap = null;
        Bitmap bitmapM940b = c0347p != null ? c0347p.f920a : null;
        boolean z2 = true;
        if (bitmapM940b != null) {
            this.f877e.f835b.sendEmptyMessage(0);
            this.f886n = 1;
            this.f874b.getClass();
            return bitmapM940b;
        }
        int i3 = this.f889q == 0 ? 4 : this.f880h;
        this.f880h = i3;
        C0288p c0288pMo927c = this.f881i.mo927c(this.f879g, i3);
        if (c0288pMo927c != null) {
            this.f886n = c0288pMo927c.f718a;
            this.f888p = c0288pMo927c.f719b;
            bitmapM940b = (Bitmap) c0288pMo927c.f720c;
            if (bitmapM940b == null) {
                InterfaceC1282v interfaceC1282v = (InterfaceC1282v) c0288pMo927c.f721d;
                try {
                    bitmapM940b = m940b(interfaceC1282v, this.f879g);
                } finally {
                    try {
                        interfaceC1282v.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmapM940b != null) {
            this.f874b.getClass();
            C0326C c0326c = this.f877e;
            c0326c.getClass();
            C1268h c1268h = AbstractC0331H.f862a;
            int allocationByteCount = bitmapM940b.getAllocationByteCount();
            if (allocationByteCount < 0) {
                throw new IllegalStateException("Negative size: " + bitmapM940b);
            }
            HandlerC0341j handlerC0341j = c0326c.f835b;
            handlerC0341j.sendMessage(handlerC0341j.obtainMessage(2, allocationByteCount, 0));
            C0357z c0357z = this.f879g;
            c0357z.getClass();
            if (c0357z.f939b != null || this.f888p != 0) {
                synchronized (f869s) {
                    try {
                        this.f879g.getClass();
                        int i4 = this.f888p;
                        if (i4 != 0) {
                            C0357z c0357z2 = this.f879g;
                            int width = bitmapM940b.getWidth();
                            int height = bitmapM940b.getHeight();
                            c0357z2.getClass();
                            Matrix matrix = new Matrix();
                            if (i4 != 0 && i4 != 0) {
                                switch (i4) {
                                    case 3:
                                    case 4:
                                        i = 180;
                                        break;
                                    case 5:
                                    case 6:
                                        i = 90;
                                        break;
                                    case 7:
                                    case 8:
                                        i = 270;
                                        break;
                                    default:
                                        i = 0;
                                        break;
                                }
                                int i5 = (i4 == 2 || i4 == 7 || i4 == 4 || i4 == 5) ? -1 : 1;
                                if (i != 0) {
                                    matrix.preRotate(i);
                                }
                                if (i5 != 1) {
                                    matrix.postScale(i5, 1.0f);
                                }
                            }
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM940b, 0, 0, width, height, matrix, true);
                            if (bitmapCreateBitmap != bitmapM940b) {
                                bitmapM940b.recycle();
                                bitmapM940b = bitmapCreateBitmap;
                            }
                            this.f874b.getClass();
                        }
                        List list = this.f879g.f939b;
                        if (list == null) {
                            z2 = false;
                        }
                        if (z2) {
                            if (list.size() <= 0) {
                                bitmap = bitmapM940b;
                            } else {
                                if (list.get(0) != null) {
                                    throw new ClassCastException();
                                }
                                try {
                                    throw null;
                                } catch (RuntimeException unused2) {
                                    C0354w.f929g.post(new RunnableC0336e(i2));
                                }
                            }
                            this.f874b.getClass();
                            bitmapM940b = bitmap;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmapM940b != null) {
                    C0326C c0326c2 = this.f877e;
                    c0326c2.getClass();
                    int allocationByteCount2 = bitmapM940b.getAllocationByteCount();
                    if (allocationByteCount2 < 0) {
                        throw new IllegalStateException("Negative size: " + bitmapM940b);
                    }
                    HandlerC0341j handlerC0341j2 = c0326c2.f835b;
                    handlerC0341j2.sendMessage(handlerC0341j2.obtainMessage(3, allocationByteCount2, 0));
                }
            }
        }
        return bitmapM940b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0344m c0344m = this.f875c;
        try {
            try {
                try {
                    m942f(this.f879g);
                    this.f874b.getClass();
                    Bitmap bitmapM945e = m945e();
                    this.f884l = bitmapM945e;
                    if (bitmapM945e == null) {
                        HandlerC0341j handlerC0341j = c0344m.f908h;
                        handlerC0341j.sendMessage(handlerC0341j.obtainMessage(6, this));
                    } else {
                        c0344m.m948b(this);
                    }
                } catch (IOException e) {
                    this.f887o = e;
                    HandlerC0341j handlerC0341j2 = c0344m.f908h;
                    handlerC0341j2.sendMessageDelayed(handlerC0341j2.obtainMessage(5, this), 500L);
                } catch (Exception e2) {
                    this.f887o = e2;
                    HandlerC0341j handlerC0341j3 = c0344m.f908h;
                    handlerC0341j3.sendMessage(handlerC0341j3.obtainMessage(6, this));
                }
            } catch (C0350s e3) {
                this.f887o = e3;
                HandlerC0341j handlerC0341j4 = c0344m.f908h;
                handlerC0341j4.sendMessage(handlerC0341j4.obtainMessage(6, this));
            } catch (OutOfMemoryError e4) {
                StringWriter stringWriter = new StringWriter();
                this.f877e.m929a().m930a(new PrintWriter(stringWriter));
                this.f887o = new RuntimeException(stringWriter.toString(), e4);
                HandlerC0341j handlerC0341j5 = c0344m.f908h;
                handlerC0341j5.sendMessage(handlerC0341j5.obtainMessage(6, this));
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }
}
