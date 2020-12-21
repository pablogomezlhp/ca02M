package com.example.ca2mfusion.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0015H\u0014J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/ca2mfusion/ui/main/MainActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "adapter", "Lcom/example/ca2mfusion/ui/adapter/FoodAdapter;", "binding", "Lcom/aman/foodordering/databinding/ActivityMainBinding;", "foodList", "", "Lcom/example/ca2mfusion/db/entity/Food;", "itemPosition", "", "orderRepoI", "Lcom/example/ca2mfusion/repositories/OrderRepoI;", "getOrderRepoI", "()Lcom/example/ca2mfusion/repositories/OrderRepoI;", "setOrderRepoI", "(Lcom/example/ca2mfusion/repositories/OrderRepoI;)V", "viewModel", "Lcom/example/ca2mfusion/ui/MainViewModel;", "calculateTotalItem", "", "list", "getAllList", "init", "onClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setObserver", "setRecyclerView", "Companion", "app_debug"})
public final class MainActivity extends dagger.android.support.DaggerAppCompatActivity {
    private com.example.ca2mfusion.ui.MainViewModel viewModel;
    private com.example.ca2mfusion.ui.adapter.FoodAdapter adapter;
    private com.aman.foodordering.databinding.ActivityMainBinding binding;
    private java.util.List<com.example.ca2mfusion.db.entity.Food> foodList;
    private int itemPosition = 0;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.ca2mfusion.repositories.OrderRepoI orderRepoI;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "MainActivity";
    public static final com.example.ca2mfusion.ui.main.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ca2mfusion.repositories.OrderRepoI getOrderRepoI() {
        return null;
    }
    
    public final void setOrderRepoI(@org.jetbrains.annotations.NotNull()
    com.example.ca2mfusion.repositories.OrderRepoI p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void getAllList() {
    }
    
    private final void setObserver() {
    }
    
    private final void calculateTotalItem(java.util.List<com.example.ca2mfusion.db.entity.Food> list) {
    }
    
    private final void setRecyclerView() {
    }
    
    private final void onClick() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/ca2mfusion/ui/main/MainActivity$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}