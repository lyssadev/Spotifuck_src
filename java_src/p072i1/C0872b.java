package p072i1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p000A.C0001b;
import p000A.C0010k;
import p007E.C0057j;
import p036T0.AbstractC0411g;
import p067g1.C0783A;
import p067g1.C0784B;
import p067g1.C0785C;
import p067g1.C0786D;
import p067g1.C0791b;
import p067g1.C0792c;
import p067g1.C0793d;
import p067g1.C0795f;
import p067g1.C0796g;
import p067g1.C0797h;
import p067g1.C0799j;
import p067g1.C0806q;
import p067g1.C0808s;
import p067g1.C0810u;
import p067g1.C0813x;
import p067g1.EnumC0814y;
import p067g1.InterfaceC0811v;
import p070h1.AbstractC0869c;
import p075j1.C0950c;
import p075j1.C0953f;
import p078k1.AbstractC0963c;
import p078k1.AbstractC0964d;
import p078k1.C0965e;
import p078k1.InterfaceC0962b;
import p098r1.AbstractC1275o;
import p098r1.C1268h;
import p098r1.C1272l;
import p098r1.C1276p;
import p098r1.C1277q;
import p098r1.InterfaceC1267g;

/* renamed from: i1.b */
/* loaded from: classes.dex */
public final class C0872b implements InterfaceC0811v {

    /* renamed from: a */
    public final /* synthetic */ int f3374a;

    /* renamed from: b */
    public final Object f3375b;

    public /* synthetic */ C0872b(int i, Object obj) {
        this.f3374a = i;
        this.f3375b = obj;
    }

    /* renamed from: b */
    private final C0785C m2198b(C0965e c0965e) {
        C0783A c0783a = c0965e.f3930f;
        C0953f c0953f = c0965e.f3926b;
        boolean z2 = !c0783a.f2859b.equals("GET");
        C0813x c0813x = (C0813x) this.f3375b;
        c0953f.getClass();
        int i = c0965e.f3933i;
        int i2 = c0965e.f3934j;
        int i3 = c0965e.f3935k;
        c0813x.getClass();
        try {
            InterfaceC0962b interfaceC0962bM2424i = c0953f.m2431d(i, i2, i3, c0813x.f3070s, z2).m2424i(c0813x, c0965e, c0953f);
            synchronized (c0953f.f3900d) {
                c0953f.f3908l = interfaceC0962bM2424i;
            }
            return c0965e.m2462b(c0783a, c0953f, interfaceC0962bM2424i, c0953f.m2428a());
        } catch (IOException e) {
            throw new C0950c(e);
        }
    }

    /* renamed from: c */
    public static boolean m2199c(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: d */
    public static C0785C m2200d(C0785C c0785c) {
        if (c0785c == null || c0785c.f2881g == null) {
            return c0785c;
        }
        C0784B c0784bM2007h = c0785c.m2007h();
        c0784bM2007h.f2869g = null;
        return c0784bM2007h.m2004a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0498 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0284  */
    @Override // p067g1.InterfaceC0811v
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0785C mo2053a(C0965e c0965e) throws InterruptedException, NumberFormatException, IOException {
        C0785C c0785cM2004a;
        int i;
        long time;
        long time2;
        Date dateM2454a;
        Date dateM2454a2;
        Date dateM2454a3;
        String str;
        String str2;
        String str3;
        C0783A c0783a;
        C0057j c0057j;
        String str4;
        int i2;
        long jMax;
        C0783A c0783a2;
        C0799j c0799j;
        long j2;
        long jMin;
        C0799j c0799j2;
        String string;
        long time3;
        int i3;
        long millis;
        String str5;
        String str6;
        int i4;
        C0793d c0793d;
        C0783A c0783a3;
        C0001b c0001b;
        C0792c c0792c;
        C0874d c0874d;
        C0874d c0874d2;
        C0876f c0876fM2212i;
        boolean z2;
        switch (this.f3374a) {
            case 0:
                C0001b c0001b2 = (C0001b) this.f3375b;
                if (c0001b2 != null) {
                    C0783A c0783a4 = c0965e.f3930f;
                    C0797h c0797h = (C0797h) c0001b2.f2g;
                    c0797h.getClass();
                    try {
                        c0876fM2212i = c0797h.f2940b.m2212i(C1268h.m3017f(c0783a4.f2858a.f3029h).m3020e("MD5").mo3022h());
                    } catch (IOException unused) {
                    }
                    if (c0876fM2212i == null) {
                        c0785cM2004a = null;
                    } else {
                        try {
                            C0796g c0796g = new C0796g(c0876fM2212i.f3393c[0]);
                            C0808s c0808s = c0796g.f2930b;
                            String str7 = c0796g.f2931c;
                            String str8 = c0796g.f2929a;
                            C0808s c0808s2 = c0796g.f2935g;
                            c0808s2.m2033a("Content-Type");
                            String strM2033a = c0808s2.m2033a("Content-Length");
                            C0010k c0010k = new C0010k(5);
                            c0010k.m96s(str8);
                            c0010k.m91n(str7, null);
                            c0010k.f25h = c0808s.m2035c();
                            C0783A c0783aM80b = c0010k.m80b();
                            C0784B c0784b = new C0784B();
                            c0784b.f2863a = c0783aM80b;
                            c0784b.f2864b = c0796g.f2932d;
                            c0784b.f2865c = c0796g.f2933e;
                            c0784b.f2866d = c0796g.f2934f;
                            c0784b.f2868f = c0808s2.m2035c();
                            c0784b.f2869g = new C0795f(c0876fM2212i, strM2033a);
                            c0784b.f2867e = c0796g.f2936h;
                            c0784b.f2873k = c0796g.f2937i;
                            c0784b.f2874l = c0796g.f2938j;
                            c0785cM2004a = c0784b.m2004a();
                            if (str8.equals(c0783a4.f2858a.f3029h) && str7.equals(c0783a4.f2859b)) {
                                int i5 = AbstractC0964d.f3924a;
                                for (String str9 : AbstractC0964d.m2460f(c0785cM2004a.f2880f)) {
                                    if (!AbstractC0869c.m2186i(c0808s.m2038f(str9), c0783a4.f2860c.m2038f(str9))) {
                                    }
                                }
                            }
                            AbstractC0869c.m2180c(c0785cM2004a.f2881g);
                        } catch (IOException unused2) {
                            AbstractC0869c.m2180c(c0876fM2212i);
                            c0785cM2004a = null;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            C0783A c0783a5 = c0965e.f3930f;
                            if (c0785cM2004a == null) {
                            }
                            if (c0785cM2004a != null) {
                            }
                            c0783a = c0783a5;
                            if (((C0783A) c0057j.f122g) == null) {
                            }
                            c0783a3 = (C0783A) c0057j.f122g;
                            C0785C c0785c = (C0785C) c0057j.f123h;
                            c0001b = (C0001b) this.f3375b;
                            if (c0001b != null) {
                            }
                            if (c0785cM2004a != null) {
                            }
                            if (c0783a3 != null) {
                            }
                            if (c0783a3 == null) {
                            }
                        }
                        c0785cM2004a = null;
                    }
                } else {
                    c0785cM2004a = null;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                C0783A c0783a52 = c0965e.f3930f;
                if (c0785cM2004a == null) {
                    time = c0785cM2004a.f2885k;
                    time2 = c0785cM2004a.f2886l;
                    C0808s c0808s3 = c0785cM2004a.f2880f;
                    int iM2036d = c0808s3.m2036d();
                    dateM2454a = null;
                    dateM2454a2 = null;
                    dateM2454a3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                    int iM2457c = -1;
                    for (int i6 = 0; i6 < iM2036d; i6++) {
                        String strM2034b = c0808s3.m2034b(i6);
                        String strM2037e = c0808s3.m2037e(i6);
                        if ("Date".equalsIgnoreCase(strM2034b)) {
                            dateM2454a = AbstractC0963c.m2454a(strM2037e);
                            str3 = strM2037e;
                        } else if ("Expires".equalsIgnoreCase(strM2034b)) {
                            dateM2454a3 = AbstractC0963c.m2454a(strM2037e);
                        } else if ("Last-Modified".equalsIgnoreCase(strM2034b)) {
                            dateM2454a2 = AbstractC0963c.m2454a(strM2037e);
                            str2 = strM2037e;
                        } else if ("ETag".equalsIgnoreCase(strM2034b)) {
                            str = strM2037e;
                        } else if ("Age".equalsIgnoreCase(strM2034b)) {
                            iM2457c = AbstractC0964d.m2457c(strM2037e, -1);
                        }
                    }
                    i = iM2457c;
                } else {
                    i = -1;
                    time = 0;
                    time2 = 0;
                    dateM2454a = null;
                    dateM2454a2 = null;
                    dateM2454a3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (c0785cM2004a != null) {
                    c0057j = new C0057j(c0783a52, (Object) null, 15);
                } else if (c0783a52.f2858a.f3022a.equals("https") && c0785cM2004a.f2879e == null) {
                    c0057j = new C0057j(c0783a52, (Object) null, 15);
                } else {
                    Object obj = null;
                    int i7 = 15;
                    if (C0057j.m250A(c0785cM2004a, c0783a52)) {
                        C0799j c0799jM2020a = c0783a52.f2862e;
                        if (c0799jM2020a == null) {
                            c0799jM2020a = C0799j.m2020a(c0783a52.f2860c);
                            c0783a52.f2862e = c0799jM2020a;
                        }
                        if (!c0799jM2020a.f2946a) {
                            C0808s c0808s4 = c0783a52.f2860c;
                            if (c0808s4.m2033a("If-Modified-Since") == null && c0808s4.m2033a("If-None-Match") == null) {
                                C0799j c0799jM2005f = c0785cM2004a.m2005f();
                                if (c0799jM2005f.f2957l) {
                                    c0057j = new C0057j((Object) null, c0785cM2004a, 15);
                                } else {
                                    if (dateM2454a != null) {
                                        str4 = "If-None-Match";
                                        jMax = Math.max(0L, time2 - dateM2454a.getTime());
                                        i2 = -1;
                                    } else {
                                        str4 = "If-None-Match";
                                        i2 = -1;
                                        jMax = 0;
                                    }
                                    if (i != i2) {
                                        c0783a2 = c0783a52;
                                        c0799j = c0799jM2020a;
                                        jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i));
                                    } else {
                                        c0783a2 = c0783a52;
                                        c0799j = c0799jM2020a;
                                    }
                                    long j3 = jMax + (time2 - time) + (jCurrentTimeMillis2 - time2);
                                    int i8 = c0785cM2004a.m2005f().f2948c;
                                    if (i8 != -1) {
                                        time3 = TimeUnit.SECONDS.toMillis(i8);
                                    } else if (dateM2454a3 != null) {
                                        if (dateM2454a != null) {
                                            time2 = dateM2454a.getTime();
                                        }
                                        time3 = dateM2454a3.getTime() - time2;
                                        if (time3 <= 0) {
                                            time3 = 0;
                                        }
                                    } else if (dateM2454a2 == null) {
                                        j2 = 0;
                                        jMin = j2;
                                        c0799j2 = c0799j;
                                        i3 = c0799j2.f2948c;
                                        if (i3 != -1) {
                                            jMin = Math.min(jMin, TimeUnit.SECONDS.toMillis(i3));
                                        }
                                        int i9 = c0799j2.f2954i;
                                        long millis2 = i9 == -1 ? TimeUnit.SECONDS.toMillis(i9) : j2;
                                        if (!c0799jM2005f.f2952g || (i4 = c0799j2.f2953h) == -1) {
                                            c0783a = c0783a2;
                                            millis = j2;
                                        } else {
                                            c0783a = c0783a2;
                                            millis = TimeUnit.SECONDS.toMillis(i4);
                                        }
                                        if (c0799jM2005f.f2946a) {
                                            long j4 = millis2 + j3;
                                            if (j4 < millis + jMin) {
                                                C0784B c0784bM2007h = c0785cM2004a.m2007h();
                                                if (j4 >= jMin) {
                                                    C0001b c0001b3 = c0784bM2007h.f2868f;
                                                    c0001b3.getClass();
                                                    C0001b.m30s("Warning", "110 HttpURLConnection \"Response is stale\"");
                                                    c0001b3.m53r("Warning", "110 HttpURLConnection \"Response is stale\"");
                                                }
                                                if (j3 > 86400000 && c0785cM2004a.m2005f().f2948c == -1 && dateM2454a3 == null) {
                                                    C0001b c0001b4 = c0784bM2007h.f2868f;
                                                    c0001b4.getClass();
                                                    C0001b.m30s("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                    c0001b4.m53r("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                                }
                                                c0057j = new C0057j((Object) null, c0784bM2007h.m2004a(), 15);
                                            } else {
                                                if (str != null) {
                                                    str6 = str;
                                                    str5 = str4;
                                                } else if (dateM2454a2 != null) {
                                                    str5 = "If-Modified-Since";
                                                    str6 = str2;
                                                } else if (dateM2454a != null) {
                                                    str5 = "If-Modified-Since";
                                                    str6 = str3;
                                                } else {
                                                    c0057j = new C0057j(c0783a, (Object) null, 15);
                                                }
                                                C0001b c0001bM2035c = c0808s4.m2035c();
                                                C0791b.f2915e.getClass();
                                                c0001bM2035c.m53r(str5, str6);
                                                C0010k c0010kM2002a = c0783a.m2002a();
                                                ArrayList arrayList = (ArrayList) c0001bM2035c.f2g;
                                                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                                                C0001b c0001b5 = new C0001b(27);
                                                Collections.addAll((ArrayList) c0001b5.f2g, strArr);
                                                c0010kM2002a.f25h = c0001b5;
                                                c0057j = new C0057j(c0010kM2002a.m80b(), c0785cM2004a, 15);
                                            }
                                        }
                                    } else {
                                        List list = c0785cM2004a.f2875a.f2858a.f3027f;
                                        if (list == null) {
                                            string = null;
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            C0810u.m2043g(sb, list);
                                            string = sb.toString();
                                        }
                                        if (string == null) {
                                            if (dateM2454a != null) {
                                                time = dateM2454a.getTime();
                                            }
                                            long time4 = time - dateM2454a2.getTime();
                                            j2 = 0;
                                            if (time4 > 0) {
                                                jMin = time4 / 10;
                                            }
                                            c0799j2 = c0799j;
                                            i3 = c0799j2.f2948c;
                                            if (i3 != -1) {
                                            }
                                            int i92 = c0799j2.f2954i;
                                            if (i92 == -1) {
                                            }
                                            if (c0799jM2005f.f2952g) {
                                                c0783a = c0783a2;
                                                millis = j2;
                                                if (c0799jM2005f.f2946a) {
                                                }
                                            }
                                        }
                                        jMin = j2;
                                        c0799j2 = c0799j;
                                        i3 = c0799j2.f2948c;
                                        if (i3 != -1) {
                                        }
                                        int i922 = c0799j2.f2954i;
                                        if (i922 == -1) {
                                        }
                                        if (c0799jM2005f.f2952g) {
                                        }
                                    }
                                    jMin = time3;
                                    c0799j2 = c0799j;
                                    j2 = 0;
                                    i3 = c0799j2.f2948c;
                                    if (i3 != -1) {
                                    }
                                    int i9222 = c0799j2.f2954i;
                                    if (i9222 == -1) {
                                    }
                                    if (c0799jM2005f.f2952g) {
                                    }
                                }
                            } else {
                                c0783a = c0783a52;
                                c0057j = new C0057j(c0783a, (Object) null, 15);
                            }
                        }
                        if (((C0783A) c0057j.f122g) == null) {
                            c0793d = null;
                        } else {
                            C0799j c0799jM2020a2 = c0783a.f2862e;
                            if (c0799jM2020a2 == null) {
                                c0799jM2020a2 = C0799j.m2020a(c0783a.f2860c);
                                c0783a.f2862e = c0799jM2020a2;
                            }
                            if (c0799jM2020a2.f2955j) {
                                c0793d = null;
                                c0057j = new C0057j(c0793d, c0793d, 15);
                            }
                        }
                        c0783a3 = (C0783A) c0057j.f122g;
                        C0785C c0785c2 = (C0785C) c0057j.f123h;
                        c0001b = (C0001b) this.f3375b;
                        if (c0001b != null) {
                            synchronized (((C0797h) c0001b.f2g)) {
                            }
                        }
                        if (c0785cM2004a != null && c0785c2 == null) {
                            AbstractC0869c.m2180c(c0785cM2004a.f2881g);
                        }
                        if (c0783a3 != null && c0785c2 == null) {
                            C0784B c0784b2 = new C0784B();
                            c0784b2.f2863a = c0965e.f3930f;
                            c0784b2.f2864b = EnumC0814y.HTTP_1_1;
                            c0784b2.f2865c = 504;
                            c0784b2.f2866d = "Unsatisfiable Request (only-if-cached)";
                            c0784b2.f2869g = AbstractC0869c.f3364c;
                            c0784b2.f2873k = -1L;
                            c0784b2.f2874l = System.currentTimeMillis();
                            return c0784b2.m2004a();
                        }
                        if (c0783a3 == null) {
                            C0784B c0784bM2007h2 = c0785c2.m2007h();
                            C0785C c0785cM2200d = m2200d(c0785c2);
                            if (c0785cM2200d != null) {
                                C0784B.m2003b("cacheResponse", c0785cM2200d);
                            }
                            c0784bM2007h2.f2871i = c0785cM2200d;
                            return c0784bM2007h2.m2004a();
                        }
                        try {
                            C0785C c0785cM2461a = c0965e.m2461a(c0783a3);
                            if (c0785c2 != null) {
                                if (c0785cM2461a.f2877c == 304) {
                                    C0784B c0784bM2007h3 = c0785c2.m2007h();
                                    C0808s c0808s5 = c0785c2.f2880f;
                                    C0808s c0808s6 = c0785cM2461a.f2880f;
                                    ArrayList arrayList2 = new ArrayList(20);
                                    int iM2036d2 = c0808s5.m2036d();
                                    for (int i10 = 0; i10 < iM2036d2; i10++) {
                                        String strM2034b2 = c0808s5.m2034b(i10);
                                        String strM2037e2 = c0808s5.m2037e(i10);
                                        if ((!"Warning".equalsIgnoreCase(strM2034b2) || !strM2037e2.startsWith("1")) && ("Content-Length".equalsIgnoreCase(strM2034b2) || "Content-Encoding".equalsIgnoreCase(strM2034b2) || "Content-Type".equalsIgnoreCase(strM2034b2) || !m2199c(strM2034b2) || c0808s6.m2033a(strM2034b2) == null)) {
                                            C0791b.f2915e.getClass();
                                            arrayList2.add(strM2034b2);
                                            arrayList2.add(strM2037e2.trim());
                                        }
                                    }
                                    int iM2036d3 = c0808s6.m2036d();
                                    for (int i11 = 0; i11 < iM2036d3; i11++) {
                                        String strM2034b3 = c0808s6.m2034b(i11);
                                        if (!"Content-Length".equalsIgnoreCase(strM2034b3) && !"Content-Encoding".equalsIgnoreCase(strM2034b3) && !"Content-Type".equalsIgnoreCase(strM2034b3) && m2199c(strM2034b3)) {
                                            C0791b c0791b = C0791b.f2915e;
                                            String strM2037e3 = c0808s6.m2037e(i11);
                                            c0791b.getClass();
                                            arrayList2.add(strM2034b3);
                                            arrayList2.add(strM2037e3.trim());
                                        }
                                    }
                                    String[] strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                                    C0001b c0001b6 = new C0001b(27);
                                    Collections.addAll((ArrayList) c0001b6.f2g, strArr2);
                                    c0784bM2007h3.f2868f = c0001b6;
                                    c0784bM2007h3.f2873k = c0785cM2461a.f2885k;
                                    c0784bM2007h3.f2874l = c0785cM2461a.f2886l;
                                    C0785C c0785cM2200d2 = m2200d(c0785c2);
                                    if (c0785cM2200d2 != null) {
                                        C0784B.m2003b("cacheResponse", c0785cM2200d2);
                                    }
                                    c0784bM2007h3.f2871i = c0785cM2200d2;
                                    C0785C c0785cM2200d3 = m2200d(c0785cM2461a);
                                    if (c0785cM2200d3 != null) {
                                        C0784B.m2003b("networkResponse", c0785cM2200d3);
                                    }
                                    c0784bM2007h3.f2870h = c0785cM2200d3;
                                    C0785C c0785cM2004a2 = c0784bM2007h3.m2004a();
                                    c0785cM2461a.f2881g.close();
                                    ((C0001b) this.f3375b).m35E();
                                    ((C0797h) ((C0001b) this.f3375b).f2g).getClass();
                                    C0796g c0796g2 = new C0796g(c0785cM2004a2);
                                    C0876f c0876f = ((C0795f) c0785c2.f2881g).f2924a;
                                    try {
                                        C0874d c0874dM2211h = c0876f.f3394d.m2211h(c0876f.f3391a, c0876f.f3392b);
                                        if (c0874dM2211h == null) {
                                            return c0785cM2004a2;
                                        }
                                        try {
                                            c0796g2.m2017c(c0874dM2211h);
                                            c0874dM2211h.m2204b();
                                            return c0785cM2004a2;
                                        } catch (IOException unused3) {
                                            c0874d2 = c0874dM2211h;
                                            if (c0874d2 == 0) {
                                                return c0785cM2004a2;
                                            }
                                            try {
                                                c0874d2.m2203a();
                                                return c0785cM2004a2;
                                            } catch (IOException unused4) {
                                                return c0785cM2004a2;
                                            }
                                        }
                                    } catch (IOException unused5) {
                                        c0874d2 = c0793d;
                                    }
                                } else {
                                    AbstractC0869c.m2180c(c0785c2.f2881g);
                                }
                            }
                            C0784B c0784bM2007h4 = c0785cM2461a.m2007h();
                            C0785C c0785cM2200d4 = m2200d(c0785c2);
                            if (c0785cM2200d4 != null) {
                                C0784B.m2003b("cacheResponse", c0785cM2200d4);
                            }
                            c0784bM2007h4.f2871i = c0785cM2200d4;
                            C0785C c0785cM2200d5 = m2200d(c0785cM2461a);
                            if (c0785cM2200d5 != null) {
                                C0784B.m2003b("networkResponse", c0785cM2200d5);
                            }
                            c0784bM2007h4.f2870h = c0785cM2200d5;
                            C0785C c0785cM2004a3 = c0784bM2007h4.m2004a();
                            if (((C0001b) this.f3375b) != null) {
                                if (AbstractC0964d.m2456b(c0785cM2004a3) && C0057j.m250A(c0785cM2004a3, c0783a3)) {
                                    C0797h c0797h2 = (C0797h) ((C0001b) this.f3375b).f2g;
                                    c0797h2.getClass();
                                    String str10 = c0785cM2004a3.f2875a.f2859b;
                                    boolean zM1042t = AbstractC0411g.m1042t(str10);
                                    C0783A c0783a6 = c0785cM2004a3.f2875a;
                                    if (zM1042t) {
                                        c0797h2.m2019g(c0783a6);
                                    } else {
                                        if (str10.equals("GET") && !AbstractC0964d.m2460f(c0785cM2004a3.f2880f).contains("*")) {
                                            C0796g c0796g3 = new C0796g(c0785cM2004a3);
                                            try {
                                                C0874d c0874dM2211h2 = c0797h2.f2940b.m2211h(C1268h.m3017f(c0783a6.f2858a.f3029h).m3020e("MD5").mo3022h(), -1L);
                                                if (c0874dM2211h2 != null) {
                                                    try {
                                                        c0796g3.m2017c(c0874dM2211h2);
                                                        c0793d = new C0793d(c0797h2, c0874dM2211h2);
                                                    } catch (IOException unused6) {
                                                        c0874d = c0874dM2211h2;
                                                        if (c0874d != 0) {
                                                            c0874d.m2203a();
                                                        }
                                                        if (c0793d != null) {
                                                        }
                                                        return c0785cM2004a3;
                                                    }
                                                }
                                            } catch (IOException unused7) {
                                                c0874d = c0793d;
                                            }
                                        }
                                        if (c0793d != null && (c0792c = c0793d.f2920c) != null) {
                                            InterfaceC1267g interfaceC1267gMo2009g = c0785cM2004a3.f2881g.mo2009g();
                                            Logger logger = AbstractC1275o.f5062a;
                                            C0871a c0871a = new C0871a(interfaceC1267gMo2009g, c0793d, new C1276p(c0792c));
                                            c0785cM2004a3.m2006g("Content-Type");
                                            long jMo2008f = c0785cM2004a3.f2881g.mo2008f();
                                            C0784B c0784bM2007h5 = c0785cM2004a3.m2007h();
                                            c0784bM2007h5.f2869g = new C0786D(jMo2008f, new C1277q(c0871a), 1);
                                            return c0784bM2007h5.m2004a();
                                        }
                                    }
                                    if (c0793d != null) {
                                        InterfaceC1267g interfaceC1267gMo2009g2 = c0785cM2004a3.f2881g.mo2009g();
                                        Logger logger2 = AbstractC1275o.f5062a;
                                        C0871a c0871a2 = new C0871a(interfaceC1267gMo2009g2, c0793d, new C1276p(c0792c));
                                        c0785cM2004a3.m2006g("Content-Type");
                                        long jMo2008f2 = c0785cM2004a3.f2881g.mo2008f();
                                        C0784B c0784bM2007h52 = c0785cM2004a3.m2007h();
                                        c0784bM2007h52.f2869g = new C0786D(jMo2008f2, new C1277q(c0871a2), 1);
                                        return c0784bM2007h52.m2004a();
                                    }
                                } else if (AbstractC0411g.m1042t(c0783a3.f2859b)) {
                                    try {
                                        ((C0797h) ((C0001b) this.f3375b).f2g).m2019g(c0783a3);
                                    } catch (IOException unused8) {
                                    }
                                }
                            }
                            return c0785cM2004a3;
                        } finally {
                        }
                    } else {
                        c0057j = new C0057j(c0783a52, obj, i7);
                    }
                }
                c0783a = c0783a52;
                if (((C0783A) c0057j.f122g) == null) {
                }
                c0783a3 = (C0783A) c0057j.f122g;
                C0785C c0785c22 = (C0785C) c0057j.f123h;
                c0001b = (C0001b) this.f3375b;
                if (c0001b != null) {
                }
                if (c0785cM2004a != null) {
                    AbstractC0869c.m2180c(c0785cM2004a.f2881g);
                }
                if (c0783a3 != null) {
                }
                if (c0783a3 == null) {
                }
                break;
            case 1:
                return m2198b(c0965e);
            default:
                C0783A c0783a7 = c0965e.f3930f;
                C0010k c0010kM2002a2 = c0783a7.m2002a();
                C0808s c0808s7 = c0783a7.f2860c;
                String strM2033a2 = c0808s7.m2033a("Host");
                C0810u c0810u = c0783a7.f2858a;
                if (strM2033a2 == null) {
                    c0010kM2002a2.m88j("Host", AbstractC0869c.m2187j(c0810u, false));
                }
                if (c0808s7.m2033a("Connection") == null) {
                    c0010kM2002a2.m88j("Connection", "Keep-Alive");
                }
                if (c0808s7.m2033a("Accept-Encoding") == null && c0808s7.m2033a("Range") == null) {
                    c0010kM2002a2.m88j("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0791b c0791b2 = (C0791b) this.f3375b;
                c0791b2.getClass();
                List listEmptyList = Collections.emptyList();
                if (!listEmptyList.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = listEmptyList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        if (i12 > 0) {
                            sb2.append("; ");
                        }
                        C0806q c0806q = (C0806q) listEmptyList.get(i12);
                        sb2.append(c0806q.f2999a);
                        sb2.append('=');
                        sb2.append(c0806q.f3000b);
                    }
                    c0010kM2002a2.m88j("Cookie", sb2.toString());
                }
                if (c0808s7.m2033a("User-Agent") == null) {
                    c0010kM2002a2.m88j("User-Agent", "okhttp/3.10.0");
                }
                C0785C c0785cM2461a2 = c0965e.m2461a(c0010kM2002a2.m80b());
                C0808s c0808s8 = c0785cM2461a2.f2880f;
                AbstractC0964d.m2458d(c0791b2, c0810u, c0808s8);
                C0784B c0784bM2007h6 = c0785cM2461a2.m2007h();
                c0784bM2007h6.f2863a = c0783a7;
                if (z2 && "gzip".equalsIgnoreCase(c0785cM2461a2.m2006g("Content-Encoding")) && AbstractC0964d.m2456b(c0785cM2461a2)) {
                    C1272l c1272l = new C1272l(c0785cM2461a2.f2881g.mo2009g());
                    C0001b c0001bM2035c2 = c0808s8.m2035c();
                    c0001bM2035c2.m32B("Content-Encoding");
                    c0001bM2035c2.m32B("Content-Length");
                    ArrayList arrayList3 = (ArrayList) c0001bM2035c2.f2g;
                    String[] strArr3 = (String[]) arrayList3.toArray(new String[arrayList3.size()]);
                    C0001b c0001b7 = new C0001b(27);
                    Collections.addAll((ArrayList) c0001b7.f2g, strArr3);
                    c0784bM2007h6.f2868f = c0001b7;
                    c0785cM2461a2.m2006g("Content-Type");
                    Logger logger3 = AbstractC1275o.f5062a;
                    c0784bM2007h6.f2869g = new C0786D(-1L, new C1277q(c1272l), 1);
                }
                return c0784bM2007h6.m2004a();
        }
    }
}
