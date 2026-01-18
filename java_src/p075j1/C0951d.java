package p075j1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import p017K.C0137j;
import p067g1.C0788F;
import p067g1.C0790a;
import p067g1.C0791b;
import p067g1.C0810u;
import p067g1.C0815z;
import p070h1.AbstractC0869c;
import p074j0.C0944w;

/* renamed from: j1.d */
/* loaded from: classes.dex */
public final class C0951d {

    /* renamed from: a */
    public final C0790a f3889a;

    /* renamed from: b */
    public final C0944w f3890b;

    /* renamed from: c */
    public final C0791b f3891c;

    /* renamed from: d */
    public final List f3892d;

    /* renamed from: e */
    public int f3893e;

    /* renamed from: f */
    public List f3894f = Collections.emptyList();

    /* renamed from: g */
    public final ArrayList f3895g = new ArrayList();

    public C0951d(C0790a c0790a, C0944w c0944w, C0815z c0815z, C0791b c0791b) {
        this.f3892d = Collections.emptyList();
        this.f3889a = c0790a;
        this.f3890b = c0944w;
        this.f3891c = c0791b;
        List<Proxy> listSelect = c0790a.f2907g.select(c0790a.f2901a.m2052l());
        this.f3892d = (listSelect == null || listSelect.isEmpty()) ? AbstractC0869c.m2189l(Proxy.NO_PROXY) : AbstractC0869c.m2188k(listSelect);
        this.f3893e = 0;
    }

    /* renamed from: a */
    public final void m2426a(C0788F c0788f, IOException iOException) {
        C0790a c0790a;
        ProxySelector proxySelector;
        if (c0788f.f2892b.type() != Proxy.Type.DIRECT && (proxySelector = (c0790a = this.f3889a).f2907g) != null) {
            proxySelector.connectFailed(c0790a.f2901a.m2052l(), c0788f.f2892b.address(), iOException);
        }
        C0944w c0944w = this.f3890b;
        synchronized (c0944w) {
            ((LinkedHashSet) c0944w.f3861f).add(c0788f);
        }
    }

    /* renamed from: b */
    public final C0137j m2427b() throws SocketException, UnknownHostException {
        String hostName;
        int port;
        boolean zContains;
        if (this.f3893e >= this.f3892d.size() && this.f3895g.isEmpty()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f3893e < this.f3892d.size()) {
            boolean z2 = this.f3893e < this.f3892d.size();
            C0790a c0790a = this.f3889a;
            if (!z2) {
                throw new SocketException("No route to " + c0790a.f2901a.f3025d + "; exhausted proxy configurations: " + this.f3892d);
            }
            List list = this.f3892d;
            int i = this.f3893e;
            this.f3893e = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            this.f3894f = new ArrayList();
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                C0810u c0810u = c0790a.f2901a;
                hostName = c0810u.f3025d;
                port = c0810u.f3026e;
            } else {
                SocketAddress socketAddressAddress = proxy.address();
                if (!(socketAddressAddress instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                InetAddress address = inetSocketAddress.getAddress();
                hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                port = inetSocketAddress.getPort();
            }
            if (port < 1 || port > 65535) {
                throw new SocketException("No route to " + hostName + ":" + port + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                this.f3894f.add(InetSocketAddress.createUnresolved(hostName, port));
            } else {
                this.f3891c.getClass();
                c0790a.f2902b.getClass();
                if (hostName == null) {
                    throw new UnknownHostException("hostname == null");
                }
                try {
                    List listAsList = Arrays.asList(InetAddress.getAllByName(hostName));
                    if (listAsList.isEmpty()) {
                        throw new UnknownHostException(c0790a.f2902b + " returned no addresses for " + hostName);
                    }
                    int size = listAsList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        this.f3894f.add(new InetSocketAddress((InetAddress) listAsList.get(i2), port));
                    }
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
            int size2 = this.f3894f.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C0788F c0788f = new C0788F(this.f3889a, proxy, (InetSocketAddress) this.f3894f.get(i3));
                C0944w c0944w = this.f3890b;
                synchronized (c0944w) {
                    zContains = ((LinkedHashSet) c0944w.f3861f).contains(c0788f);
                }
                if (zContains) {
                    this.f3895g.add(c0788f);
                } else {
                    arrayList.add(c0788f);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f3895g);
            this.f3895g.clear();
        }
        C0137j c0137j = new C0137j();
        c0137j.f364f = 0;
        c0137j.f365g = arrayList;
        return c0137j;
    }
}
