package com.example.ca2mfusion.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/ca2mfusion/repositories/OrderRepo;", "Lcom/example/ca2mfusion/repositories/OrderRepoI;", "db", "Lcom/example/ca2mfusion/db/AppDatabase;", "(Lcom/example/ca2mfusion/db/AppDatabase;)V", "getAllItem", "Lio/reactivex/Flowable;", "", "Lcom/example/ca2mfusion/db/entity/Food;", "getCartItem", "update", "Lio/reactivex/Single;", "", "food", "app_debug"})
public final class OrderRepo implements com.example.ca2mfusion.repositories.OrderRepoI {
    private final com.example.ca2mfusion.db.AppDatabase db = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.Integer> update(@org.jetbrains.annotations.NotNull()
    com.example.ca2mfusion.db.entity.Food food) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<com.example.ca2mfusion.db.entity.Food>> getCartItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<com.example.ca2mfusion.db.entity.Food>> getAllItem() {
        return null;
    }
    
    public OrderRepo(@org.jetbrains.annotations.NotNull()
    com.example.ca2mfusion.db.AppDatabase db) {
        super();
    }
}