package com.example.ca2mfusion.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/ca2mfusion/ui/adapter/FoodAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/ca2mfusion/ui/adapter/FoodAdapter$FoodViewHolder;", "result", "", "Lcom/example/ca2mfusion/db/entity/Food;", "listener", "Lcom/example/ca2mfusion/ui/adapter/OnClickListener;", "(Ljava/util/List;Lcom/example/ca2mfusion/ui/adapter/OnClickListener;)V", "getResult", "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FoodViewHolder", "app_debug"})
public final class FoodAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.ca2mfusion.ui.adapter.FoodAdapter.FoodViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.ca2mfusion.db.entity.Food> result;
    private final com.example.ca2mfusion.ui.adapter.OnClickListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.ca2mfusion.ui.adapter.FoodAdapter.FoodViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.ca2mfusion.ui.adapter.FoodAdapter.FoodViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.ca2mfusion.db.entity.Food> getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ca2mfusion.db.entity.Food> p0) {
    }
    
    public FoodAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ca2mfusion.db.entity.Food> result, @org.jetbrains.annotations.NotNull()
    com.example.ca2mfusion.ui.adapter.OnClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/ca2mfusion/ui/adapter/FoodAdapter$FoodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "foodDataBinding", "Lcom/aman/foodordering/databinding/FoodDataBinding;", "listener", "Lcom/example/ca2mfusion/ui/adapter/OnClickListener;", "(Lcom/example/ca2mfusion/ui/adapter/FoodAdapter;Lcom/aman/foodordering/databinding/FoodDataBinding;Lcom/example/ca2mfusion/ui/adapter/OnClickListener;)V", "bind", "", "food", "Lcom/example/ca2mfusion/db/entity/Food;", "position", "", "onClick", "app_debug"})
    public final class FoodViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.aman.foodordering.databinding.FoodDataBinding foodDataBinding = null;
        private final com.example.ca2mfusion.ui.adapter.OnClickListener listener = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.ca2mfusion.db.entity.Food food, int position) {
        }
        
        private final void onClick(com.example.ca2mfusion.db.entity.Food food, int position) {
        }
        
        public FoodViewHolder(@org.jetbrains.annotations.NotNull()
        com.aman.foodordering.databinding.FoodDataBinding foodDataBinding, @org.jetbrains.annotations.NotNull()
        com.example.ca2mfusion.ui.adapter.OnClickListener listener) {
            super(null);
        }
    }
}