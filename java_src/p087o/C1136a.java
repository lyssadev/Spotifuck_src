package p087o;

import androidx.appcompat.widget.ActionBarContextView;
import p023N.InterfaceC0216a0;

/* renamed from: o.a */
/* loaded from: classes.dex */
public final class C1136a implements InterfaceC0216a0 {

    /* renamed from: a */
    public boolean f4581a = false;

    /* renamed from: b */
    public int f4582b;

    /* renamed from: c */
    public final /* synthetic */ ActionBarContextView f4583c;

    public C1136a(ActionBarContextView actionBarContextView) {
        this.f4583c = actionBarContextView;
    }

    @Override // p023N.InterfaceC0216a0
    /* renamed from: a */
    public final void mo704a() {
        if (this.f4581a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f4583c;
        actionBarContextView.f1384k = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f4582b);
    }

    @Override // p023N.InterfaceC0216a0
    /* renamed from: b */
    public final void mo705b() {
        this.f4581a = true;
    }

    @Override // p023N.InterfaceC0216a0
    /* renamed from: c */
    public final void mo706c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f4581a = false;
    }
}
