package com.example.ca2mfusion.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/ca2mfusion/db/FoodDao;", "", "deleteFood", "", "food", "Lcom/example/ca2mfusion/db/entity/Food;", "getAllList", "Lio/reactivex/Flowable;", "", "getCartList", "insertAll", "foods", "updateFood", "Lio/reactivex/Single;", "", "app_debug"})
public abstract interface FoodDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.ca2mfusion.db.entity.Food> foods);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Update()
    public abstract io.reactivex.Single<java.lang.Integer> updateFood(@org.jetbrains.annotations.NotNull()
    com.example.ca2mfusion.db.entity.Food food);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM FOOD")
    public abstract io.reactivex.Flowable<java.util.List<com.example.ca2mfusion.db.entity.Food>> getAllList();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM FOOD WHERE quantity > 0")
    public abstract io.reactivex.Flowable<java.util.List<com.example.ca2mfusion.db.entity.Food>> getCartList();
    
    @androidx.room.Delete()
    public abstract void deleteFood(@org.jetbrains.annotations.NotNull()
    com.example.ca2mfusion.db.entity.Food food);
}