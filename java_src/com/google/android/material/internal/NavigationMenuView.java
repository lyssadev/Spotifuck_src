package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p084n.InterfaceC1049z;
import p084n.MenuC1035l;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC1049z {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p084n.InterfaceC1049z
    /* renamed from: b */
    public final void mo1318b(MenuC1035l menuC1035l) {
    }
}
