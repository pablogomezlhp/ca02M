package com.example.ca2mfusion.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/ca2mfusion/repositories/OrderRepoI;", "", "getAllItem", "Lio/reactivex/Flowable;", "", "Lcom/example/ca2mfusion/db/entity/Food;", "getCartItem", "update", "Lio/reactivex/Single;", "", "food", "app_debug"})
public abstract interface OrderRepoI {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.lang.Integer> update(@org.jetbrains.annotations.NotNull()
    com.example.ca2mfusion.db.entity.Food food);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<com.example.ca2mfusion.db.entity.Food>> getCartItem();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<com.example.ca2mfusion.db.entity.Food>> getAllItem();
}